package ax.J9;

import ax.I9.y;

/* loaded from: classes3.dex */
public class f {
    private int a;
    private c[] b;
    private long c;
    private ax.A9.b d;
    private int e = -1;

    class a implements ax.Qa.a {
        final /* synthetic */ h c0;
        final /* synthetic */ double d0;
        final /* synthetic */ double e0;
        final /* synthetic */ int q;

        a(int i, h hVar, double d, double d2) {
            this.q = i;
            this.c0 = hVar;
            this.d0 = d;
            this.e0 = d2;
        }

        @Override // ax.Qa.a
        public void run() {
            c d = f.this.d(this.q);
            this.c0.a(d.a);
            d.a.a(this.d0, this.e0, f.this.f().d());
        }
    }

    class b implements ax.Qa.a {
        final /* synthetic */ int q;

        b(int i) {
            this.q = i;
        }

        @Override // ax.Qa.a
        public void run() {
            c e = f.this.e(this.q);
            if (e != null) {
                e.a.e(f.this.f().d());
                f.this.i(this.q);
            }
        }
    }

    public f(y[] yVarArr) {
        int length = yVarArr.length;
        this.a = length;
        this.b = new c[length];
        for (int i = 0; i < this.a; i++) {
            this.b[i] = new c(this, null);
            this.b[i].a = yVarArr[i];
        }
    }

    static /* synthetic */ long a(f fVar) {
        long j = fVar.c;
        fVar.c = 1 + j;
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c d(int i) {
        c e = e(i);
        if (e == null) {
            e = j();
        }
        e.b = i;
        long j = this.c;
        this.c = 1 + j;
        e.d = j;
        e.e = true;
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c e(int i) {
        for (c cVar : this.b) {
            if (cVar.b == i) {
                return cVar;
            }
        }
        return null;
    }

    private c j() {
        c cVar = null;
        c cVar2 = null;
        for (c cVar3 : this.b) {
            if (cVar3.a == null) {
                return cVar3;
            }
            if (cVar != null) {
                if (!cVar3.e) {
                    if (cVar3.d >= cVar.d) {
                    }
                    cVar = cVar3;
                }
            } else {
                if (cVar3.e) {
                    if (cVar2 == null || cVar3.d < cVar2.d) {
                        cVar2 = cVar3;
                    }
                }
                cVar = cVar3;
            }
        }
        return cVar != null ? cVar : cVar2;
    }

    public ax.A9.b f() {
        if (this.d == null) {
            this.d = this.b[0].a.d().q();
        }
        return this.d;
    }

    public void g(int i, ax.Qa.c cVar) {
        f().c(cVar, new b(i));
    }

    public void h(int i, double d, double d2, h hVar, ax.Qa.c cVar) {
        f().c(cVar, new a(i, hVar, d, d2));
    }

    protected synchronized y i(int i) {
        c e = e(i);
        if (e == null) {
            return null;
        }
        e.a();
        return e.a;
    }

    private class c {
        y a;
        int b;
        int c;
        long d;
        boolean e;

        private c() {
            this.b = -1;
            this.c = -1;
        }

        public void a() {
            this.e = false;
            this.d = f.a(f.this);
        }

        /* synthetic */ c(f fVar, e eVar) {
            this();
        }
    }
}
