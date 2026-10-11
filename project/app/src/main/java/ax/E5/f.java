/*
 * Decompiled with CFR 0.152.
 */
package ax.E5;

import ax.E5.g;

@Deprecated
public final class f {
    protected Boolean a = Boolean.FALSE;
    protected String b;

    public f() {
    }

    public f(g g8) {
        g.b(g8);
        this.a = g.d(g8);
        this.b = g.c(g8);
    }

    public final f a(String string) {
        this.b = string;
        return this;
    }
}

