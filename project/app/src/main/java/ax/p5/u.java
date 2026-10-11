/*
 * Decompiled with CFR 0.152.
 */
package ax.p5;

import android.content.Context;
import ax.n5.b;
import ax.n5.j;
import ax.p5.e;
import ax.p5.f;
import ax.p5.g;
import ax.p5.h;
import ax.p5.i;
import ax.p5.o;
import ax.p5.p;
import ax.p5.q;
import ax.p5.t;
import ax.p5.v;
import ax.w5.r;
import ax.z5.a;
import java.util.Collections;
import java.util.Set;

public class u
implements t {
    private static volatile v e;
    private final a a;
    private final a b;
    private final ax.v5.e c;
    private final r d;

    u(a a8, a a9, ax.v5.e e8, r r8, ax.w5.v v8) {
        this.a = a8;
        this.b = a9;
        this.c = e8;
        this.d = r8;
        v8.c();
    }

    private i b(o o8) {
        i.a a8 = i.a().i(this.a.a()).o(this.b.a()).n(o8.g()).h(new h(o8.b(), o8.d())).g(o8.c().a());
        o8.c().e();
        o8.c().b();
        return a8.d();
    }

    public static u c() {
        v v8 = e;
        if (v8 != null) {
            return v8.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<b> d(f f8) {
        if (f8 instanceof g) {
            return java.util.DesugarCollections.unmodifiableSet(((g)f8).a());
        }
        return Collections.singleton(ax.n5.b.b("proto"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void f(Context context) {
        if (e != null) {
            return;
        }
        synchronized (u.class) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (e != null) break block4;
                        e = ax.p5.e.a().a(context).g();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public void a(o o8, j j8) {
        this.c.a(o8.f().f(o8.c().d()), this.b(o8), j8);
    }

    public r e() {
        return this.d;
    }

    public ax.n5.i g(f f8) {
        return new q(u.d(f8), p.a().b(f8.getName()).c(f8.getExtras()).a(), this);
    }
}

