package ax.X3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import ax.P3.s;
import java.io.IOException;

/* loaded from: classes.dex */
public class a<DataType> implements ax.M3.k<DataType, BitmapDrawable> {
    private final ax.M3.k<DataType, Bitmap> a;
    private final Resources b;
    private final ax.Q3.d c;

    public a(Resources resources, ax.Q3.d dVar, ax.M3.k<DataType, Bitmap> kVar) {
        this.b = (Resources) ax.k4.h.d(resources);
        this.c = (ax.Q3.d) ax.k4.h.d(dVar);
        this.a = (ax.M3.k) ax.k4.h.d(kVar);
    }

    @Override // ax.M3.k
    public s<BitmapDrawable> a(DataType datatype, int i, int i2, ax.M3.j jVar) throws IOException {
        s<Bitmap> a = this.a.a(datatype, i, i2, jVar);
        if (a == null) {
            return null;
        }
        return k.e(this.b, this.c, a.get());
    }

    @Override // ax.M3.k
    public boolean b(DataType datatype, ax.M3.j jVar) throws IOException {
        return this.a.b(datatype, jVar);
    }
}
