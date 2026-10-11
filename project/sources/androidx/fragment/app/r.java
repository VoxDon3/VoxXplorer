package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.z;
import androidx.lifecycle.d;
import ax.c0.C1760d0;
import ax.z0.C3536b;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

/* loaded from: classes.dex */
class r {
    private final l a;
    private final s b;
    private final Fragment c;
    private boolean d = false;
    private int e = -1;

    class a implements View.OnAttachStateChangeListener {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.a.removeOnAttachStateChangeListener(this);
            C1760d0.i0(this.a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.b.values().length];
            a = iArr;
            try {
                iArr[d.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    r(l lVar, s sVar, Fragment fragment) {
        this.a = lVar;
        this.b = sVar;
        this.c = fragment;
    }

    private boolean l(View view) {
        if (view == this.c.I) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.c.I) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.c.h2(bundle);
        this.a.j(this.c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.c.I != null) {
            s();
        }
        if (this.c.c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.c.c);
        }
        if (this.c.d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.c.d);
        }
        if (!this.c.K) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.c.K);
        }
        return bundle;
    }

    void a() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.c);
        }
        Fragment fragment = this.c;
        fragment.N1(fragment.b);
        l lVar = this.a;
        Fragment fragment2 = this.c;
        lVar.a(fragment2, fragment2.b, false);
    }

    void b() {
        int j = this.b.j(this.c);
        Fragment fragment = this.c;
        fragment.H.addView(fragment.I, j);
    }

    void c() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.c);
        }
        Fragment fragment = this.c;
        Fragment fragment2 = fragment.h;
        r rVar = null;
        if (fragment2 != null) {
            r n = this.b.n(fragment2.f);
            if (n == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.h + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.c;
            fragment3.i = fragment3.h.f;
            fragment3.h = null;
            rVar = n;
        } else {
            String str = fragment.i;
            if (str != null && (rVar = this.b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.c + " declared target fragment " + this.c.i + " that does not belong to this FragmentManager!");
            }
        }
        if (rVar != null) {
            rVar.m();
        }
        Fragment fragment4 = this.c;
        fragment4.u = fragment4.t.w0();
        Fragment fragment5 = this.c;
        fragment5.w = fragment5.t.z0();
        this.a.g(this.c, false);
        this.c.O1();
        this.a.b(this.c, false);
    }

    int d() {
        Fragment fragment = this.c;
        if (fragment.t == null) {
            return fragment.a;
        }
        int i = this.e;
        int i2 = b.a[fragment.S.ordinal()];
        if (i2 != 1) {
            i = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(i, -1) : Math.min(i, 0) : Math.min(i, 1) : Math.min(i, 5);
        }
        Fragment fragment2 = this.c;
        if (fragment2.o) {
            if (fragment2.p) {
                i = Math.max(this.e, 2);
                View view = this.c.I;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.e < 4 ? Math.min(i, fragment2.a) : Math.min(i, 1);
            }
        }
        if (!this.c.l) {
            i = Math.min(i, 1);
        }
        Fragment fragment3 = this.c;
        ViewGroup viewGroup = fragment3.H;
        z.e.b l = viewGroup != null ? z.n(viewGroup, fragment3.A0()).l(this) : null;
        if (l == z.e.b.ADDING) {
            i = Math.min(i, 6);
        } else if (l == z.e.b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.c;
            if (fragment4.m) {
                i = fragment4.a1() ? Math.min(i, 1) : Math.min(i, -1);
            }
        }
        Fragment fragment5 = this.c;
        if (fragment5.J && fragment5.a < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + this.c);
        }
        return i;
    }

    void e() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.c);
        }
        Fragment fragment = this.c;
        if (fragment.Q) {
            fragment.r2(fragment.b);
            this.c.a = 1;
            return;
        }
        this.a.h(fragment, fragment.b, false);
        Fragment fragment2 = this.c;
        fragment2.R1(fragment2.b);
        l lVar = this.a;
        Fragment fragment3 = this.c;
        lVar.c(fragment3, fragment3.b, false);
    }

    void f() {
        String str;
        if (this.c.o) {
            return;
        }
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.c);
        }
        Fragment fragment = this.c;
        LayoutInflater X1 = fragment.X1(fragment.b);
        Fragment fragment2 = this.c;
        ViewGroup viewGroup = fragment2.H;
        if (viewGroup == null) {
            int i = fragment2.y;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.t.s0().c(this.c.y);
                if (viewGroup == null) {
                    Fragment fragment3 = this.c;
                    if (!fragment3.q) {
                        try {
                            str = fragment3.G0().getResourceName(this.c.y);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.c.y) + " (" + str + ") for fragment " + this.c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    ax.B0.c.j(this.c, viewGroup);
                }
            }
        }
        Fragment fragment4 = this.c;
        fragment4.H = viewGroup;
        fragment4.T1(X1, viewGroup, fragment4.b);
        View view = this.c.I;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.c;
            fragment5.I.setTag(C3536b.a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.c;
            if (fragment6.A) {
                fragment6.I.setVisibility(8);
            }
            if (C1760d0.Q(this.c.I)) {
                C1760d0.i0(this.c.I);
            } else {
                View view2 = this.c.I;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.c.k2();
            l lVar = this.a;
            Fragment fragment7 = this.c;
            lVar.m(fragment7, fragment7.I, fragment7.b, false);
            int visibility = this.c.I.getVisibility();
            this.c.B2(this.c.I.getAlpha());
            Fragment fragment8 = this.c;
            if (fragment8.H != null && visibility == 0) {
                View findFocus = fragment8.I.findFocus();
                if (findFocus != null) {
                    this.c.w2(findFocus);
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.c);
                    }
                }
                this.c.I.setAlpha(0.0f);
            }
        }
        this.c.a = 2;
    }

    void g() {
        Fragment f;
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.c);
        }
        Fragment fragment = this.c;
        boolean z = true;
        boolean z2 = fragment.m && !fragment.a1();
        if (z2) {
            Fragment fragment2 = this.c;
            if (!fragment2.n) {
                this.b.B(fragment2.f, null);
            }
        }
        if (!z2 && !this.b.p().r(this.c)) {
            String str = this.c.i;
            if (str != null && (f = this.b.f(str)) != null && f.C) {
                this.c.h = f;
            }
            this.c.a = 0;
            return;
        }
        j<?> jVar = this.c.u;
        if (jVar instanceof ax.G0.v) {
            z = this.b.p().o();
        } else if (jVar.f() instanceof Activity) {
            z = true ^ ((Activity) jVar.f()).isChangingConfigurations();
        }
        if ((z2 && !this.c.n) || z) {
            this.b.p().g(this.c);
        }
        this.c.U1();
        this.a.d(this.c, false);
        for (r rVar : this.b.k()) {
            if (rVar != null) {
                Fragment k = rVar.k();
                if (this.c.f.equals(k.i)) {
                    k.h = this.c;
                    k.i = null;
                }
            }
        }
        Fragment fragment3 = this.c;
        String str2 = fragment3.i;
        if (str2 != null) {
            fragment3.h = this.b.f(str2);
        }
        this.b.s(this);
    }

    void h() {
        View view;
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.c);
        }
        Fragment fragment = this.c;
        ViewGroup viewGroup = fragment.H;
        if (viewGroup != null && (view = fragment.I) != null) {
            viewGroup.removeView(view);
        }
        this.c.V1();
        this.a.n(this.c, false);
        Fragment fragment2 = this.c;
        fragment2.H = null;
        fragment2.I = null;
        fragment2.U = null;
        fragment2.V.n(null);
        this.c.p = false;
    }

    void i() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.c);
        }
        this.c.W1();
        this.a.e(this.c, false);
        Fragment fragment = this.c;
        fragment.a = -1;
        fragment.u = null;
        fragment.w = null;
        fragment.t = null;
        if ((!fragment.m || fragment.a1()) && !this.b.p().r(this.c)) {
            return;
        }
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.c);
        }
        this.c.V0();
    }

    void j() {
        Fragment fragment = this.c;
        if (fragment.o && fragment.p && !fragment.r) {
            if (FragmentManager.J0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.c);
            }
            Fragment fragment2 = this.c;
            fragment2.T1(fragment2.X1(fragment2.b), null, this.c.b);
            View view = this.c.I;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.c;
                fragment3.I.setTag(C3536b.a, fragment3);
                Fragment fragment4 = this.c;
                if (fragment4.A) {
                    fragment4.I.setVisibility(8);
                }
                this.c.k2();
                l lVar = this.a;
                Fragment fragment5 = this.c;
                lVar.m(fragment5, fragment5.I, fragment5.b, false);
                this.c.a = 2;
            }
        }
    }

    Fragment k() {
        return this.c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.d) {
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z = false;
            while (true) {
                int d = d();
                Fragment fragment = this.c;
                int i = fragment.a;
                if (d == i) {
                    if (!z && i == -1 && fragment.m && !fragment.a1() && !this.c.n) {
                        if (FragmentManager.J0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.c);
                        }
                        this.b.p().g(this.c);
                        this.b.s(this);
                        if (FragmentManager.J0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.c);
                        }
                        this.c.V0();
                    }
                    Fragment fragment2 = this.c;
                    if (fragment2.O) {
                        if (fragment2.I != null && (viewGroup = fragment2.H) != null) {
                            z n = z.n(viewGroup, fragment2.A0());
                            if (this.c.A) {
                                n.c(this);
                            } else {
                                n.e(this);
                            }
                        }
                        Fragment fragment3 = this.c;
                        FragmentManager fragmentManager = fragment3.t;
                        if (fragmentManager != null) {
                            fragmentManager.H0(fragment3);
                        }
                        Fragment fragment4 = this.c;
                        fragment4.O = false;
                        fragment4.x1(fragment4.A);
                        this.c.v.K();
                    }
                    this.d = false;
                    return;
                }
                if (d <= i) {
                    switch (i - 1) {
                        case SubsamplingScaleImageView.ORIENTATION_USE_EXIF /* -1 */:
                            i();
                            break;
                        case 0:
                            if (fragment.n && this.b.q(fragment.f) == null) {
                                r();
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.c.a = 1;
                            break;
                        case 2:
                            fragment.p = false;
                            fragment.a = 2;
                            break;
                        case 3:
                            if (FragmentManager.J0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.c);
                            }
                            Fragment fragment5 = this.c;
                            if (fragment5.n) {
                                r();
                            } else if (fragment5.I != null && fragment5.c == null) {
                                s();
                            }
                            Fragment fragment6 = this.c;
                            if (fragment6.I != null && (viewGroup2 = fragment6.H) != null) {
                                z.n(viewGroup2, fragment6.A0()).d(this);
                            }
                            this.c.a = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.a = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.I != null && (viewGroup3 = fragment.H) != null) {
                                z.n(viewGroup3, fragment.A0()).b(z.e.c.h(this.c.I.getVisibility()), this);
                            }
                            this.c.a = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.a = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    void n() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.c);
        }
        this.c.c2();
        this.a.f(this.c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.c.b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.c;
        fragment.c = fragment.b.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.c;
        fragment2.d = fragment2.b.getBundle("android:view_registry_state");
        Fragment fragment3 = this.c;
        fragment3.i = fragment3.b.getString("android:target_state");
        Fragment fragment4 = this.c;
        if (fragment4.i != null) {
            fragment4.j = fragment4.b.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.c;
        Boolean bool = fragment5.e;
        if (bool != null) {
            fragment5.K = bool.booleanValue();
            this.c.e = null;
        } else {
            fragment5.K = fragment5.b.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.c;
        if (fragment6.K) {
            return;
        }
        fragment6.J = true;
    }

    void p() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.c);
        }
        View r0 = this.c.r0();
        if (r0 != null && l(r0)) {
            boolean requestFocus = r0.requestFocus();
            if (FragmentManager.J0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(r0);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.c);
                sb.append(" resulting in focused view ");
                sb.append(this.c.I.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.c.w2(null);
        this.c.g2();
        this.a.i(this.c, false);
        Fragment fragment = this.c;
        fragment.b = null;
        fragment.c = null;
        fragment.d = null;
    }

    void r() {
        p pVar = new p(this.c);
        Fragment fragment = this.c;
        if (fragment.a <= -1 || pVar.n0 != null) {
            pVar.n0 = fragment.b;
        } else {
            Bundle q = q();
            pVar.n0 = q;
            if (this.c.i != null) {
                if (q == null) {
                    pVar.n0 = new Bundle();
                }
                pVar.n0.putString("android:target_state", this.c.i);
                int i = this.c.j;
                if (i != 0) {
                    pVar.n0.putInt("android:target_req_state", i);
                }
            }
        }
        this.b.B(this.c.f, pVar);
    }

    void s() {
        if (this.c.I == null) {
            return;
        }
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.c + " with view " + this.c.I);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.c.I.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.c.c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.c.U.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.c.d = bundle;
    }

    void t(int i) {
        this.e = i;
    }

    void u() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.c);
        }
        this.c.i2();
        this.a.k(this.c, false);
    }

    void v() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.c);
        }
        this.c.j2();
        this.a.l(this.c, false);
    }

    r(l lVar, s sVar, ClassLoader classLoader, i iVar, p pVar) {
        this.a = lVar;
        this.b = sVar;
        Fragment a2 = pVar.a(iVar, classLoader);
        this.c = a2;
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    r(l lVar, s sVar, Fragment fragment, p pVar) {
        this.a = lVar;
        this.b = sVar;
        this.c = fragment;
        fragment.c = null;
        fragment.d = null;
        fragment.s = 0;
        fragment.p = false;
        fragment.l = false;
        Fragment fragment2 = fragment.h;
        fragment.i = fragment2 != null ? fragment2.f : null;
        fragment.h = null;
        Bundle bundle = pVar.n0;
        if (bundle != null) {
            fragment.b = bundle;
        } else {
            fragment.b = new Bundle();
        }
    }
}
