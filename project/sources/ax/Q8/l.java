package ax.Q8;

/* loaded from: classes3.dex */
public enum l implements ax.Y8.c<l> {
    Anonymous(0),
    Identification(1),
    Impersonation(2),
    Delegate(3);

    private long q;

    l(long j) {
        this.q = j;
    }

    @Override // ax.Y8.c
    public long getValue() {
        return this.q;
    }
}
