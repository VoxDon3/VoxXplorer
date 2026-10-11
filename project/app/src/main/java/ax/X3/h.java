/*
 * Decompiled with CFR 0.152.
 */
package ax.X3;

public abstract class h {
    public static final h a = new e();
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;

    static {
        d d8 = new d();
        b = d8;
        c = new a();
        d = new b();
        e = new c();
        f = new f();
        g = d8;
    }

    public abstract g a(int var1, int var2, int var3, int var4);

    public abstract float b(int var1, int var2, int var3, int var4);

    private static class a
    extends h {
        a() {
        }

        @Override
        public g a(int n8, int n9, int n10, int n11) {
            return ax.X3.h$g.c0;
        }

        @Override
        public float b(int n8, int n9, int n10, int n11) {
            if ((n8 = Math.min(n9 / n11, n8 / n10)) == 0) {
                return 1.0f;
            }
            return 1.0f / (float)Integer.highestOneBit(n8);
        }
    }

    private static class b
    extends h {
        b() {
        }

        @Override
        public g a(int n8, int n9, int n10, int n11) {
            return ax.X3.h$g.q;
        }

        @Override
        public float b(int n8, int n9, int n10, int n11) {
            n10 = (int)Math.ceil(Math.max((float)n9 / (float)n11, (float)n8 / (float)n10));
            n9 = Integer.highestOneBit(n10);
            n8 = 1;
            if ((n9 = Math.max(1, n9)) >= n10) {
                n8 = 0;
            }
            return 1.0f / (float)(n9 << n8);
        }
    }

    private static class c
    extends h {
        c() {
        }

        @Override
        public g a(int n8, int n9, int n10, int n11) {
            return ax.X3.h$g.c0;
        }

        @Override
        public float b(int n8, int n9, int n10, int n11) {
            return Math.min(1.0f, a.b(n8, n9, n10, n11));
        }
    }

    private static class d
    extends h {
        d() {
        }

        @Override
        public g a(int n8, int n9, int n10, int n11) {
            return ax.X3.h$g.c0;
        }

        @Override
        public float b(int n8, int n9, int n10, int n11) {
            return Math.max((float)n10 / (float)n8, (float)n11 / (float)n9);
        }
    }

    private static class e
    extends h {
        e() {
        }

        @Override
        public g a(int n8, int n9, int n10, int n11) {
            return ax.X3.h$g.c0;
        }

        @Override
        public float b(int n8, int n9, int n10, int n11) {
            return Math.min((float)n10 / (float)n8, (float)n11 / (float)n9);
        }
    }

    private static class f
    extends h {
        f() {
        }

        @Override
        public g a(int n8, int n9, int n10, int n11) {
            return ax.X3.h$g.c0;
        }

        @Override
        public float b(int n8, int n9, int n10, int n11) {
            return 1.0f;
        }
    }

    public static final class g
    extends Enum<g> {
        public static final /* enum */ g c0;
        private static final g[] d0;
        public static final /* enum */ g q;

        static {
            g g8;
            g g9;
            q = g9 = new g();
            c0 = g8 = new g();
            d0 = new g[]{g9, g8};
        }

        public static g valueOf(String string) {
            return Enum.valueOf(g.class, string);
        }

        public static g[] values() {
            return (g[])d0.clone();
        }
    }
}

