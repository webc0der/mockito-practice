package com.learningMockito.mockitoexample;

import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.text.IsEmptyString;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class HamcrestMatchersTest {


	static List<Integer> scores;

	@BeforeAll
	public static void init() {

		scores = Arrays.asList(99,20,30);
	}

	@Test
	void testSize() {

		assertThat(scores, hasSize(3));
	}
	@Test
	void testItems() {

		assertThat(scores, hasItems(99,20,30));
	}
	@Test
	void testGraeterLess() {

		assertThat(scores, everyItem(greaterThan(10)));
		assertThat(scores, everyItem(lessThan(100)));
	}
	@Test
	void testArray() {
		Integer[] array = {1,2,3,4,5,6};
		
		assertThat(array, arrayWithSize(6));
		assertThat(array, arrayContaining(1,2,3,4,5,6));
		assertThat(array, arrayContainingInAnyOrder(3,1,2,4,6,5));
	}
	@Test
	void testString() {

		assertThat("", emptyString());
		assertThat(null, emptyOrNullString());
		assertThat("", emptyOrNullString());
	}
}
