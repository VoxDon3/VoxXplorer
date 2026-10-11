/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Qb.N;

public abstract class y {
    public abstract Object a(Object var1);

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(N.a(this));
        stringBuilder.append('@');
        stringBuilder.append(N.b(this));
        return stringBuilder.toString();
    }
}

