/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Q8.g;
import ax.Q8.m;
import ax.Q8.q;

public class p
extends q {
    private int e;

    public p(int n8, g g8, m m8, long l8, long l9, int n9) {
        super(n8, g8, m8, l8, l9);
        this.e = n9;
    }

    @Override
    public int f() {
        return this.e;
    }

    protected int n() {
        return Math.min(this.e, this.d() * 65536);
    }
}

