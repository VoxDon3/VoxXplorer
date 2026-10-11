/*
 * Decompiled with CFR 0.152.
 */
package ax.U0;

import ax.S0.a;
import ax.S0.d0;
import ax.U0.f;
import ax.U0.g;
import ax.U0.k;
import ax.U0.z;
import java.util.ArrayList;
import java.util.Map;

public abstract class b
implements g {
    private final boolean a;
    private final ArrayList<z> b;
    private int c;
    private k d;

    protected b(boolean bl) {
        this.a = bl;
        this.b = new ArrayList(1);
    }

    @Override
    public final void d(z z8) {
        ax.S0.a.e(z8);
        if (!this.b.contains(z8)) {
            this.b.add(z8);
            ++this.c;
        }
    }

    public /* synthetic */ Map l() {
        return f.a(this);
    }

    protected final void q(int n8) {
        k k8 = d0.i(this.d);
        for (int i8 = 0; i8 < this.c; ++i8) {
            this.b.get(i8).h(this, k8, this.a, n8);
        }
    }

    protected final void r() {
        k k8 = d0.i(this.d);
        for (int i8 = 0; i8 < this.c; ++i8) {
            this.b.get(i8).b(this, k8, this.a);
        }
        this.d = null;
    }

    protected final void s(k k8) {
        for (int i8 = 0; i8 < this.c; ++i8) {
            this.b.get(i8).i(this, k8, this.a);
        }
    }

    protected final void t(k k8) {
        this.d = k8;
        for (int i8 = 0; i8 < this.c; ++i8) {
            this.b.get(i8).c(this, k8, this.a);
        }
    }
}

