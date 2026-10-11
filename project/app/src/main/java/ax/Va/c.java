/*
 * Decompiled with CFR 0.152.
 */
package ax.Va;

public class c {
    public static final c e = new c(){
        {
            this.a = ax.Va.c$b.q;
        }
    };
    b a;
    @ax.s8.c(value="href")
    String b;
    @ax.s8.c(value="method")
    String c;
    @ax.s8.c(value="templated")
    boolean d;

    public String a() {
        return this.b;
    }

    public b b() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    public void d(b b8) {
        this.a = b8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Link{href='");
        stringBuilder.append(this.b);
        stringBuilder.append('\'');
        stringBuilder.append(", method='");
        stringBuilder.append(this.c);
        stringBuilder.append('\'');
        stringBuilder.append(", templated=");
        stringBuilder.append(this.d);
        stringBuilder.append(", httpStatus=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
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
            e0 = ax.Va.c$b.d();
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

