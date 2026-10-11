package ax.a1;

/* renamed from: ax.a1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1296l {
    public static final C1296l d = new b().d();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    /* renamed from: ax.a1.l$b */
    public static final class b {
        private boolean a;
        private boolean b;
        private boolean c;

        public C1296l d() {
            if (this.a || !(this.b || this.c)) {
                return new C1296l(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z) {
            this.a = z;
            return this;
        }

        public b f(boolean z) {
            this.b = z;
            return this;
        }

        public b g(boolean z) {
            this.c = z;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1296l.class == obj.getClass()) {
            C1296l c1296l = (C1296l) obj;
            if (this.a == c1296l.a && this.b == c1296l.b && this.c == c1296l.c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a ? 1 : 0) << 2) + ((this.b ? 1 : 0) << 1) + (this.c ? 1 : 0);
    }

    private C1296l(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
    }
}
