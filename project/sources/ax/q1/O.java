package ax.q1;

/* loaded from: classes.dex */
public final class O {
    public static final O c = new O(0, 0);
    public final long a;
    public final long b;

    public O(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && O.class == obj.getClass()) {
            O o = (O) obj;
            if (this.a == o.a && this.b == o.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public String toString() {
        return "[timeUs=" + this.a + ", position=" + this.b + "]";
    }
}
