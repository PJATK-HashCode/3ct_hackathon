package security;

import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.*;

/**
 * @author Lelental on 27.05.2017.
 */
public class EncryptTest {

    @Test
    public void test_encrypt() throws NoSuchAlgorithmException {
        String pass = "foo";
        String encryptPass = DigestUtils.sha1Hex(pass);
        String encryptPass2 = DigestUtils.sha1Hex(pass);

        assertEquals(encryptPass, encryptPass2);
    }
}