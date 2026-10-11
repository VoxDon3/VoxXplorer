/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.G;
import ax.Qb.N;
import ax.Qb.Y;

public abstract class D0
extends G {
    public abstract D0 Z0();

    protected final String a1() {
        D0 d02 = Y.c();
        if (this == d02) {
            return "Dispatchers.Main";
        }
        try {
            d02 = d02.Z0();
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            d02 = null;
        }
        if (this == d02) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override
    public String toString() {
        String string = this.a1();
        CharSequence charSequence = string;
        if (string == null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(N.a(this));
            ((StringBuilder)charSequence).append('@');
            ((StringBuilder)charSequence).append(N.b(this));
            charSequence = ((StringBuilder)charSequence).toString();
        }
        return charSequence;
    }
}

