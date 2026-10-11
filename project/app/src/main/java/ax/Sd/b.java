/*
 * Decompiled with CFR 0.152.
 */
package ax.Sd;

import java.nio.ByteBuffer;

public abstract class b {
    private boolean a = true;

    private boolean h(byte by) {
        return (by & 0x80) == 0;
    }

    private boolean i(byte by) {
        return (by = (byte)(by & 0xFF)) < 65 || by > 90 && by < 97 || by > 122;
        {
        }
    }

    public ByteBuffer a(byte[] byArray, int n8, int n9) {
        int n10;
        ByteBuffer byteBuffer = ByteBuffer.allocate(n9);
        int n11 = n8;
        int n12 = 0;
        int n13 = n8;
        while ((n10 = n13) < n9 + n8) {
            byte by = byArray[n10];
            if (by == 62) {
                n13 = 0;
            } else {
                n13 = n12;
                if (by == 60) {
                    n13 = 1;
                }
            }
            n12 = n11;
            if (this.h(by)) {
                n12 = n11;
                if (this.i(by)) {
                    if (n10 > n11 && n13 == 0) {
                        byteBuffer.put(byArray, n11, n10 - n11);
                        byteBuffer.put((byte)32);
                    }
                    n12 = n10 + 1;
                }
            }
            n11 = n12;
            n12 = n13;
            n13 = ++n10;
        }
        if (n12 == 0 && n10 > n11) {
            byteBuffer.put(byArray, n11, n10 - n11);
        }
        return byteBuffer;
    }

    public ByteBuffer b(byte[] byArray, int n8, int n9) {
        int n10;
        ByteBuffer byteBuffer = ByteBuffer.allocate(n9);
        int n11 = n8;
        boolean bl = false;
        int n12 = n8;
        while ((n10 = n12) < n9 + n8) {
            boolean bl2;
            byte by = byArray[n10];
            if (!this.h(by)) {
                bl2 = true;
                n12 = n11;
            } else {
                n12 = n11;
                bl2 = bl;
                if (this.i(by)) {
                    if (bl && n10 > n11) {
                        byteBuffer.put(byArray, n11, n10 - n11);
                        byteBuffer.put((byte)32);
                        n12 = n10 + 1;
                        bl2 = false;
                    } else {
                        n12 = n10 + 1;
                        bl2 = bl;
                    }
                }
            }
            n11 = n12;
            bl = bl2;
            n12 = ++n10;
        }
        if (bl && n10 > n11) {
            byteBuffer.put(byArray, n11, n10 - n11);
        }
        return byteBuffer;
    }

    public abstract String c();

    public abstract float d();

    public abstract a e();

    public abstract a f(byte[] var1, int var2, int var3);

    public boolean g() {
        return this.a;
    }

    public abstract void j();

    public void k(boolean bl) {
        this.a = bl;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        public static final /* enum */ a d0;
        private static final a[] e0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = new a();
            e0 = ax.Sd.b$a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0, d0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])e0.clone();
        }
    }
}

