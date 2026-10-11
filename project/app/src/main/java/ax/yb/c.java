/*
 * Decompiled with CFR 0.152.
 */
package ax.yb;

import ax.wb.e;
import ax.wb.i;

public final class c
implements e<Object> {
    public static final c q = new c();

    private c() {
    }

    @Override
    public i b() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override
    public void f(Object object) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}

