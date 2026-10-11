package ax.xb;

import ax.zb.C3564b;
import ax.zb.InterfaceC3563a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ax.xb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3478a {
    private static final /* synthetic */ EnumC3478a[] e0;
    private static final /* synthetic */ InterfaceC3563a f0;
    public static final EnumC3478a q = new EnumC3478a("COROUTINE_SUSPENDED", 0);
    public static final EnumC3478a c0 = new EnumC3478a("UNDECIDED", 1);
    public static final EnumC3478a d0 = new EnumC3478a("RESUMED", 2);

    static {
        EnumC3478a[] d = d();
        e0 = d;
        f0 = C3564b.a(d);
    }

    private EnumC3478a(String str, int i) {
    }

    private static final /* synthetic */ EnumC3478a[] d() {
        return new EnumC3478a[]{q, c0, d0};
    }

    public static EnumC3478a valueOf(String str) {
        return (EnumC3478a) Enum.valueOf(EnumC3478a.class, str);
    }

    public static EnumC3478a[] values() {
        return (EnumC3478a[]) e0.clone();
    }
}
