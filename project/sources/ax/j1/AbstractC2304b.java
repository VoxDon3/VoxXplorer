package ax.j1;

import android.net.Uri;
import ax.P0.C0912v;
import ax.S0.C0968a;
import ax.U0.g;
import ax.U0.k;
import ax.U0.y;
import ax.i1.C2234y;
import ax.m1.o;
import java.util.List;
import java.util.Map;

/* renamed from: ax.j1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2304b implements o.e {
    public final long a = C2234y.a();
    public final k b;
    public final int c;
    public final C0912v d;
    public final int e;
    public final Object f;
    public final long g;
    public final long h;
    protected final y i;

    public AbstractC2304b(g gVar, k kVar, int i, C0912v c0912v, int i2, Object obj, long j, long j2) {
        this.i = new y(gVar);
        this.b = (k) C0968a.e(kVar);
        this.c = i;
        this.d = c0912v;
        this.e = i2;
        this.f = obj;
        this.g = j;
        this.h = j2;
    }

    public final long b() {
        return this.i.q();
    }

    public final long d() {
        return this.h - this.g;
    }

    public final Map<String, List<String>> e() {
        return this.i.s();
    }

    public final Uri f() {
        return this.i.r();
    }
}
