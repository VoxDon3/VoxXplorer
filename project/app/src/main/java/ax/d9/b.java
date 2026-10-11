/*
 * Decompiled with CFR 0.152.
 */
package ax.d9;

import ax.d9.f;

public interface b {
    public int a(byte[] var1, int var2, int var3, byte[] var4, int var5) throws f;

    public void b(a var1, byte[] var2) throws f;

    public int c(byte[] var1, int var2) throws f;

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0;
        private static final a[] d0;
        public static final /* enum */ a q;

        static {
            q = new a();
            c0 = new a();
            d0 = a.d();
        }

        private static /* synthetic */ a[] d() {
            return new a[]{q, c0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])d0.clone();
        }
    }
}

