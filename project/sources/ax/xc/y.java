package ax.xc;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class y {
    public static final y a = new y();
    private static final int b = 65536;
    private static final x c = new x(new byte[0], 0, 0, false, false);
    private static final int d;
    private static final AtomicReference<x>[] e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        d = highestOneBit;
        AtomicReference<x>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        e = atomicReferenceArr;
    }

    private y() {
    }

    private final AtomicReference<x> a() {
        return e[(int) (Thread.currentThread().getId() & (d - 1))];
    }

    public static final void b(x xVar) {
        AtomicReference<x> a2;
        x xVar2;
        x andSet;
        ax.Gb.l.f(xVar, "segment");
        if (xVar.f != null || xVar.g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (xVar.d || (andSet = (a2 = a.a()).getAndSet((xVar2 = c))) == xVar2) {
            return;
        }
        int i = andSet != null ? andSet.c : 0;
        if (i >= b) {
            a2.set(andSet);
            return;
        }
        xVar.f = andSet;
        xVar.b = 0;
        xVar.c = i + 8192;
        a2.set(xVar);
    }

    public static final x c() {
        AtomicReference<x> a2 = a.a();
        x xVar = c;
        x andSet = a2.getAndSet(xVar);
        if (andSet == xVar) {
            return new x();
        }
        if (andSet == null) {
            a2.set(null);
            return new x();
        }
        a2.set(andSet.f);
        andSet.f = null;
        andSet.c = 0;
        return andSet;
    }
}
