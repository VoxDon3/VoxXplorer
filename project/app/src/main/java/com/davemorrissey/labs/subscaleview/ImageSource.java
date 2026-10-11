/*
 * Decompiled with CFR 0.152.
 */
package com.davemorrissey.labs.subscaleview;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

public final class ImageSource {
    static final String ASSET_SCHEME = "file:///android_asset/";
    static final String FILE_SCHEME = "file:///";
    private final Bitmap bitmap;
    private boolean cached;
    private final SubsamplingScaleImageView.DecodeInputStreamFactory factory;
    private final Integer resource;
    private int sHeight;
    private Rect sRegion;
    private int sWidth;
    private boolean tile;

    private ImageSource(int n8) {
        this.bitmap = null;
        this.resource = n8;
        this.tile = true;
        this.factory = null;
    }

    private ImageSource(Bitmap bitmap, boolean bl) {
        this.bitmap = bitmap;
        this.resource = null;
        this.factory = null;
        this.tile = false;
        this.sWidth = bitmap.getWidth();
        this.sHeight = bitmap.getHeight();
        this.cached = bl;
    }

    private ImageSource(SubsamplingScaleImageView.DecodeInputStreamFactory decodeInputStreamFactory) {
        this.bitmap = null;
        this.resource = null;
        this.factory = decodeInputStreamFactory;
        this.tile = true;
    }

    public static ImageSource bitmap(Bitmap bitmap) {
        if (bitmap != null) {
            return new ImageSource(bitmap, false);
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    public static ImageSource cachedBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            return new ImageSource(bitmap, true);
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    public static ImageSource factory(SubsamplingScaleImageView.DecodeInputStreamFactory decodeInputStreamFactory) {
        if (decodeInputStreamFactory != null) {
            return new ImageSource(decodeInputStreamFactory);
        }
        throw new NullPointerException("Factory must not be null");
    }

    public static ImageSource resource(int n8) {
        return new ImageSource(n8);
    }

    private void setInvariants() {
        Rect rect = this.sRegion;
        if (rect != null) {
            this.tile = true;
            this.sWidth = rect.width();
            this.sHeight = this.sRegion.height();
        }
    }

    public ImageSource dimensions(int n8, int n9) {
        if (this.bitmap == null) {
            this.sWidth = n8;
            this.sHeight = n9;
        }
        this.setInvariants();
        return this;
    }

    protected final Bitmap getBitmap() {
        return this.bitmap;
    }

    protected final SubsamplingScaleImageView.DecodeInputStreamFactory getFactory() {
        return this.factory;
    }

    protected final Integer getResource() {
        return this.resource;
    }

    protected final int getSHeight() {
        return this.sHeight;
    }

    protected final Rect getSRegion() {
        return this.sRegion;
    }

    protected final int getSWidth() {
        return this.sWidth;
    }

    protected final boolean getTile() {
        return this.tile;
    }

    protected final boolean isCached() {
        return this.cached;
    }

    public ImageSource region(Rect rect) {
        this.sRegion = rect;
        this.setInvariants();
        return this;
    }

    public ImageSource tiling(boolean bl) {
        this.tile = bl;
        return this;
    }

    public ImageSource tilingDisabled() {
        return this.tiling(false);
    }

    public ImageSource tilingEnabled() {
        return this.tiling(true);
    }
}

