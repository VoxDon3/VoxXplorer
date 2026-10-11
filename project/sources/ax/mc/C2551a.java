package ax.mc;

import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: ax.mc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2551a implements d {
    private Mac a;
    private int b;
    private String c;
    private ByteArrayOutputStream d = new ByteArrayOutputStream(4096);

    public C2551a(String str) {
        this.c = str;
        try {
            Mac mac = Mac.getInstance(str);
            this.a = mac;
            this.b = mac.getMacLength();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private void e(int i) {
        byte[] byteArray = this.d.toByteArray();
        int length = byteArray.length - i;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 16;
            this.a.update(byteArray, i2, i3 <= length ? 16 : length - i2);
            i2 = i3;
        }
        this.d.reset();
    }

    @Override // ax.mc.d
    public void a(byte[] bArr) {
        try {
            this.a.init(new SecretKeySpec(bArr, this.c));
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // ax.mc.d
    public byte[] b(byte[] bArr) {
        if (this.d.size() > 0) {
            e(0);
        }
        return this.a.doFinal(bArr);
    }

    @Override // ax.mc.d
    public int c() {
        return this.b;
    }

    public byte[] d(int i) {
        if (this.d.size() > 0) {
            e(i);
        }
        return this.a.doFinal();
    }

    public void f(byte[] bArr, int i, int i2) {
        try {
            if (this.d.size() + i2 > 4096) {
                e(0);
            }
            this.d.write(bArr, i, i2);
        } catch (IllegalStateException e) {
            throw new RuntimeException(e);
        }
    }
}
