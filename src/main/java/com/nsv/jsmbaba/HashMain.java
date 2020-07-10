package com.nsv.jsmbaba;

import com.nsv.jsmbaba.com.nsv.jsmbaba.constants.AppConstants;
import com.nsv.jsmbaba.util.HashUtil;
import com.nsv.jsmbaba.util.SaltUtil;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;

public class HashMain {

    public static void main(String[] args) throws NoSuchProviderException, NoSuchAlgorithmException, InvalidKeySpecException {

        String message = "Jsmbaba . Welcome to Hashing";
        System.out.println("Message = "+message);

        //md5Hash(message);

        //md5HashWithSalt(message);

        //sha1Hash(message);

        //sha1HashWithSalt(message);


        //sha256Hash(message);

        //sha256HashWithSalt(message);


        //sha384Hash(message);

        //sha384HashWithSalt(message);

        //sha512Hash(message);

        //sha512HashWithSalt(message);

        pbkdf2Hash(message);
    }

    private static void sha512HashWithSalt(String message) throws NoSuchAlgorithmException, NoSuchProviderException {
        System.out.println("***sha-512 - Salt - BEGIN*****************************************************");
        byte[] saltsha512Hash = SaltUtil.getSalt("SUN");
        String sha512HashSalt = HashUtil.createHashWithSalt(message, AppConstants.SHA512, saltsha512Hash);
        String regenratedsha512HashSalt = HashUtil.createHashWithSalt(message,AppConstants.SHA512,saltsha512Hash);
        System.out.println("\nnsha-512 Hash ; Format=HexaDecimal ; Length="+sha512HashSalt.length());
        System.out.println("\nnsha-512 Digest            ="+sha512HashSalt);
        System.out.println("\nRegererated MD5 Digest="+regenratedsha512HashSalt);
        System.out.println("****sha-512 - Salt - END*****************************************************");
    }

    private static void sha512Hash(String message) {
        System.out.println("****sha-512 - BEGIN*****************************************************");
        String sha512Hash = HashUtil.createHash(message, AppConstants.SHA512);
        System.out.println("\nsha-512 Hash ; Format=HexaDecimal ; Length="+sha512Hash.length());
        System.out.println("\nsha-512 Digest="+sha512Hash);
        System.out.println("****sha-512 - END*****************************************************");
    }

    private static void pbkdf2Hash(String message) throws InvalidKeySpecException, NoSuchAlgorithmException {
        System.out.println("****pbkdf2Hash - BEGIN*****************************************************");
        String pbkdf2Hash = HashUtil.generateHashUsingPBKDF2(message);
        System.out.println("\npbkdf2Hash ; Format=HexaDecimal ; Length="+pbkdf2Hash.length());
        System.out.println("\npbkdf2Hash Digest="+pbkdf2Hash);
        System.out.println("****pbkdf2Hash - END*****************************************************");
    }


    private static void sha384HashWithSalt(String message) throws NoSuchAlgorithmException, NoSuchProviderException {
        System.out.println("***sha-384 - Salt - BEGIN*****************************************************");
        byte[] saltsha384Hash = SaltUtil.getSalt("SUN");
        String sha384HashSalt = HashUtil.createHashWithSalt(message, AppConstants.SHA384, saltsha384Hash);
        String regenratedsha384HashSalt = HashUtil.createHashWithSalt(message,AppConstants.SHA384,saltsha384Hash);
        System.out.println("\nnsha-384 Hash ; Format=HexaDecimal ; Length="+sha384HashSalt.length());
        System.out.println("\nnsha-384 Digest            ="+sha384HashSalt);
        System.out.println("\nRegererated MD5 Digest="+regenratedsha384HashSalt);
        System.out.println("****sha-384 - Salt - END*****************************************************");
    }

    private static void sha384Hash(String message) {
        System.out.println("****sha-384 - BEGIN*****************************************************");
        String sha384Hash = HashUtil.createHash(message, AppConstants.SHA384);
        System.out.println("\nsha-384 Hash ; Format=HexaDecimal ; Length="+sha384Hash.length());
        System.out.println("\nsha-384 Digest="+sha384Hash);
        System.out.println("****sha-384 - END*****************************************************");
    }

