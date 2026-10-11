package ax.d2;

import ax.D.c;
import ax.Fb.l;
import ax.Gb.m;
import ax.Qb.Q;
import ax.sb.t;
import ax.v7.e;
import java.util.concurrent.CancellationException;

/* renamed from: ax.d2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1883b {

    /* renamed from: ax.d2.b$a */
    static final class a extends m implements l<Throwable, t> {
        final /* synthetic */ Q<T> c0;
        final /* synthetic */ c.a<T> q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c.a<T> aVar, Q<? extends T> q) {
            super(1);
            this.q = aVar;
            this.c0 = q;
        }

        public final void a(Throwable th) {
            if (th == null) {
                this.q.b(this.c0.c());
            } else if (th instanceof CancellationException) {
                this.q.c();
            } else {
                this.q.e(th);
            }
        }

        @Override // ax.Fb.l
        public /* bridge */ /* synthetic */ t invoke(Throwable th) {
            a(th);
            return t.a;
        }
    }

    public static final <T> e<T> b(final Q<? extends T> q, final Object obj) {
        ax.Gb.l.f(q, "<this>");
        e<T> a2 = c.a(new c.InterfaceC0066c() { // from class: ax.d2.a
            @Override // ax.D.c.InterfaceC0066c
            public final Object a(c.a aVar) {
                Object d;
                d = C1883b.d(Q.this, obj, aVar);
                return d;
            }
        });
        ax.Gb.l.e(a2, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return a2;
    }

    public static /* synthetic */ e c(Q q, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(q, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Q q, Object obj, c.a aVar) {
        ax.Gb.l.f(q, "$this_asListenableFuture");
        ax.Gb.l.f(aVar, "completer");
        q.F(new a(aVar, q));
        return obj;
    }
}
