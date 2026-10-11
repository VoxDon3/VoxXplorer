package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import ax.Y.d;
import ax.c0.C1760d0;
import ax.z0.C3536b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
abstract class z {
    private final ViewGroup a;
    final ArrayList<e> b = new ArrayList<>();
    final ArrayList<e> c = new ArrayList<>();
    boolean d = false;
    boolean e = false;

    class a implements Runnable {
        final /* synthetic */ d q;

        a(d dVar) {
            this.q = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (z.this.b.contains(this.q)) {
                this.q.e().d(this.q.f().I);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ d q;

        b(d dVar) {
            this.q = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.b.remove(this.q);
            z.this.c.remove(this.q);
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[e.b.values().length];
            b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static class d extends e {
        private final r h;

        d(e.c cVar, e.b bVar, r rVar, ax.Y.d dVar) {
            super(cVar, bVar, rVar.k(), dVar);
            this.h = rVar;
        }

        @Override // androidx.fragment.app.z.e
        public void c() {
            super.c();
            this.h.m();
        }

        @Override // androidx.fragment.app.z.e
        void l() {
            if (g() != e.b.ADDING) {
                if (g() == e.b.REMOVING) {
                    Fragment k = this.h.k();
                    View q2 = k.q2();
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "Clearing focus " + q2.findFocus() + " on view " + q2 + " for Fragment " + k);
                    }
                    q2.clearFocus();
                    return;
                }
                return;
            }
            Fragment k2 = this.h.k();
            View findFocus = k2.I.findFocus();
            if (findFocus != null) {
                k2.w2(findFocus);
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k2);
                }
            }
            View q22 = f().q2();
            if (q22.getParent() == null) {
                this.h.b();
                q22.setAlpha(0.0f);
            }
            if (q22.getAlpha() == 0.0f && q22.getVisibility() == 0) {
                q22.setVisibility(4);
            }
            q22.setAlpha(k2.E0());
        }
    }

    static class e {
        private c a;
        private b b;
        private final Fragment c;
        private final List<Runnable> d = new ArrayList();
        private final HashSet<ax.Y.d> e = new HashSet<>();
        private boolean f = false;
        private boolean g = false;

        class a implements d.a {
            a() {
            }

            @Override // ax.Y.d.a
            public void a() {
                e.this.b();
            }
        }

        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static c h(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i);
            }

            static c j(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : h(view.getVisibility());
            }

            void d(View view) {
                int i = c.a[ordinal()];
                if (i == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i == 3) {
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i != 4) {
                    return;
                }
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        e(c cVar, b bVar, Fragment fragment, ax.Y.d dVar) {
            this.a = cVar;
            this.b = bVar;
            this.c = fragment;
            dVar.c(new a());
        }

        final void a(Runnable runnable) {
            this.d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f = true;
            if (this.e.isEmpty()) {
                c();
                return;
            }
            ArrayList arrayList = new ArrayList(this.e);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((ax.Y.d) obj).a();
            }
        }

