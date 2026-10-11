/*
 * Decompiled with CFR 0.152.
 */
package ax.ce;

import ax.ce.c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class e
extends c {
    private final MessageDigest c;

    public e() throws NoSuchAlgorithmException {
        this.a = 32;
        this.b = "SHA-256";
        this.c = MessageDigest.getInstance("SHA-256");
    }

    @Override
    public byte[] a() {
        byte[] byArray = this.c.digest();
        this.c.reset();
        return byArray;
    }

    @Override
    public void f(byte[] byArray, int n8, int n9) {
        this.c.update(byArray, n8, n9);
    }
}

