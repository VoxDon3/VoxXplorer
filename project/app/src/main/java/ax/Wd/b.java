/*
 * Decompiled with CFR 0.152.
 */
package ax.Wd;

import ax.Wd.m;

public class b {
    protected m a;
    protected int b;
    protected int c;
    protected int d;

    public b(m m8) {
        this.a = m8;
        this.b = 0;
    }

    public String a() {
        return this.a.c();
    }

    public int b() {
        return this.c;
    }

    public int c(byte by) {
        int n8 = this.a.b(by);
        if (this.b == 0) {
            this.d = 0;
            this.c = this.a.a(n8);
        }
        this.b = n8 = this.a.d(n8, this.b);
        ++this.d;
        return n8;
    }

    public void d() {
        this.b = 0;
    }
}

