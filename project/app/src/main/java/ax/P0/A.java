/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.net.Uri;
import android.os.Bundle;
import ax.P0.C;
import ax.P0.K;
import ax.S0.a;
import ax.S0.d0;
import ax.r7.z;
import java.util.Arrays;
import java.util.List;

public final class A {
    public static final A I = new b().J();
    private static final String J = ax.S0.d0.G0(0);
    private static final String K = ax.S0.d0.G0(1);
    private static final String L = ax.S0.d0.G0(2);
    private static final String M = ax.S0.d0.G0(3);
    private static final String N = ax.S0.d0.G0(4);
    private static final String O = ax.S0.d0.G0(5);
    private static final String P = ax.S0.d0.G0(6);
    private static final String Q = ax.S0.d0.G0(8);
    private static final String R = ax.S0.d0.G0(9);
    private static final String S = ax.S0.d0.G0(10);
    private static final String T = ax.S0.d0.G0(11);
    private static final String U = ax.S0.d0.G0(12);
    private static final String V = ax.S0.d0.G0(13);
    private static final String W = ax.S0.d0.G0(14);
    private static final String X = ax.S0.d0.G0(15);
    private static final String Y = ax.S0.d0.G0(16);
    private static final String Z = ax.S0.d0.G0(17);
    private static final String a0 = ax.S0.d0.G0(18);
    private static final String b0 = ax.S0.d0.G0(19);
    private static final String c0 = ax.S0.d0.G0(20);
    private static final String d0 = ax.S0.d0.G0(21);
    private static final String e0 = ax.S0.d0.G0(22);
    private static final String f0 = ax.S0.d0.G0(23);
    private static final String g0 = ax.S0.d0.G0(24);
    private static final String h0 = ax.S0.d0.G0(25);
    private static final String i0 = ax.S0.d0.G0(26);
    private static final String j0 = ax.S0.d0.G0(27);
    private static final String k0 = ax.S0.d0.G0(28);
    private static final String l0 = ax.S0.d0.G0(29);
    private static final String m0 = ax.S0.d0.G0(30);
    private static final String n0 = ax.S0.d0.G0(31);
    private static final String o0 = ax.S0.d0.G0(32);
    private static final String p0 = ax.S0.d0.G0(33);
    private static final String q0 = ax.S0.d0.G0(34);
    private static final String r0 = ax.S0.d0.G0(1000);
    public final Integer A;
    public final Integer B;
    public final CharSequence C;
    public final CharSequence D;
    public final CharSequence E;
    public final Integer F;
    public final Bundle G;
    public final z<String> H;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Long h;
    public final byte[] i;
    public final Integer j;
    public final Uri k;
    public final Integer l;
    public final Integer m;
    @Deprecated
    public final Integer n;
    public final Boolean o;
    public final Boolean p;
    @Deprecated
    public final Integer q;
    public final Integer r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final CharSequence x;
    public final CharSequence y;
    public final CharSequence z;

    private A(b b8) {
        Integer n8;
        Boolean bl;
        Integer n9;
        block9: {
            boolean bl2;
            Integer n10;
            Integer n11;
            Boolean bl3;
            block7: {
                int n12;
                block10: {
                    block8: {
                        bl3 = b8.o;
                        n11 = b8.n;
                        n10 = b8.E;
                        bl2 = false;
                        n12 = 0;
                        if (bl3 == null) break block7;
                        if (bl3.booleanValue()) break block8;
                        n9 = -1;
                        bl = bl3;
                        n8 = n10;
                        break block9;
                    }
                    if (n11 == null) break block10;
                    bl = bl3;
                    n9 = n11;
                    n8 = n10;
                    if (n11 != -1) break block9;
                }
                if (n10 != null) {
                    n12 = ax.P0.A.b(n10);
                }
                n9 = n12;
                bl = bl3;
                n8 = n10;
                break block9;
            }
            bl = bl3;
            n9 = n11;
            n8 = n10;
            if (n11 != null) {
                if (n11 != -1) {
                    bl2 = true;
                }
                bl = bl3 = Boolean.valueOf(bl2);
                n9 = n11;
                n8 = n10;
                if (bl2) {
                    bl = bl3;
                    n9 = n11;
                    n8 = n10;
                    if (n10 == null) {
                        n8 = ax.P0.A.c(n11);
                        n9 = n11;
                        bl = bl3;
                    }
                }
            }
        }
        this.a = b8.a;
        this.b = b8.b;
        this.c = b8.c;
        this.d = b8.d;
        this.e = b8.e;
        this.f = b8.f;
        this.g = b8.g;
        this.h = b8.h;
        ax.P0.A$b.d(b8);
        ax.P0.A$b.e(b8);
        this.i = b8.i;
        this.j = b8.j;
        this.k = b8.k;
        this.l = b8.l;
        this.m = b8.m;
        this.n = n9;
        this.o = bl;
        this.p = b8.p;
        this.q = b8.q;
        this.r = b8.q;
        this.s = b8.r;
        this.t = b8.s;
        this.u = b8.t;
        this.v = b8.u;
        this.w = b8.v;
        this.x = b8.w;
        this.y = b8.x;
        this.z = b8.y;
        this.A = b8.z;
        this.B = b8.A;
        this.C = b8.B;
        this.D = b8.C;
        this.E = b8.D;
        this.F = n8;
        this.H = b8.G;
        this.G = b8.F;
    }

