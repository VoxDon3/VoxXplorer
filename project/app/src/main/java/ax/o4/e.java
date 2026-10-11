/*
 * Decompiled with CFR 0.152.
 */
package ax.o4;

public class e {
    public static final e c = new e(null, null);
    public static final e d = new e(ax.o4.e$a.q, null);
    public static final e e;
    public static final e f;
    public static final e g;
    public static final e h;
    public static final e i;
    public static final e j;
    public static final e k;
    private a a;
    private b b;

    static {
        a a8 = ax.o4.e$a.g0;
        b b8 = ax.o4.e$b.q;
        e = new e(a8, b8);
        a a9 = ax.o4.e$a.c0;
        f = new e(a9, b8);
        g = new e(ax.o4.e$a.k0, b8);
        h = new e(ax.o4.e$a.d0, b8);
        i = new e(ax.o4.e$a.j0, b8);
        b8 = ax.o4.e$b.c0;
        j = new e(a8, b8);
        k = new e(a9, b8);
    }

    e(a a8, b b8) {
        this.a = a8;
        this.b = b8;
    }

    public a a() {
        return this.a;
    }

    public b b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        object = (e)object;
        return this.a == ((e)object).a && this.b == ((e)object).b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((Object)this.a);
        stringBuilder.append(" ");
        stringBuilder.append((Object)this.b);
        return stringBuilder.toString();
    }

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
        public static final /* enum */ a k0;
        private static final a[] l0;
        public static final /* enum */ a q;

        static {
            a a8;
            a a9;
            a a10;
            a a11;
            a a12;
            a a13;
            a a14;
            a a15;
            a a16;
            a a17;
            q = a17 = new a();
            c0 = a16 = new a();
            d0 = a15 = new a();
            e0 = a14 = new a();
            f0 = a13 = new a();
            g0 = a12 = new a();
            h0 = a11 = new a();
            i0 = a10 = new a();
            j0 = a9 = new a();
            k0 = a8 = new a();
            l0 = new a[]{a17, a16, a15, a14, a13, a12, a11, a10, a9, a8};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return (a[])l0.clone();
        }
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

