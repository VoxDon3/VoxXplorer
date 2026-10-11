/*
 * Decompiled with CFR 0.152.
 */
package ax.i8;

import ax.x7.l;

public class i
extends l {
    private final a q;

    public i(String string) {
        super(string);
        this.q = a.c0;
    }

    public i(String string, a a8) {
        super(string);
        this.q = a8;
    }

    public i(String string, Throwable throwable) {
        super(string, throwable);
        this.q = a.c0;
    }

    public i(String string, Throwable throwable, a a8) {
        super(string, throwable);
        this.q = a8;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a c0 = new a(0);
        public static final /* enum */ a d0 = new a(1);
        public static final /* enum */ a e0 = new a(2);
        public static final /* enum */ a f0 = new a(3);
        public static final /* enum */ a g0 = new a(4);
        private static final a[] h0 = a.d();
        private final int q;

        private a(int n9) {
            this.q = n9;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{c0, d0, e0, f0, g0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])h0.clone();
        }
    }
}

