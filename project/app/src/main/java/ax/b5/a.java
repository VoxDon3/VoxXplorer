/*
 * Decompiled with CFR 0.152.
 */
package ax.b5;

import java.util.concurrent.atomic.AtomicReferenceArray;

public class a {
    private static final int[] c = new int[]{8000, 8000, 2000, 2000};
    private static final int[] d = new int[]{4000, 4000, 200, 200};
    protected final AtomicReferenceArray<byte[]> a;
    protected final AtomicReferenceArray<char[]> b;

    public a() {
        this(4, 4);
    }

    protected a(int n8, int n9) {
        this.a = new AtomicReferenceArray(n8);
        this.b = new AtomicReferenceArray(n9);
    }

    public final byte[] a(int n8) {
        return this.b(n8, 0);
    }

    public byte[] b(int n8, int n9) {
        byte[] byArray;
        int n10 = this.f(n8);
        int n11 = n9;
        if (n9 < n10) {
            n11 = n10;
        }
        if ((byArray = (byte[])this.a.getAndSet(n8, null)) != null && byArray.length >= n11) {
            return byArray;
        }
        return this.e(n11);
    }

    public final char[] c(int n8) {
        return this.d(n8, 0);
    }

    public char[] d(int n8, int n9) {
        char[] cArray;
        int n10 = this.h(n8);
        int n11 = n9;
        if (n9 < n10) {
            n11 = n10;
        }
        if ((cArray = (char[])this.b.getAndSet(n8, null)) != null && cArray.length >= n11) {
            return cArray;
        }
        return this.g(n11);
    }

    protected byte[] e(int n8) {
        return new byte[n8];
    }

    protected int f(int n8) {
        return c[n8];
    }

    protected char[] g(int n8) {
        return new char[n8];
    }

    protected int h(int n8) {
        return d[n8];
    }

    public void i(int n8, byte[] byArray) {
        this.a.set(n8, byArray);
    }

    public void j(int n8, char[] cArray) {
        this.b.set(n8, cArray);
    }
}

