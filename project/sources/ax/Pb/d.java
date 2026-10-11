package ax.Pb;

import ax.zb.C3564b;
import ax.zb.InterfaceC3563a;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    public static final d c0 = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    public static final d d0 = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    public static final d e0 = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    public static final d f0 = new d("SECONDS", 3, TimeUnit.SECONDS);
    public static final d g0 = new d("MINUTES", 4, TimeUnit.MINUTES);
    public static final d h0 = new d("HOURS", 5, TimeUnit.HOURS);
    public static final d i0 = new d("DAYS", 6, TimeUnit.DAYS);
    private static final /* synthetic */ d[] j0;
    private static final /* synthetic */ InterfaceC3563a k0;
    private final TimeUnit q;

    static {
        d[] d = d();
        j0 = d;
        k0 = C3564b.a(d);
    }

    private d(String str, int i, TimeUnit timeUnit) {
        this.q = timeUnit;
    }

    private static final /* synthetic */ d[] d() {
        return new d[]{c0, d0, e0, f0, g0, h0, i0};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) j0.clone();
    }

    public final TimeUnit h() {
        return this.q;
    }
}
