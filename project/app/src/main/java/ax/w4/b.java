/*
 * Decompiled with CFR 0.152.
 */
package ax.w4;

import ax.w4.a;

public abstract class b {
    protected abstract void a(a var1);

    protected String b() {
        return null;
    }

    public final void c(StringBuilder stringBuilder) {
        new a.a(stringBuilder).d(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.c(stringBuilder);
        return stringBuilder.toString();
    }
}

