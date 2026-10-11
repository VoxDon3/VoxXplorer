/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.d1;
import java.util.AbstractMap;

final class e1 {
    e1() {
    }

    public static final Object a(Object object, Object object2) {
        d1 d12 = (d1)object;
        object2 = (d1)object2;
        object = d12;
        if (!((AbstractMap)object2).isEmpty()) {
            object = d12;
            if (!d12.i()) {
                object = d12.c();
            }
            ((d1)object).f((d1)object2);
        }
        return object;
    }
}

