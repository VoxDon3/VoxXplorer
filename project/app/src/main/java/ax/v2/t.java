/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import ax.v2.j;
import ax.v2.k;
import ax.v2.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;

public class t {
    private static k a = new ax.v2.a();
    private static ThreadLocal<WeakReference<ax.B.a<ViewGroup, ArrayList<k>>>> b = new ThreadLocal();
    static ArrayList<ViewGroup> c = new ArrayList();

    public static void a(ViewGroup viewGroup, k k8) {
        if (!c.contains(viewGroup) && viewGroup.isLaidOut()) {
            c.add(viewGroup);
            k k9 = k8;
            if (k8 == null) {
                k9 = a;
            }
            k8 = k9.o();
            t.d(viewGroup, k8);
            j.c(viewGroup, null);
            t.c(viewGroup, k8);
        }
    }

    static ax.B.a<ViewGroup, ArrayList<k>> b() {
        WeakReference<ax.B.a<Object, Object>> weakReference = b.get();
        if (weakReference != null && (weakReference = (ax.B.a)weakReference.get()) != null) {
            return weakReference;
        }
        ax.B.a<ViewGroup, ArrayList<k>> a8 = new ax.B.a<ViewGroup, ArrayList<k>>();
        weakReference = new WeakReference(a8);
        b.set(weakReference);
        return a8;
    }

    private static void c(ViewGroup viewGroup, k object) {
        if (object != null && viewGroup != null) {
            object = new a((k)object, viewGroup);
            viewGroup.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
            viewGroup.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)object);
        }
    }

    private static void d(ViewGroup object, k k8) {
        ArrayList<k> arrayList = t.b().get(object);
        if (arrayList != null && arrayList.size() > 0) {
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                k k9 = arrayList.get(i8);
                k9.X((View)object);
            }
        }
        if (k8 != null) {
            k8.m((ViewGroup)object, true);
        }
        if ((object = j.b((ViewGroup)object)) != null) {
            ((j)object).a();
        }
    }

    private static class a
    implements ViewTreeObserver.OnPreDrawListener,
    View.OnAttachStateChangeListener {
        k a;
        ViewGroup b;

        a(k k8, ViewGroup viewGroup) {
            this.a = k8;
            this.b = viewGroup;
        }

        private void a() {
            this.b.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
            this.b.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        }

        public boolean onPreDraw() {
            Object object;
            this.a();
            if (!c.remove(this.b)) {
                return true;
            }
            ax.B.a<ViewGroup, ArrayList<k>> a8 = t.b();
            ViewGroup viewGroup = a8.get((Object)this.b);
            ArrayList<k> arrayList = null;
            if (viewGroup == null) {
                object = new ArrayList();
                a8.put(this.b, (ArrayList<k>)object);
            } else {
                object = viewGroup;
                if (viewGroup.size() > 0) {
                    arrayList = new ArrayList<k>((Collection<k>)viewGroup);
                    object = viewGroup;
                }
            }
            ((ArrayList)object).add((k)this.a);
            this.a.b(new s(this, a8){
                final ax.B.a a;
                final a b;
                {
                    this.b = a8;
                    this.a = a9;
                }

                @Override
                public void a(k k8) {
                    ((ArrayList)this.a.get(this.b.b)).remove(k8);
                    k8.Z(this);
                }
            });
            object = this.a;
            viewGroup = this.b;
            ((k)object).m(viewGroup, false);
            if (arrayList != null) {
                int n8 = arrayList.size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    object = arrayList.get(i8);
                    ((k)object).b0((View)this.b);
                }
            }
            this.a.Y(this.b);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View object) {
            this.a();
            c.remove(this.b);
            object = t.b().get((Object)this.b);
            if (object != null && ((ArrayList)object).size() > 0) {
                int n8 = ((ArrayList)object).size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    Object e8 = ((ArrayList)object).get(i8);
                    ((k)e8).b0((View)this.b);
                }
            }
            this.a.n(true);
        }
    }
}

