package ax.m1;

import ax.P0.E;
import ax.U0.u;
import ax.m1.m;
import ax.m1.o;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public class k implements m {
    private final int a;

    public k() {
        this(-1);
    }

    @Override // ax.m1.m
    public /* synthetic */ void a(long j) {
        l.a(this, j);
    }

    @Override // ax.m1.m
    public long b(m.c cVar) {
        IOException iOException = cVar.c;
        if ((iOException instanceof E) || (iOException instanceof FileNotFoundException) || (iOException instanceof ax.U0.r) || (iOException instanceof o.h) || ax.U0.h.a(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((cVar.d - 1) * 1000, 5000);
    }

    @Override // ax.m1.m
    public int c(int i) {
        int i2 = this.a;
        return i2 == -1 ? i == 7 ? 6 : 3 : i2;
    }

    @Override // ax.m1.m
    public m.b d(m.a aVar, m.c cVar) {
        if (!e(cVar.c)) {
            return null;
        }
        if (aVar.a(1)) {
            return new m.b(1, 300000L);
        }
        if (aVar.a(2)) {
            return new m.b(2, 60000L);
        }
        return null;
    }

    protected boolean e(IOException iOException) {
        if (!(iOException instanceof u)) {
            return false;
        }
        int i = ((u) iOException).e0;
        return i == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503;
    }

    public k(int i) {
        this.a = i;
    }
}