    private static void sha256HashWithSalt(String message) throws NoSuchAlgorithmException, NoSuchProviderException {
        System.out.println("***sha-256 - Salt - BEGIN*****************************************************");
        byte[] saltsha256Hash = SaltUtil.getSalt("SUN");
        String sha256HashSalt = HashUtil.createHashWithSalt(message, AppConstants.SHA256, saltsha256Hash);
        String regenratedsha256HashSalt = HashUtil.createHashWithSalt(message,AppConstants.SHA256,saltsha256Hash);
        System.out.println("\nnsha-256 Hash ; Format=HexaDecimal ; Length="+sha256HashSalt.length());
        System.out.println("\nnsha-256 Digest            ="+sha256HashSalt);
        System.out.println("\nRegererated MD5 Digest="+regenratedsha256HashSalt);
        System.out.println("****sha-256 - Salt - END*****************************************************");
    }

    private static void sha256Hash(String message) {
        System.out.println("****sha-256 - BEGIN*****************************************************");
        String sha256Hash = HashUtil.createHash(message, AppConstants.SHA256);
        System.out.println("\nsha-256 Hash ; Format=HexaDecimal ; Length="+sha256Hash.length());
        System.out.println("\nsha-256 Digest="+sha256Hash);
        System.out.println("****sha-256 - END*****************************************************");
    }

    private static void sha1HashWithSalt(String message) throws NoSuchAlgorithmException, NoSuchProviderException {
        System.out.println("***SHA-1 - Salt - BEGIN*****************************************************");
        byte[] saltSha1Hash = SaltUtil.getSalt("SUN");
        String sha1HashSalt = HashUtil.createHashWithSalt(message, AppConstants.SHA1, saltSha1Hash);
        String regenratedsha1HashSalt = HashUtil.createHashWithSalt(message,AppConstants.SHA1,saltSha1Hash);
        System.out.println("\nnSHA-1 Hash ; Format=HexaDecimal ; Length="+sha1HashSalt.length());
        System.out.println("\nnSHA-1 Digest            ="+sha1HashSalt);
        System.out.println("\nRegererated MD5 Digest="+regenratedsha1HashSalt);
        System.out.println("****SHA-1 - Salt - END*****************************************************");
    }

    private static void sha1Hash(String message) {
        System.out.println("****SHA-1 - BEGIN*****************************************************");
        String sha1Hash = HashUtil.createHash(message, AppConstants.SHA1);
        System.out.println("\nSHA-1 Hash ; Format=HexaDecimal ; Length="+sha1Hash.length());
        System.out.println("\nSHA-1 Digest="+sha1Hash);
        System.out.println("****SHA-1 - END*****************************************************");
    }

    private static void md5HashWithSalt(String message) throws NoSuchAlgorithmException, NoSuchProviderException {
        System.out.println("****MD5 - Salt - BEGIN*****************************************************");
        byte[] salt = SaltUtil.getSalt("SUN");
        String md5HashSalt = HashUtil.createHashWithSalt(message, AppConstants.MD5, salt);
        String regenratedMd5HashSalt = HashUtil.createHashWithSalt(message,AppConstants.MD5,salt);
        System.out.println("\nMD5 Hash ; Format=HexaDecimal ; Length="+md5HashSalt.length());
        System.out.println("\nMD5 Digest            ="+md5HashSalt);
        System.out.println("\nRegererated MD5 Digest="+regenratedMd5HashSalt);
        System.out.println("****MD5 - Salt - END*****************************************************");
    }

    private static void md5Hash(String message) {
        System.out.println("****MD5 - BEGIN*****************************************************");
        String md5Hash = HashUtil.createHash(message, AppConstants.MD5);
        System.out.println("\nMD5 Hash ; Format=HexaDecimal ; Length="+md5Hash.length());
        System.out.println("\nMD5 Digest="+md5Hash);
        System.out.println("****MD5 - END*****************************************************");
    }
}
