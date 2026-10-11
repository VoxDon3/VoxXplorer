/*
 * Decompiled with CFR 0.152.
 */
package ax.X3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import ax.M3.c;
import ax.M3.j;
import ax.M3.l;
import ax.P3.s;
import ax.Q3.d;
import ax.X3.e;
import java.io.File;

public class b
implements l<BitmapDrawable> {
    private final d a;
    private final l<Bitmap> b;

    public b(d d8, l<Bitmap> l8) {
        this.a = d8;
        this.b = l8;
    }

    @Override
    public c b(j j8) {
        return this.b.b(j8);
    }

    public boolean c(s<BitmapDrawable> s8, File file, j j8) {
        return this.b.a((Bitmap)new e(s8.get().getBitmap(), this.a), file, j8);
    }
}

