/*
 * Decompiled with CFR 0.152.
 */
package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.Keep;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecoder;
import java.io.InputStream;

public class SkiaImageDecoder
implements ImageDecoder {
    private static final String ASSET_PREFIX = "file:///android_asset/";
    private static final String FILE_PREFIX = "file://";
    private static final String RESOURCE_PREFIX = "android.resource://";
    private final Bitmap.Config bitmapConfig;

    @Keep
    public SkiaImageDecoder() {
        this(null);
    }

    public SkiaImageDecoder(Bitmap.Config config) {
        Bitmap.Config config2 = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (config != null) {
            this.bitmapConfig = config;
            return;
        }
        if (config2 != null) {
            this.bitmapConfig = config2;
            return;
        }
        this.bitmapConfig = Bitmap.Config.RGB_565;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Bitmap decode(Context context, SubsamplingScaleImageView.DecodeInputStreamFactory object) throws Exception {
        RuntimeException var1_4;
        block8: {
            block9: {
                context = new BitmapFactory.Options();
                context.inPreferredConfig = this.bitmapConfig;
                Object var3_8 = null;
                try {
                    object = object.createInputStream();
                }
                catch (Throwable throwable) {
                    object = var3_8;
                    break block8;
                }
                try {
                    context = BitmapFactory.decodeStream((InputStream)object, null, (BitmapFactory.Options)context);
                    if (object == null) break block9;
                }
                catch (Throwable throwable) {
                    break block8;
                }
                try {
                    ((InputStream)object).close();
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (context == null) throw new RuntimeException("Skia image region decoder returned null bitmap - image format may not be supported");
            return context;
        }
        if (object == null) throw var1_4;
        try {
            ((InputStream)object).close();
            throw var1_4;
        }
        catch (Exception exception) {
            throw var1_4;
        }
    }
}

