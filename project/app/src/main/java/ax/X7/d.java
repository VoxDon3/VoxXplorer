/*
 * Decompiled with CFR 0.152.
 */
package ax.X7;

public @interface d {
    public a intEncoding() default a.q;

    public int tag();

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        private static final a[] e0;
        public static final /* enum */ a q;

        static {
            a a8;
            a a9;
            a a10;
            q = a10 = new a();
            c0 = a9 = new a();
            d0 = a8 = new a();
            e0 = new a[]{a10, a9, a8};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])e0.clone();
        }
    }
}

