/*
 * Decompiled with CFR 0.152.
 */
package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import androidx.annotation.Keep;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.davemorrissey.labs.subscaleview.decoder.DecoderUtils;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SkiaImageRegionDecoder
implements ImageRegionDecoder {
    private static final String ASSET_PREFIX = "file:///android_asset/";
    private static final String FILE_PREFIX = "file://";
    private static final String RESOURCE_PREFIX = "android.resource://";
    private final Bitmap.Config bitmapConfig;
    private BitmapRegionDecoder decoder;
    private final ReadWriteLock decoderLock = new ReentrantReadWriteLock(true);
    private SubsamplingScaleImageView.DecodeInputStreamFactory inputStreamFactory;

    @Keep
    public SkiaImageRegionDecoder() {
        this(null);
    }

    public SkiaImageRegionDecoder(Bitmap.Config config) {
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

    private Lock getDecodeLock() {
        return this.decoderLock.readLock();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Bitmap decodeRegion(Rect var1_1, int var2_6, boolean var3_7) {
        block19: {
            block18: {
                this.getDecodeLock().lock();
                try {
                    var4_8 = this.decoder;
                    if (var4_8 == null || var4_8.isRecycled()) ** GOTO lbl67
                    var5_12 = new BitmapFactory.Options();
                    var5_12.inSampleSize = var2_6;
                    var5_12.inPreferredConfig = this.bitmapConfig;
                    if (!DecoderUtils.hasWebViewBitmapColorProblem()) {
                        var1_1 /* !! */  = this.decoder.decodeRegion(var1_1 /* !! */ , var5_12);
                        break block18;
                    }
                    if (var3_7 && (var4_8 = this.inputStreamFactory) != null) {
                        var1_1 /* !! */  = null;
                        var6_14 = null;
                    }
                    ** GOTO lbl56
                }
                catch (Throwable var1_2) {
                    break block19;
                }
                var4_8 = var4_8.createInputStream();
                {
                    block21: {
                        block22: {
                            block20: {
                                catch (Throwable var1_4) {
                                    var4_8 = null;
                                    break block20;
                                }
                                try {
                                    var5_12 = BitmapFactory.decodeStream((InputStream)var4_8, null, (BitmapFactory.Options)var5_12);
                                    var1_1 /* !! */  = var5_12;
                                    if (var4_8 == null) break block18;
                                    var1_1 /* !! */  = var5_12;
                                }
                                catch (Throwable var1_3) {
                                }
                                catch (IOException var5_13) {
                                    break block21;
                                }
lbl29:
                                // 2 sources

                                while (true) {
                                    try {
                                        var4_8.close();
                                    }
                                    catch (Exception var4_9) {}
                                    break block18;
                                    break;
                                }
                            }
                            if (var4_8 == null) throw var1_5;
                            try {}
                            catch (Exception var4_11) {
                                throw var1_5;
                            }
                            break block22;
                            catch (IOException var4_10) {
                                var4_8 = null;
                                break block21;
                            }
                        }
                        var4_8.close();
                        throw var1_5;
                    }
                    if (var4_8 != null) {
                        var1_1 /* !! */  = var6_14;
                        ** continue;
                    }
                    break block18;
lbl56:
                    // 1 sources

                    var4_8 = this.decoder.decodeRegion(var1_1 /* !! */ , var5_12);
                    var1_1 /* !! */  = var4_8;
                    if (var4_8 == null) break block18;
                    var1_1 /* !! */  = DecoderUtils.copyBitmap((Bitmap)var4_8);
                    var4_8.recycle();
                }
            }
            if (var1_1 /* !! */  == null) ** GOTO lbl-1000
            this.getDecodeLock().unlock();
            return var1_1 /* !! */ ;
lbl-1000:
            // 1 sources

            {
                var1_1 /* !! */  = new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
                throw var1_1 /* !! */ ;
lbl67:
                // 1 sources

                var1_1 /* !! */  = new IllegalStateException("Cannot decode region after decoder has been recycled");
                throw var1_1 /* !! */ ;
            }
        }
        this.getDecodeLock().unlock();
        throw var1_2;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Point init(Context context, SubsamplingScaleImageView.DecodeInputStreamFactory object) throws Exception {
        RuntimeException var1_4;
        block12: {
            block11: {
                this.inputStreamFactory = object;
                object = object.createInputStream();
                try {
                    this.decoder = BitmapRegionDecoder.newInstance((InputStream)object, (boolean)false);
                    if (object == null) break block11;
                }
                catch (Throwable throwable) {}
                try {
                    ((InputStream)object).close();
                }
                catch (Exception exception) {
                    return new Point(this.decoder.getWidth(), this.decoder.getHeight());
                }
            }
            return new Point(this.decoder.getWidth(), this.decoder.getHeight());
            break block12;
            catch (Throwable throwable) {
                object = null;
            }
        }
        if (object != null) {
            ((InputStream)object).close();
        }
        throw var1_4;
        catch (Exception exception) {
            throw var1_4;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean isReady() {
        synchronized (this) {
            try {
                BitmapRegionDecoder bitmapRegionDecoder = this.decoder;
                if (bitmapRegionDecoder == null) return false;
                boolean bl = bitmapRegionDecoder.isRecycled();
                if (bl) return false;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void recycle() {
        synchronized (this) {
            try {
                this.decoderLock.writeLock().lock();
            }
            catch (Throwable throwable) {}
            try {
                this.decoder.recycle();
                this.decoder = null;
            }
            catch (Throwable throwable) {
                this.decoderLock.writeLock().unlock();
                throw throwable;
            }
            this.decoderLock.writeLock().unlock();
            return;
            throw throwable;
        }
    }
}

