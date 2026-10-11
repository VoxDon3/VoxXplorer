/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import ax.Y.d;
import ax.c0.L;
import ax.c0.d0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint(value={"UnknownNullness"})
public abstract class w {
    protected static void d(List<View> list, View view) {
        int n8 = list.size();
        if (!w.g(list, view, n8)) {
            if (d0.I(view) != null) {
                list.add(view);
            }
            for (int i8 = n8; i8 < list.size(); ++i8) {
                view = list.get(i8);
                if (!(view instanceof ViewGroup)) continue;
                view = (ViewGroup)view;
                int n9 = view.getChildCount();
                for (int i9 = 0; i9 < n9; ++i9) {
                    View view2 = view.getChildAt(i9);
                    if (w.g(list, view2, n8) || d0.I(view2) == null) continue;
                    list.add(view2);
                }
            }
        }
    }

    private static boolean g(List<View> list, View view, int n8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            if (list.get(i8) != view) continue;
            return true;
        }
        return false;
    }

    protected static boolean i(List list) {
        return list == null || list.isEmpty();
        {
        }
    }

    public abstract void a(Object var1, View var2);

    public abstract void b(Object var1, ArrayList<View> var2);

    public abstract void c(ViewGroup var1, Object var2);

    public abstract boolean e(Object var1);

    public abstract Object f(Object var1);

    protected void h(View view, Rect rect) {
        if (!d0.Q(view)) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, (float)view.getWidth(), (float)view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset((float)view.getLeft(), (float)view.getTop());
        Object object = view.getParent();
        while (object instanceof View) {
            object = (View)object;
            rectF.offset((float)(-object.getScrollX()), (float)(-object.getScrollY()));
            object.getMatrix().mapRect(rectF);
            rectF.offset((float)object.getLeft(), (float)object.getTop());
            object = object.getParent();
        }
        object = new int[2];
        view.getRootView().getLocationOnScreen((int[])object);
        rectF.offset((float)object[0], (float)object[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    public abstract Object j(Object var1, Object var2, Object var3);

    public abstract Object k(Object var1, Object var2, Object var3);

    ArrayList<String> l(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<String>();
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = arrayList.get(i8);
            arrayList2.add(d0.I(view));
            d0.A0(view, null);
        }
        return arrayList2;
    }

    public abstract void m(Object var1, View var2, ArrayList<View> var3);

    public abstract void n(Object var1, Object var2, ArrayList<View> var3, Object var4, ArrayList<View> var5, Object var6, ArrayList<View> var7);

    public abstract void o(Object var1, Rect var2);

    public abstract void p(Object var1, View var2);

    public void q(Fragment fragment, Object object, d d8, Runnable runnable2) {
        runnable2.run();
    }

    void r(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int n8 = arrayList2.size();
        ArrayList<String> arrayList4 = new ArrayList<String>();
        block0: for (int i8 = 0; i8 < n8; ++i8) {
            Object object = arrayList.get(i8);
            String string = d0.I((View)object);
            arrayList4.add(string);
            if (string == null) continue;
            d0.A0((View)object, null);
            object = map.get(string);
            for (int i9 = 0; i9 < n8; ++i9) {
                if (!((String)object).equals(arrayList3.get(i9))) continue;
                d0.A0(arrayList2.get(i9), string);
                continue block0;
            }
        }
        L.a(view, new Runnable(this, n8, arrayList2, arrayList3, arrayList, arrayList4){
            final ArrayList c0;
            final ArrayList d0;
            final ArrayList e0;
            final ArrayList f0;
            final w g0;
            final int q;
            {
                this.g0 = w8;
                this.q = n8;
                this.c0 = arrayList;
                this.d0 = arrayList2;
                this.e0 = arrayList3;
                this.f0 = arrayList4;
            }

            @Override
            public void run() {
                for (int i8 = 0; i8 < this.q; ++i8) {
                    d0.A0((View)this.c0.get(i8), (String)this.d0.get(i8));
                    d0.A0((View)this.e0.get(i8), (String)this.f0.get(i8));
                }
            }
        });
    }

    public abstract void s(Object var1, View var2, ArrayList<View> var3);

    public abstract void t(Object var1, ArrayList<View> var2, ArrayList<View> var3);

    public abstract Object u(Object var1);
}

