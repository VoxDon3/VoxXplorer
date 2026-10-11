/*
 * Decompiled with CFR 0.152.
 */
package ax.X3;

import android.graphics.Bitmap;
import ax.P3.p;
import ax.P3.s;
import ax.Q3.d;
import ax.k4.h;
import ax.k4.i;

public class e
implements s<Bitmap>,
p {
    private final d c0;
    private final Bitmap q;

    public e(Bitmap bitmap, d d8) {
        this.q = h.e(bitmap, "Bitmap must not be null");
        this.c0 = h.e(d8, "BitmapPool must not be null");
    }

    public static e d(Bitmap bitmap, d d8) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, d8);
    }

    @Override
    public void a() {
        this.q.prepareToDraw();
    }

    @Override
    public Class<Bitmap> b() {
        return Bitmap.class;
    }

    public Bitmap c() {
        return this.q;
    }

    @Override
    public int getSize() {
        return i.g(this.q);
    }

    @Override
    public void recycle() {
        this.c0.c(this.q);
    }
}