    private static int b(int n8) {
        switch (n8) {
            default: {
                return 0;
            }
            case 25: {
                return 6;
            }
            case 24: {
                return 5;
            }
            case 23: {
                return 4;
            }
            case 22: {
                return 3;
            }
            case 21: {
                return 2;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 31: 
            case 32: 
            case 33: 
            case 34: 
            case 35: 
        }
        return 1;
    }

    private static int c(int n8) {
        switch (n8) {
            default: {
                return 20;
            }
            case 6: {
                return 25;
            }
            case 5: {
                return 24;
            }
            case 4: {
                return 23;
            }
            case 3: {
                return 22;
            }
            case 2: {
                return 21;
            }
            case 1: 
        }
        return 0;
    }

    public b a() {
        return new b(this);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && A.class == object.getClass()) {
            boolean bl;
            boolean bl2;
            object = (A)object;
            if (j.Objects.equals((Object)this.a, (Object)((A)object).a) && j.Objects.equals((Object)this.b, (Object)((A)object).b) && j.Objects.equals((Object)this.c, (Object)((A)object).c) && j.Objects.equals((Object)this.d, (Object)((A)object).d) && j.Objects.equals((Object)this.e, (Object)((A)object).e) && j.Objects.equals((Object)this.f, (Object)((A)object).f) && j.Objects.equals((Object)this.g, (Object)((A)object).g) && j.Objects.equals((Object)this.h, (Object)((A)object).h) && Arrays.equals(this.i, ((A)object).i) && j.Objects.equals((Object)this.j, (Object)((A)object).j) && j.Objects.equals((Object)this.k, (Object)((A)object).k) && j.Objects.equals((Object)this.l, (Object)((A)object).l) && j.Objects.equals((Object)this.m, (Object)((A)object).m) && j.Objects.equals((Object)this.n, (Object)((A)object).n) && j.Objects.equals((Object)this.o, (Object)((A)object).o) && j.Objects.equals((Object)this.p, (Object)((A)object).p) && j.Objects.equals((Object)this.r, (Object)((A)object).r) && j.Objects.equals((Object)this.s, (Object)((A)object).s) && j.Objects.equals((Object)this.t, (Object)((A)object).t) && j.Objects.equals((Object)this.u, (Object)((A)object).u) && j.Objects.equals((Object)this.v, (Object)((A)object).v) && j.Objects.equals((Object)this.w, (Object)((A)object).w) && j.Objects.equals((Object)this.x, (Object)((A)object).x) && j.Objects.equals((Object)this.y, (Object)((A)object).y) && j.Objects.equals((Object)this.z, (Object)((A)object).z) && j.Objects.equals((Object)this.A, (Object)((A)object).A) && j.Objects.equals((Object)this.B, (Object)((A)object).B) && j.Objects.equals((Object)this.C, (Object)((A)object).C) && j.Objects.equals((Object)this.D, (Object)((A)object).D) && j.Objects.equals((Object)this.E, (Object)((A)object).E) && j.Objects.equals((Object)this.F, (Object)((A)object).F) && j.Objects.equals(this.H, ((A)object).H) && (bl2 = this.G == null) == (bl = ((A)object).G == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        CharSequence charSequence = this.a;
        CharSequence charSequence2 = this.b;
        CharSequence charSequence3 = this.c;
        CharSequence charSequence4 = this.d;
        CharSequence charSequence5 = this.e;
        CharSequence charSequence6 = this.f;
        CharSequence charSequence7 = this.g;
        Long l8 = this.h;
        int n8 = Arrays.hashCode(this.i);
        Integer n9 = this.j;
        Uri uri = this.k;
        Integer n10 = this.l;
        Integer n11 = this.m;
        Integer n12 = this.n;
        Boolean bl = this.o;
        Boolean bl2 = this.p;
        Integer n13 = this.r;
        Integer n14 = this.s;
        Integer n15 = this.t;
        Integer n16 = this.u;
        Integer n17 = this.v;
        Integer n18 = this.w;
        CharSequence charSequence8 = this.x;
        CharSequence charSequence9 = this.y;
        CharSequence charSequence10 = this.z;
        Integer n19 = this.A;
        Integer n20 = this.B;
        CharSequence charSequence11 = this.C;
        CharSequence charSequence12 = this.D;
        CharSequence charSequence13 = this.E;
        Integer n21 = this.F;
        boolean bl3 = this.G == null;
        return j.Objects.hash((Object[])new Object[]{charSequence, charSequence2, charSequence3, charSequence4, charSequence5, charSequence6, charSequence7, l8, null, null, n8, n9, uri, n10, n11, n12, bl, bl2, n13, n14, n15, n16, n17, n18, charSequence8, charSequence9, charSequence10, n19, n20, charSequence11, charSequence12, charSequence13, n21, bl3, this.H});
    }

    public static final class b {
        private Integer A;
        private CharSequence B;
        private CharSequence C;
        private CharSequence D;
        private Integer E;
        private Bundle F;
        private z<String> G;
        private CharSequence a;
        private CharSequence b;
        private CharSequence c;
        private CharSequence d;
        private CharSequence e;
        private CharSequence f;
        private CharSequence g;
        private Long h;
        private byte[] i;
        private Integer j;
        private Uri k;
        private Integer l;
        private Integer m;
        private Integer n;
        private Boolean o;
        private Boolean p;
        private Integer q;
        private Integer r;
        private Integer s;
        private Integer t;
        private Integer u;
        private Integer v;
        private CharSequence w;
        private CharSequence x;
        private CharSequence y;
        private Integer z;

        public b() {
            this.G = ax.r7.z.z();
        }

        private b(A a8) {
            this.a = a8.a;
            this.b = a8.b;
            this.c = a8.c;
            this.d = a8.d;
            this.e = a8.e;
            this.f = a8.f;
            this.g = a8.g;
            this.h = a8.h;
            this.i = a8.i;
            this.j = a8.j;
            this.k = a8.k;
            this.l = a8.l;
            this.m = a8.m;
            this.n = a8.n;
            this.o = a8.o;
            this.p = a8.p;
            this.q = a8.r;
            this.r = a8.s;
            this.s = a8.t;
            this.t = a8.u;
            this.u = a8.v;
            this.v = a8.w;
            this.w = a8.x;
            this.x = a8.y;
            this.y = a8.z;
            this.z = a8.A;
            this.A = a8.B;
            this.B = a8.C;
            this.C = a8.D;
            this.D = a8.E;
            this.E = a8.F;
            this.G = a8.H;
            this.F = a8.G;
        }

        static /* synthetic */ K d(b b8) {
            b8.getClass();
            return null;
        }

        static /* synthetic */ K e(b b8) {
            b8.getClass();
            return null;
        }

        public A J() {
            return new A(this);
        }

        public b K(byte[] byArray, int n8) {
            if (this.i != null && n8 != 3 && j.Objects.equals((Object)this.j, (Object)3)) {
                return this;
            }
            this.i = (byte[])byArray.clone();
            this.j = n8;
            return this;
        }

        public b L(A a8) {
            if (a8 != null) {
                Object object = a8.a;
                if (object != null) {
                    this.p0((CharSequence)object);
                }
                if ((object = a8.b) != null) {
                    this.Q((CharSequence)object);
                }
                if ((object = a8.c) != null) {
                    this.P((CharSequence)object);
                }
                if ((object = a8.d) != null) {
                    this.O((CharSequence)object);
                }
                if ((object = a8.e) != null) {
                    this.Y((CharSequence)object);
                }
                if ((object = a8.f) != null) {
                    this.n0((CharSequence)object);
                }
                if ((object = a8.g) != null) {
                    this.W((CharSequence)object);
                }
                if ((object = a8.h) != null) {
                    this.Z((Long)object);
                }
                if ((object = a8.k) != null || a8.i != null) {
                    this.S((Uri)object);
                    this.R(a8.i, a8.j);
                }
                if ((object = a8.l) != null) {
                    this.s0((Integer)object);
                }
                if ((object = a8.m) != null) {
                    this.r0((Integer)object);
                }
                if ((object = a8.n) != null) {
                    this.b0((Integer)object);
                }
                if ((object = a8.o) != null) {
                    this.d0((Boolean)object);
                }
                if ((object = a8.p) != null) {
                    this.e0((Boolean)object);
                }
                if ((object = a8.q) != null) {
                    this.i0((Integer)object);
                }
                if ((object = a8.r) != null) {
                    this.i0((Integer)object);
                }
                if ((object = a8.s) != null) {
                    this.h0((Integer)object);
                }
                if ((object = a8.t) != null) {
                    this.g0((Integer)object);
                }
                if ((object = a8.u) != null) {
                    this.l0((Integer)object);
                }
                if ((object = a8.v) != null) {
                    this.k0((Integer)object);
                }
                if ((object = a8.w) != null) {
                    this.j0((Integer)object);
                }
                if ((object = a8.x) != null) {
                    this.t0((CharSequence)object);
                }
                if ((object = a8.y) != null) {
                    this.U((CharSequence)object);
                }
                if ((object = a8.z) != null) {
                    this.V((CharSequence)object);
                }
                if ((object = a8.A) != null) {
                    this.X((Integer)object);
                }
                if ((object = a8.B) != null) {
                    this.q0((Integer)object);
                }
                if ((object = a8.C) != null) {
                    this.c0((CharSequence)object);
                }
                if ((object = a8.D) != null) {
                    this.T((CharSequence)object);
                }
                if ((object = a8.E) != null) {
                    this.m0((CharSequence)object);
                }
                if ((object = a8.F) != null) {
                    this.f0((Integer)object);
                }
                if ((object = a8.G) != null) {
                    this.a0((Bundle)object);
                }
                if (!a8.H.isEmpty()) {
                    this.o0(a8.H);
                }
            }
            return this;
        }

        public b M(C c8) {
            for (int i8 = 0; i8 < c8.e(); ++i8) {
                c8.d(i8).b(this);
            }
            return this;
        }

        public b N(List<C> list) {
            for (int i8 = 0; i8 < list.size(); ++i8) {
                C c8 = list.get(i8);
                for (int i9 = 0; i9 < c8.e(); ++i9) {
                    c8.d(i9).b(this);
                }
            }
            return this;
        }

        public b O(CharSequence charSequence) {
            this.d = charSequence;
            return this;
        }

        public b P(CharSequence charSequence) {
            this.c = charSequence;
            return this;
        }

        public b Q(CharSequence charSequence) {
            this.b = charSequence;
            return this;
        }

        public b R(byte[] object, Integer n8) {
            object = object == null ? null : (byte[])object.clone();
            this.i = object;
            this.j = n8;
            return this;
        }

        public b S(Uri uri) {
            this.k = uri;
            return this;
        }

        public b T(CharSequence charSequence) {
            this.C = charSequence;
            return this;
        }

        public b U(CharSequence charSequence) {
            this.x = charSequence;
            return this;
        }

        public b V(CharSequence charSequence) {
            this.y = charSequence;
            return this;
        }

        public b W(CharSequence charSequence) {
            this.g = charSequence;
            return this;
        }

        public b X(Integer n8) {
            this.z = n8;
            return this;
        }

        public b Y(CharSequence charSequence) {
            this.e = charSequence;
            return this;
        }

        public b Z(Long l8) {
            boolean bl = l8 == null || l8 >= 0L;
            ax.S0.a.a(bl);
            this.h = l8;
            return this;
        }

        public b a0(Bundle bundle) {
            this.F = bundle;
            return this;
        }

        @Deprecated
        public b b0(Integer n8) {
            this.n = n8;
            return this;
        }

        public b c0(CharSequence charSequence) {
            this.B = charSequence;
            return this;
        }

        public b d0(Boolean bl) {
            this.o = bl;
            return this;
        }

        public b e0(Boolean bl) {
            this.p = bl;
            return this;
        }

        public b f0(Integer n8) {
            this.E = n8;
            return this;
        }

        public b g0(Integer n8) {
            this.s = n8;
            return this;
        }

        public b h0(Integer n8) {
            this.r = n8;
            return this;
        }

        public b i0(Integer n8) {
            this.q = n8;
            return this;
        }

        public b j0(Integer n8) {
            this.v = n8;
            return this;
        }

        public b k0(Integer n8) {
            this.u = n8;
            return this;
        }

        public b l0(Integer n8) {
            this.t = n8;
            return this;
        }

        public b m0(CharSequence charSequence) {
            this.D = charSequence;
            return this;
        }

        public b n0(CharSequence charSequence) {
            this.f = charSequence;
            return this;
        }

        public b o0(List<String> list) {
            this.G = ax.r7.z.u(list);
            return this;
        }

        public b p0(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        public b q0(Integer n8) {
            this.A = n8;
            return this;
        }

        public b r0(Integer n8) {
            this.m = n8;
            return this;
        }

        public b s0(Integer n8) {
            this.l = n8;
            return this;
        }

        public b t0(CharSequence charSequence) {
            this.w = charSequence;
            return this;
        }
    }
}

