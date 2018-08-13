package com.hackerrank.warmup;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class JavaInterface implements AdvancedArithmetic {

    public int divisorSum(int value) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (value % i == 0){
                sum+= i;
            }
        }
        return sum;
    }

}
