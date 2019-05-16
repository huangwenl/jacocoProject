package com;

public class Hello {
    public int i;

    public Hello() {

    }

    public Hello(int i) {
        this.i = i;
    }

    public String testMethod1() {
        return "Hello World";
    }

    public int addMethod(int a, int b) {
        if (a > b) {
            int c = 5;
            return c;
        }
        return a + b;
    }

    public String toString() {
        return String.valueOf(this.i);
    }

    public int subMethod(int a, int b) {
        if (a != 0) {
            return a - b;
        } else {
            return b - a;
        }
    }

}