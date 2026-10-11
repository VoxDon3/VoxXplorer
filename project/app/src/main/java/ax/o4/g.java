/*
 * Decompiled with CFR 0.152.
 */
package ax.o4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import ax.o4.b;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class g {
    private static boolean g = true;
    private F a = null;
    private String b = "";
    private String c = "";
    private float d = 96.0f;
    private b.r e = new b.r();
    private Map<String, L> f = new HashMap<String, L>();

    g() {
    }

    private String c(String string) {
        String string2;
        if (string.startsWith("\"") && string.endsWith("\"")) {
            string2 = string.substring(1, string.length() - 1).replace("\\\"", "\"");
        } else {
            string2 = string;
            if (string.startsWith("'")) {
                string2 = string;
                if (string.endsWith("'")) {
                    string2 = string.substring(1, string.length() - 1).replace("\\'", "'");
                }
            }
        }
        return string2.replace("\\\n", "").replace("\\A", "\n");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private b e(float f8) {
        d0 d02;
        d0 d03;
        d0 d04;
        d0 d05;
        Object object = this.a;
        p p8 = ((F)object).s;
        object = ((F)object).t;
        if (p8 == null || p8.k() || (d05 = p8.c0) == (d04 = d0.j0) || d05 == (d03 = d0.c0) || d05 == (d02 = d0.d0)) return new b(-1.0f, -1.0f, -1.0f, -1.0f);
        float f9 = p8.c(f8);
        if (object != null) {
            d0 d06;
            if (((p)object).k() || (d06 = ((p)object).c0) == d04 || d06 == d03 || d06 == d02) return new b(-1.0f, -1.0f, -1.0f, -1.0f);
            f8 = ((p)object).c(f8);
            return new b(0.0f, 0.0f, f9, f8);
        } else {
            object = this.a.p;
            f8 = object != null ? ((b)object).d * f9 / ((b)object).c : f9;
        }
        return new b(0.0f, 0.0f, f9, f8);
    }

    private L i(J object, String string) {
        L l8 = (L)object;
        if (string.equals(l8.c)) {
            return l8;
        }
        for (N n8 : object.b()) {
            if (!(n8 instanceof L)) continue;
            l8 = (L)n8;
            if (string.equals(l8.c)) {
                return l8;
            }
            if (!(n8 instanceof J) || (l8 = this.i((J)((Object)n8), string)) == null) continue;
            return l8;
        }
        return null;
    }

    static ax.o4.i k() {
        return null;
    }

    public static g l(InputStream inputStream) throws ax.o4.j {
        return new ax.o4.k().z(inputStream, g);
    }

    void a(b.r r8) {
        this.e.b(r8);
    }

    void b() {
        this.e.e(b.u.c0);
    }

    List<b.p> d() {
        return this.e.c();
    }

    public float f() {
        if (this.a != null) {
            return this.e((float)this.d).d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        Object object = this.a;
        if (object != null) {
            object = ((R)object).p;
            if (object == null) {
                return null;
            }
            return ((b)object).d();
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public float h() {
        if (this.a != null) {
            return this.e((float)this.d).c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    L j(String string) {
        if (string != null && string.length() != 0) {
            if (string.equals(this.a.c)) {
                return this.a;
            }
            if (this.f.containsKey(string)) {
                return this.f.get(string);
            }
            L l8 = this.i(this.a, string);
            this.f.put(string, l8);
            return l8;
        }
        return null;
    }

    F m() {
        return this.a;
    }

    boolean n() {
        return this.e.d() ^ true;
    }

    public Picture o() {
        return this.q(null);
    }

    public Picture p(int n8, int n9, ax.o4.f f8) {
        ax.o4.f f9;
        Canvas canvas;
        Picture picture;
        block3: {
            block2: {
                picture = new Picture();
                canvas = picture.beginRecording(n8, n9);
                if (f8 == null) break block2;
                f9 = f8;
                if (f8.f != null) break block3;
            }
            f8 = f8 == null ? new ax.o4.f() : new ax.o4.f(f8);
            f8.g(0.0f, 0.0f, n8, n9);
            f9 = f8;
        }
        new ax.o4.h(canvas, this.d).G0(this, f9);
        picture.endRecording();
        return picture;
    }

    public Picture q(ax.o4.f f8) {
        d0 d02;
        Object object;
        b b8 = f8 != null && f8.e() ? f8.d : this.a.p;
        if (f8 != null && f8.f()) {
            float f9 = f8.f.b();
            float f10 = f8.f.c();
            return this.p((int)Math.ceil(f9), (int)Math.ceil(f10), f8);
        }
        F f11 = this.a;
        p p8 = f11.s;
        if (p8 != null && (object = p8.c0) != (d02 = d0.j0) && (object = f11.t) != null && ((p)object).c0 != d02) {
            float f12 = p8.c(this.d);
            float f13 = this.a.t.c(this.d);
            return this.p((int)Math.ceil(f12), (int)Math.ceil(f13), f8);
        }
        if (p8 != null && b8 != null) {
            float f14 = p8.c(this.d);
            float f15 = b8.d * f14 / b8.c;
            return this.p((int)Math.ceil(f14), (int)Math.ceil(f15), f8);
        }
        p8 = f11.t;
        if (p8 != null && b8 != null) {
            float f16 = p8.c(this.d);
            return this.p((int)Math.ceil(b8.c * f16 / b8.d), (int)Math.ceil(f16), f8);
        }
        return this.p(512, 512, f8);
    }

    N r(String string) {
        if (string == null) {
            return null;
        }
        if ((string = this.c(string)).length() > 1 && string.startsWith("#")) {
            return this.j(string.substring(1));
        }
        return null;
    }

    void s(String string) {
        this.c = string;
    }

    void t(F f8) {
        this.a = f8;
    }

    void u(String string) {
        this.b = string;
    }

    static class A
    extends z {
        A() {
        }

        @Override
        String o() {
            return "polygon";
        }
    }

    static class B
    extends l {
        p o;
        p p;
        p q;
        p r;
        p s;
        p t;

        B() {
        }

        @Override
        String o() {
            return "rect";
        }
    }

    static class C
    extends L
    implements J {
        C() {
        }

        @Override
        public List<N> b() {
            return Collections.EMPTY_LIST;
        }

        @Override
        public void m(N n8) {
        }

        @Override
        String o() {
            return "solidColor";
        }
    }

    static class D
    extends L
    implements J {
        Float h;

        D() {
        }

        @Override
        public List<N> b() {
            return Collections.EMPTY_LIST;
        }

        @Override
        public void m(N n8) {
        }

        @Override
        String o() {
            return "stop";
        }
    }

    static class E
    implements Cloneable {
        String A0;
        Boolean B0;
        Boolean C0;
        O D0;
        Float E0;
        String F0;
        a G0;
        String H0;
        O I0;
        Float J0;
        O K0;
        Float L0;
        i M0;
        e N0;
        O c0;
        a d0;
        Float e0;
        O f0;
        Float g0;
        p h0;
        c i0;
        d j0;
        Float k0;
        p[] l0;
        p m0;
        Float n0;
        ax.o4.g$f o0;
        List<String> p0;
        long q = 0L;
        p q0;
        Integer r0;
        b s0;
        g t0;
        h u0;
        f v0;
        Boolean w0;
        ax.o4.g$c x0;
        String y0;
        String z0;

        E() {
        }

        static E b() {
            Boolean bl;
            Float f8;
            a a8;
            E e8 = new E();
            e8.q = -1L;
            ax.o4.g$f f9 = ax.o4.g$f.c0;
            e8.c0 = f9;
            e8.d0 = a8 = a.q;
            e8.e0 = f8 = Float.valueOf(1.0f);
            e8.f0 = null;
            e8.g0 = f8;
            e8.h0 = new p(1.0f);
            e8.i0 = c.q;
            e8.j0 = d.q;
            e8.k0 = Float.valueOf(4.0f);
            e8.l0 = null;
            e8.m0 = new p(0.0f);
            e8.n0 = f8;
            e8.o0 = f9;
            e8.p0 = null;
            e8.q0 = new p(12.0f, ax.o4.g$d0.h0);
            e8.r0 = 400;
            e8.s0 = b.q;
            e8.t0 = g.q;
            e8.u0 = h.q;
            e8.v0 = f.q;
            e8.w0 = bl = Boolean.TRUE;
            e8.x0 = null;
            e8.y0 = null;
            e8.z0 = null;
            e8.A0 = null;
            e8.B0 = bl;
            e8.C0 = bl;
            e8.D0 = f9;
            e8.E0 = f8;
            e8.F0 = null;
            e8.G0 = a8;
            e8.H0 = null;
            e8.I0 = null;
            e8.J0 = f8;
            e8.K0 = null;
            e8.L0 = f8;
            e8.M0 = i.q;
            e8.N0 = e.q;
            return e8;
        }

        void c(boolean bl) {
            Boolean bl2;
            this.B0 = bl2 = Boolean.TRUE;
            if (!bl) {
                bl2 = Boolean.FALSE;
            }
            this.w0 = bl2;
            this.x0 = null;
            this.F0 = null;
            this.n0 = Float.valueOf(1.0f);
            this.D0 = ax.o4.g$f.c0;
            this.E0 = Float.valueOf(1.0f);
            this.H0 = null;
            this.I0 = null;
            this.J0 = Float.valueOf(1.0f);
            this.K0 = null;
            this.L0 = Float.valueOf(1.0f);
            this.M0 = i.q;
        }

        protected Object clone() throws CloneNotSupportedException {
            E e8 = (E)super.clone();
            p[] pArray = this.l0;
            if (pArray != null) {
                e8.l0 = (p[])pArray.clone();
            }
            return e8;
        }

        public static final class a
        extends Enum<a> {
            public static final /* enum */ a c0;
            private static final a[] d0;
            public static final /* enum */ a q;

            static {
                a a8;
                a a9;
                q = a9 = new a();
                c0 = a8 = new a();
                d0 = new a[]{a9, a8};
            }

            public static a valueOf(String string) {
                return Enum.valueOf(a.class, string);
            }

            public static a[] values() {
                return (a[])d0.clone();
            }
        }

        public static final class b
        extends Enum<b> {
            public static final /* enum */ b c0;
            public static final /* enum */ b d0;
            private static final b[] e0;
            public static final /* enum */ b q;

            static {
                b b8;
                b b9;
                b b10;
                q = b10 = new b();
                c0 = b9 = new b();
                d0 = b8 = new b();
                e0 = new b[]{b10, b9, b8};
            }

            public static b valueOf(String string) {
                return Enum.valueOf(b.class, string);
            }

            public static b[] values() {
                return (b[])e0.clone();
            }
        }

        public static final class c
        extends Enum<c> {
            public static final /* enum */ c c0;
            public static final /* enum */ c d0;
            private static final c[] e0;
            public static final /* enum */ c q;

            static {
                c c8;
                c c9;
                c c10;
                q = c10 = new c();
                c0 = c9 = new c();
                d0 = c8 = new c();
                e0 = new c[]{c10, c9, c8};
            }

            public static c valueOf(String string) {
                return Enum.valueOf(c.class, string);
            }

            public static c[] values() {
                return (c[])e0.clone();
            }
        }

        public static final class d
        extends Enum<d> {
            public static final /* enum */ d c0;
            public static final /* enum */ d d0;
            private static final d[] e0;
            public static final /* enum */ d q;

            static {
                d d8;
                d d9;
                d d10;
                q = d10 = new d();
                c0 = d9 = new d();
                d0 = d8 = new d();
                e0 = new d[]{d10, d9, d8};
            }

            public static d valueOf(String string) {
                return Enum.valueOf(d.class, string);
            }

            public static d[] values() {
                return (d[])e0.clone();
            }
        }

        public static final class e
        extends Enum<e> {
            public static final /* enum */ e c0;
            public static final /* enum */ e d0;
            private static final e[] e0;
            public static final /* enum */ e q;

            static {
                e e8;
                e e9;
                e e10;
                q = e10 = new e();
                c0 = e9 = new e();
                d0 = e8 = new e();
                e0 = new e[]{e10, e9, e8};
            }

            public static e valueOf(String string) {
                return Enum.valueOf(e.class, string);
            }

            public static e[] values() {
                return (e[])e0.clone();
            }
        }

        public static final class f
        extends Enum<f> {
            public static final /* enum */ f c0;
            public static final /* enum */ f d0;
            private static final f[] e0;
            public static final /* enum */ f q;

            static {
                f f8;
                f f9;
                f f10;
                q = f10 = new f();
                c0 = f9 = new f();
                d0 = f8 = new f();
                e0 = new f[]{f10, f9, f8};
            }

            public static f valueOf(String string) {
                return Enum.valueOf(f.class, string);
            }

            public static f[] values() {
                return (f[])e0.clone();
            }
        }

        public static final class g
        extends Enum<g> {
            public static final /* enum */ g c0;
            public static final /* enum */ g d0;
            public static final /* enum */ g e0;
            public static final /* enum */ g f0;
            private static final g[] g0;
            public static final /* enum */ g q;

            static {
                g g8;
                g g9;
                g g10;
                g g11;
                g g12;
                q = g12 = new g();
                c0 = g11 = new g();
                d0 = g10 = new g();
                e0 = g9 = new g();
                f0 = g8 = new g();
                g0 = new g[]{g12, g11, g10, g9, g8};
            }

            public static g valueOf(String string) {
                return Enum.valueOf(g.class, string);
            }

            public static g[] values() {
                return (g[])g0.clone();
            }
        }

        public static final class h
        extends Enum<h> {
            public static final /* enum */ h c0;
            private static final h[] d0;
            public static final /* enum */ h q;

            static {
                h h8;
                h h9;
                q = h9 = new h();
                c0 = h8 = new h();
                d0 = new h[]{h9, h8};
            }

            public static h valueOf(String string) {
                return Enum.valueOf(h.class, string);
            }

            public static h[] values() {
                return (h[])d0.clone();
            }
        }

        public static final class i
        extends Enum<i> {
            public static final /* enum */ i c0;
            private static final i[] d0;
            public static final /* enum */ i q;

            static {
                i i8;
                i i9;
                q = i9 = new i();
                c0 = i8 = new i();
                d0 = new i[]{i9, i8};
            }

            public static i valueOf(String string) {
                return Enum.valueOf(i.class, string);
            }

            public static i[] values() {
                return (i[])d0.clone();
            }
        }
    }

    static class F
    extends R {
        p q;
        p r;
        p s;
        p t;
        public String u;

        F() {
        }

        @Override
        String o() {
            return "svg";
        }
    }

    static interface G {
        public Set<String> a();

        public void c(Set<String> var1);

        public String d();

        public void e(Set<String> var1);

        public void g(Set<String> var1);

        public Set<String> h();

        public void i(String var1);

        public void k(Set<String> var1);

        public Set<String> l();

        public Set<String> n();
    }

    static abstract class H
    extends K
    implements J,
    G {
        List<N> i = new ArrayList<N>();
        Set<String> j = null;
        String k = null;
        Set<String> l = null;
        Set<String> m = null;
        Set<String> n = null;

        H() {
        }

        @Override
        public Set<String> a() {
            return null;
        }

        @Override
        public List<N> b() {
            return this.i;
        }

        @Override
        public void c(Set<String> set) {
            this.m = set;
        }

        @Override
        public String d() {
            return this.k;
        }

        @Override
        public void e(Set<String> set) {
            this.n = set;
        }

        @Override
        public void g(Set<String> set) {
            this.j = set;
        }

        @Override
        public Set<String> h() {
            return this.j;
        }

        @Override
        public void i(String string) {
            this.k = string;
        }

        @Override
        public void k(Set<String> set) {
            this.l = set;
        }

        @Override
        public Set<String> l() {
            return this.m;
        }

        @Override
        public void m(N n8) throws ax.o4.j {
            this.i.add(n8);
        }

        @Override
        public Set<String> n() {
            return this.n;
        }
    }

    static abstract class I
    extends K
    implements G {
        Set<String> i = null;
        String j = null;
        Set<String> k = null;
        Set<String> l = null;
        Set<String> m = null;

        I() {
        }

        @Override
        public Set<String> a() {
            return this.k;
        }

        @Override
        public void c(Set<String> set) {
            this.l = set;
        }

        @Override
        public String d() {
            return this.j;
        }

        @Override
        public void e(Set<String> set) {
            this.m = set;
        }

        @Override
        public void g(Set<String> set) {
            this.i = set;
        }

        @Override
        public Set<String> h() {
            return this.i;
        }

        @Override
        public void i(String string) {
            this.j = string;
        }

        @Override
        public void k(Set<String> set) {
            this.k = set;
        }

        @Override
        public Set<String> l() {
            return this.l;
        }

        @Override
        public Set<String> n() {
            return this.m;
        }
    }

    static interface J {
        public List<N> b();

        public void m(N var1) throws ax.o4.j;
    }

    static abstract class K
    extends L {
        b h = null;

        K() {
        }
    }

    static abstract class L
    extends N {
        String c = null;
        Boolean d = null;
        E e = null;
        E f = null;
        List<String> g = null;

        L() {
        }

        public String toString() {
            return this.o();
        }
    }

    static class M
    extends j {
        p m;
        p n;
        p o;
        p p;

        M() {
        }

        @Override
        String o() {
            return "linearGradient";
        }
    }

    static class N {
        g a;
        J b;

        N() {
        }

        String o() {
            return "";
        }
    }

    static abstract class O
    implements Cloneable {
        O() {
        }
    }

    static abstract class P
    extends H {
        ax.o4.e o = null;

        P() {
        }
    }

    static class Q
    extends j {
        p m;
        p n;
        p o;
        p p;
        p q;

        Q() {
        }

        @Override
        String o() {
            return "radialGradient";
        }
    }

    static abstract class R
    extends P {
        b p;

        R() {
        }
    }

    static class S
    extends m {
        S() {
        }

        @Override
        String o() {
            return "switch";
        }
    }

    static class T
    extends R
    implements t {
        T() {
        }

        @Override
        String o() {
            return "symbol";
        }
    }

    static class U
    extends Y
    implements X {
        String o;
        private b0 p;

        U() {
        }

        @Override
        public b0 f() {
            return this.p;
        }

        @Override
        String o() {
            return "tref";
        }

        public void p(b0 b02) {
            this.p = b02;
        }
    }

    static class V
    extends a0
    implements X {
        private b0 s;

        V() {
        }

        @Override
        public b0 f() {
            return this.s;
        }

        @Override
        String o() {
            return "tspan";
        }

        public void p(b0 b02) {
            this.s = b02;
        }
    }

    static class W
    extends a0
    implements b0,
    n {
        Matrix s;

        W() {
        }

        @Override
        public void j(Matrix matrix) {
            this.s = matrix;
        }

        @Override
        String o() {
            return "text";
        }
    }

    static interface X {
        public b0 f();
    }

    static abstract class Y
    extends H {
        Y() {
        }

        @Override
        public void m(N n8) throws ax.o4.j {
            if (n8 instanceof X) {
                this.i.add(n8);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Text content elements cannot contain ");
            stringBuilder.append(n8);
            stringBuilder.append(" elements.");
            throw new ax.o4.j(stringBuilder.toString());
        }
    }

    static class Z
    extends Y
    implements X {
        String o;
        p p;
        private b0 q;

        Z() {
        }

        @Override
        public b0 f() {
            return this.q;
        }

        @Override
        String o() {
            return "textPath";
        }

        public void p(b0 b02) {
            this.q = b02;
        }
    }

    static abstract class a0
    extends Y {
        List<p> o;
        List<p> p;
        List<p> q;
        List<p> r;

        a0() {
        }
    }

    static class b {
        float a;
        float b;
        float c;
        float d;

        b(float f8, float f9, float f10, float f11) {
            this.a = f8;
            this.b = f9;
            this.c = f10;
            this.d = f11;
        }

        b(b b8) {
            this.a = b8.a;
            this.b = b8.b;
            this.c = b8.c;
            this.d = b8.d;
        }

        static b a(float f8, float f9, float f10, float f11) {
            return new b(f8, f9, f10 - f8, f11 - f9);
        }

        float b() {
            return this.a + this.c;
        }

        float c() {
            return this.b + this.d;
        }

        RectF d() {
            return new RectF(this.a, this.b, this.b(), this.c());
        }

        void e(b b8) {
            float f8 = b8.a;
            if (f8 < this.a) {
                this.a = f8;
            }
            if ((f8 = b8.b) < this.b) {
                this.b = f8;
            }
            if (b8.b() > this.b()) {
                this.c = b8.b() - this.a;
            }
            if (b8.c() > this.c()) {
                this.d = b8.c() - this.b;
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(this.a);
            stringBuilder.append(" ");
            stringBuilder.append(this.b);
            stringBuilder.append(" ");
            stringBuilder.append(this.c);
            stringBuilder.append(" ");
            stringBuilder.append(this.d);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    static interface b0 {
    }

    static class c {
        p a;
        p b;
        p c;
        p d;

        c(p p8, p p9, p p10, p p11) {
            this.a = p8;
            this.b = p9;
            this.c = p10;
            this.d = p11;
        }
    }

    static class c0
    extends N
    implements X {
        String c;
        private b0 d;

        c0(String string) {
            this.c = string;
        }

        @Override
        public b0 f() {
            return this.d;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TextChild: '");
            stringBuilder.append(this.c);
            stringBuilder.append("'");
            return stringBuilder.toString();
        }
    }

    static class d
    extends l {
        p o;
        p p;
        p q;

        d() {
        }

        @Override
        String o() {
            return "circle";
        }
    }

    static final class d0
    extends Enum<d0> {
        public static final /* enum */ d0 c0;
        public static final /* enum */ d0 d0;
        public static final /* enum */ d0 e0;
        public static final /* enum */ d0 f0;
        public static final /* enum */ d0 g0;
        public static final /* enum */ d0 h0;
        public static final /* enum */ d0 i0;
        public static final /* enum */ d0 j0;
        private static final d0[] k0;
        public static final /* enum */ d0 q;

        static {
            d0 d02;
            d0 d03;
            d0 d04;
            d0 d05;
            d0 d06;
            d0 d07;
            d0 d08;
            d0 d09;
            d0 d010;
            q = d010 = new d0();
            c0 = d09 = new d0();
            d0 = d08 = new d0();
            e0 = d07 = new d0();
            f0 = d06 = new d0();
            g0 = d05 = new d0();
            h0 = d04 = new d0();
            i0 = d03 = new d0();
            j0 = d02 = new d0();
            k0 = new d0[]{d010, d09, d08, d07, d06, d05, d04, d03, d02};
        }

        public static d0 valueOf(String string) {
            return Enum.valueOf(d0.class, string);
        }

        public static d0[] values() {
            return (d0[])k0.clone();
        }
    }

    static class e
    extends m
    implements t {
        Boolean p;

        e() {
        }

        @Override
        String o() {
            return "clipPath";
        }
    }

    static class e0
    extends m {
        String p;
        p q;
        p r;
        p s;
        p t;

        e0() {
        }

        @Override
        String o() {
            return "use";
        }
    }

    static class f
    extends O {
        static final f c0 = new f(-16777216);
        static final f d0 = new f(0);
        int q;

        f(int n8) {
            this.q = n8;
        }

        public String toString() {
            return String.format("#%08x", this.q);
        }
    }

    static class f0
    extends R
    implements t {
        f0() {
        }

        @Override
        String o() {
            return "view";
        }
    }

    static class g
    extends O {
        private static g q = new g();

        private g() {
        }

        static g b() {
            return q;
        }
    }

    static class h
    extends m
    implements t {
        h() {
        }

        @Override
        String o() {
            return "defs";
        }
    }

    static class i
    extends l {
        p o;
        p p;
        p q;
        p r;

        i() {
        }

        @Override
        String o() {
            return "ellipse";
        }
    }

    static abstract class j
    extends L
    implements J {
        List<N> h = new ArrayList<N>();
        Boolean i;
        Matrix j;
        k k;
        String l;

        j() {
        }

        @Override
        public List<N> b() {
            return this.h;
        }

        @Override
        public void m(N n8) throws ax.o4.j {
            if (n8 instanceof D) {
                this.h.add(n8);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Gradient elements cannot contain ");
            stringBuilder.append(n8);
            stringBuilder.append(" elements.");
            throw new ax.o4.j(stringBuilder.toString());
        }
    }

    static final class k
    extends Enum<k> {
        public static final /* enum */ k c0;
        public static final /* enum */ k d0;
        private static final k[] e0;
        public static final /* enum */ k q;

        static {
            k k8;
            k k9;
            k k10;
            q = k10 = new k();
            c0 = k9 = new k();
            d0 = k8 = new k();
            e0 = new k[]{k10, k9, k8};
        }

        public static k valueOf(String string) {
            return Enum.valueOf(k.class, string);
        }

        public static k[] values() {
            return (k[])e0.clone();
        }
    }

    static abstract class l
    extends I
    implements n {
        Matrix n;

        l() {
        }

        @Override
        public void j(Matrix matrix) {
            this.n = matrix;
        }
    }

    static class m
    extends H
    implements n {
        Matrix o;

        m() {
        }

        @Override
        public void j(Matrix matrix) {
            this.o = matrix;
        }

        @Override
        String o() {
            return "group";
        }
    }

    static interface n {
        public void j(Matrix var1);
    }

    static class o
    extends P
    implements n {
        String p;
        p q;
        p r;
        p s;
        p t;
        Matrix u;

        o() {
        }

        @Override
        public void j(Matrix matrix) {
            this.u = matrix;
        }

        @Override
        String o() {
            return "image";
        }
    }

    static class p
    implements Cloneable {
        d0 c0;
        float q;

        p(float f8) {
            this.q = f8;
            this.c0 = d0.q;
        }

        p(float f8, d0 d02) {
            this.q = f8;
            this.c0 = d02;
        }

        float b() {
            return this.q;
        }

        float c(float f8) {
            int n8 = ax.o4.g$a.a[this.c0.ordinal()];
            if (n8 != 1) {
                switch (n8) {
                    default: {
                        return this.q;
                    }
                    case 8: {
                        return this.q * f8 / 6.0f;
                    }
                    case 7: {
                        return this.q * f8 / 72.0f;
                    }
                    case 6: {
                        return this.q * f8 / 25.4f;
                    }
                    case 5: {
                        return this.q * f8 / 2.54f;
                    }
                    case 4: 
                }
                return this.q * f8;
            }
            return this.q;
        }

        float d(ax.o4.h object) {
            if (this.c0 == d0.j0) {
                if ((object = ((ax.o4.h)object).S()) == null) {
                    return this.q;
                }
                float f8 = ((b)object).c;
                float f9 = ((b)object).d;
                if (f8 == f9) {
                    return this.q * f8 / 100.0f;
                }
                f8 = (float)(Math.sqrt(f8 * f8 + f9 * f9) / 1.414213562373095);
                return this.q * f8 / 100.0f;
            }
            return this.h((ax.o4.h)object);
        }

        float f(ax.o4.h h8, float f8) {
            if (this.c0 == d0.j0) {
                return this.q * f8 / 100.0f;
            }
            return this.h(h8);
        }

        float h(ax.o4.h object) {
            switch (ax.o4.g$a.a[this.c0.ordinal()]) {
                default: {
                    return this.q;
                }
                case 9: {
                    object = ((ax.o4.h)object).S();
                    if (object == null) {
                        return this.q;
                    }
                    return this.q * ((b)object).c / 100.0f;
                }
                case 8: {
                    return this.q * ((ax.o4.h)object).T() / 6.0f;
                }
                case 7: {
                    return this.q * ((ax.o4.h)object).T() / 72.0f;
                }
                case 6: {
                    return this.q * ((ax.o4.h)object).T() / 25.4f;
                }
                case 5: {
                    return this.q * ((ax.o4.h)object).T() / 2.54f;
                }
                case 4: {
                    return this.q * ((ax.o4.h)object).T();
                }
                case 3: {
                    return this.q * ((ax.o4.h)object).R();
                }
                case 2: {
                    return this.q * ((ax.o4.h)object).Q();
                }
                case 1: 
            }
            return this.q;
        }

        float i(ax.o4.h object) {
            if (this.c0 == d0.j0) {
                if ((object = ((ax.o4.h)object).S()) == null) {
                    return this.q;
                }
                return this.q * ((b)object).d / 100.0f;
            }
            return this.h((ax.o4.h)object);
        }

        boolean j() {
            return this.q < 0.0f;
        }

        boolean k() {
            return this.q == 0.0f;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(String.valueOf(this.q));
            stringBuilder.append((Object)this.c0);
            return stringBuilder.toString();
        }
    }

    static class q
    extends l {
        p o;
        p p;
        p q;
        p r;

        q() {
        }

        @Override
        String o() {
            return "line";
        }
    }

    static class r
    extends R
    implements t {
        boolean q;
        p r;
        p s;
        p t;
        p u;
        Float v;

        r() {
        }

        @Override
        String o() {
            return "marker";
        }
    }

    static class s
    extends H
    implements t {
        Boolean o;
        Boolean p;
        p q;
        p r;
        p s;
        p t;

        s() {
        }

        @Override
        String o() {
            return "mask";
        }
    }

    static interface t {
    }

    static class u
    extends O {
        O c0;
        String q;

        u(String string, O o8) {
            this.q = string;
            this.c0 = o8;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.q);
            stringBuilder.append(" ");
            stringBuilder.append(this.c0);
            return stringBuilder.toString();
        }
    }

    static class v
    extends l {
        w o;
        Float p;

        v() {
        }

        @Override
        String o() {
            return "path";
        }
    }

    static class w
    implements x {
        private byte[] a = new byte[8];
        private int b = 0;
        private float[] c = new float[16];
        private int d = 0;

        w() {
        }

        private void f(byte by) {
            byte[] byArray;
            int n8 = this.b;
            byte[] byArray2 = this.a;
            if (n8 == byArray2.length) {
                byArray = new byte[byArray2.length * 2];
                System.arraycopy(byArray2, 0, byArray, 0, byArray2.length);
                this.a = byArray;
            }
            byArray = this.a;
            n8 = this.b;
            this.b = n8 + 1;
            byArray[n8] = by;
        }

        private void g(int n8) {
            float[] fArray = this.c;
            if (fArray.length < this.d + n8) {
                float[] fArray2 = new float[fArray.length * 2];
                System.arraycopy(fArray, 0, fArray2, 0, fArray.length);
                this.c = fArray2;
            }
        }

        @Override
        public void a(float f8, float f9, float f10, float f11) {
            int n8;
            int n9;
            this.f((byte)3);
            this.g(4);
            float[] fArray = this.c;
            int n10 = this.d;
            this.d = n9 = n10 + 1;
            fArray[n10] = f8;
            this.d = n8 = n10 + 2;
            fArray[n9] = f9;
            this.d = n9 = n10 + 3;
            fArray[n8] = f10;
            this.d = n10 + 4;
            fArray[n9] = f11;
        }

        @Override
        public void b(float f8, float f9) {
            int n8;
            this.f((byte)0);
            this.g(2);
            float[] fArray = this.c;
            int n9 = this.d;
            this.d = n8 = n9 + 1;
            fArray[n9] = f8;
            this.d = n9 + 2;
            fArray[n8] = f9;
        }

        @Override
        public void c(float f8, float f9, float f10, float f11, float f12, float f13) {
            int n8;
            int n9;
            this.f((byte)2);
            this.g(6);
            float[] fArray = this.c;
            int n10 = this.d;
            this.d = n9 = n10 + 1;
            fArray[n10] = f8;
            this.d = n8 = n10 + 2;
            fArray[n9] = f9;
            this.d = n9 = n10 + 3;
            fArray[n8] = f10;
            this.d = n8 = n10 + 4;
            fArray[n9] = f11;
            this.d = n9 = n10 + 5;
            fArray[n8] = f12;
            this.d = n10 + 6;
            fArray[n9] = f13;
        }

        @Override
        public void close() {
            this.f((byte)8);
        }

        @Override
        public void d(float f8, float f9, float f10, boolean bl, boolean bl2, float f11, float f12) {
            int n8;
            int n9;
            int n10 = bl ? 2 : 0;
            this.f((byte)(n10 | 4 | bl2));
            this.g(5);
            float[] fArray = this.c;
            n10 = this.d;
            this.d = n9 = n10 + 1;
            fArray[n10] = f8;
            this.d = n8 = n10 + 2;
            fArray[n9] = f9;
            this.d = n9 = n10 + 3;
            fArray[n8] = f10;
            this.d = n8 = n10 + 4;
            fArray[n9] = f11;
            this.d = n10 + 5;
            fArray[n8] = f12;
        }

        @Override
        public void e(float f8, float f9) {
            int n8;
            this.f((byte)1);
            this.g(2);
            float[] fArray = this.c;
            int n9 = this.d;
            this.d = n8 = n9 + 1;
            fArray[n9] = f8;
            this.d = n9 + 2;
            fArray[n8] = f9;
        }

        void h(x x8) {
            int n8 = 0;
            for (int i8 = 0; i8 < this.b; ++i8) {
                float f8;
                float[] fArray;
                int n9 = this.a[i8];
                if (n9 != 0) {
                    if (n9 != 1) {
                        if (n9 != 2) {
                            if (n9 != 3) {
                                if (n9 != 8) {
                                    boolean bl = (n9 & 2) != 0;
                                    boolean bl2 = (n9 & 1) != 0;
                                    fArray = this.c;
                                    x8.d(fArray[n8], fArray[n8 + 1], fArray[n8 + 2], bl, bl2, fArray[n8 + 3], fArray[n8 + 4]);
                                    n8 += 5;
                                    continue;
                                }
                                x8.close();
                                continue;
                            }
                            fArray = this.c;
                            float f9 = fArray[n8];
                            float f10 = fArray[n8 + 1];
                            f8 = fArray[n8 + 2];
                            n9 = n8 + 4;
                            x8.a(f9, f10, f8, fArray[n8 + 3]);
                            n8 = n9;
                            continue;
                        }
                        fArray = this.c;
                        x8.c(fArray[n8], fArray[n8 + 1], fArray[n8 + 2], fArray[n8 + 3], fArray[n8 + 4], fArray[n8 + 5]);
                        n8 += 6;
                        continue;
                    }
                    fArray = this.c;
                    f8 = fArray[n8];
                    n9 = n8 + 2;
                    x8.e(f8, fArray[n8 + 1]);
                    n8 = n9;
                    continue;
                }
                fArray = this.c;
                f8 = fArray[n8];
                n9 = n8 + 2;
                x8.b(f8, fArray[n8 + 1]);
                n8 = n9;
            }
        }

        boolean i() {
            return this.b == 0;
        }
    }

    static interface x {
        public void a(float var1, float var2, float var3, float var4);

        public void b(float var1, float var2);

        public void c(float var1, float var2, float var3, float var4, float var5, float var6);

        public void close();

        public void d(float var1, float var2, float var3, boolean var4, boolean var5, float var6, float var7);

        public void e(float var1, float var2);
    }

    static class y
    extends R
    implements t {
        Boolean q;
        Boolean r;
        Matrix s;
        p t;
        p u;
        p v;
        p w;
        String x;

        y() {
        }

        @Override
        String o() {
            return "pattern";
        }
    }

    static class z
    extends l {
        float[] o;

        z() {
        }

        @Override
        String o() {
            return "polyline";
        }
    }
}

