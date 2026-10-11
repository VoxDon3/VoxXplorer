/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.J0;
import ax.W5.g1;
import ax.W5.h1;

final class G0
implements h1 {
    private static final G0 a = new G0();

    private G0() {
    }

    public static G0 a() {
        return a;
    }

    @Override
    public final g1 b(Class clazz) {
        if (J0.class.isAssignableFrom(clazz)) {
            try {
                g1 g12 = (g1)J0.b(clazz.asSubclass(J0.class)).o(3, null, null);
                return g12;
            }
            catch (Exception exception) {
                throw new RuntimeException("Unable to get message info for ".concat(clazz.getName()), exception);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(clazz.getName()));
    }

    @Override
    public final boolean c(Class clazz) {
        return J0.class.isAssignableFrom(clazz);
    }
}

