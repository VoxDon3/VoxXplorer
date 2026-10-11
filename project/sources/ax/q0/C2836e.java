package ax.q0;

import ax.Gb.l;
import ax.q0.AbstractC2835d;
import java.util.Arrays;

/* renamed from: ax.q0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2836e {
    public static final AbstractC2835d a() {
        return new C2832a(null, true, 1, null);
    }

    public static final C2832a b(AbstractC2835d.b<?>... bVarArr) {
        l.f(bVarArr, "pairs");
        C2832a c2832a = new C2832a(null, false, 1, null);
        c2832a.g((AbstractC2835d.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        return c2832a;
    }
}
