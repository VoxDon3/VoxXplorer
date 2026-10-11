package ax.P0;

import android.os.Bundle;
import android.text.TextUtils;
import ax.S0.C0968a;
import ax.S0.C0974g;
import ax.S0.d0;
import ax.q7.C2880g;
import ax.q7.InterfaceC2879f;
import ax.r7.AbstractC2991z;
import ax.t7.C3104a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* renamed from: ax.P0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0912v {
    public final int A;
    public final float B;
    public final byte[] C;
    public final int D;
    public final C0901j E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    private int Q;
    public final String a;
    public final String b;
    public final List<C0914x> c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final C l;
    public final Object m;
    public final String n;
    public final String o;
    public final int p;
    public final int q;
    public final List<byte[]> r;
    public final C0906o s;
    public final long t;
    public final boolean u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final float z;
    private static final C0912v R = new b().P();
    private static final String S = d0.G0(0);
    private static final String T = d0.G0(1);
    private static final String U = d0.G0(2);
    private static final String V = d0.G0(3);
    private static final String W = d0.G0(4);
    private static final String X = d0.G0(5);
    private static final String Y = d0.G0(6);
    private static final String Z = d0.G0(7);
    private static final String a0 = d0.G0(8);
    private static final String b0 = d0.G0(9);
    private static final String c0 = d0.G0(10);
    private static final String d0 = d0.G0(11);
    private static final String e0 = d0.G0(12);
    private static final String f0 = d0.G0(13);
    private static final String g0 = d0.G0(14);
    private static final String h0 = d0.G0(15);
    private static final String i0 = d0.G0(16);
    private static final String j0 = d0.G0(17);
    private static final String k0 = d0.G0(18);
    private static final String l0 = d0.G0(19);
    private static final String m0 = d0.G0(20);
    private static final String n0 = d0.G0(21);
    private static final String o0 = d0.G0(22);
    private static final String p0 = d0.G0(23);
    private static final String q0 = d0.G0(24);
    private static final String r0 = d0.G0(25);
    private static final String s0 = d0.G0(26);
    private static final String t0 = d0.G0(27);
    private static final String u0 = d0.G0(28);
    private static final String v0 = d0.G0(29);
    private static final String w0 = d0.G0(30);
    private static final String x0 = d0.G0(31);
    private static final String y0 = d0.G0(32);
    private static final String z0 = d0.G0(33);
    private static final String A0 = d0.G0(34);
    private static final String B0 = d0.G0(35);
    private static final String C0 = d0.G0(36);

    /* renamed from: ax.P0.v$b */
    public static final class b {
        private float A;
        private byte[] B;
        private int C;
        private C0901j D;
        private int E;
        private int F;
        private int G;
        private int H;
        private int I;
        private int J;
        private int K;
        private int L;
        private int M;
        private int N;
        private int O;
        private String a;
        private String b;
        private List<C0914x> c;
        private String d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private String j;
        private C k;
        private Object l;
        private String m;
        private String n;
        private int o;
        private int p;
        private List<byte[]> q;
        private C0906o r;
        private long s;
        private boolean t;
        private int u;
        private int v;
        private int w;
        private int x;
        private float y;
        private int z;

        public b A0(int i) {
            this.e = i;
            return this;
        }

        public b B0(int i) {
            this.C = i;
            return this;
        }

        public b C0(long j) {
            this.s = j;
            return this;
        }

        public b D0(int i) {
            this.M = i;
            return this;
        }

        public b E0(int i) {
            this.N = i;
            return this;
        }

        public b F0(int i) {
            this.u = i;
            return this;
        }

        public C0912v P() {
            return new C0912v(this);
        }

        public b Q(int i) {
            this.K = i;
            return this;
        }

        public b R(int i) {
            this.g = i;
            return this;
        }

        public b S(int i) {
            this.h = i;
            return this;
        }

        public b T(int i) {
            this.F = i;
            return this;
        }

        public b U(String str) {
            this.j = str;
            return this;
        }

        public b V(C0901j c0901j) {
            this.D = c0901j;
            return this;
        }

        public b W(String str) {
            this.m = D.t(str);
            return this;
        }

        public b X(int i) {
            this.O = i;
            return this;
        }

        public b Y(int i) {
            this.L = i;
            return this;
        }

        public b Z(Object obj) {
            this.l = obj;
            return this;
        }

        public b a0(int i) {
            this.x = i;
            return this;
        }

        public b b0(int i) {
            this.w = i;
            return this;
        }

        public b c0(C0906o c0906o) {
            this.r = c0906o;
            return this;
        }

        public b d0(int i) {
            this.I = i;
            return this;
        }

        public b e0(int i) {
            this.J = i;
            return this;
        }

        public b f0(float f) {
            this.y = f;
            return this;
        }

        public b g0(boolean z) {
            this.t = z;
            return this;
        }

        public b h0(int i) {
            this.v = i;
            return this;
        }

        public b i0(int i) {
            this.a = Integer.toString(i);
            return this;
        }

        public b j0(String str) {
            this.a = str;
            return this;
        }

        public b k0(List<byte[]> list) {
            this.q = list;
            return this;
        }

        public b l0(String str) {
            this.b = str;
            return this;
        }

        public b m0(List<C0914x> list) {
            this.c = AbstractC2991z.u(list);
            return this;
        }

        public b n0(String str) {
            this.d = str;
            return this;
        }

        public b o0(int i) {
            this.o = i;
            return this;
        }

        public b p0(int i) {
            this.p = i;
            return this;
        }

        public b q0(int i) {
            this.E = i;
            return this;
        }

        public b r0(C c) {
            this.k = c;
            return this;
        }

        public b s0(int i) {
            this.H = i;
            return this;
        }

        public b t0(int i) {
            this.i = i;
            return this;
        }

        public b u0(float f) {
            this.A = f;
            return this;
        }

        public b v0(byte[] bArr) {
            this.B = bArr;
            return this;
        }

        public b w0(int i) {
            this.f = i;
            return this;
        }

        public b x0(int i) {
            this.z = i;
            return this;
        }

        public b y0(String str) {
            this.n = D.t(str);
            return this;
        }

        public b z0(int i) {
            this.G = i;
            return this;
        }

        public b() {
            this.c = AbstractC2991z.z();
            this.h = -1;
            this.i = -1;
            this.o = -1;
            this.p = -1;
            this.s = Long.MAX_VALUE;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = -1;
            this.y = -1.0f;
            this.A = 1.0f;
            this.C = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            this.H = -1;
            this.K = -1;
            this.L = 1;
            this.M = -1;
            this.N = -1;
            this.O = 0;
            this.g = 0;
        }

        private b(C0912v c0912v) {
            this.a = c0912v.a;
            this.b = c0912v.b;
            this.c = c0912v.c;
            this.d = c0912v.d;
            this.e = c0912v.e;
            this.f = c0912v.f;
            this.h = c0912v.h;
            this.i = c0912v.i;
            this.j = c0912v.k;
            this.k = c0912v.l;
            this.l = c0912v.m;
            this.m = c0912v.n;
            this.n = c0912v.o;
            this.o = c0912v.p;
            this.p = c0912v.q;
            this.q = c0912v.r;
            this.r = c0912v.s;
            this.s = c0912v.t;
            this.t = c0912v.u;
            this.u = c0912v.v;
            this.v = c0912v.w;
            this.w = c0912v.x;
            this.x = c0912v.y;
            this.y = c0912v.z;
            this.z = c0912v.A;
            this.A = c0912v.B;
            this.B = c0912v.C;
            this.C = c0912v.D;
            this.D = c0912v.E;
            this.E = c0912v.F;
            this.F = c0912v.G;
            this.G = c0912v.H;
            this.H = c0912v.I;
            this.I = c0912v.J;
            this.J = c0912v.K;
            this.K = c0912v.L;
            this.L = c0912v.M;
            this.M = c0912v.N;
            this.N = c0912v.O;
            this.O = c0912v.P;
        }
    }

    public static /* synthetic */ String a(C0914x c0914x) {
        return c0914x.a + ": " + c0914x.b;
    }

    private static <T> T d(T t, T t2) {
        return t != null ? t : t2;
    }

    public static C0912v e(Bundle bundle) {
        b bVar = new b();
        C0974g.a(bundle);
        String string = bundle.getString(S);
        C0912v c0912v = R;
        bVar.j0((String) d(string, c0912v.a)).l0((String) d(bundle.getString(T), c0912v.b));
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(y0);
        bVar.m0(parcelableArrayList == null ? AbstractC2991z.z() : C0974g.b(new InterfaceC2879f() { // from class: ax.P0.u
            @Override // ax.q7.InterfaceC2879f
            public final Object apply(Object obj) {
                return C0914x.a((Bundle) obj);
            }
        }, parcelableArrayList)).n0((String) d(bundle.getString(U), c0912v.d)).A0(bundle.getInt(V, c0912v.e)).w0(bundle.getInt(W, c0912v.f)).R(bundle.getInt(z0, c0912v.g)).S(bundle.getInt(X, c0912v.h)).t0(bundle.getInt(Y, c0912v.i)).U((String) d(bundle.getString(Z), c0912v.k)).W((String) d(bundle.getString(b0), c0912v.n)).y0((String) d(bundle.getString(c0), c0912v.o)).o0(bundle.getInt(d0, c0912v.p));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(j(i));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i++;
        }
        b c02 = bVar.k0(arrayList).c0((C0906o) bundle.getParcelable(f0));
        String str = g0;
        C0912v c0912v2 = R;
        c02.C0(bundle.getLong(str, c0912v2.t)).F0(bundle.getInt(h0, c0912v2.v)).h0(bundle.getInt(i0, c0912v2.w)).b0(bundle.getInt(B0, c0912v2.x)).a0(bundle.getInt(C0, c0912v2.y)).f0(bundle.getFloat(j0, c0912v2.z)).x0(bundle.getInt(k0, c0912v2.A)).u0(bundle.getFloat(l0, c0912v2.B)).v0(bundle.getByteArray(m0)).B0(bundle.getInt(n0, c0912v2.D)).q0(bundle.getInt(A0, c0912v2.F));
        Bundle bundle2 = bundle.getBundle(o0);
        if (bundle2 != null) {
            bVar.V(C0901j.f(bundle2));
        }
        bVar.T(bundle.getInt(p0, c0912v2.G)).z0(bundle.getInt(q0, c0912v2.H)).s0(bundle.getInt(r0, c0912v2.I)).d0(bundle.getInt(s0, c0912v2.J)).e0(bundle.getInt(t0, c0912v2.K)).Q(bundle.getInt(u0, c0912v2.L)).D0(bundle.getInt(w0, c0912v2.N)).E0(bundle.getInt(x0, c0912v2.O)).X(bundle.getInt(v0, c0912v2.P));
        return bVar.P();
    }

    private static String f(List<C0914x> list, String str) {
        for (C0914x c0914x : list) {
            if (TextUtils.equals(c0914x.a, str)) {
                return c0914x.b;
            }
        }
        return list.get(0).b;
    }

    private static boolean i(b bVar) {
        if (bVar.c.isEmpty() && bVar.b == null) {
            return true;
        }
        for (int i = 0; i < bVar.c.size(); i++) {
            if (((C0914x) bVar.c.get(i)).b.equals(bVar.b)) {
                return true;
            }
        }
        return false;
    }

    private static String j(int i) {
        return e0 + "_" + Integer.toString(i, 36);
    }

    public static String l(C0912v c0912v) {
        if (c0912v == null) {
            return "null";
        }
        C2880g f = C2880g.f(',');
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(c0912v.a);
        sb.append(", mimeType=");
        sb.append(c0912v.o);
        if (c0912v.n != null) {
            sb.append(", container=");
            sb.append(c0912v.n);
        }
        if (c0912v.j != -1) {
            sb.append(", bitrate=");
            sb.append(c0912v.j);
        }
        if (c0912v.k != null) {
            sb.append(", codecs=");
            sb.append(c0912v.k);
        }
        if (c0912v.s != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (true) {
                C0906o c0906o = c0912v.s;
                if (i >= c0906o.e0) {
                    break;
                }
                UUID uuid = c0906o.e(i).c0;
                if (uuid.equals(C0900i.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(C0900i.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(C0900i.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(C0900i.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(C0900i.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add("unknown (" + uuid + ")");
                }
                i++;
            }
            sb.append(", drm=[");
            f.b(sb, linkedHashSet);
            sb.append(']');
        }
        if (c0912v.v != -1 && c0912v.w != -1) {
            sb.append(", res=");
            sb.append(c0912v.v);
            sb.append("x");
            sb.append(c0912v.w);
        }
        if (c0912v.x != -1 && c0912v.y != -1) {
            sb.append(", decRes=");
            sb.append(c0912v.x);
            sb.append("x");
            sb.append(c0912v.y);
        }
        if (!C3104a.a(c0912v.B, 1.0d, 0.001d)) {
            sb.append(", par=");
            sb.append(d0.G("%.3f", Float.valueOf(c0912v.B)));
        }
        C0901j c0901j = c0912v.E;
        if (c0901j != null && c0901j.j()) {
            sb.append(", color=");
            sb.append(c0912v.E.o());
        }
        if (c0912v.z != -1.0f) {
            sb.append(", fps=");
            sb.append(c0912v.z);
        }
        if (c0912v.F != -1) {
            sb.append(", maxSubLayers=");
            sb.append(c0912v.F);
        }
        if (c0912v.G != -1) {
            sb.append(", channels=");
            sb.append(c0912v.G);
        }
        if (c0912v.H != -1) {
            sb.append(", sample_rate=");
            sb.append(c0912v.H);
        }
        if (c0912v.d != null) {
            sb.append(", language=");
            sb.append(c0912v.d);
        }
        if (!c0912v.c.isEmpty()) {
            sb.append(", labels=[");
            f.b(sb, ax.r7.I.i(c0912v.c, new InterfaceC2879f() { // from class: ax.P0.t
                @Override // ax.q7.InterfaceC2879f
                public final Object apply(Object obj) {
                    return C0912v.a((C0914x) obj);
                }
            }));
            sb.append("]");
        }
        if (c0912v.e != 0) {
            sb.append(", selectionFlags=[");
            f.b(sb, d0.p0(c0912v.e));
            sb.append("]");
        }
        if (c0912v.f != 0) {
            sb.append(", roleFlags=[");
            f.b(sb, d0.o0(c0912v.f));
            sb.append("]");
        }
        if (c0912v.m != null) {
            sb.append(", customData=");
            sb.append(c0912v.m);
        }
        if ((c0912v.f & 32768) != 0) {
            sb.append(", auxiliaryTrackType=");
            sb.append(d0.N(c0912v.g));
        }
        return sb.toString();
    }

    public b b() {
        return new b();
    }

    public C0912v c(int i) {
        return b().X(i).P();
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && C0912v.class == obj.getClass()) {
            C0912v c0912v = (C0912v) obj;
            int i2 = this.Q;
            if ((i2 == 0 || (i = c0912v.Q) == 0 || i2 == i) && this.e == c0912v.e && this.f == c0912v.f && this.g == c0912v.g && this.h == c0912v.h && this.i == c0912v.i && this.p == c0912v.p && this.t == c0912v.t && this.v == c0912v.v && this.w == c0912v.w && this.x == c0912v.x && this.y == c0912v.y && this.A == c0912v.A && this.D == c0912v.D && this.F == c0912v.F && this.G == c0912v.G && this.H == c0912v.H && this.I == c0912v.I && this.J == c0912v.J && this.K == c0912v.K && this.L == c0912v.L && this.N == c0912v.N && this.O == c0912v.O && this.P == c0912v.P && Float.compare(this.z, c0912v.z) == 0 && Float.compare(this.B, c0912v.B) == 0 && Objects.equals(this.a, c0912v.a) && Objects.equals(this.b, c0912v.b) && this.c.equals(c0912v.c) && Objects.equals(this.k, c0912v.k) && Objects.equals(this.n, c0912v.n) && Objects.equals(this.o, c0912v.o) && Objects.equals(this.d, c0912v.d) && Arrays.equals(this.C, c0912v.C) && Objects.equals(this.l, c0912v.l) && Objects.equals(this.E, c0912v.E) && Objects.equals(this.s, c0912v.s) && h(c0912v) && Objects.equals(this.m, c0912v.m)) {
                return true;
            }
        }
        return false;
    }

    public int g() {
        int i;
        int i2 = this.v;
        if (i2 == -1 || (i = this.w) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public boolean h(C0912v c0912v) {
        if (this.r.size() != c0912v.r.size()) {
            return false;
        }
        for (int i = 0; i < this.r.size(); i++) {
            if (!Arrays.equals(this.r.get(i), c0912v.r.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (this.Q == 0) {
            String str = this.a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.c.hashCode()) * 31;
            String str3 = this.d;
            int hashCode3 = (((((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
            String str4 = this.k;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            C c = this.l;
            int hashCode5 = (hashCode4 + (c == null ? 0 : c.hashCode())) * 31;
            Object obj = this.m;
            int hashCode6 = (hashCode5 + (obj == null ? 0 : obj.hashCode())) * 31;
            String str5 = this.n;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.o;
            this.Q = ((((((((((((((((((((((((((((((((((((((((hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.p) * 31) + ((int) this.t)) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + Float.floatToIntBits(this.z)) * 31) + this.A) * 31) + Float.floatToIntBits(this.B)) * 31) + this.D) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.N) * 31) + this.O) * 31) + this.P;
        }
        return this.Q;
    }

    public Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putString(S, this.a);
        bundle.putString(T, this.b);
        bundle.putParcelableArrayList(y0, C0974g.d(this.c, new InterfaceC2879f() { // from class: ax.P0.s
            @Override // ax.q7.InterfaceC2879f
            public final Object apply(Object obj) {
                return ((C0914x) obj).b();
            }
        }));
        bundle.putString(U, this.d);
        bundle.putInt(V, this.e);
        bundle.putInt(W, this.f);
        int i = this.g;
        if (i != R.g) {
            bundle.putInt(z0, i);
        }
        bundle.putInt(X, this.h);
        bundle.putInt(Y, this.i);
        bundle.putString(Z, this.k);
        bundle.putString(b0, this.n);
        bundle.putString(c0, this.o);
        bundle.putInt(d0, this.p);
        for (int i2 = 0; i2 < this.r.size(); i2++) {
            bundle.putByteArray(j(i2), this.r.get(i2));
        }
        bundle.putParcelable(f0, this.s);
        bundle.putLong(g0, this.t);
        bundle.putInt(h0, this.v);
        bundle.putInt(i0, this.w);
        bundle.putInt(B0, this.x);
        bundle.putInt(C0, this.y);
        bundle.putFloat(j0, this.z);
        bundle.putInt(k0, this.A);
        bundle.putFloat(l0, this.B);
        bundle.putByteArray(m0, this.C);
        bundle.putInt(n0, this.D);
        C0901j c0901j = this.E;
        if (c0901j != null) {
            bundle.putBundle(o0, c0901j.n());
        }
        bundle.putInt(A0, this.F);
        bundle.putInt(p0, this.G);
        bundle.putInt(q0, this.H);
        bundle.putInt(r0, this.I);
        bundle.putInt(s0, this.J);
        bundle.putInt(t0, this.K);
        bundle.putInt(u0, this.L);
        bundle.putInt(w0, this.N);
        bundle.putInt(x0, this.O);
        bundle.putInt(v0, this.P);
        return bundle;
    }

    public C0912v m(C0912v c0912v) {
        String str;
        if (this == c0912v) {
            return this;
        }
        int k = D.k(this.o);
        String str2 = c0912v.a;
        int i = c0912v.N;
        int i2 = c0912v.O;
        String str3 = c0912v.b;
        if (str3 == null) {
            str3 = this.b;
        }
        List<C0914x> list = !c0912v.c.isEmpty() ? c0912v.c : this.c;
        String str4 = this.d;
        if ((k == 3 || k == 1) && (str = c0912v.d) != null) {
            str4 = str;
        }
        int i3 = this.h;
        if (i3 == -1) {
            i3 = c0912v.h;
        }
        int i4 = this.i;
        if (i4 == -1) {
            i4 = c0912v.i;
        }
        String str5 = this.k;
        if (str5 == null) {
            String S2 = d0.S(c0912v.k, k);
            if (d0.z1(S2).length == 1) {
                str5 = S2;
            }
        }
        C c = this.l;
        C b2 = c == null ? c0912v.l : c.b(c0912v.l);
        float f = this.z;
        if (f == -1.0f && k == 2) {
            f = c0912v.z;
        }
        return b().j0(str2).l0(str3).m0(list).n0(str4).A0(this.e | c0912v.e).w0(this.f | c0912v.f).S(i3).t0(i4).U(str5).r0(b2).c0(C0906o.d(c0912v.s, this.s)).f0(f).D0(i).E0(i2).P();
    }

    public String toString() {
        return "Format(" + this.a + ", " + this.b + ", " + this.n + ", " + this.o + ", " + this.k + ", " + this.j + ", " + this.d + ", [" + this.v + ", " + this.w + ", " + this.z + ", " + this.E + "], [" + this.G + ", " + this.H + "])";
    }

    private C0912v(b bVar) {
        this.a = bVar.a;
        String d1 = d0.d1(bVar.d);
        this.d = d1;
        if (bVar.c.isEmpty() && bVar.b != null) {
            this.c = AbstractC2991z.A(new C0914x(d1, bVar.b));
            this.b = bVar.b;
        } else if (bVar.c.isEmpty() || bVar.b != null) {
            C0968a.g(i(bVar));
            this.c = bVar.c;
            this.b = bVar.b;
        } else {
            this.c = bVar.c;
            this.b = f(bVar.c, d1);
        }
        this.e = bVar.e;
        C0968a.h(bVar.g == 0 || (bVar.f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f = bVar.f;
        this.g = bVar.g;
        int i = bVar.h;
        this.h = i;
        int i2 = bVar.i;
        this.i = i2;
        this.j = i2 != -1 ? i2 : i;
        this.k = bVar.j;
        this.l = bVar.k;
        this.m = bVar.l;
        this.n = bVar.m;
        this.o = bVar.n;
        this.p = bVar.o;
        this.q = bVar.p;
        this.r = bVar.q == null ? Collections.EMPTY_LIST : bVar.q;
        C0906o c0906o = bVar.r;
        this.s = c0906o;
        this.t = bVar.s;
        this.u = bVar.t;
        this.v = bVar.u;
        this.w = bVar.v;
        this.x = bVar.w;
        this.y = bVar.x;
        this.z = bVar.y;
        this.A = bVar.z == -1 ? 0 : bVar.z;
        this.B = bVar.A == -1.0f ? 1.0f : bVar.A;
        this.C = bVar.B;
        this.D = bVar.C;
        this.E = bVar.D;
        this.F = bVar.E;
        this.G = bVar.F;
        this.H = bVar.G;
        this.I = bVar.H;
        this.J = bVar.I == -1 ? 0 : bVar.I;
        this.K = bVar.J != -1 ? bVar.J : 0;
        this.L = bVar.K;
        this.M = bVar.L;
        this.N = bVar.M;
        this.O = bVar.N;
        if (bVar.O != 0 || c0906o == null) {
            this.P = bVar.O;
        } else {
            this.P = 1;
        }
    }
}
