package ax.Y1;

import android.util.Pair;
import ax.P0.E;
import ax.S0.C0968a;
import ax.S0.C0987u;
import ax.S0.G;
import ax.S0.d0;
import ax.q1.InterfaceC2858s;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class d {
    private static final byte[] a = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    private static final byte[] b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    private static final class a {
        public final int a;
        public final long b;

        private a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public static a a(InterfaceC2858s interfaceC2858s, G g) throws IOException {
            interfaceC2858s.p(g.f(), 0, 8);
            g.b0(0);
            return new a(g.v(), g.C());
        }
    }

    public static boolean a(InterfaceC2858s interfaceC2858s) throws IOException {
        G g = new G(8);
        int i = a.a(interfaceC2858s, g).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        interfaceC2858s.p(g.f(), 0, 4);
        g.b0(0);
        int v = g.v();
        if (v == 1463899717) {
            return true;
        }
        C0987u.c("WavHeaderReader", "Unsupported form type: " + v);
        return false;
    }

    public static c b(InterfaceC2858s interfaceC2858s) throws IOException {
        byte[] bArr;
        G g = new G(16);
        a d = d(1718449184, interfaceC2858s, g);
        C0968a.g(d.b >= 16);
        interfaceC2858s.p(g.f(), 0, 16);
        g.b0(0);
        int E = g.E();
        int E2 = g.E();
        int D = g.D();
        int D2 = g.D();
        int E3 = g.E();
        int E4 = g.E();
        int i = ((int) d.b) - 16;
        if (i > 0) {
            bArr = new byte[i];
            interfaceC2858s.p(bArr, 0, i);
            if (E == 65534 && i == 24) {
                G g2 = new G(bArr);
                g2.E();
                int E5 = g2.E();
                if (E5 != 0 && E5 != E4) {
                    throw E.d("validBits ( " + E5 + ")  != bitsPerSample( " + E4 + ") are not supported");
                }
                int D3 = g2.D();
                if ((D3 >> 18) != 0) {
                    throw E.d("invalid channel mask " + D3);
                }
                if (D3 != 0 && Integer.bitCount(D3) != E2) {
                    throw E.d("invalid number of channels (" + Integer.bitCount(D3) + ") in channel mask " + D3);
                }
                E = g2.E();
                byte[] bArr2 = new byte[14];
                g2.q(bArr2, 0, 14);
                if (!Arrays.equals(bArr2, a) && !Arrays.equals(bArr2, b)) {
                    throw E.d("invalid wav format extension guid");
                }
            }
        } else {
            bArr = d0.f;
        }
        byte[] bArr3 = bArr;
        int i2 = E;
        interfaceC2858s.n((int) (interfaceC2858s.i() - interfaceC2858s.getPosition()));
        return new c(i2, E2, D, D2, E3, E4, bArr3);
    }

    public static long c(InterfaceC2858s interfaceC2858s) throws IOException {
        G g = new G(8);
        a a2 = a.a(interfaceC2858s, g);
        if (a2.a != 1685272116) {
            interfaceC2858s.m();
            return -1L;
        }
        interfaceC2858s.j(8);
        g.b0(0);
        interfaceC2858s.p(g.f(), 0, 8);
        long A = g.A();
        interfaceC2858s.n(((int) a2.b) + 8);
        return A;
    }

    private static a d(int i, InterfaceC2858s interfaceC2858s, G g) throws IOException {
        a a2 = a.a(interfaceC2858s, g);
        while (a2.a != i) {
            C0987u.h("WavHeaderReader", "Ignoring unknown WAV chunk: " + a2.a);
            long j = a2.b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw E.d("Chunk is too large (~2GB+) to skip; id: " + a2.a);
            }
            interfaceC2858s.n((int) j2);
            a2 = a.a(interfaceC2858s, g);
        }
        return a2;
    }

    public static Pair<Long, Long> e(InterfaceC2858s interfaceC2858s) throws IOException {
        interfaceC2858s.m();
        a d = d(1684108385, interfaceC2858s, new G(8));
        interfaceC2858s.n(8);
        return Pair.create(Long.valueOf(interfaceC2858s.getPosition()), Long.valueOf(d.b));
    }
}
