package com.example.calcjavafx;

public class Model {

    public long calculation(long a, long b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) return 0;
                return a / b;
        }
        return 0;
    }
}
