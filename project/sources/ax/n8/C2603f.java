package ax.n8;

/* renamed from: ax.n8.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2603f {
    private final EnumC2601d a;
    private final EnumC2601d b;
    private final double c;

    public C2603f() {
        this(null, null, 0.0d, 7, null);
    }

    public final EnumC2601d a() {
        return this.b;
    }

    public final EnumC2601d b() {
        return this.a;
    }

    public final double c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2603f)) {
            return false;
        }
        C2603f c2603f = (C2603f) obj;
        return this.a == c2603f.a && this.b == c2603f.b && Double.compare(this.c, c2603f.c) == 0;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + C2602e.a(this.c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }

    public C2603f(EnumC2601d enumC2601d, EnumC2601d enumC2601d2, double d) {
        ax.Gb.l.f(enumC2601d, "performance");
        ax.Gb.l.f(enumC2601d2, "crashlytics");
        this.a = enumC2601d;
        this.b = enumC2601d2;
        this.c = d;
    }

    public /* synthetic */ C2603f(EnumC2601d enumC2601d, EnumC2601d enumC2601d2, double d, int i, ax.Gb.g gVar) {
        this((i & 1) != 0 ? EnumC2601d.COLLECTION_SDK_NOT_INSTALLED : enumC2601d, (i & 2) != 0 ? EnumC2601d.COLLECTION_SDK_NOT_INSTALLED : enumC2601d2, (i & 4) != 0 ? 1.0d : d);
    }
}
