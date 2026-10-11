/*
 * Decompiled with CFR 0.152.
 */
package ax.m1;

import ax.P0.E;
import ax.U0.h;
import ax.U0.r;
import ax.U0.u;
import ax.m1.l;
import ax.m1.m;
import ax.m1.o;
import java.io.FileNotFoundException;
import java.io.IOException;

public class k
implements m {
    private final int a;

    public k() {
        this(-1);
    }

    public k(int n8) {
        this.a = n8;
    }

    @Override
    public /* synthetic */ void a(long l8) {
        l.a(this, l8);
    }

    @Override
    public long b(m.c c8) {
        IOException iOException = c8.c;
        if (!(iOException instanceof E || iOException instanceof FileNotFoundException || iOException instanceof r || iOException instanceof o.h || h.a(iOException))) {
            return Math.min((c8.d - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    @Override
    public int c(int n8) {
        int n9 = this.a;
        if (n9 == -1) {
            if (n8 == 7) {
                return 6;
            }
            return 3;
        }
        return n9;
    }

    @Override
    public m.b d(m.a a8, m.c c8) {
        if (!this.e(c8.c)) {
            return null;
        }
        if (a8.a(1)) {
            return new m.b(1, 300000L);
        }
        if (a8.a(2)) {
            return new m.b(2, 60000L);
        }
        return null;
    }

    protected boolean e(IOException iOException) {
        if (!(iOException instanceof u)) {
            return false;
        }
        int n8 = ((u)iOException).e0;
        return n8 == 403 || n8 == 404 || n8 == 410 || n8 == 416 || n8 == 500 || n8 == 503;
        {
        }
    }
}

