/*
 * Decompiled with CFR 0.152.
 */
package ax.J0;

import android.os.Bundle;
import ax.G0.h;
import ax.G0.v;
import ax.J0.b;
import ax.K0.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
    public static <T extends h & v> a c(T t8) {
        return new b(t8, ((v)t8).getViewModelStore());
    }

    public abstract void a(int var1);

    @Deprecated
    public abstract void b(String var1, FileDescriptor var2, PrintWriter var3, String[] var4);

    public abstract <D> c<D> d(int var1);

    public abstract <D> c<D> e(int var1, Bundle var2, a<D> var3);

    public abstract void f();

    public abstract <D> c<D> g(int var1, Bundle var2, a<D> var3);

    public static interface a<D> {
        public void p(c<D> var1);

        public void v(c<D> var1, D var2);

        public c<D> w(int var1, Bundle var2);
    }
}

