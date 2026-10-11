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
import ax.c0.C1753a;
import ax.c0.C1760d0;
import ax.c0.C1789s0;
import ax.c0.F0;
import ax.d0.H;
import ax.e0.C1967a;
import ax.f0.C2002a;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: ax.c0.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1760d0 {
    private static WeakHashMap<View, C1780n0> a = null;
    private static Field b = null;
    private static boolean c = false;
    private static ThreadLocal<Rect> d;
    private static final int[] e = {ax.O.e.b, ax.O.e.c, ax.O.e.n, ax.O.e.y, ax.O.e.B, ax.O.e.C, ax.O.e.D, ax.O.e.E, ax.O.e.F, ax.O.e.G, ax.O.e.d, ax.O.e.e, ax.O.e.f, ax.O.e.g, ax.O.e.h, ax.O.e.i, ax.O.e.j, ax.O.e.k, ax.O.e.l, ax.O.e.m, ax.O.e.o, ax.O.e.p, ax.O.e.q, ax.O.e.r, ax.O.e.s, ax.O.e.t, ax.O.e.u, ax.O.e.v, ax.O.e.w, ax.O.e.x, ax.O.e.z, ax.O.e.A};
    private static final K f = new K() { // from class: ax.c0.c0
        @Override // ax.c0.K
        public final C1759d a(C1759d c1759d) {
            return C1760d0.a(c1759d);
        }
    };
    private static final e g = new e();

    /* renamed from: ax.c0.d0$a */
    class a extends f<Boolean> {
        a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.c0.C1760d0.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.d(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.c0.C1760d0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.j(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.c0.C1760d0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* renamed from: ax.c0.d0$b */
    class b extends f<CharSequence> {
        b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.c0.C1760d0.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.c0.C1760d0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.h(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.c0.C1760d0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: ax.c0.d0$c */
    class c extends f<CharSequence> {
        c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.c0.C1760d0.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.c0.C1760d0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.f(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.c0.C1760d0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: ax.c0.d0$d */
    class d extends f<Boolean> {
        d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.c0.C1760d0.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.c0.C1760d0.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.g(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ax.c0.C1760d0.f
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* renamed from: ax.c0.d0$f */
    static abstract class f<T> {
        private final int a;
        private final Class<T> b;
        private final int c;
        private final int d;

        f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract T c(View view);

        abstract void d(View view, T t);

        T e(View view) {
            if (b()) {
                return c(view);
            }
            T t = (T) view.getTag(this.a);
            if (this.b.isInstance(t)) {
                return t;
            }
            return null;
        }

        void f(View view, T t) {
            if (b()) {
                d(view, t);
            } else if (g(e(view), t)) {
                C1760d0.l(view);
                view.setTag(this.a, t);
                C1760d0.U(view, this.d);
            }
        }

        abstract boolean g(T t, T t2);

        f(int i, Class<T> cls, int i2, int i3) {
            this.a = i;
            this.b = cls;
            this.d = i2;
            this.c = i3;
        }
    }

    /* renamed from: ax.c0.d0$g */
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

    /* renamed from: ax.c0.d0$h */
    private static class h {

        /* renamed from: ax.c0.d0$h$a */
        class a implements View.OnApplyWindowInsetsListener {
            F0 a = null;
            final /* synthetic */ View b;
            final /* synthetic */ I c;

            a(View view, I i) {
                this.b = view;
                this.c = i;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                F0 w = F0.w(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    h.a(windowInsets, this.b);
                    if (w.equals(this.a)) {
                        return this.c.a(view, w).u();
                    }
                }
                this.a = w;
                F0 a = this.c.a(view, w);
                if (i >= 30) {
                    return a.u();
                }
                C1760d0.i0(view);
                return a.u();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(ax.O.e.S);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static F0 b(View view, F0 f0, Rect rect) {
            WindowInsets u = f0.u();
            if (u != null) {
                return F0.w(view.computeSystemWindowInsets(u, rect), view);
            }
            rect.setEmpty();
            return f0;
        }

        static boolean c(View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        static boolean d(View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        static boolean e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        static boolean f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
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

        static void s(View view, float f) {
            view.setElevation(f);
        }

        static void t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        static void u(View view, I i) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(ax.O.e.L, i);
            }
            if (i == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(ax.O.e.S));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, i));
            }
        }

        static void v(View view, String str) {
            view.setTransitionName(str);
        }

        static void w(View view, float f) {
            view.setTranslationZ(f);
        }

        static void x(View view, float f) {
            view.setZ(f);
        }

        static boolean y(View view, int i) {
            return view.startNestedScroll(i);
        }

        static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: ax.c0.d0$i */
    private static class i {
        public static F0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            F0 v = F0.v(rootWindowInsets);
            v.s(v);
            v.d(view.getRootView());
            return v;
        }

        static int b(View view) {
            return view.getScrollIndicators();
        }

        static void c(View view, int i) {
            view.setScrollIndicators(i);
        }

        static void d(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: ax.c0.d0$j */
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

        static boolean e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        static void f(View view, View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    /* renamed from: ax.c0.d0$k */
    static class k {
        static void a(View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
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

        static View i(View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        static void l(View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        static void m(View view, int i) {
            view.setImportantForAutofill(i);
        }

        static void n(View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        static void o(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: ax.c0.d0$l */
    static class l {
        static void a(View view, final q qVar) {
            int i = ax.O.e.R;
            ax.B.k kVar = (ax.B.k) view.getTag(i);
            if (kVar == null) {
                kVar = new ax.B.k();
                view.setTag(i, kVar);
            }
            Objects.requireNonNull(qVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: ax.c0.e0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return C1760d0.q.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            kVar.put(qVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
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

        static void e(View view, q qVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            ax.B.k kVar = (ax.B.k) view.getTag(ax.O.e.R);
            if (kVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) kVar.get(qVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        static <T> T f(View view, int i) {
            return (T) view.requireViewById(i);
        }

        static void g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, C1967a c1967a) {
            view.setAutofillId(null);
        }

        static void j(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* renamed from: ax.c0.d0$m */
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

        static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        static void e(View view, C2002a c2002a) {
            view.setContentCaptureSession(null);
        }

        static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: ax.c0.d0$n */
    private static class n {
        static int a(View view) {
            return view.getImportantForContentCapture();
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static e1 c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return e1.f(windowInsetsController);
            }
            return null;
        }

        static boolean d(View view) {
            return view.isImportantForContentCapture();
        }

        static void e(View view, int i) {
            view.setImportantForContentCapture(i);
        }

        static void f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: ax.c0.d0$o */
    private static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C1759d b(View view, C1759d c1759d) {
            ContentInfo f = c1759d.f();
            ContentInfo performReceiveContent = view.performReceiveContent(f);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == f ? c1759d : C1759d.g(performReceiveContent);
        }

        public static void c(View view, String[] strArr, J j) {
            if (j == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new p(j));
            }
        }
    }

    /* renamed from: ax.c0.d0$p */
    private static final class p implements OnReceiveContentListener {
        private final J a;

        p(J j) {
            this.a = j;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C1759d g = C1759d.g(contentInfo);
            C1759d a = this.a.a(view, g);
            if (a == null) {
                return null;
            }
            return a == g ? contentInfo : a.f();
        }
    }

    /* renamed from: ax.c0.d0$q */
    public interface q {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* renamed from: ax.c0.d0$r */
    static class r {
        private static final ArrayList<WeakReference<View>> d = new ArrayList<>();
        private WeakHashMap<View, Boolean> a = null;
        private SparseArray<WeakReference<View>> b = null;
        private WeakReference<KeyEvent> c = null;

        r() {
        }

        static r a(View view) {
            int i = ax.O.e.Q;
            r rVar = (r) view.getTag(i);
            if (rVar != null) {
                return rVar;
            }
            r rVar2 = new r();
            view.setTag(i, rVar2);
            return rVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray<WeakReference<View>> d() {
            if (this.b == null) {
                this.b = new SparseArray<>();
            }
            return this.b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(ax.O.e.R);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((q) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        private void g() {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.a == null) {
                        this.a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View c = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference<>(c));
                }
            }
            return c != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> d2 = d();
            if (keyEvent.getAction() != 1 || (indexOfKey = d2.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = d2.valueAt(indexOfKey);
                d2.removeAt(indexOfKey);
            }
            if (weakReference == null) {
                weakReference = d2.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int A(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.c(view);
        }
        return 0;
    }

    public static void A0(View view, String str) {
        h.v(view, str);
    }

    @Deprecated
    public static int B(View view) {
        return view.getLayoutDirection();
    }

    public static void B0(View view, float f2) {
        h.w(view, f2);
    }

    @Deprecated
    public static int C(View view) {
        return view.getMinimumHeight();
    }

    public static void C0(View view, C1789s0.b bVar) {
        C1789s0.d(view, bVar);
    }

    @Deprecated
    public static int D(View view) {
        return view.getMinimumWidth();
    }

    public static void D0(View view, float f2) {
        h.x(view, f2);
    }

    public static String[] E(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(ax.O.e.N);
    }

    private static f<CharSequence> E0() {
        return new c(ax.O.e.P, CharSequence.class, 64, 30);
    }

    @Deprecated
    public static ViewParent F(View view) {
        return view.getParentForAccessibility();
    }

    public static void F0(View view) {
        h.z(view);
    }

    public static F0 G(View view) {
        return Build.VERSION.SDK_INT >= 23 ? i.a(view) : h.j(view);
    }

    private static void G0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static CharSequence H(View view) {
        return E0().e(view);
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
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return C1787r0.a(window, view);
                }
                return null;
            }
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
        return n(view) != null;
    }

    @Deprecated
    public static boolean O(View view) {
        return view.hasTransientState();
    }

    public static boolean P(View view) {
        Boolean e2 = b().e(view);
        return e2 != null && e2.booleanValue();
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

    public static boolean T(View view) {
        Boolean e2 = k0().e(view);
        return e2 != null && e2.booleanValue();
    }

    static void U(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = p(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i2);
                if (z) {
                    obtain.getText().add(p(view));
                    t0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(p(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static void V(View view, int i2) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i2);
            return;
        }
        Rect w = w();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            w.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !w.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        f(view, i2);
        if (z && w.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(w);
        }
    }

    public static void W(View view, int i2) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i2);
            return;
        }
        Rect w = w();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            w.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !w.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        g(view, i2);
        if (z && w.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(w);
        }
    }

    public static F0 X(View view, F0 f0) {
        WindowInsets u = f0.u();
        if (u != null) {
            WindowInsets b2 = g.b(view, u);
            if (!b2.equals(u)) {
                return F0.w(b2, view);
            }
        }
        return f0;
    }

    @Deprecated
    public static void Y(View view, ax.d0.H h2) {
        view.onInitializeAccessibilityNodeInfo(h2.P0());
    }

    private static f<CharSequence> Z() {
        return new b(ax.O.e.K, CharSequence.class, 8, 28);
    }

    public static /* synthetic */ C1759d a(C1759d c1759d) {
        return c1759d;
    }

    @Deprecated
    public static boolean a0(View view, int i2, Bundle bundle) {
        return view.performAccessibilityAction(i2, bundle);
    }

    private static f<Boolean> b() {
        return new d(ax.O.e.J, Boolean.class, 28);
    }

    public static C1759d b0(View view, C1759d c1759d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c1759d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, c1759d);
        }
        J j2 = (J) view.getTag(ax.O.e.M);
        if (j2 == null) {
            return x(view).a(c1759d);
        }
        C1759d a2 = j2.a(view, c1759d);
        if (a2 == null) {
            return null;
        }
        return x(view).a(a2);
    }

    public static int c(View view, CharSequence charSequence, ax.d0.M m2) {
        int r2 = r(view, charSequence);
        if (r2 != -1) {
            d(view, new H.a(r2, charSequence, m2));
        }
        return r2;
    }

    @Deprecated
    public static void c0(View view) {
        view.postInvalidateOnAnimation();
    }

    private static void d(View view, H.a aVar) {
        l(view);
        g0(aVar.b(), view);
        q(view).add(aVar);
        U(view, 0);
    }

    @Deprecated
    public static void d0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @Deprecated
    public static C1780n0 e(View view) {
        if (a == null) {
            a = new WeakHashMap<>();
        }
        C1780n0 c1780n0 = a.get(view);
        if (c1780n0 != null) {
            return c1780n0;
        }
        C1780n0 c1780n02 = new C1780n0(view);
        a.put(view, c1780n02);
        return c1780n02;
    }

    @SuppressLint({"LambdaLast"})
    @Deprecated
    public static void e0(View view, Runnable runnable, long j2) {
        view.postOnAnimationDelayed(runnable, j2);
    }

    private static void f(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            G0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                G0((View) parent);
            }
        }
    }

    public static void f0(View view, int i2) {
        g0(i2, view);
        U(view, 0);
    }

    private static void g(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            G0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                G0((View) parent);
            }
        }
    }

    private static void g0(int i2, View view) {
        List<H.a> q2 = q(view);
        for (int i3 = 0; i3 < q2.size(); i3++) {
            if (q2.get(i3).b() == i2) {
                q2.remove(i3);
                return;
            }
        }
    }

    public static F0 h(View view, F0 f0, Rect rect) {
        return h.b(view, f0, rect);
    }

    public static void h0(View view, H.a aVar, CharSequence charSequence, ax.d0.M m2) {
        if (m2 == null && charSequence == null) {
            f0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, m2));
        }
    }

    public static F0 i(View view, F0 f0) {
        WindowInsets u = f0.u();
        if (u != null) {
            WindowInsets a2 = g.a(view, u);
            if (!a2.equals(u)) {
                return F0.w(a2, view);
            }
        }
        return f0;
    }

    public static void i0(View view) {
        g.c(view);
    }

    static boolean j(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).b(view, keyEvent);
    }

    public static void j0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.d(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    static boolean k(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return r.a(view).f(keyEvent);
    }

    private static f<Boolean> k0() {
        return new a(ax.O.e.O, Boolean.class, 28);
    }

    static void l(View view) {
        C1753a m2 = m(view);
        if (m2 == null) {
            m2 = new C1753a();
        }
        l0(view, m2);
    }

    public static void l0(View view, C1753a c1753a) {
        if (c1753a == null && (n(view) instanceof C1753a.C0264a)) {
            c1753a = new C1753a();
        }
        t0(view);
        view.setAccessibilityDelegate(c1753a == null ? null : c1753a.d());
    }

    public static C1753a m(View view) {
        View.AccessibilityDelegate n2 = n(view);
        if (n2 == null) {
            return null;
        }
        return n2 instanceof C1753a.C0264a ? ((C1753a.C0264a) n2).a : new C1753a(n2);
    }

    public static void m0(View view, boolean z) {
        b().f(view, Boolean.valueOf(z));
    }

    private static View.AccessibilityDelegate n(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : o(view);
    }

    public static void n0(View view, CharSequence charSequence) {
        Z().f(view, charSequence);
        if (charSequence != null) {
            g.a(view);
        } else {
            g.d(view);
        }
    }

    private static View.AccessibilityDelegate o(View view) {
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    @Deprecated
    public static void o0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static CharSequence p(View view) {
        return Z().e(view);
    }

    public static void p0(View view, ColorStateList colorStateList) {
        int i2 = Build.VERSION.SDK_INT;
        h.q(view, colorStateList);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z = (h.g(view) == null && h.h(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    private static List<H.a> q(View view) {
        int i2 = ax.O.e.H;
        ArrayList arrayList = (ArrayList) view.getTag(i2);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i2, arrayList2);
        return arrayList2;
    }

    public static void q0(View view, PorterDuff.Mode mode) {
        int i2 = Build.VERSION.SDK_INT;
        h.r(view, mode);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z = (h.g(view) == null && h.h(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    private static int r(View view, CharSequence charSequence) {
        List<H.a> q2 = q(view);
        for (int i2 = 0; i2 < q2.size(); i2++) {
            if (TextUtils.equals(charSequence, q2.get(i2).c())) {
                return q2.get(i2).b();
            }
        }
        int i3 = 0;
        int i4 = -1;
        while (true) {
            int[] iArr = e;
            if (i3 >= iArr.length || i4 != -1) {
                break;
            }
            int i5 = iArr[i3];
            boolean z = true;
            for (int i6 = 0; i6 < q2.size(); i6++) {
                z &= q2.get(i6).b() != i5;
            }
            if (z) {
                i4 = i5;
            }
            i3++;
        }
        return i4;
    }

    public static void r0(View view, float f2) {
        h.s(view, f2);
    }

    public static ColorStateList s(View view) {
        return h.g(view);
    }

    @Deprecated
    public static void s0(View view, int i2) {
        view.setImportantForAccessibility(i2);
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

    public static void u0(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.m(view, i2);
        }
    }

    public static float v(View view) {
        return h.i(view);
    }

    public static void v0(View view, I i2) {
        h.u(view, i2);
    }

    private static Rect w() {
        if (d == null) {
            d = new ThreadLocal<>();
        }
        Rect rect = d.get();
        if (rect == null) {
            rect = new Rect();
            d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void w0(View view, M m2) {
        if (Build.VERSION.SDK_INT >= 24) {
            j.d(view, C1756b0.a(m2 != null ? m2.a() : null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static K x(View view) {
        return view instanceof K ? (K) view : f;
    }

    public static void x0(View view, boolean z) {
        k0().f(view, Boolean.valueOf(z));
    }

    @Deprecated
    public static boolean y(View view) {
        return view.getFitsSystemWindows();
    }

    public static void y0(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            i.d(view, i2, i3);
        }
    }

    @Deprecated
    public static int z(View view) {
        return view.getImportantForAccessibility();
    }

    public static void z0(View view, CharSequence charSequence) {
        E0().f(view, charSequence);
    }

    /* renamed from: ax.c0.d0$e */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        private final WeakHashMap<View, Boolean> a = new WeakHashMap<>();

        e() {
        }

        private void b(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean booleanValue = entry.getValue().booleanValue();
            boolean z = key.isShown() && key.getWindowVisibility() == 0;
            if (booleanValue != z) {
                C1760d0.U(key, z ? 16 : 32);
                entry.setValue(Boolean.valueOf(z));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.a.entrySet().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
