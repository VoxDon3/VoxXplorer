/*
 * Decompiled with CFR 0.152.
 */
package ax.h9;

import ax.Z8.a;
import ax.h9.b;
import ax.h9.c;

public abstract class e<H extends c>
implements ax.X8.b<b> {
    private H a;
    protected b b;

    protected e(H h8) {
        this.a = h8;
    }

    protected e(H h8, b b8) throws a.b {
        this.a = h8;
        this.b = b8;
        this.c();
    }

    public e(H h8, byte[] byArray) throws a.b {
        this(h8, new b(byArray));
    }

    public b a() {
        return this.b;
    }

    public H b() {
        return this.a;
    }

    protected void c() throws a.b {
        this.a.b(this.b);
    }
}

