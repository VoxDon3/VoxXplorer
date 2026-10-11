/*
 * Decompiled with CFR 0.152.
 */
package ax.Dd;

import ax.Dd.c;
import ax.Dd.i;
import ax.Jd.b;
import ax.Nd.a;

public final class h
extends c {
    private final byte[] b;
    private i c;

    public h(byte[] byArray) {
        this(h.d(byArray), 0);
    }

    public h(byte[] byArray, int n8) {
        super(true);
        byte[] byArray2 = new byte[57];
        this.b = byArray2;
        System.arraycopy(byArray, n8, byArray2, 0, 57);
    }

    private static byte[] d(byte[] byArray) {
        if (byArray.length == 57) {
            return byArray;
        }
        throw new IllegalArgumentException("'buf' must have length 57");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public i a() {
        byte[] byArray = this.b;
        synchronized (byArray) {
            try {
                i i8;
                if (this.c != null) return this.c;
                byte[] byArray2 = new byte[57];
                ax.Jd.b.t(this.b, 0, byArray2, 0);
                this.c = i8 = new i(byArray2, 0);
                return this.c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public byte[] b() {
        return ax.Nd.a.d(this.b);
    }

    public void c(int n8, byte[] byArray, byte[] byArray2, int n9, int n10, byte[] byArray3, int n11) {
        i i8 = this.a();
        byte[] byArray4 = new byte[57];
        i8.a(byArray4, 0);
        if (n8 != 0) {
            if (n8 == 1) {
                if (64 == n10) {
                    ax.Jd.b.P(this.b, 0, byArray4, 0, byArray, byArray2, n9, byArray3, n11);
                    return;
                }
                throw new IllegalArgumentException("msgLen");
            }
            throw new IllegalArgumentException("algorithm");
        }
        ax.Jd.b.O(this.b, 0, byArray4, 0, byArray, byArray2, n9, n10, byArray3, n11);
    }
}

