/*
 * Decompiled with CFR 0.152.
 */
package ax.d2;

import ax.D.c;
import ax.Gb.l;
import ax.Qb.Q;
import ax.d2.a;
import ax.sb.t;
import ax.v7.e;
import java.util.concurrent.CancellationException;

public final class b {
    public static /* synthetic */ Object a(Q q8, Object object, c.a a8) {
        return b.d(q8, object, a8);
    }

    public static final <T> e<T> b(Q<? extends T> object, Object object2) {
        l.f(object, "<this>");
        object = c.a(new a((Q)object, object2));
        l.e(object, "getFuture { completer ->\u2026        }\n    }\n    tag\n}");
        return object;
    }

    public static /* synthetic */ e c(Q q8, Object object, int n8, Object object2) {
        if ((n8 & 1) != 0) {
            object = "Deferred.asListenableFuture";
        }
        return b.b(q8, object);
    }

    private static final Object d(Q q8, Object object, c.a a8) {
        l.f(q8, "$this_asListenableFuture");
        l.f(a8, "completer");
        q8.F((ax.Fb.l<? super Throwable, t>)new ax.Fb.l<Throwable, t>(a8, q8){
            final Q<T> c0;
            final c.a<T> q;
            {
                this.q = a8;
                this.c0 = q8;
                super(1);
            }

            public final void a(Throwable throwable) {
                if (throwable != null) {
                    if (throwable instanceof CancellationException) {
                        this.q.c();
                        return;
                    }
                    this.q.e(throwable);
                    return;
                }
                this.q.b(this.c0.c());
            }
        });
        return object;
    }
}

