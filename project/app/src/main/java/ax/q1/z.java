/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.E1.h;
import ax.P0.C;
import ax.P0.E;
import ax.S0.F;
import ax.S0.G;
import ax.q1.B;
import ax.q1.H;
import ax.q1.X;
import ax.q1.s;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public final class z {
    public static boolean a(s s8) throws IOException {
        G g8 = new G(4);
        s8.p(g8.f(), 0, 4);
        return g8.O() == 1716281667L;
    }

    public static int b(s s8) throws IOException {
        s8.m();
        G g8 = new G(2);
        s8.p(g8.f(), 0, 2);
        int n8 = g8.U();
        if (n8 >> 2 == 16382) {
            s8.m();
            return n8;
        }
        s8.m();
        throw E.a("First frame does not start with sync code.", null);
    }

    public static C c(s object, boolean bl) throws IOException {
        h.a a8 = bl ? null : h.b;
        if ((object = new H().a((s)object, a8)) != null && ((C)object).e() != 0) {
            return object;
        }
        return null;
    }

    public static C d(s s8, boolean bl) throws IOException {
        s8.m();
        long l8 = s8.i();
        C c8 = z.c(s8, bl);
        s8.n((int)(s8.i() - l8));
        return c8;
    }

    public static boolean e(s s8, a a8) throws IOException {
        s8.m();
        Object object = new F(new byte[4]);
        s8.p(((F)object).a, 0, 4);
        boolean bl = ((F)object).g();
        int n8 = ((F)object).h(7);
        int n9 = ((F)object).h(24) + 4;
        if (n8 == 0) {
            a8.a = z.h(s8);
            return bl;
        }
        object = a8.a;
        if (object != null) {
            if (n8 == 3) {
                a8.a = ((B)object).b(z.g(s8, n9));
                return bl;
            }
            if (n8 == 4) {
                a8.a = ((B)object).c(z.j(s8, n9));
                return bl;
            }
            if (n8 == 6) {
                G g8 = new G(n9);
                s8.readFully(g8.f(), 0, n9);
                g8.c0(4);
                a8.a = ((B)object).a(ax.r7.z.A(ax.C1.a.d(g8)));
                return bl;
            }
            s8.n(n9);
            return bl;
        }
        throw new IllegalArgumentException();
    }

    public static B.a f(G g8) {
        long[] lArray;
        long[] lArray2;
        g8.c0(1);
        int n8 = g8.P();
        long l8 = g8.g();
        long l9 = n8;
        int n9 = n8 / 18;
        long[] lArray3 = new long[n9];
        long[] lArray4 = new long[n9];
        n8 = 0;
        while (true) {
            lArray2 = lArray3;
            lArray = lArray4;
            if (n8 >= n9) break;
            long l10 = g8.F();
            if (l10 == -1L) {
                lArray2 = Arrays.copyOf(lArray3, n8);
                lArray = Arrays.copyOf(lArray4, n8);
                break;
            }
            lArray3[n8] = l10;
            lArray4[n8] = g8.F();
            g8.c0(2);
            ++n8;
        }
        g8.c0((int)(l8 + l9 - (long)g8.g()));
        return new B.a(lArray2, lArray);
    }

    private static B.a g(s s8, int n8) throws IOException {
        G g8 = new G(n8);
        s8.readFully(g8.f(), 0, n8);
        return z.f(g8);
    }

    private static B h(s s8) throws IOException {
        byte[] byArray = new byte[38];
        s8.readFully(byArray, 0, 38);
        return new B(byArray, 4);
    }

    public static void i(s s8) throws IOException {
        G g8 = new G(4);
        s8.readFully(g8.f(), 0, 4);
        if (g8.O() == 1716281667L) {
            return;
        }
        throw E.a("Failed to read FLAC stream marker.", null);
    }

    private static List<String> j(s s8, int n8) throws IOException {
        G g8 = new G(n8);
        s8.readFully(g8.f(), 0, n8);
        g8.c0(4);
        return Arrays.asList(X.k((G)g8, (boolean)false, (boolean)false).b);
    }

    public static final class a {
        public B a;

        public a(B b8) {
            this.a = b8;
        }
    }
}

