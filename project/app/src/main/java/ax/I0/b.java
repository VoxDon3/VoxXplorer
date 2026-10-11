/*
 * Decompiled with CFR 0.152.
 */
package ax.I0;

import androidx.lifecycle.p;
import androidx.lifecycle.q;
import ax.G0.t;
import ax.Gb.l;
import ax.I0.a;
import ax.I0.f;

public final class b
implements q.b {
    private final f<?>[] a;

    public b(f<?> ... fArray) {
        l.f(fArray, "initializers");
        this.a = fArray;
    }

    public /* synthetic */ p a(Class clazz) {
        return t.a(this, clazz);
    }

    @Override
    public <T extends p> T b(Class<T> clazz, a object) {
        l.f(clazz, "modelClass");
        l.f(object, "extras");
        f<?>[] fArray = this.a;
        int n8 = fArray.length;
        p p8 = null;
        for (int i8 = 0; i8 < n8; ++i8) {
            f<?> f8 = fArray[i8];
            if (!l.a(f8.a(), clazz)) continue;
            p8 = (p)f8.b().invoke((a)object);
            p8 = p8 instanceof p ? (p)p8 : null;
        }
        if (p8 != null) {
            return (T)p8;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("No initializer set for given class ");
        ((StringBuilder)object).append(clazz.getName());
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }
}

