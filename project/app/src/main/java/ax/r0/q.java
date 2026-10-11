/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.S;
import ax.r0.g0;
import ax.r0.h;
import ax.r0.o0;
import ax.r0.p;
import ax.r0.u;
import ax.r0.v0;
import java.io.IOException;
import java.util.Map;

abstract class q<T extends u.b<T>> {
    q() {
    }

    abstract int a(Map.Entry<?, ?> var1);

    abstract Object b(p var1, S var2, int var3);

    abstract u<T> c(Object var1);

    abstract u<T> d(Object var1);

    abstract boolean e(S var1);

    abstract void f(Object var1);

    abstract <UT, UB> UB g(g0 var1, Object var2, p var3, u<T> var4, UB var5, o0<UT, UB> var6) throws IOException;

    abstract void h(g0 var1, Object var2, p var3, u<T> var4) throws IOException;

    abstract void i(h var1, Object var2, p var3, u<T> var4) throws IOException;

    abstract void j(v0 var1, Map.Entry<?, ?> var2) throws IOException;
}

