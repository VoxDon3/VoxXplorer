/*
 * Decompiled with CFR 0.152.
 */
package ax.v2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import ax.B.a;
import ax.B.h;
import ax.c0.d0;
import ax.v2.m;
import ax.v2.n;
import ax.v2.o;
import ax.v2.p;
import ax.v2.q;
import ax.v2.u;
import ax.v2.v;
import ax.v2.x;
import ax.v2.y;
import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class k
implements Cloneable {
    private static final Animator[] J0 = new Animator[0];
    private static final int[] K0 = new int[]{2, 1, 3, 4};
    private static final ax.v2.g L0 = new ax.v2.g(){

        @Override
        public Path a(float f8, float f9, float f10, float f11) {
            Path path = new Path();
            path.moveTo(f8, f9);
            path.lineTo(f10, f11);
            return path;
        }
    };
    private static ThreadLocal<a<Animator, d>> M0 = new ThreadLocal();
    int A0 = 0;
    private boolean B0 = false;
    boolean C0 = false;
    private k D0 = null;
    private ArrayList<f> E0 = null;
    ArrayList<Animator> F0;
    private e G0;
    private a<String, String> H0;
    private ax.v2.g I0;
    private long c0 = -1L;
    long d0 = -1L;
    private TimeInterpolator e0 = null;
    ArrayList<Integer> f0;
    ArrayList<View> g0;
    private ArrayList<String> h0 = null;
    private ArrayList<Class<?>> i0 = null;
    private ArrayList<Integer> j0 = null;
    private ArrayList<View> k0 = null;
    private ArrayList<Class<?>> l0 = null;
    private ArrayList<String> m0 = null;
    private ArrayList<Integer> n0 = null;
    private ArrayList<View> o0 = null;
    private ArrayList<Class<?>> p0 = null;
    private String q = this.getClass().getName();
    private y q0;
    private y r0;
    v s0 = null;
    private int[] t0;
    private ArrayList<x> u0;
    private ArrayList<x> v0;
    private f[] w0;
    boolean x0 = false;
    ArrayList<Animator> y0;
    private Animator[] z0;

    public k() {
        this.f0 = new ArrayList();
        this.g0 = new ArrayList();
        this.q0 = new y();
        this.r0 = new y();
        this.t0 = K0;
        this.y0 = new ArrayList();
        this.z0 = J0;
        this.F0 = new ArrayList();
        this.I0 = L0;
    }

    private static a<Animator, d> E() {
        a<Animator, d> a8;
        a<Object, d> a9 = a8 = M0.get();
        if (a8 == null) {
            a9 = new a();
            M0.set(a9);
        }
        return a9;
    }

    private static boolean O(x object, x object2, String string) {
        object = ((x)object).a.get(string);
        object2 = ((x)object2).a.get(string);
        if (object == null && object2 == null) {
            return false;
        }
        if (object != null && object2 != null) {
            return object.equals(object2) ^ true;
        }
        return true;
    }

    private void P(a<View, x> a8, a<View, x> a9, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        int n8 = sparseArray.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            View view;
            View view2 = (View)sparseArray.valueAt(i8);
            if (view2 == null || !this.N(view2) || (view = (View)sparseArray2.get(sparseArray.keyAt(i8))) == null || !this.N(view)) continue;
            x x8 = a8.get((Object)view2);
            x x9 = a9.get((Object)view);
            if (x8 == null || x9 == null) continue;
            this.u0.add(x8);
            this.v0.add(x9);
            a8.remove((Object)view2);
            a9.remove((Object)view);
        }
    }

    private void Q(a<View, x> a8, a<View, x> a9) {
        for (int i8 = a8.size() - 1; i8 >= 0; --i8) {
            Object object = (View)a8.f(i8);
            if (object == null || !this.N((View)object) || (object = a9.remove(object)) == null || !this.N(object.b)) continue;
            x x8 = (x)a8.i(i8);
            this.u0.add(x8);
            this.v0.add((x)object);
        }
    }

    private void R(a<View, x> a8, a<View, x> a9, h<View> h8, h<View> h9) {
        int n8 = h8.n();
        for (int i8 = 0; i8 < n8; ++i8) {
            View view;
            View view2 = h8.o(i8);
            if (view2 == null || !this.N(view2) || (view = h9.f(h8.j(i8))) == null || !this.N(view)) continue;
            x x8 = a8.get((Object)view2);
            x x9 = a9.get((Object)view);
            if (x8 == null || x9 == null) continue;
            this.u0.add(x8);
            this.v0.add(x9);
            a8.remove((Object)view2);
            a9.remove((Object)view);
        }
    }

    private void S(a<View, x> a8, a<View, x> a9, a<String, View> a10, a<String, View> a11) {
        int n8 = a10.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            View view;
            View view2 = (View)a10.k(i8);
            if (view2 == null || !this.N(view2) || (view = a11.get(a10.f(i8))) == null || !this.N(view)) continue;
            x x8 = a8.get((Object)view2);
            x x9 = a9.get((Object)view);
            if (x8 == null || x9 == null) continue;
            this.u0.add(x8);
            this.v0.add(x9);
            a8.remove((Object)view2);
            a9.remove((Object)view);
        }
    }

    private void T(y y8, y y9) {
        int[] nArray;
        a<View, x> a8 = new a<View, x>(y8.a);
        a<View, x> a9 = new a<View, x>(y9.a);
        for (int i8 = 0; i8 < (nArray = this.t0).length; ++i8) {
            int n8 = nArray[i8];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) continue;
                        this.R(a8, a9, y8.c, y9.c);
                        continue;
                    }
                    this.P(a8, a9, y8.b, y9.b);
                    continue;
                }
                this.S(a8, a9, y8.d, y9.d);
                continue;
            }
            this.Q(a8, a9);
        }
        this.d(a8, a9);
    }

    private void U(k k8, g g8, boolean bl) {
        Cloneable cloneable = this.D0;
        if (cloneable != null) {
            ((k)cloneable).U(k8, g8, bl);
        }
        if ((cloneable = this.E0) != null && !((ArrayList)cloneable).isEmpty()) {
            int n8 = this.E0.size();
            f[] fArray = this.w0;
            cloneable = fArray;
            if (fArray == null) {
                cloneable = new f[n8];
            }
            this.w0 = null;
            cloneable = (f[])this.E0.toArray((T[])cloneable);
            for (int i8 = 0; i8 < n8; ++i8) {
                g8.a((f)((Object)cloneable[i8]), k8, bl);
                cloneable[i8] = null;
            }
            this.w0 = cloneable;
        }
    }

    private void c0(Animator animator, a<Animator, d> a8) {
        if (animator != null) {
            animator.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this, a8){
                final a a;
                final k b;
                {
                    this.b = k8;
                    this.a = a8;
                }

                public void onAnimationEnd(Animator animator) {
                    this.a.remove(animator);
                    this.b.y0.remove(animator);
                }

                public void onAnimationStart(Animator animator) {
                    this.b.y0.add(animator);
                }
            });
            this.h(animator);
        }
    }

    private void d(a<View, x> object, a<View, x> a8) {
        int n8 = 0;
        int n9 = 0;
        while (true) {
            if (n9 >= ((ax.B.k)object).size()) break;
            x x8 = (x)((ax.B.k)object).k(n9);
            if (this.N(x8.b)) {
                this.u0.add(x8);
                this.v0.add(null);
            }
            ++n9;
        }
        for (int i8 = n8; i8 < a8.size(); ++i8) {
            object = (x)a8.k(i8);
            if (!this.N(((x)object).b)) continue;
            this.v0.add((x)object);
            this.u0.add(null);
        }
    }

    private static void f(y y8, View view, x object) {
        y8.a.put(view, (x)object);
        int n8 = view.getId();
        if (n8 >= 0) {
            if (y8.b.indexOfKey(n8) >= 0) {
                y8.b.put(n8, null);
            } else {
                y8.b.put(n8, (Object)view);
            }
        }
        if ((object = ax.c0.d0.I(view)) != null) {
            if (y8.d.containsKey(object)) {
                y8.d.put((String)object, null);
            } else {
                y8.d.put((String)object, view);
            }
        }
        if (view.getParent() instanceof ListView && (object = (ListView)view.getParent()).getAdapter().hasStableIds()) {
            long l8 = object.getItemIdAtPosition(object.getPositionForView(view));
            if (y8.c.i(l8) >= 0) {
                view = y8.c.f(l8);
                if (view != null) {
                    view.setHasTransientState(false);
                    y8.c.k(l8, null);
                    return;
                }
            } else {
                view.setHasTransientState(true);
                y8.c.k(l8, view);
            }
        }
    }

    private void j(View view, boolean bl) {
        if (view != null) {
            int n8 = view.getId();
            ArrayList<Constable> arrayList = this.j0;
            if (!(arrayList != null && arrayList.contains(n8) || (arrayList = this.k0) != null && arrayList.contains(view))) {
                int n9;
                int n10;
                arrayList = this.l0;
                int n11 = 0;
                if (arrayList != null) {
                    n10 = arrayList.size();
                    for (n9 = 0; n9 < n10; ++n9) {
                        if (!this.l0.get(n9).isInstance(view)) {
                            continue;
                        }
                        break;
                    }
                } else {
                    if (view.getParent() instanceof ViewGroup) {
                        arrayList = new x(view);
                        if (bl) {
                            this.l((x)((Object)arrayList));
                        } else {
                            this.i((x)((Object)arrayList));
                        }
                        ((x)((Object)arrayList)).c.add(this);
                        this.k((x)((Object)arrayList));
                        if (bl) {
                            k.f(this.q0, view, arrayList);
                        } else {
                            k.f(this.r0, view, arrayList);
                        }
                    }
                    if (!(!(view instanceof ViewGroup) || (arrayList = this.n0) != null && arrayList.contains(n8) || (arrayList = this.o0) != null && arrayList.contains(view))) {
                        arrayList = this.p0;
                        if (arrayList != null) {
                            n10 = arrayList.size();
                            for (n9 = 0; n9 < n10; ++n9) {
                                if (!this.p0.get(n9).isInstance(view)) {
                                    continue;
                                }
                                break;
                            }
                        } else {
                            view = (ViewGroup)view;
                            for (n9 = n11; n9 < view.getChildCount(); ++n9) {
                                this.j(view.getChildAt(n9), bl);
                            }
                        }
                    }
                }
            }
        }
    }

    public ax.v2.g B() {
        return this.I0;
    }

    public u C() {
        return null;
    }

    public final k D() {
        v v8 = this.s0;
        if (v8 != null) {
            return v8.D();
        }
        return this;
    }

    public long F() {
        return this.c0;
    }

    public List<Integer> G() {
        return this.f0;
    }

    public List<String> H() {
        return this.h0;
    }

    public List<Class<?>> I() {
        return this.i0;
    }

    public List<View> J() {
        return this.g0;
    }

    public String[] K() {
        return null;
    }

    public x L(View view, boolean bl) {
        Object object = this.s0;
        if (object != null) {
            return ((k)object).L(view, bl);
        }
        object = bl ? this.q0 : this.r0;
        return ((y)object).a.get((Object)view);
    }

    public boolean M(x x8, x x9) {
        block4: {
            if (x8 == null || x9 == null) break block4;
            Object object = this.K();
            if (object != null) {
                int n8 = ((String[])object).length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    if (!k.O(x8, x9, (String)object[i8])) continue;
                    return true;
                }
            } else {
                object = x8.a.keySet().iterator();
                while (object.hasNext()) {
                    if (!k.O(x8, x9, (String)object.next())) continue;
                    return true;
                }
            }
        }
        return false;
    }

    boolean N(View view) {
        int n8;
        int n9 = view.getId();
        ArrayList<Object> arrayList = this.j0;
        if (arrayList != null && arrayList.contains(n9)) {
            return false;
        }
        arrayList = this.k0;
        if (arrayList != null && arrayList.contains(view)) {
            return false;
        }
        arrayList = this.l0;
        if (arrayList != null) {
            int n10 = arrayList.size();
            for (n8 = 0; n8 < n10; ++n8) {
                if (!this.l0.get(n8).isInstance(view)) continue;
                return false;
            }
        }
        if (this.m0 != null && ax.c0.d0.I(view) != null && this.m0.contains(ax.c0.d0.I(view))) {
            return false;
        }
        if (this.f0.size() == 0 && this.g0.size() == 0 && ((arrayList = this.i0) == null || arrayList.isEmpty()) && ((arrayList = this.h0) == null || arrayList.isEmpty())) {
            return true;
        }
        if (!this.f0.contains(n9) && !this.g0.contains(view)) {
            arrayList = this.h0;
            if (arrayList != null && arrayList.contains(ax.c0.d0.I(view))) {
                return true;
            }
            if (this.i0 != null) {
                for (n8 = 0; n8 < this.i0.size(); ++n8) {
                    if (!this.i0.get(n8).isInstance(view)) continue;
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    void V(g g8, boolean bl) {
        this.U(this, g8, bl);
    }

    public void X(View view) {
        if (!this.C0) {
            int n8 = this.y0.size();
            Animator[] animatorArray = this.y0.toArray(this.z0);
            this.z0 = J0;
            --n8;
            while (n8 >= 0) {
                view = animatorArray[n8];
                animatorArray[n8] = null;
                view.pause();
                --n8;
            }
            this.z0 = animatorArray;
            this.V(g.d, false);
            this.B0 = true;
        }
    }

    void Y(ViewGroup viewGroup) {
        this.u0 = new ArrayList();
        this.v0 = new ArrayList();
        this.T(this.q0, this.r0);
        a<Animator, d> a8 = k.E();
        int n8 = a8.size();
        WindowId windowId = viewGroup.getWindowId();
        --n8;
        while (n8 >= 0) {
            d d8;
            Animator animator = (Animator)a8.f(n8);
            if (animator != null && (d8 = a8.get((Object)animator)) != null && d8.a != null && windowId.equals((Object)d8.d)) {
                x x8;
                x x9 = d8.c;
                View view = d8.a;
                x x10 = this.L(view, true);
                x x11 = x8 = this.y(view, true);
                if (x10 == null) {
                    x11 = x8;
                    if (x8 == null) {
                        x11 = this.r0.a.get((Object)view);
                    }
                }
                if ((x10 != null || x11 != null) && d8.e.M(x9, x11)) {
                    d8.e.D().getClass();
                    if (!animator.isRunning() && !animator.isStarted()) {
                        a8.remove((Object)animator);
                    } else {
                        animator.cancel();
                    }
                }
            }
            --n8;
        }
        this.s(viewGroup, this.q0, this.r0, this.u0, this.v0);
        this.d0();
    }

    public k Z(f f8) {
        Cloneable cloneable = this.E0;
        if (cloneable != null) {
            if (!((ArrayList)cloneable).remove(f8) && (cloneable = this.D0) != null) {
                ((k)cloneable).Z(f8);
            }
            if (this.E0.size() == 0) {
                this.E0 = null;
            }
        }
        return this;
    }

    public k a0(View view) {
        this.g0.remove(view);
        return this;
    }

    public k b(f f8) {
        if (this.E0 == null) {
            this.E0 = new ArrayList();
        }
        this.E0.add(f8);
        return this;
    }

    public void b0(View animatorArray) {
        if (this.B0) {
            if (!this.C0) {
                int n8 = this.y0.size();
                animatorArray = this.y0.toArray(this.z0);
                this.z0 = J0;
                --n8;
                while (n8 >= 0) {
                    Animator animator = animatorArray[n8];
                    animatorArray[n8] = null;
                    animator.resume();
                    --n8;
                }
                this.z0 = animatorArray;
                this.V(g.e, false);
            }
            this.B0 = false;
        }
    }

    public k c(View view) {
        this.g0.add(view);
        return this;
    }

    protected void cancel() {
        int n8 = this.y0.size();
        Animator[] animatorArray = this.y0.toArray(this.z0);
        this.z0 = J0;
        --n8;
        while (n8 >= 0) {
            Animator animator = animatorArray[n8];
            animatorArray[n8] = null;
            animator.cancel();
            --n8;
        }
        this.z0 = animatorArray;
        this.V(g.c, false);
    }

    protected void d0() {
        this.k0();
        a<Animator, d> a8 = k.E();
        ArrayList<Animator> arrayList = this.F0;
        int n8 = arrayList.size();
        int n9 = 0;
        while (n9 < n8) {
            int n10;
            Animator animator = arrayList.get(n9);
            n9 = n10 = n9 + 1;
            if (!a8.containsKey((Object)animator)) continue;
            this.k0();
            this.c0(animator, a8);
            n9 = n10;
        }
        this.F0.clear();
        this.t();
    }

    public k e0(long l8) {
        this.d0 = l8;
        return this;
    }

    public void f0(e e8) {
        this.G0 = e8;
    }

    public k g0(TimeInterpolator timeInterpolator) {
        this.e0 = timeInterpolator;
        return this;
    }

    protected void h(Animator animator) {
        if (animator == null) {
            this.t();
            return;
        }
        if (this.v() >= 0L) {
            animator.setDuration(this.v());
        }
        if (this.F() >= 0L) {
            animator.setStartDelay(this.F() + animator.getStartDelay());
        }
        if (this.x() != null) {
            animator.setInterpolator(this.x());
        }
        animator.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(this){
            final k a;
            {
                this.a = k8;
            }

            public void onAnimationEnd(Animator animator) {
                this.a.t();
                animator.removeListener((Animator.AnimatorListener)this);
            }
        });
        animator.start();
    }

    public void h0(ax.v2.g g8) {
        if (g8 == null) {
            this.I0 = L0;
            return;
        }
        this.I0 = g8;
    }

    public abstract void i(x var1);

    public void i0(u u8) {
    }

    public k j0(long l8) {
        this.c0 = l8;
        return this;
    }

    void k(x x8) {
    }

    protected void k0() {
        if (this.A0 == 0) {
            this.V(g.a, false);
            this.C0 = false;
        }
        ++this.A0;
    }

    public abstract void l(x var1);

    String l0(String charSequence) {
        charSequence = new StringBuilder((String)charSequence);
        ((StringBuilder)charSequence).append(this.getClass().getSimpleName());
        ((StringBuilder)charSequence).append("@");
        ((StringBuilder)charSequence).append(Integer.toHexString(this.hashCode()));
        ((StringBuilder)charSequence).append(": ");
        if (this.d0 != -1L) {
            ((StringBuilder)charSequence).append("dur(");
            ((StringBuilder)charSequence).append(this.d0);
            ((StringBuilder)charSequence).append(") ");
        }
        if (this.c0 != -1L) {
            ((StringBuilder)charSequence).append("dly(");
            ((StringBuilder)charSequence).append(this.c0);
            ((StringBuilder)charSequence).append(") ");
        }
        if (this.e0 != null) {
            ((StringBuilder)charSequence).append("interp(");
            ((StringBuilder)charSequence).append(this.e0);
            ((StringBuilder)charSequence).append(") ");
        }
        if (this.f0.size() > 0 || this.g0.size() > 0) {
            ((StringBuilder)charSequence).append("tgts(");
            int n8 = this.f0.size();
            int n9 = 0;
            if (n8 > 0) {
                for (n8 = 0; n8 < this.f0.size(); ++n8) {
                    if (n8 > 0) {
                        ((StringBuilder)charSequence).append(", ");
                    }
                    ((StringBuilder)charSequence).append(this.f0.get(n8));
                }
            }
            if (this.g0.size() > 0) {
                for (n8 = n9; n8 < this.g0.size(); ++n8) {
                    if (n8 > 0) {
                        ((StringBuilder)charSequence).append(", ");
                    }
                    ((StringBuilder)charSequence).append(this.g0.get(n8));
                }
            }
            ((StringBuilder)charSequence).append(")");
        }
        return ((StringBuilder)charSequence).toString();
    }

    void m(ViewGroup object, boolean bl) {
        Object object2;
        Object object3;
        this.n(bl);
        int n8 = this.f0.size();
        int n9 = 0;
        if (n8 <= 0 && this.g0.size() <= 0 || (object3 = this.h0) != null && !((ArrayList)object3).isEmpty() || (object3 = this.i0) != null && !((ArrayList)object3).isEmpty()) {
            this.j((View)object, bl);
        } else {
            for (n8 = 0; n8 < this.f0.size(); ++n8) {
                object3 = object.findViewById(this.f0.get(n8).intValue());
                if (object3 == null) continue;
                object2 = new x((View)object3);
                if (bl) {
                    this.l((x)object2);
                } else {
                    this.i((x)object2);
                }
                ((x)object2).c.add(this);
                this.k((x)object2);
                if (bl) {
                    k.f(this.q0, (View)object3, (x)object2);
                    continue;
                }
                k.f(this.r0, (View)object3, (x)object2);
            }
            for (n8 = 0; n8 < this.g0.size(); ++n8) {
                object = this.g0.get(n8);
                object3 = new x((View)object);
                if (bl) {
                    this.l((x)object3);
                } else {
                    this.i((x)object3);
                }
                ((x)object3).c.add(this);
                this.k((x)object3);
                if (bl) {
                    k.f(this.q0, (View)object, (x)object3);
                    continue;
                }
                k.f(this.r0, (View)object, (x)object3);
            }
        }
        if (!bl && (object = this.H0) != null) {
            int n10 = ((ax.B.k)object).size();
            object = new ArrayList(n10);
            n8 = 0;
            while (true) {
                if (n8 >= n10) break;
                object3 = (String)this.H0.f(n8);
                ((ArrayList)object).add(this.q0.d.remove(object3));
                ++n8;
            }
            for (int i8 = n9; i8 < n10; ++i8) {
                object3 = (View)((ArrayList)object).get(i8);
                if (object3 == null) continue;
                object2 = (String)this.H0.k(i8);
                this.q0.d.put((String)object2, (View)object3);
            }
        }
    }

    void n(boolean bl) {
        if (bl) {
            this.q0.a.clear();
            this.q0.b.clear();
            this.q0.c.c();
            return;
        }
        this.r0.a.clear();
        this.r0.b.clear();
        this.r0.c.c();
    }

    public k o() {
        try {
            k k8 = (k)super.clone();
            Object object = new ArrayList();
            k8.F0 = object;
            k8.q0 = object = new y();
            k8.r0 = object = new y();
            k8.u0 = null;
            k8.v0 = null;
            k8.D0 = this;
            k8.E0 = null;
            return k8;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public Animator r(ViewGroup viewGroup, x x8, x x9) {
        return null;
    }

    void s(ViewGroup object, y object2, y y8, ArrayList<x> arrayList, ArrayList<x> arrayList2) {
        int n8;
        int n9;
        a<Animator, d> a8 = k.E();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int n10 = arrayList.size();
        this.D().getClass();
        for (n9 = 0; n9 < n10; ++n9) {
            x x8;
            Object object3;
            block14: {
                object3 = arrayList.get(n9);
                x8 = arrayList2.get(n9);
                object2 = object3;
                if (object3 != null) {
                    object2 = object3;
                    if (!object3.c.contains(this)) {
                        object2 = null;
                    }
                }
                object3 = x8;
                if (x8 != null) {
                    object3 = x8;
                    if (!x8.c.contains(this)) {
                        object3 = null;
                    }
                }
                if (object2 == null && object3 == null || object2 != null && object3 != null && !this.M((x)object2, (x)object3) || (x8 = this.r((ViewGroup)object, (x)object2, (x)object3)) == null) continue;
                if (object3 != null) {
                    object2 = object3.b;
                    object3 = this.K();
                    if (object3 != null && ((String[])object3).length > 0) {
                        String string;
                        x x9 = new x((View)object2);
                        Object object4 = y8.a.get(object2);
                        if (object4 != null) {
                            for (n8 = 0; n8 < ((String[])object3).length; ++n8) {
                                Map<String, Object> map = x9.a;
                                string = object3[n8];
                                map.put(string, ((x)object4).a.get(string));
                            }
                        }
                        int n11 = a8.size();
                        for (n8 = 0; n8 < n11; ++n8) {
                            object3 = a8.get((Object)((Animator)a8.f(n8)));
                            if (object3.c == null || object3.a != object2) continue;
                            string = object3.b;
                            object4 = object2;
                            if (!string.equals(this.z()) || !object3.c.equals(x9)) continue;
                            x8 = null;
                            object3 = x9;
                            object2 = object4;
                            break block14;
                        }
                        object3 = x9;
                    } else {
                        object3 = null;
                    }
                } else {
                    object2 = ((x)object2).b;
                    object3 = null;
                }
            }
            if (x8 == null) continue;
            a8.put((Animator)x8, new d((View)object2, this.z(), this, object.getWindowId(), (x)object3, (Animator)x8));
            this.F0.add((Animator)x8);
        }
        if (sparseIntArray.size() != 0) {
            for (n9 = 0; n9 < sparseIntArray.size(); ++n9) {
                n8 = sparseIntArray.keyAt(n9);
                object = a8.get((Object)this.F0.get(n8));
                long l8 = sparseIntArray.valueAt(n9);
                long l9 = object.f.getStartDelay();
                object.f.setStartDelay(l8 - Long.MAX_VALUE + l9);
            }
        }
    }

    protected void t() {
        int n8;
        this.A0 = n8 = this.A0 - 1;
        if (n8 == 0) {
            View view;
            this.V(g.b, false);
            for (n8 = 0; n8 < this.q0.c.n(); ++n8) {
                view = this.q0.c.o(n8);
                if (view == null) continue;
                view.setHasTransientState(false);
            }
            for (n8 = 0; n8 < this.r0.c.n(); ++n8) {
                view = this.r0.c.o(n8);
                if (view == null) continue;
                view.setHasTransientState(false);
            }
            this.C0 = true;
        }
    }

    public String toString() {
        return this.l0("");
    }

    public long v() {
        return this.d0;
    }

    public e w() {
        return this.G0;
    }

    public TimeInterpolator x() {
        return this.e0;
    }

    x y(View object, boolean bl) {
        int n8;
        block6: {
            Cloneable cloneable = this.s0;
            if (cloneable != null) {
                return ((k)cloneable).y((View)object, bl);
            }
            cloneable = bl ? this.u0 : this.v0;
            if (cloneable == null) {
                return null;
            }
            int n9 = ((ArrayList)cloneable).size();
            for (n8 = 0; n8 < n9; ++n8) {
                x x8 = (x)((ArrayList)cloneable).get(n8);
                if (x8 == null) {
                    return null;
                }
                if (x8.b != object) {
                    continue;
                }
                break block6;
            }
            n8 = -1;
        }
        if (n8 >= 0) {
            object = bl ? this.v0 : this.u0;
            return (x)((ArrayList)object).get(n8);
        }
        return null;
    }

    public String z() {
        return this.q;
    }

    private static class d {
        View a;
        String b;
        x c;
        WindowId d;
        k e;
        Animator f;

        d(View view, String string, k k8, WindowId windowId, x x8, Animator animator) {
            this.a = view;
            this.b = string;
            this.c = x8;
            this.d = windowId;
            this.e = k8;
            this.f = animator;
        }
    }

    public static abstract class e {
    }

    public static interface f {
        public void a(k var1);

        public void b(k var1, boolean var2);

        public void c(k var1, boolean var2);

        public void d(k var1);

        public void e(k var1);

        public void f(k var1);

        public void g(k var1);
    }

    static interface g {
        public static final g a = new m();
        public static final g b = new n();
        public static final g c = new o();
        public static final g d = new p();
        public static final g e = new q();

        public void a(f var1, k var2, boolean var3);
    }
}

