package ax.kb;

import ax.mb.C2547a;
import ax.mb.C2548b;
import ax.qb.C2896d;

/* renamed from: ax.kb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2418a extends g {
    static final String[] k = {"0", "DCERPC_BIND_ERR_ABSTRACT_SYNTAX_NOT_SUPPORTED", "DCERPC_BIND_ERR_PROPOSED_TRANSFER_SYNTAXES_NOT_SUPPORTED", "DCERPC_BIND_ERR_LOCAL_LIMIT_EXCEEDED"};
    b h;
    int i;
    int j;

    C2418a(b bVar, f fVar) {
        this.h = bVar;
        this.i = fVar.c;
        this.j = fVar.d;
        this.b = 11;
        this.c = 3;
    }

    static String j(int i) {
        if (i < 4) {
            return k[i];
        }
        return "0x" + C2896d.c(i, 4);
    }

    @Override // ax.kb.g
    public void d(C2547a c2547a) throws C2548b {
        c2547a.d();
        c2547a.d();
        c2547a.c();
        c2547a.a(c2547a.d());
        c2547a.b(4);
        c2547a.e();
        c2547a.b(4);
        this.g = c2547a.d();
        c2547a.d();
        c2547a.a(20);
    }

    @Override // ax.kb.g
    public void f(C2547a c2547a) throws C2548b {
        c2547a.j(this.i);
        c2547a.j(this.j);
        c2547a.h(0);
        c2547a.k(1);
        c2547a.k(0);
        c2547a.j(0);
        c2547a.j(0);
        c2547a.k(1);
        c2547a.k(0);
        this.h.e.b(c2547a);
        c2547a.j(this.h.f);
        c2547a.j(this.h.g);
        c.a.b(c2547a);
        c2547a.h(2);
    }

    @Override // ax.kb.g
    public int g() {
        return 0;
    }

    @Override // ax.kb.g
    public e h() {
        if (this.g != 0) {
            return new e(j(this.g));
        }
        return null;
    }
}
