/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.p1;

final class q1 {
    private static final p1 a;
    private static final p1 b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        p1 p12 = null;
        try {
            p1 p13;
            p12 = p13 = (p1)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        }
        catch (Exception exception) {}
        a = p12;
        b = new p1();
    }

    static p1 a() {
        return a;
    }

    static p1 b() {
        return b;
    }
}

