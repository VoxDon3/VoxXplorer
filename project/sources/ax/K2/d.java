package ax.K2;

/* loaded from: classes.dex */
public final class d {
    private final String a;
    private final Long b;

    public d(String str, Long l) {
        ax.Gb.l.f(str, "key");
        this.a = str;
        this.b = l;
    }

    public final String a() {
        return this.a;
    }

    public final Long b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return ax.Gb.l.a(this.a, dVar.a) && ax.Gb.l.a(this.b, dVar.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String str, boolean z) {
        this(str, Long.valueOf(z ? 1L : 0L));
        ax.Gb.l.f(str, "key");
    }
}
