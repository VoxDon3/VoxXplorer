/*
 * Decompiled with CFR 0.152.
 */
package ax.mc;

import ax.mc.d;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class a
implements d {
    private Mac a;
    private int b;
    private String c;
    private ByteArrayOutputStream d;

    public a(String object) {
        this.c = object;
        this.d = new ByteArrayOutputStream(4096);
        try {
            this.a = object = Mac.getInstance((String)object);
            this.b = ((Mac)object).getMacLength();
            return;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException(noSuchAlgorithmException);
        }
    }

    private void e(int n8) {
        byte[] byArray = this.d.toByteArray();
        int n9 = byArray.length - n8;
        n8 = 0;
        while (n8 < n9) {
            int n10 = n8 + 16;
            int n11 = n10 <= n9 ? 16 : n9 - n8;
            this.a.update(byArray, n8, n11);
            n8 = n10;
        }
        this.d.reset();
    }

    @Override
    public void a(byte[] byArray) {
        try {
            Mac mac = this.a;
            SecretKeySpec secretKeySpec = new SecretKeySpec(byArray, this.c);
            mac.init(secretKeySpec);
            return;
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new RuntimeException(invalidKeyException);
        }
    }

    @Override
    public byte[] b(byte[] byArray) {
        if (this.d.size() > 0) {
            this.e(0);
        }
        return this.a.doFinal(byArray);
    }

    @Override
    public int c() {
        return this.b;
    }

    public byte[] d(int n8) {
        if (this.d.size() > 0) {
            this.e(n8);
        }
        return this.a.doFinal();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f(byte[] byArray, int n8, int n9) {
        try {
            if (this.d.size() + n9 > 4096) {
                this.e(0);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw new RuntimeException(illegalStateException);
        }
        this.d.write(byArray, n8, n9);
    }
}

