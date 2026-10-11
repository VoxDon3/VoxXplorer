package ax.I9;

import java.io.IOException;

/* loaded from: classes3.dex */
public class i extends x {
    public i() {
        ax.H9.k kVar = new ax.H9.k("Input");
        this.i = kVar;
        f(kVar);
    }

    @Override // ax.I9.u
    public void k(int i, int i2) {
        double[] l = this.i.l();
        ax.F9.b bVar = this.h;
        if (bVar != null) {
            try {
                bVar.a(l, i, i2 - i);
            } catch (IOException unused) {
            }
        }
    }
}
