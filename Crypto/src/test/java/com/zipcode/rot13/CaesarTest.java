package com.zipcode.rot13;

import static org.junit.Assert.*;
import org.junit.Test;

public class CaesarTest {

    @Test
    public void caesarTest(){
        Caesar cipher = new Caesar();
        String encrypted  = "Olwwoh eb olwwoh, rqh wudyhov idu.";
        String tolkien = "Little by little, one travels far.";
        assertEquals(tolkien,cipher.caesarCipherDecrypt(encrypted));
        assertEquals(encrypted,cipher.caesarCipher(tolkien));
    }


}
