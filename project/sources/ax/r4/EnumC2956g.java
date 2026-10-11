package ax.r4;

import ax.zb.C3564b;
import ax.zb.InterfaceC3563a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ax.r4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2956g {
    public static final EnumC2956g c0 = new EnumC2956g("OAUTH2", 0, "oauth2:");
    public static final EnumC2956g d0 = new EnumC2956g("OAUTH2CODE", 1, "oauth2code:");
    private static final /* synthetic */ EnumC2956g[] e0;
    private static final /* synthetic */ InterfaceC3563a f0;
    private final String q;

    static {
        EnumC2956g[] d = d();
        e0 = d;
        f0 = C3564b.a(d);
    }

    private EnumC2956g(String str, int i, String str2) {
        this.q = str2;
    }

    private static final /* synthetic */ EnumC2956g[] d() {
        return new EnumC2956g[]{c0, d0};
    }

    public static EnumC2956g valueOf(String str) {
        return (EnumC2956g) Enum.valueOf(EnumC2956g.class, str);
    }

    public static EnumC2956g[] values() {
        return (EnumC2956g[]) e0.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.q;
    }
}
