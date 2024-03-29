package com.bigJavaExercises.Chapter19Exercises;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

/**
 * This class encrypts files using the Caesar cipher.
 * For decryption, use an encryptor whose key is the
 * negative of the encryption key.
 */
public class CaesarCipher {
    private int key;

    /**
     * Constructs an cipher object with a given key.
     *
     * @param aKey the encryption key
     */
    public CaesarCipher(int aKey) {
        key = aKey;
    }

    /**
     * Encrypts the contents of a stream.
     *
     * @param in  the input stream
     * @param out the output stream
     */
    public void encryptStream(InputStream in, OutputStream out)
            throws IOException {
        boolean done = false;
        while (!done) {
            int next = in.read();
            if (next == -1) done = true;
            else {
                byte b = (byte) next;
                byte c = encrypt(b);
                out.write(c);
            }
        }
    }

    /**
     * Encrypts a byte.
     *
     * @param b the byte to encrypt
     * @return the encrypted byte
     */
    public byte encrypt(byte b) {
        return (byte) (b + key);
    }
}

