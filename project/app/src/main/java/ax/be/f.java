/*
 * Decompiled with CFR 0.152.
 */
package ax.be;

import ax.be.r;

abstract class f
extends r {
    int c0 = 0;
    private final int q;

    f(int n8) {
        this.q = n8;
    }

    public Object clone() {
        try {
            Object object = super.clone();
            return object;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException();
        }
    }
}

