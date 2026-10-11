package ax.lb;

import ax.kb.g;
import ax.mb.AbstractC2550d;
import ax.mb.C2547a;
import ax.mb.C2548b;

/* renamed from: ax.lb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2500f {

    /* renamed from: ax.lb.f$a */
    public static class a extends g {
        public int h;
        public String i;
        public int j;
        public AbstractC2550d k;
        public int l;
        public int m;
        public int n;

        public a(String str, int i, AbstractC2550d abstractC2550d, int i2, int i3, int i4) {
            this.i = str;
            this.j = i;
            this.k = abstractC2550d;
            this.l = i2;
            this.m = i3;
            this.n = i4;
        }

        @Override // ax.kb.g
        public void d(C2547a c2547a) throws C2548b {
            this.j = c2547a.c();
            c2547a.c();
            if (c2547a.c() != 0) {
                if (this.k == null) {
                    this.k = new d();
                }
                c2547a = c2547a.g;
                this.k.a(c2547a);
            }
            this.m = c2547a.c();
            this.n = c2547a.c();
            this.h = c2547a.c();
        }

        @Override // ax.kb.g
        public void f(C2547a c2547a) throws C2548b {
            c2547a.i(this.i, 1);
            String str = this.i;
            if (str != null) {
                c2547a.l(str);
            }
            c2547a.h(this.j);
            c2547a.h(this.j);
            c2547a.i(this.k, 1);
            AbstractC2550d abstractC2550d = this.k;
            if (abstractC2550d != null) {
                c2547a = c2547a.g;
                abstractC2550d.b(c2547a);
            }
            c2547a.h(this.l);
            c2547a.h(this.n);
        }

        @Override // ax.kb.g
        public int g() {
            return 15;
        }
    }

    /* renamed from: ax.lb.f$b */
    public static class b extends AbstractC2550d {
        public String b;

        @Override // ax.mb.AbstractC2550d
        public void a(C2547a c2547a) throws C2548b {
            c2547a.b(4);
            if (c2547a.c() != 0) {
                this.b = c2547a.g.f();
            }
        }

        @Override // ax.mb.AbstractC2550d
        public void b(C2547a c2547a) throws C2548b {
            c2547a.b(4);
            c2547a.i(this.b, 1);
            String str = this.b;
            if (str != null) {
                c2547a.g.l(str);
            }
        }
    }

    /* renamed from: ax.lb.f$c */
    public static class c extends AbstractC2550d {
        public String b;
        public int c;
        public String d;

        @Override // ax.mb.AbstractC2550d
        public void a(C2547a c2547a) throws C2548b {
            c2547a.b(4);
            int c = c2547a.c();
            this.c = c2547a.c();
            int c2 = c2547a.c();
            if (c != 0) {
                c2547a = c2547a.g;
                this.b = c2547a.f();
            }
            if (c2 != 0) {
                this.d = c2547a.g.f();
            }
        }

        @Override // ax.mb.AbstractC2550d
        public void b(C2547a c2547a) throws C2548b {
            c2547a.b(4);
            c2547a.i(this.b, 1);
            c2547a.h(this.c);
            c2547a.i(this.d, 1);
            String str = this.b;
            if (str != null) {
                c2547a = c2547a.g;
                c2547a.l(str);
            }
            String str2 = this.d;
            if (str2 != null) {
                c2547a.g.l(str2);
            }
        }
    }

    /* renamed from: ax.lb.f$d */
    public static class d extends AbstractC2550d {
        public int b;
        public b[] c;

        @Override // ax.mb.AbstractC2550d
        public void a(C2547a c2547a) throws C2548b {
            c2547a.b(4);
            this.b = c2547a.c();
            if (c2547a.c() != 0) {
                C2547a c2547a2 = c2547a.g;
                int c = c2547a2.c();
                int i = c2547a2.e;
                c2547a2.a(c * 4);
                if (this.c == null) {
                    if (c < 0 || c > 65535) {
                        throw new C2548b("invalid array conformance");
                    }
                    this.c = new b[c];
                }
                C2547a g = c2547a2.g(i);
                for (int i2 = 0; i2 < c; i2++) {
                    b[] bVarArr = this.c;
                    if (bVarArr[i2] == null) {
                        bVarArr[i2] = new b();
                    }
                    this.c[i2].a(g);
                }
            }
        }

        @Override // ax.mb.AbstractC2550d
        public void b(C2547a c2547a) throws C2548b {
            c2547a.b(4);
            c2547a.h(this.b);
            c2547a.i(this.c, 1);
            if (this.c != null) {
                C2547a c2547a2 = c2547a.g;
                int i = this.b;
                c2547a2.h(i);
                int i2 = c2547a2.e;
                c2547a2.a(i * 4);
                C2547a g = c2547a2.g(i2);
                for (int i3 = 0; i3 < i; i3++) {
                    this.c[i3].b(g);
                }
            }
        }
    }

    /* renamed from: ax.lb.f$e */
    public static class e extends AbstractC2550d {
        public int b;
        public c[] c;

        @Override // ax.mb.AbstractC2550d
        public void a(C2547a c2547a) throws C2548b {
            c2547a.b(4);
            this.b = c2547a.c();
            if (c2547a.c() != 0) {
                C2547a c2547a2 = c2547a.g;
                int c = c2547a2.c();
                int i = c2547a2.e;
                c2547a2.a(c * 12);
                if (this.c == null) {
                    if (c < 0 || c > 65535) {
                        throw new C2548b("invalid array conformance");
                    }
                    this.c = new c[c];
                }
                C2547a g = c2547a2.g(i);
                for (int i2 = 0; i2 < c; i2++) {
                    c[] cVarArr = this.c;
                    if (cVarArr[i2] == null) {
                        cVarArr[i2] = new c();
                    }
                    this.c[i2].a(g);
                }
            }
        }

        @Override // ax.mb.AbstractC2550d
        public void b(C2547a c2547a) throws C2548b {
            c2547a.b(4);
            c2547a.h(this.b);
            c2547a.i(this.c, 1);
            if (this.c != null) {
                C2547a c2547a2 = c2547a.g;
                int i = this.b;
                c2547a2.h(i);
                int i2 = c2547a2.e;
                c2547a2.a(i * 12);
                C2547a g = c2547a2.g(i2);
                for (int i3 = 0; i3 < i; i3++) {
                    this.c[i3].b(g);
                }
            }
        }
    }

    public static String a() {
        return "4b324fc8-1670-01d3-1278-5a47bf6ee188:3.0";
    }
}
