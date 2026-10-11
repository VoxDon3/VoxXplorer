/*
 * Decompiled with CFR 0.152.
 */
package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

public interface ImageDecoder {
    public Bitmap decode(Context var1, SubsamplingScaleImageView.DecodeInputStreamFactory var2) throws Exception;
}

