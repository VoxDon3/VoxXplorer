package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import androidx.annotation.Keep;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class SkiaImageRegionDecoder implements ImageRegionDecoder {
    private static final String ASSET_PREFIX = "file:///android_asset/";
    private static final String FILE_PREFIX = "file://";
    private static final String RESOURCE_PREFIX = "android.resource://";
    private final Bitmap.Config bitmapConfig;
    private BitmapRegionDecoder decoder;
    private final ReadWriteLock decoderLock;
    private SubsamplingScaleImageView.DecodeInputStreamFactory inputStreamFactory;

    @Keep
    public SkiaImageRegionDecoder() {
        this(null);
    }

    private Lock getDecodeLock() {
        return this.decoderLock.readLock();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
    
        if (r4 != null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[Catch: all -> 0x0029, TRY_ENTER, TryCatch #5 {all -> 0x0029, blocks: (B:3:0x0007, B:5:0x000b, B:7:0x0011, B:9:0x0022, B:14:0x006f, B:15:0x0076, B:17:0x002d, B:26:0x003c, B:37:0x004c, B:35:0x004f, B:44:0x0055, B:46:0x005d, B:48:0x0077, B:49:0x007e), top: B:2:0x0007 }] */
    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap decodeRegion(android.graphics.Rect r3, int r4, boolean r5) {
        /*
            r2 = this;
            java.util.concurrent.locks.Lock r0 = r2.getDecodeLock()
            r0.lock()
            android.graphics.BitmapRegionDecoder r0 = r2.decoder     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L77
            boolean r0 = r0.isRecycled()     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L77
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L29
            r0.<init>()     // Catch: java.lang.Throwable -> L29
            r0.inSampleSize = r4     // Catch: java.lang.Throwable -> L29
            android.graphics.Bitmap$Config r4 = r2.bitmapConfig     // Catch: java.lang.Throwable -> L29
            r0.inPreferredConfig = r4     // Catch: java.lang.Throwable -> L29
            boolean r4 = com.davemorrissey.labs.subscaleview.decoder.DecoderUtils.hasWebViewBitmapColorProblem()     // Catch: java.lang.Throwable -> L29
            if (r4 != 0) goto L2b
            android.graphics.BitmapRegionDecoder r4 = r2.decoder     // Catch: java.lang.Throwable -> L29
            android.graphics.Bitmap r3 = r4.decodeRegion(r3, r0)     // Catch: java.lang.Throwable -> L29
            goto L65
        L29:
            r3 = move-exception
            goto L7f
        L2b:
            if (r5 == 0) goto L55
            com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$DecodeInputStreamFactory r4 = r2.inputStreamFactory     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L55
            r3 = 0
            java.io.InputStream r4 = r4.createInputStream()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L50
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r4, r3, r0)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L44
            if (r4 == 0) goto L65
        L3c:
            r4.close()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L40
            goto L65
        L40:
            goto L65
        L42:
            r3 = move-exception
            goto L4a
        L44:
            goto L52
        L46:
            r4 = move-exception
            r1 = r4
            r4 = r3
            r3 = r1
        L4a:
            if (r4 == 0) goto L4f
            r4.close()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L4f
        L4f:
            throw r3     // Catch: java.lang.Throwable -> L29
        L50:
            r4 = r3
        L52:
            if (r4 == 0) goto L65
            goto L3c
        L55:
            android.graphics.BitmapRegionDecoder r4 = r2.decoder     // Catch: java.lang.Throwable -> L29
            android.graphics.Bitmap r3 = r4.decodeRegion(r3, r0)     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L65
            android.graphics.Bitmap r4 = com.davemorrissey.labs.subscaleview.decoder.DecoderUtils.copyBitmap(r3)     // Catch: java.lang.Throwable -> L29
            r3.recycle()     // Catch: java.lang.Throwable -> L29
            r3 = r4
        L65:
            if (r3 == 0) goto L6f
            java.util.concurrent.locks.Lock r4 = r2.getDecodeLock()
            r4.unlock()
            return r3
        L6f:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = "Skia image decoder returned null bitmap - image format may not be supported"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L29
            throw r3     // Catch: java.lang.Throwable -> L29
        L77:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = "Cannot decode region after decoder has been recycled"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L29
            throw r3     // Catch: java.lang.Throwable -> L29
        L7f:
            java.util.concurrent.locks.Lock r4 = r2.getDecodeLock()
            r4.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.davemorrissey.labs.subscaleview.decoder.SkiaImageRegionDecoder.decodeRegion(android.graphics.Rect, int, boolean):android.graphics.Bitmap");
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public Point init(Context context, SubsamplingScaleImageView.DecodeInputStreamFactory decodeInputStreamFactory) throws Exception {
        InputStream inputStream;
        this.inputStreamFactory = decodeInputStreamFactory;
        try {
            inputStream = decodeInputStreamFactory.createInputStream();
            try {
                this.decoder = BitmapRegionDecoder.newInstance(inputStream, false);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused) {
                    }
                }
                return new Point(this.decoder.getWidth(), this.decoder.getHeight());
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public synchronized boolean isReady() {
        boolean z;
        BitmapRegionDecoder bitmapRegionDecoder = this.decoder;
        if (bitmapRegionDecoder != null) {
            z = bitmapRegionDecoder.isRecycled() ? false : true;
        }
        return z;
    }

    @Override // com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder
    public synchronized void recycle() {
        this.decoderLock.writeLock().lock();
        try {
            this.decoder.recycle();
            this.decoder = null;
        } finally {
            this.decoderLock.writeLock().unlock();
        }
    }

    public SkiaImageRegionDecoder(Bitmap.Config config) {
        this.decoderLock = new ReentrantReadWriteLock(true);
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.getPreferredBitmapConfig();
        if (config != null) {
            this.bitmapConfig = config;
        } else if (preferredBitmapConfig != null) {
            this.bitmapConfig = preferredBitmapConfig;
        } else {
            this.bitmapConfig = Bitmap.Config.RGB_565;
        }
    }
}
