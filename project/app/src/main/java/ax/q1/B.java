/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.P0.C;
import ax.P0.v;
import ax.S0.F;
import ax.S0.d0;
import ax.q1.X;
import java.util.Collections;
import java.util.List;

public final class B {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final a k;
    private final C l;

    private B(int n8, int n9, int n10, int n11, int n12, int n13, int n14, long l8, a a8, C c8) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = n11;
        this.e = n12;
        this.f = B.j(n12);
        this.g = n13;
        this.h = n14;
        this.i = B.e(n14);
        this.j = l8;
        this.k = a8;
        this.l = c8;
    }

    public B(byte[] object, int n8) {
        object = new F((byte[])object);
        ((F)object).p(n8 * 8);
        this.a = ((F)object).h(16);
        this.b = ((F)object).h(16);
        this.c = ((F)object).h(24);
        this.d = ((F)object).h(24);
        this.e = n8 = ((F)object).h(20);
        this.f = B.j(n8);
        this.g = ((F)object).h(3) + 1;
        this.h = n8 = ((F)object).h(5) + 1;
        this.i = B.e(n8);
        this.j = ((F)object).j(36);
        this.k = null;
        this.l = null;
    }

    private static int e(int n8) {
        if (n8 != 8) {
            if (n8 != 12) {
                if (n8 != 16) {
                    if (n8 != 20) {
                        if (n8 != 24) {
                            if (n8 != 32) {
                                return -1;
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int j(int n8) {
        switch (n8) {
            default: {
                return -1;
            }
            case 192000: {
                return 3;
            }
            case 176400: {
                return 2;
            }
            case 96000: {
                return 11;
            }
            case 88200: {
                return 1;
            }
            case 48000: {
                return 10;
            }
            case 44100: {
                return 9;
            }
            case 32000: {
                return 8;
            }
            case 24000: {
                return 7;
            }
            case 22050: {
                return 6;
            }
            case 16000: {
                return 5;
            }
            case 8000: 
        }
        return 4;
    }

    public B a(List<ax.C1.a> object) {
        object = this.h(new C((List<? extends C.a>)object));
        return new B(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, (C)object);
    }

    public B b(a a8) {
        return new B(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, a8, this.l);
    }

    public B c(List<String> object) {
        object = this.h(X.d(object));
        return new B(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, (C)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public long d() {
        long l8;
        long l9;
        int n8 = this.d;
        if (n8 > 0) {
            l9 = ((long)n8 + (long)this.c) / 2L;
            l8 = 1L;
            return l9 + l8;
        }
        n8 = this.a;
        l9 = n8 == this.b && n8 > 0 ? (long)n8 : 4096L;
        l9 = l9 * (long)this.g * (long)this.h / 8L;
        l8 = 64L;
        return l9 + l8;
    }

    public long f() {
        long l8 = this.j;
        if (l8 == 0L) {
            return -9223372036854775807L;
        }
        return l8 * 1000000L / (long)this.e;
    }

    public v g(byte[] byArray, C c8) {
        byArray[4] = -128;
        int n8 = this.d;
        if (n8 <= 0) {
            n8 = -1;
        }
        c8 = this.h(c8);
        return new v.b().y0("audio/flac").o0(n8).T(this.g).z0(this.e).s0(d0.j0(this.h)).k0(Collections.singletonList(byArray)).r0(c8).P();
    }

    public C h(C c8) {
        C c9 = this.l;
        if (c9 == null) {
            return c8;
        }
        return c9.b(c8);
    }

    public long i(long l8) {
        return d0.q(l8 * (long)this.e / 1000000L, 0L, this.j - 1L);
    }

    public static class a {
        public final long[] a;
        public final long[] b;

        public a(long[] lArray, long[] lArray2) {
            this.a = lArray;
            this.b = lArray2;
        }
    }
}

