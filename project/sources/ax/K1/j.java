package ax.K1;

import ax.P0.C;
import ax.P0.C0912v;
import ax.S0.C0987u;
import ax.S0.G;
import ax.q1.F;
import ax.r7.AbstractC2991z;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
final class j {
    public static ax.T0.c a(C c, String str) {
        for (int i = 0; i < c.e(); i++) {
            C.a d = c.d(i);
            if (d instanceof ax.T0.c) {
                ax.T0.c cVar = (ax.T0.c) d;
                if (cVar.a.equals(str)) {
                    return cVar;
                }
            }
        }
        return null;
    }

    private static ax.E1.e b(int i, G g) {
        int v = g.v();
        if (g.v() == 1684108385) {
            g.c0(8);
            String H = g.H(v - 16);
            return new ax.E1.e("und", H, H);
        }
        C0987u.h("MetadataUtil", "Failed to parse comment attribute: " + ax.T0.e.a(i));
        return null;
    }

    private static ax.E1.a c(G g) {
        int v = g.v();
        if (g.v() != 1684108385) {
            C0987u.h("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int p = b.p(g.v());
        String str = p == 13 ? "image/jpeg" : p == 14 ? "image/png" : null;
        if (str == null) {
            C0987u.h("MetadataUtil", "Unrecognized cover art flags: " + p);
            return null;
        }
        g.c0(4);
        int i = v - 16;
        byte[] bArr = new byte[i];
        g.q(bArr, 0, i);
        return new ax.E1.a(str, null, 3, bArr);
    }

    public static C.a d(G g) {
        int g2 = g.g() + g.v();
        int v = g.v();
        int i = (v >> 24) & 255;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & v;
                if (i2 == 6516084) {
                    return b(v, g);
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    return k(v, "TIT2", g);
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    return k(v, "TCOM", g);
                }
                if (i2 == 6578553) {
                    return k(v, "TDRC", g);
                }
                if (i2 == 4280916) {
                    return k(v, "TPE1", g);
                }
                if (i2 == 7630703) {
                    return k(v, "TSSE", g);
                }
                if (i2 == 6384738) {
                    return k(v, "TALB", g);
                }
                if (i2 == 7108978) {
                    return k(v, "USLT", g);
                }
                if (i2 == 6776174) {
                    return k(v, "TCON", g);
                }
                if (i2 == 6779504) {
                    return k(v, "TIT1", g);
                }
            } else {
                if (v == 1735291493) {
                    return j(g);
                }
                if (v == 1684632427) {
                    return e(v, "TPOS", g);
                }
                if (v == 1953655662) {
                    return e(v, "TRCK", g);
                }
                if (v == 1953329263) {
                    return g(v, "TBPM", g, true, false);
                }
                if (v == 1668311404) {
                    return g(v, "TCMP", g, true, true);
                }
                if (v == 1668249202) {
                    return c(g);
                }
                if (v == 1631670868) {
                    return k(v, "TPE2", g);
                }
                if (v == 1936682605) {
                    return k(v, "TSOT", g);
                }
                if (v == 1936679276) {
                    return k(v, "TSOA", g);
                }
                if (v == 1936679282) {
                    return k(v, "TSOP", g);
                }
                if (v == 1936679265) {
                    return k(v, "TSO2", g);
                }
                if (v == 1936679791) {
                    return k(v, "TSOC", g);
                }
                if (v == 1920233063) {
                    return g(v, "ITUNESADVISORY", g, false, false);
                }
                if (v == 1885823344) {
                    return g(v, "ITUNESGAPLESS", g, false, true);
                }
                if (v == 1936683886) {
                    return k(v, "TVSHOWSORT", g);
                }
                if (v == 1953919848) {
                    return k(v, "TVSHOW", g);
                }
                if (v == 757935405) {
                    return h(g, g2);
                }
            }
            C0987u.b("MetadataUtil", "Skipped unknown metadata entry: " + ax.T0.e.a(v));
            g.b0(g2);
            return null;
        } finally {
            g.b0(g2);
        }
    }

