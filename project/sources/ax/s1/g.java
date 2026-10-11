package ax.s1;

import ax.P0.C0912v;
import ax.S0.C0987u;
import ax.S0.G;
import ax.S0.d0;
import ax.r7.AbstractC2991z;

/* loaded from: classes.dex */
final class g implements InterfaceC3043a {
    public final C0912v a;

    public g(C0912v c0912v) {
        this.a = c0912v;
    }

    private static String b(int i) {
        switch (i) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    private static String c(int i) {
        if (i == 1) {
            return "audio/raw";
        }
        if (i == 85) {
            return "audio/mpeg";
        }
        if (i == 255) {
            return "audio/mp4a-latm";
        }
        if (i == 8192) {
            return "audio/ac3";
        }
        if (i != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    private static InterfaceC3043a d(G g) {
        g.c0(4);
        int z = g.z();
        int z2 = g.z();
        g.c0(4);
        int z3 = g.z();
        String b = b(z3);
        if (b != null) {
            C0912v.b bVar = new C0912v.b();
            bVar.F0(z).h0(z2).y0(b);
            return new g(bVar.P());
        }
        C0987u.h("StreamFormatChunk", "Ignoring track with unsupported compression " + z3);
        return null;
    }

    public static InterfaceC3043a e(int i, G g) {
        if (i == 2) {
            return d(g);
        }
        if (i == 1) {
            return f(g);
        }
        C0987u.h("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + d0.v0(i));
        return null;
    }

    private static InterfaceC3043a f(G g) {
        int E = g.E();
        String c = c(E);
        if (c == null) {
            C0987u.h("StreamFormatChunk", "Ignoring track with unsupported format tag " + E);
            return null;
        }
        int E2 = g.E();
        int z = g.z();
        g.c0(6);
        int j0 = d0.j0(g.E());
        int E3 = g.a() > 0 ? g.E() : 0;
        C0912v.b bVar = new C0912v.b();
        bVar.y0(c).T(E2).z0(z);
        if (c.equals("audio/raw") && j0 != 0) {
            bVar.s0(j0);
        }
        if (c.equals("audio/mp4a-latm") && E3 > 0) {
            byte[] bArr = new byte[E3];
            g.q(bArr, 0, E3);
            bVar.k0(AbstractC2991z.A(bArr));
        }
        return new g(bVar.P());
    }

    @Override // ax.s1.InterfaceC3043a
    public int a() {
        return 1718776947;
    }
}
