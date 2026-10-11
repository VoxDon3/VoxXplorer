/*
 * Decompiled with CFR 0.152.
 */
package ax.h7;

import ax.h7.a;
import ax.i7.i;
import ax.i7.s;

public abstract class b<T>
extends ax.g7.b<T> {
    private final Object r0;

    protected b(a a8, String string, String string2, Object object, Class<T> clazz) {
        Object object2 = null;
        ax.k7.a a9 = null;
        if (object == null) {
            object2 = a9;
        } else {
            a9 = new ax.k7.a(a8.k(), object);
            if (!a8.l().c().isEmpty()) {
                object2 = "data";
            }
            object2 = a9.h((String)object2);
        }
        super(a8, string, string2, (i)object2, clazz);
        this.r0 = object;
    }

    protected ax.e7.b B(s s8) {
        return ax.e7.b.d(this.z().k(), s8);
    }

    public b<T> C(String string, Object object) {
        return (b)super.y(string, object);
    }

    public a z() {
        return (a)super.o();
    }
}

