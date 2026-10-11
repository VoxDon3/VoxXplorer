/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.hls;

import android.net.Uri;
import ax.U0.g;
import ax.U0.i;
import ax.U0.k;
import ax.U0.z;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

class a
implements g {
    private final g a;
    private final byte[] b;
    private final byte[] c;
    private CipherInputStream d;

    public a(g g8, byte[] byArray, byte[] byArray2) {
        this.a = g8;
        this.b = byArray;
        this.c = byArray2;
    }

    @Override
    public final Uri b() {
        return this.a.b();
    }

    @Override
    public final int c(byte[] byArray, int n8, int n9) throws IOException {
        ax.S0.a.e(this.d);
        n8 = n9 = this.d.read(byArray, n8, n9);
        if (n9 < 0) {
            n8 = -1;
        }
        return n8;
    }

    @Override
    public void close() throws IOException {
        if (this.d != null) {
            this.d = null;
            this.a.close();
        }
    }

    @Override
    public final void d(z z8) {
        ax.S0.a.e(z8);
        this.a.d(z8);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long f(k object) throws IOException {
        Throwable var1_4;
        Throwable var1_7;
        IvParameterSpec ivParameterSpec;
        SecretKeySpec secretKeySpec;
        Cipher cipher;
        try {
            cipher = this.q();
            secretKeySpec = new SecretKeySpec(this.b, "AES");
            ivParameterSpec = new IvParameterSpec(this.c);
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            throw new RuntimeException((Throwable)var1_7);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            // empty catch block
            throw new RuntimeException((Throwable)var1_7);
        }
        try {
            cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
            object = new i(this.a, (k)object);
            this.d = new CipherInputStream((InputStream)object, cipher);
            ((i)object).b();
            return -1L;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new RuntimeException((Throwable)var1_4);
        }
        catch (InvalidKeyException invalidKeyException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var1_4);
    }

    @Override
    public final Map<String, List<String>> l() {
        return this.a.l();
    }

    protected Cipher q() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }
}

