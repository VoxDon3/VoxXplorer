package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public interface ImageOutput {
    public static final ImageOutput a = new a();

    class a implements ImageOutput {
        a() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void a() {
        }

        @Override // androidx.media3.exoplayer.image.ImageOutput
        public void onImageAvailable(long j, Bitmap bitmap) {
        }
    }

    void a();

    void onImageAvailable(long j, Bitmap bitmap);
}
