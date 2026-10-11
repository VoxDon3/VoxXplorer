/*
 * Decompiled with CFR 0.152.
 */
package ax.X4;

import ax.X4.a;
import ax.X4.d;
import ax.X4.f;
import ax.X4.i;

abstract class e
extends a {
    e() {
    }

    private long e(CharSequence charSequence, int n8, int n9, int n10, boolean bl, boolean bl2) {
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        boolean bl3;
        int n18;
        int n19;
        long l8;
        int n20;
        int n21;
        block21: {
            block18: {
                int n22;
                block20: {
                    block19: {
                        n21 = -1;
                        n20 = n8;
                        l8 = 0L;
                        n19 = 0;
                        n18 = 0;
                        while (true) {
                            bl3 = true;
                            n17 = 1;
                            if (n20 >= n10) break;
                            n22 = charSequence.charAt(n20);
                            if (i.b((char)n22)) {
                                l8 = l8 * 10L + (long)n22 - 48L;
                            } else {
                                n19 = n22;
                                if (n22 != 46) break;
                                n21 = n21 >= 0 ? n17 : 0;
                                n18 |= n21;
                                n21 = n20;
                            }
                            ++n20;
                            n19 = n22;
                        }
                        if (n21 < 0) {
                            n16 = n20 - n8;
                            n15 = n20;
                            n21 = 0;
                        } else {
                            n17 = n21 - n20 + 1;
                            n15 = n21;
                            n16 = n20 - n8 - 1;
                            n21 = n17;
                        }
                        if ((n19 | 0x20) != 101) break block18;
                        n17 = n20 + 1;
                        int n23 = f.a(charSequence, n17, n10);
                        n14 = n23 == 45 ? 1 : 0;
                        if (n14 != 0) break block19;
                        n22 = n23;
                        if (n23 != 43) break block20;
                    }
                    n17 = n20 + 2;
                    n22 = f.a(charSequence, n17, n10);
                }
                int n24 = i.b((char)n22);
                n13 = 0;
                n12 = n22;
                n11 = n17;
                do {
                    n17 = n13;
                    if (n13 < 1024) {
                        n17 = n13 * 10 + n12 - 48;
                    }
                    n19 = n11 + 1;
                    n22 = f.a(charSequence, n19, n10);
                    n11 = n19;
                    n12 = n22;
                    n13 = n17;
                } while (i.b((char)n22));
                n11 = n17;
                if (n14 != 0) {
                    n11 = -n17;
                }
                n21 += n11;
                n14 = n22;
                n17 = n11;
                n11 = n18 | n24 ^ 1;
                n18 = n19;
                n19 = n14;
                break block21;
            }
            n14 = n20;
            n17 = 0;
            n11 = n18;
            n18 = n14;
        }
        n14 = n19 == 100 ? 1 : 0;
        n13 = n19 == 68 ? 1 : 0;
        n12 = n19 == 102 ? 1 : 0;
        int n25 = n19 == 70 ? 1 : 0;
        n19 = n18;
        if ((n14 | n13 | n12 | n25) != 0) {
            n19 = n18 + 1;
        }
        n18 = e.j(charSequence, n19, n10);
        if (n11 == 0 && n18 >= n10 && (bl2 || n16 != 0)) {
            if (n16 > 19) {
                n18 = 0;
                l8 = 0L;
                while (n8 < n20) {
                    n11 = charSequence.charAt(n8);
                    if (n11 == 46) {
                        ++n18;
                    } else {
                        if (d.a(l8, 1000000000000000000L) >= 0) break;
                        l8 = l8 * 10L + (long)n11 - 48L;
                    }
                    ++n8;
                }
                bl2 = n8 < n20 ? bl3 : false;
                n8 = n15 - n8 + n18 + n17;
            } else {
                bl2 = false;
                n8 = 0;
            }
            return this.k(charSequence, n9, n10, bl, l8, n21, bl2, n8);
        }
        throw new NumberFormatException("illegal syntax");
    }

    private long g(CharSequence charSequence, int n8, int n9, int n10, boolean bl) {
        int n11;
        int n12;
        int n13;
        int n14;
        boolean bl2;
        int n15;
        int n16;
        int n17;
        boolean bl3;
        int n18;
        int n19;
        long l8;
        int n20;
        int n21;
        block23: {
            block20: {
                int n22;
                block22: {
                    block21: {
                        n21 = -1;
                        n20 = n8;
                        l8 = 0L;
                        n19 = 0;
                        n18 = 0;
                        while (true) {
                            bl3 = true;
                            if (n20 >= n10) break;
                            n22 = charSequence.charAt(n20);
                            n17 = f.b((char)n22);
                            if (n17 >= 0) {
                                l8 = l8 << 4 | (long)n17;
                                n17 = n20;
                            } else {
                                long l9;
                                n19 = n22;
                                if (n17 != -4) break;
                                n21 = n21 >= 0 ? 1 : 0;
                                n21 = n18 | n21;
                                for (n18 = n20; n18 < n10 - 8 && (l9 = i.h(charSequence, n18 + 1)) >= 0L; n18 += 8) {
                                    l8 = (l8 << 32) + l9;
                                }
                                n17 = n18;
                                n18 = n21;
                                n21 = n20;
                            }
                            n20 = n17 + 1;
                            n19 = n22;
                        }
                        if (n21 < 0) {
                            n16 = n20 - n8;
                            n15 = n20;
                            n21 = 0;
                        } else {
                            n17 = Math.min(n21 - n20 + 1, 1024) * 4;
                            n15 = n21;
                            n16 = n20 - n8 - 1;
                            n21 = n17;
                        }
                        bl2 = (n19 | 0x20) == 112;
                        if (!bl2) break block20;
                        n17 = n20 + 1;
                        int n23 = f.a(charSequence, n17, n10);
                        n14 = n23 == 45 ? 1 : 0;
                        if (n14 != 0) break block21;
                        n22 = n23;
                        if (n23 != 43) break block22;
                    }
                    n17 = n20 + 2;
                    n22 = f.a(charSequence, n17, n10);
                }
                int n24 = i.b((char)n22);
                n13 = 0;
                n12 = n22;
                n11 = n17;
                do {
                    n17 = n13;
                    if (n13 < 1024) {
                        n17 = n13 * 10 + n12 - 48;
                    }
                    n19 = n11 + 1;
                    n22 = f.a(charSequence, n19, n10);
                    n11 = n19;
                    n12 = n22;
                    n13 = n17;
                } while (i.b((char)n22));
                n13 = n17;
                if (n14 != 0) {
                    n13 = -n17;
                }
                n17 = n21 + n13;
                n14 = n22;
                n21 = n13;
                n13 = n18 | n24 ^ 1;
                n18 = n19;
                n19 = n14;
                break block23;
            }
            n14 = n20;
            n11 = 0;
            n17 = n21;
            n13 = n18;
            n21 = n11;
            n18 = n14;
        }
        n14 = n19 == 100 ? 1 : 0;
        n11 = n19 == 68 ? 1 : 0;
        n12 = n19 == 102 ? 1 : 0;
        n19 = n19 == 70 ? 1 : 0;
        int n25 = n18;
        if ((n19 | (n11 | n14 | n12)) != 0) {
            n25 = n18 + 1;
        }
        n18 = e.j(charSequence, n25, n10);
        if (n13 == 0 && n18 >= n10 && n16 != 0 && bl2) {
            if (n16 > 16) {
                n18 = 0;
                l8 = 0L;
                while (n8 < n20) {
                    n13 = f.b(charSequence.charAt(n8));
                    if (n13 >= 0) {
                        if (d.a(l8, 1000000000000000000L) >= 0) break;
                        l8 = l8 << 4 | (long)n13;
                    } else {
                        ++n18;
                    }
                    ++n8;
                }
                if (n8 >= n20) {
                    bl3 = false;
                }
                n20 = n18;
            } else {
                n20 = 0;
                bl3 = false;
                n8 = n18;
            }
            return this.l(charSequence, n9, n10, bl, l8, n17, bl3, (n15 - n8 + n20) * 4 + n21);
        }
        throw new NumberFormatException("illegal syntax");
    }

    private long h(CharSequence charSequence, int n8, int n9, boolean bl) {
        if (charSequence.charAt(n8) == 'N') {
            int n10 = n8 + 2;
            if (n10 < n9 && charSequence.charAt(n8 + 1) == 'a' && charSequence.charAt(n10) == 'N' && e.j(charSequence, n8 + 3, n9) == n9) {
                return this.c();
            }
        } else {
            int n11 = n8 + 7;
            if (n11 < n9 && charSequence.charAt(n8) == 'I' && charSequence.charAt(n8 + 1) == 'n' && charSequence.charAt(n8 + 2) == 'f' && charSequence.charAt(n8 + 3) == 'i' && charSequence.charAt(n8 + 4) == 'n' && charSequence.charAt(n8 + 5) == 'i' && charSequence.charAt(n8 + 6) == 't' && charSequence.charAt(n11) == 'y' && e.j(charSequence, n8 + 8, n9) == n9) {
                if (bl) {
                    return this.d();
                }
                return this.i();
            }
        }
        throw new NumberFormatException("illegal syntax");
    }

    private static int j(CharSequence charSequence, int n8, int n9) {
        while (n8 < n9 && charSequence.charAt(n8) <= ' ') {
            ++n8;
        }
        return n8;
    }

    abstract long c();

    abstract long d();

    public final long f(CharSequence charSequence, int n8, int n9) {
        block8: {
            block9: {
                block12: {
                    int n10;
                    boolean bl;
                    int n11;
                    int n12;
                    block11: {
                        block10: {
                            n12 = n8 + n9;
                            if (n8 < 0 || n12 < n8 || n12 > charSequence.length() || n9 > 0x7FFFFFFB) break block8;
                            n11 = e.j(charSequence, n8, n12);
                            if (n11 == n12) break block9;
                            int n13 = charSequence.charAt(n11);
                            bl = true;
                            if (n13 != 45) {
                                bl = false;
                            }
                            if (bl) break block10;
                            n10 = n13;
                            n9 = n11;
                            if (n13 != 43) break block11;
                        }
                        if ((n10 = f.a(charSequence, n9 = n11 + 1, n12)) == 0) break block12;
                    }
                    if (n10 >= 73) {
                        return this.h(charSequence, n9, n12, bl);
                    }
                    boolean bl2 = n10 == 48;
                    if (bl2) {
                        n10 = n9 + 1;
                        n11 = f.a(charSequence, n10, n12);
                        if (n11 != 120 && n11 != 88) {
                            n9 = n10;
                        } else {
                            return this.g(charSequence, n9 + 2, n8, n12, bl);
                        }
                    }
                    return this.e(charSequence, n9, n8, n12, bl, bl2);
                }
                throw new NumberFormatException("illegal syntax");
            }
            throw new NumberFormatException("illegal syntax");
        }
        throw new IllegalArgumentException("offset < 0 or length > str.length");
    }

    abstract long i();

    abstract long k(CharSequence var1, int var2, int var3, boolean var4, long var5, int var7, boolean var8, int var9);

    abstract long l(CharSequence var1, int var2, int var3, boolean var4, long var5, int var7, boolean var8, int var9);
}

