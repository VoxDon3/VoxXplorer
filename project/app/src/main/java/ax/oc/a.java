/*
 * Decompiled with CFR 0.152.
 */
package ax.oc;

import java.io.IOException;

public class a
extends IOException {
    private a q;

    public a(String string) {
        super(string);
        this.q = a.h0;
    }

    public a(String object, a a8) {
        super((String)object);
        object = a.q;
        this.q = a8;
    }

    public a(String object, Throwable throwable, a a8) {
        super((String)object, throwable);
        object = a.q;
        this.q = a8;
    }

    public a a() {
        return this.q;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        public static final /* enum */ a e0;
        public static final /* enum */ a f0;
        public static final /* enum */ a g0;
        public static final /* enum */ a h0;
        private static final a[] i0;
        public static final /* enum */ a q;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            a a12;
            a a13;
            a a14;
            q = a14 = new a();
            c0 = a13 = new a();
            d0 = a12 = new a();
            e0 = a11 = new a();
            f0 = a10 = new a();
            g0 = a9 = new a();
            h0 = a8 = new a();
            i0 = new a[]{a14, a13, a12, a11, a10, a9, a8};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])i0.clone();
        }
    }
}

