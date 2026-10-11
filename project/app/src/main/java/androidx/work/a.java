/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import android.os.Build;
import ax.B2.h;
import ax.B2.p;
import ax.B2.u;
import ax.C2.d;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {
    final Executor a;
    final Executor b;
    final u c;
    final h d;
    final p e;
    final ax.b0.a<Throwable> f;
    final ax.b0.a<Throwable> g;
    final String h;
    final int i;
    final int j;
    final int k;
    final int l;
    private final boolean m;

    a(b b8) {
        Object object = b8.a;
        this.a = object == null ? this.a(false) : object;
        object = b8.d;
        if (object == null) {
            this.m = true;
            this.b = this.a(true);
        } else {
            this.m = false;
            this.b = object;
        }
        object = b8.b;
        this.c = object == null ? u.c() : object;
        object = b8.c;
        this.d = object == null ? ax.B2.h.c() : object;
        object = b8.e;
        this.e = object == null ? new d() : object;
        this.i = b8.i;
        this.j = b8.j;
        this.k = b8.k;
        this.l = b8.l;
        this.f = b8.f;
        this.g = b8.g;
        this.h = b8.h;
    }

    private Executor a(boolean bl) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), this.b(bl));
    }

    private ThreadFactory b(boolean bl) {
        return new ThreadFactory(){
            private final AtomicInteger a;
            final boolean b;
            final a c;
            {
                this.c = a8;
                this.b = bl;
                this.a = new AtomicInteger(0);
            }

            @Override
            public Thread newThread(Runnable runnable2) {
                String string = this.b ? "WM.task-" : "androidx.work-";
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append(this.a.incrementAndGet());
                return new Thread(runnable2, stringBuilder.toString());
            }
        };
    }

    public String c() {
        return this.h;
    }

    public Executor d() {
        return this.a;
    }

    public ax.b0.a<Throwable> e() {
        return this.f;
    }

    public h f() {
        return this.d;
    }

    public int g() {
        return this.k;
    }

    public int h() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.l / 2;
        }
        return this.l;
    }

    public int i() {
        return this.j;
    }

    public int j() {
        return this.i;
    }

    public p k() {
        return this.e;
    }

    public ax.b0.a<Throwable> l() {
        return this.g;
    }

    public Executor m() {
        return this.b;
    }

    public u n() {
        return this.c;
    }

    public static final class b {
        Executor a;
        u b;
        h c;
        Executor d;
        p e;
        ax.b0.a<Throwable> f;
        ax.b0.a<Throwable> g;
        String h;
        int i = 4;
        int j = 0;
        int k = Integer.MAX_VALUE;
        int l = 20;

        public a a() {
            return new a(this);
        }

        public b b(ax.b0.a<Throwable> a8) {
            this.f = a8;
            return this;
        }

        public b c(int n8, int n9) {
            if (n9 - n8 >= 1000) {
                this.j = n8;
                this.k = n9;
                return this;
            }
            throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
        }

        public b d(ax.b0.a<Throwable> a8) {
            this.g = a8;
            return this;
        }
    }

    public static interface c {
        public a a();
    }
}

