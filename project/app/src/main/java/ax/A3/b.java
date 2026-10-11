/*
 * Decompiled with CFR 0.152.
 */
package ax.A3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ax.C3.b;
import com.android.ex.photo.c;

public interface b {
    public void a();

    public void b(String var1);

    public static class a {
        public Point a;
        public Drawable b;
        public Bitmap c;
        public int d;
        public int e;
        public b.d f;
        public boolean g;
        public Throwable h;
        public c i;

        public Drawable a(Resources resources) {
            if (resources != null) {
                Drawable drawable = this.b;
                if (drawable != null) {
                    return drawable;
                }
                if (this.c == null) {
                    return null;
                }
                return new BitmapDrawable(resources, this.c);
            }
            throw new IllegalArgumentException("resources can not be null!");
        }
    }
}

