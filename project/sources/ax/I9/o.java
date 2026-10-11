package ax.I9;

import java.io.IOException;

/* loaded from: classes3.dex */
public class o extends x {
    public o() {
        ax.H9.k kVar = new ax.H9.k(2, "Input");
        this.i = kVar;
        f(kVar);
    }

    @Override // ax.I9.u
    public void k(int i, int i2) {
        double[] m = this.i.m(0);
        double[] m2 = this.i.m(1);
        ax.F9.b bVar = this.h;
        if (bVar != null) {
            while (i < i2) {
                try {
                    bVar.b(m[i]);
                    bVar.b(m2[i]);
                    i++;
                } catch (IOException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
    }
}
