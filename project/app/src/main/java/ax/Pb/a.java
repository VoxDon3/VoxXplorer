/*
 * Decompiled with CFR 0.152.
 */
package ax.Pb;

import ax.Gb.g;
import ax.Gb.l;
import ax.K2.t;
import ax.Ob.h;
import ax.Pb.b;
import ax.Pb.c;
import ax.Pb.d;
import ax.Pb.e;

public final class a
implements Comparable<a> {
    public static final a c0 = new a(null);
    private static final long d0 = a.n(0L);
    private static final long e0 = c.b(0x3FFFFFFFFFFFFFFFL);
    private static final long f0 = c.b(-4611686018427387903L);
    private final long q;

    private /* synthetic */ a(long l8) {
        this.q = l8;
    }

    public static final int A(long l8) {
        if (a.J(l8)) {
            return 0;
        }
        return (int)(a.w(l8) % (long)60);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final int B(long l8) {
        if (a.J(l8)) {
            return 0;
        }
        if (a.H(l8)) {
            l8 = c.c(a.E(l8) % (long)1000);
            return (int)l8;
        }
        l8 = a.E(l8) % (long)1000000000;
        return (int)l8;
    }

    public static final int C(long l8) {
        if (a.J(l8)) {
            return 0;
        }
        return (int)(a.x(l8) % (long)60);
    }

    private static final d D(long l8) {
        if (a.I(l8)) {
            return d.c0;
        }
        return d.e0;
    }

    private static final long E(long l8) {
        return l8 >> 1;
    }

    public static int F(long l8) {
        return t.a(l8);
    }

    public static final boolean G(long l8) {
        return a.J(l8) ^ true;
    }

    private static final boolean H(long l8) {
        return ((int)l8 & 1) == 1;
    }

    private static final boolean I(long l8) {
        return ((int)l8 & 1) == 0;
    }

    public static final boolean J(long l8) {
        return l8 == e0 || l8 == f0;
        {
        }
    }

    public static final boolean K(long l8) {
        return l8 < 0L;
    }

    public static final boolean L(long l8) {
        return l8 > 0L;
    }

    public static final long M(long l8, d d8) {
        l.f((Object)d8, "unit");
        if (l8 == e0) {
            return Long.MAX_VALUE;
        }
        if (l8 == f0) {
            return Long.MIN_VALUE;
        }
        return e.a(a.E(l8), a.D(l8), d8);
    }

    public static String N(long l8) {
        int n8;
        boolean bl;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        int n9;
        int n10;
        int n11;
        StringBuilder stringBuilder;
        boolean bl5;
        block25: {
            int n12;
            block24: {
                block23: {
                    int n13;
                    block22: {
                        if (l8 == 0L) {
                            return "0s";
                        }
                        if (l8 == e0) {
                            return "Infinity";
                        }
                        if (l8 == f0) {
                            return "-Infinity";
                        }
                        bl5 = a.K(l8);
                        stringBuilder = new StringBuilder();
                        if (bl5) {
                            stringBuilder.append('-');
                        }
                        long l9 = a.q(l8);
                        long l10 = a.s(l9);
                        n13 = a.r(l9);
                        n12 = a.A(l9);
                        n11 = a.C(l9);
                        n10 = a.B(l9);
                        n9 = 0;
                        bl4 = l10 != 0L;
                        bl3 = n13 != 0;
                        bl2 = n12 != 0;
                        bl = n11 != 0 || n10 != 0;
                        if (bl4) {
                            stringBuilder.append(l10);
                            stringBuilder.append('d');
                            n9 = 1;
                        }
                        if (bl3) break block22;
                        n8 = n9;
                        if (!bl4) break block23;
                        if (bl2) break block22;
                        n8 = n9;
                        if (!bl) break block23;
                    }
                    if (n9 > 0) {
                        stringBuilder.append(' ');
                    }
                    stringBuilder.append(n13);
                    stringBuilder.append('h');
                    n8 = n9 + 1;
                }
                if (bl2) break block24;
                n9 = n8;
                if (!bl) break block25;
                if (bl3) break block24;
                n9 = n8;
                if (!bl4) break block25;
            }
            if (n8 > 0) {
                stringBuilder.append(' ');
            }
            stringBuilder.append(n12);
            stringBuilder.append('m');
            n9 = n8 + 1;
        }
        n8 = n9;
        if (bl) {
            if (n9 > 0) {
                stringBuilder.append(' ');
            }
            if (!(n11 != 0 || bl4 || bl3 || bl2)) {
                if (n10 >= 1000000) {
                    a.d(l8, stringBuilder, n10 / 1000000, n10 % 1000000, 6, "ms", false);
                } else if (n10 >= 1000) {
                    a.d(l8, stringBuilder, n10 / 1000, n10 % 1000, 3, "us", false);
                } else {
                    stringBuilder.append(n10);
                    stringBuilder.append("ns");
                }
            } else {
                a.d(l8, stringBuilder, n11, n10, 9, "s", false);
            }
            n8 = n9 + 1;
        }
        if (bl5 && n8 > 1) {
            stringBuilder.insert(1, '(').append(')');
        }
        return stringBuilder.toString();
    }

    public static final long O(long l8) {
        return c.a(-a.E(l8), (int)l8 & 1);
    }

    private static final void d(long l8, StringBuilder stringBuilder, int n8, int n9, int n10, String string, boolean bl) {
        stringBuilder.append(n8);
        if (n9 != 0) {
            stringBuilder.append('.');
            String string2 = h.e0(String.valueOf(n9), n10, '0');
            n8 = string2.length();
            n9 = -1;
            n10 = n8 - 1;
            n8 = n9;
            if (n10 >= 0) {
                n8 = n10;
                while (true) {
                    n10 = n8 - 1;
                    if (string2.charAt(n8) != '0') break;
                    if (n10 < 0) {
                        n8 = n9;
                        break;
                    }
                    n8 = n10;
                }
            }
            n9 = n8 + 1;
            if (!bl && n9 < 3) {
                stringBuilder.append(string2, 0, n9);
                l.e(stringBuilder, "append(...)");
            } else {
                stringBuilder.append(string2, 0, (n8 + 3) / 3 * 3);
                l.e(stringBuilder, "append(...)");
            }
        }
        stringBuilder.append(string);
    }

    public static final /* synthetic */ a h(long l8) {
        return new a(l8);
    }

    public static int l(long l8, long l9) {
        long l10 = l8 ^ l9;
        if (l10 >= 0L && ((int)l10 & 1) != 0) {
            int n8 = ((int)l8 & 1) - ((int)l9 & 1);
            if (a.K(l8)) {
                return -n8;
            }
            return n8;
        }
        return l.i(l8, l9);
    }

    public static long n(long l8) {
        if (b.a()) {
            if (a.I(l8)) {
                long l9 = a.E(l8);
                if (-4611686018426999999L <= l9 && l9 < 4611686018427000000L) {
                    return l8;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(a.E(l8));
                stringBuilder.append(" ns is out of nanoseconds range");
                throw new AssertionError((Object)stringBuilder.toString());
            }
            long l10 = a.E(l8);
            if (-4611686018427387903L <= l10 && l10 < 0x4000000000000000L) {
                l10 = a.E(l8);
                if (-4611686018426L <= l10) {
                    if (l10 >= 4611686018427L) {
                        return l8;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(a.E(l8));
                    stringBuilder.append(" ms is denormalized");
                    throw new AssertionError((Object)stringBuilder.toString());
                }
                return l8;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a.E(l8));
            stringBuilder.append(" ms is out of milliseconds range");
            throw new AssertionError((Object)stringBuilder.toString());
        }
        return l8;
    }

    public static boolean p(long l8, Object object) {
        if (!(object instanceof a)) {
            return false;
        }
        return l8 == ((a)object).P();
    }

    public static final long q(long l8) {
        long l9 = l8;
        if (a.K(l8)) {
            l9 = a.O(l8);
        }
        return l9;
    }

    public static final int r(long l8) {
        if (a.J(l8)) {
            return 0;
        }
        return (int)(a.t(l8) % (long)24);
    }

    public static final long s(long l8) {
        return a.M(l8, d.i0);
    }

    public static final long t(long l8) {
        return a.M(l8, d.h0);
    }

    public static final long u(long l8) {
        if (a.H(l8) && a.G(l8)) {
            return a.E(l8);
        }
        return a.M(l8, d.e0);
    }

    public static final long w(long l8) {
        return a.M(l8, d.g0);
    }

    public static final long x(long l8) {
        return a.M(l8, d.f0);
    }

    public final /* synthetic */ long P() {
        return this.q;
    }

    public boolean equals(Object object) {
        return a.p(this.q, object);
    }

    public int hashCode() {
        return a.F(this.q);
    }

    public int j(long l8) {
        return a.l(this.q, l8);
    }

    public String toString() {
        return a.N(this.q);
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }
}

