package ax.T;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import ax.S.e;
import ax.Z.k;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes.dex */
class k {

    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, e.c> a = new ConcurrentHashMap<>();

    class a implements b<k.b> {
        a() {
        }

        @Override // ax.T.k.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(k.b bVar) {
            return bVar.e();
        }

        @Override // ax.T.k.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(k.b bVar) {
            return bVar.f();
        }
    }

    private interface b<T> {
        int a(T t);

        boolean b(T t);
    }

    k() {
    }

    private static <T> T e(T[] tArr, int i, b<T> bVar) {
        return (T) f(tArr, (i & 1) == 0 ? 400 : 700, (i & 2) != 0, bVar);
    }

    private static <T> T f(T[] tArr, int i, boolean z, b<T> bVar) {
        T t = null;
        int i2 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        for (T t2 : tArr) {
            int abs = (Math.abs(bVar.a(t2) - i) * 2) + (bVar.b(t2) == z ? 0 : 1);
            if (t == null || i2 > abs) {
                t = t2;
                i2 = abs;
            }
        }
        return t;
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i) {
        throw null;
    }

    protected Typeface c(Context context, InputStream inputStream) {
        File e = m.e(context);
        if (e == null) {
            return null;
        }
        try {
            if (m.d(e, inputStream)) {
                return Typeface.createFromFile(e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File e = m.e(context);
        if (e == null) {
            return null;
        }
        try {
            if (m.c(e, resources, i)) {
                return Typeface.createFromFile(e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    protected k.b g(k.b[] bVarArr, int i) {
        return (k.b) e(bVarArr, i, new a());
    }
}
