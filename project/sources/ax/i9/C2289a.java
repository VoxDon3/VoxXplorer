package ax.i9;

/* renamed from: ax.i9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2289a {
    private boolean a;
    private boolean b;

    /* renamed from: ax.i9.a$b */
    public static class b {
        private C2289a a = new C2289a();

        b() {
        }

        public C2289a a() {
            return new C2289a();
        }

        public b b(boolean z) {
            this.a.b = z;
            return this;
        }

        public b c(boolean z) {
            this.a.a = z;
            return this;
        }
    }

    public static b c() {
        return new b().c(true).b(false);
    }

    public static C2289a d() {
        return c().a();
    }

    private C2289a() {
    }

    private C2289a(C2289a c2289a) {
        this();
        this.a = c2289a.a;
        this.b = c2289a.b;
    }
}
