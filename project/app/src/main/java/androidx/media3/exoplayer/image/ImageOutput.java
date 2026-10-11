/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;

public interface ImageOutput {
    public static final ImageOutput a = new ImageOutput(){

        @Override
        public void a() {
        }

        @Override
        public void onImageAvailable(long l8, Bitmap bitmap) {
        }
    };

    public void a();

    public void onImageAvailable(long var1, Bitmap var3);
}

