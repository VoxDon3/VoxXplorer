/*
 * Decompiled with CFR 0.152.
 */
package ax.p4;

public final class q
extends Enum<q> {
    public static final /* enum */ q c0;
    private static final q[] d0;
    public static final /* enum */ q q;

    static {
        q q8;
        q q9;
        q = q9 = new q();
        c0 = q8 = new q();
        d0 = new q[]{q9, q8};
    }

    public static q valueOf(String string) {
        return Enum.valueOf(q.class, string);
    }

    public static q[] values() {
        return (q[])d0.clone();
    }

    public String toString() {
        return this.name().toLowerCase();
    }
}

