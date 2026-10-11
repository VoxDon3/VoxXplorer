/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl;

import android.content.Context;
import ax.C2.E;
import ax.C2.c;
import ax.C2.h;
import ax.C2.i;
import ax.C2.k;
import ax.C2.m;
import ax.C2.n;
import ax.C2.s;
import ax.C2.y;
import ax.Gb.g;
import ax.Gb.l;
import ax.K2.A;
import ax.K2.b;
import ax.K2.e;
import ax.K2.j;
import ax.K2.o;
import ax.K2.r;
import ax.K2.w;
import ax.k2.t;
import ax.k2.u;
import ax.o2.h;
import ax.p2.f;
import java.util.concurrent.Executor;

public abstract class WorkDatabase
extends u {
    public static final a p = new a(null);

    public static final WorkDatabase C(Context context, Executor executor, boolean bl) {
        return p.b(context, executor, bl);
    }

    public abstract b D();

    public abstract e E();

    public abstract j F();

    public abstract o G();

    public abstract r H();

    public abstract w I();

    public abstract A J();

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public static /* synthetic */ ax.o2.h a(Context context, h.b b8) {
            return androidx.work.impl.WorkDatabase$a.c(context, b8);
        }

        private static final ax.o2.h c(Context object, h.b b8) {
            l.f(object, "$context");
            l.f(b8, "configuration");
            object = h.b.f.a((Context)object);
            ((h.b.a)object).d(b8.b).c(b8.c).e(true).a(true);
            return new f().a(((h.b.a)object).b());
        }

        public final WorkDatabase b(Context context, Executor executor, boolean bl) {
            l.f(context, "context");
            l.f(executor, "queryExecutor");
            u.a<WorkDatabase> a8 = bl ? t.c(context, WorkDatabase.class).c() : t.a(context, WorkDatabase.class, "androidx.work.workdb").f(new y(context));
            return a8.g(executor).a(c.a).b(i.c).b(new s(context, 2, 3)).b(ax.C2.j.c).b(k.c).b(new s(context, 5, 6)).b(ax.C2.l.c).b(m.c).b(n.c).b(new E(context)).b(new s(context, 10, 11)).b(ax.C2.f.c).b(ax.C2.g.c).b(ax.C2.h.c).e().d();
        }
    }
}

