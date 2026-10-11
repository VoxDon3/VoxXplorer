/*
 * Decompiled with CFR 0.152.
 */
package ax.q5;

import ax.p5.i;
import ax.q5.a;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class f {
    public static a a() {
        return new a.b();
    }

    public abstract Iterable<i> b();

    public abstract byte[] c();

    @AutoValue.Builder
    public static abstract class a {
        public abstract f a();

        public abstract a b(Iterable<i> var1);

        public abstract a c(byte[] var1);
    }
}

