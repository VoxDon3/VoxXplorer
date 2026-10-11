package androidx.media3.ui;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.C0641d;
import androidx.media3.ui.PlayerView;
import ax.P0.C0892a;
import ax.P0.C0894c;
import ax.P0.C0905n;
import ax.P0.C0915y;
import ax.P0.H;
import ax.P0.I;
import ax.P0.InterfaceC0907p;
import ax.P0.N;
import ax.P0.T;
import ax.P0.V;
import ax.P0.a0;
import ax.S0.C0968a;
import ax.S0.d0;
import ax.a2.C1311B;
import ax.a2.C1313D;
import ax.a2.C1315F;
import ax.a2.C1331o;
import ax.a2.C1332p;
import ax.a2.C1338v;
import ax.a2.C1340x;
import ax.r7.AbstractC2991z;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class PlayerView extends FrameLayout {
    private boolean A;
    private InterfaceC0907p<? super ax.P0.F> B;
    private CharSequence C;
    private int D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private final c a;
    private final AspectRatioFrameLayout b;
    private final View c;
    private final View d;
    private final boolean e;
    private final f f;
    private final ImageView g;
    private final ImageView h;
    private final SubtitleView i;
    private final View j;
    private final TextView k;
    private final C0641d l;
    private final FrameLayout m;
    private final FrameLayout n;
    private final Handler o;
    private final Class<?> p;
    private final Method q;
    private final Object r;
    private ax.P0.H s;
    private boolean t;
    private d u;
    private C0641d.m v;
    private int w;
    private int x;
    private Drawable y;
    private int z;

    private static class b {
        public static void a(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    private final class c implements H.d, View.OnClickListener, C0641d.m, C0641d.InterfaceC0029d {
        private final N.b a = new N.b();
        private Object b;

        public c() {
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void D(int i) {
            I.r(this, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void E(boolean z) {
            I.k(this, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void F(int i) {
            I.v(this, i);
        }

        @Override // androidx.media3.ui.C0641d.InterfaceC0029d
        public void G(boolean z) {
            PlayerView.p(PlayerView.this);
        }

        @Override // ax.P0.H.d
        public void H(V v) {
            ax.P0.H h = (ax.P0.H) C0968a.e(PlayerView.this.s);
            N h0 = h.c0(17) ? h.h0() : N.a;
            if (h0.q()) {
                this.b = null;
            } else if (!h.c0(30) || h.X().b()) {
                Object obj = this.b;
                if (obj != null) {
                    int b = h0.b(obj);
                    if (b != -1) {
                        if (h.b0() == h0.f(b, this.a).c) {
                            return;
                        }
                    }
                    this.b = null;
                }
            } else {
                this.b = h0.g(h.D(), this.a, true).b;
            }
            PlayerView.this.e0(false);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void I(boolean z) {
            I.i(this, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void J(ax.P0.F f) {
            I.t(this, f);
        }

        @Override // androidx.media3.ui.C0641d.m
        public void K(int i) {
            PlayerView.this.b0();
            if (PlayerView.this.u != null) {
                PlayerView.this.u.a(i);
            }
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void L(float f) {
            I.G(this, f);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void N(ax.P0.F f) {
            I.s(this, f);
        }

        @Override // ax.P0.H.d
        public void O(int i) {
            PlayerView.this.a0();
            PlayerView.this.d0();
            PlayerView.this.c0();
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void P(N n, int i) {
            I.C(this, n, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void S(boolean z) {
            I.z(this, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void U(T t) {
            I.D(this, t);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void W(H.b bVar) {
            I.c(this, bVar);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void Y(int i, boolean z) {
            I.g(this, i, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void Z(boolean z, int i) {
            I.u(this, z, i);
        }

        @Override // ax.P0.H.d
        public void a(a0 a0Var) {
            if (a0Var.equals(a0.e) || PlayerView.this.s == null || PlayerView.this.s.i() == 1) {
                return;
            }
            PlayerView.this.Z();
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void a0(C0915y c0915y, int i) {
            I.l(this, c0915y, i);
        }

        @Override // ax.P0.H.d
        public void b0() {
            if (PlayerView.this.c != null) {
                PlayerView.this.c.setVisibility(4);
                if (PlayerView.this.C()) {
                    PlayerView.this.H();
                } else {
                    PlayerView.this.E();
                }
            }
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void c(int i) {
            I.b(this, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void c0(ax.P0.H h, H.c cVar) {
            I.h(this, h, cVar);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void e(boolean z) {
            I.A(this, z);
        }

        @Override // ax.P0.H.d
        public void i0(boolean z, int i) {
            PlayerView.this.a0();
            PlayerView.this.c0();
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void j(ax.P0.G g) {
            I.p(this, g);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void j0(ax.P0.A a) {
            I.m(this, a);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void k0(C0905n c0905n) {
            I.f(this, c0905n);
        }

        @Override // ax.P0.H.d
        public void o0(int i, int i2) {
            if (Build.VERSION.SDK_INT == 34 && (PlayerView.this.d instanceof SurfaceView) && PlayerView.this.H) {
                f fVar = (f) C0968a.e(PlayerView.this.f);
                Handler handler = PlayerView.this.o;
                SurfaceView surfaceView = (SurfaceView) PlayerView.this.d;
                final PlayerView playerView = PlayerView.this;
                fVar.d(handler, surfaceView, new Runnable() { // from class: ax.a2.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        PlayerView.this.invalidate();
                    }
                });
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.Y();
        }

        @Override // ax.P0.H.d
        public void p0(H.e eVar, H.e eVar2, int i) {
            if (PlayerView.this.L() && PlayerView.this.F) {
                PlayerView.this.G();
            }
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void r(ax.P0.C c) {
            I.n(this, c);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void r0(C0894c c0894c) {
            I.a(this, c0894c);
        }

        @Override // ax.P0.H.d
        public void s(ax.R0.c cVar) {
            if (PlayerView.this.i != null) {
                PlayerView.this.i.setCues(cVar.a);
            }
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void t(List list) {
            I.e(this, list);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void t0(boolean z) {
            I.j(this, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void v(int i) {
            I.y(this, i);
        }
    }

    public interface d {
        void a(int i);
    }

    public interface e {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f {
        SurfaceSyncGroup a;

        private f() {
        }

        public static /* synthetic */ void a(f fVar, SurfaceView surfaceView, Runnable runnable) {
            AttachedSurfaceControl rootSurfaceControl;
            boolean add;
            fVar.getClass();
            rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            SurfaceSyncGroup a = C1331o.a("exo-sync-b-334901521");
            fVar.a = a;
            add = a.add(rootSurfaceControl, new Runnable() { // from class: androidx.media3.ui.y
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.f.b();
                }
            });
            C0968a.g(add);
            runnable.run();
            rootSurfaceControl.applyTransactionOnDraw(C1332p.a());
        }

        public static /* synthetic */ void b() {
        }

        public void c() {
            SurfaceSyncGroup surfaceSyncGroup = this.a;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.a = null;
            }
        }

        public void d(Handler handler, final SurfaceView surfaceView, final Runnable runnable) {
            handler.post(new Runnable() { // from class: androidx.media3.ui.x
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.f.a(PlayerView.f.this, surfaceView, runnable);
                }
            });
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static void A(Context context, Resources resources, ImageView imageView) {
        int color;
        imageView.setImageDrawable(d0.a0(context, resources, C1340x.a));
        color = resources.getColor(C1338v.a, null);
        imageView.setBackgroundColor(color);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        ax.P0.H h = this.s;
        return h != null && this.r != null && h.c0(30) && h.X().c(4);
    }

    private boolean D() {
        ax.P0.H h = this.s;
        return h != null && h.c0(30) && h.X().c(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        H();
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    private void F() {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.h.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    private boolean J(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    private boolean K() {
        Drawable drawable;
        ImageView imageView = this.g;
        return (imageView == null || (drawable = imageView.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L() {
        ax.P0.H h = this.s;
        return h != null && h.c0(16) && this.s.p() && this.s.v();
    }

    private void M(boolean z) {
        if (!(L() && this.F) && h0()) {
            boolean z2 = this.l.k0() && this.l.getShowTimeoutMs() <= 0;
            boolean U = U();
            if (z || z2 || U) {
                W(U);
            }
        }
    }

    private void O(final Bitmap bitmap) {
        this.o.post(new Runnable() { // from class: ax.a2.l
            @Override // java.lang.Runnable
            public final void run() {
                PlayerView.a(PlayerView.this, bitmap);
            }
        });
    }

    private boolean R(ax.P0.H h) {
        byte[] bArr;
        if (h == null || !h.c0(18) || (bArr = h.q0().i) == null) {
            return false;
        }
        return S(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    private boolean S(Drawable drawable) {
        if (this.h != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f2 = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.w == 2) {
                    f2 = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                N(this.b, f2);
                this.h.setScaleType(scaleType);
                this.h.setImageDrawable(drawable);
                this.h.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void T(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    private boolean U() {
        ax.P0.H h = this.s;
        if (h == null) {
            return true;
        }
        int i = h.i();
        if (!this.E) {
            return false;
        }
        if (this.s.c0(17) && this.s.h0().q()) {
            return false;
        }
        return i == 1 || i == 4 || !((ax.P0.H) C0968a.e(this.s)).v();
    }

    private void W(boolean z) {
        if (h0()) {
            this.l.setShowTimeoutMs(z ? 0 : this.D);
            this.l.v0();
        }
    }

    private void X() {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(0);
            f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        if (!h0() || this.s == null) {
            return;
        }
        if (!this.l.k0()) {
            M(true);
        } else if (this.G) {
            this.l.e0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        ax.P0.H h = this.s;
        a0 F = h != null ? h.F() : a0.e;
        int i = F.a;
        int i2 = F.b;
        N(this.b, this.e ? 0.0f : (i2 == 0 || i == 0) ? 0.0f : (i * F.d) / i2);
    }

    public static /* synthetic */ void a(PlayerView playerView, Bitmap bitmap) {
        playerView.getClass();
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        if (playerView.D()) {
            return;
        }
        playerView.X();
        playerView.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (r4.s.v() == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a0() {
        /*
            r4 = this;
            android.view.View r0 = r4.j
            if (r0 == 0) goto L2b
            ax.P0.H r0 = r4.s
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.i()
            r2 = 2
            if (r0 != r2) goto L20
            int r0 = r4.z
            r3 = 1
            if (r0 == r2) goto L21
            if (r0 != r3) goto L20
            ax.P0.H r0 = r4.s
            boolean r0 = r0.v()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r3 = 0
        L21:
            android.view.View r0 = r4.j
            if (r3 == 0) goto L26
            goto L28
        L26:
            r1 = 8
        L28:
            r0.setVisibility(r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.a0():void");
    }

    public static /* synthetic */ Object b(PlayerView playerView, Object obj, Method method, Object[] objArr) {
        playerView.getClass();
        if (!method.getName().equals("onImageAvailable")) {
            return null;
        }
        playerView.O((Bitmap) objArr[1]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        C0641d c0641d = this.l;
        if (c0641d == null || !this.t) {
            setContentDescription(null);
        } else if (c0641d.k0()) {
            setContentDescription(this.G ? getResources().getString(C1313D.e) : null);
        } else {
            setContentDescription(getResources().getString(C1313D.l));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        if (L() && this.F) {
            G();
        } else {
            M(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        InterfaceC0907p<? super ax.P0.F> interfaceC0907p;
        TextView textView = this.k;
        if (textView != null) {
            CharSequence charSequence = this.C;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.k.setVisibility(0);
                return;
            }
            ax.P0.H h = this.s;
            ax.P0.F R = h != null ? h.R() : null;
            if (R == null || (interfaceC0907p = this.B) == null) {
                this.k.setVisibility(8);
            } else {
                this.k.setText((CharSequence) interfaceC0907p.a(R).second);
                this.k.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(boolean z) {
        ax.P0.H h = this.s;
        boolean z2 = false;
        boolean z3 = (h == null || !h.c0(30) || h.X().b()) ? false : true;
        if (!this.A && (!z3 || z)) {
            F();
            y();
            E();
        }
        if (z3) {
            boolean D = D();
            boolean C = C();
            if (!D && !C) {
                y();
                E();
            }
            View view = this.c;
            if (view != null && view.getVisibility() == 4 && K()) {
                z2 = true;
            }
            if (C && !D && z2) {
                y();
                X();
            } else if (D && !C && z2) {
                E();
            }
            if (D || C || !g0() || !(R(h) || S(this.y))) {
                F();
            }
        }
    }

    private void f0() {
        Drawable drawable;
        ImageView imageView = this.g;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float f2 = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.x == 1) {
            f2 = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (this.g.getVisibility() == 0) {
            N(this.b, f2);
        }
        this.g.setScaleType(scaleType);
    }

    private boolean g0() {
        if (this.w == 0) {
            return false;
        }
        C0968a.i(this.h);
        return true;
    }

    private boolean h0() {
        if (!this.t) {
            return false;
        }
        C0968a.i(this.l);
        return true;
    }

    static /* synthetic */ e p(PlayerView playerView) {
        playerView.getClass();
        return null;
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.g;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        f0();
    }

    private void setImageOutput(ax.P0.H h) {
        Class<?> cls = this.p;
        if (cls == null || !cls.isAssignableFrom(h.getClass())) {
            return;
        }
        try {
            ((Method) C0968a.e(this.q)).invoke(h, C0968a.e(this.r));
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private void x(ax.P0.H h) {
        Class<?> cls = this.p;
        if (cls == null || !cls.isAssignableFrom(h.getClass())) {
            return;
        }
        try {
            ((Method) C0968a.e(this.q)).invoke(h, null);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private void y() {
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void z(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(d0.a0(context, resources, C1340x.a));
        imageView.setBackgroundColor(resources.getColor(C1338v.a));
    }

    public boolean B(KeyEvent keyEvent) {
        return h0() && this.l.a0(keyEvent);
    }

    public void G() {
        C0641d c0641d = this.l;
        if (c0641d != null) {
            c0641d.e0();
        }
    }

    public boolean I() {
        C0641d c0641d = this.l;
        return c0641d != null && c0641d.k0();
    }

    protected void N(AspectRatioFrameLayout aspectRatioFrameLayout, float f2) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    public void P() {
        View view = this.d;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public void Q() {
        View view = this.d;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    public void V() {
        W(U());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        f fVar;
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34 && (fVar = this.f) != null && this.H) {
            fVar.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ax.P0.H h = this.s;
        if (h != null && h.c0(16) && this.s.p()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean J = J(keyEvent.getKeyCode());
        if (J && h0() && !this.l.k0()) {
            M(true);
            return true;
        }
        if (B(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            M(true);
            return true;
        }
        if (J && h0()) {
            M(true);
        }
        return false;
    }

    public List<C0892a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.n;
        if (frameLayout != null) {
            arrayList.add(new C0892a.C0165a(frameLayout, 4).b("Transparent overlay does not impact viewability").a());
        }
        C0641d c0641d = this.l;
        if (c0641d != null) {
            arrayList.add(new C0892a.C0165a(c0641d, 1).a());
        }
        return AbstractC2991z.u(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) C0968a.j(this.m, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.w;
    }

    public boolean getControllerAutoShow() {
        return this.E;
    }

    public boolean getControllerHideOnTouch() {
        return this.G;
    }

    public int getControllerShowTimeoutMs() {
        return this.D;
    }

    public Drawable getDefaultArtwork() {
        return this.y;
    }

    public int getImageDisplayMode() {
        return this.x;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.n;
    }

    public ax.P0.H getPlayer() {
        return this.s;
    }

    public int getResizeMode() {
        C0968a.i(this.b);
        return this.b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.i;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.w != 0;
    }

    public boolean getUseController() {
        return this.t;
    }

    public View getVideoSurfaceView() {
        return this.d;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!h0() || this.s == null) {
            return false;
        }
        M(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        Y();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        C0968a.g(i == 0 || this.h != null);
        if (this.w != i) {
            this.w = i;
            e0(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        C0968a.i(this.b);
        this.b.setAspectRatioListener(bVar);
    }

    public void setControllerAnimationEnabled(boolean z) {
        C0968a.i(this.l);
        this.l.setAnimationEnabled(z);
    }

    public void setControllerAutoShow(boolean z) {
        this.E = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.F = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        C0968a.i(this.l);
        this.G = z;
        b0();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(C0641d.InterfaceC0029d interfaceC0029d) {
        C0968a.i(this.l);
        this.l.setOnFullScreenModeChangedListener(interfaceC0029d);
    }

    public void setControllerShowTimeoutMs(int i) {
        C0968a.i(this.l);
        this.D = i;
        if (this.l.k0()) {
            V();
        }
    }

    public void setControllerVisibilityListener(d dVar) {
        this.u = dVar;
        if (dVar != null) {
            setControllerVisibilityListener((C0641d.m) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        C0968a.g(this.k != null);
        this.C = charSequence;
        d0();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.y != drawable) {
            this.y = drawable;
            e0(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z) {
        this.H = z;
    }

    public void setErrorMessageProvider(InterfaceC0907p<? super ax.P0.F> interfaceC0907p) {
        if (this.B != interfaceC0907p) {
            this.B = interfaceC0907p;
            d0();
        }
    }

    public void setFullscreenButtonClickListener(e eVar) {
        C0968a.i(this.l);
        this.l.setOnFullScreenModeChangedListener(this.a);
    }

    public void setFullscreenButtonState(boolean z) {
        C0968a.i(this.l);
        this.l.B0(z);
    }

    public void setImageDisplayMode(int i) {
        C0968a.g(this.g != null);
        if (this.x != i) {
            this.x = i;
            f0();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.A != z) {
            this.A = z;
            e0(false);
        }
    }

    public void setPlayer(ax.P0.H h) {
        C0968a.g(Looper.myLooper() == Looper.getMainLooper());
        C0968a.a(h == null || h.i0() == Looper.getMainLooper());
        ax.P0.H h2 = this.s;
        if (h2 == h) {
            return;
        }
        if (h2 != null) {
            h2.q(this.a);
            if (h2.c0(27)) {
                View view = this.d;
                if (view instanceof TextureView) {
                    h2.E((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    h2.d0((SurfaceView) view);
                }
            }
            x(h2);
        }
        SubtitleView subtitleView = this.i;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.s = h;
        if (h0()) {
            this.l.setPlayer(h);
        }
        a0();
        d0();
        e0(true);
        if (h == null) {
            G();
            return;
        }
        if (h.c0(27)) {
            View view2 = this.d;
            if (view2 instanceof TextureView) {
                h.o0((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                h.L((SurfaceView) view2);
            }
            if (!h.c0(30) || h.X().d(2)) {
                Z();
            }
        }
        if (this.i != null && h.c0(28)) {
            this.i.setCues(h.Z().a);
        }
        h.N(this.a);
        setImageOutput(h);
        M(false);
    }

    public void setRepeatToggleModes(int i) {
        C0968a.i(this.l);
        this.l.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        C0968a.i(this.b);
        this.b.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.z != i) {
            this.z = i;
            a0();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        C0968a.i(this.l);
        this.l.setShowFastForwardButton(z);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        C0968a.i(this.l);
        this.l.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        C0968a.i(this.l);
        this.l.setShowNextButton(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        C0968a.i(this.l);
        this.l.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setShowPreviousButton(boolean z) {
        C0968a.i(this.l);
        this.l.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        C0968a.i(this.l);
        this.l.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        C0968a.i(this.l);
        this.l.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        C0968a.i(this.l);
        this.l.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        C0968a.i(this.l);
        this.l.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        C0968a.i(this.l);
        this.l.setTimeBarScrubbingEnabled(z);
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        C0968a.g((z && this.l == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.t == z) {
            return;
        }
        this.t = z;
        if (h0()) {
            this.l.setPlayer(this.s);
        } else {
            C0641d c0641d = this.l;
            if (c0641d != null) {
                c0641d.e0();
                this.l.setPlayer(null);
            }
        }
        b0();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z5;
        boolean z6;
        a aVar;
        boolean z7;
        Class<ExoPlayer> cls;
        Object obj;
        Method method;
        boolean z8;
        c cVar = new c();
        this.a = cVar;
        this.o = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = false;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.p = null;
            this.q = null;
            this.r = null;
            ImageView imageView = new ImageView(context);
            if (Build.VERSION.SDK_INT >= 23) {
                A(context, getResources(), imageView);
            } else {
                z(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i11 = C1311B.c;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1315F.c0, i, 0);
            try {
                int i12 = C1315F.o0;
                boolean hasValue = obtainStyledAttributes.hasValue(i12);
                int color = obtainStyledAttributes.getColor(i12, 0);
                int resourceId = obtainStyledAttributes.getResourceId(C1315F.k0, i11);
                boolean z9 = obtainStyledAttributes.getBoolean(C1315F.q0, true);
                int i13 = obtainStyledAttributes.getInt(C1315F.d0, 1);
                int resourceId2 = obtainStyledAttributes.getResourceId(C1315F.f0, 0);
                int i14 = obtainStyledAttributes.getInt(C1315F.i0, 0);
                boolean z10 = obtainStyledAttributes.getBoolean(C1315F.r0, true);
                int i15 = obtainStyledAttributes.getInt(C1315F.p0, 1);
                int i16 = obtainStyledAttributes.getInt(C1315F.l0, 0);
                i10 = obtainStyledAttributes.getInt(C1315F.n0, 5000);
                z3 = obtainStyledAttributes.getBoolean(C1315F.h0, true);
                boolean z11 = obtainStyledAttributes.getBoolean(C1315F.e0, true);
                int integer = obtainStyledAttributes.getInteger(C1315F.m0, 0);
                this.A = obtainStyledAttributes.getBoolean(C1315F.j0, this.A);
                boolean z12 = obtainStyledAttributes.getBoolean(C1315F.g0, true);
                obtainStyledAttributes.recycle();
                i3 = i16;
                z = z10;
                z4 = z12;
                i6 = i15;
                i2 = resourceId;
                z5 = hasValue;
                i9 = i13;
                i8 = i14;
                z2 = z11;
                i4 = integer;
                z6 = z9;
                i7 = color;
                i5 = resourceId2;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = i11;
            z = true;
            i3 = 0;
            z2 = true;
            z3 = true;
            z4 = true;
            i4 = 0;
            i5 = 0;
            i6 = 1;
            i7 = 0;
            i8 = 0;
            i9 = 1;
            i10 = 5000;
            z5 = false;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(ax.a2.z.i);
        this.b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            T(aspectRatioFrameLayout, i3);
        }
        View findViewById = findViewById(ax.a2.z.N);
        this.c = findViewById;
        if (findViewById != null && z5) {
            findViewById.setBackgroundColor(i7);
        }
        if (aspectRatioFrameLayout == null || i6 == 0) {
            aVar = null;
            this.d = null;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i6 == 2) {
                this.d = new TextureView(context);
            } else if (i6 == 3) {
                try {
                    int i17 = ax.p1.l.m;
                    this.d = (View) ax.p1.l.class.getConstructor(Context.class).newInstance(context);
                    z8 = true;
                    this.d.setLayoutParams(layoutParams);
                    this.d.setOnClickListener(cVar);
                    this.d.setClickable(false);
                    aspectRatioFrameLayout.addView(this.d, 0);
                    z7 = z8;
                    aVar = null;
                } catch (Exception e2) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            } else if (i6 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (Build.VERSION.SDK_INT >= 34) {
                    b.a(surfaceView);
                }
                this.d = surfaceView;
            } else {
                try {
                    int i18 = ax.o1.x.b;
                    this.d = (View) ax.o1.x.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e3) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e3);
                }
            }
            z8 = false;
            this.d.setLayoutParams(layoutParams);
            this.d.setOnClickListener(cVar);
            this.d.setClickable(false);
            aspectRatioFrameLayout.addView(this.d, 0);
            z7 = z8;
            aVar = null;
        }
        this.e = z7;
        this.f = Build.VERSION.SDK_INT == 34 ? new f() : null;
        this.m = (FrameLayout) findViewById(ax.a2.z.a);
        this.n = (FrameLayout) findViewById(ax.a2.z.B);
        this.g = (ImageView) findViewById(ax.a2.z.u);
        this.x = i8;
        try {
            cls = ExoPlayer.class;
            ImageOutput imageOutput = ImageOutput.a;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            obj = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: ax.a2.k
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method2, Object[] objArr) {
                    return PlayerView.b(PlayerView.this, obj2, method2, objArr);
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            obj = null;
            method = null;
        }
        this.p = cls;
        this.q = method;
        this.r = obj;
        ImageView imageView2 = (ImageView) findViewById(ax.a2.z.b);
        this.h = imageView2;
        this.w = (!z6 || i9 == 0 || imageView2 == null) ? 0 : i9;
        if (i5 != 0) {
            this.y = ax.Q.b.e(getContext(), i5);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(ax.a2.z.Q);
        this.i = subtitleView;
        if (subtitleView != null) {
            subtitleView.e();
            subtitleView.f();
        }
        View findViewById2 = findViewById(ax.a2.z.f);
        this.j = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.z = i4;
        TextView textView = (TextView) findViewById(ax.a2.z.n);
        this.k = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i19 = ax.a2.z.j;
        C0641d c0641d = (C0641d) findViewById(i19);
        View findViewById3 = findViewById(ax.a2.z.k);
        if (c0641d != null) {
            this.l = c0641d;
        } else if (findViewById3 != null) {
            C0641d c0641d2 = new C0641d(context, null, 0, attributeSet);
            this.l = c0641d2;
            c0641d2.setId(i19);
            c0641d2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(c0641d2, indexOfChild);
        } else {
            this.l = null;
        }
        C0641d c0641d3 = this.l;
        this.D = c0641d3 != null ? i10 : 0;
        this.G = z3;
        this.E = z2;
        this.F = z4;
        this.t = z && c0641d3 != null;
        if (c0641d3 != null) {
            c0641d3.f0();
            this.l.Y(this.a);
        }
        if (z) {
            setClickable(true);
        }
        b0();
    }

    @Deprecated
    public void setControllerVisibilityListener(C0641d.m mVar) {
        C0968a.i(this.l);
        C0641d.m mVar2 = this.v;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            this.l.s0(mVar2);
        }
        this.v = mVar;
        if (mVar != null) {
            this.l.Y(mVar);
            setControllerVisibilityListener((d) null);
        }
    }
}
