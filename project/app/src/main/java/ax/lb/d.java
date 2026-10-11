/*
 * Decompiled with CFR 0.152.
 */
package ax.lb;

import ax.kb.g;

public class d {
    public static String a() {
        return "4fc742e0-4a10-11cf-8273-00aa004ae673:3.0";
    }

    public static class a
    extends ax.mb.d {
        public int b;
        public d[] c;

        @Override
        public void a(ax.mb.a a8) throws ax.mb.b {
            a8.b(4);
            this.b = a8.c();
            if (a8.c() != 0) {
                a8 = a8.g;
                int n8 = a8.c();
                int n9 = a8.e;
                a8.a(n8 * 4);
                if (this.c == null) {
                    if (n8 >= 0 && n8 <= 65535) {
                        this.c = new d[n8];
                    } else {
                        throw new ax.mb.b("invalid array conformance");
                    }
                }
                a8 = a8.g(n9);
                for (n9 = 0; n9 < n8; ++n9) {
                    d[] dArray = this.c;
                    if (dArray[n9] == null) {
                        dArray[n9] = new d();
                    }
                    this.c[n9].a(a8);
                }
            }
        }

        @Override
        public void b(ax.mb.a a8) throws ax.mb.b {
            a8.b(4);
            a8.h(this.b);
            a8.i(this.c, 1);
            if (this.c != null) {
                a8 = a8.g;
                int n8 = this.b;
                a8.h(n8);
                int n9 = a8.e;
                a8.a(n8 * 4);
                a8 = a8.g(n9);
                for (n9 = 0; n9 < n8; ++n9) {
                    this.c[n9].b(a8);
                }
            }
        }
    }

    public static class b
    extends ax.mb.d {
        public int b;
        public e[] c;

        @Override
        public void a(ax.mb.a eArray) throws ax.mb.b {
            eArray.b(4);
            this.b = eArray.c();
            if (eArray.c() != 0) {
                eArray = eArray.g;
                int n8 = eArray.c();
                int n9 = eArray.e;
                eArray.a(n8 * 4);
                if (this.c == null) {
                    if (n8 >= 0 && n8 <= 65535) {
                        this.c = new e[n8];
                    } else {
                        throw new ax.mb.b("invalid array conformance");
                    }
                }
                ax.mb.a a8 = eArray.g(n9);
                for (n9 = 0; n9 < n8; ++n9) {
                    eArray = this.c;
                    if (eArray[n9] == null) {
                        eArray[n9] = new e();
                    }
                    this.c[n9].a(a8);
                }
            }
        }

        @Override
        public void b(ax.mb.a a8) throws ax.mb.b {
            a8.b(4);
            a8.h(this.b);
            a8.i(this.c, 1);
            if (this.c != null) {
                a8 = a8.g;
                int n8 = this.b;
                a8.h(n8);
                int n9 = a8.e;
                a8.a(n8 * 4);
                a8 = a8.g(n9);
                for (n9 = 0; n9 < n8; ++n9) {
                    this.c[n9].b(a8);
                }
            }
        }
    }

    public static class c
    extends ax.mb.d {
        public int b;
        public ax.mb.d c;

        @Override
        public void a(ax.mb.a a8) throws ax.mb.b {
            a8.b(4);
            this.b = a8.c();
            a8.c();
            if (a8.c() != 0) {
                if (this.c == null) {
                    this.c = new a();
                }
                a8 = a8.g;
                this.c.a(a8);
            }
        }

        @Override
        public void b(ax.mb.a a8) throws ax.mb.b {
            a8.b(4);
            a8.h(this.b);
            a8.h(this.b);
            a8.i(this.c, 1);
            ax.mb.d d8 = this.c;
            if (d8 != null) {
                d8.b(a8.g);
            }
        }
    }

    public static class d
    extends ax.mb.d {
        public String b;

        @Override
        public void a(ax.mb.a a8) throws ax.mb.b {
            a8.b(4);
            if (a8.c() != 0) {
                this.b = a8.g.f();
            }
        }

        @Override
        public void b(ax.mb.a a8) throws ax.mb.b {
            a8.b(4);
            a8.i(this.b, 1);
            String string = this.b;
            if (string != null) {
                a8.g.l(string);
            }
        }
    }

    public static class e
    extends ax.mb.d {
        public String b;

        @Override
        public void a(ax.mb.a a8) throws ax.mb.b {
            a8.b(4);
            if (a8.c() != 0) {
                this.b = a8.g.f();
            }
        }

        @Override
        public void b(ax.mb.a a8) throws ax.mb.b {
            a8.b(4);
            a8.i(this.b, 1);
            String string = this.b;
            if (string != null) {
                a8.g.l(string);
            }
        }
    }

    public static class f
    extends g {
        public int h;
        public String i;
        public int j;
        public int k;
        public c l;
        public ax.mb.c m;

        public f(String string, int n8, int n9, c c8, ax.mb.c c9) {
            this.i = string;
            this.j = n8;
            this.k = n9;
            this.l = c8;
            this.m = c9;
        }

        @Override
        public void d(ax.mb.a a8) throws ax.mb.b {
            if (a8.c() != 0) {
                if (this.l == null) {
                    this.l = new c();
                }
                this.l.a(a8);
            }
            if (a8.c() != 0) {
                this.m.a(a8);
            }
            this.h = a8.c();
        }

        @Override
        public void f(ax.mb.a a8) throws ax.mb.b {
            a8.l(this.i);
            a8.h(this.j);
            a8.h(this.k);
            a8.i(this.l, 1);
            ax.mb.d d8 = this.l;
            if (d8 != null) {
                ((c)d8).b(a8);
            }
            a8.i(this.m, 1);
            d8 = this.m;
            if (d8 != null) {
                ((ax.mb.c)d8).b(a8);
            }
        }

        @Override
        public int g() {
            return 21;
        }
    }
}

