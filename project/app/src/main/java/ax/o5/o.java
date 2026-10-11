/*
 * Decompiled with CFR 0.152.
 */
package ax.o5;

import ax.o5.e;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class o {
    public static a a() {
        return new e.b();
    }

    public abstract ax.o5.a b();

    public abstract b c();

    @AutoValue.Builder
    public static abstract class a {
        public abstract o a();

        public abstract a b(ax.o5.a var1);

        public abstract a c(b var1);
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        private static final b[] e0;
        private final int q;

        static {
            b b8;
            b b9;
            c0 = b9 = new b(0);
            d0 = b8 = new b(23);
            e0 = new b[]{b9, b8};
        }

        private b(int n9) {
            this.q = n9;
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])e0.clone();
        }
    }
}

