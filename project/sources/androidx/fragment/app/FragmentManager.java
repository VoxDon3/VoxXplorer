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
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.t;
import androidx.lifecycle.d;
import androidx.savedstate.a;
import ax.B0.c;
import ax.P.t;
import ax.b0.InterfaceC1440a;
import ax.c0.InterfaceC1752B;
import ax.c0.InterfaceC1796w;
import ax.k.AbstractC2352c;
import ax.k.AbstractC2354e;
import ax.k.C2350a;
import ax.k.C2356g;
import ax.k.InterfaceC2351b;
import ax.k.InterfaceC2355f;
import ax.l.AbstractC2438a;
import ax.l.C2439b;
import ax.l.C2440c;
import ax.n2.InterfaceC2576d;
import ax.z0.C3536b;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
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
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class FragmentManager {
    private static boolean S = false;
    private AbstractC2352c<Intent> D;
    private AbstractC2352c<C2356g> E;
    private AbstractC2352c<String[]> F;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private ArrayList<C0585a> M;
    private ArrayList<Boolean> N;
    private ArrayList<Fragment> O;
    private androidx.fragment.app.o P;
    private c.C0053c Q;
    private boolean b;
    ArrayList<C0585a> d;
    private ArrayList<Fragment> e;
    private OnBackPressedDispatcher g;
    private ArrayList<m> m;
    private androidx.fragment.app.j<?> v;
    private ax.A0.e w;
    private Fragment x;
    Fragment y;
    private final ArrayList<n> a = new ArrayList<>();
    private final s c = new s();
    private final androidx.fragment.app.k f = new androidx.fragment.app.k(this);
    private final ax.i.r h = new b(false);
    private final AtomicInteger i = new AtomicInteger();
    private final Map<String, androidx.fragment.app.c> j = DesugarCollections.synchronizedMap(new HashMap());
    private final Map<String, Bundle> k = DesugarCollections.synchronizedMap(new HashMap());
    private final Map<String, l> l = DesugarCollections.synchronizedMap(new HashMap());
    private final androidx.fragment.app.l n = new androidx.fragment.app.l(this);
    private final CopyOnWriteArrayList<ax.A0.k> o = new CopyOnWriteArrayList<>();
    private final InterfaceC1440a<Configuration> p = new InterfaceC1440a() { // from class: ax.A0.f
        @Override // ax.b0.InterfaceC1440a
        public final void accept(Object obj) {
            FragmentManager.e(FragmentManager.this, (Configuration) obj);
        }
    };
    private final InterfaceC1440a<Integer> q = new InterfaceC1440a() { // from class: ax.A0.g
        @Override // ax.b0.InterfaceC1440a
        public final void accept(Object obj) {
            FragmentManager.a(FragmentManager.this, (Integer) obj);
        }
    };
    private final InterfaceC1440a<ax.P.i> r = new InterfaceC1440a() { // from class: ax.A0.h
        @Override // ax.b0.InterfaceC1440a
        public final void accept(Object obj) {
            FragmentManager.d(FragmentManager.this, (ax.P.i) obj);
        }
    };
    private final InterfaceC1440a<ax.P.t> s = new InterfaceC1440a() { // from class: ax.A0.i
        @Override // ax.b0.InterfaceC1440a
        public final void accept(Object obj) {
            FragmentManager.c(FragmentManager.this, (t) obj);
        }
    };
    private final InterfaceC1752B t = new c();
    int u = -1;
    private androidx.fragment.app.i z = null;
    private androidx.fragment.app.i A = new d();
    private A B = null;
    private A C = new e();
    ArrayDeque<k> G = new ArrayDeque<>();
    private Runnable R = new f();

    class a implements InterfaceC2351b<Map<String, Boolean>> {
        a() {
        }

        @Override // ax.k.InterfaceC2351b
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            k pollFirst = FragmentManager.this.G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.q;
            int i2 = pollFirst.c0;
            Fragment i3 = FragmentManager.this.c.i(str);
            if (i3 != null) {
                i3.onRequestPermissionsResult(i2, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    class b extends ax.i.r {
        b(boolean z) {
            super(z);
        }

        @Override // ax.i.r
        public void d() {
            FragmentManager.this.F0();
        }
    }

    class c implements InterfaceC1752B {
        c() {
        }

        @Override // ax.c0.InterfaceC1752B
        public boolean a(MenuItem menuItem) {
            return FragmentManager.this.L(menuItem);
        }

        @Override // ax.c0.InterfaceC1752B
        public void b(Menu menu) {
            FragmentManager.this.M(menu);
        }

        @Override // ax.c0.InterfaceC1752B
        public void c(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.E(menu, menuInflater);
        }

        @Override // ax.c0.InterfaceC1752B
        public void d(Menu menu) {
            FragmentManager.this.Q(menu);
        }
    }

    class d extends androidx.fragment.app.i {
        d() {
        }

        @Override // androidx.fragment.app.i
        public Fragment a(ClassLoader classLoader, String str) {
            return FragmentManager.this.w0().b(FragmentManager.this.w0().f(), str, null);
        }
    }

    class e implements A {
        e() {
        }

        @Override // androidx.fragment.app.A
        public z a(ViewGroup viewGroup) {
            return new androidx.fragment.app.d(viewGroup);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.c0(true);
        }
    }

    class g implements ax.A0.k {
        final /* synthetic */ Fragment a;

        g(Fragment fragment) {
            this.a = fragment;
        }

        @Override // ax.A0.k
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.a.l1(fragment);
        }
    }

    class h implements InterfaceC2351b<C2350a> {
        h() {
        }

        @Override // ax.k.InterfaceC2351b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2350a c2350a) {
            k pollFirst = FragmentManager.this.G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.q;
            int i = pollFirst.c0;
            Fragment i2 = FragmentManager.this.c.i(str);
            if (i2 != null) {
                i2.i1(i, c2350a.b(), c2350a.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    class i implements InterfaceC2351b<C2350a> {
        i() {
        }

        @Override // ax.k.InterfaceC2351b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C2350a c2350a) {
            k pollFirst = FragmentManager.this.G.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.q;
            int i = pollFirst.c0;
            Fragment i2 = FragmentManager.this.c.i(str);
            if (i2 != null) {
                i2.i1(i, c2350a.b(), c2350a.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    static class j extends AbstractC2438a<C2356g, C2350a> {
        j() {
        }

        @Override // ax.l.AbstractC2438a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, C2356g c2356g) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a = c2356g.a();
            if (a != null && (bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    c2356g = new C2356g.a(c2356g.d()).b(null).c(c2356g.c(), c2356g.b()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c2356g);
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // ax.l.AbstractC2438a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public C2350a c(int i, Intent intent) {
            return new C2350a(i, intent);
        }
    }

    private static class l implements ax.A0.l {
        private final androidx.lifecycle.d a;
        private final ax.A0.l b;
        private final androidx.lifecycle.f c;

        l(androidx.lifecycle.d dVar, ax.A0.l lVar, androidx.lifecycle.f fVar) {
            this.a = dVar;
            this.b = lVar;
            this.c = fVar;
        }

        @Override // ax.A0.l
        public void a(String str, Bundle bundle) {
            this.b.a(str, bundle);
        }

        public boolean b(d.b bVar) {
            return this.a.b().h(bVar);
        }

        public void c() {
            this.a.c(this.c);
        }
    }

    public interface m {
        void a();
    }

    interface n {
        boolean a(ArrayList<C0585a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class o implements n {
        final String a;
        final int b;
        final int c;

        o(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public boolean a(ArrayList<C0585a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.y;
            if (fragment == null || this.b >= 0 || this.a != null || !fragment.k0().Z0()) {
                return FragmentManager.this.c1(arrayList, arrayList2, this.a, this.b, this.c);
            }
            return false;
        }
    }

    static Fragment D0(View view) {
        Object tag = view.getTag(C3536b.a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean J0(int i2) {
        return S || Log.isLoggable("FragmentManager", i2);
    }

    private boolean K0(Fragment fragment) {
        return (fragment.E && fragment.F) || fragment.v.p();
    }

    private boolean L0() {
        Fragment fragment = this.x;
        if (fragment == null) {
            return true;
        }
        return fragment.X0() && this.x.A0().L0();
    }

    private void N(Fragment fragment) {
        if (fragment == null || !fragment.equals(h0(fragment.f))) {
            return;
        }
        fragment.f2();
    }

    private void U(int i2) {
        try {
            this.b = true;
            this.c.d(i2);
            U0(i2, false);
            Iterator<z> it = v().iterator();
            while (it.hasNext()) {
                it.next().j();
            }
            this.b = false;
            c0(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    private void X() {
        if (this.L) {
            this.L = false;
            r1();
        }
    }

    private void Z() {
        Iterator<z> it = v().iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    public static /* synthetic */ void a(FragmentManager fragmentManager, Integer num) {
        if (fragmentManager.L0() && num.intValue() == 80) {
            fragmentManager.H(false);
        }
    }

    private void b0(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.v == null) {
            if (!this.K) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.v.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            q();
        }
        if (this.M == null) {
            this.M = new ArrayList<>();
            this.N = new ArrayList<>();
        }
    }

    private boolean b1(String str, int i2, int i3) {
        c0(false);
        b0(true);
        Fragment fragment = this.y;
        if (fragment != null && i2 < 0 && str == null && fragment.k0().Z0()) {
            return true;
        }
        boolean c1 = c1(this.M, this.N, str, i2, i3);
        if (c1) {
            this.b = true;
            try {
                e1(this.M, this.N);
            } finally {
                r();
            }
        }
        t1();
        X();
        this.c.b();
        return c1;
    }

    public static /* synthetic */ void c(FragmentManager fragmentManager, ax.P.t tVar) {
        if (fragmentManager.L0()) {
            fragmentManager.P(tVar.a(), false);
        }
    }

    public static /* synthetic */ void d(FragmentManager fragmentManager, ax.P.i iVar) {
        if (fragmentManager.L0()) {
            fragmentManager.I(iVar.a(), false);
        }
    }

    public static /* synthetic */ void e(FragmentManager fragmentManager, Configuration configuration) {
        if (fragmentManager.L0()) {
            fragmentManager.B(configuration, false);
        }
    }

    private static void e0(ArrayList<C0585a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            C0585a c0585a = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                c0585a.w(-1);
                c0585a.B();
            } else {
                c0585a.w(1);
                c0585a.A();
            }
            i2++;
        }
    }

    private void e1(ArrayList<C0585a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).r) {
                if (i3 != i2) {
                    f0(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).r) {
                        i3++;
                    }
                }
                f0(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            f0(arrayList, arrayList2, i3, size);
        }
    }

    private void f0(ArrayList<C0585a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        boolean z = arrayList.get(i2).r;
        ArrayList<Fragment> arrayList3 = this.O;
        if (arrayList3 == null) {
            this.O = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.O.addAll(this.c.o());
        Fragment A0 = A0();
        boolean z2 = false;
        for (int i4 = i2; i4 < i3; i4++) {
            C0585a c0585a = arrayList.get(i4);
            A0 = !arrayList2.get(i4).booleanValue() ? c0585a.C(this.O, A0) : c0585a.F(this.O, A0);
            z2 = z2 || c0585a.i;
        }
        this.O.clear();
        if (!z && this.u >= 1) {
            for (int i5 = i2; i5 < i3; i5++) {
                ArrayList<t.a> arrayList4 = arrayList.get(i5).c;
                int size = arrayList4.size();
                int i6 = 0;
                while (i6 < size) {
                    t.a aVar = arrayList4.get(i6);
                    i6++;
                    Fragment fragment = aVar.b;
                    if (fragment != null && fragment.t != null) {
                        this.c.r(x(fragment));
                    }
                }
            }
        }
        e0(arrayList, arrayList2, i2, i3);
        boolean booleanValue = arrayList2.get(i3 - 1).booleanValue();
        for (int i7 = i2; i7 < i3; i7++) {
            C0585a c0585a2 = arrayList.get(i7);
            if (booleanValue) {
                for (int size2 = c0585a2.c.size() - 1; size2 >= 0; size2--) {
                    Fragment fragment2 = c0585a2.c.get(size2).b;
                    if (fragment2 != null) {
                        x(fragment2).m();
                    }
                }
            } else {
                ArrayList<t.a> arrayList5 = c0585a2.c;
                int size3 = arrayList5.size();
                int i8 = 0;
                while (i8 < size3) {
                    t.a aVar2 = arrayList5.get(i8);
                    i8++;
                    Fragment fragment3 = aVar2.b;
                    if (fragment3 != null) {
                        x(fragment3).m();
                    }
                }
            }
        }
        U0(this.u, true);
        for (z zVar : w(arrayList, i2, i3)) {
            zVar.r(booleanValue);
            zVar.p();
            zVar.g();
        }
        while (i2 < i3) {
            C0585a c0585a3 = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue() && c0585a3.v >= 0) {
                c0585a3.v = -1;
            }
            c0585a3.E();
            i2++;
        }
        if (z2) {
            f1();
        }
    }

    private void f1() {
        if (this.m != null) {
            for (int i2 = 0; i2 < this.m.size(); i2++) {
                this.m.get(i2).a();
            }
        }
    }

    static int h1(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 == 8194) {
            return 4097;
        }
        if (i2 == 8197) {
            return 4100;
        }
        if (i2 != 4099) {
            return i2 != 4100 ? 0 : 8197;
        }
        return 4099;
    }

    private int i0(String str, int i2, boolean z) {
        ArrayList<C0585a> arrayList = this.d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i2 < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            C0585a c0585a = this.d.get(size);
            if ((str != null && str.equals(c0585a.D())) || (i2 >= 0 && i2 == c0585a.v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            C0585a c0585a2 = this.d.get(size - 1);
            if ((str == null || !str.equals(c0585a2.D())) && (i2 < 0 || i2 != c0585a2.v)) {
                break;
            }
            size--;
        }
        return size;
    }

    static FragmentManager m0(View view) {
        androidx.fragment.app.f fVar;
        Fragment n0 = n0(view);
        if (n0 != null) {
            if (n0.X0()) {
                return n0.k0();
            }
            throw new IllegalStateException("The Fragment " + n0 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                fVar = null;
                break;
            }
            if (context instanceof androidx.fragment.app.f) {
                fVar = (androidx.fragment.app.f) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (fVar != null) {
            return fVar.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    private static Fragment n0(View view) {
        while (view != null) {
            Fragment D0 = D0(view);
            if (D0 != null) {
                return D0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void o0() {
        Iterator<z> it = v().iterator();
        while (it.hasNext()) {
            it.next().k();
        }
    }

    private boolean p0(ArrayList<C0585a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return false;
            }
            try {
                int size = this.a.size();
                boolean z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    z |= this.a.get(i2).a(arrayList, arrayList2);
                }
                return z;
            } finally {
                this.a.clear();
                this.v.g().removeCallbacks(this.R);
            }
        }
    }

    private void p1(Fragment fragment) {
        ViewGroup t0 = t0(fragment);
        if (t0 == null || fragment.l0() + fragment.o0() + fragment.C0() + fragment.D0() <= 0) {
            return;
        }
        int i2 = C3536b.c;
        if (t0.getTag(i2) == null) {
            t0.setTag(i2, fragment);
        }
        ((Fragment) t0.getTag(i2)).A2(fragment.B0());
    }

    private void q() {
        if (Q0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
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
        Iterator<r> it = this.c.k().iterator();
        while (it.hasNext()) {
            X0(it.next());
        }
    }

    private void s() {
        androidx.fragment.app.j<?> jVar = this.v;
        if (jVar instanceof ax.G0.v ? this.c.p().o() : jVar.f() instanceof Activity ? !((Activity) this.v.f()).isChangingConfigurations() : true) {
            Iterator<androidx.fragment.app.c> it = this.j.values().iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = it.next().q.iterator();
                while (it2.hasNext()) {
                    this.c.p().h(it2.next());
                }
            }
        }
    }

    private void s1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new y("FragmentManager"));
        androidx.fragment.app.j<?> jVar = this.v;
        if (jVar != null) {
            try {
                jVar.h("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            Y("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    private ViewGroup t0(Fragment fragment) {
        ViewGroup viewGroup = fragment.H;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.y > 0 && this.w.d()) {
            View c2 = this.w.c(fragment.y);
            if (c2 instanceof ViewGroup) {
                return (ViewGroup) c2;
            }
        }
        return null;
    }

    private void t1() {
        synchronized (this.a) {
            try {
                if (this.a.isEmpty()) {
                    this.h.j(q0() > 0 && O0(this.x));
                } else {
                    this.h.j(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Set<z> v() {
        HashSet hashSet = new HashSet();
        Iterator<r> it = this.c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().H;
            if (viewGroup != null) {
                hashSet.add(z.o(viewGroup, B0()));
            }
        }
        return hashSet;
    }

    private Set<z> w(ArrayList<C0585a> arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            ArrayList<t.a> arrayList2 = arrayList.get(i2).c;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                t.a aVar = arrayList2.get(i4);
                i4++;
                Fragment fragment = aVar.b;
                if (fragment != null && (viewGroup = fragment.H) != null) {
                    hashSet.add(z.n(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    void A() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        U(0);
    }

    public Fragment A0() {
        return this.y;
    }

    void B(Configuration configuration, boolean z) {
        if (z && (this.v instanceof ax.Q.e)) {
            s1(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.P1(configuration);
                if (z) {
                    fragment.v.B(configuration, true);
                }
            }
        }
    }

    A B0() {
        A a2 = this.B;
        if (a2 != null) {
            return a2;
        }
        Fragment fragment = this.x;
        return fragment != null ? fragment.t.B0() : this.C;
    }

    boolean C(MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && fragment.Q1(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public c.C0053c C0() {
        return this.Q;
    }

    void D() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        U(1);
    }

    boolean E(Menu menu, MenuInflater menuInflater) {
        if (this.u < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && N0(fragment) && fragment.S1(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment2 = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.t1();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    androidx.lifecycle.r E0(Fragment fragment) {
        return this.P.n(fragment);
    }

    void F() {
        this.K = true;
        c0(true);
        Z();
        s();
        U(-1);
        Object obj = this.v;
        if (obj instanceof ax.Q.f) {
            ((ax.Q.f) obj).removeOnTrimMemoryListener(this.q);
        }
        Object obj2 = this.v;
        if (obj2 instanceof ax.Q.e) {
            ((ax.Q.e) obj2).removeOnConfigurationChangedListener(this.p);
        }
        Object obj3 = this.v;
        if (obj3 instanceof ax.P.q) {
            ((ax.P.q) obj3).removeOnMultiWindowModeChangedListener(this.r);
        }
        Object obj4 = this.v;
        if (obj4 instanceof ax.P.r) {
            ((ax.P.r) obj4).removeOnPictureInPictureModeChangedListener(this.s);
        }
        Object obj5 = this.v;
        if ((obj5 instanceof InterfaceC1796w) && this.x == null) {
            ((InterfaceC1796w) obj5).removeMenuProvider(this.t);
        }
        this.v = null;
        this.w = null;
        this.x = null;
        if (this.g != null) {
            this.h.h();
            this.g = null;
        }
        AbstractC2352c<Intent> abstractC2352c = this.D;
        if (abstractC2352c != null) {
            abstractC2352c.c();
            this.E.c();
            this.F.c();
        }
    }

    void F0() {
        c0(true);
        if (this.h.g()) {
            Z0();
        } else {
            this.g.k();
        }
    }

    void G() {
        U(1);
    }

    void G0(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.A) {
            return;
        }
        fragment.A = true;
        fragment.O = true ^ fragment.O;
        p1(fragment);
    }

    void H(boolean z) {
        if (z && (this.v instanceof ax.Q.f)) {
            s1(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.Y1();
                if (z) {
                    fragment.v.H(true);
                }
            }
        }
    }

    void H0(Fragment fragment) {
        if (fragment.l && K0(fragment)) {
            this.H = true;
        }
    }

    void I(boolean z, boolean z2) {
        if (z2 && (this.v instanceof ax.P.q)) {
            s1(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.Z1(z);
                if (z2) {
                    fragment.v.I(z, true);
                }
            }
        }
    }

    public boolean I0() {
        return this.K;
    }

    void J(Fragment fragment) {
        Iterator<ax.A0.k> it = this.o.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    void K() {
        for (Fragment fragment : this.c.l()) {
            if (fragment != null) {
                fragment.x1(fragment.Z0());
                fragment.v.K();
            }
        }
    }

    boolean L(MenuItem menuItem) {
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && fragment.a2(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void M(Menu menu) {
        if (this.u < 1) {
            return;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
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
        U(5);
    }

    boolean O0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.t;
        return fragment.equals(fragmentManager.A0()) && O0(fragmentManager.x);
    }

    void P(boolean z, boolean z2) {
        if (z2 && (this.v instanceof ax.P.r)) {
            s1(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.d2(z);
                if (z2) {
                    fragment.v.P(z, true);
                }
            }
        }
    }

    boolean P0(int i2) {
        return this.u >= i2;
    }

    boolean Q(Menu menu) {
        boolean z = false;
        if (this.u < 1) {
            return false;
        }
        for (Fragment fragment : this.c.o()) {
            if (fragment != null && N0(fragment) && fragment.e2(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean Q0() {
        return this.I || this.J;
    }

    void R() {
        t1();
        N(this.y);
    }

    void R0(Fragment fragment, String[] strArr, int i2) {
        if (this.F == null) {
            this.v.k(fragment, strArr, i2);
            return;
        }
        this.G.addLast(new k(fragment.f, i2));
        this.F.a(strArr);
    }

    void S() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        U(7);
    }

    void S0(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (this.D == null) {
            this.v.m(fragment, intent, i2, bundle);
            return;
        }
        this.G.addLast(new k(fragment.f, i2));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.D.a(intent);
    }

    void T() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        U(5);
    }

    void T0(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.E == null) {
            this.v.n(fragment, intentSender, i2, intent, i3, i4, i5, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (J0(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + fragment);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        C2356g a2 = new C2356g.a(intentSender).b(intent).c(i4, i3).a();
        this.G.addLast(new k(fragment.f, i2));
        if (J0(2)) {
            Log.v("FragmentManager", "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.E.a(a2);
    }

    void U0(int i2, boolean z) {
        androidx.fragment.app.j<?> jVar;
        if (this.v == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.u) {
            this.u = i2;
            this.c.t();
            r1();
            if (this.H && (jVar = this.v) != null && this.u == 7) {
                jVar.o();
                this.H = false;
            }
        }
    }

    void V() {
        this.J = true;
        this.P.q(true);
        U(4);
    }

    void V0() {
        if (this.v == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.q(false);
        for (Fragment fragment : this.c.o()) {
            if (fragment != null) {
                fragment.g1();
            }
        }
    }

    void W() {
        U(2);
    }

    void W0(FragmentContainerView fragmentContainerView) {
        View view;
        for (r rVar : this.c.k()) {
            Fragment k2 = rVar.k();
            if (k2.y == fragmentContainerView.getId() && (view = k2.I) != null && view.getParent() == null) {
                k2.H = fragmentContainerView;
                rVar.b();
            }
        }
    }

    void X0(r rVar) {
        Fragment k2 = rVar.k();
        if (k2.J) {
            if (this.b) {
                this.L = true;
            } else {
                k2.J = false;
                rVar.m();
            }
        }
    }

    public void Y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment = this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<C0585a> arrayList2 = this.d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0585a c0585a = this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0585a.toString());
                c0585a.y(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            try {
                int size3 = this.a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size3; i4++) {
                        n nVar = this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(nVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.w);
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.I);
        printWriter.print(" mStopped=");
        printWriter.print(this.J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.K);
        if (this.H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.H);
        }
    }

    void Y0(int i2, int i3, boolean z) {
        if (i2 >= 0) {
            a0(new o(null, i2, i3), z);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    public boolean Z0() {
        return b1(null, -1, 0);
    }

    void a0(n nVar, boolean z) {
        if (!z) {
            if (this.v == null) {
                if (!this.K) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            q();
        }
        synchronized (this.a) {
            try {
                if (this.v == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(nVar);
                    j1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a1(int i2, int i3) {
        if (i2 >= 0) {
            return b1(null, i2, i3);
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    boolean c0(boolean z) {
        b0(z);
        boolean z2 = false;
        while (p0(this.M, this.N)) {
            z2 = true;
            this.b = true;
            try {
                e1(this.M, this.N);
            } finally {
                r();
            }
        }
        t1();
        X();
        this.c.b();
        return z2;
    }

    boolean c1(ArrayList<C0585a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i0 = i0(str, i2, (i3 & 1) != 0);
        if (i0 < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= i0; size--) {
            arrayList.add(this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    void d0(n nVar, boolean z) {
        if (z && (this.v == null || this.K)) {
            return;
        }
        b0(z);
        if (nVar.a(this.M, this.N)) {
            this.b = true;
            try {
                e1(this.M, this.N);
            } finally {
                r();
            }
        }
        t1();
        X();
        this.c.b();
    }

    void d1(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.s);
        }
        boolean a1 = fragment.a1();
        if (fragment.B && a1) {
            return;
        }
        this.c.u(fragment);
        if (K0(fragment)) {
            this.H = true;
        }
        fragment.m = true;
        p1(fragment);
    }

    public boolean g0() {
        boolean c0 = c0(true);
        o0();
        return c0;
    }

    void g1(Parcelable parcelable) {
        r rVar;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.v.f().getClassLoader());
                this.k.put(str.substring(7), bundle2);
            }
        }
        ArrayList<p> arrayList = new ArrayList<>();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.v.f().getClassLoader());
                arrayList.add((p) bundle.getParcelable("state"));
            }
        }
        this.c.x(arrayList);
        androidx.fragment.app.n nVar = (androidx.fragment.app.n) bundle3.getParcelable("state");
        if (nVar == null) {
            return;
        }
        this.c.v();
        ArrayList<String> arrayList2 = nVar.q;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            String str3 = arrayList2.get(i2);
            i2++;
            p B = this.c.B(str3, null);
            if (B != null) {
                Fragment j2 = this.P.j(B.c0);
                if (j2 != null) {
                    if (J0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + j2);
                    }
                    rVar = new r(this.n, this.c, j2, B);
                } else {
                    rVar = new r(this.n, this.c, this.v.f().getClassLoader(), u0(), B);
                }
                Fragment k2 = rVar.k();
                k2.t = this;
                if (J0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k2.f + "): " + k2);
                }
                rVar.o(this.v.f().getClassLoader());
                this.c.r(rVar);
                rVar.t(this.u);
            }
        }
        for (Fragment fragment : this.P.m()) {
            if (!this.c.c(fragment.f)) {
                if (J0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + nVar.q);
                }
                this.P.p(fragment);
                fragment.t = this;
                r rVar2 = new r(this.n, this.c, fragment);
                rVar2.t(1);
                rVar2.m();
                fragment.m = true;
                rVar2.m();
            }
        }
        this.c.w(nVar.c0);
        if (nVar.d0 != null) {
            this.d = new ArrayList<>(nVar.d0.length);
            int i3 = 0;
            while (true) {
                C0586b[] c0586bArr = nVar.d0;
                if (i3 >= c0586bArr.length) {
                    break;
                }
                C0585a b2 = c0586bArr[i3].b(this);
                if (J0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + b2.v + "): " + b2);
                    PrintWriter printWriter = new PrintWriter(new y("FragmentManager"));
                    b2.z("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(b2);
                i3++;
            }
        } else {
            this.d = null;
        }
        this.i.set(nVar.e0);
        String str4 = nVar.f0;
        if (str4 != null) {
            Fragment h0 = h0(str4);
            this.y = h0;
            N(h0);
        }
        ArrayList<String> arrayList3 = nVar.g0;
        if (arrayList3 != null) {
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                this.j.put(arrayList3.get(i4), nVar.h0.get(i4));
            }
        }
        this.G = new ArrayDeque<>(nVar.i0);
    }

    Fragment h0(String str) {
        return this.c.f(str);
    }

    void i(C0585a c0585a) {
        if (this.d == null) {
            this.d = new ArrayList<>();
        }
        this.d.add(c0585a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle i1() {
        C0586b[] c0586bArr;
        int size;
        Bundle bundle = new Bundle();
        o0();
        Z();
        c0(true);
        this.I = true;
        this.P.q(true);
        ArrayList<String> y = this.c.y();
        ArrayList<p> m2 = this.c.m();
        if (!m2.isEmpty()) {
            ArrayList<String> z = this.c.z();
            ArrayList<C0585a> arrayList = this.d;
            int i2 = 0;
            if (arrayList == null || (size = arrayList.size()) <= 0) {
                c0586bArr = null;
            } else {
                c0586bArr = new C0586b[size];
                for (int i3 = 0; i3 < size; i3++) {
                    c0586bArr[i3] = new C0586b(this.d.get(i3));
                    if (J0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i3 + ": " + this.d.get(i3));
                    }
                }
            }
            androidx.fragment.app.n nVar = new androidx.fragment.app.n();
            nVar.q = y;
            nVar.c0 = z;
            nVar.d0 = c0586bArr;
            nVar.e0 = this.i.get();
            Fragment fragment = this.y;
            if (fragment != null) {
                nVar.f0 = fragment.f;
            }
            nVar.g0.addAll(this.j.keySet());
            nVar.h0.addAll(this.j.values());
            nVar.i0 = new ArrayList<>(this.G);
            bundle.putParcelable("state", nVar);
            for (String str : this.k.keySet()) {
                bundle.putBundle("result_" + str, this.k.get(str));
            }
            int size2 = m2.size();
            while (i2 < size2) {
                p pVar = m2.get(i2);
                i2++;
                p pVar2 = pVar;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("state", pVar2);
                bundle.putBundle("fragment_" + pVar2.c0, bundle2);
            }
        } else if (J0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    r j(Fragment fragment) {
        String str = fragment.R;
        if (str != null) {
            ax.B0.c.f(fragment, str);
        }
        if (J0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        r x = x(fragment);
        fragment.t = this;
        this.c.r(x);
        if (!fragment.B) {
            this.c.a(fragment);
            fragment.m = false;
            if (fragment.I == null) {
                fragment.O = false;
            }
            if (K0(fragment)) {
                this.H = true;
            }
        }
        return x;
    }

    public Fragment j0(int i2) {
        return this.c.g(i2);
    }

    void j1() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.v.g().removeCallbacks(this.R);
                    this.v.g().post(this.R);
                    t1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(ax.A0.k kVar) {
        this.o.add(kVar);
    }

    public Fragment k0(String str) {
        return this.c.h(str);
    }

    void k1(Fragment fragment, boolean z) {
        ViewGroup t0 = t0(fragment);
        if (t0 == null || !(t0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) t0).setDrawDisappearingViewsLast(!z);
    }

    int l() {
        return this.i.getAndIncrement();
    }

    Fragment l0(String str) {
        return this.c.i(str);
    }

    public final void l1(String str, Bundle bundle) {
        l lVar = this.l.get(str);
        if (lVar == null || !lVar.b(d.b.STARTED)) {
            this.k.put(str, bundle);
        } else {
            lVar.a(str, bundle);
        }
        if (J0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    void m(androidx.fragment.app.j<?> jVar, ax.A0.e eVar, Fragment fragment) {
        String str;
        if (this.v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.v = jVar;
        this.w = eVar;
        this.x = fragment;
        if (fragment != null) {
            k(new g(fragment));
        } else if (jVar instanceof ax.A0.k) {
            k((ax.A0.k) jVar);
        }
        if (this.x != null) {
            t1();
        }
        if (jVar instanceof ax.i.u) {
            ax.i.u uVar = (ax.i.u) jVar;
            OnBackPressedDispatcher onBackPressedDispatcher = uVar.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher;
            ax.G0.h hVar = uVar;
            if (fragment != null) {
                hVar = fragment;
            }
            onBackPressedDispatcher.h(hVar, this.h);
        }
        if (fragment != null) {
            this.P = fragment.t.r0(fragment);
        } else if (jVar instanceof ax.G0.v) {
            this.P = androidx.fragment.app.o.l(((ax.G0.v) jVar).getViewModelStore());
        } else {
            this.P = new androidx.fragment.app.o(false);
        }
        this.P.q(Q0());
        this.c.A(this.P);
        Object obj = this.v;
        if ((obj instanceof InterfaceC2576d) && fragment == null) {
            androidx.savedstate.a savedStateRegistry = ((InterfaceC2576d) obj).getSavedStateRegistry();
            savedStateRegistry.h("android:support:fragments", new a.c() { // from class: ax.A0.j
                @Override // androidx.savedstate.a.c
                public final Bundle a() {
                    Bundle i1;
                    i1 = FragmentManager.this.i1();
                    return i1;
                }
            });
            Bundle b2 = savedStateRegistry.b("android:support:fragments");
            if (b2 != null) {
                g1(b2);
            }
        }
        Object obj2 = this.v;
        if (obj2 instanceof InterfaceC2355f) {
            AbstractC2354e activityResultRegistry = ((InterfaceC2355f) obj2).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.f + ":";
            } else {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String str2 = "FragmentManager:" + str;
            this.D = activityResultRegistry.m(str2 + "StartActivityForResult", new C2440c(), new h());
            this.E = activityResultRegistry.m(str2 + "StartIntentSenderForResult", new j(), new i());
            this.F = activityResultRegistry.m(str2 + "RequestPermissions", new C2439b(), new a());
        }
        Object obj3 = this.v;
        if (obj3 instanceof ax.Q.e) {
            ((ax.Q.e) obj3).addOnConfigurationChangedListener(this.p);
        }
        Object obj4 = this.v;
        if (obj4 instanceof ax.Q.f) {
            ((ax.Q.f) obj4).addOnTrimMemoryListener(this.q);
        }
        Object obj5 = this.v;
        if (obj5 instanceof ax.P.q) {
            ((ax.P.q) obj5).addOnMultiWindowModeChangedListener(this.r);
        }
        Object obj6 = this.v;
        if (obj6 instanceof ax.P.r) {
            ((ax.P.r) obj6).addOnPictureInPictureModeChangedListener(this.s);
        }
        Object obj7 = this.v;
        if ((obj7 instanceof InterfaceC1796w) && fragment == null) {
            ((InterfaceC1796w) obj7).addMenuProvider(this.t);
        }
    }

    @SuppressLint({"SyntheticAccessor"})
    public final void m1(final String str, ax.G0.h hVar, final ax.A0.l lVar) {
        final androidx.lifecycle.d lifecycle = hVar.getLifecycle();
        if (lifecycle.b() == d.b.DESTROYED) {
            return;
        }
        androidx.lifecycle.f fVar = new androidx.lifecycle.f() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.lifecycle.f
            public void b(ax.G0.h hVar2, d.a aVar) {
                Bundle bundle;
                if (aVar == d.a.ON_START && (bundle = (Bundle) FragmentManager.this.k.get(str)) != null) {
                    lVar.a(str, bundle);
                    FragmentManager.this.t(str);
                }
                if (aVar == d.a.ON_DESTROY) {
                    lifecycle.c(this);
                    FragmentManager.this.l.remove(str);
                }
            }
        };
        l put = this.l.put(str, new l(lifecycle, lVar, fVar));
        if (put != null) {
            put.c();
        }
        if (J0(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + lifecycle + " and listener " + lVar);
        }
        lifecycle.a(fVar);
    }

    void n(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.B) {
            fragment.B = false;
            if (fragment.l) {
                return;
            }
            this.c.a(fragment);
            if (J0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (K0(fragment)) {
                this.H = true;
            }
        }
    }

    void n1(Fragment fragment, d.b bVar) {
        if (fragment.equals(h0(fragment.f)) && (fragment.u == null || fragment.t == this)) {
            fragment.S = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public t o() {
        return new C0585a(this);
    }

    void o1(Fragment fragment) {
        if (fragment == null || (fragment.equals(h0(fragment.f)) && (fragment.u == null || fragment.t == this))) {
            Fragment fragment2 = this.y;
            this.y = fragment;
            N(fragment2);
            N(this.y);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    boolean p() {
        boolean z = false;
        for (Fragment fragment : this.c.l()) {
            if (fragment != null) {
                z = K0(fragment);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public int q0() {
        ArrayList<C0585a> arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    void q1(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.A) {
            fragment.A = false;
            fragment.O = !fragment.O;
        }
    }

    ax.A0.e s0() {
        return this.w;
    }

    public final void t(String str) {
        this.k.remove(str);
        if (J0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.x;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.x)));
            sb.append("}");
        } else {
            androidx.fragment.app.j<?> jVar = this.v;
            if (jVar != null) {
                sb.append(jVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(String str) {
        l remove = this.l.remove(str);
        if (remove != null) {
            remove.c();
        }
        if (J0(2)) {
            Log.v("FragmentManager", "Clearing FragmentResultListener for key " + str);
        }
    }

    public androidx.fragment.app.i u0() {
        androidx.fragment.app.i iVar = this.z;
        if (iVar != null) {
            return iVar;
        }
        Fragment fragment = this.x;
        return fragment != null ? fragment.t.u0() : this.A;
    }

    public List<Fragment> v0() {
        return this.c.o();
    }

    public androidx.fragment.app.j<?> w0() {
        return this.v;
    }

    r x(Fragment fragment) {
        r n2 = this.c.n(fragment.f);
        if (n2 != null) {
            return n2;
        }
        r rVar = new r(this.n, this.c, fragment);
        rVar.o(this.v.f().getClassLoader());
        rVar.t(this.u);
        return rVar;
    }

    LayoutInflater.Factory2 x0() {
        return this.f;
    }

    void y(Fragment fragment) {
        if (J0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.B) {
            return;
        }
        fragment.B = true;
        if (fragment.l) {
            if (J0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.c.u(fragment);
            if (K0(fragment)) {
                this.H = true;
            }
            p1(fragment);
        }
    }

    androidx.fragment.app.l y0() {
        return this.n;
    }

    void z() {
        this.I = false;
        this.J = false;
        this.P.q(false);
        U(4);
    }

    Fragment z0() {
        return this.x;
    }

    @SuppressLint({"BanParcelableUsage"})
    static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();
        int c0;
        String q;

        class a implements Parcelable.Creator<k> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public k createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public k[] newArray(int i) {
                return new k[i];
            }
        }

        k(String str, int i) {
            this.q = str;
            this.c0 = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.q);
            parcel.writeInt(this.c0);
        }

        k(Parcel parcel) {
            this.q = parcel.readString();
            this.c0 = parcel.readInt();
        }
    }
}
