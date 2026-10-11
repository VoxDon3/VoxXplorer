/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.R4;
import ax.b6.S4;

final class J4
implements R4 {
    private R4[] a;

    J4(R4 ... r4Array) {
        this.a = r4Array;
    }

    @Override
    public final S4 a(Class<?> object) {
        for (R4 r42 : this.a) {
            if (!r42.b((Class<?>)object)) continue;
            return r42.a((Class<?>)object);
        }
        object = ((Class)object).getName();
        StringBuilder stringBuilder = new StringBuilder("No factory is available for message type: ");
        stringBuilder.append((String)object);
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    @Override
    public final boolean b(Class<?> clazz) {
        R4[] r4Array = this.a;
        int n8 = r4Array.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!r4Array[i8].b(clazz)) continue;
            return true;
        }
        return false;
    }
}

