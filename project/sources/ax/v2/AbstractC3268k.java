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
import ax.c0.C1760d0;
import ax.v2.AbstractC3268k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: ax.v2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3268k implements Cloneable {
    private static final Animator[] J0 = new Animator[0];
    private static final int[] K0 = {2, 1, 3, 4};
    private static final AbstractC3264g L0 = new a();
    private static ThreadLocal<ax.B.a<Animator, d>> M0 = new ThreadLocal<>();
    private e G0;
    private ax.B.a<String, String> H0;
    private ArrayList<x> u0;
    private ArrayList<x> v0;
    private f[] w0;
    private String q = getClass().getName();
    private long c0 = -1;
    long d0 = -1;
    private TimeInterpolator e0 = null;
    ArrayList<Integer> f0 = new ArrayList<>();
    ArrayList<View> g0 = new ArrayList<>();
    private ArrayList<String> h0 = null;
    private ArrayList<Class<?>> i0 = null;
    private ArrayList<Integer> j0 = null;
    private ArrayList<View> k0 = null;
    private ArrayList<Class<?>> l0 = null;
    private ArrayList<String> m0 = null;
    private ArrayList<Integer> n0 = null;
    private ArrayList<View> o0 = null;
    private ArrayList<Class<?>> p0 = null;
    private y q0 = new y();
    private y r0 = new y();
    v s0 = null;
    private int[] t0 = K0;
    boolean x0 = false;
    ArrayList<Animator> y0 = new ArrayList<>();
    private Animator[] z0 = J0;
    int A0 = 0;
    private boolean B0 = false;
    boolean C0 = false;
    private AbstractC3268k D0 = null;
    private ArrayList<f> E0 = null;
    ArrayList<Animator> F0 = new ArrayList<>();
    private AbstractC3264g I0 = L0;

    /* renamed from: ax.v2.k$a */
    class a extends AbstractC3264g {
        a() {
        }

        @Override // ax.v2.AbstractC3264g
        public Path a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: ax.v2.k$b */
    class b extends AnimatorListenerAdapter {
        final /* synthetic */ ax.B.a a;

        b(ax.B.a aVar) {
            this.a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.remove(animator);
            AbstractC3268k.this.y0.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC3268k.this.y0.add(animator);
        }
    }

    /* renamed from: ax.v2.k$c */
    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3268k.this.t();
            animator.removeListener(this);
        }
    }

    /* renamed from: ax.v2.k$d */
    private static class d {
        View a;
        String b;
        x c;
        WindowId d;
        AbstractC3268k e;
        Animator f;

        d(View view, String str, AbstractC3268k abstractC3268k, WindowId windowId, x xVar, Animator animator) {
            this.a = view;
            this.b = str;
            this.c = xVar;
            this.d = windowId;
            this.e = abstractC3268k;
            this.f = animator;
        }
    }

    /* renamed from: ax.v2.k$e */
    public static abstract class e {
    }

    /* renamed from: ax.v2.k$f */
    public interface f {
        void a(AbstractC3268k abstractC3268k);

        void b(AbstractC3268k abstractC3268k, boolean z);

        void c(AbstractC3268k abstractC3268k, boolean z);

        void d(AbstractC3268k abstractC3268k);

        void e(AbstractC3268k abstractC3268k);

        void f(AbstractC3268k abstractC3268k);

        void g(AbstractC3268k abstractC3268k);
    }

    /* renamed from: ax.v2.k$g */
    interface g {
        public static final g a = new g() { // from class: ax.v2.m
            @Override // ax.v2.AbstractC3268k.g
            public final void a(AbstractC3268k.f fVar, AbstractC3268k abstractC3268k, boolean z) {
                fVar.c(abstractC3268k, z);
            }
        };
        public static final g b = new g() { // from class: ax.v2.n
            @Override // ax.v2.AbstractC3268k.g
            public final void a(AbstractC3268k.f fVar, AbstractC3268k abstractC3268k, boolean z) {
                fVar.b(abstractC3268k, z);
            }
        };
        public static final g c = new g() { // from class: ax.v2.o
            @Override // ax.v2.AbstractC3268k.g
            public final void a(AbstractC3268k.f fVar, AbstractC3268k abstractC3268k, boolean z) {
                fVar.e(abstractC3268k);
            }
        };
        public static final g d = new g() { // from class: ax.v2.p
            @Override // ax.v2.AbstractC3268k.g
            public final void a(AbstractC3268k.f fVar, AbstractC3268k abstractC3268k, boolean z) {
                fVar.d(abstractC3268k);
            }
        };
        public static final g e = new g() { // from class: ax.v2.q
            @Override // ax.v2.AbstractC3268k.g
            public final void a(AbstractC3268k.f fVar, AbstractC3268k abstractC3268k, boolean z) {
                fVar.f(abstractC3268k);
            }
        };

        void a(f fVar, AbstractC3268k abstractC3268k, boolean z);
    }

    private static ax.B.a<Animator, d> E() {
        ax.B.a<Animator, d> aVar = M0.get();
        if (aVar != null) {
            return aVar;
        }
        ax.B.a<Animator, d> aVar2 = new ax.B.a<>();
        M0.set(aVar2);
        return aVar2;
    }

    private static boolean O(x xVar, x xVar2, String str) {
        Object obj = xVar.a.get(str);
        Object obj2 = xVar2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void P(ax.B.a<View, x> aVar, ax.B.a<View, x> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && N(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && N(view)) {
                x xVar = aVar.get(valueAt);
                x xVar2 = aVar2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.u0.add(xVar);
                    this.v0.add(xVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void Q(ax.B.a<View, x> aVar, ax.B.a<View, x> aVar2) {
        x remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View f2 = aVar.f(size);
            if (f2 != null && N(f2) && (remove = aVar2.remove(f2)) != null && N(remove.b)) {
                this.u0.add(aVar.i(size));
                this.v0.add(remove);
            }
        }
    }

    private void R(ax.B.a<View, x> aVar, ax.B.a<View, x> aVar2, ax.B.h<View> hVar, ax.B.h<View> hVar2) {
        View f2;
        int n = hVar.n();
        for (int i = 0; i < n; i++) {
            View o = hVar.o(i);
            if (o != null && N(o) && (f2 = hVar2.f(hVar.j(i))) != null && N(f2)) {
                x xVar = aVar.get(o);
                x xVar2 = aVar2.get(f2);
                if (xVar != null && xVar2 != null) {
                    this.u0.add(xVar);
                    this.v0.add(xVar2);
                    aVar.remove(o);
                    aVar2.remove(f2);
                }
            }
        }
    }

    private void S(ax.B.a<View, x> aVar, ax.B.a<View, x> aVar2, ax.B.a<String, View> aVar3, ax.B.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View k = aVar3.k(i);
            if (k != null && N(k) && (view = aVar4.get(aVar3.f(i))) != null && N(view)) {
                x xVar = aVar.get(k);
                x xVar2 = aVar2.get(view);
                if (xVar != null && xVar2 != null) {
                    this.u0.add(xVar);
                    this.v0.add(xVar2);
                    aVar.remove(k);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void T(y yVar, y yVar2) {
        ax.B.a<View, x> aVar = new ax.B.a<>(yVar.a);
        ax.B.a<View, x> aVar2 = new ax.B.a<>(yVar2.a);
        int i = 0;
        while (true) {
            int[] iArr = this.t0;
            if (i >= iArr.length) {
                d(aVar, aVar2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                Q(aVar, aVar2);
            } else if (i2 == 2) {
                S(aVar, aVar2, yVar.d, yVar2.d);
            } else if (i2 == 3) {
                P(aVar, aVar2, yVar.b, yVar2.b);
            } else if (i2 == 4) {
                R(aVar, aVar2, yVar.c, yVar2.c);
            }
            i++;
        }
    }

    private void U(AbstractC3268k abstractC3268k, g gVar, boolean z) {
        AbstractC3268k abstractC3268k2 = this.D0;
        if (abstractC3268k2 != null) {
            abstractC3268k2.U(abstractC3268k, gVar, z);
        }
        ArrayList<f> arrayList = this.E0;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.E0.size();
        f[] fVarArr = this.w0;
        if (fVarArr == null) {
            fVarArr = new f[size];
        }
        this.w0 = null;
        f[] fVarArr2 = (f[]) this.E0.toArray(fVarArr);
        for (int i = 0; i < size; i++) {
            gVar.a(fVarArr2[i], abstractC3268k, z);
            fVarArr2[i] = null;
        }
        this.w0 = fVarArr2;
    }

    private void c0(Animator animator, ax.B.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            h(animator);
        }
    }

    private void d(ax.B.a<View, x> aVar, ax.B.a<View, x> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            x k = aVar.k(i);
            if (N(k.b)) {
                this.u0.add(k);
                this.v0.add(null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            x k2 = aVar2.k(i2);
            if (N(k2.b)) {
                this.v0.add(k2);
                this.u0.add(null);
            }
        }
    }

    private static void f(y yVar, View view, x xVar) {
        yVar.a.put(view, xVar);
        int id = view.getId();
        if (id >= 0) {
            if (yVar.b.indexOfKey(id) >= 0) {
                yVar.b.put(id, null);
            } else {
                yVar.b.put(id, view);
            }
        }
        String I = C1760d0.I(view);
        if (I != null) {
            if (yVar.d.containsKey(I)) {
                yVar.d.put(I, null);
            } else {
                yVar.d.put(I, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (yVar.c.i(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    yVar.c.k(itemIdAtPosition, view);
                    return;
                }
                View f2 = yVar.c.f(itemIdAtPosition);
                if (f2 != null) {
                    f2.setHasTransientState(false);
                    yVar.c.k(itemIdAtPosition, null);
                }
            }
        }
    }

    private void j(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.j0;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.k0;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.l0;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.l0.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    x xVar = new x(view);
                    if (z) {
                        l(xVar);
                    } else {
                        i(xVar);
                    }
                    xVar.c.add(this);
                    k(xVar);
                    if (z) {
                        f(this.q0, view, xVar);
                    } else {
                        f(this.r0, view, xVar);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.n0;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.o0;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.p0;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.p0.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                j(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    public AbstractC3264g B() {
        return this.I0;
    }

    public u C() {
        return null;
    }

    public final AbstractC3268k D() {
        v vVar = this.s0;
        return vVar != null ? vVar.D() : this;
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

    public x L(View view, boolean z) {
        v vVar = this.s0;
        if (vVar != null) {
            return vVar.L(view, z);
        }
        return (z ? this.q0 : this.r0).a.get(view);
    }

    public boolean M(x xVar, x xVar2) {
        if (xVar != null && xVar2 != null) {
            String[] K = K();
            if (K != null) {
                for (String str : K) {
                    if (O(xVar, xVar2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator<String> it = xVar.a.keySet().iterator();
                while (it.hasNext()) {
                    if (O(xVar, xVar2, it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean N(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.j0;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.k0;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.l0;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.l0.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.m0 != null && C1760d0.I(view) != null && this.m0.contains(C1760d0.I(view))) {
            return false;
        }
        if ((this.f0.size() == 0 && this.g0.size() == 0 && (((arrayList = this.i0) == null || arrayList.isEmpty()) && ((arrayList2 = this.h0) == null || arrayList2.isEmpty()))) || this.f0.contains(Integer.valueOf(id)) || this.g0.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.h0;
        if (arrayList6 != null && arrayList6.contains(C1760d0.I(view))) {
            return true;
        }
        if (this.i0 != null) {
            for (int i2 = 0; i2 < this.i0.size(); i2++) {
                if (this.i0.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    void V(g gVar, boolean z) {
        U(this, gVar, z);
    }

    public void X(View view) {
        if (this.C0) {
            return;
        }
        int size = this.y0.size();
        Animator[] animatorArr = (Animator[]) this.y0.toArray(this.z0);
        this.z0 = J0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.z0 = animatorArr;
        V(g.d, false);
        this.B0 = true;
    }

    void Y(ViewGroup viewGroup) {
        d dVar;
        this.u0 = new ArrayList<>();
        this.v0 = new ArrayList<>();
        T(this.q0, this.r0);
        ax.B.a<Animator, d> E = E();
        int size = E.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i = size - 1; i >= 0; i--) {
            Animator f2 = E.f(i);
            if (f2 != null && (dVar = E.get(f2)) != null && dVar.a != null && windowId.equals(dVar.d)) {
                x xVar = dVar.c;
                View view = dVar.a;
                x L = L(view, true);
                x y = y(view, true);
                if (L == null && y == null) {
                    y = this.r0.a.get(view);
                }
                if ((L != null || y != null) && dVar.e.M(xVar, y)) {
                    dVar.e.D().getClass();
                    if (f2.isRunning() || f2.isStarted()) {
                        f2.cancel();
                    } else {
                        E.remove(f2);
                    }
                }
            }
        }
        s(viewGroup, this.q0, this.r0, this.u0, this.v0);
        d0();
    }

    public AbstractC3268k Z(f fVar) {
        AbstractC3268k abstractC3268k;
        ArrayList<f> arrayList = this.E0;
        if (arrayList != null) {
            if (!arrayList.remove(fVar) && (abstractC3268k = this.D0) != null) {
                abstractC3268k.Z(fVar);
            }
            if (this.E0.size() == 0) {
                this.E0 = null;
            }
        }
        return this;
    }

    public AbstractC3268k a0(View view) {
        this.g0.remove(view);
        return this;
    }

    public AbstractC3268k b(f fVar) {
        if (this.E0 == null) {
            this.E0 = new ArrayList<>();
        }
        this.E0.add(fVar);
        return this;
    }

    public void b0(View view) {
        if (this.B0) {
            if (!this.C0) {
                int size = this.y0.size();
                Animator[] animatorArr = (Animator[]) this.y0.toArray(this.z0);
                this.z0 = J0;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.z0 = animatorArr;
                V(g.e, false);
            }
            this.B0 = false;
        }
    }

    public AbstractC3268k c(View view) {
        this.g0.add(view);
        return this;
    }

    protected void cancel() {
        int size = this.y0.size();
        Animator[] animatorArr = (Animator[]) this.y0.toArray(this.z0);
        this.z0 = J0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.z0 = animatorArr;
        V(g.c, false);
    }

    protected void d0() {
        k0();
        ax.B.a<Animator, d> E = E();
        ArrayList<Animator> arrayList = this.F0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Animator animator = arrayList.get(i);
            i++;
            Animator animator2 = animator;
            if (E.containsKey(animator2)) {
                k0();
                c0(animator2, E);
            }
        }
        this.F0.clear();
        t();
    }

    public AbstractC3268k e0(long j) {
        this.d0 = j;
        return this;
    }

    public void f0(e eVar) {
        this.G0 = eVar;
    }

    public AbstractC3268k g0(TimeInterpolator timeInterpolator) {
        this.e0 = timeInterpolator;
        return this;
    }

    protected void h(Animator animator) {
        if (animator == null) {
            t();
            return;
        }
        if (v() >= 0) {
            animator.setDuration(v());
        }
        if (F() >= 0) {
            animator.setStartDelay(F() + animator.getStartDelay());
        }
        if (x() != null) {
            animator.setInterpolator(x());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void h0(AbstractC3264g abstractC3264g) {
        if (abstractC3264g == null) {
            this.I0 = L0;
        } else {
            this.I0 = abstractC3264g;
        }
    }

    public abstract void i(x xVar);

    public AbstractC3268k j0(long j) {
        this.c0 = j;
        return this;
    }

    protected void k0() {
        if (this.A0 == 0) {
            V(g.a, false);
            this.C0 = false;
        }
        this.A0++;
    }

    public abstract void l(x xVar);

    String l0(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.d0 != -1) {
            sb.append("dur(");
            sb.append(this.d0);
            sb.append(") ");
        }
        if (this.c0 != -1) {
            sb.append("dly(");
            sb.append(this.c0);
            sb.append(") ");
        }
        if (this.e0 != null) {
            sb.append("interp(");
            sb.append(this.e0);
            sb.append(") ");
        }
        if (this.f0.size() > 0 || this.g0.size() > 0) {
            sb.append("tgts(");
            if (this.f0.size() > 0) {
                for (int i = 0; i < this.f0.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.f0.get(i));
                }
            }
            if (this.g0.size() > 0) {
                for (int i2 = 0; i2 < this.g0.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.g0.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    void m(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        ax.B.a<String, String> aVar;
        n(z);
        if ((this.f0.size() > 0 || this.g0.size() > 0) && (((arrayList = this.h0) == null || arrayList.isEmpty()) && ((arrayList2 = this.i0) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f0.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f0.get(i).intValue());
                if (findViewById != null) {
                    x xVar = new x(findViewById);
                    if (z) {
                        l(xVar);
                    } else {
                        i(xVar);
                    }
                    xVar.c.add(this);
                    k(xVar);
                    if (z) {
                        f(this.q0, findViewById, xVar);
                    } else {
                        f(this.r0, findViewById, xVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.g0.size(); i2++) {
                View view = this.g0.get(i2);
                x xVar2 = new x(view);
                if (z) {
                    l(xVar2);
                } else {
                    i(xVar2);
                }
                xVar2.c.add(this);
                k(xVar2);
                if (z) {
                    f(this.q0, view, xVar2);
                } else {
                    f(this.r0, view, xVar2);
                }
            }
        } else {
            j(viewGroup, z);
        }
        if (z || (aVar = this.H0) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.q0.d.remove(this.H0.f(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.q0.d.put(this.H0.k(i4), view2);
            }
        }
    }

    void n(boolean z) {
        if (z) {
            this.q0.a.clear();
            this.q0.b.clear();
            this.q0.c.c();
        } else {
            this.r0.a.clear();
            this.r0.b.clear();
            this.r0.c.c();
        }
    }

    @Override // 
    /* renamed from: o */
    public AbstractC3268k clone() {
        try {
            AbstractC3268k abstractC3268k = (AbstractC3268k) super.clone();
            abstractC3268k.F0 = new ArrayList<>();
            abstractC3268k.q0 = new y();
            abstractC3268k.r0 = new y();
            abstractC3268k.u0 = null;
            abstractC3268k.v0 = null;
            abstractC3268k.D0 = this;
            abstractC3268k.E0 = null;
            return abstractC3268k;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator r(ViewGroup viewGroup, x xVar, x xVar2) {
        return null;
    }

    void s(ViewGroup viewGroup, y yVar, y yVar2, ArrayList<x> arrayList, ArrayList<x> arrayList2) {
        View view;
        Animator animator;
        x xVar;
        View view2;
        Animator animator2;
        ax.B.a<Animator, d> E = E();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        D().getClass();
        for (int i = 0; i < size; i++) {
            x xVar2 = arrayList.get(i);
            x xVar3 = arrayList2.get(i);
            if (xVar2 != null && !xVar2.c.contains(this)) {
                xVar2 = null;
            }
            if (xVar3 != null && !xVar3.c.contains(this)) {
                xVar3 = null;
            }
            if ((xVar2 != null || xVar3 != null) && (xVar2 == null || xVar3 == null || M(xVar2, xVar3))) {
                Animator r = r(viewGroup, xVar2, xVar3);
                if (r != null) {
                    if (xVar3 != null) {
                        View view3 = xVar3.b;
                        String[] K = K();
                        if (K != null && K.length > 0) {
                            xVar = new x(view3);
                            x xVar4 = yVar2.a.get(view3);
                            if (xVar4 != null) {
                                int i2 = 0;
                                while (i2 < K.length) {
                                    Map<String, Object> map = xVar.a;
                                    String[] strArr = K;
                                    String str = strArr[i2];
                                    map.put(str, xVar4.a.get(str));
                                    i2++;
                                    K = strArr;
                                }
                            }
                            int size2 = E.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size2) {
                                    view2 = view3;
                                    animator2 = r;
                                    break;
                                }
                                d dVar = E.get(E.f(i3));
                                if (dVar.c != null && dVar.a == view3) {
                                    view2 = view3;
                                    if (dVar.b.equals(z()) && dVar.c.equals(xVar)) {
                                        animator2 = null;
                                        break;
                                    }
                                } else {
                                    view2 = view3;
                                }
                                i3++;
                                view3 = view2;
                            }
                        } else {
                            view2 = view3;
                            animator2 = r;
                            xVar = null;
                        }
                        animator = animator2;
                        view = view2;
                    } else {
                        view = xVar2.b;
                        animator = r;
                        xVar = null;
                    }
                    if (animator != null) {
                        E.put(animator, new d(view, z(), this, viewGroup.getWindowId(), xVar, animator));
                        this.F0.add(animator);
                    }
                }
            }
        }
        if (sparseIntArray.size() != 0) {
            for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
                d dVar2 = E.get(this.F0.get(sparseIntArray.keyAt(i4)));
                dVar2.f.setStartDelay((sparseIntArray.valueAt(i4) - Long.MAX_VALUE) + dVar2.f.getStartDelay());
            }
        }
    }

    protected void t() {
        int i = this.A0 - 1;
        this.A0 = i;
        if (i == 0) {
            V(g.b, false);
            for (int i2 = 0; i2 < this.q0.c.n(); i2++) {
                View o = this.q0.c.o(i2);
                if (o != null) {
                    o.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.r0.c.n(); i3++) {
                View o2 = this.r0.c.o(i3);
                if (o2 != null) {
                    o2.setHasTransientState(false);
                }
            }
            this.C0 = true;
        }
    }

    public String toString() {
        return l0(HttpUrl.FRAGMENT_ENCODE_SET);
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

    x y(View view, boolean z) {
        v vVar = this.s0;
        if (vVar != null) {
            return vVar.y(view, z);
        }
        ArrayList<x> arrayList = z ? this.u0 : this.v0;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            x xVar = arrayList.get(i);
            if (xVar == null) {
                return null;
            }
            if (xVar.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (z ? this.v0 : this.u0).get(i);
        }
        return null;
    }

    public String z() {
        return this.q;
    }

    public void i0(u uVar) {
    }

    void k(x xVar) {
    }
}
