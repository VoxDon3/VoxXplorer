/*
 * Decompiled with CFR 0.152.
 */
package ax.Q3;

import android.graphics.Bitmap;
import ax.Q3.d;

public class e
implements d {
    @Override
    public void a(int n8) {
    }

    @Override
    public void b() {
    }

    @Override
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override
    public Bitmap d(int n8, int n9, Bitmap.Config config) {
        return Bitmap.createBitmap((int)n8, (int)n9, (Bitmap.Config)config);
    }

    @Override
    public Bitmap e(int n8, int n9, Bitmap.Config config) {
        return this.d(n8, n9, config);
    }
}

