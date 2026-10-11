/*
 * Decompiled with CFR 0.152.
 */
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
import androidx.fragment.app.B;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.j;
import androidx.fragment.app.m;
import androidx.fragment.app.x;
import androidx.fragment.app.z;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.d;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.savedstate.a;
import ax.A0.e;
import ax.B0.c;
import ax.G0.l;
import ax.G0.v;
import ax.G0.w;
import ax.I0.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class Fragment
implements ComponentCallbacks,
View.OnCreateContextMenuListener,
ax.G0.h,
v,
androidx.lifecycle.c,
ax.n2.d {
    static final Object c0 = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F = true;
    private boolean G;
    ViewGroup H;
    View I;
    boolean J;
    boolean K = true;
    f L;
    Handler M;
    Runnable N;
    boolean O;
    LayoutInflater P;
    boolean Q;
    public String R;
    d.b S;
    androidx.lifecycle.g T;
    x U;
    l<ax.G0.h> V;
    q.b W;
    ax.n2.c X;
    private int Y;
    private final AtomicInteger Z;
    int a = -1;
    private final ArrayList<i> a0;
    Bundle b;
    private final i b0;
    SparseArray<Parcelable> c;
    Bundle d;
    Boolean e;
    String f = UUID.randomUUID().toString();
    Bundle g;
    Fragment h;
    String i = null;
    int j;
    private Boolean k = null;
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
    FragmentManager v = new m();
    Fragment w;
    int x;
    int y;
    String z;

    public Fragment() {
        this.N = new Runnable(this){
            final Fragment q;
            {
                this.q = fragment;
            }

            @Override
            public void run() {
                this.q.J2();
            }
        };
        this.S = d.b.f0;
        this.V = new l();
        this.Z = new AtomicInteger();
        this.a0 = new ArrayList();
        this.b0 = new i(this){
            final Fragment a;
            {
                this.a = fragment;
            }

            @Override
            void a() {
                this.a.X.c();
                androidx.lifecycle.m.c(this.a);
            }
        };
        this.U0();
    }

    private Fragment Q0(boolean bl) {
        Object object;
        if (bl) {
            ax.B0.c.h(this);
        }
        if ((object = this.h) != null) {
            return object;
        }
        FragmentManager fragmentManager = this.t;
        if (fragmentManager != null && (object = this.i) != null) {
            return fragmentManager.h0((String)object);
        }
        return null;
    }

    private void U0() {
        this.T = new androidx.lifecycle.g(this);
        this.X = ax.n2.c.a(this);
        this.W = null;
        if (!this.a0.contains(this.b0)) {
            this.l2(this.b0);
        }
    }

    @Deprecated
    public static Fragment W0(Context object, String string, Bundle object2) {
        InstantiationException instantiationException2;
        block10: {
            IllegalAccessException illegalAccessException2;
            block9: {
                NoSuchMethodException noSuchMethodException2;
                block8: {
                    InvocationTargetException invocationTargetException2;
                    block7: {
                        block6: {
                            object = androidx.fragment.app.i.d(object.getClassLoader(), string).getConstructor(null).newInstance(null);
                            if (object2 == null) break block6;
                            try {
                                object2.setClassLoader(object.getClass().getClassLoader());
                                ((Fragment)object).v2((Bundle)object2);
                                return object;
                            }
                            catch (InvocationTargetException invocationTargetException2) {
                                break block7;
                            }
                            catch (NoSuchMethodException noSuchMethodException2) {
                                break block8;
                            }
                            catch (IllegalAccessException illegalAccessException2) {
                                break block9;
                            }
                            catch (InstantiationException instantiationException2) {
                                break block10;
                            }
                        }
                        return object;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Unable to instantiate fragment ");
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append(": calling Fragment constructor caused an exception");
                    throw new h(((StringBuilder)object).toString(), invocationTargetException2);
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Unable to instantiate fragment ");
                ((StringBuilder)object2).append(string);
                ((StringBuilder)object2).append(": could not find Fragment constructor");
                throw new h(((StringBuilder)object2).toString(), noSuchMethodException2);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unable to instantiate fragment ");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new h(((StringBuilder)object).toString(), illegalAccessException2);
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Unable to instantiate fragment ");
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append(": make sure class name exists, is public, and has an empty constructor that is public");
        throw new h(((StringBuilder)object2).toString(), instantiationException2);
    }

    private f d0() {
        if (this.L == null) {
            this.L = new f();
        }
        return this.L;
    }

    private void l2(i i8) {
        if (this.a >= 0) {
            i8.a();
            return;
        }
        this.a0.add(i8);
    }

    private void s2() {
        if (FragmentManager.J0(3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("moveto RESTORE_VIEW_STATE: ");
            stringBuilder.append(this);
            Log.d((String)"FragmentManager", (String)stringBuilder.toString());
        }
        if (this.I != null) {
            this.t2(this.b);
        }
        this.b = null;
    }

    private int x0() {
        d.b b8 = this.S;
        if (b8 != d.b.c0 && this.w != null) {
            return Math.min(b8.ordinal(), this.w.x0());
        }
        return b8.ordinal();
    }

    public final FragmentManager A0() {
        Object object = this.t;
        if (object != null) {
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Fragment ");
        ((StringBuilder)object).append(this);
        ((StringBuilder)object).append(" not associated with a fragment manager.");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    public void A1(boolean bl) {
    }

    void A2(boolean bl) {
        if (this.L == null) {
            return;
        }
        this.d0().b = bl;
    }

    boolean B0() {
        f f8 = this.L;
        if (f8 == null) {
            return false;
        }
        return f8.b;
    }

    @Deprecated
    public boolean B1(MenuItem menuItem) {
        return false;
    }

    void B2(float f8) {
        this.d0().r = f8;
    }

    int C0() {
        f f8 = this.L;
        if (f8 == null) {
            return 0;
        }
        return f8.e;
    }

    @Deprecated
    public void C1(Menu menu) {
    }

    void C2(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.d0();
        f f8 = this.L;
        f8.h = arrayList;
        f8.i = arrayList2;
    }

    int D0() {
        f f8 = this.L;
        if (f8 == null) {
            return 0;
        }
        return f8.f;
    }

    public void D1() {
        this.G = true;
    }

    @Deprecated
    public void D2(Fragment fragment, int n8) {
        if (fragment != null) {
            ax.B0.c.i(this, fragment, n8);
        }
        FragmentManager fragmentManager = this.t;
        Object object = fragment != null ? fragment.t : null;
        if (fragmentManager != null && object != null && fragmentManager != object) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Fragment ");
            ((StringBuilder)object).append(fragment);
            ((StringBuilder)object).append(" must share the same FragmentManager to be set as a target fragment");
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        object = fragment;
        while (object != null) {
            if (!((Fragment)object).equals(this)) {
                object = super.Q0(false);
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Setting ");
            ((StringBuilder)object).append(fragment);
            ((StringBuilder)object).append(" as the target of ");
            ((StringBuilder)object).append(this);
            ((StringBuilder)object).append(" would create a target cycle");
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        if (fragment == null) {
            this.i = null;
            this.h = null;
        } else if (this.t != null && fragment.t != null) {
            this.i = fragment.f;
            this.h = null;
        } else {
            this.i = null;
            this.h = fragment;
        }
        this.j = n8;
    }

    float E0() {
        f f8 = this.L;
        if (f8 == null) {
            return 1.0f;
        }
        return f8.r;
    }

    public void E1(boolean bl) {
    }

    public boolean E2(String string) {
        j<?> j8 = this.u;
        if (j8 != null) {
            return j8.l(string);
        }
        return false;
    }

    public Object F0() {
        Object object;
        Object object2 = this.L;
        if (object2 == null) {
            return null;
        }
        object2 = object = ((f)object2).m;
        if (object == c0) {
            object2 = this.p0();
        }
        return object2;
    }

    @Deprecated
    public void F1(Menu menu) {
    }

    public void F2(@SuppressLint(value={"UnknownNullness"}) Intent intent) {
        this.G2(intent, null);
    }

    public final Resources G0() {
        return this.p2().getResources();
    }

    public void G1(boolean bl) {
    }

    public void G2(@SuppressLint(value={"UnknownNullness"}) Intent object, Bundle bundle) {
        j<?> j8 = this.u;
        if (j8 != null) {
            j8.m(this, (Intent)object, -1, bundle);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Fragment ");
        ((StringBuilder)object).append(this);
        ((StringBuilder)object).append(" not attached to Activity");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    public Object H0() {
        Object object;
        Object object2 = this.L;
        if (object2 == null) {
            return null;
        }
        object2 = object = ((f)object2).k;
        if (object == c0) {
            object2 = this.m0();
        }
        return object2;
    }

    public void H1() {
        this.G = true;
    }

    @Deprecated
    public void H2(@SuppressLint(value={"UnknownNullness"}) Intent object, int n8, Bundle bundle) {
        if (this.u != null) {
            this.A0().S0(this, (Intent)object, n8, bundle);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Fragment ");
        ((StringBuilder)object).append(this);
        ((StringBuilder)object).append(" not attached to Activity");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    public Object I0() {
        f f8 = this.L;
        if (f8 == null) {
            return null;
        }
        return f8.n;
    }

    public void I1(Bundle bundle) {
    }

    @Deprecated
    public void I2(@SuppressLint(value={"UnknownNullness"}) IntentSender object, int n8, Intent intent, int n9, int n10, int n11, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.u != null) {
            if (FragmentManager.J0(2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Fragment ");
                stringBuilder.append(this);
                stringBuilder.append(" received the following in startIntentSenderForResult() requestCode: ");
                stringBuilder.append(n8);
                stringBuilder.append(" IntentSender: ");
                stringBuilder.append(object);
                stringBuilder.append(" fillInIntent: ");
                stringBuilder.append(intent);
                stringBuilder.append(" options: ");
                stringBuilder.append(bundle);
                Log.v((String)"FragmentManager", (String)stringBuilder.toString());
            }
            this.A0().T0(this, (IntentSender)object, n8, intent, n9, n10, n11, bundle);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Fragment ");
        ((StringBuilder)object).append(this);
        ((StringBuilder)object).append(" not attached to Activity");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    public Object J0() {
        Object object;
        Object object2 = this.L;
        if (object2 == null) {
            return null;
        }
        object2 = object = ((f)object2).o;
        if (object == c0) {
            object2 = this.I0();
        }
        return object2;
    }

    public void J1() {
        this.G = true;
    }

    public void J2() {
        if (this.L != null && this.d0().t) {
            if (this.u == null) {
                this.d0().t = false;
                return;
            }
            if (Looper.myLooper() != this.u.g().getLooper()) {
                this.u.g().postAtFrontOfQueue(new Runnable(this){
                    final Fragment q;
                    {
                        this.q = fragment;
                    }

                    @Override
                    public void run() {
                        this.q.a0(false);
                    }
                });
                return;
            }
            this.a0(true);
        }
    }

    ArrayList<String> K0() {
        Object object = this.L;
        if (object != null && (object = ((f)object).h) != null) {
            return object;
        }
        return new ArrayList<String>();
    }

    public void K1() {
        this.G = true;
    }

    ArrayList<String> L0() {
        Object object = this.L;
        if (object != null && (object = ((f)object).i) != null) {
            return object;
        }
        return new ArrayList<String>();
    }

    public void L1(View view, Bundle bundle) {
    }

    public final String M0(int n8) {
        return this.G0().getString(n8);
    }

    public void M1(Bundle bundle) {
        this.G = true;
    }

    public final String N0(int n8, Object ... objectArray) {
        return this.G0().getString(n8, objectArray);
    }

    void N1(Bundle object) {
        this.v.V0();
        this.a = 3;
        this.G = false;
        this.h1((Bundle)object);
        if (this.G) {
            this.s2();
            this.v.z();
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Fragment ");
        ((StringBuilder)object).append(this);
        ((StringBuilder)object).append(" did not call through to super.onActivityCreated()");
        throw new B(((StringBuilder)object).toString());
    }

    public final String O0() {
        return this.z;
    }

    void O1() {
        Object object;
        ArrayList<i> arrayList = this.a0;
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            object = arrayList.get(i8);
            ((i)object).a();
        }
        this.a0.clear();
        this.v.m(this.u, this.b0(), this);
        this.a = 0;
        this.G = false;
        this.k1(this.u.f());
        if (this.G) {
            this.t.J(this);
            this.v.A();
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Fragment ");
        ((StringBuilder)object).append(this);
        ((StringBuilder)object).append(" did not call through to super.onAttach()");
        throw new B(((StringBuilder)object).toString());
    }

    @Deprecated
    public final Fragment P0() {
        return this.Q0(true);
    }

    void P1(Configuration configuration) {
        this.onConfigurationChanged(configuration);
    }

    boolean Q1(MenuItem menuItem) {
        if (!this.A) {
            if (this.m1(menuItem)) {
                return true;
            }
            return this.v.C(menuItem);
        }
        return false;
    }

    public View R0() {
        return this.I;
    }

    void R1(Bundle object) {
        this.v.V0();
        this.a = 1;
        this.G = false;
        this.T.a(new androidx.lifecycle.f(this){
            final Fragment q;
            {
                this.q = fragment;
            }

            @Override
            public void b(ax.G0.h h8, d.a a8) {
                if (a8 == d.a.ON_STOP && (h8 = this.q.I) != null) {
                    androidx.fragment.app.Fragment$g.a((View)h8);
                }
            }
        });
        this.X.d((Bundle)object);
        this.n1((Bundle)object);
        this.Q = true;
        if (this.G) {
            this.T.h(d.a.ON_CREATE);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Fragment ");
        ((StringBuilder)object).append(this);
        ((StringBuilder)object).append(" did not call through to super.onCreate()");
        throw new B(((StringBuilder)object).toString());
    }

    public ax.G0.h S0() {
        x x8 = this.U;
        if (x8 != null) {
            return x8;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    boolean S1(Menu menu, MenuInflater menuInflater) {
        boolean bl = this.A;
        boolean bl2 = false;
        if (!bl) {
            boolean bl3 = bl2;
            if (this.E) {
                bl3 = bl2;
                if (this.F) {
                    this.q1(menu, menuInflater);
                    bl3 = true;
                }
            }
            return this.v.E(menu, menuInflater) | bl3;
        }
        return false;
    }

    public LiveData<ax.G0.h> T0() {
        return this.V;
    }

    void T1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.v.V0();
        this.r = true;
        this.U = new x(this, this.getViewModelStore());
        layoutInflater = this.r1(layoutInflater, viewGroup, bundle);
        this.I = layoutInflater;
        if (layoutInflater != null) {
            this.U.b();
            ax.G0.w.a(this.I, this.U);
            ax.G0.x.a(this.I, this.U);
            ax.n2.e.a(this.I, this.U);
            this.V.n(this.U);
            return;
        }
        if (!this.U.c()) {
            this.U = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    void U1() {
        this.v.F();
        this.T.h(d.a.ON_DESTROY);
        this.a = 0;
        this.G = false;
        this.Q = false;
        this.s1();
        if (this.G) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onDestroy()");
        throw new B(stringBuilder.toString());
    }

    void V0() {
        this.U0();
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
        if (this.I != null && this.U.getLifecycle().b().h(d.b.d0)) {
            this.U.a(d.a.ON_DESTROY);
        }
        this.a = 1;
        this.G = false;
        this.u1();
        if (this.G) {
            ax.J0.a.c(this).f();
            this.r = false;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onDestroyView()");
        throw new B(stringBuilder.toString());
    }

    void W1() {
        this.a = -1;
        this.G = false;
        this.v1();
        this.P = null;
        if (this.G) {
            if (!this.v.I0()) {
                this.v.F();
                this.v = new m();
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onDetach()");
        throw new B(stringBuilder.toString());
    }

    public final boolean X0() {
        return this.u != null && this.l;
    }

    LayoutInflater X1(Bundle bundle) {
        bundle = this.w1(bundle);
        this.P = bundle;
        return bundle;
    }

    public final boolean Y0() {
        return this.B;
    }

    void Y1() {
        this.onLowMemory();
    }

    public final boolean Z0() {
        FragmentManager fragmentManager;
        return this.A || (fragmentManager = this.t) != null && fragmentManager.M0(this.w);
        {
        }
    }

    void Z1(boolean bl) {
        this.A1(bl);
    }

    void a0(boolean bl) {
        FragmentManager fragmentManager;
        Object object = this.L;
        if (object != null) {
            ((f)object).t = false;
        }
        if (this.I != null && (object = this.H) != null && (fragmentManager = this.t) != null) {
            object = androidx.fragment.app.z.n((ViewGroup)object, fragmentManager);
            ((z)object).p();
            if (bl) {
                this.u.g().post(new Runnable(this, (z)object){
                    final Fragment c0;
                    final z q;
                    {
                        this.c0 = fragment;
                        this.q = z8;
                    }

                    @Override
                    public void run() {
                        this.q.g();
                    }
                });
            } else {
                ((z)object).g();
            }
            object = this.M;
            if (object != null) {
                object.removeCallbacks(this.N);
                this.M = null;
            }
        }
    }

    final boolean a1() {
        return this.s > 0;
    }

    boolean a2(MenuItem menuItem) {
        if (!this.A) {
            if (this.E && this.F && this.B1(menuItem)) {
                return true;
            }
            return this.v.L(menuItem);
        }
        return false;
    }

    public Context b() {
        j<?> j8 = this.u;
        if (j8 == null) {
            return null;
        }
        return j8.f();
    }

    e b0() {
        return new e(this){
            final Fragment a;
            {
                this.a = fragment;
            }

            @Override
            public View c(int n8) {
                Object object = this.a.I;
                if (object != null) {
                    return object.findViewById(n8);
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Fragment ");
                ((StringBuilder)object).append(this.a);
                ((StringBuilder)object).append(" does not have a view");
                throw new IllegalStateException(((StringBuilder)object).toString());
            }

            @Override
            public boolean d() {
                return this.a.I != null;
            }
        };
    }

    public final boolean b1() {
        FragmentManager fragmentManager;
        return this.F && ((fragmentManager = this.t) == null || fragmentManager.N0(this.w));
    }

    void b2(Menu menu) {
        if (!this.A) {
            if (this.E && this.F) {
                this.C1(menu);
            }
            this.v.M(menu);
        }
    }

    public void c0(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        Object object;
        printWriter.print(string);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.y));
        printWriter.print(" mTag=");
        printWriter.println(this.z);
        printWriter.print(string);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mWho=");
        printWriter.print(this.f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.s);
        printWriter.print(string);
        printWriter.print("mAdded=");
        printWriter.print(this.l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.o);
        printWriter.print(" mInLayout=");
        printWriter.println(this.p);
        printWriter.print(string);
        printWriter.print("mHidden=");
        printWriter.print(this.A);
        printWriter.print(" mDetached=");
        printWriter.print(this.B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.E);
        printWriter.print(string);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.C);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.K);
        if (this.t != null) {
            printWriter.print(string);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.t);
        }
        if (this.u != null) {
            printWriter.print(string);
            printWriter.print("mHost=");
            printWriter.println(this.u);
        }
        if (this.w != null) {
            printWriter.print(string);
            printWriter.print("mParentFragment=");
            printWriter.println(this.w);
        }
        if (this.g != null) {
            printWriter.print(string);
            printWriter.print("mArguments=");
            printWriter.println(this.g);
        }
        if (this.b != null) {
            printWriter.print(string);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.b);
        }
        if (this.c != null) {
            printWriter.print(string);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.c);
        }
        if (this.d != null) {
            printWriter.print(string);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.d);
        }
        if ((object = this.Q0(false)) != null) {
            printWriter.print(string);
            printWriter.print("mTarget=");
            printWriter.print(object);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.j);
        }
        printWriter.print(string);
        printWriter.print("mPopDirection=");
        printWriter.println(this.B0());
        if (this.l0() != 0) {
            printWriter.print(string);
            printWriter.print("getEnterAnim=");
            printWriter.println(this.l0());
        }
        if (this.o0() != 0) {
            printWriter.print(string);
            printWriter.print("getExitAnim=");
            printWriter.println(this.o0());
        }
        if (this.C0() != 0) {
            printWriter.print(string);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(this.C0());
        }
        if (this.D0() != 0) {
            printWriter.print(string);
            printWriter.print("getPopExitAnim=");
            printWriter.println(this.D0());
        }
        if (this.H != null) {
            printWriter.print(string);
            printWriter.print("mContainer=");
            printWriter.println(this.H);
        }
        if (this.I != null) {
            printWriter.print(string);
            printWriter.print("mView=");
            printWriter.println(this.I);
        }
        if (this.i0() != null) {
            printWriter.print(string);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.i0());
        }
        if (this.b() != null) {
            ax.J0.a.c(this).b(string, fileDescriptor, printWriter, stringArray);
        }
        printWriter.print(string);
        object = new StringBuilder();
        ((StringBuilder)object).append("Child ");
        ((StringBuilder)object).append(this.v);
        ((StringBuilder)object).append(":");
        printWriter.println(((StringBuilder)object).toString());
        object = this.v;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("  ");
        ((FragmentManager)object).Y(stringBuilder.toString(), fileDescriptor, printWriter, stringArray);
    }

    boolean c1() {
        f f8 = this.L;
        if (f8 == null) {
            return false;
        }
        return f8.t;
    }

    void c2() {
        this.v.O();
        if (this.I != null) {
            this.U.a(d.a.ON_PAUSE);
        }
        this.T.h(d.a.ON_PAUSE);
        this.a = 6;
        this.G = false;
        this.D1();
        if (this.G) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onPause()");
        throw new B(stringBuilder.toString());
    }

    public final boolean d1() {
        return this.m;
    }

    void d2(boolean bl) {
        this.E1(bl);
    }

    Fragment e0(String string) {
        if (string.equals(this.f)) {
            return this;
        }
        return this.v.l0(string);
    }

    public final boolean e1() {
        return this.a >= 7;
    }

    boolean e2(Menu menu) {
        boolean bl = this.A;
        boolean bl2 = false;
        if (!bl) {
            boolean bl3 = bl2;
            if (this.E) {
                bl3 = bl2;
                if (this.F) {
                    this.F1(menu);
                    bl3 = true;
                }
            }
            return this.v.Q(menu) | bl3;
        }
        return false;
    }

    public final boolean equals(Object object) {
        return super.equals(object);
    }

    public final androidx.fragment.app.f f0() {
        j<?> j8 = this.u;
        if (j8 == null) {
            return null;
        }
        return (androidx.fragment.app.f)j8.e();
    }

    public final boolean f1() {
        FragmentManager fragmentManager = this.t;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.Q0();
    }

    void f2() {
        boolean bl = this.t.O0(this);
        Boolean bl2 = this.k;
        if (bl2 != null && bl2 == bl) {
            return;
        }
        this.k = bl;
        this.G1(bl);
        this.v.R();
    }

    public boolean g0() {
        Object object = this.L;
        if (object != null && (object = ((f)object).q) != null) {
            return (Boolean)object;
        }
        return true;
    }

    void g1() {
        this.v.V0();
    }

    void g2() {
        this.v.V0();
        this.v.c0(true);
        this.a = 7;
        this.G = false;
        this.H1();
        if (this.G) {
            androidx.lifecycle.g g8 = this.T;
            d.a a8 = d.a.ON_RESUME;
            g8.h(a8);
            if (this.I != null) {
                this.U.a(a8);
            }
            this.v.S();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onResume()");
        throw new B(stringBuilder.toString());
    }

    @Override
    public ax.I0.a getDefaultViewModelCreationExtras() {
        Object object;
        Context context;
        block5: {
            context = this.p2().getApplicationContext();
            while (context instanceof ContextWrapper) {
                if (context instanceof Application) {
                    context = (Application)context;
                    break block5;
                }
                context = ((ContextWrapper)context).getBaseContext();
            }
            context = null;
        }
        if (context == null && FragmentManager.J0(3)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Could not find Application instance from Context ");
            ((StringBuilder)object).append(this.p2().getApplicationContext());
            ((StringBuilder)object).append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            Log.d((String)"FragmentManager", (String)((StringBuilder)object).toString());
        }
        object = new d();
        if (context != null) {
            ((d)object).c(q.a.g, context);
        }
        ((d)object).c(androidx.lifecycle.m.a, this);
        ((d)object).c(androidx.lifecycle.m.b, this);
        if (this.j0() != null) {
            ((d)object).c(androidx.lifecycle.m.c, this.j0());
        }
        return object;
    }

    @Override
    public androidx.lifecycle.d getLifecycle() {
        return this.T;
    }

    @Override
    public final a getSavedStateRegistry() {
        return this.X.b();
    }

    @Override
    public r getViewModelStore() {
        if (this.t != null) {
            if (this.x0() != d.b.c0.ordinal()) {
                return this.t.E0(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public boolean h0() {
        Object object = this.L;
        if (object != null && (object = ((f)object).p) != null) {
            return (Boolean)object;
        }
        return true;
    }

    @Deprecated
    public void h1(Bundle bundle) {
        this.G = true;
    }

    void h2(Bundle bundle) {
        this.I1(bundle);
        this.X.e(bundle);
        Bundle bundle2 = this.v.i1();
        if (bundle2 != null) {
            bundle.putParcelable("android:support:fragments", (Parcelable)bundle2);
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    View i0() {
        f f8 = this.L;
        if (f8 == null) {
            return null;
        }
        return f8.a;
    }

    @Deprecated
    public void i1(int n8, int n9, Intent intent) {
        if (FragmentManager.J0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(this);
            stringBuilder.append(" received the following in onActivityResult(): requestCode: ");
            stringBuilder.append(n8);
            stringBuilder.append(" resultCode: ");
            stringBuilder.append(n9);
            stringBuilder.append(" data: ");
            stringBuilder.append(intent);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
    }

    void i2() {
        this.v.V0();
        this.v.c0(true);
        this.a = 5;
        this.G = false;
        this.J1();
        if (this.G) {
            androidx.lifecycle.g g8 = this.T;
            d.a a8 = d.a.ON_START;
            g8.h(a8);
            if (this.I != null) {
                this.U.a(a8);
            }
            this.v.T();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onStart()");
        throw new B(stringBuilder.toString());
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
        this.K1();
        if (this.G) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" did not call through to super.onStop()");
        throw new B(stringBuilder.toString());
    }

    public final FragmentManager k0() {
        if (this.u != null) {
            return this.v;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this);
        stringBuilder.append(" has not been attached yet.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void k1(Context object) {
        this.G = true;
        object = this.u;
        object = object == null ? null : ((j)object).e();
        if (object != null) {
            this.G = false;
            this.j1((Activity)object);
        }
    }

    void k2() {
        this.L1(this.I, this.b);
        this.v.W();
    }

    int l0() {
        f f8 = this.L;
        if (f8 == null) {
            return 0;
        }
        return f8.c;
    }

    @Deprecated
    public void l1(Fragment fragment) {
    }

    public Object m0() {
        f f8 = this.L;
        if (f8 == null) {
            return null;
        }
        return f8.j;
    }

    public boolean m1(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public final void m2(String[] object, int n8) {
        if (this.u != null) {
            this.A0().R0(this, (String[])object, n8);
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Fragment ");
        ((StringBuilder)object).append(this);
        ((StringBuilder)object).append(" not attached to Activity");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    ax.P.v n0() {
        f f8 = this.L;
        if (f8 == null) {
            return null;
        }
        f8.getClass();
        return null;
    }

    public void n1(Bundle bundle) {
        this.G = true;
        this.r2(bundle);
        if (!this.v.P0(1)) {
            this.v.D();
        }
    }

    public final androidx.fragment.app.f n2() {
        Object object = this.f0();
        if (object != null) {
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Fragment ");
        ((StringBuilder)object).append(this);
        ((StringBuilder)object).append(" not attached to an activity.");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    int o0() {
        f f8 = this.L;
        if (f8 == null) {
            return 0;
        }
        return f8.d;
    }

    public Animation o1(int n8, boolean bl, int n9) {
        return null;
    }

    public final Bundle o2() {
        Object object = this.j0();
        if (object != null) {
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Fragment ");
        ((StringBuilder)object).append(this);
        ((StringBuilder)object).append(" does not have any arguments.");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.G = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.n2().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.G = true;
    }

    @Deprecated
    public void onRequestPermissionsResult(int n8, String[] stringArray, int[] nArray) {
    }

    public Object p0() {
        f f8 = this.L;
        if (f8 == null) {
            return null;
        }
        return f8.l;
    }

    public Animator p1(int n8, boolean bl, int n9) {
        return null;
    }

    public final Context p2() {
        Object object = this.b();
        if (object != null) {
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Fragment ");
        ((StringBuilder)object).append(this);
        ((StringBuilder)object).append(" not attached to a context.");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    ax.P.v q0() {
        f f8 = this.L;
        if (f8 == null) {
            return null;
        }
        f8.getClass();
        return null;
    }

    @Deprecated
    public void q1(Menu menu, MenuInflater menuInflater) {
    }

    public final View q2() {
        Object object = this.R0();
        if (object != null) {
            return object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Fragment ");
        ((StringBuilder)object).append(this);
        ((StringBuilder)object).append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    View r0() {
        f f8 = this.L;
        if (f8 == null) {
            return null;
        }
        return f8.s;
    }

    public View r1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int n8 = this.Y;
        if (n8 != 0) {
            return layoutInflater.inflate(n8, viewGroup, false);
        }
        return null;
    }

    void r2(Bundle bundle) {
        if (bundle != null && (bundle = bundle.getParcelable("android:support:fragments")) != null) {
            this.v.g1((Parcelable)bundle);
            this.v.D();
        }
    }

    @Deprecated
    public final FragmentManager s0() {
        return this.t;
    }

    public void s1() {
        this.G = true;
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint(value={"UnknownNullness"}) Intent intent, int n8) {
        this.H2(intent, n8, null);
    }

    public final Object t0() {
        j<?> j8 = this.u;
        if (j8 == null) {
            return null;
        }
        return j8.i();
    }

    @Deprecated
    public void t1() {
    }

    final void t2(Bundle object) {
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
        this.M1((Bundle)object);
        if (this.G) {
            if (this.I != null) {
                this.U.a(d.a.ON_CREATE);
            }
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Fragment ");
        ((StringBuilder)object).append(this);
        ((StringBuilder)object).append(" did not call through to super.onViewStateRestored()");
        throw new B(((StringBuilder)object).toString());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append("{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append("}");
        stringBuilder.append(" (");
        stringBuilder.append(this.f);
        if (this.x != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.x));
        }
        if (this.z != null) {
            stringBuilder.append(" tag=");
            stringBuilder.append(this.z);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final LayoutInflater u0() {
        LayoutInflater layoutInflater;
        LayoutInflater layoutInflater2 = layoutInflater = this.P;
        if (layoutInflater == null) {
            layoutInflater2 = this.X1(null);
        }
        return layoutInflater2;
    }

    public void u1() {
        this.G = true;
    }

    void u2(int n8, int n9, int n10, int n11) {
        if (this.L == null && n8 == 0 && n9 == 0 && n10 == 0 && n11 == 0) {
            return;
        }
        this.d0().c = n8;
        this.d0().d = n9;
        this.d0().e = n10;
        this.d0().f = n11;
    }

    @Deprecated
    public LayoutInflater v0(Bundle object) {
        object = this.u;
        if (object != null) {
            object = ((j)object).j();
            ax.c0.v.a((LayoutInflater)object, this.v.x0());
            return object;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void v1() {
        this.G = true;
    }

    public void v2(Bundle bundle) {
        if (this.t != null && this.f1()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.g = bundle;
    }

    @Deprecated
    public ax.J0.a w0() {
        return ax.J0.a.c(this);
    }

    public LayoutInflater w1(Bundle bundle) {
        return this.v0(bundle);
    }

    void w2(View view) {
        this.d0().s = view;
    }

    public void x1(boolean bl) {
    }

    @Deprecated
    public void x2(boolean bl) {
        if (this.E != bl) {
            this.E = bl;
            if (this.X0() && !this.Z0()) {
                this.u.o();
            }
        }
    }

    int y0() {
        f f8 = this.L;
        if (f8 == null) {
            return 0;
        }
        return f8.g;
    }

    @Deprecated
    public void y1(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
    }

    public void y2(boolean bl) {
        if (this.F != bl) {
            this.F = bl;
            if (this.E && this.X0() && !this.Z0()) {
                this.u.o();
            }
        }
    }

    public final Fragment z0() {
        return this.w;
    }

    public void z1(Context object, AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
        object = this.u;
        object = object == null ? null : ((j)object).e();
        if (object != null) {
            this.G = false;
            this.y1((Activity)object, attributeSet, bundle);
        }
    }

    void z2(int n8) {
        if (this.L == null && n8 == 0) {
            return;
        }
        this.d0();
        this.L.g = n8;
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
            Object object;
            this.k = object = c0;
            this.l = null;
            this.m = object;
            this.n = null;
            this.o = object;
            this.r = 1.0f;
            this.s = null;
        }
    }

    static class g {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    public static class h
    extends RuntimeException {
        public h(String string, Exception exception) {
            super(string, exception);
        }
    }

    private static abstract class i {
        private i() {
        }

        abstract void a();
    }
}

