/*
 * Decompiled with CFR 0.152.
 */
package ax.Q8;

import ax.Y8.c;

public final class E
extends Enum<E>
implements c<E> {
    public static final /* enum */ E d0 = new E(1L, "SHA-512");
    private static final E[] e0 = E.d();
    private String c0;
    private long q;

    private E(long l8, String string2) {
        this.q = l8;
        this.c0 = string2;
    }

    private static /* synthetic */ E[] d() {
        return new E[]{d0};
    }

    public static E valueOf(String string) {
        return Enum.valueOf(E.class, string);
    }

    public static E[] values() {
        return (E[])e0.clone();
    }

    @Override
    public long getValue() {
        return this.q;
    }

    public String h() {
        return this.c0;
    }
}

