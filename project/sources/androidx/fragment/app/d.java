package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.g;
import androidx.fragment.app.z;
import ax.Y.d;
import ax.b0.C1446g;
import ax.c0.C1760d0;
import ax.c0.C1770i0;
import ax.c0.L;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class d extends z {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[z.e.c.values().length];
            a = iArr;
            try {
                iArr[z.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[z.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[z.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[z.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ z.e c0;
        final /* synthetic */ List q;

        b(List list, z.e eVar) {
            this.q = list;
            this.c0 = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.q.contains(this.c0)) {
                this.q.remove(this.c0);
                d.this.s(this.c0);
            }
        }
    }

    class c extends AnimatorListenerAdapter {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ View b;
        final /* synthetic */ boolean c;
        final /* synthetic */ z.e d;
        final /* synthetic */ k e;

        c(ViewGroup viewGroup, View view, boolean z, z.e eVar, k kVar) {
            this.a = viewGroup;
            this.b = view;
            this.c = z;
            this.d = eVar;
            this.e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            if (this.c) {
                this.d.e().d(this.b);
            }
            this.e.a();
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.d + " has ended.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    class C0017d implements d.a {
        final /* synthetic */ Animator a;
        final /* synthetic */ z.e b;

        C0017d(Animator animator, z.e eVar) {
            this.a = animator;
            this.b = eVar;
        }

        @Override // ax.Y.d.a
        public void a() {
            this.a.end();
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.b + " has been canceled.");
            }
        }
    }

    class e implements Animation.AnimationListener {
        final /* synthetic */ z.e a;
        final /* synthetic */ ViewGroup b;
        final /* synthetic */ View c;
        final /* synthetic */ k d;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.b.endViewTransition(eVar.c);
                e.this.d.a();
            }
        }

        e(z.e eVar, ViewGroup viewGroup, View view, k kVar) {
            this.a = eVar;
            this.b = viewGroup;
            this.c = view;
            this.d = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.b.post(new a());
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
            }
        }
    }

    class f implements d.a {
        final /* synthetic */ View a;
        final /* synthetic */ ViewGroup b;
        final /* synthetic */ k c;
        final /* synthetic */ z.e d;

        f(View view, ViewGroup viewGroup, k kVar, z.e eVar) {
            this.a = view;
            this.b = viewGroup;
            this.c = kVar;
            this.d = eVar;
        }

        @Override // ax.Y.d.a
        public void a() {
            this.a.clearAnimation();
            this.b.endViewTransition(this.a);
            this.c.a();
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.d + " has been cancelled.");
            }
        }
    }

    class g implements Runnable {
        final /* synthetic */ z.e c0;
        final /* synthetic */ boolean d0;
        final /* synthetic */ ax.B.a e0;
        final /* synthetic */ z.e q;

        g(z.e eVar, z.e eVar2, boolean z, ax.B.a aVar) {
            this.q = eVar;
            this.c0 = eVar2;
            this.d0 = z;
            this.e0 = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            u.a(this.q.f(), this.c0.f(), this.d0, this.e0, false);
        }
    }

    class h implements Runnable {
        final /* synthetic */ View c0;
        final /* synthetic */ Rect d0;
        final /* synthetic */ w q;

        h(w wVar, View view, Rect rect) {
            this.q = wVar;
            this.c0 = view;
            this.d0 = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.h(this.c0, this.d0);
        }
    }

    class i implements Runnable {
        final /* synthetic */ ArrayList q;

        i(ArrayList arrayList) {
            this.q = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            u.d(this.q, 4);
        }
    }

    class j implements Runnable {
        final /* synthetic */ z.e c0;
        final /* synthetic */ m q;

        j(m mVar, z.e eVar) {
            this.q = mVar;
            this.c0 = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.a();
            if (FragmentManager.J0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.c0 + "has completed");
            }
        }
    }

    private static class k extends l {
        private boolean c;
        private boolean d;
        private g.a e;

        k(z.e eVar, ax.Y.d dVar, boolean z) {
            super(eVar, dVar);
            this.d = false;
            this.c = z;
        }

        g.a e(Context context) {
            if (this.d) {
                return this.e;
            }
            g.a b = androidx.fragment.app.g.b(context, b().f(), b().e() == z.e.c.VISIBLE, this.c);
            this.e = b;
            this.d = true;
            return b;
        }
    }

    private static class l {
        private final z.e a;
        private final ax.Y.d b;

        l(z.e eVar, ax.Y.d dVar) {
            this.a = eVar;
            this.b = dVar;
        }

        void a() {
            this.a.d(this.b);
        }

        z.e b() {
            return this.a;
        }

        ax.Y.d c() {
            return this.b;
        }

        boolean d() {
            z.e.c j = z.e.c.j(this.a.f().I);
            z.e.c e = this.a.e();
            if (j == e) {
                return true;
            }
            z.e.c cVar = z.e.c.VISIBLE;
            return (j == cVar || e == cVar) ? false : true;
        }
    }

    private static class m extends l {
        private final Object c;
        private final boolean d;
        private final Object e;

        m(z.e eVar, ax.Y.d dVar, boolean z, boolean z2) {
            super(eVar, dVar);
            if (eVar.e() == z.e.c.VISIBLE) {
                this.c = z ? eVar.f().F0() : eVar.f().m0();
                this.d = z ? eVar.f().h0() : eVar.f().g0();
            } else {
                this.c = z ? eVar.f().H0() : eVar.f().p0();
                this.d = true;
            }
            if (!z2) {
                this.e = null;
            } else if (z) {
                this.e = eVar.f().J0();
            } else {
                this.e = eVar.f().I0();
            }
        }

        private w f(Object obj) {
            if (obj == null) {
                return null;
            }
            w wVar = u.a;
            if (wVar != null && wVar.e(obj)) {
                return wVar;
            }
            w wVar2 = u.b;
            if (wVar2 != null && wVar2.e(obj)) {
                return wVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        w e() {
            w f = f(this.c);
            w f2 = f(this.e);
            if (f == null || f2 == null || f == f2) {
                return f != null ? f : f2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.c + " which uses a different Transition  type than its shared element transition " + this.e);
        }

        public Object g() {
            return this.e;
        }

        Object h() {
            return this.c;
        }

        public boolean i() {
            return this.e != null;
        }

        boolean j() {
            return this.d;
        }
    }

    d(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List<k> list, List<z.e> list2, boolean z, Map<z.e, Boolean> map) {
        z.e eVar;
        k kVar;
        View view;
        ViewGroup m2 = m();
        Context context = m2.getContext();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z2 = false;
        for (k kVar2 : list) {
            if (kVar2.d()) {
                kVar2.a();
            } else {
                g.a e2 = kVar2.e(context);
                if (e2 == null) {
                    kVar2.a();
                } else {
                    Animator animator = e2.b;
                    if (animator == null) {
                        arrayList.add(kVar2);
                    } else {
                        z.e b2 = kVar2.b();
                        Fragment f2 = b2.f();
                        if (Boolean.TRUE.equals(map.get(b2))) {
                            if (FragmentManager.J0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + f2 + " as this Fragment was involved in a Transition.");
                            }
                            kVar2.a();
                        } else {
                            boolean z3 = b2.e() == z.e.c.GONE;
                            if (z3) {
                                list2.remove(b2);
                            }
                            View view2 = f2.I;
                            m2.startViewTransition(view2);
                            ViewGroup viewGroup = m2;
                            m2 = viewGroup;
                            animator.addListener(new c(viewGroup, view2, z3, b2, kVar2));
                            animator.setTarget(view2);
                            animator.start();
                            if (FragmentManager.J0(2)) {
                                Log.v("FragmentManager", "Animator from operation " + b2 + " has started.");
                            }
                            kVar2.c().c(new C0017d(animator, b2));
                            z2 = true;
                        }
                    }
                }
            }
        }
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            k kVar3 = (k) obj;
            z.e b3 = kVar3.b();
            Fragment f3 = b3.f();
            if (z) {
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f3 + " as Animations cannot run alongside Transitions.");
                }
                kVar3.a();
            } else if (z2) {
                if (FragmentManager.J0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f3 + " as Animations cannot run alongside Animators.");
                }
                kVar3.a();
            } else {
                View view3 = f3.I;
                Animation animation = (Animation) C1446g.g(((g.a) C1446g.g(kVar3.e(context))).a);
                if (b3.e() != z.e.c.REMOVED) {
                    view3.startAnimation(animation);
                    kVar3.a();
                    eVar = b3;
                    kVar = kVar3;
                    view = view3;
                } else {
                    m2.startViewTransition(view3);
                    g.b bVar = new g.b(animation, m2, view3);
                    eVar = b3;
                    kVar = kVar3;
                    view = view3;
                    bVar.setAnimationListener(new e(eVar, m2, view, kVar));
                    view.startAnimation(bVar);
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + eVar + " has started.");
                    }
                }
                kVar.c().c(new f(view, m2, kVar, eVar));
            }
        }
    }

    private Map<z.e, Boolean> x(List<m> list, List<z.e> list2, boolean z, z.e eVar, z.e eVar2) {
        String str;
        ArrayList<View> arrayList;
        String str2;
        ArrayList<View> arrayList2;
        ArrayList arrayList3;
        ArrayList<View> arrayList4;
        Object obj;
        Rect rect;
        String str3;
        View view;
        View view2;
        Object obj2;
        Object obj3;
        z.e eVar3;
        View view3;
        Rect rect2;
        ArrayList<View> arrayList5;
        ax.B.a aVar;
        View view4;
        ArrayList<View> arrayList6;
        int i2;
        View view5;
        boolean z2 = z;
        HashMap hashMap = new HashMap();
        w wVar = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                w e2 = mVar.e();
                if (wVar == null) {
                    wVar = e2;
                } else if (e2 != null && wVar != e2) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (wVar == null) {
            for (m mVar2 : list) {
                hashMap.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
        } else {
            View view6 = new View(m().getContext());
            Rect rect3 = new Rect();
            ArrayList<View> arrayList7 = new ArrayList<>();
            ArrayList<View> arrayList8 = new ArrayList<>();
            ax.B.a aVar2 = new ax.B.a();
            Iterator<m> it = list.iterator();
            Object obj4 = null;
            View view7 = null;
            boolean z3 = false;
            while (true) {
                str = "FragmentManager";
                if (!it.hasNext()) {
                    break;
                }
                m next = it.next();
                if (!next.i() || eVar == null || eVar2 == null) {
                    view3 = view6;
                    rect2 = rect3;
                    arrayList5 = arrayList7;
                    aVar = aVar2;
                    view4 = view7;
                    arrayList6 = arrayList8;
                } else {
                    Object u = wVar.u(wVar.f(next.g()));
                    ArrayList<String> K0 = eVar2.f().K0();
                    ArrayList<String> K02 = eVar.f().K0();
                    ArrayList<String> L0 = eVar.f().L0();
                    int i3 = 0;
                    while (i3 < L0.size()) {
                        int indexOf = K0.indexOf(L0.get(i3));
                        ArrayList<String> arrayList9 = L0;
                        if (indexOf != -1) {
                            K0.set(indexOf, K02.get(i3));
                        }
                        i3++;
                        L0 = arrayList9;
                    }
                    ArrayList<String> L02 = eVar2.f().L0();
                    if (z2) {
                        eVar.f().n0();
                        eVar2.f().q0();
                    } else {
                        eVar.f().q0();
                        eVar2.f().n0();
                    }
                    int i4 = 0;
                    for (int size = K0.size(); i4 < size; size = size) {
                        aVar2.put(K0.get(i4), L02.get(i4));
                        i4++;
                    }
                    if (FragmentManager.J0(2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        int i5 = 0;
                        for (int size2 = L02.size(); i5 < size2; size2 = size2) {
                            String str4 = L02.get(i5);
                            Log.v("FragmentManager", "Name: " + str4);
                            i5++;
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        int i6 = 0;
                        for (int size3 = K0.size(); i6 < size3; size3 = size3) {
                            String str5 = K0.get(i6);
                            Log.v("FragmentManager", "Name: " + str5);
                            i6++;
                        }
                    }
                    ax.B.a<String, View> aVar3 = new ax.B.a<>();
                    u(aVar3, eVar.f().I);
                    aVar3.o(K0);
                    aVar2.o(aVar3.keySet());
                    ax.B.a<String, View> aVar4 = new ax.B.a<>();
                    u(aVar4, eVar2.f().I);
                    aVar4.o(L02);
                    aVar4.o(aVar2.values());
                    u.c(aVar2, aVar4);
                    v(aVar3, aVar2.keySet());
                    v(aVar4, aVar2.values());
                    if (aVar2.isEmpty()) {
                        arrayList7.clear();
                        arrayList8.clear();
                        view3 = view6;
                        rect2 = rect3;
                        arrayList5 = arrayList7;
                        aVar = aVar2;
                        arrayList6 = arrayList8;
                        obj4 = null;
                        z2 = z;
                        arrayList7 = arrayList5;
                        arrayList8 = arrayList6;
                        aVar2 = aVar;
                        rect3 = rect2;
                        view6 = view3;
                    } else {
                        aVar = aVar2;
                        u.a(eVar2.f(), eVar.f(), z2, aVar3, true);
                        view4 = view7;
                        L.a(m(), new g(eVar2, eVar, z2, aVar4));
                        arrayList7.addAll(aVar3.values());
                        if (K0.isEmpty()) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                            View view8 = aVar3.get(K0.get(0));
                            wVar.p(u, view8);
                            view4 = view8;
                        }
                        arrayList8.addAll(aVar4.values());
                        if (!L02.isEmpty() && (view5 = aVar4.get(L02.get(i2))) != null) {
                            L.a(m(), new h(wVar, view5, rect3));
                            z3 = true;
                        }
                        wVar.s(u, view6, arrayList7);
                        rect2 = rect3;
                        ArrayList<View> arrayList10 = arrayList7;
                        view3 = view6;
                        wVar.n(u, null, null, null, null, u, arrayList8);
                        arrayList6 = arrayList8;
                        Boolean bool = Boolean.TRUE;
                        hashMap.put(eVar, bool);
                        hashMap.put(eVar2, bool);
                        arrayList5 = arrayList10;
                        obj4 = u;
                    }
                }
                view7 = view4;
                z2 = z;
                arrayList7 = arrayList5;
                arrayList8 = arrayList6;
                aVar2 = aVar;
                rect3 = rect2;
                view6 = view3;
            }
            z.e eVar4 = eVar;
            z.e eVar5 = eVar2;
            View view9 = view6;
            ArrayList<View> arrayList11 = arrayList7;
            ax.B.a aVar5 = aVar2;
            View view10 = view7;
            Rect rect4 = rect3;
            ArrayList<View> arrayList12 = arrayList8;
            ArrayList arrayList13 = new ArrayList();
            Object obj5 = null;
            Object obj6 = null;
            for (m mVar3 : list) {
                if (mVar3.d()) {
                    hashMap.put(mVar3.b(), Boolean.FALSE);
                    mVar3.a();
                } else {
                    Object f2 = wVar.f(mVar3.h());
                    z.e b2 = mVar3.b();
                    boolean z4 = obj4 != null && (b2 == eVar4 || b2 == eVar5);
                    if (f2 == null) {
                        if (!z4) {
                            hashMap.put(b2, Boolean.FALSE);
                            mVar3.a();
                        }
                        str3 = str;
                        view = view9;
                        arrayList4 = arrayList11;
                        arrayList2 = arrayList12;
                        rect = rect4;
                        arrayList3 = arrayList13;
                        view2 = view10;
                    } else {
                        Rect rect5 = rect4;
                        ArrayList<View> arrayList14 = new ArrayList<>();
                        ArrayList arrayList15 = arrayList13;
                        t(arrayList14, b2.f().I);
                        if (z4) {
                            if (b2 == eVar4) {
                                arrayList14.removeAll(arrayList11);
                            } else {
                                arrayList14.removeAll(arrayList12);
                            }
                        }
                        if (arrayList14.isEmpty()) {
                            wVar.a(f2, view9);
                            str3 = str;
                            view = view9;
                            arrayList2 = arrayList12;
                            obj3 = obj5;
                            obj2 = obj6;
                            eVar3 = b2;
                            view2 = view10;
                            arrayList3 = arrayList15;
                            arrayList4 = arrayList11;
                            obj = f2;
                            rect = rect5;
                        } else {
                            wVar.b(f2, arrayList14);
                            arrayList2 = arrayList12;
                            String str6 = str;
                            arrayList3 = arrayList15;
                            arrayList4 = arrayList11;
                            obj = f2;
                            rect = rect5;
                            str3 = str6;
                            view = view9;
                            view2 = view10;
                            obj2 = obj6;
                            obj3 = obj5;
                            wVar.n(obj, f2, arrayList14, null, null, null, null);
                            if (b2.e() == z.e.c.GONE) {
                                eVar3 = b2;
                                list2.remove(eVar3);
                                ArrayList<View> arrayList16 = new ArrayList<>(arrayList14);
                                arrayList16.remove(eVar3.f().I);
                                wVar.m(obj, eVar3.f().I, arrayList16);
                                L.a(m(), new i(arrayList14));
                            } else {
                                eVar3 = b2;
                            }
                        }
                        if (eVar3.e() == z.e.c.VISIBLE) {
                            arrayList3.addAll(arrayList14);
                            if (z3) {
                                wVar.o(obj, rect);
                            }
                        } else {
                            wVar.p(obj, view2);
                        }
                        hashMap.put(eVar3, Boolean.TRUE);
                        if (mVar3.j()) {
                            obj3 = wVar.k(obj3, obj, null);
                        } else {
                            obj2 = wVar.k(obj2, obj, null);
                        }
                        obj5 = obj3;
                        obj6 = obj2;
                    }
                    arrayList11 = arrayList4;
                    eVar4 = eVar;
                    eVar5 = eVar2;
                    rect4 = rect;
                    arrayList13 = arrayList3;
                    view10 = view2;
                    view9 = view;
                    str = str3;
                    arrayList12 = arrayList2;
                }
            }
            String str7 = str;
            ArrayList<View> arrayList17 = arrayList11;
            ArrayList<View> arrayList18 = arrayList12;
            ArrayList arrayList19 = arrayList13;
            Object j2 = wVar.j(obj5, obj6, obj4);
            if (j2 != null) {
                for (m mVar4 : list) {
                    if (!mVar4.d()) {
                        Object h2 = mVar4.h();
                        z.e b3 = mVar4.b();
                        boolean z5 = obj4 != null && (b3 == eVar || b3 == eVar2);
                        if (h2 == null && !z5) {
                            str2 = str7;
                        } else if (C1760d0.R(m())) {
                            str2 = str7;
                            wVar.q(mVar4.b().f(), j2, mVar4.c(), new j(mVar4, b3));
                        } else {
                            if (FragmentManager.J0(2)) {
                                str2 = str7;
                                Log.v(str2, "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + b3);
                            } else {
                                str2 = str7;
                            }
                            mVar4.a();
                        }
                        str7 = str2;
                    }
                }
                String str8 = str7;
                if (C1760d0.R(m())) {
                    u.d(arrayList19, 4);
                    ArrayList<String> l2 = wVar.l(arrayList18);
                    if (FragmentManager.J0(2)) {
                        Log.v(str8, ">>>>> Beginning transition <<<<<");
                        Log.v(str8, ">>>>> SharedElementFirstOutViews <<<<<");
                        int size4 = arrayList17.size();
                        int i7 = 0;
                        while (i7 < size4) {
                            View view11 = arrayList17.get(i7);
                            i7++;
                            View view12 = view11;
                            Log.v(str8, "View: " + view12 + " Name: " + C1760d0.I(view12));
                        }
                        arrayList = arrayList17;
                        Log.v(str8, ">>>>> SharedElementLastInViews <<<<<");
                        int size5 = arrayList18.size();
                        int i8 = 0;
                        while (i8 < size5) {
                            View view13 = arrayList18.get(i8);
                            i8++;
                            View view14 = view13;
                            Log.v(str8, "View: " + view14 + " Name: " + C1760d0.I(view14));
                        }
                    } else {
                        arrayList = arrayList17;
                    }
                    wVar.c(m(), j2);
                    ArrayList<View> arrayList20 = arrayList;
                    wVar.r(m(), arrayList20, arrayList18, l2, aVar5);
                    u.d(arrayList19, 0);
                    wVar.t(obj4, arrayList20, arrayList18);
                    return hashMap;
                }
            }
        }
        return hashMap;
    }

    private void y(List<z.e> list) {
        Fragment f2 = list.get(list.size() - 1).f();
        for (z.e eVar : list) {
            eVar.f().L.c = f2.L.c;
            eVar.f().L.d = f2.L.d;
            eVar.f().L.e = f2.L.e;
            eVar.f().L.f = f2.L.f;
        }
    }

    @Override // androidx.fragment.app.z
    void f(List<z.e> list, boolean z) {
        int i2;
        z.e eVar = null;
        z.e eVar2 = null;
        for (z.e eVar3 : list) {
            z.e.c j2 = z.e.c.j(eVar3.f().I);
            int i3 = a.a[eVar3.e().ordinal()];
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                if (j2 == z.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i3 == 4 && j2 != z.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Executing operations from " + eVar + " to " + eVar2);
        }
        List<k> arrayList = new ArrayList<>();
        List<m> arrayList2 = new ArrayList<>();
        ArrayList arrayList3 = new ArrayList(list);
        y(list);
        Iterator<z.e> it = list.iterator();
        while (true) {
            i2 = 0;
            r11 = false;
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            z.e next = it.next();
            ax.Y.d dVar = new ax.Y.d();
            next.j(dVar);
            arrayList.add(new k(next, dVar, z));
            ax.Y.d dVar2 = new ax.Y.d();
            next.j(dVar2);
            if (z) {
                if (next != eVar) {
                    arrayList2.add(new m(next, dVar2, z, z2));
                    next.a(new b(arrayList3, next));
                }
                z2 = true;
                arrayList2.add(new m(next, dVar2, z, z2));
                next.a(new b(arrayList3, next));
            } else {
                if (next != eVar2) {
                    arrayList2.add(new m(next, dVar2, z, z2));
                    next.a(new b(arrayList3, next));
                }
                z2 = true;
                arrayList2.add(new m(next, dVar2, z, z2));
                next.a(new b(arrayList3, next));
            }
        }
        Map<z.e, Boolean> x = x(arrayList2, arrayList3, z, eVar, eVar2);
        w(arrayList, arrayList3, x.containsValue(Boolean.TRUE), x);
        int size = arrayList3.size();
        while (i2 < size) {
            Object obj = arrayList3.get(i2);
            i2++;
            s((z.e) obj);
        }
        arrayList3.clear();
        if (FragmentManager.J0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + eVar + " to " + eVar2);
        }
    }

    void s(z.e eVar) {
        eVar.e().d(eVar.f().I);
    }

    void t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (C1770i0.b(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    void u(Map<String, View> map, View view) {
        String I = C1760d0.I(view);
        if (I != null) {
            map.put(I, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(ax.B.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C1760d0.I(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
