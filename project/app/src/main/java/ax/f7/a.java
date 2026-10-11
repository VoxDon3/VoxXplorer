/*
 * Decompiled with CFR 0.152.
 */
package ax.f7;

import ax.i7.q;
import ax.i7.r;
import ax.i7.w;
import ax.m7.v;

public final class a {
    private final q a;
    private final w b;
    private boolean c = false;
    private int d = 0x2000000;
    private a e = ax.f7.a$a.q;
    private long f = -1L;

    public a(w object, r r8) {
        this.b = v.d(object);
        object = r8 == null ? ((w)object).c() : ((w)object).d(r8);
        this.a = object;
    }

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

