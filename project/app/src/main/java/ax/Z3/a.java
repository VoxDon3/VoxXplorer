/*
 * Decompiled with CFR 0.152.
 */
package ax.Z3;

import android.graphics.drawable.Drawable;
import ax.P3.p;
import ax.P3.s;
import ax.k4.h;

public abstract class a<T extends Drawable>
implements s<T>,
p {
    protected final T q;

    public a(T t8) {
        this.q = (Drawable)h.d(t8);
    }

    public final T c() {
        return (T)this.q.getConstantState().newDrawable();
    }
}

