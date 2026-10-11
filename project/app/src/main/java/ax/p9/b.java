/*
 * Decompiled with CFR 0.152.
 */
package ax.p9;

import ax.K8.a;

public class b
extends Exception {
    private final long q;

    public b(long l8, String string) {
        super(string);
        this.q = l8;
    }

    public b(Throwable throwable) {
        super(throwable);
        this.q = a.y1.getValue();
    }

    public a a() {
        return a.l(this.q);
    }

    public long b() {
        return this.q;
    }
}

