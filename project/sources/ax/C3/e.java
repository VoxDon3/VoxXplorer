package ax.C3;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public class e {
    public static void a(View view, AccessibilityManager accessibilityManager, CharSequence charSequence) {
        view.announceForAccessibility(charSequence);
    }

    public static Paint b(int i) {
        int i2 = i * 2;
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(-12961222);
        Paint paint2 = new Paint();
        paint2.setColor(-10855846);
        float f = i;
        canvas.drawRect(0.0f, 0.0f, f, f, paint);
        float f2 = i2;
        canvas.drawRect(f, f, f2, f2, paint);
        canvas.drawRect(f, 0.0f, f2, f, paint2);
        canvas.drawRect(0.0f, f, f, f2, paint2);
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
        Paint paint3 = new Paint();
        paint3.setShader(bitmapShader);
        return paint3;
    }

    public static boolean c(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }
}
