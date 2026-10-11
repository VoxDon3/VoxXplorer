/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import ax.b0.g;

public abstract class p<K> {
    private final int a;

    protected p(int n8) {
        boolean bl;
        boolean bl2 = bl = true;
        if (n8 != 0) {
            bl2 = n8 == 1 ? bl : false;
        }
        g.a(bl2);
        this.a = n8;
    }

    public abstract K a(int var1);

    public abstract int b(K var1);

    final boolean c(int n8) {
        return n8 == this.a;
    }
}

