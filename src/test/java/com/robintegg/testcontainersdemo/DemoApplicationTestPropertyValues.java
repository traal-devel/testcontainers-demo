package com.robintegg.testcontainersdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.test.util.TestPropertyValues;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.PostgreSQLContainer;

public class DemoApplicationTestPropertyValues {

	public static TestPropertyValues using(PostgreSQLContainer<?> postgreSQLContainer) {
		List<String> pairs = new ArrayList<>();

		// postgres
		pairs.add("spring.datasource.url=" + postgreSQLContainer.getJdbcUrl());
		pairs.add("spring.datasource.username=" + postgreSQLContainer.getUsername());
		pairs.add("spring.datasource.password=" + postgreSQLContainer.getPassword());

		return TestPropertyValues.of(pairs);
	}

}
