/*
 * Decompiled with CFR 0.152.
 */
package ax.ca;

public class b {
    private final a a;
    private final Throwable b;

    public b(a a8, Throwable throwable) {
        this.a = a8;
        this.b = throwable;
    }

    public a a() {
        return this.a;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        public static final /* enum */ a f0;
        private static final a[] g0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = new a();
            e0 = new a();
            f0 = new a();
            g0 = ax.ca.b$a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0, d0, e0, f0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])g0.clone();
        }
    }
}

