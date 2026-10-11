package ax.la;

/* loaded from: classes3.dex */
public final class x {
    public static final a c = new a(null);
    private static final x d = new x(0, 0);
    private final int a;
    private final int b;

    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    public x(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i < 0) {
            throw new IllegalArgumentException("Width must be a positive number.");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Height must be a positive number.");
        }
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.a == xVar.a && this.b == xVar.b;
    }

    public int hashCode() {
        return (this.a * 31) + this.b;
    }

    public String toString() {
        return "Resolution(" + this.a + "x" + this.b + ")";
    }
}
