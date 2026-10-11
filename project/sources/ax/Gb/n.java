package ax.Gb;

/* loaded from: classes3.dex */
public final class n implements d {
    private final Class<?> a;
    private final String b;

    public n(Class<?> cls, String str) {
        l.f(cls, "jClass");
        l.f(str, "moduleName");
        this.a = cls;
        this.b = str;
    }

    @Override // ax.Gb.d
    public Class<?> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof n) && l.a(b(), ((n) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b() + " (Kotlin reflection is not available)";
    }
}
