package ax.la;

/* loaded from: classes3.dex */
public final class y {
    public static final y c;
    public static final y d;
    public static final y e;
    private final boolean a;
    private final boolean b;

    static {
        c = new a().b(false).c(false).a();
        d = new a().b(true).c(false).a();
        e = new a().b(false).c(true).a();
    }

    public static a a() {
        return c.b();
    }

    public a b() {
        return new a(this.a, this.b);
    }

    public boolean c() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.a != yVar.a && this.b != yVar.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0);
    }

    public static class a {
        private boolean a;
        private boolean b;

        public y a() {
            return new y(this.a, this.b);
        }

        public a b(boolean z) {
            this.a = z;
            return this;
        }

        public a c(boolean z) {
            this.b = z;
            return this;
        }

        private a() {
        }

        private a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    private y(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
