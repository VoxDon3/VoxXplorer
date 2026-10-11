package ax.q1;

import ax.S0.d0;
import ax.q1.N;
import java.util.Arrays;

/* renamed from: ax.q1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2848h implements N {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public C2848h(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    public int a(long j) {
        return d0.h(this.e, j, true, true);
    }

    @Override // ax.q1.N
    public boolean i() {
        return true;
    }

    @Override // ax.q1.N
    public N.a l(long j) {
        int a = a(j);
        O o = new O(this.e[a], this.c[a]);
        if (o.a >= j || a == this.a - 1) {
            return new N.a(o);
        }
        int i = a + 1;
        return new N.a(o, new O(this.e[i], this.c[i]));
    }

    @Override // ax.q1.N
    public long n() {
        return this.f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
