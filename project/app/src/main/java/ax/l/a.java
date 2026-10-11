/*
 * Decompiled with CFR 0.152.
 */
package ax.l;

import android.content.Context;
import android.content.Intent;
import ax.Gb.l;

public abstract class a<I, O> {
    public abstract Intent a(Context var1, I var2);

    public a<O> b(Context context, I i8) {
        l.f(context, "context");
        return null;
    }

    public abstract O c(int var1, Intent var2);

    public static final class a<T> {
        private final T a;

        public a(T t8) {
            this.a = t8;
        }

        public final T a() {
            return this.a;
        }
    }
}

