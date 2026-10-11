/*
 * Decompiled with CFR 0.152.
 */
package ax.w0;

import ax.w0.e;

public abstract class d {
    private static d a;

    public static d a() {
        if (a == null) {
            a = new e();
        }
        return a;
    }
}

