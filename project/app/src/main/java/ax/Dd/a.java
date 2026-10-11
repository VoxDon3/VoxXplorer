/*
 * Decompiled with CFR 0.152.
 */
package ax.Dd;

import ax.Dd.k;
import ax.vd.d;

public class a
implements d {
    private byte[] a;
    private byte[] b;
    private k c;
    private int d;

    public a(k k8, int n8, byte[] byArray) {
        this(k8, n8, byArray, null);
    }

    public a(k k8, int n8, byte[] byArray, byte[] byArray2) {
        this.c = k8;
        this.b = ax.Nd.a.d(byArray);
        this.d = n8;
        this.a = ax.Nd.a.d(byArray2);
    }

    public byte[] a() {
        return ax.Nd.a.d(this.a);
    }

    public k b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public byte[] d() {
        return ax.Nd.a.d(this.b);
    }
}

