package ax.K1;

import ax.P0.C0912v;

/* loaded from: classes.dex */
public final class t {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final C0912v g;
    public final int h;
    public final long[] i;
    public final long[] j;
    public final int k;
    private final u[] l;

    public t(int i, int i2, long j, long j2, long j3, long j4, C0912v c0912v, int i3, u[] uVarArr, int i4, long[] jArr, long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = c0912v;
        this.h = i3;
        this.l = uVarArr;
        this.k = i4;
        this.i = jArr;
        this.j = jArr2;
    }

    public t a(C0912v c0912v) {
        return new t(this.a, this.b, this.c, this.d, this.e, this.f, c0912v, this.h, this.l, this.k, this.i, this.j);
    }

    public u b(int i) {
        u[] uVarArr = this.l;
        if (uVarArr == null) {
            return null;
        }
        return uVarArr[i];
    }
}
