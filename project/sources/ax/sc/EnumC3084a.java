package ax.sc;

/* renamed from: ax.sc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3084a {
    KEY_STRENGTH_128(1, 8, 16, 16),
    KEY_STRENGTH_192(2, 12, 24, 24),
    KEY_STRENGTH_256(3, 16, 32, 32);

    private int c0;
    private int d0;
    private int e0;
    private int q;

    EnumC3084a(int i, int i2, int i3, int i4) {
        this.q = i;
        this.c0 = i2;
        this.d0 = i3;
        this.e0 = i4;
    }

    public static EnumC3084a d(int i) {
        for (EnumC3084a enumC3084a : values()) {
            if (enumC3084a.l() == i) {
                return enumC3084a;
            }
        }
        return null;
    }

    public int h() {
        return this.e0;
    }

    public int j() {
        return this.d0;
    }

    public int l() {
        return this.q;
    }

    public int n() {
        return this.c0;
    }
}
