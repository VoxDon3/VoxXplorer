package ax.s3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ax.X2.Q;
import ax.o.C2653a;
import java.util.HashMap;

/* renamed from: ax.s3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3045a {
    private static HashMap<Integer, C0446a> a = new HashMap<>();

    /* renamed from: ax.s3.a$a, reason: collision with other inner class name */
    static class C0446a {
        int a;
        Bitmap b;

        C0446a(int i, Bitmap bitmap) {
            this.a = i;
            this.b = bitmap;
        }
    }

    public static Bitmap a(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        createBitmap.setDensity(bitmap.getDensity());
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return createBitmap;
    }

    public static Bitmap b() {
        Bitmap createBitmap = Bitmap.createBitmap(64, 64, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(-16777216);
        return createBitmap;
    }

    public static Drawable c(Context context, int i) {
        Bitmap bitmap;
        Drawable b = C2653a.b(context, i);
        if (!Q.K() || !(b instanceof BitmapDrawable)) {
            return b;
        }
        Bitmap bitmap2 = ((BitmapDrawable) b).getBitmap();
        if (bitmap2 == null || bitmap2.getConfig() != Bitmap.Config.ARGB_8888) {
            return b;
        }
        C0446a c0446a = a.get(Integer.valueOf(i));
        if (c0446a != null && c0446a.a != bitmap2.getDensity()) {
            c0446a = null;
        }
        if (c0446a != null) {
            bitmap = c0446a.b;
        } else {
            Bitmap a2 = a(bitmap2);
            a.put(Integer.valueOf(i), new C0446a(a2.getDensity(), a2));
            bitmap = a2;
        }
        return new BitmapDrawable(context.getResources(), bitmap);
    }
}
