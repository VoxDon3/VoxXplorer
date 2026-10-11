package ax.H9;

import ax.I9.u;

/* loaded from: classes3.dex */
public class m {
    private String a;
    private u b;

    public m(String str) {
        this.a = str;
    }

    public String b() {
        return this.a;
    }

    ax.D9.b c() {
        u uVar = this.b;
        if (uVar == null) {
            return null;
        }
        return uVar.p();
    }

    public u d() {
        return this.b;
    }

    public void e(ax.Qa.a aVar) {
        if (c() == null) {
            aVar.run();
        } else {
            c().c(c().d(), aVar);
        }
    }

    public void f(ax.Qa.c cVar, ax.Qa.a aVar) {
        if (c() == null) {
            aVar.run();
        } else {
            c().c(cVar, aVar);
        }
    }

    public void g(String str) {
        this.a = str;
    }

    public void h(u uVar) {
        if (this.b == null) {
            this.b = uVar;
        }
    }
}
