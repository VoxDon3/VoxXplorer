/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import ax.a6.y0;

public final class z0
implements y0 {
    private final Object a;

    private z0(Object object) {
        this.a = object;
    }

    public static y0 b(Object object) {
        if (object != null) {
            return new z0(object);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override
    public final Object a() {
        return this.a;
    }
}

