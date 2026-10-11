/*
 * Decompiled with CFR 0.152.
 */
package ax.s3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ax.X2.Q;
import java.util.HashMap;

public class a {
    private static HashMap<Integer, a> a = new HashMap();

    public static Bitmap a(Bitmap bitmap) {
        Bitmap bitmap2 = Bitmap.createBitmap((int)bitmap.getWidth(), (int)bitmap.getHeight(), (Bitmap.Config)bitmap.getConfig());
        bitmap2.setDensity(bitmap.getDensity());
        new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, null);
        return bitmap2;
    }

    public static Bitmap b() {
        Bitmap bitmap = Bitmap.createBitmap((int)64, (int)64, (Bitmap.Config)Bitmap.Config.ARGB_8888);
        bitmap.eraseColor(-16777216);
        return bitmap;
    }

    public static Drawable c(Context context, int n8) {
        Drawable drawable;
        Object object = ax.o.a.b(context, n8);
        if (!Q.K()) {
            drawable = object;
        } else {
            drawable = object;
            if (object instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable)object).getBitmap();
                if (bitmap == null || bitmap.getConfig() != Bitmap.Config.ARGB_8888) {
                    return object;
                }
                drawable = object = a.get(n8);
                if (object != null) {
                    drawable = object;
                    if (object.a != bitmap.getDensity()) {
                        drawable = null;
                    }
                }
                if (drawable != null) {
                    drawable = drawable.b;
                } else {
                    drawable = ax.s3.a.a(bitmap);
                    a.put(n8, new a(drawable.getDensity(), (Bitmap)drawable));
                }
                drawable = new BitmapDrawable(context.getResources(), (Bitmap)drawable);
            }
        }
        return drawable;
    }

    static class a {
        int a;
        Bitmap b;

        a(int n8, Bitmap bitmap) {
            this.a = n8;
            this.b = bitmap;
        }
    }
}

