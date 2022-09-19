package com.example.demo;

import com.example.demo.service.CalculatorService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void name(){
        CalculatorService service = new CalculatorService();
        double result = service.sum(5,5);
        assertEquals(10,result);
    }
}
