package ax.S0;

import java.util.NoSuchElementException;

/* renamed from: ax.S0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0989w {
    private int a;
    private int b;
    private int c;
    private long[] d;
    private int e;

    public C0989w() {
        this(16);
    }

    private void c() {
        long[] jArr = this.d;
        int length = jArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        long[] jArr2 = new long[length];
        int length2 = jArr.length;
        int i = this.a;
        int i2 = length2 - i;
        System.arraycopy(jArr, i, jArr2, 0, i2);
        System.arraycopy(this.d, 0, jArr2, i2, i);
        this.a = 0;
        this.b = this.c - 1;
        this.d = jArr2;
        this.e = jArr2.length - 1;
    }

    public void a(long j) {
        if (this.c == this.d.length) {
            c();
        }
        int i = (this.b + 1) & this.e;
        this.b = i;
        this.d[i] = j;
        this.c++;
    }

    public void b() {
        this.a = 0;
        this.b = -1;
        this.c = 0;
    }

    public long d() {
        if (this.c != 0) {
            return this.d[this.a];
        }
        throw new NoSuchElementException();
    }

    public boolean e() {
        return this.c == 0;
    }

    public long f() {
        int i = this.c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.d;
        int i2 = this.a;
        long j = jArr[i2];
        this.a = this.e & (i2 + 1);
        this.c = i - 1;
        return j;
    }

    public C0989w(int i) {
        C0968a.a(i >= 0 && i <= 1073741824);
        i = i == 0 ? 1 : i;
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.a = 0;
        this.b = -1;
        this.c = 0;
        long[] jArr = new long[i];
        this.d = jArr;
        this.e = jArr.length - 1;
    }
}
