package ax.Zb;

import ax.Vb.F;

/* loaded from: classes3.dex */
public final class c {
    private static final F a = new F("NO_OWNER");
    private static final F b = new F("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z) {
        return new b(z);
    }

    public static /* synthetic */ a b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return a(z);
    }
}
