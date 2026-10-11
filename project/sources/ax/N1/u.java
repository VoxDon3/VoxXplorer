package ax.N1;

import android.util.SparseArray;
import ax.N1.t;
import ax.q1.InterfaceC2859t;
import ax.q1.N;
import ax.q1.U;

/* loaded from: classes.dex */
public final class u implements InterfaceC2859t {
    private final t.a c0;
    private final SparseArray<w> d0 = new SparseArray<>();
    private boolean e0;
    private final InterfaceC2859t q;

    public u(InterfaceC2859t interfaceC2859t, t.a aVar) {
        this.q = interfaceC2859t;
        this.c0 = aVar;
    }

    @Override // ax.q1.InterfaceC2859t
    public void h(N n) {
        this.q.h(n);
    }

    @Override // ax.q1.InterfaceC2859t
    public void o() {
        this.q.o();
        if (this.e0) {
            for (int i = 0; i < this.d0.size(); i++) {
                this.d0.valueAt(i).k(true);
            }
        }
    }

    @Override // ax.q1.InterfaceC2859t
    public U u(int i, int i2) {
        if (i2 != 3) {
            this.e0 = true;
            return this.q.u(i, i2);
        }
        w wVar = this.d0.get(i);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this.q.u(i, i2), this.c0);
        this.d0.put(i, wVar2);
        return wVar2;
    }
}
