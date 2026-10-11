/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import ax.b0.g;

public abstract class J<K> {
    private final Class<K> a;

    public J(Class<K> clazz) {
        boolean bl = clazz != null;
        g.a(bl);
        this.a = clazz;
    }

    public static J<Long> a() {
        return new a();
    }

    private static class a
    extends J<Long> {
        a() {
            super(Long.class);
        }
    }
}

