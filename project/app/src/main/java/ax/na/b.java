/*
 * Decompiled with CFR 0.152.
 */
package ax.na;

import ax.s8.a;
import ax.s8.c;

public class b {
    @a
    @c(value="error")
    private String a;
    @a
    @c(value="result")
    private int b;

    protected b() {
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public boolean c() {
        return this.b == 0;
    }
}

