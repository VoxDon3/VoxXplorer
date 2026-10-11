package ax.U0;

import ax.S0.C0968a;
import ax.S0.d0;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b implements g {
    private final boolean a;
    private final ArrayList<z> b = new ArrayList<>(1);
    private int c;
    private k d;

    protected b(boolean z) {
        this.a = z;
    }

    @Override // ax.U0.g
    public final void d(z zVar) {
        C0968a.e(zVar);
        if (this.b.contains(zVar)) {
            return;
        }
        this.b.add(zVar);
        this.c++;
    }

    @Override // ax.U0.g
    public /* synthetic */ Map l() {
        return f.a(this);
    }

    protected final void q(int i) {
        k kVar = (k) d0.i(this.d);
        for (int i2 = 0; i2 < this.c; i2++) {
            this.b.get(i2).h(this, kVar, this.a, i);
        }
    }

    protected final void r() {
        k kVar = (k) d0.i(this.d);
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).b(this, kVar, this.a);
        }
        this.d = null;
    }

    protected final void s(k kVar) {
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).i(this, kVar, this.a);
        }
    }

    protected final void t(k kVar) {
        this.d = kVar;
        for (int i = 0; i < this.c; i++) {
            this.b.get(i).c(this, kVar, this.a);
        }
    }
}
