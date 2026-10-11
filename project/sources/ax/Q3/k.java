package ax.Q3;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class k implements d {
    private static final Bitmap.Config k = Bitmap.Config.ARGB_8888;
    private final l a;
    private final Set<Bitmap.Config> b;
    private final int c;
    private final a d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    k(int i, l lVar, Set<Bitmap.Config> set) {
        this.c = i;
        this.e = i;
        this.a = lVar;
        this.b = set;
        this.d = new b();
    }

    @TargetApi(26)
    private static void f(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        config2 = Bitmap.Config.HARDWARE;
        if (config != config2) {
            return;
        }
        throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
    }

    private void g() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            h();
        }
    }

    private void h() {
        Log.v("LruBitmapPool", "Hits=" + this.g + ", misses=" + this.h + ", puts=" + this.i + ", evictions=" + this.j + ", currentSize=" + this.f + ", maxSize=" + this.e + "\nStrategy=" + this.a);
    }

    private void i() {
        o(this.e);
    }

    @TargetApi(26)
    private static Set<Bitmap.Config> j() {
        Bitmap.Config config;
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    private static l k() {
        return new n();
    }

    private synchronized Bitmap l(int i, int i2, Bitmap.Config config) {
        Bitmap d;
        try {
            f(config);
            d = this.a.d(i, i2, config != null ? config : k);
            if (d == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.a.a(i, i2, config));
                }
                this.h++;
            } else {
                this.g++;
                this.f -= this.a.b(d);
                this.d.a(d);
                n(d);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.a.a(i, i2, config));
            }
            g();
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    @TargetApi(19)
    private static void m(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void n(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m(bitmap);
    }

    private synchronized void o(int i) {
        while (this.f > i) {
            try {
                Bitmap removeLast = this.a.removeLast();
                if (removeLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        h();
                    }
                    this.f = 0;
                    return;
                }
                this.d.a(removeLast);
                this.f -= this.a.b(removeLast);
                this.j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.a.e(removeLast));
                }
                g();
                removeLast.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.Q3.d
    @SuppressLint({"InlinedApi"})
    public void a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40) {
            b();
        } else if (i >= 20) {
            o(this.e / 2);
        }
    }

    @Override // ax.Q3.d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        o(0);
    }

    @Override // ax.Q3.d
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.a.b(bitmap) <= this.e && this.b.contains(bitmap.getConfig())) {
                int b2 = this.a.b(bitmap);
                this.a.c(bitmap);
                this.d.b(bitmap);
                this.i++;
                this.f += b2;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.a.e(bitmap));
                }
                g();
                i();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.a.e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ax.Q3.d
    public Bitmap d(int i, int i2, Bitmap.Config config) {
        Bitmap l = l(i, i2, config);
        if (l == null) {
            return Bitmap.createBitmap(i, i2, config);
        }
        l.eraseColor(0);
        return l;
    }

    @Override // ax.Q3.d
    public Bitmap e(int i, int i2, Bitmap.Config config) {
        Bitmap l = l(i, i2, config);
        return l == null ? Bitmap.createBitmap(i, i2, config) : l;
    }

    public k(int i) {
        this(i, k(), j());
    }

    private static class b implements a {
        b() {
        }

        @Override // ax.Q3.k.a
        public void a(Bitmap bitmap) {
        }

        @Override // ax.Q3.k.a
        public void b(Bitmap bitmap) {
        }
    }
}
