/*
 * Decompiled with CFR 0.152.
 */
package ax.n0;

import ax.Fb.a;
import ax.Gb.l;
import ax.Qb.J;
import ax.n0.b;
import ax.n0.d;
import ax.n0.e;
import ax.n0.f;
import ax.n0.k;
import ax.n0.m;
import ax.tb.o;
import java.io.File;
import java.util.List;

public final class g {
    public static final g a = new g();

    private g() {
    }

    public final <T> f<T> a(k<T> k8, ax.o0.b<T> b8, List<? extends d<T>> list, J j8, a<? extends File> a8) {
        l.f(k8, "serializer");
        l.f(list, "migrations");
        l.f(j8, "scope");
        l.f(a8, "produceFile");
        b<T> b9 = b8;
        if (b8 == null) {
            b9 = new ax.o0.a();
        }
        return new m<T>(a8, k8, o.d(e.a.b(list)), b9, j8);
    }
}

