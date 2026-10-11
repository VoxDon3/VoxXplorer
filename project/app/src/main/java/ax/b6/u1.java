/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.E;
import ax.b6.K7;
import ax.b6.Z2;
import ax.b6.Z3;
import ax.b6.a5;
import ax.b6.d1;
import ax.b6.k;
import ax.b6.n;
import ax.b6.r2;
import ax.b6.s;
import ax.b6.t;
import ax.b6.v;
import ax.b6.y2;
import java.util.concurrent.Callable;

public final class u1 {
    private final E a;
    final Z2 b;
    final Z2 c;
    private final a5 d;

    public u1() {
        Z2 z22;
        Object object = new E();
        this.a = object;
        this.c = z22 = new Z2(null, (E)object);
        this.b = z22.d();
        this.d = object = new a5();
        z22.h("require", new K7((a5)object));
        ((a5)object).b("internal.platform", new d1());
        z22.h("runtime.counter", new k(0.0));
    }

    public final s a(Z2 z22, r2 ... r2Array) {
        s s8 = s.f;
        int n8 = r2Array.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            s8 = Z3.a(r2Array[i8]);
            y2.b(this.c);
            if (!(s8 instanceof v) && !(s8 instanceof t)) continue;
            s8 = this.a.a(z22, s8);
        }
        return s8;
    }

    public final void b(String string, Callable<? extends n> callable) {
        this.d.b(string, callable);
    }
}

