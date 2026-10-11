/*
 * Decompiled with CFR 0.152.
 */
package ax.c4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import ax.P3.s;
import ax.X3.k;
import ax.c4.d;
import ax.k4.h;

public class b
implements d<Bitmap, BitmapDrawable> {
    private final Resources a;
    private final ax.Q3.d b;

    public b(Resources resources, ax.Q3.d d8) {
        this.a = h.d(resources);
        this.b = h.d(d8);
    }

    @Override
    public s<BitmapDrawable> a(s<Bitmap> s8) {
        return k.e(this.a, this.b, s8.get());
    }
}

