package ax.S0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class L<V> {
    private long[] a;
    private V[] b;
    private int c;
    private int d;

    public L() {
        this(10);
    }

    private void b(long j, V v) {
        int i = this.c;
        int i2 = this.d;
        V[] vArr = this.b;
        int length = (i + i2) % vArr.length;
        this.a[length] = j;
        vArr[length] = v;
        this.d = i2 + 1;
    }

    private void d(long j) {
        if (this.d > 0) {
            if (j <= this.a[((this.c + r0) - 1) % this.b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.b.length;
        if (this.d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        V[] vArr = (V[]) f(i);
        int i2 = this.c;
        int i3 = length - i2;
        System.arraycopy(this.a, i2, jArr, 0, i3);
        System.arraycopy(this.b, this.c, vArr, 0, i3);
        int i4 = this.c;
        if (i4 > 0) {
            System.arraycopy(this.a, 0, jArr, i3, i4);
            System.arraycopy(this.b, 0, vArr, i3, this.c);
        }
        this.a = jArr;
        this.b = vArr;
        this.c = 0;
    }

    private static <V> V[] f(int i) {
        return (V[]) new Object[i];
    }

    private V h(long j, boolean z) {
        V v = null;
        long j2 = Long.MAX_VALUE;
        while (this.d > 0) {
            long j3 = j - this.a[this.c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            v = k();
            j2 = j3;
        }
        return v;
    }

    private V k() {
        C0968a.g(this.d > 0);
        V[] vArr = this.b;
        int i = this.c;
        V v = vArr[i];
        vArr[i] = null;
        this.c = (i + 1) % vArr.length;
        this.d--;
        return v;
    }

    public synchronized void a(long j, V v) {
        d(j);
        e();
        b(j, v);
    }

    public synchronized void c() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, (Object) null);
    }

    public synchronized V g(long j) {
        return h(j, false);
    }

    public synchronized V i() {
        return this.d == 0 ? null : k();
    }

    public synchronized V j(long j) {
        return h(j, true);
    }

    public synchronized int l() {
        return this.d;
    }

    public L(int i) {
        this.a = new long[i];
        this.b = (V[]) f(i);
    }
}
