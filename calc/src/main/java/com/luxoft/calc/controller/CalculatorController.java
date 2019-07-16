package com.luxoft.calc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculatorController {

    @RequestMapping("/")
    @ResponseBody
    String hello() {
        return "Calculator has been started!";
    }
}
