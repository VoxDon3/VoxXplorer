package ax.qb;

import java.security.MessageDigest;

/* renamed from: ax.qb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2895c extends MessageDigest implements Cloneable {
    private byte[] c0;
    private byte[] d0;
    private MessageDigest q;

    public C2895c(byte[] bArr) {
        super("HMACT64");
        this.c0 = new byte[64];
        this.d0 = new byte[64];
        int min = Math.min(bArr.length, 64);
        for (int i = 0; i < min; i++) {
            this.c0[i] = (byte) (54 ^ bArr[i]);
            this.d0[i] = (byte) (92 ^ bArr[i]);
        }
        while (min < 64) {
            this.c0[min] = 54;
            this.d0[min] = 92;
            min++;
        }
        try {
            this.q = MessageDigest.getInstance("MD5");
            engineReset();
        } catch (Exception e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // java.security.MessageDigest, java.security.MessageDigestSpi
    public Object clone() {
        try {
            return new C2895c(this);
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }

    @Override // java.security.MessageDigestSpi
    protected byte[] engineDigest() {
        byte[] digest = this.q.digest();
        this.q.update(this.d0);
        return this.q.digest(digest);
    }

    @Override // java.security.MessageDigestSpi
    protected int engineGetDigestLength() {
        return this.q.getDigestLength();
    }

    @Override // java.security.MessageDigestSpi
    protected void engineReset() {
        this.q.reset();
        this.q.update(this.c0);
    }

    @Override // java.security.MessageDigestSpi
    protected void engineUpdate(byte b) {
        this.q.update(b);
    }

    @Override // java.security.MessageDigestSpi
    protected void engineUpdate(byte[] bArr, int i, int i2) {
        this.q.update(bArr, i, i2);
    }

    @Override // java.security.MessageDigestSpi
    protected int engineDigest(byte[] bArr, int i, int i2) {
        byte[] digest = this.q.digest();
        this.q.update(this.d0);
        this.q.update(digest);
        try {
            return this.q.digest(bArr, i, i2);
        } catch (Exception unused) {
            throw new IllegalStateException();
        }
    }

    private C2895c(C2895c c2895c) throws CloneNotSupportedException {
        super("HMACT64");
        this.c0 = new byte[64];
        this.d0 = new byte[64];
        this.c0 = c2895c.c0;
        this.d0 = c2895c.d0;
        this.q = (MessageDigest) c2895c.q.clone();
    }
}
