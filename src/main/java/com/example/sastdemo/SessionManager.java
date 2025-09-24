
package com.example.sastdemo;

import java.util.Random;

/**
 * Intentional weak random number generation for session IDs.
 * Use SecureRandom for cryptographic use.
 */
public class SessionManager {

    private Random rand = new Random();

    public String createSessionId() {
        // Weak: predictable PRNG used for session IDs
        int id = rand.nextInt(Integer.MAX_VALUE);
        return Integer.toHexString(id);
    }
}
