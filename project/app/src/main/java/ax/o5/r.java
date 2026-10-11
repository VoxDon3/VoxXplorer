/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.o5.h;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class r {
    public static a a() {
        return new h.b();
    }

    public abstract Integer b();

    @AutoValue.Builder
    public static abstract class a {
        public abstract r a();

        public abstract a b(Integer var1);
    }
}

