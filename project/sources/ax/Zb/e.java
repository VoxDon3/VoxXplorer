package ax.Zb;

import ax.Vb.F;
import ax.Vb.I;

/* loaded from: classes3.dex */
public final class e {
    private static final int a;
    private static final F b;
    private static final F c;
    private static final F d;
    private static final F e;
    private static final int f;

    static {
        int e2;
        int e3;
        e2 = I.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        a = e2;
        b = new F("PERMIT");
        c = new F("TAKEN");
        d = new F("BROKEN");
        e = new F("CANCELLED");
        e3 = I.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f = e3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f h(long j, f fVar) {
        return new f(j, fVar, 0);
    }
}
