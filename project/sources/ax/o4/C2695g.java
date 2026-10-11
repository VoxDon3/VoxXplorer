package ax.o4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import ax.o4.C2690b;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;

/* renamed from: ax.o4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2695g {
    private static boolean g = true;
    private F a = null;
    private String b = HttpUrl.FRAGMENT_ENCODE_SET;
    private String c = HttpUrl.FRAGMENT_ENCODE_SET;
    private float d = 96.0f;
    private C2690b.r e = new C2690b.r();
    private Map<String, L> f = new HashMap();

    /* renamed from: ax.o4.g$A */
    static class A extends C2720z {
        A() {
        }

        @Override // ax.o4.C2695g.C2720z, ax.o4.C2695g.N
        String o() {
            return "polygon";
        }
    }

    /* renamed from: ax.o4.g$B */
    static class B extends AbstractC2706l {
        C2710p o;
        C2710p p;
        C2710p q;
        C2710p r;
        C2710p s;
        C2710p t;

        B() {
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "rect";
        }
    }

    /* renamed from: ax.o4.g$E */
    static class E implements Cloneable {
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
        C2710p h0;
        c i0;
        d j0;
        Float k0;
        C2710p[] l0;
        C2710p m0;
        Float n0;
        C2701f o0;
        List<String> p0;
        long q = 0;
        C2710p q0;
        Integer r0;
        b s0;
        EnumC0397g t0;
        h u0;
        f v0;
        Boolean w0;
        C2698c x0;
        String y0;
        String z0;

        /* renamed from: ax.o4.g$E$a */
        public enum a {
            NonZero,
            EvenOdd
        }

        /* renamed from: ax.o4.g$E$b */
        public enum b {
            Normal,
            Italic,
            Oblique
        }

        /* renamed from: ax.o4.g$E$c */
        public enum c {
            Butt,
            Round,
            Square
        }

        /* renamed from: ax.o4.g$E$d */
        public enum d {
            Miter,
            Round,
            Bevel
        }

        /* renamed from: ax.o4.g$E$e */
        public enum e {
            auto,
            optimizeQuality,
            optimizeSpeed
        }

        /* renamed from: ax.o4.g$E$f */
        public enum f {
            Start,
            Middle,
            End
        }

        /* renamed from: ax.o4.g$E$g, reason: collision with other inner class name */
        public enum EnumC0397g {
            None,
            Underline,
            Overline,
            LineThrough,
            Blink
        }

        /* renamed from: ax.o4.g$E$h */
        public enum h {
            LTR,
            RTL
        }

        /* renamed from: ax.o4.g$E$i */
        public enum i {
            None,
            NonScalingStroke
        }

        E() {
        }

        static E b() {
            E e2 = new E();
            e2.q = -1L;
            C2701f c2701f = C2701f.c0;
            e2.c0 = c2701f;
            a aVar = a.NonZero;
            e2.d0 = aVar;
            Float valueOf = Float.valueOf(1.0f);
            e2.e0 = valueOf;
            e2.f0 = null;
            e2.g0 = valueOf;
            e2.h0 = new C2710p(1.0f);
            e2.i0 = c.Butt;
            e2.j0 = d.Miter;
            e2.k0 = Float.valueOf(4.0f);
            e2.l0 = null;
            e2.m0 = new C2710p(0.0f);
            e2.n0 = valueOf;
            e2.o0 = c2701f;
            e2.p0 = null;
            e2.q0 = new C2710p(12.0f, d0.pt);
            e2.r0 = 400;
            e2.s0 = b.Normal;
            e2.t0 = EnumC0397g.None;
            e2.u0 = h.LTR;
            e2.v0 = f.Start;
            Boolean bool = Boolean.TRUE;
            e2.w0 = bool;
            e2.x0 = null;
            e2.y0 = null;
            e2.z0 = null;
            e2.A0 = null;
            e2.B0 = bool;
            e2.C0 = bool;
            e2.D0 = c2701f;
            e2.E0 = valueOf;
            e2.F0 = null;
            e2.G0 = aVar;
            e2.H0 = null;
            e2.I0 = null;
            e2.J0 = valueOf;
            e2.K0 = null;
            e2.L0 = valueOf;
            e2.M0 = i.None;
            e2.N0 = e.auto;
            return e2;
        }

        void c(boolean z) {
            Boolean bool = Boolean.TRUE;
            this.B0 = bool;
            if (!z) {
                bool = Boolean.FALSE;
            }
            this.w0 = bool;
            this.x0 = null;
            this.F0 = null;
            this.n0 = Float.valueOf(1.0f);
            this.D0 = C2701f.c0;
            this.E0 = Float.valueOf(1.0f);
            this.H0 = null;
            this.I0 = null;
            this.J0 = Float.valueOf(1.0f);
            this.K0 = null;
            this.L0 = Float.valueOf(1.0f);
            this.M0 = i.None;
        }

        protected Object clone() throws CloneNotSupportedException {
            E e2 = (E) super.clone();
            C2710p[] c2710pArr = this.l0;
            if (c2710pArr != null) {
                e2.l0 = (C2710p[]) c2710pArr.clone();
            }
            return e2;
        }
    }

    /* renamed from: ax.o4.g$F */
    static class F extends R {
        C2710p q;
        C2710p r;
        C2710p s;
        C2710p t;
        public String u;

        F() {
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "svg";
        }
    }

    /* renamed from: ax.o4.g$G */
    interface G {
        Set<String> a();

        void c(Set<String> set);

        String d();

        void e(Set<String> set);

        void g(Set<String> set);

        Set<String> h();

        void i(String str);

        void k(Set<String> set);

        Set<String> l();

        Set<String> n();
    }

    /* renamed from: ax.o4.g$H */
    static abstract class H extends K implements J, G {
        List<N> i = new ArrayList();
        Set<String> j = null;
        String k = null;
        Set<String> l = null;
        Set<String> m = null;
        Set<String> n = null;

        H() {
        }

        @Override // ax.o4.C2695g.G
        public Set<String> a() {
            return null;
        }

        @Override // ax.o4.C2695g.J
        public List<N> b() {
            return this.i;
        }

        @Override // ax.o4.C2695g.G
        public void c(Set<String> set) {
            this.m = set;
        }

        @Override // ax.o4.C2695g.G
        public String d() {
            return this.k;
        }

        @Override // ax.o4.C2695g.G
        public void e(Set<String> set) {
            this.n = set;
        }

        @Override // ax.o4.C2695g.G
        public void g(Set<String> set) {
            this.j = set;
        }

        @Override // ax.o4.C2695g.G
        public Set<String> h() {
            return this.j;
        }

        @Override // ax.o4.C2695g.G
        public void i(String str) {
            this.k = str;
        }

        @Override // ax.o4.C2695g.G
        public void k(Set<String> set) {
            this.l = set;
        }

        @Override // ax.o4.C2695g.G
        public Set<String> l() {
            return this.m;
        }

        @Override // ax.o4.C2695g.J
        public void m(N n) throws j {
            this.i.add(n);
        }

        @Override // ax.o4.C2695g.G
        public Set<String> n() {
            return this.n;
        }
    }

    /* renamed from: ax.o4.g$I */
    static abstract class I extends K implements G {
        Set<String> i = null;
        String j = null;
        Set<String> k = null;
        Set<String> l = null;
        Set<String> m = null;

        I() {
        }

        @Override // ax.o4.C2695g.G
        public Set<String> a() {
            return this.k;
        }

        @Override // ax.o4.C2695g.G
        public void c(Set<String> set) {
            this.l = set;
        }

        @Override // ax.o4.C2695g.G
        public String d() {
            return this.j;
        }

        @Override // ax.o4.C2695g.G
        public void e(Set<String> set) {
            this.m = set;
        }

        @Override // ax.o4.C2695g.G
        public void g(Set<String> set) {
            this.i = set;
        }

        @Override // ax.o4.C2695g.G
        public Set<String> h() {
            return this.i;
        }

        @Override // ax.o4.C2695g.G
        public void i(String str) {
            this.j = str;
        }

        @Override // ax.o4.C2695g.G
        public void k(Set<String> set) {
            this.k = set;
        }

        @Override // ax.o4.C2695g.G
        public Set<String> l() {
            return this.l;
        }

        @Override // ax.o4.C2695g.G
        public Set<String> n() {
            return this.m;
        }
    }

    /* renamed from: ax.o4.g$J */
    interface J {
        List<N> b();

        void m(N n) throws j;
    }

    /* renamed from: ax.o4.g$K */
    static abstract class K extends L {
        C2697b h = null;

        K() {
        }
    }

    /* renamed from: ax.o4.g$L */
    static abstract class L extends N {
        String c = null;
        Boolean d = null;
        E e = null;
        E f = null;
        List<String> g = null;

        L() {
        }

        public String toString() {
            return o();
        }
    }

    /* renamed from: ax.o4.g$M */
    static class M extends AbstractC2704j {
        C2710p m;
        C2710p n;
        C2710p o;
        C2710p p;

        M() {
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "linearGradient";
        }
    }

    /* renamed from: ax.o4.g$N */
    static class N {
        C2695g a;
        J b;

        N() {
        }

        String o() {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* renamed from: ax.o4.g$O */
    static abstract class O implements Cloneable {
        O() {
        }
    }

    /* renamed from: ax.o4.g$P */
    static abstract class P extends H {
        C2693e o = null;

        P() {
        }
    }

    /* renamed from: ax.o4.g$Q */
    static class Q extends AbstractC2704j {
        C2710p m;
        C2710p n;
        C2710p o;
        C2710p p;
        C2710p q;

        Q() {
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "radialGradient";
        }
    }

    /* renamed from: ax.o4.g$R */
    static abstract class R extends P {
        C2697b p;

        R() {
        }
    }

    /* renamed from: ax.o4.g$S */
    static class S extends C2707m {
        S() {
        }

        @Override // ax.o4.C2695g.C2707m, ax.o4.C2695g.N
        String o() {
            return "switch";
        }
    }

    /* renamed from: ax.o4.g$T */
    static class T extends R implements InterfaceC2714t {
        T() {
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "symbol";
        }
    }

    /* renamed from: ax.o4.g$U */
    static class U extends Y implements X {
        String o;
        private b0 p;

        U() {
        }

        @Override // ax.o4.C2695g.X
        public b0 f() {
            return this.p;
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "tref";
        }

        public void p(b0 b0Var) {
            this.p = b0Var;
        }
    }

    /* renamed from: ax.o4.g$V */
    static class V extends a0 implements X {
        private b0 s;

        V() {
        }

        @Override // ax.o4.C2695g.X
        public b0 f() {
            return this.s;
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "tspan";
        }

        public void p(b0 b0Var) {
            this.s = b0Var;
        }
    }

    /* renamed from: ax.o4.g$W */
    static class W extends a0 implements b0, InterfaceC2708n {
        Matrix s;

        W() {
        }

        @Override // ax.o4.C2695g.InterfaceC2708n
        public void j(Matrix matrix) {
            this.s = matrix;
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "text";
        }
    }

    /* renamed from: ax.o4.g$X */
    interface X {
        b0 f();
    }

    /* renamed from: ax.o4.g$Y */
    static abstract class Y extends H {
        Y() {
        }

        @Override // ax.o4.C2695g.H, ax.o4.C2695g.J
        public void m(N n) throws j {
            if (n instanceof X) {
                this.i.add(n);
                return;
            }
            throw new j("Text content elements cannot contain " + n + " elements.");
        }
    }

    /* renamed from: ax.o4.g$Z */
    static class Z extends Y implements X {
        String o;
        C2710p p;
        private b0 q;

        Z() {
        }

        @Override // ax.o4.C2695g.X
        public b0 f() {
            return this.q;
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "textPath";
        }

        public void p(b0 b0Var) {
            this.q = b0Var;
        }
    }

    /* renamed from: ax.o4.g$a, reason: case insensitive filesystem */
    static /* synthetic */ class C2696a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d0.values().length];
            a = iArr;
            try {
                iArr[d0.px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d0.em.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d0.ex.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d0.in.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d0.cm.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[d0.mm.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[d0.pt.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[d0.pc.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[d0.percent.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: ax.o4.g$a0 */
    static abstract class a0 extends Y {
        List<C2710p> o;
        List<C2710p> p;
        List<C2710p> q;
        List<C2710p> r;

        a0() {
        }
    }

    /* renamed from: ax.o4.g$b0 */
    interface b0 {
    }

    /* renamed from: ax.o4.g$c, reason: case insensitive filesystem */
    static class C2698c {
        C2710p a;
        C2710p b;
        C2710p c;
        C2710p d;

        C2698c(C2710p c2710p, C2710p c2710p2, C2710p c2710p3, C2710p c2710p4) {
            this.a = c2710p;
            this.b = c2710p2;
            this.c = c2710p3;
            this.d = c2710p4;
        }
    }

    /* renamed from: ax.o4.g$c0 */
    static class c0 extends N implements X {
        String c;
        private b0 d;

        c0(String str) {
            this.c = str;
        }

        @Override // ax.o4.C2695g.X
        public b0 f() {
            return this.d;
        }

        public String toString() {
            return "TextChild: '" + this.c + "'";
        }
    }

    /* renamed from: ax.o4.g$d, reason: case insensitive filesystem */
    static class C2699d extends AbstractC2706l {
        C2710p o;
        C2710p p;
        C2710p q;

        C2699d() {
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "circle";
        }
    }

    /* renamed from: ax.o4.g$d0 */
    enum d0 {
        px,
        em,
        ex,
        in,
        cm,
        mm,
        pt,
        pc,
        percent
    }

    /* renamed from: ax.o4.g$e, reason: case insensitive filesystem */
    static class C2700e extends C2707m implements InterfaceC2714t {
        Boolean p;

        C2700e() {
        }

        @Override // ax.o4.C2695g.C2707m, ax.o4.C2695g.N
        String o() {
            return "clipPath";
        }
    }

    /* renamed from: ax.o4.g$e0 */
    static class e0 extends C2707m {
        String p;
        C2710p q;
        C2710p r;
        C2710p s;
        C2710p t;

        e0() {
        }

        @Override // ax.o4.C2695g.C2707m, ax.o4.C2695g.N
        String o() {
            return "use";
        }
    }

    /* renamed from: ax.o4.g$f, reason: case insensitive filesystem */
    static class C2701f extends O {
        static final C2701f c0 = new C2701f(-16777216);
        static final C2701f d0 = new C2701f(0);
        int q;

        C2701f(int i) {
            this.q = i;
        }

        public String toString() {
            return String.format("#%08x", Integer.valueOf(this.q));
        }
    }

    /* renamed from: ax.o4.g$f0 */
    static class f0 extends R implements InterfaceC2714t {
        f0() {
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "view";
        }
    }

    /* renamed from: ax.o4.g$g, reason: collision with other inner class name */
    static class C0398g extends O {
        private static C0398g q = new C0398g();

        private C0398g() {
        }

        static C0398g b() {
            return q;
        }
    }

    /* renamed from: ax.o4.g$h, reason: case insensitive filesystem */
    static class C2702h extends C2707m implements InterfaceC2714t {
        C2702h() {
        }

        @Override // ax.o4.C2695g.C2707m, ax.o4.C2695g.N
        String o() {
            return "defs";
        }
    }

    /* renamed from: ax.o4.g$i, reason: case insensitive filesystem */
    static class C2703i extends AbstractC2706l {
        C2710p o;
        C2710p p;
        C2710p q;
        C2710p r;

        C2703i() {
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "ellipse";
        }
    }

    /* renamed from: ax.o4.g$j, reason: case insensitive filesystem */
    static abstract class AbstractC2704j extends L implements J {
        List<N> h = new ArrayList();
        Boolean i;
        Matrix j;
        EnumC2705k k;
        String l;

        AbstractC2704j() {
        }

        @Override // ax.o4.C2695g.J
        public List<N> b() {
            return this.h;
        }

        @Override // ax.o4.C2695g.J
        public void m(N n) throws j {
            if (n instanceof D) {
                this.h.add(n);
                return;
            }
            throw new j("Gradient elements cannot contain " + n + " elements.");
        }
    }

    /* renamed from: ax.o4.g$k, reason: case insensitive filesystem */
    enum EnumC2705k {
        pad,
        reflect,
        repeat
    }

    /* renamed from: ax.o4.g$l, reason: case insensitive filesystem */
    static abstract class AbstractC2706l extends I implements InterfaceC2708n {
        Matrix n;

        AbstractC2706l() {
        }

        @Override // ax.o4.C2695g.InterfaceC2708n
        public void j(Matrix matrix) {
            this.n = matrix;
        }
    }

    /* renamed from: ax.o4.g$m, reason: case insensitive filesystem */
    static class C2707m extends H implements InterfaceC2708n {
        Matrix o;

        C2707m() {
        }

        @Override // ax.o4.C2695g.InterfaceC2708n
        public void j(Matrix matrix) {
            this.o = matrix;
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "group";
        }
    }

    /* renamed from: ax.o4.g$n, reason: case insensitive filesystem */
    interface InterfaceC2708n {
        void j(Matrix matrix);
    }

    /* renamed from: ax.o4.g$o, reason: case insensitive filesystem */
    static class C2709o extends P implements InterfaceC2708n {
        String p;
        C2710p q;
        C2710p r;
        C2710p s;
        C2710p t;
        Matrix u;

        C2709o() {
        }

        @Override // ax.o4.C2695g.InterfaceC2708n
        public void j(Matrix matrix) {
            this.u = matrix;
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "image";
        }
    }

    /* renamed from: ax.o4.g$q, reason: case insensitive filesystem */
    static class C2711q extends AbstractC2706l {
        C2710p o;
        C2710p p;
        C2710p q;
        C2710p r;

        C2711q() {
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "line";
        }
    }

    /* renamed from: ax.o4.g$r, reason: case insensitive filesystem */
    static class C2712r extends R implements InterfaceC2714t {
        boolean q;
        C2710p r;
        C2710p s;
        C2710p t;
        C2710p u;
        Float v;

        C2712r() {
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "marker";
        }
    }

    /* renamed from: ax.o4.g$s, reason: case insensitive filesystem */
    static class C2713s extends H implements InterfaceC2714t {
        Boolean o;
        Boolean p;
        C2710p q;
        C2710p r;
        C2710p s;
        C2710p t;

        C2713s() {
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "mask";
        }
    }

    /* renamed from: ax.o4.g$t, reason: case insensitive filesystem */
    interface InterfaceC2714t {
    }

    /* renamed from: ax.o4.g$u, reason: case insensitive filesystem */
    static class C2715u extends O {
        O c0;
        String q;

        C2715u(String str, O o) {
            this.q = str;
            this.c0 = o;
        }

        public String toString() {
            return this.q + " " + this.c0;
        }
    }

    /* renamed from: ax.o4.g$v, reason: case insensitive filesystem */
    static class C2716v extends AbstractC2706l {
        C2717w o;
        Float p;

        C2716v() {
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "path";
        }
    }

    /* renamed from: ax.o4.g$w, reason: case insensitive filesystem */
    static class C2717w implements InterfaceC2718x {
        private int b = 0;
        private int d = 0;
        private byte[] a = new byte[8];
        private float[] c = new float[16];

        C2717w() {
        }

        private void f(byte b) {
            int i = this.b;
            byte[] bArr = this.a;
            if (i == bArr.length) {
                byte[] bArr2 = new byte[bArr.length * 2];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.a = bArr2;
            }
            byte[] bArr3 = this.a;
            int i2 = this.b;
            this.b = i2 + 1;
            bArr3[i2] = b;
        }

        private void g(int i) {
            float[] fArr = this.c;
            if (fArr.length < this.d + i) {
                float[] fArr2 = new float[fArr.length * 2];
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                this.c = fArr2;
            }
        }

        @Override // ax.o4.C2695g.InterfaceC2718x
        public void a(float f, float f2, float f3, float f4) {
            f((byte) 3);
            g(4);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            this.d = i + 4;
            fArr[i4] = f4;
        }

        @Override // ax.o4.C2695g.InterfaceC2718x
        public void b(float f, float f2) {
            f((byte) 0);
            g(2);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            this.d = i + 2;
            fArr[i2] = f2;
        }

        @Override // ax.o4.C2695g.InterfaceC2718x
        public void c(float f, float f2, float f3, float f4, float f5, float f6) {
            f((byte) 2);
            g(6);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.d = i5;
            fArr[i4] = f4;
            int i6 = i + 5;
            this.d = i6;
            fArr[i5] = f5;
            this.d = i + 6;
            fArr[i6] = f6;
        }

        @Override // ax.o4.C2695g.InterfaceC2718x
        public void close() {
            f((byte) 8);
        }

        @Override // ax.o4.C2695g.InterfaceC2718x
        public void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            f((byte) ((z ? 2 : 0) | 4 | (z2 ? 1 : 0)));
            g(5);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            int i3 = i + 2;
            this.d = i3;
            fArr[i2] = f2;
            int i4 = i + 3;
            this.d = i4;
            fArr[i3] = f3;
            int i5 = i + 4;
            this.d = i5;
            fArr[i4] = f4;
            this.d = i + 5;
            fArr[i5] = f5;
        }

        @Override // ax.o4.C2695g.InterfaceC2718x
        public void e(float f, float f2) {
            f((byte) 1);
            g(2);
            float[] fArr = this.c;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            fArr[i] = f;
            this.d = i + 2;
            fArr[i2] = f2;
        }

        void h(InterfaceC2718x interfaceC2718x) {
            int i = 0;
            for (int i2 = 0; i2 < this.b; i2++) {
                byte b = this.a[i2];
                if (b == 0) {
                    float[] fArr = this.c;
                    int i3 = i + 1;
                    float f = fArr[i];
                    i += 2;
                    interfaceC2718x.b(f, fArr[i3]);
                } else if (b == 1) {
                    float[] fArr2 = this.c;
                    int i4 = i + 1;
                    float f2 = fArr2[i];
                    i += 2;
                    interfaceC2718x.e(f2, fArr2[i4]);
                } else if (b == 2) {
                    float[] fArr3 = this.c;
                    interfaceC2718x.c(fArr3[i], fArr3[i + 1], fArr3[i + 2], fArr3[i + 3], fArr3[i + 4], fArr3[i + 5]);
                    i += 6;
                } else if (b == 3) {
                    float[] fArr4 = this.c;
                    float f3 = fArr4[i];
                    float f4 = fArr4[i + 1];
                    int i5 = i + 3;
                    float f5 = fArr4[i + 2];
                    i += 4;
                    interfaceC2718x.a(f3, f4, f5, fArr4[i5]);
                } else if (b != 8) {
                    boolean z = (b & 2) != 0;
                    boolean z2 = (b & 1) != 0;
                    float[] fArr5 = this.c;
                    interfaceC2718x.d(fArr5[i], fArr5[i + 1], fArr5[i + 2], z, z2, fArr5[i + 3], fArr5[i + 4]);
                    i += 5;
                } else {
                    interfaceC2718x.close();
                }
            }
        }

        boolean i() {
            return this.b == 0;
        }
    }

    /* renamed from: ax.o4.g$x, reason: case insensitive filesystem */
    interface InterfaceC2718x {
        void a(float f, float f2, float f3, float f4);

        void b(float f, float f2);

        void c(float f, float f2, float f3, float f4, float f5, float f6);

        void close();

        void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5);

        void e(float f, float f2);
    }

    /* renamed from: ax.o4.g$y, reason: case insensitive filesystem */
    static class C2719y extends R implements InterfaceC2714t {
        Boolean q;
        Boolean r;
        Matrix s;
        C2710p t;
        C2710p u;
        C2710p v;
        C2710p w;
        String x;

        C2719y() {
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "pattern";
        }
    }

    /* renamed from: ax.o4.g$z, reason: case insensitive filesystem */
    static class C2720z extends AbstractC2706l {
        float[] o;

        C2720z() {
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "polyline";
        }
    }

    C2695g() {
    }

    private String c(String str) {
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        return str.replace("\\\n", HttpUrl.FRAGMENT_ENCODE_SET).replace("\\A", "\n");
    }

    private C2697b e(float f) {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        d0 d0Var4;
        float f2;
        d0 d0Var5;
        F f3 = this.a;
        C2710p c2710p = f3.s;
        C2710p c2710p2 = f3.t;
        if (c2710p == null || c2710p.k() || (d0Var = c2710p.c0) == (d0Var2 = d0.percent) || d0Var == (d0Var3 = d0.em) || d0Var == (d0Var4 = d0.ex)) {
            return new C2697b(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float c = c2710p.c(f);
        if (c2710p2 == null) {
            C2697b c2697b = this.a.p;
            f2 = c2697b != null ? (c2697b.d * c) / c2697b.c : c;
        } else {
            if (c2710p2.k() || (d0Var5 = c2710p2.c0) == d0Var2 || d0Var5 == d0Var3 || d0Var5 == d0Var4) {
                return new C2697b(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            f2 = c2710p2.c(f);
        }
        return new C2697b(0.0f, 0.0f, c, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private L i(J j, String str) {
        L i;
        L l = (L) j;
        if (str.equals(l.c)) {
            return l;
        }
        for (Object obj : j.b()) {
            if (obj instanceof L) {
                L l2 = (L) obj;
                if (str.equals(l2.c)) {
                    return l2;
                }
                if ((obj instanceof J) && (i = i((J) obj, str)) != null) {
                    return i;
                }
            }
        }
        return null;
    }

    static C2722i k() {
        return null;
    }

    public static C2695g l(InputStream inputStream) throws j {
        return new k().z(inputStream, g);
    }

    void a(C2690b.r rVar) {
        this.e.b(rVar);
    }

    void b() {
        this.e.e(C2690b.u.RenderOptions);
    }

    List<C2690b.p> d() {
        return this.e.c();
    }

    public float f() {
        if (this.a != null) {
            return e(this.d).d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public RectF g() {
        F f = this.a;
        if (f == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        C2697b c2697b = f.p;
        if (c2697b == null) {
            return null;
        }
        return c2697b.d();
    }

    public float h() {
        if (this.a != null) {
            return e(this.d).c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    L j(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.equals(this.a.c)) {
            return this.a;
        }
        if (this.f.containsKey(str)) {
            return this.f.get(str);
        }
        L i = i(this.a, str);
        this.f.put(str, i);
        return i;
    }

    F m() {
        return this.a;
    }

    boolean n() {
        return !this.e.d();
    }

    public Picture o() {
        return q(null);
    }

    public Picture p(int i, int i2, C2694f c2694f) {
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i, i2);
        if (c2694f == null || c2694f.f == null) {
            c2694f = c2694f == null ? new C2694f() : new C2694f(c2694f);
            c2694f.g(0.0f, 0.0f, i, i2);
        }
        new C2721h(beginRecording, this.d).G0(this, c2694f);
        picture.endRecording();
        return picture;
    }

    public Picture q(C2694f c2694f) {
        C2710p c2710p;
        C2697b c2697b = (c2694f == null || !c2694f.e()) ? this.a.p : c2694f.d;
        if (c2694f != null && c2694f.f()) {
            return p((int) Math.ceil(c2694f.f.b()), (int) Math.ceil(c2694f.f.c()), c2694f);
        }
        F f = this.a;
        C2710p c2710p2 = f.s;
        if (c2710p2 != null) {
            d0 d0Var = c2710p2.c0;
            d0 d0Var2 = d0.percent;
            if (d0Var != d0Var2 && (c2710p = f.t) != null && c2710p.c0 != d0Var2) {
                return p((int) Math.ceil(c2710p2.c(this.d)), (int) Math.ceil(this.a.t.c(this.d)), c2694f);
            }
        }
        if (c2710p2 != null && c2697b != null) {
            return p((int) Math.ceil(c2710p2.c(this.d)), (int) Math.ceil((c2697b.d * r1) / c2697b.c), c2694f);
        }
        C2710p c2710p3 = f.t;
        if (c2710p3 == null || c2697b == null) {
            return p(512, 512, c2694f);
        }
        return p((int) Math.ceil((c2697b.c * r1) / c2697b.d), (int) Math.ceil(c2710p3.c(this.d)), c2694f);
    }

    N r(String str) {
        if (str == null) {
            return null;
        }
        String c = c(str);
        if (c.length() <= 1 || !c.startsWith("#")) {
            return null;
        }
        return j(c.substring(1));
    }

    void s(String str) {
        this.c = str;
    }

    void t(F f) {
        this.a = f;
    }

    void u(String str) {
        this.b = str;
    }

    /* renamed from: ax.o4.g$p, reason: case insensitive filesystem */
    static class C2710p implements Cloneable {
        d0 c0;
        float q;

        C2710p(float f, d0 d0Var) {
            this.q = f;
            this.c0 = d0Var;
        }

        float b() {
            return this.q;
        }

        float c(float f) {
            int i = C2696a.a[this.c0.ordinal()];
            if (i == 1) {
                return this.q;
            }
            switch (i) {
                case 4:
                    return this.q * f;
                case 5:
                    return (this.q * f) / 2.54f;
                case 6:
                    return (this.q * f) / 25.4f;
                case 7:
                    return (this.q * f) / 72.0f;
                case 8:
                    return (this.q * f) / 6.0f;
                default:
                    return this.q;
            }
        }

        float d(C2721h c2721h) {
            if (this.c0 != d0.percent) {
                return h(c2721h);
            }
            C2697b S = c2721h.S();
            if (S == null) {
                return this.q;
            }
            float f = S.c;
            if (f == S.d) {
                return (this.q * f) / 100.0f;
            }
            return (this.q * ((float) (Math.sqrt((f * f) + (r7 * r7)) / 1.414213562373095d))) / 100.0f;
        }

        float f(C2721h c2721h, float f) {
            return this.c0 == d0.percent ? (this.q * f) / 100.0f : h(c2721h);
        }

        float h(C2721h c2721h) {
            switch (C2696a.a[this.c0.ordinal()]) {
                case 9:
                    C2697b S = c2721h.S();
                    if (S != null) {
                        break;
                    } else {
                        break;
                    }
            }
            return this.q;
        }

        float i(C2721h c2721h) {
            if (this.c0 != d0.percent) {
                return h(c2721h);
            }
            C2697b S = c2721h.S();
            return S == null ? this.q : (this.q * S.d) / 100.0f;
        }

        boolean j() {
            return this.q < 0.0f;
        }

        boolean k() {
            return this.q == 0.0f;
        }

        public String toString() {
            return String.valueOf(this.q) + this.c0;
        }

        C2710p(float f) {
            this.q = f;
            this.c0 = d0.px;
        }
    }

    /* renamed from: ax.o4.g$b, reason: case insensitive filesystem */
    static class C2697b {
        float a;
        float b;
        float c;
        float d;

        C2697b(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        static C2697b a(float f, float f2, float f3, float f4) {
            return new C2697b(f, f2, f3 - f, f4 - f2);
        }

        float b() {
            return this.a + this.c;
        }

        float c() {
            return this.b + this.d;
        }

        RectF d() {
            return new RectF(this.a, this.b, b(), c());
        }

        void e(C2697b c2697b) {
            float f = c2697b.a;
            if (f < this.a) {
                this.a = f;
            }
            float f2 = c2697b.b;
            if (f2 < this.b) {
                this.b = f2;
            }
            if (c2697b.b() > b()) {
                this.c = c2697b.b() - this.a;
            }
            if (c2697b.c() > c()) {
                this.d = c2697b.c() - this.b;
            }
        }

        public String toString() {
            return "[" + this.a + " " + this.b + " " + this.c + " " + this.d + "]";
        }

        C2697b(C2697b c2697b) {
            this.a = c2697b.a;
            this.b = c2697b.b;
            this.c = c2697b.c;
            this.d = c2697b.d;
        }
    }

    /* renamed from: ax.o4.g$C */
    static class C extends L implements J {
        C() {
        }

        @Override // ax.o4.C2695g.J
        public List<N> b() {
            return Collections.EMPTY_LIST;
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "solidColor";
        }

        @Override // ax.o4.C2695g.J
        public void m(N n) {
        }
    }

    /* renamed from: ax.o4.g$D */
    static class D extends L implements J {
        Float h;

        D() {
        }

        @Override // ax.o4.C2695g.J
        public List<N> b() {
            return Collections.EMPTY_LIST;
        }

        @Override // ax.o4.C2695g.N
        String o() {
            return "stop";
        }

        @Override // ax.o4.C2695g.J
        public void m(N n) {
        }
    }
}
