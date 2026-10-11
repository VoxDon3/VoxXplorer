package ax.s5;

/* renamed from: ax.s5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3052e {
    private static final C3052e c = new a().a();
    private final long a;
    private final long b;

    /* renamed from: ax.s5.e$a */
    public static final class a {
        private long a = 0;
        private long b = 0;

        a() {
        }

        public C3052e a() {
            return new C3052e(this.a, this.b);
        }

        public a b(long j) {
            this.a = j;
            return this;
        }

        public a c(long j) {
            this.b = j;
            return this;
        }
    }

    C3052e(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static a c() {
        return new a();
    }

    @ax.X7.d(tag = 1)
    public long a() {
        return this.a;
    }

    @ax.X7.d(tag = 2)
    public long b() {
        return this.b;
    }
}
