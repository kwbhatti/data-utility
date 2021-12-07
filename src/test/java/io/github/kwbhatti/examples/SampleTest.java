package io.github.kwbhatti.examples;

import org.testng.annotations.Test;

public class SampleTest {

	@Test
	private void test1() {
		System.out.println(System.getProperty("maven.source.plugin"));
	}
}
