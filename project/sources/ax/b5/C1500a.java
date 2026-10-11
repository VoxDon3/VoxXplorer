package ax.b5;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: ax.b5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1500a {
    private static final int[] c = {8000, 8000, 2000, 2000};
    private static final int[] d = {4000, 4000, 200, 200};
    protected final AtomicReferenceArray<byte[]> a;
    protected final AtomicReferenceArray<char[]> b;

    public C1500a() {
        this(4, 4);
    }

    public final byte[] a(int i) {
        return b(i, 0);
    }

    public byte[] b(int i, int i2) {
        int f = f(i);
        if (i2 < f) {
            i2 = f;
        }
        byte[] andSet = this.a.getAndSet(i, null);
        return (andSet == null || andSet.length < i2) ? e(i2) : andSet;
    }

    public final char[] c(int i) {
        return d(i, 0);
    }

    public char[] d(int i, int i2) {
        int h = h(i);
        if (i2 < h) {
            i2 = h;
        }
        char[] andSet = this.b.getAndSet(i, null);
        return (andSet == null || andSet.length < i2) ? g(i2) : andSet;
    }

    protected byte[] e(int i) {
        return new byte[i];
    }

    protected int f(int i) {
        return c[i];
    }

    protected char[] g(int i) {
        return new char[i];
    }

    protected int h(int i) {
        return d[i];
    }

    public void i(int i, byte[] bArr) {
        this.a.set(i, bArr);
    }

    public void j(int i, char[] cArr) {
        this.b.set(i, cArr);
    }

    protected C1500a(int i, int i2) {
        this.a = new AtomicReferenceArray<>(i);
        this.b = new AtomicReferenceArray<>(i2);
    }
}
