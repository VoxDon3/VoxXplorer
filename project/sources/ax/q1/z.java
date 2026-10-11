package ax.q1;

import ax.q1.B;
import ax.r7.AbstractC2991z;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class z {

    public static final class a {
        public B a;

        public a(B b) {
            this.a = b;
        }
    }

    public static boolean a(InterfaceC2858s interfaceC2858s) throws IOException {
        ax.S0.G g = new ax.S0.G(4);
        interfaceC2858s.p(g.f(), 0, 4);
        return g.O() == 1716281667;
    }

    public static int b(InterfaceC2858s interfaceC2858s) throws IOException {
        interfaceC2858s.m();
        ax.S0.G g = new ax.S0.G(2);
        interfaceC2858s.p(g.f(), 0, 2);
        int U = g.U();
        if ((U >> 2) == 16382) {
            interfaceC2858s.m();
            return U;
        }
        interfaceC2858s.m();
        throw ax.P0.E.a("First frame does not start with sync code.", null);
    }

    public static ax.P0.C c(InterfaceC2858s interfaceC2858s, boolean z) throws IOException {
        ax.P0.C a2 = new H().a(interfaceC2858s, z ? null : ax.E1.h.b);
        if (a2 == null || a2.e() == 0) {
            return null;
        }
        return a2;
    }

    public static ax.P0.C d(InterfaceC2858s interfaceC2858s, boolean z) throws IOException {
        interfaceC2858s.m();
        long i = interfaceC2858s.i();
        ax.P0.C c = c(interfaceC2858s, z);
        interfaceC2858s.n((int) (interfaceC2858s.i() - i));
        return c;
    }

    public static boolean e(InterfaceC2858s interfaceC2858s, a aVar) throws IOException {
        interfaceC2858s.m();
        ax.S0.F f = new ax.S0.F(new byte[4]);
        interfaceC2858s.p(f.a, 0, 4);
        boolean g = f.g();
        int h = f.h(7);
        int h2 = f.h(24) + 4;
        if (h == 0) {
            aVar.a = h(interfaceC2858s);
            return g;
        }
        B b = aVar.a;
        if (b == null) {
            throw new IllegalArgumentException();
        }
        if (h == 3) {
            aVar.a = b.b(g(interfaceC2858s, h2));
            return g;
        }
        if (h == 4) {
            aVar.a = b.c(j(interfaceC2858s, h2));
            return g;
        }
        if (h != 6) {
            interfaceC2858s.n(h2);
            return g;
        }
        ax.S0.G g2 = new ax.S0.G(h2);
        interfaceC2858s.readFully(g2.f(), 0, h2);
        g2.c0(4);
        aVar.a = b.a(AbstractC2991z.A(ax.C1.a.d(g2)));
        return g;
    }

    public static B.a f(ax.S0.G g) {
        g.c0(1);
        int P = g.P();
        long g2 = g.g() + P;
        int i = P / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long F = g.F();
            if (F == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = F;
            jArr2[i2] = g.F();
            g.c0(2);
            i2++;
        }
        g.c0((int) (g2 - g.g()));
        return new B.a(jArr, jArr2);
    }

    private static B.a g(InterfaceC2858s interfaceC2858s, int i) throws IOException {
        ax.S0.G g = new ax.S0.G(i);
        interfaceC2858s.readFully(g.f(), 0, i);
        return f(g);
    }

    private static B h(InterfaceC2858s interfaceC2858s) throws IOException {
        byte[] bArr = new byte[38];
        interfaceC2858s.readFully(bArr, 0, 38);
        return new B(bArr, 4);
    }

    public static void i(InterfaceC2858s interfaceC2858s) throws IOException {
        ax.S0.G g = new ax.S0.G(4);
        interfaceC2858s.readFully(g.f(), 0, 4);
        if (g.O() != 1716281667) {
            throw ax.P0.E.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List<String> j(InterfaceC2858s interfaceC2858s, int i) throws IOException {
        ax.S0.G g = new ax.S0.G(i);
        interfaceC2858s.readFully(g.f(), 0, i);
        g.c0(4);
        return Arrays.asList(X.k(g, false, false).b);
    }
}
