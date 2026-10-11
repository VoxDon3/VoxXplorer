package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C;
import ax.m.C2506a;
import ax.m.C2508c;
import ax.o.C2653a;

/* renamed from: androidx.appcompat.widget.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580k {
    private static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    private static C0580k c;
    private C a;

    /* renamed from: androidx.appcompat.widget.k$a */
    class a implements C.f {
        private final int[] a = {ax.m.e.R, ax.m.e.P, ax.m.e.a};
        private final int[] b = {ax.m.e.o, ax.m.e.B, ax.m.e.t, ax.m.e.p, ax.m.e.q, ax.m.e.s, ax.m.e.r};
        private final int[] c = {ax.m.e.O, ax.m.e.Q, ax.m.e.k, ax.m.e.K, ax.m.e.L, ax.m.e.M, ax.m.e.N};
        private final int[] d = {ax.m.e.w, ax.m.e.i, ax.m.e.v};
        private final int[] e = {ax.m.e.J, ax.m.e.S};
        private final int[] f = {ax.m.e.c, ax.m.e.g, ax.m.e.d, ax.m.e.h};

        a() {
        }

        private boolean f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i) {
            int c = H.c(context, C2506a.w);
            return new ColorStateList(new int[][]{H.b, H.e, H.c, H.i}, new int[]{H.b(context, C2506a.u), ax.T.a.g(c, i), ax.T.a.g(c, i), i});
        }

        private ColorStateList i(Context context) {
            return h(context, H.c(context, C2506a.t));
        }

        private ColorStateList j(Context context) {
            return h(context, H.c(context, C2506a.u));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i = C2506a.A;
            ColorStateList e = H.e(context, i);
            if (e == null || !e.isStateful()) {
                iArr[0] = H.b;
                iArr2[0] = H.b(context, i);
                iArr[1] = H.f;
                iArr2[1] = H.c(context, C2506a.v);
                iArr[2] = H.i;
                iArr2[2] = H.c(context, i);
            } else {
                int[] iArr3 = H.b;
                iArr[0] = iArr3;
                iArr2[0] = e.getColorForState(iArr3, 0);
                iArr[1] = H.f;
                iArr2[1] = H.c(context, C2506a.v);
                iArr[2] = H.i;
                iArr2[2] = e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(C c, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable j = c.j(context, ax.m.e.F);
            Drawable j2 = c.j(context, ax.m.e.G);
            if ((j instanceof BitmapDrawable) && j.getIntrinsicWidth() == dimensionPixelSize && j.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) j;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((j2 instanceof BitmapDrawable) && j2.getIntrinsicWidth() == dimensionPixelSize && j2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i, PorterDuff.Mode mode) {
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = C0580k.b;
            }
            mutate.setColorFilter(C0580k.e(i, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0067 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
        @Override // androidx.appcompat.widget.C.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0580k.a()
                int[] r1 = r6.a
                boolean r1 = r6.f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = ax.m.C2506a.x
            L11:
                r1 = r0
            L12:
                r0 = -1
                r5 = 1
                goto L50
            L15:
                int[] r1 = r6.c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L20
                int r8 = ax.m.C2506a.v
                goto L11
            L20:
                int[] r1 = r6.d
                boolean r1 = r6.f(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r8 = 16842801(0x1010031, float:2.3693695E-38)
                goto L12
            L32:
                int r1 = ax.m.e.u
                if (r8 != r1) goto L47
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r1 = r0
                r5 = 1
                r0 = r8
                r8 = 16842800(0x1010030, float:2.3693693E-38)
                goto L50
            L47:
                int r1 = ax.m.e.l
                if (r8 != r1) goto L4c
                goto L2d
            L4c:
                r1 = r0
                r8 = 0
                r0 = -1
                r5 = 0
            L50:
                if (r5 == 0) goto L67
                android.graphics.drawable.Drawable r9 = r9.mutate()
                int r7 = androidx.appcompat.widget.H.c(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0580k.e(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L66
                r9.setAlpha(r0)
            L66:
                return r2
            L67:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0580k.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.C.f
        public PorterDuff.Mode b(int i) {
            if (i == ax.m.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C.f
        public Drawable c(C c, Context context, int i) {
            if (i == ax.m.e.j) {
                return new LayerDrawable(new Drawable[]{c.j(context, ax.m.e.i), c.j(context, ax.m.e.k)});
            }
            if (i == ax.m.e.y) {
                return l(c, context, ax.m.d.g);
            }
            if (i == ax.m.e.x) {
                return l(c, context, ax.m.d.h);
            }
            if (i == ax.m.e.z) {
                return l(c, context, ax.m.d.i);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C.f
        public ColorStateList d(Context context, int i) {
            if (i == ax.m.e.m) {
                return C2653a.a(context, C2508c.e);
            }
            if (i == ax.m.e.I) {
                return C2653a.a(context, C2508c.h);
            }
            if (i == ax.m.e.H) {
                return k(context);
            }
            if (i == ax.m.e.f) {
                return j(context);
            }
            if (i == ax.m.e.b) {
                return g(context);
            }
            if (i == ax.m.e.e) {
                return i(context);
            }
            if (i == ax.m.e.D || i == ax.m.e.E) {
                return C2653a.a(context, C2508c.g);
            }
            if (f(this.b, i)) {
                return H.e(context, C2506a.x);
            }
            if (f(this.e, i)) {
                return C2653a.a(context, C2508c.d);
            }
            if (f(this.f, i)) {
                return C2653a.a(context, C2508c.c);
            }
            if (i == ax.m.e.A) {
                return C2653a.a(context, C2508c.f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C.f
        public boolean e(Context context, int i, Drawable drawable) {
            if (i == ax.m.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i2 = C2506a.x;
                m(findDrawableByLayerId, H.c(context, i2), C0580k.b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), H.c(context, i2), C0580k.b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), H.c(context, C2506a.v), C0580k.b);
                return true;
            }
            if (i != ax.m.e.y && i != ax.m.e.x && i != ax.m.e.z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), H.b(context, C2506a.x), C0580k.b);
            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i3 = C2506a.v;
            m(findDrawableByLayerId2, H.c(context, i3), C0580k.b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), H.c(context, i3), C0580k.b);
            return true;
        }
    }

    public static synchronized C0580k b() {
        C0580k c0580k;
        synchronized (C0580k.class) {
            try {
                if (c == null) {
                    h();
                }
                c0580k = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0580k;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (C0580k.class) {
            l = C.l(i, mode);
        }
        return l;
    }

    public static synchronized void h() {
        synchronized (C0580k.class) {
            if (c == null) {
                C0580k c0580k = new C0580k();
                c = c0580k;
                c0580k.a = C.h();
                c.a.u(new a());
            }
        }
    }

    static void i(Drawable drawable, J j, int[] iArr) {
        C.w(drawable, j, iArr);
    }

    public synchronized Drawable c(Context context, int i) {
        return this.a.j(context, i);
    }

    synchronized Drawable d(Context context, int i, boolean z) {
        return this.a.k(context, i, z);
    }

    synchronized ColorStateList f(Context context, int i) {
        return this.a.m(context, i);
    }

    public synchronized void g(Context context) {
        this.a.s(context);
    }
}
