package ax.X3;

/* loaded from: classes.dex */
public abstract class h {
    public static final h a = new e();
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;

    private static class a extends h {
        a() {
        }

        @Override // ax.X3.h
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // ax.X3.h
        public float b(int i, int i2, int i3, int i4) {
            if (Math.min(i2 / i4, i / i3) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    private static class b extends h {
        b() {
        }

        @Override // ax.X3.h
        public g a(int i, int i2, int i3, int i4) {
            return g.MEMORY;
        }

        @Override // ax.X3.h
        public float b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
        }
    }

    private static class c extends h {
        c() {
        }

        @Override // ax.X3.h
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // ax.X3.h
        public float b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, h.a.b(i, i2, i3, i4));
        }
    }

    private static class d extends h {
        d() {
        }

        @Override // ax.X3.h
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // ax.X3.h
        public float b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    private static class e extends h {
        e() {
        }

        @Override // ax.X3.h
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // ax.X3.h
        public float b(int i, int i2, int i3, int i4) {
            return Math.min(i3 / i, i4 / i2);
        }
    }

    private static class f extends h {
        f() {
        }

        @Override // ax.X3.h
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // ax.X3.h
        public float b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        b = dVar;
        c = new a();
        d = new b();
        e = new c();
        f = new f();
        g = dVar;
    }

    public abstract g a(int i, int i2, int i3, int i4);

    public abstract float b(int i, int i2, int i3, int i4);
}
