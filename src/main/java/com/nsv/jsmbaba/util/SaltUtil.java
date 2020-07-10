package com.nsv.jsmbaba.util;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

import static com.nsv.jsmbaba.com.nsv.jsmbaba.constants.AppConstants.SHA1PRNG;

public class SaltUtil {

    public static byte[] getSalt() throws NoSuchAlgorithmException {
        //Always use a SecureRandom generator
        SecureRandom sr = SecureRandom.getInstance(SHA1PRNG);
        //Create array for salt
        byte[] salt = new byte[16];
        //Get a random salt
        sr.nextBytes(salt);
        //return salt
        return salt;
    }

    public static byte[] getSalt(String provider) throws NoSuchAlgorithmException, NoSuchProviderException
    {
        //Always use a SecureRandom generator
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG", provider);
        //Create array for salt
        byte[] salt = new byte[16];
        //Get a random salt
        sr.nextBytes(salt);
        //return salt
        return salt;
    }
}
