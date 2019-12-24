package com.learningMockito.mockitoexample;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class MockitoExampleApplicationTests {

	@Test
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

}
