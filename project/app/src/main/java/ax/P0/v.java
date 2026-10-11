/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import ax.P0.C;
import ax.P0.D;
import ax.P0.i;
import ax.P0.j;
import ax.P0.o;
import ax.P0.s;
import ax.P0.t;
import ax.P0.u;
import ax.P0.x;
import ax.S0.d0;
import ax.S0.g;
import ax.r7.I;
import ax.r7.z;
import ax.t7.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

public final class v {
    private static final String A0;
    private static final String B0;
    private static final String C0;
    private static final v R;
    private static final String S;
    private static final String T;
    private static final String U;
    private static final String V;
    private static final String W;
    private static final String X;
    private static final String Y;
    private static final String Z;
    private static final String a0;
    private static final String b0;
    private static final String c0;
    private static final String d0;
    private static final String e0;
    private static final String f0;
    private static final String g0;
    private static final String h0;
    private static final String i0;
    private static final String j0;
    private static final String k0;
    private static final String l0;
    private static final String m0;
    private static final String n0;
    private static final String o0;
    private static final String p0;
    private static final String q0;
    private static final String r0;
    private static final String s0;
    private static final String t0;
    private static final String u0;
    private static final String v0;
    private static final String w0;
    private static final String x0;
    private static final String y0;
    private static final String z0;
    public final int A;
    public final float B;
    public final byte[] C;
    public final int D;
    public final j E;
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
    public final List<x> c;
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
    public final o s;
    public final long t;
    public final boolean u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final float z;

    static {
        R = new b().P();
        S = ax.S0.d0.G0(0);
        T = ax.S0.d0.G0(1);
        U = ax.S0.d0.G0(2);
        V = ax.S0.d0.G0(3);
        W = ax.S0.d0.G0(4);
        X = ax.S0.d0.G0(5);
        Y = ax.S0.d0.G0(6);
        Z = ax.S0.d0.G0(7);
        a0 = ax.S0.d0.G0(8);
        b0 = ax.S0.d0.G0(9);
        c0 = ax.S0.d0.G0(10);
        d0 = ax.S0.d0.G0(11);
        e0 = ax.S0.d0.G0(12);
        f0 = ax.S0.d0.G0(13);
        g0 = ax.S0.d0.G0(14);
        h0 = ax.S0.d0.G0(15);
        i0 = ax.S0.d0.G0(16);
        j0 = ax.S0.d0.G0(17);
        k0 = ax.S0.d0.G0(18);
        l0 = ax.S0.d0.G0(19);
        m0 = ax.S0.d0.G0(20);
        n0 = ax.S0.d0.G0(21);
        o0 = ax.S0.d0.G0(22);
        p0 = ax.S0.d0.G0(23);
        q0 = ax.S0.d0.G0(24);
        r0 = ax.S0.d0.G0(25);
        s0 = ax.S0.d0.G0(26);
        t0 = ax.S0.d0.G0(27);
        u0 = ax.S0.d0.G0(28);
        v0 = ax.S0.d0.G0(29);
        w0 = ax.S0.d0.G0(30);
        x0 = ax.S0.d0.G0(31);
        y0 = ax.S0.d0.G0(32);
        z0 = ax.S0.d0.G0(33);
        A0 = ax.S0.d0.G0(34);
        B0 = ax.S0.d0.G0(35);
        C0 = ax.S0.d0.G0(36);
    }

