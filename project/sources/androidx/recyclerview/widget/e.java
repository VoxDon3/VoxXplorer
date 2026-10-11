package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import ax.c0.C1760d0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class e extends s {
    private static TimeInterpolator s;
    private ArrayList<RecyclerView.F> h = new ArrayList<>();
    private ArrayList<RecyclerView.F> i = new ArrayList<>();
    private ArrayList<j> j = new ArrayList<>();
    private ArrayList<i> k = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.F>> l = new ArrayList<>();
    ArrayList<ArrayList<j>> m = new ArrayList<>();
    ArrayList<ArrayList<i>> n = new ArrayList<>();
    ArrayList<RecyclerView.F> o = new ArrayList<>();
    ArrayList<RecyclerView.F> p = new ArrayList<>();
    ArrayList<RecyclerView.F> q = new ArrayList<>();
    ArrayList<RecyclerView.F> r = new ArrayList<>();

    class a implements Runnable {
        final /* synthetic */ ArrayList q;

        a(ArrayList arrayList) {
            this.q = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.q;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                j jVar = (j) obj;
                e.this.T(jVar.a, jVar.b, jVar.c, jVar.d, jVar.e);
            }
            this.q.clear();
            e.this.m.remove(this.q);
        }
    }

    class b implements Runnable {
        final /* synthetic */ ArrayList q;

        b(ArrayList arrayList) {
            this.q = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.q;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                e.this.S((i) obj);
            }
            this.q.clear();
            e.this.n.remove(this.q);
        }
    }

    class c implements Runnable {
        final /* synthetic */ ArrayList q;

        c(ArrayList arrayList) {
            this.q = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = this.q;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                e.this.R((RecyclerView.F) obj);
            }
            this.q.clear();
            e.this.l.remove(this.q);
        }
    }

    class d extends AnimatorListenerAdapter {
        final /* synthetic */ RecyclerView.F a;
        final /* synthetic */ ViewPropertyAnimator b;
        final /* synthetic */ View c;

        d(RecyclerView.F f, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = f;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.c.setAlpha(1.0f);
            e.this.H(this.a);
            e.this.q.remove(this.a);
            e.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.I(this.a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$e, reason: collision with other inner class name */
    class C0040e extends AnimatorListenerAdapter {
        final /* synthetic */ RecyclerView.F a;
        final /* synthetic */ View b;
        final /* synthetic */ ViewPropertyAnimator c;

        C0040e(RecyclerView.F f, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.a = f;
            this.b = view;
            this.c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.c.setListener(null);
            e.this.B(this.a);
            e.this.o.remove(this.a);
            e.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.C(this.a);
        }
    }

    class f extends AnimatorListenerAdapter {
        final /* synthetic */ RecyclerView.F a;
        final /* synthetic */ int b;
        final /* synthetic */ View c;
        final /* synthetic */ int d;
        final /* synthetic */ ViewPropertyAnimator e;

        f(RecyclerView.F f, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.a = f;
            this.b = i;
            this.c = view;
            this.d = i2;
            this.e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.b != 0) {
                this.c.setTranslationX(0.0f);
            }
            if (this.d != 0) {
                this.c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.e.setListener(null);
            e.this.F(this.a);
            e.this.p.remove(this.a);
            e.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.G(this.a);
        }
    }

    class g extends AnimatorListenerAdapter {
        final /* synthetic */ i a;
        final /* synthetic */ ViewPropertyAnimator b;
        final /* synthetic */ View c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = iVar;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.c.setAlpha(1.0f);
            this.c.setTranslationX(0.0f);
            this.c.setTranslationY(0.0f);
            e.this.D(this.a.a, true);
            e.this.r.remove(this.a.a);
            e.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.E(this.a.a, true);
        }
    }

    class h extends AnimatorListenerAdapter {
        final /* synthetic */ i a;
        final /* synthetic */ ViewPropertyAnimator b;
        final /* synthetic */ View c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.a = iVar;
            this.b = viewPropertyAnimator;
            this.c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.b.setListener(null);
            this.c.setAlpha(1.0f);
            this.c.setTranslationX(0.0f);
            this.c.setTranslationY(0.0f);
            e.this.D(this.a.b, false);
            e.this.r.remove(this.a.b);
            e.this.W();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            e.this.E(this.a.b, false);
        }
    }

    private static class j {
        public RecyclerView.F a;
        public int b;
        public int c;
        public int d;
        public int e;

        j(RecyclerView.F f, int i, int i2, int i3, int i4) {
            this.a = f;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    private void U(RecyclerView.F f2) {
        View view = f2.a;
        ViewPropertyAnimator animate = view.animate();
        this.q.add(f2);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(f2, animate, view)).start();
    }

    private void X(List<i> list, RecyclerView.F f2) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Z(iVar, f2) && iVar.a == null && iVar.b == null) {
                list.remove(iVar);
            }
        }
    }

    private void Y(i iVar) {
        RecyclerView.F f2 = iVar.a;
        if (f2 != null) {
            Z(iVar, f2);
        }
        RecyclerView.F f3 = iVar.b;
        if (f3 != null) {
            Z(iVar, f3);
        }
    }

    private boolean Z(i iVar, RecyclerView.F f2) {
        boolean z = false;
        if (iVar.b == f2) {
            iVar.b = null;
        } else {
            if (iVar.a != f2) {
                return false;
            }
            iVar.a = null;
            z = true;
        }
        f2.a.setAlpha(1.0f);
        f2.a.setTranslationX(0.0f);
        f2.a.setTranslationY(0.0f);
        D(f2, z);
        return true;
    }

    private void a0(RecyclerView.F f2) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        f2.a.animate().setInterpolator(s);
        j(f2);
    }

    @Override // androidx.recyclerview.widget.s
    @SuppressLint({"UnknownNullness"})
    public boolean A(RecyclerView.F f2) {
        a0(f2);
        this.h.add(f2);
        return true;
    }

    void R(RecyclerView.F f2) {
        View view = f2.a;
        ViewPropertyAnimator animate = view.animate();
        this.o.add(f2);
        animate.alpha(1.0f).setDuration(l()).setListener(new C0040e(f2, view, animate)).start();
    }

    void S(i iVar) {
        RecyclerView.F f2 = iVar.a;
        View view = f2 == null ? null : f2.a;
        RecyclerView.F f3 = iVar.b;
        View view2 = f3 != null ? f3.a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.r.add(iVar.a);
            duration.translationX(iVar.e - iVar.c);
            duration.translationY(iVar.f - iVar.d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.r.add(iVar.b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    void T(RecyclerView.F f2, int i2, int i3, int i4, int i5) {
        View view = f2.a;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.p.add(f2);
        animate.setDuration(n()).setListener(new f(f2, i6, view, i7, animate)).start();
    }

    void V(List<RecyclerView.F> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).a.animate().cancel();
        }
    }

    void W() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.F f2, List<Object> list) {
        return !list.isEmpty() || super.g(f2, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    public void j(RecyclerView.F f2) {
        View view = f2.a;
        view.animate().cancel();
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.j.get(size).a == f2) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                F(f2);
                this.j.remove(size);
            }
        }
        X(this.k, f2);
        if (this.h.remove(f2)) {
            view.setAlpha(1.0f);
            H(f2);
        }
        if (this.i.remove(f2)) {
            view.setAlpha(1.0f);
            B(f2);
        }
        for (int size2 = this.n.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.n.get(size2);
            X(arrayList, f2);
            if (arrayList.isEmpty()) {
                this.n.remove(size2);
            }
        }
        for (int size3 = this.m.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).a == f2) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    F(f2);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.l.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.F> arrayList3 = this.l.get(size5);
            if (arrayList3.remove(f2)) {
                view.setAlpha(1.0f);
                B(f2);
                if (arrayList3.isEmpty()) {
                    this.l.remove(size5);
                }
            }
        }
        this.q.remove(f2);
        this.o.remove(f2);
        this.r.remove(f2);
        this.p.remove(f2);
        W();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.j.get(size);
            View view = jVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            F(jVar.a);
            this.j.remove(size);
        }
        for (int size2 = this.h.size() - 1; size2 >= 0; size2--) {
            H(this.h.get(size2));
            this.h.remove(size2);
        }
        int size3 = this.i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.F f2 = this.i.get(size3);
            f2.a.setAlpha(1.0f);
            B(f2);
            this.i.remove(size3);
        }
        for (int size4 = this.k.size() - 1; size4 >= 0; size4--) {
            Y(this.k.get(size4));
        }
        this.k.clear();
        if (p()) {
            for (int size5 = this.m.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    F(jVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.l.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.F> arrayList2 = this.l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.F f3 = arrayList2.get(size8);
                    f3.a.setAlpha(1.0f);
                    B(f3);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.n.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    Y(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.n.remove(arrayList3);
                    }
                }
            }
            V(this.q);
            V(this.p);
            V(this.o);
            V(this.r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void v() {
        boolean isEmpty = this.h.isEmpty();
        boolean isEmpty2 = this.j.isEmpty();
        boolean isEmpty3 = this.k.isEmpty();
        boolean isEmpty4 = this.i.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
            return;
        }
        ArrayList<RecyclerView.F> arrayList = this.h;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            RecyclerView.F f2 = arrayList.get(i2);
            i2++;
            U(f2);
        }
        this.h.clear();
        if (!isEmpty2) {
            ArrayList<j> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.j);
            this.m.add(arrayList2);
            this.j.clear();
            a aVar = new a(arrayList2);
            if (isEmpty) {
                aVar.run();
            } else {
                C1760d0.e0(arrayList2.get(0).a.a, aVar, o());
            }
        }
        if (!isEmpty3) {
            ArrayList<i> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.k);
            this.n.add(arrayList3);
            this.k.clear();
            b bVar = new b(arrayList3);
            if (isEmpty) {
                bVar.run();
            } else {
                C1760d0.e0(arrayList3.get(0).a.a, bVar, o());
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList<RecyclerView.F> arrayList4 = new ArrayList<>();
        arrayList4.addAll(this.i);
        this.l.add(arrayList4);
        this.i.clear();
        c cVar = new c(arrayList4);
        if (isEmpty && isEmpty2 && isEmpty3) {
            cVar.run();
        } else {
            C1760d0.e0(arrayList4.get(0).a, cVar, (!isEmpty ? o() : 0L) + Math.max(!isEmpty2 ? n() : 0L, isEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.s
    @SuppressLint({"UnknownNullness"})
    public boolean x(RecyclerView.F f2) {
        a0(f2);
        f2.a.setAlpha(0.0f);
        this.i.add(f2);
        return true;
    }

    @Override // androidx.recyclerview.widget.s
    @SuppressLint({"UnknownNullness"})
    public boolean y(RecyclerView.F f2, RecyclerView.F f3, int i2, int i3, int i4, int i5) {
        if (f2 == f3) {
            return z(f2, i2, i3, i4, i5);
        }
        float translationX = f2.a.getTranslationX();
        float translationY = f2.a.getTranslationY();
        float alpha = f2.a.getAlpha();
        a0(f2);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        f2.a.setTranslationX(translationX);
        f2.a.setTranslationY(translationY);
        f2.a.setAlpha(alpha);
        if (f3 != null) {
            a0(f3);
            f3.a.setTranslationX(-i6);
            f3.a.setTranslationY(-i7);
            f3.a.setAlpha(0.0f);
        }
        this.k.add(new i(f2, f3, i2, i3, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.s
    @SuppressLint({"UnknownNullness"})
    public boolean z(RecyclerView.F f2, int i2, int i3, int i4, int i5) {
        View view = f2.a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) f2.a.getTranslationY());
        a0(f2);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            F(f2);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.j.add(new j(f2, translationX, translationY, i4, i5));
        return true;
    }

    private static class i {
        public RecyclerView.F a;
        public RecyclerView.F b;
        public int c;
        public int d;
        public int e;
        public int f;

        private i(RecyclerView.F f, RecyclerView.F f2) {
            this.a = f;
            this.b = f2;
        }

        @SuppressLint({"UnknownNullness"})
        public String toString() {
            return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
        }

        i(RecyclerView.F f, RecyclerView.F f2, int i, int i2, int i3, int i4) {
            this(f, f2);
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }
    }
}
