/*
 * Decompiled with CFR 0.152.
 */
package ax.C3;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import android.view.accessibility.AccessibilityManager;

public class e {
    public static void a(View view, AccessibilityManager accessibilityManager, CharSequence charSequence) {
        view.announceForAccessibility(charSequence);
    }

    public static Paint b(int n8) {
        int n9 = n8 * 2;
        Bitmap bitmap = Bitmap.createBitmap((int)n9, (int)n9, (Bitmap.Config)Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint();
        paint.setColor(-12961222);
        Paint paint2 = new Paint();
        paint2.setColor(-10855846);
        float f8 = n8;
        canvas.drawRect(0.0f, 0.0f, f8, f8, paint);
        float f9 = n9;
        canvas.drawRect(f8, f8, f9, f9, paint);
        canvas.drawRect(f8, 0.0f, f9, f8, paint2);
        canvas.drawRect(0.0f, f8, f8, f9, paint2);
        canvas = Shader.TileMode.REPEAT;
        canvas = new BitmapShader(bitmap, (Shader.TileMode)canvas, (Shader.TileMode)canvas);
        bitmap = new Paint();
        bitmap.setShader((Shader)canvas);
        return bitmap;
    }

    public static boolean c(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }
}

