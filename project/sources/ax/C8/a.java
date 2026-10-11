package ax.C8;

/* loaded from: classes3.dex */
public enum a {
    PRIMITIVE(0),
    CONSTRUCTED(32);

    private int q;

    a(int i) {
        this.q = i;
    }

    public static a h(byte b) {
        return (b & 32) == 0 ? PRIMITIVE : CONSTRUCTED;
    }

    public int d() {
        return this.q;
    }
}
