/*
 * Decompiled with CFR 0.152.
 */
package ax.K1;

import ax.E1.a;
import ax.E1.e;
import ax.E1.i;
import ax.E1.k;
import ax.E1.n;
import ax.K1.b;
import ax.P0.C;
import ax.P0.v;
import ax.S0.G;
import ax.S0.u;
import ax.T0.c;
import ax.q1.F;
import ax.r7.z;

final class j {
    public static c a(C c8, String string) {
        for (int i8 = 0; i8 < c8.e(); ++i8) {
            C.a a8 = c8.d(i8);
            if (!(a8 instanceof c)) continue;
            a8 = (c)a8;
            if (!((c)a8).a.equals(string)) continue;
            return a8;
        }
        return null;
    }

    private static e b(int n8, G object) {
        int n9 = ((G)object).v();
        if (((G)object).v() == 1684108385) {
            ((G)object).c0(8);
            object = ((G)object).H(n9 - 16);
            return new e("und", (String)object, (String)object);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Failed to parse comment attribute: ");
        ((StringBuilder)object).append(ax.T0.e.a(n8));
        u.h("MetadataUtil", ((StringBuilder)object).toString());
        return null;
    }

    private static a c(G object) {
        int n8 = ((G)object).v();
        if (((G)object).v() == 1684108385) {
            int n9 = b.p(((G)object).v());
            String string = n9 == 13 ? "image/jpeg" : (n9 == 14 ? "image/png" : null);
            if (string == null) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Unrecognized cover art flags: ");
                ((StringBuilder)object).append(n9);
                u.h("MetadataUtil", ((StringBuilder)object).toString());
                return null;
            }
            ((G)object).c0(4);
            n9 = n8 - 16;
            byte[] byArray = new byte[n9];
            ((G)object).q(byArray, 0, n9);
            return new a(string, null, 3, byArray);
        }
        u.h("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static C.a d(G g8) {
        Throwable throwable2;
        int n8;
        int n9;
        block55: {
            block56: {
                block54: {
                    int n10;
                    block53: {
                        n9 = g8.g() + g8.v();
                        n8 = g8.v();
                        n10 = n8 >> 24 & 0xFF;
                        if (n10 == 169 || n10 == 253) break block53;
                        if (n8 == 1735291493) {
                            n n11 = j.j(g8);
                            g8.b0(n9);
                            return n11;
                        }
                        if (n8 == 1684632427) {
                            n n12 = j.e(n8, "TPOS", g8);
                            g8.b0(n9);
                            return n12;
                        }
                        if (n8 == 1953655662) {
                            n n13 = j.e(n8, "TRCK", g8);
                            g8.b0(n9);
                            return n13;
                        }
                        if (n8 == 1953329263) {
                            i i8 = j.g(n8, "TBPM", g8, true, false);
                            g8.b0(n9);
                            return i8;
                        }
                        if (n8 == 1668311404) {
                            i i9 = j.g(n8, "TCMP", g8, true, true);
                            g8.b0(n9);
                            return i9;
                        }
                        if (n8 == 1668249202) {
                            a a8 = j.c(g8);
                            g8.b0(n9);
                            return a8;
                        }
                        if (n8 == 1631670868) {
                            n n14 = j.k(n8, "TPE2", g8);
                            g8.b0(n9);
                            return n14;
                        }
                        if (n8 == 1936682605) {
                            n n15 = j.k(n8, "TSOT", g8);
                            g8.b0(n9);
                            return n15;
                        }
                        if (n8 == 1936679276) {
                            n n16 = j.k(n8, "TSOA", g8);
                            g8.b0(n9);
                            return n16;
                        }
                        if (n8 == 1936679282) {
                            n n17 = j.k(n8, "TSOP", g8);
                            g8.b0(n9);
                            return n17;
                        }
                        if (n8 == 1936679265) {
                            n n18 = j.k(n8, "TSO2", g8);
                            g8.b0(n9);
                            return n18;
                        }
                        if (n8 == 1936679791) {
                            n n19 = j.k(n8, "TSOC", g8);
                            g8.b0(n9);
                            return n19;
                        }
                        if (n8 == 1920233063) {
                            i i10 = j.g(n8, "ITUNESADVISORY", g8, false, false);
                            g8.b0(n9);
                            return i10;
                        }
                        if (n8 == 1885823344) {
                            i i11 = j.g(n8, "ITUNESGAPLESS", g8, false, true);
                            g8.b0(n9);
                            return i11;
                        }
                        if (n8 == 1936683886) {
                            n n20 = j.k(n8, "TVSHOWSORT", g8);
                            g8.b0(n9);
                            return n20;
                        }
                        if (n8 == 1953919848) {
                            n n21 = j.k(n8, "TVSHOW", g8);
                            g8.b0(n9);
                            return n21;
                        }
                        if (n8 != 0x2D2D2D2D) break block54;
                        try {
                            i i12 = j.h(g8, n9);
                            g8.b0(n9);
                            return i12;
                        }
                        catch (Throwable throwable2) {}
                    }
                    n10 = 0xFFFFFF & n8;
                    if (n10 == 6516084) {
                        e e8 = j.b(n8, g8);
                        g8.b0(n9);
                        return e8;
                    }
                    if (n10 == 7233901 || n10 == 7631467) break block55;
                    if (n10 == 6516589 || n10 == 0x777274) break block56;
                    if (n10 == 6578553) {
                        n n22 = j.k(n8, "TDRC", g8);
                        g8.b0(n9);
                        return n22;
                    }
                    if (n10 == 4280916) {
                        n n23 = j.k(n8, "TPE1", g8);
                        g8.b0(n9);
                        return n23;
                    }
                    if (n10 == 7630703) {
                        n n24 = j.k(n8, "TSSE", g8);
                        g8.b0(n9);
                        return n24;
                    }
                    if (n10 == 6384738) {
                        n n25 = j.k(n8, "TALB", g8);
                        g8.b0(n9);
                        return n25;
                    }
                    if (n10 == 7108978) {
                        n n26 = j.k(n8, "USLT", g8);
                        g8.b0(n9);
                        return n26;
                    }
                    if (n10 == 6776174) {
                        n n27 = j.k(n8, "TCON", g8);
                        g8.b0(n9);
                        return n27;
                    }
                    if (n10 == 6779504) {
                        n n28 = j.k(n8, "TIT1", g8);
                        g8.b0(n9);
                        return n28;
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Skipped unknown metadata entry: ");
                stringBuilder.append(ax.T0.e.a(n8));
                u.b("MetadataUtil", stringBuilder.toString());
                g8.b0(n9);
                return null;
            }
            n n29 = j.k(n8, "TCOM", g8);
            g8.b0(n9);
            return n29;
        }
        n n30 = j.k(n8, "TIT2", g8);
        g8.b0(n9);
        return n30;
        g8.b0(n9);
        throw throwable2;
    }

    private static n e(int n8, String charSequence, G object) {
        int n9 = ((G)object).v();
        if (((G)object).v() == 1684108385 && n9 >= 22) {
            ((G)object).c0(10);
            n9 = ((G)object).U();
            if (n9 > 0) {
                CharSequence charSequence2 = new StringBuilder();
                charSequence2.append("");
                charSequence2.append(n9);
                charSequence2 = charSequence2.toString();
                n8 = ((G)object).U();
                object = charSequence2;
                if (n8 > 0) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)charSequence2);
                    ((StringBuilder)object).append("/");
                    ((StringBuilder)object).append(n8);
                    object = ((StringBuilder)object).toString();
                }
                return new n((String)charSequence, null, z.A(object));
            }
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Failed to parse index/count attribute: ");
        ((StringBuilder)charSequence).append(ax.T0.e.a(n8));
        u.h("MetadataUtil", ((StringBuilder)charSequence).toString());
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int f(G g8) {
        int n8 = g8.v();
        if (g8.v() == 1684108385) {
            g8.c0(8);
            if ((n8 -= 16) == 1) return g8.M();
            if (n8 == 2) return g8.U();
            if (n8 == 3) return g8.P();
            if (n8 == 4 && (g8.n() & 0x80) == 0) {
                return g8.Q();
            }
        }
        u.h("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static i g(int n8, String charSequence, G g8, boolean bl, boolean bl2) {
        int n9;
        int n10 = n9 = j.f(g8);
        if (bl2) {
            n10 = Math.min(1, n9);
        }
        if (n10 >= 0) {
            if (bl) {
                return new n((String)charSequence, null, z.A(Integer.toString(n10)));
            }
            return new e("und", (String)charSequence, Integer.toString(n10));
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Failed to parse uint8 attribute: ");
        ((StringBuilder)charSequence).append(ax.T0.e.a(n8));
        u.h("MetadataUtil", ((StringBuilder)charSequence).toString());
        return null;
    }

    private static i h(G g8, int n8) {
        String string = null;
        String string2 = null;
        int n9 = -1;
        int n10 = -1;
        while (g8.g() < n8) {
            int n11 = g8.g();
            int n12 = g8.v();
            int n13 = g8.v();
            g8.c0(4);
            if (n13 == 1835360622) {
                string = g8.H(n12 - 12);
                continue;
            }
            if (n13 == 1851878757) {
                string2 = g8.H(n12 - 12);
                continue;
            }
            if (n13 == 1684108385) {
                n9 = n11;
                n10 = n12;
            }
            g8.c0(n12 - 12);
        }
        if (string != null && string2 != null && n9 != -1) {
            g8.b0(n9);
            g8.c0(16);
            return new k(string, string2, g8.H(n10 - 16));
        }
        return null;
    }

    public static c i(G g8, int n8, String string) {
        int n9;
        while ((n9 = g8.g()) < n8) {
            int n10 = g8.v();
            if (g8.v() == 1684108385) {
                n8 = g8.v();
                n9 = g8.v();
                byte[] byArray = new byte[n10 -= 16];
                g8.q(byArray, 0, n10);
                return new c(string, byArray, n9, n8);
            }
            g8.b0(n9 + n10);
        }
        return null;
    }

    private static n j(G object) {
        if ((object = ax.E1.j.a(j.f((G)object) - 1)) != null) {
            return new n("TCON", null, z.A(object));
        }
        u.h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static n k(int n8, String charSequence, G g8) {
        int n9 = g8.v();
        if (g8.v() == 1684108385) {
            g8.c0(8);
            return new n((String)charSequence, null, z.A(g8.H(n9 - 16)));
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Failed to parse text attribute: ");
        ((StringBuilder)charSequence).append(ax.T0.e.a(n8));
        u.h("MetadataUtil", ((StringBuilder)charSequence).toString());
        return null;
    }

    public static void l(int n8, F f8, v.b b8) {
        if (n8 == 1 && f8.a()) {
            b8.d0(f8.a).e0(f8.b);
        }
    }

    public static void m(int n8, C c8, v.b b8, C c9, C ... cArray) {
        int n9;
        int n10 = 0;
        if (c9 == null) {
            c9 = new C(new C.a[0]);
        }
        C c10 = c9;
        if (c8 != null) {
            n9 = 0;
            while (true) {
                c10 = c9;
                if (n9 >= c8.e()) break;
                C.a a8 = c8.d(n9);
                c10 = c9;
                if (a8 instanceof c) {
                    a8 = (c)a8;
                    if (((c)a8).a.equals("com.android.capture.fps")) {
                        c10 = c9;
                        if (n8 == 2) {
                            c10 = c9.a(a8);
                        }
                    } else {
                        c10 = c9.a(a8);
                    }
                }
                ++n9;
                c9 = c10;
            }
        }
        n9 = cArray.length;
        for (n8 = n10; n8 < n9; ++n8) {
            c10 = c10.b(cArray[n8]);
        }
        if (c10.e() > 0) {
            b8.r0(c10);
        }
    }
}

