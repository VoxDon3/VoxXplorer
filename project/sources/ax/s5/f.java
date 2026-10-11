package ax.s5;

/* loaded from: classes.dex */
public final class f {
    private static final f c = new a().a();
    private final long a;
    private final long b;

    public static final class a {
        private long a = 0;
        private long b = 0;

        a() {
        }

        public f a() {
            return new f(this.a, this.b);
        }

        public a b(long j) {
            this.b = j;
            return this;
        }

        public a c(long j) {
            this.a = j;
            return this;
        }
    }

    f(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static a c() {
        return new a();
    }

    @ax.X7.d(tag = 2)
    public long a() {
        return this.b;
    }

    @ax.X7.d(tag = 1)
    public long b() {
        return this.a;
    }
}
