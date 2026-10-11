package ax.a2;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;

/* renamed from: ax.a2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1317a {
    public static final C1317a g = new C1317a(-1, -16777216, 0, 0, -1, null);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Typeface f;

    public C1317a(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = typeface;
    }

    public static C1317a a(CaptioningManager.CaptionStyle captionStyle) {
        return new C1317a(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : g.a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : g.b, captionStyle.hasWindowColor() ? captionStyle.windowColor : g.c, captionStyle.hasEdgeType() ? captionStyle.edgeType : g.d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : g.e, captionStyle.getTypeface());
    }
}
