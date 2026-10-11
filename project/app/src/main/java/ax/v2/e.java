/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w;
import ax.v2.d;
import ax.v2.k;
import ax.v2.l;
import ax.v2.s;
import ax.v2.t;
import ax.v2.v;
import java.util.ArrayList;
import java.util.List;

public class e
extends w {
    public static /* synthetic */ void v(Runnable runnable2, k k8, Runnable runnable3) {
        if (runnable2 == null) {
            k8.cancel();
            runnable3.run();
            return;
        }
        runnable2.run();
    }

    private static boolean w(k k8) {
        return !w.i(k8.G()) || !w.i(k8.H()) || !w.i(k8.I());
        {
        }
    }

    @Override
    public void a(Object object, View view) {
        if (object != null) {
            ((k)object).c(view);
        }
    }

    @Override
    public void b(Object object, ArrayList<View> arrayList) {
        block2: {
            int n8;
            block3: {
                if ((object = (k)object) == null) break block2;
                boolean bl = object instanceof v;
                int n9 = 0;
                if (!bl) break block3;
                object = (v)object;
                n9 = ((v)object).s0();
                for (n8 = 0; n8 < n9; ++n8) {
                    this.b(((v)object).r0(n8), arrayList);
                }
                break block2;
            }
            if (e.w((k)object) || !w.i(((k)object).J())) break block2;
            int n10 = arrayList.size();
            for (n8 = n9; n8 < n10; ++n8) {
                ((k)object).c(arrayList.get(n8));
            }
        }
    }

    @Override
    public void c(ViewGroup viewGroup, Object object) {
        t.a(viewGroup, (k)object);
    }

    @Override
    public boolean e(Object object) {
        return object instanceof k;
    }

    @Override
    public Object f(Object object) {
        if (object != null) {
            return ((k)object).o();
        }
        return null;
    }

    @Override
    public Object j(Object object, Object object2, Object object3) {
        object = (k)object;
        object2 = (k)object2;
        object3 = (k)object3;
        if (object != null && object2 != null) {
            object = new v().p0((k)object).p0((k)object2).y0(1);
        } else if (object == null) {
            object = object2 != null ? object2 : null;
        }
        if (object3 != null) {
            object2 = new v();
            if (object != null) {
                ((v)object2).p0((k)object);
            }
            ((v)object2).p0((k)object3);
            return object2;
        }
        return object;
    }

    @Override
    public Object k(Object object, Object object2, Object object3) {
        v v8 = new v();
        if (object != null) {
            v8.p0((k)object);
        }
        if (object2 != null) {
            v8.p0((k)object2);
        }
        if (object3 != null) {
            v8.p0((k)object3);
        }
        return v8;
    }

    @Override
    public void m(Object object, View view, ArrayList<View> arrayList) {
        ((k)object).b(new k.f(){
            final View a;
            final ArrayList b;
            final e c;
            {
                this.c = e8;
                this.a = view;
                this.b = arrayList;
            }

            @Override
            public void a(k k8) {
                k8.Z(this);
                this.a.setVisibility(8);
                int n8 = this.b.size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    ((View)this.b.get(i8)).setVisibility(0);
                }
            }

            @Override
            public /* synthetic */ void b(k k8, boolean bl) {
                l.a(this, k8, bl);
            }

            @Override
            public /* synthetic */ void c(k k8, boolean bl) {
                l.b(this, k8, bl);
            }

            @Override
            public void d(k k8) {
            }

            @Override
            public void e(k k8) {
            }

            @Override
            public void f(k k8) {
            }

            @Override
            public void g(k k8) {
                k8.Z(this);
                k8.b(this);
            }
        });
    }

    @Override
    public void n(Object object, Object object2, ArrayList<View> arrayList, Object object3, ArrayList<View> arrayList2, Object object4, ArrayList<View> arrayList3) {
        ((k)object).b(new s(this, object2, arrayList, object3, arrayList2, object4, arrayList3){
            final Object a;
            final ArrayList b;
            final Object c;
            final ArrayList d;
            final Object e;
            final ArrayList f;
            final e g;
            {
                this.g = e8;
                this.a = object;
                this.b = arrayList;
                this.c = object2;
                this.d = arrayList2;
                this.e = object3;
                this.f = arrayList3;
            }

            @Override
            public void a(k k8) {
                k8.Z(this);
            }

            @Override
            public void g(k object) {
                object = this.a;
                if (object != null) {
                    this.g.x(object, this.b, null);
                }
                if ((object = this.c) != null) {
                    this.g.x(object, this.d, null);
                }
                if ((object = this.e) != null) {
                    this.g.x(object, this.f, null);
                }
            }
        });
    }

    @Override
    public void o(Object object, Rect rect) {
        if (object != null) {
            ((k)object).f0(new k.e(this, rect){
                final Rect a;
                final e b;
                {
                    this.b = e8;
                    this.a = rect;
                }
            });
        }
    }

    @Override
    public void p(Object object, View view) {
        if (view != null) {
            k k8 = (k)object;
            object = new Rect();
            this.h(view, (Rect)object);
            k8.f0(new k.e(this, (Rect)object){
                final Rect a;
                final e b;
                {
                    this.b = e8;
                    this.a = rect;
                }
            });
        }
    }

    @Override
    public void q(Fragment fragment, Object object, ax.Y.d d8, Runnable runnable2) {
        this.y(fragment, object, d8, null, runnable2);
    }

    @Override
    public void s(Object object, View view, ArrayList<View> arrayList) {
        object = (v)object;
        List<View> list = ((k)object).J();
        list.clear();
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            w.d(list, arrayList.get(i8));
        }
        list.add(view);
        arrayList.add(view);
        this.b(object, arrayList);
    }

    @Override
    public void t(Object object, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if ((object = (v)object) != null) {
            ((k)object).J().clear();
            ((k)object).J().addAll(arrayList2);
            this.x(object, arrayList, arrayList2);
        }
    }

    @Override
    public Object u(Object object) {
        if (object == null) {
            return null;
        }
        v v8 = new v();
        v8.p0((k)object);
        return v8;
    }

    public void x(Object object, @SuppressLint(value={"UnknownNullness"}) ArrayList<View> arrayList, @SuppressLint(value={"UnknownNullness"}) ArrayList<View> arrayList2) {
        block4: {
            List<View> list;
            int n8;
            int n9;
            block3: {
                object = (k)object;
                boolean bl = object instanceof v;
                if (!bl) break block3;
                object = (v)object;
                n9 = ((v)object).s0();
                for (n8 = 0; n8 < n9; ++n8) {
                    this.x(((v)object).r0(n8), arrayList, arrayList2);
                }
                break block4;
            }
            if (e.w((k)object) || (list = ((k)object).J()).size() != arrayList.size() || !list.containsAll(arrayList)) break block4;
            n8 = arrayList2 == null ? 0 : arrayList2.size();
            for (n9 = 0; n9 < n8; ++n9) {
                ((k)object).c(arrayList2.get(n9));
            }
            for (n8 = arrayList.size() - 1; n8 >= 0; --n8) {
                ((k)object).a0(arrayList.get(n8));
            }
        }
    }

    public void y(Fragment object, Object object2, ax.Y.d d8, Runnable runnable2, Runnable runnable3) {
        object = (k)object2;
        d8.c(new d(runnable2, (k)object, runnable3));
        ((k)object).b(new k.f(){
            final Runnable a;
            final e b;
            {
                this.b = e8;
                this.a = runnable2;
            }

            @Override
            public void a(k k8) {
                this.a.run();
            }

            @Override
            public /* synthetic */ void b(k k8, boolean bl) {
                l.a(this, k8, bl);
            }

            @Override
            public /* synthetic */ void c(k k8, boolean bl) {
                l.b(this, k8, bl);
            }

            @Override
            public void d(k k8) {
            }

            @Override
            public void e(k k8) {
            }

            @Override
            public void f(k k8) {
            }

            @Override
            public void g(k k8) {
            }
        });
    }
}