    private static ax.E1.n e(int i, String str, G g) {
        int v = g.v();
        if (g.v() == 1684108385 && v >= 22) {
            g.c0(10);
            int U = g.U();
            if (U > 0) {
                String str2 = HttpUrl.FRAGMENT_ENCODE_SET + U;
                int U2 = g.U();
                if (U2 > 0) {
                    str2 = str2 + "/" + U2;
                }
                return new ax.E1.n(str, null, AbstractC2991z.A(str2));
            }
        }
        C0987u.h("MetadataUtil", "Failed to parse index/count attribute: " + ax.T0.e.a(i));
        return null;
    }

    private static int f(G g) {
        int v = g.v();
        if (g.v() == 1684108385) {
            g.c0(8);
            int i = v - 16;
            if (i == 1) {
                return g.M();
            }
            if (i == 2) {
                return g.U();
            }
            if (i == 3) {
                return g.P();
            }
            if (i == 4 && (g.n() & 128) == 0) {
                return g.Q();
            }
        }
        C0987u.h("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static ax.E1.i g(int i, String str, G g, boolean z, boolean z2) {
        int f = f(g);
        if (z2) {
            f = Math.min(1, f);
        }
        if (f >= 0) {
            return z ? new ax.E1.n(str, null, AbstractC2991z.A(Integer.toString(f))) : new ax.E1.e("und", str, Integer.toString(f));
        }
        C0987u.h("MetadataUtil", "Failed to parse uint8 attribute: " + ax.T0.e.a(i));
        return null;
    }

    private static ax.E1.i h(G g, int i) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (g.g() < i) {
            int g2 = g.g();
            int v = g.v();
            int v2 = g.v();
            g.c0(4);
            if (v2 == 1835360622) {
                str = g.H(v - 12);
            } else if (v2 == 1851878757) {
                str2 = g.H(v - 12);
            } else {
                if (v2 == 1684108385) {
                    i2 = g2;
                    i3 = v;
                }
                g.c0(v - 12);
            }
        }
        if (str == null || str2 == null || i2 == -1) {
            return null;
        }
        g.b0(i2);
        g.c0(16);
        return new ax.E1.k(str, str2, g.H(i3 - 16));
    }

    public static ax.T0.c i(G g, int i, String str) {
        while (true) {
            int g2 = g.g();
            if (g2 >= i) {
                return null;
            }
            int v = g.v();
            if (g.v() == 1684108385) {
                int v2 = g.v();
                int v3 = g.v();
                int i2 = v - 16;
                byte[] bArr = new byte[i2];
                g.q(bArr, 0, i2);
                return new ax.T0.c(str, bArr, v3, v2);
            }
            g.b0(g2 + v);
        }
    }

    private static ax.E1.n j(G g) {
        String a = ax.E1.j.a(f(g) - 1);
        if (a != null) {
            return new ax.E1.n("TCON", null, AbstractC2991z.A(a));
        }
        C0987u.h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static ax.E1.n k(int i, String str, G g) {
        int v = g.v();
        if (g.v() == 1684108385) {
            g.c0(8);
            return new ax.E1.n(str, null, AbstractC2991z.A(g.H(v - 16)));
        }
        C0987u.h("MetadataUtil", "Failed to parse text attribute: " + ax.T0.e.a(i));
        return null;
    }

    public static void l(int i, F f, C0912v.b bVar) {
        if (i == 1 && f.a()) {
            bVar.d0(f.a).e0(f.b);
        }
    }

    public static void m(int i, C c, C0912v.b bVar, C c2, C... cArr) {
        if (c2 == null) {
            c2 = new C(new C.a[0]);
        }
        if (c != null) {
            for (int i2 = 0; i2 < c.e(); i2++) {
                C.a d = c.d(i2);
                if (d instanceof ax.T0.c) {
                    ax.T0.c cVar = (ax.T0.c) d;
                    if (!cVar.a.equals("com.android.capture.fps")) {
                        c2 = c2.a(cVar);
                    } else if (i == 2) {
                        c2 = c2.a(cVar);
                    }
                }
            }
        }
        for (C c3 : cArr) {
            c2 = c2.b(c3);
        }
        if (c2.e() > 0) {
            bVar.r0(c2);
        }
    }
}
