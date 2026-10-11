package ax.n9;

/* renamed from: ax.n9.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC2627d implements InterfaceC2625b {
    private long a;

    public AbstractC2627d(long j) {
        this.a = j;
    }

    public long a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((AbstractC2627d) obj).a;
    }

    public int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }
}
