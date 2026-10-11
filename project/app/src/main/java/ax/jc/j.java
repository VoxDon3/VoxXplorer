/*
 * Decompiled with CFR 0.152.
 */
package ax.jc;

public final class j
extends Enum<j> {
    public static final /* enum */ j c0;
    private static final j[] d0;
    public static final /* enum */ j q;

    static {
        j j8;
        j j9;
        q = j9 = new j();
        c0 = j8 = new j();
        d0 = new j[]{j9, j8};
    }

    public static j valueOf(String string) {
        return Enum.valueOf(j.class, string);
    }

    public static j[] values() {
        return (j[])d0.clone();
    }
}

