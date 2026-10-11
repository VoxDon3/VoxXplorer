/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import ax.c0.F0;
import ax.c0.I;
import ax.c0.J;
import ax.c0.K;
import ax.c0.M;
import ax.c0.a;
import ax.c0.b0;
import ax.c0.c0;
import ax.c0.d;
import ax.c0.e0;
import ax.c0.e1;
import ax.c0.n0;
import ax.c0.r0;
import ax.c0.s0;
import ax.d0.H;
import java.lang.ref.WeakReference;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

@SuppressLint(value={"PrivateConstructorForUtilityClass"})
public class d0 {
    private static WeakHashMap<View, n0> a;
    private static Field b;
    private static boolean c = false;
    private static ThreadLocal<Rect> d;
    private static final int[] e;
    private static final K f;
    private static final e g;

    static {
        e = new int[]{ax.O.e.b, ax.O.e.c, ax.O.e.n, ax.O.e.y, ax.O.e.B, ax.O.e.C, ax.O.e.D, ax.O.e.E, ax.O.e.F, ax.O.e.G, ax.O.e.d, ax.O.e.e, ax.O.e.f, ax.O.e.g, ax.O.e.h, ax.O.e.i, ax.O.e.j, ax.O.e.k, ax.O.e.l, ax.O.e.m, ax.O.e.o, ax.O.e.p, ax.O.e.q, ax.O.e.r, ax.O.e.s, ax.O.e.t, ax.O.e.u, ax.O.e.v, ax.O.e.w, ax.O.e.x, ax.O.e.z, ax.O.e.A};
        f = new c0();
        g = new e();
    }

