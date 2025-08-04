package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.CalculadoraService;

@SpringBootTest
class CalculadoraServiceTest {

	@Test
	public void testSomar() {
        CalculadoraService calc = new CalculadoraService();
        int result = calc.somar(2,3);
        assertEquals(5,result, "2 + 3 deve ser 5");

	}

}