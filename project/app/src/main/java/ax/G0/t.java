/*
 * Decompiled with CFR 0.152.
 */
package ax.G0;

import androidx.lifecycle.p;
import androidx.lifecycle.q;
import ax.Gb.l;
import ax.I0.a;

public final class t {
    public static p a(q.b b8, Class clazz) {
        l.f(clazz, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    public static p b(q.b b8, Class clazz, a a8) {
        l.f(clazz, "modelClass");
        l.f(a8, "extras");
        return b8.a(clazz);
    }
}

