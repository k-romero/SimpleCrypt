package com.zipcode.rot13;

public class ROT13  {
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";

    int shift = 0;

    ROT13(Character cs, Character cf) {
       shift = cf - cs;
    }

    ROT13(){
        shift = 13;
    }


    public String crypt(String text) throws UnsupportedOperationException {
        StringBuilder result = new StringBuilder();
        char temp = 0;
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if(current < 65 || current > 122 || (current < 97 && current > 90)){
                temp = text.charAt(i);
            } else if(Character.isUpperCase(current)){
                    temp = (char) (((current + this.shift - 65) % 26) + 65);
            } else if(Character.isLowerCase(current)){
                temp = (char) (((current + this.shift - 97) % 26) + 97);
            }
            result.append(temp);
            temp = 0;
        }
        return result.toString();
    }

    public String encrypt(String text) {
       return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character c) {
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c){
                index = i;
            }
        }
        StringBuilder myString = new StringBuilder();
        for (int i = index; i < s.length(); i++) {
            myString.append(s.charAt(i));
        }
        for (int i = 0; i < index; i++) {
            myString.append(s.charAt(i));
        }
        return myString.toString();
    }

    public void setShift(int shift) {
        this.shift = shift;
    }
}
