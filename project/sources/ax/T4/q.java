package ax.T4;

/* loaded from: classes.dex */
public enum q implements ax.b5.g {
    DUPLICATE_PROPERTIES(false),
    SCALARS_AS_OBJECTS(false),
    UNTYPED_SCALARS(false),
    EXACT_FLOATS(false);

    private final int c0 = 1 << ordinal();
    private final boolean q;

    q(boolean z) {
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
