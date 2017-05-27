package security;

import org.junit.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.*;

/**
 * @author Lelental on 27.05.2017.
 */
public class EncryptorTest {

    @Test
    public void test_sha256_encrypt() throws NoSuchAlgorithmException {
        String pass = "foo";
        byte[] bytes = Encryptor.getSalt();
        String encryptFirstPass = Encryptor.get_SHA_256_SecurePassword(pass, bytes);
        String encryptSecondPass = Encryptor.get_SHA_256_SecurePassword(pass, Encryptor.getSalt());
        System.out.println(encryptFirstPass);
        //assertEquals(encryptFirstPass, encryptSecondPass);
    }
}