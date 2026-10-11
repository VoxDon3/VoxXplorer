/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Y8.c;

public final class A
extends Enum<A>
implements c<A> {
    public static final /* enum */ A c0 = new A(0L);
    public static final /* enum */ A d0 = new A(1L);
    public static final /* enum */ A e0 = new A(2L);
    public static final /* enum */ A f0 = new A(3L);
    private static final A[] g0 = A.d();
    private long q;

    private A(long l8) {
        this.q = l8;
    }

    private static /* synthetic */ A[] d() {
        return new A[]{c0, d0, e0, f0};
    }

    public static A valueOf(String string) {
        return Enum.valueOf(A.class, string);
    }

    public static A[] values() {
        return (A[])g0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }
}

