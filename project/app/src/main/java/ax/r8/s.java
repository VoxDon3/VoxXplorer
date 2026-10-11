/*
 * Decompiled with CFR 0.152.
 */
package ax.r8;

public abstract class s
extends Enum<s> {
    public static final /* enum */ s c0;
    private static final s[] d0;
    public static final /* enum */ s q;

    static {
        s s8;
        s s9;
        q = s9 = new s(){};
        c0 = s8 = new s(){};
        d0 = new s[]{s9, s8};
    }

    public static s valueOf(String string) {
        return Enum.valueOf(s.class, string);
    }

    public static s[] values() {
        return (s[])d0.clone();
    }
}

