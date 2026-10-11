package ax.J9;

import ax.H9.k;
import ax.I9.i;
import ax.I9.o;
import ax.I9.x;

/* loaded from: classes3.dex */
public class a {
    private x a;
    private ax.F9.a b;

    public a(ax.A9.b bVar, int i) {
        if (i == 1) {
            this.a = new i();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Only 1 or 2 samplesPerFrame supported.");
            }
            this.a = new o();
        }
        bVar.e(this.a);
        ax.F9.a aVar = new ax.F9.a();
        this.b = aVar;
        aVar.j(!bVar.a());
        this.b.i(true);
        this.b.c(32768);
        this.a.z(this.b);
        this.a.y();
    }

    public int a() {
        return this.b.d();
    }

    public k b() {
        return this.a.i;
    }

    public int c(double[] dArr, int i, int i2) {
        return this.b.g(dArr, i, i2);
    }
}
