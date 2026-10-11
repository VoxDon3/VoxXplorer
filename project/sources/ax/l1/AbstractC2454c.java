package ax.l1;

import android.os.SystemClock;
import ax.P0.C0912v;
import ax.P0.P;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.j1.AbstractC2304b;
import ax.j1.AbstractC2306d;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: ax.l1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2454c implements InterfaceC2445D {
    protected final P a;
    protected final int b;
    protected final int[] c;
    private final int d;
    private final C0912v[] e;
    private final long[] f;
    private int g;
    private boolean h;

    public AbstractC2454c(P p, int... iArr) {
        this(p, iArr, 0);
    }

    public static /* synthetic */ int u(C0912v c0912v, C0912v c0912v2) {
        return c0912v2.j - c0912v.j;
    }

    @Override // ax.l1.InterfaceC2445D
    public boolean a(int i, long j) {
        return this.f[i] > j;
    }

    @Override // ax.l1.InterfaceC2449H
    public final P b() {
        return this.a;
    }

    @Override // ax.l1.InterfaceC2445D
    public /* synthetic */ boolean e(long j, AbstractC2304b abstractC2304b, List list) {
        return C2444C.c(this, j, abstractC2304b, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC2454c abstractC2454c = (AbstractC2454c) obj;
            if (this.a.equals(abstractC2454c.a) && Arrays.equals(this.c, abstractC2454c.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.l1.InterfaceC2445D
    public void g(boolean z) {
        this.h = z;
    }

    @Override // ax.l1.InterfaceC2449H
    public final C0912v h(int i) {
        return this.e[i];
    }

    public int hashCode() {
        if (this.g == 0) {
            this.g = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.c);
        }
        return this.g;
    }

    @Override // ax.l1.InterfaceC2449H
    public final int j(int i) {
        return this.c[i];
    }

    @Override // ax.l1.InterfaceC2445D
    public int k(long j, List<? extends AbstractC2306d> list) {
        return list.size();
    }

    @Override // ax.l1.InterfaceC2445D
    public final int l() {
        return this.c[d()];
    }

    @Override // ax.l1.InterfaceC2449H
    public final int length() {
        return this.c.length;
    }

    @Override // ax.l1.InterfaceC2445D
    public final C0912v m() {
        return this.e[d()];
    }

    @Override // ax.l1.InterfaceC2445D
    public boolean o(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a = a(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !a) {
            a = (i2 == i || a(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (!a) {
            return false;
        }
        long[] jArr = this.f;
        jArr[i] = Math.max(jArr[i], d0.c(elapsedRealtime, j, Long.MAX_VALUE));
        return true;
    }

    @Override // ax.l1.InterfaceC2445D
    public /* synthetic */ void r() {
        C2444C.a(this);
    }

    @Override // ax.l1.InterfaceC2445D
    public /* synthetic */ void s() {
        C2444C.b(this);
    }

    @Override // ax.l1.InterfaceC2449H
    public final int t(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final int v(C0912v c0912v) {
        for (int i = 0; i < this.b; i++) {
            if (this.e[i] == c0912v) {
                return i;
            }
        }
        return -1;
    }

    public AbstractC2454c(P p, int[] iArr, int i) {
        C0968a.g(iArr.length > 0);
        this.d = i;
        this.a = (P) C0968a.e(p);
        int length = iArr.length;
        this.b = length;
        this.e = new C0912v[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.e[i2] = p.b(iArr[i2]);
        }
        Arrays.sort(this.e, new Comparator() { // from class: ax.l1.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC2454c.u((C0912v) obj, (C0912v) obj2);
            }
        });
        this.c = new int[this.b];
        int i3 = 0;
        while (true) {
            int i4 = this.b;
            if (i3 >= i4) {
                this.f = new long[i4];
                this.h = false;
                return;
            } else {
                this.c[i3] = p.c(this.e[i3]);
                i3++;
            }
        }
    }

    @Override // ax.l1.InterfaceC2445D
    public void f() {
    }

    @Override // ax.l1.InterfaceC2445D
    public void i() {
    }

    @Override // ax.l1.InterfaceC2445D
    public void p(float f) {
    }
}
