/*
 * Decompiled with CFR 0.152.
 */
package ax.j1;

import android.net.Uri;
import ax.P0.v;
import ax.S0.a;
import ax.U0.g;
import ax.U0.k;
import ax.U0.y;
import ax.m1.o;
import java.util.List;
import java.util.Map;

public abstract class b
implements o.e {
    public final long a;
    public final k b;
    public final int c;
    public final v d;
    public final int e;
    public final Object f;
    public final long g;
    public final long h;
    protected final y i;

    public b(g g8, k k8, int n8, v v8, int n9, Object object, long l8, long l9) {
        this.i = new y(g8);
        this.b = ax.S0.a.e(k8);
        this.c = n8;
        this.d = v8;
        this.e = n9;
        this.f = object;
        this.g = l8;
        this.h = l9;
        this.a = ax.i1.y.a();
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

