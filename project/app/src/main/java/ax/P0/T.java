/*
 * Decompiled with CFR 0.152.
 */
package ax.P0;

import android.os.Bundle;
import ax.P0.P;
import ax.P0.Q;
import ax.P0.S;
import ax.P0.U;
import ax.S0.a;
import ax.S0.d0;
import ax.S0.g;
import ax.q7.h;
import ax.r7.A;
import ax.r7.C;
import ax.r7.z;
import ax.u7.f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
    public final A<P, Q> D;
    public final C<Integer> E;
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
    public final z<String> m;
    public final z<String> n;
    public final int o;
    public final z<String> p;
    public final int q;
    public final int r;
    public final int s;
    public final z<String> t;
    public final b u;
    public final z<String> v;
    public final int w;
    public final boolean x;
    public final int y;
    public final boolean z;

    static {
        T t8;
        F = t8 = new c().F();
        G = t8;
        H = ax.S0.d0.G0(1);
        I = ax.S0.d0.G0(2);
        J = ax.S0.d0.G0(3);
        K = ax.S0.d0.G0(4);
        L = ax.S0.d0.G0(5);
        M = ax.S0.d0.G0(6);
        N = ax.S0.d0.G0(7);
        O = ax.S0.d0.G0(8);
        P = ax.S0.d0.G0(9);
        Q = ax.S0.d0.G0(10);
        R = ax.S0.d0.G0(11);
        S = ax.S0.d0.G0(12);
        T = ax.S0.d0.G0(13);
        U = ax.S0.d0.G0(14);
        V = ax.S0.d0.G0(15);
        W = ax.S0.d0.G0(16);
        X = ax.S0.d0.G0(17);
        Y = ax.S0.d0.G0(18);
        Z = ax.S0.d0.G0(19);
        a0 = ax.S0.d0.G0(20);
        b0 = ax.S0.d0.G0(21);
        c0 = ax.S0.d0.G0(22);
        d0 = ax.S0.d0.G0(23);
        e0 = ax.S0.d0.G0(24);
        f0 = ax.S0.d0.G0(25);
        g0 = ax.S0.d0.G0(26);
        h0 = ax.S0.d0.G0(27);
        i0 = ax.S0.d0.G0(28);
        j0 = ax.S0.d0.G0(29);
        k0 = ax.S0.d0.G0(30);
        l0 = ax.S0.d0.G0(31);
        m0 = ax.S0.d0.G0(32);
        n0 = ax.S0.d0.G0(33);
        o0 = ax.S0.d0.G0(34);
    }

    protected T(c c8) {
        this.a = c8.a;
        this.b = c8.b;
        this.c = c8.c;
        this.d = c8.d;
        this.e = c8.e;
        this.f = c8.f;
        this.g = c8.g;
        this.h = c8.h;
        this.i = c8.i;
        this.j = c8.j;
        this.k = c8.k;
        this.l = c8.l;
        this.m = c8.m;
        this.n = c8.n;
        this.o = c8.o;
        this.p = c8.p;
        this.q = c8.q;
        this.r = c8.r;
        this.s = c8.s;
        this.t = c8.t;
        this.u = c8.u;
        this.v = c8.v;
        this.w = c8.w;
        this.x = c8.x;
        this.y = c8.y;
        this.z = c8.z;
        this.A = c8.A;
        this.B = c8.B;
        this.C = c8.C;
        this.D = ax.r7.A.c(c8.D);
        this.E = ax.r7.C.t(c8.E);
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
        bundle.putStringArray(X, this.m.toArray(new String[0]));
        bundle.putStringArray(m0, this.n.toArray(new String[0]));
        bundle.putInt(f0, this.o);
        bundle.putStringArray(H, this.p.toArray(new String[0]));
        bundle.putInt(I, this.q);
        bundle.putInt(Y, this.r);
        bundle.putInt(Z, this.s);
        bundle.putStringArray(a0, this.t.toArray(new String[0]));
        bundle.putStringArray(J, this.v.toArray(new String[0]));
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
        bundle.putParcelableArrayList(d0, ax.S0.g.d(this.D.l(), new S()));
        bundle.putIntArray(e0, ax.u7.f.o(this.E));
        return bundle;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (T)object;
            if (this.a == ((T)object).a && this.b == ((T)object).b && this.c == ((T)object).c && this.d == ((T)object).d && this.e == ((T)object).e && this.f == ((T)object).f && this.g == ((T)object).g && this.h == ((T)object).h && this.l == ((T)object).l && this.i == ((T)object).i && this.j == ((T)object).j && this.k == ((T)object).k && this.m.equals(((T)object).m) && this.n.equals(((T)object).n) && this.o == ((T)object).o && this.p.equals(((T)object).p) && this.q == ((T)object).q && this.r == ((T)object).r && this.s == ((T)object).s && this.t.equals(((T)object).t) && this.u.equals(((T)object).u) && this.v.equals(((T)object).v) && this.w == ((T)object).w && this.x == ((T)object).x && this.y == ((T)object).y && this.z == ((T)object).z && this.A == ((T)object).A && this.B == ((T)object).B && this.C == ((T)object).C && this.D.equals(((T)object).D) && this.E.equals(((T)object).E)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((this.a + 31) * 31 + this.b) * 31 + this.c) * 31 + this.d) * 31 + this.e) * 31 + this.f) * 31 + this.g) * 31 + this.h) * 31 + this.l) * 31 + this.i) * 31 + this.j) * 31 + this.k) * 31 + this.m.hashCode()) * 31 + this.n.hashCode()) * 31 + this.o) * 31 + this.p.hashCode()) * 31 + this.q) * 31 + this.r) * 31 + this.s) * 31 + this.t.hashCode()) * 31 + this.u.hashCode()) * 31 + this.v.hashCode()) * 31 + this.w) * 31 + this.x) * 31 + this.y) * 31 + this.z) * 31 + this.A) * 31 + this.B) * 31 + this.C) * 31 + this.D.hashCode()) * 31 + this.E.hashCode();
    }

    public static final class b {
        public static final b d = new a().d();
        private static final String e = ax.S0.d0.G0(1);
        private static final String f = ax.S0.d0.G0(2);
        private static final String g = ax.S0.d0.G0(3);
        public final int a;
        public final boolean b;
        public final boolean c;

        private b(a a8) {
            this.a = a8.a;
            this.b = a8.b;
            this.c = a8.c;
        }

        public static b a(Bundle bundle) {
            a a8 = new a();
            String string = e;
            b b8 = d;
            return a8.e(bundle.getInt(string, b8.a)).f(bundle.getBoolean(f, b8.b)).g(bundle.getBoolean(g, b8.c)).d();
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putInt(e, this.a);
            bundle.putBoolean(f, this.b);
            bundle.putBoolean(g, this.c);
            return bundle;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && b.class == object.getClass()) {
                object = (b)object;
                if (this.a == ((b)object).a && this.b == ((b)object).b && this.c == ((b)object).c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.a + 31) * 31 + this.b) * 31 + this.c;
        }

        public static final class a {
            private int a = 0;
            private boolean b = false;
            private boolean c = false;

            public b d() {
                return new b(this);
            }

            public a e(int n8) {
                this.a = n8;
                return this;
            }

            public a f(boolean bl) {
                this.b = bl;
                return this;
            }

            public a g(boolean bl) {
                this.c = bl;
                return this;
            }
        }
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
        private z<String> m;
        private z<String> n;
        private int o;
        private z<String> p;
        private int q;
        private int r;
        private int s;
        private z<String> t;
        private b u;
        private z<String> v;
        private int w;
        private boolean x;
        private int y;
        private boolean z;

        public c() {
            this.a = Integer.MAX_VALUE;
            this.b = Integer.MAX_VALUE;
            this.c = Integer.MAX_VALUE;
            this.d = Integer.MAX_VALUE;
            this.i = Integer.MAX_VALUE;
            this.j = Integer.MAX_VALUE;
            this.k = true;
            this.l = true;
            this.m = ax.r7.z.z();
            this.n = ax.r7.z.z();
            this.o = 0;
            this.p = ax.r7.z.z();
            this.q = 0;
            this.r = Integer.MAX_VALUE;
            this.s = Integer.MAX_VALUE;
            this.t = ax.r7.z.z();
            this.u = ax.P0.T$b.d;
            this.v = ax.r7.z.z();
            this.w = 0;
            this.x = true;
            this.y = 0;
            this.z = false;
            this.A = false;
            this.B = false;
            this.C = false;
            this.D = new HashMap();
            this.E = new HashSet();
        }

        protected c(Bundle object) {
            int n8;
            Object object2 = M;
            z<Object> z8 = F;
            this.a = object.getInt((String)object2, ((T)((Object)z8)).a);
            this.b = object.getInt(N, ((T)((Object)z8)).b);
            this.c = object.getInt(O, ((T)((Object)z8)).c);
            this.d = object.getInt(P, ((T)((Object)z8)).d);
            this.e = object.getInt(Q, ((T)((Object)z8)).e);
            this.f = object.getInt(R, ((T)((Object)z8)).f);
            this.g = object.getInt(S, ((T)((Object)z8)).g);
            this.h = object.getInt(T, ((T)((Object)z8)).h);
            this.i = object.getInt(U, ((T)((Object)z8)).i);
            this.j = n8 = object.getInt(V, ((T)((Object)z8)).j);
            int n9 = this.i;
            boolean bl = true;
            Object object3 = 0;
            boolean bl2 = n9 == Integer.MAX_VALUE && n8 == Integer.MAX_VALUE && object.getBoolean(n0, ((T)((Object)z8)).k);
            this.k = bl2;
            this.l = object.getBoolean(W, ((T)((Object)z8)).l);
            this.m = ax.r7.z.w(ax.q7.h.a(object.getStringArray(X), new String[0]));
            this.n = ax.r7.z.w(ax.q7.h.a(object.getStringArray(m0), new String[0]));
            this.o = object.getInt(f0, ((T)((Object)z8)).o);
            this.p = ax.P0.T$c.J(ax.q7.h.a(object.getStringArray(H), new String[0]));
            this.q = object.getInt(I, ((T)((Object)z8)).q);
            this.r = object.getInt(Y, ((T)((Object)z8)).r);
            this.s = object.getInt(Z, ((T)((Object)z8)).s);
            this.t = ax.r7.z.w(ax.q7.h.a(object.getStringArray(a0), new String[0]));
            this.u = ax.P0.T$c.H(object);
            this.v = ax.P0.T$c.J(ax.q7.h.a(object.getStringArray(J), new String[0]));
            this.w = object.getInt(K, ((T)((Object)z8)).w);
            bl2 = this.v.isEmpty() && this.w == 0 && object.getBoolean(o0, ((T)((Object)z8)).x) ? bl : false;
            this.x = bl2;
            this.y = object.getInt(g0, ((T)((Object)z8)).y);
            this.z = object.getBoolean(L, ((T)((Object)z8)).z);
            this.A = object.getBoolean(l0, ((T)((Object)z8)).A);
            this.B = object.getBoolean(b0, ((T)((Object)z8)).B);
            this.C = object.getBoolean(c0, ((T)((Object)z8)).C);
            z8 = object.getParcelableArrayList(d0);
            z8 = z8 == null ? ax.r7.z.z() : ax.S0.g.b(new U(), z8);
            this.D = new HashMap();
            for (n9 = 0; n9 < z8.size(); ++n9) {
                object2 = (Q)z8.get(n9);
                this.D.put(((Q)object2).a, (Q)object2);
            }
            object = ax.q7.h.a(object.getIntArray(e0), new int[0]);
            this.E = new HashSet();
            n8 = ((Bundle)object).length;
            for (n9 = object3; n9 < n8; ++n9) {
                object3 = object[n9];
                this.E.add((Integer)object3);
            }
        }

        protected c(T t8) {
            this.I(t8);
        }

        private static b H(Bundle bundle) {
            Object object = bundle.getBundle(k0);
            if (object != null) {
                return ax.P0.T$b.a((Bundle)object);
            }
            object = new b.a();
            String string = h0;
            b b8 = ax.P0.T$b.d;
            return ((b.a)object).e(bundle.getInt(string, b8.a)).f(bundle.getBoolean(i0, b8.b)).g(bundle.getBoolean(j0, b8.c)).d();
        }

        private void I(T t8) {
            this.a = t8.a;
            this.b = t8.b;
            this.c = t8.c;
            this.d = t8.d;
            this.e = t8.e;
            this.f = t8.f;
            this.g = t8.g;
            this.h = t8.h;
            this.i = t8.i;
            this.j = t8.j;
            this.k = t8.k;
            this.l = t8.l;
            this.m = t8.m;
            this.n = t8.n;
            this.o = t8.o;
            this.p = t8.p;
            this.q = t8.q;
            this.r = t8.r;
            this.s = t8.s;
            this.t = t8.t;
            this.u = t8.u;
            this.v = t8.v;
            this.w = t8.w;
            this.x = t8.x;
            this.y = t8.y;
            this.z = t8.z;
            this.A = t8.A;
            this.B = t8.B;
            this.C = t8.C;
            this.E = new HashSet<Integer>(t8.E);
            this.D = new HashMap<P, Q>(t8.D);
        }

        private static z<String> J(String[] stringArray) {
            z.a<String> a8 = ax.r7.z.r();
            stringArray = ax.S0.a.e(stringArray);
            int n8 = stringArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                a8.h(ax.S0.d0.d1(ax.S0.a.e(stringArray[i8])));
            }
            return a8.k();
        }

        public T F() {
            return new T(this);
        }

        public c G(int n8) {
            Iterator<Q> iterator = this.D.values().iterator();
            while (iterator.hasNext()) {
                if (iterator.next().b() != n8) continue;
                iterator.remove();
            }
            return this;
        }

        protected c K(T t8) {
            this.I(t8);
            return this;
        }

        public c L(Set<Integer> set) {
            this.E.clear();
            this.E.addAll(set);
            return this;
        }

        public c M(int n8) {
            this.y = n8;
            return this;
        }

        public c N(Q q8) {
            this.G(q8.b());
            this.D.put(q8.a, q8);
            return this;
        }

        public c O(String string) {
            if (string == null) {
                return this.P(new String[0]);
            }
            return this.P(string);
        }

        public c P(String ... stringArray) {
            this.p = ax.P0.T$c.J(stringArray);
            return this;
        }

        public c Q(String string) {
            if (string == null) {
                return this.R(new String[0]);
            }
            return this.R(string);
        }

        public c R(String ... stringArray) {
            this.v = ax.P0.T$c.J(stringArray);
            this.x = false;
            return this;
        }

        public c S(int n8) {
            this.w = n8;
            this.x = false;
            return this;
        }

        public c T(boolean bl) {
            this.z = bl;
            return this;
        }

        public c U(int n8, boolean bl) {
            if (bl) {
                this.E.add(n8);
                return this;
            }
            this.E.remove(n8);
            return this;
        }
    }
}

