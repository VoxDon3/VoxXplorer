package ax.S0;

import java.util.Arrays;

/* renamed from: ax.S0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0988v {
    private int a;
    private long[] b;

    public C0988v() {
        this(32);
    }

    public void a(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }

    public void b(long[] jArr) {
        int length = this.a + jArr.length;
        long[] jArr2 = this.b;
        if (length > jArr2.length) {
            this.b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.b, this.a, jArr.length);
        this.a = length;
    }

    public long c(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.a);
    }

    public int d() {
        return this.a;
    }

    public C0988v(int i) {
        this.b = new long[i];
    }
}
