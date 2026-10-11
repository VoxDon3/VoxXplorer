package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.d;
import androidx.lifecycle.q;
import ax.c0.C1794v;
import ax.n2.C2575c;
import ax.n2.InterfaceC2576d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, ax.G0.h, ax.G0.v, androidx.lifecycle.c, InterfaceC2576d {
    static final Object c0 = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    private boolean G;
    ViewGroup H;
    View I;
    boolean J;
    f L;
    Handler M;
    boolean O;
    LayoutInflater P;
    boolean Q;
    public String R;
    androidx.lifecycle.g T;
    x U;
    q.b W;
    C2575c X;
    private int Y;
    Bundle b;
    SparseArray<Parcelable> c;
    Bundle d;
    Boolean e;
    Bundle g;
    Fragment h;
    int j;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    int s;
    FragmentManager t;
    j<?> u;
    Fragment w;
    int x;
    int y;
    String z;
    int a = -1;
    String f = UUID.randomUUID().toString();
    String i = null;
    private Boolean k = null;
    FragmentManager v = new m();
    boolean F = true;
    boolean K = true;
    Runnable N = new a();
    d.b S = d.b.RESUMED;
    ax.G0.l<ax.G0.h> V = new ax.G0.l<>();
    private final AtomicInteger Z = new AtomicInteger();
    private final ArrayList<i> a0 = new ArrayList<>();
    private final i b0 = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.J2();
        }
    }

    class b extends i {
        b() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.i
        void a() {
            Fragment.this.X.c();
            androidx.lifecycle.m.c(Fragment.this);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.a0(false);
        }
    }

    class d implements Runnable {
        final /* synthetic */ z q;

        d(z zVar) {
            this.q = zVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.g();
        }
    }

    class e extends ax.A0.e {
        e() {
        }

        @Override // ax.A0.e
        public View c(int i) {
            View view = Fragment.this.I;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // ax.A0.e
        public boolean d() {
            return Fragment.this.I != null;
        }
    }

    static class f {
        View a;
        boolean b;
        int c;
        int d;
        int e;
        int f;
        int g;
        ArrayList<String> h;
        ArrayList<String> i;
        Object j = null;
        Object k;
        Object l;
        Object m;
        Object n;
        Object o;
        Boolean p;
        Boolean q;
        float r;
        View s;
        boolean t;

        f() {
            Object obj = Fragment.c0;
            this.k = obj;
            this.l = null;
            this.m = obj;
            this.n = null;
            this.o = obj;
            this.r = 1.0f;
            this.s = null;
        }
    }

    static class g {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    public static class h extends RuntimeException {
        public h(String str, Exception exc) {
            super(str, exc);
        }
    }

    private static abstract class i {
        private i() {
        }

        abstract void a();

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    public Fragment() {
        U0();
    }

    private Fragment Q0(boolean z) {
        String str;
        if (z) {
            ax.B0.c.h(this);
        }
        Fragment fragment = this.h;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.t;
        if (fragmentManager == null || (str = this.i) == null) {
            return null;
        }
        return fragmentManager.h0(str);
    }

    private void U0() {
        this.T = new androidx.lifecycle.g(this);
        this.X = C2575c.a(this);
        this.W = null;
        if (this.a0.contains(this.b0)) {
            return;
        }
        l2(this.b0);
    }

    @Deprecated
    public static Fragment W0(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = androidx.fragment.app.i.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return newInstance;
            }
            bundle.setClassLoader(newInstance.getClass().getClassLoader());
            newInstance.v2(bundle);
            return newInstance;
        } catch (IllegalAccessException e2) {
            throw new h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new h("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new h("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new h("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    private f d0() {
        if (this.L == null) {
            this.L = new f();
        }
        return this.L;
    }

    private void l2(i iVar) {
        if (this.a >= 0) {
            iVar.a();
        } else {
            this.a0.add(iVar);
        }
    }

    private void s2() {
        if (FragmentManager.J0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.I != null) {
            t2(this.b);
        }
        this.b = null;
    }

    private int x0() {
        d.b bVar = this.S;
        return (bVar == d.b.INITIALIZED || this.w == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.w.x0());
    }

    public final FragmentManager A0() {
        FragmentManager fragmentManager = this.t;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void A1(boolean z) {
    }

    void A2(boolean z) {
        if (this.L == null) {
            return;
        }
        d0().b = z;
    }

    boolean B0() {
        f fVar = this.L;
        if (fVar == null) {
            return false;
        }
        return fVar.b;
    }

    @Deprecated
    public boolean B1(MenuItem menuItem) {
        return false;
    }

    void B2(float f2) {
        d0().r = f2;
    }

    int C0() {
        f fVar = this.L;
        if (fVar == null) {
            return 0;
        }
        return fVar.e;
    }

    @Deprecated
    public void C1(Menu menu) {
    }

    void C2(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        d0();
        f fVar = this.L;
        fVar.h = arrayList;
        fVar.i = arrayList2;
    }

    int D0() {
        f fVar = this.L;
        if (fVar == null) {
            return 0;
        }
        return fVar.f;
    }

    public void D1() {
        this.G = true;
    }

    @Deprecated
    public void D2(Fragment fragment, int i2) {
        if (fragment != null) {
            ax.B0.c.i(this, fragment, i2);
        }
        FragmentManager fragmentManager = this.t;
        FragmentManager fragmentManager2 = fragment != null ? fragment.t : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.Q0(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.i = null;
            this.h = null;
        } else if (this.t == null || fragment.t == null) {
            this.i = null;
            this.h = fragment;
        } else {
            this.i = fragment.f;
            this.h = null;
        }
        this.j = i2;
    }

    float E0() {
        f fVar = this.L;
        if (fVar == null) {
            return 1.0f;
        }
        return fVar.r;
    }

    public void E1(boolean z) {
    }

    public boolean E2(String str) {
        j<?> jVar = this.u;
        if (jVar != null) {
            return jVar.l(str);
        }
        return false;
    }

    public Object F0() {
        f fVar = this.L;
        if (fVar == null) {
            return null;
        }
        Object obj = fVar.m;
        return obj == c0 ? p0() : obj;
    }

    @Deprecated
    public void F1(Menu menu) {
    }

    public void F2(@SuppressLint({"UnknownNullness"}) Intent intent) {
        G2(intent, null);
    }

    public final Resources G0() {
        return p2().getResources();
    }

    public void G1(boolean z) {
    }

    public void G2(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        j<?> jVar = this.u;
        if (jVar != null) {
            jVar.m(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public Object H0() {
        f fVar = this.L;
        if (fVar == null) {
            return null;
        }
        Object obj = fVar.k;
        return obj == c0 ? m0() : obj;
    }

    public void H1() {
        this.G = true;
    }

    @Deprecated
    public void H2(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (this.u != null) {
            A0().S0(this, intent, i2, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public Object I0() {
        f fVar = this.L;
        if (fVar == null) {
            return null;
        }
        return fVar.n;
    }

    public void I1(Bundle bundle) {
    }

    @Deprecated
    public void I2(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        Bundle bundle2;
        if (this.u == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (FragmentManager.J0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in startIntentSenderForResult() requestCode: ");
            sb.append(i2);
            sb.append(" IntentSender: ");
            sb.append(intentSender);
            sb.append(" fillInIntent: ");
            sb.append(intent);
            sb.append(" options: ");
            bundle2 = bundle;
            sb.append(bundle2);
            Log.v("FragmentManager", sb.toString());
        } else {
            bundle2 = bundle;
        }
        A0().T0(this, intentSender, i2, intent, i3, i4, i5, bundle2);
    }

    public Object J0() {
        f fVar = this.L;
        if (fVar == null) {
            return null;
        }
        Object obj = fVar.o;
        return obj == c0 ? I0() : obj;
    }

    public void J1() {
        this.G = true;
    }

    public void J2() {
        if (this.L == null || !d0().t) {
            return;
        }
        if (this.u == null) {
            d0().t = false;
        } else if (Looper.myLooper() != this.u.g().getLooper()) {
            this.u.g().postAtFrontOfQueue(new c());
        } else {
            a0(true);
        }
    }

    ArrayList<String> K0() {
        ArrayList<String> arrayList;
        f fVar = this.L;
        return (fVar == null || (arrayList = fVar.h) == null) ? new ArrayList<>() : arrayList;
    }

    public void K1() {
        this.G = true;
    }

    ArrayList<String> L0() {
        ArrayList<String> arrayList;
        f fVar = this.L;
        return (fVar == null || (arrayList = fVar.i) == null) ? new ArrayList<>() : arrayList;
    }

    public void L1(View view, Bundle bundle) {
    }

    public final String M0(int i2) {
        return G0().getString(i2);
    }

    public void M1(Bundle bundle) {
        this.G = true;
    }

    public final String N0(int i2, Object... objArr) {
        return G0().getString(i2, objArr);
    }

    void N1(Bundle bundle) {
        this.v.V0();
        this.a = 3;
        this.G = false;
        h1(bundle);
        if (this.G) {
            s2();
            this.v.z();
        } else {
            throw new B("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public final String O0() {
        return this.z;
    }

    void O1() {
        ArrayList<i> arrayList = this.a0;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            i iVar = arrayList.get(i2);
            i2++;
            iVar.a();
        }
        this.a0.clear();
        this.v.m(this.u, b0(), this);
        this.a = 0;
        this.G = false;
        k1(this.u.f());
        if (this.G) {
            this.t.J(this);
            this.v.A();
        } else {
            throw new B("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    @Deprecated
    public final Fragment P0() {
        return Q0(true);
    }

    void P1(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    boolean Q1(MenuItem menuItem) {
        if (this.A) {
            return false;
        }
        if (m1(menuItem)) {
            return true;
        }
        return this.v.C(menuItem);
    }

    public View R0() {
        return this.I;
    }

    void R1(Bundle bundle) {
        this.v.V0();
        this.a = 1;
        this.G = false;
        this.T.a(new androidx.lifecycle.f() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.f
            public void b(ax.G0.h hVar, d.a aVar) {
                View view;
                if (aVar != d.a.ON_STOP || (view = Fragment.this.I) == null) {
                    return;
                }
                g.a(view);
            }
        });
        this.X.d(bundle);
        n1(bundle);
        this.Q = true;
        if (this.G) {
            this.T.h(d.a.ON_CREATE);
            return;
        }
        throw new B("Fragment " + this + " did not call through to super.onCreate()");
    }

    public ax.G0.h S0() {
        x xVar = this.U;
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    boolean S1(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.A) {
            return false;
        }
        if (this.E && this.F) {
            q1(menu, menuInflater);
            z = true;
        }
        return this.v.E(menu, menuInflater) | z;
    }

    public LiveData<ax.G0.h> T0() {
        return this.V;
    }

    void T1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.v.V0();
        this.r = true;
        this.U = new x(this, getViewModelStore());
        View r1 = r1(layoutInflater, viewGroup, bundle);
        this.I = r1;
        if (r1 == null) {
            if (this.U.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.U = null;
        } else {
            this.U.b();
            ax.G0.w.a(this.I, this.U);
            ax.G0.x.a(this.I, this.U);
            ax.n2.e.a(this.I, this.U);
            this.V.n(this.U);
        }
    }

    void U1() {
        this.v.F();
        this.T.h(d.a.ON_DESTROY);
        this.a = 0;
        this.G = false;
        this.Q = false;
        s1();
        if (this.G) {
            return;
        }
        throw new B("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void V0() {
        U0();
        this.R = this.f;
        this.f = UUID.randomUUID().toString();
        this.l = false;
        this.m = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.s = 0;
        this.t = null;
        this.v = new m();
        this.u = null;
        this.x = 0;
        this.y = 0;
        this.z = null;
        this.A = false;
        this.B = false;
    }

    void V1() {
        this.v.G();
        if (this.I != null && this.U.getLifecycle().b().h(d.b.CREATED)) {
            this.U.a(d.a.ON_DESTROY);
        }
        this.a = 1;
        this.G = false;
        u1();
        if (this.G) {
            ax.J0.a.c(this).f();
            this.r = false;
        } else {
            throw new B("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void W1() {
        this.a = -1;
        this.G = false;
        v1();
        this.P = null;
        if (this.G) {
            if (this.v.I0()) {
                return;
            }
            this.v.F();
            this.v = new m();
            return;
        }
        throw new B("Fragment " + this + " did not call through to super.onDetach()");
    }

    public final boolean X0() {
        return this.u != null && this.l;
    }

    LayoutInflater X1(Bundle bundle) {
        LayoutInflater w1 = w1(bundle);
        this.P = w1;
        return w1;
    }

    public final boolean Y0() {
        return this.B;
    }

    void Y1() {
        onLowMemory();
    }

    public final boolean Z0() {
        if (this.A) {
            return true;
        }
        FragmentManager fragmentManager = this.t;
        return fragmentManager != null && fragmentManager.M0(this.w);
    }

    void Z1(boolean z) {
        A1(z);
    }

    void a0(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        f fVar = this.L;
        if (fVar != null) {
            fVar.t = false;
        }
        if (this.I == null || (viewGroup = this.H) == null || (fragmentManager = this.t) == null) {
            return;
        }
        z n = z.n(viewGroup, fragmentManager);
        n.p();
        if (z) {
            this.u.g().post(new d(n));
        } else {
            n.g();
        }
        Handler handler = this.M;
        if (handler != null) {
            handler.removeCallbacks(this.N);
            this.M = null;
        }
    }

    final boolean a1() {
        return this.s > 0;
    }

    boolean a2(MenuItem menuItem) {
        if (this.A) {
            return false;
        }
        if (this.E && this.F && B1(menuItem)) {
            return true;
        }
        return this.v.L(menuItem);
    }

    public Context b() {
        j<?> jVar = this.u;
        if (jVar == null) {
            return null;
        }
        return jVar.f();
    }

    ax.A0.e b0() {
        return new e();
    }

    public final boolean b1() {
        if (!this.F) {
            return false;
        }
        FragmentManager fragmentManager = this.t;
        return fragmentManager == null || fragmentManager.N0(this.w);
    }

    void b2(Menu menu) {
        if (this.A) {
            return;
        }
        if (this.E && this.F) {
            C1(menu);
        }
        this.v.M(menu);
    }

    public void c0(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.y));
        printWriter.print(" mTag=");
        printWriter.println(this.z);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mWho=");
        printWriter.print(this.f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.A);
        printWriter.print(" mDetached=");
        printWriter.print(this.B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.K);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.t);
        }
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.u);
        }
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.w);
        }
        if (this.g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.g);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.b);
        }
        if (this.c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.c);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.d);
        }
        Fragment Q0 = Q0(false);
        if (Q0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(Q0);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(B0());
        if (l0() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(l0());
        }
        if (o0() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(o0());
        }
        if (C0() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(C0());
        }
        if (D0() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(D0());
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.I);
        }
        if (i0() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(i0());
        }
        if (b() != null) {
            ax.J0.a.c(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.v + ":");
        this.v.Y(str + "  ", fileDescriptor, printWriter, strArr);
    }

    boolean c1() {
        f fVar = this.L;
        if (fVar == null) {
            return false;
        }
        return fVar.t;
    }

    void c2() {
        this.v.O();
        if (this.I != null) {
            this.U.a(d.a.ON_PAUSE);
        }
        this.T.h(d.a.ON_PAUSE);
        this.a = 6;
        this.G = false;
        D1();
        if (this.G) {
            return;
        }
        throw new B("Fragment " + this + " did not call through to super.onPause()");
    }

    public final boolean d1() {
        return this.m;
    }

    void d2(boolean z) {
        E1(z);
    }

    Fragment e0(String str) {
        return str.equals(this.f) ? this : this.v.l0(str);
    }

    public final boolean e1() {
        return this.a >= 7;
    }

    boolean e2(Menu menu) {
        boolean z = false;
        if (this.A) {
            return false;
        }
        if (this.E && this.F) {
            F1(menu);
            z = true;
        }
        return this.v.Q(menu) | z;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final androidx.fragment.app.f f0() {
        j<?> jVar = this.u;
        if (jVar == null) {
            return null;
        }
        return (androidx.fragment.app.f) jVar.e();
    }

    public final boolean f1() {
        FragmentManager fragmentManager = this.t;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.Q0();
    }

    void f2() {
        boolean O0 = this.t.O0(this);
        Boolean bool = this.k;
        if (bool == null || bool.booleanValue() != O0) {
            this.k = Boolean.valueOf(O0);
            G1(O0);
            this.v.R();
        }
    }

    public boolean g0() {
        Boolean bool;
        f fVar = this.L;
        if (fVar == null || (bool = fVar.q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    void g1() {
        this.v.V0();
    }

    void g2() {
        this.v.V0();
        this.v.c0(true);
        this.a = 7;
        this.G = false;
        H1();
        if (!this.G) {
            throw new B("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.g gVar = this.T;
        d.a aVar = d.a.ON_RESUME;
        gVar.h(aVar);
        if (this.I != null) {
            this.U.a(aVar);
        }
        this.v.S();
    }

    @Override // androidx.lifecycle.c
    public ax.I0.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = p2().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && FragmentManager.J0(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + p2().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        ax.I0.d dVar = new ax.I0.d();
        if (application != null) {
            dVar.c(q.a.g, application);
        }
        dVar.c(androidx.lifecycle.m.a, this);
        dVar.c(androidx.lifecycle.m.b, this);
        if (j0() != null) {
            dVar.c(androidx.lifecycle.m.c, j0());
        }
        return dVar;
    }

    @Override // ax.G0.h
    public androidx.lifecycle.d getLifecycle() {
        return this.T;
    }

    @Override // ax.n2.InterfaceC2576d
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.X.b();
    }

    @Override // ax.G0.v
    public androidx.lifecycle.r getViewModelStore() {
        if (this.t == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (x0() != d.b.INITIALIZED.ordinal()) {
            return this.t.E0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public boolean h0() {
        Boolean bool;
        f fVar = this.L;
        if (fVar == null || (bool = fVar.p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @Deprecated
    public void h1(Bundle bundle) {
        this.G = true;
    }

    void h2(Bundle bundle) {
        I1(bundle);
        this.X.e(bundle);
        Bundle i1 = this.v.i1();
        if (i1 != null) {
            bundle.putParcelable("android:support:fragments", i1);
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    View i0() {
        f fVar = this.L;
        if (fVar == null) {
            return null;
        }
        return fVar.a;
    }

    @Deprecated
    public void i1(int i2, int i3, Intent intent) {
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    void i2() {
        this.v.V0();
        this.v.c0(true);
        this.a = 5;
        this.G = false;
        J1();
        if (!this.G) {
            throw new B("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.g gVar = this.T;
        d.a aVar = d.a.ON_START;
        gVar.h(aVar);
        if (this.I != null) {
            this.U.a(aVar);
        }
        this.v.T();
    }

    public final Bundle j0() {
        return this.g;
    }

    @Deprecated
    public void j1(Activity activity) {
        this.G = true;
    }

    void j2() {
        this.v.V();
        if (this.I != null) {
            this.U.a(d.a.ON_STOP);
        }
        this.T.h(d.a.ON_STOP);
        this.a = 4;
        this.G = false;
        K1();
        if (this.G) {
            return;
        }
        throw new B("Fragment " + this + " did not call through to super.onStop()");
    }

    public final FragmentManager k0() {
        if (this.u != null) {
            return this.v;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void k1(Context context) {
        this.G = true;
        j<?> jVar = this.u;
        Activity e2 = jVar == null ? null : jVar.e();
        if (e2 != null) {
            this.G = false;
            j1(e2);
        }
    }

    void k2() {
        L1(this.I, this.b);
        this.v.W();
    }

    int l0() {
        f fVar = this.L;
        if (fVar == null) {
            return 0;
        }
        return fVar.c;
    }

    @Deprecated
    public void l1(Fragment fragment) {
    }

    public Object m0() {
        f fVar = this.L;
        if (fVar == null) {
            return null;
        }
        return fVar.j;
    }

    public boolean m1(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public final void m2(String[] strArr, int i2) {
        if (this.u != null) {
            A0().R0(this, strArr, i2);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    ax.P.v n0() {
        f fVar = this.L;
        if (fVar == null) {
            return null;
        }
        fVar.getClass();
        return null;
    }

    public void n1(Bundle bundle) {
        this.G = true;
        r2(bundle);
        if (this.v.P0(1)) {
            return;
        }
        this.v.D();
    }

    public final androidx.fragment.app.f n2() {
        androidx.fragment.app.f f0 = f0();
        if (f0 != null) {
            return f0;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    int o0() {
        f fVar = this.L;
        if (fVar == null) {
            return 0;
        }
        return fVar.d;
    }

    public Animation o1(int i2, boolean z, int i3) {
        return null;
    }

    public final Bundle o2() {
        Bundle j0 = j0();
        if (j0 != null) {
            return j0;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.G = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        n2().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.G = true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
    }

    public Object p0() {
        f fVar = this.L;
        if (fVar == null) {
            return null;
        }
        return fVar.l;
    }

    public Animator p1(int i2, boolean z, int i3) {
        return null;
    }

    public final Context p2() {
        Context b2 = b();
        if (b2 != null) {
            return b2;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    ax.P.v q0() {
        f fVar = this.L;
        if (fVar == null) {
            return null;
        }
        fVar.getClass();
        return null;
    }

    @Deprecated
    public void q1(Menu menu, MenuInflater menuInflater) {
    }

    public final View q2() {
        View R0 = R0();
        if (R0 != null) {
            return R0;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    View r0() {
        f fVar = this.L;
        if (fVar == null) {
            return null;
        }
        return fVar.s;
    }

    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2 = this.Y;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    void r2(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.v.g1(parcelable);
        this.v.D();
    }

    @Deprecated
    public final FragmentManager s0() {
        return this.t;
    }

    public void s1() {
        this.G = true;
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        H2(intent, i2, null);
    }

    public final Object t0() {
        j<?> jVar = this.u;
        if (jVar == null) {
            return null;
        }
        return jVar.i();
    }

    @Deprecated
    public void t1() {
    }

    final void t2(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.c;
        if (sparseArray != null) {
            this.I.restoreHierarchyState(sparseArray);
            this.c = null;
        }
        if (this.I != null) {
            this.U.d(this.d);
            this.d = null;
        }
        this.G = false;
        M1(bundle);
        if (this.G) {
            if (this.I != null) {
                this.U.a(d.a.ON_CREATE);
            }
        } else {
            throw new B("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f);
        if (this.x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.x));
        }
        if (this.z != null) {
            sb.append(" tag=");
            sb.append(this.z);
        }
        sb.append(")");
        return sb.toString();
    }

    public final LayoutInflater u0() {
        LayoutInflater layoutInflater = this.P;
        return layoutInflater == null ? X1(null) : layoutInflater;
    }

    public void u1() {
        this.G = true;
    }

    void u2(int i2, int i3, int i4, int i5) {
        if (this.L == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        d0().c = i2;
        d0().d = i3;
        d0().e = i4;
        d0().f = i5;
    }

    @Deprecated
    public LayoutInflater v0(Bundle bundle) {
        j<?> jVar = this.u;
        if (jVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater j = jVar.j();
        C1794v.a(j, this.v.x0());
        return j;
    }

    public void v1() {
        this.G = true;
    }

    public void v2(Bundle bundle) {
        if (this.t != null && f1()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.g = bundle;
    }

    @Deprecated
    public ax.J0.a w0() {
        return ax.J0.a.c(this);
    }

    public LayoutInflater w1(Bundle bundle) {
        return v0(bundle);
    }

    void w2(View view) {
        d0().s = view;
    }

    public void x1(boolean z) {
    }

    @Deprecated
    public void x2(boolean z) {
        if (this.E != z) {
            this.E = z;
            if (!X0() || Z0()) {
                return;
            }
            this.u.o();
        }
    }

    int y0() {
        f fVar = this.L;
        if (fVar == null) {
            return 0;
        }
        return fVar.g;
    }

    @Deprecated
    public void y1(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
    }

    public void y2(boolean z) {
        if (this.F != z) {
            this.F = z;
            if (this.E && X0() && !Z0()) {
                this.u.o();
            }
        }
    }

    public final Fragment z0() {
        return this.w;
    }

    public void z1(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
        j<?> jVar = this.u;
        Activity e2 = jVar == null ? null : jVar.e();
        if (e2 != null) {
            this.G = false;
            y1(e2, attributeSet, bundle);
        }
    }

    void z2(int i2) {
        if (this.L == null && i2 == 0) {
            return;
        }
        d0();
        this.L.g = i2;
    }
}
