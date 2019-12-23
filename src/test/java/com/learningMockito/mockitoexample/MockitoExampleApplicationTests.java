package com.learningMockito.mockitoexample;

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
	}
	
	@Test
	public void serviceClassMock() {
		System.out.println("in test");
		FareService fareService = mock(FareService.class);
		
		when(fareService.fareCacheSearch("4")).thenReturn(alternateFareCache);
		
		assertEquals("123456", fareService.fareCacheSearch("4").getAirPricingInfoReference());
	}
}
