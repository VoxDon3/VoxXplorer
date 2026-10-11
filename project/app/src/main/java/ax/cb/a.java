/*
 * Decompiled with CFR 0.152.
 */
package ax.cb;

import java.util.ServiceConfigurationError;

public final class a {
    public static <T> T a(Class<?> clazz, Class<T> clazz2) {
        try {
            clazz2 = clazz.asSubclass(clazz2).getConstructor(null).newInstance(null);
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Provider ");
            stringBuilder.append(clazz.getName());
            stringBuilder.append(" could not be instantiated.");
            throw new ServiceConfigurationError(stringBuilder.toString(), exception);
        }
        return (T)clazz2;
    }
}

