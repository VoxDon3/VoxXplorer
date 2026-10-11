/*
 * Decompiled with CFR 0.152.
 */
package ax.e8;

import ax.e8.a;
import ax.e8.f;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class d {
    public static a a() {
        return new a.b();
    }

    public abstract f b();

    public abstract String c();

    public abstract String d();

    public abstract b e();

    public abstract String f();

    @AutoValue.Builder
    public static abstract class a {
        public abstract d a();

        public abstract a b(f var1);

        public abstract a c(String var1);

        public abstract a d(String var1);

        public abstract a e(b var1);

        public abstract a f(String var1);
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        private static final b[] d0;
        public static final /* enum */ b q;

        static {
            q = new b();
            c0 = new b();
            d0 = b.d();
        }

        private static /* synthetic */ b[] d() {
            return new b[]{q, c0};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])d0.clone();
        }
    }
}

