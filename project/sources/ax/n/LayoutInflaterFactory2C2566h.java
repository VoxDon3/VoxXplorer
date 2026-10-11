package ax.n;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.appcompat.view.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0580k;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.N;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.d;
import ax.S.h;
import ax.b0.C1441b;
import ax.c0.C1760d0;
import ax.c0.C1780n0;
import ax.c0.C1784p0;
import ax.c0.C1792u;
import ax.c0.C1794v;
import ax.c0.F0;
import ax.c0.I;
import ax.m.C2506a;
import ax.m.C2508c;
import ax.o.C2653a;
import ax.s.C3036c;
import ax.s.C3037d;
import ax.s.WindowCallbackC3039f;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: ax.n.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class LayoutInflaterFactory2C2566h extends AbstractC2564f implements e.a, LayoutInflater.Factory2 {
    private static final ax.B.k<String, Integer> j0 = new ax.B.k<>();
    private static final boolean k0 = false;
    private static final int[] l0 = {R.attr.windowBackground};
    private static final boolean m0 = !"robolectric".equals(Build.FINGERPRINT);
    private boolean A;
    ViewGroup B;
    private TextView C;
    private View D;
    private boolean E;
    private boolean F;
    boolean G;
    boolean H;
    boolean I;
    boolean J;
    boolean K;
    private boolean L;
    private s[] M;
    private s N;
    private boolean O;
    private boolean P;
    private boolean Q;
    boolean R;
    private Configuration S;
    private int T;
    private int U;
    private int V;
    private boolean W;
    private p X;
    private p Y;
    boolean Z;
    int a0;
    private final Runnable b0;
    private boolean c0;
    private Rect d0;
    private Rect e0;
    private z f0;
    private C2557B g0;
    private OnBackInvokedDispatcher h0;
    private OnBackInvokedCallback i0;
    final Object j;
    final Context k;
    Window l;
    private n m;
    final InterfaceC2562d n;
    AbstractC2559a o;
    MenuInflater p;
    private CharSequence q;
    private ax.u.k r;
    private C0379h s;
    private t t;
    androidx.appcompat.view.a u;
    ActionBarContextView v;
    PopupWindow w;
    Runnable x;
    C1780n0 y;
    private boolean z;

    /* renamed from: ax.n.h$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C2566h layoutInflaterFactory2C2566h = LayoutInflaterFactory2C2566h.this;
            if ((layoutInflaterFactory2C2566h.a0 & 1) != 0) {
                layoutInflaterFactory2C2566h.l0(0);
            }
            LayoutInflaterFactory2C2566h layoutInflaterFactory2C2566h2 = LayoutInflaterFactory2C2566h.this;
            if ((layoutInflaterFactory2C2566h2.a0 & 4096) != 0) {
                layoutInflaterFactory2C2566h2.l0(108);
            }
            LayoutInflaterFactory2C2566h layoutInflaterFactory2C2566h3 = LayoutInflaterFactory2C2566h.this;
            layoutInflaterFactory2C2566h3.Z = false;
            layoutInflaterFactory2C2566h3.a0 = 0;
        }
    }

    /* renamed from: ax.n.h$b */
    class b implements I {
        b() {
        }

        @Override // ax.c0.I
        public F0 a(View view, F0 f0) {
            int l = f0.l();
            int h1 = LayoutInflaterFactory2C2566h.this.h1(f0, null);
            if (l != h1) {
                f0 = f0.p(f0.j(), h1, f0.k(), f0.i());
            }
            return C1760d0.X(view, f0);
        }
    }

    /* renamed from: ax.n.h$d */
    class d implements Runnable {

        /* renamed from: ax.n.h$d$a */
        class a extends C1784p0 {
            a() {
            }

            @Override // ax.c0.InterfaceC1782o0
            public void b(View view) {
                LayoutInflaterFactory2C2566h.this.v.setAlpha(1.0f);
                LayoutInflaterFactory2C2566h.this.y.g(null);
                LayoutInflaterFactory2C2566h.this.y = null;
            }

            @Override // ax.c0.C1784p0, ax.c0.InterfaceC1782o0
            public void c(View view) {
                LayoutInflaterFactory2C2566h.this.v.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C2566h layoutInflaterFactory2C2566h = LayoutInflaterFactory2C2566h.this;
            layoutInflaterFactory2C2566h.w.showAtLocation(layoutInflaterFactory2C2566h.v, 55, 0, 0);
            LayoutInflaterFactory2C2566h.this.m0();
            if (!LayoutInflaterFactory2C2566h.this.X0()) {
                LayoutInflaterFactory2C2566h.this.v.setAlpha(1.0f);
                LayoutInflaterFactory2C2566h.this.v.setVisibility(0);
            } else {
                LayoutInflaterFactory2C2566h.this.v.setAlpha(0.0f);
                LayoutInflaterFactory2C2566h layoutInflaterFactory2C2566h2 = LayoutInflaterFactory2C2566h.this;
                layoutInflaterFactory2C2566h2.y = C1760d0.e(layoutInflaterFactory2C2566h2.v).b(1.0f);
                LayoutInflaterFactory2C2566h.this.y.g(new a());
            }
        }
    }

    /* renamed from: ax.n.h$e */
    class e extends C1784p0 {
        e() {
        }

        @Override // ax.c0.InterfaceC1782o0
        public void b(View view) {
            LayoutInflaterFactory2C2566h.this.v.setAlpha(1.0f);
            LayoutInflaterFactory2C2566h.this.y.g(null);
            LayoutInflaterFactory2C2566h.this.y = null;
        }

        @Override // ax.c0.C1784p0, ax.c0.InterfaceC1782o0
        public void c(View view) {
            LayoutInflaterFactory2C2566h.this.v.setVisibility(0);
            if (LayoutInflaterFactory2C2566h.this.v.getParent() instanceof View) {
                C1760d0.i0((View) LayoutInflaterFactory2C2566h.this.v.getParent());
            }
        }
    }

    /* renamed from: ax.n.h$f */
    private class f implements InterfaceC2560b {
        f() {
        }
    }

    /* renamed from: ax.n.h$g */
    interface g {
        boolean a(int i);

        View onCreatePanelView(int i);
    }

    /* renamed from: ax.n.h$h, reason: collision with other inner class name */
    private final class C0379h implements j.a {
        C0379h() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
            LayoutInflaterFactory2C2566h.this.c0(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback y0 = LayoutInflaterFactory2C2566h.this.y0();
            if (y0 == null) {
                return true;
            }
            y0.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* renamed from: ax.n.h$i */
    class i implements a.InterfaceC0007a {
        private a.InterfaceC0007a a;

        /* renamed from: ax.n.h$i$a */
        class a extends C1784p0 {
            a() {
            }

            @Override // ax.c0.InterfaceC1782o0
            public void b(View view) {
                LayoutInflaterFactory2C2566h.this.v.setVisibility(8);
                LayoutInflaterFactory2C2566h layoutInflaterFactory2C2566h = LayoutInflaterFactory2C2566h.this;
                PopupWindow popupWindow = layoutInflaterFactory2C2566h.w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C2566h.v.getParent() instanceof View) {
                    C1760d0.i0((View) LayoutInflaterFactory2C2566h.this.v.getParent());
                }
                LayoutInflaterFactory2C2566h.this.v.k();
                LayoutInflaterFactory2C2566h.this.y.g(null);
                LayoutInflaterFactory2C2566h layoutInflaterFactory2C2566h2 = LayoutInflaterFactory2C2566h.this;
                layoutInflaterFactory2C2566h2.y = null;
                C1760d0.i0(layoutInflaterFactory2C2566h2.B);
            }
        }

        public i(a.InterfaceC0007a interfaceC0007a) {
            this.a = interfaceC0007a;
        }

        @Override // androidx.appcompat.view.a.InterfaceC0007a
        public void a(androidx.appcompat.view.a aVar) {
            this.a.a(aVar);
            LayoutInflaterFactory2C2566h layoutInflaterFactory2C2566h = LayoutInflaterFactory2C2566h.this;
            if (layoutInflaterFactory2C2566h.w != null) {
                layoutInflaterFactory2C2566h.l.getDecorView().removeCallbacks(LayoutInflaterFactory2C2566h.this.x);
            }
            LayoutInflaterFactory2C2566h layoutInflaterFactory2C2566h2 = LayoutInflaterFactory2C2566h.this;
            if (layoutInflaterFactory2C2566h2.v != null) {
                layoutInflaterFactory2C2566h2.m0();
                LayoutInflaterFactory2C2566h layoutInflaterFactory2C2566h3 = LayoutInflaterFactory2C2566h.this;
                layoutInflaterFactory2C2566h3.y = C1760d0.e(layoutInflaterFactory2C2566h3.v).b(0.0f);
                LayoutInflaterFactory2C2566h.this.y.g(new a());
            }
            LayoutInflaterFactory2C2566h layoutInflaterFactory2C2566h4 = LayoutInflaterFactory2C2566h.this;
            InterfaceC2562d interfaceC2562d = layoutInflaterFactory2C2566h4.n;
            if (interfaceC2562d != null) {
                interfaceC2562d.onSupportActionModeFinished(layoutInflaterFactory2C2566h4.u);
            }
            LayoutInflaterFactory2C2566h layoutInflaterFactory2C2566h5 = LayoutInflaterFactory2C2566h.this;
            layoutInflaterFactory2C2566h5.u = null;
            C1760d0.i0(layoutInflaterFactory2C2566h5.B);
            LayoutInflaterFactory2C2566h.this.f1();
        }

        @Override // androidx.appcompat.view.a.InterfaceC0007a
        public boolean b(androidx.appcompat.view.a aVar, Menu menu) {
            return this.a.b(aVar, menu);
        }

        @Override // androidx.appcompat.view.a.InterfaceC0007a
        public boolean c(androidx.appcompat.view.a aVar, Menu menu) {
            C1760d0.i0(LayoutInflaterFactory2C2566h.this.B);
            return this.a.c(aVar, menu);
        }

        @Override // androidx.appcompat.view.a.InterfaceC0007a
        public boolean d(androidx.appcompat.view.a aVar, MenuItem menuItem) {
            return this.a.d(aVar, menuItem);
        }
    }

    /* renamed from: ax.n.h$j */
    static class j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* renamed from: ax.n.h$k */
    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (equals) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static ax.Y.h b(Configuration configuration) {
            LocaleList locales;
            String languageTags;
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            return ax.Y.h.c(languageTags);
        }

        public static void c(ax.Y.h hVar) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(hVar.h());
            LocaleList.setDefault(forLanguageTags);
        }

        static void d(Configuration configuration, ax.Y.h hVar) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(hVar.h());
            configuration.setLocales(forLanguageTags);
        }
    }

    /* renamed from: ax.n.h$l */
    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            i = configuration.colorMode;
            int i9 = i & 3;
            i2 = configuration2.colorMode;
            if (i9 != (i2 & 3)) {
                i7 = configuration3.colorMode;
                i8 = configuration2.colorMode;
                configuration3.colorMode = i7 | (i8 & 3);
            }
            i3 = configuration.colorMode;
            int i10 = i3 & 12;
            i4 = configuration2.colorMode;
            if (i10 != (i4 & 12)) {
                i5 = configuration3.colorMode;
                i6 = configuration2.colorMode;
                configuration3.colorMode = i5 | (i6 & 12);
            }
        }
    }

    /* renamed from: ax.n.h$m */
    static class m {
        static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        static OnBackInvokedCallback b(Object obj, final LayoutInflaterFactory2C2566h layoutInflaterFactory2C2566h) {
            Objects.requireNonNull(layoutInflaterFactory2C2566h);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: ax.n.v
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    LayoutInflaterFactory2C2566h.this.G0();
                }
            };
            ax.n.r.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            ax.n.r.a(obj).unregisterOnBackInvokedCallback(ax.n.q.a(obj2));
        }
    }

    /* renamed from: ax.n.h$o */
    private class o extends p {
        private final PowerManager c;

        o(Context context) {
            super();
            this.c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // ax.n.LayoutInflaterFactory2C2566h.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // ax.n.LayoutInflaterFactory2C2566h.p
        public int c() {
            return j.a(this.c) ? 2 : 1;
        }

        @Override // ax.n.LayoutInflaterFactory2C2566h.p
        public void d() {
            LayoutInflaterFactory2C2566h.this.f();
        }
    }

    /* renamed from: ax.n.h$p */
    abstract class p {
        private BroadcastReceiver a;

        /* renamed from: ax.n.h$p$a */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        p() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflaterFactory2C2566h.this.k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b = b();
            if (b == null || b.countActions() == 0) {
                return;
            }
            if (this.a == null) {
                this.a = new a();
            }
            LayoutInflaterFactory2C2566h.this.k.registerReceiver(this.a, b);
        }
    }

    /* renamed from: ax.n.h$q */
    private class q extends p {
        private final G c;

        q(G g) {
            super();
            this.c = g;
        }

        @Override // ax.n.LayoutInflaterFactory2C2566h.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // ax.n.LayoutInflaterFactory2C2566h.p
        public int c() {
            return this.c.d() ? 2 : 1;
        }

        @Override // ax.n.LayoutInflaterFactory2C2566h.p
        public void d() {
            LayoutInflaterFactory2C2566h.this.f();
        }
    }

    /* renamed from: ax.n.h$r */
    private class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        private boolean b(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C2566h.this.k0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LayoutInflaterFactory2C2566h.this.e0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C2653a.b(getContext(), i));
        }
    }

    /* renamed from: ax.n.h$s */
    protected static final class s {
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        ViewGroup g;
        View h;
        View i;
        androidx.appcompat.view.menu.e j;
        androidx.appcompat.view.menu.c k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        s(int i) {
            this.a = i;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.l, ax.m.g.j);
                this.k = cVar;
                cVar.h(aVar);
                this.j.b(this.k);
            }
            return this.k.c(this.g);
        }

        public boolean b() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.b().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.P(this.k);
            }
            this.j = eVar;
            if (eVar == null || (cVar = this.k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C2506a.a, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C2506a.H, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(ax.m.i.c, true);
            }
            C3036c c3036c = new C3036c(context, 0);
            c3036c.getTheme().setTo(newTheme);
            this.l = c3036c;
            TypedArray obtainStyledAttributes = c3036c.obtainStyledAttributes(ax.m.j.y0);
            this.b = obtainStyledAttributes.getResourceId(ax.m.j.B0, 0);
            this.f = obtainStyledAttributes.getResourceId(ax.m.j.A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: ax.n.h$t */
    private final class t implements j.a {
        t() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z) {
            androidx.appcompat.view.menu.e D = eVar.D();
            boolean z2 = D != eVar;
            LayoutInflaterFactory2C2566h layoutInflaterFactory2C2566h = LayoutInflaterFactory2C2566h.this;
            if (z2) {
                eVar = D;
            }
            s p0 = layoutInflaterFactory2C2566h.p0(eVar);
            if (p0 != null) {
                if (!z2) {
                    LayoutInflaterFactory2C2566h.this.f0(p0, z);
                } else {
                    LayoutInflaterFactory2C2566h.this.b0(p0.a, p0, D);
                    LayoutInflaterFactory2C2566h.this.f0(p0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback y0;
            if (eVar != eVar.D()) {
                return true;
            }
            LayoutInflaterFactory2C2566h layoutInflaterFactory2C2566h = LayoutInflaterFactory2C2566h.this;
            if (!layoutInflaterFactory2C2566h.G || (y0 = layoutInflaterFactory2C2566h.y0()) == null || LayoutInflaterFactory2C2566h.this.R) {
                return true;
            }
            y0.onMenuOpened(108, eVar);
            return true;
        }
    }

    LayoutInflaterFactory2C2566h(Activity activity, InterfaceC2562d interfaceC2562d) {
        this(activity, null, interfaceC2562d, activity);
    }

    private boolean A0(s sVar) {
        View view = sVar.i;
        if (view != null) {
            sVar.h = view;
            return true;
        }
        if (sVar.j == null) {
            return false;
        }
        if (this.t == null) {
            this.t = new t();
        }
        View view2 = (View) sVar.a(this.t);
        sVar.h = view2;
        return view2 != null;
    }

    private boolean B0(s sVar) {
        sVar.d(r0());
        sVar.g = new r(sVar.l);
        sVar.c = 81;
        return true;
    }

    private boolean C0(s sVar) {
        Resources.Theme theme;
        Context context = this.k;
        int i2 = sVar.a;
        if ((i2 == 0 || i2 == 108) && this.r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(C2506a.f, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(C2506a.g, typedValue, true);
            } else {
                theme2.resolveAttribute(C2506a.g, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                C3036c c3036c = new C3036c(context, 0);
                c3036c.getTheme().setTo(theme);
                context = c3036c;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.S(this);
        sVar.c(eVar);
        return true;
    }

    private void D0(int i2) {
        this.a0 = (1 << i2) | this.a0;
        if (this.Z) {
            return;
        }
        C1760d0.d0(this.l.getDecorView(), this.b0);
        this.Z = true;
    }

    private boolean I0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        s w0 = w0(i2, true);
        if (w0.o) {
            return false;
        }
        return S0(w0, keyEvent);
    }

    private boolean L0(int i2, KeyEvent keyEvent) {
        boolean z;
        ax.u.k kVar;
        if (this.u != null) {
            return false;
        }
        boolean z2 = true;
        s w0 = w0(i2, true);
        if (i2 != 0 || (kVar = this.r) == null || !kVar.i() || ViewConfiguration.get(this.k).hasPermanentMenuKey()) {
            boolean z3 = w0.o;
            if (z3 || w0.n) {
                f0(w0, true);
                z2 = z3;
            } else {
                if (w0.m) {
                    if (w0.r) {
                        w0.m = false;
                        z = S0(w0, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        P0(w0, keyEvent);
                    }
                }
                z2 = false;
            }
        } else if (this.r.d()) {
            z2 = this.r.k();
        } else {
            if (!this.R && S0(w0, keyEvent)) {
                z2 = this.r.l();
            }
            z2 = false;
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.k.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return z2;
            }
            Log.w("AppCompatDelegate", "Couldn't get audio manager");
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void P0(ax.n.LayoutInflaterFactory2C2566h.s r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.n.LayoutInflaterFactory2C2566h.P0(ax.n.h$s, android.view.KeyEvent):void");
    }

    private boolean R0(s sVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.e eVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.m || S0(sVar, keyEvent)) && (eVar = sVar.j) != null) {
            z = eVar.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.r == null) {
            f0(sVar, true);
        }
        return z;
    }

    private boolean S0(s sVar, KeyEvent keyEvent) {
        ax.u.k kVar;
        ax.u.k kVar2;
        ax.u.k kVar3;
        if (this.R) {
            return false;
        }
        if (sVar.m) {
            return true;
        }
        s sVar2 = this.N;
        if (sVar2 != null && sVar2 != sVar) {
            f0(sVar2, false);
        }
        Window.Callback y0 = y0();
        if (y0 != null) {
            sVar.i = y0.onCreatePanelView(sVar.a);
        }
        int i2 = sVar.a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (kVar3 = this.r) != null) {
            kVar3.g();
        }
        if (sVar.i == null && (!z || !(Q0() instanceof E))) {
            androidx.appcompat.view.menu.e eVar = sVar.j;
            if (eVar == null || sVar.r) {
                if (eVar == null && (!C0(sVar) || sVar.j == null)) {
                    return false;
                }
                if (z && this.r != null) {
                    if (this.s == null) {
                        this.s = new C0379h();
                    }
                    this.r.c(sVar.j, this.s);
                }
                sVar.j.f0();
                if (!y0.onCreatePanelMenu(sVar.a, sVar.j)) {
                    sVar.c(null);
                    if (z && (kVar = this.r) != null) {
                        kVar.c(null, this.s);
                    }
                    return false;
                }
                sVar.r = false;
            }
            sVar.j.f0();
            Bundle bundle = sVar.s;
            if (bundle != null) {
                sVar.j.Q(bundle);
                sVar.s = null;
            }
            if (!y0.onPreparePanel(0, sVar.i, sVar.j)) {
                if (z && (kVar2 = this.r) != null) {
                    kVar2.c(null, this.s);
                }
                sVar.j.e0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.p = z2;
            sVar.j.setQwertyMode(z2);
            sVar.j.e0();
        }
        sVar.m = true;
        sVar.n = false;
        this.N = sVar;
        return true;
    }

    private void T0(boolean z) {
        ax.u.k kVar = this.r;
        if (kVar == null || !kVar.i() || (ViewConfiguration.get(this.k).hasPermanentMenuKey() && !this.r.j())) {
            s w0 = w0(0, true);
            w0.q = true;
            f0(w0, false);
            P0(w0, null);
            return;
        }
        Window.Callback y0 = y0();
        if (this.r.d() && z) {
            this.r.k();
            if (this.R) {
                return;
            }
            y0.onPanelClosed(108, w0(0, true).j);
            return;
        }
        if (y0 == null || this.R) {
            return;
        }
        if (this.Z && (this.a0 & 1) != 0) {
            this.l.getDecorView().removeCallbacks(this.b0);
            this.b0.run();
        }
        s w02 = w0(0, true);
        androidx.appcompat.view.menu.e eVar = w02.j;
        if (eVar == null || w02.r || !y0.onPreparePanel(0, w02.i, eVar)) {
            return;
        }
        y0.onMenuOpened(108, w02.j);
        this.r.l();
    }

    private int U0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i2 != 9) {
            return i2;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean V(boolean z) {
        return W(z, true);
    }

    private boolean W(boolean z, boolean z2) {
        if (this.R) {
            return false;
        }
        int a0 = a0();
        int F0 = F0(this.k, a0);
        ax.Y.h Z = Build.VERSION.SDK_INT < 33 ? Z(this.k) : null;
        if (!z2 && Z != null) {
            Z = v0(this.k.getResources().getConfiguration());
        }
        boolean e1 = e1(F0, Z, z);
        if (a0 == 0) {
            u0(this.k).e();
        } else {
            p pVar = this.X;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (a0 == 3) {
            t0(this.k).e();
            return e1;
        }
        p pVar2 = this.Y;
        if (pVar2 != null) {
            pVar2.a();
        }
        return e1;
    }

    private void X() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.B.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.k.obtainStyledAttributes(ax.m.j.y0);
        obtainStyledAttributes.getValue(ax.m.j.K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(ax.m.j.L0, contentFrameLayout.getMinWidthMinor());
        int i2 = ax.m.j.I0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = ax.m.j.J0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = ax.m.j.G0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = ax.m.j.H0;
        if (obtainStyledAttributes.hasValue(i5)) {
            obtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void Y(Window window) {
        if (this.l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(callback);
        this.m = nVar;
        window.setCallback(nVar);
        L u = L.u(this.k, null, l0);
        Drawable h = u.h(0);
        if (h != null) {
            window.setBackgroundDrawable(h);
        }
        u.x();
        this.l = window;
        if (Build.VERSION.SDK_INT < 33 || this.h0 != null) {
            return;
        }
        O(null);
    }

    private boolean Y0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int a0() {
        int i2 = this.T;
        return i2 != -100 ? i2 : AbstractC2564f.o();
    }

    private void b1() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private ActivityC2561c c1() {
        for (Context context = this.k; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof ActivityC2561c) {
                return (ActivityC2561c) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void d0() {
        p pVar = this.X;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.Y;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d1(Configuration configuration) {
        Activity activity = (Activity) this.j;
        if (activity instanceof ax.G0.h) {
            if (((ax.G0.h) activity).getLifecycle().b().h(d.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.Q || this.R) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean e1(int r11, ax.Y.h r12, boolean r13) {
        /*
            r10 = this;
            android.content.Context r1 = r10.k
            r4 = 0
            r5 = 0
            r0 = r10
            r2 = r11
            r3 = r12
            android.content.res.Configuration r11 = r0.g0(r1, r2, r3, r4, r5)
            android.content.Context r12 = r0.k
            int r12 = r10.s0(r12)
            android.content.res.Configuration r1 = r0.S
            if (r1 != 0) goto L1f
            android.content.Context r1 = r0.k
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
        L1f:
            int r4 = r1.uiMode
            r4 = r4 & 48
            int r5 = r11.uiMode
            r5 = r5 & 48
            ax.Y.h r1 = r10.v0(r1)
            r6 = 0
            if (r3 != 0) goto L30
            r7 = r6
            goto L34
        L30:
            ax.Y.h r7 = r10.v0(r11)
        L34:
            r8 = 0
            if (r4 == r5) goto L3a
            r4 = 512(0x200, float:7.175E-43)
            goto L3b
        L3a:
            r4 = 0
        L3b:
            if (r7 == 0) goto L45
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L45
            r4 = r4 | 8196(0x2004, float:1.1485E-41)
        L45:
            int r1 = ~r12
            r1 = r1 & r4
            r9 = 1
            if (r1 == 0) goto L8c
            if (r13 == 0) goto L8c
            boolean r13 = r0.P
            if (r13 == 0) goto L8c
            boolean r13 = ax.n.LayoutInflaterFactory2C2566h.m0
            if (r13 != 0) goto L58
            boolean r13 = r0.Q
            if (r13 == 0) goto L8c
        L58:
            java.lang.Object r13 = r0.j
            boolean r1 = r13 instanceof android.app.Activity
            if (r1 == 0) goto L8c
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r13 = r13.isChild()
            if (r13 != 0) goto L8c
            int r13 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r13 < r1) goto L83
            r13 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r13 == 0) goto L83
            java.lang.Object r13 = r0.j
            android.app.Activity r13 = (android.app.Activity) r13
            android.view.Window r13 = r13.getWindow()
            android.view.View r13 = r13.getDecorView()
            int r11 = r11.getLayoutDirection()
            r13.setLayoutDirection(r11)
        L83:
            java.lang.Object r11 = r0.j
            android.app.Activity r11 = (android.app.Activity) r11
            ax.P.b.r(r11)
            r11 = 1
            goto L8d
        L8c:
            r11 = 0
        L8d:
            if (r11 != 0) goto L9a
            if (r4 == 0) goto L9a
            r11 = r4 & r12
            if (r11 != r4) goto L96
            r8 = 1
        L96:
            r10.g1(r5, r7, r8, r6)
            goto L9b
        L9a:
            r9 = r11
        L9b:
            if (r9 == 0) goto Lb7
            java.lang.Object r11 = r0.j
            boolean r12 = r11 instanceof ax.n.ActivityC2561c
            if (r12 == 0) goto Lb7
            r12 = r4 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto Lac
            ax.n.c r11 = (ax.n.ActivityC2561c) r11
            r11.onNightModeChanged(r2)
        Lac:
            r11 = r4 & 4
            if (r11 == 0) goto Lb7
            java.lang.Object r11 = r0.j
            ax.n.c r11 = (ax.n.ActivityC2561c) r11
            r11.onLocalesChanged(r3)
        Lb7:
            if (r7 == 0) goto Lca
            android.content.Context r11 = r0.k
            android.content.res.Resources r11 = r11.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            ax.Y.h r11 = r10.v0(r11)
            r10.W0(r11)
        Lca:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.n.LayoutInflaterFactory2C2566h.e1(int, ax.Y.h, boolean):boolean");
    }

    private Configuration g0(Context context, int i2, ax.Y.h hVar, Configuration configuration, boolean z) {
        int i3 = i2 != 1 ? i2 != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            V0(configuration2, hVar);
        }
        return configuration2;
    }

    private void g1(int i2, ax.Y.h hVar, boolean z, Configuration configuration) {
        Resources resources = this.k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        if (hVar != null) {
            V0(configuration2, hVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            D.a(resources);
        }
        int i4 = this.U;
        if (i4 != 0) {
            this.k.setTheme(i4);
            if (i3 >= 23) {
                this.k.getTheme().applyStyle(this.U, true);
            }
        }
        if (z && (this.j instanceof Activity)) {
            d1(configuration2);
        }
    }

    private ViewGroup h0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.k.obtainStyledAttributes(ax.m.j.y0);
        int i2 = ax.m.j.D0;
        if (!obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(ax.m.j.M0, false)) {
            I(1);
        } else if (obtainStyledAttributes.getBoolean(i2, false)) {
            I(108);
        }
        if (obtainStyledAttributes.getBoolean(ax.m.j.E0, false)) {
            I(109);
        }
        if (obtainStyledAttributes.getBoolean(ax.m.j.F0, false)) {
            I(10);
        }
        this.J = obtainStyledAttributes.getBoolean(ax.m.j.z0, false);
        obtainStyledAttributes.recycle();
        o0();
        this.l.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.k);
        if (this.K) {
            viewGroup = this.I ? (ViewGroup) from.inflate(ax.m.g.o, (ViewGroup) null) : (ViewGroup) from.inflate(ax.m.g.n, (ViewGroup) null);
        } else if (this.J) {
            viewGroup = (ViewGroup) from.inflate(ax.m.g.f, (ViewGroup) null);
            this.H = false;
            this.G = false;
        } else if (this.G) {
            TypedValue typedValue = new TypedValue();
            this.k.getTheme().resolveAttribute(C2506a.f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C3036c(this.k, typedValue.resourceId) : this.k).inflate(ax.m.g.p, (ViewGroup) null);
            ax.u.k kVar = (ax.u.k) viewGroup.findViewById(ax.m.f.p);
            this.r = kVar;
            kVar.setWindowCallback(y0());
            if (this.H) {
                this.r.m(109);
            }
            if (this.E) {
                this.r.m(2);
            }
            if (this.F) {
                this.r.m(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.J + ", windowActionModeOverlay: " + this.I + ", windowNoTitle: " + this.K + " }");
        }
        C1760d0.v0(viewGroup, new b());
        if (this.r == null) {
            this.C = (TextView) viewGroup.findViewById(ax.m.f.D);
        }
        O.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(ax.m.f.b);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void i1(View view) {
        view.setBackgroundColor((C1760d0.L(view) & 8192) != 0 ? ax.Q.b.c(this.k, C2508c.b) : ax.Q.b.c(this.k, C2508c.a));
    }

    private void n0() {
        if (this.A) {
            return;
        }
        this.B = h0();
        CharSequence x0 = x0();
        if (!TextUtils.isEmpty(x0)) {
            ax.u.k kVar = this.r;
            if (kVar != null) {
                kVar.setWindowTitle(x0);
            } else if (Q0() != null) {
                Q0().I(x0);
            } else {
                TextView textView = this.C;
                if (textView != null) {
                    textView.setText(x0);
                }
            }
        }
        X();
        O0(this.B);
        this.A = true;
        s w0 = w0(0, false);
        if (this.R) {
            return;
        }
        if (w0 == null || w0.j == null) {
            D0(108);
        }
    }

    private void o0() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                Y(((Activity) obj).getWindow());
            }
        }
        if (this.l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration q0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                k.a(configuration, configuration2, configuration3);
            } else if (!C1441b.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i7 = configuration.touchscreen;
            int i8 = configuration2.touchscreen;
            if (i7 != i8) {
                configuration3.touchscreen = i8;
            }
            int i9 = configuration.keyboard;
            int i10 = configuration2.keyboard;
            if (i9 != i10) {
                configuration3.keyboard = i10;
            }
            int i11 = configuration.keyboardHidden;
            int i12 = configuration2.keyboardHidden;
            if (i11 != i12) {
                configuration3.keyboardHidden = i12;
            }
            int i13 = configuration.navigation;
            int i14 = configuration2.navigation;
            if (i13 != i14) {
                configuration3.navigation = i14;
            }
            int i15 = configuration.navigationHidden;
            int i16 = configuration2.navigationHidden;
            if (i15 != i16) {
                configuration3.navigationHidden = i16;
            }
            int i17 = configuration.orientation;
            int i18 = configuration2.orientation;
            if (i17 != i18) {
                configuration3.orientation = i18;
            }
            int i19 = configuration.screenLayout & 15;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 15)) {
                configuration3.screenLayout |= i20 & 15;
            }
            int i21 = configuration.screenLayout & 192;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 192)) {
                configuration3.screenLayout |= i22 & 192;
            }
            int i23 = configuration.screenLayout & 48;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 48)) {
                configuration3.screenLayout |= i24 & 48;
            }
            int i25 = configuration.screenLayout & 768;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 768)) {
                configuration3.screenLayout |= i26 & 768;
            }
            if (i6 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i27 = configuration.uiMode & 15;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 15)) {
                configuration3.uiMode |= i28 & 15;
            }
            int i29 = configuration.uiMode & 48;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 48)) {
                configuration3.uiMode |= i30 & 48;
            }
            int i31 = configuration.screenWidthDp;
            int i32 = configuration2.screenWidthDp;
            if (i31 != i32) {
                configuration3.screenWidthDp = i32;
            }
            int i33 = configuration.screenHeightDp;
            int i34 = configuration2.screenHeightDp;
            if (i33 != i34) {
                configuration3.screenHeightDp = i34;
            }
            int i35 = configuration.smallestScreenWidthDp;
            int i36 = configuration2.smallestScreenWidthDp;
            if (i35 != i36) {
                configuration3.smallestScreenWidthDp = i36;
            }
            int i37 = configuration.densityDpi;
            int i38 = configuration2.densityDpi;
            if (i37 != i38) {
                configuration3.densityDpi = i38;
            }
        }
        return configuration3;
    }

    private int s0(Context context) {
        if (!this.W && (this.j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.j.getClass()), i2 >= 29 ? 269221888 : i2 >= 24 ? 786432 : 0);
                if (activityInfo != null) {
                    this.V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.V = 0;
            }
        }
        this.W = true;
        return this.V;
    }

    private p t0(Context context) {
        if (this.Y == null) {
            this.Y = new o(context);
        }
        return this.Y;
    }

    private p u0(Context context) {
        if (this.X == null) {
            this.X = new q(G.a(context));
        }
        return this.X;
    }

    private void z0() {
        n0();
        if (this.G && this.o == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.o = new H((Activity) this.j, this.H);
            } else if (obj instanceof Dialog) {
                this.o = new H((Dialog) this.j);
            }
            AbstractC2559a abstractC2559a = this.o;
            if (abstractC2559a != null) {
                abstractC2559a.w(this.c0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // ax.n.AbstractC2564f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            ax.n.AbstractC2564f.G(r3)
        L9:
            boolean r0 = r3.Z
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.b0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.R = r0
            int r0 = r3.T
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            ax.B.k<java.lang.String, java.lang.Integer> r0 = ax.n.LayoutInflaterFactory2C2566h.j0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            ax.B.k<java.lang.String, java.lang.Integer> r0 = ax.n.LayoutInflaterFactory2C2566h.j0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            ax.n.a r0 = r3.o
            if (r0 == 0) goto L5b
            r0.r()
        L5b:
            r3.d0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.n.LayoutInflaterFactory2C2566h.A():void");
    }

    @Override // ax.n.AbstractC2564f
    public void B(Bundle bundle) {
        n0();
    }

    @Override // ax.n.AbstractC2564f
    public void C() {
        AbstractC2559a u = u();
        if (u != null) {
            u.E(true);
        }
    }

    @Override // ax.n.AbstractC2564f
    public void E() {
        W(true, false);
    }

    public boolean E0() {
        return this.z;
    }

    @Override // ax.n.AbstractC2564f
    public void F() {
        AbstractC2559a u = u();
        if (u != null) {
            u.E(false);
        }
    }

    int F0(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return u0(context).c();
                }
                return -1;
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    return t0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i2;
    }

    boolean G0() {
        boolean z = this.O;
        this.O = false;
        s w0 = w0(0, false);
        if (w0 != null && w0.o) {
            if (!z) {
                f0(w0, true);
            }
            return true;
        }
        androidx.appcompat.view.a aVar = this.u;
        if (aVar != null) {
            aVar.c();
            return true;
        }
        AbstractC2559a u = u();
        return u != null && u.i();
    }

    boolean H0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.O = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            I0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // ax.n.AbstractC2564f
    public boolean I(int i2) {
        int U0 = U0(i2);
        if (this.K && U0 == 108) {
            return false;
        }
        if (this.G && U0 == 1) {
            this.G = false;
        }
        if (U0 == 1) {
            b1();
            this.K = true;
            return true;
        }
        if (U0 == 2) {
            b1();
            this.E = true;
            return true;
        }
        if (U0 == 5) {
            b1();
            this.F = true;
            return true;
        }
        if (U0 == 10) {
            b1();
            this.I = true;
            return true;
        }
        if (U0 == 108) {
            b1();
            this.G = true;
            return true;
        }
        if (U0 != 109) {
            return this.l.requestFeature(U0);
        }
        b1();
        this.H = true;
        return true;
    }

    boolean J0(int i2, KeyEvent keyEvent) {
        AbstractC2559a u = u();
        if (u != null && u.s(i2, keyEvent)) {
            return true;
        }
        s sVar = this.N;
        if (sVar != null && R0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            s sVar2 = this.N;
            if (sVar2 != null) {
                sVar2.n = true;
            }
            return true;
        }
        if (this.N == null) {
            s w0 = w0(0, true);
            S0(w0, keyEvent);
            boolean R0 = R0(w0, keyEvent.getKeyCode(), keyEvent, 1);
            w0.m = false;
            if (R0) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.n.AbstractC2564f
    public void K(int i2) {
        n0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i2, viewGroup);
        this.m.c(this.l.getCallback());
    }

    boolean K0(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            if (i2 == 82) {
                L0(0, keyEvent);
                return true;
            }
        } else if (G0()) {
            return true;
        }
        return false;
    }

    @Override // ax.n.AbstractC2564f
    public void L(View view) {
        n0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.c(this.l.getCallback());
    }

    @Override // ax.n.AbstractC2564f
    public void M(View view, ViewGroup.LayoutParams layoutParams) {
        n0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.c(this.l.getCallback());
    }

    void M0(int i2) {
        AbstractC2559a u;
        if (i2 != 108 || (u = u()) == null) {
            return;
        }
        u.j(true);
    }

    void N0(int i2) {
        if (i2 == 108) {
            AbstractC2559a u = u();
            if (u != null) {
                u.j(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            s w0 = w0(i2, true);
            if (w0.o) {
                f0(w0, false);
            }
        }
    }

    @Override // ax.n.AbstractC2564f
    public void O(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.O(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.h0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.i0) != null) {
            m.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.i0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.j;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.h0 = m.a((Activity) this.j);
                f1();
            }
        }
        this.h0 = onBackInvokedDispatcher;
        f1();
    }

    @Override // ax.n.AbstractC2564f
    public void P(Toolbar toolbar) {
        if (this.j instanceof Activity) {
            AbstractC2559a u = u();
            if (u instanceof H) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.p = null;
            if (u != null) {
                u.r();
            }
            this.o = null;
            if (toolbar != null) {
                E e2 = new E(toolbar, x0(), this.m);
                this.o = e2;
                this.m.e(e2.c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.m.e(null);
            }
            w();
        }
    }

    @Override // ax.n.AbstractC2564f
    public void Q(int i2) {
        this.U = i2;
    }

    final AbstractC2559a Q0() {
        return this.o;
    }

    @Override // ax.n.AbstractC2564f
    public final void R(CharSequence charSequence) {
        this.q = charSequence;
        ax.u.k kVar = this.r;
        if (kVar != null) {
            kVar.setWindowTitle(charSequence);
            return;
        }
        if (Q0() != null) {
            Q0().I(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // ax.n.AbstractC2564f
    public androidx.appcompat.view.a S(a.InterfaceC0007a interfaceC0007a) {
        InterfaceC2562d interfaceC2562d;
        if (interfaceC0007a == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.a aVar = this.u;
        if (aVar != null) {
            aVar.c();
        }
        i iVar = new i(interfaceC0007a);
        AbstractC2559a u = u();
        if (u != null) {
            androidx.appcompat.view.a K = u.K(iVar);
            this.u = K;
            if (K != null && (interfaceC2562d = this.n) != null) {
                interfaceC2562d.onSupportActionModeStarted(K);
            }
        }
        if (this.u == null) {
            this.u = a1(iVar);
        }
        f1();
        return this.u;
    }

    void V0(Configuration configuration, ax.Y.h hVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            k.d(configuration, hVar);
        } else {
            configuration.setLocale(hVar.d(0));
            configuration.setLayoutDirection(hVar.d(0));
        }
    }

    void W0(ax.Y.h hVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            k.c(hVar);
        } else {
            Locale.setDefault(hVar.d(0));
        }
    }

    final boolean X0() {
        ViewGroup viewGroup;
        return this.A && (viewGroup = this.B) != null && viewGroup.isLaidOut();
    }

    ax.Y.h Z(Context context) {
        ax.Y.h t2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33 || (t2 = AbstractC2564f.t()) == null) {
            return null;
        }
        ax.Y.h v0 = v0(context.getApplicationContext().getResources().getConfiguration());
        ax.Y.h b2 = i2 >= 24 ? C2558C.b(t2, v0) : t2.f() ? ax.Y.h.e() : ax.Y.h.c(j.b(t2.d(0)));
        return b2.f() ? v0 : b2;
    }

    boolean Z0() {
        if (this.h0 == null) {
            return false;
        }
        s w0 = w0(0, false);
        return (w0 != null && w0.o) || this.u != null;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        s p0;
        Window.Callback y0 = y0();
        if (y0 == null || this.R || (p0 = p0(eVar.D())) == null) {
            return false;
        }
        return y0.onMenuItemSelected(p0.a, menuItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.appcompat.view.a a1(androidx.appcompat.view.a.InterfaceC0007a r8) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.n.LayoutInflaterFactory2C2566h.a1(androidx.appcompat.view.a$a):androidx.appcompat.view.a");
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        T0(true);
    }

    void b0(int i2, s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i2 >= 0) {
                s[] sVarArr = this.M;
                if (i2 < sVarArr.length) {
                    sVar = sVarArr[i2];
                }
            }
            if (sVar != null) {
                menu = sVar.j;
            }
        }
        if ((sVar == null || sVar.o) && !this.R) {
            this.m.d(this.l.getCallback(), i2, menu);
        }
    }

    void c0(androidx.appcompat.view.menu.e eVar) {
        if (this.L) {
            return;
        }
        this.L = true;
        this.r.n();
        Window.Callback y0 = y0();
        if (y0 != null && !this.R) {
            y0.onPanelClosed(108, eVar);
        }
        this.L = false;
    }

    @Override // ax.n.AbstractC2564f
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        n0();
        ((ViewGroup) this.B.findViewById(R.id.content)).addView(view, layoutParams);
        this.m.c(this.l.getCallback());
    }

    void e0(int i2) {
        f0(w0(i2, true), true);
    }

    @Override // ax.n.AbstractC2564f
    public boolean f() {
        return V(true);
    }

    void f0(s sVar, boolean z) {
        ViewGroup viewGroup;
        ax.u.k kVar;
        if (z && sVar.a == 0 && (kVar = this.r) != null && kVar.d()) {
            c0(sVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && sVar.o && (viewGroup = sVar.g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                b0(sVar.a, sVar, null);
            }
        }
        sVar.m = false;
        sVar.n = false;
        sVar.o = false;
        sVar.h = null;
        sVar.q = true;
        if (this.N == sVar) {
            this.N = null;
        }
        if (sVar.a == 0) {
            f1();
        }
    }

    void f1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean Z0 = Z0();
            if (Z0 && this.i0 == null) {
                this.i0 = m.b(this.h0, this);
            } else {
                if (Z0 || (onBackInvokedCallback = this.i0) == null) {
                    return;
                }
                m.c(this.h0, onBackInvokedCallback);
                this.i0 = null;
            }
        }
    }

    final int h1(F0 f0, Rect rect) {
        boolean z;
        boolean z2;
        int l2 = f0 != null ? f0.l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.v.getLayoutParams();
            if (this.v.isShown()) {
                if (this.d0 == null) {
                    this.d0 = new Rect();
                    this.e0 = new Rect();
                }
                Rect rect2 = this.d0;
                Rect rect3 = this.e0;
                if (f0 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(f0.j(), f0.l(), f0.k(), f0.i());
                }
                O.a(this.B, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                F0 G = C1760d0.G(this.B);
                int j2 = G == null ? 0 : G.j();
                int k2 = G == null ? 0 : G.k();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || this.D != null) {
                    View view = this.D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != j2 || marginLayoutParams2.rightMargin != k2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = j2;
                            marginLayoutParams2.rightMargin = k2;
                            this.D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.k);
                    this.D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = j2;
                    layoutParams.rightMargin = k2;
                    this.B.addView(this.D, -1, layoutParams);
                }
                View view3 = this.D;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    i1(this.D);
                }
                if (!this.I && r5) {
                    l2 = 0;
                }
                z = r5;
                r5 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r5 = false;
            }
            if (r5) {
                this.v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.D;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return l2;
    }

    @Override // ax.n.AbstractC2564f
    public Context i(Context context) {
        Context context2;
        this.P = true;
        int F0 = F0(context, a0());
        if (AbstractC2564f.x(context)) {
            AbstractC2564f.U(context);
        }
        ax.Y.h Z = Z(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(g0(context2, F0, Z, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof C3036c) {
            try {
                ((C3036c) context2).a(g0(context2, F0, Z, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!m0) {
            return super.i(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration g0 = g0(context2, F0, Z, !configuration2.equals(configuration3) ? q0(configuration2, configuration3) : null, true);
        C3036c c3036c = new C3036c(context2, ax.m.i.d);
        c3036c.a(g0);
        try {
            if (context2.getTheme() != null) {
                h.f.a(c3036c.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.i(c3036c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View i0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        if (this.f0 == null) {
            TypedArray obtainStyledAttributes = this.k.obtainStyledAttributes(ax.m.j.y0);
            String string = obtainStyledAttributes.getString(ax.m.j.C0);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f0 = new z();
            } else {
                try {
                    this.f0 = (z) this.k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f0 = new z();
                }
            }
        }
        boolean z2 = k0;
        boolean z3 = false;
        if (z2) {
            if (this.g0 == null) {
                this.g0 = new C2557B();
            }
            if (this.g0.a(attributeSet)) {
                z = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    z3 = Y0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z3 = true;
                }
                z = z3;
            }
        } else {
            z = false;
        }
        return this.f0.r(view, str, context, attributeSet, z, z2, true, N.d());
    }

    void j0() {
        androidx.appcompat.view.menu.e eVar;
        ax.u.k kVar = this.r;
        if (kVar != null) {
            kVar.n();
        }
        if (this.w != null) {
            this.l.getDecorView().removeCallbacks(this.x);
            if (this.w.isShowing()) {
                try {
                    this.w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.w = null;
        }
        m0();
        s w0 = w0(0, false);
        if (w0 == null || (eVar = w0.j) == null) {
            return;
        }
        eVar.close();
    }

    boolean k0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.j;
        if (((obj instanceof C1792u.a) || (obj instanceof x)) && (decorView = this.l.getDecorView()) != null && C1792u.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.m.b(this.l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? H0(keyCode, keyEvent) : K0(keyCode, keyEvent);
    }

    @Override // ax.n.AbstractC2564f
    public <T extends View> T l(int i2) {
        n0();
        return (T) this.l.findViewById(i2);
    }

    void l0(int i2) {
        s w0;
        s w02 = w0(i2, true);
        if (w02.j != null) {
            Bundle bundle = new Bundle();
            w02.j.R(bundle);
            if (bundle.size() > 0) {
                w02.s = bundle;
            }
            w02.j.f0();
            w02.j.clear();
        }
        w02.r = true;
        w02.q = true;
        if ((i2 != 108 && i2 != 0) || this.r == null || (w0 = w0(0, false)) == null) {
            return;
        }
        w0.m = false;
        S0(w0, null);
    }

    void m0() {
        C1780n0 c1780n0 = this.y;
        if (c1780n0 != null) {
            c1780n0.c();
        }
    }

    @Override // ax.n.AbstractC2564f
    public Context n() {
        return this.k;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return i0(view, str, context, attributeSet);
    }

    @Override // ax.n.AbstractC2564f
    public final InterfaceC2560b p() {
        return new f();
    }

    s p0(Menu menu) {
        s[] sVarArr = this.M;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            s sVar = sVarArr[i2];
            if (sVar != null && sVar.j == menu) {
                return sVar;
            }
        }
        return null;
    }

    @Override // ax.n.AbstractC2564f
    public int q() {
        return this.T;
    }

    final Context r0() {
        AbstractC2559a u = u();
        Context m2 = u != null ? u.m() : null;
        return m2 == null ? this.k : m2;
    }

    @Override // ax.n.AbstractC2564f
    public MenuInflater s() {
        if (this.p == null) {
            z0();
            AbstractC2559a abstractC2559a = this.o;
            this.p = new C3037d(abstractC2559a != null ? abstractC2559a.m() : this.k);
        }
        return this.p;
    }

    @Override // ax.n.AbstractC2564f
    public AbstractC2559a u() {
        z0();
        return this.o;
    }

    @Override // ax.n.AbstractC2564f
    public void v() {
        LayoutInflater from = LayoutInflater.from(this.k);
        if (from.getFactory() == null) {
            C1794v.a(from, this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C2566h) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    ax.Y.h v0(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? k.b(configuration) : ax.Y.h.c(j.b(configuration.locale));
    }

    @Override // ax.n.AbstractC2564f
    public void w() {
        if (Q0() == null || u().o()) {
            return;
        }
        D0(0);
    }

    protected s w0(int i2, boolean z) {
        s[] sVarArr = this.M;
        if (sVarArr == null || sVarArr.length <= i2) {
            s[] sVarArr2 = new s[i2 + 1];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.M = sVarArr2;
            sVarArr = sVarArr2;
        }
        s sVar = sVarArr[i2];
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(i2);
        sVarArr[i2] = sVar2;
        return sVar2;
    }

    final CharSequence x0() {
        Object obj = this.j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.q;
    }

    @Override // ax.n.AbstractC2564f
    public void y(Configuration configuration) {
        AbstractC2559a u;
        if (this.G && this.A && (u = u()) != null) {
            u.q(configuration);
        }
        C0580k.b().g(this.k);
        this.S = new Configuration(this.k.getResources().getConfiguration());
        W(false, false);
    }

    final Window.Callback y0() {
        return this.l.getCallback();
    }

    @Override // ax.n.AbstractC2564f
    public void z(Bundle bundle) {
        String str;
        this.P = true;
        V(false);
        o0();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                str = ax.P.j.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC2559a Q0 = Q0();
                if (Q0 == null) {
                    this.c0 = true;
                } else {
                    Q0.w(true);
                }
            }
            AbstractC2564f.d(this);
        }
        this.S = new Configuration(this.k.getResources().getConfiguration());
        this.Q = true;
    }

    LayoutInflaterFactory2C2566h(Dialog dialog, InterfaceC2562d interfaceC2562d) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC2562d, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private LayoutInflaterFactory2C2566h(Context context, Window window, InterfaceC2562d interfaceC2562d, Object obj) {
        ax.B.k<String, Integer> kVar;
        Integer num;
        ActivityC2561c c1;
        this.y = null;
        this.z = true;
        this.T = -100;
        this.b0 = new a();
        this.k = context;
        this.n = interfaceC2562d;
        this.j = obj;
        if (this.T == -100 && (obj instanceof Dialog) && (c1 = c1()) != null) {
            this.T = c1.getDelegate().q();
        }
        if (this.T == -100 && (num = (kVar = j0).get(obj.getClass().getName())) != null) {
            this.T = num.intValue();
            kVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            Y(window);
        }
        C0580k.h();
    }

    /* renamed from: ax.n.h$n */
    class n extends WindowCallbackC3039f {
        private g b;
        private boolean c;
        private boolean d;
        private boolean e;

        n(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.d = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.c = true;
                callback.onContentChanged();
            } finally {
                this.c = false;
            }
        }

        public void d(Window.Callback callback, int i, Menu menu) {
            try {
                this.e = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.e = false;
            }
        }

        @Override // ax.s.WindowCallbackC3039f, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.d ? a().dispatchKeyEvent(keyEvent) : LayoutInflaterFactory2C2566h.this.k0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // ax.s.WindowCallbackC3039f, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflaterFactory2C2566h.this.J0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(g gVar) {
            this.b = gVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            SupportActionModeWrapper.a aVar = new SupportActionModeWrapper.a(LayoutInflaterFactory2C2566h.this.k, callback);
            androidx.appcompat.view.a S = LayoutInflaterFactory2C2566h.this.S(aVar);
            if (S != null) {
                return aVar.e(S);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.c) {
                a().onContentChanged();
            }
        }

        @Override // ax.s.WindowCallbackC3039f, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // ax.s.WindowCallbackC3039f, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View onCreatePanelView;
            g gVar = this.b;
            return (gVar == null || (onCreatePanelView = gVar.onCreatePanelView(i)) == null) ? super.onCreatePanelView(i) : onCreatePanelView;
        }

        @Override // ax.s.WindowCallbackC3039f, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            LayoutInflaterFactory2C2566h.this.M0(i);
            return true;
        }

        @Override // ax.s.WindowCallbackC3039f, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.e) {
                a().onPanelClosed(i, menu);
            } else {
                super.onPanelClosed(i, menu);
                LayoutInflaterFactory2C2566h.this.N0(i);
            }
        }

        @Override // ax.s.WindowCallbackC3039f, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.c0(true);
            }
            g gVar = this.b;
            boolean z = gVar != null && gVar.a(i);
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (eVar != null) {
                eVar.c0(false);
            }
            return z;
        }

        @Override // ax.s.WindowCallbackC3039f, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.e eVar;
            s w0 = LayoutInflaterFactory2C2566h.this.w0(0, true);
            if (w0 == null || (eVar = w0.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i);
            }
        }

        @Override // ax.s.WindowCallbackC3039f, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return LayoutInflaterFactory2C2566h.this.E0() ? f(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // ax.s.WindowCallbackC3039f, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (LayoutInflaterFactory2C2566h.this.E0() && i == 0) {
                return f(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    /* renamed from: ax.n.h$c */
    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            LayoutInflaterFactory2C2566h.this.j0();
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }
    }

    @Override // ax.n.AbstractC2564f
    public void D(Bundle bundle) {
    }

    void O0(ViewGroup viewGroup) {
    }
}
