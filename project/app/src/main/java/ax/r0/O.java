/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.M;
import ax.r0.N;

final class O {
    private static final M a = O.c();
    private static final M b = new N();

    static M a() {
        return a;
    }

    static M b() {
        return b;
    }

    private static M c() {
        try {
            M m8 = (M)Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
            return m8;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

