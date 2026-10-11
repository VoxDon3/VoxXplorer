/*
 * Decompiled with CFR 0.152.
 */
package com.android.ex.photo;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import ax.A3.b;
import ax.C3.b;
import ax.J0.a;
import ax.y3.c;
import com.android.ex.photo.PhotoViewPager;
import com.android.ex.photo.a;
import com.android.ex.photo.e;
import com.android.ex.photo.i;
import com.android.ex.photo.j;
import com.android.ex.photo.k;
import com.android.ex.photo.l;
import com.android.ex.photo.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class f
implements a.a<Cursor>,
ViewPager.j,
PhotoViewPager.c,
a.a,
e {
    public static int N;
    public static int O;
    protected boolean A;
    protected int B;
    protected int C;
    protected int D;
    protected int E;
    protected boolean F;
    protected boolean G;
    private final AccessibilityManager H;
    protected h I;
    protected final Handler J;
    private long K;
    protected boolean L;
    private final Runnable M;
    private final g a;
    private int b;
    private final View.OnSystemUiVisibilityChangeListener c;
    private String d;
    private String e;
    private int f = -1;
    private int g;
    private String h;
    private String[] i;
    protected int j = -1;
    protected boolean k;
    protected View l;
    protected View m;
    protected PhotoViewPager n;
    protected ImageView o;
    protected c p;
    protected boolean q;
    private final Map<Integer, e.b> r = new HashMap<Integer, e.b>();
    private final Set<e.a> s = new HashSet<e.a>();
    private boolean t;
    private boolean u;
    protected boolean v = true;
    protected float w;
    protected String x;
    protected String y;
    private boolean z;

    public f(g g8) {
        this.J = new Handler();
        this.M = new Runnable(this){
            final f q;
            {
                this.q = f8;
            }

            @Override
            public void run() {
                this.q.y0(true, true);
            }
        };
        this.a = g8;
        this.c = new View.OnSystemUiVisibilityChangeListener(this){
            final f a;
            {
                this.a = f8;
            }

            public void onSystemUiVisibilityChange(int n8) {
                if (n8 == 0 && this.a.b == 3846 && this.a.O() != null && !this.a.O().r()) {
                    this.a.y0(false, true);
                }
            }
        };
        this.H = (AccessibilityManager)g8.b().getSystemService("accessibility");
    }

    private int J(int n8, int n9, int n10, float f8) {
        float f9 = n10;
        return n8 - Math.round((f9 - (f8 *= f9)) / 2.0f) - Math.round((f8 - (float)n9) / 2.0f);
    }

    private static final String R(String string) {
        String string2 = string;
        if (string == null) {
            string2 = "";
        }
        return string2;
    }

    private void W() {
        if (O == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager)this.a.b().getSystemService("window");
            b.c c8 = ax.C3.b.b;
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if (com.android.ex.photo.f$f.a[c8.ordinal()] != 1) {
                O = Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
                return;
            }
            O = Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels) * 800 / 1000;
        }
    }

    private void X(Drawable drawable) {
        if (this.z) {
            return;
        }
        this.o.setImageDrawable(drawable);
        if (drawable != null) {
            if (this.l.getMeasuredWidth() == 0) {
                drawable = this.l;
                drawable.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(){
                    final View a;
                    final f b;
                    {
                        this.b = f8;
                        this.a = view;
                    }

                    public void onGlobalLayout() {
                        this.a.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                        this.b.v0();
                    }
                });
            } else {
                this.v0();
            }
        }
        this.a.getSupportLoaderManager().e(100, null, this);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c0(Cursor cursor) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Iterator<e.a> iterator = this.s.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().F(cursor);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    private void j0() {
        this.a.finish();
        this.a.overridePendingTransition(0, 0);
    }

    private void s0() {
        this.J.postDelayed(this.M, this.K);
    }

    private void v0() {
        int n8 = this.l.getMeasuredWidth();
        int n9 = this.l.getMeasuredHeight();
        this.o.setVisibility(0);
        float f8 = Math.max((float)this.D / (float)n8, (float)this.E / (float)n9);
        n8 = this.J(this.B, this.D, n8, f8);
        n9 = this.J(this.C, this.E, n9, f8);
        this.m.setAlpha(0.0f);
        this.m.animate().alpha(1.0f).setDuration(250L).start();
        this.m.setVisibility(0);
        this.o.setScaleX(f8);
        this.o.setScaleY(f8);
        this.o.setTranslationX((float)n8);
        this.o.setTranslationY((float)n9);
        Runnable runnable2 = new Runnable(this){
            final f q;
            {
                this.q = f8;
            }

            @Override
            public void run() {
                this.q.i0();
            }
        };
        ViewPropertyAnimator viewPropertyAnimator = this.o.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(250L);
        viewPropertyAnimator.withEndAction(runnable2);
        viewPropertyAnimator.start();
    }

    private void w0() {
        this.a.getIntent();
        int n8 = this.l.getMeasuredWidth();
        int n9 = this.l.getMeasuredHeight();
        float f8 = Math.max((float)this.D / (float)n8, (float)this.E / (float)n9);
        n8 = this.J(this.B, this.D, n8, f8);
        n9 = this.J(this.C, this.E, n9, f8);
        this.m.animate().alpha(0.0f).setDuration(250L).start();
        this.m.setVisibility(0);
        Runnable runnable2 = new Runnable(this){
            final f q;
            {
                this.q = f8;
            }

            @Override
            public void run() {
                this.q.j0();
            }
        };
        ViewPropertyAnimator viewPropertyAnimator = this.o.getVisibility() == 0 ? this.o.animate().scaleX(f8).scaleY(f8).translationX((float)n8).translationY((float)n9).setDuration(250L) : this.n.animate().scaleX(f8).scaleY(f8).translationX((float)n8).translationY((float)n9).setDuration(250L);
        if (!this.e.equals(this.h)) {
            viewPropertyAnimator.alpha(0.0f);
        }
        viewPropertyAnimator.withEndAction(runnable2);
        viewPropertyAnimator.start();
    }

    @Override
    public void A(ax.z3.a a8, boolean bl) {
        if (this.o.getVisibility() != 8 && TextUtils.equals((CharSequence)a8.Y2(), (CharSequence)this.h)) {
            if (bl) {
                this.o.setVisibility(8);
                this.n.setVisibility(0);
            } else {
                Log.w((String)"PhotoViewController", (String)"Failed to load fragment image");
                this.o.setVisibility(8);
                this.n.setVisibility(0);
            }
            this.a.getSupportLoaderManager().a(2);
        }
    }

    public void A0(int n8) {
        this.f = n8;
    }

    @Override
    public boolean B() {
        return this.L;
    }

    protected void B0(boolean bl) {
        this.z0(bl);
    }

    @Override
    public void C(int n8) {
        this.r.remove(n8);
    }

    public void C0(int n8) {
        Object object = this.r.get(n8);
        if (object != null) {
            object.M();
        }
        object = this.Q();
        this.g = n8;
        this.h = object.getString(object.getColumnIndex("uri"));
        this.F0();
        if (this.H.isEnabled() && (object = this.S(n8)) != null) {
            ax.C3.e.a(this.l, this.H, (CharSequence)object);
        }
        this.L();
        this.s0();
    }

    @Override
    public void D(int n8, e.b b8) {
        this.r.put(n8, b8);
    }

    public void D0(Cursor cursor) {
        int n8;
        this.j = cursor.getCount();
        if (this.h != null) {
            int n9 = cursor.getColumnIndex("uri");
            Uri uri = Uri.parse((String)this.h).buildUpon().clearQuery().build();
            cursor.moveToPosition(-1);
            n8 = 0;
            while (cursor.moveToNext()) {
                Uri uri2 = Uri.parse((String)cursor.getString(n9)).buildUpon().clearQuery().build();
                if (uri != null && uri.equals((Object)uri2)) {
                    this.g = n8;
                    break;
                }
                ++n8;
            }
        }
        if (this.v) {
            this.t = true;
            this.p.C(null);
            return;
        }
        boolean bl = this.k;
        this.k = false;
        this.p.C(cursor);
        if (this.n.getAdapter() == null) {
            this.n.setAdapter(this.p);
        }
        this.c0(cursor);
        if (this.g < 0) {
            this.g = 0;
        }
        if ((n8 = this.f) >= 0) {
            this.n.N(n8, false);
            this.f = -1;
        } else {
            this.n.N(this.g, false);
        }
        if (bl) {
            this.C0(this.g);
        }
    }

    public void E0(boolean bl) {
        throw null;
    }

    public void F0() {
        throw null;
    }

    public void G0() {
    }

    @Override
    public void K(int n8) {
        this.g = n8;
        this.C0(n8);
    }

    public void L() {
        this.J.removeCallbacks(this.M);
    }

    public c M(Context context, FragmentManager fragmentManager, Cursor cursor, float f8) {
        return new c(context, fragmentManager, cursor, f8, this.G);
    }

    protected View N(int n8) {
        return this.a.findViewById(n8);
    }

    public g O() {
        return this.a;
    }

    public e.b P() {
        return this.r.get(this.g);
    }

    public Cursor Q() {
        PhotoViewPager photoViewPager = this.n;
        if (photoViewPager == null) {
            return null;
        }
        int n8 = photoViewPager.getCurrentItem();
        photoViewPager = this.p.x();
        if (photoViewPager == null) {
            return null;
        }
        photoViewPager.moveToPosition(n8);
        return photoViewPager;
    }

    protected String S(int n8) {
        String string = this.x;
        if (this.y != null) {
            string = this.a.b().getResources().getString(com.android.ex.photo.m.b, new Object[]{this.x, this.y});
        }
        return string;
    }

    public View T() {
        return this.l;
    }

    public View.OnSystemUiVisibilityChangeListener U() {
        return this.c;
    }

    public PhotoViewPager V() {
        return this.n;
    }

    protected boolean Y() {
        return this.u;
    }

    public boolean Z() {
        return this.z;
    }

    @Override
    public void a(boolean bl) {
        if (bl) {
            this.L();
            return;
        }
        this.s0();
    }

    public boolean a0() {
        return this.A;
    }

    @Override
    public PhotoViewPager.b b(float f8, float f9) {
        Iterator<e.b> iterator = this.r.values().iterator();
        boolean bl = false;
        boolean bl2 = false;
        while (iterator.hasNext()) {
            e.b b8 = iterator.next();
            boolean bl3 = bl;
            if (!bl) {
                bl3 = b8.g(f8, f9);
            }
            bl = bl3;
            if (bl2) continue;
            bl2 = b8.r(f8, f9);
            bl = bl3;
        }
        if (bl) {
            if (bl2) {
                return PhotoViewPager.b.e0;
            }
            return PhotoViewPager.b.c0;
        }
        if (bl2) {
            return PhotoViewPager.b.d0;
        }
        return PhotoViewPager.b.q;
    }

    public boolean b0() {
        if (this.q && !this.F) {
            return true;
        }
        return this.A;
    }

    @Override
    public void c(boolean bl) {
        this.L = bl;
        e.b b8 = this.P();
        if (b8 != null) {
            b8.c(bl);
        }
    }

    @Override
    public boolean d() {
        g g8 = this.a;
        if (g8 == null) {
            return false;
        }
        return g8.d();
    }

    public void d0(int n8, int n9, Intent intent) {
        throw null;
    }

    @Override
    public void e(int n8) {
        g g8 = this.a;
        if (g8 == null) {
            return;
        }
        g8.e(n8);
    }

    public boolean e0() {
        block4: {
            block3: {
                block2: {
                    if (!this.q || this.F) break block2;
                    this.n();
                    break block3;
                }
                if (!this.A) break block4;
                this.w0();
            }
            return true;
        }
        return false;
    }

    @Override
    public void f() {
        g g8 = this.a;
        if (g8 == null) {
            return;
        }
        g8.f();
    }

    public void f0(Bundle object) {
        this.W();
        N = ((ActivityManager)this.a.getApplicationContext().getSystemService("activity")).getMemoryClass();
        Object object2 = this.a.getIntent();
        if (object2.hasExtra("photos_uri")) {
            this.d = object2.getStringExtra("photos_uri");
        }
        if (object2.getBooleanExtra("scale_up_animation", false)) {
            this.A = true;
            this.B = object2.getIntExtra("start_x_extra", 0);
            this.C = object2.getIntExtra("start_y_extra", 0);
            this.D = object2.getIntExtra("start_width_extra", 0);
            this.E = object2.getIntExtra("start_height_extra", 0);
        }
        boolean bl = object2.getBooleanExtra("action_bar_hidden_initially", false) && !ax.C3.e.c(this.H);
        this.F = bl;
        this.G = object2.getBooleanExtra("display_thumbs_fullscreen", false);
        this.i = object2.hasExtra("projection") ? object2.getStringArrayExtra("projection") : null;
        this.w = object2.getFloatExtra("max_scale", 1.0f);
        this.h = null;
        this.g = -1;
        if (object2.hasExtra("photo_index")) {
            this.g = object2.getIntExtra("photo_index", -1);
        }
        if (object2.hasExtra("initial_photo_uri")) {
            object2 = object2.getStringExtra("initial_photo_uri");
            this.e = object2;
            this.h = object2;
        }
        this.k = true;
        if (object != null) {
            this.e = object.getString("com.android.ex.PhotoViewFragment.INITIAL_URI");
            this.h = object.getString("com.android.ex.PhotoViewFragment.CURRENT_URI");
            this.g = object.getInt("com.android.ex.PhotoViewFragment.CURRENT_INDEX");
            bl = object.getBoolean("com.android.ex.PhotoViewFragment.FULLSCREEN", false) && !ax.C3.e.c(this.H);
            this.q = bl;
            this.x = object.getString("com.android.ex.PhotoViewFragment.ACTIONBARTITLE");
            this.y = object.getString("com.android.ex.PhotoViewFragment.ACTIONBARSUBTITLE");
            this.z = object.getBoolean("com.android.ex.PhotoViewFragment.SCALEANIMATIONFINISHED", false);
        } else {
            this.q = this.F;
        }
        this.a.setContentView(com.android.ex.photo.l.a);
        this.p = this.M(this.a.b(), this.a.getSupportFragmentManager(), null, this.w);
        object = this.a.getResources();
        object2 = this.N(com.android.ex.photo.j.g);
        this.l = object2;
        object2.setOnSystemUiVisibilityChangeListener(this.U());
        this.m = this.N(com.android.ex.photo.j.f);
        this.o = (ImageView)this.N(com.android.ex.photo.j.h);
        object2 = (PhotoViewPager)this.N(com.android.ex.photo.j.l);
        this.n = object2;
        ((ViewPager)((Object)object2)).setAdapter(this.p);
        this.n.setOnPageChangeListener(this);
        this.n.setOnInterceptTouchListener(this);
        this.n.setPageMargin(object.getDimensionPixelSize(com.android.ex.photo.i.c));
        this.I = new h(this);
        if (this.A && !this.z) {
            this.n.setVisibility(8);
            object2 = new Bundle();
            object2.putString("image_uri", this.e);
            this.a.getSupportLoaderManager().e(2, (Bundle)object2, this.I);
        } else {
            this.a.getSupportLoaderManager().e(100, null, this);
            this.m.setVisibility(0);
        }
        this.K = object.getInteger(com.android.ex.photo.k.a);
        object = this.a.o();
        if (object != null) {
            object.b(true);
            object.c(this);
            object.a();
            this.x0((a)object);
        }
        if (!this.A) {
            this.B0(this.q);
        } else {
            this.B0(false);
        }
        this.a.p();
    }

    @Override
    public void g(ax.z3.a a8) {
    }

    public boolean g0(Menu menu) {
        return true;
    }

    @Override
    public void h(int n8, float f8, int n9) {
        if ((double)f8 < 1.0E-4) {
            e.b b8 = this.r.get(n8 - 1);
            if (b8 != null) {
                b8.N();
            }
            if ((b8 = this.r.get(n8 + 1)) != null) {
                b8.N();
            }
        }
    }

    public void h0() {
        this.u = true;
    }

    public void i0() {
        this.z = true;
        this.n.setVisibility(0);
        this.B0(this.q);
    }

    @Override
    public e.b j(int n8) {
        return this.r.get(n8);
    }

    @Override
    public void k(boolean bl) {
        if (!bl) {
            this.L = bl;
            ArrayList<e.b> arrayList = new ArrayList<e.b>(this.r.values());
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                e.b b8 = arrayList.get(i8);
                b8.c(false);
            }
        }
    }

    public void k0(ax.K0.c<Cursor> c8, Cursor cursor) {
        if (c8.k() == 100) {
            if (cursor != null && cursor.getCount() != 0) {
                this.D0(cursor);
            } else {
                this.k = true;
                this.p.C(null);
            }
            this.G0();
        }
    }

    public boolean l0(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.a.finish();
        return true;
    }

    @Override
    public c m() {
        return this.p;
    }

    public void m0() {
        this.v = true;
    }

    @Override
    public void n() {
        this.y0(this.q ^ true, true);
    }

    public boolean n0(Menu menu) {
        return true;
    }

    @Override
    public void o(int n8) {
    }

    public void o0() {
        this.y0(this.q, false);
        this.v = false;
        if (this.t) {
            this.t = false;
            this.a.getSupportLoaderManager().e(100, null, this);
        }
    }

    @Override
    public void p(ax.K0.c<Cursor> c8) {
        if (!this.Y()) {
            this.p.C(null);
        }
    }

    public void p0(Bundle bundle) {
        bundle.putString("com.android.ex.PhotoViewFragment.INITIAL_URI", this.e);
        bundle.putString("com.android.ex.PhotoViewFragment.CURRENT_URI", this.h);
        bundle.putInt("com.android.ex.PhotoViewFragment.CURRENT_INDEX", this.g);
        bundle.putBoolean("com.android.ex.PhotoViewFragment.FULLSCREEN", this.q);
        bundle.putString("com.android.ex.PhotoViewFragment.ACTIONBARTITLE", this.x);
        bundle.putString("com.android.ex.PhotoViewFragment.ACTIONBARSUBTITLE", this.y);
        bundle.putBoolean("com.android.ex.PhotoViewFragment.SCALEANIMATIONFINISHED", this.z);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void q(e.a a8) {
        synchronized (this) {
            this.s.remove(a8);
            return;
        }
    }

    public void q0() {
    }

    public void r0() {
    }

    @Override
    public boolean s() {
        return this.q;
    }

    @Override
    public boolean t(Fragment fragment) {
        c c8;
        if (this.n != null && (c8 = this.p) != null && c8.e() != 0) {
            return this.q || this.n.getCurrentItem() != this.p.f(fragment);
            {
            }
        }
        return this.q;
    }

    public void t0() {
        if (!this.q) {
            this.u0();
        }
    }

    @Override
    public void u(ax.z3.a a8, Cursor cursor) {
    }

    public void u0() {
        this.L();
        this.s0();
    }

    @Override
    public ax.K0.c<Cursor> w(int n8, Bundle bundle) {
        if (n8 == 100) {
            return new ax.A3.c(this.a.b(), Uri.parse((String)this.d), this.i);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void x(e.a a8) {
        synchronized (this) {
            this.s.add(a8);
            return;
        }
    }

    protected final void x0(a a8) {
        if (a8 == null) {
            return;
        }
        a8.setTitle(com.android.ex.photo.f.R(this.x));
        a8.h(com.android.ex.photo.f.R(this.y));
    }

    @Override
    public boolean y(Fragment fragment) {
        PhotoViewPager photoViewPager = this.n;
        return photoViewPager != null && this.p != null && photoViewPager.getCurrentItem() == this.p.f(fragment);
    }

    protected void y0(boolean bl, boolean bl2) {
        if (ax.C3.e.c(this.H)) {
            bl = false;
            bl2 = false;
        }
        boolean bl3 = bl != this.q;
        this.q = bl;
        if (bl) {
            this.B0(true);
            this.L();
        } else {
            this.B0(false);
            if (bl2) {
                if (bl3) {
                    this.L();
                }
                this.s0();
            }
        }
        if (bl3) {
            Iterator<e.b> iterator = this.r.values().iterator();
            while (iterator.hasNext()) {
                iterator.next().H(this.q);
            }
        }
        this.a.q(this.q);
        this.a.p();
    }

    @Override
    public ax.K0.c<b.a> z(int n8, Bundle bundle, String string) {
        if (n8 != 1 && n8 != 2 && n8 != 3) {
            return null;
        }
        return new ax.A3.a(this.a.b(), null, string);
    }

    public void z0(boolean bl) {
        int n8 = bl && (!this.a0() || this.Z()) ? 3846 : 1792;
        this.b = n8;
        this.T().setSystemUiVisibility(n8);
    }

    public static interface g {
        public Context b();

        public boolean d();

        public void e(int var1);

        public void f();

        public View findViewById(int var1);

        public void finish();

        public Context getApplicationContext();

        public Intent getIntent();

        public Resources getResources();

        public FragmentManager getSupportFragmentManager();

        public ax.J0.a getSupportLoaderManager();

        public void i();

        public f j();

        public Fragment m();

        public a o();

        public void overridePendingTransition(int var1, int var2);

        public void p();

        public void q(boolean var1);

        public boolean r();

        public void setContentView(int var1);
    }

    private class h
    implements a.a<b.a> {
        final f a;

        private h(f f8) {
            this.a = f8;
        }

        public void a(ax.K0.c<b.a> c8, b.a object) {
            Drawable drawable = ((b.a)object).a(this.a.a.getResources());
            object = this.a.a.o();
            int n8 = c8.k();
            if (n8 != 1) {
                if (n8 != 2) {
                    return;
                }
                this.a.X(drawable);
                return;
            }
            if (drawable == null) {
                object.e(null);
                return;
            }
            object.e(drawable);
        }

        @Override
        public void p(ax.K0.c<b.a> c8) {
        }

        @Override
        public ax.K0.c<b.a> w(int n8, Bundle bundle) {
            String string = bundle.getString("image_uri");
            if (n8 != 1) {
                if (n8 != 2) {
                    return null;
                }
                return this.a.z(2, bundle, string);
            }
            return this.a.z(1, bundle, string);
        }
    }
}

