/*
 * Decompiled with CFR 0.152.
 */
package ax.db;

import ax.db.f;
import ax.db.h;

@Deprecated
public abstract class p
extends h {
    p() {
    }

    public static a a(b b8, long l8) {
        return new f.b().e(ax.cb.b.b(b8, "type")).c(l8).d(0L).b(0L);
    }

    public abstract long b();

    public abstract ax.ab.b c();

    public abstract long d();

    public abstract b e();

    public abstract long f();

    @Deprecated
    public static abstract class a {
        a() {
        }

        public abstract p a();

        public abstract a b(long var1);

        abstract a c(long var1);

        public abstract a d(long var1);
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        private static final b[] d0;
        public static final /* enum */ b q;

        static {
            b b8;
            b b9;
            q = b9 = new b();
            c0 = b8 = new b();
            d0 = new b[]{b9, b8};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])d0.clone();
        }
    }
}

