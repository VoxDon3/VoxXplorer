/*
 * Decompiled with CFR 0.152.
 */
package ax.Wd;

import ax.Wd.k;

public abstract class m {
    protected k a;
    protected int b;
    protected k c;
    protected int[] d;
    protected String e;

    public m(k k8, int n8, k k9, int[] nArray, String string) {
        this.a = k8;
        this.b = n8;
        this.c = k9;
        this.d = (int[])nArray.clone();
        this.e = string;
    }

    public int a(int n8) {
        return this.d[n8];
    }

    public int b(byte by) {
        return this.a.d(by & 0xFF);
    }

    public String c() {
        return this.e;
    }

    public int d(int n8, int n9) {
        return this.c.d(n9 * this.b + n8);
    }
}

