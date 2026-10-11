package ax.P4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Pair;
import ax.c5.AbstractC1844b;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a {
    private static final String b = ax.S4.b.f(a.class);
    private static int c = 0;
    private static final a d = new a();
    private Pair<String, Bitmap[]> a;

    private class b extends AbstractC1844b<Void, Void, Bitmap[]> {
        private final Context l0;
        private final String m0;
        private final AbstractC0170a n0;
        private boolean o0;

        b(Context context, String str, AbstractC0170a abstractC0170a) {
            this.l0 = context;
            this.m0 = str;
            this.n0 = abstractC0170a;
        }

        private Bitmap[] s() {
            Bitmap[] bitmapArr;
            synchronized (a.this.a) {
                try {
                    if (((String) a.this.a.first).equals(this.m0)) {
                        Bitmap decodeResource = BitmapFactory.decodeResource(this.l0.getResources(), h.b);
                        Bitmap decodeResource2 = BitmapFactory.decodeResource(this.l0.getResources(), h.a);
                        bitmapArr = new Bitmap[]{decodeResource, decodeResource2, decodeResource2};
                        a.this.a = Pair.create(this.m0, bitmapArr);
                    } else {
                        bitmapArr = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return bitmapArr;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // ax.c5.AbstractC1844b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.graphics.Bitmap[] f(java.lang.Void[] r10) {
            /*
                Method dump skipped, instructions count: 300
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.P4.a.b.f(java.lang.Void[]):android.graphics.Bitmap[]");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.c5.AbstractC1844b
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void m(Bitmap[] bitmapArr) {
            if (bitmapArr != null) {
                this.n0.c(this.m0, bitmapArr[0], bitmapArr[2], bitmapArr[1]);
            } else if (this.o0) {
                this.n0.a();
            } else {
                this.n0.b(this.m0, new IllegalArgumentException("got null bitmaps"));
            }
        }
    }

    private a() {
        if (c == 0) {
            c = Math.min(((int) Runtime.getRuntime().maxMemory()) / 32, 1048576);
        }
        this.a = Pair.create(HttpUrl.FRAGMENT_ENCODE_SET, null);
    }

    private Bitmap[] h(String str) {
        Object obj;
        synchronized (this.a) {
            try {
                if (!((String) this.a.first).equals(str) || (obj = this.a.second) == null) {
                    return null;
                }
                return (Bitmap[]) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static a i() {
        return d;
    }

    public static int k(int i, int i2, Bitmap.Config config, int i3) {
        int i4 = 1;
        if (i3 == 0) {
            return 1;
        }
        int i5 = 4;
        if (config != Bitmap.Config.ARGB_8888 && config == Bitmap.Config.RGB_565) {
            i5 = 2;
        }
        int i6 = i * i2 * i5;
        while (i6 > i3) {
            i6 /= 4;
            i4 *= 2;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap l(Bitmap bitmap, int i, int i2) {
        double min = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), false);
    }

    public void f(Context context, String str, AbstractC0170a abstractC0170a) {
        if (str == null || c == 0) {
            abstractC0170a.b(str, new IllegalArgumentException("got null bitmaps"));
            return;
        }
        synchronized (this.a) {
            try {
                if (!((String) this.a.first).equals(str) || this.a.second == null) {
                    this.a = Pair.create(str, null);
                    ax.S4.b.a(b, "getOrFetch: starting asynctask to fetch ", str);
                    new b(context, str, abstractC0170a).g(AbstractC1844b.h0, new Void[0]);
                } else {
                    ax.S4.b.a(b, "getOrFetch: album art is in cache, using it", str);
                    Object obj = this.a.second;
                    abstractC0170a.c(str, ((Bitmap[]) obj)[0], ((Bitmap[]) obj)[2], ((Bitmap[]) obj)[1]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Bitmap g(String str) {
        Bitmap[] h = h(str);
        if (h != null) {
            return h[0];
        }
        return null;
    }

    public Bitmap j(String str) {
        Bitmap[] h = h(str);
        if (h != null) {
            return h[2];
        }
        return null;
    }

    /* renamed from: ax.P4.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0170a {
        public void b(String str, Exception exc) {
            ax.S4.b.b(a.b, exc, "AlbumArtFetchListener: error while downloading " + str);
        }

        public abstract void c(String str, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3);

        public void a() {
        }
    }
}
