/*
 * Decompiled with CFR 0.152.
 */
package ax.ca;

import android.widget.ImageView;

public final class h
extends Enum<h> {
    public static final /* enum */ h c0;
    private static final h[] d0;
    public static final /* enum */ h q;

    static {
        q = new h();
        c0 = new h();
        d0 = h.d();
    }

    private static /* synthetic */ h[] d() {
        return new h[]{q, c0};
    }

    public static h h(ImageView imageView) {
        int n8 = a.a[imageView.getScaleType().ordinal()];
        if (n8 != 1 && n8 != 2 && n8 != 3 && n8 != 4 && n8 != 5) {
            return c0;
        }
        return q;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }

    public static h[] values() {
        return (h[])d0.clone();
    }
}

