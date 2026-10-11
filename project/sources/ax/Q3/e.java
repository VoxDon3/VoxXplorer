package ax.Q3;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class e implements d {
    @Override // ax.Q3.d
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // ax.Q3.d
    public Bitmap d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // ax.Q3.d
    public Bitmap e(int i, int i2, Bitmap.Config config) {
        return d(i, i2, config);
    }

    @Override // ax.Q3.d
    public void b() {
    }

    @Override // ax.Q3.d
    public void a(int i) {
    }
}
