/*
 * Decompiled with CFR 0.152.
 */
package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

public interface ImageRegionDecoder {
    public Bitmap decodeRegion(Rect var1, int var2, boolean var3);

    public Point init(Context var1, SubsamplingScaleImageView.DecodeInputStreamFactory var2) throws Exception;

    public boolean isReady();

    public void recycle();
}

