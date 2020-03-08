package com.zipcode.rot13;

public class Caesar extends ROT13 {

    public Caesar() {
    }

    public String caesarCipher(String input){
        setShift(3);
        return crypt(input);
    }

    public String caesarCipherDecrypt(String input){
        setShift(23);
        return crypt(input);
    }



}
