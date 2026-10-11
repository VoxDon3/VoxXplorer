/*
 * Decompiled with CFR 0.152.
 */
package ax.n;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
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
import android.util.DisplayMetrics;
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
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.N;
import androidx.appcompat.widget.O;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.d;
import ax.S.h;
import ax.c0.F0;
import ax.c0.I;
import ax.c0.d0;
import ax.c0.n0;
import ax.c0.p0;
import ax.c0.u;
import ax.n.B;
import ax.n.C;
import ax.n.D;
import ax.n.E;
import ax.n.G;
import ax.n.H;
import ax.n.a;
import ax.n.b;
import ax.n.c;
import ax.n.u;
import ax.n.v;
import ax.n.x;
import ax.n.z;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;

class h
extends ax.n.f
implements e.a,
LayoutInflater.Factory2 {
    private static final ax.B.k<String, Integer> j0 = new ax.B.k();
    private static final boolean k0 = false;
    private static final int[] l0 = new int[]{16842836};
    private static final boolean m0 = "robolectric".equals(Build.FINGERPRINT) ^ true;
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
    private int T = -100;
    private int U;
    private int V;
    private boolean W;
    private p X;
    private p Y;
    boolean Z;
    int a0;
    private final Runnable b0 = new Runnable(this){
        final h q;
        {
            this.q = h8;
        }

        @Override
        public void run() {
            h h8 = this.q;
            if ((h8.a0 & 1) != 0) {
                h8.l0(0);
            }
            h8 = this.q;
            if ((h8.a0 & 0x1000) != 0) {
                h8.l0(108);
            }
            h8 = this.q;
            h8.Z = false;
            h8.a0 = 0;
        }
    };
    private boolean c0;
    private Rect d0;
    private Rect e0;
    private z f0;
    private B g0;
    private OnBackInvokedDispatcher h0;
    private OnBackInvokedCallback i0;
    final Object j;
    final Context k;
    Window l;
    private n m;
    final ax.n.d n;
    a o;
    MenuInflater p;
    private CharSequence q;
    private ax.u.k r;
    private h s;
    private t t;
    androidx.appcompat.view.a u;
    ActionBarContextView v;
    PopupWindow w;
    Runnable x;
    n0 y = null;
    private boolean z = true;

    h(Activity activity, ax.n.d d8) {
        this((Context)activity, null, d8, activity);
    }

    h(Dialog dialog, ax.n.d d8) {
        this(dialog.getContext(), dialog.getWindow(), d8, dialog);
    }

    private h(Context object, Window window, ax.n.d object2, Object object3) {
        this.k = object;
        this.n = object2;
        this.j = object3;
        if (this.T == -100 && object3 instanceof Dialog && (object = this.c1()) != null) {
            this.T = ((c)object).getDelegate().q();
        }
        if (this.T == -100 && (object2 = (Integer)((ax.B.k)(object = j0)).get(object3.getClass().getName())) != null) {
            this.T = (Integer)object2;
            ((ax.B.k)object).remove(object3.getClass().getName());
        }
        if (window != null) {
            this.Y(window);
        }
        androidx.appcompat.widget.k.h();
    }

    private boolean A0(s s8) {
        View view = s8.i;
        if (view != null) {
            s8.h = view;
            return true;
        }
        if (s8.j == null) {
            return false;
        }
        if (this.t == null) {
            this.t = new t(this);
        }
        s8.h = view = (View)s8.a(this.t);
        return view != null;
    }

    private boolean B0(s s8) {
        s8.d(this.r0());
        s8.g = new r(this, s8.l);
        s8.c = 81;
        return true;
    }

    private boolean C0(s s8) {
        Object object;
        block10: {
            Context context;
            block9: {
                context = this.k;
                int n8 = s8.a;
                if (n8 == 0) break block9;
                object = context;
                if (n8 != 108) break block10;
            }
            object = context;
            if (this.r != null) {
                TypedValue typedValue = new TypedValue();
                Resources.Theme theme = context.getTheme();
                theme.resolveAttribute(ax.m.a.f, typedValue, true);
                if (typedValue.resourceId != 0) {
                    object = context.getResources().newTheme();
                    object.setTo(theme);
                    object.applyStyle(typedValue.resourceId, true);
                    object.resolveAttribute(ax.m.a.g, typedValue, true);
                } else {
                    theme.resolveAttribute(ax.m.a.g, typedValue, true);
                    object = null;
                }
                Object object2 = object;
                if (typedValue.resourceId != 0) {
                    object2 = object;
                    if (object == null) {
                        object2 = context.getResources().newTheme();
                        object2.setTo(theme);
                    }
                    object2.applyStyle(typedValue.resourceId, true);
                }
                object = context;
                if (object2 != null) {
                    object = new ax.s.c(context, 0);
                    object.getTheme().setTo((Resources.Theme)object2);
                }
            }
        }
        object = new e((Context)object);
        object.S(this);
        s8.c((e)object);
        return true;
    }

    private void D0(int n8) {
        this.a0 = 1 << n8 | this.a0;
        if (!this.Z) {
            ax.c0.d0.d0(this.l.getDecorView(), this.b0);
            this.Z = true;
        }
    }

    private boolean I0(int n8, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            s s8 = this.w0(n8, true);
            if (!s8.o) {
                return this.S0(s8, keyEvent);
            }
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean L0(int n8, KeyEvent keyEvent) {
        boolean bl;
        ax.u.k k8;
        if (this.u != null) {
            return false;
        }
        boolean bl2 = true;
        s s8 = this.w0(n8, true);
        if (n8 == 0 && (k8 = this.r) != null && k8.i() && !ViewConfiguration.get((Context)this.k).hasPermanentMenuKey()) {
            if (!this.r.d()) {
                if (this.R) return false;
                if (!this.S0(s8, keyEvent)) return false;
                bl = this.r.l();
            } else {
                bl = this.r.k();
            }
        } else {
            bl = s8.o;
            if (!bl && !s8.n) {
                if (!s8.m) return false;
                if (s8.r) {
                    s8.m = false;
                    bl = this.S0(s8, keyEvent);
                } else {
                    bl = true;
                }
                if (!bl) return false;
                this.P0(s8, keyEvent);
                bl = bl2;
            } else {
                this.f0(s8, true);
            }
        }
        if (!bl) return bl;
        keyEvent = (AudioManager)this.k.getApplicationContext().getSystemService("audio");
        if (keyEvent != null) {
            keyEvent.playSoundEffect(0);
            return bl;
        }
        Log.w((String)"AppCompatDelegate", (String)"Couldn't get audio manager");
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void P0(s s8, KeyEvent keyEvent) {
        block17: {
            int n8;
            WindowManager windowManager;
            block16: {
                block15: {
                    Window.Callback callback;
                    block14: {
                        if (s8.o || this.R) return;
                        if (s8.a == 0 && (this.k.getResources().getConfiguration().screenLayout & 0xF) == 4) {
                            return;
                        }
                        callback = this.y0();
                        if (callback != null && !callback.onMenuOpened(s8.a, (Menu)s8.j)) {
                            this.f0(s8, true);
                            return;
                        }
                        windowManager = (WindowManager)this.k.getSystemService("window");
                        if (windowManager == null || !this.S0(s8, keyEvent)) return;
                        keyEvent = s8.g;
                        if (keyEvent == null || s8.q) break block14;
                        keyEvent = s8.i;
                        if (keyEvent == null || (keyEvent = keyEvent.getLayoutParams()) == null || keyEvent.width != -1) break block15;
                        n8 = -1;
                        break block16;
                    }
                    if (keyEvent == null) {
                        if (!this.B0(s8) || s8.g == null) {
                            return;
                        }
                    } else if (s8.q && keyEvent.getChildCount() > 0) {
                        s8.g.removeAllViews();
                    }
                    if (!this.A0(s8) || !s8.b()) break block17;
                    callback = s8.h.getLayoutParams();
                    keyEvent = callback;
                    if (callback == null) {
                        keyEvent = new ViewGroup.LayoutParams(-2, -2);
                    }
                    n8 = s8.b;
                    s8.g.setBackgroundResource(n8);
                    callback = s8.h.getParent();
                    if (callback instanceof ViewGroup) {
                        ((ViewGroup)callback).removeView(s8.h);
                    }
                    s8.g.addView(s8.h, (ViewGroup.LayoutParams)keyEvent);
                    if (!s8.h.hasFocus()) {
                        s8.h.requestFocus();
                    }
                }
                n8 = -2;
            }
            s8.n = false;
            keyEvent = new WindowManager.LayoutParams(n8, -2, s8.d, s8.e, 1002, 0x820000, -3);
            keyEvent.gravity = s8.c;
            keyEvent.windowAnimations = s8.f;
            windowManager.addView((View)s8.g, (ViewGroup.LayoutParams)keyEvent);
            s8.o = true;
            if (s8.a != 0) return;
            this.f1();
            return;
        }
        s8.q = true;
    }

    private boolean R0(s s8, int n8, KeyEvent keyEvent, int n9) {
        boolean bl;
        block7: {
            boolean bl2;
            block6: {
                bl = keyEvent.isSystem();
                bl2 = false;
                if (bl) {
                    return false;
                }
                if (s8.m) break block6;
                bl = bl2;
                if (!this.S0(s8, keyEvent)) break block7;
            }
            e e8 = s8.j;
            bl = bl2;
            if (e8 != null) {
                bl = e8.performShortcut(n8, keyEvent, n9);
            }
        }
        if (bl && (n9 & 1) == 0 && this.r == null) {
            this.f0(s8, true);
        }
        return bl;
    }

    private boolean S0(s object, KeyEvent object2) {
        Object object3;
        int n8;
        if (this.R) {
            return false;
        }
        if (((s)object).m) {
            return true;
        }
        s s8 = this.N;
        if (s8 != null && s8 != object) {
            this.f0(s8, false);
        }
        if ((s8 = this.y0()) != null) {
            ((s)object).i = s8.onCreatePanelView(((s)object).a);
        }
        n8 = (n8 = ((s)object).a) != 0 && n8 != 108 ? 0 : 1;
        if (n8 != 0 && (object3 = this.r) != null) {
            object3.g();
        }
        if (!(((s)object).i != null || n8 != 0 && this.Q0() instanceof E)) {
            object3 = ((s)object).j;
            if (object3 == null || ((s)object).r) {
                if (!(object3 != null || this.C0((s)object) && ((s)object).j != null)) {
                    return false;
                }
                if (n8 != 0 && this.r != null) {
                    if (this.s == null) {
                        this.s = new h(this);
                    }
                    this.r.c(((s)object).j, this.s);
                }
                ((s)object).j.f0();
                if (!s8.onCreatePanelMenu(((s)object).a, ((s)object).j)) {
                    ((s)object).c(null);
                    if (n8 != 0 && (object = this.r) != null) {
                        object.c(null, this.s);
                    }
                    return false;
                }
                ((s)object).r = false;
            }
            ((s)object).j.f0();
            object3 = ((s)object).s;
            if (object3 != null) {
                ((s)object).j.Q((Bundle)object3);
                ((s)object).s = null;
            }
            if (!s8.onPreparePanel(0, ((s)object).i, ((s)object).j)) {
                if (n8 != 0 && (object2 = this.r) != null) {
                    object2.c(null, this.s);
                }
                ((s)object).j.e0();
                return false;
            }
            n8 = object2 != null ? object2.getDeviceId() : -1;
            boolean bl = KeyCharacterMap.load((int)n8).getKeyboardType() != 1;
            ((s)object).p = bl;
            ((s)object).j.setQwertyMode(bl);
            ((s)object).j.e0();
        }
        ((s)object).m = true;
        ((s)object).n = false;
        this.N = object;
        return true;
    }

    private void T0(boolean bl) {
        Object object = this.r;
        if (object != null && object.i() && (!ViewConfiguration.get((Context)this.k).hasPermanentMenuKey() || this.r.j())) {
            object = this.y0();
            if (this.r.d() && bl) {
                this.r.k();
                if (!this.R) {
                    object.onPanelClosed(108, (Menu)this.w0((int)0, (boolean)true).j);
                    return;
                }
            } else if (object != null && !this.R) {
                if (this.Z && (this.a0 & 1) != 0) {
                    this.l.getDecorView().removeCallbacks(this.b0);
                    this.b0.run();
                }
                s s8 = this.w0(0, true);
                e e8 = s8.j;
                if (e8 != null && !s8.r && object.onPreparePanel(0, s8.i, (Menu)e8)) {
                    object.onMenuOpened(108, (Menu)s8.j);
                    this.r.l();
                }
            }
            return;
        }
        object = this.w0(0, true);
        ((s)object).q = true;
        this.f0((s)object, false);
        this.P0((s)object, null);
    }

    private int U0(int n8) {
        if (n8 == 8) {
            Log.i((String)"AppCompatDelegate", (String)"You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        int n9 = n8;
        if (n8 == 9) {
            Log.i((String)"AppCompatDelegate", (String)"You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            n9 = 109;
        }
        return n9;
    }

    private boolean V(boolean bl) {
        return this.W(bl, true);
    }

    private boolean W(boolean bl, boolean bl2) {
        if (this.R) {
            return false;
        }
        int n8 = this.a0();
        int n9 = this.F0(this.k, n8);
        Object object = Build.VERSION.SDK_INT < 33 ? this.Z(this.k) : null;
        ax.Y.h h8 = object;
        if (!bl2) {
            h8 = object;
            if (object != null) {
                h8 = this.v0(this.k.getResources().getConfiguration());
            }
        }
        bl = this.e1(n9, h8, bl);
        if (n8 == 0) {
            this.u0(this.k).e();
        } else {
            object = this.X;
            if (object != null) {
                ((p)object).a();
            }
        }
        if (n8 == 3) {
            this.t0(this.k).e();
            return bl;
        }
        object = this.Y;
        if (object != null) {
            ((p)object).a();
        }
        return bl;
    }

    private void X() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout)this.B.findViewById(0x1020002);
        View view = this.l.getDecorView();
        contentFrameLayout.a(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        view = this.k.obtainStyledAttributes(ax.m.j.y0);
        view.getValue(ax.m.j.K0, contentFrameLayout.getMinWidthMajor());
        view.getValue(ax.m.j.L0, contentFrameLayout.getMinWidthMinor());
        int n8 = ax.m.j.I0;
        if (view.hasValue(n8)) {
            view.getValue(n8, contentFrameLayout.getFixedWidthMajor());
        }
        if (view.hasValue(n8 = ax.m.j.J0)) {
            view.getValue(n8, contentFrameLayout.getFixedWidthMinor());
        }
        if (view.hasValue(n8 = ax.m.j.G0)) {
            view.getValue(n8, contentFrameLayout.getFixedHeightMajor());
        }
        if (view.hasValue(n8 = ax.m.j.H0)) {
            view.getValue(n8, contentFrameLayout.getFixedHeightMinor());
        }
        view.recycle();
        contentFrameLayout.requestLayout();
    }

    private void Y(Window window) {
        if (this.l == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof n)) {
                callback = new n(this, callback);
                this.m = callback;
                window.setCallback(callback);
                L l8 = androidx.appcompat.widget.L.u(this.k, null, l0);
                callback = l8.h(0);
                if (callback != null) {
                    window.setBackgroundDrawable((Drawable)callback);
                }
                l8.x();
                this.l = window;
                if (Build.VERSION.SDK_INT >= 33 && this.h0 == null) {
                    this.O(null);
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private boolean Y0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View view = this.l.getDecorView();
        while (true) {
            if (viewParent == null) {
                return true;
            }
            if (viewParent == view || !(viewParent instanceof View) || ((View)viewParent).isAttachedToWindow()) break;
            viewParent = viewParent.getParent();
        }
        return false;
    }

    private int a0() {
        int n8 = this.T;
        if (n8 != -100) {
            return n8;
        }
        return ax.n.f.o();
    }

    private void b1() {
        if (!this.A) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    private c c1() {
        Context context = this.k;
        while (context != null) {
            if (context instanceof c) {
                return (c)context;
            }
            if (!(context instanceof ContextWrapper)) break;
            context = ((ContextWrapper)context).getBaseContext();
        }
        return null;
    }

    private void d0() {
        p p8 = this.X;
        if (p8 != null) {
            p8.a();
        }
        if ((p8 = this.Y) != null) {
            p8.a();
        }
    }

    private void d1(Configuration configuration) {
        Activity activity = (Activity)this.j;
        if (activity instanceof ax.G0.h) {
            if (((ax.G0.h)activity).getLifecycle().b().h(d.b.d0)) {
                activity.onConfigurationChanged(configuration);
                return;
            }
        } else if (this.Q && !this.R) {
            activity.onConfigurationChanged(configuration);
        }
    }

    private boolean e1(int n8, ax.Y.h h8, boolean bl) {
        Configuration configuration = this.g0(this.k, n8, h8, null, false);
        int n9 = this.s0(this.k);
        Object object = this.S;
        Object object2 = object;
        if (object == null) {
            object2 = this.k.getResources().getConfiguration();
        }
        int n10 = object2.uiMode;
        int n11 = configuration.uiMode & 0x30;
        object = this.v0((Configuration)object2);
        object2 = h8 == null ? null : this.v0(configuration);
        boolean bl2 = false;
        n10 = (n10 & 0x30) != n11 ? 512 : 0;
        int n12 = n10;
        if (object2 != null) {
            n12 = n10;
            if (!((ax.Y.h)object).equals(object2)) {
                n12 = n10 | 0x2004;
            }
        }
        boolean bl3 = true;
        if ((~n9 & n12) != 0 && bl && this.P && (m0 || this.Q) && (object = this.j) instanceof Activity && !((Activity)object).isChild()) {
            if (Build.VERSION.SDK_INT >= 31 && (n12 & 0x2000) != 0) {
                ((Activity)this.j).getWindow().getDecorView().setLayoutDirection(configuration.getLayoutDirection());
            }
            ax.P.b.r((Activity)this.j);
            bl = true;
        } else {
            bl = false;
        }
        if (!bl && n12 != 0) {
            bl = bl2;
            if ((n12 & n9) == n12) {
                bl = true;
            }
            this.g1(n11, (ax.Y.h)object2, bl, null);
            bl = bl3;
        }
        if (bl && (object = this.j) instanceof c) {
            if ((n12 & 0x200) != 0) {
                ((c)object).onNightModeChanged(n8);
            }
            if ((n12 & 4) != 0) {
                ((c)this.j).onLocalesChanged(h8);
            }
        }
        if (object2 != null) {
            this.W0(this.v0(this.k.getResources().getConfiguration()));
        }
        return bl;
    }

    private Configuration g0(Context context, int n8, ax.Y.h h8, Configuration configuration, boolean bl) {
        n8 = n8 != 1 ? (n8 != 2 ? (bl ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 0x30) : 32) : 16;
        context = new Configuration();
        context.fontScale = 0.0f;
        if (configuration != null) {
            context.setTo(configuration);
        }
        context.uiMode = n8 | context.uiMode & 0xFFFFFFCF;
        if (h8 != null) {
            this.V0((Configuration)context, h8);
        }
        return context;
    }

    private void g1(int n8, ax.Y.h h8, boolean bl, Configuration configuration) {
        Resources resources = this.k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = n8 | resources.getConfiguration().uiMode & 0xFFFFFFCF;
        if (h8 != null) {
            this.V0(configuration2, h8);
        }
        resources.updateConfiguration(configuration2, null);
        int n9 = Build.VERSION.SDK_INT;
        if (n9 < 26) {
            ax.n.D.a(resources);
        }
        if ((n8 = this.U) != 0) {
            this.k.setTheme(n8);
            if (n9 >= 23) {
                this.k.getTheme().applyStyle(this.U, true);
            }
        }
        if (bl && this.j instanceof Activity) {
            this.d1(configuration2);
        }
    }

    private ViewGroup h0() {
        int n8;
        Object object = this.k.obtainStyledAttributes(ax.m.j.y0);
        if (object.hasValue(n8 = ax.m.j.D0)) {
            ContentFrameLayout contentFrameLayout;
            if (object.getBoolean(ax.m.j.M0, false)) {
                this.I(1);
            } else if (object.getBoolean(n8, false)) {
                this.I(108);
            }
            if (object.getBoolean(ax.m.j.E0, false)) {
                this.I(109);
            }
            if (object.getBoolean(ax.m.j.F0, false)) {
                this.I(10);
            }
            this.J = object.getBoolean(ax.m.j.z0, false);
            object.recycle();
            this.o0();
            this.l.getDecorView();
            object = LayoutInflater.from((Context)this.k);
            if (!this.K) {
                if (this.J) {
                    object = (ViewGroup)object.inflate(ax.m.g.f, null);
                    this.H = false;
                    this.G = false;
                } else if (this.G) {
                    object = new TypedValue();
                    this.k.getTheme().resolveAttribute(ax.m.a.f, (TypedValue)object, true);
                    object = object.resourceId != 0 ? new ax.s.c(this.k, object.resourceId) : this.k;
                    contentFrameLayout = (ViewGroup)LayoutInflater.from((Context)object).inflate(ax.m.g.p, null);
                    this.r = object = (ax.u.k)contentFrameLayout.findViewById(ax.m.f.p);
                    object.setWindowCallback(this.y0());
                    if (this.H) {
                        this.r.m(109);
                    }
                    if (this.E) {
                        this.r.m(2);
                    }
                    object = contentFrameLayout;
                    if (this.F) {
                        this.r.m(5);
                        object = contentFrameLayout;
                    }
                } else {
                    object = null;
                }
            } else {
                object = this.I ? (ViewGroup)object.inflate(ax.m.g.o, null) : (ViewGroup)object.inflate(ax.m.g.n, null);
            }
            if (object != null) {
                ax.c0.d0.v0((View)object, new I(this){
                    final h a;
                    {
                        this.a = h8;
                    }

                    @Override
                    public F0 a(View view, F0 f02) {
                        int n8 = f02.l();
                        int n9 = this.a.h1(f02, null);
                        F0 f03 = f02;
                        if (n8 != n9) {
                            f03 = f02.p(f02.j(), n9, f02.k(), f02.i());
                        }
                        return ax.c0.d0.X(view, f03);
                    }
                });
                if (this.r == null) {
                    this.C = (TextView)object.findViewById(ax.m.f.D);
                }
                androidx.appcompat.widget.O.c((View)object);
                contentFrameLayout = (ContentFrameLayout)object.findViewById(ax.m.f.b);
                ViewGroup viewGroup = (ViewGroup)this.l.findViewById(0x1020002);
                if (viewGroup != null) {
                    while (viewGroup.getChildCount() > 0) {
                        View view = viewGroup.getChildAt(0);
                        viewGroup.removeViewAt(0);
                        contentFrameLayout.addView(view);
                    }
                    viewGroup.setId(-1);
                    contentFrameLayout.setId(0x1020002);
                    if (viewGroup instanceof FrameLayout) {
                        ((FrameLayout)viewGroup).setForeground(null);
                    }
                }
                this.l.setContentView((View)object);
                contentFrameLayout.setAttachListener(new ContentFrameLayout.a(this){
                    final h a;
                    {
                        this.a = h8;
                    }

                    @Override
                    public void a() {
                    }

                    @Override
                    public void onDetachedFromWindow() {
                        this.a.j0();
                    }
                });
                return object;
            }
            object = new StringBuilder();
            object.append("AppCompat does not support the current theme features: { windowActionBar: ");
            object.append(this.G);
            object.append(", windowActionBarOverlay: ");
            object.append(this.H);
            object.append(", android:windowIsFloating: ");
            object.append(this.J);
            object.append(", windowActionModeOverlay: ");
            object.append(this.I);
            object.append(", windowNoTitle: ");
            object.append(this.K);
            object.append(" }");
            throw new IllegalArgumentException(object.toString());
        }
        object.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    private void i1(View view) {
        int n8 = (ax.c0.d0.L(view) & 0x2000) != 0 ? ax.Q.b.c(this.k, ax.m.c.b) : ax.Q.b.c(this.k, ax.m.c.a);
        view.setBackgroundColor(n8);
    }

    private void n0() {
        if (!this.A) {
            this.B = this.h0();
            Object object = this.x0();
            if (!TextUtils.isEmpty((CharSequence)object)) {
                ax.u.k k8 = this.r;
                if (k8 != null) {
                    k8.setWindowTitle((CharSequence)object);
                } else if (this.Q0() != null) {
                    this.Q0().I((CharSequence)object);
                } else {
                    k8 = this.C;
                    if (k8 != null) {
                        k8.setText((CharSequence)object);
                    }
                }
            }
            this.X();
            this.O0(this.B);
            this.A = true;
            object = this.w0(0, false);
            if (!(this.R || object != null && ((s)object).j != null)) {
                this.D0(108);
            }
        }
    }

    private void o0() {
        Object object;
        if (this.l == null && (object = this.j) instanceof Activity) {
            this.Y(((Activity)object).getWindow());
        }
        if (this.l != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    private static Configuration q0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            int n8;
            int n9;
            float f8 = configuration.fontScale;
            float f9 = configuration2.fontScale;
            if (f8 != f9) {
                configuration3.fontScale = f9;
            }
            if ((n9 = configuration.mcc) != (n8 = configuration2.mcc)) {
                configuration3.mcc = n8;
            }
            if ((n8 = configuration.mnc) != (n9 = configuration2.mnc)) {
                configuration3.mnc = n9;
            }
            if ((n9 = Build.VERSION.SDK_INT) >= 24) {
                ax.n.h$k.a(configuration, configuration2, configuration3);
            } else if (!ax.b0.b.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            n8 = configuration.touchscreen;
            int n10 = configuration2.touchscreen;
            if (n8 != n10) {
                configuration3.touchscreen = n10;
            }
            if ((n8 = configuration.keyboard) != (n10 = configuration2.keyboard)) {
                configuration3.keyboard = n10;
            }
            if ((n8 = configuration.keyboardHidden) != (n10 = configuration2.keyboardHidden)) {
                configuration3.keyboardHidden = n10;
            }
            if ((n10 = configuration.navigation) != (n8 = configuration2.navigation)) {
                configuration3.navigation = n8;
            }
            if ((n8 = configuration.navigationHidden) != (n10 = configuration2.navigationHidden)) {
                configuration3.navigationHidden = n10;
            }
            if ((n10 = configuration.orientation) != (n8 = configuration2.orientation)) {
                configuration3.orientation = n8;
            }
            if (((n10 = configuration.screenLayout) & 0xF) != ((n8 = configuration2.screenLayout) & 0xF)) {
                configuration3.screenLayout |= n8 & 0xF;
            }
            if (((n8 = configuration.screenLayout) & 0xC0) != ((n10 = configuration2.screenLayout) & 0xC0)) {
                configuration3.screenLayout |= n10 & 0xC0;
            }
            if (((n8 = configuration.screenLayout) & 0x30) != ((n10 = configuration2.screenLayout) & 0x30)) {
                configuration3.screenLayout |= n10 & 0x30;
            }
            if (((n8 = configuration.screenLayout) & 0x300) != ((n10 = configuration2.screenLayout) & 0x300)) {
                configuration3.screenLayout |= n10 & 0x300;
            }
            if (n9 >= 26) {
                ax.n.h$l.a(configuration, configuration2, configuration3);
            }
            if (((n9 = configuration.uiMode) & 0xF) != ((n8 = configuration2.uiMode) & 0xF)) {
                configuration3.uiMode |= n8 & 0xF;
            }
            if (((n9 = configuration.uiMode) & 0x30) != ((n8 = configuration2.uiMode) & 0x30)) {
                configuration3.uiMode |= n8 & 0x30;
            }
            if ((n9 = configuration.screenWidthDp) != (n8 = configuration2.screenWidthDp)) {
                configuration3.screenWidthDp = n8;
            }
            if ((n9 = configuration.screenHeightDp) != (n8 = configuration2.screenHeightDp)) {
                configuration3.screenHeightDp = n8;
            }
            if ((n8 = configuration.smallestScreenWidthDp) != (n9 = configuration2.smallestScreenWidthDp)) {
                configuration3.smallestScreenWidthDp = n9;
            }
            if ((n8 = configuration.densityDpi) != (n9 = configuration2.densityDpi)) {
                configuration3.densityDpi = n9;
            }
        }
        return configuration3;
    }

    private int s0(Context context) {
        block6: {
            if (!this.W && this.j instanceof Activity) {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return 0;
                }
                int n8 = Build.VERSION.SDK_INT;
                n8 = n8 >= 29 ? 0x100C0000 : (n8 >= 24 ? 786432 : 0);
                ComponentName componentName = new ComponentName(context, this.j.getClass());
                context = packageManager.getActivityInfo(componentName, n8);
                if (context == null) break block6;
                try {
                    this.V = context.configChanges;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    Log.d((String)"AppCompatDelegate", (String)"Exception while getting ActivityInfo", (Throwable)nameNotFoundException);
                    this.V = 0;
                }
            }
        }
        this.W = true;
        return this.V;
    }

    private p t0(Context context) {
        if (this.Y == null) {
            this.Y = new o(this, context);
        }
        return this.Y;
    }

    private p u0(Context context) {
        if (this.X == null) {
            this.X = new q(this, ax.n.G.a(context));
        }
        return this.X;
    }

    private void z0() {
        this.n0();
        if (this.G && this.o == null) {
            Object object = this.j;
            if (object instanceof Activity) {
                this.o = new H((Activity)this.j, this.H);
            } else if (object instanceof Dialog) {
                this.o = new H((Dialog)this.j);
            }
            object = this.o;
            if (object != null) {
                ((a)object).w(this.c0);
            }
        }
    }

    @Override
    public void A() {
        Object object;
        if (this.j instanceof Activity) {
            ax.n.f.G(this);
        }
        if (this.Z) {
            this.l.getDecorView().removeCallbacks(this.b0);
        }
        this.R = true;
        if (this.T != -100 && (object = this.j) instanceof Activity && ((Activity)object).isChangingConfigurations()) {
            j0.put(this.j.getClass().getName(), this.T);
        } else {
            j0.remove(this.j.getClass().getName());
        }
        object = this.o;
        if (object != null) {
            ((a)object).r();
        }
        this.d0();
    }

    @Override
    public void B(Bundle bundle) {
        this.n0();
    }

    @Override
    public void C() {
        a a8 = this.u();
        if (a8 != null) {
            a8.E(true);
        }
    }

    @Override
    public void D(Bundle bundle) {
    }

    @Override
    public void E() {
        this.W(true, false);
    }

    public boolean E0() {
        return this.z;
    }

    @Override
    public void F() {
        a a8 = this.u();
        if (a8 != null) {
            a8.E(false);
        }
    }

    int F0(Context context, int n8) {
        if (n8 != -100) {
            if (n8 != -1) {
                if (n8 != 0) {
                    if (n8 != 1 && n8 != 2) {
                        if (n8 == 3) {
                            return this.t0(context).c();
                        }
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                } else {
                    if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager)context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                        return -1;
                    }
                    return this.u0(context).c();
                }
            }
            return n8;
        }
        return -1;
    }

    boolean G0() {
        boolean bl = this.O;
        this.O = false;
        Object object = this.w0(0, false);
        if (object != null && ((s)object).o) {
            if (!bl) {
                this.f0((s)object, true);
            }
            return true;
        }
        object = this.u;
        if (object != null) {
            ((androidx.appcompat.view.a)object).c();
            return true;
        }
        object = this.u();
        return object != null && ((a)object).i();
    }

    boolean H0(int n8, KeyEvent keyEvent) {
        boolean bl = true;
        if (n8 != 4) {
            if (n8 == 82) {
                this.I0(0, keyEvent);
                return true;
            }
        } else {
            if ((keyEvent.getFlags() & 0x80) == 0) {
                bl = false;
            }
            this.O = bl;
        }
        return false;
    }

    @Override
    public boolean I(int n8) {
        n8 = this.U0(n8);
        if (this.K && n8 == 108) {
            return false;
        }
        if (this.G && n8 == 1) {
            this.G = false;
        }
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 5) {
                    if (n8 != 10) {
                        if (n8 != 108) {
                            if (n8 != 109) {
                                return this.l.requestFeature(n8);
                            }
                            this.b1();
                            this.H = true;
                            return true;
                        }
                        this.b1();
                        this.G = true;
                        return true;
                    }
                    this.b1();
                    this.I = true;
                    return true;
                }
                this.b1();
                this.F = true;
                return true;
            }
            this.b1();
            this.E = true;
            return true;
        }
        this.b1();
        this.K = true;
        return true;
    }

    boolean J0(int n8, KeyEvent object) {
        Object object2 = this.u();
        if (object2 != null && ((a)object2).s(n8, (KeyEvent)object)) {
            return true;
        }
        object2 = this.N;
        if (object2 != null && this.R0((s)object2, object.getKeyCode(), (KeyEvent)object, 1)) {
            object = this.N;
            if (object != null) {
                object.n = true;
            }
            return true;
        }
        if (this.N == null) {
            object2 = this.w0(0, true);
            this.S0((s)object2, (KeyEvent)object);
            boolean bl = this.R0((s)object2, object.getKeyCode(), (KeyEvent)object, 1);
            ((s)object2).m = false;
            if (bl) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void K(int n8) {
        this.n0();
        ViewGroup viewGroup = (ViewGroup)this.B.findViewById(0x1020002);
        viewGroup.removeAllViews();
        LayoutInflater.from((Context)this.k).inflate(n8, viewGroup);
        this.m.c(this.l.getCallback());
    }

    boolean K0(int n8, KeyEvent keyEvent) {
        if (n8 != 4) {
            if (n8 == 82) {
                this.L0(0, keyEvent);
                return true;
            }
        } else if (this.G0()) {
            return true;
        }
        return false;
    }

    @Override
    public void L(View view) {
        this.n0();
        ViewGroup viewGroup = (ViewGroup)this.B.findViewById(0x1020002);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.c(this.l.getCallback());
    }

    @Override
    public void M(View view, ViewGroup.LayoutParams layoutParams) {
        this.n0();
        ViewGroup viewGroup = (ViewGroup)this.B.findViewById(0x1020002);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.c(this.l.getCallback());
    }

    void M0(int n8) {
        a a8;
        if (n8 == 108 && (a8 = this.u()) != null) {
            a8.j(true);
        }
    }

    void N0(int n8) {
        if (n8 == 108) {
            a a8 = this.u();
            if (a8 != null) {
                a8.j(false);
                return;
            }
        } else if (n8 == 0) {
            s s8 = this.w0(n8, true);
            if (s8.o) {
                this.f0(s8, false);
            }
        }
    }

    @Override
    public void O(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.O(onBackInvokedDispatcher);
        Object object = this.h0;
        if (object != null && (onBackInvokedCallback = this.i0) != null) {
            ax.n.h$m.c(object, onBackInvokedCallback);
            this.i0 = null;
        }
        this.h0 = onBackInvokedDispatcher == null && (object = this.j) instanceof Activity && ((Activity)object).getWindow() != null ? ax.n.h$m.a((Activity)this.j) : onBackInvokedDispatcher;
        this.f1();
    }

    void O0(ViewGroup viewGroup) {
    }

    @Override
    public void P(Toolbar toolbar) {
        if (!(this.j instanceof Activity)) {
            return;
        }
        a a8 = this.u();
        if (!(a8 instanceof H)) {
            this.p = null;
            if (a8 != null) {
                a8.r();
            }
            this.o = null;
            if (toolbar != null) {
                this.o = a8 = new E(toolbar, this.x0(), this.m);
                this.m.e(((E)a8).c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.m.e(null);
            }
            this.w();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override
    public void Q(int n8) {
        this.U = n8;
    }

    final a Q0() {
        return this.o;
    }

    @Override
    public final void R(CharSequence charSequence) {
        this.q = charSequence;
        ax.u.k k8 = this.r;
        if (k8 != null) {
            k8.setWindowTitle(charSequence);
            return;
        }
        if (this.Q0() != null) {
            this.Q0().I(charSequence);
            return;
        }
        k8 = this.C;
        if (k8 != null) {
            k8.setText(charSequence);
        }
    }

    @Override
    public androidx.appcompat.view.a S(a.a a8) {
        if (a8 != null) {
            Object object = this.u;
            if (object != null) {
                ((androidx.appcompat.view.a)object).c();
            }
            a8 = new i(this, a8);
            object = this.u();
            if (object != null) {
                androidx.appcompat.view.a a9;
                this.u = a9 = ((a)object).K(a8);
                if (a9 != null && (object = this.n) != null) {
                    object.onSupportActionModeStarted(a9);
                }
            }
            if (this.u == null) {
                this.u = this.a1(a8);
            }
            this.f1();
            return this.u;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    void V0(Configuration configuration, ax.Y.h h8) {
        if (Build.VERSION.SDK_INT >= 24) {
            ax.n.h$k.d(configuration, h8);
            return;
        }
        configuration.setLocale(h8.d(0));
        configuration.setLayoutDirection(h8.d(0));
    }

    void W0(ax.Y.h h8) {
        if (Build.VERSION.SDK_INT >= 24) {
            ax.n.h$k.c(h8);
            return;
        }
        Locale.setDefault(h8.d(0));
    }

    final boolean X0() {
        ViewGroup viewGroup;
        return this.A && (viewGroup = this.B) != null && viewGroup.isLaidOut();
    }

    ax.Y.h Z(Context object) {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 33) {
            return null;
        }
        ax.Y.h h8 = ax.n.f.t();
        if (h8 == null) {
            return null;
        }
        ax.Y.h h9 = this.v0(object.getApplicationContext().getResources().getConfiguration());
        object = n8 >= 24 ? ax.n.C.b(h8, h9) : (h8.f() ? ax.Y.h.e() : ax.Y.h.c(ax.n.h$j.b(h8.d(0))));
        if (((ax.Y.h)object).f()) {
            return h9;
        }
        return object;
    }

    boolean Z0() {
        if (this.h0 == null) {
            return false;
        }
        s s8 = this.w0(0, false);
        if (s8 != null && s8.o) {
            return true;
        }
        return this.u != null;
    }

    @Override
    public boolean a(e object, MenuItem menuItem) {
        Window.Callback callback = this.y0();
        if (callback != null && !this.R && (object = this.p0(((e)object).D())) != null) {
            return callback.onMenuItemSelected(((s)object).a, menuItem);
        }
        return false;
    }

    androidx.appcompat.view.a a1(a.a object) {
        Object object2;
        block22: {
            this.m0();
            object2 = this.u;
            if (object2 != null) {
                ((androidx.appcompat.view.a)object2).c();
            }
            object2 = object;
            if (!(object instanceof i)) {
                object2 = new i(this, (a.a)object);
            }
            if ((object = this.n) != null && !this.R) {
                try {
                    object = object.onWindowStartingSupportActionMode((a.a)object2);
                    break block22;
                }
                catch (AbstractMethodError abstractMethodError) {
                    // empty catch block
                }
            }
            object = null;
        }
        if (object != null) {
            this.u = object;
        } else {
            Object object3;
            object = this.v;
            boolean bl = true;
            if (object == null) {
                if (this.J) {
                    Resources.Theme theme;
                    object3 = new TypedValue();
                    object = this.k.getTheme();
                    object.resolveAttribute(ax.m.a.f, object3, true);
                    if (object3.resourceId != 0) {
                        theme = this.k.getResources().newTheme();
                        theme.setTo((Resources.Theme)object);
                        theme.applyStyle(object3.resourceId, true);
                        object = new ax.s.c(this.k, 0);
                        object.getTheme().setTo(theme);
                    } else {
                        object = this.k;
                    }
                    this.v = new ActionBarContextView((Context)object);
                    theme = new PopupWindow((Context)object, null, ax.m.a.i);
                    this.w = theme;
                    ax.h0.h.b((PopupWindow)theme, 2);
                    this.w.setContentView((View)this.v);
                    this.w.setWidth(-1);
                    object.getTheme().resolveAttribute(ax.m.a.b, object3, true);
                    int n8 = TypedValue.complexToDimensionPixelSize((int)object3.data, (DisplayMetrics)object.getResources().getDisplayMetrics());
                    this.v.setContentHeight(n8);
                    this.w.setHeight(-2);
                    this.x = new Runnable(this){
                        final h q;
                        {
                            this.q = h8;
                        }

                        @Override
                        public void run() {
                            h h8 = this.q;
                            h8.w.showAtLocation((View)h8.v, 55, 0, 0);
                            this.q.m0();
                            if (this.q.X0()) {
                                this.q.v.setAlpha(0.0f);
                                h8 = this.q;
                                h8.y = ax.c0.d0.e((View)h8.v).b(1.0f);
                                this.q.y.g(new p0(this){
                                    final d a;
                                    {
                                        this.a = d8;
                                    }

                                    @Override
                                    public void b(View view) {
                                        this.a.q.v.setAlpha(1.0f);
                                        this.a.q.y.g(null);
                                        this.a.q.y = null;
                                    }

                                    @Override
                                    public void c(View view) {
                                        this.a.q.v.setVisibility(0);
                                    }
                                });
                                return;
                            }
                            this.q.v.setAlpha(1.0f);
                            this.q.v.setVisibility(0);
                        }
                    };
                } else {
                    object = (ViewStubCompat)this.B.findViewById(ax.m.f.h);
                    if (object != null) {
                        ((ViewStubCompat)((Object)object)).setLayoutInflater(LayoutInflater.from((Context)this.r0()));
                        this.v = (ActionBarContextView)((ViewStubCompat)((Object)object)).a();
                    }
                }
            }
            if (this.v != null) {
                this.m0();
                this.v.k();
                object = this.v.getContext();
                object3 = this.v;
                if (this.w != null) {
                    bl = false;
                }
                object = new androidx.appcompat.view.b((Context)object, (ActionBarContextView)((Object)object3), (a.a)object2, bl);
                if (object2.b((androidx.appcompat.view.a)object, ((androidx.appcompat.view.a)object).e())) {
                    ((androidx.appcompat.view.a)object).k();
                    this.v.h((androidx.appcompat.view.a)object);
                    this.u = object;
                    if (this.X0()) {
                        this.v.setAlpha(0.0f);
                        object = ax.c0.d0.e((View)this.v).b(1.0f);
                        this.y = object;
                        ((n0)object).g(new p0(this){
                            final h a;
                            {
                                this.a = h8;
                            }

                            @Override
                            public void b(View view) {
                                this.a.v.setAlpha(1.0f);
                                this.a.y.g(null);
                                this.a.y = null;
                            }

                            @Override
                            public void c(View view) {
                                this.a.v.setVisibility(0);
                                if (this.a.v.getParent() instanceof View) {
                                    ax.c0.d0.i0((View)this.a.v.getParent());
                                }
                            }
                        });
                    } else {
                        this.v.setAlpha(1.0f);
                        this.v.setVisibility(0);
                        if (this.v.getParent() instanceof View) {
                            ax.c0.d0.i0((View)this.v.getParent());
                        }
                    }
                    if (this.w != null) {
                        this.l.getDecorView().post(this.x);
                    }
                } else {
                    this.u = null;
                }
            }
        }
        object = this.u;
        if (object != null && (object2 = this.n) != null) {
            object2.onSupportActionModeStarted((androidx.appcompat.view.a)object);
        }
        this.f1();
        return this.u;
    }

    @Override
    public void b(e e8) {
        this.T0(true);
    }

    void b0(int n8, s sArray, Menu menu) {
        s[] sArray2 = sArray;
        Menu menu2 = menu;
        if (menu == null) {
            Object object = sArray;
            if (sArray == null) {
                object = sArray;
                if (n8 >= 0) {
                    sArray2 = this.M;
                    object = sArray;
                    if (n8 < sArray2.length) {
                        object = sArray2[n8];
                    }
                }
            }
            sArray2 = object;
            menu2 = menu;
            if (object != null) {
                menu2 = object.j;
                sArray2 = object;
            }
        }
        if ((sArray2 == null || sArray2.o) && !this.R) {
            this.m.d(this.l.getCallback(), n8, menu2);
        }
    }

    void c0(e e8) {
        if (this.L) {
            return;
        }
        this.L = true;
        this.r.n();
        Window.Callback callback = this.y0();
        if (callback != null && !this.R) {
            callback.onPanelClosed(108, (Menu)e8);
        }
        this.L = false;
    }

    @Override
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        this.n0();
        ((ViewGroup)this.B.findViewById(0x1020002)).addView(view, layoutParams);
        this.m.c(this.l.getCallback());
    }

    void e0(int n8) {
        this.f0(this.w0(n8, true), true);
    }

    @Override
    public boolean f() {
        return this.V(true);
    }

    void f0(s s8, boolean bl) {
        ax.u.k k8;
        if (bl && s8.a == 0 && (k8 = this.r) != null && k8.d()) {
            this.c0(s8.j);
            return;
        }
        WindowManager windowManager = (WindowManager)this.k.getSystemService("window");
        if (windowManager != null && s8.o && (k8 = s8.g) != null) {
            windowManager.removeView((View)k8);
            if (bl) {
                this.b0(s8.a, s8, null);
            }
        }
        s8.m = false;
        s8.n = false;
        s8.o = false;
        s8.h = null;
        s8.q = true;
        if (this.N == s8) {
            this.N = null;
        }
        if (s8.a == 0) {
            this.f1();
        }
    }

    void f1() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedCallback onBackInvokedCallback;
            boolean bl = this.Z0();
            if (bl && this.i0 == null) {
                this.i0 = ax.n.h$m.b(this.h0, this);
                return;
            }
            if (!bl && (onBackInvokedCallback = this.i0) != null) {
                ax.n.h$m.c(this.h0, onBackInvokedCallback);
                this.i0 = null;
            }
        }
    }

    final int h1(F0 f02, Rect rect) {
        int n8;
        int n9;
        int n10 = 0;
        int n11 = f02 != null ? f02.l() : (rect != null ? rect.top : 0);
        ActionBarContextView actionBarContextView = this.v;
        if (actionBarContextView != null && actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int n12;
            actionBarContextView = (ViewGroup.MarginLayoutParams)this.v.getLayoutParams();
            boolean bl = this.v.isShown();
            int n13 = 1;
            n9 = 1;
            if (bl) {
                if (this.d0 == null) {
                    this.d0 = new Rect();
                    this.e0 = new Rect();
                }
                Rect rect2 = this.d0;
                Rect rect3 = this.e0;
                if (f02 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(f02.j(), f02.l(), f02.k(), f02.i());
                }
                androidx.appcompat.widget.O.a((View)this.B, rect2, rect3);
                int n14 = rect2.top;
                int n15 = rect2.left;
                n12 = rect2.right;
                f02 = ax.c0.d0.G((View)this.B);
                n13 = f02 == null ? 0 : f02.j();
                n8 = f02 == null ? 0 : f02.k();
                if (((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin == n14 && ((ViewGroup.MarginLayoutParams)actionBarContextView).leftMargin == n15 && ((ViewGroup.MarginLayoutParams)actionBarContextView).rightMargin == n12) {
                    n12 = 0;
                } else {
                    ((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin = n14;
                    ((ViewGroup.MarginLayoutParams)actionBarContextView).leftMargin = n15;
                    ((ViewGroup.MarginLayoutParams)actionBarContextView).rightMargin = n12;
                    n12 = 1;
                }
                if (n14 > 0 && this.D == null) {
                    f02 = new View(this.k);
                    this.D = f02;
                    f02.setVisibility(8);
                    f02 = new FrameLayout.LayoutParams(-1, ((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin, 51);
                    ((FrameLayout.LayoutParams)f02).leftMargin = n13;
                    ((FrameLayout.LayoutParams)f02).rightMargin = n8;
                    this.B.addView(this.D, -1, (ViewGroup.LayoutParams)f02);
                } else {
                    f02 = this.D;
                    if (f02 != null) {
                        f02 = (ViewGroup.MarginLayoutParams)f02.getLayoutParams();
                        n15 = ((ViewGroup.MarginLayoutParams)f02).height;
                        n14 = ((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin;
                        if (n15 != n14 || ((ViewGroup.MarginLayoutParams)f02).leftMargin != n13 || ((ViewGroup.MarginLayoutParams)f02).rightMargin != n8) {
                            ((ViewGroup.MarginLayoutParams)f02).height = n14;
                            ((ViewGroup.MarginLayoutParams)f02).leftMargin = n13;
                            ((ViewGroup.MarginLayoutParams)f02).rightMargin = n8;
                            this.D.setLayoutParams((ViewGroup.LayoutParams)f02);
                        }
                    }
                }
                f02 = this.D;
                n8 = f02 != null ? n9 : 0;
                if (n8 != 0 && f02.getVisibility() != 0) {
                    this.i1(this.D);
                }
                n13 = n11;
                if (!this.I) {
                    n13 = n11;
                    if (n8 != 0) {
                        n13 = 0;
                    }
                }
                n11 = n13;
                n13 = n12;
                n12 = n8;
            } else if (((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin != 0) {
                ((ViewGroup.MarginLayoutParams)actionBarContextView).topMargin = 0;
                n12 = 0;
            } else {
                n12 = 0;
                n13 = 0;
            }
            n8 = n11;
            n9 = n12;
            if (n13 != 0) {
                this.v.setLayoutParams((ViewGroup.LayoutParams)actionBarContextView);
                n8 = n11;
                n9 = n12;
            }
        } else {
            n9 = 0;
            n8 = n11;
        }
        if ((f02 = this.D) != null) {
            n11 = n9 != 0 ? n10 : 8;
            f02.setVisibility(n11);
        }
        return n8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Context i(Context context) {
        Object object;
        block11: {
            this.P = true;
            int n8 = this.F0(context, this.a0());
            if (ax.n.f.x(context)) {
                ax.n.f.U(context);
            }
            ax.Y.h h8 = this.Z(context);
            if (context instanceof ContextThemeWrapper) {
                Configuration configuration = this.g0(context, n8, h8, null, false);
                try {
                    ((ContextThemeWrapper)context).applyOverrideConfiguration(configuration);
                    return context;
                }
                catch (IllegalStateException illegalStateException) {
                    // empty catch block
                }
            }
            if (context instanceof ax.s.c) {
                Configuration configuration = this.g0(context, n8, h8, null, false);
                try {
                    ((ax.s.c)context).a(configuration);
                    return context;
                }
                catch (IllegalStateException illegalStateException) {
                    // empty catch block
                }
            }
            if (!m0) {
                return super.i(context);
            }
            object = new Configuration();
            ((Configuration)object).uiMode = -1;
            ((Configuration)object).fontScale = 0.0f;
            object = context.createConfigurationContext((Configuration)object).getResources().getConfiguration();
            Configuration configuration = context.getResources().getConfiguration();
            ((Configuration)object).uiMode = configuration.uiMode;
            object = !object.equals(configuration) ? h.q0((Configuration)object, configuration) : null;
            h8 = this.g0(context, n8, h8, (Configuration)object, true);
            object = new ax.s.c(context, ax.m.i.d);
            ((ax.s.c)((Object)object)).a((Configuration)h8);
            try {
                context = context.getTheme();
                if (context == null) break block11;
            }
            catch (NullPointerException nullPointerException) {
                return super.i((Context)object);
            }
            h.f.a(((ax.s.c)((Object)object)).getTheme());
        }
        return super.i((Context)object);
    }

    public View i0(View view, String string, Context context, AttributeSet attributeSet) {
        if (this.f0 == null) {
            TypedArray typedArray = this.k.obtainStyledAttributes(ax.m.j.y0);
            String string2 = typedArray.getString(ax.m.j.C0);
            typedArray.recycle();
            if (string2 == null) {
                this.f0 = new z();
            } else {
                try {
                    this.f0 = (z)this.k.getClassLoader().loadClass(string2).getDeclaredConstructor(null).newInstance(null);
                }
                catch (Throwable throwable) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failed to instantiate custom view inflater ");
                    stringBuilder.append(string2);
                    stringBuilder.append(". Falling back to default.");
                    Log.i((String)"AppCompatDelegate", (String)stringBuilder.toString(), (Throwable)throwable);
                    this.f0 = new z();
                }
            }
        }
        boolean bl = k0;
        boolean bl2 = false;
        if (bl) {
            if (this.g0 == null) {
                this.g0 = new B();
            }
            if (this.g0.a(attributeSet)) {
                bl2 = true;
            } else if (attributeSet instanceof XmlPullParser) {
                if (((XmlPullParser)attributeSet).getDepth() > 1) {
                    bl2 = true;
                }
            } else {
                bl2 = this.Y0((ViewParent)view);
            }
        } else {
            bl2 = false;
        }
        return this.f0.r(view, string, context, attributeSet, bl2, bl, true, androidx.appcompat.widget.N.d());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void j0() {
        Object object = this.r;
        if (object != null) {
            object.n();
        }
        if (this.w != null) {
            this.l.getDecorView().removeCallbacks(this.x);
            if (this.w.isShowing()) {
                try {
                    this.w.dismiss();
                }
                catch (IllegalArgumentException illegalArgumentException) {}
            }
            this.w = null;
        }
        this.m0();
        object = this.w0(0, false);
        if (object != null && (object = ((s)object).j) != null) {
            ((e)object).close();
        }
    }

    boolean k0(KeyEvent keyEvent) {
        Object object = this.j;
        if ((object instanceof u.a || object instanceof x) && (object = this.l.getDecorView()) != null && ax.c0.u.d((View)object, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.m.b(this.l.getCallback(), keyEvent)) {
            return true;
        }
        int n8 = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            return this.H0(n8, keyEvent);
        }
        return this.K0(n8, keyEvent);
    }

    @Override
    public <T extends View> T l(int n8) {
        this.n0();
        return (T)this.l.findViewById(n8);
    }

    void l0(int n8) {
        s s8 = this.w0(n8, true);
        if (s8.j != null) {
            Bundle bundle = new Bundle();
            s8.j.R(bundle);
            if (bundle.size() > 0) {
                s8.s = bundle;
            }
            s8.j.f0();
            s8.j.clear();
        }
        s8.r = true;
        s8.q = true;
        if ((n8 == 108 || n8 == 0) && this.r != null && (s8 = this.w0(0, false)) != null) {
            s8.m = false;
            this.S0(s8, null);
        }
    }

    void m0() {
        n0 n02 = this.y;
        if (n02 != null) {
            n02.c();
        }
    }

    @Override
    public Context n() {
        return this.k;
    }

    public final View onCreateView(View view, String string, Context context, AttributeSet attributeSet) {
        return this.i0(view, string, context, attributeSet);
    }

    public View onCreateView(String string, Context context, AttributeSet attributeSet) {
        return this.onCreateView(null, string, context, attributeSet);
    }

    @Override
    public final b p() {
        return new f(this);
    }

    s p0(Menu menu) {
        s[] sArray = this.M;
        int n8 = sArray != null ? sArray.length : 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            s s8 = sArray[i8];
            if (s8 == null || s8.j != menu) continue;
            return s8;
        }
        return null;
    }

    @Override
    public int q() {
        return this.T;
    }

    final Context r0() {
        a a8 = this.u();
        a8 = a8 != null ? a8.m() : null;
        a a9 = a8;
        if (a8 == null) {
            a9 = this.k;
        }
        return a9;
    }

    @Override
    public MenuInflater s() {
        if (this.p == null) {
            this.z0();
            a a8 = this.o;
            a8 = a8 != null ? a8.m() : this.k;
            this.p = new ax.s.d((Context)a8);
        }
        return this.p;
    }

    @Override
    public a u() {
        this.z0();
        return this.o;
    }

    @Override
    public void v() {
        LayoutInflater layoutInflater = LayoutInflater.from((Context)this.k);
        if (layoutInflater.getFactory() == null) {
            ax.c0.v.a(layoutInflater, this);
            return;
        }
        if (!(layoutInflater.getFactory2() instanceof h)) {
            Log.i((String)"AppCompatDelegate", (String)"The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    ax.Y.h v0(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ax.n.h$k.b(configuration);
        }
        return ax.Y.h.c(ax.n.h$j.b(configuration.locale));
    }

    @Override
    public void w() {
        if (this.Q0() != null && !this.u().o()) {
            this.D0(0);
        }
    }

    protected s w0(int n8, boolean bl) {
        s[] sArray;
        Object object;
        block6: {
            block5: {
                object = this.M;
                if (object == null) break block5;
                sArray = object;
                if (((s[])object).length > n8) break block6;
            }
            sArray = new s[n8 + 1];
            if (object != null) {
                System.arraycopy(object, 0, sArray, 0, ((s[])object).length);
            }
            this.M = sArray;
        }
        s s8 = sArray[n8];
        object = s8;
        if (s8 == null) {
            sArray[n8] = object = new s(n8);
        }
        return object;
    }

    final CharSequence x0() {
        Object object = this.j;
        if (object instanceof Activity) {
            return ((Activity)object).getTitle();
        }
        return this.q;
    }

    @Override
    public void y(Configuration configuration) {
        a a8;
        if (this.G && this.A && (a8 = this.u()) != null) {
            a8.q(configuration);
        }
        androidx.appcompat.widget.k.b().g(this.k);
        this.S = new Configuration(this.k.getResources().getConfiguration());
        this.W(false, false);
    }

    final Window.Callback y0() {
        return this.l.getCallback();
    }

    @Override
    public void z(Bundle object) {
        this.P = true;
        this.V(false);
        this.o0();
        object = this.j;
        if (object instanceof Activity) {
            try {
                object = ax.P.j.c((Activity)object);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                object = null;
            }
            if (object != null) {
                object = this.Q0();
                if (object == null) {
                    this.c0 = true;
                } else {
                    ((a)object).w(true);
                }
            }
            ax.n.f.d(this);
        }
        this.S = new Configuration(this.k.getResources().getConfiguration());
        this.Q = true;
    }

    private class f
    implements b {
        final h a;

        f(h h8) {
            this.a = h8;
        }
    }

    static interface g {
        public boolean a(int var1);

        public View onCreatePanelView(int var1);
    }

    private final class h
    implements j.a {
        final h a;

        h(h h8) {
            this.a = h8;
        }

        @Override
        public void a(e e8, boolean bl) {
            this.a.c0(e8);
        }

        @Override
        public boolean b(e e8) {
            Window.Callback callback = this.a.y0();
            if (callback != null) {
                callback.onMenuOpened(108, (Menu)e8);
            }
            return true;
        }
    }

    class i
    implements a.a {
        private a.a a;
        final h b;

        public i(h h8, a.a a8) {
            this.b = h8;
            this.a = a8;
        }

        @Override
        public void a(androidx.appcompat.view.a object) {
            this.a.a((androidx.appcompat.view.a)object);
            object = this.b;
            if (((h)object).w != null) {
                ((h)object).l.getDecorView().removeCallbacks(this.b.x);
            }
            object = this.b;
            if (((h)object).v != null) {
                ((h)object).m0();
                object = this.b;
                ((h)object).y = ax.c0.d0.e((View)((h)object).v).b(0.0f);
                this.b.y.g(new p0(this){
                    final i a;
                    {
                        this.a = i8;
                    }

                    @Override
                    public void b(View object) {
                        this.a.b.v.setVisibility(8);
                        h h8 = this.a.b;
                        object = h8.w;
                        if (object != null) {
                            object.dismiss();
                        } else if (h8.v.getParent() instanceof View) {
                            ax.c0.d0.i0((View)this.a.b.v.getParent());
                        }
                        this.a.b.v.k();
                        this.a.b.y.g(null);
                        object = this.a.b;
                        object.y = null;
                        ax.c0.d0.i0((View)object.B);
                    }
                });
            }
            object = this.b;
            ax.n.d d8 = ((h)object).n;
            if (d8 != null) {
                d8.onSupportActionModeFinished(((h)object).u);
            }
            object = this.b;
            ((h)object).u = null;
            ax.c0.d0.i0((View)((h)object).B);
            this.b.f1();
        }

        @Override
        public boolean b(androidx.appcompat.view.a a8, Menu menu) {
            return this.a.b(a8, menu);
        }

        @Override
        public boolean c(androidx.appcompat.view.a a8, Menu menu) {
            ax.c0.d0.i0((View)this.b.B);
            return this.a.c(a8, menu);
        }

        @Override
        public boolean d(androidx.appcompat.view.a a8, MenuItem menuItem) {
            return this.a.d(a8, menuItem);
        }
    }

    static class j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList localeList;
            if (!ax.n.j.a((LocaleList)(configuration = ax.n.i.a(configuration)), localeList = ax.n.i.a(configuration2))) {
                ax.n.k.a(configuration3, localeList);
                configuration3.locale = configuration2.locale;
            }
        }

        static ax.Y.h b(Configuration configuration) {
            return ax.Y.h.c(ax.n.n.a(ax.n.i.a(configuration)));
        }

        public static void c(ax.Y.h h8) {
            ax.n.m.a(ax.n.l.a(h8.h()));
        }

        static void d(Configuration configuration, ax.Y.h h8) {
            ax.n.k.a(configuration, ax.n.l.a(h8.h()));
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((ax.n.o.a(configuration) & 3) != (ax.n.o.a(configuration2) & 3)) {
                ax.n.p.a(configuration3, ax.n.o.a(configuration3) | ax.n.o.a(configuration2) & 3);
            }
            if ((ax.n.o.a(configuration) & 0xC) != (ax.n.o.a(configuration2) & 0xC)) {
                ax.n.p.a(configuration3, ax.n.o.a(configuration3) | ax.n.o.a(configuration2) & 0xC);
            }
        }
    }

    static class m {
        static OnBackInvokedDispatcher a(Activity activity) {
            return ax.n.t.a(activity);
        }

        static OnBackInvokedCallback b(Object object, h object2) {
            j.Objects.requireNonNull((Object)object2);
            object2 = new v((h)object2);
            ax.n.u.a(ax.n.r.a(object), 1000000, (OnBackInvokedCallback)object2);
            return object2;
        }

        static void c(Object object, Object object2) {
            object2 = ax.n.q.a(object2);
            ax.n.s.a(ax.n.r.a(object), (OnBackInvokedCallback)object2);
        }
    }

    class n
    extends ax.s.f {
        private g b;
        private boolean c;
        private boolean d;
        private boolean e;
        final h f;

        n(h h8, Window.Callback callback) {
            this.f = h8;
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.d = true;
                boolean bl = callback.dispatchKeyEvent(keyEvent);
                return bl;
            }
            finally {
                this.d = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.c = true;
                callback.onContentChanged();
                return;
            }
            finally {
                this.c = false;
            }
        }

        public void d(Window.Callback callback, int n8, Menu menu) {
            try {
                this.e = true;
                callback.onPanelClosed(n8, menu);
                return;
            }
            finally {
                this.e = false;
            }
        }

        @Override
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.d) {
                return this.a().dispatchKeyEvent(keyEvent);
            }
            return this.f.k0(keyEvent) || super.dispatchKeyEvent(keyEvent);
            {
            }
        }

        @Override
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || this.f.J0(keyEvent.getKeyCode(), keyEvent);
            {
            }
        }

        void e(g g8) {
            this.b = g8;
        }

        final ActionMode f(ActionMode.Callback object) {
            SupportActionModeWrapper.a a8 = new SupportActionModeWrapper.a(this.f.k, (ActionMode.Callback)object);
            if ((object = this.f.S(a8)) != null) {
                return a8.e((androidx.appcompat.view.a)object);
            }
            return null;
        }

        public void onContentChanged() {
            if (this.c) {
                this.a().onContentChanged();
            }
        }

        @Override
        public boolean onCreatePanelMenu(int n8, Menu menu) {
            if (n8 == 0 && !(menu instanceof e)) {
                return false;
            }
            return super.onCreatePanelMenu(n8, menu);
        }

        @Override
        public View onCreatePanelView(int n8) {
            g g8 = this.b;
            if (g8 != null && (g8 = g8.onCreatePanelView(n8)) != null) {
                return g8;
            }
            return super.onCreatePanelView(n8);
        }

        @Override
        public boolean onMenuOpened(int n8, Menu menu) {
            super.onMenuOpened(n8, menu);
            this.f.M0(n8);
            return true;
        }

        @Override
        public void onPanelClosed(int n8, Menu menu) {
            if (this.e) {
                this.a().onPanelClosed(n8, menu);
                return;
            }
            super.onPanelClosed(n8, menu);
            this.f.N0(n8);
        }

        @Override
        public boolean onPreparePanel(int n8, View view, Menu menu) {
            g g8;
            e e8 = menu instanceof e ? (e)menu : null;
            if (n8 == 0 && e8 == null) {
                return false;
            }
            boolean bl = true;
            if (e8 != null) {
                e8.c0(true);
            }
            if ((g8 = this.b) == null || !g8.a(n8)) {
                bl = false;
            }
            boolean bl2 = bl;
            if (!bl) {
                bl2 = super.onPreparePanel(n8, view, menu);
            }
            if (e8 != null) {
                e8.c0(false);
            }
            return bl2;
        }

        @Override
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int n8) {
            Object object = this.f.w0(0, true);
            if (object != null && (object = ((s)object).j) != null) {
                super.onProvideKeyboardShortcuts(list, (Menu)object, n8);
                return;
            }
            super.onProvideKeyboardShortcuts(list, menu, n8);
        }

        @Override
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (this.f.E0()) {
                return this.f(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        @Override
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int n8) {
            if (this.f.E0() && n8 == 0) {
                return this.f(callback);
            }
            return super.onWindowStartingActionMode(callback, n8);
        }
    }

    private class o
    extends p {
        private final PowerManager c;
        final h d;

        o(h h8, Context context) {
            this.d = h8;
            super(h8);
            this.c = (PowerManager)context.getApplicationContext().getSystemService("power");
        }

        @Override
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override
        public int c() {
            if (ax.n.h$j.a(this.c)) {
                return 2;
            }
            return 1;
        }

        @Override
        public void d() {
            this.d.f();
        }
    }

    abstract class p {
        private BroadcastReceiver a;
        final h b;

        p(h h8) {
            this.b = h8;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        void a() {
            BroadcastReceiver broadcastReceiver = this.a;
            if (broadcastReceiver != null) {
                try {
                    this.b.k.unregisterReceiver(broadcastReceiver);
                }
                catch (IllegalArgumentException illegalArgumentException) {}
                this.a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            this.a();
            IntentFilter intentFilter = this.b();
            if (intentFilter != null && intentFilter.countActions() != 0) {
                if (this.a == null) {
                    this.a = new BroadcastReceiver(this){
                        final p a;
                        {
                            this.a = p8;
                        }

                        public void onReceive(Context context, Intent intent) {
                            this.a.d();
                        }
                    };
                }
                this.b.k.registerReceiver(this.a, intentFilter);
            }
        }
    }

    private class q
    extends p {
        private final G c;
        final h d;

        q(h h8, G g8) {
            this.d = h8;
            super(h8);
            this.c = g8;
        }

        @Override
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override
        public int c() {
            if (this.c.d()) {
                return 2;
            }
            return 1;
        }

        @Override
        public void d() {
            this.d.f();
        }
    }

    private class r
    extends ContentFrameLayout {
        final h i;

        public r(h h8, Context context) {
            this.i = h8;
            super(context);
        }

        private boolean b(int n8, int n9) {
            return n8 < -5 || n9 < -5 || n8 > this.getWidth() + 5 || n9 > this.getHeight() + 5;
            {
            }
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.i.k0(keyEvent) || super.dispatchKeyEvent(keyEvent);
            {
            }
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && this.b((int)motionEvent.getX(), (int)motionEvent.getY())) {
                this.i.e0(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public void setBackgroundResource(int n8) {
            this.setBackgroundDrawable(ax.o.a.b(this.getContext(), n8));
        }
    }

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
        e j;
        androidx.appcompat.view.menu.c k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q;
        boolean r;
        Bundle s;

        s(int n8) {
            this.a = n8;
            this.q = false;
        }

        androidx.appcompat.view.menu.k a(j.a a8) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.c c8;
                this.k = c8 = new androidx.appcompat.view.menu.c(this.l, ax.m.g.j);
                c8.h(a8);
                this.j.b(this.k);
            }
            return this.k.c(this.g);
        }

        public boolean b() {
            if (this.h == null) {
                return false;
            }
            if (this.i != null) {
                return true;
            }
            return this.k.b().getCount() > 0;
        }

        void c(e e8) {
            Object object = this.j;
            if (e8 != object) {
                if (object != null) {
                    ((e)object).P(this.k);
                }
                this.j = e8;
                if (e8 != null && (object = this.k) != null) {
                    e8.b((androidx.appcompat.view.menu.j)object);
                }
            }
        }

        void d(Context object) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = object.getResources().newTheme();
            theme.setTo(object.getTheme());
            theme.resolveAttribute(ax.m.a.a, typedValue, true);
            int n8 = typedValue.resourceId;
            if (n8 != 0) {
                theme.applyStyle(n8, true);
            }
            theme.resolveAttribute(ax.m.a.H, typedValue, true);
            n8 = typedValue.resourceId;
            if (n8 != 0) {
                theme.applyStyle(n8, true);
            } else {
                theme.applyStyle(ax.m.i.c, true);
            }
            object = new ax.s.c((Context)object, 0);
            object.getTheme().setTo(theme);
            this.l = object;
            object = object.obtainStyledAttributes(ax.m.j.y0);
            this.b = object.getResourceId(ax.m.j.B0, 0);
            this.f = object.getResourceId(ax.m.j.A0, 0);
            object.recycle();
        }
    }

    private final class t
    implements j.a {
        final h a;

        t(h h8) {
            this.a = h8;
        }

        @Override
        public void a(e object, boolean bl) {
            e e8 = ((e)object).D();
            boolean bl2 = e8 != object;
            h h8 = this.a;
            if (bl2) {
                object = e8;
            }
            if ((object = h8.p0((Menu)object)) != null) {
                if (bl2) {
                    this.a.b0(((s)object).a, (s)object, e8);
                    this.a.f0((s)object, true);
                    return;
                }
                this.a.f0((s)object, bl);
            }
        }

        @Override
        public boolean b(e e8) {
            if (e8 == e8.D()) {
                h h8 = this.a;
                if (h8.G && (h8 = h8.y0()) != null && !this.a.R) {
                    h8.onMenuOpened(108, e8);
                }
            }
            return true;
        }
    }
}

