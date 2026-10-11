/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.e1;

final class f1 {
    private static final e1 a;
    private static final e1 b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        e1 e12 = null;
        try {
            e1 e13;
            e12 = e13 = (e1)Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch (Exception exception) {}
        a = e12;
        b = new e1();
    }

    static e1 a() {
        return a;
    }

    static e1 b() {
        return b;
    }
}

