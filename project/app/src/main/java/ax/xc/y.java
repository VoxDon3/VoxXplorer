/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.l;
import ax.xc.x;
import java.util.concurrent.atomic.AtomicReference;

public final class y {
    public static final y a;
    private static final int b;
    private static final x c;
    private static final int d;
    private static final AtomicReference<x>[] e;

    static {
        int n8;
        a = new y();
        b = 65536;
        c = new x(new byte[0], 0, 0, false, false);
        d = n8 = Integer.highestOneBit(Runtime.getRuntime().availableProcessors() * 2 - 1);
        AtomicReference[] atomicReferenceArray = new AtomicReference[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            atomicReferenceArray[i8] = new AtomicReference();
        }
        e = atomicReferenceArray;
    }

    private y() {
    }

    private final AtomicReference<x> a() {
        int n8 = (int)(Thread.currentThread().getId() & (long)d - 1L);
        return e[n8];
    }

    public static final void b(x x8) {
        l.f(x8, "segment");
        if (x8.f == null && x8.g == null) {
            x x9;
            AtomicReference<x> atomicReference;
            x x10;
            if (x8.d || (x10 = (atomicReference = a.a()).getAndSet(x9 = c)) == x9) {
                return;
            }
            int n8 = x10 != null ? x10.c : 0;
            if (n8 >= b) {
                atomicReference.set(x10);
                return;
            }
            x8.f = x10;
            x8.b = 0;
            x8.c = n8 + 8192;
            atomicReference.set(x8);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final x c() {
        x x8;
        AtomicReference<x> atomicReference = a.a();
        x x9 = atomicReference.getAndSet(x8 = c);
        if (x9 == x8) {
            return new x();
        }
        if (x9 == null) {
            atomicReference.set(null);
            return new x();
        }
        atomicReference.set(x9.f);
        x9.f = null;
        x9.c = 0;
        return x9;
    }
}

