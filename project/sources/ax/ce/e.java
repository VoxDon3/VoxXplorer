package ax.ce;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public class e extends c {
    private final MessageDigest c;

    public e() throws NoSuchAlgorithmException {
        this.a = 32;
        this.b = "SHA-256";
        this.c = MessageDigest.getInstance("SHA-256");
    }

    @Override // ax.ce.c
    public byte[] a() {
        byte[] digest = this.c.digest();
        this.c.reset();
        return digest;
    }

    @Override // ax.ce.c
    public void f(byte[] bArr, int i, int i2) {
        this.c.update(bArr, i, i2);
    }
}
