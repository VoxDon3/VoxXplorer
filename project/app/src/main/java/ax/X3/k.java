/*
 * Decompiled with CFR 0.152.
 */
package ax.X3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import ax.J3.c;
import ax.P3.p;
import ax.P3.s;
import ax.Q3.d;
import ax.k4.h;
import ax.k4.i;

public class k
implements s<BitmapDrawable>,
p {
    private final Resources c0;
    private final d d0;
    private final Bitmap q;

    k(Resources resources, d d8, Bitmap bitmap) {
        this.c0 = h.d(resources);
        this.d0 = h.d(d8);
        this.q = h.d(bitmap);
    }

    public static k d(Context context, Bitmap bitmap) {
        return k.e(context.getResources(), c.c(context).f(), bitmap);
    }

    public static k e(Resources resources, d d8, Bitmap bitmap) {
        return new k(resources, d8, bitmap);
    }

    @Override
    public void a() {
        this.q.prepareToDraw();
    }

    @Override
    public Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    public BitmapDrawable c() {
        return new BitmapDrawable(this.c0, this.q);
    }

    @Override
    public int getSize() {
        return i.g(this.q);
    }

    @Override
    public void recycle() {
        this.d0.c(this.q);
    }
}

