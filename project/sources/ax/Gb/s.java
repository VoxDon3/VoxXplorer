package ax.Gb;

/* loaded from: classes3.dex */
public abstract class s extends c implements ax.Mb.g {
    private final boolean i0;

    public s() {
        this.i0 = false;
    }

    @Override // ax.Gb.c
    public ax.Mb.a a() {
        return this.i0 ? this : super.a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return f().equals(sVar.f()) && e().equals(sVar.e()) && k().equals(sVar.k()) && l.a(d(), sVar.d());
        }
        if (obj instanceof ax.Mb.g) {
            return obj.equals(a());
        }
        return false;
    }

    public int hashCode() {
        return (((f().hashCode() * 31) + e().hashCode()) * 31) + k().hashCode();
    }

    protected ax.Mb.g l() {
        if (this.i0) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (ax.Mb.g) super.h();
    }

    public String toString() {
        ax.Mb.a a = a();
        if (a != this) {
            return a.toString();
        }
        return "property " + e() + " (Kotlin reflection is not available)";
    }

    public s(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.i0 = (i & 2) == 2;
    }
}
