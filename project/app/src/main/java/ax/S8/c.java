/*
 * Decompiled with CFR 0.152.
 */
package ax.S8;

import ax.S8.b;
import ax.S8.d;
import ax.S8.e;
import ax.S8.f;
import ax.Y8.c;
import ax.Z8.a;

public abstract class c {
    private d a;

    protected c(d d8) {
        this.a = d8;
    }

    public static c a(ax.h9.b object) throws a.b {
        int n8 = ((ax.Z8.a)object).J();
        d d8 = c.a.f(n8, d.class, null);
        int n9 = ax.S8.c$a.a[d8.ordinal()];
        if (n9 != 1) {
            if (n9 != 2) {
                if (n9 != 3) {
                    if (n9 == 4) {
                        return new e().c((ax.h9.b)object);
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unknown SMB2NegotiateContextType encountered: ");
                    ((StringBuilder)object).append(n8);
                    ((StringBuilder)object).append(" / ");
                    ((StringBuilder)object).append(d8);
                    throw new ax.k9.d(((StringBuilder)object).toString());
                }
                return new ax.S8.a().c((ax.h9.b)object);
            }
            return new b().c((ax.h9.b)object);
        }
        return new f().c((ax.h9.b)object);
    }

    private int e(ax.h9.b b8) throws a.b {
        int n8 = b8.J();
        b8.U(4);
        return n8;
    }

    private void h(ax.h9.b b8, int n8) {
        b8.s((int)this.a.getValue());
        b8.s(n8);
        b8.Y();
    }

    public d b() {
        return this.a;
    }

    public final c c(ax.h9.b b8) throws a.b {
        int n8 = this.e(b8);
        this.d(b8, n8);
        n8 = (n8 %= 8) == 0 ? 0 : 8 - n8;
        if (n8 > 0 && b8.c() >= n8) {
            b8.U(n8);
        }
        return this;
    }

    protected void d(ax.h9.b b8, int n8) throws a.b {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    public final int f(ax.h9.b b8) {
        ax.h9.b b9 = new ax.h9.b();
        int n8 = this.g(b9);
        this.h(b8, n8);
        b8.i(b9);
        return n8 + 8;
    }

    protected int g(ax.h9.b b8) {
        throw new UnsupportedOperationException("Should be implemented by specific SMB2NegotiateContext");
    }
}

