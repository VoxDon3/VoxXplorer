/*
 * Decompiled with CFR 0.152.
 */
package com.davemorrissey.labs.subscaleview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.ImageViewState;
import com.davemorrissey.labs.subscaleview.R;
import com.davemorrissey.labs.subscaleview.decoder.CompatDecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.DecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecoder;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.decoder.SkiaImageDecoder;
import com.davemorrissey.labs.subscaleview.decoder.SkiaImageRegionDecoder;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SubsamplingScaleImageView
extends View {
    public static final int EASE_IN_OUT_QUAD = 2;
    public static final int EASE_OUT_QUAD = 1;
    private static final int MESSAGE_LONG_CLICK = 1;
    public static final int ORIENTATION_0 = 0;
    public static final int ORIENTATION_180 = 180;
    public static final int ORIENTATION_270 = 270;
    public static final int ORIENTATION_90 = 90;
    public static final int ORIENTATION_USE_EXIF = -1;
    public static final int ORIGIN_ANIM = 1;
    public static final int ORIGIN_DOUBLE_TAP_ZOOM = 4;
    public static final int ORIGIN_FLING = 3;
    public static final int ORIGIN_TOUCH = 2;
    public static final int PAN_LIMIT_CENTER = 3;
    public static final int PAN_LIMIT_INSIDE = 1;
    public static final int PAN_LIMIT_OUTSIDE = 2;
    public static final int SCALE_TYPE_CENTER_CROP = 2;
    public static final int SCALE_TYPE_CENTER_INSIDE = 1;
    public static final int SCALE_TYPE_CUSTOM = 3;
    public static final int SCALE_TYPE_START = 4;
    private static final String TAG = "SubsamplingScaleImageView";
    public static final int TILE_SIZE_AUTO = Integer.MAX_VALUE;
    private static final List<Integer> VALID_EASING_STYLES;
    private static final List<Integer> VALID_ORIENTATIONS;
    private static final List<Integer> VALID_PAN_LIMITS;
    private static final List<Integer> VALID_SCALE_TYPES;
    private static final List<Integer> VALID_ZOOM_STYLES;
    public static final int ZOOM_FOCUS_CENTER = 2;
    public static final int ZOOM_FOCUS_CENTER_IMMEDIATE = 3;
    public static final int ZOOM_FOCUS_FIXED = 1;
    private static Bitmap.Config preferredBitmapConfig;
    private Anim anim;
    private Bitmap bitmap;
    private DecoderFactory<? extends ImageDecoder> bitmapDecoderFactory;
    private boolean bitmapIsCached;
    private boolean bitmapIsPreview;
    private Paint bitmapPaint;
    private boolean debug;
    private Paint debugLinePaint;
    private Paint debugTextPaint;
    private ImageRegionDecoder decoder;
    private final ReadWriteLock decoderLock;
    private final float density;
    private GestureDetector detector;
    private int doubleTapZoomDuration = 500;
    private float doubleTapZoomScale = 1.0f;
    private int doubleTapZoomStyle = 1;
    private final float[] dstArray;
    private boolean eagerLoadingEnabled = true;
    private Executor executor;
    private int fullImageSampleSize;
    private final Handler handler;
    private boolean imageLoadedSent;
    private DecodeInputStreamFactory inputStreamFactory;
    private boolean isPanning;
    private boolean isQuickScaling;
    private boolean isZooming;
    private Matrix matrix;
    private float maxScale = 2.0f;
    private int maxTileHeight;
    private int maxTileWidth;
    private int maxTouchCount;
    private float minScale = this.minScale();
    private int minimumScaleType = 1;
    private int minimumTileDpi = -1;
    private OnImageEventListener onImageEventListener;
    private View.OnLongClickListener onLongClickListener;
    private OnStateChangedListener onStateChangedListener;
    private int orientation = 0;
    private Rect pRegion;
    private boolean panEnabled = true;
    private int panLimit = 1;
    private Float pendingScale;
    private boolean quickScaleEnabled = true;
    private float quickScaleLastDistance;
    private boolean quickScaleMoved;
    private PointF quickScaleSCenter;
    private final float quickScaleThreshold;
    private PointF quickScaleVLastPoint;
    private PointF quickScaleVStart;
    private boolean readySent;
    private DecoderFactory<? extends ImageRegionDecoder> regionDecoderFactory;
    private int sHeight;
    private int sOrientation;
    private PointF sPendingCenter;
    private RectF sRect;
    private Rect sRegion;
    private PointF sRequestedCenter;
    private int sWidth;
    private ScaleAndTranslate satTemp;
    private float scale;
    private float scaleStart;
    private GestureDetector singleDetector;
    private final float[] srcArray;
    private Paint tileBgPaint;
    private Map<Integer, List<Tile>> tileMap;
    private PointF vCenterStart;
    private float vDistStart;
    private PointF vTranslate;
    private PointF vTranslateBefore;
    private PointF vTranslateStart;
    private boolean zoomEnabled = true;

    static {
        VALID_ORIENTATIONS = Arrays.asList(0, 90, 180, 270, -1);
        Integer n8 = 1;
        Integer n9 = 2;
        Integer n10 = 3;
        VALID_ZOOM_STYLES = Arrays.asList(n8, n9, n10);
        VALID_EASING_STYLES = Arrays.asList(n9, n8);
        VALID_PAN_LIMITS = Arrays.asList(n8, n9, n10);
        VALID_SCALE_TYPES = Arrays.asList(n9, n8, n10, 4);
    }

    public SubsamplingScaleImageView(Context context) {
        this(context, null);
    }

    public SubsamplingScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.maxTileWidth = Integer.MAX_VALUE;
        this.maxTileHeight = Integer.MAX_VALUE;
        this.executor = AsyncTask.THREAD_POOL_EXECUTOR;
        this.decoderLock = new ReentrantReadWriteLock(true);
        this.bitmapDecoderFactory = new CompatDecoderFactory<SkiaImageDecoder>(SkiaImageDecoder.class);
        this.regionDecoderFactory = new CompatDecoderFactory<SkiaImageRegionDecoder>(SkiaImageRegionDecoder.class);
        this.srcArray = new float[8];
        this.dstArray = new float[8];
        this.density = this.getResources().getDisplayMetrics().density;
        this.setMinimumDpi(160);
        this.setDoubleTapZoomDpi(160);
        this.setMinimumTileDpi(320);
        this.setGestureDetector(context);
        this.handler = new Handler(new Handler.Callback(this){
            final SubsamplingScaleImageView this$0;
            {
                this.this$0 = subsamplingScaleImageView;
            }

            public boolean handleMessage(Message object) {
                if (object.what == 1 && this.this$0.onLongClickListener != null) {
                    SubsamplingScaleImageView.access$102(this.this$0, 0);
                    object = this.this$0;
                    SubsamplingScaleImageView.super.setOnLongClickListener(((SubsamplingScaleImageView)((Object)object)).onLongClickListener);
                    this.this$0.performLongClick();
                    SubsamplingScaleImageView.super.setOnLongClickListener(null);
                }
                return true;
            }
        });
        if (attributeSet != null) {
            int n8;
            attributeSet = this.getContext().obtainStyledAttributes(attributeSet, R.styleable.SubsamplingScaleImageView);
            if (attributeSet.hasValue(n8 = R.styleable.SubsamplingScaleImageView_src) && (n8 = attributeSet.getResourceId(n8, 0)) > 0) {
                this.setImage(ImageSource.resource(n8).tilingEnabled());
            }
            if (attributeSet.hasValue(n8 = R.styleable.SubsamplingScaleImageView_panEnabled)) {
                this.setPanEnabled(attributeSet.getBoolean(n8, true));
            }
            if (attributeSet.hasValue(n8 = R.styleable.SubsamplingScaleImageView_zoomEnabled)) {
                this.setZoomEnabled(attributeSet.getBoolean(n8, true));
            }
            if (attributeSet.hasValue(n8 = R.styleable.SubsamplingScaleImageView_quickScaleEnabled)) {
                this.setQuickScaleEnabled(attributeSet.getBoolean(n8, true));
            }
            if (attributeSet.hasValue(n8 = R.styleable.SubsamplingScaleImageView_tileBackgroundColor)) {
                this.setTileBackgroundColor(attributeSet.getColor(n8, Color.argb((int)0, (int)0, (int)0, (int)0)));
            }
            attributeSet.recycle();
        }
        this.quickScaleThreshold = TypedValue.applyDimension((int)1, (float)20.0f, (DisplayMetrics)context.getResources().getDisplayMetrics());
    }

    static /* synthetic */ int access$102(SubsamplingScaleImageView subsamplingScaleImageView, int n8) {
        subsamplingScaleImageView.maxTouchCount = n8;
        return n8;
    }

    static /* synthetic */ PointF access$1702(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
        subsamplingScaleImageView.vCenterStart = pointF;
        return pointF;
    }

    static /* synthetic */ PointF access$1802(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
        subsamplingScaleImageView.vTranslateStart = pointF;
        return pointF;
    }

    static /* synthetic */ float access$1902(SubsamplingScaleImageView subsamplingScaleImageView, float f8) {
        subsamplingScaleImageView.scaleStart = f8;
        return f8;
    }

    static /* synthetic */ boolean access$2002(SubsamplingScaleImageView subsamplingScaleImageView, boolean bl) {
        subsamplingScaleImageView.isQuickScaling = bl;
        return bl;
    }

    static /* synthetic */ float access$2102(SubsamplingScaleImageView subsamplingScaleImageView, float f8) {
        subsamplingScaleImageView.quickScaleLastDistance = f8;
        return f8;
    }

    static /* synthetic */ PointF access$2202(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
        subsamplingScaleImageView.quickScaleSCenter = pointF;
        return pointF;
    }

    static /* synthetic */ PointF access$2302(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
        subsamplingScaleImageView.quickScaleVStart = pointF;
        return pointF;
    }

    static /* synthetic */ PointF access$2402(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
        subsamplingScaleImageView.quickScaleVLastPoint = pointF;
        return pointF;
    }

    static /* synthetic */ boolean access$2502(SubsamplingScaleImageView subsamplingScaleImageView, boolean bl) {
        subsamplingScaleImageView.quickScaleMoved = bl;
        return bl;
    }

    static /* synthetic */ Anim access$6302(SubsamplingScaleImageView subsamplingScaleImageView, Anim anim) {
        subsamplingScaleImageView.anim = anim;
        return anim;
    }

    static /* synthetic */ boolean access$902(SubsamplingScaleImageView subsamplingScaleImageView, boolean bl) {
        subsamplingScaleImageView.isZooming = bl;
        return bl;
    }

    private float averageDpi(DisplayMetrics displayMetrics) {
        return (displayMetrics.xdpi + displayMetrics.ydpi) / 2.0f;
    }

    private int calculateInSampleSize(float f8) {
        float f9 = f8;
        if (this.minimumTileDpi > 0) {
            f9 = this.averageDpi(this.getResources().getDisplayMetrics());
            f9 = f8 * ((float)this.minimumTileDpi / f9);
        }
        int n8 = (int)((float)this.sWidth() * f9);
        int n9 = (int)((float)this.sHeight() * f9);
        if (n8 != 0 && n9 != 0) {
            int n10 = this.sHeight();
            int n11 = 1;
            if (n10 <= n9 && this.sWidth() <= n8) {
                n9 = 1;
            } else {
                n9 = Math.round((float)this.sHeight() / (float)n9);
                if (n9 >= (n8 = Math.round((float)this.sWidth() / (float)n8))) {
                    n9 = n8;
                }
            }
            while ((n8 = n11 * 2) < n9) {
                n11 = n8;
            }
            return n11;
        }
        return 32;
    }

    private boolean checkImageLoaded() {
        boolean bl = this.isBaseLayerReady();
        if (!this.imageLoadedSent && bl) {
            this.preDraw();
            this.imageLoadedSent = true;
            this.onImageLoaded();
            OnImageEventListener onImageEventListener = this.onImageEventListener;
            if (onImageEventListener != null) {
                onImageEventListener.onImageLoaded();
            }
        }
        return bl;
    }

    private boolean checkReady() {
        boolean bl = this.getWidth() > 0 && this.getHeight() > 0 && this.sWidth > 0 && this.sHeight > 0 && (this.bitmap != null || this.isBaseLayerReady());
        if (!this.readySent && bl) {
            this.preDraw();
            this.readySent = true;
            this.onReady();
            OnImageEventListener onImageEventListener = this.onImageEventListener;
            if (onImageEventListener != null) {
                onImageEventListener.onReady();
            }
        }
        return bl;
    }

    private void createPaints() {
        Paint paint;
        if (this.bitmapPaint == null) {
            this.bitmapPaint = paint = new Paint();
            paint.setAntiAlias(true);
            this.bitmapPaint.setFilterBitmap(true);
            this.bitmapPaint.setDither(true);
        }
        if ((this.debugTextPaint == null || this.debugLinePaint == null) && this.debug) {
            this.debugTextPaint = paint = new Paint();
            paint.setTextSize((float)this.px(12));
            this.debugTextPaint.setColor(-65281);
            this.debugTextPaint.setStyle(Paint.Style.FILL);
            this.debugLinePaint = paint = new Paint();
            paint.setColor(-65281);
            this.debugLinePaint.setStyle(Paint.Style.STROKE);
            this.debugLinePaint.setStrokeWidth((float)this.px(1));
        }
    }

    private void debug(String string, Object ... objectArray) {
        if (this.debug) {
            Log.d((String)TAG, (String)String.format(string, objectArray));
        }
    }

    private float distance(float f8, float f9, float f10, float f11) {
        f8 -= f9;
        f9 = f10 - f11;
        return (float)Math.sqrt(f8 * f8 + f9 * f9);
    }

    private void doubleTapZoom(PointF pointF, PointF pointF2) {
        float f8;
        float f9;
        if (!this.panEnabled) {
            PointF pointF3 = this.sRequestedCenter;
            if (pointF3 != null) {
                pointF.x = pointF3.x;
                pointF.y = pointF3.y;
            } else {
                pointF.x = this.sWidth() / 2;
                pointF.y = this.sHeight() / 2;
            }
        }
        boolean bl = (double)(f9 = this.scale) <= (double)(f8 = Math.min(this.maxScale, this.doubleTapZoomScale)) * 0.9 || f9 == this.minScale;
        if (!bl) {
            f8 = this.minScale();
        }
        int n8 = this.doubleTapZoomStyle;
        if (n8 == 3) {
            this.setScaleAndCenter(f8, pointF);
        } else if (n8 != 2 && bl && this.panEnabled) {
            if (n8 == 1) {
                new AnimationBuilder(this, f8, pointF, pointF2).withInterruptible(false).withDuration(this.doubleTapZoomDuration).withOrigin(4).start();
            }
        } else {
            new AnimationBuilder(this, f8, pointF).withInterruptible(false).withDuration(this.doubleTapZoomDuration).withOrigin(4).start();
        }
        this.invalidate();
    }

    private float ease(int n8, long l8, float f8, float f9, long l9) {
        if (n8 != 1) {
            if (n8 == 2) {
                return this.easeInOutQuad(l8, f8, f9, l9);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected easing type: ");
            stringBuilder.append(n8);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return this.easeOutQuad(l8, f8, f9, l9);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float easeInOutQuad(long l8, float f8, float f9, long l9) {
        float f10 = (float)l8 / ((float)l9 / 2.0f);
        if (f10 < 1.0f) {
            f9 = f9 / 2.0f * f10;
            return f9 * f10 + f8;
        }
        f10 -= 1.0f;
        f9 = -f9 / 2.0f;
        f10 = f10 * (f10 - 2.0f) - 1.0f;
        return f9 * f10 + f8;
    }

    private float easeOutQuad(long l8, float f8, float f9, long l9) {
        float f10 = (float)l8 / (float)l9;
        return -f9 * f10 * (f10 - 2.0f) + f8;
    }

    private void execute(AsyncTask<Void, Void, ?> asyncTask) {
        asyncTask.executeOnExecutor(this.executor, (Object[])new Void[0]);
    }

    private void fileSRect(Rect rect, Rect rect2) {
        if (this.getRequiredRotation() == 0) {
            rect2.set(rect);
            return;
        }
        if (this.getRequiredRotation() == 90) {
            int n8 = rect.top;
            int n9 = this.sHeight;
            rect2.set(n8, n9 - rect.right, rect.bottom, n9 - rect.left);
            return;
        }
        if (this.getRequiredRotation() == 180) {
            int n10 = this.sWidth;
            int n11 = rect.right;
            int n12 = this.sHeight;
            rect2.set(n10 - n11, n12 - rect.bottom, n10 - rect.left, n12 - rect.top);
            return;
        }
        int n13 = this.sWidth;
        rect2.set(n13 - rect.bottom, rect.left, n13 - rect.top, rect.right);
    }

    private void fitToBounds(boolean bl) {
        boolean bl2;
        if (this.vTranslate == null) {
            this.vTranslate = new PointF(0.0f, 0.0f);
            bl2 = true;
        } else {
            bl2 = false;
        }
        if (this.satTemp == null) {
            this.satTemp = new ScaleAndTranslate(0.0f, new PointF(0.0f, 0.0f));
        }
        ScaleAndTranslate.access$4702(this.satTemp, this.scale);
        this.satTemp.vTranslate.set(this.vTranslate);
        this.fitToBounds(bl, this.satTemp);
        this.scale = this.satTemp.scale;
        this.vTranslate.set(this.satTemp.vTranslate);
        if (bl2 && this.minimumScaleType != 4) {
            this.vTranslate.set(this.vTranslateForSCenter(this.sWidth() / 2, this.sHeight() / 2, this.scale));
        }
    }

    /*
     * Unable to fully structure code
     */
    private void fitToBounds(boolean var1_1, ScaleAndTranslate var2_2) {
        var9_3 = var1_1;
        if (this.panLimit == 2) {
            var9_3 = var1_1;
            if (this.isReady()) {
                var9_3 = false;
            }
        }
        var10_4 = ScaleAndTranslate.access$4800(var2_2);
        var5_5 = this.limitedScale(ScaleAndTranslate.access$4700(var2_2));
        var7_6 = (float)this.sWidth() * var5_5;
        var6_7 = (float)this.sHeight() * var5_5;
        if (this.panLimit == 3 && this.isReady()) {
            var10_4.x = Math.max(var10_4.x, (float)(this.getWidth() / 2) - var7_6);
            var10_4.y = Math.max(var10_4.y, (float)(this.getHeight() / 2) - var6_7);
        } else if (var9_3) {
            var10_4.x = Math.max(var10_4.x, (float)this.getWidth() - var7_6);
            var10_4.y = Math.max(var10_4.y, (float)this.getHeight() - var6_7);
        } else {
            var10_4.x = Math.max(var10_4.x, -var7_6);
            var10_4.y = Math.max(var10_4.y, -var6_7);
        }
        var8_8 = this.getPaddingLeft();
        var4_9 = 0.5f;
        var3_10 = var8_8 <= 0 && this.getPaddingRight() <= 0 ? 0.5f : (float)this.getPaddingLeft() / (float)(this.getPaddingLeft() + this.getPaddingRight());
        if (this.getPaddingTop() > 0 || this.getPaddingBottom() > 0) {
            var4_9 = (float)this.getPaddingTop() / (float)(this.getPaddingTop() + this.getPaddingBottom());
        }
        if (this.panLimit == 3 && this.isReady()) {
            var3_10 = Math.max(0, this.getWidth() / 2);
            var8_8 = Math.max(0, this.getHeight() / 2);
lbl28:
            // 2 sources

            while (true) {
                var4_9 = var8_8;
                break;
            }
        } else if (var9_3) {
            var3_10 = Math.max(0.0f, ((float)this.getWidth() - var7_6) * var3_10);
            var4_9 = Math.max(0.0f, ((float)this.getHeight() - var6_7) * var4_9);
        } else {
            var3_10 = Math.max(0, this.getWidth());
            var8_8 = Math.max(0, this.getHeight());
            ** continue;
        }
        var10_4.x = Math.min(var10_4.x, var3_10);
        var10_4.y = Math.min(var10_4.y, var4_9);
        ScaleAndTranslate.access$4702(var2_2, var5_5);
    }

    private int getExifOrientation(Context context, String string) {
        return 0;
    }

    private Point getMaxBitmapDimensions(Canvas canvas) {
        return new Point(Math.min(canvas.getMaximumBitmapWidth(), this.maxTileWidth), Math.min(canvas.getMaximumBitmapHeight(), this.maxTileHeight));
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return preferredBitmapConfig;
    }

    private int getRequiredRotation() {
        int n8;
        int n9 = n8 = this.orientation;
        if (n8 == -1) {
            n9 = this.sOrientation;
        }
        return n9;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void initialiseBaseLayer(Point object) {
        synchronized (this) {
            RuntimeException var1_3;
            block8: {
                block7: {
                    block6: {
                        Object object2;
                        Object object3;
                        try {
                            int n8;
                            this.debug("initialiseBaseLayer maxTileDimensions=%dx%d", object.x, object.y);
                            object3 = new PointF(0.0f, 0.0f);
                            object2 = new ScaleAndTranslate(0.0f, (PointF)object3);
                            this.satTemp = object2;
                            this.fitToBounds(true, (ScaleAndTranslate)object2);
                            this.fullImageSampleSize = n8 = this.calculateInSampleSize(this.satTemp.scale);
                            if (n8 != 1 || this.sRegion != null || this.sWidth() >= object.x || this.sHeight() >= object.y) break block6;
                            this.decoder.recycle();
                            this.decoder = null;
                            object3 = this.getContext();
                            object = this.bitmapDecoderFactory;
                            object2 = this.inputStreamFactory;
                        }
                        catch (Throwable throwable) {
                            break block8;
                        }
                        try {
                            BitmapLoadTask bitmapLoadTask = new BitmapLoadTask(this, (Context)object3, (DecoderFactory<? extends ImageDecoder>)object, (DecodeInputStreamFactory)object2, false);
                            this.execute(bitmapLoadTask);
                            break block7;
                        }
                        catch (Throwable throwable) {
                            break block8;
                        }
                    }
                    this.initialiseTileMap((Point)object);
                    for (Object object2 : this.tileMap.get(this.fullImageSampleSize)) {
                        object = new TileLoadTask(this, this.decoder, (Tile)object2, this.isTileFullImage((Tile)object2));
                        this.execute((AsyncTask<Void, Void, ?>)object);
                    }
                    this.refreshRequiredTiles(true);
                }
                return;
            }
            throw var1_3;
        }
    }

    private void initialiseTileMap(Point point) {
        this.debug("initialiseTileMap maxTileDimensions=%dx%d", point.x, point.y);
        this.tileMap = new LinkedHashMap<Integer, List<Tile>>();
        int n8 = this.fullImageSampleSize;
        int n9 = 1;
        int n10 = 1;
        block0: while (true) {
            int n11 = this.sWidth() / n9;
            int n12 = this.sHeight() / n10;
            int n13 = n11 / n8;
            int n14 = n12 / n8;
            while (true) {
                block10: {
                    int n15;
                    int n16;
                    int n17;
                    block11: {
                        if (n13 + n9 + 1 > point.x) break block10;
                        n17 = n10;
                        n16 = n12;
                        n15 = n14;
                        if (!((double)n13 > (double)this.getWidth() * 1.25)) break block11;
                        n17 = n10;
                        n16 = n12;
                        n15 = n14;
                        if (n8 < this.fullImageSampleSize) break block10;
                    }
                    while (true) {
                        if (!(n15 + n17 + 1 > point.y || (double)n15 > (double)this.getHeight() * 1.25 && n8 < this.fullImageSampleSize)) {
                            ArrayList<Tile> arrayList = new ArrayList<Tile>(n9 * n17);
                            for (n10 = 0; n10 < n9; ++n10) {
                                for (n13 = 0; n13 < n17; ++n13) {
                                    Tile tile = new Tile();
                                    Tile.access$4302(tile, n8);
                                    boolean bl = n8 == this.fullImageSampleSize;
                                    Tile.access$402(tile, bl);
                                    n15 = n10 == n9 - 1 ? this.sWidth() : (n10 + 1) * n11;
                                    n12 = n13 == n17 - 1 ? this.sHeight() : (n13 + 1) * n16;
                                    Tile.access$4102(tile, new Rect(n10 * n11, n13 * n16, n15, n12));
                                    Tile.access$4202(tile, new Rect(0, 0, 0, 0));
                                    Tile.access$5002(tile, new Rect(tile.sRect));
                                    arrayList.add(tile);
                                }
                            }
                            this.tileMap.put(n8, arrayList);
                            if (n8 == 1) {
                                return;
                            }
                            n8 /= 2;
                            n10 = n17;
                            continue block0;
                        }
                        n16 = this.sHeight() / ++n17;
                        n15 = n16 / n8;
                    }
                }
                n11 = this.sWidth() / ++n9;
                n13 = n11 / n8;
            }
            break;
        }
    }

    private boolean isBaseLayerReady() {
        Object object = this.bitmap;
        boolean bl = true;
        if (object != null && !this.bitmapIsPreview) {
            return true;
        }
        object = this.tileMap;
        if (object != null) {
            block0: for (Map.Entry entry : object.entrySet()) {
                if ((Integer)entry.getKey() != this.fullImageSampleSize) continue;
                Iterator iterator = ((List)entry.getValue()).iterator();
                boolean bl2 = bl;
                while (true) {
                    bl = bl2;
                    if (!iterator.hasNext()) continue block0;
                    Tile tile = (Tile)iterator.next();
                    if (!tile.loading && tile.bitmap != null) continue;
                    bl2 = false;
                }
            }
            return bl;
        }
        return false;
    }

    private boolean isTileFullImage(Tile tile) {
        if (tile.sRect == null) {
            return false;
        }
        return ((Tile)tile).sRect.left == 0 && ((Tile)tile).sRect.right == this.sWidth() && ((Tile)tile).sRect.top == 0 && ((Tile)tile).sRect.bottom == this.sHeight();
    }

    private PointF limitedSCenter(float f8, float f9, float f10, PointF pointF) {
        PointF pointF2 = this.vTranslateForSCenter(f8, f9, f10);
        int n8 = this.getPaddingLeft();
        int n9 = (this.getWidth() - this.getPaddingRight() - this.getPaddingLeft()) / 2;
        int n10 = this.getPaddingTop();
        int n11 = (this.getHeight() - this.getPaddingBottom() - this.getPaddingTop()) / 2;
        pointF.set(((float)(n8 + n9) - pointF2.x) / f10, ((float)(n10 + n11) - pointF2.y) / f10);
        return pointF;
    }

    private float limitedScale(float f8) {
        f8 = Math.max(this.minScale(), f8);
        return Math.min(this.maxScale, f8);
    }

    private float minScale() {
        int n8 = this.getPaddingBottom() + this.getPaddingTop();
        int n9 = this.getPaddingLeft() + this.getPaddingRight();
        int n10 = this.minimumScaleType;
        if (n10 != 2 && n10 != 4) {
            float f8;
            if (n10 == 3 && (f8 = this.minScale) > 0.0f) {
                return f8;
            }
            return Math.min((float)(this.getWidth() - n9) / (float)this.sWidth(), (float)(this.getHeight() - n8) / (float)this.sHeight());
        }
        return Math.max((float)(this.getWidth() - n9) / (float)this.sWidth(), (float)(this.getHeight() - n8) / (float)this.sHeight());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void onImageLoaded(Bitmap bitmap, int n8, boolean bl) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Object object;
                block6: {
                    try {
                        this.debug("onImageLoaded", new Object[0]);
                        int n9 = this.sWidth;
                        if (n9 <= 0 || this.sHeight <= 0 || n9 == bitmap.getWidth() && this.sHeight == bitmap.getHeight()) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    this.reset(false);
                }
                if ((object = this.bitmap) != null && !this.bitmapIsCached) {
                    object.recycle();
                }
                if (this.bitmap != null && this.bitmapIsCached && (object = this.onImageEventListener) != null) {
                    object.onPreviewReleased();
                }
                this.bitmapIsPreview = false;
                this.bitmapIsCached = bl;
                this.bitmap = bitmap;
                this.sWidth = bitmap.getWidth();
                this.sHeight = bitmap.getHeight();
                this.sOrientation = n8;
                bl = this.checkReady();
                boolean bl2 = this.checkImageLoaded();
                if (bl || bl2) {
                    this.invalidate();
                    this.requestLayout();
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void onPreviewLoaded(Bitmap bitmap) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        this.debug("onPreviewLoaded", new Object[0]);
                        if (this.bitmap == null && !this.imageLoadedSent) {
                            Rect rect = this.pRegion;
                            this.bitmap = rect != null ? Bitmap.createBitmap((Bitmap)bitmap, (int)rect.left, (int)rect.top, (int)rect.width(), (int)this.pRegion.height()) : bitmap;
                        }
                        break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    this.bitmapIsPreview = true;
                    if (this.checkReady()) {
                        this.invalidate();
                        this.requestLayout();
                    }
                    return;
                }
                bitmap.recycle();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void onTileLoaded() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block4: {
                    Object object;
                    block5: {
                        try {
                            this.debug("onTileLoaded", new Object[0]);
                            this.checkReady();
                            this.checkImageLoaded();
                            if (!this.isBaseLayerReady() || (object = this.bitmap) == null) break block4;
                            if (this.bitmapIsCached) break block5;
                            object.recycle();
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    this.bitmap = null;
                    object = this.onImageEventListener;
                    if (object != null && this.bitmapIsCached) {
                        object.onPreviewReleased();
                    }
                    this.bitmapIsPreview = false;
                    this.bitmapIsCached = false;
                }
                this.invalidate();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void onTilesInited(ImageRegionDecoder imageRegionDecoder, int n8, int n9, int n10) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block5: {
                    Object object;
                    block6: {
                        try {
                            int n11;
                            this.debug("onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d", n8, n9, this.orientation);
                            int n12 = this.sWidth;
                            if (n12 <= 0 || (n11 = this.sHeight) <= 0 || n12 == n8 && n11 == n9) break block5;
                            this.reset(false);
                            object = this.bitmap;
                            if (object == null) break block5;
                            if (this.bitmapIsCached) break block6;
                            object.recycle();
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    this.bitmap = null;
                    object = this.onImageEventListener;
                    if (object != null && this.bitmapIsCached) {
                        object.onPreviewReleased();
                    }
                    this.bitmapIsPreview = false;
                    this.bitmapIsCached = false;
                }
                this.decoder = imageRegionDecoder;
                this.sWidth = n8;
                this.sHeight = n9;
                this.sOrientation = n10;
                this.checkReady();
                if (!this.checkImageLoaded() && (n8 = this.maxTileWidth) > 0 && n8 != Integer.MAX_VALUE && (n8 = this.maxTileHeight) > 0 && n8 != Integer.MAX_VALUE && this.getWidth() > 0 && this.getHeight() > 0) {
                    imageRegionDecoder = new Point(this.maxTileWidth, this.maxTileHeight);
                    this.initialiseBaseLayer((Point)imageRegionDecoder);
                }
                this.invalidate();
                this.requestLayout();
                return;
            }
            throw throwable2;
        }
    }

    private boolean onTouchEventInternal(MotionEvent motionEvent) {
        int n8;
        block37: {
            boolean bl;
            block38: {
                block40: {
                    block42: {
                        boolean bl2;
                        int n9;
                        block43: {
                            float f8;
                            block45: {
                                float f9;
                                block46: {
                                    block47: {
                                        float f10;
                                        float f11;
                                        float f12;
                                        PointF pointF;
                                        block44: {
                                            block41: {
                                                float f13;
                                                block39: {
                                                    n8 = motionEvent.getPointerCount();
                                                    n9 = motionEvent.getAction();
                                                    bl2 = false;
                                                    if (n9 == 0) break block37;
                                                    if (n9 == 1) break block38;
                                                    if (n9 == 2) break block39;
                                                    if (n9 == 5) break block37;
                                                    if (n9 == 6) break block38;
                                                    if (n9 == 261) break block37;
                                                    if (n9 == 262) break block38;
                                                    break block40;
                                                }
                                                if (this.maxTouchCount <= 0) break block40;
                                                if (n8 < 2) break block41;
                                                float f14 = this.distance(motionEvent.getX(0), motionEvent.getX(1), motionEvent.getY(0), motionEvent.getY(1));
                                                float f15 = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
                                                float f16 = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
                                                if (!this.zoomEnabled) break block40;
                                                motionEvent = this.vCenterStart;
                                                if (!(this.distance(motionEvent.x, f15, motionEvent.y, f16) > 5.0f) && !(Math.abs(f14 - this.vDistStart) > 5.0f) && !this.isPanning) break block40;
                                                this.isZooming = true;
                                                this.isPanning = true;
                                                double d8 = this.scale;
                                                this.scale = f13 = Math.min(this.maxScale, f14 / this.vDistStart * this.scaleStart);
                                                if (f13 <= this.minScale()) {
                                                    this.vDistStart = f14;
                                                    this.scaleStart = this.minScale();
                                                    this.vCenterStart.set(f15, f16);
                                                    this.vTranslateStart.set(this.vTranslate);
                                                } else if (this.panEnabled) {
                                                    PointF pointF2 = this.vCenterStart;
                                                    float f17 = pointF2.x;
                                                    motionEvent = this.vTranslateStart;
                                                    f13 = motionEvent.x;
                                                    float f18 = pointF2.y;
                                                    float f19 = motionEvent.y;
                                                    float f20 = this.scale;
                                                    float f21 = this.scaleStart;
                                                    float f22 = f20 / f21;
                                                    f21 = f20 / f21;
                                                    motionEvent = this.vTranslate;
                                                    motionEvent.x = f15 - (f17 - f13) * f22;
                                                    motionEvent.y = f16 - (f18 - f19) * f21;
                                                    if ((double)this.sHeight() * d8 < (double)this.getHeight() && this.scale * (float)this.sHeight() >= (float)this.getHeight() || d8 * (double)this.sWidth() < (double)this.getWidth() && this.scale * (float)this.sWidth() >= (float)this.getWidth()) {
                                                        this.fitToBounds(true);
                                                        this.vCenterStart.set(f15, f16);
                                                        this.vTranslateStart.set(this.vTranslate);
                                                        this.scaleStart = this.scale;
                                                        this.vDistStart = f14;
                                                    }
                                                } else if (this.sRequestedCenter != null) {
                                                    this.vTranslate.x = (float)(this.getWidth() / 2) - this.scale * this.sRequestedCenter.x;
                                                    this.vTranslate.y = (float)(this.getHeight() / 2) - this.scale * this.sRequestedCenter.y;
                                                } else {
                                                    this.vTranslate.x = (float)(this.getWidth() / 2) - this.scale * (float)(this.sWidth() / 2);
                                                    this.vTranslate.y = (float)(this.getHeight() / 2) - this.scale * (float)(this.sHeight() / 2);
                                                }
                                                this.fitToBounds(true);
                                                this.refreshRequiredTiles(this.eagerLoadingEnabled);
                                                break block42;
                                            }
                                            if (!this.isQuickScaling) break block43;
                                            f9 = Math.abs(this.quickScaleVStart.y - motionEvent.getY()) * 2.0f + this.quickScaleThreshold;
                                            if (this.quickScaleLastDistance == -1.0f) {
                                                this.quickScaleLastDistance = f9;
                                            }
                                            f8 = motionEvent.getY();
                                            pointF = this.quickScaleVLastPoint;
                                            if (f8 > pointF.y) {
                                                bl2 = true;
                                            }
                                            pointF.set(0.0f, motionEvent.getY());
                                            f8 = f9 / this.quickScaleLastDistance;
                                            f12 = 1.0f;
                                            f11 = Math.abs(1.0f - f8) * 0.5f;
                                            if (f11 > 0.03f) break block44;
                                            f8 = f9;
                                            if (!this.quickScaleMoved) break block45;
                                        }
                                        this.quickScaleMoved = true;
                                        f8 = f12;
                                        if (this.quickScaleLastDistance > 0.0f) {
                                            f8 = bl2 ? f11 + 1.0f : 1.0f - f11;
                                        }
                                        double d9 = this.scale;
                                        this.scale = f10 = Math.max(this.minScale(), Math.min(this.maxScale, this.scale * f8));
                                        if (!this.panEnabled) break block46;
                                        motionEvent = this.vCenterStart;
                                        f8 = motionEvent.x;
                                        pointF = this.vTranslateStart;
                                        float f23 = pointF.x;
                                        f12 = motionEvent.y;
                                        f11 = pointF.y;
                                        float f24 = this.scaleStart;
                                        float f25 = f10 / f24;
                                        f24 = f10 / f24;
                                        motionEvent = this.vTranslate;
                                        motionEvent.x = f8 - (f8 - f23) * f25;
                                        motionEvent.y = f12 - (f12 - f11) * f24;
                                        if ((double)this.sHeight() * d9 < (double)this.getHeight() && this.scale * (float)this.sHeight() >= (float)this.getHeight()) break block47;
                                        f8 = f9;
                                        if (!(d9 * (double)this.sWidth() < (double)this.getWidth())) break block45;
                                        f8 = f9;
                                        if (!(this.scale * (float)this.sWidth() >= (float)this.getWidth())) break block45;
                                    }
                                    this.fitToBounds(true);
                                    this.vCenterStart.set(this.sourceToViewCoord(this.quickScaleSCenter));
                                    this.vTranslateStart.set(this.vTranslate);
                                    this.scaleStart = this.scale;
                                    f8 = 0.0f;
                                    break block45;
                                }
                                if (this.sRequestedCenter != null) {
                                    this.vTranslate.x = (float)(this.getWidth() / 2) - this.scale * this.sRequestedCenter.x;
                                    this.vTranslate.y = (float)(this.getHeight() / 2) - this.scale * this.sRequestedCenter.y;
                                    f8 = f9;
                                } else {
                                    this.vTranslate.x = (float)(this.getWidth() / 2) - this.scale * (float)(this.sWidth() / 2);
                                    this.vTranslate.y = (float)(this.getHeight() / 2) - this.scale * (float)(this.sHeight() / 2);
                                    f8 = f9;
                                }
                            }
                            this.quickScaleLastDistance = f8;
                            this.fitToBounds(true);
                            this.refreshRequiredTiles(this.eagerLoadingEnabled);
                            break block42;
                        }
                        if (this.isZooming) break block40;
                        float f26 = Math.abs(motionEvent.getX() - this.vCenterStart.x);
                        float f27 = Math.abs(motionEvent.getY() - this.vCenterStart.y);
                        float f28 = this.density * 5.0f;
                        float f29 = f26 - f28;
                        float f30 = f29 == 0.0f ? 0 : (f29 > 0.0f ? 1 : -1);
                        if (f30 <= 0 && !(f27 > f28) && !this.isPanning) break block40;
                        this.vTranslate.x = this.vTranslateStart.x + (motionEvent.getX() - this.vCenterStart.x);
                        this.vTranslate.y = this.vTranslateStart.y + (motionEvent.getY() - this.vCenterStart.y);
                        motionEvent = this.vTranslate;
                        float f31 = motionEvent.x;
                        float f32 = motionEvent.y;
                        this.fitToBounds(true);
                        motionEvent = this.vTranslate;
                        bl2 = f31 != motionEvent.x;
                        f31 = motionEvent.y;
                        n9 = f32 != f31 ? 1 : 0;
                        n8 = bl2 && f26 > f27 && !this.isPanning ? 1 : 0;
                        boolean bl3 = n9 != 0 && f27 > f26 && !this.isPanning;
                        boolean bl4 = f32 == f31 && f27 > 3.0f * f28;
                        if (n8 == 0 && !bl3 && (!bl2 || n9 == 0 || bl4 || this.isPanning)) {
                            this.isPanning = true;
                        } else if (f30 > 0 || f27 > f28) {
                            this.maxTouchCount = 0;
                            this.handler.removeMessages(1);
                            this.requestDisallowInterceptTouchEvent(false);
                        }
                        if (!this.panEnabled) {
                            motionEvent = this.vTranslate;
                            PointF pointF = this.vTranslateStart;
                            motionEvent.x = pointF.x;
                            motionEvent.y = pointF.y;
                            this.requestDisallowInterceptTouchEvent(false);
                        }
                        this.refreshRequiredTiles(this.eagerLoadingEnabled);
                    }
                    this.handler.removeMessages(1);
                    this.invalidate();
                    return true;
                }
                return false;
            }
            this.handler.removeMessages(1);
            if (this.isQuickScaling) {
                this.isQuickScaling = false;
                if (!this.quickScaleMoved) {
                    this.doubleTapZoom(this.quickScaleSCenter, this.vCenterStart);
                }
            }
            if (this.maxTouchCount > 0 && ((bl = this.isZooming) || this.isPanning)) {
                if (bl && n8 == 2) {
                    this.isPanning = true;
                    PointF pointF = this.vTranslateStart;
                    PointF pointF3 = this.vTranslate;
                    pointF.set(pointF3.x, pointF3.y);
                    if (motionEvent.getActionIndex() == 1) {
                        this.vCenterStart.set(motionEvent.getX(0), motionEvent.getY(0));
                    } else {
                        this.vCenterStart.set(motionEvent.getX(1), motionEvent.getY(1));
                    }
                }
                if (n8 < 3) {
                    this.isZooming = false;
                }
                if (n8 < 2) {
                    this.isPanning = false;
                    this.maxTouchCount = 0;
                }
                this.refreshRequiredTiles(true);
                return true;
            }
            if (n8 == 1) {
                this.isZooming = false;
                this.isPanning = false;
                this.maxTouchCount = 0;
            }
            return true;
        }
        this.anim = null;
        this.requestDisallowInterceptTouchEvent(true);
        this.maxTouchCount = Math.max(this.maxTouchCount, n8);
        if (n8 >= 2) {
            if (this.zoomEnabled) {
                float f33 = this.distance(motionEvent.getX(0), motionEvent.getX(1), motionEvent.getY(0), motionEvent.getY(1));
                this.scaleStart = this.scale;
                this.vDistStart = f33;
                PointF pointF = this.vTranslateStart;
                PointF pointF4 = this.vTranslate;
                pointF.set(pointF4.x, pointF4.y);
                this.vCenterStart.set((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f, (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f);
            } else {
                this.maxTouchCount = 0;
            }
            this.handler.removeMessages(1);
        } else if (!this.isQuickScaling) {
            PointF pointF = this.vTranslateStart;
            PointF pointF5 = this.vTranslate;
            pointF.set(pointF5.x, pointF5.y);
            this.vCenterStart.set(motionEvent.getX(), motionEvent.getY());
            this.handler.sendEmptyMessageDelayed(1, 600L);
        }
        return true;
    }

    private void preDraw() {
        if (this.getWidth() != 0 && this.getHeight() != 0 && this.sWidth > 0 && this.sHeight > 0) {
            Float f8;
            if (this.sPendingCenter != null && (f8 = this.pendingScale) != null) {
                this.scale = f8.floatValue();
                if (this.vTranslate == null) {
                    this.vTranslate = new PointF();
                }
                this.vTranslate.x = (float)(this.getWidth() / 2) - this.scale * this.sPendingCenter.x;
                this.vTranslate.y = (float)(this.getHeight() / 2) - this.scale * this.sPendingCenter.y;
                this.sPendingCenter = null;
                this.pendingScale = null;
                this.fitToBounds(true);
                this.refreshRequiredTiles(true);
            }
            this.fitToBounds(false);
        }
    }

    private int px(int n8) {
        return (int)(this.density * (float)n8);
    }

    private void refreshRequiredTiles(boolean bl) {
        if (this.decoder != null && this.tileMap != null) {
            int n8 = Math.min(this.fullImageSampleSize, this.calculateInSampleSize(this.scale));
            Iterator<Map.Entry<Integer, List<Tile>>> iterator = this.tileMap.entrySet().iterator();
            while (iterator.hasNext()) {
                for (Tile tile : iterator.next().getValue()) {
                    if (tile.sampleSize < n8 || tile.sampleSize > n8 && tile.sampleSize != this.fullImageSampleSize) {
                        Tile.access$402(tile, false);
                        if (tile.bitmap != null) {
                            tile.bitmap.recycle();
                            Tile.access$502(tile, null);
                        }
                    }
                    if (tile.sampleSize == n8) {
                        if (this.tileVisible(tile)) {
                            Tile.access$402(tile, true);
                            if (tile.loading || tile.bitmap != null || !bl) continue;
                            this.execute(new TileLoadTask(this, this.decoder, tile, this.isTileFullImage(tile)));
                            continue;
                        }
                        if (tile.sampleSize == this.fullImageSampleSize) continue;
                        Tile.access$402(tile, false);
                        if (tile.bitmap == null) continue;
                        tile.bitmap.recycle();
                        Tile.access$502(tile, null);
                        continue;
                    }
                    if (tile.sampleSize != this.fullImageSampleSize) continue;
                    Tile.access$402(tile, true);
                }
            }
        }
    }

    private void requestDisallowInterceptTouchEvent(boolean bl) {
        ViewParent viewParent = this.getParent();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(bl);
        }
    }

    private void reset(boolean bl) {
        Object object;
        block11: {
            object = new StringBuilder();
            ((StringBuilder)object).append("reset newImage=");
            ((StringBuilder)object).append(bl);
            this.debug(((StringBuilder)object).toString(), new Object[0]);
            this.scale = 0.0f;
            this.scaleStart = 0.0f;
            this.vTranslate = null;
            this.vTranslateStart = null;
            this.vTranslateBefore = null;
            this.pendingScale = Float.valueOf(0.0f);
            this.sPendingCenter = null;
            this.sRequestedCenter = null;
            this.isZooming = false;
            this.isPanning = false;
            this.isQuickScaling = false;
            this.maxTouchCount = 0;
            this.fullImageSampleSize = 0;
            this.vCenterStart = null;
            this.vDistStart = 0.0f;
            this.quickScaleLastDistance = 0.0f;
            this.quickScaleMoved = false;
            this.quickScaleSCenter = null;
            this.quickScaleVLastPoint = null;
            this.quickScaleVStart = null;
            this.anim = null;
            this.satTemp = null;
            this.matrix = null;
            this.sRect = null;
            if (bl) {
                Throwable throwable2;
                block10: {
                    block9: {
                        this.inputStreamFactory = null;
                        this.decoderLock.writeLock().lock();
                        try {
                            object = this.decoder;
                            if (object == null) break block9;
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                        object.recycle();
                        this.decoder = null;
                    }
                    this.decoderLock.writeLock().unlock();
                    object = this.bitmap;
                    if (object != null && !this.bitmapIsCached) {
                        object.recycle();
                    }
                    if (this.bitmap != null && this.bitmapIsCached && (object = this.onImageEventListener) != null) {
                        object.onPreviewReleased();
                    }
                    this.sWidth = 0;
                    this.sHeight = 0;
                    this.sOrientation = 0;
                    this.sRegion = null;
                    this.pRegion = null;
                    this.readySent = false;
                    this.imageLoadedSent = false;
                    this.bitmap = null;
                    this.bitmapIsPreview = false;
                    this.bitmapIsCached = false;
                    break block11;
                }
                this.decoderLock.writeLock().unlock();
                throw throwable2;
            }
        }
        if ((object = this.tileMap) != null) {
            object = object.entrySet().iterator();
            while (object.hasNext()) {
                for (Tile tile : (List)((Map.Entry)object.next()).getValue()) {
                    Tile.access$402(tile, false);
                    if (tile.bitmap == null) continue;
                    tile.bitmap.recycle();
                    Tile.access$502(tile, null);
                }
            }
            this.tileMap = null;
        }
        this.setGestureDetector(this.getContext());
    }

    private void restoreState(ImageViewState imageViewState) {
        if (imageViewState != null && VALID_ORIENTATIONS.contains(imageViewState.getOrientation())) {
            this.orientation = imageViewState.getOrientation();
            this.pendingScale = Float.valueOf(imageViewState.getScale());
            this.sPendingCenter = imageViewState.getCenter();
            this.invalidate();
        }
    }

    private int sHeight() {
        int n8 = this.getRequiredRotation();
        if (n8 != 90 && n8 != 270) {
            return this.sHeight;
        }
        return this.sWidth;
    }

    private int sWidth() {
        int n8 = this.getRequiredRotation();
        if (n8 != 90 && n8 != 270) {
            return this.sWidth;
        }
        return this.sHeight;
    }

    private void sendStateChanged(float f8, PointF pointF, int n8) {
        float f9;
        OnStateChangedListener onStateChangedListener = this.onStateChangedListener;
        if (onStateChangedListener != null && (f9 = this.scale) != f8) {
            onStateChangedListener.onScaleChanged(f9, n8);
        }
        if (this.onStateChangedListener != null && !this.vTranslate.equals((Object)pointF)) {
            this.onStateChangedListener.onCenterChanged(this.getCenter(), n8);
        }
    }

    private void setGestureDetector(Context context) {
        this.detector = new GestureDetector(context, (GestureDetector.OnGestureListener)new GestureDetector.SimpleOnGestureListener(this, context){
            final SubsamplingScaleImageView this$0;
            final Context val$context;
            {
                this.this$0 = subsamplingScaleImageView;
                this.val$context = context;
            }

            public boolean onDoubleTap(MotionEvent motionEvent) {
                if (this.this$0.zoomEnabled && this.this$0.readySent && this.this$0.vTranslate != null) {
                    this.this$0.setGestureDetector(this.val$context);
                    if (this.this$0.quickScaleEnabled) {
                        SubsamplingScaleImageView.access$1702(this.this$0, new PointF(motionEvent.getX(), motionEvent.getY()));
                        SubsamplingScaleImageView.access$1802(this.this$0, new PointF(((SubsamplingScaleImageView)this.this$0).vTranslate.x, ((SubsamplingScaleImageView)this.this$0).vTranslate.y));
                        SubsamplingScaleImageView subsamplingScaleImageView = this.this$0;
                        SubsamplingScaleImageView.access$1902(subsamplingScaleImageView, subsamplingScaleImageView.scale);
                        SubsamplingScaleImageView.access$2002(this.this$0, true);
                        SubsamplingScaleImageView.access$902(this.this$0, true);
                        SubsamplingScaleImageView.access$2102(this.this$0, -1.0f);
                        subsamplingScaleImageView = this.this$0;
                        SubsamplingScaleImageView.access$2202(subsamplingScaleImageView, subsamplingScaleImageView.viewToSourceCoord(subsamplingScaleImageView.vCenterStart));
                        SubsamplingScaleImageView.access$2302(this.this$0, new PointF(motionEvent.getX(), motionEvent.getY()));
                        SubsamplingScaleImageView.access$2402(this.this$0, new PointF(((SubsamplingScaleImageView)this.this$0).quickScaleSCenter.x, ((SubsamplingScaleImageView)this.this$0).quickScaleSCenter.y));
                        SubsamplingScaleImageView.access$2502(this.this$0, false);
                        return false;
                    }
                    SubsamplingScaleImageView subsamplingScaleImageView = this.this$0;
                    subsamplingScaleImageView.doubleTapZoom(subsamplingScaleImageView.viewToSourceCoord(new PointF(motionEvent.getX(), motionEvent.getY())), new PointF(motionEvent.getX(), motionEvent.getY()));
                    return true;
                }
                return super.onDoubleTapEvent(motionEvent);
            }

            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
                if (this.this$0.panEnabled && this.this$0.readySent && this.this$0.vTranslate != null && motionEvent != null && motionEvent2 != null && (Math.abs(motionEvent.getX() - motionEvent2.getX()) > 50.0f || Math.abs(motionEvent.getY() - motionEvent2.getY()) > 50.0f) && (Math.abs(f8) > 500.0f || Math.abs(f9) > 500.0f) && !this.this$0.isZooming) {
                    motionEvent = new PointF(((SubsamplingScaleImageView)this.this$0).vTranslate.x + f8 * 0.25f, ((SubsamplingScaleImageView)this.this$0).vTranslate.y + f9 * 0.25f);
                    f8 = ((float)(this.this$0.getWidth() / 2) - motionEvent.x) / this.this$0.scale;
                    f9 = ((float)(this.this$0.getHeight() / 2) - motionEvent.y) / this.this$0.scale;
                    new AnimationBuilder(this.this$0, new PointF(f8, f9)).withEasing(1).withPanLimited(false).withOrigin(3).start();
                    return true;
                }
                return super.onFling(motionEvent, motionEvent2, f8, f9);
            }

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                this.this$0.performClick();
                return true;
            }
        });
        this.singleDetector = new GestureDetector(context, (GestureDetector.OnGestureListener)new GestureDetector.SimpleOnGestureListener(this){
            final SubsamplingScaleImageView this$0;
            {
                this.this$0 = subsamplingScaleImageView;
            }

            public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                this.this$0.performClick();
                return true;
            }
        });
    }

    private void setMatrixArray(float[] fArray, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15) {
        fArray[0] = f8;
        fArray[1] = f9;
        fArray[2] = f10;
        fArray[3] = f11;
        fArray[4] = f12;
        fArray[5] = f13;
        fArray[6] = f14;
        fArray[7] = f15;
    }

    public static void setPreferredBitmapConfig(Bitmap.Config config) {
        preferredBitmapConfig = config;
    }

    private void sourceToViewRect(Rect rect, Rect rect2) {
        rect2.set((int)this.sourceToViewX(rect.left), (int)this.sourceToViewY(rect.top), (int)this.sourceToViewX(rect.right), (int)this.sourceToViewY(rect.bottom));
    }

    private float sourceToViewX(float f8) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return f8 * this.scale + pointF.x;
    }

    private float sourceToViewY(float f8) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return f8 * this.scale + pointF.y;
    }

    private boolean tileVisible(Tile tile) {
        float f8 = this.viewToSourceX(0.0f);
        float f9 = this.viewToSourceX(this.getWidth());
        float f10 = this.viewToSourceY(0.0f);
        float f11 = this.viewToSourceY(this.getHeight());
        return !(f8 > (float)((Tile)tile).sRect.right || (float)((Tile)tile).sRect.left > f9 || f10 > (float)((Tile)tile).sRect.bottom || (float)((Tile)tile).sRect.top > f11);
    }

    private PointF vTranslateForSCenter(float f8, float f9, float f10) {
        int n8 = this.getPaddingLeft();
        int n9 = (this.getWidth() - this.getPaddingRight() - this.getPaddingLeft()) / 2;
        int n10 = this.getPaddingTop();
        int n11 = (this.getHeight() - this.getPaddingBottom() - this.getPaddingTop()) / 2;
        if (this.satTemp == null) {
            this.satTemp = new ScaleAndTranslate(0.0f, new PointF(0.0f, 0.0f));
        }
        ScaleAndTranslate.access$4702(this.satTemp, f10);
        this.satTemp.vTranslate.set((float)(n8 + n9) - f8 * f10, (float)(n10 + n11) - f9 * f10);
        this.fitToBounds(true, this.satTemp);
        return this.satTemp.vTranslate;
    }

    private float viewToSourceX(float f8) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f8 - pointF.x) / this.scale;
    }

    private float viewToSourceY(float f8) {
        PointF pointF = this.vTranslate;
        if (pointF == null) {
            return Float.NaN;
        }
        return (f8 - pointF.y) / this.scale;
    }

    public AnimationBuilder animateCenter(PointF pointF) {
        if (!this.isReady()) {
            return null;
        }
        return new AnimationBuilder(this, pointF);
    }

    public AnimationBuilder animateScale(float f8) {
        if (!this.isReady()) {
            return null;
        }
        return new AnimationBuilder(this, f8);
    }

    public AnimationBuilder animateScaleAndCenter(float f8, PointF pointF) {
        if (!this.isReady()) {
            return null;
        }
        return new AnimationBuilder(this, f8, pointF);
    }

    public final int getAppliedOrientation() {
        return this.getRequiredRotation();
    }

    public final PointF getCenter() {
        int n8 = this.getWidth() / 2;
        int n9 = this.getHeight() / 2;
        return this.viewToSourceCoord(n8, n9);
    }

    public float getMaxScale() {
        return this.maxScale;
    }

    public final float getMinScale() {
        return this.minScale();
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final void getPanRemaining(RectF rectF) {
        if (!this.isReady()) {
            return;
        }
        float f8 = this.scale * (float)this.sWidth();
        float f9 = this.scale * (float)this.sHeight();
        int n8 = this.panLimit;
        if (n8 == 3) {
            rectF.top = Math.max(0.0f, -(this.vTranslate.y - (float)(this.getHeight() / 2)));
            rectF.left = Math.max(0.0f, -(this.vTranslate.x - (float)(this.getWidth() / 2)));
            rectF.bottom = Math.max(0.0f, this.vTranslate.y - ((float)(this.getHeight() / 2) - f9));
            rectF.right = Math.max(0.0f, this.vTranslate.x - ((float)(this.getWidth() / 2) - f8));
            return;
        }
        if (n8 == 2) {
            rectF.top = Math.max(0.0f, -(this.vTranslate.y - (float)this.getHeight()));
            rectF.left = Math.max(0.0f, -(this.vTranslate.x - (float)this.getWidth()));
            rectF.bottom = Math.max(0.0f, this.vTranslate.y + f9);
            rectF.right = Math.max(0.0f, this.vTranslate.x + f8);
            return;
        }
        rectF.top = Math.max(0.0f, -this.vTranslate.y);
        rectF.left = Math.max(0.0f, -this.vTranslate.x);
        rectF.bottom = Math.max(0.0f, f9 + this.vTranslate.y - (float)this.getHeight());
        rectF.right = Math.max(0.0f, f8 + this.vTranslate.x - (float)this.getWidth());
    }

    public final int getSHeight() {
        return this.sHeight;
    }

    public final int getSWidth() {
        return this.sWidth;
    }

    public final float getScale() {
        return this.scale;
    }

    public final ImageViewState getState() {
        if (this.vTranslate != null && this.sWidth > 0 && this.sHeight > 0) {
            return new ImageViewState(this.getScale(), this.getCenter(), this.getOrientation());
        }
        return null;
    }

    public boolean hasImage() {
        return this.inputStreamFactory != null || this.bitmap != null;
        {
        }
    }

    public final boolean isImageLoaded() {
        return this.imageLoadedSent;
    }

    public final boolean isPanEnabled() {
        return this.panEnabled;
    }

    public final boolean isQuickScaleEnabled() {
        return this.quickScaleEnabled;
    }

    public final boolean isReady() {
        return this.readySent;
    }

    public final boolean isTileBgPaintSet() {
        return this.tileBgPaint != null;
    }

    public final boolean isZoomEnabled() {
        return this.zoomEnabled;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onDraw(Canvas canvas) {
        Object object;
        float f8;
        float f9;
        super.onDraw(canvas);
        this.createPaints();
        if (this.sWidth == 0) return;
        if (this.sHeight == 0) return;
        if (this.getWidth() == 0) return;
        if (this.getHeight() == 0) {
            return;
        }
        if (this.tileMap == null && this.decoder != null) {
            this.initialiseBaseLayer(this.getMaxBitmapDimensions(canvas));
        }
        if (!this.checkReady()) {
            return;
        }
        this.preDraw();
        Anim anim = this.anim;
        if (anim != null && anim.vFocusStart != null) {
            float f10 = this.scale;
            if (this.vTranslateBefore == null) {
                this.vTranslateBefore = new PointF(0.0f, 0.0f);
            }
            this.vTranslateBefore.set(this.vTranslate);
            long l8 = System.currentTimeMillis() - this.anim.time;
            boolean bl = l8 > this.anim.duration;
            l8 = Math.min(l8, this.anim.duration);
            this.scale = this.ease(this.anim.easing, l8, this.anim.scaleStart, this.anim.scaleEnd - this.anim.scaleStart, this.anim.duration);
            f9 = this.ease(this.anim.easing, l8, ((Anim)this.anim).vFocusStart.x, ((Anim)this.anim).vFocusEnd.x - ((Anim)this.anim).vFocusStart.x, this.anim.duration);
            f8 = this.ease(this.anim.easing, l8, ((Anim)this.anim).vFocusStart.y, ((Anim)this.anim).vFocusEnd.y - ((Anim)this.anim).vFocusStart.y, this.anim.duration);
            PointF pointF = this.vTranslate;
            pointF.x -= this.sourceToViewX(((Anim)this.anim).sCenterEnd.x) - f9;
            PointF pointF2 = this.vTranslate;
            pointF2.y -= this.sourceToViewY(((Anim)this.anim).sCenterEnd.y) - f8;
            boolean bl2 = bl || this.anim.scaleStart == this.anim.scaleEnd;
            this.fitToBounds(bl2);
            this.sendStateChanged(f10, this.vTranslateBefore, this.anim.origin);
            this.refreshRequiredTiles(bl);
            if (bl) {
                if (this.anim.listener != null) {
                    try {
                        this.anim.listener.onComplete();
                    }
                    catch (Exception exception) {
                        Log.w((String)TAG, (String)"Error thrown by animation listener", (Throwable)exception);
                    }
                }
                this.anim = null;
            }
            this.invalidate();
        }
        if (this.tileMap == null || !this.isBaseLayerReady()) {
            Bitmap bitmap = this.bitmap;
            if (bitmap != null) {
                f9 = this.scale;
                if (this.bitmapIsPreview) {
                    f9 *= (float)this.sWidth / (float)bitmap.getWidth();
                    f8 = this.scale * ((float)this.sHeight / (float)this.bitmap.getHeight());
                } else {
                    f8 = f9;
                }
                if (this.matrix == null) {
                    this.matrix = new Matrix();
                }
                this.matrix.reset();
                this.matrix.postScale(f9, f8);
                this.matrix.postRotate((float)this.getRequiredRotation());
                Matrix matrix = this.matrix;
                PointF pointF = this.vTranslate;
                matrix.postTranslate(pointF.x, pointF.y);
                if (this.getRequiredRotation() == 180) {
                    Matrix matrix2 = this.matrix;
                    f8 = this.scale;
                    matrix2.postTranslate((float)this.sWidth * f8, f8 * (float)this.sHeight);
                } else if (this.getRequiredRotation() == 90) {
                    this.matrix.postTranslate(this.scale * (float)this.sHeight, 0.0f);
                } else if (this.getRequiredRotation() == 270) {
                    this.matrix.postTranslate(0.0f, this.scale * (float)this.sWidth);
                }
                if (this.tileBgPaint != null) {
                    if (this.sRect == null) {
                        this.sRect = new RectF();
                    }
                    RectF rectF = this.sRect;
                    int n8 = this.bitmapIsPreview ? this.bitmap.getWidth() : this.sWidth;
                    f9 = n8;
                    n8 = this.bitmapIsPreview ? this.bitmap.getHeight() : this.sHeight;
                    f8 = n8;
                    rectF.set(0.0f, 0.0f, f9, f8);
                    this.matrix.mapRect(this.sRect);
                    canvas.drawRect(this.sRect, this.tileBgPaint);
                }
                if (this.bitmap.isRecycled()) {
                    return;
                }
                canvas.drawBitmap(this.bitmap, this.matrix, this.bitmapPaint);
            }
        } else {
            int n9 = Math.min(this.fullImageSampleSize, this.calculateInSampleSize(this.scale));
            Iterator<Map.Entry<Integer, List<Tile>>> iterator = this.tileMap.entrySet().iterator();
            boolean bl = false;
            block2: while (iterator.hasNext()) {
                Map.Entry<Integer, List<Tile>> entry = iterator.next();
                if (entry.getKey() != n9) continue;
                object = entry.getValue().iterator();
                boolean bl3 = bl;
                while (true) {
                    bl = bl3;
                    if (!object.hasNext()) continue block2;
                    Tile tile = object.next();
                    if (!tile.visible || !tile.loading && tile.bitmap != null) continue;
                    bl3 = true;
                }
            }
            for (Map.Entry<Integer, List<Tile>> entry : this.tileMap.entrySet()) {
                if (entry.getKey() != n9 && !bl) continue;
                for (Tile tile : entry.getValue()) {
                    this.sourceToViewRect(tile.sRect, tile.vRect);
                    if (!tile.loading && tile.bitmap != null) {
                        if (this.tileBgPaint != null) {
                            canvas.drawRect(tile.vRect, this.tileBgPaint);
                        }
                        if (this.matrix == null) {
                            this.matrix = new Matrix();
                        }
                        this.matrix.reset();
                        this.setMatrixArray(this.srcArray, 0.0f, 0.0f, tile.bitmap.getWidth(), 0.0f, tile.bitmap.getWidth(), tile.bitmap.getHeight(), 0.0f, tile.bitmap.getHeight());
                        if (this.getRequiredRotation() == 0) {
                            this.setMatrixArray(this.dstArray, ((Tile)tile).vRect.left, ((Tile)tile).vRect.top, ((Tile)tile).vRect.right, ((Tile)tile).vRect.top, ((Tile)tile).vRect.right, ((Tile)tile).vRect.bottom, ((Tile)tile).vRect.left, ((Tile)tile).vRect.bottom);
                        } else if (this.getRequiredRotation() == 90) {
                            this.setMatrixArray(this.dstArray, ((Tile)tile).vRect.right, ((Tile)tile).vRect.top, ((Tile)tile).vRect.right, ((Tile)tile).vRect.bottom, ((Tile)tile).vRect.left, ((Tile)tile).vRect.bottom, ((Tile)tile).vRect.left, ((Tile)tile).vRect.top);
                        } else if (this.getRequiredRotation() == 180) {
                            this.setMatrixArray(this.dstArray, ((Tile)tile).vRect.right, ((Tile)tile).vRect.bottom, ((Tile)tile).vRect.left, ((Tile)tile).vRect.bottom, ((Tile)tile).vRect.left, ((Tile)tile).vRect.top, ((Tile)tile).vRect.right, ((Tile)tile).vRect.top);
                        } else if (this.getRequiredRotation() == 270) {
                            this.setMatrixArray(this.dstArray, ((Tile)tile).vRect.left, ((Tile)tile).vRect.bottom, ((Tile)tile).vRect.left, ((Tile)tile).vRect.top, ((Tile)tile).vRect.right, ((Tile)tile).vRect.top, ((Tile)tile).vRect.right, ((Tile)tile).vRect.bottom);
                        }
                        this.matrix.setPolyToPoly(this.srcArray, 0, this.dstArray, 0, 4);
                        canvas.drawBitmap(tile.bitmap, this.matrix, this.bitmapPaint);
                        if (this.debug) {
                            canvas.drawRect(tile.vRect, this.debugLinePaint);
                        }
                    } else if (tile.loading && this.debug) {
                        canvas.drawText("LOADING", (float)(((Tile)tile).vRect.left + this.px(5)), (float)(((Tile)tile).vRect.top + this.px(35)), this.debugTextPaint);
                    }
                    if (!tile.visible || !this.debug) continue;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("ISS ");
                    stringBuilder.append(tile.sampleSize);
                    stringBuilder.append(" RECT ");
                    stringBuilder.append(((Tile)tile).sRect.top);
                    stringBuilder.append(",");
                    stringBuilder.append(((Tile)tile).sRect.left);
                    stringBuilder.append(",");
                    stringBuilder.append(((Tile)tile).sRect.bottom);
                    stringBuilder.append(",");
                    stringBuilder.append(((Tile)tile).sRect.right);
                    canvas.drawText(stringBuilder.toString(), (float)(((Tile)tile).vRect.left + this.px(5)), (float)(((Tile)tile).vRect.top + this.px(15)), this.debugTextPaint);
                }
            }
        }
        if (!this.debug) return;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Scale: ");
        Locale locale = Locale.ENGLISH;
        stringBuilder.append(String.format(locale, "%.2f", Float.valueOf(this.scale)));
        stringBuilder.append(" (");
        stringBuilder.append(String.format(locale, "%.2f", Float.valueOf(this.minScale())));
        stringBuilder.append(" - ");
        stringBuilder.append(String.format(locale, "%.2f", Float.valueOf(this.maxScale)));
        stringBuilder.append(")");
        canvas.drawText(stringBuilder.toString(), (float)this.px(5), (float)this.px(15), this.debugTextPaint);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Translate: ");
        stringBuilder2.append(String.format(locale, "%.2f", Float.valueOf(this.vTranslate.x)));
        stringBuilder2.append(":");
        stringBuilder2.append(String.format(locale, "%.2f", Float.valueOf(this.vTranslate.y)));
        canvas.drawText(stringBuilder2.toString(), (float)this.px(5), (float)this.px(30), this.debugTextPaint);
        PointF pointF = this.getCenter();
        object = new StringBuilder();
        ((StringBuilder)object).append("Source center: ");
        ((StringBuilder)object).append(String.format(locale, "%.2f", Float.valueOf(pointF.x)));
        ((StringBuilder)object).append(":");
        ((StringBuilder)object).append(String.format(locale, "%.2f", Float.valueOf(pointF.y)));
        canvas.drawText(((StringBuilder)object).toString(), (float)this.px(5), (float)this.px(45), this.debugTextPaint);
        Anim anim2 = this.anim;
        if (anim2 != null) {
            object = this.sourceToViewCoord(anim2.sCenterStart);
            PointF pointF3 = this.sourceToViewCoord(this.anim.sCenterEndRequested);
            PointF pointF4 = this.sourceToViewCoord(this.anim.sCenterEnd);
            canvas.drawCircle(((PointF)object).x, ((PointF)object).y, (float)this.px(10), this.debugLinePaint);
            this.debugLinePaint.setColor(-65536);
            canvas.drawCircle(pointF3.x, pointF3.y, (float)this.px(20), this.debugLinePaint);
            this.debugLinePaint.setColor(-16776961);
            canvas.drawCircle(pointF4.x, pointF4.y, (float)this.px(25), this.debugLinePaint);
            this.debugLinePaint.setColor(-16711681);
            canvas.drawCircle((float)(this.getWidth() / 2), (float)(this.getHeight() / 2), (float)this.px(30), this.debugLinePaint);
        }
        if (this.vCenterStart != null) {
            this.debugLinePaint.setColor(-65536);
            PointF pointF5 = this.vCenterStart;
            canvas.drawCircle(pointF5.x, pointF5.y, (float)this.px(20), this.debugLinePaint);
        }
        if (this.quickScaleSCenter != null) {
            this.debugLinePaint.setColor(-16776961);
            canvas.drawCircle(this.sourceToViewX(this.quickScaleSCenter.x), this.sourceToViewY(this.quickScaleSCenter.y), (float)this.px(35), this.debugLinePaint);
        }
        if (this.quickScaleVStart != null && this.isQuickScaling) {
            this.debugLinePaint.setColor(-16711681);
            PointF pointF6 = this.quickScaleVStart;
            canvas.drawCircle(pointF6.x, pointF6.y, (float)this.px(30), this.debugLinePaint);
        }
        this.debugLinePaint.setColor(-65281);
    }

    protected void onImageLoaded() {
    }

    protected void onMeasure(int n8, int n9) {
        int n10 = View.MeasureSpec.getMode((int)n8);
        int n11 = View.MeasureSpec.getMode((int)n9);
        int n12 = View.MeasureSpec.getSize((int)n8);
        int n13 = View.MeasureSpec.getSize((int)n9);
        boolean bl = false;
        n10 = n10 != 0x40000000 ? 1 : 0;
        if (n11 != 0x40000000) {
            bl = true;
        }
        n8 = n12;
        n9 = n13;
        if (this.sWidth > 0) {
            n8 = n12;
            n9 = n13;
            if (this.sHeight > 0) {
                if (n10 != 0 && bl) {
                    n8 = this.sWidth();
                    n9 = this.sHeight();
                } else if (bl) {
                    n9 = (int)((double)this.sHeight() / (double)this.sWidth() * (double)n12);
                    n8 = n12;
                } else {
                    n8 = n12;
                    n9 = n13;
                    if (n10 != 0) {
                        n8 = (int)((double)this.sWidth() / (double)this.sHeight() * (double)n13);
                        n9 = n13;
                    }
                }
            }
        }
        this.setMeasuredDimension(Math.max(n8, this.getSuggestedMinimumWidth()), Math.max(n9, this.getSuggestedMinimumHeight()));
    }

    protected void onReady() {
    }

    protected void onSizeChanged(int n8, int n9, int n10, int n11) {
        this.debug("onSizeChanged %dx%d -> %dx%d", n10, n11, n8, n9);
        PointF pointF = this.getCenter();
        if (this.readySent && pointF != null) {
            this.anim = null;
            this.pendingScale = Float.valueOf(this.scale);
            this.sPendingCenter = pointF;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Anim anim = this.anim;
        boolean bl = true;
        if (anim != null && !anim.interruptible) {
            this.requestDisallowInterceptTouchEvent(true);
            return true;
        }
        anim = this.anim;
        if (anim != null && anim.listener != null) {
            try {
                this.anim.listener.onInterruptedByUser();
            }
            catch (Exception exception) {
                Log.w((String)TAG, (String)"Error thrown by animation listener", (Throwable)exception);
            }
        }
        this.anim = null;
        if (this.vTranslate == null) {
            anim = this.singleDetector;
            if (anim != null) {
                anim.onTouchEvent(motionEvent);
            }
            return true;
        }
        if (!this.isQuickScaling && ((anim = this.detector) == null || anim.onTouchEvent(motionEvent))) {
            this.isZooming = false;
            this.isPanning = false;
            this.maxTouchCount = 0;
            return true;
        }
        if (this.vTranslateStart == null) {
            this.vTranslateStart = new PointF(0.0f, 0.0f);
        }
        if (this.vTranslateBefore == null) {
            this.vTranslateBefore = new PointF(0.0f, 0.0f);
        }
        if (this.vCenterStart == null) {
            this.vCenterStart = new PointF(0.0f, 0.0f);
        }
        float f8 = this.scale;
        this.vTranslateBefore.set(this.vTranslate);
        boolean bl2 = this.onTouchEventInternal(motionEvent);
        this.sendStateChanged(f8, this.vTranslateBefore, 2);
        boolean bl3 = bl;
        if (!bl2) {
            bl3 = super.onTouchEvent(motionEvent) ? bl : false;
        }
        return bl3;
    }

    public void recycle() {
        this.reset(true);
        this.bitmapPaint = null;
        this.debugTextPaint = null;
        this.debugLinePaint = null;
        this.tileBgPaint = null;
    }

    public final void resetScaleAndCenter() {
        this.anim = null;
        this.pendingScale = Float.valueOf(this.limitedScale(0.0f));
        this.sPendingCenter = this.isReady() ? new PointF((float)(this.sWidth() / 2), (float)(this.sHeight() / 2)) : new PointF(0.0f, 0.0f);
        this.invalidate();
    }

    public final void setBitmapDecoderClass(Class<? extends ImageDecoder> clazz) {
        if (clazz != null) {
            this.bitmapDecoderFactory = new CompatDecoderFactory<ImageDecoder>(clazz);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setBitmapDecoderFactory(DecoderFactory<? extends ImageDecoder> decoderFactory) {
        if (decoderFactory != null) {
            this.bitmapDecoderFactory = decoderFactory;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setDebug(boolean bl) {
        this.debug = bl;
    }

    public final void setDoubleTapZoomDpi(int n8) {
        this.setDoubleTapZoomScale(this.averageDpi(this.getResources().getDisplayMetrics()) / (float)n8);
    }

    public final void setDoubleTapZoomDuration(int n8) {
        this.doubleTapZoomDuration = Math.max(0, n8);
    }

    public final void setDoubleTapZoomScale(float f8) {
        this.doubleTapZoomScale = f8;
    }

    public final void setDoubleTapZoomStyle(int n8) {
        if (VALID_ZOOM_STYLES.contains(n8)) {
            this.doubleTapZoomStyle = n8;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid zoom style: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void setEagerLoadingEnabled(boolean bl) {
        this.eagerLoadingEnabled = bl;
    }

    public void setExecutor(Executor executor) {
        if (executor != null) {
            this.executor = executor;
            return;
        }
        throw new NullPointerException("Executor must not be null");
    }

    public final void setImage(ImageSource imageSource) {
        this.setImage(imageSource, null, null);
    }

    public final void setImage(ImageSource imageSource, ImageSource imageSource2) {
        this.setImage(imageSource, imageSource2, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void setImage(ImageSource imageSource, ImageSource object, ImageViewState imageViewState) {
        if (imageSource == null) throw new NullPointerException("imageSource must not be null");
        this.reset(true);
        if (imageViewState != null) {
            this.restoreState(imageViewState);
        }
        if (object != null) {
            if (imageSource.getBitmap() != null) throw new IllegalArgumentException("Preview image cannot be used when a bitmap is provided for the main image");
            if (imageSource.getSWidth() <= 0 || imageSource.getSHeight() <= 0) throw new IllegalArgumentException("Preview image cannot be used unless dimensions are provided for the main image");
            this.sWidth = imageSource.getSWidth();
            this.sHeight = imageSource.getSHeight();
            this.pRegion = ((ImageSource)object).getSRegion();
            if (((ImageSource)object).getBitmap() != null) {
                this.bitmapIsCached = ((ImageSource)object).isCached();
                this.onPreviewLoaded(((ImageSource)object).getBitmap());
            } else {
                object = ((ImageSource)object).getFactory();
                this.execute(new BitmapLoadTask(this, this.getContext(), this.bitmapDecoderFactory, (DecodeInputStreamFactory)object, true));
            }
        }
        if (imageSource.getBitmap() != null && imageSource.getSRegion() != null) {
            this.onImageLoaded(Bitmap.createBitmap((Bitmap)imageSource.getBitmap(), (int)imageSource.getSRegion().left, (int)imageSource.getSRegion().top, (int)imageSource.getSRegion().width(), (int)imageSource.getSRegion().height()), 0, false);
            return;
        }
        if (imageSource.getBitmap() != null) {
            this.onImageLoaded(imageSource.getBitmap(), 0, imageSource.isCached());
            return;
        }
        this.sRegion = imageSource.getSRegion();
        this.inputStreamFactory = imageSource.getFactory();
        if (!imageSource.getTile() && this.sRegion == null) {
            this.execute(new BitmapLoadTask(this, this.getContext(), this.bitmapDecoderFactory, this.inputStreamFactory, false));
            return;
        }
        this.execute(new TilesInitTask(this, this.getContext(), this.regionDecoderFactory, this.inputStreamFactory));
    }

    public final void setImage(ImageSource imageSource, ImageViewState imageViewState) {
        this.setImage(imageSource, null, imageViewState);
    }

    public final void setMaxScale(float f8) {
        this.maxScale = f8;
    }

    public void setMaxTileSize(int n8) {
        this.maxTileWidth = n8;
        this.maxTileHeight = n8;
    }

    public void setMaxTileSize(int n8, int n9) {
        this.maxTileWidth = n8;
        this.maxTileHeight = n9;
    }

    public final void setMaximumDpi(int n8) {
        this.setMinScale(this.averageDpi(this.getResources().getDisplayMetrics()) / (float)n8);
    }

    public final void setMinScale(float f8) {
        this.minScale = f8;
    }

    public final void setMinimumDpi(int n8) {
        this.setMaxScale(this.averageDpi(this.getResources().getDisplayMetrics()) / (float)n8);
    }

    public final void setMinimumScaleType(int n8) {
        if (VALID_SCALE_TYPES.contains(n8)) {
            this.minimumScaleType = n8;
            if (this.isReady()) {
                this.fitToBounds(true);
                this.invalidate();
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid scale type: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public void setMinimumTileDpi(int n8) {
        this.minimumTileDpi = (int)Math.min(this.averageDpi(this.getResources().getDisplayMetrics()), (float)n8);
        if (this.isReady()) {
            this.reset(false);
            this.invalidate();
        }
    }

    public void setOnImageEventListener(OnImageEventListener onImageEventListener) {
        this.onImageEventListener = onImageEventListener;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.onLongClickListener = onLongClickListener;
    }

    public void setOnStateChangedListener(OnStateChangedListener onStateChangedListener) {
        this.onStateChangedListener = onStateChangedListener;
    }

    public final void setOrientation(int n8) {
        if (n8 != -1) {
            if (VALID_ORIENTATIONS.contains(n8)) {
                this.orientation = n8;
                this.reset(false);
                this.invalidate();
                this.requestLayout();
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid orientation: ");
            stringBuilder.append(n8);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid orientation: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void setPanEnabled(boolean bl) {
        PointF pointF;
        this.panEnabled = bl;
        if (!bl && (pointF = this.vTranslate) != null) {
            pointF.x = (float)(this.getWidth() / 2) - this.scale * (float)(this.sWidth() / 2);
            this.vTranslate.y = (float)(this.getHeight() / 2) - this.scale * (float)(this.sHeight() / 2);
            if (this.isReady()) {
                this.refreshRequiredTiles(true);
                this.invalidate();
            }
        }
    }

    public final void setPanLimit(int n8) {
        if (VALID_PAN_LIMITS.contains(n8)) {
            this.panLimit = n8;
            if (this.isReady()) {
                this.fitToBounds(true);
                this.invalidate();
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid pan limit: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void setQuickScaleEnabled(boolean bl) {
        this.quickScaleEnabled = bl;
    }

    public final void setRegionDecoderClass(Class<? extends ImageRegionDecoder> clazz) {
        if (clazz != null) {
            this.regionDecoderFactory = new CompatDecoderFactory<ImageRegionDecoder>(clazz);
            return;
        }
        throw new IllegalArgumentException("Decoder class cannot be set to null");
    }

    public final void setRegionDecoderFactory(DecoderFactory<? extends ImageRegionDecoder> decoderFactory) {
        if (decoderFactory != null) {
            this.regionDecoderFactory = decoderFactory;
            return;
        }
        throw new IllegalArgumentException("Decoder factory cannot be set to null");
    }

    public final void setScaleAndCenter(float f8, PointF pointF) {
        this.anim = null;
        this.pendingScale = Float.valueOf(f8);
        this.sPendingCenter = pointF;
        this.sRequestedCenter = pointF;
        this.invalidate();
    }

    public final void setTileBackgroundColor(int n8) {
        if (Color.alpha((int)n8) == 0) {
            this.tileBgPaint = null;
        } else {
            Paint paint;
            this.tileBgPaint = paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            this.tileBgPaint.setColor(n8);
        }
        this.invalidate();
    }

    public final void setTileBackgroundPaint(Paint paint) {
        this.tileBgPaint = paint;
    }

    public final void setZoomEnabled(boolean bl) {
        this.zoomEnabled = bl;
    }

    public final PointF sourceToViewCoord(float f8, float f9) {
        return this.sourceToViewCoord(f8, f9, new PointF());
    }

    public final PointF sourceToViewCoord(float f8, float f9, PointF pointF) {
        if (this.vTranslate == null) {
            return null;
        }
        pointF.set(this.sourceToViewX(f8), this.sourceToViewY(f9));
        return pointF;
    }

    public final PointF sourceToViewCoord(PointF pointF) {
        return this.sourceToViewCoord(pointF.x, pointF.y, new PointF());
    }

    public final PointF sourceToViewCoord(PointF pointF, PointF pointF2) {
        return this.sourceToViewCoord(pointF.x, pointF.y, pointF2);
    }

    public void viewToFileRect(Rect rect, Rect rect2) {
        if (this.vTranslate != null && this.readySent) {
            rect2.set((int)this.viewToSourceX(rect.left), (int)this.viewToSourceY(rect.top), (int)this.viewToSourceX(rect.right), (int)this.viewToSourceY(rect.bottom));
            this.fileSRect(rect2, rect2);
            rect2.set(Math.max(0, rect2.left), Math.max(0, rect2.top), Math.min(this.sWidth, rect2.right), Math.min(this.sHeight, rect2.bottom));
            rect = this.sRegion;
            if (rect != null) {
                rect2.offset(rect.left, rect.top);
            }
        }
    }

    public final PointF viewToSourceCoord(float f8, float f9) {
        return this.viewToSourceCoord(f8, f9, new PointF());
    }

    public final PointF viewToSourceCoord(float f8, float f9, PointF pointF) {
        if (this.vTranslate == null) {
            return null;
        }
        pointF.set(this.viewToSourceX(f8), this.viewToSourceY(f9));
        return pointF;
    }

    public final PointF viewToSourceCoord(PointF pointF) {
        return this.viewToSourceCoord(pointF.x, pointF.y, new PointF());
    }

    public final PointF viewToSourceCoord(PointF pointF, PointF pointF2) {
        return this.viewToSourceCoord(pointF.x, pointF.y, pointF2);
    }

    public void visibleFileRect(Rect rect) {
        if (this.vTranslate != null && this.readySent) {
            rect.set(0, 0, this.getWidth(), this.getHeight());
            this.viewToFileRect(rect, rect);
        }
    }

    private static class Anim {
        private long duration = 500L;
        private int easing = 2;
        private boolean interruptible = true;
        private OnAnimationEventListener listener;
        private int origin = 1;
        private PointF sCenterEnd;
        private PointF sCenterEndRequested;
        private PointF sCenterStart;
        private float scaleEnd;
        private float scaleStart;
        private long time = System.currentTimeMillis();
        private PointF vFocusEnd;
        private PointF vFocusStart;

        private Anim() {
        }

        static /* synthetic */ boolean access$2702(Anim anim, boolean bl) {
            anim.interruptible = bl;
            return bl;
        }

        static /* synthetic */ OnAnimationEventListener access$2802(Anim anim, OnAnimationEventListener onAnimationEventListener) {
            anim.listener = onAnimationEventListener;
            return onAnimationEventListener;
        }

        static /* synthetic */ PointF access$3102(Anim anim, PointF pointF) {
            anim.vFocusStart = pointF;
            return pointF;
        }

        static /* synthetic */ long access$3202(Anim anim, long l8) {
            anim.time = l8;
            return l8;
        }

        static /* synthetic */ long access$3302(Anim anim, long l8) {
            anim.duration = l8;
            return l8;
        }

        static /* synthetic */ int access$3402(Anim anim, int n8) {
            anim.easing = n8;
            return n8;
        }

        static /* synthetic */ float access$3502(Anim anim, float f8) {
            anim.scaleStart = f8;
            return f8;
        }

        static /* synthetic */ float access$3602(Anim anim, float f8) {
            anim.scaleEnd = f8;
            return f8;
        }

        static /* synthetic */ PointF access$3702(Anim anim, PointF pointF) {
            anim.vFocusEnd = pointF;
            return pointF;
        }

        static /* synthetic */ PointF access$3802(Anim anim, PointF pointF) {
            anim.sCenterEnd = pointF;
            return pointF;
        }

        static /* synthetic */ int access$3902(Anim anim, int n8) {
            anim.origin = n8;
            return n8;
        }

        static /* synthetic */ PointF access$4402(Anim anim, PointF pointF) {
            anim.sCenterStart = pointF;
            return pointF;
        }

        static /* synthetic */ PointF access$4502(Anim anim, PointF pointF) {
            anim.sCenterEndRequested = pointF;
            return pointF;
        }
    }

    public final class AnimationBuilder {
        private long duration;
        private int easing;
        private boolean interruptible;
        private OnAnimationEventListener listener;
        private int origin;
        private boolean panLimited;
        private final PointF targetSCenter;
        private final float targetScale;
        final SubsamplingScaleImageView this$0;
        private final PointF vFocus;

        private AnimationBuilder(SubsamplingScaleImageView subsamplingScaleImageView, float f8) {
            this.this$0 = subsamplingScaleImageView;
            this.duration = 500L;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f8;
            this.targetSCenter = subsamplingScaleImageView.getCenter();
            this.vFocus = null;
        }

        private AnimationBuilder(SubsamplingScaleImageView subsamplingScaleImageView, float f8, PointF pointF) {
            this.this$0 = subsamplingScaleImageView;
            this.duration = 500L;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f8;
            this.targetSCenter = pointF;
            this.vFocus = null;
        }

        private AnimationBuilder(SubsamplingScaleImageView subsamplingScaleImageView, float f8, PointF pointF, PointF pointF2) {
            this.this$0 = subsamplingScaleImageView;
            this.duration = 500L;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f8;
            this.targetSCenter = pointF;
            this.vFocus = pointF2;
        }

        private AnimationBuilder(SubsamplingScaleImageView subsamplingScaleImageView, PointF pointF) {
            this.this$0 = subsamplingScaleImageView;
            this.duration = 500L;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = subsamplingScaleImageView.scale;
            this.targetSCenter = pointF;
            this.vFocus = null;
        }

        private AnimationBuilder withOrigin(int n8) {
            this.origin = n8;
            return this;
        }

        private AnimationBuilder withPanLimited(boolean bl) {
            this.panLimited = bl;
            return this;
        }

        public void start() {
            Object object;
            if (this.this$0.anim != null && this.this$0.anim.listener != null) {
                try {
                    this.this$0.anim.listener.onInterruptedByNewAnim();
                }
                catch (Exception exception) {
                    Log.w((String)TAG, (String)"Error thrown by animation listener", (Throwable)exception);
                }
            }
            int n8 = this.this$0.getPaddingLeft();
            int n9 = (this.this$0.getWidth() - this.this$0.getPaddingRight() - this.this$0.getPaddingLeft()) / 2;
            int n10 = this.this$0.getPaddingTop();
            int n11 = (this.this$0.getHeight() - this.this$0.getPaddingBottom() - this.this$0.getPaddingTop()) / 2;
            float f8 = this.this$0.limitedScale(this.targetScale);
            if (this.panLimited) {
                SubsamplingScaleImageView subsamplingScaleImageView = this.this$0;
                object = this.targetSCenter;
                object = subsamplingScaleImageView.limitedSCenter(object.x, object.y, f8, new PointF());
            } else {
                object = this.targetSCenter;
            }
            SubsamplingScaleImageView.access$6302(this.this$0, new Anim());
            Anim.access$3502(this.this$0.anim, this.this$0.scale);
            Anim.access$3602(this.this$0.anim, f8);
            Anim.access$3202(this.this$0.anim, System.currentTimeMillis());
            Anim.access$4502(this.this$0.anim, object);
            Anim.access$4402(this.this$0.anim, this.this$0.getCenter());
            Anim.access$3802(this.this$0.anim, object);
            Anim.access$3102(this.this$0.anim, this.this$0.sourceToViewCoord((PointF)object));
            Anim.access$3702(this.this$0.anim, new PointF((float)(n8 + n9), (float)(n10 + n11)));
            Anim.access$3302(this.this$0.anim, this.duration);
            Anim.access$2702(this.this$0.anim, this.interruptible);
            Anim.access$3402(this.this$0.anim, this.easing);
            Anim.access$3902(this.this$0.anim, this.origin);
            Anim.access$3202(this.this$0.anim, System.currentTimeMillis());
            Anim.access$2802(this.this$0.anim, this.listener);
            object = this.vFocus;
            if (object != null) {
                float f9 = object.x - ((Anim)((SubsamplingScaleImageView)this.this$0).anim).sCenterStart.x * f8;
                float f10 = this.vFocus.y - ((Anim)((SubsamplingScaleImageView)this.this$0).anim).sCenterStart.y * f8;
                object = new ScaleAndTranslate(f8, new PointF(f9, f10));
                this.this$0.fitToBounds(true, (ScaleAndTranslate)object);
                Anim.access$3702(this.this$0.anim, new PointF(this.vFocus.x + (((ScaleAndTranslate)object).vTranslate.x - f9), this.vFocus.y + (((ScaleAndTranslate)object).vTranslate.y - f10)));
            }
            this.this$0.invalidate();
        }

        public AnimationBuilder withDuration(long l8) {
            this.duration = l8;
            return this;
        }

        public AnimationBuilder withEasing(int n8) {
            if (VALID_EASING_STYLES.contains(n8)) {
                this.easing = n8;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown easing type: ");
            stringBuilder.append(n8);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public AnimationBuilder withInterruptible(boolean bl) {
            this.interruptible = bl;
            return this;
        }

        public AnimationBuilder withOnAnimationEventListener(OnAnimationEventListener onAnimationEventListener) {
            this.listener = onAnimationEventListener;
            return this;
        }
    }

    private static class BitmapLoadTask
    extends AsyncTask<Void, Void, Integer> {
        private Bitmap bitmap;
        private final WeakReference<Context> contextRef;
        private final WeakReference<DecoderFactory<? extends ImageDecoder>> decoderFactoryRef;
        private Exception exception;
        private final DecodeInputStreamFactory inputStreamFactory;
        private final boolean preview;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        BitmapLoadTask(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageDecoder> decoderFactory, DecodeInputStreamFactory decodeInputStreamFactory, boolean bl) {
            this.viewRef = new WeakReference<SubsamplingScaleImageView>(subsamplingScaleImageView);
            this.contextRef = new WeakReference<Context>(context);
            this.decoderFactoryRef = new WeakReference<DecoderFactory<? extends ImageDecoder>>(decoderFactory);
            this.inputStreamFactory = decodeInputStreamFactory;
            this.preview = bl;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        protected Integer doInBackground(Void ... object) {
            Exception exception2;
            block5: {
                OutOfMemoryError outOfMemoryError2;
                block4: {
                    Context context = (Context)this.contextRef.get();
                    DecoderFactory decoderFactory = (DecoderFactory)this.decoderFactoryRef.get();
                    SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView)((Object)this.viewRef.get());
                    if (context == null || decoderFactory == null || subsamplingScaleImageView == null) return null;
                    try {
                        subsamplingScaleImageView.debug("BitmapLoadTask.doInBackground", new Object[0]);
                        this.bitmap = ((ImageDecoder)decoderFactory.make()).decode(context, this.inputStreamFactory);
                    }
                    catch (OutOfMemoryError outOfMemoryError2) {
                        break block4;
                    }
                    catch (Exception exception2) {
                        break block5;
                    }
                    return 0;
                }
                Log.e((String)TAG, (String)"Failed to load bitmap - OutOfMemoryError", (Throwable)outOfMemoryError2);
                this.exception = new RuntimeException(outOfMemoryError2);
                return null;
            }
            Log.e((String)TAG, (String)"Failed to load bitmap", (Throwable)exception2);
            this.exception = exception2;
            return null;
        }

        protected void onPostExecute(Integer n8) {
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView)((Object)this.viewRef.get());
            if (subsamplingScaleImageView != null) {
                Bitmap bitmap = this.bitmap;
                if (bitmap != null && n8 != null) {
                    if (this.preview) {
                        subsamplingScaleImageView.onPreviewLoaded(bitmap);
                        return;
                    }
                    subsamplingScaleImageView.onImageLoaded(bitmap, n8, false);
                    return;
                }
                if (this.exception != null && subsamplingScaleImageView.onImageEventListener != null) {
                    if (this.preview) {
                        subsamplingScaleImageView.onImageEventListener.onPreviewLoadError(this.exception);
                        return;
                    }
                    subsamplingScaleImageView.onImageEventListener.onImageLoadError(this.exception);
                }
            }
        }
    }

    public static interface DecodeInputStreamFactory {
        public InputStream createInputStream() throws IOException;
    }

    public static class DefaultOnAnimationEventListener
    implements OnAnimationEventListener {
        @Override
        public void onComplete() {
        }

        @Override
        public void onInterruptedByNewAnim() {
        }

        @Override
        public void onInterruptedByUser() {
        }
    }

    public static class DefaultOnImageEventListener
    implements OnImageEventListener {
        @Override
        public void onImageLoadError(Exception exception) {
        }

        @Override
        public void onImageLoaded() {
        }

        @Override
        public void onPreviewLoadError(Exception exception) {
        }

        @Override
        public void onPreviewReleased() {
        }

        @Override
        public void onReady() {
        }

        @Override
        public void onTileLoadError(Exception exception) {
        }

        @Override
        public void onTileLoaded(boolean bl) {
        }
    }

    public static class DefaultOnStateChangedListener
    implements OnStateChangedListener {
        @Override
        public void onCenterChanged(PointF pointF, int n8) {
        }

        @Override
        public void onScaleChanged(float f8, int n8) {
        }
    }

    public static interface OnAnimationEventListener {
        public void onComplete();

        public void onInterruptedByNewAnim();

        public void onInterruptedByUser();
    }

    public static interface OnImageEventListener {
        public void onImageLoadError(Exception var1);

        public void onImageLoaded();

        public void onPreviewLoadError(Exception var1);

        public void onPreviewReleased();

        public void onReady();

        public void onTileLoadError(Exception var1);

        public void onTileLoaded(boolean var1);
    }

    public static interface OnStateChangedListener {
        public void onCenterChanged(PointF var1, int var2);

        public void onScaleChanged(float var1, int var2);
    }

    private static class ScaleAndTranslate {
        private float scale;
        private final PointF vTranslate;

        private ScaleAndTranslate(float f8, PointF pointF) {
            this.scale = f8;
            this.vTranslate = pointF;
        }

        static /* synthetic */ float access$4702(ScaleAndTranslate scaleAndTranslate, float f8) {
            scaleAndTranslate.scale = f8;
            return f8;
        }
    }

    private static class Tile {
        private Bitmap bitmap;
        private Rect fileSRect;
        private boolean loading;
        private Rect sRect;
        private int sampleSize;
        private Rect vRect;
        private boolean visible;

        private Tile() {
        }

        static /* synthetic */ boolean access$4002(Tile tile, boolean bl) {
            tile.loading = bl;
            return bl;
        }

        static /* synthetic */ boolean access$402(Tile tile, boolean bl) {
            tile.visible = bl;
            return bl;
        }

        static /* synthetic */ Rect access$4102(Tile tile, Rect rect) {
            tile.sRect = rect;
            return rect;
        }

        static /* synthetic */ Rect access$4202(Tile tile, Rect rect) {
            tile.vRect = rect;
            return rect;
        }

        static /* synthetic */ int access$4302(Tile tile, int n8) {
            tile.sampleSize = n8;
            return n8;
        }

        static /* synthetic */ Rect access$5002(Tile tile, Rect rect) {
            tile.fileSRect = rect;
            return rect;
        }

        static /* synthetic */ Bitmap access$502(Tile tile, Bitmap bitmap) {
            tile.bitmap = bitmap;
            return bitmap;
        }
    }

    private static class TileLoadTask
    extends AsyncTask<Void, Void, Bitmap> {
        private final WeakReference<ImageRegionDecoder> decoderRef;
        private Exception exception;
        private final boolean isFullImage;
        private final WeakReference<Tile> tileRef;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        TileLoadTask(SubsamplingScaleImageView subsamplingScaleImageView, ImageRegionDecoder imageRegionDecoder, Tile tile, boolean bl) {
            this.viewRef = new WeakReference<SubsamplingScaleImageView>(subsamplingScaleImageView);
            this.decoderRef = new WeakReference<ImageRegionDecoder>(imageRegionDecoder);
            this.tileRef = new WeakReference<Tile>(tile);
            Tile.access$4002(tile, true);
            this.isFullImage = bl;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Bitmap doInBackground(Void ... object) {
            Exception exception2;
            block12: {
                OutOfMemoryError outOfMemoryError2;
                block11: {
                    Tile tile;
                    block9: {
                        Throwable throwable2;
                        block13: {
                            block10: {
                                object = (SubsamplingScaleImageView)((Object)this.viewRef.get());
                                ImageRegionDecoder imageRegionDecoder = (ImageRegionDecoder)this.decoderRef.get();
                                tile = (Tile)this.tileRef.get();
                                if (imageRegionDecoder == null || tile == null || object == null || !imageRegionDecoder.isReady() || !tile.visible) break block9;
                                ((SubsamplingScaleImageView)((Object)object)).debug("TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", new Object[]{tile.sRect, tile.sampleSize});
                                ((SubsamplingScaleImageView)((Object)object)).decoderLock.readLock().lock();
                                try {
                                    if (!imageRegionDecoder.isReady()) break block10;
                                    ((SubsamplingScaleImageView)((Object)object)).fileSRect(tile.sRect, tile.fileSRect);
                                    if (((SubsamplingScaleImageView)((Object)object)).sRegion != null) {
                                        tile.fileSRect.offset(((SubsamplingScaleImageView)((Object)object)).sRegion.left, ((SubsamplingScaleImageView)((Object)object)).sRegion.top);
                                    }
                                    tile = imageRegionDecoder.decodeRegion(tile.fileSRect, tile.sampleSize, this.isFullImage);
                                }
                                catch (Throwable throwable2) {}
                                ((SubsamplingScaleImageView)((Object)object)).decoderLock.readLock().unlock();
                                return tile;
                            }
                            Tile.access$4002(tile, false);
                            break block13;
                            try {
                                ((SubsamplingScaleImageView)((Object)object)).decoderLock.readLock().unlock();
                                return null;
                            }
                            catch (OutOfMemoryError outOfMemoryError2) {
                                break block11;
                            }
                            catch (Exception exception2) {
                                break block12;
                            }
                        }
                        ((SubsamplingScaleImageView)((Object)object)).decoderLock.readLock().unlock();
                        throw throwable2;
                    }
                    if (tile == null) return null;
                    Tile.access$4002(tile, false);
                    return null;
                }
                Log.e((String)TAG, (String)"Failed to decode tile - OutOfMemoryError", (Throwable)outOfMemoryError2);
                this.exception = new RuntimeException(outOfMemoryError2);
                return null;
            }
            Log.e((String)TAG, (String)"Failed to decode tile", (Throwable)exception2);
            this.exception = exception2;
            return null;
        }

        protected void onPostExecute(Bitmap bitmap) {
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView)((Object)this.viewRef.get());
            Tile tile = (Tile)this.tileRef.get();
            if (subsamplingScaleImageView != null && tile != null) {
                if (bitmap != null) {
                    Tile.access$502(tile, bitmap);
                    Tile.access$4002(tile, false);
                    subsamplingScaleImageView.onTileLoaded();
                    if (subsamplingScaleImageView.onImageEventListener != null) {
                        subsamplingScaleImageView.onImageEventListener.onTileLoaded(this.isFullImage);
                        return;
                    }
                } else if (this.exception != null && subsamplingScaleImageView.onImageEventListener != null) {
                    subsamplingScaleImageView.onImageEventListener.onTileLoadError(this.exception);
                }
            }
        }
    }

    private static class TilesInitTask
    extends AsyncTask<Void, Void, int[]> {
        private final WeakReference<Context> contextRef;
        private ImageRegionDecoder decoder;
        private final WeakReference<DecoderFactory<? extends ImageRegionDecoder>> decoderFactoryRef;
        private Exception exception;
        private final DecodeInputStreamFactory inputStreamFactory;
        private final WeakReference<SubsamplingScaleImageView> viewRef;

        TilesInitTask(SubsamplingScaleImageView subsamplingScaleImageView, Context context, DecoderFactory<? extends ImageRegionDecoder> decoderFactory, DecodeInputStreamFactory decodeInputStreamFactory) {
            this.viewRef = new WeakReference<SubsamplingScaleImageView>(subsamplingScaleImageView);
            this.contextRef = new WeakReference<Context>(context);
            this.decoderFactoryRef = new WeakReference<DecoderFactory<? extends ImageRegionDecoder>>(decoderFactory);
            this.inputStreamFactory = decodeInputStreamFactory;
        }

        protected int[] doInBackground(Void ... object) {
            block4: {
                Exception exception2;
                block6: {
                    int n8;
                    int n9;
                    block5: {
                        Object object2;
                        Context context;
                        try {
                            context = (Context)this.contextRef.get();
                            object2 = (DecoderFactory)this.decoderFactoryRef.get();
                            object = (SubsamplingScaleImageView)((Object)this.viewRef.get());
                            if (context == null || object2 == null || object == null) break block4;
                        }
                        catch (Exception exception2) {}
                        ((SubsamplingScaleImageView)((Object)object)).debug("TilesInitTask.doInBackground", new Object[0]);
                        this.decoder = object2 = (ImageRegionDecoder)object2.make();
                        context = object2.init(context, this.inputStreamFactory);
                        int n10 = context.x;
                        int n11 = context.y;
                        n9 = n10;
                        n8 = n11;
                        if (((SubsamplingScaleImageView)((Object)object)).sRegion == null) break block5;
                        ((SubsamplingScaleImageView)((Object)object)).sRegion.left = Math.max(0, ((SubsamplingScaleImageView)((Object)object)).sRegion.left);
                        ((SubsamplingScaleImageView)((Object)object)).sRegion.top = Math.max(0, ((SubsamplingScaleImageView)((Object)object)).sRegion.top);
                        ((SubsamplingScaleImageView)((Object)object)).sRegion.right = Math.min(n10, ((SubsamplingScaleImageView)((Object)object)).sRegion.right);
                        ((SubsamplingScaleImageView)((Object)object)).sRegion.bottom = Math.min(n11, ((SubsamplingScaleImageView)((Object)object)).sRegion.bottom);
                        n9 = ((SubsamplingScaleImageView)((Object)object)).sRegion.width();
                        n8 = ((SubsamplingScaleImageView)((Object)object)).sRegion.height();
                        break block6;
                    }
                    return new int[]{n9, n8, 0};
                }
                Log.e((String)TAG, (String)"Failed to initialise bitmap decoder", (Throwable)exception2);
                this.exception = exception2;
            }
            return null;
        }

        protected void onPostExecute(int[] nArray) {
            SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView)((Object)this.viewRef.get());
            if (subsamplingScaleImageView != null) {
                ImageRegionDecoder imageRegionDecoder = this.decoder;
                if (imageRegionDecoder != null && nArray != null && nArray.length == 3) {
                    subsamplingScaleImageView.onTilesInited(imageRegionDecoder, nArray[0], nArray[1], nArray[2]);
                    return;
                }
                if (this.exception != null && subsamplingScaleImageView.onImageEventListener != null) {
                    subsamplingScaleImageView.onImageEventListener.onImageLoadError(this.exception);
                }
            }
        }
    }
}

