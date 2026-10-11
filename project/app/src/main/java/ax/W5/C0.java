/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.A0;
import ax.W5.B0;

final class C0 {
    private static final A0 a = new B0();
    private static final A0 b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        A0 a02 = null;
        try {
            A0 a03;
            a02 = a03 = (A0)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch (Exception exception) {}
        b = a02;
    }

    static A0 a() {
        A0 a02 = b;
        if (a02 != null) {
            return a02;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static A0 b() {
        return a;
    }
}

