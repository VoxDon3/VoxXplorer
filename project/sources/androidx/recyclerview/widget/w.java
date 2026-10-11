package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import ax.b0.C1444e;
import ax.b0.InterfaceC1443d;

/* loaded from: classes.dex */
class w {
    final ax.B.k<RecyclerView.F, a> a = new ax.B.k<>();
    final ax.B.h<RecyclerView.F> b = new ax.B.h<>();

    static class a {
        static InterfaceC1443d<a> d = new C1444e(20);
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
            a b = d.b();
            return b == null ? new a() : b;
        }

        static void c(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.F f);

        void b(RecyclerView.F f, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void c(RecyclerView.F f, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void d(RecyclerView.F f, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    w() {
    }

    private RecyclerView.m.c l(RecyclerView.F f, int i) {
        a k;
        RecyclerView.m.c cVar;
        int d = this.a.d(f);
        if (d >= 0 && (k = this.a.k(d)) != null) {
            int i2 = k.a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                k.a = i3;
                if (i == 4) {
                    cVar = k.b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = k.c;
                }
                if ((i3 & 12) == 0) {
                    this.a.i(d);
                    a.c(k);
                }
                return cVar;
            }
        }
        return null;
    }

    void a(RecyclerView.F f, RecyclerView.m.c cVar) {
        a aVar = this.a.get(f);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(f, aVar);
        }
        aVar.a |= 2;
        aVar.b = cVar;
    }

    void b(RecyclerView.F f) {
        a aVar = this.a.get(f);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(f, aVar);
        }
        aVar.a |= 1;
    }

    void c(long j, RecyclerView.F f) {
        this.b.k(j, f);
    }

    void d(RecyclerView.F f, RecyclerView.m.c cVar) {
        a aVar = this.a.get(f);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(f, aVar);
        }
        aVar.c = cVar;
        aVar.a |= 8;
    }

    void e(RecyclerView.F f, RecyclerView.m.c cVar) {
        a aVar = this.a.get(f);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(f, aVar);
        }
        aVar.b = cVar;
        aVar.a |= 4;
    }

    void f() {
        this.a.clear();
        this.b.c();
    }

    RecyclerView.F g(long j) {
        return this.b.f(j);
    }

    boolean h(RecyclerView.F f) {
        a aVar = this.a.get(f);
        return (aVar == null || (aVar.a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.F f) {
        a aVar = this.a.get(f);
        return (aVar == null || (aVar.a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.F f) {
        p(f);
    }

    RecyclerView.m.c m(RecyclerView.F f) {
        return l(f, 8);
    }

    RecyclerView.m.c n(RecyclerView.F f) {
        return l(f, 4);
    }

    void o(b bVar) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            RecyclerView.F f = this.a.f(size);
            a i = this.a.i(size);
            int i2 = i.a;
            if ((i2 & 3) == 3) {
                bVar.a(f);
            } else if ((i2 & 1) != 0) {
                RecyclerView.m.c cVar = i.b;
                if (cVar == null) {
                    bVar.a(f);
                } else {
                    bVar.c(f, cVar, i.c);
                }
            } else if ((i2 & 14) == 14) {
                bVar.b(f, i.b, i.c);
            } else if ((i2 & 12) == 12) {
                bVar.d(f, i.b, i.c);
            } else if ((i2 & 4) != 0) {
                bVar.c(f, i.b, null);
            } else if ((i2 & 8) != 0) {
                bVar.b(f, i.b, i.c);
            }
            a.c(i);
        }
    }

    void p(RecyclerView.F f) {
        a aVar = this.a.get(f);
        if (aVar == null) {
            return;
        }
        aVar.a &= -2;
    }

    void q(RecyclerView.F f) {
        int n = this.b.n() - 1;
        while (true) {
            if (n < 0) {
                break;
            }
            if (f == this.b.o(n)) {
                this.b.m(n);
                break;
            }
            n--;
        }
        a remove = this.a.remove(f);
        if (remove != null) {
            a.c(remove);
        }
    }
}
