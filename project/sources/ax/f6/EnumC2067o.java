package ax.f6;

/* renamed from: ax.f6.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC2067o {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");

    private final String q;

    EnumC2067o(String str) {
        this.q = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.q;
    }
}