    @SuppressLint(value={"InlinedApi"})
    public static int A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.c(view);
        }
        return 0;
    }

    public static void A0(View view, String string) {
        h.v(view, string);
    }

    @Deprecated
    public static int B(View view) {
        return view.getLayoutDirection();
    }

    public static void B0(View view, float f8) {
        h.w(view, f8);
    }

    @Deprecated
    public static int C(View view) {
        return view.getMinimumHeight();
    }

    public static void C0(View view, s0.b b8) {
        s0.d(view, b8);
    }

    @Deprecated
    public static int D(View view) {
        return view.getMinimumWidth();
    }

    public static void D0(View view, float f8) {
        h.x(view, f8);
    }

    public static String[] E(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return o.a(view);
        }
        return (String[])view.getTag(ax.O.e.N);
    }

    private static f<CharSequence> E0() {
        return new f<CharSequence>(ax.O.e.P, CharSequence.class, 64, 30){

            CharSequence h(View view) {
                return n.b(view);
            }

            void i(View view, CharSequence charSequence) {
                n.f(view, charSequence);
            }

            boolean j(CharSequence charSequence, CharSequence charSequence2) {
                return TextUtils.equals((CharSequence)charSequence, (CharSequence)charSequence2) ^ true;
            }
        };
    }

    @Deprecated
    public static ViewParent F(View view) {
        return view.getParentForAccessibility();
    }

    public static void F0(View view) {
        h.z(view);
    }

    public static F0 G(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return i.a(view);
        }
        return h.j(view);
    }

    private static void G0(View view) {
        float f8 = view.getTranslationY();
        view.setTranslationY(1.0f + f8);
        view.setTranslationY(f8);
    }

    public static CharSequence H(View view) {
        return d0.E0().e(view);
    }

    public static String I(View view) {
        return h.k(view);
    }

    public static float J(View view) {
        return h.l(view);
    }

    @Deprecated
    public static e1 K(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.c(view);
        }
        Context context = view.getContext();
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                if ((context = ((Activity)context).getWindow()) != null) {
                    return r0.a((Window)context, view);
                }
                return null;
            }
            context = ((ContextWrapper)context).getBaseContext();
        }
        return null;
    }

    @Deprecated
    public static int L(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float M(View view) {
        return h.m(view);
    }

    public static boolean N(View view) {
        return d0.n(view) != null;
    }

    @Deprecated
    public static boolean O(View view) {
        return view.hasTransientState();
    }

    public static boolean P(View object) {
        object = d0.b().e((View)object);
        return object != null && ((Boolean)object).booleanValue();
    }

    @Deprecated
    public static boolean Q(View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    public static boolean R(View view) {
        return view.isLaidOut();
    }

    public static boolean S(View view) {
        return h.p(view);
    }

    public static boolean T(View object) {
        object = d0.k0().e((View)object);
        return object != null && ((Boolean)object).booleanValue();
    }

    static void U(View view, int n8) {
        int n9;
        boolean bl;
        block10: {
            block9: {
                Object object = (AccessibilityManager)view.getContext().getSystemService("accessibility");
                if (!object.isEnabled()) break block9;
                bl = d0.p(view) != null && view.isShown() && view.getWindowVisibility() == 0;
                int n10 = view.getAccessibilityLiveRegion();
                n9 = 32;
                if (n10 != 0 || bl) break block10;
                if (n8 == 32) {
                    AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain();
                    view.onInitializeAccessibilityEvent(accessibilityEvent);
                    accessibilityEvent.setEventType(32);
                    accessibilityEvent.setContentChangeTypes(n8);
                    accessibilityEvent.setSource(view);
                    view.onPopulateAccessibilityEvent(accessibilityEvent);
                    accessibilityEvent.getText().add(d0.p(view));
                    object.sendAccessibilityEvent(accessibilityEvent);
                    return;
                }
                if (view.getParent() != null) {
                    ViewParent viewParent = view.getParent();
                    try {
                        viewParent.notifySubtreeAccessibilityStateChanged(view, view, n8);
                        return;
                    }
                    catch (AbstractMethodError abstractMethodError) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append(view.getParent().getClass().getSimpleName());
                        ((StringBuilder)object).append(" does not fully implement ViewParent");
                        Log.e((String)"ViewCompat", (String)((StringBuilder)object).toString(), (Throwable)abstractMethodError);
                    }
                }
            }
            return;
        }
        AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain();
        if (!bl) {
            n9 = 2048;
        }
        accessibilityEvent.setEventType(n9);
        accessibilityEvent.setContentChangeTypes(n8);
        if (bl) {
            accessibilityEvent.getText().add(d0.p(view));
            d0.t0(view);
        }
        view.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public static void V(View view, int n8) {
        boolean bl;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(n8);
            return;
        }
        Rect rect = d0.w();
        ViewParent viewParent = view.getParent();
        if (viewParent instanceof View) {
            View view2 = (View)viewParent;
            rect.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            bl = rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ true;
        } else {
            bl = false;
        }
        d0.f(view, n8);
        if (bl && rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View)viewParent).invalidate(rect);
        }
    }

    public static void W(View view, int n8) {
        boolean bl;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(n8);
            return;
        }
        Rect rect = d0.w();
        ViewParent viewParent = view.getParent();
        if (viewParent instanceof View) {
            View view2 = (View)viewParent;
            rect.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            bl = rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) ^ true;
        } else {
            bl = false;
        }
        d0.g(view, n8);
        if (bl && rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View)viewParent).invalidate(rect);
        }
    }

    public static F0 X(View view, F0 f02) {
        WindowInsets windowInsets;
        WindowInsets windowInsets2 = f02.u();
        if (windowInsets2 != null && !(windowInsets = ax.c0.d0$g.b(view, windowInsets2)).equals((Object)windowInsets2)) {
            return F0.w(windowInsets, view);
        }
        return f02;
    }

    @Deprecated
    public static void Y(View view, H h8) {
        view.onInitializeAccessibilityNodeInfo(h8.P0());
    }

    private static f<CharSequence> Z() {
        return new f<CharSequence>(ax.O.e.K, CharSequence.class, 8, 28){

            CharSequence h(View view) {
                return l.b(view);
            }

            void i(View view, CharSequence charSequence) {
                l.h(view, charSequence);
            }

            boolean j(CharSequence charSequence, CharSequence charSequence2) {
                return TextUtils.equals((CharSequence)charSequence, (CharSequence)charSequence2) ^ true;
            }
        };
    }

    public static /* synthetic */ d a(d d8) {
        return d8;
    }

    @Deprecated
    public static boolean a0(View view, int n8, Bundle bundle) {
        return view.performAccessibilityAction(n8, bundle);
    }

    private static f<Boolean> b() {
        return new f<Boolean>(ax.O.e.J, Boolean.class, 28){

            Boolean h(View view) {
                return l.c(view);
            }

            void i(View view, Boolean bl) {
                l.g(view, bl);
            }

            boolean j(Boolean bl, Boolean bl2) {
                return this.a(bl, bl2) ^ true;
            }
        };
    }

    public static d b0(View view, d d8) {
        Object object;
        if (Log.isLoggable((String)"ViewCompat", (int)3)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("performReceiveContent: ");
            ((StringBuilder)object).append(d8);
            ((StringBuilder)object).append(", view=");
            ((StringBuilder)object).append(view.getClass().getSimpleName());
            ((StringBuilder)object).append("[");
            ((StringBuilder)object).append(view.getId());
            ((StringBuilder)object).append("]");
            Log.d((String)"ViewCompat", (String)((StringBuilder)object).toString());
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, d8);
        }
        object = (J)view.getTag(ax.O.e.M);
        if (object != null) {
            if ((d8 = object.a(view, d8)) == null) {
                return null;
            }
            return d0.x(view).a(d8);
        }
        return d0.x(view).a(d8);
    }

    public static int c(View view, CharSequence charSequence, ax.d0.M m8) {
        int n8 = d0.r(view, charSequence);
        if (n8 != -1) {
            d0.d(view, new H.a(n8, charSequence, m8));
        }
        return n8;
    }

    @Deprecated
    public static void c0(View view) {
        view.postInvalidateOnAnimation();
    }

    private static void d(View view, H.a a8) {
        d0.l(view);
        d0.g0(a8.b(), view);
        d0.q(view).add(a8);
        d0.U(view, 0);
    }

    @Deprecated
    public static void d0(View view, Runnable runnable2) {
        view.postOnAnimation(runnable2);
    }

    @Deprecated
    public static n0 e(View view) {
        n0 n02;
        if (a == null) {
            a = new WeakHashMap();
        }
        n0 n03 = n02 = a.get(view);
        if (n02 == null) {
            n03 = new n0(view);
            a.put(view, n03);
        }
        return n03;
    }

    @Deprecated
    @SuppressLint(value={"LambdaLast"})
    public static void e0(View view, Runnable runnable2, long l8) {
        view.postOnAnimationDelayed(runnable2, l8);
    }

    private static void f(View view, int n8) {
        view.offsetLeftAndRight(n8);
        if (view.getVisibility() == 0) {
            d0.G0(view);
            view = view.getParent();
            if (view instanceof View) {
                d0.G0(view);
            }
        }
    }

    public static void f0(View view, int n8) {
        d0.g0(n8, view);
        d0.U(view, 0);
    }

    private static void g(View view, int n8) {
        view.offsetTopAndBottom(n8);
        if (view.getVisibility() == 0) {
            d0.G0(view);
            view = view.getParent();
            if (view instanceof View) {
                d0.G0(view);
            }
        }
    }

    private static void g0(int n8, View object) {
        object = d0.q((View)object);
        for (int i8 = 0; i8 < object.size(); ++i8) {
            if (((H.a)object.get(i8)).b() != n8) continue;
            object.remove(i8);
            return;
        }
    }

    public static F0 h(View view, F0 f02, Rect rect) {
        return h.b(view, f02, rect);
    }

    public static void h0(View view, H.a a8, CharSequence charSequence, ax.d0.M m8) {
        if (m8 == null && charSequence == null) {
            d0.f0(view, a8.b());
            return;
        }
        d0.d(view, a8.a(charSequence, m8));
    }

    public static F0 i(View view, F0 f02) {
        WindowInsets windowInsets;
        WindowInsets windowInsets2 = f02.u();
        if (windowInsets2 != null && !(windowInsets = ax.c0.d0$g.a(view, windowInsets2)).equals((Object)windowInsets2)) {
            return F0.w(windowInsets, view);
        }
        return f02;
    }

    public static void i0(View view) {
        ax.c0.d0$g.c(view);
    }

    static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).b(view, keyEvent);
    }

    public static void j0(View view, @SuppressLint(value={"ContextFirst"}) Context context, int[] nArray, AttributeSet attributeSet, TypedArray typedArray, int n8, int n9) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.d(view, context, nArray, attributeSet, typedArray, n8, n9);
        }
    }

    static boolean k(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).f(keyEvent);
    }

    private static f<Boolean> k0() {
        return new f<Boolean>(ax.O.e.O, Boolean.class, 28){

            Boolean h(View view) {
                return l.d(view);
            }

            void i(View view, Boolean bl) {
                l.j(view, bl);
            }

            boolean j(Boolean bl, Boolean bl2) {
                return this.a(bl, bl2) ^ true;
            }
        };
    }

    static void l(View view) {
        a a8;
        a a9 = a8 = d0.m(view);
        if (a8 == null) {
            a9 = new a();
        }
        d0.l0(view, a9);
    }

    public static void l0(View view, a a8) {
        a a9 = a8;
        if (a8 == null) {
            a9 = a8;
            if (d0.n(view) instanceof a.a) {
                a9 = new a();
            }
        }
        d0.t0(view);
        a8 = a9 == null ? null : a9.d();
        view.setAccessibilityDelegate((View.AccessibilityDelegate)a8);
    }

    public static a m(View view) {
        if ((view = d0.n(view)) == null) {
            return null;
        }
        if (view instanceof a.a) {
            return ((a.a)view).a;
        }
        return new a((View.AccessibilityDelegate)view);
    }

    public static void m0(View view, boolean bl) {
        d0.b().f(view, bl);
    }

    private static View.AccessibilityDelegate n(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return m.a(view);
        }
        return d0.o(view);
    }

    public static void n0(View view, CharSequence charSequence) {
        d0.Z().f(view, charSequence);
        if (charSequence != null) {
            g.a(view);
            return;
        }
        g.d(view);
    }

    private static View.AccessibilityDelegate o(View object) {
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field field;
                b = field = View.class.getDeclaredField("mAccessibilityDelegate");
                ((AccessibleObject)field).setAccessible(true);
            }
            catch (Throwable throwable) {
                c = true;
                return null;
            }
        }
        try {
            object = b.get(object);
            if (object instanceof View.AccessibilityDelegate) {
                object = (View.AccessibilityDelegate)object;
                return object;
            }
            return null;
        }
        catch (Throwable throwable) {
            c = true;
            return null;
        }
    }

    @Deprecated
    public static void o0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static CharSequence p(View view) {
        return d0.Z().e(view);
    }

    public static void p0(View view, ColorStateList colorStateList) {
        int n8 = Build.VERSION.SDK_INT;
        h.q(view, colorStateList);
        if (n8 == 21) {
            colorStateList = view.getBackground();
            n8 = h.g(view) == null && h.h(view) == null ? 0 : 1;
            if (colorStateList != null && n8 != 0) {
                if (colorStateList.isStateful()) {
                    colorStateList.setState(view.getDrawableState());
                }
                view.setBackground((Drawable)colorStateList);
            }
        }
    }

    private static List<H.a> q(View view) {
        ArrayList arrayList;
        int n8 = ax.O.e.H;
        ArrayList arrayList2 = arrayList = (ArrayList)view.getTag(n8);
        if (arrayList == null) {
            arrayList2 = new ArrayList();
            view.setTag(n8, arrayList2);
        }
        return arrayList2;
    }

    public static void q0(View view, PorterDuff.Mode mode) {
        int n8 = Build.VERSION.SDK_INT;
        h.r(view, mode);
        if (n8 == 21) {
            mode = view.getBackground();
            n8 = h.g(view) == null && h.h(view) == null ? 0 : 1;
            if (mode != null && n8 != 0) {
                if (mode.isStateful()) {
                    mode.setState(view.getDrawableState());
                }
                view.setBackground((Drawable)mode);
            }
        }
    }

    private static int r(View object, CharSequence object2) {
        int n8;
        object = d0.q((View)object);
        for (n8 = 0; n8 < object.size(); ++n8) {
            if (!TextUtils.equals((CharSequence)object2, (CharSequence)((H.a)object.get(n8)).c())) continue;
            return ((H.a)object.get(n8)).b();
        }
        Object object3 = -1;
        for (n8 = 0; n8 < ((Object)(object2 = (Object)e)).length && object3 == -1; ++n8) {
            Object object4 = object2[n8];
            boolean bl = true;
            for (int i8 = 0; i8 < object.size(); ++i8) {
                boolean bl2 = ((H.a)object.get(i8)).b() != object4;
                bl &= bl2;
            }
            if (!bl) continue;
            object3 = object4;
        }
        return object3;
    }

    public static void r0(View view, float f8) {
        h.s(view, f8);
    }

    public static ColorStateList s(View view) {
        return h.g(view);
    }

    @Deprecated
    public static void s0(View view, int n8) {
        view.setImportantForAccessibility(n8);
    }

    public static PorterDuff.Mode t(View view) {
        return h.h(view);
    }

    private static void t0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Deprecated
    public static Display u(View view) {
        return view.getDisplay();
    }

    public static void u0(View view, int n8) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.m(view, n8);
        }
    }

    public static float v(View view) {
        return h.i(view);
    }

    public static void v0(View view, I i8) {
        h.u(view, i8);
    }

    private static Rect w() {
        Rect rect;
        if (d == null) {
            d = new ThreadLocal();
        }
        Rect rect2 = rect = d.get();
        if (rect == null) {
            rect2 = new Rect();
            d.set(rect2);
        }
        rect2.setEmpty();
        return rect2;
    }

    public static void w0(View view, M object) {
        if (Build.VERSION.SDK_INT >= 24) {
            object = object != null ? ((M)object).a() : null;
            j.d(view, b0.a(object));
        }
    }

    private static K x(View view) {
        if (view instanceof K) {
            return (K)view;
        }
        return f;
    }

    public static void x0(View view, boolean bl) {
        d0.k0().f(view, bl);
    }

    @Deprecated
    public static boolean y(View view) {
        return view.getFitsSystemWindows();
    }

    public static void y0(View view, int n8, int n9) {
        if (Build.VERSION.SDK_INT >= 23) {
            i.d(view, n8, n9);
        }
    }

    @Deprecated
    public static int z(View view) {
        return view.getImportantForAccessibility();
    }

    public static void z0(View view, CharSequence charSequence) {
        d0.E0().f(view, charSequence);
    }

    static class e
    implements ViewTreeObserver.OnGlobalLayoutListener,
    View.OnAttachStateChangeListener {
        private final WeakHashMap<View, Boolean> a = new WeakHashMap();

        e() {
        }

        private void b(Map.Entry<View, Boolean> entry) {
            boolean bl;
            View view = entry.getKey();
            boolean bl2 = entry.getValue();
            if (bl2 != (bl = view.isShown() && view.getWindowVisibility() == 0)) {
                int n8 = bl ? 16 : 32;
                d0.U(view, n8);
                entry.setValue(bl);
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
        }

        void a(View view) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            boolean bl = view.isShown() && view.getWindowVisibility() == 0;
            weakHashMap.put(view, bl);
            view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
            if (view.isAttachedToWindow()) {
                this.c(view);
            }
        }

        void d(View view) {
            this.a.remove(view);
            view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
            this.e(view);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> iterator = this.a.entrySet().iterator();
                while (iterator.hasNext()) {
                    this.b(iterator.next());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            this.c(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f<T> {
        private final int a;
        private final Class<T> b;
        private final int c;
        private final int d;

        f(int n8, Class<T> clazz, int n9) {
            this(n8, clazz, 0, n9);
        }

        f(int n8, Class<T> clazz, int n9, int n10) {
            this.a = n8;
            this.b = clazz;
            this.d = n9;
            this.c = n10;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        boolean a(Boolean bl, Boolean bl2) {
            boolean bl3;
            boolean bl4 = bl != null && bl != false;
            return bl4 == (bl3 = bl2 != null && bl2 != false);
        }

        abstract T c(View var1);

        abstract void d(View var1, T var2);

        T e(View object) {
            if (this.b()) {
                return this.c((View)object);
            }
            if (this.b.isInstance(object = object.getTag(this.a))) {
                return (T)object;
            }
            return null;
        }

        void f(View view, T t8) {
            if (this.b()) {
                this.d(view, t8);
                return;
            }
            if (this.g(this.e(view), t8)) {
                d0.l(view);
                view.setTag(this.a, t8);
                d0.U(view, this.d);
            }
        }

        abstract boolean g(T var1, T var2);
    }

    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class h {
        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener)view.getTag(ax.O.e.S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static F0 b(View view, F0 f02, Rect rect) {
            WindowInsets windowInsets = f02.u();
            if (windowInsets != null) {
                return F0.w(view.computeSystemWindowInsets(windowInsets, rect), view);
            }
            rect.setEmpty();
            return f02;
        }

        static boolean c(View view, float f8, float f9, boolean bl) {
            return view.dispatchNestedFling(f8, f9, bl);
        }

        static boolean d(View view, float f8, float f9) {
            return view.dispatchNestedPreFling(f8, f9);
        }

        static boolean e(View view, int n8, int n9, int[] nArray, int[] nArray2) {
            return view.dispatchNestedPreScroll(n8, n9, nArray, nArray2);
        }

        static boolean f(View view, int n8, int n9, int n10, int n11, int[] nArray) {
            return view.dispatchNestedScroll(n8, n9, n10, n11, nArray);
        }

        static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        static float i(View view) {
            return view.getElevation();
        }

        public static F0 j(View view) {
            return F0.a.a(view);
        }

        static String k(View view) {
            return view.getTransitionName();
        }

        static float l(View view) {
            return view.getTranslationZ();
        }

        static float m(View view) {
            return view.getZ();
        }

        static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void s(View view, float f8) {
            view.setElevation(f8);
        }

        static void t(View view, boolean bl) {
            view.setNestedScrollingEnabled(bl);
        }

        static void u(View view, I i8) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(ax.O.e.L, (Object)i8);
            }
            if (i8 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)view.getTag(ax.O.e.S));
                return;
            }
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(){
                F0 a;
                final View b;
                final I c;
                {
                    this.b = view;
                    this.c = i8;
                    this.a = null;
                }

                public WindowInsets onApplyWindowInsets(View view, WindowInsets object) {
                    F0 f02 = F0.w((WindowInsets)object, view);
                    int n8 = Build.VERSION.SDK_INT;
                    if (n8 < 30) {
                        h.a((WindowInsets)object, this.b);
                        if (f02.equals(this.a)) {
                            return this.c.a(view, f02).u();
                        }
                    }
                    this.a = f02;
                    object = this.c.a(view, f02);
                    if (n8 >= 30) {
                        return ((F0)object).u();
                    }
                    d0.i0(view);
                    return ((F0)object).u();
                }
            });
        }

        static void v(View view, String string) {
            view.setTransitionName(string);
        }

        static void w(View view, float f8) {
            view.setTranslationZ(f8);
        }

        static void x(View view, float f8) {
            view.setZ(f8);
        }

        static boolean y(View view, int n8) {
            return view.startNestedScroll(n8);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    private static class i {
        public static F0 a(View view) {
            Object object = view.getRootWindowInsets();
            if (object == null) {
                return null;
            }
            object = F0.v((WindowInsets)object);
            ((F0)object).s((F0)object);
            ((F0)object).d(view.getRootView());
            return object;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int n8) {
            view.setScrollIndicators(n8);
        }

        static void d(View view, int n8, int n9) {
            view.setScrollIndicators(n8, n9);
        }
    }

    static class j {
        static void a(View view) {
            view.cancelDragAndDrop();
        }

        static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        static void d(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object object, int n8) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, object, n8);
        }

        static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    static class k {
        static void a(View view, Collection<View> collection, int n8) {
            view.addKeyboardNavigationClusters(collection, n8);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        static int c(View view) {
            return view.getImportantForAutofill();
        }

        static int d(View view) {
            return view.getNextClusterForwardId();
        }

        static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        static View i(View view, View view2, int n8) {
            return view.keyboardNavigationClusterSearch(view2, n8);
        }

        static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        static void k(View view, String ... stringArray) {
            view.setAutofillHints(stringArray);
        }

        static void l(View view, boolean bl) {
            view.setFocusedByDefault(bl);
        }

        static void m(View view, int n8) {
            view.setImportantForAutofill(n8);
        }

        static void n(View view, boolean bl) {
            view.setKeyboardNavigationCluster(bl);
        }

        static void o(View view, int n8) {
            view.setNextClusterForwardId(n8);
        }

        static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    static class l {
        static void a(View view, q q8) {
            int n8 = ax.O.e.R;
            Object object = (ax.B.k<q, Object>)view.getTag(n8);
            ax.B.k<q, Object> k8 = object;
            if (object == null) {
                k8 = new ax.B.k<q, Object>();
                view.setTag(n8, k8);
            }
            j.Objects.requireNonNull((Object)q8);
            object = new e0(q8);
            k8.put(q8, object);
            view.addOnUnhandledKeyEventListener((View.OnUnhandledKeyEventListener)object);
        }

        static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        static void e(View view, q q8) {
            ax.B.k k8 = (ax.B.k)view.getTag(ax.O.e.R);
            if (k8 != null && (q8 = (View.OnUnhandledKeyEventListener)k8.get(q8)) != null) {
                view.removeOnUnhandledKeyEventListener((View.OnUnhandledKeyEventListener)q8);
            }
        }

        static <T> T f(View view, int n8) {
            return (T)view.requireViewById(n8);
        }

        static void g(View view, boolean bl) {
            view.setAccessibilityHeading(bl);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, ax.e0.a a8) {
            view.setAutofillId(null);
        }

        static void j(View view, boolean bl) {
            view.setScreenReaderFocusable(bl);
        }
    }

    private static class m {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        static void d(View view, Context context, int[] nArray, AttributeSet attributeSet, TypedArray typedArray, int n8, int n9) {
            view.saveAttributeDataForStyleable(context, nArray, attributeSet, typedArray, n8, n9);
        }

        static void e(View view, ax.f0.a a8) {
            view.setContentCaptureSession(null);
        }

        static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    private static class n {
        static int a(View view) {
            return view.getImportantForContentCapture();
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static e1 c(View view) {
            if ((view = view.getWindowInsetsController()) != null) {
                return e1.f((WindowInsetsController)view);
            }
            return null;
        }

        static boolean d(View view) {
            return view.isImportantForContentCapture();
        }

        static void e(View view, int n8) {
            view.setImportantForContentCapture(n8);
        }

        static void f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static d b(View view, d d8) {
            ContentInfo contentInfo = d8.f();
            if ((view = view.performReceiveContent(contentInfo)) == null) {
                return null;
            }
            if (view == contentInfo) {
                return d8;
            }
            return ax.c0.d.g((ContentInfo)view);
        }

        public static void c(View view, String[] stringArray, J j8) {
            if (j8 == null) {
                view.setOnReceiveContentListener(stringArray, null);
                return;
            }
            view.setOnReceiveContentListener(stringArray, (OnReceiveContentListener)new p(j8));
        }
    }

    private static final class p
    implements OnReceiveContentListener {
        private final J a;

        p(J j8) {
            this.a = j8;
        }

        public ContentInfo onReceiveContent(View object, ContentInfo contentInfo) {
            d d8 = ax.c0.d.g(contentInfo);
            if ((object = this.a.a((View)object, d8)) == null) {
                return null;
            }
            if (object == d8) {
                return contentInfo;
            }
            return ((d)object).f();
        }
    }

    public static interface q {
        public boolean onUnhandledKeyEvent(View var1, KeyEvent var2);
    }

    static class r {
        private static final ArrayList<WeakReference<View>> d = new ArrayList();
        private WeakHashMap<View, Boolean> a = null;
        private SparseArray<WeakReference<View>> b = null;
        private WeakReference<KeyEvent> c = null;

        r() {
        }

        static r a(View view) {
            r r8;
            int n8 = ax.O.e.Q;
            r r9 = r8 = (r)view.getTag(n8);
            if (r8 == null) {
                r9 = new r();
                view.setTag(n8, (Object)r9);
            }
            return r9;
        }

        private View c(View view, KeyEvent keyEvent) {
            View view2 = this.a;
            if (view2 != null && view2.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup)view;
                    for (int i8 = viewGroup.getChildCount() - 1; i8 >= 0; --i8) {
                        view2 = this.c(viewGroup.getChildAt(i8), keyEvent);
                        if (view2 == null) continue;
                        return view2;
                    }
                }
                if (this.e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.b == null) {
                this.b = new SparseArray();
            }
            return this.b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList)view.getTag(ax.O.e.R);
            if (arrayList != null) {
                for (int i8 = arrayList.size() - 1; i8 >= 0; --i8) {
                    if (!((q)arrayList.get(i8)).onUnhandledKeyEvent(view, keyEvent)) continue;
                    return true;
                }
            }
            return false;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void g() {
            ArrayList<WeakReference<View>> arrayList;
            Object object = this.a;
            if (object != null) {
                ((WeakHashMap)object).clear();
            }
            if ((arrayList = d).isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.a == null) {
                        object = new WeakHashMap();
                        this.a = object;
                    }
                }
                catch (Throwable throwable) {}
                throw throwable;
                for (int i8 = arrayList.size() - 1; i8 >= 0; --i8) {
                    object = d;
                    View view = (View)((WeakReference)((ArrayList)object).get(i8)).get();
                    if (view == null) {
                        ((ArrayList)object).remove(i8);
                        continue;
                    }
                    this.a.put(view, Boolean.TRUE);
                    object = view.getParent();
                    while (object instanceof View) {
                        this.a.put((View)object, Boolean.TRUE);
                        object = object.getParent();
                    }
                }
                return;
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                this.g();
            }
            view = this.c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int n8 = keyEvent.getKeyCode();
                if (view != null && !KeyEvent.isModifierKey((int)n8)) {
                    this.d().put(n8, new WeakReference<View>(view));
                }
            }
            return view != null;
        }

        boolean f(KeyEvent keyEvent) {
            int n8;
            WeakReference weakReference = this.c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.c = new WeakReference<KeyEvent>(keyEvent);
            SparseArray<WeakReference<View>> sparseArray = this.d();
            if (keyEvent.getAction() == 1 && (n8 = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference = (WeakReference)sparseArray.valueAt(n8);
                sparseArray.removeAt(n8);
            } else {
                weakReference = null;
            }
            WeakReference weakReference2 = weakReference;
            if (weakReference == null) {
                weakReference2 = (WeakReference)sparseArray.get(keyEvent.getKeyCode());
            }
            if (weakReference2 != null) {
                weakReference = (View)weakReference2.get();
                if (weakReference != null && weakReference.isAttachedToWindow()) {
                    this.e((View)weakReference, keyEvent);
                }
                return true;
            }
            return false;
        }
    }
}

