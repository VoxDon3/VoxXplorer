/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.P0.E;
import ax.S0.G;
import ax.S0.d0;
import ax.q1.B;
import ax.q1.s;
import ax.q1.u;
import java.io.IOException;

public final class y {
    private static boolean a(G g8, B b8, int n8) {
        return (n8 = y.j(g8, n8)) != -1 && n8 <= b8.b;
    }

    private static boolean b(G g8, int n8) {
        int n9 = g8.M();
        int n10 = g8.g();
        return n9 == d0.y(g8.f(), n8, n10 - 1, 0);
    }

    private static boolean c(G g8, B b8, boolean bl, a a8) {
        long l8;
        block2: {
            try {
                l8 = g8.V();
                if (bl) break block2;
            }
            catch (NumberFormatException numberFormatException) {
                return false;
            }
            l8 *= (long)b8.b;
        }
        a8.a = l8;
        return true;
    }

    public static boolean d(G g8, B b8, int n8, a a8) {
        int n9 = g8.g();
        long l8 = g8.O();
        long l9 = l8 >>> 16;
        if (l9 != (long)n8) {
            return false;
        }
        boolean bl = (l9 & 1L) == 1L;
        int n10 = (int)(l8 >> 12 & 0xFL);
        int n11 = (int)(l8 >> 8 & 0xFL);
        int n12 = (int)(0xFL & l8 >> 4);
        int n13 = (int)(l8 >> 1 & 7L);
        n8 = (l8 & 1L) == 1L ? 1 : 0;
        return y.g(n12, b8) && y.f(n13, b8) && n8 == 0 && y.c(g8, b8, bl, a8) && y.a(g8, b8, n10) && y.e(g8, b8, n11) && y.b(g8, n9);
    }

    private static boolean e(G g8, B b8, int n8) {
        int n9 = b8.e;
        if (n8 == 0) {
            return true;
        }
        if (n8 <= 11) {
            return n8 == b8.f;
        }
        if (n8 == 12) {
            return g8.M() * 1000 == n9;
        }
        if (n8 <= 14) {
            int n10;
            int n11 = n10 = g8.U();
            if (n8 == 14) {
                n11 = n10 * 10;
            }
            if (n11 == n9) {
                return true;
            }
        }
        return false;
    }

    private static boolean f(int n8, B b8) {
        if (n8 == 0) {
            return true;
        }
        return n8 == b8.i;
    }

    private static boolean g(int n8, B b8) {
        if (n8 <= 7) {
            return n8 == b8.g - 1;
        }
        return n8 <= 10 && b8.g == 2;
    }

    public static boolean h(s s8, B b8, int n8, a a8) throws IOException {
        long l8 = s8.i();
        byte[] byArray = new byte[2];
        s8.p(byArray, 0, 2);
        if (((byArray[0] & 0xFF) << 8 | byArray[1] & 0xFF) != n8) {
            s8.m();
            s8.j((int)(l8 - s8.getPosition()));
            return false;
        }
        G g8 = new G(16);
        System.arraycopy(byArray, 0, g8.f(), 0, 2);
        g8.a0(u.d(s8, g8.f(), 2, 14));
        s8.m();
        s8.j((int)(l8 - s8.getPosition()));
        return y.d(g8, b8, n8, a8);
    }

    public static long i(s object, B b8) throws IOException {
        object.m();
        boolean bl = true;
        object.j(1);
        Object object2 = new byte[1];
        object.p((byte[])object2, 0, 1);
        if ((object2[0] & 1) != 1) {
            bl = false;
        }
        object.j(2);
        int n8 = bl ? 7 : 6;
        object2 = new G(n8);
        ((G)object2).a0(u.d((s)object, ((G)object2).f(), 0, n8));
        object.m();
        object = new a();
        if (y.c((G)object2, b8, bl, (a)object)) {
            return ((a)object).a;
        }
        throw E.a(null, null);
    }

    public static int j(G g8, int n8) {
        switch (n8) {
            default: {
                return -1;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: {
                return 256 << n8 - 8;
            }
            case 7: {
                return g8.U() + 1;
            }
            case 6: {
                return g8.M() + 1;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return 576 << n8 - 2;
            }
            case 1: 
        }
        return 192;
    }

    public static final class a {
        public long a;
    }
}

