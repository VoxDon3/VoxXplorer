package ax.Gb;

/* loaded from: classes3.dex */
public class i extends c implements h, ax.Mb.d {
    private final int i0;
    private final int j0;

    public i(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.i0 = i;
        this.j0 = i2 >> 1;
    }

    @Override // ax.Gb.c
    protected ax.Mb.a b() {
        return w.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return e().equals(iVar.e()) && k().equals(iVar.k()) && this.j0 == iVar.j0 && this.i0 == iVar.i0 && l.a(d(), iVar.d()) && l.a(f(), iVar.f());
        }
        if (obj instanceof ax.Mb.d) {
            return obj.equals(a());
        }
        return false;
    }

    @Override // ax.Gb.h
    public int getArity() {
        return this.i0;
    }

    public int hashCode() {
        return (((f() == null ? 0 : f().hashCode() * 31) + e().hashCode()) * 31) + k().hashCode();
    }

    public String toString() {
        ax.Mb.a a = a();
        if (a != this) {
            return a.toString();
        }
        if ("<init>".equals(e())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + e() + " (Kotlin reflection is not available)";
    }
}
