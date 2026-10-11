package ax.Ub;

import ax.Gb.l;
import ax.Ub.d;
import ax.sb.C3082n;
import ax.sb.t;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class b<S extends d<?>> {
    private int c0;
    private int d0;
    private S[] q;

    protected final S b() {
        S s;
        synchronized (this) {
            try {
                S[] sArr = this.q;
                if (sArr == null) {
                    sArr = d(2);
                    this.q = sArr;
                } else if (this.c0 >= sArr.length) {
                    Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    l.e(copyOf, "copyOf(this, newSize)");
                    this.q = (S[]) ((d[]) copyOf);
                    sArr = (S[]) ((d[]) copyOf);
                }
                int i = this.d0;
                do {
                    s = sArr[i];
                    if (s == null) {
                        s = c();
                        sArr[i] = s;
                    }
                    i++;
                    if (i >= sArr.length) {
                        i = 0;
                    }
                    l.d(s, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!s.a(this));
                this.d0 = i;
                this.c0++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return s;
    }

    protected abstract S c();

    protected abstract S[] d(int i);

    protected final void f(S s) {
        int i;
        ax.wb.e<t>[] b;
        synchronized (this) {
            try {
                int i2 = this.c0 - 1;
                this.c0 = i2;
                if (i2 == 0) {
                    this.d0 = 0;
                }
                l.d(s, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b = s.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (ax.wb.e<t> eVar : b) {
            if (eVar != null) {
                C3082n.a aVar = C3082n.q;
                eVar.f(C3082n.a(t.a));
            }
        }
    }

    protected final S[] g() {
        return this.q;
    }
}
