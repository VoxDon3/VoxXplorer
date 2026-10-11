/*
 * Decompiled with CFR 0.152.
 */
package ax.ba;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import ax.ca.g;
import ax.ga.b;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

public final class e {
    final Resources a;
    final int b;
    final int c;
    final int d;
    final int e;
    final Executor f;
    final Executor g;
    final boolean h;
    final boolean i;
    final int j;
    final int k;
    final g l;
    final ax.Z9.a m;
    final ax.V9.a n;
    final ax.ga.b o;
    final ax.ea.b p;
    final ax.ba.c q;
    final ax.ga.b r;
    final ax.ga.b s;

    private e(b b8) {
        ax.ga.b b9;
        this.a = b8.a.getResources();
        this.b = b8.b;
        this.c = b8.c;
        this.d = b8.d;
        this.e = b8.e;
        ax.ba.e$b.o(b8);
        this.f = b8.f;
        this.g = b8.g;
        this.j = b8.j;
        this.k = b8.k;
        this.l = b8.m;
        this.n = b8.r;
        this.m = b8.q;
        this.q = b8.v;
        this.o = b9 = b8.t;
        this.p = b8.u;
        this.h = b8.h;
        this.i = b8.i;
        this.r = new c(b9);
        this.s = new d(b9);
        ax.ka.d.g(b8.w);
    }

    ax.ca.e a() {
        int n8;
        int n9;
        DisplayMetrics displayMetrics = this.a.getDisplayMetrics();
        int n10 = n9 = this.b;
        if (n9 <= 0) {
            n10 = displayMetrics.widthPixels;
        }
        n9 = n8 = this.c;
        if (n8 <= 0) {
            n9 = displayMetrics.heightPixels;
        }
        return new ax.ca.e(n10, n9);
    }

    public static class b {
        public static final g x = ax.ca.g.q;
        private Context a;
        private int b = 0;
        private int c = 0;
        private int d = 0;
        private int e = 0;
        private Executor f = null;
        private Executor g = null;
        private boolean h = false;
        private boolean i = false;
        private int j = 3;
        private int k = 3;
        private boolean l = false;
        private g m = x;
        private int n = 0;
        private long o = 0L;
        private int p = 0;
        private ax.Z9.a q = null;
        private ax.V9.a r = null;
        private ax.Y9.a s = null;
        private ax.ga.b t = null;
        private ax.ea.b u;
        private ax.ba.c v = null;
        private boolean w = false;

        public b(Context context) {
            this.a = context.getApplicationContext();
        }

        static /* synthetic */ ax.ja.a o(b b8) {
            b8.getClass();
            return null;
        }

        private void z() {
            if (this.f == null) {
                this.f = ax.ba.a.c(this.j, this.k, this.m);
            } else {
                this.h = true;
            }
            if (this.g == null) {
                this.g = ax.ba.a.c(this.j, this.k, this.m);
            } else {
                this.i = true;
            }
            if (this.r == null) {
                if (this.s == null) {
                    this.s = ax.ba.a.d();
                }
                this.r = ax.ba.a.b(this.a, this.s, this.o, this.p);
            }
            if (this.q == null) {
                this.q = ax.ba.a.g(this.a, this.n);
            }
            if (this.l) {
                this.q = new ax.aa.a(this.q, ax.ka.e.a());
            }
            if (this.t == null) {
                this.t = ax.ba.a.f(this.a);
            }
            if (this.u == null) {
                this.u = ax.ba.a.e(this.w);
            }
            if (this.v == null) {
                this.v = ax.ba.c.t();
            }
        }

        public b A(ax.Z9.a a8) {
            if (this.n != 0) {
                ax.ka.d.f("memoryCache() and memoryCacheSize() calls overlap each other", new Object[0]);
            }
            this.q = a8;
            return this;
        }

        public b B(int n8, int n9) {
            this.b = n8;
            this.c = n9;
            return this;
        }

        public b C(Executor executor) {
            if (this.j != 3 || this.k != 3 || this.m != x) {
                ax.ka.d.f("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
            }
            this.f = executor;
            return this;
        }

        public b D(Executor executor) {
            if (this.j != 3 || this.k != 3 || this.m != x) {
                ax.ka.d.f("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
            }
            this.g = executor;
            return this;
        }

        public e t() {
            this.z();
            return new e(this);
        }

        public b u(ax.ba.c c8) {
            this.v = c8;
            return this;
        }

        public b v(ax.V9.a a8) {
            if (this.o > 0L || this.p > 0) {
                ax.ka.d.f("diskCache(), diskCacheSize() and diskCacheFileCount calls overlap each other", new Object[0]);
            }
            if (this.s != null) {
                ax.ka.d.f("diskCache() and diskCacheFileNameGenerator() calls overlap each other", new Object[0]);
            }
            this.r = a8;
            return this;
        }

        public b w(int n8, int n9, ax.ja.a a8) {
            this.d = n8;
            this.e = n9;
            return this;
        }

        public b x(ax.ea.b b8) {
            this.u = b8;
            return this;
        }

        public b y(ax.ga.b b8) {
            this.t = b8;
            return this;
        }
    }

    private static class c
    implements ax.ga.b {
        private final ax.ga.b a;

        public c(ax.ga.b b8) {
            this.a = b8;
        }

        @Override
        public InputStream a(String string, Object object) throws IOException {
            int n8 = ax.ba.e$a.a[b.a.l(string).ordinal()];
            if (n8 != 1 && n8 != 2) {
                return this.a.a(string, object);
            }
            throw new IllegalStateException();
        }
    }

    private static class d
    implements ax.ga.b {
        private final ax.ga.b a;

        public d(ax.ga.b b8) {
            this.a = b8;
        }

        @Override
        public InputStream a(String string, Object object) throws IOException {
            object = this.a.a(string, object);
            int n8 = ax.ba.e$a.a[b.a.l(string).ordinal()];
            if (n8 != 1 && n8 != 2) {
                return object;
            }
            return new ax.ca.c((InputStream)object);
        }
    }
}

