/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.o5.g;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class q {
    public static a a() {
        return new g.b();
    }

    public abstract byte[] b();

    public abstract byte[] c();

    @AutoValue.Builder
    public static abstract class a {
        public abstract q a();

        public abstract a b(byte[] var1);

        public abstract a c(byte[] var1);
    }
}

