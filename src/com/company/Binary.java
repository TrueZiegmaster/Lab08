package com.company;

public class Binary {
    Binary(int x){
        toBin(x);
    }

    private void toBin(int x){
        if (x != 0){
            toBin(x/2);
            System.out.print(x%2);
        }
    }
}
