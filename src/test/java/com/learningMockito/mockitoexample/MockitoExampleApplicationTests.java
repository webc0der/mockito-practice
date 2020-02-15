package com.learningMockito.mockitoexample;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.junit.jupiter.MockitoExtension;

import com.learningMockito.mockitoexample.modal.AlternateFareCache;
import com.learningMockito.mockitoexample.service_interface.FareService;


@ExtendWith(MockitoExtension.class)
//@RunWith(MockitoJUnitRunner.class)
class MockitoExampleApplicationTests {

	static AlternateFareCache alternateFareCache;

	@Mock
	static FareService fareService;
	
//	@InjectMocks
//	static FareService fareService;

	@Mock
	static List <String> mockList;
	
	@Captor
	ArgumentCaptor<String> stringArg;
	
	@BeforeAll
	public static void getData() {
		
		alternateFareCache = new AlternateFareCache();
		alternateFareCache.setAirPricingInfoReference("123456");
		alternateFareCache.setArrivalTime("arriving");
	}

	@Test
	public void serviceClassMock() {

		when(fareService.fareCacheSearch("4")).thenReturn(alternateFareCache);

		assertEquals("123456", fareService.fareCacheSearch("4").getAirPricingInfoReference());
	}

	/*
	 * BDD Approach of unit testing
	 * */

	@Test
	public void serviceClassMockBDDStyle() {

		given(fareService.fareCacheSearch(anyString())).willReturn(alternateFareCache);

		String result = fareService.fareCacheSearch("4").getAirPricingInfoReference();

		assertThat(result.getClass(),is(String.class));
	}

	@Test
	public void mockListTest() {
		when(mockList.size()).thenReturn(2);

		assertEquals(2,mockList.size());
	}
	@Test
	public void mockListTestMulti() {
		when(mockList.size()).thenReturn(2,3,4,6);

		assertEquals(2,mockList.size());
		assertEquals(3,mockList.size());
		assertEquals(4,mockList.size());
		assertEquals(6,mockList.size());
		assertEquals(6,mockList.size());
	}

	@Test
	public void mockListTestMultiMatcher() {
		when(mockList.get(anyInt())).thenReturn("test Success");

		assertEquals("test Success", mockList.get(3));
	}

	@Test
	public void mockListTestException() {
		when(mockList.get(anyInt())).thenThrow(new RuntimeException("test throw"));

		assertThrows(RuntimeException.class,() ->{
			mockList.get(0);
		});
	}

	@Test
	public void mockListBDD() {
		given(mockList.get(anyInt())).willReturn("hello munna");

		//		String res = mockList.get(0);

		assertThat(mockList.get(0), is("hello munna"));
	}

	@Test
	public void serviceClassMockWithVerify() {

		//given
		given(fareService.fareCacheSearch("4")).willReturn(alternateFareCache);

//		String result = fareService.fareCacheSearch("4").getAirPricingInfoReference();

		//when
		verify(fareService, never()).fareCacheSearch("3");

		//when
		verify(fareService, times(1)).fareCacheSearch("4");

//		verify(fareService, atLeast(2)).fareCacheSearch("4");


	}

	@Test
	public void serviceClassMockWithThen() {

		given(fareService.fareCacheSearch("4")).willReturn(alternateFareCache);

		String result = fareService.fareCacheSearch("4").getAirPricingInfoReference();

		then(fareService).should(times(3)).fareCacheSearch(stringArg.capture());

		//		assertThat(stringArg.getValue(), is("3"));
		//		assertThat(stringArg.getValue(), is("4"));
		assertThat(stringArg.getAllValues().size(), is(3));


	}

}
