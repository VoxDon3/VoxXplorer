/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.q;
import ax.r0.r;

final class s {
    private static final q<?> a = new r();
    private static final q<?> b = s.c();

    static q<?> a() {
        q<?> q8 = b;
        if (q8 != null) {
            return q8;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static q<?> b() {
        return a;
    }

    private static q<?> c() {
        try {
            q q8 = (q)Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
            return q8;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

