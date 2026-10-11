/*
 * Decompiled with CFR 0.152.
 */
package ax.X3;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import ax.M3.f;
import ax.M3.g;
import ax.P3.s;
import ax.Q3.d;
import ax.X3.e;
import ax.X3.h;
import ax.X3.j;
import ax.X3.n;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public final class i {
    public static final ax.M3.i<ax.M3.b> f = ax.M3.i.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", ax.M3.b.e0);
    public static final ax.M3.i<h> g = ax.M3.i.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", ax.X3.h.c);
    public static final ax.M3.i<Boolean> h = ax.M3.i.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.FALSE);
    public static final ax.M3.i<Boolean> i = ax.M3.i.f("com.bumtpech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", null);
    private static final Set<String> j = java.util.DesugarCollections.unmodifiableSet(new HashSet<String>(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
    private static final b k = new b(){

        @Override
        public void a(d d8, Bitmap bitmap) throws IOException {
        }

        @Override
        public void b() {
        }
    };
    private static final Set<f.a> l = java.util.DesugarCollections.unmodifiableSet(EnumSet.of(f.a.d0, f.a.f0, f.a.g0));
    private static final Queue<BitmapFactory.Options> m = ax.k4.i.e(0);
    private final d a;
    private final DisplayMetrics b;
    private final ax.Q3.b c;
    private final List<f> d;
    private final j e = ax.X3.j.a();

    public i(List<f> list, DisplayMetrics displayMetrics, d d8, ax.Q3.b b8) {
        this.d = list;
        this.b = ax.k4.h.d(displayMetrics);
        this.a = ax.k4.h.d(d8);
        this.c = ax.k4.h.d(b8);
    }

    private void a(InputStream inputStream, ax.M3.b b8, boolean bl, boolean bl2, BitmapFactory.Options options, int n8, int n9) throws IOException {
        block6: {
            block5: {
                if (this.e.c(n8, n9, options, b8, bl, bl2)) break block5;
                if (b8 == ax.M3.b.q || b8 == ax.M3.b.c0) break block6;
                try {
                    bl = ax.M3.g.b(this.d, inputStream, this.c).d();
                }
                catch (IOException iOException) {
                    if (Log.isLoggable((String)"Downsampler", (int)3)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Cannot determine whether the image has alpha or not from header, format ");
                        stringBuilder.append((Object)b8);
                        Log.d((String)"Downsampler", (String)stringBuilder.toString(), (Throwable)iOException);
                    }
                    bl = false;
                }
                inputStream = bl ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                options.inPreferredConfig = inputStream;
                if (inputStream == Bitmap.Config.RGB_565 || inputStream == Bitmap.Config.ARGB_4444 || inputStream == Bitmap.Config.ALPHA_8) {
                    options.inDither = true;
                }
            }
            return;
        }
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static void b(h object, int n8, int n9, int n10, int n11, int n12, BitmapFactory.Options object2) {
        StringBuilder stringBuilder;
        int var5_7;
        int var4_6;
        int n13;
        float var3_5;
        float var2_4;
        if (var2_4 <= 0 || var3_5 <= 0) return;
        float f8 = n13 != 90 && n13 != 270 ? ((h)object).b((int)var2_4, (int)var3_5, (int)var4_6, (int)var5_7) : ((h)object).b((int)var3_5, (int)var2_4, (int)var4_6, (int)var5_7);
        if (!(f8 <= 0.0f)) {
            h.g g8 = ((h)object).a((int)var2_4, (int)var3_5, (int)var4_6, (int)var5_7);
            if (g8 == null) throw new IllegalArgumentException("Cannot round with null rounding");
            n13 = (int)((float)var2_4 * f8 + 0.5f);
            int n14 = (int)((float)var3_5 * f8 + 0.5f);
            n13 = var2_4 / n13;
            n14 = var3_5 / n14;
            h.g g9 = h.g.q;
            n13 = g8 == g9 ? Math.max(n13, n14) : Math.min(n13, n14);
            if (Build.VERSION.SDK_INT <= 23 && j.contains(((BitmapFactory.Options)stringBuilder).outMimeType)) {
                n13 = 1;
            } else {
                n13 = n14 = Math.max(1, Integer.highestOneBit(n13));
                if (g8 == g9) {
                    n13 = n14;
                    if ((float)n14 < 1.0f / f8) {
                        n13 = n14 << 1;
                    }
                }
            }
            float f9 = (float)n13 * f8;
            ((BitmapFactory.Options)stringBuilder).inSampleSize = n13;
            ((BitmapFactory.Options)stringBuilder).inTargetDensity = (int)(1000.0f * f9 + 0.5f);
            ((BitmapFactory.Options)stringBuilder).inDensity = 1000;
            if (ax.X3.i.m((BitmapFactory.Options)stringBuilder)) {
                ((BitmapFactory.Options)stringBuilder).inScaled = true;
            } else {
                ((BitmapFactory.Options)stringBuilder).inTargetDensity = 0;
                ((BitmapFactory.Options)stringBuilder).inDensity = 0;
            }
            if (!Log.isLoggable((String)"Downsampler", (int)2)) return;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Calculate scaling, source: [");
            stringBuilder2.append((int)var2_4);
            stringBuilder2.append("x");
            stringBuilder2.append((int)var3_5);
            stringBuilder2.append("], target: [");
            stringBuilder2.append((int)var4_6);
            stringBuilder2.append("x");
            stringBuilder2.append((int)var5_7);
            stringBuilder2.append("], exact scale factor: ");
            stringBuilder2.append(f8);
            stringBuilder2.append(", power of 2 sample size: ");
            stringBuilder2.append(n13);
            stringBuilder2.append(", adjusted scale factor: ");
            stringBuilder2.append(f9);
            stringBuilder2.append(", target density: ");
            stringBuilder2.append(((BitmapFactory.Options)stringBuilder).inTargetDensity);
            stringBuilder2.append(", density: ");
            stringBuilder2.append(((BitmapFactory.Options)stringBuilder).inDensity);
            Log.v((String)"Downsampler", (String)stringBuilder2.toString());
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot scale with factor: ");
        stringBuilder.append(f8);
        stringBuilder.append(" from: ");
        stringBuilder.append(object);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private Bitmap e(InputStream inputStream, BitmapFactory.Options options, h object, ax.M3.b b8, boolean bl, int n8, int n9, boolean bl2, b b9) throws IOException {
        Object object2 = ax.X3.i.i(inputStream, options, b9, this.a);
        int n10 = object2[0];
        int n11 = object2[1];
        object2 = options.outMimeType;
        int n12 = ax.M3.g.a(this.d, inputStream, this.c);
        int n13 = n.d(n12);
        boolean bl3 = n.g(n12);
        int n14 = n8 == Integer.MIN_VALUE ? n10 : n8;
        int n15 = n9 == Integer.MIN_VALUE ? n11 : n9;
        ax.X3.i.b((h)object, n13, n10, n11, n14, n15, options);
        this.a(inputStream, b8, bl, bl3, options, n14, n15);
        if (this.s(inputStream)) {
            if (!bl2) {
                float f8 = ax.X3.i.m(options) ? (float)options.inTargetDensity / (float)options.inDensity : 1.0f;
                n13 = options.inSampleSize;
                float f9 = n10;
                float f10 = n13;
                n14 = (int)Math.ceil(f9 / f10);
                n15 = (int)Math.ceil((float)n11 / f10);
                n14 = Math.round((float)n14 * f8);
                n15 = Math.round((float)n15 * f8);
                if (Log.isLoggable((String)"Downsampler", (int)2)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Calculated target [");
                    ((StringBuilder)object).append(n14);
                    ((StringBuilder)object).append("x");
                    ((StringBuilder)object).append(n15);
                    ((StringBuilder)object).append("] for source [");
                    ((StringBuilder)object).append(n10);
                    ((StringBuilder)object).append("x");
                    ((StringBuilder)object).append(n11);
                    ((StringBuilder)object).append("], sampleSize: ");
                    ((StringBuilder)object).append(n13);
                    ((StringBuilder)object).append(", targetDensity: ");
                    ((StringBuilder)object).append(options.inTargetDensity);
                    ((StringBuilder)object).append(", density: ");
                    ((StringBuilder)object).append(options.inDensity);
                    ((StringBuilder)object).append(", density multiplier: ");
                    ((StringBuilder)object).append(f8);
                    Log.v((String)"Downsampler", (String)((StringBuilder)object).toString());
                }
            }
            if (n14 > 0 && n15 > 0) {
                ax.X3.i.r(options, this.a, n14, n15);
            }
        }
        inputStream = ax.X3.i.f(inputStream, options, b9, this.a);
        b9.a(this.a, (Bitmap)inputStream);
        if (Log.isLoggable((String)"Downsampler", (int)2)) {
            ax.X3.i.n(n10, n11, (String)object2, options, (Bitmap)inputStream, n8, n9);
        }
        if (inputStream != null) {
            inputStream.setDensity(this.b.densityDpi);
            options = n.h(this.a, (Bitmap)inputStream, n12);
            if (!inputStream.equals(options)) {
                this.a.c((Bitmap)inputStream);
            }
            return options;
        }
        return null;
    }

    private static Bitmap f(InputStream inputStream, BitmapFactory.Options options, b b8, d d8) throws IOException {
        Bitmap bitmap;
        block12: {
            if (options.inJustDecodeBounds) {
                inputStream.mark(0x500000);
            } else {
                b8.b();
            }
            int n8 = options.outWidth;
            int n9 = options.outHeight;
            Object object = options.outMimeType;
            n.c().lock();
            try {
                bitmap = BitmapFactory.decodeStream((InputStream)inputStream, null, (BitmapFactory.Options)options);
                if (!options.inJustDecodeBounds) break block12;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                Bitmap bitmap2;
                object = ax.X3.i.o(illegalArgumentException, n8, n9, (String)object, options);
                if (Log.isLoggable((String)"Downsampler", (int)3)) {
                    Log.d((String)"Downsampler", (String)"Failed to decode with inBitmap, trying again without Bitmap re-use", (Throwable)object);
                }
                if ((bitmap2 = options.inBitmap) != null) {
                    inputStream.reset();
                    d8.c(options.inBitmap);
                    options.inBitmap = null;
                    inputStream = ax.X3.i.f(inputStream, options, b8, d8);
                    return inputStream;
                }
                throw object;
            }
            finally {
                n.c().unlock();
            }
            inputStream.reset();
        }
        return bitmap;
    }

    @TargetApi(value=19)
    private static String g(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" (");
        stringBuilder.append(bitmap.getAllocationByteCount());
        stringBuilder.append(")");
        String string = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(bitmap.getWidth());
        stringBuilder.append("x");
        stringBuilder.append(bitmap.getHeight());
        stringBuilder.append("] ");
        stringBuilder.append(bitmap.getConfig());
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static BitmapFactory.Options h() {
        synchronized (i.class) {
            Throwable throwable2;
            block9: {
                BitmapFactory.Options options;
                block8: {
                    BitmapFactory.Options options2;
                    try {
                        options = m;
                        synchronized (options) {
                            options2 = options.poll();
                        }
                    }
                    catch (Throwable throwable2) {}
                    options = options2;
                    if (options2 != null) break block8;
                    options = new BitmapFactory.Options();
                    ax.X3.i.q(options);
                    break block9;
                }
                return options;
            }
            throw throwable2;
        }
    }

    private static int[] i(InputStream inputStream, BitmapFactory.Options options, b b8, d d8) throws IOException {
        options.inJustDecodeBounds = true;
        ax.X3.i.f(inputStream, options, b8, d8);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String j(BitmapFactory.Options options) {
        return ax.X3.i.g(options.inBitmap);
    }

    private static boolean m(BitmapFactory.Options options) {
        int n8;
        int n9 = options.inTargetDensity;
        return n9 > 0 && (n8 = options.inDensity) > 0 && n9 != n8;
    }

    private static void n(int n8, int n9, String string, BitmapFactory.Options options, Bitmap bitmap, int n10, int n11) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Decoded ");
        stringBuilder.append(ax.X3.i.g(bitmap));
        stringBuilder.append(" from [");
        stringBuilder.append(n8);
        stringBuilder.append("x");
        stringBuilder.append(n9);
        stringBuilder.append("] ");
        stringBuilder.append(string);
        stringBuilder.append(" with inBitmap ");
        stringBuilder.append(ax.X3.i.j(options));
        stringBuilder.append(" for [");
        stringBuilder.append(n10);
        stringBuilder.append("x");
        stringBuilder.append(n11);
        stringBuilder.append("], sample size: ");
        stringBuilder.append(options.inSampleSize);
        stringBuilder.append(", density: ");
        stringBuilder.append(options.inDensity);
        stringBuilder.append(", target density: ");
        stringBuilder.append(options.inTargetDensity);
        stringBuilder.append(", thread: ");
        stringBuilder.append(Thread.currentThread().getName());
        Log.v((String)"Downsampler", (String)stringBuilder.toString());
    }

    private static IOException o(IllegalArgumentException illegalArgumentException, int n8, int n9, String string, BitmapFactory.Options options) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exception decoding bitmap, outWidth: ");
        stringBuilder.append(n8);
        stringBuilder.append(", outHeight: ");
        stringBuilder.append(n9);
        stringBuilder.append(", outMimeType: ");
        stringBuilder.append(string);
        stringBuilder.append(", inBitmap: ");
        stringBuilder.append(ax.X3.i.j(options));
        return new IOException(stringBuilder.toString(), illegalArgumentException);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void p(BitmapFactory.Options options) {
        ax.X3.i.q(options);
        Queue<BitmapFactory.Options> queue = m;
        synchronized (queue) {
            queue.offer(options);
            return;
        }
    }

    private static void q(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    @TargetApi(value=26)
    private static void r(BitmapFactory.Options options, d d8, int n8, int n9) {
        if (Build.VERSION.SDK_INT >= 26 && options.inPreferredConfig == ax.Q3.j.a()) {
            return;
        }
        options.inBitmap = d8.e(n8, n9, options.inPreferredConfig);
    }

    private boolean s(InputStream inputStream) throws IOException {
        return true;
    }

    public s<Bitmap> c(InputStream inputStream, int n8, int n9, ax.M3.j j8) throws IOException {
        return this.d(inputStream, n8, n9, j8, k);
    }

    public s<Bitmap> d(InputStream object, int n8, int n9, ax.M3.j j8, b b8) throws IOException {
        ax.k4.h.a(((InputStream)object).markSupported(), "You must provide an InputStream that supports mark()");
        byte[] byArray = this.c.d(65536, byte[].class);
        BitmapFactory.Options options = ax.X3.i.h();
        options.inTempStorage = byArray;
        ax.M3.b b9 = j8.c(f);
        h h8 = j8.c(g);
        boolean bl = j8.c(h);
        ax.M3.i<Boolean> i8 = i;
        boolean bl2 = j8.c(i8) != null && j8.c(i8) != false;
        if (b9 == ax.M3.b.c0) {
            bl2 = false;
        }
        try {
            object = ax.X3.e.d(this.e((InputStream)object, options, h8, b9, bl2, n8, n9, bl, b8), this.a);
            return object;
        }
        finally {
            ax.X3.i.p(options);
            this.c.c(byArray, byte[].class);
        }
    }

    public boolean k(InputStream inputStream) {
        return true;
    }

    public boolean l(ByteBuffer byteBuffer) {
        return true;
    }

    public static interface b {
        public void a(d var1, Bitmap var2) throws IOException;

        public void b();
    }
}

