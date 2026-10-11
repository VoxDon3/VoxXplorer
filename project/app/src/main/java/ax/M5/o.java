/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import ax.K5.h;
import ax.K5.l;
import ax.M5.J;
import ax.M5.K;
import ax.M5.L;
import ax.M5.M;
import ax.j6.j;
import ax.j6.k;

public class o {
    private static final M a = new J();

    public static <R extends l, T> j<T> a(h<R> h8, a<R, T> a8) {
        M m8 = a;
        k k8 = new k();
        h8.a(new K(h8, k8, a8, m8));
        return k8.a();
    }

    public static <R extends l> j<Void> b(h<R> h8) {
        return o.a(h8, new L());
    }

    public static interface a<R extends l, T> {
        public T a(R var1);
    }
}

