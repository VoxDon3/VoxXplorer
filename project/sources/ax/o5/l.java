package ax.o5;

/* loaded from: classes.dex */
final class l extends v {
    private final long a;

    l(long j) {
        this.a = j;
    }

    @Override // ax.o5.v
    public long c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v) && this.a == ((v) obj).c();
    }

    public int hashCode() {
        long j = this.a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.a + "}";
    }
}