    private v(b b8) {
        int n8;
        this.a = b8.a;
        Object object = ax.S0.d0.d1(b8.d);
        this.d = object;
        if (b8.c.isEmpty() && b8.b != null) {
            this.c = ax.r7.z.A(new x((String)object, b8.b));
            this.b = b8.b;
        } else if (!b8.c.isEmpty() && b8.b == null) {
            this.c = b8.c;
            this.b = ax.P0.v.f(b8.c, (String)object);
        } else {
            ax.S0.a.g(ax.P0.v.i(b8));
            this.c = b8.c;
            this.b = b8.b;
        }
        this.e = b8.e;
        int n9 = b8.g;
        int n10 = 0;
        boolean bl = n9 == 0 || (b8.f & 0x8000) != 0;
        ax.S0.a.h(bl, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f = b8.f;
        this.g = b8.g;
        this.h = n9 = b8.h;
        this.i = n8 = b8.i;
        if (n8 != -1) {
            n9 = n8;
        }
        this.j = n9;
        this.k = b8.j;
        this.l = b8.k;
        this.m = b8.l;
        this.n = b8.m;
        this.o = b8.n;
        this.p = b8.o;
        this.q = b8.p;
        object = b8.q == null ? Collections.EMPTY_LIST : b8.q;
        this.r = object;
        this.s = object = b8.r;
        this.t = b8.s;
        this.u = b8.t;
        this.v = b8.u;
        this.w = b8.v;
        this.x = b8.w;
        this.y = b8.x;
        this.z = b8.y;
        n9 = b8.z == -1 ? 0 : b8.z;
        this.A = n9;
        float f8 = b8.A == -1.0f ? 1.0f : b8.A;
        this.B = f8;
        this.C = b8.B;
        this.D = b8.C;
        this.E = b8.D;
        this.F = b8.E;
        this.G = b8.F;
        this.H = b8.G;
        this.I = b8.H;
        n9 = b8.I == -1 ? 0 : b8.I;
        this.J = n9;
        n9 = b8.J == -1 ? n10 : b8.J;
        this.K = n9;
        this.L = b8.K;
        this.M = b8.L;
        this.N = b8.M;
        this.O = b8.N;
        if (b8.O == 0 && object != null) {
            this.P = 1;
            return;
        }
        this.P = b8.O;
    }

    public static /* synthetic */ String a(x x8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(x8.a);
        stringBuilder.append(": ");
        stringBuilder.append(x8.b);
        return stringBuilder.toString();
    }

    private static <T> T d(T t8, T t9) {
        if (t8 != null) {
            return t8;
        }
        return t9;
    }

    public static v e(Bundle bundle) {
        b b8 = new b();
        ax.S0.g.a(bundle);
        z<Object> z8 = bundle.getString(S);
        Object object = R;
        b8.j0(ax.P0.v.d(z8, ((v)object).a)).l0(ax.P0.v.d(bundle.getString(T), ((v)object).b));
        z8 = bundle.getParcelableArrayList(y0);
        z8 = z8 == null ? ax.r7.z.z() : ax.S0.g.b(new u(), z8);
        b8.m0(z8).n0(ax.P0.v.d(bundle.getString(U), ((v)object).d)).A0(bundle.getInt(V, ((v)object).e)).w0(bundle.getInt(W, ((v)object).f)).R(bundle.getInt(z0, ((v)object).g)).S(bundle.getInt(X, ((v)object).h)).t0(bundle.getInt(Y, ((v)object).i)).U(ax.P0.v.d(bundle.getString(Z), ((v)object).k)).W(ax.P0.v.d(bundle.getString(b0), ((v)object).n)).y0(ax.P0.v.d(bundle.getString(c0), ((v)object).o)).o0(bundle.getInt(d0, ((v)object).p));
        object = new ArrayList();
        int n8 = 0;
        while (true) {
            if ((z8 = (z<Object>)bundle.getByteArray(ax.P0.v.j(n8))) == null) {
                object = b8.k0((List<byte[]>)object).c0((o)bundle.getParcelable(f0));
                String string = g0;
                z8 = R;
                ((b)object).C0(bundle.getLong(string, ((v)((Object)z8)).t)).F0(bundle.getInt(h0, ((v)((Object)z8)).v)).h0(bundle.getInt(i0, ((v)((Object)z8)).w)).b0(bundle.getInt(B0, ((v)((Object)z8)).x)).a0(bundle.getInt(C0, ((v)((Object)z8)).y)).f0(bundle.getFloat(j0, ((v)((Object)z8)).z)).x0(bundle.getInt(k0, ((v)((Object)z8)).A)).u0(bundle.getFloat(l0, ((v)((Object)z8)).B)).v0(bundle.getByteArray(m0)).B0(bundle.getInt(n0, ((v)((Object)z8)).D)).q0(bundle.getInt(A0, ((v)((Object)z8)).F));
                object = bundle.getBundle(o0);
                if (object != null) {
                    b8.V(ax.P0.j.f((Bundle)object));
                }
                b8.T(bundle.getInt(p0, ((v)((Object)z8)).G)).z0(bundle.getInt(q0, ((v)((Object)z8)).H)).s0(bundle.getInt(r0, ((v)((Object)z8)).I)).d0(bundle.getInt(s0, ((v)((Object)z8)).J)).e0(bundle.getInt(t0, ((v)((Object)z8)).K)).Q(bundle.getInt(u0, ((v)((Object)z8)).L)).D0(bundle.getInt(w0, ((v)((Object)z8)).N)).E0(bundle.getInt(x0, ((v)((Object)z8)).O)).X(bundle.getInt(v0, ((v)((Object)z8)).P));
                return b8.P();
            }
            object.add(z8);
            ++n8;
        }
    }

    private static String f(List<x> list, String string) {
        for (x x8 : list) {
            if (!TextUtils.equals((CharSequence)x8.a, (CharSequence)string)) continue;
            return x8.b;
        }
        return list.get((int)0).b;
    }

    private static boolean i(b b8) {
        if (b8.c.isEmpty() && b8.b == null) {
            return true;
        }
        for (int i8 = 0; i8 < b8.c.size(); ++i8) {
            if (!((x)((b)b8).c.get((int)i8)).b.equals(b8.b)) continue;
            return true;
        }
        return false;
    }

    private static String j(int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(e0);
        stringBuilder.append("_");
        stringBuilder.append(Integer.toString(n8, 36));
        return stringBuilder.toString();
    }

    public static String l(v v8) {
        Object object;
        if (v8 == null) {
            return "null";
        }
        ax.q7.g g8 = ax.q7.g.f(',');
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id=");
        stringBuilder.append(v8.a);
        stringBuilder.append(", mimeType=");
        stringBuilder.append(v8.o);
        if (v8.n != null) {
            stringBuilder.append(", container=");
            stringBuilder.append(v8.n);
        }
        if (v8.j != -1) {
            stringBuilder.append(", bitrate=");
            stringBuilder.append(v8.j);
        }
        if (v8.k != null) {
            stringBuilder.append(", codecs=");
            stringBuilder.append(v8.k);
        }
        if (v8.s != null) {
            object = new LinkedHashSet();
            int n8 = 0;
            while (true) {
                Object object2 = v8.s;
                if (n8 >= ((o)object2).e0) break;
                UUID uUID = ((o)object2).e((int)n8).c0;
                if (uUID.equals(ax.P0.i.b)) {
                    object.add("cenc");
                } else if (uUID.equals(ax.P0.i.c)) {
                    object.add("clearkey");
                } else if (uUID.equals(ax.P0.i.e)) {
                    object.add("playready");
                } else if (uUID.equals(ax.P0.i.d)) {
                    object.add("widevine");
                } else if (uUID.equals(ax.P0.i.a)) {
                    object.add("universal");
                } else {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("unknown (");
                    ((StringBuilder)object2).append(uUID);
                    ((StringBuilder)object2).append(")");
                    object.add(((StringBuilder)object2).toString());
                }
                ++n8;
            }
            stringBuilder.append(", drm=[");
            g8.b(stringBuilder, (Iterable<? extends Object>)object);
            stringBuilder.append(']');
        }
        if (v8.v != -1 && v8.w != -1) {
            stringBuilder.append(", res=");
            stringBuilder.append(v8.v);
            stringBuilder.append("x");
            stringBuilder.append(v8.w);
        }
        if (v8.x != -1 && v8.y != -1) {
            stringBuilder.append(", decRes=");
            stringBuilder.append(v8.x);
            stringBuilder.append("x");
            stringBuilder.append(v8.y);
        }
        if (!ax.t7.a.a(v8.B, 1.0, 0.001)) {
            stringBuilder.append(", par=");
            stringBuilder.append(ax.S0.d0.G("%.3f", Float.valueOf(v8.B)));
        }
        if ((object = v8.E) != null && ((j)object).j()) {
            stringBuilder.append(", color=");
            stringBuilder.append(v8.E.o());
        }
        if (v8.z != -1.0f) {
            stringBuilder.append(", fps=");
            stringBuilder.append(v8.z);
        }
        if (v8.F != -1) {
            stringBuilder.append(", maxSubLayers=");
            stringBuilder.append(v8.F);
        }
        if (v8.G != -1) {
            stringBuilder.append(", channels=");
            stringBuilder.append(v8.G);
        }
        if (v8.H != -1) {
            stringBuilder.append(", sample_rate=");
            stringBuilder.append(v8.H);
        }
        if (v8.d != null) {
            stringBuilder.append(", language=");
            stringBuilder.append(v8.d);
        }
        if (!v8.c.isEmpty()) {
            stringBuilder.append(", labels=[");
            g8.b(stringBuilder, ax.r7.I.i(v8.c, new t()));
            stringBuilder.append("]");
        }
        if (v8.e != 0) {
            stringBuilder.append(", selectionFlags=[");
            g8.b(stringBuilder, ax.S0.d0.p0(v8.e));
            stringBuilder.append("]");
        }
        if (v8.f != 0) {
            stringBuilder.append(", roleFlags=[");
            g8.b(stringBuilder, ax.S0.d0.o0(v8.f));
            stringBuilder.append("]");
        }
        if (v8.m != null) {
            stringBuilder.append(", customData=");
            stringBuilder.append(v8.m);
        }
        if ((v8.f & 0x8000) != 0) {
            stringBuilder.append(", auxiliaryTrackType=");
            stringBuilder.append(ax.S0.d0.N(v8.g));
        }
        return stringBuilder.toString();
    }

    public b b() {
        return new b(this);
    }

    public v c(int n8) {
        return this.b().X(n8).P();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && v.class == object.getClass()) {
            int n8;
            object = (v)object;
            int n9 = this.Q;
            if (n9 != 0 && (n8 = ((v)object).Q) != 0 && n9 != n8) {
                return false;
            }
            if (this.e == ((v)object).e && this.f == ((v)object).f && this.g == ((v)object).g && this.h == ((v)object).h && this.i == ((v)object).i && this.p == ((v)object).p && this.t == ((v)object).t && this.v == ((v)object).v && this.w == ((v)object).w && this.x == ((v)object).x && this.y == ((v)object).y && this.A == ((v)object).A && this.D == ((v)object).D && this.F == ((v)object).F && this.G == ((v)object).G && this.H == ((v)object).H && this.I == ((v)object).I && this.J == ((v)object).J && this.K == ((v)object).K && this.L == ((v)object).L && this.N == ((v)object).N && this.O == ((v)object).O && this.P == ((v)object).P && Float.compare(this.z, ((v)object).z) == 0 && Float.compare(this.B, ((v)object).B) == 0 && j.Objects.equals((Object)this.a, (Object)((v)object).a) && j.Objects.equals((Object)this.b, (Object)((v)object).b) && this.c.equals(((v)object).c) && j.Objects.equals((Object)this.k, (Object)((v)object).k) && j.Objects.equals((Object)this.n, (Object)((v)object).n) && j.Objects.equals((Object)this.o, (Object)((v)object).o) && j.Objects.equals((Object)this.d, (Object)((v)object).d) && Arrays.equals(this.C, ((v)object).C) && j.Objects.equals((Object)this.l, (Object)((v)object).l) && j.Objects.equals((Object)this.E, (Object)((v)object).E) && j.Objects.equals((Object)this.s, (Object)((v)object).s) && this.h((v)object) && j.Objects.equals((Object)this.m, (Object)((v)object).m)) {
                return true;
            }
        }
        return false;
    }

