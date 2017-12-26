package com.twg.sample.com.twg.sample.model;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class StockCalculator {

    public int calculateStock(Integer... stock){
        return Arrays.asList(stock).stream().reduce(0, (x, y) -> x+y);
    }



}
