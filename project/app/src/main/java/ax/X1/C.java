/*
 * Decompiled with CFR 0.152.
 */
package ax.X1;

import android.util.SparseArray;
import ax.P0.E;
import ax.S0.F;
import ax.S0.G;
import ax.X1.A;
import ax.X1.B;
import ax.X1.L;
import ax.X1.c;
import ax.X1.m;
import ax.X1.n;
import ax.X1.t;
import ax.X1.z;
import ax.q1.M;
import ax.q1.N;
import ax.q1.e;
import ax.q1.q;
import ax.q1.r;
import ax.q1.s;
import ax.q1.x;
import java.io.IOException;
import java.util.List;

public final class C
implements r {
    public static final x l = new B();
    private final ax.S0.M a;
    private final SparseArray<a> b;
    private final G c;
    private final A d;
    private boolean e;
    private boolean f;
    private boolean g;
    private long h;
    private z i;
    private ax.q1.t j;
    private boolean k;

    public C() {
        this(new ax.S0.M(0L));
    }

    public C(ax.S0.M m8) {
        this.a = m8;
        this.c = new G(4096);
        this.b = new SparseArray();
        this.d = new A();
    }

    public static /* synthetic */ r[] g() {
        return new r[]{new C()};
    }

    private void h(long l8) {
        if (!this.k) {
            this.k = true;
            if (this.d.c() != -9223372036854775807L) {
                z z8;
                this.i = z8 = new z(this.d.d(), this.d.c(), l8);
                this.j.h(z8.b());
                return;
            }
            this.j.h(new N.b(this.d.c()));
        }
    }

    @Override
    public void a(ax.q1.t t8) {
        this.j = t8;
    }

    @Override
    public void b(long l8, long l9) {
        l8 = this.a.f();
        int n8 = 0;
        int n9 = 1;
        int n10 = l8 == -9223372036854775807L ? 1 : 0;
        int n11 = n10;
        if (n10 == 0) {
            l8 = this.a.d();
            n10 = l8 != -9223372036854775807L && l8 != 0L && l8 != l9 ? n9 : 0;
            n11 = n10;
        }
        if (n11 != 0) {
            this.a.i(l9);
        }
        z z8 = this.i;
        n10 = n8;
        if (z8 != null) {
            z8.h(l9);
            n10 = n8;
        }
        while (n10 < this.b.size()) {
            ((a)this.b.valueAt(n10)).d();
            ++n10;
        }
    }

    @Override
    public boolean c(s s8) throws IOException {
        byte[] byArray = new byte[14];
        s8.p(byArray, 0, 14);
        if (442 != ((byArray[0] & 0xFF) << 24 | (byArray[1] & 0xFF) << 16 | (byArray[2] & 0xFF) << 8 | byArray[3] & 0xFF)) {
            return false;
        }
        if ((byArray[4] & 0xC4) != 68) {
            return false;
        }
        if ((byArray[6] & 4) != 4) {
            return false;
        }
        if ((byArray[8] & 4) != 4) {
            return false;
        }
        if ((byArray[9] & 1) != 1) {
            return false;
        }
        if ((byArray[12] & 3) != 3) {
            return false;
        }
        s8.j(byArray[13] & 7);
        s8.p(byArray, 0, 3);
        return 1 == ((byArray[0] & 0xFF) << 16 | (byArray[1] & 0xFF) << 8 | byArray[2] & 0xFF);
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
        ax.S0.a.i(this.j);
        long l8 = object.getLength();
        long l9 = l8 - -1L;
        long l10 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
        if (l10 != false && !this.d.e()) {
            return this.d.g((s)object, (M)object2);
        }
        this.h(l8);
        Object object3 = this.i;
        if (object3 != null && ((e)object3).d()) {
            return this.i.c((s)object, (M)object2);
        }
        object.m();
        l8 = l10 != false ? (l8 -= object.i()) : -1L;
        if (l8 != -1L && l8 < 4L) {
            return -1;
        }
        if (!object.h(this.c.f(), 0, 4, true)) {
            return -1;
        }
        this.c.b0(0);
        int n8 = this.c.v();
        if (n8 == 441) {
            return -1;
        }
        if (n8 == 442) {
            object.p(this.c.f(), 0, 10);
            this.c.b0(9);
            object.n((this.c.M() & 7) + 14);
            return 0;
        }
        if (n8 == 443) {
            object.p(this.c.f(), 0, 2);
            this.c.b0(0);
            object.n(this.c.U() + 6);
            return 0;
        }
        if ((n8 & 0xFFFFFF00) >> 8 != 1) {
            object.n(1);
            return 0;
        }
        l10 = n8 & 0xFF;
        a a8 = (a)this.b.get((int)l10);
        object2 = a8;
        if (!this.e) {
            object3 = a8;
            if (a8 == null) {
                if (l10 == 189) {
                    object2 = new c("video/mp2p");
                    this.f = true;
                    this.h = object.getPosition();
                } else if ((n8 & 0xE0) == 192) {
                    object2 = new t("video/mp2p");
                    this.f = true;
                    this.h = object.getPosition();
                } else if ((n8 & 0xF0) == 224) {
                    object2 = new n("video/mp2p");
                    this.g = true;
                    this.h = object.getPosition();
                } else {
                    object2 = null;
                }
                object3 = a8;
                if (object2 != null) {
                    object3 = new L.d((int)l10, 256);
                    object2.d(this.j, (L.d)object3);
                    object3 = new a((m)object2, this.a);
                    this.b.put((int)l10, object3);
                }
            }
            l8 = this.f && this.g ? this.h + 8192L : 0x100000L;
            object2 = object3;
            if (object.getPosition() > l8) {
                this.e = true;
                this.j.o();
                object2 = object3;
            }
        }
        object.p(this.c.f(), 0, 2);
        this.c.b0(0);
        l10 = this.c.U() + 6;
        if (object2 == null) {
            object.n((int)l10);
        } else {
            this.c.X((int)l10);
            object.readFully(this.c.f(), 0, (int)l10);
            this.c.b0(6);
            ((a)object2).a(this.c);
            object = this.c;
            ((G)object).a0(((G)object).b());
        }
        return 0;
    }

    public /* synthetic */ List k() {
        return q.a(this);
    }

    private static final class a {
        private final m a;
        private final ax.S0.M b;
        private final F c;
        private boolean d;
        private boolean e;
        private boolean f;
        private int g;
        private long h;

        public a(m m8, ax.S0.M m9) {
            this.a = m8;
            this.b = m9;
            this.c = new F(new byte[64]);
        }

        private void b() {
            this.c.r(8);
            this.d = this.c.g();
            this.e = this.c.g();
            this.c.r(6);
            this.g = this.c.h(8);
        }

        private void c() {
            this.h = 0L;
            if (this.d) {
                this.c.r(4);
                long l8 = this.c.h(3);
                this.c.r(1);
                long l9 = this.c.h(15) << 15;
                this.c.r(1);
                long l10 = this.c.h(15);
                this.c.r(1);
                if (!this.f && this.e) {
                    this.c.r(4);
                    long l11 = this.c.h(3);
                    this.c.r(1);
                    long l12 = this.c.h(15) << 15;
                    this.c.r(1);
                    long l13 = this.c.h(15);
                    this.c.r(1);
                    this.b.b(l11 << 30 | l12 | l13);
                    this.f = true;
                }
                this.h = this.b.b(l8 << 30 | l9 | l10);
            }
        }

        public void a(G g8) throws E {
            g8.q(this.c.a, 0, 3);
            this.c.p(0);
            this.b();
            g8.q(this.c.a, 0, this.g);
            this.c.p(0);
            this.c();
            this.a.f(this.h, 4);
            this.a.c(g8);
            this.a.e(false);
        }

        public void d() {
            this.f = false;
            this.a.b();
        }
    }
}

