/*
 * Decompiled with CFR 0.152.
 */
package ax.e8;

import ax.e8.b;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class f {
    public static a a() {
        return new b.b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();

    @AutoValue.Builder
    public static abstract class a {
        public abstract f a();

        public abstract a b(b var1);

        public abstract a c(String var1);

        public abstract a d(long var1);
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        private static final b[] e0;
        public static final /* enum */ b q;

        static {
            q = new b();
            c0 = new b();
            d0 = new b();
            e0 = b.d();
        }

        private static /* synthetic */ b[] d() {
            return new b[]{q, c0, d0};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])e0.clone();
        }
    }
}

