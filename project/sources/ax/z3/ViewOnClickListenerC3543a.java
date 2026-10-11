package ax.z3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import ax.A3.b;
import ax.J0.a;
import ax.m.C2506a;
import com.android.ex.photo.e;
import com.android.ex.photo.f;
import com.android.ex.photo.j;
import com.android.ex.photo.l;
import com.android.ex.photo.m;
import com.android.ex.photo.views.PhotoView;
import com.davemorrissey.labs.subscaleview.ImageViewState;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ax.z3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewOnClickListenerC3543a extends Fragment implements a.InterfaceC0095a<b.a>, View.OnClickListener, e.b, e.a {
    protected boolean A0;
    protected boolean B0;
    protected boolean C0;
    protected ImageViewState E0;
    protected com.android.ex.photo.c G0;
    private h H0;
    protected String d0;
    protected String e0;
    protected Intent f0;
    protected com.android.ex.photo.e g0;
    protected ax.y3.c h0;
    protected BroadcastReceiver i0;
    protected View j0;
    protected SubsamplingScaleImageView k0;
    protected PhotoView l0;
    protected View m0;
    protected BottomSheetBehavior n0;
    protected boolean o0;
    protected ImageView p0;
    protected TextView q0;
    protected TextView r0;
    protected ImageView s0;
    protected ax.D3.a t0;
    protected int u0;
    protected boolean v0;
    protected boolean w0;
    protected boolean x0;
    protected View z0;
    protected boolean y0 = true;
    private DisplayMetrics D0 = new DisplayMetrics();
    protected float F0 = Float.NaN;

    /* renamed from: ax.z3.a$a, reason: collision with other inner class name */
    class C0507a extends SubsamplingScaleImageView.DefaultOnStateChangedListener {
        C0507a() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.DefaultOnStateChangedListener, com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnStateChangedListener
        public void onScaleChanged(float f, int i) {
            ViewOnClickListenerC3543a.this.S2();
        }
    }

    /* renamed from: ax.z3.a$c */
    class c implements PhotoView.a {
        c() {
        }

        @Override // com.android.ex.photo.views.PhotoView.a
        public void a() {
            ViewOnClickListenerC3543a.this.S2();
        }
    }

    /* renamed from: ax.z3.a$e */
    class e implements SubsamplingScaleImageView.DecodeInputStreamFactory {
        final /* synthetic */ b.a a;

        e(b.a aVar) {
            this.a = aVar;
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.DecodeInputStreamFactory
        public InputStream createInputStream() throws IOException {
            return this.a.f.createInputStream();
        }
    }

    /* renamed from: ax.z3.a$g */
    private class g extends BroadcastReceiver {
        private g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                ViewOnClickListenerC3543a.this.B0 = false;
                return;
            }
            ViewOnClickListenerC3543a viewOnClickListenerC3543a = ViewOnClickListenerC3543a.this;
            if (viewOnClickListenerC3543a.B0 || viewOnClickListenerC3543a.c3()) {
                return;
            }
            ViewOnClickListenerC3543a viewOnClickListenerC3543a2 = ViewOnClickListenerC3543a.this;
            if (!viewOnClickListenerC3543a2.A0) {
                viewOnClickListenerC3543a2.w0().g(2, null, ViewOnClickListenerC3543a.this);
            }
            ViewOnClickListenerC3543a.this.w0().g(3, null, ViewOnClickListenerC3543a.this);
            ViewOnClickListenerC3543a viewOnClickListenerC3543a3 = ViewOnClickListenerC3543a.this;
            viewOnClickListenerC3543a3.B0 = true;
            viewOnClickListenerC3543a3.t0.b(0);
        }

        /* synthetic */ g(ViewOnClickListenerC3543a viewOnClickListenerC3543a, C0507a c0507a) {
            this();
        }
    }

    /* renamed from: ax.z3.a$h */
    public interface h {
        void a(boolean z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d2, code lost:
    
        if (r5 > r2) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private float[] P2(android.graphics.Point r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.z3.ViewOnClickListenerC3543a.P2(android.graphics.Point, int, boolean):float[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void Q2(ax.A3.b.a r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.z3.ViewOnClickListenerC3543a.Q2(ax.A3.b$a, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R2() {
        this.q0.setVisibility(8);
        this.r0.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S2() {
        h hVar = this.H0;
        if (hVar != null) {
            hVar.a(e3());
        }
    }

    private void T2(b.a aVar, boolean z) {
        int i = aVar.e;
        if (i == 1 || i == 2) {
            o3("displayPhoto", aVar.h);
            if (!z) {
                this.G0 = null;
            }
            this.g0.A(this, false);
        } else {
            R2();
            Q2(aVar, z);
            if (!z) {
                this.G0 = aVar.i;
            }
            this.g0.A(this, true);
        }
        p3();
    }

    public static void Z2(Intent intent, int i, boolean z, ViewOnClickListenerC3543a viewOnClickListenerC3543a) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg-intent", intent);
        bundle.putInt("arg-position", i);
        bundle.putBoolean("arg-show-spinner", z);
        viewOnClickListenerC3543a.v2(bundle);
    }

    private boolean d3() {
        SubsamplingScaleImageView subsamplingScaleImageView = this.k0;
        return subsamplingScaleImageView != null && subsamplingScaleImageView.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f3() {
        U2(true);
        this.z0.setVisibility(8);
        this.y0 = false;
    }

    public static ViewOnClickListenerC3543a g3(Intent intent, int i, boolean z) {
        ViewOnClickListenerC3543a viewOnClickListenerC3543a = new ViewOnClickListenerC3543a();
        Z2(intent, i, z, viewOnClickListenerC3543a);
        return viewOnClickListenerC3543a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i3() {
        if (X0()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("use_factory_if_possible", false);
            w0().g(3, bundle, this);
        }
    }

    private void j3() {
        SubsamplingScaleImageView subsamplingScaleImageView = this.k0;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.recycle();
            this.F0 = Float.NaN;
        }
        PhotoView photoView = this.l0;
        if (photoView != null) {
            photoView.f(null);
        }
    }

    private void n3() {
        com.android.ex.photo.e eVar = this.g0;
        l3(eVar == null ? false : eVar.t(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3(String str, Throwable th) {
        this.y0 = false;
        this.t0.b(8);
        this.q0.setText(m.a);
        this.q0.setVisibility(0);
    }

    private void p3() {
        com.android.ex.photo.e eVar = this.g0;
        if (eVar == null) {
            return;
        }
        c(eVar.B());
    }

    private void q3() {
        int f2;
        int i;
        ax.y3.c cVar = this.h0;
        if (cVar == null || (f2 = cVar.f(this)) == (i = this.u0) || f2 < 0) {
            return;
        }
        if (this.g0.j(i) == this) {
            this.g0.C(this.u0);
        }
        this.u0 = f2;
        if (e1()) {
            this.g0.D(this.u0, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void D1() {
        if (this.w0) {
            f0().unregisterReceiver(this.i0);
        }
        this.g0.q(this);
        this.g0.C(this.u0);
        super.D1();
    }

    @Override // com.android.ex.photo.e.a
    public void F(Cursor cursor) {
        Object d2;
        if (this.h0 == null) {
            return;
        }
        q3();
        if (!cursor.moveToPosition(this.u0) || b3()) {
            return;
        }
        this.g0.u(this, cursor);
        ax.J0.a w0 = w0();
        Object d3 = w0.d(3);
        if (d3 != null) {
            ax.A3.b bVar = (ax.A3.b) d3;
            String E = this.h0.E(cursor);
            this.d0 = E;
            bVar.b(E);
            bVar.a();
        }
        if (this.A0 || (d2 = w0.d(2)) == null) {
            return;
        }
        ax.A3.b bVar2 = (ax.A3.b) d2;
        String H = this.h0.H(cursor);
        this.e0 = H;
        bVar2.b(H);
        bVar2.a();
    }

    @Override // com.android.ex.photo.e.b
    public void H(boolean z) {
        n3();
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        this.g0.D(this.u0, this);
        this.g0.x(this);
        C0507a c0507a = null;
        if (this.w0) {
            if (this.i0 == null) {
                this.i0 = new g(this, c0507a);
            }
            f0().registerReceiver(this.i0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) f0().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                this.B0 = activeNetworkInfo.isConnected();
            } else {
                this.B0 = false;
            }
        }
        if (b3()) {
            return;
        }
        this.y0 = true;
        this.t0.b(0);
        this.z0.setVisibility(0);
        w0().e(2, null, this);
        w0().e(3, null, this);
    }

    @Override // androidx.fragment.app.Fragment
    public void I1(Bundle bundle) {
        super.I1(bundle);
        Intent intent = this.f0;
        if (intent != null) {
            bundle.putParcelable("com.android.mail.photo.fragments.PhotoViewFragment.INTENT", intent.getExtras());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void K1() {
        if (d3()) {
            ImageViewState state = this.k0.getState();
            this.E0 = state;
            if (state != null && state.getScale() == this.k0.getMinScale()) {
                this.E0 = null;
            }
        }
        j3();
        super.K1();
    }

    @Override // com.android.ex.photo.e.b
    public void M() {
        if (this.g0.y(this)) {
            if (b3()) {
                PhotoView photoView = this.l0;
                if (photoView != null && (photoView.getDrawable() instanceof Animatable)) {
                    ((Animatable) this.l0.getDrawable()).start();
                }
            } else {
                w0().g(2, null, this);
            }
            this.g0.g(this);
        } else {
            k3();
        }
        p3();
    }

    @Override // com.android.ex.photo.e.b
    public void N() {
        k3();
    }

    public void U2(boolean z) {
        SubsamplingScaleImageView subsamplingScaleImageView = this.k0;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setZoomEnabled(z);
            this.k0.setPanEnabled(z);
            this.k0.setQuickScaleEnabled(z);
        }
        PhotoView photoView = this.l0;
        if (photoView != null) {
            photoView.j(z);
        }
    }

    protected com.android.ex.photo.e V2() {
        return ((f.g) f0()).j();
    }

    public TextView W2() {
        return this.q0;
    }

    public com.android.ex.photo.c X2() {
        return this.G0;
    }

    public String Y2() {
        return this.d0;
    }

    protected void a3(View view) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.j0 = view;
        view.setOnClickListener(this);
        this.l0 = (PhotoView) view.findViewById(j.k);
        SubsamplingScaleImageView subsamplingScaleImageView = (SubsamplingScaleImageView) view.findViewById(j.n);
        this.k0 = subsamplingScaleImageView;
        subsamplingScaleImageView.setOnStateChangedListener(new C0507a());
        this.k0.setOnGenericMotionListener(new b());
        this.l0.setMaxInitialScale(this.f0.getFloatExtra("max_scale", 1.0f));
        this.l0.setOnScaleChangedListener(new c());
        this.l0.setOnClickListener(this);
        this.l0.w(this.v0, false);
        this.l0.j(false);
        View findViewById = view.findViewById(j.a);
        this.m0 = findViewById;
        BottomSheetBehavior q0 = BottomSheetBehavior.q0(findViewById);
        this.n0 = q0;
        q0.Z0(5);
        this.n0.L0(false);
        this.n0.R0(true);
        this.n0.c0(new d());
        this.k0.setOnClickListener(this);
        SubsamplingScaleImageView.setPreferredBitmapConfig(config);
        this.z0 = view.findViewById(j.i);
        this.p0 = (ImageView) view.findViewById(j.j);
        this.A0 = false;
        ProgressBar progressBar = (ProgressBar) view.findViewById(j.e);
        ProgressBar progressBar2 = (ProgressBar) view.findViewById(j.b);
        TypedValue typedValue = new TypedValue();
        b().getTheme().resolveAttribute(C2506a.b, typedValue, true);
        int complexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue.data, b().getResources().getDisplayMetrics());
        int i = (int) (b().getResources().getDisplayMetrics().density * 24.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) progressBar.getLayoutParams();
        int i2 = complexToDimensionPixelSize + i;
        marginLayoutParams.topMargin = i2;
        progressBar.setLayoutParams(marginLayoutParams);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) progressBar2.getLayoutParams();
        marginLayoutParams2.topMargin = i2;
        progressBar2.setLayoutParams(marginLayoutParams2);
        this.t0 = new ax.D3.a(progressBar2, progressBar, true);
        this.q0 = (TextView) view.findViewById(j.c);
        this.r0 = (TextView) view.findViewById(j.d);
        this.s0 = (ImageView) view.findViewById(j.m);
        n3();
    }

    public boolean b3() {
        if (d3()) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.k0;
            return subsamplingScaleImageView != null && subsamplingScaleImageView.hasImage();
        }
        PhotoView photoView = this.l0;
        return photoView != null && photoView.q();
    }

    @Override // com.android.ex.photo.e.b
    public void c(boolean z) {
        this.o0 = true;
        if (z) {
            this.g0.i(this.G0, this.m0);
            this.n0.Z0(3);
            this.n0.L0(true);
        } else {
            this.n0.Z0(5);
            this.n0.L0(false);
        }
        this.o0 = false;
    }

    public boolean c3() {
        if (d3()) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.k0;
            return subsamplingScaleImageView != null && subsamplingScaleImageView.isReady();
        }
        PhotoView photoView = this.l0;
        return photoView != null && photoView.q();
    }

    public boolean e3() {
        if (d3()) {
            float minScale = Float.isNaN(this.F0) ? this.k0.getMinScale() : this.F0;
            return this.k0.getScale() > minScale + Math.max(0.001f, minScale * 0.001f);
        }
        PhotoView photoView = this.l0;
        if (photoView == null || photoView.getVisibility() != 0 || this.l0.getMinScale() <= 0.0f) {
            return false;
        }
        float initialScale = this.l0.getInitialScale();
        return this.l0.getCurrentScale() > initialScale + Math.max(0.001f, initialScale * 0.001f);
    }

    @Override // com.android.ex.photo.e.b
    public boolean g(float f2, float f3) {
        PhotoView photoView;
        return this.g0.y(this) && !d3() && (photoView = this.l0) != null && photoView.o(f2, f3);
    }

    @Override // androidx.fragment.app.Fragment
    public void h1(Bundle bundle) {
        super.h1(bundle);
        com.android.ex.photo.e V2 = V2();
        this.g0 = V2;
        if (V2 == null) {
            throw new IllegalArgumentException("Activity must be a derived class of PhotoViewActivity");
        }
        ax.y3.c m = V2.m();
        this.h0 = m;
        if (m == null) {
            throw new IllegalStateException("Callback reported null adapter");
        }
        n3();
    }

    @Override // ax.J0.a.InterfaceC0095a
    /* renamed from: h3, reason: merged with bridge method [inline-methods] */
    public void v(ax.K0.c<b.a> cVar, b.a aVar) {
        if (R0() == null || !X0()) {
            return;
        }
        Drawable a = aVar.a(G0());
        int k = cVar.k();
        if (k != 2) {
            if (k == 3) {
                T2(aVar, false);
            }
        } else if (this.C0) {
            T2(aVar, true);
        } else {
            if (c3()) {
                return;
            }
            if (a == null) {
                this.p0.setVisibility(8);
                this.A0 = false;
            } else {
                this.p0.setImageDrawable(a);
                this.p0.setVisibility(0);
                this.A0 = true;
            }
            if (G0().getBoolean(com.android.ex.photo.g.a)) {
                this.p0.setScaleType(ImageView.ScaleType.CENTER);
            }
            U2(false);
        }
        if (!this.y0) {
            this.t0.b(8);
        }
        if (a != null) {
            this.g0.o(this.u0);
        }
        n3();
    }

    @Override // com.android.ex.photo.e.b
    public void k() {
        w0().g(3, null, this);
    }

    public void k3() {
        SubsamplingScaleImageView subsamplingScaleImageView = this.k0;
        if (subsamplingScaleImageView != null) {
            float minScale = subsamplingScaleImageView.getMinScale();
            if (!Float.isInfinite(minScale) && !Float.isNaN(minScale)) {
                this.k0.resetScaleAndCenter();
            }
        }
        PhotoView photoView = this.l0;
        if (photoView != null) {
            photoView.r();
            if (this.l0.getDrawable() instanceof Animatable) {
                ((Animatable) this.l0.getDrawable()).stop();
            }
        }
    }

    public void l3(boolean z) {
        this.v0 = z;
    }

    public void m3(h hVar) {
        this.H0 = hVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void n1(Bundle bundle) {
        Bundle bundle2;
        super.n1(bundle);
        Bundle j0 = j0();
        if (j0 == null) {
            return;
        }
        Intent intent = (Intent) j0.getParcelable("arg-intent");
        this.f0 = intent;
        this.C0 = intent.getBooleanExtra("display_thumbs_fullscreen", false);
        this.u0 = j0.getInt("arg-position");
        this.x0 = j0.getBoolean("arg-show-spinner");
        this.y0 = true;
        if (bundle != null && (bundle2 = bundle.getBundle("com.android.mail.photo.fragments.PhotoViewFragment.INTENT")) != null) {
            this.f0 = new Intent().putExtras(bundle2);
        }
        Intent intent2 = this.f0;
        if (intent2 != null) {
            this.d0 = intent2.getStringExtra("resolved_photo_uri");
            this.e0 = this.f0.getStringExtra("thumbnail_uri");
            this.w0 = this.f0.getBooleanExtra("watch_network", false);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        com.android.ex.photo.e eVar = this.g0;
        if (eVar != null) {
            if (eVar.d()) {
                this.g0.f();
                return;
            }
            if (this.g0.B()) {
                this.g0.c(false);
                return;
            }
            if (!this.g0.s()) {
                this.g0.n();
                return;
            }
            Uri parse = Uri.parse(Y2());
            if (view.isFocused() && this.g0.l(parse)) {
                this.g0.r(parse, false);
            } else {
                this.g0.n();
            }
        }
    }

    @Override // com.android.ex.photo.e.b
    public boolean r(float f2, float f3) {
        PhotoView photoView;
        return this.g0.y(this) && !d3() && (photoView = this.l0) != null && photoView.p(f2, f3);
    }

    @Override // androidx.fragment.app.Fragment
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(l.b, viewGroup, false);
        a3(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void u1() {
        PhotoView photoView = this.l0;
        if (photoView != null) {
            photoView.setOnScaleChangedListener(null);
            this.l0.g();
            this.l0 = null;
        }
        SubsamplingScaleImageView subsamplingScaleImageView = this.k0;
        if (subsamplingScaleImageView != null) {
            subsamplingScaleImageView.setOnStateChangedListener(null);
            this.k0.recycle();
            this.k0 = null;
        }
        this.H0 = null;
        super.u1();
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        this.g0 = null;
        super.v1();
    }

    @Override // ax.J0.a.InterfaceC0095a
    public ax.K0.c<b.a> w(int i, Bundle bundle) {
        String str = null;
        if (this.x0) {
            return null;
        }
        if (i == 2) {
            str = this.e0;
        } else if (i == 3) {
            str = this.d0;
        }
        return this.g0.z(i, bundle, str);
    }

    /* renamed from: ax.z3.a$b */
    class b implements View.OnGenericMotionListener {
        private float c;
        private PointF a = new PointF();
        private PointF b = new PointF();
        private SubsamplingScaleImageView.OnAnimationEventListener d = new C0508a();

        b() {
        }

        @Override // android.view.View.OnGenericMotionListener
        public boolean onGenericMotion(View view, MotionEvent motionEvent) {
            if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8) {
                return false;
            }
            float f = this.c;
            if (f == 0.0f) {
                f = ViewOnClickListenerC3543a.this.k0.getScale();
            }
            if (motionEvent.getAxisValue(9) < 0.0f) {
                float minScale = ViewOnClickListenerC3543a.this.k0.getMinScale();
                if (f <= minScale) {
                    return true;
                }
                this.c = Math.max(minScale, f - 0.1f);
            } else {
                float maxScale = ViewOnClickListenerC3543a.this.k0.getMaxScale();
                if (f >= maxScale) {
                    return true;
                }
                this.c = Math.min(maxScale, f + 0.1f);
            }
            this.b.set(motionEvent.getX(), motionEvent.getY());
            ViewOnClickListenerC3543a.this.k0.viewToSourceCoord(this.b, this.a);
            SubsamplingScaleImageView.AnimationBuilder animateScaleAndCenter = ViewOnClickListenerC3543a.this.k0.animateScaleAndCenter(this.c, this.a);
            if (animateScaleAndCenter == null) {
                return true;
            }
            animateScaleAndCenter.withDuration(100L);
            animateScaleAndCenter.withInterruptible(false);
            animateScaleAndCenter.withOnAnimationEventListener(this.d);
            animateScaleAndCenter.start();
            return true;
        }

        /* renamed from: ax.z3.a$b$a, reason: collision with other inner class name */
        class C0508a implements SubsamplingScaleImageView.OnAnimationEventListener {
            C0508a() {
            }

            @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnAnimationEventListener
            public void onComplete() {
                b.this.c = 0.0f;
            }

            @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnAnimationEventListener
            public void onInterruptedByNewAnim() {
            }

            @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnAnimationEventListener
            public void onInterruptedByUser() {
            }
        }
    }

    /* renamed from: ax.z3.a$f */
    class f implements SubsamplingScaleImageView.OnImageEventListener {
        boolean a;
        boolean b;

        f() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onImageLoadError(Exception exc) {
            if (this.a || !(exc.getCause() instanceof OutOfMemoryError)) {
                ViewOnClickListenerC3543a.this.i3();
            } else {
                ViewOnClickListenerC3543a.this.i3();
            }
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onImageLoaded() {
            this.a = true;
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onReady() {
            ViewOnClickListenerC3543a.this.f3();
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onTileLoadError(Exception exc) {
            if (this.a || !(exc.getCause() instanceof OutOfMemoryError)) {
                ViewOnClickListenerC3543a.this.o3("onTileLoadError", exc);
            } else {
                ViewOnClickListenerC3543a.this.i3();
            }
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onTileLoaded(boolean z) {
            ViewOnClickListenerC3543a.this.R2();
            if (z) {
                return;
            }
            this.b = true;
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onPreviewReleased() {
        }

        @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnImageEventListener
        public void onPreviewLoadError(Exception exc) {
        }
    }

    @Override // ax.J0.a.InterfaceC0095a
    public void p(ax.K0.c<b.a> cVar) {
    }

    /* renamed from: ax.z3.a$d */
    class d extends BottomSheetBehavior.g {
        d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void c(View view, int i) {
            ViewOnClickListenerC3543a viewOnClickListenerC3543a = ViewOnClickListenerC3543a.this;
            if (viewOnClickListenerC3543a.o0 || i != 5 || viewOnClickListenerC3543a.f0() == null) {
                return;
            }
            ViewOnClickListenerC3543a.this.V2().k(false);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, float f) {
        }
    }
}