    public int g() {
        int n8;
        int n9 = this.v;
        if (n9 != -1 && (n8 = this.w) != -1) {
            return n9 * n8;
        }
        return -1;
    }

    public boolean h(v v8) {
        if (this.r.size() != v8.r.size()) {
            return false;
        }
        for (int i8 = 0; i8 < this.r.size(); ++i8) {
            if (Arrays.equals(this.r.get(i8), v8.r.get(i8))) continue;
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.Q == 0) {
            Object object = this.a;
            int n8 = 0;
            int n9 = object == null ? 0 : ((String)object).hashCode();
            object = this.b;
            int n10 = object == null ? 0 : ((String)object).hashCode();
            int n11 = this.c.hashCode();
            object = this.d;
            int n12 = object == null ? 0 : ((String)object).hashCode();
            int n13 = this.e;
            int n14 = this.f;
            int n15 = this.g;
            int n16 = this.h;
            int n17 = this.i;
            object = this.k;
            int n18 = object == null ? 0 : ((String)object).hashCode();
            object = this.l;
            int n19 = object == null ? 0 : ((C)object).hashCode();
            object = this.m;
            int n20 = object == null ? 0 : object.hashCode();
            object = this.n;
            int n21 = object == null ? 0 : ((String)object).hashCode();
            object = this.o;
            if (object != null) {
                n8 = ((String)object).hashCode();
            }
            this.Q = (((((((((((((((((((((((((((((((((527 + n9) * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n13) * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n17) * 31 + n18) * 31 + n19) * 31 + n20) * 31 + n21) * 31 + n8) * 31 + this.p) * 31 + (int)this.t) * 31 + this.v) * 31 + this.w) * 31 + this.x) * 31 + this.y) * 31 + Float.floatToIntBits(this.z)) * 31 + this.A) * 31 + Float.floatToIntBits(this.B)) * 31 + this.D) * 31 + this.F) * 31 + this.G) * 31 + this.H) * 31 + this.I) * 31 + this.J) * 31 + this.K) * 31 + this.L) * 31 + this.N) * 31 + this.O) * 31 + this.P;
        }
        return this.Q;
    }

    public Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putString(S, this.a);
        bundle.putString(T, this.b);
        bundle.putParcelableArrayList(y0, ax.S0.g.d(this.c, new s()));
        bundle.putString(U, this.d);
        bundle.putInt(V, this.e);
        bundle.putInt(W, this.f);
        int n8 = this.g;
        if (n8 != ax.P0.v.R.g) {
            bundle.putInt(z0, n8);
        }
        bundle.putInt(X, this.h);
        bundle.putInt(Y, this.i);
        bundle.putString(Z, this.k);
        bundle.putString(b0, this.n);
        bundle.putString(c0, this.o);
        bundle.putInt(d0, this.p);
        for (n8 = 0; n8 < this.r.size(); ++n8) {
            bundle.putByteArray(ax.P0.v.j(n8), this.r.get(n8));
        }
        bundle.putParcelable(f0, (Parcelable)this.s);
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
        j j8 = this.E;
        if (j8 != null) {
            bundle.putBundle(o0, j8.n());
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

    public v m(v object) {
        float f8;
        int n8;
        int n9;
        Object object2;
        String string;
        Object object3;
        List<x> list;
        String string2;
        int n10;
        int n11;
        String string3;
        int n12;
        block13: {
            block12: {
                if (this == object) {
                    return this;
                }
                n12 = ax.P0.D.k(this.o);
                string3 = ((v)object).a;
                n11 = ((v)object).N;
                n10 = ((v)object).O;
                string2 = ((v)object).b;
                if (string2 == null) {
                    string2 = this.b;
                }
                list = !((v)object).c.isEmpty() ? ((v)object).c : this.c;
                object3 = this.d;
                if (n12 == 3) break block12;
                string = object3;
                if (n12 != 1) break block13;
            }
            object2 = ((v)object).d;
            string = object3;
            if (object2 != null) {
                string = object2;
            }
        }
        int n13 = n9 = this.h;
        if (n9 == -1) {
            n13 = ((v)object).h;
        }
        n9 = n8 = this.i;
        if (n8 == -1) {
            n9 = ((v)object).i;
        }
        object3 = object2 = this.k;
        if (object2 == null) {
            String string4 = ax.S0.d0.S(((v)object).k, n12);
            object3 = object2;
            if (ax.S0.d0.z1(string4).length == 1) {
                object3 = string4;
            }
        }
        object2 = (object2 = this.l) == null ? ((v)object).l : ((C)object2).b(((v)object).l);
        float f9 = f8 = this.z;
        if (f8 == -1.0f) {
            f9 = f8;
            if (n12 == 2) {
                f9 = ((v)object).z;
            }
        }
        int n14 = this.e;
        int n15 = ((v)object).e;
        n12 = this.f;
        n8 = ((v)object).f;
        object = ax.P0.o.d(((v)object).s, this.s);
        return this.b().j0(string3).l0(string2).m0(list).n0(string).A0(n14 | n15).w0(n12 | n8).S(n13).t0(n9).U((String)object3).r0((C)object2).c0((o)object).f0(f9).D0(n11).E0(n10).P();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Format(");
        stringBuilder.append(this.a);
        stringBuilder.append(", ");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        stringBuilder.append(this.n);
        stringBuilder.append(", ");
        stringBuilder.append(this.o);
        stringBuilder.append(", ");
        stringBuilder.append(this.k);
        stringBuilder.append(", ");
        stringBuilder.append(this.j);
        stringBuilder.append(", ");
        stringBuilder.append(this.d);
        stringBuilder.append(", [");
        stringBuilder.append(this.v);
        stringBuilder.append(", ");
        stringBuilder.append(this.w);
        stringBuilder.append(", ");
        stringBuilder.append(this.z);
        stringBuilder.append(", ");
        stringBuilder.append(this.E);
        stringBuilder.append("], [");
        stringBuilder.append(this.G);
        stringBuilder.append(", ");
        stringBuilder.append(this.H);
        stringBuilder.append("])");
        return stringBuilder.toString();
    }

    public static final class b {
        private float A;
        private byte[] B;
        private int C;
        private j D;
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
        private List<x> c;
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
        private o r;
        private long s;
        private boolean t;
        private int u;
        private int v;
        private int w;
        private int x;
        private float y;
        private int z;

        public b() {
            this.c = ax.r7.z.z();
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

        private b(v v8) {
            this.a = v8.a;
            this.b = v8.b;
            this.c = v8.c;
            this.d = v8.d;
            this.e = v8.e;
            this.f = v8.f;
            this.h = v8.h;
            this.i = v8.i;
            this.j = v8.k;
            this.k = v8.l;
            this.l = v8.m;
            this.m = v8.n;
            this.n = v8.o;
            this.o = v8.p;
            this.p = v8.q;
            this.q = v8.r;
            this.r = v8.s;
            this.s = v8.t;
            this.t = v8.u;
            this.u = v8.v;
            this.v = v8.w;
            this.w = v8.x;
            this.x = v8.y;
            this.y = v8.z;
            this.z = v8.A;
            this.A = v8.B;
            this.B = v8.C;
            this.C = v8.D;
            this.D = v8.E;
            this.E = v8.F;
            this.F = v8.G;
            this.G = v8.H;
            this.H = v8.I;
            this.I = v8.J;
            this.J = v8.K;
            this.K = v8.L;
            this.L = v8.M;
            this.M = v8.N;
            this.N = v8.O;
            this.O = v8.P;
        }

        public b A0(int n8) {
            this.e = n8;
            return this;
        }

        public b B0(int n8) {
            this.C = n8;
            return this;
        }

        public b C0(long l8) {
            this.s = l8;
            return this;
        }

        public b D0(int n8) {
            this.M = n8;
            return this;
        }

        public b E0(int n8) {
            this.N = n8;
            return this;
        }

        public b F0(int n8) {
            this.u = n8;
            return this;
        }

        public v P() {
            return new v(this);
        }

        public b Q(int n8) {
            this.K = n8;
            return this;
        }

        public b R(int n8) {
            this.g = n8;
            return this;
        }

        public b S(int n8) {
            this.h = n8;
            return this;
        }

        public b T(int n8) {
            this.F = n8;
            return this;
        }

        public b U(String string) {
            this.j = string;
            return this;
        }

        public b V(j j8) {
            this.D = j8;
            return this;
        }

        public b W(String string) {
            this.m = ax.P0.D.t(string);
            return this;
        }

        public b X(int n8) {
            this.O = n8;
            return this;
        }

        public b Y(int n8) {
            this.L = n8;
            return this;
        }

        public b Z(Object object) {
            this.l = object;
            return this;
        }

        public b a0(int n8) {
            this.x = n8;
            return this;
        }

        public b b0(int n8) {
            this.w = n8;
            return this;
        }

        public b c0(o o8) {
            this.r = o8;
            return this;
        }

        public b d0(int n8) {
            this.I = n8;
            return this;
        }

        public b e0(int n8) {
            this.J = n8;
            return this;
        }

        public b f0(float f8) {
            this.y = f8;
            return this;
        }

        public b g0(boolean bl) {
            this.t = bl;
            return this;
        }

        public b h0(int n8) {
            this.v = n8;
            return this;
        }

        public b i0(int n8) {
            this.a = Integer.toString(n8);
            return this;
        }

        public b j0(String string) {
            this.a = string;
            return this;
        }

        public b k0(List<byte[]> list) {
            this.q = list;
            return this;
        }

        public b l0(String string) {
            this.b = string;
            return this;
        }

        public b m0(List<x> list) {
            this.c = ax.r7.z.u(list);
            return this;
        }

        public b n0(String string) {
            this.d = string;
            return this;
        }

        public b o0(int n8) {
            this.o = n8;
            return this;
        }

        public b p0(int n8) {
            this.p = n8;
            return this;
        }

        public b q0(int n8) {
            this.E = n8;
            return this;
        }

        public b r0(C c8) {
            this.k = c8;
            return this;
        }

        public b s0(int n8) {
            this.H = n8;
            return this;
        }

        public b t0(int n8) {
            this.i = n8;
            return this;
        }

        public b u0(float f8) {
            this.A = f8;
            return this;
        }

        public b v0(byte[] byArray) {
            this.B = byArray;
            return this;
        }

        public b w0(int n8) {
            this.f = n8;
            return this;
        }

        public b x0(int n8) {
            this.z = n8;
            return this;
        }

        public b y0(String string) {
            this.n = ax.P0.D.t(string);
            return this;
        }

        public b z0(int n8) {
            this.G = n8;
            return this;
        }
    }
}

