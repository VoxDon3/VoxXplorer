package ax.Yd;

/* loaded from: classes3.dex */
public enum b {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");

    private final String c0;
    private final int q;

    b(int i, String str) {
        this.q = i;
        this.c0 = str;
    }

    public int h() {
        return this.q;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.c0;
    }
}
