package ax.C8;

/* loaded from: classes3.dex */
public enum d {
    UNIVERSAL(0),
    APPLICATION(64),
    CONTEXT_SPECIFIC(128),
    PRIVATE(192);

    private int q;

    d(int i) {
        this.q = i;
    }

    public static d h(byte b) {
        int i = b & 192;
        for (d dVar : values()) {
            if (dVar.q == i) {
                return dVar;
            }
        }
        throw new IllegalStateException("Could not parse ASN.1 Tag Class (should be impossible)");
    }

    public int d() {
        return this.q;
    }
}
