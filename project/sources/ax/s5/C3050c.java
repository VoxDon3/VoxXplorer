package ax.s5;

/* renamed from: ax.s5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3050c {
    private static final C3050c c = new a().a();
    private final long a;
    private final b b;

    /* renamed from: ax.s5.c$a */
    public static final class a {
        private long a = 0;
        private b b = b.REASON_UNKNOWN;

        a() {
        }

        public C3050c a() {
            return new C3050c(this.a, this.b);
        }

        public a b(long j) {
            this.a = j;
            return this;
        }

        public a c(b bVar) {
            this.b = bVar;
            return this;
        }
    }

    /* renamed from: ax.s5.c$b */
    public enum b implements ax.X7.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int q;

        b(int i) {
            this.q = i;
        }

        @Override // ax.X7.c
        public int g() {
            return this.q;
        }
    }

    C3050c(long j, b bVar) {
        this.a = j;
        this.b = bVar;
    }

    public static a c() {
        return new a();
    }

    @ax.X7.d(tag = 1)
    public long a() {
        return this.a;
    }

    @ax.X7.d(tag = 3)
    public b b() {
        return this.b;
    }
}
