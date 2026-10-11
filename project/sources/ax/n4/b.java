package ax.n4;

/* loaded from: classes.dex */
public class b implements h, Cloneable {
    private final String c0;
    private final k[] d0;
    private final String q;

    public b(String str, String str2, k[] kVarArr) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        this.q = str;
        this.c0 = str2;
        if (kVarArr != null) {
            this.d0 = kVarArr;
        } else {
            this.d0 = new k[0];
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        b bVar = (b) obj;
        return this.q.equals(bVar.q) && j.a(this.c0, bVar.c0) && j.b(this.d0, bVar.d0);
    }

    @Override // ax.n4.h
    public String getName() {
        return this.q;
    }

    @Override // ax.n4.h
    public String getValue() {
        return this.c0;
    }

    public int hashCode() {
        int d = j.d(j.d(17, this.q), this.c0);
        int i = 0;
        while (true) {
            k[] kVarArr = this.d0;
            if (i >= kVarArr.length) {
                return d;
            }
            d = j.d(d, kVarArr[i]);
            i++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.q);
        if (this.c0 != null) {
            sb.append("=");
            sb.append(this.c0);
        }
        for (int i = 0; i < this.d0.length; i++) {
            sb.append("; ");
            sb.append(this.d0[i]);
        }
        return sb.toString();
    }
}
