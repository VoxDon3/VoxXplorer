/*
 * Decompiled with CFR 0.152.
 */
package ax.p4;

public final class z
extends Enum<z> {
    public static final /* enum */ z c0;
    public static final /* enum */ z d0;
    private static final z[] e0;
    private String q;

    static {
        z z8;
        z z9;
        c0 = z9 = new z("online");
        d0 = z8 = new z("offline");
        e0 = new z[]{z9, z8};
    }

    private z(String string2) {
        this.q = string2;
    }

    public static z valueOf(String string) {
        return Enum.valueOf(z.class, string);
    }

    public static z[] values() {
        return (z[])e0.clone();
    }

    public String toString() {
        return this.q;
    }
}

