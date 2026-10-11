/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.viewer;

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
import android.view.KeyEvent;
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
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.MySpinner;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.p;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.o0;
import androidx.media3.exoplayer.s;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.G;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;
import androidx.media3.ui.d;
import ax.P0.A;
import ax.P0.C;
import ax.P0.F;
import ax.P0.H;
import ax.P0.P;
import ax.P0.T;
import ax.P0.V;
import ax.P0.a0;
import ax.P0.y;
import ax.Q2.a;
import ax.S0.H;
import ax.S0.I;
import ax.S0.d0;
import ax.S2.b;
import ax.U0.g;
import ax.U0.m;
import ax.X2.J;
import ax.X2.Q;
import ax.Y0.Z;
import ax.Z2.b;
import ax.Z2.k;
import ax.a3.W;
import ax.c3.K;
import ax.c3.N;
import ax.f1.L;
import ax.i.r;
import ax.i1.O;
import ax.i1.Z;
import ax.l1.D;
import ax.l1.G;
import ax.l1.a;
import ax.l1.n;
import ax.m1.j;
import ax.o3.c;
import ax.t3.j;
import ax.t3.l;
import ax.u3.B;
import ax.u3.o;
import ax.u3.q;
import ax.u3.z;
import ax.w3.h;
import com.alphainventor.filemanager.provider.MyFileProvider;
import com.alphainventor.filemanager.viewer.a;
import com.alphainventor.filemanager.viewer.d;
import com.alphainventor.filemanager.viewer.e;
import com.alphainventor.filemanager.viewer.f;
import com.alphainventor.filemanager.viewer.g;
import com.google.android.material.snackbar.Snackbar;
import java.io.File;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Logger;

