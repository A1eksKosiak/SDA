package com.hackerrank.warmup;

class JavaInheritance2 {

    public int add(int a, int b) {
        return a + b;
    }

}

class Adder extends JavaInheritance2 {
    @Override
    public int add(int a, int b) {
        return super.add(a, b);
    }
}