/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import ax.W5.A1;
import ax.W5.z1;
import java.util.Iterator;

final class B1 {
    private static final Iterator a = new z1();
    private static final Iterable b = new A1();

    static Iterable a() {
        return b;
    }

    static /* bridge */ /* synthetic */ Iterator b() {
        return a;
    }
}

