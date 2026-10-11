package ax.Da;

/* loaded from: classes3.dex */
public enum a {
    CANCEL(-1),
    PAYMENT_PENDING(0),
    PAYMENT_COMPLETE(1),
    FREE(2);

    public final int q;

    a(int i) {
        this.q = i;
    }

    public static a h(int i) throws ax.Ea.b {
        for (a aVar : values()) {
            if (aVar.q == i) {
                return aVar;
            }
        }
        throw new ax.Ea.b("Unrecognized LicenseState code: " + i);
    }
}
