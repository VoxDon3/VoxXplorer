/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import ax.B.h;
import ax.B.k;
import ax.b0.d;
import ax.b0.e;

class w {
    final k<RecyclerView.F, a> a = new k();
    final h<RecyclerView.F> b = new h();

    w() {
    }

    private RecyclerView.m.c l(RecyclerView.F object, int n8) {
        block5: {
            block8: {
                int n9;
                a a8;
                int n10;
                block7: {
                    block6: {
                        n10 = this.a.d((RecyclerView.F)object);
                        if (n10 < 0) {
                            return null;
                        }
                        a8 = this.a.k(n10);
                        if (a8 == null || ((n9 = a8.a) & n8) == 0) break block5;
                        a8.a = n9 = ~n8 & n9;
                        if (n8 != 4) break block6;
                        object = a8.b;
                        break block7;
                    }
                    if (n8 != 8) break block8;
                    object = a8.c;
                }
                if ((n9 & 0xC) == 0) {
                    this.a.i(n10);
                    androidx.recyclerview.widget.w$a.c(a8);
                }
                return object;
            }
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        return null;
    }

    void a(RecyclerView.F f8, RecyclerView.m.c c8) {
        a a8;
        a a9 = a8 = this.a.get(f8);
        if (a8 == null) {
            a9 = androidx.recyclerview.widget.w$a.b();
            this.a.put(f8, a9);
        }
        a9.a |= 2;
        a9.b = c8;
    }

    void b(RecyclerView.F f8) {
        a a8;
        a a9 = a8 = this.a.get(f8);
        if (a8 == null) {
            a9 = androidx.recyclerview.widget.w$a.b();
            this.a.put(f8, a9);
        }
        a9.a |= 1;
    }

    void c(long l8, RecyclerView.F f8) {
        this.b.k(l8, f8);
    }

    void d(RecyclerView.F f8, RecyclerView.m.c c8) {
        a a8;
        a a9 = a8 = this.a.get(f8);
        if (a8 == null) {
            a9 = androidx.recyclerview.widget.w$a.b();
            this.a.put(f8, a9);
        }
        a9.c = c8;
        a9.a |= 8;
    }

    void e(RecyclerView.F f8, RecyclerView.m.c c8) {
        a a8;
        a a9 = a8 = this.a.get(f8);
        if (a8 == null) {
            a9 = androidx.recyclerview.widget.w$a.b();
            this.a.put(f8, a9);
        }
        a9.b = c8;
        a9.a |= 4;
    }

    void f() {
        this.a.clear();
        this.b.c();
    }

    RecyclerView.F g(long l8) {
        return this.b.f(l8);
    }

    boolean h(RecyclerView.F object) {
        return (object = this.a.get((RecyclerView.F)object)) != null && (((a)object).a & 1) != 0;
    }

    boolean i(RecyclerView.F object) {
        return (object = this.a.get((RecyclerView.F)object)) != null && (((a)object).a & 4) != 0;
    }

    void j() {
        androidx.recyclerview.widget.w$a.a();
    }

    public void k(RecyclerView.F f8) {
        this.p(f8);
    }

    RecyclerView.m.c m(RecyclerView.F f8) {
        return this.l(f8, 8);
    }

    RecyclerView.m.c n(RecyclerView.F f8) {
        return this.l(f8, 4);
    }

    void o(b b8) {
        for (int i8 = this.a.size() - 1; i8 >= 0; --i8) {
            RecyclerView.F f8 = this.a.f(i8);
            a a8 = this.a.i(i8);
            int n8 = a8.a;
            if ((n8 & 3) == 3) {
                b8.a(f8);
            } else if ((n8 & 1) != 0) {
                RecyclerView.m.c c8 = a8.b;
                if (c8 == null) {
                    b8.a(f8);
                } else {
                    b8.c(f8, c8, a8.c);
                }
            } else if ((n8 & 0xE) == 14) {
                b8.b(f8, a8.b, a8.c);
            } else if ((n8 & 0xC) == 12) {
                b8.d(f8, a8.b, a8.c);
            } else if ((n8 & 4) != 0) {
                b8.c(f8, a8.b, null);
            } else if ((n8 & 8) != 0) {
                b8.b(f8, a8.b, a8.c);
            }
            androidx.recyclerview.widget.w$a.c(a8);
        }
    }

    void p(RecyclerView.F object) {
        if ((object = this.a.get((RecyclerView.F)object)) == null) {
            return;
        }
        ((a)object).a &= 0xFFFFFFFE;
    }

    void q(RecyclerView.F object) {
        for (int i8 = this.b.n() - 1; i8 >= 0; --i8) {
            if (object != this.b.o(i8)) continue;
            this.b.m(i8);
            break;
        }
        if ((object = this.a.remove((RecyclerView.F)object)) != null) {
            androidx.recyclerview.widget.w$a.c((a)object);
        }
    }

    static class a {
        static d<a> d = new e<a>(20);
        int a;
        RecyclerView.m.c b;
        RecyclerView.m.c c;

        private a() {
        }

        static void a() {
            while (d.b() != null) {
            }
        }

        static a b() {
            a a8;
            a a9 = a8 = d.b();
            if (a8 == null) {
                a9 = new a();
            }
            return a9;
        }

        static void c(a a8) {
            a8.a = 0;
            a8.b = null;
            a8.c = null;
            d.a(a8);
        }
    }

    static interface b {
        public void a(RecyclerView.F var1);

        public void b(RecyclerView.F var1, RecyclerView.m.c var2, RecyclerView.m.c var3);

        public void c(RecyclerView.F var1, RecyclerView.m.c var2, RecyclerView.m.c var3);

        public void d(RecyclerView.F var1, RecyclerView.m.c var2, RecyclerView.m.c var3);
    }
}

