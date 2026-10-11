/*
 * Decompiled with CFR 0.152.
 */
package ax.Dd;

import ax.Dd.c;
import ax.Nd.a;

public final class n
extends c {
    private final byte[] b;

    public n(byte[] byArray, int n8) {
        super(false);
        byte[] byArray2 = new byte[32];
        this.b = byArray2;
        System.arraycopy(byArray, n8, byArray2, 0, 32);
    }

    public void a(byte[] byArray, int n8) {
        System.arraycopy(this.b, 0, byArray, n8, 32);
    }

    public byte[] b() {
        return ax.Nd.a.d(this.b);
    }
}

