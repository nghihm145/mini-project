package com.ManageStudent.practice.entity;

/**
 * @author ManNghi
 * @since 13/01/2025 - 20:33
 */

public class NumberTest {
    private int number1;
    private int number2;
    private String calculus;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getCalculus() {
        return calculus;
    }

    public void setCalculus(String calculus) {
        this.calculus = calculus;
    }


    public NumberTest(int number1, int number2, String calculus) {
        this.number1 = number1;
        this.number2 = number2;
        this.calculus = calculus;
    }
}
