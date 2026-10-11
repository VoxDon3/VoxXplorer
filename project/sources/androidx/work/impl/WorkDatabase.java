package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import ax.C2.C0654c;
import ax.C2.C0657f;
import ax.C2.C0658g;
import ax.C2.E;
import ax.C2.i;
import ax.C2.j;
import ax.C2.k;
import ax.C2.m;
import ax.C2.n;
import ax.C2.s;
import ax.Gb.g;
import ax.Gb.l;
import ax.K2.A;
import ax.K2.InterfaceC0782b;
import ax.K2.e;
import ax.K2.o;
import ax.K2.r;
import ax.K2.w;
import ax.k2.AbstractC2390u;
import ax.k2.C2389t;
import ax.o2.h;
import ax.p2.f;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class WorkDatabase extends AbstractC2390u {
    public static final a p = new a(null);

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h c(Context context, h.b bVar) {
            l.f(context, "$context");
            l.f(bVar, "configuration");
            h.b.a a = h.b.f.a(context);
            a.d(bVar.b).c(bVar.c).e(true).a(true);
            return new f().a(a.b());
        }

        public final WorkDatabase b(final Context context, Executor executor, boolean z) {
            l.f(context, "context");
            l.f(executor, "queryExecutor");
            return (WorkDatabase) (z ? C2389t.c(context, WorkDatabase.class).c() : C2389t.a(context, WorkDatabase.class, "androidx.work.workdb").f(new h.c() { // from class: ax.C2.y
                @Override // ax.o2.h.c
                public final ax.o2.h a(h.b bVar) {
                    ax.o2.h c;
                    c = WorkDatabase.a.c(context, bVar);
                    return c;
                }
            })).g(executor).a(C0654c.a).b(i.c).b(new s(context, 2, 3)).b(j.c).b(k.c).b(new s(context, 5, 6)).b(ax.C2.l.c).b(m.c).b(n.c).b(new E(context)).b(new s(context, 10, 11)).b(C0657f.c).b(C0658g.c).b(ax.C2.h.c).e().d();
        }

        private a() {
        }
    }

    public static final WorkDatabase C(Context context, Executor executor, boolean z) {
        return p.b(context, executor, z);
    }

    public abstract InterfaceC0782b D();

    public abstract e E();

    public abstract ax.K2.j F();

    public abstract o G();

    public abstract r H();

    public abstract w I();

    public abstract A J();
}
