/*
 * Decompiled with CFR 0.152.
 */
package ax.M3;

import ax.Q3.b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface f {
    public a a(ByteBuffer var1) throws IOException;

    public int b(InputStream var1, b var2) throws IOException;

    public a c(InputStream var1) throws IOException;

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
        private final boolean q;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            a a12;
            a a13;
            a a14;
            a a15;
            c0 = a15 = new a(true);
            d0 = a14 = new a(false);
            e0 = a13 = new a(false);
            f0 = a12 = new a(true);
            g0 = a11 = new a(false);
            h0 = a10 = new a(true);
            i0 = a9 = new a(false);
            j0 = a8 = new a(false);
            k0 = new a[]{a15, a14, a13, a12, a11, a10, a9, a8};
        }

        private a(boolean bl) {
            this.q = bl;
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])k0.clone();
        }

        public boolean d() {
            return this.q;
        }
    }
}

