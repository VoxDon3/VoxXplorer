package ax.X1;

import android.util.SparseArray;
import ax.P0.C0912v;
import ax.S0.C0976i;
import ax.X1.L;
import ax.r7.AbstractC2991z;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.X1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1149j implements L.c {
    private final int a;
    private final List<C0912v> b;

    public C1149j(int i) {
        this(i, AbstractC2991z.z());
    }

    private G c(L.b bVar) {
        return new G(e(bVar), "video/mp2t");
    }

    private O d(L.b bVar) {
        return new O(e(bVar), "video/mp2t");
    }

    private List<C0912v> e(L.b bVar) {
        String str;
        int i;
        if (f(32)) {
            return this.b;
        }
        ax.S0.G g = new ax.S0.G(bVar.e);
        List<C0912v> list = this.b;
        while (g.a() > 0) {
            int M = g.M();
            int g2 = g.g() + g.M();
            if (M == 134) {
                list = new ArrayList<>();
                int M2 = g.M() & 31;
                for (int i2 = 0; i2 < M2; i2++) {
                    String J = g.J(3);
                    int M3 = g.M();
                    boolean z = (M3 & 128) != 0;
                    if (z) {
                        i = M3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte M4 = (byte) g.M();
                    g.c0(1);
                    list.add(new C0912v.b().y0(str).n0(J).Q(i).k0(z ? C0976i.g((M4 & 64) != 0) : null).P());
                }
            }
            g.b0(g2);
        }
        return list;
    }

    private boolean f(int i) {
        return (i & this.a) != 0;
    }

    @Override // ax.X1.L.c
    public SparseArray<L> a() {
        return new SparseArray<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    @Override // ax.X1.L.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ax.X1.L b(int r6, ax.X1.L.b r7) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X1.C1149j.b(int, ax.X1.L$b):ax.X1.L");
    }

    public C1149j(int i, List<C0912v> list) {
        this.a = i;
        this.b = list;
    }
}
