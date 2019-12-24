package com.learningMockito.mockitoexample;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.learningMockito.mockitoexample.modal.AlternateFareCache;
import com.learningMockito.mockitoexample.service_interface.FareService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;


class MockitoExampleApplicationTests {

static AlternateFareCache alternateFareCache;
	
	@BeforeAll
	public static void getData() {
		System.out.println("in before all");
		alternateFareCache = new AlternateFareCache();
		alternateFareCache.setAirPricingInfoReference("123456");
		alternateFareCache.setArrivalTime("arriving");
		System.out.println("hello");
	}
	
	@Test
	public void serviceClassMock() {
		System.out.println("in test");
		FareService fareService = mock(FareService.class);
		
		when(fareService.fareCacheSearch("4")).thenReturn(alternateFareCache);
		
		assertEquals("123456", fareService.fareCacheSearch("4").getAirPricingInfoReference());
	}
	public void mockListTest() {
		List mockList = mock(List.class);
		
		when(mockList.size()).thenReturn(2);
		
		assertEquals(2,mockList.size());
	}
	@Test
	public void mockListTestMulti() {
		List mockList = mock(List.class);
		
		when(mockList.size()).thenReturn(2,3,4,6);
		
		assertEquals(2,mockList.size());
		assertEquals(3,mockList.size());
		assertEquals(4,mockList.size());
		assertEquals(6,mockList.size());
		assertEquals(6,mockList.size());
	}
	
	@Test
	public void mockListTestMultiMatcher() {
		List mockList = mock(List.class);
		
		when(mockList.get(anyInt())).thenReturn("test Success");
		
		assertEquals("test Success", mockList.get(3));
	}
	
	@Test
	public void mockListTestException() {
		List mockList = mock(List.class);
		
		when(mockList.get(anyInt())).thenThrow(new RuntimeException("test throw"));
		
		assertThrows(RuntimeException.class,() ->{
			mockList.get(0);
			});
	}
	
	/*
	 * 
	 * BDD Approach of unit testing
	 * */
	
	public void mockListBDDStyle() {
		
	}
}
