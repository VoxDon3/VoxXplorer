/*
 * Decompiled with CFR 0.152.
 */
package ax.q5;

import ax.q5.b;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class g {
    public static g a() {
        return new b(a.d0, -1L);
    }

    public static g d() {
        return new b(a.e0, -1L);
    }

    public static g e(long l8) {
        return new b(a.q, l8);
    }

    public static g f() {
        return new b(a.c0, -1L);
    }

    public abstract long b();

    public abstract a c();

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        private static final a[] f0;
        public static final /* enum */ a q;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            q = a11 = new a();
            c0 = a10 = new a();
            d0 = a9 = new a();
            e0 = a8 = new a();
            f0 = new a[]{a11, a10, a9, a8};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])f0.clone();
        }
    }
}

