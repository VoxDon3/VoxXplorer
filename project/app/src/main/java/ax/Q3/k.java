/*
 * Decompiled with CFR 0.152.
 */
package ax.Q3;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import ax.Q3.d;
import ax.Q3.j;
import ax.Q3.l;
import ax.Q3.n;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class k
implements d {
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

    public k(int n8) {
        this(n8, ax.Q3.k.k(), ax.Q3.k.j());
    }

    k(int n8, l l8, Set<Bitmap.Config> set) {
        this.c = n8;
        this.e = n8;
        this.a = l8;
        this.b = set;
        this.d = new b();
    }

    @TargetApi(value=26)
    private static void f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT < 26 || config != ax.Q3.j.a()) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot create a mutable Bitmap with config: ");
        stringBuilder.append(config);
        stringBuilder.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private void g() {
        if (Log.isLoggable((String)"LruBitmapPool", (int)2)) {
            this.h();
        }
    }

    private void h() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hits=");
        stringBuilder.append(this.g);
        stringBuilder.append(", misses=");
        stringBuilder.append(this.h);
        stringBuilder.append(", puts=");
        stringBuilder.append(this.i);
        stringBuilder.append(", evictions=");
        stringBuilder.append(this.j);
        stringBuilder.append(", currentSize=");
        stringBuilder.append(this.f);
        stringBuilder.append(", maxSize=");
        stringBuilder.append(this.e);
        stringBuilder.append("\nStrategy=");
        stringBuilder.append(this.a);
        Log.v((String)"LruBitmapPool", (String)stringBuilder.toString());
    }

    private void i() {
        this.o(this.e);
    }

    @TargetApi(value=26)
    private static Set<Bitmap.Config> j() {
        HashSet<Bitmap.Config> hashSet = new HashSet<Bitmap.Config>();
        hashSet.addAll(Arrays.asList(Bitmap.Config.values()));
        int n8 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (n8 >= 26) {
            hashSet.remove(ax.Q3.j.a());
        }
        return java.util.DesugarCollections.unmodifiableSet(hashSet);
    }

    private static l k() {
        return new n();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Bitmap l(int n8, int n9, Bitmap.Config config) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Bitmap.Config config2;
                Object object;
                block7: {
                    block4: {
                        block5: {
                            try {
                                ax.Q3.k.f(config);
                                object = this.a;
                                config2 = config != null ? config : k;
                                config2 = object.d(n8, n9, config2);
                                if (config2 != null) break block4;
                                if (!Log.isLoggable((String)"LruBitmapPool", (int)3)) break block5;
                                object = new StringBuilder();
                                ((StringBuilder)object).append("Missing bitmap=");
                                ((StringBuilder)object).append(this.a.a(n8, n9, config));
                                Log.d((String)"LruBitmapPool", (String)((StringBuilder)object).toString());
                            }
                            catch (Throwable throwable2) {
                                break block6;
                            }
                        }
                        ++this.h;
                        break block7;
                    }
                    ++this.g;
                    this.f -= this.a.b((Bitmap)config2);
                    this.d.a((Bitmap)config2);
                    ax.Q3.k.n((Bitmap)config2);
                }
                if (Log.isLoggable((String)"LruBitmapPool", (int)2)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Get bitmap=");
                    ((StringBuilder)object).append(this.a.a(n8, n9, config));
                    Log.v((String)"LruBitmapPool", (String)((StringBuilder)object).toString());
                }
                this.g();
                return config2;
            }
            throw throwable2;
        }
    }

    @TargetApi(value=19)
    private static void m(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void n(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        ax.Q3.k.m(bitmap);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void o(int n8) {
        synchronized (this) {
            try {
                while (true) {
                    if (this.f <= n8) {
                        return;
                    }
                    Bitmap bitmap = this.a.removeLast();
                    if (bitmap == null) {
                        if (Log.isLoggable((String)"LruBitmapPool", (int)5)) {
                            Log.w((String)"LruBitmapPool", (String)"Size mismatch, resetting");
                            this.h();
                        }
                        this.f = 0;
                        return;
                    }
                    this.d.a(bitmap);
                    this.f -= this.a.b(bitmap);
                    ++this.j;
                    if (Log.isLoggable((String)"LruBitmapPool", (int)3)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Evicting bitmap=");
                        stringBuilder.append(this.a.e(bitmap));
                        Log.d((String)"LruBitmapPool", (String)stringBuilder.toString());
                    }
                    this.g();
                    bitmap.recycle();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    @SuppressLint(value={"InlinedApi"})
    public void a(int n8) {
        if (Log.isLoggable((String)"LruBitmapPool", (int)3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("trimMemory, level=");
            stringBuilder.append(n8);
            Log.d((String)"LruBitmapPool", (String)stringBuilder.toString());
        }
        if (n8 >= 40) {
            this.b();
            return;
        }
        if (n8 >= 20) {
            this.o(this.e / 2);
        }
    }

    @Override
    public void b() {
        if (Log.isLoggable((String)"LruBitmapPool", (int)3)) {
            Log.d((String)"LruBitmapPool", (String)"clearMemory");
        }
        this.o(0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c(Bitmap object) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                if (object != null) {
                    block6: {
                        block7: {
                            try {
                                if (object.isRecycled()) {
                                    object = new IllegalStateException("Cannot pool recycled bitmap");
                                    throw object;
                                }
                                if (!object.isMutable() || this.a.b((Bitmap)object) > this.e || !this.b.contains(object.getConfig())) break block6;
                                int n8 = this.a.b((Bitmap)object);
                                this.a.c((Bitmap)object);
                                this.d.b((Bitmap)object);
                                ++this.i;
                                this.f += n8;
                                if (!Log.isLoggable((String)"LruBitmapPool", (int)2)) break block7;
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Put bitmap in pool=");
                                stringBuilder.append(this.a.e((Bitmap)object));
                                Log.v((String)"LruBitmapPool", (String)stringBuilder.toString());
                            }
                            catch (Throwable throwable2) {
                                break block8;
                            }
                        }
                        this.g();
                        this.i();
                        return;
                    }
                    if (Log.isLoggable((String)"LruBitmapPool", (int)2)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Reject bitmap from pool, bitmap: ");
                        stringBuilder.append(this.a.e((Bitmap)object));
                        stringBuilder.append(", is mutable: ");
                        stringBuilder.append(object.isMutable());
                        stringBuilder.append(", is allowed config: ");
                        stringBuilder.append(this.b.contains(object.getConfig()));
                        Log.v((String)"LruBitmapPool", (String)stringBuilder.toString());
                    }
                    object.recycle();
                    return;
                }
                object = new NullPointerException("Bitmap must not be null");
                throw object;
            }
            throw throwable2;
        }
    }

    @Override
    public Bitmap d(int n8, int n9, Bitmap.Config config) {
        Bitmap bitmap = this.l(n8, n9, config);
        if (bitmap != null) {
            bitmap.eraseColor(0);
            return bitmap;
        }
        return Bitmap.createBitmap((int)n8, (int)n9, (Bitmap.Config)config);
    }

    @Override
    public Bitmap e(int n8, int n9, Bitmap.Config config) {
        Bitmap bitmap = this.l(n8, n9, config);
        if (bitmap == null) {
            return Bitmap.createBitmap((int)n8, (int)n9, (Bitmap.Config)config);
        }
        return bitmap;
    }

    private static interface a {
        public void a(Bitmap var1);

        public void b(Bitmap var1);
    }

    private static class b
    implements a {
        b() {
        }

        @Override
        public void a(Bitmap bitmap) {
        }

        @Override
        public void b(Bitmap bitmap) {
        }
    }
}

