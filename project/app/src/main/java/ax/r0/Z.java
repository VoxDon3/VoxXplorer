/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.X;
import ax.r0.Y;

final class Z {
    private static final X a = Z.c();
    private static final X b = new Y();

    static X a() {
        return a;
    }

    static X b() {
        return b;
    }

    private static X c() {
        try {
            X x8 = (X)Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
            return x8;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

