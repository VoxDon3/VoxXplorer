/*
 * Decompiled with CFR 0.152.
 */
package ax.s1;

import ax.N1.t;
import ax.P0.D;
import ax.P0.E;
import ax.P0.v;
import ax.S0.G;
import ax.S0.u;
import ax.q1.K;
import ax.q1.M;
import ax.q1.N;
import ax.q1.U;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.q1.t;
import ax.s1.a;
import ax.s1.d;
import ax.s1.e;
import ax.s1.f;
import ax.s1.g;
import ax.s1.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class b
implements r {
    private final G a;
    private final c b;
    private final boolean c;
    private final t.a d;
    private int e;
    private t f;
    private ax.s1.c g;
    private long h;
    private e[] i;
    private long j;
    private e k;
    private int l;
    private long m;
    private long n;
    private int o;
    private boolean p;

    public b(int n8, t.a a8) {
        this.d = a8;
        boolean bl = true;
        if ((n8 & 1) != 0) {
            bl = false;
        }
        this.c = bl;
        this.a = new G(12);
        this.b = new c();
        this.f = new K();
        this.i = new e[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    private static void h(s s8) throws IOException {
        if ((s8.getPosition() & 1L) == 1L) {
            s8.n(1);
        }
    }

    private e i(int n8) {
        for (e e8 : this.i) {
            if (!e8.j(n8)) continue;
            return e8;
        }
        return null;
    }

    private void j(G object) throws IOException {
        Object object2 = ax.s1.f.d(1819436136, (G)object);
        if (((f)object2).a() == 1819436136) {
            object = ((f)object2).c(ax.s1.c.class);
            if (object != null) {
                this.g = object;
                this.h = (long)((ax.s1.c)object).c * (long)((ax.s1.c)object).a;
                object = new ArrayList<Object>();
                object2 = ((f)object2).a.n();
                int n8 = 0;
                while (object2.hasNext()) {
                    Object object3 = (a)object2.next();
                    if (object3.a() != 1819440243) continue;
                    if ((object3 = this.n((f)object3, n8)) != null) {
                        ((ArrayList)object).add(object3);
                    }
                    ++n8;
                }
                this.i = ((ArrayList)object).toArray(new e[0]);
                this.f.o();
                return;
            }
            throw E.a("AviHeader not found", null);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unexpected header list type ");
        ((StringBuilder)object).append(((f)object2).a());
        throw E.a(((StringBuilder)object).toString(), null);
    }

    private void l(G eArray) {
        int n8;
        int n9;
        long l8 = this.m((G)eArray);
        while (true) {
            n9 = eArray.a();
            boolean bl = false;
            if (n9 < 16) break;
            n8 = eArray.z();
            n9 = eArray.z();
            long l9 = eArray.z();
            eArray.c0(4);
            e e8 = this.i(n8);
            if (e8 == null) continue;
            if ((n9 & 0x10) == 16) {
                bl = true;
            }
            e8.b(l9 + l8, bl);
        }
        eArray = this.i;
        n9 = eArray.length;
        for (n8 = 0; n8 < n9; ++n8) {
            eArray[n8].c();
        }
        this.p = true;
        if (this.i.length == 0) {
            this.f.h(new N.b(this.h));
            return;
        }
        this.f.h(new b(this, this.h));
    }

    private long m(G g8) {
        int n8 = g8.a();
        long l8 = 0L;
        if (n8 < 16) {
            return 0L;
        }
        n8 = g8.g();
        g8.c0(8);
        long l9 = g8.z();
        long l10 = this.m;
        if (l9 <= l10) {
            l8 = 8L + l10;
        }
        g8.b0(n8);
        return l8;
    }

    private e n(f object, int n8) {
        d d8 = ((f)object).c(d.class);
        Object object2 = ((f)object).c(g.class);
        if (d8 == null) {
            u.h("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (object2 == null) {
            u.h("AviExtractor", "Missing Stream Format");
            return null;
        }
        long l8 = d8.b();
        v v8 = ((g)object2).a;
        object2 = v8.b();
        ((v.b)object2).i0(n8);
        int n9 = d8.f;
        if (n9 != 0) {
            ((v.b)object2).o0(n9);
        }
        if ((object = ((f)object).c(h.class)) != null) {
            ((v.b)object2).l0(((h)object).a);
        }
        if ((n9 = D.k(v8.o)) != 1 && n9 != 2) {
            return null;
        }
        object = this.f.u(n8, n9);
        object.e(((v.b)object2).P());
        object.d(l8);
        this.h = Math.max(this.h, l8);
        return new e(n8, d8, (U)object);
    }

    private int o(s s8) throws IOException {
        if (s8.getPosition() >= this.n) {
            return -1;
        }
        Object object = this.k;
        if (object != null) {
            if (((e)object).m(s8)) {
                this.k = null;
            }
        } else {
            ax.s1.b.h(s8);
            object = this.a.f();
            int n8 = 12;
            s8.p((byte[])object, 0, 12);
            this.a.b0(0);
            int n9 = this.a.z();
            if (n9 == 1414744396) {
                this.a.b0(8);
                if (this.a.z() != 1769369453) {
                    n8 = 8;
                }
                s8.n(n8);
                s8.m();
                return 0;
            }
            n8 = this.a.z();
            if (n9 == 1263424842) {
                this.j = s8.getPosition() + (long)n8 + 8L;
                return 0;
            }
            s8.n(8);
            s8.m();
            object = this.i(n9);
            if (object == null) {
                this.j = s8.getPosition() + (long)n8;
                return 0;
            }
            ((e)object).n(n8);
            this.k = object;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    private boolean p(s var1_1, M var2_2) throws IOException {
        if (this.j == -1L) ** GOTO lbl9
        var3_4 = this.j;
        var5_3 = var1_1.getPosition();
        if (var3_4 < var5_3 || var3_4 > 262144L + var5_3) {
            var2_2.a = var3_4;
            var7_5 = true;
        } else {
            var1_1.n((int)(var3_4 - var5_3));
lbl9:
            // 2 sources

            var7_5 = false;
        }
        this.j = -1L;
        return var7_5;
    }

    @Override
    public void a(t t8) {
        this.e = 0;
        t t9 = t8;
        if (this.c) {
            t9 = new ax.N1.u(t8, this.d);
        }
        this.f = t9;
        this.j = -1L;
    }

    @Override
    public void b(long l8, long l9) {
        this.j = -1L;
        this.k = null;
        e[] eArray = this.i;
        int n8 = eArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            eArray[i8].o(l8);
        }
        if (l8 == 0L) {
            if (this.i.length == 0) {
                this.e = 0;
                return;
            }
            this.e = 3;
            return;
        }
        this.e = 6;
    }

    @Override
    public boolean c(s s8) throws IOException {
        s8.p(this.a.f(), 0, 12);
        this.a.b0(0);
        if (this.a.z() != 1179011410) {
            return false;
        }
        this.a.c0(4);
        return this.a.z() == 541677121;
    }

    @Override
    public void d() {
    }

    @Override
    public /* synthetic */ r e() {
        return q.b(this);
    }

    @Override
    public int f(s object, M object2) throws IOException {
        if (this.p((s)object, (M)object2)) {
            return 1;
        }
        switch (this.e) {
            default: {
                throw new AssertionError();
            }
            case 6: {
                return this.o((s)object);
            }
            case 5: {
                object2 = new G(this.o);
                object.readFully(((G)object2).f(), 0, this.o);
                this.l((G)object2);
                this.e = 6;
                this.j = this.m;
                return 0;
            }
            case 4: {
                object.readFully(this.a.f(), 0, 8);
                this.a.b0(0);
                int n8 = this.a.z();
                int n9 = this.a.z();
                if (n8 == 829973609) {
                    this.e = 5;
                    this.o = n9;
                } else {
                    this.j = object.getPosition() + (long)n9;
                }
                return 0;
            }
            case 3: {
                long l8;
                long l9;
                if (this.m != -1L && (l9 = object.getPosition()) != (l8 = this.m)) {
                    this.j = l8;
                    return 0;
                }
                object.p(this.a.f(), 0, 12);
                object.m();
                this.a.b0(0);
                this.b.a(this.a);
                int n10 = this.a.z();
                int n11 = this.b.a;
                if (n11 == 1179011410) {
                    object.n(12);
                    return 0;
                }
                if (n11 == 1414744396 && n10 == 1769369453) {
                    this.m = l9 = object.getPosition();
                    this.n = l9 + (long)this.b.b + 8L;
                    if (!this.p) {
                        if (ax.S0.a.e(this.g).b()) {
                            this.e = 4;
                            this.j = this.n;
                            return 0;
                        }
                        this.f.h(new N.b(this.h));
                        this.p = true;
                    }
                    this.j = object.getPosition() + 12L;
                    this.e = 6;
                    return 0;
                }
                this.j = object.getPosition() + (long)this.b.b + 8L;
                return 0;
            }
            case 2: {
                int n12 = this.l - 4;
                object2 = new G(n12);
                object.readFully(((G)object2).f(), 0, n12);
                this.j((G)object2);
                this.e = 3;
                return 0;
            }
            case 1: {
                object.readFully(this.a.f(), 0, 12);
                this.a.b0(0);
                this.b.b(this.a);
                object = this.b;
                if (((c)object).c == 1819436136) {
                    this.l = ((c)object).b;
                    this.e = 2;
                    return 0;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("hdrl expected, found: ");
                ((StringBuilder)object).append(this.b.c);
                throw E.a(((StringBuilder)object).toString(), null);
            }
            case 0: 
        }
        if (this.c((s)object)) {
            object.n(12);
            this.e = 1;
            return 0;
        }
        throw E.a("AVI Header List not found", null);
    }

    public /* synthetic */ List k() {
        return q.a(this);
    }

    private class b
    implements N {
        private final long a;
        final b b;

        public b(b b8, long l8) {
            this.b = b8;
            this.a = l8;
        }

        @Override
        public boolean i() {
            return true;
        }

        @Override
        public N.a l(long l8) {
            N.a a8 = this.b.i[0].i(l8);
            for (int i8 = 1; i8 < this.b.i.length; ++i8) {
                N.a a9 = this.b.i[i8].i(l8);
                N.a a10 = a8;
                if (a9.a.b < a8.a.b) {
                    a10 = a9;
                }
                a8 = a10;
            }
            return a8;
        }

        @Override
        public long n() {
            return this.a;
        }
    }

    private static class c {
        public int a;
        public int b;
        public int c;

        private c() {
        }

        public void a(G g8) {
            this.a = g8.z();
            this.b = g8.z();
            this.c = 0;
        }

        public void b(G object) throws E {
            this.a((G)object);
            if (this.a == 1414744396) {
                this.c = ((G)object).z();
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("LIST expected, found: ");
            ((StringBuilder)object).append(this.a);
            throw E.a(((StringBuilder)object).toString(), null);
        }
    }
}

