/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.P;
import ax.r0.Q;
import ax.r0.y;

class x
implements Q {
    private static final x a = new x();

    private x() {
    }

    public static x c() {
        return a;
    }

    @Override
    public P a(Class<?> clazz) {
        if (y.class.isAssignableFrom(clazz)) {
            try {
                P p8 = (P)y.x(clazz.asSubclass(y.class)).q();
                return p8;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to get message info for ");
                stringBuilder.append(clazz.getName());
                throw new RuntimeException(stringBuilder.toString(), exception);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported message type: ");
        stringBuilder.append(clazz.getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public boolean b(Class<?> clazz) {
        return y.class.isAssignableFrom(clazz);
    }
}

