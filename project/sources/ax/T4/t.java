package ax.T4;

/* loaded from: classes.dex */
public enum t implements ax.b5.g {
    CAN_WRITE_BINARY_NATIVELY(false),
    CAN_WRITE_FORMATTED_NUMBERS(false);

    private final int c0 = 1 << ordinal();
    private final boolean q;

    t(boolean z) {
        this.q = z;
    }

    @Override // ax.b5.g
    public boolean d() {
        return this.q;
    }

    @Override // ax.b5.g
    public int h() {
        return this.c0;
    }
}
