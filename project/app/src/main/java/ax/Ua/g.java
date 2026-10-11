/*
 * Decompiled with CFR 0.152.
 */
package ax.Ua;

import ax.Ta.d;
import ax.Va.a;

public class g
extends d {
    protected final a c0;
    protected final int q;

    public g(int n8) {
        this(n8, null);
    }

    public g(int n8, a a8) {
        this.q = n8;
        this.c0 = a8;
    }

    public int a() {
        return this.q;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HttpCodeException{code=");
        stringBuilder.append(this.q);
        stringBuilder.append(", response=");
        stringBuilder.append(this.c0);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

