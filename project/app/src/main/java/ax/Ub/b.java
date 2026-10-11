/*
 * Decompiled with CFR 0.152.
 */
package ax.Ub;

import ax.Gb.l;
import ax.Ub.d;
import ax.sb.n;
import ax.sb.t;
import ax.wb.e;
import java.util.Arrays;

public abstract class b<S extends d<?>> {
    private int c0;
    private int d0;
    private S[] q;

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final S b() {
        synchronized (this) {
            int n8;
            int n9;
            Object[] objectArray;
            Object object;
            try {
                object = this.q;
                if (object == null) {
                    this.q = objectArray = this.d(2);
                } else {
                    objectArray = object;
                    if (this.c0 >= ((S[])object).length) {
                        objectArray = Arrays.copyOf(object, ((S[])object).length * 2);
                        l.e(objectArray, "copyOf(this, newSize)");
                        this.q = (d[])objectArray;
                        objectArray = (d[])objectArray;
                    }
                }
                n9 = this.d0;
            }
            catch (Throwable throwable) {}
            throw throwable;
            do {
                S s8 = objectArray[n9];
                object = s8;
                if (s8 == null) {
                    object = this.c();
                    objectArray[n9] = object;
                }
                n8 = ++n9;
                if (n9 >= objectArray.length) {
                    n8 = 0;
                }
                l.d(object, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                n9 = n8;
            } while (!((d)object).a(this));
            this.d0 = n8;
            ++this.c0;
            return (S)object;
        }
    }

    protected abstract S c();

    protected abstract S[] d(int var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    protected final void f(S object) {
        int n8;
        // MONITORENTER : this
        this.c0 = n8 = this.c0 - 1;
        int n9 = 0;
        if (n8 == 0) {
            this.d0 = 0;
        }
        l.d(object, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
        e<t>[] eArray = ((d)object).b(this);
        // MONITOREXIT : this
        n8 = eArray.length;
        while (n9 < n8) {
            object = eArray[n9];
            if (object != null) {
                n.a a8 = n.q;
                object.f(n.a(t.a));
            }
            ++n9;
        }
    }

    protected final S[] g() {
        return this.q;
    }
}

