package ax.J7;

/* renamed from: ax.J7.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC0779y {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);

    private final int q;

    EnumC0779y(int i) {
        this.q = i;
    }

    public static EnumC0779y h(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int j() {
        return this.q;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.q);
    }
}
