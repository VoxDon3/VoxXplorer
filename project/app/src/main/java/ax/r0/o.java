/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.p;

final class o {
    static final Class<?> a = o.c();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static p a() {
        if (a == null) return p.e;
        try {
            return o.b("getEmptyRegistry");
        }
        catch (Exception exception) {
            return p.e;
        }
    }

    private static final p b(String string) throws Exception {
        return (p)a.getDeclaredMethod(string, null).invoke(null, null);
    }

    static Class<?> c() {
        try {
            Class<?> clazz = Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
            return clazz;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }
}

