package ax.Cc;

import j$.util.Objects;

/* loaded from: classes3.dex */
public final class g {
    private final long a;
    private final long b;

    public g(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("offset must not be negative");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("numbytes must not be negative");
        }
        this.a = j;
        this.b = j2;
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (this.a == gVar.a && this.b == gVar.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b));
    }

    public String toString() {
        return "TarArchiveStructSparse{offset=" + this.a + ", numbytes=" + this.b + '}';
    }
}
