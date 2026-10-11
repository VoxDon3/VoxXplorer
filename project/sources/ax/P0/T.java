package ax.P0;

import android.os.Bundle;
import ax.S0.C0968a;
import ax.S0.C0974g;
import ax.S0.d0;
import ax.q7.C2881h;
import ax.q7.InterfaceC2879f;
import ax.r7.AbstractC2962A;
import ax.r7.AbstractC2964C;
import ax.r7.AbstractC2991z;
import ax.u7.C3218f;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class T {
    public static final T F;

    @Deprecated
    public static final T G;
    private static final String H;
    private static final String I;
    private static final String J;
    private static final String K;
    private static final String L;
    private static final String M;
    private static final String N;
    private static final String O;
    private static final String P;
    private static final String Q;
    private static final String R;
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
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final AbstractC2962A<P, Q> D;
    public final AbstractC2964C<Integer> E;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final AbstractC2991z<String> m;
    public final AbstractC2991z<String> n;
    public final int o;
    public final AbstractC2991z<String> p;
    public final int q;
    public final int r;
    public final int s;
    public final AbstractC2991z<String> t;
    public final b u;
    public final AbstractC2991z<String> v;
    public final int w;
    public final boolean x;
    public final int y;
    public final boolean z;

    public static final class b {
        public static final b d = new a().d();
        private static final String e = d0.G0(1);
        private static final String f = d0.G0(2);
        private static final String g = d0.G0(3);
        public final int a;
        public final boolean b;
        public final boolean c;

        public static final class a {
            private int a = 0;
            private boolean b = false;
            private boolean c = false;

            public b d() {
                return new b(this);
            }

            public a e(int i) {
                this.a = i;
                return this;
            }

            public a f(boolean z) {
                this.b = z;
                return this;
            }

            public a g(boolean z) {
                this.c = z;
                return this;
            }
        }

        public static b a(Bundle bundle) {
            a aVar = new a();
            String str = e;
            b bVar = d;
            return aVar.e(bundle.getInt(str, bVar.a)).f(bundle.getBoolean(f, bVar.b)).g(bundle.getBoolean(g, bVar.c)).d();
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putInt(e, this.a);
            bundle.putBoolean(f, this.b);
            bundle.putBoolean(g, this.c);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.a + 31) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
        }

        private b(a aVar) {
            this.a = aVar.a;
            this.b = aVar.b;
            this.c = aVar.c;
        }
    }

    static {
        T F2 = new c().F();
        F = F2;
        G = F2;
        H = d0.G0(1);
        I = d0.G0(2);
        J = d0.G0(3);
        K = d0.G0(4);
        L = d0.G0(5);
        M = d0.G0(6);
        N = d0.G0(7);
        O = d0.G0(8);
        P = d0.G0(9);
        Q = d0.G0(10);
        R = d0.G0(11);
        S = d0.G0(12);
        T = d0.G0(13);
        U = d0.G0(14);
        V = d0.G0(15);
        W = d0.G0(16);
        X = d0.G0(17);
        Y = d0.G0(18);
        Z = d0.G0(19);
        a0 = d0.G0(20);
        b0 = d0.G0(21);
        c0 = d0.G0(22);
        d0 = d0.G0(23);
        e0 = d0.G0(24);
        f0 = d0.G0(25);
        g0 = d0.G0(26);
        h0 = d0.G0(27);
        i0 = d0.G0(28);
        j0 = d0.G0(29);
        k0 = d0.G0(30);
        l0 = d0.G0(31);
        m0 = d0.G0(32);
        n0 = d0.G0(33);
        o0 = d0.G0(34);
    }

    protected T(c cVar) {
        this.a = cVar.a;
        this.b = cVar.b;
        this.c = cVar.c;
        this.d = cVar.d;
        this.e = cVar.e;
        this.f = cVar.f;
        this.g = cVar.g;
        this.h = cVar.h;
        this.i = cVar.i;
        this.j = cVar.j;
        this.k = cVar.k;
        this.l = cVar.l;
        this.m = cVar.m;
        this.n = cVar.n;
        this.o = cVar.o;
        this.p = cVar.p;
        this.q = cVar.q;
        this.r = cVar.r;
        this.s = cVar.s;
        this.t = cVar.t;
        this.u = cVar.u;
        this.v = cVar.v;
        this.w = cVar.w;
        this.x = cVar.x;
        this.y = cVar.y;
        this.z = cVar.z;
        this.A = cVar.A;
        this.B = cVar.B;
        this.C = cVar.C;
        this.D = AbstractC2962A.c(cVar.D);
        this.E = AbstractC2964C.t(cVar.E);
    }

    public c I() {
        return new c(this);
    }

    public Bundle J() {
        Bundle bundle = new Bundle();
        bundle.putInt(M, this.a);
        bundle.putInt(N, this.b);
        bundle.putInt(O, this.c);
        bundle.putInt(P, this.d);
        bundle.putInt(Q, this.e);
        bundle.putInt(R, this.f);
        bundle.putInt(S, this.g);
        bundle.putInt(T, this.h);
        bundle.putInt(U, this.i);
        bundle.putInt(V, this.j);
        bundle.putBoolean(n0, this.k);
        bundle.putBoolean(W, this.l);
        bundle.putStringArray(X, (String[]) this.m.toArray(new String[0]));
        bundle.putStringArray(m0, (String[]) this.n.toArray(new String[0]));
        bundle.putInt(f0, this.o);
        bundle.putStringArray(H, (String[]) this.p.toArray(new String[0]));
        bundle.putInt(I, this.q);
        bundle.putInt(Y, this.r);
        bundle.putInt(Z, this.s);
        bundle.putStringArray(a0, (String[]) this.t.toArray(new String[0]));
        bundle.putStringArray(J, (String[]) this.v.toArray(new String[0]));
        bundle.putInt(K, this.w);
        bundle.putBoolean(o0, this.x);
        bundle.putInt(g0, this.y);
        bundle.putBoolean(L, this.z);
        bundle.putInt(h0, this.u.a);
        bundle.putBoolean(i0, this.u.b);
        bundle.putBoolean(j0, this.u.c);
        bundle.putBundle(k0, this.u.b());
        bundle.putBoolean(l0, this.A);
        bundle.putBoolean(b0, this.B);
        bundle.putBoolean(c0, this.C);
        bundle.putParcelableArrayList(d0, C0974g.d(this.D.values(), new InterfaceC2879f() { // from class: ax.P0.S
            @Override // ax.q7.InterfaceC2879f
            public final Object apply(Object obj) {
                return ((Q) obj).c();
            }
        }));
        bundle.putIntArray(e0, C3218f.o(this.E));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            T t = (T) obj;
            if (this.a == t.a && this.b == t.b && this.c == t.c && this.d == t.d && this.e == t.e && this.f == t.f && this.g == t.g && this.h == t.h && this.l == t.l && this.i == t.i && this.j == t.j && this.k == t.k && this.m.equals(t.m) && this.n.equals(t.n) && this.o == t.o && this.p.equals(t.p) && this.q == t.q && this.r == t.r && this.s == t.s && this.t.equals(t.t) && this.u.equals(t.u) && this.v.equals(t.v) && this.w == t.w && this.x == t.x && this.y == t.y && this.z == t.z && this.A == t.A && this.B == t.B && this.C == t.C && this.D.equals(t.D) && this.E.equals(t.E)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.l ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1 : 0)) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o) * 31) + this.p.hashCode()) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + this.t.hashCode()) * 31) + this.u.hashCode()) * 31) + this.v.hashCode()) * 31) + this.w) * 31) + (this.x ? 1 : 0)) * 31) + this.y) * 31) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + this.D.hashCode()) * 31) + this.E.hashCode();
    }

    public static class c {
        private boolean A;
        private boolean B;
        private boolean C;
        private HashMap<P, Q> D;
        private HashSet<Integer> E;
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private boolean k;
        private boolean l;
        private AbstractC2991z<String> m;
        private AbstractC2991z<String> n;
        private int o;
        private AbstractC2991z<String> p;
        private int q;
        private int r;
        private int s;
        private AbstractC2991z<String> t;
        private b u;
        private AbstractC2991z<String> v;
        private int w;
        private boolean x;
        private int y;
        private boolean z;

        public c() {
            this.a = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            this.b = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            this.c = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            this.d = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            this.i = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            this.j = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            this.k = true;
            this.l = true;
            this.m = AbstractC2991z.z();
            this.n = AbstractC2991z.z();
            this.o = 0;
            this.p = AbstractC2991z.z();
            this.q = 0;
            this.r = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            this.s = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            this.t = AbstractC2991z.z();
            this.u = b.d;
            this.v = AbstractC2991z.z();
            this.w = 0;
            this.x = true;
            this.y = 0;
            this.z = false;
            this.A = false;
            this.B = false;
            this.C = false;
            this.D = new HashMap<>();
            this.E = new HashSet<>();
        }

        private static b H(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(T.k0);
            if (bundle2 != null) {
                return b.a(bundle2);
            }
            b.a aVar = new b.a();
            String str = T.h0;
            b bVar = b.d;
            return aVar.e(bundle.getInt(str, bVar.a)).f(bundle.getBoolean(T.i0, bVar.b)).g(bundle.getBoolean(T.j0, bVar.c)).d();
        }

        private void I(T t) {
            this.a = t.a;
            this.b = t.b;
            this.c = t.c;
            this.d = t.d;
            this.e = t.e;
            this.f = t.f;
            this.g = t.g;
            this.h = t.h;
            this.i = t.i;
            this.j = t.j;
            this.k = t.k;
            this.l = t.l;
            this.m = t.m;
            this.n = t.n;
            this.o = t.o;
            this.p = t.p;
            this.q = t.q;
            this.r = t.r;
            this.s = t.s;
            this.t = t.t;
            this.u = t.u;
            this.v = t.v;
            this.w = t.w;
            this.x = t.x;
            this.y = t.y;
            this.z = t.z;
            this.A = t.A;
            this.B = t.B;
            this.C = t.C;
            this.E = new HashSet<>(t.E);
            this.D = new HashMap<>(t.D);
        }

        private static AbstractC2991z<String> J(String[] strArr) {
            AbstractC2991z.a r = AbstractC2991z.r();
            for (String str : (String[]) C0968a.e(strArr)) {
                r.a(d0.d1((String) C0968a.e(str)));
            }
            return r.k();
        }

        public T F() {
            return new T(this);
        }

        public c G(int i) {
            Iterator<Q> it = this.D.values().iterator();
            while (it.hasNext()) {
                if (it.next().b() == i) {
                    it.remove();
                }
            }
            return this;
        }

        protected c K(T t) {
            I(t);
            return this;
        }

        public c L(Set<Integer> set) {
            this.E.clear();
            this.E.addAll(set);
            return this;
        }

        public c M(int i) {
            this.y = i;
            return this;
        }

        public c N(Q q) {
            G(q.b());
            this.D.put(q.a, q);
            return this;
        }

        public c O(String str) {
            return str == null ? P(new String[0]) : P(str);
        }

        public c P(String... strArr) {
            this.p = J(strArr);
            return this;
        }

        public c Q(String str) {
            return str == null ? R(new String[0]) : R(str);
        }

        public c R(String... strArr) {
            this.v = J(strArr);
            this.x = false;
            return this;
        }

        public c S(int i) {
            this.w = i;
            this.x = false;
            return this;
        }

        public c T(boolean z) {
            this.z = z;
            return this;
        }

        public c U(int i, boolean z) {
            if (z) {
                this.E.add(Integer.valueOf(i));
                return this;
            }
            this.E.remove(Integer.valueOf(i));
            return this;
        }

        protected c(T t) {
            I(t);
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected c(Bundle bundle) {
            AbstractC2991z b;
            String str = T.M;
            T t = T.F;
            this.a = bundle.getInt(str, t.a);
            this.b = bundle.getInt(T.N, t.b);
            this.c = bundle.getInt(T.O, t.c);
            this.d = bundle.getInt(T.P, t.d);
            this.e = bundle.getInt(T.Q, t.e);
            this.f = bundle.getInt(T.R, t.f);
            this.g = bundle.getInt(T.S, t.g);
            this.h = bundle.getInt(T.T, t.h);
            this.i = bundle.getInt(T.U, t.i);
            int i = bundle.getInt(T.V, t.j);
            this.j = i;
            this.k = this.i == Integer.MAX_VALUE && i == Integer.MAX_VALUE && bundle.getBoolean(T.n0, t.k);
            this.l = bundle.getBoolean(T.W, t.l);
            this.m = AbstractC2991z.w((String[]) C2881h.a(bundle.getStringArray(T.X), new String[0]));
            this.n = AbstractC2991z.w((String[]) C2881h.a(bundle.getStringArray(T.m0), new String[0]));
            this.o = bundle.getInt(T.f0, t.o);
            this.p = J((String[]) C2881h.a(bundle.getStringArray(T.H), new String[0]));
            this.q = bundle.getInt(T.I, t.q);
            this.r = bundle.getInt(T.Y, t.r);
            this.s = bundle.getInt(T.Z, t.s);
            this.t = AbstractC2991z.w((String[]) C2881h.a(bundle.getStringArray(T.a0), new String[0]));
            this.u = H(bundle);
            this.v = J((String[]) C2881h.a(bundle.getStringArray(T.J), new String[0]));
            this.w = bundle.getInt(T.K, t.w);
            this.x = this.v.isEmpty() && this.w == 0 && bundle.getBoolean(T.o0, t.x);
            this.y = bundle.getInt(T.g0, t.y);
            this.z = bundle.getBoolean(T.L, t.z);
            this.A = bundle.getBoolean(T.l0, t.A);
            this.B = bundle.getBoolean(T.b0, t.B);
            this.C = bundle.getBoolean(T.c0, t.C);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(T.d0);
            if (parcelableArrayList == null) {
                b = AbstractC2991z.z();
            } else {
                b = C0974g.b(new InterfaceC2879f() { // from class: ax.P0.U
                    @Override // ax.q7.InterfaceC2879f
                    public final Object apply(Object obj) {
                        return Q.a((Bundle) obj);
                    }
                }, parcelableArrayList);
            }
            this.D = new HashMap<>();
            for (int i2 = 0; i2 < b.size(); i2++) {
                Q q = (Q) b.get(i2);
                this.D.put(q.a, q);
            }
            int[] iArr = (int[]) C2881h.a(bundle.getIntArray(T.e0), new int[0]);
            this.E = new HashSet<>();
            for (int i3 : iArr) {
                this.E.add(Integer.valueOf(i3));
            }
        }
    }
}
