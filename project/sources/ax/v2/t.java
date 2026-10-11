package ax.v2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class t {
    private static AbstractC3268k a = new C3258a();
    private static ThreadLocal<WeakReference<ax.B.a<ViewGroup, ArrayList<AbstractC3268k>>>> b = new ThreadLocal<>();
    static ArrayList<ViewGroup> c = new ArrayList<>();

    public static void a(ViewGroup viewGroup, AbstractC3268k abstractC3268k) {
        if (c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        c.add(viewGroup);
        if (abstractC3268k == null) {
            abstractC3268k = a;
        }
        AbstractC3268k clone = abstractC3268k.clone();
        d(viewGroup, clone);
        C3267j.c(viewGroup, null);
        c(viewGroup, clone);
    }

    static ax.B.a<ViewGroup, ArrayList<AbstractC3268k>> b() {
        ax.B.a<ViewGroup, ArrayList<AbstractC3268k>> aVar;
        WeakReference<ax.B.a<ViewGroup, ArrayList<AbstractC3268k>>> weakReference = b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        ax.B.a<ViewGroup, ArrayList<AbstractC3268k>> aVar2 = new ax.B.a<>();
        b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, AbstractC3268k abstractC3268k) {
        if (abstractC3268k == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC3268k, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, AbstractC3268k abstractC3268k) {
        ArrayList<AbstractC3268k> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                AbstractC3268k abstractC3268k2 = arrayList.get(i);
                i++;
                abstractC3268k2.X(viewGroup);
            }
        }
        if (abstractC3268k != null) {
            abstractC3268k.m(viewGroup, true);
        }
        C3267j b2 = C3267j.b(viewGroup);
        if (b2 != null) {
            b2.a();
        }
    }

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        AbstractC3268k a;
        ViewGroup b;

        /* renamed from: ax.v2.t$a$a, reason: collision with other inner class name */
        class C0478a extends s {
            final /* synthetic */ ax.B.a a;

            C0478a(ax.B.a aVar) {
                this.a = aVar;
            }

            @Override // ax.v2.AbstractC3268k.f
            public void a(AbstractC3268k abstractC3268k) {
                ((ArrayList) this.a.get(a.this.b)).remove(abstractC3268k);
                abstractC3268k.Z(this);
            }
        }

        a(AbstractC3268k abstractC3268k, ViewGroup viewGroup) {
            this.a = abstractC3268k;
            this.b = viewGroup;
        }

        private void a() {
            this.b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!t.c.remove(this.b)) {
                return true;
            }
            ax.B.a<ViewGroup, ArrayList<AbstractC3268k>> b = t.b();
            ArrayList<AbstractC3268k> arrayList = b.get(this.b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                b.put(this.b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.a);
            this.a.b(new C0478a(b));
            int i = 0;
            this.a.m(this.b, false);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    ((AbstractC3268k) obj).b0(this.b);
                }
            }
            this.a.Y(this.b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            t.c.remove(this.b);
            ArrayList<AbstractC3268k> arrayList = t.b().get(this.b);
            if (arrayList != null && arrayList.size() > 0) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    AbstractC3268k abstractC3268k = arrayList.get(i);
                    i++;
                    abstractC3268k.b0(this.b);
                }
            }
            this.a.n(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
