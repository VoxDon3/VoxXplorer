package ax.q1;

import ax.S0.d0;
import java.io.IOException;

/* renamed from: ax.q1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2864y {

    /* renamed from: ax.q1.y$a */
    public static final class a {
        public long a;
    }

    private static boolean a(ax.S0.G g, B b, int i) {
        int j = j(g, i);
        return j != -1 && j <= b.b;
    }

    private static boolean b(ax.S0.G g, int i) {
        return g.M() == d0.y(g.f(), i, g.g() - 1, 0);
    }

    private static boolean c(ax.S0.G g, B b, boolean z, a aVar) {
        try {
            long V = g.V();
            if (!z) {
                V *= b.b;
            }
            aVar.a = V;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(ax.S0.G g, B b, int i, a aVar) {
        int g2 = g.g();
        long O = g.O();
        long j = O >>> 16;
        if (j != i) {
            return false;
        }
        return g((int) (15 & (O >> 4)), b) && f((int) ((O >> 1) & 7), b) && !(((O & 1) > 1L ? 1 : ((O & 1) == 1L ? 0 : -1)) == 0) && c(g, b, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, aVar) && a(g, b, (int) ((O >> 12) & 15)) && e(g, b, (int) ((O >> 8) & 15)) && b(g, g2);
    }

    private static boolean e(ax.S0.G g, B b, int i) {
        int i2 = b.e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == b.f;
        }
        if (i == 12) {
            return g.M() * 1000 == i2;
        }
        if (i <= 14) {
            int U = g.U();
            if (i == 14) {
                U *= 10;
            }
            if (U == i2) {
                return true;
            }
        }
        return false;
    }

    private static boolean f(int i, B b) {
        return i == 0 || i == b.i;
    }

    private static boolean g(int i, B b) {
        return i <= 7 ? i == b.g - 1 : i <= 10 && b.g == 2;
    }

    public static boolean h(InterfaceC2858s interfaceC2858s, B b, int i, a aVar) throws IOException {
        long i2 = interfaceC2858s.i();
        byte[] bArr = new byte[2];
        interfaceC2858s.p(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            interfaceC2858s.m();
            interfaceC2858s.j((int) (i2 - interfaceC2858s.getPosition()));
            return false;
        }
        ax.S0.G g = new ax.S0.G(16);
        System.arraycopy(bArr, 0, g.f(), 0, 2);
        g.a0(C2860u.d(interfaceC2858s, g.f(), 2, 14));
        interfaceC2858s.m();
        interfaceC2858s.j((int) (i2 - interfaceC2858s.getPosition()));
        return d(g, b, i, aVar);
    }

    public static long i(InterfaceC2858s interfaceC2858s, B b) throws IOException {
        interfaceC2858s.m();
        interfaceC2858s.j(1);
        byte[] bArr = new byte[1];
        interfaceC2858s.p(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        interfaceC2858s.j(2);
        int i = z ? 7 : 6;
        ax.S0.G g = new ax.S0.G(i);
        g.a0(C2860u.d(interfaceC2858s, g.f(), 0, i));
        interfaceC2858s.m();
        a aVar = new a();
        if (c(g, b, z, aVar)) {
            return aVar.a;
        }
        throw ax.P0.E.a(null, null);
    }

    public static int j(ax.S0.G g, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return g.M() + 1;
            case 7:
                return g.U() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
