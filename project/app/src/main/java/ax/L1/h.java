/*
 * Decompiled with CFR 0.152.
 */
package ax.L1;

import ax.L1.i;
import ax.P0.C;
import ax.P0.E;
import ax.P0.v;
import ax.S0.G;
import ax.S0.a;
import ax.q1.L;
import ax.q1.X;
import ax.r7.z;
import java.util.Arrays;
import java.util.List;

final class h
extends i {
    private static final byte[] o = new byte[]{79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] p = new byte[]{79, 112, 117, 115, 84, 97, 103, 115};
    private boolean n;

    h() {
    }

    private static boolean n(G g8, byte[] byArray) {
        if (g8.a() < byArray.length) {
            return false;
        }
        int n8 = g8.g();
        byte[] byArray2 = new byte[byArray.length];
        g8.q(byArray2, 0, byArray.length);
        g8.b0(n8);
        return Arrays.equals(byArray2, byArray);
    }

    public static boolean o(G g8) {
        return h.n(g8, o);
    }

    @Override
    protected long f(G g8) {
        return this.c(L.e(g8.f()));
    }

    @Override
    protected boolean h(G object, long l8, i.b b8) throws E {
        if (h.n((G)object, o)) {
            object = Arrays.copyOf(((G)object).f(), ((G)object).j());
            int n8 = L.c((byte[])object);
            object = L.a((byte[])object);
            if (b8.a != null) {
                return true;
            }
            b8.a = new v.b().W("audio/ogg").y0("audio/opus").T(n8).z0(48000).k0((List<byte[]>)object).P();
            return true;
        }
        byte[] byArray = p;
        if (h.n((G)object, byArray)) {
            a.i(b8.a);
            if (this.n) {
                return true;
            }
            this.n = true;
            ((G)object).c0(byArray.length);
            object = X.d(z.w(X.k(object, (boolean)false, (boolean)false).b));
            if (object == null) {
                return true;
            }
            b8.a = b8.a.b().r0(((C)object).b(b8.a.l)).P();
            return true;
        }
        a.i(b8.a);
        return false;
    }

    @Override
    protected void l(boolean bl) {
        super.l(bl);
        if (bl) {
            this.n = false;
        }
    }
}

