/*
 * Decompiled with CFR 0.152.
 */
package ax.f6;

import android.os.Bundle;

public final class n {
    public static <T> T a(Bundle object, String string, Class<T> clazz, T t8) {
        if ((object = object.get(string)) == null) {
            return t8;
        }
        if (clazz.isAssignableFrom(object.getClass())) {
            return (T)object;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", string, clazz.getCanonicalName(), object.getClass().getCanonicalName()));
    }

    public static void b(Bundle bundle, Object object) {
        if (object instanceof Double) {
            bundle.putDouble("value", ((Double)object).doubleValue());
            return;
        }
        if (object instanceof Long) {
            bundle.putLong("value", ((Long)object).longValue());
            return;
        }
        bundle.putString("value", object.toString());
    }
}

