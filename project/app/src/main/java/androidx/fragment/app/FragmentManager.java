/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.A;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import androidx.fragment.app.d;
import androidx.fragment.app.f;
import androidx.fragment.app.i;
import androidx.fragment.app.p;
import androidx.fragment.app.r;
import androidx.fragment.app.s;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import androidx.fragment.app.z;
import androidx.lifecycle.d;
import ax.A0.e;
import ax.A0.g;
import ax.A0.h;
import ax.B0.c;
import ax.G0.v;
import ax.P.q;
import ax.c0.B;
import ax.c0.w;
import ax.i.u;
import ax.k.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class FragmentManager {
    private static boolean S = false;
    private i A;
    private A B = null;
    private A C;
    private ax.k.c<Intent> D;
    private ax.k.c<ax.k.g> E;
    private ax.k.c<String[]> F;
    ArrayDeque<k> G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private ArrayList<a> M;
    private ArrayList<Boolean> N;
    private ArrayList<Fragment> O;
    private androidx.fragment.app.o P;
    private c.c Q;
    private Runnable R;
    private final ArrayList<n> a = new ArrayList();
    private boolean b;
    private final s c = new s();
    ArrayList<a> d;
    private ArrayList<Fragment> e;
    private final androidx.fragment.app.k f = new androidx.fragment.app.k(this);
    private OnBackPressedDispatcher g;
    private final ax.i.r h = new ax.i.r(this, false){
        final FragmentManager d;
        {
            this.d = fragmentManager;
            super(bl);
        }

        @Override
        public void d() {
            this.d.F0();
        }
    };
    private final AtomicInteger i = new AtomicInteger();
    private final Map<String, c> j = java.util.DesugarCollections.synchronizedMap(new HashMap());
    private final Map<String, Bundle> k = java.util.DesugarCollections.synchronizedMap(new HashMap());
    private final Map<String, l> l = java.util.DesugarCollections.synchronizedMap(new HashMap());
    private ArrayList<m> m;
    private final androidx.fragment.app.l n = new androidx.fragment.app.l(this);
    private final CopyOnWriteArrayList<ax.A0.k> o = new CopyOnWriteArrayList();
    private final ax.b0.a<Configuration> p = new ax.A0.f(this);
    private final ax.b0.a<Integer> q = new g(this);
    private final ax.b0.a<ax.P.i> r = new h(this);
    private final ax.b0.a<ax.P.t> s = new ax.A0.i(this);
    private final B t = new B(this){
        final FragmentManager a;
        {
            this.a = fragmentManager;
        }

        @Override
        public boolean a(MenuItem menuItem) {
            return this.a.L(menuItem);
        }

        @Override
        public void b(Menu menu) {
            this.a.M(menu);
        }

        @Override
        public void c(Menu menu, MenuInflater menuInflater) {
            this.a.E(menu, menuInflater);
        }

        @Override
        public void d(Menu menu) {
            this.a.Q(menu);
        }
    };
    int u = -1;
    private androidx.fragment.app.j<?> v;
    private e w;
    private Fragment x;
    Fragment y;
    private i z = null;

    public FragmentManager() {
        this.A = new i(this){
            final FragmentManager b;
            {
                this.b = fragmentManager;
            }

            @Override
            public Fragment a(ClassLoader classLoader, String string) {
                return this.b.w0().b(this.b.w0().f(), string, null);
            }
        };
        this.C = new A(this){
            final FragmentManager a;
            {
                this.a = fragmentManager;
            }

            @Override
            public z a(ViewGroup viewGroup) {
                return new d(viewGroup);
            }
        };
        this.G = new ArrayDeque();
        this.R = new Runnable(this){
            final FragmentManager q;
            {
                this.q = fragmentManager;
            }

            @Override
            public void run() {
                this.q.c0(true);
            }
        };
    }

    static Fragment D0(View object) {
        if ((object = object.getTag(ax.z0.b.a)) instanceof Fragment) {
            return (Fragment)object;
        }
        return null;
    }

    public static boolean J0(int n8) {
        return S || Log.isLoggable((String)"FragmentManager", (int)n8);
        {
        }
    }

    private boolean K0(Fragment fragment) {
        return fragment.E && fragment.F || fragment.v.p();
    }

    private boolean L0() {
        Fragment fragment = this.x;
        if (fragment == null) {
            return true;
        }
        return fragment.X0() && this.x.A0().L0();
    }

    private void N(Fragment fragment) {
        if (fragment != null && fragment.equals(this.h0(fragment.f))) {
            fragment.f2();
        }
    }

    private void U(int n8) {
        Throwable throwable2;
        block3: {
            try {
                this.b = true;
                this.c.d(n8);
                this.U0(n8, false);
                Iterator<z> iterator = this.v().iterator();
                while (iterator.hasNext()) {
                    iterator.next().j();
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            this.b = false;
            this.c0(true);
            return;
        }
        this.b = false;
        throw throwable2;
    }

    private void X() {
        if (this.L) {
            this.L = false;
            this.r1();
        }
    }

    private void Z() {
        Iterator<z> iterator = this.v().iterator();
        while (iterator.hasNext()) {
            iterator.next().j();
        }
    }

    public static /* synthetic */ void a(FragmentManager fragmentManager, Integer n8) {
        if (fragmentManager.L0() && n8 == 80) {
            fragmentManager.H(false);
        }
    }

    public static /* synthetic */ Bundle b(FragmentManager fragmentManager) {
        return fragmentManager.i1();
    }

    private void b0(boolean bl) {
        if (!this.b) {
            if (this.v == null) {
                if (this.K) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.v.g().getLooper()) {
                if (!bl) {
                    this.q();
                }
                if (this.M == null) {
                    this.M = new ArrayList();
                    this.N = new ArrayList();
                }
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    private boolean b1(String string, int n8, int n9) {
        this.c0(false);
        this.b0(true);
        Fragment fragment = this.y;
        if (fragment != null && n8 < 0 && string == null && fragment.k0().Z0()) {
            return true;
        }
        boolean bl = this.c1(this.M, this.N, string, n8, n9);
        if (bl) {
            this.b = true;
            try {
                this.e1(this.M, this.N);
            }
            finally {
                this.r();
            }
        }
        this.t1();
        this.X();
        this.c.b();
        return bl;
    }

    public static /* synthetic */ void c(FragmentManager fragmentManager, ax.P.t t8) {
        if (fragmentManager.L0()) {
            fragmentManager.P(t8.a(), false);
        }
    }

    public static /* synthetic */ void d(FragmentManager fragmentManager, ax.P.i i8) {
        if (fragmentManager.L0()) {
            fragmentManager.I(i8.a(), false);
        }
    }

    public static /* synthetic */ void e(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.L0()) {
            fragmentManager.B(configuration, false);
        }
    }

    private static void e0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int n8, int n9) {
        while (n8 < n9) {
            a a8 = arrayList.get(n8);
            if (arrayList2.get(n8).booleanValue()) {
                a8.w(-1);
                a8.B();
            } else {
                a8.w(1);
                a8.A();
            }
            ++n8;
        }
    }

    private void e1(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        block10: {
            block9: {
                if (arrayList.isEmpty()) break block9;
                if (arrayList.size() != arrayList2.size()) break block10;
                int n8 = arrayList.size();
                int n9 = 0;
                int n10 = 0;
                while (n9 < n8) {
                    int n11 = n9;
                    int n12 = n10;
                    if (!arrayList.get((int)n9).r) {
                        if (n10 != n9) {
                            this.f0(arrayList, arrayList2, n10, n9);
                        }
                        n12 = n10 = n9 + 1;
                        if (arrayList2.get(n9).booleanValue()) {
                            while (true) {
                                n12 = n10;
                                if (n10 >= n8) break;
                                n12 = n10;
                                if (!arrayList2.get(n10).booleanValue()) break;
                                n12 = n10;
                                if (arrayList.get((int)n10).r) break;
                                ++n10;
                            }
                        }
                        this.f0(arrayList, arrayList2, n9, n12);
                        n11 = n12 - 1;
                    }
                    n9 = n11 + 1;
                    n10 = n12;
                }
                if (n10 != n8) {
                    this.f0(arrayList, arrayList2, n10, n8);
                }
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    private void f0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int n8, int n9) {
        int n10;
        int n11;
        int n12;
        Object object;
        int n13;
        boolean bl = arrayList.get((int)n8).r;
        ArrayList<Fragment> arrayList3 = this.O;
        if (arrayList3 == null) {
            this.O = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.O.addAll(this.c.o());
        arrayList3 = this.A0();
        boolean bl2 = false;
        for (n13 = n8; n13 < n9; ++n13) {
            object = arrayList.get(n13);
            arrayList3 = arrayList2.get(n13) == false ? ((a)object).C(this.O, (Fragment)((Object)arrayList3)) : ((a)object).F(this.O, (Fragment)((Object)arrayList3));
            if (!bl2 && !((t)object).i) {
                bl2 = false;
                continue;
            }
            bl2 = true;
        }
        this.O.clear();
        if (!bl && this.u >= 1) {
            for (n13 = n8; n13 < n9; ++n13) {
                arrayList3 = arrayList.get((int)n13).c;
                n12 = arrayList3.size();
                n11 = 0;
                while (n11 < n12) {
                    object = arrayList3.get(n11);
                    n10 = n11 + 1;
                    object = ((t.a)object).b;
                    n11 = n10;
                    if (object == null) continue;
                    n11 = n10;
                    if (((Fragment)object).t == null) continue;
                    object = this.x((Fragment)object);
                    this.c.r((r)object);
                    n11 = n10;
                }
            }
        }
        FragmentManager.e0(arrayList, arrayList2, n8, n9);
        bl = arrayList2.get(n9 - 1);
        for (n13 = n8; n13 < n9; ++n13) {
            arrayList3 = arrayList.get(n13);
            if (bl) {
                for (n11 = ((t)((Object)arrayList3)).c.size() - 1; n11 >= 0; --n11) {
                    object = ((t)((Object)arrayList3)).c.get((int)n11).b;
                    if (object == null) continue;
                    this.x((Fragment)object).m();
                }
                continue;
            }
            arrayList3 = ((t)((Object)arrayList3)).c;
            n12 = arrayList3.size();
            n11 = 0;
            while (n11 < n12) {
                object = arrayList3.get(n11);
                n10 = n11 + 1;
                object = ((t.a)object).b;
                n11 = n10;
                if (object == null) continue;
                this.x((Fragment)object).m();
                n11 = n10;
            }
        }
        this.U0(this.u, true);
        object = this.w(arrayList, n8, n9).iterator();
        while (true) {
            if (!object.hasNext()) break;
            arrayList3 = (z)object.next();
            ((z)((Object)arrayList3)).r(bl);
            ((z)((Object)arrayList3)).p();
            ((z)((Object)arrayList3)).g();
        }
        for (n13 = n8; n13 < n9; ++n13) {
            arrayList3 = arrayList.get(n13);
            if (arrayList2.get(n13).booleanValue() && ((a)((Object)arrayList3)).v >= 0) {
                ((a)((Object)arrayList3)).v = -1;
            }
            ((a)((Object)arrayList3)).E();
        }
        if (bl2) {
            this.f1();
        }
    }

    private void f1() {
        if (this.m != null) {
            for (int i8 = 0; i8 < this.m.size(); ++i8) {
                this.m.get(i8).a();
            }
        }
    }

    static int h1(int n8) {
        if (n8 != 4097) {
            if (n8 != 8194) {
                if (n8 != 8197) {
                    if (n8 != 4099) {
                        if (n8 != 4100) {
                            return 0;
                        }
                        return 8197;
                    }
                    return 4099;
                }
                return 4100;
            }
            return 4097;
        }
        return 8194;
    }

    private int i0(String string, int n8, boolean bl) {
        ArrayList<a> arrayList = this.d;
        if (arrayList != null && !arrayList.isEmpty()) {
            int n9;
            if (string == null && n8 < 0) {
                if (bl) {
                    return 0;
                }
                return this.d.size() - 1;
            }
            for (n9 = this.d.size() - 1; n9 >= 0; --n9) {
                arrayList = this.d.get(n9);
                if (string != null && string.equals(((a)((Object)arrayList)).D()) || n8 >= 0 && n8 == ((a)((Object)arrayList)).v) break;
            }
            if (n9 < 0) {
                return n9;
            }
            if (bl) {
                while (n9 > 0) {
                    arrayList = this.d.get(n9 - 1);
                    if ((string == null || !string.equals(((a)((Object)arrayList)).D())) && (n8 < 0 || n8 != ((a)((Object)arrayList)).v)) break;
                    --n9;
                }
                return n9;
            }
            if (n9 == this.d.size() - 1) {
                return -1;
            }
            return n9 + 1;
        }
        return -1;
    }

    static FragmentManager m0(View view) {
        Object object;
        block5: {
            Fragment fragment = FragmentManager.n0(view);
            if (fragment != null) {
                if (fragment.X0()) {
                    return fragment.k0();
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("The Fragment ");
                stringBuilder.append(fragment);
                stringBuilder.append(" that owns View ");
                stringBuilder.append(view);
                stringBuilder.append(" has already been destroyed. Nested fragments should always use the child FragmentManager.");
                throw new IllegalStateException(stringBuilder.toString());
            }
            object = view.getContext();
            while (object instanceof ContextWrapper) {
                if (object instanceof f) {
                    object = (f)object;
                    break block5;
                }
                object = ((ContextWrapper)object).getBaseContext();
            }
            object = null;
        }
        if (object != null) {
            return ((f)object).getSupportFragmentManager();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("View ");
        ((StringBuilder)object).append(view);
        ((StringBuilder)object).append(" is not within a subclass of FragmentActivity.");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    private static Fragment n0(View view) {
        while (view != null) {
            Fragment fragment = FragmentManager.D0(view);
            if (fragment != null) {
                return fragment;
            }
            if ((view = view.getParent()) instanceof View) continue;
            view = null;
        }
        return null;
    }

    private void o0() {
        Iterator<z> iterator = this.v().iterator();
        while (iterator.hasNext()) {
            iterator.next().k();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean p0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        ArrayList<n> arrayList3 = this.a;
        synchronized (arrayList3) {
            Throwable throwable3;
            block9: {
                Throwable throwable22;
                block8: {
                    boolean bl;
                    block7: {
                        bl = this.a.isEmpty();
                        if (!bl) break block7;
                        return false;
                    }
                    try {
                        boolean bl2;
                        int n8 = this.a.size();
                        bl = false;
                        for (int i8 = 0; i8 < n8; bl |= bl2, ++i8) {
                            bl2 = this.a.get(i8).a(arrayList, arrayList2);
                        }
                    }
                    catch (Throwable throwable22) {
                        break block8;
                    }
                    try {
                        this.a.clear();
                        this.v.g().removeCallbacks(this.R);
                        return bl;
                    }
                    catch (Throwable throwable3) {}
                    break block9;
                }
                this.a.clear();
                this.v.g().removeCallbacks(this.R);
                throw throwable22;
            }
            throw throwable3;
        }
    }

    private void p1(Fragment fragment) {
        ViewGroup viewGroup = this.t0(fragment);
        if (viewGroup != null && fragment.l0() + fragment.o0() + fragment.C0() + fragment.D0() > 0) {
            int n8 = ax.z0.b.c;
            if (viewGroup.getTag(n8) == null) {
                viewGroup.setTag(n8, (Object)fragment);
            }
            ((Fragment)viewGroup.getTag(n8)).A2(fragment.B0());
        }
    }

    private void q() {
        if (!this.Q0()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    private void r() {
        this.b = false;
        this.N.clear();
        this.M.clear();
    }

    private androidx.fragment.app.o r0(Fragment fragment) {
        return this.P.k(fragment);
    }

    private void r1() {
        Iterator<r> iterator = this.c.k().iterator();
        while (iterator.hasNext()) {
            this.X0(iterator.next());
        }
    }

    private void s() {
        androidx.fragment.app.j<?> j82 = this.v;
        boolean bl = j82 instanceof v ? this.c.p().o() : (j82.f() instanceof Activity ? ((Activity)this.v.f()).isChangingConfigurations() ^ true : true);
        if (bl) {
            Iterator<c> iterator = this.j.values().iterator();
            while (iterator.hasNext()) {
                for (String string : iterator.next().q) {
                    this.c.p().h(string);
                }
            }
        }
    }

    private void s1(RuntimeException runtimeException) {
        Log.e((String)"FragmentManager", (String)runtimeException.getMessage());
        Log.e((String)"FragmentManager", (String)"Activity state:");
        PrintWriter printWriter = new PrintWriter(new y("FragmentManager"));
        androidx.fragment.app.j<?> j8 = this.v;
        if (j8 != null) {
            try {
                j8.h("  ", null, printWriter, new String[0]);
            }
            catch (Exception exception) {
                Log.e((String)"FragmentManager", (String)"Failed dumping state", (Throwable)exception);
            }
        } else {
            try {
                this.Y("  ", null, printWriter, new String[0]);
            }
            catch (Exception exception) {
                Log.e((String)"FragmentManager", (String)"Failed dumping state", (Throwable)exception);
            }
        }
        throw runtimeException;
    }

    private ViewGroup t0(Fragment fragment) {
        ViewGroup viewGroup = fragment.H;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.y <= 0) {
            return null;
        }
        if (this.w.d() && (fragment = this.w.c(fragment.y)) instanceof ViewGroup) {
            return (ViewGroup)fragment;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void t1() {
        Object object = this.a;
        // MONITORENTER : object
        boolean bl = this.a.isEmpty();
        boolean bl2 = true;
        if (!bl) {
            this.h.j(true);
            // MONITOREXIT : object
            return;
        }
        object = this.h;
        if (this.q0() <= 0 || !this.O0(this.x)) {
            bl2 = false;
        }
        ((ax.i.r)object).j(bl2);
    }

    private Set<z> v() {
        HashSet<z> hashSet = new HashSet<z>();
        Iterator<r> iterator = this.c.k().iterator();
        while (iterator.hasNext()) {
            ViewGroup viewGroup = iterator.next().k().H;
            if (viewGroup == null) continue;
            hashSet.add(androidx.fragment.app.z.o(viewGroup, this.B0()));
        }
        return hashSet;
    }

    private Set<z> w(ArrayList<a> arrayList, int n8, int n9) {
        HashSet<z> hashSet = new HashSet<z>();
        while (n8 < n9) {
            ArrayList<t.a> arrayList2 = arrayList.get((int)n8).c;
            int n10 = arrayList2.size();
            int n11 = 0;
            while (n11 < n10) {
                Object object = arrayList2.get(n11);
                int n12 = n11 + 1;
                object = ((t.a)object).b;
                n11 = n12;
                if (object == null) continue;
                object = ((Fragment)object).H;
                n11 = n12;
                if (object == null) continue;
                hashSet.add(androidx.fragment.app.z.n((ViewGroup)object, this));
                n11 = n12;
            }
            ++n8;
        }
        return hashSet;
    }

    void A() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        this.U(0);
    }

    public Fragment A0() {
        return this.y;
    }

    void B(Configuration configuration, boolean bl) {
        if (bl && this.v instanceof ax.Q.e) {
            this.s1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment == null) continue;
            fragment.P1(configuration);
            if (!bl) continue;
            fragment.v.B(configuration, true);
        }
    }

    A B0() {
        Object object = this.B;
        if (object != null) {
            return object;
        }
        object = this.x;
        if (object != null) {
            return ((Fragment)object).t.B0();
        }
        return this.C;
    }

    boolean C(MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment == null || !fragment.Q1(menuItem)) continue;
            return true;
        }
        return false;
    }

    public c.c C0() {
        return this.Q;
    }

    void D() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        this.U(1);
    }

    boolean E(Menu object, MenuInflater menuInflater) {
        int n8 = this.u;
        int n9 = 0;
        if (n8 < 1) {
            return false;
        }
        Iterator<Fragment> iterator = this.c.o().iterator();
        ArrayList<Fragment> arrayList = null;
        boolean bl = false;
        while (iterator.hasNext()) {
            Fragment fragment = iterator.next();
            if (fragment == null || !this.N0(fragment) || !fragment.S1((Menu)object, menuInflater)) continue;
            ArrayList<Fragment> arrayList2 = arrayList;
            if (arrayList == null) {
                arrayList2 = new ArrayList<Fragment>();
            }
            arrayList2.add(fragment);
            bl = true;
            arrayList = arrayList2;
        }
        if (this.e != null) {
            while (n9 < this.e.size()) {
                object = this.e.get(n9);
                if (arrayList == null || !arrayList.contains(object)) {
                    ((Fragment)object).t1();
                }
                ++n9;
            }
        }
        this.e = arrayList;
        return bl;
    }

    androidx.lifecycle.r E0(Fragment fragment) {
        return this.P.n(fragment);
    }

    void F() {
        this.K = true;
        this.c0(true);
        this.Z();
        this.s();
        this.U(-1);
        Object object = this.v;
        if (object instanceof ax.Q.f) {
            ((ax.Q.f)object).removeOnTrimMemoryListener(this.q);
        }
        if ((object = this.v) instanceof ax.Q.e) {
            ((ax.Q.e)object).removeOnConfigurationChangedListener(this.p);
        }
        if ((object = this.v) instanceof q) {
            ((q)object).removeOnMultiWindowModeChangedListener(this.r);
        }
        if ((object = this.v) instanceof ax.P.r) {
            ((ax.P.r)object).removeOnPictureInPictureModeChangedListener(this.s);
        }
        if ((object = this.v) instanceof w && this.x == null) {
            ((w)object).removeMenuProvider(this.t);
        }
        this.v = null;
        this.w = null;
        this.x = null;
        if (this.g != null) {
            this.h.h();
            this.g = null;
        }
        if ((object = this.D) != null) {
            ((ax.k.c)object).c();
            this.E.c();
            this.F.c();
        }
    }

    void F0() {
        this.c0(true);
        if (this.h.g()) {
            this.Z0();
            return;
        }
        this.g.k();
    }

    void G() {
        this.U(1);
    }

    void G0(Fragment fragment) {
        if (FragmentManager.J0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hide: ");
            stringBuilder.append(fragment);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        if (!fragment.A) {
            fragment.A = true;
            fragment.O = true ^ fragment.O;
            this.p1(fragment);
        }
    }

    void H(boolean bl) {
        if (bl && this.v instanceof ax.Q.f) {
            this.s1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment == null) continue;
            fragment.Y1();
            if (!bl) continue;
            fragment.v.H(true);
        }
    }

    void H0(Fragment fragment) {
        if (fragment.l && this.K0(fragment)) {
            this.H = true;
        }
    }

    void I(boolean bl, boolean bl2) {
        if (bl2 && this.v instanceof q) {
            this.s1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment == null) continue;
            fragment.Z1(bl);
            if (!bl2) continue;
            fragment.v.I(bl, true);
        }
    }

    public boolean I0() {
        return this.K;
    }

    void J(Fragment fragment) {
        Iterator<ax.A0.k> iterator = this.o.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this, fragment);
        }
    }

    void K() {
        for (Fragment fragment : this.c.l()) {
            if (fragment == null) continue;
            fragment.x1(fragment.Z0());
            fragment.v.K();
        }
    }

    boolean L(MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment == null || !fragment.a2(menuItem)) continue;
            return true;
        }
        return false;
    }

    void M(Menu menu) {
        if (this.u >= 1) {
            for (Fragment fragment : this.c.o()) {
                if (fragment == null) continue;
                fragment.b2(menu);
            }
        }
    }

    boolean M0(Fragment fragment) {
        if (fragment == null) {
            return false;
        }
        return fragment.Z0();
    }

    boolean N0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.b1();
    }

    void O() {
        this.U(5);
    }

    boolean O0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.t;
        return fragment.equals(fragmentManager.A0()) && this.O0(fragmentManager.x);
    }

    void P(boolean bl, boolean bl2) {
        if (bl2 && this.v instanceof ax.P.r) {
            this.s1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment == null) continue;
            fragment.d2(bl);
            if (!bl2) continue;
            fragment.v.P(bl, true);
        }
    }

    boolean P0(int n8) {
        return this.u >= n8;
    }

    boolean Q(Menu menu) {
        int n8 = this.u;
        boolean bl = false;
        if (n8 < 1) {
            return false;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment == null || !this.N0(fragment) || !fragment.e2(menu)) continue;
            bl = true;
        }
        return bl;
    }

    public boolean Q0() {
        return this.I || this.J;
        {
        }
    }

    void R() {
        this.t1();
        this.N(this.y);
    }

    void R0(Fragment object, String[] stringArray, int n8) {
        if (this.F != null) {
            object = new k(((Fragment)object).f, n8);
            this.G.addLast((k)object);
            this.F.a(stringArray);
            return;
        }
        this.v.k((Fragment)object, stringArray, n8);
    }

    void S() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        this.U(7);
    }

    void S0(Fragment object, @SuppressLint(value={"UnknownNullness"}) Intent intent, int n8, Bundle bundle) {
        if (this.D != null) {
            object = new k(((Fragment)object).f, n8);
            this.G.addLast((k)object);
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.D.a(intent);
            return;
        }
        this.v.m((Fragment)object, intent, n8, bundle);
    }

    void T() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        this.U(5);
    }

    void T0(Fragment fragment, @SuppressLint(value={"UnknownNullness"}) IntentSender object, int n8, Intent object2, int n9, int n10, int n11, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.E != null) {
            Intent intent = object2;
            if (bundle != null) {
                intent = object2;
                if (object2 == null) {
                    intent = new Intent();
                    intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                }
                if (FragmentManager.J0(2)) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("ActivityOptions ");
                    ((StringBuilder)object2).append(bundle);
                    ((StringBuilder)object2).append(" were added to fillInIntent ");
                    ((StringBuilder)object2).append(intent);
                    ((StringBuilder)object2).append(" for fragment ");
                    ((StringBuilder)object2).append(fragment);
                    Log.v((String)"FragmentManager", (String)((StringBuilder)object2).toString());
                }
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            object = new g.a((IntentSender)object).b(intent).c(n10, n9).a();
            object2 = new k(fragment.f, n8);
            this.G.addLast((k)object2);
            if (FragmentManager.J0(2)) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Fragment ");
                ((StringBuilder)object2).append(fragment);
                ((StringBuilder)object2).append("is launching an IntentSender for result ");
                Log.v((String)"FragmentManager", (String)((StringBuilder)object2).toString());
            }
            this.E.a((ax.k.g)object);
            return;
        }
        this.v.n(fragment, (IntentSender)object, n8, (Intent)object2, n9, n10, n11, bundle);
    }

    void U0(int n8, boolean bl) {
        if (this.v == null && n8 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (bl || n8 != this.u) {
            androidx.fragment.app.j<?> j8;
            this.u = n8;
            this.c.t();
            this.r1();
            if (this.H && (j8 = this.v) != null && this.u == 7) {
                j8.o();
                this.H = false;
            }
        }
    }

    void V() {
        this.J = true;
        this.P.q(true);
        this.U(4);
    }

    void V0() {
        if (this.v != null) {
            this.I = false;
            this.J = false;
            this.P.q(false);
            for (Fragment fragment : this.c.o()) {
                if (fragment == null) continue;
                fragment.g1();
            }
        }
    }

    void W() {
        this.U(2);
    }

    void W0(FragmentContainerView fragmentContainerView) {
        for (r r8 : this.c.k()) {
            View view;
            Fragment fragment = r8.k();
            if (fragment.y != fragmentContainerView.getId() || (view = fragment.I) == null || view.getParent() != null) continue;
            fragment.H = fragmentContainerView;
            r8.b();
        }
    }

    void X0(r r8) {
        Fragment fragment = r8.k();
        if (fragment.J) {
            if (this.b) {
                this.L = true;
                return;
            }
            fragment.J = false;
            r8.m();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void Y(String string, FileDescriptor arrayList, PrintWriter printWriter, String[] object) {
        int n8;
        int n9;
        CharSequence charSequence = new StringBuilder();
        charSequence.append(string);
        charSequence.append("    ");
        charSequence = charSequence.toString();
        this.c.e(string, (FileDescriptor)((Object)arrayList), printWriter, (String[])object);
        arrayList = this.e;
        int n10 = 0;
        if (arrayList != null && (n9 = arrayList.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Fragments Created Menus:");
            for (n8 = 0; n8 < n9; ++n8) {
                arrayList = this.e.get(n8);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(n8);
                printWriter.print(": ");
                printWriter.println(((Fragment)((Object)arrayList)).toString());
            }
        }
        if ((arrayList = this.d) != null && (n9 = arrayList.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Back Stack:");
            for (n8 = 0; n8 < n9; ++n8) {
                arrayList = this.d.get(n8);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(n8);
                printWriter.print(": ");
                printWriter.println(((a)((Object)arrayList)).toString());
                ((a)((Object)arrayList)).y((String)charSequence, printWriter);
            }
        }
        printWriter.print(string);
        arrayList = new StringBuilder();
        ((StringBuilder)((Object)arrayList)).append("Back Stack Index: ");
        ((StringBuilder)((Object)arrayList)).append(this.i.get());
        printWriter.println(((StringBuilder)((Object)arrayList)).toString());
        arrayList = this.a;
        synchronized (arrayList) {
            Throwable throwable2;
            block13: {
                try {
                    n9 = this.a.size();
                    if (n9 > 0) {
                        printWriter.print(string);
                        printWriter.println("Pending Actions:");
                        for (n8 = n10; n8 < n9; ++n8) {
                            object = this.a.get(n8);
                            printWriter.print(string);
                            printWriter.print("  #");
                            printWriter.print(n8);
                            printWriter.print(": ");
                            printWriter.println(object);
                        }
                    }
                }
                catch (Throwable throwable2) {
                    break block13;
                }
                {
                    // MONITOREXIT @DISABLED, blocks:[1, 3] lbl58 : MonitorExitStatement: MONITOREXIT : var2_3
                    printWriter.print(string);
                    printWriter.println("FragmentManager misc state:");
                    printWriter.print(string);
                    printWriter.print("  mHost=");
                    printWriter.println(this.v);
                    printWriter.print(string);
                    printWriter.print("  mContainer=");
                    printWriter.println(this.w);
                    if (this.x != null) {
                        printWriter.print(string);
                        printWriter.print("  mParent=");
                        printWriter.println(this.x);
                    }
                    printWriter.print(string);
                    printWriter.print("  mCurState=");
                    printWriter.print(this.u);
                    printWriter.print(" mStateSaved=");
                    printWriter.print(this.I);
                    printWriter.print(" mStopped=");
                    printWriter.print(this.J);
                    printWriter.print(" mDestroyed=");
                    printWriter.println(this.K);
                    if (this.H) {
                        printWriter.print(string);
                        printWriter.print("  mNeedMenuInvalidate=");
                        printWriter.println(this.H);
                    }
                    return;
                }
            }
            throw throwable2;
        }
    }

    void Y0(int n8, int n9, boolean bl) {
        if (n8 >= 0) {
            this.a0(new o(this, null, n8, n9), bl);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bad id: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public boolean Z0() {
        return this.b1(null, -1, 0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void a0(n object, boolean bl) {
        if (!bl) {
            if (this.v == null) {
                if (this.K) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            this.q();
        }
        ArrayList<n> arrayList = this.a;
        synchronized (arrayList) {
            Throwable throwable2;
            block8: {
                try {
                    if (this.v != null) {
                        this.a.add((n)object);
                        this.j1();
                        return;
                    }
                    if (bl) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                object = new IllegalStateException("Activity has been destroyed");
                throw object;
            }
            throw throwable2;
        }
    }

    public boolean a1(int n8, int n9) {
        if (n8 >= 0) {
            return this.b1(null, n8, n9);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Bad id: ");
        stringBuilder.append(n8);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    boolean c0(boolean bl) {
        this.b0(bl);
        bl = false;
        while (this.p0(this.M, this.N)) {
            bl = true;
            this.b = true;
            try {
                this.e1(this.M, this.N);
            }
            finally {
                this.r();
            }
        }
        this.t1();
        this.X();
        this.c.b();
        return bl;
    }

    boolean c1(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String string, int n8, int n9) {
        boolean bl = (n9 & 1) != 0;
        if ((n9 = this.i0(string, n8, bl)) < 0) {
            return false;
        }
        for (n8 = this.d.size() - 1; n8 >= n9; --n8) {
            arrayList.add(this.d.remove(n8));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    void d0(n n8, boolean bl) {
        if (bl && (this.v == null || this.K)) {
            return;
        }
        this.b0(bl);
        if (n8.a(this.M, this.N)) {
            this.b = true;
            try {
                this.e1(this.M, this.N);
            }
            finally {
                this.r();
            }
        }
        this.t1();
        this.X();
        this.c.b();
    }

    void d1(Fragment fragment) {
        if (FragmentManager.J0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("remove: ");
            stringBuilder.append(fragment);
            stringBuilder.append(" nesting=");
            stringBuilder.append(fragment.s);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        boolean bl = fragment.a1();
        if (fragment.B && bl) {
            return;
        }
        this.c.u(fragment);
        if (this.K0(fragment)) {
            this.H = true;
        }
        fragment.m = true;
        this.p1(fragment);
    }

    public boolean g0() {
        boolean bl = this.c0(true);
        this.o0();
        return bl;
    }

    void g1(Parcelable object) {
        androidx.fragment.app.n n8;
        Object object2;
        Object object32;
        block20: {
            block19: {
                if (object == null) break block19;
                object = (Bundle)object;
                for (Object object32 : object.keySet()) {
                    if (!((String)object32).startsWith("result_") || (object2 = object.getBundle((String)object32)) == null) continue;
                    object2.setClassLoader(this.v.f().getClassLoader());
                    object32 = ((String)object32).substring(7);
                    this.k.put((String)object32, (Bundle)object2);
                }
                object2 = new ArrayList();
                for (Object object32 : object.keySet()) {
                    if (!((String)object32).startsWith("fragment_") || (object32 = object.getBundle((String)object32)) == null) continue;
                    object32.setClassLoader(this.v.f().getClassLoader());
                    ((ArrayList)object2).add((p)object32.getParcelable("state"));
                }
                this.c.x((ArrayList<p>)object2);
                n8 = (androidx.fragment.app.n)object.getParcelable("state");
                if (n8 != null) break block20;
            }
            return;
        }
        this.c.v();
        object2 = n8.q;
        int n9 = ((ArrayList)object2).size();
        int n10 = 0;
        int n11 = 0;
        while (n11 < n9) {
            Object object4;
            object = ((ArrayList)object2).get(n11);
            int n12 = n11 + 1;
            object = (String)object;
            object32 = this.c.B((String)object, null);
            n11 = n12;
            if (object32 == null) continue;
            object = this.P.j(((p)object32).c0);
            if (object != null) {
                if (FragmentManager.J0(2)) {
                    object4 = new StringBuilder();
                    ((StringBuilder)object4).append("restoreSaveState: re-attaching retained ");
                    ((StringBuilder)object4).append(object);
                    Log.v((String)"FragmentManager", (String)((StringBuilder)object4).toString());
                }
                object = new r(this.n, this.c, (Fragment)object, (p)object32);
            } else {
                object = new r(this.n, this.c, this.v.f().getClassLoader(), this.u0(), (p)object32);
            }
            object4 = ((r)object).k();
            ((Fragment)object4).t = this;
            if (FragmentManager.J0(2)) {
                object32 = new StringBuilder();
                ((StringBuilder)object32).append("restoreSaveState: active (");
                ((StringBuilder)object32).append(((Fragment)object4).f);
                ((StringBuilder)object32).append("): ");
                ((StringBuilder)object32).append(object4);
                Log.v((String)"FragmentManager", (String)((StringBuilder)object32).toString());
            }
            ((r)object).o(this.v.f().getClassLoader());
            this.c.r((r)object);
            ((r)object).t(this.u);
            n11 = n12;
        }
        object = this.P.m().iterator();
        while (object.hasNext()) {
            object2 = (Fragment)object.next();
            if (this.c.c(((Fragment)object2).f)) continue;
            if (FragmentManager.J0(2)) {
                object32 = new StringBuilder();
                ((StringBuilder)object32).append("Discarding retained Fragment ");
                ((StringBuilder)object32).append(object2);
                ((StringBuilder)object32).append(" that was not found in the set of active Fragments ");
                ((StringBuilder)object32).append(n8.q);
                Log.v((String)"FragmentManager", (String)((StringBuilder)object32).toString());
            }
            this.P.p((Fragment)object2);
            ((Fragment)object2).t = this;
            object32 = new r(this.n, this.c, (Fragment)object2);
            ((r)object32).t(1);
            ((r)object32).m();
            ((Fragment)object2).m = true;
            ((r)object32).m();
        }
        this.c.w(n8.c0);
        if (n8.d0 != null) {
            this.d = new ArrayList(n8.d0.length);
            for (n11 = 0; n11 < ((Object)(object = n8.d0)).length; ++n11) {
                object = ((b)object[n11]).b(this);
                if (FragmentManager.J0(2)) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("restoreAllState: back stack #");
                    ((StringBuilder)object2).append(n11);
                    ((StringBuilder)object2).append(" (index ");
                    ((StringBuilder)object2).append(((a)object).v);
                    ((StringBuilder)object2).append("): ");
                    ((StringBuilder)object2).append(object);
                    Log.v((String)"FragmentManager", (String)((StringBuilder)object2).toString());
                    object2 = new PrintWriter(new y("FragmentManager"));
                    ((a)object).z("  ", (PrintWriter)object2, false);
                    ((PrintWriter)object2).close();
                }
                this.d.add((a)object);
            }
        } else {
            this.d = null;
        }
        this.i.set(n8.e0);
        object = n8.f0;
        if (object != null) {
            this.y = object = this.h0((String)object);
            this.N((Fragment)object);
        }
        if ((object = n8.g0) != null) {
            for (n11 = n10; n11 < ((ArrayList)object).size(); ++n11) {
                this.j.put((String)((ArrayList)object).get(n11), n8.h0.get(n11));
            }
        }
        this.G = new ArrayDeque<k>(n8.i0);
    }

    Fragment h0(String string) {
        return this.c.f(string);
    }

    void i(a a8) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(a8);
    }

    /*
     * WARNING - void declaration
     */
    Bundle i1() {
        Bundle bundle = new Bundle();
        this.o0();
        this.Z();
        this.c0(true);
        this.I = true;
        this.P.q(true);
        Serializable serializable = this.c.y();
        ArrayList<p> arrayList = this.c.m();
        if (arrayList.isEmpty()) {
            if (FragmentManager.J0(2)) {
                Log.v((String)"FragmentManager", (String)"saveAllState: no fragments!");
                return bundle;
            }
        } else {
            Object var4_11;
            int n8;
            Object object;
            int n9;
            ArrayList<String> arrayList2 = this.c.z();
            ArrayList<a> object22 = this.d;
            int n10 = 0;
            if (object22 != null && (n9 = object22.size()) > 0) {
                object = new b[n9];
                n8 = 0;
                while (true) {
                    b[] bArray = object;
                    if (n8 < n9) {
                        object[n8] = new b(this.d.get(n8));
                        if (FragmentManager.J0(2)) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("saveAllState: adding back stack #");
                            stringBuilder.append(n8);
                            stringBuilder.append(": ");
                            stringBuilder.append(this.d.get(n8));
                            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                        }
                        ++n8;
                        continue;
                    }
                    break;
                }
            } else {
                Object var4_10 = null;
            }
            object = new androidx.fragment.app.n();
            ((androidx.fragment.app.n)object).q = serializable;
            ((androidx.fragment.app.n)object).c0 = arrayList2;
            ((androidx.fragment.app.n)object).d0 = var4_11;
            ((androidx.fragment.app.n)object).e0 = this.i.get();
            Fragment fragment = this.y;
            if (fragment != null) {
                ((androidx.fragment.app.n)object).f0 = fragment.f;
            }
            ((androidx.fragment.app.n)object).g0.addAll(this.j.keySet());
            ((androidx.fragment.app.n)object).h0.addAll(this.j.values());
            ((androidx.fragment.app.n)object).i0 = new ArrayList<k>(this.G);
            bundle.putParcelable("state", (Parcelable)object);
            for (String string : this.k.keySet()) {
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append("result_");
                ((StringBuilder)serializable).append(string);
                bundle.putBundle(((StringBuilder)serializable).toString(), this.k.get(string));
            }
            n9 = arrayList.size();
            for (n8 = n10; n8 < n9; ++n8) {
                p p9 = arrayList.get(n8);
                p9 = p9;
                serializable = new Bundle();
                serializable.putParcelable("state", p9);
                object = new StringBuilder();
                ((StringBuilder)object).append("fragment_");
                ((StringBuilder)object).append(p9.c0);
                bundle.putBundle(((StringBuilder)object).toString(), (Bundle)serializable);
            }
        }
        return bundle;
    }

    r j(Fragment fragment) {
        Object object = fragment.R;
        if (object != null) {
            ax.B0.c.f(fragment, (String)object);
        }
        if (FragmentManager.J0(2)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("add: ");
            ((StringBuilder)object).append(fragment);
            Log.v((String)"FragmentManager", (String)((StringBuilder)object).toString());
        }
        object = this.x(fragment);
        fragment.t = this;
        this.c.r((r)object);
        if (!fragment.B) {
            this.c.a(fragment);
            fragment.m = false;
            if (fragment.I == null) {
                fragment.O = false;
            }
            if (this.K0(fragment)) {
                this.H = true;
            }
        }
        return object;
    }

    public Fragment j0(int n8) {
        return this.c.g(n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void j1() {
        ArrayList<n> arrayList = this.a;
        synchronized (arrayList) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.a.size() != 1) break block3;
                        this.v.g().removeCallbacks(this.R);
                        this.v.g().post(this.R);
                        this.t1();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public void k(ax.A0.k k8) {
        this.o.add(k8);
    }

    public Fragment k0(String string) {
        return this.c.h(string);
    }

    void k1(Fragment fragment, boolean bl) {
        if ((fragment = this.t0(fragment)) != null && fragment instanceof FragmentContainerView) {
            ((FragmentContainerView)((Object)fragment)).setDrawDisappearingViewsLast(bl ^ true);
        }
    }

    int l() {
        return this.i.getAndIncrement();
    }

    Fragment l0(String string) {
        return this.c.i(string);
    }

    public final void l1(String string, Bundle bundle) {
        Object object = this.l.get(string);
        if (object != null && ((l)object).b(d.b.e0)) {
            ((l)object).a(string, bundle);
        } else {
            this.k.put(string, bundle);
        }
        if (FragmentManager.J0(2)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Setting fragment result with key ");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(" and result ");
            ((StringBuilder)object).append(bundle);
            Log.v((String)"FragmentManager", (String)((StringBuilder)object).toString());
        }
    }

    @SuppressLint(value={"SyntheticAccessor"})
    void m(androidx.fragment.app.j<?> j8, e object, Fragment fragment) {
        if (this.v == null) {
            Object object2;
            this.v = j8;
            this.w = object;
            this.x = fragment;
            if (fragment != null) {
                this.k(new ax.A0.k(this, fragment){
                    final Fragment a;
                    final FragmentManager b;
                    {
                        this.b = fragmentManager;
                        this.a = fragment;
                    }

                    @Override
                    public void a(FragmentManager fragmentManager, Fragment fragment) {
                        this.a.l1(fragment);
                    }
                });
            } else if (j8 instanceof ax.A0.k) {
                this.k((ax.A0.k)((Object)j8));
            }
            if (this.x != null) {
                this.t1();
            }
            if (j8 instanceof u) {
                object = (u)((Object)j8);
                object2 = object.getOnBackPressedDispatcher();
                this.g = object2;
                if (fragment != null) {
                    object = fragment;
                }
                ((OnBackPressedDispatcher)object2).h((ax.G0.h)object, this.h);
            }
            this.P = fragment != null ? fragment.t.r0(fragment) : (j8 instanceof v ? androidx.fragment.app.o.l(((v)((Object)j8)).getViewModelStore()) : new androidx.fragment.app.o(false));
            this.P.q(this.Q0());
            this.c.A(this.P);
            j8 = this.v;
            if (j8 instanceof ax.n2.d && fragment == null) {
                j8 = ((ax.n2.d)((Object)j8)).getSavedStateRegistry();
                ((androidx.savedstate.a)((Object)j8)).h("android:support:fragments", new ax.A0.j(this));
                j8 = ((androidx.savedstate.a)((Object)j8)).b("android:support:fragments");
                if (j8 != null) {
                    this.g1((Parcelable)j8);
                }
            }
            if ((j8 = this.v) instanceof ax.k.f) {
                object = ((ax.k.f)((Object)j8)).getActivityResultRegistry();
                if (fragment != null) {
                    j8 = new StringBuilder();
                    ((StringBuilder)((Object)j8)).append(fragment.f);
                    ((StringBuilder)((Object)j8)).append(":");
                    j8 = ((StringBuilder)((Object)j8)).toString();
                } else {
                    j8 = "";
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("FragmentManager:");
                ((StringBuilder)object2).append((String)((Object)j8));
                j8 = ((StringBuilder)object2).toString();
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)((Object)j8));
                ((StringBuilder)object2).append("StartActivityForResult");
                this.D = ((ax.k.e)object).m(((StringBuilder)object2).toString(), new ax.l.c(), new ax.k.b<ax.k.a>(this){
                    final FragmentManager a;
                    {
                        this.a = fragmentManager;
                    }

                    public void b(ax.k.a object) {
                        Object object2 = this.a.G.pollFirst();
                        if (object2 == null) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("No Activities were started for result for ");
                            ((StringBuilder)object).append(this);
                            Log.w((String)"FragmentManager", (String)((StringBuilder)object).toString());
                            return;
                        }
                        String string = ((k)object2).q;
                        int n8 = ((k)object2).c0;
                        object2 = this.a.c.i(string);
                        if (object2 == null) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Activity result delivered for unknown Fragment ");
                            ((StringBuilder)object).append(string);
                            Log.w((String)"FragmentManager", (String)((StringBuilder)object).toString());
                            return;
                        }
                        ((Fragment)object2).i1(n8, ((ax.k.a)object).b(), ((ax.k.a)object).a());
                    }
                });
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)((Object)j8));
                ((StringBuilder)object2).append("StartIntentSenderForResult");
                this.E = ((ax.k.e)object).m(((StringBuilder)object2).toString(), new j(), new ax.k.b<ax.k.a>(this){
                    final FragmentManager a;
                    {
                        this.a = fragmentManager;
                    }

                    public void b(ax.k.a object) {
                        Object object2 = this.a.G.pollFirst();
                        if (object2 == null) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("No IntentSenders were started for ");
                            ((StringBuilder)object).append(this);
                            Log.w((String)"FragmentManager", (String)((StringBuilder)object).toString());
                            return;
                        }
                        String string = ((k)object2).q;
                        int n8 = ((k)object2).c0;
                        object2 = this.a.c.i(string);
                        if (object2 == null) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Intent Sender result delivered for unknown Fragment ");
                            ((StringBuilder)object).append(string);
                            Log.w((String)"FragmentManager", (String)((StringBuilder)object).toString());
                            return;
                        }
                        ((Fragment)object2).i1(n8, ((ax.k.a)object).b(), ((ax.k.a)object).a());
                    }
                });
                object2 = new StringBuilder();
                ((StringBuilder)object2).append((String)((Object)j8));
                ((StringBuilder)object2).append("RequestPermissions");
                this.F = ((ax.k.e)object).m(((StringBuilder)object2).toString(), new ax.l.b(), new ax.k.b<Map<String, Boolean>>(this){
                    final FragmentManager a;
                    {
                        this.a = fragmentManager;
                    }

                    @SuppressLint(value={"SyntheticAccessor"})
                    public void b(Map<String, Boolean> object) {
                        int n8;
                        Object object2 = object.keySet().toArray(new String[0]);
                        object = new ArrayList<Boolean>(object.values());
                        int[] nArray = new int[((ArrayList)object).size()];
                        for (n8 = 0; n8 < ((ArrayList)object).size(); ++n8) {
                            int n9 = (Boolean)((ArrayList)object).get(n8) != false ? 0 : -1;
                            nArray[n8] = n9;
                        }
                        Object object3 = this.a.G.pollFirst();
                        if (object3 == null) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("No permissions were requested for ");
                            ((StringBuilder)object).append(this);
                            Log.w((String)"FragmentManager", (String)((StringBuilder)object).toString());
                            return;
                        }
                        object = ((k)object3).q;
                        n8 = ((k)object3).c0;
                        object3 = this.a.c.i((String)object);
                        if (object3 == null) {
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("Permission request result delivered for unknown Fragment ");
                            ((StringBuilder)object2).append((String)object);
                            Log.w((String)"FragmentManager", (String)((StringBuilder)object2).toString());
                            return;
                        }
                        ((Fragment)object3).onRequestPermissionsResult(n8, (String[])object2, nArray);
                    }
                });
            }
            if ((j8 = this.v) instanceof ax.Q.e) {
                ((ax.Q.e)((Object)j8)).addOnConfigurationChangedListener(this.p);
            }
            if ((j8 = this.v) instanceof ax.Q.f) {
                ((ax.Q.f)((Object)j8)).addOnTrimMemoryListener(this.q);
            }
            if ((j8 = this.v) instanceof q) {
                ((q)((Object)j8)).addOnMultiWindowModeChangedListener(this.r);
            }
            if ((j8 = this.v) instanceof ax.P.r) {
                ((ax.P.r)((Object)j8)).addOnPictureInPictureModeChangedListener(this.s);
            }
            if ((j8 = this.v) instanceof w && fragment == null) {
                ((w)((Object)j8)).addMenuProvider(this.t);
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    @SuppressLint(value={"SyntheticAccessor"})
    public final void m1(String string, ax.G0.h object, ax.A0.l l8) {
        if (((androidx.lifecycle.d)(object = object.getLifecycle())).b() == d.b.q) {
            return;
        }
        androidx.lifecycle.f f8 = new androidx.lifecycle.f(this, string, l8, (androidx.lifecycle.d)object){
            final ax.A0.l c0;
            final androidx.lifecycle.d d0;
            final FragmentManager e0;
            final String q;
            {
                this.e0 = fragmentManager;
                this.q = string;
                this.c0 = l8;
                this.d0 = d8;
            }

            @Override
            public void b(ax.G0.h h8, d.a a8) {
                if (a8 == d.a.ON_START && (h8 = (Bundle)this.e0.k.get(this.q)) != null) {
                    this.c0.a(this.q, (Bundle)h8);
                    this.e0.t(this.q);
                }
                if (a8 == d.a.ON_DESTROY) {
                    this.d0.c(this);
                    this.e0.l.remove(this.q);
                }
            }
        };
        Object object2 = this.l.put(string, new l((androidx.lifecycle.d)object, l8, f8));
        if (object2 != null) {
            ((l)object2).c();
        }
        if (FragmentManager.J0(2)) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Setting FragmentResultListener with key ");
            ((StringBuilder)object2).append(string);
            ((StringBuilder)object2).append(" lifecycleOwner ");
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(" and listener ");
            ((StringBuilder)object2).append(l8);
            Log.v((String)"FragmentManager", (String)((StringBuilder)object2).toString());
        }
        ((androidx.lifecycle.d)object).a(f8);
    }

    void n(Fragment fragment) {
        StringBuilder stringBuilder;
        if (FragmentManager.J0(2)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("attach: ");
            stringBuilder.append(fragment);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        if (fragment.B) {
            fragment.B = false;
            if (!fragment.l) {
                this.c.a(fragment);
                if (FragmentManager.J0(2)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("add from attach: ");
                    stringBuilder.append(fragment);
                    Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                }
                if (this.K0(fragment)) {
                    this.H = true;
                }
            }
        }
    }

    void n1(Fragment fragment, d.b object) {
        if (fragment.equals(this.h0(fragment.f)) && (fragment.u == null || fragment.t == this)) {
            fragment.S = object;
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Fragment ");
        ((StringBuilder)object).append(fragment);
        ((StringBuilder)object).append(" is not an active fragment of FragmentManager ");
        ((StringBuilder)object).append(this);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public t o() {
        return new a(this);
    }

    void o1(Fragment fragment) {
        if (fragment != null && (!fragment.equals(this.h0(fragment.f)) || fragment.u != null && fragment.t != this)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(fragment);
            stringBuilder.append(" is not an active fragment of FragmentManager ");
            stringBuilder.append(this);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        Fragment fragment2 = this.y;
        this.y = fragment;
        this.N(fragment2);
        this.N(this.y);
    }

    boolean p() {
        Iterator<Fragment> iterator = this.c.l().iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            Fragment fragment = iterator.next();
            boolean bl2 = bl;
            if (fragment != null) {
                bl2 = this.K0(fragment);
            }
            bl = bl2;
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public int q0() {
        ArrayList<a> arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void q1(Fragment fragment) {
        if (FragmentManager.J0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("show: ");
            stringBuilder.append(fragment);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        if (fragment.A) {
            fragment.A = false;
            fragment.O ^= true;
        }
    }

    e s0() {
        return this.w;
    }

    public final void t(String string) {
        this.k.remove(string);
        if (FragmentManager.J0(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Clearing fragment result with key ");
            stringBuilder.append(string);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        androidx.fragment.app.j<?> j8 = this.x;
        if (j8 != null) {
            stringBuilder.append(j8.getClass().getSimpleName());
            stringBuilder.append("{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this.x)));
            stringBuilder.append("}");
        } else {
            j8 = this.v;
            if (j8 != null) {
                stringBuilder.append(j8.getClass().getSimpleName());
                stringBuilder.append("{");
                stringBuilder.append(Integer.toHexString(System.identityHashCode(this.v)));
                stringBuilder.append("}");
            } else {
                stringBuilder.append("null");
            }
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public final void u(String string) {
        Object object = this.l.remove(string);
        if (object != null) {
            ((l)object).c();
        }
        if (FragmentManager.J0(2)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Clearing FragmentResultListener for key ");
            ((StringBuilder)object).append(string);
            Log.v((String)"FragmentManager", (String)((StringBuilder)object).toString());
        }
    }

    public i u0() {
        Object object = this.z;
        if (object != null) {
            return object;
        }
        object = this.x;
        if (object != null) {
            return ((Fragment)object).t.u0();
        }
        return this.A;
    }

    public List<Fragment> v0() {
        return this.c.o();
    }

    public androidx.fragment.app.j<?> w0() {
        return this.v;
    }

    r x(Fragment object) {
        r r8 = this.c.n(((Fragment)object).f);
        if (r8 != null) {
            return r8;
        }
        object = new r(this.n, this.c, (Fragment)object);
        ((r)object).o(this.v.f().getClassLoader());
        ((r)object).t(this.u);
        return object;
    }

    LayoutInflater.Factory2 x0() {
        return this.f;
    }

    void y(Fragment fragment) {
        StringBuilder stringBuilder;
        if (FragmentManager.J0(2)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("detach: ");
            stringBuilder.append(fragment);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        if (!fragment.B) {
            fragment.B = true;
            if (fragment.l) {
                if (FragmentManager.J0(2)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("remove from detach: ");
                    stringBuilder.append(fragment);
                    Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                }
                this.c.u(fragment);
                if (this.K0(fragment)) {
                    this.H = true;
                }
                this.p1(fragment);
            }
        }
    }

    androidx.fragment.app.l y0() {
        return this.n;
    }

    void z() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        this.U(4);
    }

    Fragment z0() {
        return this.x;
    }

    static class j
    extends ax.l.a<ax.k.g, ax.k.a> {
        j() {
        }

        public Intent d(Context object, ax.k.g g8) {
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = g8.a();
            object = g8;
            if (intent2 != null) {
                Bundle bundle = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                object = g8;
                if (bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    object = g8;
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        object = new g.a(g8.d()).b(null).c(g8.c(), g8.b()).a();
                    }
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (Parcelable)object);
            if (FragmentManager.J0(2)) {
                object = new StringBuilder();
                ((StringBuilder)object).append("CreateIntent created the following intent: ");
                ((StringBuilder)object).append(intent);
                Log.v((String)"FragmentManager", (String)((StringBuilder)object).toString());
            }
            return intent;
        }

        public ax.k.a e(int n8, Intent intent) {
            return new ax.k.a(n8, intent);
        }
    }

    @SuppressLint(value={"BanParcelableUsage"})
    static class k
    implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new Parcelable.Creator<k>(){

            public k a(Parcel parcel) {
                return new k(parcel);
            }

            public k[] b(int n8) {
                return new k[n8];
            }
        };
        int c0;
        String q;

        k(Parcel parcel) {
            this.q = parcel.readString();
            this.c0 = parcel.readInt();
        }

        k(String string, int n8) {
            this.q = string;
            this.c0 = n8;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int n8) {
            parcel.writeString(this.q);
            parcel.writeInt(this.c0);
        }
    }

    private static class l
    implements ax.A0.l {
        private final androidx.lifecycle.d a;
        private final ax.A0.l b;
        private final androidx.lifecycle.f c;

        l(androidx.lifecycle.d d8, ax.A0.l l8, androidx.lifecycle.f f8) {
            this.a = d8;
            this.b = l8;
            this.c = f8;
        }

        @Override
        public void a(String string, Bundle bundle) {
            this.b.a(string, bundle);
        }

        public boolean b(d.b b8) {
            return this.a.b().h(b8);
        }

        public void c() {
            this.a.c(this.c);
        }
    }

    public static interface m {
        public void a();
    }

    static interface n {
        public boolean a(ArrayList<a> var1, ArrayList<Boolean> var2);
    }

    private class o
    implements n {
        final String a;
        final int b;
        final int c;
        final FragmentManager d;

        o(FragmentManager fragmentManager, String string, int n8, int n9) {
            this.d = fragmentManager;
            this.a = string;
            this.b = n8;
            this.c = n9;
        }

        @Override
        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = this.d.y;
            if (fragment != null && this.b < 0 && this.a == null && fragment.k0().Z0()) {
                return false;
            }
            return this.d.c1(arrayList, arrayList2, this.a, this.b, this.c);
        }
    }
}

