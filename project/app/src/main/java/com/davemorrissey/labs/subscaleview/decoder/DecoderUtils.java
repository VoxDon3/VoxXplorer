/*
 * Decompiled with CFR 0.152.
 */
package com.davemorrissey.labs.subscaleview.decoder;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;

public class DecoderUtils {
    public static Bitmap copyBitmap(Bitmap bitmap) {
        Bitmap bitmap2 = Bitmap.createBitmap((int)bitmap.getWidth(), (int)bitmap.getHeight(), (Bitmap.Config)bitmap.getConfig());
        bitmap2.setDensity(bitmap.getDensity());
        new Canvas(bitmap2).drawBitmap(bitmap, 0.0f, 0.0f, null);
        return bitmap2;
    }

    public static boolean hasWebViewBitmapColorProblem() {
        return Build.VERSION.SDK_INT == 28;
    }
}

