package com.luxoft.calc.controller;

import com.luxoft.calc.service.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculatorController {
    @RequestMapping("/calc")
    @ResponseBody
    String getResult(
           @RequestParam(value = "operation") String operation,
           @RequestParam(value = "operand_1") Integer a,
           @RequestParam(value = "operand_2") Integer b) {
        Calculator calculator = new Calculator();

        String result =
                calculator.getResult(
                    operation,
                    Integer.valueOf(a),
                    Integer.valueOf(b))
                    .toString();

        return result;
    }
}
