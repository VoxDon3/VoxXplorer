/*
 * Decompiled with CFR 0.152.
 */
package ax.f8;

import ax.f8.a;

public class b
implements a {
    private static b a;

    private b() {
    }

    public static b b() {
        if (a == null) {
            a = new b();
        }
        return a;
    }

    @Override
    public long a() {
        return System.currentTimeMillis();
    }
}

