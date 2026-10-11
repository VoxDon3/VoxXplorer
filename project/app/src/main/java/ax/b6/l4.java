/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.R4;
import ax.b6.S4;
import ax.b6.k4;

final class l4
implements R4 {
    private static final l4 a = new l4();

    private l4() {
    }

    public static l4 c() {
        return a;
    }

    @Override
    public final S4 a(Class<?> object) {
        if (k4.class.isAssignableFrom((Class<?>)object)) {
            try {
                S4 s42 = (S4)k4.o(((Class)object).asSubclass(k4.class)).t(k4.e.c, null, null);
                return s42;
            }
            catch (Exception exception) {
                object = ((Class)object).getName();
                StringBuilder stringBuilder = new StringBuilder("Unable to get message info for ");
                stringBuilder.append((String)object);
                throw new RuntimeException(stringBuilder.toString(), exception);
            }
        }
        object = ((Class)object).getName();
        StringBuilder stringBuilder = new StringBuilder("Unsupported message type: ");
        stringBuilder.append((String)object);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public final boolean b(Class<?> clazz) {
        return k4.class.isAssignableFrom(clazz);
    }
}

