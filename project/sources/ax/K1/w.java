package ax.K1;

import ax.S0.C0968a;
import ax.S0.d0;

/* loaded from: classes.dex */
public final class w {
    public final t a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public w(t tVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        C0968a.a(iArr.length == jArr2.length);
        C0968a.a(jArr.length == jArr2.length);
        C0968a.a(iArr2.length == jArr2.length);
        this.a = tVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j) {
        for (int h = d0.h(this.f, j, true, false); h >= 0; h--) {
            if ((this.g[h] & 1) != 0) {
                return h;
            }
        }
        return -1;
    }

    public int b(long j) {
        for (int d = d0.d(this.f, j, true, false); d < this.f.length; d++) {
            if ((this.g[d] & 1) != 0) {
                return d;
            }
        }
        return -1;
    }
}
