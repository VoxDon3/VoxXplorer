package ax.s6;

import android.graphics.Canvas;
import android.os.Build;

/* renamed from: ax.s6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3053a {
    public static int a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f, f2, f3, f4, i) : canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
