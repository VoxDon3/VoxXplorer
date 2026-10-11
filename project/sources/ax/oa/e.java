package ax.oa;

/* loaded from: classes3.dex */
public enum e implements ax.Y8.c<e> {
    FIRST_FRAGMENT(1),
    LAST_FRAGMENT(2),
    PENDING_CANCEL(4),
    CONCURRENT_MULTIPLEXING(16),
    DID_NOT_EXECUTE(32),
    MAYBE(64),
    OBJECT_UUID(128);

    private final int q;

    e(int i) {
        this.q = i;
    }

    @Override // ax.Y8.c
    public long getValue() {
        return this.q;
    }
}
