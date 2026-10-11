/*
 * Decompiled with CFR 0.152.
 */
package ax.l1;

import ax.P0.P;
import ax.j1.d;
import ax.j1.e;
import ax.l1.c;
import java.util.List;

public final class E
extends c {
    private final int i;
    private final Object j;

    public E(P p8, int n8, int n9) {
        this(p8, n8, n9, 0, null);
    }

    public E(P p8, int n8, int n9, int n10, Object object) {
        super(p8, new int[]{n8}, n9);
        this.i = n10;
        this.j = object;
    }

    @Override
    public void c(long l8, long l9, long l10, List<? extends d> list, e[] eArray) {
    }

    @Override
    public int d() {
        return 0;
    }

    @Override
    public int n() {
        return this.i;
    }

    @Override
    public Object q() {
        return this.j;
    }
}

