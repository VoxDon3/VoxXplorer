package ax.sb;

/* renamed from: ax.sb.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3074f implements Comparable<C3074f> {
    public static final a f0 = new a(null);
    public static final C3074f g0 = C3075g.a();
    private final int c0;
    private final int d0;
    private final int e0;
    private final int q;

    /* renamed from: ax.sb.f$a */
    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    public C3074f(int i, int i2, int i3) {
        this.q = i;
        this.c0 = i2;
        this.d0 = i3;
        this.e0 = h(i, i2, i3);
    }

    private final int h(int i, int i2, int i3) {
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(C3074f c3074f) {
        ax.Gb.l.f(c3074f, "other");
        return this.e0 - c3074f.e0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C3074f c3074f = obj instanceof C3074f ? (C3074f) obj : null;
        return c3074f != null && this.e0 == c3074f.e0;
    }

    public int hashCode() {
        return this.e0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.q);
        sb.append('.');
        sb.append(this.c0);
        sb.append('.');
        sb.append(this.d0);
        return sb.toString();
    }
}
