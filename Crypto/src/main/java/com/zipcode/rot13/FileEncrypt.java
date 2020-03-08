package com.zipcode.rot13;

import com.sun.deploy.net.MessageHeader;

import java.io.*;

public class FileEncrypt {



    public static void main(String[] args) throws IOException {
        ROT13 rot13 = new ROT13();
        BufferedReader br = new BufferedReader(new FileReader("/Users/kromero/Dev/Projects/Labs/Week5Labs/SimpleCrypt/sonnet18.txt"));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            sb.append(line).append("\n");
            line = br.readLine();
        }
        String fileAsString = sb.toString();
        String encryptedFile = rot13.encrypt(fileAsString);
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/kromero/Dev/Projects/Labs/Week5Labs/SimpleCrypt/sonnet18.enc"));
        bw.write(encryptedFile);
        bw.close();
        System.out.println(encryptedFile);

    }

}