public class VideoPlayerActivity
extends ax.n.c
implements d.m,
g.c {
    private static final Logger S1 = Logger.getLogger("FileManager.VideoPlayer");
    private static boolean T1 = false;
    private static boolean U1 = false;
    private TextView A;
    private boolean A0;
    private boolean A1;
    private View B;
    private AudioManager B0;
    private Handler B1 = new Handler();
    private ImageView C;
    private boolean C0;
    private int C1;
    private ProgressBar D;
    private int D0;
    private int D1;
    private TextView E;
    private int E0;
    private g E1;
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
    r J1 = new r(this, true){
        final VideoPlayerActivity d;
        {
            this.d = videoPlayerActivity;
            super(bl);
        }

        @Override
        public void d() {
            this.d.b.V();
        }
    };
    private ViewGroup K;
    private boolean K0;
    Runnable K1 = new Runnable(this){
        final VideoPlayerActivity q;
        {
            this.q = videoPlayerActivity;
        }

        @Override
        public void run() {
            if (!this.q.z1) {
                this.q.r2();
            }
        }
    };
    private View L;
    private long L0;
    G.a L1 = new G.a(this){
        private long a;
        final VideoPlayerActivity b;
        {
            this.b = videoPlayerActivity;
        }

        @Override
        public void G(G g8, long l8) {
            if (!this.b.U2()) {
                this.b.p2();
                this.a = l8;
            }
        }

        @Override
        public void K(G object, long l8) {
            object = this.b;
            boolean bl = this.a > l8;
            ((VideoPlayerActivity)object).n2(l8, bl, false);
            this.a = l8;
        }

        @Override
        public void M(G g8, long l8, boolean bl) {
            if (this.b.U2()) {
                VideoPlayerActivity.r1(this.b, l8);
                this.b.o2();
            }
        }
    };
    private View M;
    private long M0;
    Runnable M1 = new Runnable(this){
        final VideoPlayerActivity q;
        {
            this.q = videoPlayerActivity;
        }

        @Override
        public void run() {
            this.q.A.setText((CharSequence)"");
        }
    };
    private View N;
    private n N0;
    private ScaleGestureDetector.SimpleOnScaleGestureListener N1 = new ScaleGestureDetector.SimpleOnScaleGestureListener(this){
        float a;
        float b;
        float c;
        float d;
        final VideoPlayerActivity e;
        {
            this.e = videoPlayerActivity;
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            if (!this.e.V2() && !this.e.Z2()) {
                if (!this.e.h3()) {
                    return false;
                }
                float f8 = this.c;
                float f9 = scaleGestureDetector.getFocusX();
                float f10 = this.d;
                float f11 = scaleGestureDetector.getFocusY();
                this.e.C4(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), f8 - f9, f10 - f11);
                this.c = scaleGestureDetector.getFocusX();
                this.d = scaleGestureDetector.getFocusY();
                return true;
            }
            return false;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            if (!this.e.V2() && !this.e.Z2()) {
                if (!ax.t3.l.v((Context)this.e)) {
                    return false;
                }
                this.a = scaleGestureDetector.getFocusX();
                this.b = scaleGestureDetector.getFocusY();
                this.c = scaleGestureDetector.getFocusX();
                this.d = scaleGestureDetector.getFocusY();
                VideoPlayerActivity.v1(this.e, true);
                if (!this.e.h3()) {
                    this.e.D4();
                }
                return true;
            }
            return false;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            if (!this.e.V2() && !this.e.Z2()) {
                VideoPlayerActivity.v1(this.e, false);
                this.a = 0.0f;
                this.b = 0.0f;
                this.c = 0.0f;
                this.d = 0.0f;
            }
        }
    };
    private boolean O;
    private n.e O0;
    private GestureDetector.SimpleOnGestureListener O1 = new GestureDetector.SimpleOnGestureListener(this){
        float a;
        float b;
        long c;
        float d;
        float e;
        final VideoPlayerActivity f;
        {
            this.f = videoPlayerActivity;
        }

        private void a() {
            this.e = 0.0f;
            this.d = 0.0f;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            int n8;
            this.f.b2();
            if (this.f.W == null) {
                return false;
            }
            int n9 = this.f.b.getWidth();
            if (n9 > 0) {
                n8 = n9 / 3;
                n9 = n9 * 2 / 3;
                if (motionEvent.getX() < (float)n8) {
                    if (!ax.t3.l.s((Context)this.f)) {
                        return false;
                    }
                    this.f.m2(false);
                    return true;
                }
                if (motionEvent.getX() > (float)n9) {
                    if (!ax.t3.l.s((Context)this.f)) {
                        return false;
                    }
                    this.f.m2(true);
                    return true;
                }
            }
            if ((n8 = this.f.W.i()) != 2 && n8 != 3) {
                if (n8 == 4) {
                    this.f.a4();
                }
            } else {
                this.f.c4();
            }
            return true;
        }

        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return true;
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
            if (this.f.W == null) {
                return false;
            }
            return !(Math.abs(f8) < Math.abs(f9));
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (this.f.h3() || this.f.Z2() || !ax.t3.l.q((Context)this.f)) {
                return;
            }
            this.f.l3();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public boolean onScroll(MotionEvent object, MotionEvent object2, float f8, float f9) {
            int n8;
            float f10;
            float f11;
            StringBuilder stringBuilder;
            ExoPlayer exoPlayer = this.f.W;
            boolean bl = false;
            if (exoPlayer == null) {
                return false;
            }
            if (object == null || stringBuilder == null) return false;
            this.f.b2();
            if (this.f.h3()) {
                if (this.f.c3()) return false;
                VideoPlayerActivity videoPlayerActivity = this.f;
                videoPlayerActivity.p3(videoPlayerActivity.y0, f11, f10);
                return true;
            }
            if (this.f.Z2()) {
                this.a();
                return false;
            }
            if (!this.f.V2()) {
                if (stringBuilder.getPointerCount() > 1) {
                    if (stringBuilder.getPointerCount() != 2) return false;
                    this.d = object.getX();
                    this.e = stringBuilder.getX();
                    return false;
                }
                if (Math.abs(f11) < Math.abs(f10)) {
                    if (Math.abs(object.getY() - stringBuilder.getY()) < (float)this.f.x0) {
                        return false;
                    }
                    n8 = this.f.a.getHeight() < this.f.C1 * 10 ? this.f.C1 : (this.f.a.getHeight() < this.f.D1 * 10 ? this.f.D1 : this.f.a.getHeight() / 10);
                    if (object.getY() < (float)n8 || object.getY() > (float)(this.f.a.getHeight() - n8)) return false;
                    this.b = object.getY();
                    if (this.f.b != null && object.getX() < (float)(this.f.b.getWidth() / 2)) {
                        if (!ax.t3.l.o((Context)this.f)) {
                            return false;
                        }
                        this.f.V1();
                    } else {
                        if (!ax.t3.l.u((Context)this.f)) {
                            return false;
                        }
                        this.f.A4();
                    }
                } else {
                    if (Math.abs(object.getX() - stringBuilder.getX()) < (float)this.f.w0) {
                        return false;
                    }
                    this.a = object.getX();
                    this.c = this.f.W.s0();
                    if (!ax.t3.l.t((Context)this.f)) {
                        return false;
                    }
                    this.f.p2();
                }
            }
            if (!this.f.V2()) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("what case is this : ");
                stringBuilder.append(this.a);
                stringBuilder.append(",");
                stringBuilder.append(object.getX());
                ax.u3.b.e(stringBuilder.toString());
                return true;
            }
            if (this.f.U2()) {
                long l8;
                f10 = stringBuilder.getX();
                float f12 = this.a;
                long l9 = (long)ax.u3.B.f((Context)this.f, (int)(f10 - f12)) * 40000L / 360L;
                long l10 = this.c + l9;
                l9 = l8 = this.f.W.g0();
                if (l8 == -9223372036854775807L) {
                    l9 = 0L;
                }
                if (l10 < 0L) {
                    l8 = 0L;
                } else {
                    l8 = l10;
                    if (l10 > l9) {
                        l8 = l9;
                    }
                }
                VideoPlayerActivity videoPlayerActivity = this.f;
                if (f11 > 0.0f) {
                    bl = true;
                }
                videoPlayerActivity.n2(l8, bl, true);
                return true;
            }
            if (this.f.g3()) {
                f10 = this.b;
                f11 = stringBuilder.getY();
                n8 = ax.u3.B.f((Context)this.f, (int)(f10 - f11));
                this.f.D3(n8);
                return true;
            }
            if (!this.f.S2()) return false;
            f11 = this.b;
            f10 = stringBuilder.getY();
            n8 = ax.u3.B.f((Context)this.f, (int)(f11 - f10));
            this.f.C3(n8);
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            this.f.b2();
            this.f.a4();
            return true;
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    };
    private boolean P;
    private ax.r7.z<V.a> P0;
    private View.OnClickListener P1 = new ax.g3.c(this){
        final VideoPlayerActivity c;
        {
            this.c = videoPlayerActivity;
        }

        @Override
        public void a(View view) {
            switch (view.getId()) {
                default: {
                    return;
                }
                case 2131362092: {
                    this.c.j3(false);
                    return;
                }
                case 2131362091: {
                    this.c.b4();
                    return;
                }
                case 2131362090: {
                    this.c.g4();
                    return;
                }
                case 2131362088: {
                    this.c.f4();
                    return;
                }
                case 2131362087: {
                    this.c.B3();
                    return;
                }
                case 2131362086: {
                    this.c.e4();
                    return;
                }
                case 2131362085: {
                    this.c.d4();
                    return;
                }
                case 2131362084: {
                    this.c.u3();
                    return;
                }
                case 2131362083: {
                    this.c.n3();
                    return;
                }
                case 2131362082: {
                    this.c.F3(true);
                    return;
                }
                case 2131362081: {
                    this.c.j3(true);
                    return;
                }
                case 2131362080: {
                    this.c.F3(false);
                    return;
                }
                case 2131362079: 
            }
            this.c.d2();
        }
    };
    private String Q;
    private Drawable Q0;
    g.h Q1 = new g.h(this){
        final VideoPlayerActivity a;
        {
            this.a = videoPlayerActivity;
        }

        @Override
        public void a(boolean bl) {
            VideoPlayerActivity.S(true);
            if (!bl) {
                VideoPlayerActivity.U(true);
                return;
            }
            VideoPlayerActivity.U(false);
        }
    };
    private String R;
    private Drawable R0;
    private x R1;
    private androidx.media3.ui.b S;
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
    private y Y;
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
    private androidx.media3.ui.d e;
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
    private boolean k0 = false;
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
    private float p0 = 1.0f;
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
    private long w1 = 150L;
    private ImageButton x;
    private int x0;
    private boolean x1;
    private MySpinner y;
    private float y0;
    private int y1;
    private View z;
    private boolean z0;
    private boolean z1;

    static /* synthetic */ boolean A0(VideoPlayerActivity videoPlayerActivity, boolean bl) {
        videoPlayerActivity.u1 = bl;
        return bl;
    }

    private String A2(ax.r7.z<V.a> z8, String string) {
        if (z8 == null) {
            return null;
        }
        for (int i8 = 0; i8 < z8.size(); ++i8) {
            V.a a8 = (V.a)z8.get(i8);
            for (int i9 = 0; i9 < a8.a; ++i9) {
                String string2;
                ax.P0.v v8 = a8.b(i9);
                if (v8 == null || (string2 = v8.o) == null || !string2.startsWith(string)) continue;
                return v8.o;
            }
        }
        return null;
    }

    private void A3() {
        if (this.P) {
            this.e2();
        }
        this.J0 = true;
        if (this.O2()) {
            if (this.Q2()) {
                this.K.setBackgroundColor(0);
                this.N = ax.S2.b.j(this, new b.a(this){
                    final VideoPlayerActivity a;
                    {
                        this.a = videoPlayerActivity;
                    }
                });
                return;
            }
            this.K.setBackgroundColor(-1);
            ax.S2.b.k(this, new b.c(this){
                final VideoPlayerActivity a;
                {
                    this.a = videoPlayerActivity;
                }
            });
        }
    }

    private void A4() {
        if (this.B0 == null) {
            AudioManager audioManager;
            this.B0 = audioManager = (AudioManager)this.getSystemService("audio");
            if (audioManager == null) {
                return;
            }
        }
        this.D0 = this.B0.getStreamMaxVolume(3);
        this.E0 = this.B0.getStreamVolume(3);
        this.C0 = true;
        this.B.setVisibility(0);
        this.C.setImageResource(2131231200);
        this.D.setProgressDrawable(ax.o.a.b((Context)this, 2131231547));
        this.D.setMax(this.D0);
    }

    private int B2() {
        Uri[] uriArray = this.a0;
        if (uriArray == null) {
            return 0;
        }
        return uriArray.length;
    }

    private void B3() {
        if (this.R1 == null) {
            this.R1 = new x(this, this.B1);
        }
        this.R1.d();
    }

    private void B4() {
        this.A0 = false;
        this.y0 = 1.0f;
        this.f2();
    }

    private void C3(int n8) {
        int n9 = 255;
        n8 = n8 * 255 / 360;
        if ((n8 = (int)(this.G0 * 255.0f) + n8) > 255) {
            n8 = n9;
        } else if (n8 < 0) {
            n8 = 0;
        }
        WindowManager.LayoutParams layoutParams = this.getWindow().getAttributes();
        layoutParams.screenBrightness = (float)n8 / 255.0f;
        this.getWindow().setAttributes(layoutParams);
        this.D.setProgress(n8);
    }

    private void C4(float f8, float f9, float f10, float f11, float f12) {
        float f13;
        if (!this.d3()) {
            this.f2();
            return;
        }
        this.y0 = f13 = this.y0 * f8;
        if (f13 < 1.0f) {
            this.y0 = 1.0f;
        } else if (f13 > 3.0f) {
            this.y0 = 3.0f;
        }
        if (Float.isNaN(this.y0)) {
            this.y0 = 1.0f;
            this.f2();
            return;
        }
        this.F.setScaleX(this.y0);
        this.F.setScaleY(this.y0);
        float f14 = (float)this.b.getWidth() / 2.0f;
        float f15 = (float)this.b.getHeight() / 2.0f;
        float f16 = this.F.getTranslationX();
        f13 = this.F.getTranslationY();
        f9 = this.a2(f16, f14, f9, f8);
        f8 = this.a2(f13, f15, f10, f8);
        this.p3(this.y0, f9 + f11, f8 + f12);
    }

    static /* synthetic */ Uri D0(VideoPlayerActivity videoPlayerActivity, Uri uri) {
        videoPlayerActivity.v1 = uri;
        return uri;
    }

    private boolean D2() {
        return this.J0;
    }

    private void D3(int n8) {
        block9: {
            block8: {
                AudioManager audioManager;
                if (this.B0 != null) break block8;
                this.B0 = audioManager = (AudioManager)this.getSystemService("audio");
                if (audioManager == null) break block9;
            }
            int n9 = this.D0;
            n8 = n8 * n9 / 360;
            if ((n8 = this.E0 + n8) > n9) {
                n8 = n9;
            } else if (n8 < 0) {
                n8 = 0;
            }
            try {
                this.B0.setStreamVolume(3, n8, 0);
                this.D.setProgress(n8);
                return;
            }
            catch (SecurityException securityException) {
                ax.Q2.d.c("video set volume exception", securityException);
            }
        }
    }

    private void D4() {
        this.A0 = true;
    }

    private static boolean E2(Uri[] uriArray) {
        for (Uri uri : uriArray) {
            if (!ax.c3.B.L(uri.getScheme())) continue;
            if (uri.getHost() == null) {
                return true;
            }
            if (!uri.getHost().startsWith(".")) continue;
            return true;
        }
        return false;
    }

    private void E3(boolean bl, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(bl);
        float f8 = bl ? this.k1 : this.l1;
        view.setAlpha(f8);
        view.setVisibility(0);
    }

    private void F2() {
        ax.n.a a8 = this.getSupportActionBar();
        if (a8 == null) {
            return;
        }
        a8.n();
    }

    private void F3(boolean bl) {
        this.n0 = bl;
        ax.t3.l.j((Context)this, bl);
        this.n4();
        this.invalidateOptionsMenu();
    }

    static /* synthetic */ long G0(VideoPlayerActivity videoPlayerActivity, long l8) {
        videoPlayerActivity.w1 = l8;
        return l8;
    }

    private void G2() {
        ax.n.a a8 = this.getSupportActionBar();
        if (a8 != null) {
            a8.H("");
            a8.x(true);
        }
    }

    private void G3() {
        int n8 = ax.t3.l.b((Context)this);
        this.b.setControllerShowTimeoutMs(n8 * 1000);
    }

    static /* synthetic */ boolean H(VideoPlayerActivity videoPlayerActivity, boolean bl) {
        videoPlayerActivity.c = bl;
        return bl;
    }

    private void H2() {
        boolean bl = ax.t3.l.p((Context)this) && ax.P2.a.r((Context)this) ? ax.P2.a.m((Context)this) : false;
        if (!bl) {
            ax.P2.a.n((Context)this);
        }
    }

    private void H3(int n8) {
        this.i0 = n8;
        this.o4();
    }

    private void I2() {
        this.n0 = ax.t3.l.a((Context)this);
        this.n4();
        this.M3(ax.t3.l.d((Context)this));
        float f8 = this.p0;
        if (f8 != 0.0f) {
            this.L3(f8, true);
            this.y.setSelection(com.alphainventor.filemanager.viewer.d.c(this.p0));
        }
        this.u4();
    }

    private void I3() {
        if (this.a0 != null && this.y2() != null) {
            Intent intent = new Intent();
            intent.setData(this.x2());
            this.setResult(-1, intent);
        }
    }

    private void J2() {
        Resources resources = this.getResources();
        this.Q0 = ax.s3.a.c((Context)this, 2131231206);
        this.R0 = ax.s3.a.c((Context)this, 2131231208);
        this.S0 = ax.s3.a.c((Context)this, 2131231207);
        this.W0 = ax.s3.a.c((Context)this, 2131231234);
        this.X0 = ax.s3.a.c((Context)this, 2131231235);
        this.T0 = ax.s3.a.c((Context)this, 2131231019);
        this.U0 = ax.s3.a.c((Context)this, 2131231020);
        this.V0 = ax.s3.a.c((Context)this, 2131231018);
        this.Z0 = ax.s3.a.c((Context)this, 2131231024);
        this.Y0 = ax.s3.a.c((Context)this, 2131231023);
        this.a1 = resources.getString(2131952557);
        this.b1 = resources.getString(2131952559);
        this.c1 = resources.getString(2131952558);
        this.d1 = resources.getString(2131951987);
        this.e1 = resources.getString(2131951988);
        this.f1 = resources.getString(2131951986);
        this.g1 = resources.getString(2131951973);
        this.h1 = resources.getString(2131951972);
        this.i1 = resources.getString(2131951994);
        this.j1 = resources.getString(2131951993);
        this.k1 = (float)resources.getInteger(2131427337) / 100.0f;
        this.l1 = (float)resources.getInteger(2131427336) / 100.0f;
    }

    private void K2() {
        block21: {
            block22: {
                block23: {
                    block20: {
                        boolean bl;
                        int n8;
                        Logger logger;
                        int n9;
                        int n10 = 0;
                        if (this.a0 != null) break block20;
                        Uri[] uriArray = this.getIntent();
                        Uri uri = uriArray.getAction();
                        this.g0 = -1;
                        this.h0 = -1;
                        if (!"android.intent.action.VIEW".equals(uri) || uriArray.getData() == null) break block21;
                        uri = com.alphainventor.filemanager.viewer.e.b().c();
                        if (uri != null) {
                            this.Z = new Uri[uri.size()];
                            this.a0 = new Uri[uri.size()];
                            this.b0 = new Uri[uri.size()];
                            this.c0 = new ArrayList<Integer>();
                            for (n9 = 0; n9 < uri.size(); ++n9) {
                                this.c0.add(n9);
                            }
                            Collections.shuffle(this.c0);
                            for (n9 = 0; n9 < uri.size(); ++n9) {
                                e.a a8 = (e.a)uri.get(n9);
                                Uri[] uriArray2 = this.Z;
                                logger = a8.a;
                                uriArray2[n9] = logger;
                                this.a0[n9] = this.i2((Uri)logger);
                                logger = a8.b;
                                if (logger == null) continue;
                                this.b0[n9] = this.i2((Uri)logger);
                            }
                            for (n9 = 0; n9 < this.Z.length; ++n9) {
                                n8 = this.c0.get(n9);
                                uri = this.Z[n9];
                                if (uri != null && uri.equals((Object)uriArray.getData())) {
                                    this.g0 = n9;
                                }
                                if ((uri = this.Z[n8]) == null || !uri.equals((Object)uriArray.getData())) continue;
                                this.h0 = n9;
                            }
                        } else {
                            logger = S1;
                            uri = new StringBuilder();
                            uri.append("Video play : ");
                            uri.append(uriArray.getData());
                            logger.fine(uri.toString());
                            this.Z = new Uri[]{uriArray.getData()};
                            this.a0 = new Uri[]{this.i2(uriArray.getData())};
                            uri = new ArrayList();
                            this.c0 = uri;
                            uri.add(0);
                            this.b0 = new Uri[1];
                        }
                        this.e0 = bl = uriArray.getBooleanExtra("detect_subtitle", true);
                        if (bl) {
                            this.f0 = new boolean[this.a0.length];
                        }
                        if (this.d0) {
                            n9 = this.h0;
                            if (n9 == -1) {
                                this.H3(0);
                            } else {
                                this.H3(n9);
                            }
                        } else {
                            n9 = this.g0;
                            if (n9 == -1) {
                                this.H3(0);
                            } else {
                                this.H3(n9);
                            }
                        }
                        uriArray = this.a0;
                        n8 = uriArray.length;
                        for (n9 = 0; n9 < n8; ++n9) {
                            uri = uriArray[n9];
                            if (com.alphainventor.filemanager.service.b.k((Context)this, uri)) {
                                this.x1 = true;
                                this.s1 = true;
                                if ((uri = ax.o3.c.z(uri.getPath())) == null) continue;
                                this.t1 = uri.d();
                                continue;
                            }
                            if (!ax.c3.B.L(uri.getScheme())) continue;
                            this.x1 = true;
                        }
                        if (this.s1 && this.t1 != null) {
                            com.alphainventor.filemanager.service.b.f((Context)this).l(true, this.t1);
                        }
                        uri = new y[this.a0.length];
                        for (n9 = n10; n9 < (uriArray = this.a0).length; ++n9) {
                            uri[n9] = ax.P0.y.b(uriArray[n9]);
                        }
                        if (VideoPlayerActivity.E2(uriArray) || !ax.S0.d0.m((y[])uri)) break block22;
                        if (!ax.X2.Q.z0() || !ax.u3.o.c()) break block23;
                    }
                    return;
                }
                ax.S0.d0.X0(this, this.a0);
                return;
            }
            this.W3(2131951927);
            return;
        }
        this.W3(2131951927);
        this.finish();
    }

    private void K3(boolean bl) {
        this.a.setKeepScreenOn(bl);
    }

    private void L2() {
        Object object;
        block7: {
            Object object2;
            ax.Y0.d d8;
            a.b b8;
            block10: {
                block8: {
                    block9: {
                        this.N3(ax.t3.l.f((Context)this));
                        this.K2();
                        if (this.a0 == null || this.W != null) break block7;
                        this.H2();
                        if (ax.X2.J.i()) {
                            androidx.media3.decoder.ffmpeg.b.I0(2);
                        }
                        b8 = new a.b();
                        d8 = new ax.Y0.d((Context)this);
                        d8.p(1);
                        if (!ax.t3.l.i((Context)this)) break block8;
                        object2 = ax.t3.l.g((Context)this);
                        if (TextUtils.isEmpty((CharSequence)object2)) break block9;
                        object = object2;
                        if (!"default".equals(object2)) break block10;
                    }
                    object = this.Q;
                    break block10;
                }
                object = "";
            }
            this.R = object;
            this.N0 = object = new t((Context)this, b8, (String)object);
            ((n)object).m(this.O0);
            this.P0 = null;
            object = new androidx.media3.exoplayer.j();
            object2 = new ExoPlayer.b((Context)this, d8);
            ((ExoPlayer.b)object2).m(this.N0);
            ((ExoPlayer.b)object2).i((o0)object);
            ((ExoPlayer.b)object2).k(10000L);
            ((ExoPlayer.b)object2).l(10000L);
            this.W = object = ((ExoPlayer.b)object2).h();
            object.c(ax.Y0.Z.g);
            this.W.N(new w(this));
            this.W.S(this.m1);
            this.W.r0(new ax.n1.a(this.N0));
            if (this.x1) {
                this.W.a(2);
            } else {
                this.W.a(1);
            }
            this.b.setPlayer(this.W);
            this.b.G();
            this.q4();
            object2 = new com.alphainventor.filemanager.viewer.a((Context)this, 1.5f, new a.b(this){
                final VideoPlayerActivity a;
                {
                    this.a = videoPlayerActivity;
                }

                @Override
                public void a(MotionEvent motionEvent) {
                    if (this.a.h3() || !ax.t3.l.r((Context)this.a)) {
                        return;
                    }
                    this.a.m3();
                }
            });
            object = new ScaleGestureDetector((Context)this, (ScaleGestureDetector.OnScaleGestureListener)this.N1);
            d8 = new GestureDetector((Context)this, (GestureDetector.OnGestureListener)this.O1);
            this.b.setOnTouchListener(new View.OnTouchListener(){
                final ScaleGestureDetector a;
                final GestureDetector b;
                final com.alphainventor.filemanager.viewer.a c;
                final VideoPlayerActivity d;
                {
                    this.d = videoPlayerActivity;
                    this.a = scaleGestureDetector;
                    this.b = gestureDetector;
                    this.c = a8;
                }

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean bl = this.d.r1;
                    boolean bl2 = false;
                    if (bl) {
                        return false;
                    }
                    bl = this.a.onTouchEvent(motionEvent);
                    if (this.b.onTouchEvent(motionEvent) || bl) {
                        bl2 = true;
                    }
                    this.c.g(motionEvent);
                    if (this.d.h3()) {
                        if (motionEvent.getAction() == 1 && this.d.y0 <= 1.0f) {
                            this.d.B4();
                        }
                        return true;
                    }
                    if (this.d.U2()) {
                        if (motionEvent.getAction() == 1) {
                            this.d.o2();
                        }
                        return true;
                    }
                    if (this.d.g3()) {
                        if (motionEvent.getAction() == 1) {
                            this.d.z4();
                        }
                        return true;
                    }
                    if (this.d.S2()) {
                        if (motionEvent.getAction() == 1) {
                            this.d.U1();
                        }
                        return true;
                    }
                    if (this.d.Z2()) {
                        if (motionEvent.getAction() == 1) {
                            this.d.k3();
                        }
                        return true;
                    }
                    return bl2;
                }
            });
        }
        if ((object = this.W) != null) {
            int n8 = this.n1;
            boolean bl = n8 != -1;
            if (bl) {
                object.s(n8, this.o1);
            }
            this.I2();
            this.l4();
            this.o4();
            this.r3(this.w2(), true ^ bl);
        }
    }

    private void L3(float f8, boolean bl) {
        block6: {
            block5: {
                ExoPlayer exoPlayer = this.W;
                if (exoPlayer == null) break block5;
                if (bl) {
                    this.p0 = f8;
                }
                if (exoPlayer.h() == null || this.W.h().a != f8) break block6;
            }
            return;
        }
        if (f8 == 1.0f) {
            this.W.e(ax.P0.G.d);
            return;
        }
        this.W.e(new ax.P0.G(f8));
    }

    static /* synthetic */ Runnable M(VideoPlayerActivity videoPlayerActivity, Runnable runnable2) {
        videoPlayerActivity.d = runnable2;
        return runnable2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void M2(float f8) {
        block8: {
            int n8;
            int n9;
            Object object;
            block10: {
                block9: {
                    object = this.W;
                    if (object == null || !object.n()) break block8;
                    this.H0 = true;
                    this.E.setVisibility(0);
                    I i8 = this.W.M();
                    if (f8 == 0.5f) {
                        this.E.setText((CharSequence)"0.5X\u25b6\u25b6");
                    } else if (f8 == 2.0f) {
                        this.E.setText((CharSequence)"2X\u25b6\u25b6");
                    } else {
                        ax.u3.b.f();
                        TextView textView = this.E;
                        object = new StringBuilder();
                        ((StringBuilder)object).append(f8);
                        ((StringBuilder)object).append("X\u25b6\u25b6");
                        textView.setText((CharSequence)((StringBuilder)object).toString());
                    }
                    if (i8.a() == -1 || this.b.getHeight() == 0 || this.b.getHeight() <= i8.a()) break block9;
                    n9 = ax.u3.B.e((Context)this, 10);
                    n9 = n8 = (this.b.getHeight() - i8.a()) / 2 - this.E.getHeight() - n9;
                    if (n8 >= 0) break block10;
                }
                n9 = 0;
            }
            n8 = n9;
            if (n9 == 0) {
                object = this.getSupportActionBar();
                n9 = object != null && ((ax.n.a)object).p() ? ((ax.n.a)object).l() : 0;
                n8 = n9 > 0 ? ax.u3.B.e((Context)this, 25) : ax.u3.B.e((Context)this, 5);
                n8 += n9;
            }
            object = (ViewGroup.MarginLayoutParams)this.E.getLayoutParams();
            object.setMargins(0, n8, 0, 0);
            this.E.setLayoutParams((ViewGroup.LayoutParams)object);
            this.L3(f8, false);
        }
    }

    private void M3(int n8) {
        ExoPlayer exoPlayer = this.W;
        if (exoPlayer == null) {
            return;
        }
        this.o0 = n8;
        exoPlayer.j(n8);
        this.r4();
    }

    private boolean N2() {
        return this.K0;
    }

    private void N3(boolean bl) {
        this.d0 = bl;
        this.s4();
    }

    private boolean O2() {
        return this.I0 != 0;
    }

    private void O3(int n8, boolean bl) {
        SubtitleView subtitleView = this.b.getSubtitleView();
        if (subtitleView == null) {
            return;
        }
        Object object = bl ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
        CaptioningManager captioningManager = (CaptioningManager)this.getSystemService("captioning");
        object = captioningManager != null && captioningManager.isEnabled() ? ax.a2.a.a(captioningManager.getUserStyle()) : new ax.a2.a(-1, 0, 0, 2, -16777216, (Typeface)object);
        subtitleView.setStyle((ax.a2.a)object);
        subtitleView.b(2, n8);
    }

    private boolean P2() {
        boolean bl = this.M0 != 0L && System.currentTimeMillis() - this.M0 > 90000L;
        if (bl) {
            S1.fine("ad is expired");
        }
        return bl;
    }

    private void P3(String string) {
        ax.n.a a8 = this.getSupportActionBar();
        if (a8 != null) {
            a8.H(string);
        }
    }

    private boolean Q2() {
        int n8 = this.I0;
        if (n8 != 33 && n8 != 34) {
            return n8 == 17 || n8 == 18;
            {
            }
        }
        return new Random().nextBoolean();
    }

    private void Q3() {
        ax.n.a a8 = this.getSupportActionBar();
        if (a8 == null) {
            return;
        }
        a8.J();
    }

    private static boolean R2(F throwable) {
        block4: {
            block3: {
                if (!(throwable instanceof s)) break block3;
                throwable = (s)throwable;
                if (((s)throwable).k0 != 0) {
                    return false;
                }
                for (throwable = ((s)throwable).i(); throwable != null; throwable = throwable.getCause()) {
                    if (!(throwable instanceof ax.i1.b)) continue;
                    return true;
                }
                break block4;
            }
            if (throwable == null) break block4;
            for (throwable = throwable.getCause(); throwable != null; throwable = throwable.getCause()) {
                if (!(throwable instanceof ax.i1.b)) continue;
                return true;
            }
        }
        return false;
    }

    private void R3(String object) {
        String string = ax.w3.h.b((Context)this, (String)object);
        if (ax.w3.d.w((Context)this, (String)object)) {
            object = ax.u3.B.T(this.a, string, -2);
            ((Snackbar)object).q0(2131951915, new ax.g3.c(this){
                final VideoPlayerActivity c;
                {
                    this.c = videoPlayerActivity;
                }

                public static /* synthetic */ void b(a a8, Integer n8) {
                    a8.c.H.setVisibility(8);
                    if (n8 == ax.w3.d.j) {
                        a8.c.z3();
                        return;
                    }
                    if (n8 == ax.w3.d.k) {
                        a8.c.V3(2131951927);
                    }
                }

                @Override
                public void a(View view) {
                    this.c.H.setVisibility(0);
                    new ax.w3.d((Context)this.c, new f(this)).i(new Void[0]);
                }
            });
            this.G = object;
        } else {
            object = ax.u3.B.T(this.a, string, 0);
        }
        ((Snackbar)object).a0();
    }

    static /* synthetic */ boolean S(boolean bl) {
        U1 = bl;
        return bl;
    }

    private boolean S2() {
        return this.F0;
    }

    private void S3() {
    }

    public static final boolean T2(int n8) {
        return n8 == 23 || n8 == 66 || n8 == 160;
    }

    private void T3(boolean bl) {
        if (bl) {
            this.z.setVisibility(0);
        } else {
            this.z.setVisibility(8);
        }
        this.k4();
    }

    static /* synthetic */ boolean U(boolean bl) {
        T1 = bl;
        return bl;
    }

    private void U1() {
        this.F0 = false;
        this.B.setVisibility(8);
    }

    private boolean U2() {
        return this.s0;
    }

    private void U3(boolean bl) {
        ImageView imageView = (ImageView)this.findViewById(2131362391);
        imageView.setVisibility(0);
        if (bl) {
            imageView.setImageResource(2131231119);
        } else {
            imageView.setImageResource(2131231118);
        }
        imageView.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(750L);
        alphaAnimation.setInterpolator((Interpolator)new DecelerateInterpolator());
        imageView.startAnimation((Animation)alphaAnimation);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener(){
            final ImageView a;
            final VideoPlayerActivity b;
            {
                this.b = videoPlayerActivity;
                this.a = imageView;
            }

            public void onAnimationEnd(Animation animation) {
                this.a.setVisibility(8);
                animation = new AlphaAnimation(1.0f, 0.0f);
                animation.setDuration(750L);
                animation.setInterpolator((Interpolator)new DecelerateInterpolator());
                this.a.startAnimation(animation);
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
    }

    private void V1() {
        float f8 = this.getWindow().getAttributes().screenBrightness;
        this.G0 = f8 >= 0.0f && f8 <= 1.0f ? f8 : 0.5f;
        this.D.setMax(255);
        this.F0 = true;
        this.B.setVisibility(0);
        this.D.setProgressDrawable(ax.o.a.b((Context)this, 2131231548));
        this.C.setImageResource(2131231199);
    }

    private boolean V2() {
        return this.U2() || this.g3() || this.S2();
        {
        }
    }

    private void V3(int n8) {
        ax.u3.B.S(this.a, n8, 0).a0();
    }

    static /* synthetic */ ax.r7.z W0(VideoPlayerActivity videoPlayerActivity, ax.r7.z z8) {
        videoPlayerActivity.P0 = z8;
        return z8;
    }

    private g.a W1() {
        j.b b8 = new j.b((Context)this);
        return new m((Context)this, this.C2(), b8.a());
    }

    private boolean W2() {
        return this.z.getVisibility() == 0;
    }

    private void W3(int n8) {
        this.X3(this.getString(n8));
    }

    static /* synthetic */ boolean X0(VideoPlayerActivity videoPlayerActivity, boolean bl) {
        videoPlayerActivity.k0 = bl;
        return bl;
    }

    private y X1(int n8) {
        Uri[] uriArray;
        n8 = this.z2(n8);
        if (this.e0 && !this.f0[n8] && (uriArray = this.b0)[n8] == null) {
            uriArray[n8] = this.t2(this.a0[n8]);
            this.f0[n8] = true;
        }
        return this.Y1(this.a0[n8], this.b0[n8], null);
    }

    private boolean X2() {
        return this.A1;
    }

    private void X3(String string) {
        Toast.makeText((Context)this, (CharSequence)string, (int)1).show();
    }

    static /* synthetic */ int Y0(VideoPlayerActivity videoPlayerActivity, int n8) {
        videoPlayerActivity.l0 = n8;
        return n8;
    }

    private y Y1(Uri object, Uri object2, String object3) {
        object3 = new y.c();
        ((y.c)object3).f((Uri)object);
        if (object2 == null) {
            return ((y.c)object3).a();
        }
        object = ax.c3.A.n(ax.c3.d0.f(object2.getPath()));
        object2 = new y.k.a((Uri)object2);
        ((y.k.a)object2).l(1);
        ((y.k.a)object2).k((String)object);
        ((y.c)object3).d(Collections.singletonList(((y.k.a)object2).i()));
        return ((y.c)object3).a();
    }

    private boolean Y2() {
        if (this.y2() == null) {
            return false;
        }
        String string = this.y2().getScheme();
        return "file".equals(string) || "content".equals(string);
        {
        }
    }

    private void Y3() {
        if (this.getSupportFragmentManager().Q0()) {
            return;
        }
        Object object = this.W;
        if (object != null && object.n()) {
            this.I1 = true;
            this.W.f();
        } else {
            this.I1 = false;
        }
        object = ax.a3.W.i3();
        ax.u3.B.d0(this.getSupportFragmentManager(), (androidx.fragment.app.e)object, "settings", true);
    }

    static /* synthetic */ int Z0(VideoPlayerActivity videoPlayerActivity) {
        int n8 = videoPlayerActivity.l0;
        videoPlayerActivity.l0 = n8 + 1;
        return n8;
    }

    private float Z1(float f8, int n8, float f9, float f10) {
        float f11 = f9 - f10;
        float f12 = f11 + (f9 = (f10 = (float)n8) / 2.0f);
        if (f12 - (f8 /= 2.0f) > 0.0f) {
            return f8 - f9;
        }
        if (f12 + f8 < f10) {
            return f9 - f8;
        }
        return f11;
    }

    private boolean Z2() {
        return this.H0;
    }

    private float a2(float f8, float f9, float f10, float f11) {
        return f8 - (f10 - f11 * (f10 - (f8 + f9))) + f9;
    }

    private boolean a3() {
        return ax.u3.z.u((Context)this);
    }

    private void a4() {
        if (this.b.I()) {
            this.b.G();
            return;
        }
        this.b.V();
        this.c2();
    }

    static /* synthetic */ int b1(VideoPlayerActivity videoPlayerActivity, int n8) {
        videoPlayerActivity.m0 = n8;
        return n8;
    }

    private void b2() {
        if (this.X2()) {
            this.z1 = true;
            this.B1.removeCallbacks(this.K1);
        }
    }

    private boolean b3() {
        int n8 = this.I0;
        return n8 == 2 || n8 == 18 || n8 == 34;
        {
        }
    }

    private void b4() {
        this.F3(this.n0 ^ true);
    }

    static /* synthetic */ int c1(VideoPlayerActivity videoPlayerActivity) {
        int n8 = videoPlayerActivity.m0;
        videoPlayerActivity.m0 = n8 + 1;
        return n8;
    }

    private void c2() {
        if (!this.b.getControllerAutoShow() && !this.U2()) {
            this.b.setControllerAutoShow(true);
        }
    }

    private boolean c3() {
        return this.z0;
    }

    private void c4() {
        ExoPlayer exoPlayer = this.W;
        if (exoPlayer != null) {
            boolean bl = exoPlayer.v();
            this.W.S(bl ^ true);
            if (!bl) {
                this.b.G();
            }
        }
    }

    private void d2() {
        this.E1.n((View)this.v);
    }

    private boolean d3() {
        Object object = this.W;
        if (object == null) {
            return false;
        }
        return ((I)(object = object.M())).a() != -1 && ((I)object).b() != -1 && this.b.getHeight() != 0;
    }

    private void d4() {
        ExoPlayer exoPlayer = this.W;
        if (exoPlayer == null) {
            return;
        }
        exoPlayer.j(ax.S0.H.a(exoPlayer.o(), 3));
        this.r4();
    }

    private void e2() {
        View view = this.N;
        if (view != null) {
            ax.S2.b.a(view, (Context)this);
        }
        this.N = null;
        this.P = false;
        this.J0 = false;
        this.K.removeAllViews();
    }

    private boolean e3() {
        return this.P;
    }

    private void e4() {
        String string;
        Drawable drawable;
        int n8 = this.b.getResizeMode();
        int n9 = 3;
        if (n8 != 0) {
            if (n8 != 3) {
                n9 = 0;
                if (n8 != 4) {
                    ax.u3.b.f();
                    drawable = this.Q0;
                    string = this.a1;
                } else {
                    drawable = this.Q0;
                    string = this.a1;
                }
            } else {
                drawable = this.S0;
                string = this.c1;
                n9 = 4;
            }
        } else {
            drawable = this.R0;
            string = this.b1;
        }
        this.b.setResizeMode(n9);
        this.r.setImageDrawable(drawable);
        this.r.setContentDescription((CharSequence)string);
        this.A.removeCallbacks(this.M1);
        this.A.setText((CharSequence)string);
        this.A.postDelayed(this.M1, 1000L);
    }

    private void f2() {
        this.F.setScaleX(1.0f);
        this.F.setScaleY(1.0f);
        this.F.setTranslationX(0.0f);
        this.F.setTranslationY(0.0f);
    }

    private boolean f3() {
        return this.y1 >= 0;
    }

    private void f4() {
        this.d0 ^= true;
        int n8 = this.w2();
        if (this.d0) {
            for (int i8 = 0; i8 < this.c0.size(); ++i8) {
                if (n8 != this.c0.get(i8)) continue;
                this.H3(i8);
            }
        } else {
            this.H3(this.c0.get(n8));
        }
        ax.t3.l.l((Context)this, this.d0);
        this.s4();
    }

    private void g2() {
        this.m1 = true;
        this.n1 = -1;
        this.o1 = -9223372036854775807L;
    }

    private boolean g3() {
        return this.C0;
    }

    private void g4() {
        if (this.l0 == 1) {
            U1 = true;
            if (this.k0) {
                T1 = true;
                this.E1.l();
                return;
            }
            T1 = false;
            this.E1.k();
            return;
        }
        this.E1.o((View)this.v, this.Q1);
    }

    static /* synthetic */ boolean h1(VideoPlayerActivity videoPlayerActivity, boolean bl) {
        videoPlayerActivity.j0 = bl;
        return bl;
    }

    private void h2() {
        this.K0 = true;
        this.L0 = System.currentTimeMillis();
        this.e2();
    }

    private boolean h3() {
        return this.A0;
    }

    private void h4() {
        if (!this.e.n0()) {
            this.F2();
            return;
        }
        if (this.W2()) {
            this.Q3();
            return;
        }
        if (this.r1) {
            this.F2();
            return;
        }
        this.Q3();
    }

    private Uri i2(Uri uri) {
        block7: {
            block5: {
                block6: {
                    if (MyFileProvider.C(uri)) break block5;
                    if (!MyFileProvider.B(uri)) break block6;
                    Object object = MyFileProvider.e(uri);
                    String string = ((k)object).e();
                    File file = new File(string);
                    if ((object = ax.c3.d0.v(((k)object).d(), string, Boolean.FALSE)) == null || !ax.c3.d0.H("/Android", (String)object) || !com.alphainventor.filemanager.file.x.O0(file).d1()) {
                        return Uri.fromFile((File)file);
                    }
                    break block5;
                }
                if (!MyFileProvider.A(uri)) break block7;
            }
            return uri;
        }
        MyFileProvider.E(uri);
        return uri;
    }

    private void i3(boolean bl) {
        if (ax.X2.Q.u0()) {
            if (bl) {
                this.setRequestedOrientation(14);
                return;
            }
            this.setRequestedOrientation(-1);
            return;
        }
        if (bl) {
            this.setRequestedOrientation(ax.u3.z.l(this));
            return;
        }
        this.setRequestedOrientation(-1);
    }

    private void i4() {
        int n8;
        if (this.W == null) {
            return;
        }
        if (this.N2() && System.currentTimeMillis() - this.L0 > 30000L) {
            this.K0 = false;
        }
        boolean bl = this.b3();
        int n9 = 1;
        if (bl) {
            n8 = n9;
            if (this.W.v()) {
                n8 = this.W.i() == 4 ? n9 : 0;
            }
        } else {
            n8 = 1 ^ this.W.v();
        }
        if (n8 != 0 && !this.N2() && !this.U2() && this.O2() && !this.a3()) {
            this.J.setVisibility(0);
            if (!this.D2() || this.P2()) {
                this.A3();
            }
            if (this.e3()) {
                View view;
                if (this.M0 == 0L) {
                    this.M0 = System.currentTimeMillis();
                }
                if (this.O && (view = this.N.findViewById(2131362499)) != null) {
                    n9 = ax.u3.B.f((Context)this, this.getResources().getDisplayMetrics().heightPixels);
                    n8 = 150;
                    if (n9 <= 360) {
                        n8 = n9 = 150 - (360 - n9);
                        if (n9 < 60) {
                            n8 = 60;
                        }
                    }
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.height = ax.u3.B.e((Context)this, n8);
                    view.setLayoutParams(layoutParams);
                }
                this.M.setVisibility(8);
                this.L.setVisibility(0);
                return;
            }
            this.M.setVisibility(0);
            this.L.setVisibility(8);
            return;
        }
        this.J.setVisibility(8);
    }

    private void j3(boolean bl) {
        this.r1 = bl;
        if (bl) {
            this.b.setControllerShowTimeoutMs(3000);
        } else {
            this.G3();
        }
        this.i3(this.r1);
        this.n4();
        this.q4();
        this.k4();
    }

    private void j4() {
        if (this.m0 > 1) {
            this.u.setVisibility(0);
            return;
        }
        this.u.setVisibility(8);
    }

    private String k2() {
        if (this.y2() == null) {
            return "";
        }
        return ax.c3.v.h(this.y2().getPath());
    }

    private void k3() {
        this.H0 = false;
        this.E.setVisibility(4);
        this.L3(this.p0, false);
    }

    private void k4() {
        boolean bl = this.r1 && !this.W2();
        this.J1.j(bl);
    }

    static /* synthetic */ int l1(VideoPlayerActivity videoPlayerActivity, int n8) {
        videoPlayerActivity.o0 = n8;
        return n8;
    }

    private void l2() {
        MySpinner mySpinner = this.y;
        if (mySpinner == null) {
            return;
        }
        mySpinner.c();
    }

    private void l3() {
        this.M2(2.0f);
    }

    private void l4() {
    }

    static /* synthetic */ y m0(VideoPlayerActivity videoPlayerActivity, y y8) {
        videoPlayerActivity.Y = y8;
        return y8;
    }

    private void m2(boolean bl) {
        long l8;
        long l9;
        Object object;
        block10: {
            block9: {
                object = this.W;
                if (object == null) break block9;
                long l10 = object.s0();
                l9 = (long)ax.t3.l.c((Context)this) * 1000L;
                long l11 = bl ? l10 + l9 : l10 - l9;
                long l12 = l8 = this.W.g0();
                if (l8 == -9223372036854775807L) {
                    l12 = 0L;
                }
                if (l11 < 0L) {
                    l8 = 0L;
                } else {
                    l8 = l11;
                    if (l11 > l12) {
                        l8 = l12;
                    }
                }
                if (l10 != l8) break block10;
            }
            return;
        }
        this.W.c(ax.Y0.Z.c);
        this.W.t(l8);
        this.W.c(ax.Y0.Z.g);
        this.A.removeCallbacks(this.M1);
        if (bl) {
            object = this.A;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("+");
            stringBuilder.append(ax.u3.B.n(l9));
            object.setText((CharSequence)stringBuilder.toString());
        } else {
            TextView textView = this.A;
            object = new StringBuilder();
            ((StringBuilder)object).append("-");
            ((StringBuilder)object).append(ax.u3.B.n(l9));
            textView.setText((CharSequence)((StringBuilder)object).toString());
        }
        this.A.postDelayed(this.M1, 1000L);
    }

    private void m3() {
        this.M2(0.5f);
    }

    private void m4() {
    }

    private void n2(long l8, boolean bl, boolean bl2) {
        if (bl2) {
            this.A.setText((CharSequence)ax.u3.B.n(l8));
        }
        this.u0 = l8;
        bl2 = this.v0 != bl;
        this.v0 = bl;
        l8 = System.currentTimeMillis();
        if (!bl2 && l8 - this.t0 < this.w1) {
            return;
        }
        this.p4(bl2);
    }

    private void n3() {
        if (this.W != null && this.w2() < this.B2() - 1) {
            this.s3();
        }
    }

    private void n4() {
        if (this.W2()) {
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
            this.t.setImageResource(2131231112);
            this.t.setContentDescription((CharSequence)this.getString(2131952249));
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
            this.t.setImageResource(2131231135);
            this.t.setContentDescription((CharSequence)this.getString(2131952263));
            this.s.setVisibility(0);
        }
        this.h4();
    }

    private void o2() {
        ExoPlayer exoPlayer;
        this.s0 = false;
        this.A.setText((CharSequence)"");
        if (!this.q0) {
            this.b.setUseController(true);
        }
        if (this.r0 && (exoPlayer = this.W) != null) {
            exoPlayer.S(true);
        }
        this.p4(false);
        this.t0 = 0L;
        this.u0 = 0L;
        this.n4();
    }

    private void o3() {
        if (this.W == null) {
            return;
        }
        if (this.w2() < this.B2() - 1) {
            this.s3();
            return;
        }
        this.q3();
    }

    private void o4() {
        int n8 = this.B2();
        boolean bl = false;
        boolean bl2 = n8 > 0;
        if (this.w2() < n8 - 1) {
            bl = true;
        }
        this.E3(bl2, this.o);
        this.E3(bl, this.n);
    }

    private void p2() {
        if (this.W != null) {
            boolean bl;
            this.s0 = true;
            this.q0 = bl = this.b.I();
            if (!bl) {
                this.b.setUseController(false);
                this.b.setControllerAutoShow(false);
            }
            this.r0 = bl = this.W.n();
            if (bl) {
                this.W.S(false);
            }
        }
    }

    private boolean p3(float f8, float f9, float f10) {
        block8: {
            block7: {
                int n8;
                block6: {
                    if (!this.d3()) {
                        this.f2();
                        return false;
                    }
                    I i8 = this.W.M();
                    float f11 = this.F.getTranslationX();
                    float f12 = this.F.getTranslationY();
                    int n9 = (int)((float)i8.a() * f8);
                    if (n9 > (n8 = this.b.getHeight()) && f12 != (f10 = this.Z1(n9, n8, this.F.getTranslationY(), f10))) {
                        this.F.setTranslationY(f10);
                        n8 = 1;
                    } else {
                        n8 = 0;
                    }
                    n9 = (int)((float)i8.b() * f8);
                    int n10 = this.b.getWidth();
                    if (n9 <= n10 || f11 == (f8 = this.Z1(n9, n10, this.F.getTranslationX(), f9))) break block6;
                    this.F.setTranslationX(f8);
                    break block7;
                }
                if (n8 == 0) break block8;
            }
            return true;
        }
        return false;
    }

    private void p4(boolean bl) {
        block6: {
            block5: {
                ExoPlayer exoPlayer = this.W;
                if (exoPlayer == null) break block5;
                long l8 = exoPlayer.s0();
                if ((bl || l8 >= this.u0 || !this.v0) && (bl || l8 <= this.u0 || this.v0)) break block6;
            }
            return;
        }
        if (this.v0) {
            this.W.c(ax.Y0.Z.e);
        } else {
            this.W.c(ax.Y0.Z.f);
        }
        this.W.t(this.u0);
        this.W.c(ax.Y0.Z.g);
        this.t0 = System.currentTimeMillis();
    }

    private View q2() {
        this.I.setTouchscreenBlocksFocus(false);
        View view = this.I.getChildAt(0);
        if (view instanceof p) {
            if (this.I.getNavigationContentDescription() != null && this.I.getNavigationContentDescription().equals(view.getContentDescription())) {
                view.setId(16908332);
                return view;
            }
            ax.u3.b.e("not work anymore");
            return view;
        }
        ax.u3.b.e("not work anymore");
        return view;
    }

    private void q3() {
        if (this.h3()) {
            this.B4();
        }
        this.H3(0);
        this.r3(this.w2(), true);
    }

    private void q4() {
        if (!this.e.n0()) {
            this.J3(true);
        } else if (this.W2()) {
            this.J3(false);
        } else if (this.r1) {
            this.J3(true);
        } else {
            this.J3(false);
        }
        this.h4();
    }

    static /* synthetic */ long r1(VideoPlayerActivity videoPlayerActivity, long l8) {
        videoPlayerActivity.u0 = l8;
        return l8;
    }

    private void r2() {
        this.B1.removeCallbacks(this.K1);
        this.b.setUseController(false);
        this.finish();
    }

    private void r3(int n8, boolean bl) {
        if (n8 >= 0 && n8 < this.B2()) {
            if (this.W == null) {
                return;
            }
            u u8 = this.H1;
            if (u8 != null && !u8.isCancelled() && ax.u3.q.n(this.H1)) {
                this.H1.e();
            }
            this.H1 = u8 = new u(this, n8, bl);
            u8.i(new Void[0]);
            return;
        }
        ax.u3.b.f();
    }

    private void r4() {
        ExoPlayer exoPlayer = this.W;
        if (exoPlayer == null) {
            this.k.setImageDrawable(this.T0);
            this.k.setContentDescription((CharSequence)this.d1);
            return;
        }
        int n8 = exoPlayer.o();
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    return;
                }
                this.k.setImageDrawable(this.V0);
                this.k.setContentDescription((CharSequence)this.f1);
                return;
            }
            this.k.setImageDrawable(this.U0);
            this.k.setContentDescription((CharSequence)this.e1);
            return;
        }
        this.k.setImageDrawable(this.T0);
        this.k.setContentDescription((CharSequence)this.d1);
    }

    private String s2(String stringArray, List<com.alphainventor.filemanager.file.n> object) {
        if (!ax.c3.d0.B((String)stringArray)) {
            object = ax.Ha.c.h().f().b("Invalid media path 3");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("path:");
            stringBuilder.append((String)stringArray);
            ((ax.Ha.b)object).g(stringBuilder.toString()).h();
            return null;
        }
        if (object == null) {
            return null;
        }
        String string = ax.c3.d0.l((String)stringArray);
        for (String string2 : ax.c3.A.o()) {
            Object object2 = new StringBuilder();
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append(".");
            ((StringBuilder)object2).append(string2);
            string2 = ((StringBuilder)object2).toString();
            object2 = object.iterator();
            while (object2.hasNext()) {
                com.alphainventor.filemanager.file.n n8 = (com.alphainventor.filemanager.file.n)object2.next();
                if (!string2.equals(n8.E())) continue;
                return n8.B();
            }
        }
        return null;
    }

    private void s3() {
        if (this.w2() >= this.B2()) {
            ax.u3.b.e("bad index");
            return;
        }
        if (this.h3()) {
            this.B4();
        }
        this.H3(this.w2() + 1);
        this.r3(this.w2(), true);
    }

    private void s4() {
        if (this.d0) {
            this.x.setImageDrawable(this.Z0);
            this.x.setContentDescription((CharSequence)this.i1);
            return;
        }
        this.x.setImageDrawable(this.Y0);
        this.x.setContentDescription((CharSequence)this.j1);
    }

    private Uri t2(Uri object) {
        Object object2;
        Object object3 = object.toString();
        if ("file".equals(object.getScheme())) {
            return this.v2(object.getPath());
        }
        boolean bl = ((String)object3).startsWith("content://media");
        Object object4 = null;
        if (bl) {
            if ((object = ax.c3.N.a((Context)this, (Uri)object)) != null) {
                return this.v2((String)object);
            }
            return null;
        }
        if ("content".equals(object.getScheme())) {
            object3 = this.u2((Context)this, (Uri)object);
            object = S1;
            object4 = new StringBuilder();
            ((StringBuilder)object4).append("subtitle uri : ");
            ((StringBuilder)object4).append(object3);
            ((Logger)object).fine(((StringBuilder)object4).toString());
            return object3;
        }
        object3 = object4;
        if (com.alphainventor.filemanager.service.b.k((Context)this, (Uri)object)) {
            Object object5 = ax.o3.c.z(object.getPath());
            object2 = ax.c3.d0.r(object.getPath());
            Object object6 = ax.o3.c.z((String)object2);
            object3 = object4;
            if (object6 != null) {
                object3 = object4;
                if (object5 != null) {
                    object3 = object4;
                    if (ax.c3.x.e(((k)object6).d()).a()) {
                        object6 = ax.Z2.b.k().h(((k)object6).toString());
                        object3 = object4;
                        if (object6 != null) {
                            object5 = this.s2(((k)object5).e(), (List<com.alphainventor.filemanager.file.n>)object6);
                            object3 = object4;
                            if (object5 != null) {
                                object3 = object.buildUpon();
                                object3.path(ax.c3.d0.Q((String)object2, (String)object5));
                                object3 = object3.build();
                                object2 = S1;
                                object4 = new StringBuilder();
                                ((StringBuilder)object4).append("subtitle uri : ");
                                ((StringBuilder)object4).append(object3);
                                ((Logger)object2).fine(((StringBuilder)object4).toString());
                            }
                        }
                    }
                }
            }
        }
        object4 = S1;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("media uri : ");
        ((StringBuilder)object2).append(object);
        ((Logger)object4).fine(((StringBuilder)object2).toString());
        return object3;
    }

    private void t3() {
        if (this.w2() <= 0) {
            return;
        }
        if (this.h3()) {
            this.B4();
        }
        this.H3(this.w2() - 1);
        this.r3(this.w2(), true);
    }

    private void t4() {
        ExoPlayer exoPlayer = this.W;
        if (exoPlayer != null) {
            this.m1 = exoPlayer.v();
            this.n1 = this.W.P();
            this.o1 = Math.max(0L, this.W.V());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Uri u2(Context object, Uri object2) {
        String string = object2.getPath();
        if (!ax.c3.d0.B(string)) {
            object2 = ax.Ha.c.h().f().b("Invalid media path 2");
            object = new StringBuilder();
            ((StringBuilder)object).append("path:");
            ((StringBuilder)object).append(string);
            ((ax.Ha.b)object2).g(((StringBuilder)object).toString()).h();
            return null;
        }
        string = ax.c3.d0.l(string);
        ContentResolver contentResolver = object.getContentResolver();
        object = ax.c3.A.o();
        int n8 = ((Object)object).length;
        int n9 = 0;
        while (n9 < n8) {
            Object string2 = object[n9];
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append(".");
            stringBuilder.append((String)string2);
            String string3 = stringBuilder.toString();
            Uri uri = object2.buildUpon().path(string3).build();
            try {
                stringBuilder = contentResolver.openFileDescriptor(uri, "r");
                try {
                    stringBuilder.close();
                    return uri;
                }
                catch (IOException iOException) {
                    return uri;
                }
            }
            catch (Exception exception) {
                ++n9;
            }
        }
        return null;
    }

    private void u3() {
        block5: {
            block4: {
                ExoPlayer exoPlayer = this.W;
                if (exoPlayer == null) break block4;
                int n8 = exoPlayer.i();
                long l8 = this.W.s0();
                if (this.w2() == 0 || n8 != 4 && l8 > 3000L) break block5;
                if (this.w2() > 0) {
                    this.t3();
                }
            }
            return;
        }
        this.W.t(0L);
    }

    static /* synthetic */ boolean v1(VideoPlayerActivity videoPlayerActivity, boolean bl) {
        videoPlayerActivity.z0 = bl;
        return bl;
    }

    private Uri v2(String stringArray) {
        if (!ax.c3.d0.B((String)stringArray)) {
            ax.Ha.b b8 = ax.Ha.c.h().f().b("Invalid media path 1");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("path:");
            stringBuilder.append((String)stringArray);
            b8.g(stringBuilder.toString()).h();
            return null;
        }
        String string = ax.c3.d0.l((String)stringArray);
        for (String string2 : ax.c3.A.o()) {
            Comparable<StringBuilder> comparable = new StringBuilder();
            ((StringBuilder)comparable).append(string);
            ((StringBuilder)comparable).append(".");
            ((StringBuilder)comparable).append(string2);
            comparable = new File(((StringBuilder)comparable).toString());
            if (!((File)comparable).exists()) continue;
            return Uri.fromFile(comparable);
        }
        return null;
    }

    private void v4() {
        this.E3(this.j0, (View)this.v);
        if (this.j0) {
            if (this.k0) {
                this.v.setImageDrawable(this.X0);
                this.v.setContentDescription((CharSequence)this.g1);
                this.v.setVisibility(0);
                this.b.getSubtitleView().setVisibility(0);
                return;
            }
            this.v.setImageDrawable(this.W0);
            this.v.setContentDescription((CharSequence)this.h1);
            this.v.setVisibility(0);
            this.b.getSubtitleView().setVisibility(8);
            return;
        }
        this.v.setImageDrawable(this.W0);
        this.v.setContentDescription((CharSequence)this.h1);
        this.v.setVisibility(8);
        this.b.getSubtitleView().setVisibility(8);
    }

    private int w2() {
        int n8 = this.i0;
        if (n8 < 0) {
            ax.u3.b.f();
            return 0;
        }
        if (n8 >= this.B2()) {
            ax.u3.b.f();
            return this.B2() - 1;
        }
        return this.i0;
    }

    private void w3() {
    }

    private void w4() {
        Uri uri = this.x2();
        if (uri == null) {
            this.P3("");
            return;
        }
        if (!("file".equals(uri.getScheme()) || ax.c3.B.L(uri.getScheme()) || MyFileProvider.D(uri))) {
            if ("content".equals(uri.getScheme())) {
                this.P3(ax.c3.B.w((Context)this, (Uri)uri).a);
            }
            return;
        }
        if (uri.getPath() != null) {
            this.P3(ax.c3.d0.h(uri.getPath()));
            return;
        }
        this.P3("");
    }

    private Uri x2() {
        Uri[] uriArray;
        if (this.Z == null) {
            ax.u3.b.f();
            return null;
        }
        int n8 = this.z2(this.w2());
        if (n8 >= 0 && n8 < (uriArray = this.Z).length) {
            return uriArray[n8];
        }
        ax.u3.b.e("what case is this");
        return null;
    }

    private void x3() {
        ax.b1.O o8 = this.X;
        if (o8 != null) {
            o8.d();
            this.X = null;
        }
    }

    private void x4() {
        n n8 = this.N0;
        if (n8 != null) {
            this.O0 = n8.K();
        }
    }

    private Uri y2() {
        if (this.a0 == null) {
            ax.u3.b.f();
            return null;
        }
        int n8 = this.z2(this.w2());
        return this.a0[n8];
    }

    private void y3() {
        if (this.W != null) {
            this.x4();
            this.t4();
            this.W.d();
            this.W = null;
            this.Y = null;
            this.N0 = null;
        }
        if (ax.X2.Q.g1()) {
            this.x3();
        }
    }

    private void y4(Intent intent) {
        this.B1.removeCallbacks(this.K1);
        this.y1 = intent.getIntExtra("slide_interval", -1);
        this.A1 = intent.getBooleanExtra("finish_after_play", false);
        this.z1 = false;
    }

    private int z2(int n8) {
        int n9 = n8;
        if (this.d0) {
            n9 = this.c0.get(n8);
        }
        return n9;
    }

    private void z4() {
        this.C0 = false;
        this.B.setVisibility(8);
    }

    public String C2() {
        if (this.p1 == null) {
            this.p1 = ax.S0.d0.w0((Context)this, "CxFileExplorer");
        }
        return this.p1;
    }

    public void J3(boolean bl) {
        int n8 = bl ? 3846 : 1792;
        this.q1 = n8;
        this.a.setSystemUiVisibility(n8);
    }

    @Override
    public void K(int n8) {
        Snackbar snackbar;
        this.q4();
        if (n8 == 8) {
            this.l2();
            this.E1.d();
        }
        if (n8 == 0 && (snackbar = this.G) != null) {
            snackbar.x();
            this.G = null;
        }
    }

    public void Z3() {
        this.v3();
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        block14: {
            int n8;
            int n9;
            block17: {
                View view;
                block21: {
                    block22: {
                        block20: {
                            block18: {
                                block19: {
                                    block15: {
                                        block16: {
                                            n9 = keyEvent.getKeyCode();
                                            n8 = keyEvent.getAction();
                                            view = this.getCurrentFocus();
                                            boolean bl = n8 == 0 || n8 == 1 && this.F1 == 0;
                                            if (n8 == 0) {
                                                this.F1 = n9;
                                            } else if (n8 == 1) {
                                                this.F1 = 0;
                                            }
                                            if (this.G1 == n9 && n8 == 1) {
                                                this.G1 = 0;
                                                return true;
                                            }
                                            if (!bl) break block14;
                                            if (n9 != 20) break block15;
                                            if (view != this.b) break block16;
                                            if (!this.e.n0()) {
                                                this.e.v0();
                                            }
                                            break block17;
                                        }
                                        if (!ax.u3.z.s(this.I, view) || n8 != 0) break block14;
                                        if (this.e.n0()) {
                                            this.a4();
                                        }
                                        break block17;
                                    }
                                    if (n9 != 19) break block18;
                                    if (view != this.b) break block19;
                                    if (!this.e.n0()) {
                                        keyEvent = this.q2();
                                        this.e.v0();
                                        keyEvent.requestFocus();
                                    }
                                    break block17;
                                }
                                if (!ax.u3.z.s(this.f, view) || n8 != 0) break block14;
                                if (this.e.n0()) {
                                    this.a4();
                                }
                                break block17;
                            }
                            if (!VideoPlayerActivity.T2(n9)) break block20;
                            if (view != this.b) break block14;
                            this.c4();
                            break block17;
                        }
                        if (n9 == 85 || n9 == 62) break block21;
                        if (n9 != 126) break block22;
                        if (view != this.b || !ax.S0.d0.v1(this.W)) break block14;
                        this.b.setControllerAutoShow(false);
                        this.U3(true);
                        ax.S0.d0.z0(this.W);
                        this.b.setControllerAutoShow(true);
                        break block17;
                    }
                    if (n9 != 127 || view != this.b || ax.S0.d0.v1(this.W)) break block14;
                    this.b.setControllerAutoShow(false);
                    this.U3(false);
                    ax.S0.d0.y0(this.W);
                    this.b.setControllerAutoShow(true);
                    break block17;
                }
                PlayerView playerView = this.b;
                if (view != playerView) break block14;
                playerView.setControllerAutoShow(false);
                this.U3(ax.S0.d0.v1(this.W));
                ax.S0.d0.A0(this.W);
                this.b.setControllerAutoShow(true);
            }
            if (n8 == 0) {
                this.G1 = n9;
            }
            return true;
        }
        return this.b.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
        {
        }
    }

    public void finish() {
        if (this.f3()) {
            if (this.z1) {
                this.setResult(0);
            } else {
                this.setResult(-1);
            }
        } else {
            this.I3();
        }
        super.finish();
        if (this.X2() && !this.z1) {
            if (this.f3()) {
                this.overridePendingTransition(2130772017, 2130772018);
                return;
            }
            this.overridePendingTransition(2130771998, 2130771999);
        }
    }

    @Override
    public ax.P0.H h() {
        return this.W;
    }

    n.e j2() {
        n.f f8 = new n.f((Context)this);
        f8.c0(this.Q);
        f8.a0(this.Q);
        f8.f0(true);
        return f8.V();
    }

    @Override
    public androidx.media3.ui.d k() {
        return this.e;
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.i4();
    }

    @Override
    public void onCreate(Bundle bundle) {
        Object object;
        ax.Q2.b.f((Context)this, true);
        super.onCreate(bundle);
        if (!ax.X2.Q.N0()) {
            ax.Ha.c.h().f().d("VIDEO PLAYER NOT SUPPORTED").h();
            Toast.makeText((Context)this, (int)2131951927, (int)1).show();
            this.finish();
            return;
        }
        this.y4(this.getIntent());
        this.overridePendingTransition(0x10A0000, 0x10A0001);
        try {
            object = this.W1();
            this.U = object;
        }
        catch (SecurityException securityException) {
            ax.Ha.c.h().f().d("VIDEO PLAYER BUILD SOURCE").h();
            Toast.makeText((Context)this, (int)2131951927, (int)1).show();
            this.finish();
            return;
        }
        this.V = new Z.b((g.a)object);
        this.setContentView(2131558440);
        this.a = this.findViewById(2131362746);
        this.T = (TextView)this.findViewById(2131362099);
        this.I = object = (Toolbar)this.findViewById(2131362981);
        this.setSupportActionBar((Toolbar)object);
        object = this.getResources().getConfiguration().locale;
        this.Q = object != null ? ((Locale)object).toLanguageTag() : Locale.getDefault().toLanguageTag();
        this.E1 = new g((Context)this, this);
        object = (PlayerView)((Object)this.findViewById(2131362701));
        this.b = object;
        if (((PlayerView)((Object)object)).getVideoSurfaceView() instanceof SurfaceView) {
            ((SurfaceView)this.b.getVideoSurfaceView()).getHolder().addCallback(new SurfaceHolder.Callback(this){
                final VideoPlayerActivity a;
                {
                    this.a = videoPlayerActivity;
                }

                public void surfaceChanged(SurfaceHolder surfaceHolder, int n8, int n9, int n10) {
                }

                public void surfaceCreated(SurfaceHolder surfaceHolder) {
                    VideoPlayerActivity.H(this.a, true);
                    if (this.a.d != null) {
                        this.a.d.run();
                        VideoPlayerActivity.M(this.a, null);
                    }
                }

                public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    VideoPlayerActivity.H(this.a, false);
                }
            });
        }
        this.b.setControllerVisibilityListener(this);
        this.b.setErrorMessageProvider(new v(this));
        this.b.requestFocus();
        this.H = this.findViewById(2131362712);
        this.F = (AspectRatioFrameLayout)((Object)this.findViewById(2131362208));
        this.e = (androidx.media3.ui.d)((Object)this.findViewById(2131362209));
        this.G3();
        this.b.setControllerAnimationEnabled(false);
        this.e.setFitsSystemWindows(true);
        this.A = (TextView)this.findViewById(2131362158);
        this.B = this.findViewById(2131362156);
        this.C = (ImageView)this.findViewById(2131363030);
        this.D = (ProgressBar)this.findViewById(2131363029);
        this.E = (TextView)this.findViewById(2131362026);
        this.f = (ViewGroup)this.findViewById(2131361990);
        this.g = this.findViewById(2131362064);
        this.h = this.findViewById(2131362065);
        this.i = this.findViewById(2131362066);
        this.j = this.findViewById(2131362068);
        object = this.findViewById(2131362080);
        this.m = object;
        object.setOnClickListener(this.P1);
        object = this.findViewById(2131362082);
        this.l = object;
        object.setOnClickListener(this.P1);
        object = (ImageButton)this.findViewById(2131362085);
        this.k = object;
        object.setOnClickListener(this.P1);
        object = this.findViewById(2131362083);
        this.n = object;
        object.setOnClickListener(this.P1);
        object = this.findViewById(2131362084);
        this.o = object;
        object.setOnClickListener(this.P1);
        object = this.findViewById(2131362081);
        this.p = object;
        object.setOnClickListener(this.P1);
        object = this.findViewById(2131362092);
        this.q = object;
        object.setOnClickListener(this.P1);
        object = this.findViewById(2131362087);
        this.s = object;
        object.setOnClickListener(this.P1);
        object = (ImageButton)this.findViewById(2131362086);
        this.r = object;
        object.setOnClickListener(this.P1);
        object = (ImageView)this.findViewById(2131362091);
        this.t = object;
        object.setOnClickListener(this.P1);
        object = (MySpinner)((Object)this.findViewById(2131362089));
        this.y = object;
        object.setPromptId(2131952502);
        object = new d((Context)this);
        this.y.setAdapter((SpinnerAdapter)object);
        this.y.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            final d a;
            final VideoPlayerActivity b;
            {
                this.b = videoPlayerActivity;
                this.a = d8;
            }

            public void onItemSelected(AdapterView<?> object, View view, int n8, long l8) {
                object = (d.a)this.a.getItem(n8);
                if (object != null) {
                    this.b.L3(object.b, true);
                }
            }

            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        object = (ImageButton)this.findViewById(2131362079);
        this.u = object;
        object.setOnClickListener(this.P1);
        object = (ImageButton)this.findViewById(2131362090);
        this.v = object;
        object.setOnClickListener(this.P1);
        object = (ImageButton)this.findViewById(2131362088);
        this.x = object;
        object.setOnClickListener(this.P1);
        this.w = (ImageButton)this.findViewById(2131362230);
        this.z = this.findViewById(2131362185);
        this.J = (ViewGroup)this.findViewById(2131361874);
        this.K = (ViewGroup)this.findViewById(2131361873);
        this.L = this.findViewById(2131361872);
        this.M = this.findViewById(2131361875);
        this.L.setOnClickListener((View.OnClickListener)new ax.g3.c(this){
            final VideoPlayerActivity c;
            {
                this.c = videoPlayerActivity;
            }

            @Override
            public void a(View view) {
                this.c.h2();
                this.c.i4();
            }
        });
        object = (androidx.media3.ui.b)this.b.findViewById(2131362234);
        this.S = object;
        ((androidx.media3.ui.b)object).a(this.L1);
        this.a.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener(this){
            final VideoPlayerActivity a;
            {
                this.a = videoPlayerActivity;
            }

            public void onSystemUiVisibilityChange(int n8) {
                if (n8 == 0 && this.a.q1 == 3846) {
                    this.a.J3(false);
                }
            }
        });
        this.w0 = ax.u3.B.e((Context)this, 30);
        this.x0 = ax.u3.B.e((Context)this, 35);
        this.I0 = ax.t3.a.b();
        this.J2();
        this.G2();
        if (bundle != null) {
            object = bundle.getBundle("track_selector_parameters");
            if (object != null) {
                this.O0 = n.e.Q((Bundle)object);
            }
            if (this.O0 == null) {
                this.O0 = this.j2();
            }
            this.m1 = bundle.getBoolean("auto_play");
            this.n1 = bundle.getInt("window", -1);
            this.o1 = bundle.getLong("position", -1L);
            this.p0 = bundle.getFloat("speed", 1.0f);
        } else {
            this.O0 = this.j2();
            this.g2();
        }
        this.getOnBackPressedDispatcher().h(this, this.J1);
        this.C1 = ax.u3.B.e((Context)this, 40);
        this.D1 = ax.u3.B.e((Context)this, 52);
        this.getSupportFragmentManager().m1("dialog_dismiss_request", this, new ax.A0.l(this){
            final VideoPlayerActivity a;
            {
                this.a = videoPlayerActivity;
            }

            @Override
            public void a(String object, Bundle bundle) {
                if (bundle.getBoolean("result")) {
                    object = this.a;
                    if (((VideoPlayerActivity)object).I1 && ((VideoPlayerActivity)object).W != null && !this.a.W.n()) {
                        this.a.W.S(true);
                    }
                    this.a.G3();
                }
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(2131689510, menu);
        return true;
    }

    @Override
    public void onDestroy() {
        this.w3();
        if (this.s1 && this.t1 != null) {
            com.alphainventor.filemanager.service.b.f((Context)this).l(false, this.t1);
        }
        if (this.N != null) {
            this.e2();
        }
        super.onDestroy();
    }

    @Override
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.y3();
        this.w3();
        this.g2();
        this.setIntent(intent);
        this.y4(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int n8 = menuItem.getItemId();
        if (n8 != 16908332) {
            if (n8 != 2131362544) {
                if (n8 != 2131362549) {
                    return false;
                }
                this.b4();
                return true;
            }
            this.Y3();
            return true;
        }
        this.finish();
        return true;
    }

    @Override
    public void onPause() {
        PlayerView playerView;
        super.onPause();
        if (ax.S0.d0.a <= 23) {
            playerView = this.b;
            if (playerView != null) {
                playerView.P();
            }
            this.y3();
        }
        if ((playerView = this.N) != null && !this.O) {
            ax.S2.b.c((Object)playerView, (Context)this);
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItem = menu.findItem(2131362549);
        if (menuItem != null) {
            menuItem.setVisible(false);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onRequestPermissionsResult(int n8, String[] stringArray, int[] nArray) {
        super.onRequestPermissionsResult(n8, stringArray, nArray);
        if (nArray.length == 0) {
            return;
        }
        if (nArray[0] == 0) {
            this.L2();
            return;
        }
        this.W3(2131951929);
        this.finish();
    }

    @Override
    public void onResume() {
        PlayerView playerView;
        super.onResume();
        if (ax.S0.d0.a <= 23 || this.W == null) {
            this.L2();
            playerView = this.b;
            if (playerView != null) {
                playerView.Q();
            }
        }
        if ((playerView = this.N) != null && !this.O) {
            ax.S2.b.l((Object)playerView, (Context)this);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.x4();
        this.t4();
        n.e e8 = this.O0;
        if (e8 != null) {
            bundle.putBundle("track_selector_parameters", e8.J());
        }
        bundle.putBoolean("auto_play", this.m1);
        bundle.putInt("window", this.n1);
        bundle.putLong("position", this.o1);
        bundle.putFloat("speed", this.p0);
    }

    @Override
    public void onStart() {
        super.onStart();
        if (ax.S0.d0.a > 23) {
            this.L2();
            PlayerView playerView = this.b;
            if (playerView != null) {
                playerView.Q();
            }
        }
        if (ax.X2.Q.N1()) {
            ax.X2.v.s(this.getWindow(), -1157627904);
            ax.X2.v.r(this.getWindow(), -1157627904);
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (ax.S0.d0.a > 23) {
            PlayerView playerView = this.b;
            if (playerView != null) {
                playerView.P();
            }
            this.y3();
        }
    }

    public void u4() {
        this.O3(ax.t3.l.h((Context)this), true);
    }

    public void v3() {
        PlayerView playerView = this.b;
        if (playerView != null) {
            playerView.P();
        }
        this.y3();
        this.L2();
    }

    public void z3() {
        this.r3(this.w2(), true);
    }

    static class t
    extends n {
        String m;

        public t(Context context, D.b b8, String string) {
            super(n.e.R(context), b8);
            this.m = string;
        }

        public static boolean g0(ax.P0.v v8, String string) {
            return ax.l1.n.I(v8, string, false) > 0;
        }

        @Override
        protected Pair<D.a, Integer> c0(G.a pair, int[][][] object, n.e e8, String string) throws s {
            pair = super.c0((G.a)pair, (int[][][])object, e8, string);
            if (!U1) {
                if (pair != null) {
                    object = ((D.a)pair.first).a;
                    boolean bl = TextUtils.isEmpty((CharSequence)this.m);
                    boolean bl2 = false;
                    boolean bl3 = bl2;
                    if (!bl) {
                        bl3 = bl2;
                        if (object != null) {
                            bl3 = false;
                            for (int i8 = 0; i8 < ((P)object).a; ++i8) {
                                if (!com.alphainventor.filemanager.viewer.VideoPlayerActivity$t.g0(((P)object).b(i8), this.m)) continue;
                                bl3 = true;
                            }
                        }
                    }
                    if (!bl3) {
                        return null;
                    }
                }
            } else if (T1) {
                return null;
            }
            return pair;
        }
    }

    class u
    extends q<Void, Integer, Boolean> {
        private int h;
        private boolean i;
        final VideoPlayerActivity j;

        u(VideoPlayerActivity videoPlayerActivity, int n8, boolean bl) {
            this.j = videoPlayerActivity;
            super(q.e.d0);
            this.h = n8;
            this.i = bl;
        }

        private void z() {
            if (this.j.isDestroyed() || this.j.W == null || this.j.Y == null) {
                return;
            }
            try {
                this.j.W.B(this.j.Y, this.i);
                this.j.W.k();
                return;
            }
            catch (IllegalStateException illegalStateException) {
                this.j.V3(2131951927);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("MediaItemIllegal :");
                stringBuilder.append(this.j.y2());
                stringBuilder.append(":");
                stringBuilder.append(illegalStateException.getMessage());
                ax.Q2.d.c("EXOPLAYER ILLEGALSTATE", new IllegalStateException(stringBuilder.toString(), illegalStateException));
                return;
            }
        }

        @Override
        protected void o() {
            this.j.H.setVisibility(8);
        }

        @Override
        protected void r() {
            this.j.H.setVisibility(0);
        }

        protected Boolean x(Void ... object) {
            try {
                object = this.j;
                VideoPlayerActivity.m0((VideoPlayerActivity)object, ((VideoPlayerActivity)object).X1(this.h));
                object = Boolean.TRUE;
                return object;
            }
            catch (IllegalStateException illegalStateException) {
                return Boolean.FALSE;
            }
        }

        protected void y(Boolean bl) {
            this.j.H.setVisibility(8);
            if (!bl.booleanValue()) {
                this.j.V3(2131951927);
                return;
            }
            if (this.j.W == null) {
                return;
            }
            if (this.j.c) {
                this.z();
                return;
            }
            VideoPlayerActivity.M(this.j, new Runnable(this){
                final u q;
                {
                    this.q = u8;
                }

                @Override
                public void run() {
                    this.q.z();
                }
            });
        }
    }

    private class v
    implements ax.P0.p<F> {
        final VideoPlayerActivity a;

        private v(VideoPlayerActivity videoPlayerActivity) {
            this.a = videoPlayerActivity;
        }

        public Pair<Integer, String> b(F serializable) {
            Object object;
            Object object2 = object = this.a.getString(2131951960);
            if (ax.t3.j.o((Context)this.a)) {
                if (serializable instanceof s) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append(":");
                    ((StringBuilder)object2).append(((s)serializable).k0);
                    ((StringBuilder)object2).append(":");
                    ((StringBuilder)object2).append(((Throwable)serializable).getMessage());
                    object2 = ((StringBuilder)object2).toString();
                } else {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append(":");
                    ((StringBuilder)object2).append(((Throwable)serializable).getMessage());
                    object2 = ((StringBuilder)object2).toString();
                }
            }
            object = object2;
            if (serializable instanceof s) {
                serializable = (s)serializable;
                int n8 = ((s)serializable).k0;
                if (n8 == 0) {
                    object = object2;
                } else {
                    object = object2;
                    if (n8 == 1) {
                        serializable = ((s)serializable).h();
                        object = object2;
                        if (serializable instanceof L.c) {
                            object2 = (L.c)serializable;
                            if (((L.c)object2).c0) {
                                object = this.a;
                                serializable = new StringBuilder();
                                ((StringBuilder)serializable).append(((L.c)object2).q);
                                ((StringBuilder)serializable).append(":secure");
                                object = ax.w3.h.b((Context)object, ((StringBuilder)serializable).toString());
                            } else {
                                object = ax.w3.h.b((Context)this.a, ((L.c)object2).q);
                            }
                        }
                    }
                }
            }
            return Pair.create((Object)0, (Object)object);
        }
    }

    private class w
    implements H.d {
        final VideoPlayerActivity a;

        private w(VideoPlayerActivity videoPlayerActivity) {
            this.a = videoPlayerActivity;
        }

        @Override
        public /* synthetic */ void D(int n8) {
            ax.P0.I.r(this, n8);
        }

        @Override
        public /* synthetic */ void E(boolean bl) {
            ax.P0.I.k(this, bl);
        }

        @Override
        public void F(int n8) {
            if (n8 == 0 && this.a.o0 == 2) {
                this.a.o3();
            }
            this.a.o4();
        }

        @Override
        public void H(V object) {
            this.a.E1.q();
            object = ((V)object).a();
            if (object != this.a.P0) {
                VideoPlayerActivity.A0(this.a, false);
                VideoPlayerActivity.X0(this.a, false);
                VideoPlayerActivity.Y0(this.a, 0);
                VideoPlayerActivity.b1(this.a, 0);
                Object object2 = this.a.N0.o();
                if (object2 != null) {
                    int n8;
                    int n9;
                    Object object3;
                    Object object4;
                    Object object5;
                    String string;
                    if (((G.a)object2).i(2) == 1) {
                        string = this.a.A2((ax.r7.z)object, "video");
                        object5 = this.a.k2();
                        object4 = ax.Ha.c.h().f().b("video codec not available");
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("codec : ");
                        ((StringBuilder)object3).append(string);
                        ((StringBuilder)object3).append(",container : ");
                        ((StringBuilder)object3).append((String)object5);
                        ((ax.Ha.b)object4).g(((StringBuilder)object3).toString()).h();
                        object3 = S1;
                        object4 = new StringBuilder();
                        ((StringBuilder)object4).append("video codec not available : ");
                        ((StringBuilder)object4).append(string);
                        ((StringBuilder)object4).append(", container : ");
                        ((StringBuilder)object4).append((String)object5);
                        ((Logger)object3).severe(((StringBuilder)object4).toString());
                        this.a.R3(string);
                    }
                    if ((n9 = ((G.a)object2).i(1)) == 1) {
                        string = this.a.A2((ax.r7.z)object, "audio");
                        object5 = this.a.k2();
                        object3 = ax.Ha.c.h().f().b("audio codec not available");
                        object4 = new StringBuilder();
                        ((StringBuilder)object4).append("codec : ");
                        ((StringBuilder)object4).append(string);
                        ((StringBuilder)object4).append(",container : ");
                        ((StringBuilder)object4).append((String)object5);
                        ((ax.Ha.b)object3).g(((StringBuilder)object4).toString()).h();
                        object4 = S1;
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("audio codec not available : ");
                        ((StringBuilder)object3).append(string);
                        ((StringBuilder)object3).append(", container : ");
                        ((StringBuilder)object3).append((String)object5);
                        ((Logger)object4).severe(((StringBuilder)object3).toString());
                        this.a.R3(string);
                    } else if (n9 == 3) {
                        for (n9 = 0; n9 < ((AbstractCollection)object).size(); ++n9) {
                            object5 = (V.a)object.get(n9);
                            if (((V.a)object5).d() != 1) continue;
                            for (n8 = 0; n8 < ((V.a)object5).a; ++n8) {
                                if (!((V.a)object5).j(n8)) continue;
                                VideoPlayerActivity.c1(this.a);
                            }
                        }
                    }
                    if (((G.a)object2).i(3) == 3) {
                        for (n9 = 0; n9 < ((AbstractCollection)object).size(); ++n9) {
                            object2 = (V.a)object.get(n9);
                            if (((V.a)object2).d() != 3) continue;
                            for (n8 = 0; n8 < ((V.a)object2).a; ++n8) {
                                if (!((V.a)object2).j(n8) || (((V.a)object2).b((int)n8).e & 2) != 0) continue;
                                VideoPlayerActivity.Z0(this.a);
                                if (!((V.a)object2).f()) continue;
                                VideoPlayerActivity.X0(this.a, true);
                            }
                        }
                        VideoPlayerActivity.h1(this.a, true);
                    } else {
                        VideoPlayerActivity.h1(this.a, false);
                    }
                } else {
                    VideoPlayerActivity.h1(this.a, false);
                }
                VideoPlayerActivity.W0(this.a, (ax.r7.z)object);
            }
            this.a.l4();
            this.a.v4();
            this.a.j4();
        }

        @Override
        public /* synthetic */ void I(boolean bl) {
            ax.P0.I.i(this, bl);
        }

        @Override
        public /* synthetic */ void J(F f8) {
            ax.P0.I.t(this, f8);
        }

        @Override
        public /* synthetic */ void L(float f8) {
            ax.P0.I.G(this, f8);
        }

        @Override
        public void N(F f8) {
            if (VideoPlayerActivity.R2(f8)) {
                this.a.g2();
                this.a.L2();
                return;
            }
            this.a.j3(false);
            this.a.l4();
            this.a.S3();
        }

        @Override
        public /* synthetic */ void O(int n8) {
            ax.P0.I.q(this, n8);
        }

        @Override
        public void P(ax.P0.N n8, int n9) {
            this.a.o4();
        }

        @Override
        public void S(boolean bl) {
            this.a.o4();
        }

        @Override
        public /* synthetic */ void U(T t8) {
            ax.P0.I.D(this, t8);
        }

        @Override
        public /* synthetic */ void W(H.b b8) {
            ax.P0.I.c(this, b8);
        }

        @Override
        public /* synthetic */ void Y(int n8, boolean bl) {
            ax.P0.I.g(this, n8, bl);
        }

        @Override
        public void Z(boolean bl, int n8) {
            Logger logger = S1;
            Object object = new StringBuilder();
            ((StringBuilder)object).append("player state changed : ");
            ((StringBuilder)object).append(bl);
            ((StringBuilder)object).append(",");
            ((StringBuilder)object).append(n8);
            logger.fine(((StringBuilder)object).toString());
            if (n8 == 4) {
                if (this.a.X2() && !this.a.z1) {
                    this.a.r2();
                    return;
                }
                this.a.T3(true);
                this.a.S3();
            } else if (n8 == 3) {
                if (this.a.f3() && this.a.X2() && !this.a.z1 && this.a.y1 > 0) {
                    logger = this.a.B1;
                    object = this.a;
                    logger.postDelayed(((VideoPlayerActivity)object).K1, ((VideoPlayerActivity)object).y1);
                }
                object = this.a.y2();
                if (!(this.a.u1 || this.a.v1 != null && this.a.v1.equals(object))) {
                    long l8;
                    VideoPlayerActivity.A0(this.a, true);
                    VideoPlayerActivity.D0(this.a, (Uri)object);
                    long l9 = l8 = this.a.W.g0();
                    if (l8 < 0L) {
                        l9 = -1L;
                    }
                    object = object != null && object.getPath() != null ? ax.c3.d0.k(object.getPath()) : "uri_error";
                    ax.Q2.a.i().o("video_player_ready").a("duration_ms", l9).b("duration_range", a.g.a(l9)).b("ext", (String)object).c();
                }
                this.a.w4();
                this.a.T3(false);
                if (this.a.Y2()) {
                    n8 = ax.Q.b.c((Context)this.a, 2131100859);
                    VideoPlayerActivity.G0(this.a, 150L);
                } else {
                    n8 = ax.Q.b.c((Context)this.a, 2131100858);
                    VideoPlayerActivity.G0(this.a, 300L);
                }
                this.a.S.setBufferedColor(n8);
            } else if (n8 == 2) {
                this.a.w4();
                this.a.T3(false);
            }
            this.a.i4();
            this.a.l2();
            this.a.n4();
            this.a.l4();
            this.a.o4();
            this.a.m4();
        }

        @Override
        public /* synthetic */ void a(a0 a02) {
            ax.P0.I.F(this, a02);
        }

        @Override
        public /* synthetic */ void a0(y y8, int n8) {
            ax.P0.I.l(this, y8, n8);
        }

        @Override
        public /* synthetic */ void b0() {
            ax.P0.I.x(this);
        }

        @Override
        public /* synthetic */ void c(int n8) {
            ax.P0.I.b(this, n8);
        }

        @Override
        public /* synthetic */ void c0(ax.P0.H h8, H.c c8) {
            ax.P0.I.h(this, h8, c8);
        }

        @Override
        public /* synthetic */ void e(boolean bl) {
            ax.P0.I.A(this, bl);
        }

        @Override
        public /* synthetic */ void i0(boolean bl, int n8) {
            ax.P0.I.o(this, bl, n8);
        }

        @Override
        public /* synthetic */ void j(ax.P0.G g8) {
            ax.P0.I.p(this, g8);
        }

        @Override
        public /* synthetic */ void j0(A a8) {
            ax.P0.I.m(this, a8);
        }

        @Override
        public /* synthetic */ void k0(ax.P0.n n8) {
            ax.P0.I.f(this, n8);
        }

        @Override
        public /* synthetic */ void o0(int n8, int n9) {
            ax.P0.I.B(this, n8, n9);
        }

        @Override
        public /* synthetic */ void p0(H.e e8, H.e e9, int n8) {
            ax.P0.I.w(this, e8, e9, n8);
        }

        @Override
        public /* synthetic */ void r(C c8) {
            ax.P0.I.n(this, c8);
        }

        @Override
        public /* synthetic */ void r0(ax.P0.c c8) {
            ax.P0.I.a(this, c8);
        }

        @Override
        public /* synthetic */ void s(ax.R0.c c8) {
            ax.P0.I.d(this, c8);
        }

        public /* synthetic */ void t(List list) {
            ax.P0.I.e(this, list);
        }

        @Override
        public void t0(boolean bl) {
            Logger logger = S1;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("VideoPlayer : isPlaying=");
            stringBuilder.append(bl);
            logger.fine(stringBuilder.toString());
            if (bl) {
                this.a.K3(true);
                this.a.c2();
                return;
            }
            this.a.K3(false);
        }

        @Override
        public void v(int n8) {
            if (this.a.o0 != n8) {
                ax.t3.l.k((Context)this.a, n8);
            }
            VideoPlayerActivity.l1(this.a, n8);
            this.a.r4();
            this.a.o4();
        }
    }

    static class x
    extends OrientationEventListener {
        Activity a;
        Handler b;
        boolean c;

        x(Activity activity, Handler handler) {
            super((Context)activity);
            this.b = handler;
            this.a = activity;
        }

        private boolean a(int n8, int n9) {
            return n8 > n9 - 10 && n8 < n9 + 10;
        }

        private boolean b(int n8) {
            return this.a(n8, 90) || this.a(n8, 270);
            {
            }
        }

        private boolean c(int n8) {
            return this.a(n8, 0) || this.a(n8, 180);
            {
            }
        }

        void d() {
            boolean bl;
            if (this.a.getResources().getConfiguration().orientation == 2) {
                this.a.setRequestedOrientation(7);
                bl = false;
            } else {
                this.a.setRequestedOrientation(6);
                bl = true;
            }
            if (Settings.System.getInt((ContentResolver)this.a.getContentResolver(), (String)"accelerometer_rotation", (int)0) == 1) {
                this.e(bl);
            }
        }

        void e(boolean bl) {
            this.c = bl;
            this.enable();
        }

        public void onOrientationChanged(int n8) {
            if (this.c && this.b(n8) || !this.c && this.c(n8)) {
                this.b.postDelayed(new Runnable(this){
                    final x q;
                    {
                        this.q = x8;
                    }

                    @Override
                    public void run() {
                        if (this.q.a.isFinishing()) {
                            return;
                        }
                        this.q.a.setRequestedOrientation(-1);
                    }
                }, 2000L);
                this.disable();
            }
        }
    }
}

