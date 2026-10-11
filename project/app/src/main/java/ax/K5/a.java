/*
 * Decompiled with CFR 0.152.
 */
package ax.K5;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import ax.K5.g;
import ax.K5.o;
import ax.L5.i;
import ax.M5.c;
import ax.M5.j;
import ax.M5.p;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Set;

public final class a<O extends d> {
    private final a a;
    private final g b;
    private final String c;

    public <C extends f> a(String string, a<C, O> a8, g<C> g8) {
        p.m(a8, "Cannot construct an Api with a null ClientBuilder");
        p.m(g8, "Cannot construct an Api with a null ClientKey");
        this.c = string;
        this.a = a8;
        this.b = g8;
    }

    public final a a() {
        return this.a;
    }

    public final c b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public static abstract class a<T extends f, O>
    extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, ax.M5.d d8, O o8, g.a a8, g.b b8) {
            return this.b(context, looper, d8, o8, a8, b8);
        }

        public T b(Context context, Looper looper, ax.M5.d d8, O o8, ax.L5.c c8, i i8) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public static interface b {
    }

    public static class c<C extends b> {
    }

    public static interface d {
        public static final c a = new c(null);

        public static interface a
        extends d {
            public Account i();
        }

        public static interface b
        extends d {
            public GoogleSignInAccount g();
        }

        public static final class c
        implements d {
            private c() {
            }

            /* synthetic */ c(o o8) {
            }
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public static interface f
    extends b {
        public boolean a();

        public void b();

        public void c(j var1, Set<Scope> var2);

        public Set<Scope> d();

        public void e(String var1);

        public boolean f();

        public String g();

        public void h(c.c var1);

        public void i(c.e var1);

        public boolean j();

        public int k();

        public ax.J5.e[] l();

        public String m();

        public boolean o();
    }

    public static final class g<C extends f>
    extends c<C> {
    }
}

