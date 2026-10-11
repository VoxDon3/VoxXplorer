package com.voxdon.xplorer.viewer;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.ScaleGestureDetector;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.MySpinner;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.exoplayer.C0605j;
import androidx.media3.exoplayer.C0622s;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.C0639b;
import androidx.media3.ui.C0641d;
import androidx.media3.ui.G;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import ax.P0.A;
import ax.P0.C;
import ax.P0.C0894c;
import ax.P0.C0905n;
import ax.P0.C0912v;
import ax.P0.C0915y;
import ax.P0.F;
import ax.P0.H;
import ax.P0.I;
import ax.P0.InterfaceC0907p;
import ax.P0.N;
import ax.P0.P;
import ax.P0.T;
import ax.P0.V;
import ax.P0.a0;
import ax.Q2.a;
import ax.S2.b;
import ax.U0.g;
import ax.X2.J;
import ax.X2.Q;
import ax.Y0.C1178d;
import ax.Y0.Z;
import ax.a2.C1317a;
import ax.a3.W;
import ax.b0.InterfaceC1440a;
import ax.c3.C1808A;
import ax.c3.C1809B;
import ax.c3.C1833v;
import ax.c3.C1835x;
import ax.c3.K;
import ax.c3.d0;
import ax.f1.L;
import ax.i1.C2212b;
import ax.i1.O;
import ax.i1.Z;
import ax.l1.AbstractC2448G;
import ax.l1.C2452a;
import ax.l1.InterfaceC2445D;
import ax.l1.n;
import ax.m1.j;
import ax.n.AbstractC2559a;
import ax.n.ActivityC2561c;
import ax.n1.C2570a;
import ax.o.C2653a;
import ax.o3.C2686c;
import ax.r7.AbstractC2991z;
import ax.s3.C3045a;
import ax.t3.C3098a;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.C3197o;
import ax.u3.z;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3604x;
import com.voxdon.xplorer.provider.MyFileProvider;
import com.voxdon.xplorer.viewer.VideoPlayerActivity;
import com.voxdon.xplorer.viewer.a;
import com.voxdon.xplorer.viewer.d;
import com.voxdon.xplorer.viewer.e;
import com.voxdon.xplorer.viewer.g;
import com.voxdon.xplorer.R;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.material.snackbar.Snackbar;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Logger;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class VideoPlayerActivity extends ActivityC2561c implements C0641d.m, g.c {
    private static final Logger S1 = Logger.getLogger("FileManager.VideoPlayer");
    private static boolean T1 = false;
    private static boolean U1 = false;
    private TextView A;
    private boolean A0;
    private boolean A1;
    private View B;
    private AudioManager B0;
    private ImageView C;
    private boolean C0;
    private int C1;
    private ProgressBar D;
    private int D0;
    private int D1;
    private TextView E;
    private int E0;
    private com.voxdon.xplorer.viewer.g E1;
    private AspectRatioFrameLayout F;
    private boolean F0;
    int F1;
    private Snackbar G;
    private float G0;
    int G1;
    private View H;
    private boolean H0;
    u H1;
    private Toolbar I;
    private int I0;
    boolean I1;
    private ViewGroup J;
    private boolean J0;
    private ViewGroup K;
    private boolean K0;
    private View L;
    private long L0;
    private View M;
    private long M0;
    private View N;
    private ax.l1.n N0;
    private boolean O;
    private n.e O0;
    private boolean P;
    private AbstractC2991z<V.a> P0;
    private String Q;
    private Drawable Q0;
    private String R;
    private Drawable R0;
    private x R1;
    private C0639b S;
    private Drawable S0;
    private TextView T;
    private Drawable T0;
    private g.a U;
    private Drawable U0;
    private O V;
    private Drawable V0;
    private ExoPlayer W;
    private Drawable W0;
    private ax.b1.O X;
    private Drawable X0;
    private C0915y Y;
    private Drawable Y0;
    private Uri[] Z;
    private Drawable Z0;
    private View a;
    private Uri[] a0;
    private String a1;
    private PlayerView b;
    private Uri[] b0;
    private String b1;
    private boolean c;
    private List<Integer> c0;
    private String c1;
    private Runnable d;
    private boolean d0;
    private String d1;
    private C0641d e;
    private boolean e0;
    private String e1;
    private ViewGroup f;
    private boolean[] f0;
    private String f1;
    private View g;
    private int g0;
    private String g1;
    private View h;
    private int h0;
    private String h1;
    private View i;
    private int i0;
    private String i1;
    private View j;
    private boolean j0;
    private String j1;
    private ImageButton k;
    private float k1;
    private View l;
    private int l0;
    private float l1;
    private View m;
    private int m0;
    private boolean m1;
    private View n;
    private boolean n0;
    private int n1;
    private View o;
    private int o0;
    private long o1;
    private View p;
    private String p1;
    private View q;
    private boolean q0;
    private int q1;
    private ImageButton r;
    private boolean r0;
    private boolean r1;
    private View s;
    private boolean s0;
    private boolean s1;
    private ImageView t;
    private long t0;
    private K t1;
    private ImageButton u;
    private long u0;
    private boolean u1;
    private ImageButton v;
    private boolean v0;
    private Uri v1;
    private ImageButton w;
    private int w0;
    private ImageButton x;
    private int x0;
    private boolean x1;
    private MySpinner y;
    private float y0;
    private int y1;
    private View z;
    private boolean z0;
    private boolean z1;
    private boolean k0 = false;
    private float p0 = 1.0f;
    private long w1 = 150;
    private Handler B1 = new Handler();
    ax.i.r J1 = new p(true);
    Runnable K1 = new b();
    G.a L1 = new c();
    Runnable M1 = new d();
    private ScaleGestureDetector.SimpleOnScaleGestureListener N1 = new e();
    private GestureDetector.SimpleOnGestureListener O1 = new f();
    private View.OnClickListener P1 = new g();
    g.h Q1 = new h();

    class a extends ax.g3.c {
        a() {
        }

        public static /* synthetic */ void b(a aVar, Integer num) {
            VideoPlayerActivity.this.H.setVisibility(8);
            if (num.intValue() == ax.w3.d.j) {
                VideoPlayerActivity.this.z3();
            } else if (num.intValue() == ax.w3.d.k) {
                VideoPlayerActivity.this.V3(R.string.error);
            }
        }

        @Override // ax.g3.c
        public void a(View view) {
            VideoPlayerActivity.this.H.setVisibility(0);
            new ax.w3.d(VideoPlayerActivity.this, new InterfaceC1440a() { // from class: com.voxdon.xplorer.viewer.f
                @Override // ax.b0.InterfaceC1440a
                public final void accept(Object obj) {
                    VideoPlayerActivity.a.b(VideoPlayerActivity.a.this, (Integer) obj);
                }
            }).i(new Void[0]);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VideoPlayerActivity.this.z1) {
                return;
            }
            VideoPlayerActivity.this.r2();
        }
    }

    class c implements G.a {
        private long a;

        c() {
        }

        @Override // androidx.media3.ui.G.a
        public void G(G g, long j) {
            if (VideoPlayerActivity.this.U2()) {
                return;
            }
            VideoPlayerActivity.this.p2();
            this.a = j;
        }

        @Override // androidx.media3.ui.G.a
        public void K(G g, long j) {
            VideoPlayerActivity.this.n2(j, this.a > j, false);
            this.a = j;
        }

        @Override // androidx.media3.ui.G.a
        public void M(G g, long j, boolean z) {
            if (VideoPlayerActivity.this.U2()) {
                VideoPlayerActivity.this.u0 = j;
                VideoPlayerActivity.this.o2();
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoPlayerActivity.this.A.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    class e extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        float a;
        float b;
        float c;
        float d;

        e() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (VideoPlayerActivity.this.V2() || VideoPlayerActivity.this.Z2() || !VideoPlayerActivity.this.h3()) {
                return false;
            }
            VideoPlayerActivity.this.C4(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), this.c - scaleGestureDetector.getFocusX(), this.d - scaleGestureDetector.getFocusY());
            this.c = scaleGestureDetector.getFocusX();
            this.d = scaleGestureDetector.getFocusY();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            if (VideoPlayerActivity.this.V2() || VideoPlayerActivity.this.Z2() || !ax.t3.l.v(VideoPlayerActivity.this)) {
                return false;
            }
            this.a = scaleGestureDetector.getFocusX();
            this.b = scaleGestureDetector.getFocusY();
            this.c = scaleGestureDetector.getFocusX();
            this.d = scaleGestureDetector.getFocusY();
            VideoPlayerActivity.this.z0 = true;
            if (!VideoPlayerActivity.this.h3()) {
                VideoPlayerActivity.this.D4();
            }
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            if (VideoPlayerActivity.this.V2() || VideoPlayerActivity.this.Z2()) {
                return;
            }
            VideoPlayerActivity.this.z0 = false;
            this.a = 0.0f;
            this.b = 0.0f;
            this.c = 0.0f;
            this.d = 0.0f;
        }
    }

    class f extends GestureDetector.SimpleOnGestureListener {
        float a;
        float b;
        long c;
        float d;
        float e;

        f() {
        }

        private void a() {
            this.e = 0.0f;
            this.d = 0.0f;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            VideoPlayerActivity.this.b2();
            if (VideoPlayerActivity.this.W == null) {
                return false;
            }
            int width = VideoPlayerActivity.this.b.getWidth();
            if (width > 0) {
                int i = width / 3;
                int i2 = (width * 2) / 3;
                if (motionEvent.getX() < i) {
                    if (!ax.t3.l.s(VideoPlayerActivity.this)) {
                        return false;
                    }
                    VideoPlayerActivity.this.m2(false);
                    return true;
                }
                if (motionEvent.getX() > i2) {
                    if (!ax.t3.l.s(VideoPlayerActivity.this)) {
                        return false;
                    }
                    VideoPlayerActivity.this.m2(true);
                    return true;
                }
            }
            int i3 = VideoPlayerActivity.this.W.i();
            if (i3 == 2 || i3 == 3) {
                VideoPlayerActivity.this.c4();
            } else if (i3 == 4) {
                VideoPlayerActivity.this.a4();
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return VideoPlayerActivity.this.W != null && Math.abs(f) >= Math.abs(f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (VideoPlayerActivity.this.h3() || VideoPlayerActivity.this.Z2() || !ax.t3.l.q(VideoPlayerActivity.this)) {
                return;
            }
            VideoPlayerActivity.this.l3();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (VideoPlayerActivity.this.W != null && motionEvent != null && motionEvent2 != null) {
                VideoPlayerActivity.this.b2();
                if (VideoPlayerActivity.this.h3()) {
                    if (VideoPlayerActivity.this.c3()) {
                        return false;
                    }
                    VideoPlayerActivity videoPlayerActivity = VideoPlayerActivity.this;
                    videoPlayerActivity.p3(videoPlayerActivity.y0, f, f2);
                    return true;
                }
                if (VideoPlayerActivity.this.Z2()) {
                    a();
                    return false;
                }
                if (!VideoPlayerActivity.this.V2()) {
                    if (motionEvent2.getPointerCount() > 1) {
                        if (motionEvent2.getPointerCount() == 2) {
                            this.d = motionEvent.getX();
                            this.e = motionEvent2.getX();
                        }
                        return false;
                    }
                    if (Math.abs(f) < Math.abs(f2)) {
                        if (Math.abs(motionEvent.getY() - motionEvent2.getY()) < VideoPlayerActivity.this.x0) {
                            return false;
                        }
                        if (motionEvent.getY() < (VideoPlayerActivity.this.a.getHeight() < VideoPlayerActivity.this.C1 * 10 ? VideoPlayerActivity.this.C1 : VideoPlayerActivity.this.a.getHeight() < VideoPlayerActivity.this.D1 * 10 ? VideoPlayerActivity.this.D1 : VideoPlayerActivity.this.a.getHeight() / 10) || motionEvent.getY() > VideoPlayerActivity.this.a.getHeight() - r13) {
                            return false;
                        }
                        this.b = motionEvent.getY();
                        if (VideoPlayerActivity.this.b == null || motionEvent.getX() >= VideoPlayerActivity.this.b.getWidth() / 2) {
                            if (!ax.t3.l.u(VideoPlayerActivity.this)) {
                                return false;
                            }
                            VideoPlayerActivity.this.A4();
                        } else {
                            if (!ax.t3.l.o(VideoPlayerActivity.this)) {
                                return false;
                            }
                            VideoPlayerActivity.this.V1();
                        }
                    } else {
                        if (Math.abs(motionEvent.getX() - motionEvent2.getX()) < VideoPlayerActivity.this.w0) {
                            return false;
                        }
                        this.a = motionEvent.getX();
                        this.c = VideoPlayerActivity.this.W.s0();
                        if (!ax.t3.l.t(VideoPlayerActivity.this)) {
                            return false;
                        }
                        VideoPlayerActivity.this.p2();
                    }
                }
                if (!VideoPlayerActivity.this.V2()) {
                    C3184b.e("what case is this : " + this.a + "," + motionEvent.getX());
                    return true;
                }
                if (VideoPlayerActivity.this.U2()) {
                    long f3 = this.c + ((C3180B.f(VideoPlayerActivity.this, (int) (motionEvent2.getX() - this.a)) * 40000) / 360);
                    long g0 = VideoPlayerActivity.this.W.g0();
                    if (g0 == -9223372036854775807L) {
                        g0 = 0;
                    }
                    if (f3 < 0) {
                        f3 = 0;
                    } else if (f3 > g0) {
                        f3 = g0;
                    }
                    VideoPlayerActivity.this.n2(f3, f > 0.0f, true);
                    return true;
                }
                if (VideoPlayerActivity.this.g3()) {
                    VideoPlayerActivity.this.D3(C3180B.f(VideoPlayerActivity.this, (int) (this.b - motionEvent2.getY())));
                    return true;
                }
                if (VideoPlayerActivity.this.S2()) {
                    VideoPlayerActivity.this.C3(C3180B.f(VideoPlayerActivity.this, (int) (this.b - motionEvent2.getY())));
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            VideoPlayerActivity.this.b2();
            VideoPlayerActivity.this.a4();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    class g extends ax.g3.c {
        g() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            switch (view.getId()) {
                case R.id.custom_audio_track /* 2131362079 */:
                    VideoPlayerActivity.this.d2();
                    break;
                case R.id.custom_less /* 2131362080 */:
                    VideoPlayerActivity.this.F3(false);
                    break;
                case R.id.custom_lock /* 2131362081 */:
                    VideoPlayerActivity.this.j3(true);
                    break;
                case R.id.custom_more /* 2131362082 */:
                    VideoPlayerActivity.this.F3(true);
                    break;
                case R.id.custom_next /* 2131362083 */:
                    VideoPlayerActivity.this.n3();
                    break;
                case R.id.custom_prev /* 2131362084 */:
                    VideoPlayerActivity.this.u3();
                    break;
                case R.id.custom_repeat_toggle /* 2131362085 */:
                    VideoPlayerActivity.this.d4();
                    break;
                case R.id.custom_resize_mode /* 2131362086 */:
                    VideoPlayerActivity.this.e4();
                    break;
                case R.id.custom_rotation /* 2131362087 */:
                    VideoPlayerActivity.this.B3();
                    break;
                case R.id.custom_shuffle /* 2131362088 */:
                    VideoPlayerActivity.this.f4();
                    break;
                case R.id.custom_subtitles /* 2131362090 */:
                    VideoPlayerActivity.this.g4();
                    break;
                case R.id.custom_toggle_expand /* 2131362091 */:
                    VideoPlayerActivity.this.b4();
                    break;
                case R.id.custom_unlock /* 2131362092 */:
                    VideoPlayerActivity.this.j3(false);
                    break;
            }
        }
    }

    class h implements g.h {
        h() {
        }

        @Override // com.voxdon.xplorer.viewer.g.h
        public void a(boolean z) {
            boolean unused = VideoPlayerActivity.U1 = true;
            if (z) {
                boolean unused2 = VideoPlayerActivity.T1 = false;
            } else {
                boolean unused3 = VideoPlayerActivity.T1 = true;
            }
        }
    }

    class i implements b.a {
        i() {
        }
    }

    class j implements b.c {
        j() {
        }
    }

    class k implements SurfaceHolder.Callback {
        k() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            VideoPlayerActivity.this.c = true;
            if (VideoPlayerActivity.this.d != null) {
                VideoPlayerActivity.this.d.run();
                VideoPlayerActivity.this.d = null;
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            VideoPlayerActivity.this.c = false;
        }
    }

    class l implements AdapterView.OnItemSelectedListener {
        final /* synthetic */ com.voxdon.xplorer.viewer.d a;

        l(com.voxdon.xplorer.viewer.d dVar) {
            this.a = dVar;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            d.a aVar = (d.a) this.a.getItem(i);
            if (aVar != null) {
                VideoPlayerActivity.this.L3(aVar.b, true);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    class m extends ax.g3.c {
        m() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            VideoPlayerActivity.this.h2();
            VideoPlayerActivity.this.i4();
        }
    }

    class n implements View.OnSystemUiVisibilityChangeListener {
        n() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if (i == 0 && VideoPlayerActivity.this.q1 == 3846) {
                VideoPlayerActivity.this.J3(false);
            }
        }
    }

    class o implements ax.A0.l {
        o() {
        }

        @Override // ax.A0.l
        public void a(String str, Bundle bundle) {
            if (bundle.getBoolean("result")) {
                VideoPlayerActivity videoPlayerActivity = VideoPlayerActivity.this;
                if (videoPlayerActivity.I1 && videoPlayerActivity.W != null && !VideoPlayerActivity.this.W.n()) {
                    VideoPlayerActivity.this.W.S(true);
                }
                VideoPlayerActivity.this.G3();
            }
        }
    }

    class p extends ax.i.r {
        p(boolean z) {
            super(z);
        }

        @Override // ax.i.r
        public void d() {
            VideoPlayerActivity.this.b.V();
        }
    }

    class q implements Animation.AnimationListener {
        final /* synthetic */ ImageView a;

        q(ImageView imageView) {
            this.a = imageView;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.setVisibility(8);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(750L);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            this.a.startAnimation(alphaAnimation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class r implements a.b {
        r() {
        }

        @Override // com.voxdon.xplorer.viewer.a.b
        public void a(MotionEvent motionEvent) {
            if (!VideoPlayerActivity.this.h3() && ax.t3.l.r(VideoPlayerActivity.this)) {
                VideoPlayerActivity.this.m3();
            }
        }
    }

    class s implements View.OnTouchListener {
        final /* synthetic */ ScaleGestureDetector a;
        final /* synthetic */ GestureDetector b;
        final /* synthetic */ com.voxdon.xplorer.viewer.a c;

        s(ScaleGestureDetector scaleGestureDetector, GestureDetector gestureDetector, com.voxdon.xplorer.viewer.a aVar) {
            this.a = scaleGestureDetector;
            this.b = gestureDetector;
            this.c = aVar;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (VideoPlayerActivity.this.r1) {
                return false;
            }
            boolean z = this.b.onTouchEvent(motionEvent) || this.a.onTouchEvent(motionEvent);
            this.c.g(motionEvent);
            if (VideoPlayerActivity.this.h3()) {
                if (motionEvent.getAction() == 1 && VideoPlayerActivity.this.y0 <= 1.0f) {
                    VideoPlayerActivity.this.B4();
                }
                return true;
            }
            if (VideoPlayerActivity.this.U2()) {
                if (motionEvent.getAction() == 1) {
                    VideoPlayerActivity.this.o2();
                }
                return true;
            }
            if (VideoPlayerActivity.this.g3()) {
                if (motionEvent.getAction() == 1) {
                    VideoPlayerActivity.this.z4();
                }
                return true;
            }
            if (VideoPlayerActivity.this.S2()) {
                if (motionEvent.getAction() == 1) {
                    VideoPlayerActivity.this.U1();
                }
                return true;
            }
            if (!VideoPlayerActivity.this.Z2()) {
                return z;
            }
            if (motionEvent.getAction() == 1) {
                VideoPlayerActivity.this.k3();
            }
            return true;
        }
    }

    static class t extends ax.l1.n {
        String m;

        public t(Context context, InterfaceC2445D.b bVar, String str) {
            super(n.e.R(context), bVar);
            this.m = str;
        }

        public static boolean g0(C0912v c0912v, String str) {
            return ax.l1.n.I(c0912v, str, false) > 0;
        }

        @Override // ax.l1.n
        protected Pair<InterfaceC2445D.a, Integer> c0(AbstractC2448G.a aVar, int[][][] iArr, n.e eVar, String str) throws C0622s {
            Pair<InterfaceC2445D.a, Integer> c0 = super.c0(aVar, iArr, eVar, str);
            if (VideoPlayerActivity.U1) {
                if (VideoPlayerActivity.T1) {
                    return null;
                }
            } else if (c0 != null) {
                P p = ((InterfaceC2445D.a) c0.first).a;
                int i = 0;
                if (!TextUtils.isEmpty(this.m) && p != null) {
                    int i2 = 0;
                    while (i < p.a) {
                        if (g0(p.b(i), this.m)) {
                            i2 = 1;
                        }
                        i++;
                    }
                    i = i2;
                }
                if (i == 0) {
                    return null;
                }
            }
            return c0;
        }
    }

    class u extends AbstractC3199q<Void, Integer, Boolean> {
        private int h;
        private boolean i;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                u.this.z();
            }
        }

        u(int i, boolean z) {
            super(AbstractC3199q.e.HIGHER);
            this.h = i;
            this.i = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void z() {
            if (VideoPlayerActivity.this.isDestroyed() || VideoPlayerActivity.this.W == null || VideoPlayerActivity.this.Y == null) {
                return;
            }
            try {
                VideoPlayerActivity.this.W.B(VideoPlayerActivity.this.Y, this.i);
                VideoPlayerActivity.this.W.k();
            } catch (IllegalStateException e) {
                VideoPlayerActivity.this.V3(R.string.error);
                ax.Q2.d.c("EXOPLAYER ILLEGALSTATE", new IllegalStateException("MediaItemIllegal :" + VideoPlayerActivity.this.y2() + ":" + e.getMessage(), e));
            }
        }

        @Override // ax.u3.AbstractC3199q
        protected void o() {
            VideoPlayerActivity.this.H.setVisibility(8);
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            VideoPlayerActivity.this.H.setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public Boolean g(Void... voidArr) {
            try {
                VideoPlayerActivity videoPlayerActivity = VideoPlayerActivity.this;
                videoPlayerActivity.Y = videoPlayerActivity.X1(this.h);
                return Boolean.TRUE;
            } catch (IllegalStateException unused) {
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            VideoPlayerActivity.this.H.setVisibility(8);
            if (!bool.booleanValue()) {
                VideoPlayerActivity.this.V3(R.string.error);
                return;
            }
            if (VideoPlayerActivity.this.W == null) {
                return;
            }
            if (VideoPlayerActivity.this.c) {
                z();
            } else {
                VideoPlayerActivity.this.d = new a();
            }
        }
    }

    private class v implements InterfaceC0907p<F> {
        private v() {
        }

        @Override // ax.P0.InterfaceC0907p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Pair<Integer, String> a(F f) {
            C0622s c0622s;
            int i;
            String string = VideoPlayerActivity.this.getString(R.string.error_playback);
            if (ax.t3.j.o(VideoPlayerActivity.this)) {
                if (f instanceof C0622s) {
                    string = string + ":" + ((C0622s) f).k0 + ":" + f.getMessage();
                } else {
                    string = string + ":" + f.getMessage();
                }
            }
            if ((f instanceof C0622s) && (i = (c0622s = (C0622s) f).k0) != 0 && i == 1) {
                Exception h = c0622s.h();
                if (h instanceof L.c) {
                    L.c cVar = (L.c) h;
                    if (cVar.c0) {
                        string = ax.w3.h.b(VideoPlayerActivity.this, cVar.q + ":secure");
                    } else {
                        string = ax.w3.h.b(VideoPlayerActivity.this, cVar.q);
                    }
                }
            }
            return Pair.create(0, string);
        }

        /* synthetic */ v(VideoPlayerActivity videoPlayerActivity, k kVar) {
            this();
        }
    }

    private class w implements H.d {
        private w() {
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
        public void F(int i) {
            if (i == 0 && VideoPlayerActivity.this.o0 == 2) {
                VideoPlayerActivity.this.o3();
            }
            VideoPlayerActivity.this.o4();
        }

        @Override // ax.P0.H.d
        public void H(V v) {
            VideoPlayerActivity.this.E1.q();
            AbstractC2991z<V.a> a = v.a();
            if (a != VideoPlayerActivity.this.P0) {
                VideoPlayerActivity.this.u1 = false;
                VideoPlayerActivity.this.k0 = false;
                VideoPlayerActivity.this.l0 = 0;
                VideoPlayerActivity.this.m0 = 0;
                AbstractC2448G.a o = VideoPlayerActivity.this.N0.o();
                if (o != null) {
                    if (o.i(2) == 1) {
                        String A2 = VideoPlayerActivity.this.A2(a, "video");
                        String k2 = VideoPlayerActivity.this.k2();
                        ax.Ha.c.h().f().b("video codec not available").g("codec : " + A2 + ",container : " + k2).h();
                        VideoPlayerActivity.S1.severe("video codec not available : " + A2 + ", container : " + k2);
                        VideoPlayerActivity.this.R3(A2);
                    }
                    int i = o.i(1);
                    if (i == 1) {
                        String A22 = VideoPlayerActivity.this.A2(a, "audio");
                        String k22 = VideoPlayerActivity.this.k2();
                        ax.Ha.c.h().f().b("audio codec not available").g("codec : " + A22 + ",container : " + k22).h();
                        VideoPlayerActivity.S1.severe("audio codec not available : " + A22 + ", container : " + k22);
                        VideoPlayerActivity.this.R3(A22);
                    } else if (i == 3) {
                        for (int i2 = 0; i2 < a.size(); i2++) {
                            V.a aVar = a.get(i2);
                            if (aVar.d() == 1) {
                                for (int i3 = 0; i3 < aVar.a; i3++) {
                                    if (aVar.j(i3)) {
                                        VideoPlayerActivity.c1(VideoPlayerActivity.this);
                                    }
                                }
                            }
                        }
                    }
                    if (o.i(3) == 3) {
                        for (int i4 = 0; i4 < a.size(); i4++) {
                            V.a aVar2 = a.get(i4);
                            if (aVar2.d() == 3) {
                                for (int i5 = 0; i5 < aVar2.a; i5++) {
                                    if (aVar2.j(i5) && (aVar2.b(i5).e & 2) == 0) {
                                        VideoPlayerActivity.Z0(VideoPlayerActivity.this);
                                        if (aVar2.f()) {
                                            VideoPlayerActivity.this.k0 = true;
                                        }
                                    }
                                }
                            }
                        }
                        VideoPlayerActivity.this.j0 = true;
                    } else {
                        VideoPlayerActivity.this.j0 = false;
                    }
                } else {
                    VideoPlayerActivity.this.j0 = false;
                }
                VideoPlayerActivity.this.P0 = a;
            }
            VideoPlayerActivity.this.l4();
            VideoPlayerActivity.this.v4();
            VideoPlayerActivity.this.j4();
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void I(boolean z) {
            I.i(this, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void J(F f) {
            I.t(this, f);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void L(float f) {
            I.G(this, f);
        }

        @Override // ax.P0.H.d
        public void N(F f) {
            if (VideoPlayerActivity.R2(f)) {
                VideoPlayerActivity.this.g2();
                VideoPlayerActivity.this.L2();
            } else {
                VideoPlayerActivity.this.j3(false);
                VideoPlayerActivity.this.l4();
                VideoPlayerActivity.this.S3();
            }
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void O(int i) {
            I.q(this, i);
        }

        @Override // ax.P0.H.d
        public void P(N n, int i) {
            VideoPlayerActivity.this.o4();
        }

        @Override // ax.P0.H.d
        public void S(boolean z) {
            VideoPlayerActivity.this.o4();
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
        public void Z(boolean z, int i) {
            int c;
            VideoPlayerActivity.S1.fine("player state changed : " + z + "," + i);
            if (i == 4) {
                if (VideoPlayerActivity.this.X2() && !VideoPlayerActivity.this.z1) {
                    VideoPlayerActivity.this.r2();
                    return;
                } else {
                    VideoPlayerActivity.this.T3(true);
                    VideoPlayerActivity.this.S3();
                }
            } else if (i == 3) {
                if (VideoPlayerActivity.this.f3() && VideoPlayerActivity.this.X2() && !VideoPlayerActivity.this.z1 && VideoPlayerActivity.this.y1 > 0) {
                    VideoPlayerActivity.this.B1.postDelayed(VideoPlayerActivity.this.K1, r8.y1);
                }
                Uri y2 = VideoPlayerActivity.this.y2();
                if (!VideoPlayerActivity.this.u1 && (VideoPlayerActivity.this.v1 == null || !VideoPlayerActivity.this.v1.equals(y2))) {
                    VideoPlayerActivity.this.u1 = true;
                    VideoPlayerActivity.this.v1 = y2;
                    long g0 = VideoPlayerActivity.this.W.g0();
                    if (g0 < 0) {
                        g0 = -1;
                    }
                    ax.Q2.a.i().o("video_player_ready").a("duration_ms", g0).b("duration_range", a.g.a(g0)).b("ext", (y2 == null || y2.getPath() == null) ? "uri_error" : d0.k(y2.getPath())).c();
                }
                VideoPlayerActivity.this.w4();
                VideoPlayerActivity.this.T3(false);
                if (VideoPlayerActivity.this.Y2()) {
                    c = ax.Q.b.c(VideoPlayerActivity.this, R.color.videoplayer_unplayed);
                    VideoPlayerActivity.this.w1 = 150L;
                } else {
                    c = ax.Q.b.c(VideoPlayerActivity.this, R.color.videoplayer_buffered);
                    VideoPlayerActivity.this.w1 = 300L;
                }
                VideoPlayerActivity.this.S.setBufferedColor(c);
            } else if (i == 2) {
                VideoPlayerActivity.this.w4();
                VideoPlayerActivity.this.T3(false);
            }
            VideoPlayerActivity.this.i4();
            VideoPlayerActivity.this.l2();
            VideoPlayerActivity.this.n4();
            VideoPlayerActivity.this.l4();
            VideoPlayerActivity.this.o4();
            VideoPlayerActivity.this.m4();
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void a(a0 a0Var) {
            I.F(this, a0Var);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void a0(C0915y c0915y, int i) {
            I.l(this, c0915y, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void b0() {
            I.x(this);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void c(int i) {
            I.b(this, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void c0(H h, H.c cVar) {
            I.h(this, h, cVar);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void e(boolean z) {
            I.A(this, z);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void i0(boolean z, int i) {
            I.o(this, z, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void j(ax.P0.G g) {
            I.p(this, g);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void j0(A a) {
            I.m(this, a);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void k0(C0905n c0905n) {
            I.f(this, c0905n);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void o0(int i, int i2) {
            I.B(this, i, i2);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void p0(H.e eVar, H.e eVar2, int i) {
            I.w(this, eVar, eVar2, i);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void r(C c) {
            I.n(this, c);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void r0(C0894c c0894c) {
            I.a(this, c0894c);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void s(ax.R0.c cVar) {
            I.d(this, cVar);
        }

        @Override // ax.P0.H.d
        public /* synthetic */ void t(List list) {
            I.e(this, list);
        }

        @Override // ax.P0.H.d
        public void t0(boolean z) {
            VideoPlayerActivity.S1.fine("VideoPlayer : isPlaying=" + z);
            if (!z) {
                VideoPlayerActivity.this.K3(false);
            } else {
                VideoPlayerActivity.this.K3(true);
                VideoPlayerActivity.this.c2();
            }
        }

        @Override // ax.P0.H.d
        public void v(int i) {
            if (VideoPlayerActivity.this.o0 != i) {
                ax.t3.l.k(VideoPlayerActivity.this, i);
            }
            VideoPlayerActivity.this.o0 = i;
            VideoPlayerActivity.this.r4();
            VideoPlayerActivity.this.o4();
        }

        /* synthetic */ w(VideoPlayerActivity videoPlayerActivity, k kVar) {
            this();
        }
    }

    static class x extends OrientationEventListener {
        Activity a;
        Handler b;
        boolean c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (x.this.a.isFinishing()) {
                    return;
                }
                x.this.a.setRequestedOrientation(-1);
            }
        }

        x(Activity activity, Handler handler) {
            super(activity);
            this.b = handler;
            this.a = activity;
        }

        private boolean a(int i, int i2) {
            return i > i2 + (-10) && i < i2 + 10;
        }

        private boolean b(int i) {
            return a(i, 90) || a(i, SubsamplingScaleImageView.ORIENTATION_270);
        }

        private boolean c(int i) {
            return a(i, 0) || a(i, SubsamplingScaleImageView.ORIENTATION_180);
        }

        void d() {
            boolean z;
            if (this.a.getResources().getConfiguration().orientation == 2) {
                this.a.setRequestedOrientation(7);
                z = false;
            } else {
                this.a.setRequestedOrientation(6);
                z = true;
            }
            if (Settings.System.getInt(this.a.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                e(z);
            }
        }

        void e(boolean z) {
            this.c = z;
            enable();
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            if (!(this.c && b(i)) && (this.c || !c(i))) {
                return;
            }
            this.b.postDelayed(new a(), 2000L);
            disable();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String A2(AbstractC2991z<V.a> abstractC2991z, String str) {
        String str2;
        if (abstractC2991z == null) {
            return null;
        }
        for (int i2 = 0; i2 < abstractC2991z.size(); i2++) {
            V.a aVar = abstractC2991z.get(i2);
            for (int i3 = 0; i3 < aVar.a; i3++) {
                C0912v b2 = aVar.b(i3);
                if (b2 != null && (str2 = b2.o) != null && str2.startsWith(str)) {
                    return b2.o;
                }
            }
        }
        return null;
    }

    private void A3() {
        if (this.P) {
            e2();
        }
        this.J0 = true;
        if (O2()) {
            if (Q2()) {
                this.K.setBackgroundColor(0);
                this.N = ax.S2.b.j(this, new i());
            } else {
                this.K.setBackgroundColor(-1);
                ax.S2.b.k(this, new j());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A4() {
        if (this.B0 == null) {
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            this.B0 = audioManager;
            if (audioManager == null) {
                return;
            }
        }
        this.D0 = this.B0.getStreamMaxVolume(3);
        this.E0 = this.B0.getStreamVolume(3);
        this.C0 = true;
        this.B.setVisibility(0);
        this.C.setImageResource(R.drawable.ic_player_volume_up);
        this.D.setProgressDrawable(C2653a.b(this, R.drawable.vertical_progress_bar));
        this.D.setMax(this.D0);
    }

    private int B2() {
        Uri[] uriArr = this.a0;
        if (uriArr == null) {
            return 0;
        }
        return uriArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B3() {
        if (this.R1 == null) {
            this.R1 = new x(this, this.B1);
        }
        this.R1.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B4() {
        this.A0 = false;
        this.y0 = 1.0f;
        f2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C3(int i2) {
        int i3 = ((int) (this.G0 * 255.0f)) + ((i2 * 255) / 360);
        int i4 = i3 <= 255 ? i3 < 0 ? 0 : i3 : 255;
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.screenBrightness = i4 / 255.0f;
        getWindow().setAttributes(attributes);
        this.D.setProgress(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C4(float f2, float f3, float f4, float f5, float f6) {
        if (!d3()) {
            f2();
            return;
        }
        float f7 = this.y0 * f2;
        this.y0 = f7;
        if (f7 < 1.0f) {
            this.y0 = 1.0f;
        } else if (f7 > 3.0f) {
            this.y0 = 3.0f;
        }
        if (Float.isNaN(this.y0)) {
            this.y0 = 1.0f;
            f2();
            return;
        }
        this.F.setScaleX(this.y0);
        this.F.setScaleY(this.y0);
        float translationX = this.F.getTranslationX();
        float translationY = this.F.getTranslationY();
        p3(this.y0, a2(translationX, this.b.getWidth() / 2.0f, f3, f2) + f5, a2(translationY, this.b.getHeight() / 2.0f, f4, f2) + f6);
    }

    private boolean D2() {
        return this.J0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D3(int i2) {
        if (this.B0 == null) {
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            this.B0 = audioManager;
            if (audioManager == null) {
                return;
            }
        }
        int i3 = this.D0;
        int i4 = this.E0 + ((i2 * i3) / 360);
        if (i4 <= i3) {
            i3 = i4 < 0 ? 0 : i4;
        }
        try {
            this.B0.setStreamVolume(3, i3, 0);
            this.D.setProgress(i3);
        } catch (SecurityException e2) {
            ax.Q2.d.c("video set volume exception", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D4() {
        this.A0 = true;
    }

    private static boolean E2(Uri[] uriArr) {
        for (Uri uri : uriArr) {
            if (C1809B.L(uri.getScheme()) && (uri.getHost() == null || uri.getHost().startsWith("."))) {
                return true;
            }
        }
        return false;
    }

    private void E3(boolean z, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.k1 : this.l1);
        view.setVisibility(0);
    }

    private void F2() {
        AbstractC2559a supportActionBar = getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F3(boolean z) {
        this.n0 = z;
        ax.t3.l.j(this, z);
        n4();
        invalidateOptionsMenu();
    }

    private void G2() {
        AbstractC2559a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.H(HttpUrl.FRAGMENT_ENCODE_SET);
            supportActionBar.x(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G3() {
        this.b.setControllerShowTimeoutMs(ax.t3.l.b(this) * 1000);
    }

    private void H2() {
        if ((ax.t3.l.p(this) && ax.P2.a.r(this)) ? ax.P2.a.m(this) : false) {
            return;
        }
        ax.P2.a.n(this);
    }

    private void H3(int i2) {
        this.i0 = i2;
        o4();
    }

    private void I2() {
        this.n0 = ax.t3.l.a(this);
        n4();
        M3(ax.t3.l.d(this));
        float f2 = this.p0;
        if (f2 != 0.0f) {
            L3(f2, true);
            this.y.setSelection(com.voxdon.xplorer.viewer.d.c(this.p0));
        }
        u4();
    }

    private void I3() {
        if (this.a0 == null || y2() == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setData(x2());
        setResult(-1, intent);
    }

    private void J2() {
        Resources resources = getResources();
        this.Q0 = C3045a.c(this, R.drawable.ic_resize_mode_best);
        this.R0 = C3045a.c(this, R.drawable.ic_resize_mode_stretch);
        this.S0 = C3045a.c(this, R.drawable.ic_resize_mode_crop_to_fit);
        this.W0 = C3045a.c(this, R.drawable.ic_subtitles_off);
        this.X0 = C3045a.c(this, R.drawable.ic_subtitles_on);
        this.T0 = C3045a.c(this, R.drawable.exo_styled_controls_repeat_off);
        this.U0 = C3045a.c(this, R.drawable.exo_styled_controls_repeat_one);
        this.V0 = C3045a.c(this, R.drawable.exo_styled_controls_repeat_all);
        this.Z0 = C3045a.c(this, R.drawable.exo_styled_controls_shuffle_on);
        this.Y0 = C3045a.c(this, R.drawable.exo_styled_controls_shuffle_off);
        this.a1 = resources.getString(R.string.screen_best_fit);
        this.b1 = resources.getString(R.string.screen_stretch);
        this.c1 = resources.getString(R.string.screen_crop_to_fit);
        this.d1 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.e1 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f1 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.g1 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.h1 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.i1 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.j1 = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.k1 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.l1 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
    }

    private void K2() {
        Uri[] uriArr;
        int i2 = 0;
        if (this.a0 != null) {
            return;
        }
        Intent intent = getIntent();
        String action = intent.getAction();
        this.g0 = -1;
        this.h0 = -1;
        if (!"android.intent.action.VIEW".equals(action) || intent.getData() == null) {
            W3(R.string.error);
            finish();
            return;
        }
        ArrayList<e.a> c2 = com.voxdon.xplorer.viewer.e.b().c();
        if (c2 != null) {
            this.Z = new Uri[c2.size()];
            this.a0 = new Uri[c2.size()];
            this.b0 = new Uri[c2.size()];
            this.c0 = new ArrayList();
            for (int i3 = 0; i3 < c2.size(); i3++) {
                this.c0.add(Integer.valueOf(i3));
            }
            Collections.shuffle(this.c0);
            for (int i4 = 0; i4 < c2.size(); i4++) {
                e.a aVar = c2.get(i4);
                Uri[] uriArr2 = this.Z;
                Uri uri = aVar.a;
                uriArr2[i4] = uri;
                this.a0[i4] = i2(uri);
                Uri uri2 = aVar.b;
                if (uri2 != null) {
                    this.b0[i4] = i2(uri2);
                }
            }
            for (int i5 = 0; i5 < this.Z.length; i5++) {
                int intValue = this.c0.get(i5).intValue();
                Uri uri3 = this.Z[i5];
                if (uri3 != null && uri3.equals(intent.getData())) {
                    this.g0 = i5;
                }
                Uri uri4 = this.Z[intValue];
                if (uri4 != null && uri4.equals(intent.getData())) {
                    this.h0 = i5;
                }
            }
        } else {
            S1.fine("Video play : " + intent.getData());
            this.Z = new Uri[]{intent.getData()};
            this.a0 = new Uri[]{i2(intent.getData())};
            ArrayList arrayList = new ArrayList();
            this.c0 = arrayList;
            arrayList.add(0);
            this.b0 = new Uri[1];
        }
        boolean booleanExtra = intent.getBooleanExtra("detect_subtitle", true);
        this.e0 = booleanExtra;
        if (booleanExtra) {
            this.f0 = new boolean[this.a0.length];
        }
        if (this.d0) {
            int i6 = this.h0;
            if (i6 == -1) {
                H3(0);
            } else {
                H3(i6);
            }
        } else {
            int i7 = this.g0;
            if (i7 == -1) {
                H3(0);
            } else {
                H3(i7);
            }
        }
        for (Uri uri5 : this.a0) {
            if (com.voxdon.xplorer.service.b.k(this, uri5)) {
                this.x1 = true;
                this.s1 = true;
                ax.Z2.k z = C2686c.z(uri5.getPath());
                if (z != null) {
                    this.t1 = z.d();
                }
            } else if (C1809B.L(uri5.getScheme())) {
                this.x1 = true;
            }
        }
        if (this.s1 && this.t1 != null) {
            com.voxdon.xplorer.service.b.f(this).l(true, this.t1);
        }
        C0915y[] c0915yArr = new C0915y[this.a0.length];
        while (true) {
            uriArr = this.a0;
            if (i2 >= uriArr.length) {
                break;
            }
            c0915yArr[i2] = C0915y.b(uriArr[i2]);
            i2++;
        }
        if (E2(uriArr) || !ax.S0.d0.m(c0915yArr)) {
            W3(R.string.error);
        } else {
            if (Q.z0() && C3197o.c()) {
                return;
            }
            ax.S0.d0.X0(this, this.a0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K3(boolean z) {
        this.a.setKeepScreenOn(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L2() {
        String str;
        N3(ax.t3.l.f(this));
        K2();
        if (this.a0 != null && this.W == null) {
            H2();
            if (J.i()) {
                androidx.media3.decoder.ffmpeg.b.I0(2);
            }
            C2452a.b bVar = new C2452a.b();
            C1178d c1178d = new C1178d(this);
            c1178d.p(1);
            if (ax.t3.l.i(this)) {
                str = ax.t3.l.g(this);
                if (TextUtils.isEmpty(str) || "default".equals(str)) {
                    str = this.Q;
                }
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            this.R = str;
            t tVar = new t(this, bVar, str);
            this.N0 = tVar;
            tVar.m(this.O0);
            this.P0 = null;
            C0605j c0605j = new C0605j();
            ExoPlayer.b bVar2 = new ExoPlayer.b(this, c1178d);
            bVar2.m(this.N0);
            bVar2.i(c0605j);
            bVar2.k(10000L);
            bVar2.l(10000L);
            ExoPlayer h2 = bVar2.h();
            this.W = h2;
            h2.c(Z.g);
            this.W.N(new w(this, null));
            this.W.S(this.m1);
            this.W.r0(new C2570a(this.N0));
            if (this.x1) {
                this.W.a(2);
            } else {
                this.W.a(1);
            }
            this.b.setPlayer(this.W);
            this.b.G();
            q4();
            this.b.setOnTouchListener(new s(new ScaleGestureDetector(this, this.N1), new GestureDetector(this, this.O1), new com.voxdon.xplorer.viewer.a(this, 1.5f, new r())));
        }
        ExoPlayer exoPlayer = this.W;
        if (exoPlayer != null) {
            int i2 = this.n1;
            boolean z = i2 != -1;
            if (z) {
                exoPlayer.s(i2, this.o1);
            }
            I2();
            l4();
            o4();
            r3(w2(), true ^ z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L3(float f2, boolean z) {
        ExoPlayer exoPlayer = this.W;
        if (exoPlayer == null) {
            return;
        }
        if (z) {
            this.p0 = f2;
        }
        if (exoPlayer.h() == null || this.W.h().a != f2) {
            if (f2 == 1.0f) {
                this.W.e(ax.P0.G.d);
            } else {
                this.W.e(new ax.P0.G(f2));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0084, code lost:
    
        if (r3 < 0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void M2(float r6) {
        /*
            r5 = this;
            androidx.media3.exoplayer.ExoPlayer r0 = r5.W
            if (r0 == 0) goto Lbf
            boolean r0 = r0.n()
            if (r0 == 0) goto Lbf
            r0 = 1
            r5.H0 = r0
            android.widget.TextView r0 = r5.E
            r1 = 0
            r0.setVisibility(r1)
            androidx.media3.exoplayer.ExoPlayer r0 = r5.W
            ax.S0.I r0 = r0.M()
            r2 = 1056964608(0x3f000000, float:0.5)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 != 0) goto L27
            android.widget.TextView r2 = r5.E
            java.lang.String r3 = "0.5X▶▶"
            r2.setText(r3)
            goto L4e
        L27:
            r2 = 1073741824(0x40000000, float:2.0)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 != 0) goto L35
            android.widget.TextView r2 = r5.E
            java.lang.String r3 = "2X▶▶"
            r2.setText(r3)
            goto L4e
        L35:
            ax.u3.C3184b.f()
            android.widget.TextView r2 = r5.E
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r4 = "X▶▶"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.setText(r3)
        L4e:
            int r2 = r0.a()
            r3 = -1
            if (r2 == r3) goto L86
            androidx.media3.ui.PlayerView r2 = r5.b
            int r2 = r2.getHeight()
            if (r2 == 0) goto L86
            androidx.media3.ui.PlayerView r2 = r5.b
            int r2 = r2.getHeight()
            int r3 = r0.a()
            if (r2 <= r3) goto L86
            r2 = 10
            int r2 = ax.u3.C3180B.e(r5, r2)
            androidx.media3.ui.PlayerView r3 = r5.b
            int r3 = r3.getHeight()
            int r0 = r0.a()
            int r3 = r3 - r0
            int r3 = r3 / 2
            android.widget.TextView r0 = r5.E
            int r0 = r0.getHeight()
            int r3 = r3 - r0
            int r3 = r3 - r2
            if (r3 >= 0) goto L87
        L86:
            r3 = 0
        L87:
            if (r3 != 0) goto Lac
            ax.n.a r0 = r5.getSupportActionBar()
            if (r0 == 0) goto L9a
            boolean r2 = r0.p()
            if (r2 == 0) goto L9a
            int r0 = r0.l()
            goto L9b
        L9a:
            r0 = 0
        L9b:
            if (r0 <= 0) goto La6
            r2 = 25
            int r2 = ax.u3.C3180B.e(r5, r2)
        La3:
            int r3 = r2 + r0
            goto Lac
        La6:
            r2 = 5
            int r2 = ax.u3.C3180B.e(r5, r2)
            goto La3
        Lac:
            android.widget.TextView r0 = r5.E
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.setMargins(r1, r3, r1, r1)
            android.widget.TextView r2 = r5.E
            r2.setLayoutParams(r0)
            r5.L3(r6, r1)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.viewer.VideoPlayerActivity.M2(float):void");
    }

    private void M3(int i2) {
        ExoPlayer exoPlayer = this.W;
        if (exoPlayer == null) {
            return;
        }
        this.o0 = i2;
        exoPlayer.j(i2);
        r4();
    }

    private boolean N2() {
        return this.K0;
    }

    private void N3(boolean z) {
        this.d0 = z;
        s4();
    }

    private boolean O2() {
        return this.I0 != 0;
    }

    private void O3(int i2, boolean z) {
        SubtitleView subtitleView = this.b.getSubtitleView();
        if (subtitleView == null) {
            return;
        }
        Typeface typeface = z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
        CaptioningManager captioningManager = (CaptioningManager) getSystemService("captioning");
        subtitleView.setStyle((captioningManager == null || !captioningManager.isEnabled()) ? new C1317a(-1, 0, 0, 2, -16777216, typeface) : C1317a.a(captioningManager.getUserStyle()));
        subtitleView.b(2, i2);
    }

    private boolean P2() {
        boolean z = this.M0 != 0 && System.currentTimeMillis() - this.M0 > 90000;
        if (z) {
            S1.fine("ad is expired");
        }
        return z;
    }

    private void P3(String str) {
        AbstractC2559a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.H(str);
        }
    }

    private boolean Q2() {
        int i2 = this.I0;
        return (i2 == 33 || i2 == 34) ? new Random().nextBoolean() : i2 == 17 || i2 == 18;
    }

    private void Q3() {
        AbstractC2559a supportActionBar = getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean R2(F f2) {
        if (f2 instanceof C0622s) {
            C0622s c0622s = (C0622s) f2;
            if (c0622s.k0 != 0) {
                return false;
            }
            for (Throwable i2 = c0622s.i(); i2 != null; i2 = i2.getCause()) {
                if (i2 instanceof C2212b) {
                    return true;
                }
            }
        } else if (f2 != null) {
            for (Throwable cause = f2.getCause(); cause != null; cause = cause.getCause()) {
                if (cause instanceof C2212b) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R3(String str) {
        Snackbar T;
        String b2 = ax.w3.h.b(this, str);
        if (ax.w3.d.w(this, str)) {
            T = C3180B.T(this.a, b2, -2);
            T.q0(R.string.download_action, new a());
            this.G = T;
        } else {
            T = C3180B.T(this.a, b2, 0);
        }
        T.a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean S2() {
        return this.F0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S3() {
    }

    public static final boolean T2(int i2) {
        return i2 == 23 || i2 == 66 || i2 == 160;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T3(boolean z) {
        if (z) {
            this.z.setVisibility(0);
        } else {
            this.z.setVisibility(8);
        }
        k4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U1() {
        this.F0 = false;
        this.B.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean U2() {
        return this.s0;
    }

    private void U3(boolean z) {
        ImageView imageView = (ImageView) findViewById(R.id.icon_splash);
        imageView.setVisibility(0);
        if (z) {
            imageView.setImageResource(R.drawable.ic_control_play);
        } else {
            imageView.setImageResource(R.drawable.ic_control_pause);
        }
        imageView.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(750L);
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        imageView.startAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(new q(imageView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V1() {
        float f2 = getWindow().getAttributes().screenBrightness;
        if (f2 < 0.0f || f2 > 1.0f) {
            this.G0 = 0.5f;
        } else {
            this.G0 = f2;
        }
        this.D.setMax(255);
        this.F0 = true;
        this.B.setVisibility(0);
        this.D.setProgressDrawable(C2653a.b(this, R.drawable.vertical_progress_bar_brightness));
        this.C.setImageResource(R.drawable.ic_player_brightness_high);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean V2() {
        return U2() || g3() || S2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V3(int i2) {
        C3180B.S(this.a, i2, 0).a0();
    }

    private g.a W1() {
        return new ax.U0.m(this, C2(), new j.b(this).a());
    }

    private boolean W2() {
        return this.z.getVisibility() == 0;
    }

    private void W3(int i2) {
        X3(getString(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0915y X1(int i2) {
        int z2 = z2(i2);
        if (this.e0 && !this.f0[z2]) {
            Uri[] uriArr = this.b0;
            if (uriArr[z2] == null) {
                uriArr[z2] = t2(this.a0[z2]);
                this.f0[z2] = true;
            }
        }
        return Y1(this.a0[z2], this.b0[z2], null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean X2() {
        return this.A1;
    }

    private void X3(String str) {
        Toast.makeText(this, str, 1).show();
    }

    private C0915y Y1(Uri uri, Uri uri2, String str) {
        C0915y.c cVar = new C0915y.c();
        cVar.f(uri);
        if (uri2 == null) {
            return cVar.a();
        }
        String n2 = C1808A.n(d0.f(uri2.getPath()));
        C0915y.k.a aVar = new C0915y.k.a(uri2);
        aVar.l(1);
        aVar.k(n2);
        cVar.d(Collections.singletonList(aVar.i()));
        return cVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Y2() {
        if (y2() == null) {
            return false;
        }
        String scheme = y2().getScheme();
        return "file".equals(scheme) || "content".equals(scheme);
    }

    private void Y3() {
        if (getSupportFragmentManager().Q0()) {
            return;
        }
        ExoPlayer exoPlayer = this.W;
        if (exoPlayer == null || !exoPlayer.n()) {
            this.I1 = false;
        } else {
            this.I1 = true;
            this.W.f();
        }
        C3180B.d0(getSupportFragmentManager(), W.i3(), "settings", true);
    }

    static /* synthetic */ int Z0(VideoPlayerActivity videoPlayerActivity) {
        int i2 = videoPlayerActivity.l0;
        videoPlayerActivity.l0 = i2 + 1;
        return i2;
    }

    private float Z1(float f2, int i2, float f3, float f4) {
        float f5 = f3 - f4;
        float f6 = i2;
        float f7 = f6 / 2.0f;
        float f8 = f2 / 2.0f;
        float f9 = f5 + f7;
        return f9 - f8 > 0.0f ? f8 - f7 : f9 + f8 < f6 ? f7 - f8 : f5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Z2() {
        return this.H0;
    }

    private float a2(float f2, float f3, float f4, float f5) {
        return (f2 - (f4 - (f5 * (f4 - (f2 + f3))))) + f3;
    }

    private boolean a3() {
        return z.u(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a4() {
        if (this.b.I()) {
            this.b.G();
        } else {
            this.b.V();
            c2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b2() {
        if (X2()) {
            this.z1 = true;
            this.B1.removeCallbacks(this.K1);
        }
    }

    private boolean b3() {
        int i2 = this.I0;
        return i2 == 2 || i2 == 18 || i2 == 34;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b4() {
        F3(!this.n0);
    }

    static /* synthetic */ int c1(VideoPlayerActivity videoPlayerActivity) {
        int i2 = videoPlayerActivity.m0;
        videoPlayerActivity.m0 = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c2() {
        if (this.b.getControllerAutoShow() || U2()) {
            return;
        }
        this.b.setControllerAutoShow(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c3() {
        return this.z0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c4() {
        ExoPlayer exoPlayer = this.W;
        if (exoPlayer == null) {
            return;
        }
        boolean v2 = exoPlayer.v();
        this.W.S(!v2);
        if (v2) {
            return;
        }
        this.b.G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d2() {
        this.E1.n(this.v);
    }

    private boolean d3() {
        ExoPlayer exoPlayer = this.W;
        if (exoPlayer == null) {
            return false;
        }
        ax.S0.I M = exoPlayer.M();
        return (M.a() == -1 || M.b() == -1 || this.b.getHeight() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d4() {
        ExoPlayer exoPlayer = this.W;
        if (exoPlayer == null) {
            return;
        }
        exoPlayer.j(ax.S0.H.a(exoPlayer.o(), 3));
        r4();
    }

    private void e2() {
        View view = this.N;
        if (view != null) {
            ax.S2.b.a(view, this);
        }
        this.N = null;
        this.P = false;
        this.J0 = false;
        this.K.removeAllViews();
    }

    private boolean e3() {
        return this.P;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e4() {
        Drawable drawable;
        String str;
        int resizeMode = this.b.getResizeMode();
        int i2 = 3;
        if (resizeMode == 0) {
            drawable = this.R0;
            str = this.b1;
        } else if (resizeMode != 3) {
            i2 = 0;
            if (resizeMode != 4) {
                C3184b.f();
                drawable = this.Q0;
                str = this.a1;
            } else {
                drawable = this.Q0;
                str = this.a1;
            }
        } else {
            drawable = this.S0;
            str = this.c1;
            i2 = 4;
        }
        this.b.setResizeMode(i2);
        this.r.setImageDrawable(drawable);
        this.r.setContentDescription(str);
        this.A.removeCallbacks(this.M1);
        this.A.setText(str);
        this.A.postDelayed(this.M1, 1000L);
    }

    private void f2() {
        this.F.setScaleX(1.0f);
        this.F.setScaleY(1.0f);
        this.F.setTranslationX(0.0f);
        this.F.setTranslationY(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f3() {
        return this.y1 >= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f4() {
        this.d0 = !this.d0;
        int w2 = w2();
        if (this.d0) {
            for (int i2 = 0; i2 < this.c0.size(); i2++) {
                if (w2 == this.c0.get(i2).intValue()) {
                    H3(i2);
                }
            }
        } else {
            H3(this.c0.get(w2).intValue());
        }
        ax.t3.l.l(this, this.d0);
        s4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g2() {
        this.m1 = true;
        this.n1 = -1;
        this.o1 = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g3() {
        return this.C0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g4() {
        if (this.l0 != 1) {
            this.E1.o(this.v, this.Q1);
            return;
        }
        U1 = true;
        if (this.k0) {
            T1 = true;
            this.E1.l();
        } else {
            T1 = false;
            this.E1.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h2() {
        this.K0 = true;
        this.L0 = System.currentTimeMillis();
        e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h3() {
        return this.A0;
    }

    private void h4() {
        if (!this.e.n0()) {
            F2();
            return;
        }
        if (W2()) {
            Q3();
        } else if (this.r1) {
            F2();
        } else {
            Q3();
        }
    }

    private Uri i2(Uri uri) {
        if (!MyFileProvider.C(uri)) {
            if (MyFileProvider.B(uri)) {
                ax.Z2.k e2 = MyFileProvider.e(uri);
                String e3 = e2.e();
                File file = new File(e3);
                String v2 = d0.v(e2.d(), e3, Boolean.FALSE);
                if (v2 == null || !d0.H("/Android", v2) || !C3604x.O0(file).d1()) {
                    return Uri.fromFile(file);
                }
            } else if (!MyFileProvider.A(uri)) {
                MyFileProvider.E(uri);
                return uri;
            }
        }
        return uri;
    }

    private void i3(boolean z) {
        if (Q.u0()) {
            if (z) {
                setRequestedOrientation(14);
                return;
            } else {
                setRequestedOrientation(-1);
                return;
            }
        }
        if (z) {
            setRequestedOrientation(z.l(this));
        } else {
            setRequestedOrientation(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i4() {
        View findViewById;
        if (this.W == null) {
            return;
        }
        if (N2() && System.currentTimeMillis() - this.L0 > 30000) {
            this.K0 = false;
        }
        boolean z = true;
        if (!b3()) {
            z = true ^ this.W.v();
        } else if (this.W.v() && this.W.i() != 4) {
            z = false;
        }
        if (!z || N2() || U2() || !O2() || a3()) {
            this.J.setVisibility(8);
            return;
        }
        this.J.setVisibility(0);
        if (!D2() || P2()) {
            A3();
        }
        if (!e3()) {
            this.M.setVisibility(0);
            this.L.setVisibility(8);
            return;
        }
        if (this.M0 == 0) {
            this.M0 = System.currentTimeMillis();
        }
        if (this.O && (findViewById = this.N.findViewById(R.id.media_container)) != null) {
            int f2 = C3180B.f(this, getResources().getDisplayMetrics().heightPixels);
            int i2 = 150;
            if (f2 <= 360 && (i2 = 150 - (360 - f2)) < 60) {
                i2 = 60;
            }
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = C3180B.e(this, i2);
            findViewById.setLayoutParams(layoutParams);
        }
        this.M.setVisibility(8);
        this.L.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j3(boolean z) {
        this.r1 = z;
        if (z) {
            this.b.setControllerShowTimeoutMs(3000);
        } else {
            G3();
        }
        i3(this.r1);
        n4();
        q4();
        k4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j4() {
        if (this.m0 > 1) {
            this.u.setVisibility(0);
        } else {
            this.u.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String k2() {
        return y2() == null ? HttpUrl.FRAGMENT_ENCODE_SET : C1833v.h(y2().getPath());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k3() {
        this.H0 = false;
        this.E.setVisibility(4);
        L3(this.p0, false);
    }

    private void k4() {
        this.J1.j(this.r1 && !W2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l2() {
        MySpinner mySpinner = this.y;
        if (mySpinner == null) {
            return;
        }
        mySpinner.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l3() {
        M2(2.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m2(boolean z) {
        ExoPlayer exoPlayer = this.W;
        if (exoPlayer == null) {
            return;
        }
        long s0 = exoPlayer.s0();
        long c2 = ax.t3.l.c(this) * 1000;
        long j2 = z ? s0 + c2 : s0 - c2;
        long g0 = this.W.g0();
        if (g0 == -9223372036854775807L) {
            g0 = 0;
        }
        if (j2 < 0) {
            j2 = 0;
        } else if (j2 > g0) {
            j2 = g0;
        }
        if (s0 == j2) {
            return;
        }
        this.W.c(Z.c);
        this.W.t(j2);
        this.W.c(Z.g);
        this.A.removeCallbacks(this.M1);
        if (z) {
            this.A.setText("+" + C3180B.n(c2));
        } else {
            this.A.setText("-" + C3180B.n(c2));
        }
        this.A.postDelayed(this.M1, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m3() {
        M2(0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n2(long j2, boolean z, boolean z2) {
        if (z2) {
            this.A.setText(C3180B.n(j2));
        }
        this.u0 = j2;
        boolean z3 = this.v0 != z;
        this.v0 = z;
        long currentTimeMillis = System.currentTimeMillis();
        if (z3 || currentTimeMillis - this.t0 >= this.w1) {
            p4(z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n3() {
        if (this.W != null && w2() < B2() - 1) {
            s3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n4() {
        if (W2()) {
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            this.i.setVisibility(0);
            this.j.setVisibility(0);
            this.p.setVisibility(8);
            this.r.setVisibility(8);
            this.l.setVisibility(8);
            this.m.setVisibility(8);
            this.f.setVisibility(8);
            this.t.setVisibility(8);
            this.s.setVisibility(8);
        } else if (this.r1) {
            this.g.setVisibility(0);
            this.h.setVisibility(8);
            this.i.setVisibility(8);
            this.j.setVisibility(8);
            this.f.setVisibility(8);
        } else if (this.n0) {
            this.g.setVisibility(8);
            this.h.setVisibility(0);
            this.i.setVisibility(0);
            this.j.setVisibility(0);
            this.p.setVisibility(0);
            this.r.setVisibility(0);
            this.l.setVisibility(8);
            this.m.setVisibility(8);
            this.f.setVisibility(0);
            this.t.setVisibility(0);
            this.t.setImageResource(R.drawable.ic_collapse_all);
            this.t.setContentDescription(getString(R.string.menu_collapse));
            this.s.setVisibility(0);
        } else {
            this.g.setVisibility(8);
            this.h.setVisibility(8);
            this.i.setVisibility(0);
            this.j.setVisibility(0);
            this.p.setVisibility(0);
            this.r.setVisibility(0);
            this.l.setVisibility(8);
            this.m.setVisibility(8);
            this.f.setVisibility(0);
            this.t.setVisibility(0);
            this.t.setImageResource(R.drawable.ic_expand_all);
            this.t.setContentDescription(getString(R.string.menu_expand));
            this.s.setVisibility(0);
        }
        h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o2() {
        ExoPlayer exoPlayer;
        this.s0 = false;
        this.A.setText(HttpUrl.FRAGMENT_ENCODE_SET);
        if (!this.q0) {
            this.b.setUseController(true);
        }
        if (this.r0 && (exoPlayer = this.W) != null) {
            exoPlayer.S(true);
        }
        p4(false);
        this.t0 = 0L;
        this.u0 = 0L;
        n4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o3() {
        if (this.W == null) {
            return;
        }
        if (w2() < B2() - 1) {
            s3();
        } else {
            q3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o4() {
        int B2 = B2();
        boolean z = B2 > 0;
        boolean z2 = w2() < B2 - 1;
        E3(z, this.o);
        E3(z2, this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p2() {
        if (this.W == null) {
            return;
        }
        this.s0 = true;
        boolean I = this.b.I();
        this.q0 = I;
        if (!I) {
            this.b.setUseController(false);
            this.b.setControllerAutoShow(false);
        }
        boolean n2 = this.W.n();
        this.r0 = n2;
        if (n2) {
            this.W.S(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean p3(float r9, float r10, float r11) {
        /*
            r8 = this;
            boolean r0 = r8.d3()
            r1 = 0
            if (r0 != 0) goto Lb
            r8.f2()
            return r1
        Lb:
            androidx.media3.exoplayer.ExoPlayer r0 = r8.W
            ax.S0.I r0 = r0.M()
            androidx.media3.ui.AspectRatioFrameLayout r2 = r8.F
            float r2 = r2.getTranslationX()
            androidx.media3.ui.AspectRatioFrameLayout r3 = r8.F
            float r3 = r3.getTranslationY()
            int r4 = r0.a()
            float r4 = (float) r4
            float r4 = r4 * r9
            int r4 = (int) r4
            androidx.media3.ui.PlayerView r5 = r8.b
            int r5 = r5.getHeight()
            r6 = 1
            if (r4 > r5) goto L2f
            goto L45
        L2f:
            float r4 = (float) r4
            androidx.media3.ui.AspectRatioFrameLayout r7 = r8.F
            float r7 = r7.getTranslationY()
            float r11 = r8.Z1(r4, r5, r7, r11)
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 == 0) goto L45
            androidx.media3.ui.AspectRatioFrameLayout r3 = r8.F
            r3.setTranslationY(r11)
            r11 = 1
            goto L46
        L45:
            r11 = 0
        L46:
            int r0 = r0.b()
            float r0 = (float) r0
            float r0 = r0 * r9
            int r9 = (int) r0
            androidx.media3.ui.PlayerView r0 = r8.b
            int r0 = r0.getWidth()
            if (r9 > r0) goto L57
            goto L6c
        L57:
            float r9 = (float) r9
            androidx.media3.ui.AspectRatioFrameLayout r3 = r8.F
            float r3 = r3.getTranslationX()
            float r9 = r8.Z1(r9, r0, r3, r10)
            int r10 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r10 == 0) goto L6c
            androidx.media3.ui.AspectRatioFrameLayout r10 = r8.F
            r10.setTranslationX(r9)
            goto L6e
        L6c:
            if (r11 == 0) goto L6f
        L6e:
            return r6
        L6f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.viewer.VideoPlayerActivity.p3(float, float, float):boolean");
    }

    private void p4(boolean z) {
        ExoPlayer exoPlayer = this.W;
        if (exoPlayer == null) {
            return;
        }
        long s0 = exoPlayer.s0();
        if (z || s0 >= this.u0 || !this.v0) {
            if (z || s0 <= this.u0 || this.v0) {
                if (this.v0) {
                    this.W.c(Z.e);
                } else {
                    this.W.c(Z.f);
                }
                this.W.t(this.u0);
                this.W.c(Z.g);
                this.t0 = System.currentTimeMillis();
            }
        }
    }

    private View q2() {
        this.I.setTouchscreenBlocksFocus(false);
        View childAt = this.I.getChildAt(0);
        if (!(childAt instanceof androidx.appcompat.widget.p)) {
            C3184b.e("not work anymore");
            return childAt;
        }
        if (this.I.getNavigationContentDescription() == null || !this.I.getNavigationContentDescription().equals(childAt.getContentDescription())) {
            C3184b.e("not work anymore");
            return childAt;
        }
        childAt.setId(android.R.id.home);
        return childAt;
    }

    private void q3() {
        if (h3()) {
            B4();
        }
        H3(0);
        r3(w2(), true);
    }

    private void q4() {
        if (!this.e.n0()) {
            J3(true);
        } else if (W2()) {
            J3(false);
        } else if (this.r1) {
            J3(true);
        } else {
            J3(false);
        }
        h4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r2() {
        this.B1.removeCallbacks(this.K1);
        this.b.setUseController(false);
        finish();
    }

    private void r3(int i2, boolean z) {
        if (i2 < 0 || i2 >= B2()) {
            C3184b.f();
            return;
        }
        if (this.W == null) {
            return;
        }
        u uVar = this.H1;
        if (uVar != null && !uVar.isCancelled() && AbstractC3199q.n(this.H1)) {
            this.H1.e();
        }
        u uVar2 = new u(i2, z);
        this.H1 = uVar2;
        uVar2.i(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r4() {
        ExoPlayer exoPlayer = this.W;
        if (exoPlayer == null) {
            this.k.setImageDrawable(this.T0);
            this.k.setContentDescription(this.d1);
            return;
        }
        int o2 = exoPlayer.o();
        if (o2 == 0) {
            this.k.setImageDrawable(this.T0);
            this.k.setContentDescription(this.d1);
        } else if (o2 == 1) {
            this.k.setImageDrawable(this.U0);
            this.k.setContentDescription(this.e1);
        } else {
            if (o2 != 2) {
                return;
            }
            this.k.setImageDrawable(this.V0);
            this.k.setContentDescription(this.f1);
        }
    }

    private String s2(String str, List<AbstractC3595n> list) {
        if (!d0.B(str)) {
            ax.Ha.c.h().f().b("Invalid media path 3").g("path:" + str).h();
            return null;
        }
        if (list == null) {
            return null;
        }
        String l2 = d0.l(str);
        for (String str2 : C1808A.o()) {
            String str3 = l2 + "." + str2;
            for (AbstractC3595n abstractC3595n : list) {
                if (str3.equals(abstractC3595n.E())) {
                    return abstractC3595n.B();
                }
            }
        }
        return null;
    }

    private void s3() {
        if (w2() >= B2()) {
            C3184b.e("bad index");
            return;
        }
        if (h3()) {
            B4();
        }
        H3(w2() + 1);
        r3(w2(), true);
    }

    private void s4() {
        if (this.d0) {
            this.x.setImageDrawable(this.Z0);
            this.x.setContentDescription(this.i1);
        } else {
            this.x.setImageDrawable(this.Y0);
            this.x.setContentDescription(this.j1);
        }
    }

    private Uri t2(Uri uri) {
        List<AbstractC3595n> h2;
        String s2;
        String uri2 = uri.toString();
        if ("file".equals(uri.getScheme())) {
            return v2(uri.getPath());
        }
        Uri uri3 = null;
        if (uri2.startsWith("content://media")) {
            String a2 = ax.c3.N.a(this, uri);
            if (a2 != null) {
                return v2(a2);
            }
            return null;
        }
        if ("content".equals(uri.getScheme())) {
            Uri u2 = u2(this, uri);
            S1.fine("subtitle uri : " + u2);
            return u2;
        }
        if (com.voxdon.xplorer.service.b.k(this, uri)) {
            ax.Z2.k z = C2686c.z(uri.getPath());
            String r2 = d0.r(uri.getPath());
            ax.Z2.k z2 = C2686c.z(r2);
            if (z2 != null && z != null && C1835x.e(z2.d()).a() && (h2 = ax.Z2.b.k().h(z2.toString())) != null && (s2 = s2(z.e(), h2)) != null) {
                Uri.Builder buildUpon = uri.buildUpon();
                buildUpon.path(d0.Q(r2, s2));
                uri3 = buildUpon.build();
                S1.fine("subtitle uri : " + uri3);
            }
        }
        S1.fine("media uri : " + uri);
        return uri3;
    }

    private void t3() {
        if (w2() <= 0) {
            return;
        }
        if (h3()) {
            B4();
        }
        H3(w2() - 1);
        r3(w2(), true);
    }

    private void t4() {
        ExoPlayer exoPlayer = this.W;
        if (exoPlayer != null) {
            this.m1 = exoPlayer.v();
            this.n1 = this.W.P();
            this.o1 = Math.max(0L, this.W.V());
        }
    }

    private Uri u2(Context context, Uri uri) {
        String path = uri.getPath();
        if (!d0.B(path)) {
            ax.Ha.c.h().f().b("Invalid media path 2").g("path:" + path).h();
            return null;
        }
        String l2 = d0.l(path);
        ContentResolver contentResolver = context.getContentResolver();
        for (String str : C1808A.o()) {
            Uri build = uri.buildUpon().path(l2 + "." + str).build();
            try {
                try {
                    contentResolver.openFileDescriptor(build, "r").close();
                } catch (IOException unused) {
                }
                return build;
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u3() {
        ExoPlayer exoPlayer = this.W;
        if (exoPlayer == null) {
            return;
        }
        int i2 = exoPlayer.i();
        long s0 = this.W.s0();
        if (w2() == 0 || (i2 != 4 && s0 > 3000)) {
            this.W.t(0L);
        } else if (w2() > 0) {
            t3();
        }
    }

    private Uri v2(String str) {
        if (!d0.B(str)) {
            ax.Ha.c.h().f().b("Invalid media path 1").g("path:" + str).h();
            return null;
        }
        String l2 = d0.l(str);
        for (String str2 : C1808A.o()) {
            File file = new File(l2 + "." + str2);
            if (file.exists()) {
                return Uri.fromFile(file);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v4() {
        E3(this.j0, this.v);
        if (!this.j0) {
            this.v.setImageDrawable(this.W0);
            this.v.setContentDescription(this.h1);
            this.v.setVisibility(8);
            this.b.getSubtitleView().setVisibility(8);
            return;
        }
        if (this.k0) {
            this.v.setImageDrawable(this.X0);
            this.v.setContentDescription(this.g1);
            this.v.setVisibility(0);
            this.b.getSubtitleView().setVisibility(0);
            return;
        }
        this.v.setImageDrawable(this.W0);
        this.v.setContentDescription(this.h1);
        this.v.setVisibility(0);
        this.b.getSubtitleView().setVisibility(8);
    }

    private int w2() {
        int i2 = this.i0;
        if (i2 < 0) {
            C3184b.f();
            return 0;
        }
        if (i2 < B2()) {
            return this.i0;
        }
        C3184b.f();
        return B2() - 1;
    }

    private void w3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w4() {
        Uri x2 = x2();
        if (x2 == null) {
            P3(HttpUrl.FRAGMENT_ENCODE_SET);
            return;
        }
        if (!"file".equals(x2.getScheme()) && !C1809B.L(x2.getScheme()) && !MyFileProvider.D(x2)) {
            if ("content".equals(x2.getScheme())) {
                P3(C1809B.w(this, x2).a);
            }
        } else if (x2.getPath() != null) {
            P3(d0.h(x2.getPath()));
        } else {
            P3(HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    private Uri x2() {
        if (this.Z == null) {
            C3184b.f();
            return null;
        }
        int z2 = z2(w2());
        if (z2 >= 0) {
            Uri[] uriArr = this.Z;
            if (z2 < uriArr.length) {
                return uriArr[z2];
            }
        }
        C3184b.e("what case is this");
        return null;
    }

    private void x3() {
        ax.b1.O o2 = this.X;
        if (o2 != null) {
            o2.d();
            this.X = null;
        }
    }

    private void x4() {
        ax.l1.n nVar = this.N0;
        if (nVar != null) {
            this.O0 = nVar.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Uri y2() {
        if (this.a0 == null) {
            C3184b.f();
            return null;
        }
        return this.a0[z2(w2())];
    }

    private void y3() {
        if (this.W != null) {
            x4();
            t4();
            this.W.d();
            this.W = null;
            this.Y = null;
            this.N0 = null;
        }
        if (Q.g1()) {
            x3();
        }
    }

    private void y4(Intent intent) {
        this.B1.removeCallbacks(this.K1);
        this.y1 = intent.getIntExtra("slide_interval", -1);
        this.A1 = intent.getBooleanExtra("finish_after_play", false);
        this.z1 = false;
    }

    private int z2(int i2) {
        return this.d0 ? this.c0.get(i2).intValue() : i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z4() {
        this.C0 = false;
        this.B.setVisibility(8);
    }

    public String C2() {
        if (this.p1 == null) {
            this.p1 = ax.S0.d0.w0(this, "CxFileExplorer");
        }
        return this.p1;
    }

    public void J3(boolean z) {
        int i2 = z ? 3846 : 1792;
        this.q1 = i2;
        this.a.setSystemUiVisibility(i2);
    }

    @Override // androidx.media3.ui.C0641d.m
    public void K(int i2) {
        Snackbar snackbar;
        q4();
        if (i2 == 8) {
            l2();
            this.E1.d();
        }
        if (i2 != 0 || (snackbar = this.G) == null) {
            return;
        }
        snackbar.x();
        this.G = null;
    }

    public void Z3() {
        v3();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x010a  */
    @Override // ax.n.ActivityC2561c, ax.P.h, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r8) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.viewer.VideoPlayerActivity.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.app.Activity
    public void finish() {
        if (!f3()) {
            I3();
        } else if (this.z1) {
            setResult(0);
        } else {
            setResult(-1);
        }
        super.finish();
        if (!X2() || this.z1) {
            return;
        }
        if (f3()) {
            overridePendingTransition(R.anim.slideshow_in_right, R.anim.slideshow_out_left);
        } else {
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }
    }

    @Override // com.voxdon.xplorer.viewer.g.c
    public H h() {
        return this.W;
    }

    n.e j2() {
        n.f fVar = new n.f(this);
        fVar.Q(this.Q);
        fVar.a0(this.Q);
        fVar.f0(true);
        return fVar.F();
    }

    @Override // com.voxdon.xplorer.viewer.g.c
    public C0641d k() {
        return this.e;
    }

    @Override // ax.n.ActivityC2561c, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i4();
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        ax.Q2.b.f(this, true);
        super.onCreate(bundle);
        if (!Q.N0()) {
            ax.Ha.c.h().f().d("VIDEO PLAYER NOT SUPPORTED").h();
            Toast.makeText(this, R.string.error, 1).show();
            finish();
            return;
        }
        y4(getIntent());
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        try {
            g.a W1 = W1();
            this.U = W1;
            this.V = new Z.b(W1);
            setContentView(R.layout.activity_videoplayer);
            this.a = findViewById(R.id.root_view);
            this.T = (TextView) findViewById(R.id.debug_text_view);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            this.I = toolbar;
            setSupportActionBar(toolbar);
            Locale locale = getResources().getConfiguration().locale;
            if (locale != null) {
                this.Q = locale.toLanguageTag();
            } else {
                this.Q = Locale.getDefault().toLanguageTag();
            }
            this.E1 = new com.voxdon.xplorer.viewer.g(this, this);
            PlayerView playerView = (PlayerView) findViewById(R.id.player_view);
            this.b = playerView;
            if (playerView.getVideoSurfaceView() instanceof SurfaceView) {
                ((SurfaceView) this.b.getVideoSurfaceView()).getHolder().addCallback(new k());
            }
            this.b.setControllerVisibilityListener(this);
            this.b.setErrorMessageProvider(new v(this, null));
            this.b.requestFocus();
            this.H = findViewById(R.id.progress);
            this.F = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
            this.e = (C0641d) findViewById(R.id.exo_controller);
            G3();
            this.b.setControllerAnimationEnabled(false);
            this.e.setFitsSystemWindows(true);
            this.A = (TextView) findViewById(R.id.drag_seek_text);
            this.B = findViewById(R.id.drag_control_container);
            this.C = (ImageView) findViewById(R.id.vertical_progressbar_icon);
            this.D = (ProgressBar) findViewById(R.id.vertical_progressbar);
            this.E = (TextView) findViewById(R.id.change_speed_playing_indicator);
            this.f = (ViewGroup) findViewById(R.id.buttons_line);
            this.g = findViewById(R.id.control_buttons_line0);
            this.h = findViewById(R.id.control_buttons_line1);
            this.i = findViewById(R.id.control_buttons_line2);
            this.j = findViewById(R.id.control_progress_line);
            View findViewById = findViewById(R.id.custom_less);
            this.m = findViewById;
            findViewById.setOnClickListener(this.P1);
            View findViewById2 = findViewById(R.id.custom_more);
            this.l = findViewById2;
            findViewById2.setOnClickListener(this.P1);
            ImageButton imageButton = (ImageButton) findViewById(R.id.custom_repeat_toggle);
            this.k = imageButton;
            imageButton.setOnClickListener(this.P1);
            View findViewById3 = findViewById(R.id.custom_next);
            this.n = findViewById3;
            findViewById3.setOnClickListener(this.P1);
            View findViewById4 = findViewById(R.id.custom_prev);
            this.o = findViewById4;
            findViewById4.setOnClickListener(this.P1);
            View findViewById5 = findViewById(R.id.custom_lock);
            this.p = findViewById5;
            findViewById5.setOnClickListener(this.P1);
            View findViewById6 = findViewById(R.id.custom_unlock);
            this.q = findViewById6;
            findViewById6.setOnClickListener(this.P1);
            View findViewById7 = findViewById(R.id.custom_rotation);
            this.s = findViewById7;
            findViewById7.setOnClickListener(this.P1);
            ImageButton imageButton2 = (ImageButton) findViewById(R.id.custom_resize_mode);
            this.r = imageButton2;
            imageButton2.setOnClickListener(this.P1);
            ImageView imageView = (ImageView) findViewById(R.id.custom_toggle_expand);
            this.t = imageView;
            imageView.setOnClickListener(this.P1);
            MySpinner mySpinner = (MySpinner) findViewById(R.id.custom_speed);
            this.y = mySpinner;
            mySpinner.setPromptId(R.string.playback_speed);
            com.voxdon.xplorer.viewer.d dVar = new com.voxdon.xplorer.viewer.d(this);
            this.y.setAdapter((SpinnerAdapter) dVar);
            this.y.setOnItemSelectedListener(new l(dVar));
            ImageButton imageButton3 = (ImageButton) findViewById(R.id.custom_audio_track);
            this.u = imageButton3;
            imageButton3.setOnClickListener(this.P1);
            ImageButton imageButton4 = (ImageButton) findViewById(R.id.custom_subtitles);
            this.v = imageButton4;
            imageButton4.setOnClickListener(this.P1);
            ImageButton imageButton5 = (ImageButton) findViewById(R.id.custom_shuffle);
            this.x = imageButton5;
            imageButton5.setOnClickListener(this.P1);
            this.w = (ImageButton) findViewById(R.id.exo_play_pause);
            this.z = findViewById(R.id.end_overlay);
            this.J = (ViewGroup) findViewById(R.id.ads_overlay);
            this.K = (ViewGroup) findViewById(R.id.ads_container);
            this.L = findViewById(R.id.ads_close);
            this.M = findViewById(R.id.ads_progress);
            this.L.setOnClickListener(new m());
            C0639b c0639b = (C0639b) this.b.findViewById(R.id.exo_progress);
            this.S = c0639b;
            c0639b.a(this.L1);
            this.a.setOnSystemUiVisibilityChangeListener(new n());
            this.w0 = C3180B.e(this, 30);
            this.x0 = C3180B.e(this, 35);
            this.I0 = C3098a.b();
            J2();
            G2();
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("track_selector_parameters");
                if (bundle2 != null) {
                    this.O0 = n.e.Q(bundle2);
                }
                if (this.O0 == null) {
                    this.O0 = j2();
                }
                this.m1 = bundle.getBoolean("auto_play");
                this.n1 = bundle.getInt("window", -1);
                this.o1 = bundle.getLong("position", -1L);
                this.p0 = bundle.getFloat("speed", 1.0f);
            } else {
                this.O0 = j2();
                g2();
            }
            getOnBackPressedDispatcher().h(this, this.J1);
            this.C1 = C3180B.e(this, 40);
            this.D1 = C3180B.e(this, 52);
            getSupportFragmentManager().m1("dialog_dismiss_request", this, new o());
        } catch (SecurityException unused) {
            ax.Ha.c.h().f().d("VIDEO PLAYER BUILD SOURCE").h();
            Toast.makeText(this, R.string.error, 1).show();
            finish();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.video_player, menu);
        return true;
    }

    @Override // ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    public void onDestroy() {
        w3();
        if (this.s1 && this.t1 != null) {
            com.voxdon.xplorer.service.b.f(this).l(false, this.t1);
        }
        if (this.N != null) {
            e2();
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        y3();
        w3();
        g2();
        setIntent(intent);
        y4(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        }
        if (itemId == R.id.menu_settings) {
            Y3();
            return true;
        }
        if (itemId != R.id.menu_toggle_expansion) {
            return false;
        }
        b4();
        return true;
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    public void onPause() {
        super.onPause();
        if (ax.S0.d0.a <= 23) {
            PlayerView playerView = this.b;
            if (playerView != null) {
                playerView.P();
            }
            y3();
        }
        View view = this.N;
        if (view == null || this.O) {
            return;
        }
        ax.S2.b.c(view, this);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem = menu.findItem(R.id.menu_toggle_expansion);
        if (findItem != null) {
            findItem.setVisible(false);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        if (iArr.length == 0) {
            return;
        }
        if (iArr[0] == 0) {
            L2();
        } else {
            W3(R.string.error_access_denied);
            finish();
        }
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    public void onResume() {
        super.onResume();
        if (ax.S0.d0.a <= 23 || this.W == null) {
            L2();
            PlayerView playerView = this.b;
            if (playerView != null) {
                playerView.Q();
            }
        }
        View view = this.N;
        if (view == null || this.O) {
            return;
        }
        ax.S2.b.l(view, this);
    }

    @Override // androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        x4();
        t4();
        n.e eVar = this.O0;
        if (eVar != null) {
            bundle.putBundle("track_selector_parameters", eVar.J());
        }
        bundle.putBoolean("auto_play", this.m1);
        bundle.putInt("window", this.n1);
        bundle.putLong("position", this.o1);
        bundle.putFloat("speed", this.p0);
    }

    @Override // ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    public void onStart() {
        super.onStart();
        if (ax.S0.d0.a > 23) {
            L2();
            PlayerView playerView = this.b;
            if (playerView != null) {
                playerView.Q();
            }
        }
        if (Q.N1()) {
            ax.X2.v.s(getWindow(), -1157627904);
            ax.X2.v.r(getWindow(), -1157627904);
        }
    }

    @Override // ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    public void onStop() {
        super.onStop();
        if (ax.S0.d0.a > 23) {
            PlayerView playerView = this.b;
            if (playerView != null) {
                playerView.P();
            }
            y3();
        }
    }

    public void u4() {
        O3(ax.t3.l.h(this), true);
    }

    public void v3() {
        PlayerView playerView = this.b;
        if (playerView != null) {
            playerView.P();
        }
        y3();
        L2();
    }

    public void z3() {
        r3(w2(), true);
    }
}
