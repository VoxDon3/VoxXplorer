package androidx.profileinstaller;

/* loaded from: classes.dex */
enum e {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long q;

    e(long j) {
        this.q = j;
    }

    public long h() {
        return this.q;
    }
}
