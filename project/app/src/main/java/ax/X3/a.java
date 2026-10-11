/*
 * Decompiled with CFR 0.152.
 */
package ax.X3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import ax.M3.j;
import ax.P3.s;
import ax.Q3.d;
import ax.X3.k;
import ax.k4.h;
import java.io.IOException;

public class a<DataType>
implements ax.M3.k<DataType, BitmapDrawable> {
    private final ax.M3.k<DataType, Bitmap> a;
    private final Resources b;
    private final d c;

    public a(Resources resources, d d8, ax.M3.k<DataType, Bitmap> k8) {
        this.b = h.d(resources);
        this.c = h.d(d8);
        this.a = h.d(k8);
    }

    @Override
    public s<BitmapDrawable> a(DataType object, int n8, int n9, j j8) throws IOException {
        if ((object = this.a.a(object, n8, n9, j8)) == null) {
            return null;
        }
        return k.e(this.b, this.c, (Bitmap)object.get());
    }

    @Override
    public boolean b(DataType DataType, j j8) throws IOException {
        return this.a.b(DataType, j8);
    }
}

