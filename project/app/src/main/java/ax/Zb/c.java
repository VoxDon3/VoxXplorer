/*
 * Decompiled with CFR 0.152.
 */
package ax.Zb;

import ax.Vb.F;
import ax.Zb.a;
import ax.Zb.b;

public final class c {
    private static final F a = new F("NO_OWNER");
    private static final F b = new F("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean bl) {
        return new b(bl);
    }

    public static /* synthetic */ a b(boolean bl, int n8, Object object) {
        if ((n8 & 1) != 0) {
            bl = false;
        }
        return c.a(bl);
    }

    public static final /* synthetic */ F c() {
        return a;
    }
}

