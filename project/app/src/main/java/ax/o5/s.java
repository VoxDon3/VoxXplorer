/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.o5.i;
import ax.o5.r;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class s {
    public static a a() {
        return new i.b();
    }

    public abstract r b();

    @AutoValue.Builder
    public static abstract class a {
        public abstract s a();

        public abstract a b(r var1);
    }
}

