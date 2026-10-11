/*
 * Decompiled with CFR 0.152.
 */
package ax.qb;

import java.security.MessageDigest;

public class c
extends MessageDigest
implements Cloneable {
    private byte[] c0 = new byte[64];
    private byte[] d0 = new byte[64];
    private MessageDigest q;

    private c(c c8) throws CloneNotSupportedException {
        super("HMACT64");
        this.c0 = c8.c0;
        this.d0 = c8.d0;
        this.q = (MessageDigest)c8.q.clone();
    }

    public c(byte[] byArray) {
        super("HMACT64");
        int n8 = Math.min(byArray.length, 64);
        int n9 = 0;
        while (true) {
            if (n9 >= n8) break;
            this.c0[n9] = (byte)(0x36 ^ byArray[n9]);
            this.d0[n9] = (byte)(0x5C ^ byArray[n9]);
            ++n9;
        }
        for (int i8 = n8; i8 < 64; ++i8) {
            this.c0[i8] = 54;
            this.d0[i8] = 92;
        }
        try {
            this.q = MessageDigest.getInstance("MD5");
            this.engineReset();
            return;
        }
        catch (Exception exception) {
            throw new IllegalStateException(exception.getMessage());
        }
    }

    @Override
    public Object clone() {
        try {
            c c8 = new c(this);
            return c8;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException(cloneNotSupportedException.getMessage());
        }
    }

    @Override
    protected int engineDigest(byte[] byArray, int n8, int n9) {
        byte[] byArray2 = this.q.digest();
        this.q.update(this.d0);
        this.q.update(byArray2);
        try {
            n8 = this.q.digest(byArray, n8, n9);
            return n8;
        }
        catch (Exception exception) {
            throw new IllegalStateException();
        }
    }

    @Override
    protected byte[] engineDigest() {
        byte[] byArray = this.q.digest();
        this.q.update(this.d0);
        return this.q.digest(byArray);
    }

    @Override
    protected int engineGetDigestLength() {
        return this.q.getDigestLength();
    }

    @Override
    protected void engineReset() {
        this.q.reset();
        this.q.update(this.c0);
    }

    @Override
    protected void engineUpdate(byte by) {
        this.q.update(by);
    }

    @Override
    protected void engineUpdate(byte[] byArray, int n8, int n9) {
        this.q.update(byArray, n8, n9);
    }
}

