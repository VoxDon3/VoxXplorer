/*
 * Decompiled with CFR 0.152.
 */
package ax.i7;

import ax.bb.b;
import ax.db.A;
import ax.db.j;
import ax.db.n;
import ax.db.o;
import ax.db.q;
import ax.db.u;
import ax.db.y;
import ax.gb.a;
import ax.i7.m;
import ax.i7.p;
import ax.i7.v;
import ax.r7.z;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

public class C {
    private static final Logger a = Logger.getLogger(C.class.getName());
    public static final String b;
    private static final y c;
    private static final AtomicLong d;
    private static volatile boolean e;
    static volatile a f;
    static volatile a.c g;

    static {
        a.c<m> c8 = new StringBuilder();
        ((StringBuilder)((Object)c8)).append("Sent.");
        ((StringBuilder)((Object)c8)).append(p.class.getName());
        ((StringBuilder)((Object)c8)).append(".execute");
        b = ((StringBuilder)((Object)c8)).toString();
        c = A.b();
        d = new AtomicLong();
        e = true;
        f = null;
        g = null;
        try {
            f = ax.bb.b.a();
            c8 = new a.c<m>(){

                public void b(m m8, String string, String string2) {
                    m8.B(string, string2);
                }
            };
            g = c8;
        }
        catch (Exception exception) {
            a.log(Level.WARNING, "Cannot initialize default OpenCensus HTTP propagation text format.", exception);
        }
        try {
            A.a().a().b(z.A(b));
        }
        catch (Exception exception) {
            a.log(Level.WARNING, "Cannot register default OpenCensus span names for collection.", exception);
        }
    }

    private C() {
    }

    public static n a(Integer n8) {
        n.a a8 = n.a();
        if (n8 == null) {
            a8.b(u.f);
        } else if (!v.b(n8)) {
            int n9 = n8;
            if (n9 != 400) {
                if (n9 != 401) {
                    if (n9 != 403) {
                        if (n9 != 404) {
                            if (n9 != 412) {
                                if (n9 != 500) {
                                    a8.b(u.f);
                                } else {
                                    a8.b(u.s);
                                }
                            } else {
                                a8.b(u.n);
                            }
                        } else {
                            a8.b(u.i);
                        }
                    } else {
                        a8.b(u.k);
                    }
                } else {
                    a8.b(u.l);
                }
            } else {
                a8.b(u.g);
            }
        } else {
            a8.b(u.d);
        }
        return a8.a();
    }

    public static y b() {
        return c;
    }

    public static boolean c() {
        return e;
    }

    public static void d(q q8, m m8) {
        boolean bl = false;
        boolean bl2 = q8 != null;
        ax.m7.v.b(bl2, "span should not be null.");
        bl2 = bl;
        if (m8 != null) {
            bl2 = true;
        }
        ax.m7.v.b(bl2, "headers should not be null.");
        if (f != null && g != null && !q8.equals(j.e)) {
            f.a(q8.h(), m8, g);
        }
    }

    static void e(q q8, long l8, o.b b8) {
        boolean bl = q8 != null;
        ax.m7.v.b(bl, "span should not be null.");
        long l9 = l8;
        if (l8 < 0L) {
            l9 = 0L;
        }
        q8.d(o.a(b8, d.getAndIncrement()).d(l9).a());
    }

    public static void f(q q8, long l8) {
        C.e(q8, l8, o.b.c0);
    }

    public static void g(q q8, long l8) {
        C.e(q8, l8, o.b.q);
    }
}