        public void c() {
            if (this.g) {
                return;
            }
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            Iterator<Runnable> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        public final void d(ax.Y.d dVar) {
            if (this.e.remove(dVar) && this.e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.a;
        }

        public final Fragment f() {
            return this.c;
        }

        b g() {
            return this.b;
        }

        final boolean h() {
            return this.f;
        }

        final boolean i() {
            return this.g;
        }

        public final void j(ax.Y.d dVar) {
            l();
            this.e.add(dVar);
        }

        final void k(c cVar, b bVar) {
            int i = c.b[bVar.ordinal()];
            if (i == 1) {
                if (this.a == c.REMOVED) {
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                    }
                    this.a = c.VISIBLE;
                    this.b = b.ADDING;
                    return;
                }
                return;
            }
            if (i == 2) {
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
                }
                this.a = c.REMOVED;
                this.b = b.REMOVING;
                return;
            }
            if (i == 3 && this.a != c.REMOVED) {
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.c + " mFinalState = " + this.a + " -> " + cVar + ". ");
                }
                this.a = cVar;
            }
        }

        void l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.a + "} {mLifecycleImpact = " + this.b + "} {mFragment = " + this.c + "}";
        }
    }

    z(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, r rVar) {
        synchronized (this.b) {
            try {
                ax.Y.d dVar = new ax.Y.d();
                e h = h(rVar.k());
                if (h != null) {
                    h.k(cVar, bVar);
                    return;
                }
                d dVar2 = new d(cVar, bVar, rVar, dVar);
                this.b.add(dVar2);
                dVar2.a(new a(dVar2));
                dVar2.a(new b(dVar2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private e h(Fragment fragment) {
        ArrayList<e> arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            e eVar = arrayList.get(i);
            i++;
            e eVar2 = eVar;
            if (eVar2.f().equals(fragment) && !eVar2.h()) {
                return eVar2;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        ArrayList<e> arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            e eVar = arrayList.get(i);
            i++;
            e eVar2 = eVar;
            if (eVar2.f().equals(fragment) && !eVar2.h()) {
                return eVar2;
            }
        }
        return null;
    }

    static z n(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return o(viewGroup, fragmentManager.B0());
    }

    static z o(ViewGroup viewGroup, A a2) {
        int i = C3536b.b;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof z) {
            return (z) tag;
        }
        z a3 = a2.a(viewGroup);
        viewGroup.setTag(i, a3);
        return a3;
    }

    private void q() {
        ArrayList<e> arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            e eVar = arrayList.get(i);
            i++;
            e eVar2 = eVar;
            if (eVar2.g() == e.b.ADDING) {
                eVar2.k(e.c.h(eVar2.f().q2().getVisibility()), e.b.NONE);
            }
        }
    }

    void b(e.c cVar, r rVar) {
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + rVar.k());
        }
        a(cVar, e.b.ADDING, rVar);
    }

    void c(r rVar) {
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + rVar.k());
        }
        a(e.c.GONE, e.b.NONE, rVar);
    }

    void d(r rVar) {
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + rVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, rVar);
    }

    void e(r rVar) {
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + rVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, rVar);
    }

    abstract void f(List<e> list, boolean z);

    void g() {
        if (this.e) {
            return;
        }
        if (!C1760d0.Q(this.a)) {
            j();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.c);
                    this.c.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        e eVar = (e) obj;
                        if (FragmentManager.J0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((e) obj2).l();
                    }
                    f(arrayList2, this.d);
                    this.d = false;
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void j() {
        String str;
        String str2;
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean Q = C1760d0.Q(this.a);
        synchronized (this.b) {
            try {
                q();
                ArrayList<e> arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    e eVar = arrayList.get(i2);
                    i2++;
                    eVar.l();
                }
                ArrayList arrayList2 = new ArrayList(this.c);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    e eVar2 = (e) obj;
                    if (FragmentManager.J0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (Q) {
                            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(eVar2);
                        Log.v("FragmentManager", sb.toString());
                    }
                    eVar2.b();
                }
                ArrayList arrayList3 = new ArrayList(this.b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj2 = arrayList3.get(i);
                    i++;
                    e eVar3 = (e) obj2;
                    if (FragmentManager.J0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (Q) {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(eVar3);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    eVar3.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void k() {
        if (this.e) {
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.e = false;
            g();
        }
    }

    e.b l(r rVar) {
        e h = h(rVar.k());
        e.b g = h != null ? h.g() : null;
        e i = i(rVar.k());
        return (i == null || !(g == null || g == e.b.NONE)) ? g : i.g();
    }

    public ViewGroup m() {
        return this.a;
    }

    void p() {
        synchronized (this.b) {
            try {
                q();
                this.e = false;
                int size = this.b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    e eVar = this.b.get(size);
                    e.c j = e.c.j(eVar.f().I);
                    e.c e2 = eVar.e();
                    e.c cVar = e.c.VISIBLE;
                    if (e2 == cVar && j != cVar) {
                        this.e = eVar.f().c1();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void r(boolean z) {
        this.d = z;
    }
}
