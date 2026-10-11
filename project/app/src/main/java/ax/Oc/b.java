/*
 * Decompiled with CFR 0.152.
 */
package ax.Oc;

import ax.Lc.d;
import ax.Oc.a;

public class b
extends a<b> {
    public b() {
        this(1024);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public b(int n8) {
        if (n8 >= 0) {
            synchronized (this) {
                this.a(n8);
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Negative initial size: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] b() {
        synchronized (this) {
            return this.c();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void write(int n8) {
        synchronized (this) {
            this.d(n8);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void write(byte[] byArray, int n8, int n9) {
        d.c(byArray, n8, n9);
        if (n9 == 0) {
            return;
        }
        synchronized (this) {
            this.e(byArray, n8, n9);
            return;
        }
    }
}

