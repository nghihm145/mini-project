package com.ManageStudent.practice.controller;

import com.ManageStudent.practice.entity.NumberTest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ManNghi
 * @since 13/01/2025 - 20:46
 */

@RestController
@RequestMapping("/calculus")
public class NumberTestController {
    @PostMapping("/1")
    public double calculate(@RequestBody NumberTest calculation) {
//        if (calculation.getCalculus().equals("+")) {
//            return calculation.getNumber1() + calculation.getNumber2();
//        } else if (calculation.getCalculus().equals("-")) {
//            return calculation.getNumber1() - calculation.getNumber2();
//        } else if (calculation.getCalculus().equals("*")) {
//            return calculation.getNumber1() * calculation.getNumber2();
//        } else if (calculation.getCalculus().equals("/")) {
//            return (double) calculation.getNumber1() / calculation.getNumber2();
//        }
        int number1Req = calculation.getNumber1();
        int number2Req = calculation.getNumber2();

        if (number1Req < 0 || calculation.getNumber2() < 0) {
            return -2;
        }
        switch (calculation.getCalculus()) {
            case "+":
                return number1Req + number2Req;
            case "-":
                return number1Req - number2Req;
            case "*":
                return number1Req * number2Req;
            case "/":
                if (number2Req == 0) {
                    return -1;
                }
                return (double) number1Req / number2Req;
            default:
                return 0;
        }


//        return 0;
    }
}
