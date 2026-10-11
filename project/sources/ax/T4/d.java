package ax.T4;

/* loaded from: classes.dex */
public enum d {
    UTF8("UTF-8", false, 8),
    UTF16_BE("UTF-16BE", true, 16),
    UTF16_LE("UTF-16LE", false, 16),
    UTF32_BE("UTF-32BE", true, 32),
    UTF32_LE("UTF-32LE", false, 32);

    private final boolean c0;
    private final int d0;
    private final String q;

    d(String str, boolean z, int i) {
        this.q = str;
        this.c0 = z;
        this.d0 = i;
    }

    public int d() {
        return this.d0;
    }

    public String h() {
        return this.q;
    }

    public boolean j() {
        return this.c0;
    }
}
