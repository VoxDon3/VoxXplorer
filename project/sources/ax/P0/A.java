package ax.P0;

import android.net.Uri;
import android.os.Bundle;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.r7.AbstractC2991z;
import j$.util.Objects;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class A {
    public static final A I = new b().J();
    private static final String J = d0.G0(0);
    private static final String K = d0.G0(1);
    private static final String L = d0.G0(2);
    private static final String M = d0.G0(3);
    private static final String N = d0.G0(4);
    private static final String O = d0.G0(5);
    private static final String P = d0.G0(6);
    private static final String Q = d0.G0(8);
    private static final String R = d0.G0(9);
    private static final String S = d0.G0(10);
    private static final String T = d0.G0(11);
    private static final String U = d0.G0(12);
    private static final String V = d0.G0(13);
    private static final String W = d0.G0(14);
    private static final String X = d0.G0(15);
    private static final String Y = d0.G0(16);
    private static final String Z = d0.G0(17);
    private static final String a0 = d0.G0(18);
    private static final String b0 = d0.G0(19);
    private static final String c0 = d0.G0(20);
    private static final String d0 = d0.G0(21);
    private static final String e0 = d0.G0(22);
    private static final String f0 = d0.G0(23);
    private static final String g0 = d0.G0(24);
    private static final String h0 = d0.G0(25);
    private static final String i0 = d0.G0(26);
    private static final String j0 = d0.G0(27);
    private static final String k0 = d0.G0(28);
    private static final String l0 = d0.G0(29);
    private static final String m0 = d0.G0(30);
    private static final String n0 = d0.G0(31);
    private static final String o0 = d0.G0(32);
    private static final String p0 = d0.G0(33);
    private static final String q0 = d0.G0(34);
    private static final String r0 = d0.G0(1000);
    public final Integer A;
    public final Integer B;
    public final CharSequence C;
    public final CharSequence D;
    public final CharSequence E;
    public final Integer F;
    public final Bundle G;
    public final AbstractC2991z<String> H;
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

    public static final class b {
        private Integer A;
        private CharSequence B;
        private CharSequence C;
        private CharSequence D;
        private Integer E;
        private Bundle F;
        private AbstractC2991z<String> G;
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

        static /* synthetic */ K d(b bVar) {
            bVar.getClass();
            return null;
        }

        static /* synthetic */ K e(b bVar) {
            bVar.getClass();
            return null;
        }

        public A J() {
            return new A(this);
        }

        public b K(byte[] bArr, int i) {
            if (this.i != null && i != 3 && Objects.equals(this.j, 3)) {
                return this;
            }
            this.i = (byte[]) bArr.clone();
            this.j = Integer.valueOf(i);
            return this;
        }

        public b L(A a) {
            if (a != null) {
                CharSequence charSequence = a.a;
                if (charSequence != null) {
                    p0(charSequence);
                }
                CharSequence charSequence2 = a.b;
                if (charSequence2 != null) {
                    Q(charSequence2);
                }
                CharSequence charSequence3 = a.c;
                if (charSequence3 != null) {
                    P(charSequence3);
                }
                CharSequence charSequence4 = a.d;
                if (charSequence4 != null) {
                    O(charSequence4);
                }
                CharSequence charSequence5 = a.e;
                if (charSequence5 != null) {
                    Y(charSequence5);
                }
                CharSequence charSequence6 = a.f;
                if (charSequence6 != null) {
                    n0(charSequence6);
                }
                CharSequence charSequence7 = a.g;
                if (charSequence7 != null) {
                    W(charSequence7);
                }
                Long l = a.h;
                if (l != null) {
                    Z(l);
                }
                Uri uri = a.k;
                if (uri != null || a.i != null) {
                    S(uri);
                    R(a.i, a.j);
                }
                Integer num = a.l;
                if (num != null) {
                    s0(num);
                }
                Integer num2 = a.m;
                if (num2 != null) {
                    r0(num2);
                }
                Integer num3 = a.n;
                if (num3 != null) {
                    b0(num3);
                }
                Boolean bool = a.o;
                if (bool != null) {
                    d0(bool);
                }
                Boolean bool2 = a.p;
                if (bool2 != null) {
                    e0(bool2);
                }
                Integer num4 = a.q;
                if (num4 != null) {
                    i0(num4);
                }
                Integer num5 = a.r;
                if (num5 != null) {
                    i0(num5);
                }
                Integer num6 = a.s;
                if (num6 != null) {
                    h0(num6);
                }
                Integer num7 = a.t;
                if (num7 != null) {
                    g0(num7);
                }
                Integer num8 = a.u;
                if (num8 != null) {
                    l0(num8);
                }
                Integer num9 = a.v;
                if (num9 != null) {
                    k0(num9);
                }
                Integer num10 = a.w;
                if (num10 != null) {
                    j0(num10);
                }
                CharSequence charSequence8 = a.x;
                if (charSequence8 != null) {
                    t0(charSequence8);
                }
                CharSequence charSequence9 = a.y;
                if (charSequence9 != null) {
                    U(charSequence9);
                }
                CharSequence charSequence10 = a.z;
                if (charSequence10 != null) {
                    V(charSequence10);
                }
                Integer num11 = a.A;
                if (num11 != null) {
                    X(num11);
                }
                Integer num12 = a.B;
                if (num12 != null) {
                    q0(num12);
                }
                CharSequence charSequence11 = a.C;
                if (charSequence11 != null) {
                    c0(charSequence11);
                }
                CharSequence charSequence12 = a.D;
                if (charSequence12 != null) {
                    T(charSequence12);
                }
                CharSequence charSequence13 = a.E;
                if (charSequence13 != null) {
                    m0(charSequence13);
                }
                Integer num13 = a.F;
                if (num13 != null) {
                    f0(num13);
                }
                Bundle bundle = a.G;
                if (bundle != null) {
                    a0(bundle);
                }
                if (!a.H.isEmpty()) {
                    o0(a.H);
                }
            }
            return this;
        }

        public b M(C c) {
            for (int i = 0; i < c.e(); i++) {
                c.d(i).b(this);
            }
            return this;
        }

        public b N(List<C> list) {
            for (int i = 0; i < list.size(); i++) {
                C c = list.get(i);
                for (int i2 = 0; i2 < c.e(); i2++) {
                    c.d(i2).b(this);
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

        public b R(byte[] bArr, Integer num) {
            this.i = bArr == null ? null : (byte[]) bArr.clone();
            this.j = num;
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

        public b X(Integer num) {
            this.z = num;
            return this;
        }

        public b Y(CharSequence charSequence) {
            this.e = charSequence;
            return this;
        }

        public b Z(Long l) {
            C0968a.a(l == null || l.longValue() >= 0);
            this.h = l;
            return this;
        }

        public b a0(Bundle bundle) {
            this.F = bundle;
            return this;
        }

        @Deprecated
        public b b0(Integer num) {
            this.n = num;
            return this;
        }

        public b c0(CharSequence charSequence) {
            this.B = charSequence;
            return this;
        }

        public b d0(Boolean bool) {
            this.o = bool;
            return this;
        }

        public b e0(Boolean bool) {
            this.p = bool;
            return this;
        }

        public b f0(Integer num) {
            this.E = num;
            return this;
        }

        public b g0(Integer num) {
            this.s = num;
            return this;
        }

        public b h0(Integer num) {
            this.r = num;
            return this;
        }

        public b i0(Integer num) {
            this.q = num;
            return this;
        }

        public b j0(Integer num) {
            this.v = num;
            return this;
        }

        public b k0(Integer num) {
            this.u = num;
            return this;
        }

        public b l0(Integer num) {
            this.t = num;
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
            this.G = AbstractC2991z.u(list);
            return this;
        }

        public b p0(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        public b q0(Integer num) {
            this.A = num;
            return this;
        }

        public b r0(Integer num) {
            this.m = num;
            return this;
        }

        public b s0(Integer num) {
            this.l = num;
            return this;
        }

        public b t0(CharSequence charSequence) {
            this.w = charSequence;
            return this;
        }

        public b() {
            this.G = AbstractC2991z.z();
        }

        private b(A a) {
            this.a = a.a;
            this.b = a.b;
            this.c = a.c;
            this.d = a.d;
            this.e = a.e;
            this.f = a.f;
            this.g = a.g;
            this.h = a.h;
            this.i = a.i;
            this.j = a.j;
            this.k = a.k;
            this.l = a.l;
            this.m = a.m;
            this.n = a.n;
            this.o = a.o;
            this.p = a.p;
            this.q = a.r;
            this.r = a.s;
            this.s = a.t;
            this.t = a.u;
            this.u = a.v;
            this.v = a.w;
            this.w = a.x;
            this.x = a.y;
            this.y = a.z;
            this.z = a.A;
            this.A = a.B;
            this.B = a.C;
            this.C = a.D;
            this.D = a.E;
            this.E = a.F;
            this.G = a.H;
            this.F = a.G;
        }
    }

    private static int b(int i) {
        switch (i) {
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
                return 1;
            case 20:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            default:
                return 0;
            case 21:
                return 2;
            case 22:
                return 3;
            case 23:
                return 4;
            case 24:
                return 5;
            case 25:
                return 6;
        }
    }

    private static int c(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 21;
            case 3:
                return 22;
            case 4:
                return 23;
            case 5:
                return 24;
            case 6:
                return 25;
            default:
                return 20;
        }
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && A.class == obj.getClass()) {
            A a2 = (A) obj;
            if (Objects.equals(this.a, a2.a) && Objects.equals(this.b, a2.b) && Objects.equals(this.c, a2.c) && Objects.equals(this.d, a2.d) && Objects.equals(this.e, a2.e) && Objects.equals(this.f, a2.f) && Objects.equals(this.g, a2.g) && Objects.equals(this.h, a2.h) && Arrays.equals(this.i, a2.i) && Objects.equals(this.j, a2.j) && Objects.equals(this.k, a2.k) && Objects.equals(this.l, a2.l) && Objects.equals(this.m, a2.m) && Objects.equals(this.n, a2.n) && Objects.equals(this.o, a2.o) && Objects.equals(this.p, a2.p) && Objects.equals(this.r, a2.r) && Objects.equals(this.s, a2.s) && Objects.equals(this.t, a2.t) && Objects.equals(this.u, a2.u) && Objects.equals(this.v, a2.v) && Objects.equals(this.w, a2.w) && Objects.equals(this.x, a2.x) && Objects.equals(this.y, a2.y) && Objects.equals(this.z, a2.z) && Objects.equals(this.A, a2.A) && Objects.equals(this.B, a2.B) && Objects.equals(this.C, a2.C) && Objects.equals(this.D, a2.D) && Objects.equals(this.E, a2.E) && Objects.equals(this.F, a2.F) && Objects.equals(this.H, a2.H)) {
                if ((this.G == null) == (a2.G == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null, null, Integer.valueOf(Arrays.hashCode(this.i)), this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, Boolean.valueOf(this.G == null), this.H);
    }

    private A(b bVar) {
        Boolean bool = bVar.o;
        Integer num = bVar.n;
        Integer num2 = bVar.E;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                num = Integer.valueOf(num2 != null ? b(num2.intValue()) : 0);
            }
        } else if (num != null) {
            boolean z = num.intValue() != -1;
            bool = Boolean.valueOf(z);
            if (z && num2 == null) {
                num2 = Integer.valueOf(c(num.intValue()));
            }
        }
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        b.d(bVar);
        b.e(bVar);
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.m = bVar.m;
        this.n = num;
        this.o = bool;
        this.p = bVar.p;
        this.q = bVar.q;
        this.r = bVar.q;
        this.s = bVar.r;
        this.t = bVar.s;
        this.u = bVar.t;
        this.v = bVar.u;
        this.w = bVar.v;
        this.x = bVar.w;
        this.y = bVar.x;
        this.z = bVar.y;
        this.A = bVar.z;
        this.B = bVar.A;
        this.C = bVar.B;
        this.D = bVar.C;
        this.E = bVar.D;
        this.F = num2;
        this.H = bVar.G;
        this.G = bVar.F;
    }
}
