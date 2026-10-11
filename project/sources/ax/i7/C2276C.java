package ax.i7;

import ax.db.C1954A;
import ax.db.n;
import ax.db.o;
import ax.gb.AbstractC2134a;
import ax.r7.AbstractC2991z;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: ax.i7.C, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2276C {
    private static final Logger a = Logger.getLogger(C2276C.class.getName());
    public static final String b = "Sent." + p.class.getName() + ".execute";
    private static final ax.db.y c = C1954A.b();
    private static final AtomicLong d = new AtomicLong();
    private static volatile boolean e = true;
    static volatile AbstractC2134a f;
    static volatile AbstractC2134a.c g;

    /* renamed from: ax.i7.C$a */
    static class a extends AbstractC2134a.c<m> {
        a() {
        }

        @Override // ax.gb.AbstractC2134a.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(m mVar, String str, String str2) {
            mVar.f(str, str2);
        }
    }

    static {
        f = null;
        g = null;
        try {
            f = ax.bb.b.a();
            g = new a();
        } catch (Exception e2) {
            a.log(Level.WARNING, "Cannot initialize default OpenCensus HTTP propagation text format.", (Throwable) e2);
        }
        try {
            C1954A.a().a().b(AbstractC2991z.A(b));
        } catch (Exception e3) {
            a.log(Level.WARNING, "Cannot register default OpenCensus span names for collection.", (Throwable) e3);
        }
    }

    private C2276C() {
    }

    public static ax.db.n a(Integer num) {
        n.a a2 = ax.db.n.a();
        if (num == null) {
            a2.b(ax.db.u.f);
        } else if (v.b(num.intValue())) {
            a2.b(ax.db.u.d);
        } else {
            int intValue = num.intValue();
            if (intValue == 400) {
                a2.b(ax.db.u.g);
            } else if (intValue == 401) {
                a2.b(ax.db.u.l);
            } else if (intValue == 403) {
                a2.b(ax.db.u.k);
            } else if (intValue == 404) {
                a2.b(ax.db.u.i);
            } else if (intValue == 412) {
                a2.b(ax.db.u.n);
            } else if (intValue != 500) {
                a2.b(ax.db.u.f);
            } else {
                a2.b(ax.db.u.s);
            }
        }
        return a2.a();
    }

    public static ax.db.y b() {
        return c;
    }

    public static boolean c() {
        return e;
    }

    public static void d(ax.db.q qVar, m mVar) {
        ax.m7.v.b(qVar != null, "span should not be null.");
        ax.m7.v.b(mVar != null, "headers should not be null.");
        if (f == null || g == null || qVar.equals(ax.db.j.e)) {
            return;
        }
        f.a(qVar.h(), mVar, g);
    }

    static void e(ax.db.q qVar, long j, o.b bVar) {
        ax.m7.v.b(qVar != null, "span should not be null.");
        if (j < 0) {
            j = 0;
        }
        qVar.d(ax.db.o.a(bVar, d.getAndIncrement()).d(j).a());
    }

    public static void f(ax.db.q qVar, long j) {
        e(qVar, j, o.b.RECEIVED);
    }

    public static void g(ax.db.q qVar, long j) {
        e(qVar, j, o.b.SENT);
    }
}
