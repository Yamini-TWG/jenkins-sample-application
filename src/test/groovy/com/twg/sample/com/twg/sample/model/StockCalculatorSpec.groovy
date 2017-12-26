package com.twg.sample.com.twg.sample.model

import spock.lang.Specification

class StockCalculatorSpec extends Specification {

    def "test basic stock calculation"(){
        given:
        def calculator = new StockCalculator()

        expect:
        calculator.calculateStock(4, 6, 7, 8) == 25
    }
}
