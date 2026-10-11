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
import ax.z3.ViewOnClickListenerC3543a;
import com.android.ex.photo.PhotoViewPager;
import com.android.ex.photo.a;
import com.android.ex.photo.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class f implements a.InterfaceC0095a<Cursor>, ViewPager.j, PhotoViewPager.c, a.InterfaceC0540a, com.android.ex.photo.e {
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
    private long K;
    protected boolean L;
    private final g a;
    private int b;
    private String d;
    private String e;
    private int g;
    private String h;
    private String[] i;
    protected boolean k;
    protected View l;
    protected View m;
    protected PhotoViewPager n;
    protected ImageView o;
    protected ax.y3.c p;
    protected boolean q;
    private boolean t;
    private boolean u;
    protected float w;
    protected String x;
    protected String y;
    private boolean z;
    private int f = -1;
    protected int j = -1;
    private final Map<Integer, e.b> r = new HashMap();
    private final Set<e.a> s = new HashSet();
    protected boolean v = true;
    protected final Handler J = new Handler();
    private final Runnable M = new b();
    private final View.OnSystemUiVisibilityChangeListener c = new a();

    class a implements View.OnSystemUiVisibilityChangeListener {
        a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if (i != 0 || f.this.b != 3846 || f.this.O() == null || f.this.O().r()) {
                return;
            }
            f.this.y0(false, true);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.y0(true, true);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.i0();
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.j0();
        }
    }

    class e implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ View a;

        e(View view) {
            this.a = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            f.this.v0();
        }
    }

    /* renamed from: com.android.ex.photo.f$f, reason: collision with other inner class name */
    static /* synthetic */ class C0541f {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.c.values().length];
            a = iArr;
            try {
                iArr[b.c.EXTRA_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.c.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.c.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface g {
        Context b();

        boolean d();

        void e(int i);

        void f();

        View findViewById(int i);

        void finish();

        Context getApplicationContext();

        Intent getIntent();

        Resources getResources();

        FragmentManager getSupportFragmentManager();

        ax.J0.a getSupportLoaderManager();

        void i();

        f j();

        Fragment m();

        com.android.ex.photo.a o();

        void overridePendingTransition(int i, int i2);

        void p();

        void q(boolean z);

        boolean r();

        void setContentView(int i);
    }

    private class h implements a.InterfaceC0095a<b.a> {
        private h() {
        }

        @Override // ax.J0.a.InterfaceC0095a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void v(ax.K0.c<b.a> cVar, b.a aVar) {
            Drawable a = aVar.a(f.this.a.getResources());
            com.android.ex.photo.a o = f.this.a.o();
            int k = cVar.k();
            if (k != 1) {
                if (k != 2) {
                    return;
                }
                f.this.X(a);
            } else if (a == null) {
                o.e(null);
            } else {
                o.e(a);
            }
        }

        @Override // ax.J0.a.InterfaceC0095a
        public ax.K0.c<b.a> w(int i, Bundle bundle) {
            String string = bundle.getString("image_uri");
            if (i == 1) {
                return f.this.z(1, bundle, string);
            }
            if (i != 2) {
                return null;
            }
            return f.this.z(2, bundle, string);
        }

        /* synthetic */ h(f fVar, a aVar) {
            this();
        }

        @Override // ax.J0.a.InterfaceC0095a
        public void p(ax.K0.c<b.a> cVar) {
        }
    }

    public f(g gVar) {
        this.a = gVar;
        this.H = (AccessibilityManager) gVar.b().getSystemService("accessibility");
    }

    private int J(int i, int i2, int i3, float f) {
        float f2 = i3;
        float f3 = f * f2;
        return (i - Math.round((f2 - f3) / 2.0f)) - Math.round((f3 - i2) / 2.0f);
    }

    private static final String R(String str) {
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    private void W() {
        if (O == 0) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) this.a.b().getSystemService("window");
            b.c cVar = ax.C3.b.b;
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if (C0541f.a[cVar.ordinal()] != 1) {
                O = Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
            } else {
                O = (Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels) * 800) / 1000;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(Drawable drawable) {
        if (this.z) {
            return;
        }
        this.o.setImageDrawable(drawable);
        if (drawable != null) {
            if (this.l.getMeasuredWidth() == 0) {
                View view = this.l;
                view.getViewTreeObserver().addOnGlobalLayoutListener(new e(view));
            } else {
                v0();
            }
        }
        this.a.getSupportLoaderManager().e(100, null, this);
    }

    private synchronized void c0(Cursor cursor) {
        Iterator<e.a> it = this.s.iterator();
        while (it.hasNext()) {
            it.next().F(cursor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0() {
        this.a.finish();
        this.a.overridePendingTransition(0, 0);
    }

    private void s0() {
        this.J.postDelayed(this.M, this.K);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        int measuredWidth = this.l.getMeasuredWidth();
        int measuredHeight = this.l.getMeasuredHeight();
        this.o.setVisibility(0);
        float max = Math.max(this.D / measuredWidth, this.E / measuredHeight);
        int J = J(this.B, this.D, measuredWidth, max);
        int J2 = J(this.C, this.E, measuredHeight, max);
        this.m.setAlpha(0.0f);
        this.m.animate().alpha(1.0f).setDuration(250L).start();
        this.m.setVisibility(0);
        this.o.setScaleX(max);
        this.o.setScaleY(max);
        this.o.setTranslationX(J);
        this.o.setTranslationY(J2);
        c cVar = new c();
        ViewPropertyAnimator duration = this.o.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(250L);
        duration.withEndAction(cVar);
        duration.start();
    }

    private void w0() {
        this.a.getIntent();
        int measuredWidth = this.l.getMeasuredWidth();
        int measuredHeight = this.l.getMeasuredHeight();
        float max = Math.max(this.D / measuredWidth, this.E / measuredHeight);
        int J = J(this.B, this.D, measuredWidth, max);
        int J2 = J(this.C, this.E, measuredHeight, max);
        this.m.animate().alpha(0.0f).setDuration(250L).start();
        this.m.setVisibility(0);
        d dVar = new d();
        ViewPropertyAnimator duration = this.o.getVisibility() == 0 ? this.o.animate().scaleX(max).scaleY(max).translationX(J).translationY(J2).setDuration(250L) : this.n.animate().scaleX(max).scaleY(max).translationX(J).translationY(J2).setDuration(250L);
        if (!this.e.equals(this.h)) {
            duration.alpha(0.0f);
        }
        duration.withEndAction(dVar);
        duration.start();
    }

    public void A(ViewOnClickListenerC3543a viewOnClickListenerC3543a, boolean z) {
        if (this.o.getVisibility() == 8 || !TextUtils.equals(viewOnClickListenerC3543a.Y2(), this.h)) {
            return;
        }
        if (z) {
            this.o.setVisibility(8);
            this.n.setVisibility(0);
        } else {
            Log.w("PhotoViewController", "Failed to load fragment image");
            this.o.setVisibility(8);
            this.n.setVisibility(0);
        }
        this.a.getSupportLoaderManager().a(2);
    }

    public void A0(int i) {
        this.f = i;
    }

    @Override // com.android.ex.photo.e
    public boolean B() {
        return this.L;
    }

    protected void B0(boolean z) {
        z0(z);
    }

    @Override // com.android.ex.photo.e
    public void C(int i) {
        this.r.remove(Integer.valueOf(i));
    }

    public void C0(int i) {
        String S;
        e.b bVar = this.r.get(Integer.valueOf(i));
        if (bVar != null) {
            bVar.M();
        }
        Cursor Q = Q();
        this.g = i;
        this.h = Q.getString(Q.getColumnIndex("uri"));
        F0();
        if (this.H.isEnabled() && (S = S(i)) != null) {
            ax.C3.e.a(this.l, this.H, S);
        }
        L();
        s0();
    }

    @Override // com.android.ex.photo.e
    public void D(int i, e.b bVar) {
        this.r.put(Integer.valueOf(i), bVar);
    }

    public void D0(Cursor cursor) {
        this.j = cursor.getCount();
        if (this.h != null) {
            int columnIndex = cursor.getColumnIndex("uri");
            Uri build = Uri.parse(this.h).buildUpon().clearQuery().build();
            cursor.moveToPosition(-1);
            int i = 0;
            while (true) {
                if (!cursor.moveToNext()) {
                    break;
                }
                Uri build2 = Uri.parse(cursor.getString(columnIndex)).buildUpon().clearQuery().build();
                if (build != null && build.equals(build2)) {
                    this.g = i;
                    break;
                }
                i++;
            }
        }
        if (this.v) {
            this.t = true;
            this.p.C(null);
            return;
        }
        boolean z = this.k;
        this.k = false;
        this.p.C(cursor);
        if (this.n.getAdapter() == null) {
            this.n.setAdapter(this.p);
        }
        c0(cursor);
        if (this.g < 0) {
            this.g = 0;
        }
        int i2 = this.f;
        if (i2 >= 0) {
            this.n.N(i2, false);
            this.f = -1;
        } else {
            this.n.N(this.g, false);
        }
        if (z) {
            C0(this.g);
        }
    }

    public void E0(boolean z) {
        throw null;
    }

    public void F0() {
        throw null;
    }

    public void G0() {
    }

    public void K(int i) {
        this.g = i;
        C0(i);
    }

    public void L() {
        this.J.removeCallbacks(this.M);
    }

    public ax.y3.c M(Context context, FragmentManager fragmentManager, Cursor cursor, float f) {
        return new ax.y3.c(context, fragmentManager, cursor, f, this.G);
    }

    protected View N(int i) {
        return this.a.findViewById(i);
    }

    public g O() {
        return this.a;
    }

    public e.b P() {
        return this.r.get(Integer.valueOf(this.g));
    }

    public Cursor Q() {
        PhotoViewPager photoViewPager = this.n;
        if (photoViewPager == null) {
            return null;
        }
        int currentItem = photoViewPager.getCurrentItem();
        Cursor x = this.p.x();
        if (x == null) {
            return null;
        }
        x.moveToPosition(currentItem);
        return x;
    }

    protected String S(int i) {
        return this.y != null ? this.a.b().getResources().getString(m.b, this.x, this.y) : this.x;
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

    @Override // com.android.ex.photo.a.InterfaceC0540a
    public void a(boolean z) {
        if (z) {
            L();
        } else {
            s0();
        }
    }

    public boolean a0() {
        return this.A;
    }

    @Override // com.android.ex.photo.PhotoViewPager.c
    public PhotoViewPager.b b(float f, float f2) {
        boolean z = false;
        boolean z2 = false;
        for (e.b bVar : this.r.values()) {
            if (!z) {
                z = bVar.g(f, f2);
            }
            if (!z2) {
                z2 = bVar.r(f, f2);
            }
        }
        return z ? z2 ? PhotoViewPager.b.BOTH : PhotoViewPager.b.LEFT : z2 ? PhotoViewPager.b.RIGHT : PhotoViewPager.b.NONE;
    }

    public boolean b0() {
        return (this.q && !this.F) || this.A;
    }

    public void c(boolean z) {
        this.L = z;
        e.b P = P();
        if (P != null) {
            P.c(z);
        }
    }

    @Override // com.android.ex.photo.e
    public boolean d() {
        g gVar = this.a;
        if (gVar == null) {
            return false;
        }
        return gVar.d();
    }

    public void d0(int i, int i2, Intent intent) {
        throw null;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void e(int i) {
        g gVar = this.a;
        if (gVar == null) {
            return;
        }
        gVar.e(i);
    }

    public boolean e0() {
        if (this.q && !this.F) {
            n();
            return true;
        }
        if (!this.A) {
            return false;
        }
        w0();
        return true;
    }

    @Override // com.android.ex.photo.e
    public void f() {
        g gVar = this.a;
        if (gVar == null) {
            return;
        }
        gVar.f();
    }

    public void f0(Bundle bundle) {
        W();
        N = ((ActivityManager) this.a.getApplicationContext().getSystemService("activity")).getMemoryClass();
        Intent intent = this.a.getIntent();
        if (intent.hasExtra("photos_uri")) {
            this.d = intent.getStringExtra("photos_uri");
        }
        if (intent.getBooleanExtra("scale_up_animation", false)) {
            this.A = true;
            this.B = intent.getIntExtra("start_x_extra", 0);
            this.C = intent.getIntExtra("start_y_extra", 0);
            this.D = intent.getIntExtra("start_width_extra", 0);
            this.E = intent.getIntExtra("start_height_extra", 0);
        }
        this.F = intent.getBooleanExtra("action_bar_hidden_initially", false) && !ax.C3.e.c(this.H);
        this.G = intent.getBooleanExtra("display_thumbs_fullscreen", false);
        a aVar = null;
        if (intent.hasExtra("projection")) {
            this.i = intent.getStringArrayExtra("projection");
        } else {
            this.i = null;
        }
        this.w = intent.getFloatExtra("max_scale", 1.0f);
        this.h = null;
        this.g = -1;
        if (intent.hasExtra("photo_index")) {
            this.g = intent.getIntExtra("photo_index", -1);
        }
        if (intent.hasExtra("initial_photo_uri")) {
            String stringExtra = intent.getStringExtra("initial_photo_uri");
            this.e = stringExtra;
            this.h = stringExtra;
        }
        this.k = true;
        if (bundle != null) {
            this.e = bundle.getString("com.android.ex.PhotoViewFragment.INITIAL_URI");
            this.h = bundle.getString("com.android.ex.PhotoViewFragment.CURRENT_URI");
            this.g = bundle.getInt("com.android.ex.PhotoViewFragment.CURRENT_INDEX");
            this.q = bundle.getBoolean("com.android.ex.PhotoViewFragment.FULLSCREEN", false) && !ax.C3.e.c(this.H);
            this.x = bundle.getString("com.android.ex.PhotoViewFragment.ACTIONBARTITLE");
            this.y = bundle.getString("com.android.ex.PhotoViewFragment.ACTIONBARSUBTITLE");
            this.z = bundle.getBoolean("com.android.ex.PhotoViewFragment.SCALEANIMATIONFINISHED", false);
        } else {
            this.q = this.F;
        }
        this.a.setContentView(l.a);
        this.p = M(this.a.b(), this.a.getSupportFragmentManager(), null, this.w);
        Resources resources = this.a.getResources();
        View N2 = N(j.g);
        this.l = N2;
        N2.setOnSystemUiVisibilityChangeListener(U());
        this.m = N(j.f);
        this.o = (ImageView) N(j.h);
        PhotoViewPager photoViewPager = (PhotoViewPager) N(j.l);
        this.n = photoViewPager;
        photoViewPager.setAdapter(this.p);
        this.n.setOnPageChangeListener(this);
        this.n.setOnInterceptTouchListener(this);
        this.n.setPageMargin(resources.getDimensionPixelSize(i.c));
        this.I = new h(this, aVar);
        if (!this.A || this.z) {
            this.a.getSupportLoaderManager().e(100, null, this);
            this.m.setVisibility(0);
        } else {
            this.n.setVisibility(8);
            Bundle bundle2 = new Bundle();
            bundle2.putString("image_uri", this.e);
            this.a.getSupportLoaderManager().e(2, bundle2, this.I);
        }
        this.K = resources.getInteger(k.a);
        com.android.ex.photo.a o = this.a.o();
        if (o != null) {
            o.b(true);
            o.c(this);
            o.a();
            x0(o);
        }
        if (this.A) {
            B0(false);
        } else {
            B0(this.q);
        }
        this.a.p();
    }

    public boolean g0(Menu menu) {
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void h(int i, float f, int i2) {
        if (f < 1.0E-4d) {
            e.b bVar = this.r.get(Integer.valueOf(i - 1));
            if (bVar != null) {
                bVar.N();
            }
            e.b bVar2 = this.r.get(Integer.valueOf(i + 1));
            if (bVar2 != null) {
                bVar2.N();
            }
        }
    }

    public void h0() {
        this.u = true;
    }

    public void i0() {
        this.z = true;
        this.n.setVisibility(0);
        B0(this.q);
    }

    @Override // com.android.ex.photo.e
    public e.b j(int i) {
        return this.r.get(Integer.valueOf(i));
    }

    @Override // com.android.ex.photo.e
    public void k(boolean z) {
        if (z) {
            return;
        }
        this.L = z;
        ArrayList arrayList = new ArrayList(this.r.values());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((e.b) obj).c(false);
        }
    }

    public void k0(ax.K0.c<Cursor> cVar, Cursor cursor) {
        if (cVar.k() == 100) {
            if (cursor == null || cursor.getCount() == 0) {
                this.k = true;
                this.p.C(null);
            } else {
                D0(cursor);
            }
            G0();
        }
    }

    public boolean l0(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.a.finish();
        return true;
    }

    @Override // com.android.ex.photo.e
    public ax.y3.c m() {
        return this.p;
    }

    public void m0() {
        this.v = true;
    }

    @Override // com.android.ex.photo.e
    public void n() {
        y0(!this.q, true);
    }

    public boolean n0(Menu menu) {
        return true;
    }

    @Override // com.android.ex.photo.e
    public void o(int i) {
    }

    public void o0() {
        y0(this.q, false);
        this.v = false;
        if (this.t) {
            this.t = false;
            this.a.getSupportLoaderManager().e(100, null, this);
        }
    }

    @Override // ax.J0.a.InterfaceC0095a
    public void p(ax.K0.c<Cursor> cVar) {
        if (Y()) {
            return;
        }
        this.p.C(null);
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

    @Override // com.android.ex.photo.e
    public synchronized void q(e.a aVar) {
        this.s.remove(aVar);
    }

    public void q0() {
    }

    public void r0() {
    }

    @Override // com.android.ex.photo.e
    public boolean s() {
        return this.q;
    }

    @Override // com.android.ex.photo.e
    public boolean t(Fragment fragment) {
        ax.y3.c cVar;
        return (this.n == null || (cVar = this.p) == null || cVar.e() == 0) ? this.q : this.q || this.n.getCurrentItem() != this.p.f(fragment);
    }

    public void t0() {
        if (this.q) {
            return;
        }
        u0();
    }

    public void u0() {
        L();
        s0();
    }

    @Override // ax.J0.a.InterfaceC0095a
    public ax.K0.c<Cursor> w(int i, Bundle bundle) {
        if (i == 100) {
            return new ax.A3.c(this.a.b(), Uri.parse(this.d), this.i);
        }
        return null;
    }

    @Override // com.android.ex.photo.e
    public synchronized void x(e.a aVar) {
        this.s.add(aVar);
    }

    protected final void x0(com.android.ex.photo.a aVar) {
        if (aVar == null) {
            return;
        }
        aVar.setTitle(R(this.x));
        aVar.h(R(this.y));
    }

    @Override // com.android.ex.photo.e
    public boolean y(Fragment fragment) {
        PhotoViewPager photoViewPager = this.n;
        return (photoViewPager == null || this.p == null || photoViewPager.getCurrentItem() != this.p.f(fragment)) ? false : true;
    }

    protected void y0(boolean z, boolean z2) {
        if (ax.C3.e.c(this.H)) {
            z = false;
            z2 = false;
        }
        boolean z3 = z != this.q;
        this.q = z;
        if (z) {
            B0(true);
            L();
        } else {
            B0(false);
            if (z2) {
                if (z3) {
                    L();
                }
                s0();
            }
        }
        if (z3) {
            Iterator<e.b> it = this.r.values().iterator();
            while (it.hasNext()) {
                it.next().H(this.q);
            }
        }
        this.a.q(this.q);
        this.a.p();
    }

    public ax.K0.c<b.a> z(int i, Bundle bundle, String str) {
        if (i == 1 || i == 2 || i == 3) {
            return new ax.A3.a(this.a.b(), null, str);
        }
        return null;
    }

    public void z0(boolean z) {
        int i = (!z || (a0() && !Z())) ? 1792 : 3846;
        this.b = i;
        T().setSystemUiVisibility(i);
    }

    public void g(ViewOnClickListenerC3543a viewOnClickListenerC3543a) {
    }

    @Override // com.android.ex.photo.e
    public void u(ViewOnClickListenerC3543a viewOnClickListenerC3543a, Cursor cursor) {
    }
}
