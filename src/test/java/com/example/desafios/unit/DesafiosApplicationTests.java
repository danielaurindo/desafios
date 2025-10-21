package com.example.desafios.unit;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com.example.desafios.unit.services")
class DesafiosApplicationTests {

	@Test
	void contextLoads() {
	}

}
