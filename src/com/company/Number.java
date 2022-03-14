package com.company;



class Number {

    private final int value;
    private final NumberType type;

    Number(int value, NumberType type) {
        this.value = value;
        this.type = type;
    }

    int getValue() {
        return value;
    }

    NumberType getType() {
        return type;
    }
}