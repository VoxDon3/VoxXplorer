package ax.n4;

import java.io.Serializable;

/* loaded from: classes.dex */
public class e implements k, Cloneable, Serializable {
    private final String c0;
    private final String q;

    public e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.q = str;
        this.c0 = str2;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        e eVar = (e) obj;
        return (this.q.equals(eVar.q) && this.c0 == eVar.c0) || ((str = this.c0) != null && str.equals(eVar.c0));
    }

    @Override // ax.n4.k
    public String getName() {
        return this.q;
    }

    @Override // ax.n4.k
    public String getValue() {
        return this.c0;
    }

    public int hashCode() {
        return j.d(j.d(17, this.q), this.c0);
    }

    public String toString() {
        if (this.c0 == null) {
            return this.q;
        }
        StringBuilder sb = new StringBuilder(this.q.length() + 1 + this.c0.length());
        sb.append(this.q);
        sb.append("=");
        sb.append(this.c0);
        return sb.toString();
    }
}
