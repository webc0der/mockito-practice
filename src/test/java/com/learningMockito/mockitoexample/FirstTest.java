package com.learningMockito.mockitoexample;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FirstTest {

	@BeforeAll
	static void beforeAll(TestInfo inf) {
		System.out.println("invoked all before:: : :"+inf.getDisplayName());
	}
	
	@Test
	void myTestCase1() {

		String checkNull= "";
		assertNotNull(checkNull);
		//		assertNull(checkNull);
	}

	@Test
	void myTestCase2() {
		String str= "abc";
		
		assertTrue(str.contains("abc"));
//		assertFalse(str.contains("abc"));
	}

	@Test
	void myTestCase3() {
		String str = "abc,bcd,cdf";
		String strArr[] = str.split(",");
		
		String expectedArr[] = {"abc","bcd","cdf"}; 
		assertArrayEquals(expectedArr, strArr);
	}
	
	@BeforeEach
	void beforeEach(TestInfo inf) {
		System.out.println("invoked before:: : :"+inf.getDisplayName());
	}
	
	@AfterEach
	void AfterEach(TestInfo inf) {
		System.out.println("invoked after:: : :"+inf.getDisplayName());
	}
	
	@AfterAll
	static void AfterAll(TestInfo inf) {
		System.out.println("invoked all  after:: : :"+inf.getDisplayName());
	}
	
	@Test
	@DisplayName("checks for null pointer exception")
	void myTestCase4() {
		String str = null;
		
		assertThrows(NullPointerException.class, () -> {str.length();});
	}
	
	@ParameterizedTest(name = "testing case for {0}")
	@ValueSource(strings = {"hello","hai","bye","bye"})
	@DisplayName("parameterize test cases")
	void myTestCase5(String str) {
		assertTrue(str.length()>0);
	}
	
	@Test
	@DisplayName("performace/duration check")
	void myTestCase6() {
		assertTimeout(Duration.ofSeconds(5), () -> {for(int i = 0;i<=1000000;i++)System.out.println(i);});
	}

}
