/*
 * Decompiled with CFR 0.152.
 */
package ax.z3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
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
import ax.y3.c;
import com.android.ex.photo.e;
import com.android.ex.photo.f;
import com.android.ex.photo.j;
import com.android.ex.photo.l;
import com.android.ex.photo.m;
import com.android.ex.photo.views.PhotoView;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.ImageViewState;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.io.InputStream;

public class a
extends Fragment
implements a.a<b.a>,
View.OnClickListener,
e.b,
e.a {
    protected boolean A0;
    protected boolean B0;
    protected boolean C0;
    private DisplayMetrics D0 = new DisplayMetrics();
    protected ImageViewState E0;
    protected float F0 = Float.NaN;
    protected com.android.ex.photo.c G0;
    private h H0;
    protected String d0;
    protected String e0;
    protected Intent f0;
    protected e g0;
    protected c h0;
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
    protected boolean y0 = true;
    protected View z0;

    private float[] P2(Point point, int n8, boolean bl) {
        int n9;
        ax.z2.a a8 = this.f0() != null ? ax.z2.b.a().b(this.f0()) : ax.z2.b.a().a(this.k0.getContext());
        int n10 = a8.a().width();
        int n11 = a8.a().height();
        if (n8 != 90 && n8 != 270) {
            n9 = point.x;
            n8 = point.y;
        } else {
            n9 = point.y;
            n8 = point.x;
        }
        float f8 = n10;
        float f9 = n9;
        float f10 = f8 / f9;
        f8 = n11;
        float f11 = n8;
        float f12 = f8 / f11;
        float f13 = Math.min(f10, f12);
        this.k0.setDoubleTapZoomStyle(2);
        this.k0.setDoubleTapZoomDuration(300);
        f8 = 1.0f;
        if (n9 < n10 && n8 < n11) {
            if (point.x >= n10 && point.y >= n11) {
                this.k0.setMinimumDpi(160);
                this.k0.setDoubleTapZoomDpi(160);
                this.k0.setMinimumScaleType(1);
                return null;
            }
            this.k0.setMinimumScaleType(3);
            this.k0.setMaximumDpi(160);
            if (bl) {
                this.k0.setMinScale(f13);
            }
            if (f13 < this.k0.getMinScale()) {
                this.k0.setMinScale(f13);
            } else if (this.k0.getMinScale() < 1.0f) {
                this.k0.setMinScale(1.0f);
            }
            float f14 = this.k0.getMinScale();
            f10 = Math.max(f10, f12);
            f8 = 4.0f * f14;
            if (!(f8 < f10)) {
                f12 = f14 * 2.0f;
                f8 = f10;
                if (f12 > f10) {
                    f8 = f12;
                }
            }
            this.k0.setMaxScale(f8);
            this.k0.setDoubleTapZoomScale(f8);
            if (f14 < f13) {
                f8 = f14 * 1.25f;
                if (f13 < f8) {
                    f8 = f13;
                }
                return new float[]{f8, f9 / 2.0f, f11 / 2.0f};
            }
            return null;
        }
        this.k0.setMinimumDpi(160);
        this.k0.setMinimumScaleType(1);
        if (this.k0.getMaxScale() <= f13) {
            this.k0.setMaxScale(f13 * 2.0f);
        }
        f10 = this.k0.getMaxScale();
        if (!(f13 <= 0.5f)) {
            f12 = (f13 + f10) / 2.0f;
            f13 = 3.0f * f13;
            f8 = f12;
            if (f12 < f13) {
                f8 = f13;
            }
        }
        if (f8 > f10) {
            f8 = f10;
        } else if (f10 - f8 < 0.2f) {
            f8 = f10;
        }
        this.k0.setDoubleTapZoomScale(f8);
        return null;
    }

    private void Q2(b.a object, boolean bl) {
        boolean bl2;
        block20: {
            block19: {
                Object object2;
                Object object3;
                Object object4;
                block18: {
                    object4 = object.a(this.G0());
                    object3 = object.f;
                    object2 = Float.NaN;
                    bl2 = true;
                    if (object3 == null || object.c != null || object.a == null || object4 != null) break block18;
                    if (this.k0 == null) break block19;
                    object4 = ImageSource.factory(new SubsamplingScaleImageView.DecodeInputStreamFactory(){
                        final b.a a;
                        final a b;
                        {
                            this.b = a8;
                            this.a = a9;
                        }

                        @Override
                        public InputStream createInputStream() throws IOException {
                            return this.a.f.createInputStream();
                        }
                    });
                    object3 = object.a;
                    ((ImageSource)object4).dimensions(((Point)object3).x, ((Point)object3).y);
                    object3 = this.P2(object.a, object.d, object.g);
                    if (object3 != null) {
                        object2 = object3[0];
                    }
                    this.F0 = object2;
                    this.k0.setOrientation(object.d);
                    if (!this.k0.isTileBgPaintSet()) {
                        this.k0.setTileBackgroundPaint(ax.C3.e.b(20));
                    }
                    if ((object = this.E0) != null && !bl) {
                        this.k0.setImage((ImageSource)object4, (ImageViewState)object);
                    } else {
                        this.k0.setImage((ImageSource)object4);
                    }
                    if (object3 != null) {
                        this.k0.setScaleAndCenter((float)object3[0], new PointF((float)(object3[1] / 2.0f), (float)(object3[2] / 2.0f)));
                    }
                    this.k0.setVisibility(0);
                    this.l0.setVisibility(8);
                    this.k0.setOnImageEventListener(new SubsamplingScaleImageView.OnImageEventListener(this){
                        boolean a;
                        boolean b;
                        final a c;
                        {
                            this.c = a8;
                        }

                        @Override
                        public void onImageLoadError(Exception exception) {
                            if (!this.a && exception.getCause() instanceof OutOfMemoryError) {
                                this.c.i3();
                                return;
                            }
                            this.c.i3();
                        }

                        @Override
                        public void onImageLoaded() {
                            this.a = true;
                        }

                        @Override
                        public void onPreviewLoadError(Exception exception) {
                        }

                        @Override
                        public void onPreviewReleased() {
                        }

                        @Override
                        public void onReady() {
                            this.c.f3();
                        }

                        @Override
                        public void onTileLoadError(Exception exception) {
                            if (!this.a && exception.getCause() instanceof OutOfMemoryError) {
                                this.c.i3();
                                return;
                            }
                            this.c.o3("onTileLoadError", exception);
                        }

                        @Override
                        public void onTileLoaded(boolean bl) {
                            this.c.R2();
                            if (!bl) {
                                this.b = true;
                            }
                        }
                    });
                    break block20;
                }
                object3 = object.c;
                if (object3 != null && object.a != null && object.b == null) {
                    if (this.k0 != null) {
                        object4 = ImageSource.cachedBitmap((Bitmap)object3);
                        object3 = new Point();
                        ((Point)object3).x = object.c.getWidth();
                        ((Point)object3).y = object.c.getHeight();
                        if ((object3 = (Object)this.P2((Point)object3, object.d, object.g)) != null) {
                            object2 = object3[0];
                        }
                        this.F0 = object2;
                        this.k0.setOrientation(object.d);
                        if (!this.k0.isTileBgPaintSet()) {
                            this.k0.setTileBackgroundPaint(ax.C3.e.b(20));
                        }
                        if ((object = this.E0) != null && !bl) {
                            this.k0.setImage((ImageSource)object4, (ImageViewState)object);
                        } else {
                            this.k0.setImage((ImageSource)object4);
                        }
                        if (object3 != null) {
                            this.k0.setScaleAndCenter((float)object3[0], new PointF((float)(object3[1] / 2.0f), (float)(object3[2] / 2.0f)));
                        }
                        this.k0.setOnImageEventListener(null);
                        this.k0.setVisibility(0);
                        this.l0.setVisibility(8);
                    }
                } else if (object4 != null) {
                    object = this.l0;
                    if (object != null) {
                        ((PhotoView)((Object)object)).setMaxInitialScale(3.0f);
                        this.l0.e((Drawable)object4);
                        this.l0.setVisibility(0);
                        this.k0.setVisibility(8);
                    }
                    if (object4 instanceof Animatable && this.g0.y(this)) {
                        ((Animatable)object4).start();
                    }
                }
            }
            bl2 = false;
        }
        if (this.E0 != null && !bl) {
            this.E0 = null;
        }
        if (!bl2) {
            this.f3();
        }
    }

    private void R2() {
        this.q0.setVisibility(8);
        this.r0.setVisibility(8);
    }

    private void S2() {
        h h8 = this.H0;
        if (h8 != null) {
            h8.a(this.e3());
        }
    }

    private void T2(b.a a8, boolean bl) {
        int n8 = a8.e;
        if (n8 != 1 && n8 != 2) {
            this.R2();
            this.Q2(a8, bl);
            if (!bl) {
                this.G0 = a8.i;
            }
            this.g0.A(this, true);
        } else {
            this.o3("displayPhoto", a8.h);
            if (!bl) {
                this.G0 = null;
            }
            this.g0.A(this, false);
        }
        this.p3();
    }

    public static void Z2(Intent intent, int n8, boolean bl, a a8) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg-intent", (Parcelable)intent);
        bundle.putInt("arg-position", n8);
        bundle.putBoolean("arg-show-spinner", bl);
        a8.v2(bundle);
    }

    private boolean d3() {
        SubsamplingScaleImageView subsamplingScaleImageView = this.k0;
        if (subsamplingScaleImageView == null) {
            return false;
        }
        return subsamplingScaleImageView.getVisibility() == 0;
    }

    private void f3() {
        this.U2(true);
        this.z0.setVisibility(8);
        this.y0 = false;
    }

    public static a g3(Intent intent, int n8, boolean bl) {
        a a8 = new a();
        a.Z2(intent, n8, bl, a8);
        return a8;
    }

    private void i3() {
        if (!this.X0()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("use_factory_if_possible", false);
        this.w0().g(3, bundle, this);
    }

    private void j3() {
        View view = this.k0;
        if (view != null) {
            view.recycle();
            this.F0 = Float.NaN;
        }
        if ((view = this.l0) != null) {
            view.f(null);
        }
    }

    private void n3() {
        e e8 = this.g0;
        boolean bl = e8 == null ? false : e8.t(this);
        this.l3(bl);
    }

    private void o3(String string, Throwable throwable) {
        this.y0 = false;
        this.t0.b(8);
        this.q0.setText(m.a);
        this.q0.setVisibility(0);
    }

    private void p3() {
        e e8 = this.g0;
        if (e8 == null) {
            return;
        }
        this.c(e8.B());
    }

    private void q3() {
        int n8;
        int n9;
        c c8 = this.h0;
        if (c8 != null && (n9 = c8.f(this)) != (n8 = this.u0) && n9 >= 0) {
            if (this.g0.j(n8) == this) {
                this.g0.C(this.u0);
            }
            this.u0 = n9;
            if (this.e1()) {
                this.g0.D(this.u0, this);
            }
        }
    }

    @Override
    public void D1() {
        if (this.w0) {
            this.f0().unregisterReceiver(this.i0);
        }
        this.g0.q(this);
        this.g0.C(this.u0);
        super.D1();
    }

    @Override
    public void F(Cursor object) {
        if (this.h0 != null) {
            this.q3();
            if (object.moveToPosition(this.u0) && !this.b3()) {
                this.g0.u(this, (Cursor)object);
                Object object2 = this.w0();
                Object object3 = ((ax.J0.a)object2).d(3);
                if (object3 != null) {
                    String string;
                    object3 = (ax.A3.b)object3;
                    this.d0 = string = this.h0.E((Cursor)object);
                    object3.b(string);
                    object3.a();
                }
                if (!this.A0 && (object2 = ((ax.J0.a)object2).d(2)) != null) {
                    object2 = (ax.A3.b)object2;
                    object = this.h0.H((Cursor)object);
                    this.e0 = object;
                    object2.b((String)object);
                    object2.a();
                }
            }
        }
    }

    @Override
    public void H(boolean bl) {
        this.n3();
    }

    @Override
    public void H1() {
        super.H1();
        this.g0.D(this.u0, this);
        this.g0.x(this);
        if (this.w0) {
            if (this.i0 == null) {
                this.i0 = new g(this);
            }
            this.f0().registerReceiver(this.i0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            NetworkInfo networkInfo = ((ConnectivityManager)this.f0().getSystemService("connectivity")).getActiveNetworkInfo();
            this.B0 = networkInfo != null ? networkInfo.isConnected() : false;
        }
        if (!this.b3()) {
            this.y0 = true;
            this.t0.b(0);
            this.z0.setVisibility(0);
            this.w0().e(2, null, this);
            this.w0().e(3, null, this);
        }
    }

    @Override
    public void I1(Bundle bundle) {
        super.I1(bundle);
        Intent intent = this.f0;
        if (intent != null) {
            bundle.putParcelable("com.android.mail.photo.fragments.PhotoViewFragment.INTENT", (Parcelable)intent.getExtras());
        }
    }

    @Override
    public void K1() {
        if (this.d3()) {
            ImageViewState imageViewState;
            this.E0 = imageViewState = this.k0.getState();
            if (imageViewState != null && imageViewState.getScale() == this.k0.getMinScale()) {
                this.E0 = null;
            }
        }
        this.j3();
        super.K1();
    }

    @Override
    public void M() {
        if (!this.g0.y(this)) {
            this.k3();
        } else {
            if (!this.b3()) {
                this.w0().g(2, null, this);
            } else {
                PhotoView photoView = this.l0;
                if (photoView != null && photoView.getDrawable() instanceof Animatable) {
                    ((Animatable)this.l0.getDrawable()).start();
                }
            }
            this.g0.g(this);
        }
        this.p3();
    }

    @Override
    public void N() {
        this.k3();
    }

    public void U2(boolean bl) {
        View view = this.k0;
        if (view != null) {
            view.setZoomEnabled(bl);
            this.k0.setPanEnabled(bl);
            this.k0.setQuickScaleEnabled(bl);
        }
        if ((view = this.l0) != null) {
            view.j(bl);
        }
    }

    protected e V2() {
        return ((f.g)((Object)this.f0())).j();
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
        view.setOnClickListener((View.OnClickListener)this);
        this.l0 = (PhotoView)view.findViewById(j.k);
        Object object = (SubsamplingScaleImageView)view.findViewById(j.n);
        this.k0 = object;
        ((SubsamplingScaleImageView)((Object)object)).setOnStateChangedListener(new SubsamplingScaleImageView.DefaultOnStateChangedListener(this){
            final a a;
            {
                this.a = a8;
            }

            @Override
            public void onScaleChanged(float f8, int n8) {
                this.a.S2();
            }
        });
        this.k0.setOnGenericMotionListener(new View.OnGenericMotionListener(this){
            private PointF a;
            private PointF b;
            private float c;
            private SubsamplingScaleImageView.OnAnimationEventListener d;
            final a e;
            {
                this.e = a8;
                this.a = new PointF();
                this.b = new PointF();
                this.d = new SubsamplingScaleImageView.OnAnimationEventListener(this){
                    final b a;
                    {
                        this.a = b8;
                    }

                    @Override
                    public void onComplete() {
                        b.a(this.a, 0.0f);
                    }

                    @Override
                    public void onInterruptedByNewAnim() {
                    }

                    @Override
                    public void onInterruptedByUser() {
                    }
                };
            }

            static /* synthetic */ float a(b b8, float f8) {
                b8.c = f8;
                return f8;
            }

            public boolean onGenericMotion(View object, MotionEvent motionEvent) {
                block5: {
                    block7: {
                        block8: {
                            float f8;
                            block6: {
                                if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8) break block5;
                                f8 = this.c;
                                if (f8 == 0.0f) {
                                    f8 = this.e.k0.getScale();
                                }
                                if (!(motionEvent.getAxisValue(9) < 0.0f)) break block6;
                                float f9 = this.e.k0.getMinScale();
                                if (!(f8 > f9)) break block7;
                                this.c = Math.max(f9, f8 - 0.1f);
                                break block8;
                            }
                            float f10 = this.e.k0.getMaxScale();
                            if (!(f8 < f10)) break block7;
                            this.c = Math.min(f10, f8 + 0.1f);
                        }
                        this.b.set(motionEvent.getX(), motionEvent.getY());
                        this.e.k0.viewToSourceCoord(this.b, this.a);
                        object = this.e.k0.animateScaleAndCenter(this.c, this.a);
                        if (object != null) {
                            ((SubsamplingScaleImageView.AnimationBuilder)object).withDuration(100L);
                            ((SubsamplingScaleImageView.AnimationBuilder)object).withInterruptible(false);
                            ((SubsamplingScaleImageView.AnimationBuilder)object).withOnAnimationEventListener(this.d);
                            ((SubsamplingScaleImageView.AnimationBuilder)object).start();
                        }
                    }
                    return true;
                }
                return false;
            }
        });
        this.l0.setMaxInitialScale(this.f0.getFloatExtra("max_scale", 1.0f));
        this.l0.setOnScaleChangedListener(new PhotoView.a(this){
            final a a;
            {
                this.a = a8;
            }

            @Override
            public void a() {
                this.a.S2();
            }
        });
        this.l0.setOnClickListener(this);
        this.l0.w(this.v0, false);
        this.l0.j(false);
        object = view.findViewById(j.a);
        this.m0 = object;
        object = BottomSheetBehavior.q0(object);
        this.n0 = object;
        ((BottomSheetBehavior)object).Z0(5);
        this.n0.L0(false);
        this.n0.R0(true);
        this.n0.c0(new BottomSheetBehavior.g(this){
            final a a;
            {
                this.a = a8;
            }

            @Override
            public void b(View view, float f8) {
            }

            @Override
            public void c(View object, int n8) {
                object = this.a;
                if (!((a)object).o0 && n8 == 5 && ((Fragment)object).f0() != null) {
                    this.a.V2().k(false);
                }
            }
        });
        this.k0.setOnClickListener(this);
        SubsamplingScaleImageView.setPreferredBitmapConfig(config);
        this.z0 = view.findViewById(j.i);
        this.p0 = (ImageView)view.findViewById(j.j);
        this.A0 = false;
        config = (ProgressBar)view.findViewById(j.e);
        object = (ProgressBar)view.findViewById(j.b);
        TypedValue typedValue = new TypedValue();
        this.b().getTheme().resolveAttribute(ax.m.a.b, typedValue, true);
        int n8 = TypedValue.complexToDimensionPixelSize((int)typedValue.data, (DisplayMetrics)this.b().getResources().getDisplayMetrics());
        int n9 = (int)(this.b().getResources().getDisplayMetrics().density * 24.0f);
        typedValue = (ViewGroup.MarginLayoutParams)config.getLayoutParams();
        typedValue.topMargin = n8 += n9;
        config.setLayoutParams((ViewGroup.LayoutParams)typedValue);
        typedValue = (ViewGroup.MarginLayoutParams)object.getLayoutParams();
        typedValue.topMargin = n8;
        object.setLayoutParams((ViewGroup.LayoutParams)typedValue);
        this.t0 = new ax.D3.a((ProgressBar)object, (ProgressBar)config, true);
        this.q0 = (TextView)view.findViewById(j.c);
        this.r0 = (TextView)view.findViewById(j.d);
        this.s0 = (ImageView)view.findViewById(j.m);
        this.n3();
    }

    public boolean b3() {
        if (this.d3()) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.k0;
            return subsamplingScaleImageView != null && subsamplingScaleImageView.hasImage();
        }
        PhotoView photoView = this.l0;
        return photoView != null && photoView.q();
    }

    @Override
    public void c(boolean bl) {
        this.o0 = true;
        if (bl) {
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
        if (this.d3()) {
            SubsamplingScaleImageView subsamplingScaleImageView = this.k0;
            return subsamplingScaleImageView != null && subsamplingScaleImageView.isReady();
        }
        PhotoView photoView = this.l0;
        return photoView != null && photoView.q();
    }

    public boolean e3() {
        if (this.d3()) {
            float f8 = Float.isNaN(this.F0) ? this.k0.getMinScale() : this.F0;
            float f9 = Math.max(0.001f, f8 * 0.001f);
            return this.k0.getScale() > f8 + f9;
        }
        PhotoView photoView = this.l0;
        if (photoView != null && photoView.getVisibility() == 0) {
            if (this.l0.getMinScale() <= 0.0f) {
                return false;
            }
            float f10 = this.l0.getInitialScale();
            float f11 = Math.max(0.001f, f10 * 0.001f);
            if (this.l0.getCurrentScale() > f10 + f11) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean g(float f8, float f9) {
        if (!this.g0.y(this)) {
            return false;
        }
        if (this.d3()) {
            return false;
        }
        PhotoView photoView = this.l0;
        return photoView != null && photoView.o(f8, f9);
    }

    @Override
    public void h1(Bundle object) {
        super.h1((Bundle)object);
        object = this.V2();
        this.g0 = object;
        if (object != null) {
            this.h0 = object = object.m();
            if (object != null) {
                this.n3();
                return;
            }
            throw new IllegalStateException("Callback reported null adapter");
        }
        throw new IllegalArgumentException("Activity must be a derived class of PhotoViewActivity");
    }

    public void h3(ax.K0.c<b.a> c8, b.a a8) {
        block10: {
            Drawable drawable;
            block12: {
                block13: {
                    block11: {
                        if (this.R0() == null || !this.X0()) break block10;
                        drawable = a8.a(this.G0());
                        int n8 = c8.k();
                        if (n8 == 2) break block11;
                        if (n8 == 3) {
                            this.T2(a8, false);
                        }
                        break block12;
                    }
                    if (!this.C0) break block13;
                    this.T2(a8, true);
                    break block12;
                }
                if (this.c3()) break block10;
                if (drawable == null) {
                    this.p0.setVisibility(8);
                    this.A0 = false;
                } else {
                    this.p0.setImageDrawable(drawable);
                    this.p0.setVisibility(0);
                    this.A0 = true;
                }
                if (this.G0().getBoolean(com.android.ex.photo.g.a)) {
                    this.p0.setScaleType(ImageView.ScaleType.CENTER);
                }
                this.U2(false);
            }
            if (!this.y0) {
                this.t0.b(8);
            }
            if (drawable != null) {
                this.g0.o(this.u0);
            }
            this.n3();
        }
    }

    @Override
    public void k() {
        this.w0().g(3, null, this);
    }

    public void k3() {
        float f8;
        View view = this.k0;
        if (view != null && !Float.isInfinite(f8 = view.getMinScale()) && !Float.isNaN(f8)) {
            this.k0.resetScaleAndCenter();
        }
        if ((view = this.l0) != null) {
            view.r();
            if (this.l0.getDrawable() instanceof Animatable) {
                ((Animatable)this.l0.getDrawable()).stop();
            }
        }
    }

    public void l3(boolean bl) {
        this.v0 = bl;
    }

    public void m3(h h8) {
        this.H0 = h8;
    }

    @Override
    public void n1(Bundle bundle) {
        super.n1(bundle);
        Bundle bundle2 = this.j0();
        if (bundle2 != null) {
            Intent intent;
            this.f0 = intent = (Intent)bundle2.getParcelable("arg-intent");
            this.C0 = intent.getBooleanExtra("display_thumbs_fullscreen", false);
            this.u0 = bundle2.getInt("arg-position");
            this.x0 = bundle2.getBoolean("arg-show-spinner");
            this.y0 = true;
            if (bundle != null && (bundle = bundle.getBundle("com.android.mail.photo.fragments.PhotoViewFragment.INTENT")) != null) {
                this.f0 = new Intent().putExtras(bundle);
            }
            if ((bundle = this.f0) != null) {
                this.d0 = bundle.getStringExtra("resolved_photo_uri");
                this.e0 = this.f0.getStringExtra("thumbnail_uri");
                this.w0 = this.f0.getBooleanExtra("watch_network", false);
            }
        }
    }

    public void onClick(View view) {
        e e8 = this.g0;
        if (e8 != null) {
            if (e8.d()) {
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
            e8 = Uri.parse((String)this.Y2());
            if (view.isFocused() && this.g0.l((Uri)e8)) {
                this.g0.r((Uri)e8, false);
                return;
            }
            this.g0.n();
        }
    }

    @Override
    public void p(ax.K0.c<b.a> c8) {
    }

    @Override
    public boolean r(float f8, float f9) {
        if (!this.g0.y(this)) {
            return false;
        }
        if (this.d3()) {
            return false;
        }
        PhotoView photoView = this.l0;
        return photoView != null && photoView.p(f8, f9);
    }

    @Override
    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(l.b, viewGroup, false);
        this.a3((View)layoutInflater);
        return layoutInflater;
    }

    @Override
    public void u1() {
        View view = this.l0;
        if (view != null) {
            view.setOnScaleChangedListener(null);
            this.l0.g();
            this.l0 = null;
        }
        if ((view = this.k0) != null) {
            view.setOnStateChangedListener(null);
            this.k0.recycle();
            this.k0 = null;
        }
        this.H0 = null;
        super.u1();
    }

    @Override
    public void v1() {
        this.g0 = null;
        super.v1();
    }

    @Override
    public ax.K0.c<b.a> w(int n8, Bundle bundle) {
        boolean bl = this.x0;
        String string = null;
        if (bl) {
            return null;
        }
        if (n8 != 2) {
            if (n8 == 3) {
                string = this.d0;
            }
        } else {
            string = this.e0;
        }
        return this.g0.z(n8, bundle, string);
    }

    private class g
    extends BroadcastReceiver {
        final a a;

        private g(a a8) {
            this.a = a8;
        }

        public void onReceive(Context object, Intent intent) {
            if ((object = ((ConnectivityManager)object.getSystemService("connectivity")).getActiveNetworkInfo()) != null && object.isConnected()) {
                object = this.a;
                if (!((a)object).B0 && !((a)object).c3()) {
                    object = this.a;
                    if (!((a)object).A0) {
                        ((Fragment)object).w0().g(2, null, this.a);
                    }
                    this.a.w0().g(3, null, this.a);
                    object = this.a;
                    ((a)object).B0 = true;
                    ((a)object).t0.b(0);
                }
                return;
            }
            this.a.B0 = false;
        }
    }

    public static interface h {
        public void a(boolean var1);
    }
}

