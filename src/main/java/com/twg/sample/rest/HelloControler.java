package com.twg.sample.rest;


import com.twg.sample.com.twg.sample.model.StockCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @Autowired
    StockCalculator calculator;

    @RequestMapping("/")
    public String index(){
        return "hello from darthShana:"+calculator.calculateStock(4, 7, 9, 3);
    }
}
