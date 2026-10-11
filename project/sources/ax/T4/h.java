package ax.T4;

import java.io.Serializable;

/* loaded from: classes.dex */
public class h implements Serializable {
    public static final h h0 = new h(ax.W4.d.o(), -1, -1, -1, -1);
    protected final long c0;
    protected final int d0;
    protected final int e0;
    protected final ax.W4.d f0;
    protected transient String g0;
    protected final long q;

    public h(ax.W4.d dVar, long j, int i, int i2) {
        this(dVar, -1L, j, i, i2);
    }

    public StringBuilder a(StringBuilder sb) {
        if (this.f0.m()) {
            sb.append("line: ");
            int i = this.d0;
            if (i >= 0) {
                sb.append(i);
            } else {
                sb.append("UNKNOWN");
            }
            sb.append(", column: ");
            int i2 = this.e0;
            if (i2 >= 0) {
                sb.append(i2);
                return sb;
            }
            sb.append("UNKNOWN");
            return sb;
        }
        if (this.d0 > 0) {
            sb.append("line: ");
            sb.append(this.d0);
            if (this.e0 > 0) {
                sb.append(", column: ");
                sb.append(this.e0);
            }
            return sb;
        }
        sb.append("byte offset: #");
        long j = this.q;
        if (j >= 0) {
            sb.append(j);
            return sb;
        }
        sb.append("UNKNOWN");
        return sb;
    }

    public int b() {
        return this.e0;
    }

    public int c() {
        return this.d0;
    }

    @Deprecated
    public Object d() {
        return this.f0.l();
    }

    public String e() {
        if (this.g0 == null) {
            this.g0 = this.f0.h();
        }
        return this.g0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        ax.W4.d dVar = this.f0;
        if (dVar == null) {
            if (hVar.f0 != null) {
                return false;
            }
        } else if (!dVar.equals(hVar.f0)) {
            return false;
        }
        return this.d0 == hVar.d0 && this.e0 == hVar.e0 && this.c0 == hVar.c0 && this.q == hVar.q;
    }

    public int hashCode() {
        return ((((this.f0 == null ? 1 : 2) ^ this.d0) + this.e0) ^ ((int) this.c0)) + ((int) this.q);
    }

    public String toString() {
        String e = e();
        StringBuilder sb = new StringBuilder(e.length() + 40);
        sb.append("[Source: ");
        sb.append(e);
        sb.append("; ");
        StringBuilder a = a(sb);
        a.append(']');
        return a.toString();
    }

    public h(ax.W4.d dVar, long j, long j2, int i, int i2) {
        this.f0 = dVar == null ? ax.W4.d.o() : dVar;
        this.q = j;
        this.c0 = j2;
        this.d0 = i;
        this.e0 = i2;
    }
}
