/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import androidx.fragment.app.u;
import androidx.fragment.app.w;
import androidx.fragment.app.z;
import ax.Y.d;
import ax.c0.L;
import ax.c0.d0;
import ax.c0.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class d
extends z {
    d(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List<k> viewGroup, List<z.e> object, boolean bl, Map<z.e, Boolean> object2) {
        Object object3 = this.m();
        Context context = object3.getContext();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object4 = viewGroup.iterator();
        int n8 = 0;
        boolean bl2 = false;
        viewGroup = object3;
        while (object4.hasNext()) {
            object3 = object4.next();
            if (((l)object3).d()) {
                ((l)object3).a();
                continue;
            }
            Object object5 = ((k)object3).e(context);
            if (object5 == null) {
                ((l)object3).a();
                continue;
            }
            Animator animator = ((g.a)object5).b;
            if (animator == null) {
                arrayList.add(object3);
                continue;
            }
            object5 = ((l)object3).b();
            Object object6 = ((z.e)object5).f();
            if (Boolean.TRUE.equals(object2.get(object5))) {
                if (FragmentManager.J0(2)) {
                    object5 = new StringBuilder();
                    ((StringBuilder)object5).append("Ignoring Animator set on ");
                    ((StringBuilder)object5).append(object6);
                    ((StringBuilder)object5).append(" as this Fragment was involved in a Transition.");
                    Log.v((String)"FragmentManager", (String)((StringBuilder)object5).toString());
                }
                ((l)object3).a();
                continue;
            }
            boolean bl3 = ((z.e)object5).e() == z.e.c.d0;
            if (bl3) {
                object.remove(object5);
            }
            View view = ((Fragment)object6).I;
            viewGroup.startViewTransition(view);
            object6 = new AnimatorListenerAdapter(this, viewGroup, view, bl3, (z.e)object5, (k)object3){
                final ViewGroup a;
                final View b;
                final boolean c;
                final z.e d;
                final k e;
                final d f;
                {
                    this.f = d8;
                    this.a = viewGroup;
                    this.b = view;
                    this.c = bl;
                    this.d = e8;
                    this.e = k8;
                }

                public void onAnimationEnd(Animator object) {
                    this.a.endViewTransition(this.b);
                    if (this.c) {
                        this.d.e().d(this.b);
                    }
                    this.e.a();
                    if (FragmentManager.J0(2)) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Animator from operation ");
                        ((StringBuilder)object).append(this.d);
                        ((StringBuilder)object).append(" has ended.");
                        Log.v((String)"FragmentManager", (String)((StringBuilder)object).toString());
                    }
                }
            };
            animator.addListener((Animator.AnimatorListener)object6);
            animator.setTarget((Object)view);
            animator.start();
            if (FragmentManager.J0(2)) {
                object6 = new StringBuilder();
                ((StringBuilder)object6).append("Animator from operation ");
                ((StringBuilder)object6).append(object5);
                ((StringBuilder)object6).append(" has started.");
                Log.v((String)"FragmentManager", (String)((StringBuilder)object6).toString());
            }
            ((l)object3).c().c(new d.a(this, animator, (z.e)object5){
                final Animator a;
                final z.e b;
                final d c;
                {
                    this.c = d8;
                    this.a = animator;
                    this.b = e8;
                }

                @Override
                public void a() {
                    this.a.end();
                    if (FragmentManager.J0(2)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Animator from operation ");
                        stringBuilder.append(this.b);
                        stringBuilder.append(" has been canceled.");
                        Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                    }
                }
            });
            bl2 = true;
        }
        int n9 = arrayList.size();
        while (n8 < n9) {
            object = arrayList.get(n8);
            ++n8;
            object = (k)object;
            object2 = ((l)object).b();
            object3 = ((z.e)object2).f();
            if (bl) {
                if (FragmentManager.J0(2)) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Ignoring Animation set on ");
                    ((StringBuilder)object2).append(object3);
                    ((StringBuilder)object2).append(" as Animations cannot run alongside Transitions.");
                    Log.v((String)"FragmentManager", (String)((StringBuilder)object2).toString());
                }
                ((l)object).a();
                continue;
            }
            if (bl2) {
                if (FragmentManager.J0(2)) {
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append("Ignoring Animation set on ");
                    ((StringBuilder)object2).append(object3);
                    ((StringBuilder)object2).append(" as Animations cannot run alongside Animators.");
                    Log.v((String)"FragmentManager", (String)((StringBuilder)object2).toString());
                }
                ((l)object).a();
                continue;
            }
            object3 = ((Fragment)object3).I;
            object4 = ax.b0.g.g(ax.b0.g.g(((k)object).e((Context)context)).a);
            if (((z.e)object2).e() != z.e.c.q) {
                object3.startAnimation((Animation)object4);
                ((l)object).a();
            } else {
                viewGroup.startViewTransition((View)object3);
                object4 = new g.b((Animation)object4, viewGroup, (View)object3);
                object4.setAnimationListener(new Animation.AnimationListener(this, (z.e)object2, viewGroup, (View)object3, (k)object){
                    final z.e a;
                    final ViewGroup b;
                    final View c;
                    final k d;
                    final d e;
                    {
                        this.e = d8;
                        this.a = e8;
                        this.b = viewGroup;
                        this.c = view;
                        this.d = k8;
                    }

                    public void onAnimationEnd(Animation object) {
                        this.b.post(new Runnable(this){
                            final e q;
                            {
                                this.q = e8;
                            }

                            @Override
                            public void run() {
                                e e8 = this.q;
                                e8.b.endViewTransition(e8.c);
                                this.q.d.a();
                            }
                        });
                        if (FragmentManager.J0(2)) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Animation from operation ");
                            ((StringBuilder)object).append(this.a);
                            ((StringBuilder)object).append(" has ended.");
                            Log.v((String)"FragmentManager", (String)((StringBuilder)object).toString());
                        }
                    }

                    public void onAnimationRepeat(Animation animation) {
                    }

                    public void onAnimationStart(Animation object) {
                        if (FragmentManager.J0(2)) {
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Animation from operation ");
                            ((StringBuilder)object).append(this.a);
                            ((StringBuilder)object).append(" has reached onAnimationStart.");
                            Log.v((String)"FragmentManager", (String)((StringBuilder)object).toString());
                        }
                    }
                });
                object3.startAnimation((Animation)object4);
                if (FragmentManager.J0(2)) {
                    object4 = new StringBuilder();
                    ((StringBuilder)object4).append("Animation from operation ");
                    ((StringBuilder)object4).append(object2);
                    ((StringBuilder)object4).append(" has started.");
                    Log.v((String)"FragmentManager", (String)((StringBuilder)object4).toString());
                }
            }
            ((l)object).c().c(new d.a(this, (View)object3, viewGroup, (k)object, (z.e)object2){
                final View a;
                final ViewGroup b;
                final k c;
                final z.e d;
                final d e;
                {
                    this.e = d8;
                    this.a = view;
                    this.b = viewGroup;
                    this.c = k8;
                    this.d = e8;
                }

                @Override
                public void a() {
                    this.a.clearAnimation();
                    this.b.endViewTransition(this.a);
                    this.c.a();
                    if (FragmentManager.J0(2)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Animation from operation ");
                        stringBuilder.append(this.d);
                        stringBuilder.append(" has been cancelled.");
                        Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                    }
                }
            });
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private Map<z.e, Boolean> x(List<m> object, List<z.e> object2, boolean bl, z.e arrayList, z.e e8) {
        Object var13_16;
        ArrayList<String> arrayList2;
        Object object3;
        int n8;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        Object object9;
        HashMap<z.e, Boolean> hashMap = new HashMap<z.e, Boolean>();
        Object object10 = object.iterator();
        w w8 = null;
        while (object10.hasNext()) {
            object9 = (m)object10.next();
            if (((l)object9).d()) continue;
            object8 = ((m)object9).e();
            if (w8 == null) {
                w8 = object8;
                continue;
            }
            if (object8 == null || w8 == object8) continue;
            object = new StringBuilder();
            ((StringBuilder)object).append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
            ((StringBuilder)object).append(((l)object9).b().f());
            ((StringBuilder)object).append(" returned Transition ");
            ((StringBuilder)object).append(((m)object9).h());
            ((StringBuilder)object).append(" which uses a different Transition  type than other Fragments.");
            throw new IllegalArgumentException(((StringBuilder)object).toString());
        }
        if (w8 == null) {
            object2 = object.iterator();
            while (object2.hasNext()) {
                object = (m)object2.next();
                hashMap.put(((l)object).b(), Boolean.FALSE);
                ((l)object).a();
            }
            return hashMap;
        }
        Object object11 = new View(this.m().getContext());
        object9 = new Rect();
        Object object12 = new ArrayList();
        object10 = new ArrayList();
        ax.B.a<String, String> a8 = new ax.B.a<String, String>();
        Object object13 = object.iterator();
        Object var13_15 = null;
        object8 = null;
        int n9 = 0;
        while (true) {
            int n10;
            boolean bl2 = object13.hasNext();
            object7 = "FragmentManager";
            if (!bl2) break;
            object6 = (m)object13.next();
            if (!((m)object6).i() || arrayList == null || e8 == null) continue;
            object6 = w8.u(w8.f(((m)object6).g()));
            object5 = e8.f().K0();
            object4 = ((z.e)((Object)arrayList)).f().K0();
            ArrayList<String> arrayList3 = ((z.e)((Object)arrayList)).f().L0();
            for (n8 = 0; n8 < arrayList3.size(); ++n8) {
                n10 = ((ArrayList)object5).indexOf(arrayList3.get(n8));
                if (n10 == -1) continue;
                ((ArrayList)object5).set(n10, (String)((ArrayList)object4).get(n8));
            }
            ArrayList<String> arrayList4 = e8.f().L0();
            if (!bl) {
                ((z.e)((Object)arrayList)).f().q0();
                e8.f().n0();
            } else {
                ((z.e)((Object)arrayList)).f().n0();
                e8.f().q0();
            }
            n8 = ((ArrayList)object5).size();
            for (n10 = 0; n10 < n8; ++n10) {
                a8.put((String)((ArrayList)object5).get(n10), arrayList4.get(n10));
            }
            if (FragmentManager.J0(2)) {
                Log.v((String)"FragmentManager", (String)">>> entering view names <<<");
                n8 = arrayList4.size();
                for (n10 = 0; n10 < n8; ++n10) {
                    object4 = arrayList4.get(n10);
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append("Name: ");
                    ((StringBuilder)object3).append((String)object4);
                    Log.v((String)"FragmentManager", (String)((StringBuilder)object3).toString());
                }
                Log.v((String)"FragmentManager", (String)">>> exiting view names <<<");
                n10 = ((ArrayList)object5).size();
                for (n8 = 0; n8 < n10; ++n8) {
                    object4 = (String)((ArrayList)object5).get(n8);
                    object3 = new StringBuilder();
                    ((StringBuilder)object3).append("Name: ");
                    ((StringBuilder)object3).append((String)object4);
                    Log.v((String)"FragmentManager", (String)((StringBuilder)object3).toString());
                }
            }
            object3 = new ax.B.a<String, View>();
            this.u((Map<String, View>)object3, ((z.e)((Object)arrayList)).f().I);
            ((ax.B.a)object3).o((Collection<?>)object5);
            a8.o(((ax.B.a)object3).keySet());
            object4 = new ax.B.a<String, View>();
            this.u((Map<String, View>)object4, e8.f().I);
            ((ax.B.a)object4).o(arrayList4);
            ((ax.B.a)object4).o(a8.values());
            u.c(a8, (ax.B.a<String, View>)object4);
            this.v((ax.B.a<String, View>)object3, a8.keySet());
            this.v((ax.B.a<String, View>)object4, a8.values());
            if (a8.isEmpty()) {
                ((ArrayList)object12).clear();
                ((ArrayList)object10).clear();
                Object var13_19 = null;
                continue;
            }
            u.a(e8.f(), ((z.e)((Object)arrayList)).f(), bl, (ax.B.a<String, View>)object3, true);
            arrayList2 = this.m();
            L.a(arrayList2, new Runnable(this, e8, (z.e)((Object)arrayList), bl, (ax.B.a)object4){
                final z.e c0;
                final boolean d0;
                final ax.B.a e0;
                final d f0;
                final z.e q;
                {
                    this.f0 = d8;
                    this.q = e8;
                    this.c0 = e9;
                    this.d0 = bl;
                    this.e0 = a8;
                }

                @Override
                public void run() {
                    u.a(this.q.f(), this.c0.f(), this.d0, this.e0, false);
                }
            });
            ((ArrayList)object12).addAll(((ax.B.a)object3).values());
            if (!((ArrayList)object5).isEmpty()) {
                object8 = (View)((ax.B.a)object3).get((String)((ArrayList)object5).get(0));
                w8.p(object6, (View)object8);
            }
            ((ArrayList)object10).addAll(((ax.B.a)object4).values());
            n8 = n9;
            if (!arrayList4.isEmpty()) {
                View view = (View)((ax.B.a)object4).get(arrayList4.get(0));
                n8 = n9;
                if (view != null) {
                    L.a((View)this.m(), new Runnable(this, w8, view, (Rect)object9){
                        final View c0;
                        final Rect d0;
                        final d e0;
                        final w q;
                        {
                            this.e0 = d8;
                            this.q = w8;
                            this.c0 = view;
                            this.d0 = rect;
                        }

                        @Override
                        public void run() {
                            this.q.h(this.c0, this.d0);
                        }
                    });
                    n8 = 1;
                }
            }
            w8.s(object6, (View)object11, (ArrayList<View>)object12);
            w8.n(object6, null, null, null, null, object6, (ArrayList<View>)object10);
            Boolean bl3 = Boolean.TRUE;
            hashMap.put((z.e)((Object)arrayList), bl3);
            hashMap.put(e8, bl3);
            Object object14 = object6;
            n9 = n8;
        }
        arrayList2 = arrayList;
        object3 = e8;
        object13 = object11;
        object6 = object12;
        object4 = object9;
        object12 = object10;
        object11 = new ArrayList();
        Iterator iterator = object.iterator();
        object10 = null;
        object9 = null;
        object5 = object8;
        object8 = object7;
        while (iterator.hasNext()) {
            m m8 = (m)iterator.next();
            if (m8.d()) {
                hashMap.put(m8.b(), Boolean.FALSE);
                m8.a();
                continue;
            }
            Object object15 = w8.f(m8.h());
            object7 = m8.b();
            n8 = var13_16 != null && (object7 == arrayList2 || object7 == object3) ? 1 : 0;
            if (object15 == null) {
                if (n8 == 0) {
                    hashMap.put((z.e)object7, Boolean.FALSE);
                    m8.a();
                }
            } else {
                object3 = new ArrayList();
                this.t((ArrayList<View>)object3, ((z.e)object7).f().I);
                if (n8 != 0) {
                    if (object7 == arrayList2) {
                        ((ArrayList)object3).removeAll((Collection<?>)object6);
                    } else {
                        ((ArrayList)object3).removeAll((Collection<?>)object12);
                    }
                }
                if (((ArrayList)object3).isEmpty()) {
                    w8.a(object15, (View)object13);
                } else {
                    w8.b(object15, (ArrayList<View>)object3);
                    w8.n(object15, object15, (ArrayList<View>)object3, null, null, null, null);
                    if (((z.e)object7).e() == z.e.c.d0) {
                        object2.remove(object7);
                        arrayList2 = new ArrayList(object3);
                        arrayList2.remove(((z.e)object7).f().I);
                        w8.m(object15, ((z.e)object7).f().I, arrayList2);
                        L.a((View)this.m(), new Runnable(this, (ArrayList)object3){
                            final d c0;
                            final ArrayList q;
                            {
                                this.c0 = d8;
                                this.q = arrayList;
                            }

                            @Override
                            public void run() {
                                u.d(this.q, 4);
                            }
                        });
                    }
                }
                if (((z.e)object7).e() == z.e.c.c0) {
                    ((ArrayList)object11).addAll(object3);
                    if (n9 != 0) {
                        w8.o(object15, (Rect)object4);
                    }
                } else {
                    w8.p(object15, (View)object5);
                }
                hashMap.put((z.e)object7, Boolean.TRUE);
                if (m8.j()) {
                    object3 = w8.k(object10, object15, null);
                    object10 = object9;
                    object9 = object3;
                } else {
                    object3 = w8.k(object9, object15, null);
                    object9 = object10;
                    object10 = object3;
                }
                object3 = object9;
                object9 = object10;
                object10 = object3;
            }
            arrayList2 = arrayList;
            object3 = e8;
        }
        object2 = w8.j(object10, object9, var13_16);
        if (object2 == null) {
            return hashMap;
        }
        object10 = object.iterator();
        object = object8;
        while (object10.hasNext()) {
            object9 = (m)object10.next();
            if (((l)object9).d()) continue;
            object13 = ((m)object9).h();
            object8 = ((l)object9).b();
            n9 = var13_16 != null && (object8 == arrayList || object8 == e8) ? 1 : 0;
            if (object13 == null && n9 == 0) continue;
            if (!d0.R((View)this.m())) {
                if (FragmentManager.J0(2)) {
                    object13 = new StringBuilder();
                    ((StringBuilder)object13).append("SpecialEffectsController: Container ");
                    ((StringBuilder)object13).append(this.m());
                    ((StringBuilder)object13).append(" has not been laid out. Completing operation ");
                    ((StringBuilder)object13).append(object8);
                    Log.v((String)object, (String)((StringBuilder)object13).toString());
                }
                ((l)object9).a();
                continue;
            }
            w8.q(((l)object9).b().f(), object2, ((l)object9).c(), new Runnable(this, (m)object9, (z.e)object8){
                final z.e c0;
                final d d0;
                final m q;
                {
                    this.d0 = d8;
                    this.q = m8;
                    this.c0 = e8;
                }

                @Override
                public void run() {
                    this.q.a();
                    if (FragmentManager.J0(2)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Transition for operation ");
                        stringBuilder.append(this.c0);
                        stringBuilder.append("has completed");
                        Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                    }
                }
            });
        }
        if (!d0.R((View)this.m())) {
            return hashMap;
        }
        u.d((ArrayList<View>)object11, 4);
        arrayList = w8.l((ArrayList<View>)object12);
        if (FragmentManager.J0(2)) {
            Log.v((String)object, (String)">>>>> Beginning transition <<<<<");
            Log.v((String)object, (String)">>>>> SharedElementFirstOutViews <<<<<");
            n8 = ((ArrayList)object6).size();
            for (n9 = 0; n9 < n8; ++n9) {
                e8 = ((ArrayList)object6).get(n9);
                e8 = (View)e8;
                object8 = new StringBuilder();
                ((StringBuilder)object8).append("View: ");
                ((StringBuilder)object8).append(e8);
                ((StringBuilder)object8).append(" Name: ");
                ((StringBuilder)object8).append(d0.I((View)e8));
                Log.v((String)object, (String)((StringBuilder)object8).toString());
            }
            Log.v((String)object, (String)">>>>> SharedElementLastInViews <<<<<");
            n8 = ((ArrayList)object12).size();
            for (n9 = 0; n9 < n8; ++n9) {
                e8 = ((ArrayList)object12).get(n9);
                e8 = (View)e8;
                object8 = new StringBuilder();
                ((StringBuilder)object8).append("View: ");
                ((StringBuilder)object8).append(e8);
                ((StringBuilder)object8).append(" Name: ");
                ((StringBuilder)object8).append(d0.I((View)e8));
                Log.v((String)object, (String)((StringBuilder)object8).toString());
            }
        }
        w8.c(this.m(), object2);
        w8.r((View)this.m(), (ArrayList<View>)object6, (ArrayList<View>)object12, arrayList, a8);
        u.d((ArrayList<View>)object11, 0);
        w8.t(var13_16, (ArrayList<View>)object6, (ArrayList<View>)object12);
        return hashMap;
    }

    private void y(List<z.e> object) {
        Fragment fragment = object.get(object.size() - 1).f();
        object = object.iterator();
        while (object.hasNext()) {
            z.e e8 = (z.e)object.next();
            e8.f().L.c = fragment.L.c;
            e8.f().L.d = fragment.L.d;
            e8.f().L.e = fragment.L.e;
            e8.f().L.f = fragment.L.f;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    void f(List<z.e> object, boolean bl) {
        int n8;
        Object object2;
        ArrayList<z.e> arrayList;
        Object object3 = object.iterator();
        ArrayList<z.e> arrayList2 = null;
        ArrayList<z.e> arrayList3 = null;
        while (object3.hasNext()) {
            arrayList = (z.e)object3.next();
            object2 = z.e.c.j(((z.e)((Object)arrayList)).f().I);
            n8 = a.a[((z.e)((Object)arrayList)).e().ordinal()];
            if (n8 != 1 && n8 != 2 && n8 != 3) {
                if (n8 != 4 || object2 == z.e.c.c0) continue;
                arrayList3 = arrayList;
                continue;
            }
            if (object2 != z.e.c.c0 || arrayList2 != null) continue;
            arrayList2 = arrayList;
        }
        if (FragmentManager.J0(2)) {
            arrayList = new StringBuilder();
            ((StringBuilder)((Object)arrayList)).append("Executing operations from ");
            ((StringBuilder)((Object)arrayList)).append(arrayList2);
            ((StringBuilder)((Object)arrayList)).append(" to ");
            ((StringBuilder)((Object)arrayList)).append(arrayList3);
            Log.v((String)"FragmentManager", (String)((StringBuilder)((Object)arrayList)).toString());
        }
        object3 = new ArrayList();
        object2 = new ArrayList();
        arrayList = new ArrayList<z.e>((Collection<z.e>)object);
        this.y((List<z.e>)object);
        Iterator iterator = object.iterator();
        while (true) {
            boolean bl2 = iterator.hasNext();
            boolean bl3 = false;
            if (!bl2) break;
            object = (z.e)iterator.next();
            ax.Y.d d8 = new ax.Y.d();
            ((z.e)object).j(d8);
            object3.add(new k((z.e)object, d8, bl));
            d8 = new ax.Y.d();
            ((z.e)object).j(d8);
            if (bl ? object == arrayList2 : object == arrayList3) {
                bl3 = true;
            }
            object2.add(new m((z.e)object, d8, bl, bl3));
            ((z.e)object).a(new Runnable(this, arrayList, (z.e)object){
                final z.e c0;
                final d d0;
                final List q;
                {
                    this.d0 = d8;
                    this.q = list;
                    this.c0 = e8;
                }

                @Override
                public void run() {
                    if (this.q.contains(this.c0)) {
                        this.q.remove(this.c0);
                        this.d0.s(this.c0);
                    }
                }
            });
        }
        object = this.x((List<m>)object2, (List<z.e>)arrayList, bl, (z.e)((Object)arrayList2), (z.e)((Object)arrayList3));
        this.w((List<k>)object3, (List<z.e>)arrayList, object.containsValue(Boolean.TRUE), (Map<z.e, Boolean>)object);
        int n9 = arrayList.size();
        for (n8 = 0; n8 < n9; ++n8) {
            object = arrayList.get(n8);
            this.s((z.e)object);
        }
        arrayList.clear();
        if (FragmentManager.J0(2)) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Completed executing operations from ");
            ((StringBuilder)object).append(arrayList2);
            ((StringBuilder)object).append(" to ");
            ((StringBuilder)object).append(arrayList3);
            Log.v((String)"FragmentManager", (String)((StringBuilder)object).toString());
        }
    }

    void s(z.e e8) {
        View view = e8.f().I;
        e8.e().d(view);
    }

    void t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup)view;
            if (i0.b(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add((View)viewGroup);
                    return;
                }
            } else {
                int n8 = viewGroup.getChildCount();
                for (int i8 = 0; i8 < n8; ++i8) {
                    view = viewGroup.getChildAt(i8);
                    if (view.getVisibility() != 0) continue;
                    this.t(arrayList, view);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    void u(Map<String, View> map, View view) {
        String string = d0.I(view);
        if (string != null) {
            map.put(string, view);
        }
        if (view instanceof ViewGroup) {
            view = (ViewGroup)view;
            int n8 = view.getChildCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                string = view.getChildAt(i8);
                if (string.getVisibility() != 0) continue;
                this.u(map, (View)string);
            }
        }
    }

    void v(ax.B.a<String, View> object, Collection<String> collection) {
        object = ((ax.B.a)object).entrySet().iterator();
        while (object.hasNext()) {
            if (collection.contains(d0.I((View)((Map.Entry)object.next()).getValue()))) continue;
            object.remove();
        }
    }

    private static class k
    extends l {
        private boolean c;
        private boolean d = false;
        private g.a e;

        k(z.e e8, ax.Y.d d8, boolean bl) {
            super(e8, d8);
            this.c = bl;
        }

        g.a e(Context object) {
            if (this.d) {
                return this.e;
            }
            Fragment fragment = this.b().f();
            boolean bl = this.b().e() == z.e.c.c0;
            object = g.b(object, fragment, bl, this.c);
            this.e = object;
            this.d = true;
            return object;
        }
    }

    private static class l {
        private final z.e a;
        private final ax.Y.d b;

        l(z.e e8, ax.Y.d d8) {
            this.a = e8;
            this.b = d8;
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
            z.e.c c8;
            z.e.c c9;
            z.e.c c10 = z.e.c.j(this.a.f().I);
            return c10 == (c9 = this.a.e()) || c10 != (c8 = z.e.c.c0) && c9 != c8;
            {
            }
        }
    }

    private static class m
    extends l {
        private final Object c;
        private final boolean d;
        private final Object e;

        m(z.e e8, ax.Y.d object, boolean bl, boolean bl2) {
            super(e8, (ax.Y.d)object);
            if (e8.e() == z.e.c.c0) {
                object = bl ? e8.f().F0() : e8.f().m0();
                this.c = object;
                boolean bl3 = bl ? e8.f().h0() : e8.f().g0();
                this.d = bl3;
            } else {
                object = bl ? e8.f().H0() : e8.f().p0();
                this.c = object;
                this.d = true;
            }
            if (bl2) {
                if (bl) {
                    this.e = e8.f().J0();
                    return;
                }
                this.e = e8.f().I0();
                return;
            }
            this.e = null;
        }

        private w f(Object object) {
            if (object == null) {
                return null;
            }
            Object object2 = u.a;
            if (object2 != null && ((w)object2).e(object)) {
                return object2;
            }
            object2 = u.b;
            if (object2 != null && ((w)object2).e(object)) {
                return object2;
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Transition ");
            ((StringBuilder)object2).append(object);
            ((StringBuilder)object2).append(" for fragment ");
            ((StringBuilder)object2).append(this.b().f());
            ((StringBuilder)object2).append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(((StringBuilder)object2).toString());
        }

        w e() {
            w w8 = this.f(this.c);
            Object object = this.f(this.e);
            if (w8 != null && object != null && w8 != object) {
                object = new StringBuilder();
                ((StringBuilder)object).append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                ((StringBuilder)object).append(this.b().f());
                ((StringBuilder)object).append(" returned Transition ");
                ((StringBuilder)object).append(this.c);
                ((StringBuilder)object).append(" which uses a different Transition  type than its shared element transition ");
                ((StringBuilder)object).append(this.e);
                throw new IllegalArgumentException(((StringBuilder)object).toString());
            }
            if (w8 != null) {
                return w8;
            }
            return object;
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
}

