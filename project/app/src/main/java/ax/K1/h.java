/*
 * Decompiled with CFR 0.152.
 */
package ax.K1;

import android.util.Pair;
import android.util.SparseArray;
import ax.K1.c;
import ax.K1.e;
import ax.K1.f;
import ax.K1.g;
import ax.K1.j;
import ax.K1.k;
import ax.K1.p;
import ax.K1.s;
import ax.K1.t;
import ax.K1.u;
import ax.K1.v;
import ax.K1.w;
import ax.N1.t;
import ax.P0.C;
import ax.P0.E;
import ax.P0.o;
import ax.P0.v;
import ax.S0.G;
import ax.S0.d0;
import ax.T0.e;
import ax.q1.F;
import ax.q1.M;
import ax.q1.N;
import ax.q1.S;
import ax.q1.U;
import ax.q1.i;
import ax.q1.q;
import ax.q1.r;
import ax.q1.x;
import ax.r7.z;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class h
implements r {
    @Deprecated
    public static final x P = new f();
    private static final byte[] Q = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final ax.P0.v R = new v.b().y0("application/x-emsg").P();
    private long A;
    private long B;
    private long C;
    private b D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private boolean I;
    private ax.q1.t J;
    private U[] K;
    private U[] L;
    private boolean M;
    private boolean N;
    private long O;
    private final t.a a;
    private final int b;
    private final t c;
    private final List<ax.P0.v> d;
    private final SparseArray<b> e;
    private final G f;
    private final G g;
    private final G h;
    private final byte[] i;
    private final G j;
    private final ax.S0.M k;
    private final ax.B1.c l;
    private final G m;
    private final ArrayDeque<e.b> n;
    private final ArrayDeque<a> o;
    private final ax.T0.k p;
    private final U q;
    private final i r;
    private z<S> s;
    private int t;
    private int u;
    private long v;
    private int w;
    private G x;
    private long y;
    private int z;

    public h(t.a a8, int n8) {
        this(a8, n8, null, null, ax.r7.z.z(), null);
    }

    public h(t.a object, int n8, ax.S0.M m8, t t8, List<ax.P0.v> list, U u8) {
        this.a = object;
        this.b = n8;
        this.k = m8;
        this.c = t8;
        this.d = java.util.DesugarCollections.unmodifiableList(list);
        this.q = u8;
        this.l = new ax.B1.c();
        this.m = new G(16);
        this.f = new G(ax.T0.h.a);
        this.g = new G(6);
        this.h = new G();
        object = new byte[16];
        this.i = (byte[])object;
        this.j = new G((byte[])object);
        this.n = new ArrayDeque();
        this.o = new ArrayDeque();
        this.e = new SparseArray();
        this.s = ax.r7.z.z();
        this.B = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.J = ax.q1.t.a0;
        this.K = new U[0];
        this.L = new U[0];
        this.p = new ax.T0.k(new g(this));
        this.r = new i();
        this.O = -1L;
    }

    private void A(long l8) {
        while (!this.o.isEmpty()) {
            long l9;
            a a8 = this.o.removeFirst();
            this.z -= a8.c;
            long l10 = l9 = a8.a;
            if (a8.b) {
                l10 = l9 + l8;
            }
            U[] uArray = this.k;
            l9 = l10;
            if (uArray != null) {
                l9 = uArray.a(l10);
            }
            uArray = this.K;
            int n8 = uArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                uArray[i8].f(l9, 1, a8.c, this.z, null);
            }
        }
    }

    private static long B(G g8) {
        g8.b0(8);
        if (ax.K1.b.q(g8.v()) == 0) {
            return g8.O();
        }
        return g8.T();
    }

    private static void C(e.b b8, SparseArray<b> sparseArray, boolean bl, int n8, byte[] byArray) throws E {
        int n9 = b8.d.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            e.b b9 = b8.d.get(i8);
            if (b9.a != 1953653094) continue;
            ax.K1.h.L(b9, sparseArray, bl, n8, byArray);
        }
    }

    private static void D(G object, v v8) throws E {
        int n8;
        ((G)object).b0(8);
        int n9 = ((G)object).v();
        if ((ax.K1.b.p(n9) & 1) == 1) {
            ((G)object).c0(8);
        }
        if ((n8 = ((G)object).Q()) == 1) {
            n9 = ax.K1.b.q(n9);
            long l8 = v8.d;
            long l9 = n9 == 0 ? ((G)object).O() : ((G)object).T();
            v8.d = l8 + l9;
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unexpected saio entry count: ");
        ((StringBuilder)object).append(n8);
        throw ax.P0.E.a(((StringBuilder)object).toString(), null);
    }

    private static void E(u object, G g8, v v8) throws E {
        int n8 = ((u)object).d;
        g8.b0(8);
        int n9 = ax.K1.b.p(g8.v());
        boolean bl = true;
        if ((n9 & 1) == 1) {
            g8.c0(8);
        }
        n9 = g8.M();
        int n10 = g8.Q();
        if (n10 <= v8.f) {
            int n11;
            if (n9 == 0) {
                object = v8.m;
                int n12 = 0;
                n9 = 0;
                while (true) {
                    n11 = n9;
                    if (n12 < n10) {
                        n11 = g8.M();
                        n9 += n11;
                        bl = n11 > n8;
                        object[n12] = bl;
                        ++n12;
                        continue;
                    }
                    break;
                }
            } else {
                if (n9 <= n8) {
                    bl = false;
                }
                n11 = n9 * n10;
                Arrays.fill(v8.m, 0, n10, bl);
            }
            Arrays.fill(v8.m, n10, v8.f, false);
            if (n11 > 0) {
                v8.d(n11);
            }
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Saiz sample count ");
        ((StringBuilder)object).append(n10);
        ((StringBuilder)object).append(" is greater than fragment sample count");
        ((StringBuilder)object).append(v8.f);
        throw ax.P0.E.a(((StringBuilder)object).toString(), null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void F(e.b object, String string, v v8) throws E {
        int n8;
        int n9;
        Object var12_3 = null;
        Object object2 = null;
        G g8 = null;
        for (n9 = 0; n9 < ((e.b)object).c.size(); ++n9) {
            G g9;
            Object object3 = ((e.b)object).c.get(n9);
            G g10 = ((e.c)object3).b;
            n8 = ((ax.T0.e)object3).a;
            if (n8 == 1935828848) {
                g10.b0(12);
                object3 = object2;
                g9 = g8;
                if (g10.v() == 1936025959) {
                    object3 = g10;
                    g9 = g8;
                }
            } else {
                object3 = object2;
                g9 = g8;
                if (n8 == 1936158820) {
                    g10.b0(12);
                    object3 = object2;
                    g9 = g8;
                    if (g10.v() == 1936025959) {
                        g9 = g10;
                        object3 = object2;
                    }
                }
            }
            object2 = object3;
            g8 = g9;
        }
        if (object2 == null) return;
        if (g8 == null) return;
        ((G)object2).b0(8);
        n9 = ax.K1.b.q(((G)object2).v());
        ((G)object2).c0(4);
        if (n9 == 1) {
            ((G)object2).c0(4);
        }
        if (((G)object2).v() != 1) throw ax.P0.E.d("Entry count in sbgp != 1 (unsupported).");
        g8.b0(8);
        n9 = ax.K1.b.q(g8.v());
        g8.c0(4);
        if (n9 == 1) {
            if (g8.O() == 0L) throw ax.P0.E.d("Variable length description in sgpd found (unsupported)");
        } else if (n9 >= 2) {
            g8.c0(4);
        }
        if (g8.O() != 1L) throw ax.P0.E.d("Entry count in sgpd != 1 (unsupported).");
        g8.c0(1);
        n9 = g8.M();
        if (g8.M() != 1) return;
        boolean bl = true;
        if (!bl) return;
        n8 = g8.M();
        object2 = new byte[16];
        g8.q((byte[])object2, 0, 16);
        object = var12_3;
        if (n8 == 0) {
            int n10 = g8.M();
            object = new byte[n10];
            g8.q((byte[])object, 0, n10);
        }
        v8.l = true;
        v8.n = new u(bl, string, n8, (byte[])object2, (n9 & 0xF0) >> 4, n9 & 0xF, (byte[])object);
    }

    private static void G(G object, int n8, v v8) throws E {
        ((G)object).b0(n8 + 8);
        n8 = ax.K1.b.p(((G)object).v());
        if ((n8 & 1) == 0) {
            boolean bl = (n8 & 2) != 0;
            n8 = ((G)object).Q();
            if (n8 == 0) {
                Arrays.fill(v8.m, 0, v8.f, false);
                return;
            }
            if (n8 == v8.f) {
                Arrays.fill(v8.m, 0, n8, bl);
                v8.d(((G)object).a());
                v8.a((G)object);
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Senc sample count ");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(" is different from fragment sample count");
            ((StringBuilder)object).append(v8.f);
            throw ax.P0.E.a(((StringBuilder)object).toString(), null);
        }
        throw ax.P0.E.d("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static void H(G g8, v v8) throws E {
        ax.K1.h.G(g8, 0, v8);
    }

    private static Pair<Long, ax.q1.h> I(G g8, long l8) throws E {
        long l9;
        long l10;
        g8.b0(8);
        int n8 = ax.K1.b.q(g8.v());
        g8.c0(4);
        long l11 = g8.O();
        if (n8 == 0) {
            l10 = g8.O();
            l9 = g8.O();
        } else {
            l10 = g8.T();
            l9 = g8.T();
        }
        long l12 = d0.p1(l10, 1000000L, l11);
        g8.c0(2);
        int n9 = g8.U();
        int[] nArray = new int[n9];
        long[] lArray = new long[n9];
        long[] lArray2 = new long[n9];
        long[] lArray3 = new long[n9];
        l8 += l9;
        l9 = l12;
        for (n8 = 0; n8 < n9; ++n8) {
            int n10 = g8.v();
            if ((Integer.MIN_VALUE & n10) == 0) {
                long l13 = g8.O();
                nArray[n8] = n10 & Integer.MAX_VALUE;
                lArray[n8] = l8;
                lArray3[n8] = l9;
                l9 = d0.p1(l10 += l13, 1000000L, l11);
                lArray2[n8] = l9 - lArray3[n8];
                g8.c0(4);
                l8 += (long)nArray[n8];
                continue;
            }
            throw ax.P0.E.a("Unhandled indirect reference", null);
        }
        return Pair.create((Object)l12, (Object)new ax.q1.h(nArray, lArray, lArray2, lArray3));
    }

    private static long J(G g8) {
        g8.b0(8);
        if (ax.K1.b.q(g8.v()) == 1) {
            return g8.T();
        }
        return g8.O();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static b K(G g8, SparseArray<b> object, boolean bl) {
        Object object2;
        b var1_3;
        Object var2_6;
        g8.b0(8);
        int n8 = ax.K1.b.p(g8.v());
        int n9 = g8.v();
        if (var2_6 != false) {
            Object object3 = object.valueAt(0);
        } else {
            Object object4 = object.get(n9);
        }
        b b8 = (b)var1_3;
        if (b8 == null) {
            return null;
        }
        if ((n8 & 1) != 0) {
            long l8 = g8.T();
            object2 = b8.b;
            ((v)object2).c = l8;
            ((v)object2).d = l8;
        }
        object2 = b8.e;
        n9 = (n8 & 2) != 0 ? g8.v() - 1 : ((c)object2).a;
        int n10 = (n8 & 8) != 0 ? g8.v() : ((c)object2).b;
        int n11 = (n8 & 0x10) != 0 ? g8.v() : ((c)object2).c;
        n8 = (n8 & 0x20) != 0 ? g8.v() : ((c)object2).d;
        b8.b.a = new c(n9, n10, n11, n8);
        return b8;
    }

    private static void L(e.b b8, SparseArray<b> object, boolean bl, int n8, byte[] byArray) throws E {
        if ((object = ax.K1.h.K(ax.S0.a.e(b8.e((int)1952868452)).b, object, bl)) != null) {
            v v8 = ((b)object).b;
            long l8 = v8.q;
            bl = v8.r;
            ((b)object).k();
            ax.K1.h$b.b((b)object, true);
            e.c c8 = b8.e(0x74666474);
            if (c8 != null && (n8 & 2) == 0) {
                v8.q = ax.K1.h.J(c8.b);
                v8.r = true;
            } else {
                v8.q = l8;
                v8.r = bl;
            }
            ax.K1.h.O(b8, (b)object, n8);
            object = ((b)object).d.a.b(ax.S0.a.e(v8.a).a);
            c8 = b8.e(1935763834);
            if (c8 != null) {
                ax.K1.h.E((u)ax.S0.a.e(object), c8.b, v8);
            }
            if ((c8 = b8.e(1935763823)) != null) {
                ax.K1.h.D(c8.b, v8);
            }
            if ((c8 = b8.e(1936027235)) != null) {
                ax.K1.h.H(c8.b, v8);
            }
            object = object != null ? ((u)object).b : null;
            ax.K1.h.F(b8, (String)object, v8);
            int n9 = b8.c.size();
            for (n8 = 0; n8 < n9; ++n8) {
                object = b8.c.get(n8);
                if (((ax.T0.e)object).a != 1970628964) continue;
                ax.K1.h.P(((e.c)object).b, v8, byArray);
            }
        }
    }

    private static Pair<Integer, c> M(G g8) {
        g8.b0(12);
        return Pair.create((Object)g8.v(), (Object)new c(g8.v() - 1, g8.v(), g8.v(), g8.v()));
    }

    private static int N(b b8, int n8, int n9, G g8, int n10) throws E {
        long l8;
        g8.b0(8);
        int n11 = ax.K1.b.p(g8.v());
        t t8 = b8.d.a;
        v v8 = b8.b;
        c c8 = d0.i(v8.a);
        v8.h[n8] = g8.Q();
        Object[] objectArray = v8.g;
        objectArray[n8] = l8 = v8.c;
        if ((n11 & 1) != 0) {
            objectArray[n8] = l8 + (long)g8.v();
        }
        boolean bl = (n11 & 4) != 0;
        int n12 = c8.d;
        if (bl) {
            n12 = g8.v();
        }
        boolean bl2 = (n11 & 0x100) != 0;
        boolean bl3 = (n11 & 0x200) != 0;
        boolean bl4 = (n11 & 0x400) != 0;
        n11 = (n11 & 0x800) != 0 ? 1 : 0;
        l8 = ax.K1.h.s(t8) ? d0.i(t8.j)[0] : 0L;
        int[] nArray = v8.i;
        long[] lArray = v8.j;
        objectArray = v8.k;
        n9 = t8.b == 2 && (n9 & 1) != 0 ? 1 : 0;
        int n13 = n10 + v8.h[n8];
        long l9 = t8.c;
        long l10 = v8.q;
        while (n10 < n13) {
            long l11;
            n8 = bl2 ? g8.v() : c8.b;
            int n14 = ax.K1.h.j(n8);
            n8 = bl3 ? g8.v() : c8.c;
            int n15 = ax.K1.h.j(n8);
            n8 = bl4 ? g8.v() : (n10 == 0 && bl ? n12 : c8.d);
            int n16 = n11 != 0 ? g8.v() : 0;
            lArray[n10] = l11 = d0.p1((long)n16 + l10 - l8, 1000000L, l9);
            if (!v8.r) {
                lArray[n10] = l11 + b8.d.h;
            }
            nArray[n10] = n15;
            int n17 = (n8 >> 16 & 1) == 0 && (n9 == 0 || n10 == 0) ? 1 : 0;
            objectArray[n10] = n17;
            l10 += (long)n14;
            ++n10;
        }
        v8.q = l10;
        return n13;
    }

    private static void O(e.b object, b b8, int n8) throws E {
        int n9;
        int n10;
        Object object2;
        int n11;
        object = ((e.b)object).c;
        int n12 = object.size();
        int n13 = 0;
        int n14 = 0;
        int n15 = 0;
        for (n11 = 0; n11 < n12; ++n11) {
            object2 = (e.c)object.get(n11);
            n10 = n14;
            n9 = n15;
            if (((ax.T0.e)object2).a == 1953658222) {
                object2 = ((e.c)object2).b;
                ((G)object2).b0(12);
                int n16 = ((G)object2).Q();
                n10 = n14;
                n9 = n15;
                if (n16 > 0) {
                    n9 = n15 + n16;
                    n10 = n14 + 1;
                }
            }
            n14 = n10;
            n15 = n9;
        }
        b8.h = 0;
        b8.g = 0;
        b8.f = 0;
        b8.b.e(n14, n15);
        n15 = 0;
        n9 = 0;
        for (n14 = n13; n14 < n12; ++n14) {
            object2 = (e.c)object.get(n14);
            n10 = n15;
            n11 = n9;
            if (((ax.T0.e)object2).a == 1953658222) {
                n11 = ax.K1.h.N(b8, n15, n8, ((e.c)object2).b, n9);
                n10 = n15 + 1;
            }
            n15 = n10;
            n9 = n11;
        }
    }

    private static void P(G g8, v v8, byte[] byArray) throws E {
        g8.b0(8);
        g8.q(byArray, 0, 16);
        if (!Arrays.equals(byArray, Q)) {
            return;
        }
        ax.K1.h.G(g8, 16, v8);
    }

    private void Q(long l8) throws E {
        while (!this.n.isEmpty() && this.n.peek().b == l8) {
            this.v(this.n.pop());
        }
        this.m();
    }

    private boolean R(ax.q1.s object) throws IOException {
        block21: {
            block27: {
                block23: {
                    block24: {
                        block25: {
                            block26: {
                                block22: {
                                    long l8;
                                    long l9;
                                    if (this.w == 0) {
                                        if (!object.e(this.m.f(), 0, 8, true)) {
                                            return false;
                                        }
                                        this.w = 8;
                                        this.m.b0(0);
                                        this.v = this.m.O();
                                        this.u = this.m.v();
                                    }
                                    if ((l9 = this.v) == 1L) {
                                        object.readFully(this.m.f(), 8, 8);
                                        this.w += 8;
                                        this.v = this.m.T();
                                    } else if (l9 == 0L) {
                                        l9 = l8 = object.getLength();
                                        if (l8 == -1L) {
                                            l9 = l8;
                                            if (!this.n.isEmpty()) {
                                                l9 = this.n.peek().b;
                                            }
                                        }
                                        if (l9 != -1L) {
                                            this.v = l9 - object.getPosition() + (long)this.w;
                                        }
                                    }
                                    l9 = this.v;
                                    int n8 = this.w;
                                    if (l9 < (long)n8) break block21;
                                    if (this.O != -1L) {
                                        if (this.u == 1936286840) {
                                            this.j.X((int)l9);
                                            System.arraycopy(this.m.f(), 0, this.j.f(), 0, 8);
                                            object.readFully(this.j.f(), 8, (int)(this.v - (long)this.w));
                                            object = ax.K1.h.I(new e.c((int)1936286840, (G)this.j).b, object.i());
                                            this.r.a((ax.q1.h)((Pair)object).second);
                                        } else {
                                            object.g((int)(l9 - (long)n8), true);
                                        }
                                        this.m();
                                        return true;
                                    }
                                    l9 = object.getPosition() - (long)this.w;
                                    n8 = this.u;
                                    if (!(n8 != 0x6D6F6F66 && n8 != 1835295092 || this.M)) {
                                        this.J.h(new N.b(this.B, l9));
                                        this.M = true;
                                    }
                                    if (this.u == 0x6D6F6F66) {
                                        int n9 = this.e.size();
                                        for (n8 = 0; n8 < n9; ++n8) {
                                            v v8 = ((b)this.e.valueAt((int)n8)).b;
                                            v8.b = l9;
                                            v8.d = l9;
                                            v8.c = l9;
                                        }
                                    }
                                    if ((n8 = this.u) == 1835295092) {
                                        this.D = null;
                                        this.y = l9 + this.v;
                                        this.t = 2;
                                        return true;
                                    }
                                    if (!ax.K1.h.V(n8)) break block22;
                                    l8 = object.getPosition();
                                    l9 = this.v;
                                    l8 = l8 + l9 - 8L;
                                    if (l9 != (long)this.w && this.u == 1835365473) {
                                        this.t((ax.q1.s)object);
                                    }
                                    this.n.push(new e.b(this.u, l8));
                                    if (this.v == (long)this.w) {
                                        this.Q(l8);
                                    } else {
                                        this.m();
                                    }
                                    break block23;
                                }
                                if (!ax.K1.h.W(this.u)) break block24;
                                if (this.w != 8) break block25;
                                if (this.v > Integer.MAX_VALUE) break block26;
                                object = new G((int)this.v);
                                System.arraycopy(this.m.f(), 0, ((G)object).f(), 0, 8);
                                this.x = object;
                                this.t = 1;
                                break block23;
                            }
                            throw ax.P0.E.d("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        throw ax.P0.E.d("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.v > Integer.MAX_VALUE) break block27;
                    this.x = null;
                    this.t = 1;
                }
                return true;
            }
            throw ax.P0.E.d("Skipping atom with length > 2147483647 (unsupported).");
        }
        throw ax.P0.E.d("Atom size less than header length (unsupported).");
    }

    private void S(ax.q1.s s8) throws IOException {
        int n8 = (int)(this.v - (long)this.w);
        G g8 = this.x;
        if (g8 != null) {
            s8.readFully(g8.f(), 8, n8);
            this.x(new e.c(this.u, g8), s8);
        } else {
            s8.n(n8);
        }
        this.Q(s8.getPosition());
    }

    private void T(ax.q1.s s8) throws IOException {
        int n8;
        int n9 = this.e.size();
        long l8 = Long.MAX_VALUE;
        b b8 = null;
        for (n8 = 0; n8 < n9; ++n8) {
            v v8 = ((b)this.e.valueAt((int)n8)).b;
            long l9 = l8;
            b b9 = b8;
            if (v8.p) {
                long l10 = v8.d;
                l9 = l8;
                b9 = b8;
                if (l10 < l8) {
                    b9 = (b)this.e.valueAt(n8);
                    l9 = l10;
                }
            }
            l8 = l9;
            b8 = b9;
        }
        if (b8 == null) {
            this.t = 3;
            return;
        }
        n8 = (int)(l8 - s8.getPosition());
        if (n8 >= 0) {
            s8.n(n8);
            b8.b.b(s8);
            return;
        }
        throw ax.P0.E.a("Offset to encryption data was negative.", null);
    }

    private boolean U(ax.q1.s object) throws IOException {
        int n8;
        int n9;
        Object object2 = this.D;
        b b8 = object2;
        if (object2 == null) {
            b8 = ax.K1.h.p(this.e);
            if (b8 == null) {
                int n10 = (int)(this.y - object.getPosition());
                if (n10 >= 0) {
                    object.n(n10);
                    this.m();
                    return false;
                }
                throw ax.P0.E.a("Offset to end of mdat was negative.", null);
            }
            n8 = n9 = (int)(b8.d() - object.getPosition());
            if (n9 < 0) {
                ax.S0.u.h("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                n8 = 0;
            }
            object.n(n8);
            this.D = b8;
        }
        if (this.t == 3) {
            this.E = b8.f();
            this.H = this.i(b8.d.a.g) ^ true;
            if (b8.f < b8.i) {
                object.n(this.E);
                b8.m();
                if (!b8.h()) {
                    this.D = null;
                }
                this.t = 3;
                return true;
            }
            if (b8.d.a.h == 1) {
                this.E -= 8;
                object.n(8);
            }
            if ("audio/ac4".equals(b8.d.a.g.o)) {
                this.F = b8.i(this.E, 7);
                ax.q1.c.b(this.E, this.j);
                b8.a.g(this.j, 7);
                this.F += 7;
            } else {
                this.F = b8.i(this.E, 0);
            }
            this.E += this.F;
            this.t = 4;
            this.G = 0;
        }
        t t8 = b8.d.a;
        object2 = b8.a;
        long l8 = b8.e();
        Object object3 = this.k;
        long l9 = l8;
        if (object3 != null) {
            l9 = ((ax.S0.M)object3).a(l8);
        }
        if (t8.k != 0) {
            object3 = this.g.f();
            object3[0] = false;
            object3[1] = false;
            object3[2] = false;
            int n11 = 4 - t8.k;
            while (this.F < this.E) {
                n8 = this.G;
                if (n8 == 0) {
                    if (this.L.length <= 0 && this.H || t8.k + (n8 = ax.T0.h.o(t8.g)) > this.E - this.F) {
                        n8 = 0;
                    }
                    object.readFully((byte[])object3, n11, t8.k + n8);
                    this.g.b0(0);
                    n9 = this.g.v();
                    if (n9 >= 0) {
                        this.G = n9 - n8;
                        this.f.b0(0);
                        object2.g(this.f, 4);
                        this.F += 4;
                        this.E += n11;
                        boolean bl = this.L.length > 0 && n8 > 0 && ax.T0.h.n(t8.g, (byte)object3[4]);
                        this.I = bl;
                        object2.g(this.g, n8);
                        this.F += n8;
                        if (n8 <= 0 || this.H || !ax.T0.h.k((byte[])object3, 4, n8, t8.g)) continue;
                        this.H = true;
                        continue;
                    }
                    throw ax.P0.E.a("Invalid NAL length", null);
                }
                if (this.I) {
                    this.h.X(n8);
                    object.readFully(this.h.f(), 0, this.G);
                    object2.g(this.h, this.G);
                    n9 = this.G;
                    n8 = ax.T0.h.L(this.h.f(), this.h.j());
                    this.h.b0(0);
                    this.h.a0(n8);
                    if (t8.g.q == -1) {
                        if (this.p.f() != 0) {
                            this.p.g(0);
                        }
                    } else {
                        int n12 = this.p.f();
                        if (n12 != (n8 = t8.g.q)) {
                            this.p.g(n8);
                        }
                    }
                    this.p.a(l9, this.h);
                    n8 = n9;
                    if ((b8.c() & 4) != 0) {
                        this.p.d();
                        n8 = n9;
                    }
                } else {
                    n8 = object2.a((ax.P0.k)object, n8, false);
                }
                this.F += n8;
                this.G -= n8;
            }
        } else {
            while ((n8 = this.F) < (n9 = this.E)) {
                n8 = object2.a((ax.P0.k)object, n9 - n8, false);
                this.F += n8;
            }
        }
        n8 = n9 = b8.c();
        if (!this.H) {
            n8 = n9 | 0x4000000;
        }
        object = (object = b8.g()) != null ? ((u)object).c : null;
        object2.f(l9, n8, this.E, 0, (U.a)object);
        this.A(l9);
        if (!b8.h()) {
            this.D = null;
        }
        this.t = 3;
        return true;
    }

    private static boolean V(int n8) {
        return n8 == 1836019574 || n8 == 1953653099 || n8 == 1835297121 || n8 == 1835626086 || n8 == 1937007212 || n8 == 0x6D6F6F66 || n8 == 1953653094 || n8 == 1836475768 || n8 == 1701082227 || n8 == 1835365473;
        {
        }
    }

    private static boolean W(int n8) {
        return n8 == 1751411826 || n8 == 1835296868 || n8 == 1836476516 || n8 == 1936286840 || n8 == 1937011556 || n8 == 0x73747473 || n8 == 1668576371 || n8 == 1937011555 || n8 == 1937011578 || n8 == 1937013298 || n8 == 1937007471 || n8 == 1668232756 || n8 == 0x73747373 || n8 == 0x74666474 || n8 == 1952868452 || n8 == 1953196132 || n8 == 1953654136 || n8 == 1953658222 || n8 == 1886614376 || n8 == 1935763834 || n8 == 1935763823 || n8 == 1936027235 || n8 == 1970628964 || n8 == 1935828848 || n8 == 1936158820 || n8 == 1701606260 || n8 == 1835362404 || n8 == 1701671783 || n8 == 1969517665 || n8 == 1801812339 || n8 == 1768715124;
        {
        }
    }

    public static /* synthetic */ r[] g() {
        return new r[]{new h(t.a.a, 32)};
    }

    public static /* synthetic */ void h(h h8, long l8, G g8) {
        ax.q1.g.a(l8, g8, h8.L);
    }

    private boolean i(ax.P0.v v8) {
        if (j.Objects.equals((Object)v8.o, (Object)"video/avc")) {
            return (this.b & 0x40) != 0;
        }
        return j.Objects.equals((Object)v8.o, (Object)"video/hevc") && (this.b & 0x80) != 0;
    }

    private static int j(int n8) throws E {
        if (n8 >= 0) {
            return n8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected negative value: ");
        stringBuilder.append(n8);
        throw ax.P0.E.a(stringBuilder.toString(), null);
    }

    public static int l(int n8) {
        int n9 = (n8 & 1) != 0 ? 64 : 0;
        if ((n8 & 2) != 0) {
            return n9 | 0x80;
        }
        return n9;
    }

    private void m() {
        this.t = 0;
        this.w = 0;
    }

    private c n(SparseArray<c> sparseArray, int n8) {
        if (sparseArray.size() == 1) {
            return (c)sparseArray.valueAt(0);
        }
        return ax.S0.a.e((c)sparseArray.get(n8));
    }

    private static o o(List<e.c> list) {
        int n8 = list.size();
        Object object = null;
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object2 = list.get(i8);
            ArrayList<o.b> arrayList = object;
            if (((ax.T0.e)object2).a == 1886614376) {
                arrayList = object;
                if (object == null) {
                    arrayList = new ArrayList<o.b>();
                }
                if ((object2 = ax.K1.p.f((byte[])(object = (Object)((e.c)object2).b.f()))) == null) {
                    ax.S0.u.h("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new o.b((UUID)object2, "video/mp4", (byte[])object));
                }
            }
            object = arrayList;
        }
        if (object == null) {
            return null;
        }
        return new o((List<o.b>)object);
    }

    private static b p(SparseArray<b> sparseArray) {
        int n8 = sparseArray.size();
        b b8 = null;
        long l8 = Long.MAX_VALUE;
        for (int i8 = 0; i8 < n8; ++i8) {
            long l9;
            b b9;
            block8: {
                b b10;
                block7: {
                    b10 = (b)sparseArray.valueAt(i8);
                    if (b10.m) break block7;
                    b9 = b8;
                    l9 = l8;
                    if (b10.f == b10.d.b) break block8;
                }
                if (b10.m && b10.h == b10.b.e) {
                    b9 = b8;
                    l9 = l8;
                } else {
                    long l10 = b10.d();
                    b9 = b8;
                    l9 = l8;
                    if (l10 < l8) {
                        b9 = b10;
                        l9 = l10;
                    }
                }
            }
            b8 = b9;
            l8 = l9;
        }
        return b8;
    }

    private void r() {
        int n8;
        U[] uArray = new U[2];
        this.K = uArray;
        Object object = this.q;
        int n9 = 0;
        if (object != null) {
            uArray[0] = object;
            n8 = 1;
        } else {
            n8 = 0;
        }
        int n10 = this.b;
        int n11 = 100;
        int n12 = n8;
        if ((n10 & 4) != 0) {
            uArray[n8] = this.J.u(100, 5);
            n11 = 101;
            n12 = n8 + 1;
        }
        object = d0.g1(this.K, n12);
        this.K = object;
        n12 = ((U[])object).length;
        for (n8 = 0; n8 < n12; ++n8) {
            object[n8].e(R);
        }
        this.L = new U[this.d.size()];
        n8 = n9;
        while (n8 < this.L.length) {
            object = this.J.u(n11, 3);
            object.e(this.d.get(n8));
            this.L[n8] = object;
            ++n8;
            ++n11;
        }
    }

    private static boolean s(t t8) {
        long[] lArray = t8.i;
        if (lArray != null && lArray.length == 1 && t8.j != null) {
            long l8 = lArray[0];
            if (l8 == 0L) {
                return true;
            }
            if (d0.p1(l8, 1000000L, t8.d) + d0.p1(t8.j[0], 1000000L, t8.c) >= t8.e) {
                return true;
            }
        }
        return false;
    }

    private void t(ax.q1.s s8) throws IOException {
        this.j.X(8);
        s8.p(this.j.f(), 0, 8);
        ax.K1.b.g(this.j);
        s8.n(this.j.g());
        s8.m();
    }

    private void v(e.b b8) throws E {
        int n8 = b8.a;
        if (n8 == 1836019574) {
            this.z(b8);
            return;
        }
        if (n8 == 0x6D6F6F66) {
            this.y(b8);
            return;
        }
        if (!this.n.isEmpty()) {
            this.n.peek().b(b8);
        }
    }

    /*
     * WARNING - void declaration
     */
    private void w(G object) {
        if (this.K.length != 0) {
            String var15_7;
            long l8;
            U[] uArray;
            long l9;
            long l10;
            long l11;
            ((G)object).b0(8);
            int n8 = ax.K1.b.q(((G)object).v());
            if (n8 != 0) {
                if (n8 != 1) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Skipping unsupported emsg version: ");
                    ((StringBuilder)object).append(n8);
                    ax.S0.u.h("FragmentedMp4Extractor", ((StringBuilder)object).toString());
                    return;
                }
                l11 = ((G)object).O();
                l10 = d0.p1(((G)object).T(), 1000000L, l11);
                l9 = d0.p1(((G)object).O(), 1000L, l11);
                l11 = ((G)object).O();
                String object22 = ax.S0.a.e(((G)object).G());
                uArray = ax.S0.a.e(((G)object).G());
                l8 = -9223372036854775807L;
            } else {
                String string = ax.S0.a.e(((G)object).G());
                uArray = ax.S0.a.e(((G)object).G());
                l11 = ((G)object).O();
                l8 = d0.p1(((G)object).O(), 1000000L, l11);
                l10 = this.C;
                l10 = l10 != -9223372036854775807L ? (l10 += l8) : -9223372036854775807L;
                l9 = d0.p1(((G)object).O(), 1000L, l11);
                l11 = ((G)object).O();
            }
            byte[] byArray = new byte[((G)object).a()];
            n8 = ((G)object).a();
            int n9 = 0;
            ((G)object).q(byArray, 0, n8);
            object = new ax.B1.a((String)var15_7, (String)uArray, l9, l11, byArray);
            object = new G(this.l.a((ax.B1.a)object));
            int n10 = ((G)object).a();
            for (U u8 : this.K) {
                ((G)object).b0(0);
                u8.g((G)object, n10);
            }
            if (l10 == -9223372036854775807L) {
                this.o.addLast(new a(l8, true, n10));
                this.z += n10;
                return;
            }
            if (!this.o.isEmpty()) {
                this.o.addLast(new a(l10, false, n10));
                this.z += n10;
                return;
            }
            object = this.k;
            if (object != null && !((ax.S0.M)object).g()) {
                this.o.addLast(new a(l10, false, n10));
                this.z += n10;
                return;
            }
            object = this.k;
            l11 = l10;
            if (object != null) {
                l11 = ((ax.S0.M)object).a(l10);
            }
            object = this.K;
            int n11 = ((Object)object).length;
            for (n8 = n9; n8 < n11; ++n8) {
                object[n8].f(l11, 1, n10, 0, null);
            }
        }
    }

    private void x(e.c pair, ax.q1.s s8) throws IOException {
        if (!this.n.isEmpty()) {
            this.n.peek().c((e.c)pair);
            return;
        }
        int n8 = pair.a;
        if (n8 == 1936286840) {
            pair = ax.K1.h.I(pair.b, s8.getPosition());
            this.r.a((ax.q1.h)pair.second);
            if (!this.M) {
                this.C = (Long)pair.first;
                this.J.h((N)pair.second);
                this.M = true;
                return;
            }
            if ((this.b & 0x100) != 0 && !this.N && this.r.c() > 1) {
                this.O = s8.getPosition();
                return;
            }
        } else if (n8 == 1701671783) {
            this.w(pair.b);
        }
    }

    private void y(e.b object) throws E {
        int n8;
        int n9;
        SparseArray<b> sparseArray = this.e;
        t t8 = this.c;
        int n10 = 0;
        boolean bl = t8 != null;
        ax.K1.h.C((e.b)object, sparseArray, bl, this.b, this.i);
        object = ax.K1.h.o(((e.b)object).c);
        if (object != null) {
            n9 = this.e.size();
            for (n8 = 0; n8 < n9; ++n8) {
                ((b)this.e.valueAt(n8)).n((o)object);
            }
        }
        if (this.A != -9223372036854775807L) {
            n9 = this.e.size();
            for (n8 = n10; n8 < n9; ++n8) {
                ((b)this.e.valueAt(n8)).l(this.A);
            }
            this.A = -9223372036854775807L;
        }
    }

    private void z(e.b object) throws E {
        Object object2;
        int n8;
        boolean bl = this.c == null;
        ax.S0.a.h(bl, "Unexpected moov box.");
        Object object3 = ax.K1.h.o(((e.b)object).c);
        Object object4 = ax.S0.a.e(((e.b)object).d(1836475768));
        SparseArray sparseArray = new SparseArray();
        int n9 = ((e.b)object4).c.size();
        long l8 = -9223372036854775807L;
        for (n8 = 0; n8 < n9; ++n8) {
            object2 = ((e.b)object4).c.get(n8);
            int n10 = object2.a;
            if (n10 == 1953654136) {
                object2 = ax.K1.h.M(object2.b);
                sparseArray.put(((Integer)object2.first).intValue(), (Object)((c)object2.second));
                continue;
            }
            if (n10 != 1835362404) continue;
            l8 = ax.K1.h.B(object2.b);
        }
        object4 = ((e.b)object).d(1835365473);
        object2 = null;
        object4 = object4 != null ? ax.K1.b.u((e.b)object4) : null;
        Object object5 = new F();
        Object object6 = ((e.b)object).e(1969517665);
        if (object6 != null) {
            object2 = ax.K1.b.I((e.c)object6);
            ((F)object5).c((C)object2);
        }
        object6 = new C(ax.K1.b.w(ax.S0.a.e(((e.b)object).e((int)1836476516)).b));
        bl = (this.b & 0x10) != 0;
        object3 = ax.K1.b.H((e.b)object, (F)object5, l8, (o)object3, bl, false, new e(this));
        n9 = object3.size();
        if (this.e.size() == 0) {
            String string = ax.K1.k.b((List<w>)object3);
            object = object5;
            for (n8 = 0; n8 < n9; ++n8) {
                w w8 = (w)object3.get(n8);
                object5 = w8.a;
                U u8 = this.J.u(n8, ((t)object5).b);
                u8.d(((t)object5).e);
                Object object7 = ((t)object5).g.b();
                ((v.b)object7).W(string);
                ax.K1.j.l(((t)object5).b, (F)object, (v.b)object7);
                ax.K1.j.m(((t)object5).b, (C)object4, (v.b)object7, ((t)object5).g.l, new C[]{object2, object6});
                object7 = new b(u8, w8, this.n((SparseArray<c>)sparseArray, ((t)object5).a), ((v.b)object7).P());
                this.e.put(((t)object5).a, object7);
                this.B = Math.max(this.B, ((t)object5).e);
            }
            this.J.o();
            return;
        }
        bl = this.e.size() == n9;
        ax.S0.a.g(bl);
        for (n8 = 0; n8 < n9; ++n8) {
            object4 = (w)object3.get(n8);
            object = ((w)object4).a;
            ((b)this.e.get(((t)object).a)).j((w)object4, this.n((SparseArray<c>)sparseArray, ((t)object).a));
        }
    }

    @Override
    public void a(ax.q1.t object) {
        ax.q1.t t8 = object;
        if ((this.b & 0x20) == 0) {
            t8 = new ax.N1.u((ax.q1.t)object, this.a);
        }
        this.J = t8;
        this.m();
        this.r();
        object = this.c;
        if (object != null) {
            object = ((t)object).g.b();
            ((v.b)object).W(ax.K1.k.a(this.c.g));
            object = new b(this.J.u(0, this.c.b), new w(this.c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0), ((v.b)object).P());
            this.e.put(0, object);
            this.J.o();
        }
    }

    @Override
    public void b(long l8, long l9) {
        int n8 = this.e.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            ((b)this.e.valueAt(i8)).k();
        }
        this.o.clear();
        this.z = 0;
        this.p.b();
        this.A = l9;
        this.n.clear();
        this.m();
    }

    @Override
    public boolean c(ax.q1.s z8) throws IOException {
        S s8 = ax.K1.s.b((ax.q1.s)((Object)z8));
        z8 = s8 != null ? ax.r7.z.A(s8) : ax.r7.z.z();
        this.s = z8;
        return s8 == null;
    }

    @Override
    public void d() {
    }

    @Override
    public /* synthetic */ r e() {
        return ax.q1.q.b(this);
    }

    @Override
    public int f(ax.q1.s s8, M m8) throws IOException {
        while (true) {
            int n8;
            if ((n8 = this.t) != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (!this.U(s8)) continue;
                        return 0;
                    }
                    this.T(s8);
                    continue;
                }
                this.S(s8);
                continue;
            }
            if (!this.R(s8)) break;
        }
        long l8 = this.O;
        if (l8 != -1L) {
            m8.a = l8;
            this.O = -1L;
            this.J.h(this.r.b());
            this.N = true;
            return 1;
        }
        this.p.d();
        return -1;
    }

    public z<S> q() {
        return this.s;
    }

    protected t u(t t8) {
        return t8;
    }

    private static final class a {
        public final long a;
        public final boolean b;
        public final int c;

        public a(long l8, boolean bl, int n8) {
            this.a = l8;
            this.b = bl;
            this.c = n8;
        }
    }

    private static final class b {
        public final U a;
        public final v b;
        public final G c;
        public w d;
        public c e;
        public int f;
        public int g;
        public int h;
        public int i;
        private final ax.P0.v j;
        private final G k;
        private final G l;
        private boolean m;

        public b(U u8, w w8, c c8, ax.P0.v v8) {
            this.a = u8;
            this.d = w8;
            this.e = c8;
            this.j = v8;
            this.b = new v();
            this.c = new G();
            this.k = new G(1);
            this.l = new G();
            this.j(w8, c8);
        }

        static /* synthetic */ boolean b(b b8, boolean bl) {
            b8.m = bl;
            return bl;
        }

        public int c() {
            int n8 = !this.m ? this.d.g[this.f] : (this.b.k[this.f] ? 1 : 0);
            int n9 = n8;
            if (this.g() != null) {
                n9 = n8 | 0x40000000;
            }
            return n9;
        }

        public long d() {
            if (!this.m) {
                return this.d.c[this.f];
            }
            return this.b.g[this.h];
        }

        public long e() {
            if (!this.m) {
                return this.d.f[this.f];
            }
            return this.b.c(this.f);
        }

        public int f() {
            if (!this.m) {
                return this.d.d[this.f];
            }
            return this.b.i[this.f];
        }

        public u g() {
            if (!this.m) {
                return null;
            }
            int n8 = d0.i(this.b.a).a;
            u u8 = this.b.n;
            if (u8 == null) {
                u8 = this.d.a.b(n8);
            }
            if (u8 != null && u8.a) {
                return u8;
            }
            return null;
        }

        public boolean h() {
            int n8;
            ++this.f;
            if (!this.m) {
                return false;
            }
            this.g = n8 = this.g + 1;
            int[] nArray = this.b.h;
            int n9 = this.h;
            if (n8 == nArray[n9]) {
                this.h = n9 + 1;
                this.g = 0;
                return false;
            }
            return true;
        }

        public int i(int n8, int n9) {
            Object object;
            Object object2 = this.g();
            if (object2 == null) {
                return 0;
            }
            int n10 = ((u)object2).d;
            if (n10 != 0) {
                object2 = this.b.o;
            } else {
                object = d0.i(((u)object2).e);
                this.l.Z((byte[])object, ((byte[])object).length);
                object2 = this.l;
                n10 = ((byte[])object).length;
            }
            boolean bl = this.b.g(this.f);
            boolean bl2 = bl || n9 != 0;
            object = this.k.f();
            int n11 = bl2 ? 128 : 0;
            object[0] = (byte)(n11 | n10);
            this.k.b0(0);
            this.a.b(this.k, 1, 1);
            this.a.b((G)object2, n10, 1);
            if (!bl2) {
                return n10 + 1;
            }
            if (!bl) {
                this.c.X(8);
                object2 = this.c.f();
                object2[0] = false;
                object2[1] = true;
                object2[2] = (byte)(n9 >> 8 & 0xFF);
                object2[3] = (byte)(n9 & 0xFF);
                object2[4] = (byte)(n8 >> 24 & 0xFF);
                object2[5] = (byte)(n8 >> 16 & 0xFF);
                object2[6] = (byte)(n8 >> 8 & 0xFF);
                object2[7] = (byte)(n8 & 0xFF);
                this.a.b(this.c, 8, 1);
                return n10 + 9;
            }
            object = this.b.o;
            n8 = ((G)object).U();
            ((G)object).c0(-2);
            n8 = n8 * 6 + 2;
            object2 = object;
            if (n9 != 0) {
                this.c.X(n8);
                object2 = this.c.f();
                ((G)object).q((byte[])object2, 0, n8);
                n9 = ((object2[2] & 0xFF) << 8 | object2[3] & 0xFF) + n9;
                object2[2] = (byte)(n9 >> 8 & 0xFF);
                object2[3] = (byte)(n9 & 0xFF);
                object2 = this.c;
            }
            this.a.b((G)object2, n8, 1);
            return n10 + 1 + n8;
        }

        public void j(w w8, c c8) {
            this.d = w8;
            this.e = c8;
            this.a.e(this.j);
            this.k();
        }

        public void k() {
            this.b.f();
            this.f = 0;
            this.h = 0;
            this.g = 0;
            this.i = 0;
            this.m = false;
        }

        public void l(long l8) {
            int n8 = this.f;
            while (true) {
                v v8 = this.b;
                if (n8 >= v8.f || v8.c(n8) > l8) break;
                if (this.b.k[n8]) {
                    this.i = n8;
                }
                ++n8;
            }
        }

        public void m() {
            u u8 = this.g();
            if (u8 != null) {
                G g8 = this.b.o;
                int n8 = u8.d;
                if (n8 != 0) {
                    g8.c0(n8);
                }
                if (this.b.g(this.f)) {
                    g8.c0(g8.U() * 6);
                }
            }
        }

        public void n(o object) {
            Object object2 = this.d.a.b(d0.i(this.b.a).a);
            object2 = object2 != null ? ((u)object2).b : null;
            object = ((o)object).c((String)object2);
            object = this.j.b().c0((o)object).P();
            this.a.e((ax.P0.v)object);
        }
    }
}

