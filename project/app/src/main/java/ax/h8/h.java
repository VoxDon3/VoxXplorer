/*
 * Decompiled with CFR 0.152.
 */
package ax.h8;

import android.content.Context;
import ax.D7.c;
import ax.D7.e;
import ax.D7.r;
import ax.h8.f;
import ax.h8.g;

public class h {
    public static /* synthetic */ f a(String string, a a8, e e8) {
        return f.a(string, a8.a(e8.a(Context.class)));
    }

    public static c<?> b(String string, String string2) {
        return c.l(f.a(string, string2), f.class);
    }

    public static c<?> c(String string, a<Context> a8) {
        return c.m(f.class).b(r.j(Context.class)).e(new g(string, a8)).c();
    }

    public static interface a<T> {
        public String a(T var1);
    }
}

