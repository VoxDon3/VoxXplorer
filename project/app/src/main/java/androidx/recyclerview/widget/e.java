/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.s;
import ax.c0.d0;
import java.util.ArrayList;
import java.util.List;

public class e
extends s {
    private static TimeInterpolator s;
    private ArrayList<RecyclerView.F> h = new ArrayList();
    private ArrayList<RecyclerView.F> i = new ArrayList();
    private ArrayList<j> j = new ArrayList();
    private ArrayList<i> k = new ArrayList();
    ArrayList<ArrayList<RecyclerView.F>> l = new ArrayList();
    ArrayList<ArrayList<j>> m = new ArrayList();
    ArrayList<ArrayList<i>> n = new ArrayList();
    ArrayList<RecyclerView.F> o = new ArrayList();
    ArrayList<RecyclerView.F> p = new ArrayList();
    ArrayList<RecyclerView.F> q = new ArrayList();
    ArrayList<RecyclerView.F> r = new ArrayList();

    private void U(RecyclerView.F f8) {
        View view = f8.a;
        ViewPropertyAnimator viewPropertyAnimator = view.animate();
        this.q.add(f8);
        viewPropertyAnimator.setDuration(this.o()).alpha(0.0f).setListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, f8, viewPropertyAnimator, view){
            final RecyclerView.F a;
            final ViewPropertyAnimator b;
            final View c;
            final e d;
            {
                this.d = e8;
                this.a = f8;
                this.b = viewPropertyAnimator;
                this.c = view;
            }

            public void onAnimationEnd(Animator animator) {
                this.b.setListener(null);
                this.c.setAlpha(1.0f);
                this.d.H(this.a);
                this.d.q.remove(this.a);
                this.d.W();
            }

            public void onAnimationStart(Animator animator) {
                this.d.I(this.a);
            }
        }).start();
    }

    private void X(List<i> list, RecyclerView.F f8) {
        for (int i8 = list.size() - 1; i8 >= 0; --i8) {
            i i9 = list.get(i8);
            if (!this.Z(i9, f8) || i9.a != null || i9.b != null) continue;
            list.remove(i9);
        }
    }

    private void Y(i i8) {
        RecyclerView.F f8 = i8.a;
        if (f8 != null) {
            this.Z(i8, f8);
        }
        if ((f8 = i8.b) != null) {
            this.Z(i8, f8);
        }
    }

    private boolean Z(i i8, RecyclerView.F f8) {
        block4: {
            boolean bl;
            block3: {
                block2: {
                    RecyclerView.F f9 = i8.b;
                    bl = false;
                    if (f9 != f8) break block2;
                    i8.b = null;
                    break block3;
                }
                if (i8.a != f8) break block4;
                i8.a = null;
                bl = true;
            }
            f8.a.setAlpha(1.0f);
            f8.a.setTranslationX(0.0f);
            f8.a.setTranslationY(0.0f);
            this.D(f8, bl);
            return true;
        }
        return false;
    }

    private void a0(RecyclerView.F f8) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        f8.a.animate().setInterpolator(s);
        this.j(f8);
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public boolean A(RecyclerView.F f8) {
        this.a0(f8);
        this.h.add(f8);
        return true;
    }

    void R(RecyclerView.F f8) {
        View view = f8.a;
        ViewPropertyAnimator viewPropertyAnimator = view.animate();
        this.o.add(f8);
        viewPropertyAnimator.alpha(1.0f).setDuration(this.l()).setListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, f8, view, viewPropertyAnimator){
            final RecyclerView.F a;
            final View b;
            final ViewPropertyAnimator c;
            final e d;
            {
                this.d = e8;
                this.a = f8;
                this.b = view;
                this.c = viewPropertyAnimator;
            }

            public void onAnimationCancel(Animator animator) {
                this.b.setAlpha(1.0f);
            }

            public void onAnimationEnd(Animator animator) {
                this.c.setListener(null);
                this.d.B(this.a);
                this.d.o.remove(this.a);
                this.d.W();
            }

            public void onAnimationStart(Animator animator) {
                this.d.C(this.a);
            }
        }).start();
    }

    void S(i i8) {
        RecyclerView.F f8 = i8.a;
        View view = null;
        f8 = f8 == null ? null : f8.a;
        RecyclerView.F f9 = i8.b;
        if (f9 != null) {
            view = f9.a;
        }
        if (f8 != null) {
            f9 = f8.animate().setDuration(this.m());
            this.r.add(i8.a);
            f9.translationX(i8.e - i8.c);
            f9.translationY(i8.f - i8.d);
            f9.alpha(0.0f).setListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, i8, (ViewPropertyAnimator)f9, (View)f8){
                final i a;
                final ViewPropertyAnimator b;
                final View c;
                final e d;
                {
                    this.d = e8;
                    this.a = i8;
                    this.b = viewPropertyAnimator;
                    this.c = view;
                }

                public void onAnimationEnd(Animator animator) {
                    this.b.setListener(null);
                    this.c.setAlpha(1.0f);
                    this.c.setTranslationX(0.0f);
                    this.c.setTranslationY(0.0f);
                    this.d.D(this.a.a, true);
                    this.d.r.remove(this.a.a);
                    this.d.W();
                }

                public void onAnimationStart(Animator animator) {
                    this.d.E(this.a.a, true);
                }
            }).start();
        }
        if (view != null) {
            f8 = view.animate();
            this.r.add(i8.b);
            f8.translationX(0.0f).translationY(0.0f).setDuration(this.m()).alpha(1.0f).setListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, i8, (ViewPropertyAnimator)f8, view){
                final i a;
                final ViewPropertyAnimator b;
                final View c;
                final e d;
                {
                    this.d = e8;
                    this.a = i8;
                    this.b = viewPropertyAnimator;
                    this.c = view;
                }

                public void onAnimationEnd(Animator animator) {
                    this.b.setListener(null);
                    this.c.setAlpha(1.0f);
                    this.c.setTranslationX(0.0f);
                    this.c.setTranslationY(0.0f);
                    this.d.D(this.a.b, false);
                    this.d.r.remove(this.a.b);
                    this.d.W();
                }

                public void onAnimationStart(Animator animator) {
                    this.d.E(this.a.b, false);
                }
            }).start();
        }
    }

    void T(RecyclerView.F f8, int n8, int n9, int n10, int n11) {
        View view = f8.a;
        n8 = n10 - n8;
        n9 = n11 - n9;
        if (n8 != 0) {
            view.animate().translationX(0.0f);
        }
        if (n9 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimator = view.animate();
        this.p.add(f8);
        viewPropertyAnimator.setDuration(this.n()).setListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, f8, n8, view, n9, viewPropertyAnimator){
            final RecyclerView.F a;
            final int b;
            final View c;
            final int d;
            final ViewPropertyAnimator e;
            final e f;
            {
                this.f = e8;
                this.a = f8;
                this.b = n8;
                this.c = view;
                this.d = n9;
                this.e = viewPropertyAnimator;
            }

            public void onAnimationCancel(Animator animator) {
                if (this.b != 0) {
                    this.c.setTranslationX(0.0f);
                }
                if (this.d != 0) {
                    this.c.setTranslationY(0.0f);
                }
            }

            public void onAnimationEnd(Animator animator) {
                this.e.setListener(null);
                this.f.F(this.a);
                this.f.p.remove(this.a);
                this.f.W();
            }

            public void onAnimationStart(Animator animator) {
                this.f.G(this.a);
            }
        }).start();
    }

    void V(List<RecyclerView.F> list) {
        for (int i8 = list.size() - 1; i8 >= 0; --i8) {
            list.get((int)i8).a.animate().cancel();
        }
    }

    void W() {
        if (!this.p()) {
            this.i();
        }
    }

    @Override
    public boolean g(RecyclerView.F f8, List<Object> list) {
        return !list.isEmpty() || super.g(f8, list);
        {
        }
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public void j(RecyclerView.F f8) {
        ArrayList<Object> arrayList;
        int n8;
        View view = f8.a;
        view.animate().cancel();
        for (n8 = this.j.size() - 1; n8 >= 0; --n8) {
            if (this.j.get((int)n8).a != f8) continue;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            this.F(f8);
            this.j.remove(n8);
        }
        this.X(this.k, f8);
        if (this.h.remove(f8)) {
            view.setAlpha(1.0f);
            this.H(f8);
        }
        if (this.i.remove(f8)) {
            view.setAlpha(1.0f);
            this.B(f8);
        }
        for (n8 = this.n.size() - 1; n8 >= 0; --n8) {
            arrayList = this.n.get(n8);
            this.X(arrayList, f8);
            if (!arrayList.isEmpty()) continue;
            this.n.remove(n8);
        }
        block2: for (n8 = this.m.size() - 1; n8 >= 0; --n8) {
            arrayList = this.m.get(n8);
            for (int i8 = arrayList.size() - 1; i8 >= 0; --i8) {
                if (((j)arrayList.get((int)i8)).a != f8) continue;
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                this.F(f8);
                arrayList.remove(i8);
                if (!arrayList.isEmpty()) continue block2;
                this.m.remove(n8);
                continue block2;
            }
        }
        for (n8 = this.l.size() - 1; n8 >= 0; --n8) {
            arrayList = this.l.get(n8);
            if (!arrayList.remove(f8)) continue;
            view.setAlpha(1.0f);
            this.B(f8);
            if (!arrayList.isEmpty()) continue;
            this.l.remove(n8);
        }
        this.q.remove(f8);
        this.o.remove(f8);
        this.r.remove(f8);
        this.p.remove(f8);
        this.W();
    }

    @Override
    public void k() {
        int n8;
        Object object;
        Object object2;
        int n9;
        for (n9 = this.j.size() - 1; n9 >= 0; --n9) {
            object2 = this.j.get(n9);
            object = ((j)object2).a.a;
            object.setTranslationY(0.0f);
            object.setTranslationX(0.0f);
            this.F(((j)object2).a);
            this.j.remove(n9);
        }
        for (n9 = this.h.size() - 1; n9 >= 0; --n9) {
            this.H(this.h.get(n9));
            this.h.remove(n9);
        }
        for (n9 = this.i.size() - 1; n9 >= 0; --n9) {
            object2 = this.i.get(n9);
            ((RecyclerView.F)object2).a.setAlpha(1.0f);
            this.B((RecyclerView.F)object2);
            this.i.remove(n9);
        }
        for (n9 = this.k.size() - 1; n9 >= 0; --n9) {
            this.Y(this.k.get(n9));
        }
        this.k.clear();
        if (!this.p()) {
            return;
        }
        for (n9 = this.m.size() - 1; n9 >= 0; --n9) {
            object2 = this.m.get(n9);
            for (n8 = ((ArrayList)object2).size() - 1; n8 >= 0; --n8) {
                object = ((ArrayList)object2).get(n8);
                View view = ((j)object).a.a;
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                this.F(((j)object).a);
                ((ArrayList)object2).remove(n8);
                if (!((ArrayList)object2).isEmpty()) continue;
                this.m.remove(object2);
            }
        }
        for (n9 = this.l.size() - 1; n9 >= 0; --n9) {
            object = this.l.get(n9);
            for (n8 = ((ArrayList)object).size() - 1; n8 >= 0; --n8) {
                object2 = (RecyclerView.F)((ArrayList)object).get(n8);
                ((RecyclerView.F)object2).a.setAlpha(1.0f);
                this.B((RecyclerView.F)object2);
                ((ArrayList)object).remove(n8);
                if (!((ArrayList)object).isEmpty()) continue;
                this.l.remove(object);
            }
        }
        for (n9 = this.n.size() - 1; n9 >= 0; --n9) {
            object2 = this.n.get(n9);
            for (n8 = ((ArrayList)object2).size() - 1; n8 >= 0; --n8) {
                this.Y((i)((ArrayList)object2).get(n8));
                if (!((ArrayList)object2).isEmpty()) continue;
                this.n.remove(object2);
            }
        }
        this.V(this.q);
        this.V(this.p);
        this.V(this.o);
        this.V(this.r);
        this.i();
    }

    @Override
    public boolean p() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
        {
        }
    }

    @Override
    public void v() {
        boolean bl = this.h.isEmpty();
        boolean bl2 = this.j.isEmpty();
        boolean bl3 = this.k.isEmpty();
        boolean bl4 = this.i.isEmpty();
        if (!(bl && bl2 && bl4 && bl3)) {
            Object object;
            Object object2 = this.h;
            int n8 = ((ArrayList)object2).size();
            for (int i8 = 0; i8 < n8; ++i8) {
                object = ((ArrayList)object2).get(i8);
                this.U((RecyclerView.F)object);
            }
            this.h.clear();
            if (!bl2) {
                object = new ArrayList();
                ((ArrayList)object).addAll(this.j);
                this.m.add((ArrayList<j>)object);
                this.j.clear();
                object2 = new Runnable(this, (ArrayList)object){
                    final e c0;
                    final ArrayList q;
                    {
                        this.c0 = e8;
                        this.q = arrayList;
                    }

                    @Override
                    public void run() {
                        ArrayList arrayList = this.q;
                        int n8 = arrayList.size();
                        for (int i8 = 0; i8 < n8; ++i8) {
                            Object object = arrayList.get(i8);
                            object = (j)object;
                            this.c0.T(((j)object).a, ((j)object).b, ((j)object).c, ((j)object).d, ((j)object).e);
                        }
                        this.q.clear();
                        this.c0.m.remove(this.q);
                    }
                };
                if (!bl) {
                    d0.e0(((j)((ArrayList)object).get((int)0)).a.a, (Runnable)object2, this.o());
                } else {
                    object2.run();
                }
            }
            if (!bl3) {
                object2 = new ArrayList();
                ((ArrayList)object2).addAll(this.k);
                this.n.add((ArrayList<i>)object2);
                this.k.clear();
                object = new Runnable(this, (ArrayList)object2){
                    final e c0;
                    final ArrayList q;
                    {
                        this.c0 = e8;
                        this.q = arrayList;
                    }

                    @Override
                    public void run() {
                        ArrayList arrayList = this.q;
                        int n8 = arrayList.size();
                        for (int i8 = 0; i8 < n8; ++i8) {
                            Object object = arrayList.get(i8);
                            object = (i)object;
                            this.c0.S((i)object);
                        }
                        this.q.clear();
                        this.c0.n.remove(this.q);
                    }
                };
                if (!bl) {
                    d0.e0(((i)((ArrayList)object2).get((int)0)).a.a, (Runnable)object, this.o());
                } else {
                    object.run();
                }
            }
            if (!bl4) {
                object = new ArrayList<j>();
                ((ArrayList)object).addAll(this.i);
                this.l.add((ArrayList<RecyclerView.F>)object);
                this.i.clear();
                object2 = new Runnable(this, (ArrayList)object){
                    final e c0;
                    final ArrayList q;
                    {
                        this.c0 = e8;
                        this.q = arrayList;
                    }

                    @Override
                    public void run() {
                        ArrayList arrayList = this.q;
                        int n8 = arrayList.size();
                        for (int i8 = 0; i8 < n8; ++i8) {
                            Object object = arrayList.get(i8);
                            object = (RecyclerView.F)object;
                            this.c0.R((RecyclerView.F)object);
                        }
                        this.q.clear();
                        this.c0.l.remove(this.q);
                    }
                };
                if (bl && bl2 && bl3) {
                    object2.run();
                    return;
                }
                long l8 = 0L;
                long l9 = !bl ? this.o() : 0L;
                long l10 = !bl2 ? this.n() : 0L;
                if (!bl3) {
                    l8 = this.m();
                }
                l10 = Math.max(l10, l8);
                d0.e0(((RecyclerView.F)((ArrayList)object).get((int)0)).a, (Runnable)object2, l9 + l10);
            }
        }
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public boolean x(RecyclerView.F f8) {
        this.a0(f8);
        f8.a.setAlpha(0.0f);
        this.i.add(f8);
        return true;
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public boolean y(RecyclerView.F f8, RecyclerView.F f9, int n8, int n9, int n10, int n11) {
        if (f8 == f9) {
            return this.z(f8, n8, n9, n10, n11);
        }
        float f10 = f8.a.getTranslationX();
        float f11 = f8.a.getTranslationY();
        float f12 = f8.a.getAlpha();
        this.a0(f8);
        int n12 = (int)((float)(n10 - n8) - f10);
        int n13 = (int)((float)(n11 - n9) - f11);
        f8.a.setTranslationX(f10);
        f8.a.setTranslationY(f11);
        f8.a.setAlpha(f12);
        if (f9 != null) {
            this.a0(f9);
            f9.a.setTranslationX((float)(-n12));
            f9.a.setTranslationY((float)(-n13));
            f9.a.setAlpha(0.0f);
        }
        this.k.add(new i(f8, f9, n8, n9, n10, n11));
        return true;
    }

    @Override
    @SuppressLint(value={"UnknownNullness"})
    public boolean z(RecyclerView.F f8, int n8, int n9, int n10, int n11) {
        View view = f8.a;
        int n12 = n9 + (int)f8.a.getTranslationY();
        this.a0(f8);
        n9 = n10 - (n8 += (int)view.getTranslationX());
        int n13 = n11 - n12;
        if (n9 == 0 && n13 == 0) {
            this.F(f8);
            return false;
        }
        if (n9 != 0) {
            view.setTranslationX((float)(-n9));
        }
        if (n13 != 0) {
            view.setTranslationY((float)(-n13));
        }
        this.j.add(new j(f8, n8, n12, n10, n11));
        return true;
    }

    private static class i {
        public RecyclerView.F a;
        public RecyclerView.F b;
        public int c;
        public int d;
        public int e;
        public int f;

        private i(RecyclerView.F f8, RecyclerView.F f9) {
            this.a = f8;
            this.b = f9;
        }

        i(RecyclerView.F f8, RecyclerView.F f9, int n8, int n9, int n10, int n11) {
            this(f8, f9);
            this.c = n8;
            this.d = n9;
            this.e = n10;
            this.f = n11;
        }

        @SuppressLint(value={"UnknownNullness"})
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ChangeInfo{oldHolder=");
            stringBuilder.append(this.a);
            stringBuilder.append(", newHolder=");
            stringBuilder.append(this.b);
            stringBuilder.append(", fromX=");
            stringBuilder.append(this.c);
            stringBuilder.append(", fromY=");
            stringBuilder.append(this.d);
            stringBuilder.append(", toX=");
            stringBuilder.append(this.e);
            stringBuilder.append(", toY=");
            stringBuilder.append(this.f);
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    private static class j {
        public RecyclerView.F a;
        public int b;
        public int c;
        public int d;
        public int e;

        j(RecyclerView.F f8, int n8, int n9, int n10, int n11) {
            this.a = f8;
            this.b = n8;
            this.c = n9;
            this.d = n10;
            this.e = n11;
        }
    }
}

