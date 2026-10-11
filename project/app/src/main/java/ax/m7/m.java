/*
 * Decompiled with CFR 0.152.
 */
package ax.m7;

import ax.q7.g;

public final class m {
    private final g a;

    private m(g g8) {
        this.a = g8;
    }

    public static m b(char c8) {
        return new m(g.f(c8));
    }

    public final String a(Iterable<?> iterable) {
        return this.a.d(iterable);
    }
}

