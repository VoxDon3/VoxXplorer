/*
 * Decompiled with CFR 0.152.
 */
package ax.Z2;

public class u {
    public a a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public String g;

    public u(a a8, String string, String string2, String string3, String string4, String string5, boolean bl) {
        this.a = a8;
        this.b = string;
        this.g = string2;
        this.c = string3;
        this.d = string4;
        this.f = string5;
        this.e = bl;
    }

    public static boolean a(a a8) {
        return a8 != ax.Z2.u$a.c0 && a8 != ax.Z2.u$a.j0;
    }

    public static boolean b(a a8) {
        return a8 == ax.Z2.u$a.c0;
    }

    public static boolean c(a a8) {
        return a8 == ax.Z2.u$a.d0;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        public static final /* enum */ a f0;
        public static final /* enum */ a g0;
        public static final /* enum */ a h0;
        public static final /* enum */ a i0;
        public static final /* enum */ a j0;
        private static final a[] k0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = new a();
            e0 = new a();
            f0 = new a();
            g0 = new a();
            h0 = new a();
            i0 = new a();
            j0 = new a();
            k0 = ax.Z2.u$a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0, d0, e0, f0, g0, h0, i0, j0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])k0.clone();
        }
    }
}

