/*
 * Decompiled with CFR 0.152.
 */
package ax.L1;

import ax.L1.i;
import ax.P0.C;
import ax.P0.E;
import ax.P0.v;
import ax.S0.G;
import ax.q1.X;
import ax.r7.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

final class j
extends i {
    private a n;
    private int o;
    private boolean p;
    private X.c q;
    private X.a r;

    j() {
    }

    static void n(G g8, long l8) {
        if (g8.b() < g8.j() + 4) {
            g8.Y(Arrays.copyOf(g8.f(), g8.j() + 4));
        } else {
            g8.a0(g8.j() + 4);
        }
        byte[] byArray = g8.f();
        byArray[g8.j() - 4] = (byte)(l8 & 0xFFL);
        byArray[g8.j() - 3] = (byte)(l8 >>> 8 & 0xFFL);
        byArray[g8.j() - 2] = (byte)(l8 >>> 16 & 0xFFL);
        byArray[g8.j() - 1] = (byte)(l8 >>> 24 & 0xFFL);
    }

    private static int o(byte by, a a8) {
        int n8 = j.p(by, a8.e, 1);
        if (!a8.d[n8].a) {
            return a8.a.g;
        }
        return a8.a.h;
    }

    static int p(byte by, int n8, int n9) {
        return by >> n9 & 255 >>> 8 - n8;
    }

    public static boolean r(G g8) {
        try {
            boolean bl = X.o(1, g8, true);
            return bl;
        }
        catch (E e8) {
            return false;
        }
    }

    @Override
    protected void e(long l8) {
        super.e(l8);
        int n8 = 0;
        boolean bl = l8 != 0L;
        this.p = bl;
        X.c c8 = this.q;
        if (c8 != null) {
            n8 = c8.g;
        }
        this.o = n8;
    }

    @Override
    protected long f(G g8) {
        byte[] byArray = g8.f();
        int n8 = 0;
        if ((byArray[0] & 1) == 1) {
            return -1L;
        }
        int n9 = j.o(g8.f()[0], ax.S0.a.i(this.n));
        if (this.p) {
            n8 = (this.o + n9) / 4;
        }
        long l8 = n8;
        j.n(g8, l8);
        this.p = true;
        this.o = n9;
        return l8;
    }

    @Override
    protected boolean h(G object, long l8, i.b b8) throws IOException {
        if (this.n != null) {
            ax.S0.a.e(b8.a);
            return false;
        }
        Object object2 = this.q((G)object);
        this.n = object2;
        if (object2 == null) {
            return true;
        }
        object = ((a)object2).a;
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        arrayList.add(((X.c)object).j);
        arrayList.add(((a)object2).c);
        object2 = X.d(z.w(((a)object2).b.b));
        b8.a = new v.b().W("audio/ogg").y0("audio/vorbis").S(((X.c)object).e).t0(((X.c)object).d).T(((X.c)object).b).z0(((X.c)object).c).k0(arrayList).r0((C)object2).P();
        return true;
    }

    @Override
    protected void l(boolean bl) {
        super.l(bl);
        if (bl) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    a q(G bArray) throws IOException {
        X.c c8 = this.q;
        if (c8 == null) {
            this.q = X.l((G)bArray);
            return null;
        }
        X.a a8 = this.r;
        if (a8 == null) {
            this.r = X.j((G)bArray);
            return null;
        }
        byte[] byArray = new byte[bArray.j()];
        System.arraycopy(bArray.f(), 0, byArray, 0, bArray.j());
        bArray = X.m((G)bArray, c8.b);
        return new a(c8, a8, byArray, bArray, X.b(bArray.length - 1));
    }

    static final class a {
        public final X.c a;
        public final X.a b;
        public final byte[] c;
        public final X.b[] d;
        public final int e;

        public a(X.c c8, X.a a8, byte[] byArray, X.b[] bArray, int n8) {
            this.a = c8;
            this.b = a8;
            this.c = byArray;
            this.d = bArray;
            this.e = n8;
        }
    }
}

