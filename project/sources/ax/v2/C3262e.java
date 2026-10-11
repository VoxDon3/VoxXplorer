package ax.v2;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import ax.Y.d;
import ax.v2.AbstractC3268k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.v2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3262e extends androidx.fragment.app.w {

    /* renamed from: ax.v2.e$a */
    class a extends AbstractC3268k.e {
        final /* synthetic */ Rect a;

        a(Rect rect) {
            this.a = rect;
        }
    }

    /* renamed from: ax.v2.e$c */
    class c extends s {
        final /* synthetic */ Object a;
        final /* synthetic */ ArrayList b;
        final /* synthetic */ Object c;
        final /* synthetic */ ArrayList d;
        final /* synthetic */ Object e;
        final /* synthetic */ ArrayList f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.b = arrayList;
            this.c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // ax.v2.AbstractC3268k.f
        public void a(AbstractC3268k abstractC3268k) {
            abstractC3268k.Z(this);
        }

        @Override // ax.v2.s, ax.v2.AbstractC3268k.f
        public void g(AbstractC3268k abstractC3268k) {
            Object obj = this.a;
            if (obj != null) {
                C3262e.this.x(obj, this.b, null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                C3262e.this.x(obj2, this.d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                C3262e.this.x(obj3, this.f, null);
            }
        }
    }

    /* renamed from: ax.v2.e$e, reason: collision with other inner class name */
    class C0477e extends AbstractC3268k.e {
        final /* synthetic */ Rect a;

        C0477e(Rect rect) {
            this.a = rect;
        }
    }

    public static /* synthetic */ void v(Runnable runnable, AbstractC3268k abstractC3268k, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            abstractC3268k.cancel();
            runnable2.run();
        }
    }

    private static boolean w(AbstractC3268k abstractC3268k) {
        return (androidx.fragment.app.w.i(abstractC3268k.G()) && androidx.fragment.app.w.i(abstractC3268k.H()) && androidx.fragment.app.w.i(abstractC3268k.I())) ? false : true;
    }

    @Override // androidx.fragment.app.w
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC3268k) obj).c(view);
        }
    }

    @Override // androidx.fragment.app.w
    public void b(Object obj, ArrayList<View> arrayList) {
        AbstractC3268k abstractC3268k = (AbstractC3268k) obj;
        if (abstractC3268k == null) {
            return;
        }
        int i = 0;
        if (abstractC3268k instanceof v) {
            v vVar = (v) abstractC3268k;
            int s0 = vVar.s0();
            while (i < s0) {
                b(vVar.r0(i), arrayList);
                i++;
            }
            return;
        }
        if (w(abstractC3268k) || !androidx.fragment.app.w.i(abstractC3268k.J())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            abstractC3268k.c(arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.fragment.app.w
    public void c(ViewGroup viewGroup, Object obj) {
        t.a(viewGroup, (AbstractC3268k) obj);
    }

    @Override // androidx.fragment.app.w
    public boolean e(Object obj) {
        return obj instanceof AbstractC3268k;
    }

    @Override // androidx.fragment.app.w
    public Object f(Object obj) {
        if (obj != null) {
            return ((AbstractC3268k) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.w
    public Object j(Object obj, Object obj2, Object obj3) {
        AbstractC3268k abstractC3268k = (AbstractC3268k) obj;
        AbstractC3268k abstractC3268k2 = (AbstractC3268k) obj2;
        AbstractC3268k abstractC3268k3 = (AbstractC3268k) obj3;
        if (abstractC3268k != null && abstractC3268k2 != null) {
            abstractC3268k = new v().p0(abstractC3268k).p0(abstractC3268k2).y0(1);
        } else if (abstractC3268k == null) {
            abstractC3268k = abstractC3268k2 != null ? abstractC3268k2 : null;
        }
        if (abstractC3268k3 == null) {
            return abstractC3268k;
        }
        v vVar = new v();
        if (abstractC3268k != null) {
            vVar.p0(abstractC3268k);
        }
        vVar.p0(abstractC3268k3);
        return vVar;
    }

    @Override // androidx.fragment.app.w
    public Object k(Object obj, Object obj2, Object obj3) {
        v vVar = new v();
        if (obj != null) {
            vVar.p0((AbstractC3268k) obj);
        }
        if (obj2 != null) {
            vVar.p0((AbstractC3268k) obj2);
        }
        if (obj3 != null) {
            vVar.p0((AbstractC3268k) obj3);
        }
        return vVar;
    }

    @Override // androidx.fragment.app.w
    public void m(Object obj, View view, ArrayList<View> arrayList) {
        ((AbstractC3268k) obj).b(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.w
    public void n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((AbstractC3268k) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.w
    public void o(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC3268k) obj).f0(new C0477e(rect));
        }
    }

    @Override // androidx.fragment.app.w
    public void p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            h(view, rect);
            ((AbstractC3268k) obj).f0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.w
    public void q(Fragment fragment, Object obj, ax.Y.d dVar, Runnable runnable) {
        y(fragment, obj, dVar, null, runnable);
    }

    @Override // androidx.fragment.app.w
    public void s(Object obj, View view, ArrayList<View> arrayList) {
        v vVar = (v) obj;
        List<View> J = vVar.J();
        J.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            androidx.fragment.app.w.d(J, arrayList.get(i));
        }
        J.add(view);
        arrayList.add(view);
        b(vVar, arrayList);
    }

    @Override // androidx.fragment.app.w
    public void t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        v vVar = (v) obj;
        if (vVar != null) {
            vVar.J().clear();
            vVar.J().addAll(arrayList2);
            x(vVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.w
    public Object u(Object obj) {
        if (obj == null) {
            return null;
        }
        v vVar = new v();
        vVar.p0((AbstractC3268k) obj);
        return vVar;
    }

    public void x(Object obj, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint({"UnknownNullness"}) ArrayList<View> arrayList2) {
        AbstractC3268k abstractC3268k = (AbstractC3268k) obj;
        int i = 0;
        if (abstractC3268k instanceof v) {
            v vVar = (v) abstractC3268k;
            int s0 = vVar.s0();
            while (i < s0) {
                x(vVar.r0(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (w(abstractC3268k)) {
            return;
        }
        List<View> J = abstractC3268k.J();
        if (J.size() == arrayList.size() && J.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                abstractC3268k.c(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC3268k.a0(arrayList.get(size2));
            }
        }
    }

    public void y(Fragment fragment, Object obj, ax.Y.d dVar, final Runnable runnable, final Runnable runnable2) {
        final AbstractC3268k abstractC3268k = (AbstractC3268k) obj;
        dVar.c(new d.a() { // from class: ax.v2.d
            @Override // ax.Y.d.a
            public final void a() {
                C3262e.v(runnable, abstractC3268k, runnable2);
            }
        });
        abstractC3268k.b(new d(runnable2));
    }

    /* renamed from: ax.v2.e$b */
    class b implements AbstractC3268k.f {
        final /* synthetic */ View a;
        final /* synthetic */ ArrayList b;

        b(View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // ax.v2.AbstractC3268k.f
        public void a(AbstractC3268k abstractC3268k) {
            abstractC3268k.Z(this);
            this.a.setVisibility(8);
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.b.get(i)).setVisibility(0);
            }
        }

        @Override // ax.v2.AbstractC3268k.f
        public /* synthetic */ void b(AbstractC3268k abstractC3268k, boolean z) {
            C3269l.a(this, abstractC3268k, z);
        }

        @Override // ax.v2.AbstractC3268k.f
        public /* synthetic */ void c(AbstractC3268k abstractC3268k, boolean z) {
            C3269l.b(this, abstractC3268k, z);
        }

        @Override // ax.v2.AbstractC3268k.f
        public void g(AbstractC3268k abstractC3268k) {
            abstractC3268k.Z(this);
            abstractC3268k.b(this);
        }

        @Override // ax.v2.AbstractC3268k.f
        public void d(AbstractC3268k abstractC3268k) {
        }

        @Override // ax.v2.AbstractC3268k.f
        public void e(AbstractC3268k abstractC3268k) {
        }

        @Override // ax.v2.AbstractC3268k.f
        public void f(AbstractC3268k abstractC3268k) {
        }
    }

    /* renamed from: ax.v2.e$d */
    class d implements AbstractC3268k.f {
        final /* synthetic */ Runnable a;

        d(Runnable runnable) {
            this.a = runnable;
        }

        @Override // ax.v2.AbstractC3268k.f
        public void a(AbstractC3268k abstractC3268k) {
            this.a.run();
        }

        @Override // ax.v2.AbstractC3268k.f
        public /* synthetic */ void b(AbstractC3268k abstractC3268k, boolean z) {
            C3269l.a(this, abstractC3268k, z);
        }

        @Override // ax.v2.AbstractC3268k.f
        public /* synthetic */ void c(AbstractC3268k abstractC3268k, boolean z) {
            C3269l.b(this, abstractC3268k, z);
        }

        @Override // ax.v2.AbstractC3268k.f
        public void d(AbstractC3268k abstractC3268k) {
        }

        @Override // ax.v2.AbstractC3268k.f
        public void e(AbstractC3268k abstractC3268k) {
        }

        @Override // ax.v2.AbstractC3268k.f
        public void f(AbstractC3268k abstractC3268k) {
        }

        @Override // ax.v2.AbstractC3268k.f
        public void g(AbstractC3268k abstractC3268k) {
        }
    }
}
