/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

public final class V
extends Enum<V> {
    public static final /* enum */ V c0 = new V("text/*");
    public static final /* enum */ V d0 = new V("image/*");
    public static final /* enum */ V e0 = new V("audio/*");
    public static final /* enum */ V f0 = new V("video/*");
    public static final /* enum */ V g0 = new V("*/*");
    private static final V[] h0 = V.d();
    private final String q;

    private V(String string2) {
        this.q = string2;
    }

    private static /* synthetic */ V[] d() {
        return new V[]{c0, d0, e0, f0, g0};
    }

    public static boolean j(String string) {
        return string != null && string.endsWith("*");
    }

    public static V valueOf(String string) {
        return Enum.valueOf(V.class, string);
    }

    public static V[] values() {
        return (V[])h0.clone();
    }

    public String h() {
        return this.q;
    }
}

