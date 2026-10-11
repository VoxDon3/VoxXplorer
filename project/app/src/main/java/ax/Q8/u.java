/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Y8.c;
import java.util.EnumSet;
import java.util.Set;

public final class u
extends Enum<u>
implements c<u> {
    public static final /* enum */ u c0 = new u(1L);
    public static final /* enum */ u d0 = new u(2L);
    public static final /* enum */ u e0 = new u(4L);
    public static final Set<u> f0;
    private static final u[] g0;
    private long q;

    static {
        g0 = u.d();
        f0 = java.util.DesugarCollections.unmodifiableSet(EnumSet.allOf(u.class));
    }

    private u(long l8) {
        this.q = l8;
    }

    private static /* synthetic */ u[] d() {
        return new u[]{c0, d0, e0};
    }

    public static u valueOf(String string) {
        return Enum.valueOf(u.class, string);
    }

    public static u[] values() {
        return (u[])g0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }
}

