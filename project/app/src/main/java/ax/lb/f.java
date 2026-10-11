/*
 * Decompiled with CFR 0.152.
 */
package ax.lb;

import ax.kb.g;

public class f {
    public static String a() {
        return "4b324fc8-1670-01d3-1278-5a47bf6ee188:3.0";
    }

    public static class a
    extends g {
        public int h;
        public String i;
        public int j;
        public ax.mb.d k;
        public int l;
        public int m;
        public int n;

        public a(String string, int n8, ax.mb.d d8, int n9, int n10, int n11) {
            this.i = string;
            this.j = n8;
            this.k = d8;
            this.l = n9;
            this.m = n10;
            this.n = n11;
        }

        @Override
        public void d(ax.mb.a a8) throws ax.mb.b {
            this.j = a8.c();
            a8.c();
            ax.mb.a a9 = a8;
            if (a8.c() != 0) {
                if (this.k == null) {
                    this.k = new d();
                }
                a9 = a8.g;
                this.k.a(a9);
            }
            this.m = a9.c();
            this.n = a9.c();
            this.h = a9.c();
        }

        @Override
        public void f(ax.mb.a a8) throws ax.mb.b {
            a8.i(this.i, 1);
            Object object = this.i;
            if (object != null) {
                a8.l((String)object);
            }
            a8.h(this.j);
            a8.h(this.j);
            a8.i(this.k, 1);
            ax.mb.d d8 = this.k;
            object = a8;
            if (d8 != null) {
                object = a8.g;
                d8.b((ax.mb.a)object);
            }
            ((ax.mb.a)object).h(this.l);
            ((ax.mb.a)object).h(this.n);
        }

        @Override
        public int g() {
            return 15;
        }
    }

    public static class b
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

    public static class c
    extends ax.mb.d {
        public String b;
        public int c;
        public String d;

        @Override
        public void a(ax.mb.a a8) throws ax.mb.b {
            a8.b(4);
            int n8 = a8.c();
            this.c = a8.c();
            int n9 = a8.c();
            ax.mb.a a9 = a8;
            if (n8 != 0) {
                a9 = a8.g;
                this.b = a9.f();
            }
            if (n9 != 0) {
                this.d = a9.g.f();
            }
        }

        @Override
        public void b(ax.mb.a object) throws ax.mb.b {
            ((ax.mb.a)object).b(4);
            ((ax.mb.a)object).i(this.b, 1);
            ((ax.mb.a)object).h(this.c);
            ((ax.mb.a)object).i(this.d, 1);
            String string = this.b;
            ax.mb.a a8 = object;
            if (string != null) {
                a8 = ((ax.mb.a)object).g;
                a8.l(string);
            }
            if ((object = this.d) != null) {
                a8.g.l((String)object);
            }
        }
    }

    public static class d
    extends ax.mb.d {
        public int b;
        public b[] c;

        @Override
        public void a(ax.mb.a bArray) throws ax.mb.b {
            bArray.b(4);
            this.b = bArray.c();
            if (bArray.c() != 0) {
                bArray = bArray.g;
                int n8 = bArray.c();
                int n9 = bArray.e;
                bArray.a(n8 * 4);
                if (this.c == null) {
                    if (n8 >= 0 && n8 <= 65535) {
                        this.c = new b[n8];
                    } else {
                        throw new ax.mb.b("invalid array conformance");
                    }
                }
                ax.mb.a a8 = bArray.g(n9);
                for (n9 = 0; n9 < n8; ++n9) {
                    bArray = this.c;
                    if (bArray[n9] == null) {
                        bArray[n9] = new b();
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

    public static class e
    extends ax.mb.d {
        public int b;
        public c[] c;

        @Override
        public void a(ax.mb.a cArray) throws ax.mb.b {
            cArray.b(4);
            this.b = cArray.c();
            if (cArray.c() != 0) {
                cArray = cArray.g;
                int n8 = cArray.c();
                int n9 = cArray.e;
                cArray.a(n8 * 12);
                if (this.c == null) {
                    if (n8 >= 0 && n8 <= 65535) {
                        this.c = new c[n8];
                    } else {
                        throw new ax.mb.b("invalid array conformance");
                    }
                }
                ax.mb.a a8 = cArray.g(n9);
                for (n9 = 0; n9 < n8; ++n9) {
                    cArray = this.c;
                    if (cArray[n9] == null) {
                        cArray[n9] = new c();
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
                a8.a(n8 * 12);
                a8 = a8.g(n9);
                for (n9 = 0; n9 < n8; ++n9) {
                    this.c[n9].b(a8);
                }
            }
        }
    }
}

