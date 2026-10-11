/*
 * Decompiled with CFR 0.152.
 */
package ax.q0;

import ax.Gb.l;
import ax.q0.a;
import ax.q0.d;
import java.util.Arrays;

public final class e {
    public static final d a() {
        return new a(null, true, 1, null);
    }

    public static final a b(d.b<?> ... bArray) {
        l.f(bArray, "pairs");
        a a8 = new a(null, false, 1, null);
        a8.g(Arrays.copyOf(bArray, bArray.length));
        return a8;
    }
}

