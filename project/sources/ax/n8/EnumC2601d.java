package ax.n8;

/* renamed from: ax.n8.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC2601d implements ax.W7.f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);

    private final int q;

    EnumC2601d(int i) {
        this.q = i;
    }

    @Override // ax.W7.f
    public int g() {
        return this.q;
    }
}
