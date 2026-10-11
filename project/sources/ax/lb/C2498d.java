package ax.lb;

import ax.kb.g;
import ax.mb.AbstractC2550d;
import ax.mb.C2547a;
import ax.mb.C2548b;
import ax.mb.C2549c;

/* renamed from: ax.lb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2498d {

    /* renamed from: ax.lb.d$a */
    public static class a extends AbstractC2550d {
        public int b;
        public C0367d[] c;

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
                    this.c = new C0367d[c];
                }
                C2547a g = c2547a2.g(i);
                for (int i2 = 0; i2 < c; i2++) {
                    C0367d[] c0367dArr = this.c;
                    if (c0367dArr[i2] == null) {
                        c0367dArr[i2] = new C0367d();
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

    /* renamed from: ax.lb.d$b */
    public static class b extends AbstractC2550d {
        public int b;
        public e[] c;

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
                    this.c = new e[c];
                }
                C2547a g = c2547a2.g(i);
                for (int i2 = 0; i2 < c; i2++) {
                    e[] eVarArr = this.c;
                    if (eVarArr[i2] == null) {
                        eVarArr[i2] = new e();
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

    /* renamed from: ax.lb.d$c */
    public static class c extends AbstractC2550d {
        public int b;
        public AbstractC2550d c;

        @Override // ax.mb.AbstractC2550d
        public void a(C2547a c2547a) throws C2548b {
            c2547a.b(4);
            this.b = c2547a.c();
            c2547a.c();
            if (c2547a.c() != 0) {
                if (this.c == null) {
                    this.c = new a();
                }
                this.c.a(c2547a.g);
            }
        }

        @Override // ax.mb.AbstractC2550d
        public void b(C2547a c2547a) throws C2548b {
            c2547a.b(4);
            c2547a.h(this.b);
            c2547a.h(this.b);
            c2547a.i(this.c, 1);
            AbstractC2550d abstractC2550d = this.c;
            if (abstractC2550d != null) {
                abstractC2550d.b(c2547a.g);
            }
        }
    }

    /* renamed from: ax.lb.d$d, reason: collision with other inner class name */
    public static class C0367d extends AbstractC2550d {
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

    /* renamed from: ax.lb.d$e */
    public static class e extends AbstractC2550d {
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

    /* renamed from: ax.lb.d$f */
    public static class f extends g {
        public int h;
        public String i;
        public int j;
        public int k;
        public c l;
        public C2549c m;

        public f(String str, int i, int i2, c cVar, C2549c c2549c) {
            this.i = str;
            this.j = i;
            this.k = i2;
            this.l = cVar;
            this.m = c2549c;
        }

        @Override // ax.kb.g
        public void d(C2547a c2547a) throws C2548b {
            if (c2547a.c() != 0) {
                if (this.l == null) {
                    this.l = new c();
                }
                this.l.a(c2547a);
            }
            if (c2547a.c() != 0) {
                this.m.a(c2547a);
            }
            this.h = c2547a.c();
        }

        @Override // ax.kb.g
        public void f(C2547a c2547a) throws C2548b {
            c2547a.l(this.i);
            c2547a.h(this.j);
            c2547a.h(this.k);
            c2547a.i(this.l, 1);
            c cVar = this.l;
            if (cVar != null) {
                cVar.b(c2547a);
            }
            c2547a.i(this.m, 1);
            C2549c c2549c = this.m;
            if (c2549c != null) {
                c2549c.b(c2547a);
            }
        }

        @Override // ax.kb.g
        public int g() {
            return 21;
        }
    }

    public static String a() {
        return "4fc742e0-4a10-11cf-8273-00aa004ae673:3.0";
    }
}
