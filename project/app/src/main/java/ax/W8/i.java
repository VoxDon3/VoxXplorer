/*
 * Decompiled with CFR 0.152.
 */
package ax.W8;

import ax.Y8.c;
import ax.Z8.a;

public class i {
    private b a;
    private c b;
    private int c;
    private a d;

    i() {
    }

    public i(b b8, c c8, int n8, a a8) {
        this.a = b8;
        this.b = c8;
        this.c = n8;
        this.d = a8;
    }

    public a a() {
        return this.d;
    }

    i b(a.c c8) throws a.b {
        this.a = c.a.f(c8.z(), b.class, null);
        this.b = c.a.f(c8.z(), c.class, null);
        this.c = c8.J();
        c8.U(3);
        this.d = c.a.f(c8.z(), a.class, null);
        return this;
    }

    void c(a.c c8) {
        c8.j((byte)this.a.q);
        c8.j((byte)this.b.q);
        c8.s(this.c);
        c8.o(new byte[]{0, 0, 0});
        c8.j((byte)this.d.getValue());
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (i)object;
            if (this.c == ((i)object).c && this.a == ((i)object).a && this.b == ((i)object).b && this.d == ((i)object).d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return j.Objects.hash((Object[])new Object[]{this.a, this.b, this.c, this.d});
    }

    public String toString() {
        return String.format("WindowsVersion[%s, %s, %d, %s]", this.a, this.b, this.c, this.d);
    }

    public static final class a
    extends Enum<a>
    implements ax.Y8.c<a> {
        public static final /* enum */ a c0 = new a(15);
        private static final a[] d0 = ax.W8.i$a.d();
        private long q;

        private a(int n9) {
            this.q = n9;
        }

        private static /* synthetic */ a[] d() {
            return new a[]{c0};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])d0.clone();
        }

        @Override
        public long getValue() {
            return this.q;
        }
    }

    public static final class b
    extends Enum<b>
    implements ax.Y8.c<b> {
        public static final /* enum */ b c0 = new b(5);
        public static final /* enum */ b d0 = new b(6);
        public static final /* enum */ b e0 = new b(10);
        private static final b[] f0 = ax.W8.i$b.d();
        private long q;

        private b(int n9) {
            this.q = n9;
        }

        private static /* synthetic */ b[] d() {
            return new b[]{c0, d0, e0};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])f0.clone();
        }

        @Override
        public long getValue() {
            return this.q;
        }
    }

    public static final class c
    extends Enum<c>
    implements ax.Y8.c<c> {
        public static final /* enum */ c c0 = new c(0);
        public static final /* enum */ c d0 = new c(1);
        public static final /* enum */ c e0 = new c(2);
        public static final /* enum */ c f0 = new c(3);
        private static final c[] g0 = ax.W8.i$c.d();
        private long q;

        private c(int n9) {
            this.q = n9;
        }

        private static /* synthetic */ c[] d() {
            return new c[]{c0, d0, e0, f0};
        }

        public static c valueOf(String string) {
            return Enum.valueOf(c.class, string);
        }

        public static c[] values() {
            return (c[])g0.clone();
        }

        @Override
        public long getValue() {
            return this.q;
        }
    }
}

