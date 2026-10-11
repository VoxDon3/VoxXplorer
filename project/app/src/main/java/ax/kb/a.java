/*
 * Decompiled with CFR 0.152.
 */
package ax.kb;

import ax.kb.b;
import ax.kb.c;
import ax.kb.e;
import ax.kb.f;
import ax.kb.g;
import ax.qb.d;

public class a
extends g {
    static final String[] k = new String[]{"0", "DCERPC_BIND_ERR_ABSTRACT_SYNTAX_NOT_SUPPORTED", "DCERPC_BIND_ERR_PROPOSED_TRANSFER_SYNTAXES_NOT_SUPPORTED", "DCERPC_BIND_ERR_LOCAL_LIMIT_EXCEEDED"};
    b h;
    int i;
    int j;

    a(b b8, f f8) {
        this.h = b8;
        this.i = f8.c;
        this.j = f8.d;
        this.b = 11;
        this.c = 3;
    }

    static String j(int n8) {
        if (n8 < 4) {
            return k[n8];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("0x");
        stringBuilder.append(ax.qb.d.c(n8, 4));
        return stringBuilder.toString();
    }

    @Override
    public void d(ax.mb.a a8) throws ax.mb.b {
        a8.d();
        a8.d();
        a8.c();
        a8.a(a8.d());
        a8.b(4);
        a8.e();
        a8.b(4);
        this.g = a8.d();
        a8.d();
        a8.a(20);
    }

    @Override
    public void f(ax.mb.a a8) throws ax.mb.b {
        a8.j(this.i);
        a8.j(this.j);
        a8.h(0);
        a8.k(1);
        a8.k(0);
        a8.j(0);
        a8.j(0);
        a8.k(1);
        a8.k(0);
        this.h.e.b(a8);
        a8.j(this.h.f);
        a8.j(this.h.g);
        ax.kb.c.a.b(a8);
        a8.h(2);
    }

    @Override
    public int g() {
        return 0;
    }

    @Override
    public e h() {
        if (this.g != 0) {
            return new e(a.j(this.g));
        }
        return null;
    }
}

