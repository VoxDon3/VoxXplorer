/*
 * Decompiled with CFR 0.152.
 */
package ax.Dd;

import ax.Dd.c;
import ax.Dd.g;
import ax.Nd.a;

public final class f
extends c {
    private final byte[] b;
    private g c;

    public f(byte[] byArray) {
        this(f.d(byArray), 0);
    }

    public f(byte[] byArray, int n8) {
        super(true);
        byte[] byArray2 = new byte[32];
        this.b = byArray2;
        System.arraycopy(byArray, n8, byArray2, 0, 32);
    }

    private static byte[] d(byte[] byArray) {
        if (byArray.length == 32) {
            return byArray;
        }
        throw new IllegalArgumentException("'buf' must have length 32");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public g a() {
        byte[] byArray = this.b;
        synchronized (byArray) {
            try {
                g g8;
                if (this.c != null) return this.c;
                Object object = new byte[32];
                ax.Jd.a.s(this.b, 0, object, 0);
                this.c = g8 = new g((byte[])object, 0);
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
        g g8 = this.a();
        byte[] byArray4 = new byte[32];
        g8.a(byArray4, 0);
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 == 2) {
                    if (64 == n10) {
                        ax.Jd.a.U(this.b, 0, byArray4, 0, byArray, byArray2, n9, byArray3, n11);
                        return;
                    }
                    throw new IllegalArgumentException("msgLen");
                }
                throw new IllegalArgumentException("algorithm");
            }
            ax.Jd.a.T(this.b, 0, byArray4, 0, byArray, byArray2, n9, n10, byArray3, n11);
            return;
        }
        if (byArray == null) {
            ax.Jd.a.S(this.b, 0, byArray4, 0, byArray2, n9, n10, byArray3, n11);
            return;
        }
        throw new IllegalArgumentException("ctx");
    }
}

