package ax.X3;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import ax.M3.f;
import ax.P3.s;
import ax.X3.h;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes.dex */
public final class i {
    public static final ax.M3.i<ax.M3.b> f = ax.M3.i.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", ax.M3.b.e0);
    public static final ax.M3.i<h> g = ax.M3.i.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", h.c);
    public static final ax.M3.i<Boolean> h = ax.M3.i.f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.FALSE);
    public static final ax.M3.i<Boolean> i = ax.M3.i.f("com.bumtpech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", null);
    private static final Set<String> j = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
    private static final b k = new a();
    private static final Set<f.a> l = DesugarCollections.unmodifiableSet(EnumSet.of(f.a.JPEG, f.a.PNG_A, f.a.PNG));
    private static final Queue<BitmapFactory.Options> m = ax.k4.i.e(0);
    private final ax.Q3.d a;
    private final DisplayMetrics b;
    private final ax.Q3.b c;
    private final List<ax.M3.f> d;
    private final j e = j.a();

    public interface b {
        void a(ax.Q3.d dVar, Bitmap bitmap) throws IOException;

        void b();
    }

    public i(List<ax.M3.f> list, DisplayMetrics displayMetrics, ax.Q3.d dVar, ax.Q3.b bVar) {
        this.d = list;
        this.b = (DisplayMetrics) ax.k4.h.d(displayMetrics);
        this.a = (ax.Q3.d) ax.k4.h.d(dVar);
        this.c = (ax.Q3.b) ax.k4.h.d(bVar);
    }

    private void a(InputStream inputStream, ax.M3.b bVar, boolean z, boolean z2, BitmapFactory.Options options, int i2, int i3) throws IOException {
        boolean z3;
        if (this.e.c(i2, i3, options, bVar, z, z2)) {
            return;
        }
        if (bVar == ax.M3.b.PREFER_ARGB_8888 || bVar == ax.M3.b.PREFER_ARGB_8888_DISALLOW_HARDWARE) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            z3 = ax.M3.g.b(this.d, inputStream, this.c).d();
        } catch (IOException e) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e);
            }
            z3 = false;
        }
        Bitmap.Config config = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444 || config == Bitmap.Config.ALPHA_8) {
            options.inDither = true;
        }
    }

    static void b(h hVar, int i2, int i3, int i4, int i5, int i6, BitmapFactory.Options options) {
        int max;
        if (i3 <= 0 || i4 <= 0) {
            return;
        }
        float b2 = (i2 == 90 || i2 == 270) ? hVar.b(i4, i3, i5, i6) : hVar.b(i3, i4, i5, i6);
        if (b2 <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + b2 + " from: " + hVar);
        }
        h.g a2 = hVar.a(i3, i4, i5, i6);
        if (a2 == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        int i7 = i3 / ((int) ((i3 * b2) + 0.5f));
        int i8 = i4 / ((int) ((i4 * b2) + 0.5f));
        h.g gVar = h.g.MEMORY;
        int max2 = a2 == gVar ? Math.max(i7, i8) : Math.min(i7, i8);
        if (Build.VERSION.SDK_INT > 23 || !j.contains(options.outMimeType)) {
            max = Math.max(1, Integer.highestOneBit(max2));
            if (a2 == gVar && max < 1.0f / b2) {
                max <<= 1;
            }
        } else {
            max = 1;
        }
        float f2 = max * b2;
        options.inSampleSize = max;
        options.inTargetDensity = (int) ((1000.0f * f2) + 0.5f);
        options.inDensity = 1000;
        if (m(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i3 + "x" + i4 + "], target: [" + i5 + "x" + i6 + "], exact scale factor: " + b2 + ", power of 2 sample size: " + max + ", adjusted scale factor: " + f2 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    private Bitmap e(InputStream inputStream, BitmapFactory.Options options, h hVar, ax.M3.b bVar, boolean z, int i2, int i3, boolean z2, b bVar2) throws IOException {
        BitmapFactory.Options options2;
        Bitmap bitmap;
        int round;
        int[] i4 = i(inputStream, options, bVar2, this.a);
        int i5 = i4[0];
        int i6 = i4[1];
        String str = options.outMimeType;
        int a2 = ax.M3.g.a(this.d, inputStream, this.c);
        int d = n.d(a2);
        boolean g2 = n.g(a2);
        int i7 = i2 == Integer.MIN_VALUE ? i5 : i2;
        int i8 = i3 == Integer.MIN_VALUE ? i6 : i3;
        b(hVar, d, i5, i6, i7, i8, options);
        a(inputStream, bVar, z, g2, options, i7, i8);
        int i9 = i8;
        if (s(inputStream)) {
            if (z2) {
                round = i9;
                options2 = options;
            } else {
                float f2 = m(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i10 = options.inSampleSize;
                float f3 = i10;
                int ceil = (int) Math.ceil(i5 / f3);
                int ceil2 = (int) Math.ceil(i6 / f3);
                i7 = Math.round(ceil * f2);
                round = Math.round(ceil2 * f2);
                if (Log.isLoggable("Downsampler", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculated target [");
                    sb.append(i7);
                    sb.append("x");
                    sb.append(round);
                    sb.append("] for source [");
                    sb.append(i5);
                    sb.append("x");
                    sb.append(i6);
                    sb.append("], sampleSize: ");
                    sb.append(i10);
                    sb.append(", targetDensity: ");
                    options2 = options;
                    sb.append(options2.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options2.inDensity);
                    sb.append(", density multiplier: ");
                    sb.append(f2);
                    Log.v("Downsampler", sb.toString());
                } else {
                    options2 = options;
                }
            }
            if (i7 > 0 && round > 0) {
                r(options2, this.a, i7, round);
            }
        } else {
            options2 = options;
        }
        Bitmap f4 = f(inputStream, options2, bVar2, this.a);
        bVar2.a(this.a, f4);
        if (Log.isLoggable("Downsampler", 2)) {
            bitmap = f4;
            n(i5, i6, str, options2, bitmap, i2, i3);
        } else {
            bitmap = f4;
        }
        if (bitmap == null) {
            return null;
        }
        bitmap.setDensity(this.b.densityDpi);
        Bitmap h2 = n.h(this.a, bitmap, a2);
        if (!bitmap.equals(h2)) {
            this.a.c(bitmap);
        }
        return h2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap f(java.io.InputStream r6, android.graphics.BitmapFactory.Options r7, ax.X3.i.b r8, ax.Q3.d r9) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r7.inJustDecodeBounds
            if (r1 == 0) goto Lc
            r1 = 5242880(0x500000, float:7.34684E-39)
            r6.mark(r1)
            goto Lf
        Lc:
            r8.b()
        Lf:
            int r1 = r7.outWidth
            int r2 = r7.outHeight
            java.lang.String r3 = r7.outMimeType
            java.util.concurrent.locks.Lock r4 = ax.X3.n.c()
            r4.lock()
            r4 = 0
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeStream(r6, r4, r7)     // Catch: java.lang.IllegalArgumentException -> L30 java.lang.Throwable -> L5d
            java.util.concurrent.locks.Lock r9 = ax.X3.n.c()
            r9.unlock()
            boolean r7 = r7.inJustDecodeBounds
            if (r7 == 0) goto L2f
            r6.reset()
        L2f:
            return r8
        L30:
            r5 = move-exception
            java.io.IOException r1 = o(r5, r1, r2, r3, r7)     // Catch: java.lang.Throwable -> L5d
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L5d
            if (r2 == 0) goto L41
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L5d
        L41:
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L5c
            r6.reset()     // Catch: java.io.IOException -> L5b java.lang.Throwable -> L5d
            android.graphics.Bitmap r0 = r7.inBitmap     // Catch: java.io.IOException -> L5b java.lang.Throwable -> L5d
            r9.c(r0)     // Catch: java.io.IOException -> L5b java.lang.Throwable -> L5d
            r7.inBitmap = r4     // Catch: java.io.IOException -> L5b java.lang.Throwable -> L5d
            android.graphics.Bitmap r6 = f(r6, r7, r8, r9)     // Catch: java.io.IOException -> L5b java.lang.Throwable -> L5d
            java.util.concurrent.locks.Lock r7 = ax.X3.n.c()
            r7.unlock()
            return r6
        L5b:
            throw r1     // Catch: java.lang.Throwable -> L5d
        L5c:
            throw r1     // Catch: java.lang.Throwable -> L5d
        L5d:
            r6 = move-exception
            java.util.concurrent.locks.Lock r7 = ax.X3.n.c()
            r7.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.X3.i.f(java.io.InputStream, android.graphics.BitmapFactory$Options, ax.X3.i$b, ax.Q3.d):android.graphics.Bitmap");
    }

    @TargetApi(19)
    private static String g(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    private static synchronized BitmapFactory.Options h() {
        BitmapFactory.Options poll;
        synchronized (i.class) {
            Queue<BitmapFactory.Options> queue = m;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                q(poll);
            }
        }
        return poll;
    }

    private static int[] i(InputStream inputStream, BitmapFactory.Options options, b bVar, ax.Q3.d dVar) throws IOException {
        options.inJustDecodeBounds = true;
        f(inputStream, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String j(BitmapFactory.Options options) {
        return g(options.inBitmap);
    }

    private static boolean m(BitmapFactory.Options options) {
        int i2;
        int i3 = options.inTargetDensity;
        return i3 > 0 && (i2 = options.inDensity) > 0 && i3 != i2;
    }

    private static void n(int i2, int i3, String str, BitmapFactory.Options options, Bitmap bitmap, int i4, int i5) {
        Log.v("Downsampler", "Decoded " + g(bitmap) + " from [" + i2 + "x" + i3 + "] " + str + " with inBitmap " + j(options) + " for [" + i4 + "x" + i5 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName());
    }

    private static IOException o(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + j(options), illegalArgumentException);
    }

    private static void p(BitmapFactory.Options options) {
        q(options);
        Queue<BitmapFactory.Options> queue = m;
        synchronized (queue) {
            queue.offer(options);
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

    @TargetApi(26)
    private static void r(BitmapFactory.Options options, ax.Q3.d dVar, int i2, int i3) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config2 = options.inPreferredConfig;
            config = Bitmap.Config.HARDWARE;
            if (config2 == config) {
                return;
            }
        }
        options.inBitmap = dVar.e(i2, i3, options.inPreferredConfig);
    }

    private boolean s(InputStream inputStream) throws IOException {
        return true;
    }

    public s<Bitmap> c(InputStream inputStream, int i2, int i3, ax.M3.j jVar) throws IOException {
        return d(inputStream, i2, i3, jVar, k);
    }

    public s<Bitmap> d(InputStream inputStream, int i2, int i3, ax.M3.j jVar, b bVar) throws IOException {
        ax.k4.h.a(inputStream.markSupported(), "You must provide an InputStream that supports mark()");
        byte[] bArr = (byte[]) this.c.d(65536, byte[].class);
        BitmapFactory.Options h2 = h();
        h2.inTempStorage = bArr;
        ax.M3.b bVar2 = (ax.M3.b) jVar.c(f);
        h hVar = (h) jVar.c(g);
        boolean booleanValue = ((Boolean) jVar.c(h)).booleanValue();
        ax.M3.i<Boolean> iVar = i;
        try {
            return e.d(e(inputStream, h2, hVar, bVar2, bVar2 == ax.M3.b.PREFER_ARGB_8888_DISALLOW_HARDWARE ? false : jVar.c(iVar) != null && ((Boolean) jVar.c(iVar)).booleanValue(), i2, i3, booleanValue, bVar), this.a);
        } finally {
            p(h2);
            this.c.c(bArr, byte[].class);
        }
    }

    public boolean k(InputStream inputStream) {
        return true;
    }

    public boolean l(ByteBuffer byteBuffer) {
        return true;
    }

    static class a implements b {
        a() {
        }

        @Override // ax.X3.i.b
        public void b() {
        }

        @Override // ax.X3.i.b
        public void a(ax.Q3.d dVar, Bitmap bitmap) throws IOException {
        }
    }
}
