package ax.C8;

/* loaded from: classes3.dex */
public abstract class b<T> {
    protected c q;

    protected b(c cVar) {
        this.q = cVar;
    }

    public c e() {
        return this.q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.q != bVar.q) {
                return false;
            }
            if (g() != null) {
                return g().equals(bVar.g());
            }
            if (bVar.g() == null) {
                return true;
            }
        }
        return false;
    }

    public abstract T g();

    protected String h() {
        if (g() != null) {
            return g().toString();
        }
        return null;
    }

    public int hashCode() {
        return this.q.h();
    }

    public String toString() {
        return getClass().getSimpleName() + "[" + h() + "]";
    }
}
