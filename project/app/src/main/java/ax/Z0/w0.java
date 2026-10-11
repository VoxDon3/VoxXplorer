/*
 * Decompiled with CFR 0.152.
 */
package ax.Z0;

import android.util.Base64;
import ax.P0.N;
import ax.S0.d0;
import ax.Z0.F1;
import ax.Z0.c;
import ax.Z0.v0;
import ax.i1.F;
import ax.q7.u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public final class w0
implements F1 {
    public static final u<String> i = new v0();
    private static final Random j = new Random();
    private final N.c a;
    private final N.b b;
    private final HashMap<String, a> c;
    private final u<String> d;
    private F1.a e;
    private N f;
    private String g;
    private long h;

    public w0() {
        this(i);
    }

    public w0(u<String> u8) {
        this.d = u8;
        this.a = new N.c();
        this.b = new N.b();
        this.c = new HashMap();
        this.f = N.a;
        this.h = -1L;
    }

    public static /* synthetic */ String h() {
        return w0.m();
    }

    private void l(a a8) {
        if (a8.c != -1L) {
            this.h = a8.c;
        }
        this.g = null;
    }

    private static String m() {
        byte[] byArray = new byte[12];
        j.nextBytes(byArray);
        return Base64.encodeToString((byte[])byArray, (int)10);
    }

    private long n() {
        a a8 = this.c.get(this.g);
        if (a8 != null && a8.c != -1L) {
            return a8.c;
        }
        return this.h + 1L;
    }

    private a o(int n8, F.b b8) {
        a a8;
        Iterator<a> iterator = this.c.values().iterator();
        Object object = null;
        long l8 = Long.MAX_VALUE;
        while (iterator.hasNext()) {
            long l9;
            a8 = iterator.next();
            a8.k(n8, b8);
            if (!a8.i(n8, b8)) continue;
            long l10 = a8.c;
            if (l10 != -1L && (l9 = l10 == l8 ? 0 : (l10 < l8 ? -1 : 1)) >= 0) {
                if (l9 != false || ((a)d0.i(object)).d == null || a8.d == null) continue;
                object = a8;
                continue;
            }
            object = a8;
            l8 = l10;
        }
        a8 = object;
        if (object == null) {
            object = this.d.get();
            a8 = new a(this, (String)object, n8, b8);
            this.c.put((String)object, a8);
        }
        return a8;
    }

    private void p(c.a object) {
        if (((c.a)object).b.q()) {
            object = this.g;
            if (object != null) {
                this.l(ax.S0.a.e(this.c.get(object)));
                return;
            }
        } else {
            Object object2 = this.c.get(this.g);
            a a8 = this.o(((c.a)object).c, ((c.a)object).d);
            this.g = a8.a;
            this.b((c.a)object);
            F.b b8 = ((c.a)object).d;
            if (b8 != null && b8.b() && (object2 == null || ((a)object2).c != ((c.a)object).d.d || ((a)object2).d == null || ((a)object2).d.b != ((c.a)object).d.b || ((a)object2).d.c != ((c.a)object).d.c)) {
                object2 = ((c.a)object).d;
                object2 = new F.b(((F.b)object2).a, ((F.b)object2).d);
                object2 = this.o(((c.a)object).c, (F.b)object2);
                this.e.o((c.a)object, ((a)object2).a, a8.a);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public String a() {
        synchronized (this) {
            return this.g;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b(c.a a8) {
        synchronized (this) {
            F.b b8;
            long l8;
            Object object;
            Throwable throwable2;
            block12: {
                int n8;
                int n9;
                block13: {
                    block11: {
                        try {
                            ax.S0.a.e(this.e);
                            boolean bl = a8.b.q();
                            if (!bl) break block11;
                        }
                        catch (Throwable throwable2) {}
                        return;
                    }
                    object = a8.d;
                    if (object == null) break block12;
                    long l9 = ((F.b)object).d;
                    l8 = this.n();
                    if (l9 >= l8) break block13;
                    return;
                }
                object = this.c.get(this.g);
                if (object == null || ((a)object).c != -1L || (n9 = ((a)object).b) == (n8 = a8.c)) break block12;
                return;
            }
            object = this.o(a8.c, a8.d);
            if (this.g == null) {
                this.g = ((a)object).a;
            }
            if ((b8 = a8.d) != null && b8.b()) {
                Object object2 = a8.d;
                b8 = new F.b(((F.b)object2).a, ((F.b)object2).d, ((F.b)object2).b);
                a a9 = this.o(a8.c, b8);
                if (!a9.e) {
                    ax.Z0.w0$a.e(a9, true);
                    a8.b.h(a8.d.a, this.b);
                    l8 = Math.max(0L, d0.E1(this.b.f(a8.d.b)) + this.b.n());
                    object2 = new c.a(a8.a, a8.b, a8.c, b8, l8, a8.f, a8.g, a8.h, a8.i, a8.j);
                    this.e.J((c.a)object2, a9.a);
                }
            }
            if (!((a)object).e) {
                ax.Z0.w0$a.e((a)object, true);
                this.e.J(a8, ((a)object).a);
            }
            if (((a)object).a.equals(this.g) && !((a)object).f) {
                ax.Z0.w0$a.g((a)object, true);
                this.e.H(a8, ((a)object).a);
            }
            return;
            throw throwable2;
        }
    }

    @Override
    public void c(F1.a a8) {
        this.e = a8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void d(c.a a8, int n8) {
        synchronized (this) {
            Iterator<a> iterator;
            try {
                ax.S0.a.e(this.e);
                n8 = n8 == 0 ? 1 : 0;
                iterator = this.c.values().iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (true) {
                if (!iterator.hasNext()) {
                    this.p(a8);
                    return;
                }
                a a9 = iterator.next();
                if (!a9.j(a8)) continue;
                iterator.remove();
                if (!a9.e) continue;
                boolean bl = a9.a.equals(this.g);
                boolean bl2 = n8 != 0 && bl && a9.f;
                if (bl) {
                    this.l(a9);
                }
                this.e.y(a8, a9.a, bl2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void e(c.a a8) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object;
                block5: {
                    try {
                        object = this.g;
                        if (object == null) break block5;
                        this.l(ax.S0.a.e(this.c.get(object)));
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                object = this.c.values().iterator();
                while (true) {
                    F1.a a9;
                    if (!object.hasNext()) {
                        return;
                    }
                    a a10 = (a)object.next();
                    object.remove();
                    if (!a10.e || (a9 = this.e) == null) continue;
                    a9.y(a8, a10.a, false);
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void f(c.a a8) {
        synchronized (this) {
            Iterator<a> iterator;
            N n8;
            try {
                ax.S0.a.e(this.e);
                n8 = this.f;
                this.f = a8.b;
                iterator = this.c.values().iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (true) {
                if (!iterator.hasNext()) {
                    this.p(a8);
                    return;
                }
                a a9 = iterator.next();
                if (a9.m(n8, this.f) && !a9.j(a8)) continue;
                iterator.remove();
                if (!a9.e) continue;
                if (a9.a.equals(this.g)) {
                    this.l(a9);
                }
                this.e.y(a8, a9.a, false);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public String g(N object, F.b b8) {
        synchronized (this) {
            return this.o(((N)object).h((Object)b8.a, (N.b)this.b).c, b8).a;
        }
    }

    private final class a {
        private final String a;
        private int b;
        private long c;
        private F.b d;
        private boolean e;
        private boolean f;
        final w0 g;

        public a(w0 w02, String string, int n8, F.b b8) {
            this.g = w02;
            this.a = string;
            this.b = n8;
            long l8 = b8 == null ? -1L : b8.d;
            this.c = l8;
            if (b8 != null && b8.b()) {
                this.d = b8;
            }
        }

        static /* synthetic */ boolean e(a a8, boolean bl) {
            a8.e = bl;
            return bl;
        }

        static /* synthetic */ boolean g(a a8, boolean bl) {
            a8.f = bl;
            return bl;
        }

        private int l(N n8, N n9, int n10) {
            if (n10 >= n8.p()) {
                if (n10 < n9.p()) {
                    return n10;
                }
                return -1;
            }
            n8.n(n10, this.g.a);
            for (n10 = ((w0)this.g).a.n; n10 <= ((w0)this.g).a.o; ++n10) {
                int n11 = n9.b(n8.m(n10));
                if (n11 == -1) continue;
                return n9.f((int)n11, (N.b)((w0)this.g).b).c;
            }
            return -1;
        }

        public boolean i(int n8, F.b b8) {
            if (b8 == null) {
                return n8 == this.b;
            }
            F.b b9 = this.d;
            if (b9 == null) {
                return !b8.b() && b8.d == this.c;
            }
            return b8.d == b9.d && b8.b == b9.b && b8.c == b9.c;
        }

        public boolean j(c.a object) {
            F.b b8 = ((c.a)object).d;
            if (b8 == null) {
                return this.b != ((c.a)object).c;
            }
            long l8 = this.c;
            if (l8 == -1L) {
                return false;
            }
            if (b8.d > l8) {
                return true;
            }
            if (this.d == null) {
                return false;
            }
            int n8 = ((c.a)object).b.b(b8.a);
            int n9 = ((c.a)object).b.b(this.d.a);
            b8 = ((c.a)object).d;
            if (b8.d >= this.d.d && n8 >= n9) {
                if (n8 > n9) {
                    return true;
                }
                if (b8.b()) {
                    object = ((c.a)object).d;
                    int n10 = ((F.b)object).b;
                    n9 = ((F.b)object).c;
                    object = this.d;
                    n8 = ((F.b)object).b;
                    return n10 > n8 || n10 == n8 && n9 > ((F.b)object).c;
                    {
                    }
                }
                n8 = ((c.a)object).d.e;
                return n8 == -1 || n8 > this.d.b;
                {
                }
            }
            return false;
        }

        public void k(int n8, F.b b8) {
            if (this.c == -1L && n8 == this.b && b8 != null && b8.d >= this.g.n()) {
                this.c = b8.d;
            }
        }

        public boolean m(N object, N n8) {
            int n9;
            this.b = n9 = this.l((N)object, n8, this.b);
            if (n9 == -1) {
                return false;
            }
            object = this.d;
            if (object == null) {
                return true;
            }
            return n8.b(((F.b)object).a) != -1;
        }
    }
}

