/*
 * Decompiled with CFR 0.152.
 */
package ax.a2;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

public final class a {
    public static final a g = new a(-1, -16777216, 0, 0, -1, null);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Typeface f;

    public a(int n8, int n9, int n10, int n11, int n12, Typeface typeface) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = n11;
        this.e = n12;
        this.f = typeface;
    }

    public static a a(CaptioningManager.CaptionStyle captionStyle) {
        int n8 = captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : ax.a2.a.g.a;
        int n9 = captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : ax.a2.a.g.b;
        int n10 = captionStyle.hasWindowColor() ? captionStyle.windowColor : ax.a2.a.g.c;
        int n11 = captionStyle.hasEdgeType() ? captionStyle.edgeType : ax.a2.a.g.d;
        int n12 = captionStyle.hasEdgeColor() ? captionStyle.edgeColor : ax.a2.a.g.e;
        return new a(n8, n9, n10, n11, n12, captionStyle.getTypeface());
    }
}

