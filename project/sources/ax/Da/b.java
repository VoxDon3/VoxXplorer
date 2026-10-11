package ax.Da;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class b implements Serializable {
    public final String c0;
    public final c q;

    public b(c cVar, String str) {
        this.q = cVar;
        this.c0 = str;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!b.class.equals(obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        return this.q.equals(bVar.q) && this.c0.equals(bVar.c0);
    }

    public int hashCode() {
        return ((527 + this.q.hashCode()) * 31) + this.c0.hashCode();
    }

    public String toString() {
        return String.format("SkuId(type=%s id=%s)", this.q, this.c0);
    }
}
