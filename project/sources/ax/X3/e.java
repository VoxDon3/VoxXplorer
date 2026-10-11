package ax.X3;

import android.graphics.Bitmap;
import ax.P3.p;
import ax.P3.s;

/* loaded from: classes.dex */
public class e implements s<Bitmap>, p {
    private final ax.Q3.d c0;
    private final Bitmap q;

    public e(Bitmap bitmap, ax.Q3.d dVar) {
        this.q = (Bitmap) ax.k4.h.e(bitmap, "Bitmap must not be null");
        this.c0 = (ax.Q3.d) ax.k4.h.e(dVar, "BitmapPool must not be null");
    }

    public static e d(Bitmap bitmap, ax.Q3.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, dVar);
    }

    @Override // ax.P3.p
    public void a() {
        this.q.prepareToDraw();
    }

    @Override // ax.P3.s
    public Class<Bitmap> b() {
        return Bitmap.class;
    }

    @Override // ax.P3.s
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.q;
    }

    @Override // ax.P3.s
    public int getSize() {
        return ax.k4.i.g(this.q);
    }

    @Override // ax.P3.s
    public void recycle() {
        this.c0.c(this.q);
    }
}
