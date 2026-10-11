/*
 * Decompiled with CFR 0.152.
 */
package ax.Pb;

import ax.zb.a;
import ax.zb.b;
import java.util.concurrent.TimeUnit;

public final class d
extends Enum<d> {
    public static final /* enum */ d c0 = new d(TimeUnit.NANOSECONDS);
    public static final /* enum */ d d0 = new d(TimeUnit.MICROSECONDS);
    public static final /* enum */ d e0 = new d(TimeUnit.MILLISECONDS);
    public static final /* enum */ d f0 = new d(TimeUnit.SECONDS);
    public static final /* enum */ d g0 = new d(TimeUnit.MINUTES);
    public static final /* enum */ d h0 = new d(TimeUnit.HOURS);
    public static final /* enum */ d i0 = new d(TimeUnit.DAYS);
    private static final d[] j0;
    private static final a k0;
    private final TimeUnit q;

    static {
        Enum[] enumArray = d.d();
        j0 = enumArray;
        k0 = b.a((Enum[])enumArray);
    }

    private d(TimeUnit timeUnit) {
        this.q = timeUnit;
    }

    private static final /* synthetic */ d[] d() {
        return new d[]{c0, d0, e0, f0, g0, h0, i0};
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    public static d[] values() {
        return (d[])j0.clone();
    }

    public final TimeUnit h() {
        return this.q;
    }
}

