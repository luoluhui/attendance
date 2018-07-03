package com.luolh.utils;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 * created by luolh on 20180703
 */
public class SecurityUtils {

    /**
     * 密码加密
     * @param passwords
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static String encryption(String passwords) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //加密算法的类型
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        //防止加密后出现乱码
        BASE64Encoder base64Encoder = new BASE64Encoder();
        String result = base64Encoder.encode(md5.digest(passwords.getBytes("utf-8")));
        return result;
    }

    /**
     * 判断密码是否正确
     * @param passwords 输入的密码
     * @param dbPasswords 数据库中的密码
     * @return true 密码一致,false 密码错误
     * @throws UnsupportedEncodingException
     * @throws NoSuchAlgorithmException
     */
    public static boolean checkPasswords(String passwords, String dbPasswords) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String password = encryption(passwords);
        return password.equals(dbPasswords);
    }
}
