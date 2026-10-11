/*
 * Decompiled with CFR 0.152.
 */
package ax.Dd;

import ax.Nd.a;
import ax.vd.h;

public final class j
implements h {
    private byte[] a;
    private byte[] b;
    private byte[] c;
    private int d;

    public j(byte[] byArray, byte[] byArray2, int n8) {
        this(byArray, null, byArray2, n8);
    }

    public j(byte[] byArray, byte[] byArray2, byte[] byArray3, int n8) {
        if (byArray != null) {
            this.a = ax.Nd.a.d(byArray);
            this.b = byArray2 == null ? new byte[0] : ax.Nd.a.d(byArray2);
            this.c = byArray3 == null ? new byte[0] : ax.Nd.a.d(byArray3);
            if (n8 != 8 && n8 != 16 && n8 != 24 && n8 != 32) {
                throw new IllegalArgumentException("Length of counter should be 8, 16, 24 or 32");
            }
            this.d = n8;
            return;
        }
        throw new IllegalArgumentException("A KDF requires Ki (a seed) as input");
    }

    public byte[] a() {
        return ax.Nd.a.d(this.b);
    }

    public byte[] b() {
        return ax.Nd.a.d(this.c);
    }

    public byte[] c() {
        return this.a;
    }

    public int d() {
        return this.d;
    }
}

