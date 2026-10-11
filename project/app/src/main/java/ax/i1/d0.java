/*
 * Decompiled with CFR 0.152.
 */
package ax.i1;

import ax.P0.D;
import ax.P0.k;
import ax.P0.o;
import ax.P0.v;
import ax.S0.G;
import ax.S0.a;
import ax.S0.u;
import ax.V0.i;
import ax.Y0.O;
import ax.b1.n;
import ax.b1.u;
import ax.b1.w;
import ax.i1.b0;
import ax.i1.c0;
import ax.i1.k0;
import ax.q1.T;
import ax.q1.U;
import java.io.IOException;

public class d0
implements U {
    private v A;
    private v B;
    private long C;
    private boolean D;
    private boolean E;
    private long F;
    private boolean G;
    private final b0 a;
    private final b b;
    private final k0<c> c;
    private final w d;
    private final u.a e;
    private d f;
    private v g;
    private n h;
    private int i;
    private long[] j;
    private long[] k;
    private int[] l;
    private int[] m;
    private long[] n;
    private U.a[] o;
    private int p;
    private int q;
    private int r;
    private int s;
    private long t;
    private long u;
    private long v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    protected d0(ax.m1.b b8, w w8, u.a a8) {
        this.d = w8;
        this.e = a8;
        this.a = new b0(b8);
        this.b = new b();
        this.i = 1000;
        this.j = new long[1000];
        this.k = new long[1000];
        this.n = new long[1000];
        this.m = new int[1000];
        this.l = new int[1000];
        this.o = new U.a[1000];
        this.c = new k0(new c0());
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.y = true;
        this.x = true;
        this.D = true;
    }

    private int B(int n8) {
        int n9 = this.i;
        if ((n8 = this.r + n8) < n9) {
            return n8;
        }
        return n8 - n9;
    }

    private boolean F() {
        return this.s != this.p;
    }

    private boolean J(int n8) {
        n n9 = this.h;
        return n9 == null || n9.getState() == 4 || (this.m[n8] & 0x40000000) == 0 && this.h.d();
        {
        }
    }

    private void L(v object, O o8) {
        Object object2 = this.g;
        boolean bl = object2 == null;
        object2 = object2 == null ? null : ((v)object2).s;
        this.g = object;
        o o9 = ((v)object).s;
        Object object3 = this.d;
        object3 = object3 != null ? ((v)object).c(object3.a((v)object)) : object;
        o8.b = object3;
        o8.a = this.h;
        if (this.d != null && (bl || !j.Objects.equals((Object)object2, (Object)o9))) {
            object2 = this.h;
            this.h = object = this.d.b(this.e, (v)object);
            o8.a = object;
            if (object2 != null) {
                object2.a(this.e);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int M(O o8, i object, boolean bl, boolean bl2, b b8) {
        synchronized (this) {
            Throwable throwable2;
            block10: {
                block7: {
                    block8: {
                        block9: {
                            try {
                                ((i)object).f0 = false;
                                if (this.F()) break block7;
                                if (bl2 || this.w) break block8;
                                object = this.B;
                                if (object == null || !bl && object == this.g) break block9;
                                this.L((v)ax.S0.a.e(object), o8);
                                return -5;
                            }
                            catch (Throwable throwable2) {}
                        }
                        return -3;
                    }
                    ((ax.V0.a)object).A(4);
                    ((i)object).g0 = Long.MIN_VALUE;
                    return -4;
                    break block10;
                }
                v v8 = this.c.e((int)this.A()).a;
                if (!bl && v8 == this.g) {
                    int n8 = this.B(this.s);
                    if (!this.J(n8)) {
                        ((i)object).f0 = true;
                        return -3;
                    }
                    ((ax.V0.a)object).A(this.m[n8]);
                    if (this.s == this.p - 1 && (bl2 || this.w)) {
                        ((ax.V0.a)object).n(0x20000000);
                    }
                    ((i)object).g0 = this.n[n8];
                    b8.a = this.l[n8];
                    b8.b = this.k[n8];
                    b8.c = this.o[n8];
                    return -4;
                }
                this.L(v8, o8);
                return -5;
            }
            throw throwable2;
        }
    }

    private void R() {
        n n8 = this.h;
        if (n8 != null) {
            n8.a(this.e);
            this.h = null;
            this.g = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void U() {
        synchronized (this) {
            this.s = 0;
            this.a.o();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean Z(v v8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                boolean bl;
                block4: {
                    try {
                        this.y = false;
                        bl = j.Objects.equals((Object)v8, (Object)this.B);
                        if (!bl) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    return false;
                }
                this.B = !this.c.g() && this.c.f().a.equals(v8) ? this.c.f().a : v8;
                bl = this.D;
                v8 = this.B;
                this.D = bl & ax.P0.D.a(v8.o, v8.k);
                this.E = false;
                return true;
            }
            throw throwable2;
        }
    }

    public static /* synthetic */ void h(c c8) {
        c8.b.d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean i(long l8) {
        synchronized (this) {
            Throwable throwable2;
            int n8;
            block6: {
                block5: {
                    try {
                        n8 = this.p;
                        boolean bl = false;
                        if (n8 != 0) break block5;
                        long l9 = this.u;
                        if (l8 <= l9) return bl;
                        return true;
                    }
                    catch (Throwable throwable2) {}
                }
                long l10 = this.y();
                if (l10 < l8) break block6;
                return false;
            }
            n8 = this.k(l8);
            this.r(this.q + n8);
            return true;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void j(long l8, int n8, long l9, int n9, U.a object) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Object object2;
                Object object3;
                Object object4;
                boolean bl;
                int n10;
                block6: {
                    try {
                        n10 = this.p;
                        if (n10 <= 0) break block6;
                        bl = this.k[n10 = this.B(n10 - 1)] + (long)this.l[n10] <= l9;
                        ax.S0.a.a(bl);
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                bl = (0x20000000 & n8) != 0;
                this.w = bl;
                this.v = Math.max(this.v, l8);
                n10 = this.B(this.p);
                this.n[n10] = l8;
                this.k[n10] = l9;
                this.l[n10] = n9;
                this.m[n10] = n8;
                this.o[n10] = object;
                this.j[n10] = this.C;
                if (this.c.g() || !this.c.f().a.equals(this.B)) {
                    object4 = ax.S0.a.e(this.B);
                    object = this.d;
                    object = object != null ? object.e(this.e, (v)object4) : w.b.a;
                    object3 = this.c;
                    n8 = this.E();
                    object2 = new c((v)object4, (w.b)object);
                    ((k0)object3).a(n8, (c)object2);
                }
                this.p = n8 = this.p + 1;
                n10 = this.i;
                if (n8 == n10) {
                    n8 = n10 + 1000;
                    object = new long[n8];
                    object4 = new long[n8];
                    object3 = new long[n8];
                    object2 = new int[n8];
                    int[] nArray = new int[n8];
                    U.a[] aArray = new U.a[n8];
                    n9 = this.r;
                    System.arraycopy(this.k, n9, object4, 0, n10 -= n9);
                    System.arraycopy(this.n, this.r, object3, 0, n10);
                    System.arraycopy(this.m, this.r, object2, 0, n10);
                    System.arraycopy(this.l, this.r, nArray, 0, n10);
                    System.arraycopy(this.o, this.r, aArray, 0, n10);
                    System.arraycopy(this.j, this.r, object, 0, n10);
                    n9 = this.r;
                    System.arraycopy(this.k, 0, object4, n10, n9);
                    System.arraycopy(this.n, 0, object3, n10, n9);
                    System.arraycopy(this.m, 0, object2, n10, n9);
                    System.arraycopy(this.l, 0, nArray, n10, n9);
                    System.arraycopy(this.o, 0, aArray, n10, n9);
                    System.arraycopy(this.j, 0, object, n10, n9);
                    this.k = (long[])object4;
                    this.n = (long[])object3;
                    this.m = (int[])object2;
                    this.l = nArray;
                    this.o = aArray;
                    this.j = (long[])object;
                    this.r = 0;
                    this.i = n8;
                }
                return;
            }
            throw throwable2;
        }
    }

    private int k(long l8) {
        int n8 = this.p;
        int n9 = this.B(n8 - 1);
        while (n8 > this.s && this.n[n9] >= l8) {
            int n10 = n8 - 1;
            int n11 = n9 - 1;
            n8 = n10;
            n9 = n11;
            if (n11 != -1) continue;
            n9 = this.i - 1;
            n8 = n10;
        }
        return n8;
    }

    public static d0 l(ax.m1.b b8, w w8, u.a a8) {
        return new d0(b8, ax.S0.a.e(w8), ax.S0.a.e(a8));
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private long m(long l8, boolean bl, boolean bl2) {
        block12: {
            int n8;
            long[] lArray;
            block13: {
                // MONITORENTER : this
                int n9 = this.p;
                if (n9 == 0) break block12;
                lArray = this.n;
                int n10 = this.r;
                long l9 = lArray[n10];
                if (l8 < l9) {
                    return -1L;
                }
                n8 = n9;
                if (bl2) {
                    try {
                        int n11 = this.s;
                        n8 = n9;
                        if (n11 != n9) {
                            n8 = n11 + 1;
                        }
                    }
                    catch (Throwable throwable) {
                        throw lArray;
                    }
                }
                try {
                    n8 = this.u(n10, n8, l8, bl);
                    if (n8 != -1) break block13;
                }
                catch (Throwable throwable) {
                    throw lArray;
                }
                return -1L;
            }
            l8 = this.o(n8);
            // MONITOREXIT : this
            return l8;
            catch (Throwable throwable) {
                throw lArray;
            }
        }
        // MONITOREXIT : this
        return -1L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private long n() {
        synchronized (this) {
            int n8 = this.p;
            if (n8 != 0) return this.o(n8);
            return -1L;
        }
    }

    private long o(int n8) {
        int n9;
        int n10;
        this.u = Math.max(this.u, this.z(n8));
        this.p -= n8;
        this.q = n10 = this.q + n8;
        this.r = n9 = this.r + n8;
        int n11 = this.i;
        if (n9 >= n11) {
            this.r = n9 - n11;
        }
        this.s = n8 = this.s - n8;
        if (n8 < 0) {
            this.s = 0;
        }
        this.c.d(n10);
        if (this.p == 0) {
            n8 = n10 = this.r;
            if (n10 == 0) {
                n8 = this.i;
            }
            return this.k[--n8] + (long)this.l[n8];
        }
        return this.k[this.r];
    }

    private long r(int n8) {
        int n9;
        int n10 = this.E() - n8;
        boolean bl = false;
        boolean bl2 = n10 >= 0 && n10 <= this.p - this.s;
        ax.S0.a.a(bl2);
        this.p = n9 = this.p - n10;
        this.v = Math.max(this.u, this.z(n9));
        bl2 = bl;
        if (n10 == 0) {
            bl2 = bl;
            if (this.w) {
                bl2 = true;
            }
        }
        this.w = bl2;
        this.c.c(n8);
        n8 = this.p;
        if (n8 != 0) {
            n8 = this.B(n8 - 1);
            return this.k[n8] + (long)this.l[n8];
        }
        return 0L;
    }

    private int t(int n8, int n9, long l8, boolean bl) {
        for (int i8 = 0; i8 < n9; ++i8) {
            int n10;
            if (this.n[n8] >= l8) {
                return i8;
            }
            n8 = n10 = n8 + 1;
            if (n10 != this.i) continue;
            n8 = 0;
        }
        if (bl) {
            return n9;
        }
        return -1;
    }

    private int u(int n8, int n9, long l8, boolean bl) {
        long l9;
        int n10 = -1;
        int n11 = 0;
        int n12 = n8;
        for (n8 = n11; n8 < n9 && (l9 = this.n[n12]) <= l8; ++n8) {
            if (!bl || (this.m[n12] & 1) != 0) {
                if (l9 == l8) {
                    return n8;
                }
                n10 = n8;
            }
            n12 = n11 = n12 + 1;
            if (n11 != this.i) continue;
            n12 = 0;
        }
        return n10;
    }

    private long z(int n8) {
        long l8 = Long.MIN_VALUE;
        if (n8 == 0) {
            return Long.MIN_VALUE;
        }
        int n9 = this.B(n8 - 1);
        for (int i8 = 0; i8 < n8; ++i8) {
            int n10;
            l8 = Math.max(l8, this.n[n9]);
            if ((this.m[n9] & 1) != 0) {
                return l8;
            }
            n9 = n10 = n9 - 1;
            if (n10 != -1) continue;
            n9 = this.i - 1;
        }
        return l8;
    }

    public final int A() {
        return this.q + this.s;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int C(long l8, boolean bl) {
        synchronized (this) {
            RuntimeException var9_9;
            block12: {
                block9: {
                    int n8;
                    block11: {
                        int n9;
                        block10: {
                            try {
                                n9 = this.B(this.s);
                                if (!this.F() || l8 < this.n[n9]) break block9;
                                long l9 = this.v;
                                if (l8 <= l9 || !bl) break block10;
                            }
                            catch (Throwable throwable) {
                                break block12;
                            }
                            try {
                                int n10 = this.p;
                                n9 = this.s;
                                return n10 - n9;
                            }
                            catch (Throwable throwable) {
                                break block12;
                            }
                        }
                        int n11 = this.p;
                        n8 = this.s;
                        try {
                            n8 = this.u(n9, n11 - n8, l8, true);
                            if (n8 != -1) break block11;
                        }
                        catch (Throwable throwable) {}
                        return 0;
                    }
                    return n8;
                }
                return 0;
            }
            throw var9_9;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final v D() {
        synchronized (this) {
            if (!this.y) return this.B;
            return null;
        }
    }

    public final int E() {
        return this.q + this.p;
    }

    protected final void G() {
        this.z = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean H() {
        synchronized (this) {
            return this.w;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean I(boolean bl) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                try {
                    boolean bl2 = this.F();
                    boolean bl3 = true;
                    if (!bl2) {
                        bl2 = bl3;
                        if (bl) return bl2;
                        bl2 = bl3;
                        if (this.w) return bl2;
                        v v8 = this.B;
                        if (v8 == null) return false;
                        v v9 = this.g;
                        if (v8 == v9) return false;
                        return bl3;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    v v10 = this.c.e((int)this.A()).a;
                    v v11 = this.g;
                    if (v10 == v11) return this.J(this.B(this.s));
                }
                return true;
            }
            throw throwable2;
        }
    }

    public void K() throws IOException {
        n n8 = this.h;
        if (n8 != null && n8.getState() == 1) {
            throw ax.S0.a.e(this.h.g());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long N() {
        synchronized (this) {
            try {
                int n8 = this.B(this.s);
                if (!this.F()) return this.C;
                return this.j[n8];
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void O() {
        this.q();
        this.R();
    }

    public int P(O o8, i i8, int n8, boolean bl) {
        boolean bl2 = false;
        boolean bl3 = (n8 & 2) != 0;
        int n9 = this.M(o8, i8, bl3, bl, this.b);
        if (n9 == -4 && !i8.s()) {
            if ((n8 & 1) != 0) {
                bl2 = true;
            }
            if ((n8 & 4) == 0) {
                if (bl2) {
                    this.a.f(i8, this.b);
                } else {
                    this.a.m(i8, this.b);
                }
            }
            if (!bl2) {
                ++this.s;
            }
        }
        return n9;
    }

    public void Q() {
        this.T(true);
        this.R();
    }

    public final void S() {
        this.T(false);
    }

    public void T(boolean bl) {
        this.a.n();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        this.c.b();
        if (bl) {
            this.A = null;
            this.B = null;
            this.y = true;
            this.D = true;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean V(int n8) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    this.U();
                    int n9 = this.q;
                    if (n8 >= n9 && n8 <= this.p + n9) {
                        this.t = Long.MIN_VALUE;
                        this.s = n8 - n9;
                        return true;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean W(long var1_1, boolean var3_2) {
        synchronized (this) {
            block10: {
                block7: {
                    block9: {
                        block8: {
                            this.U();
                            var5_3 = this.B(this.s);
                            if (!this.F() || var1_1 < this.n[var5_3] || var1_1 > this.v && !var3_2) break block7;
                            if (!this.D) break block8;
                            var6_4 = this.p;
                            var4_5 = this.s;
                            {
                                catch (Throwable var7_8) {
                                    break block10;
                                }
                                ** try [egrp 1[TRYBLOCK] [2 : 70->117)] { 
lbl13:
                                // 1 sources

                                var4_5 = this.t(var5_3, var6_4 - var4_5, var1_1, var3_2);
                                break block9;
                            }
lbl15:
                            // 1 sources

                            catch (Throwable var7_6) {
                                break block10;
                            }
                        }
                        var4_5 = this.u(var5_3, this.p - this.s, var1_1, true);
                    }
                    if (var4_5 != -1) ** GOTO lbl-1000
                    return false;
lbl-1000:
                    // 1 sources

                    {
                        this.t = var1_1;
                        this.s += var4_5;
                        return true;
                    }
                }
                return false;
            }
            throw var7_7;
        }
    }

    public final void X(long l8) {
        if (this.F != l8) {
            this.F = l8;
            this.G();
        }
    }

    public final void Y(long l8) {
        this.t = l8;
    }

    @Override
    public /* synthetic */ int a(k k8, int n8, boolean bl) {
        return T.b(this, k8, n8, bl);
    }

    public final void a0(d d8) {
        this.f = d8;
    }

    @Override
    public final void b(G g8, int n8, int n9) {
        this.a.q(g8, n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b0(int n8) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                boolean bl;
                block5: {
                    block4: {
                        if (n8 >= 0) {
                            try {
                                if (this.s + n8 > this.p) break block4;
                                bl = true;
                                break block5;
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                    }
                    bl = false;
                }
                ax.S0.a.a(bl);
                this.s += n8;
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public final int c(k k8, int n8, boolean bl, int n9) throws IOException {
        return this.a.p(k8, n8, bl);
    }

    public final void c0(long l8) {
        this.C = l8;
    }

    @Override
    public /* synthetic */ void d(long l8) {
        T.a(this, l8);
    }

    public final void d0() {
        this.G = true;
    }

    @Override
    public final void e(v object) {
        v v8 = this.v((v)object);
        this.z = false;
        this.A = object;
        boolean bl = this.Z(v8);
        object = this.f;
        if (object != null && bl) {
            object.i(v8);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void f(long l8, int n8, int n9, int n10, U.a a8) {
        int n11;
        if (this.z) {
            this.e(ax.S0.a.i(this.A));
        }
        boolean bl = (n11 = n8 & 1) != 0;
        if (this.x) {
            if (!bl) return;
            this.x = false;
        }
        l8 = this.F + l8;
        if (this.D) {
            if (l8 < this.t) return;
            if (n11 == 0) {
                if (!this.E) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Overriding unexpected non-sync sample for format: ");
                    stringBuilder.append(this.B);
                    ax.S0.u.h("SampleQueue", stringBuilder.toString());
                    this.E = true;
                }
                n8 |= 1;
            }
        }
        if (this.G) {
            if (!bl || !this.i(l8)) return;
            this.G = false;
        }
        this.j(l8, n8, this.a.e() - (long)n9 - (long)n10, n9, a8);
    }

    @Override
    public /* synthetic */ void g(G g8, int n8) {
        T.c(this, g8, n8);
    }

    public final void p(long l8, boolean bl, boolean bl2) {
        this.a.b(this.m(l8, bl, bl2));
    }

    public final void q() {
        this.a.b(this.n());
    }

    public final void s(int n8) {
        this.a.c(this.r(n8));
    }

    protected v v(v v8) {
        v v9 = v8;
        if (this.F != 0L) {
            v9 = v8;
            if (v8.t != Long.MAX_VALUE) {
                v9 = v8.b().C0(v8.t + this.F).P();
            }
        }
        return v9;
    }

    public final int w() {
        return this.q;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long x() {
        synchronized (this) {
            return this.v;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long y() {
        synchronized (this) {
            return Math.max(this.u, this.z(this.s));
        }
    }

    static final class b {
        public int a;
        public long b;
        public U.a c;

        b() {
        }
    }

    private static final class c {
        public final v a;
        public final w.b b;

        private c(v v8, w.b b8) {
            this.a = v8;
            this.b = b8;
        }
    }

    public static interface d {
        public void i(v var1);
    }
}

