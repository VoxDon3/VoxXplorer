package ax.n8;

/* renamed from: ax.n8.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC2618u implements ax.W7.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);

    private final int q;

    EnumC2618u(int i) {
        this.q = i;
    }

    @Override // ax.W7.f
    public int g() {
        return this.q;
    }
}
