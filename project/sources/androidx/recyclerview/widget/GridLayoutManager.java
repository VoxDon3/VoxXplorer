package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ax.d0.H;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    boolean I;
    int J;
    int[] K;
    View[] L;
    final SparseIntArray M;
    final SparseIntArray N;
    c O;
    final Rect P;
    private boolean Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i) {
            return 1;
        }
    }

    public static abstract class c {
        final SparseIntArray a = new SparseIntArray();
        final SparseIntArray b = new SparseIntArray();
        private boolean c = false;
        private boolean d = false;

        static int a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        int b(int i, int i2) {
            if (!this.d) {
                return d(i, i2);
            }
            int i3 = this.b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = d(i, i2);
            this.b.put(i, d);
            return d;
        }

        int c(int i, int i2) {
            if (!this.c) {
                return e(i, i2);
            }
            int i3 = this.a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = e(i, i2);
            this.a.put(i, e);
            return e;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.d
                r1 = 0
                if (r0 == 0) goto L25
                android.util.SparseIntArray r0 = r6.b
                int r0 = a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L25
                android.util.SparseIntArray r2 = r6.b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.c(r0, r8)
                int r0 = r6.f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L28
                int r2 = r2 + 1
            L23:
                r4 = 0
                goto L28
            L25:
                r2 = 0
                r3 = 0
                goto L23
            L28:
                int r0 = r6.f(r7)
            L2c:
                if (r3 >= r7) goto L41
                int r5 = r6.f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L39
                int r2 = r2 + 1
                r4 = 0
                goto L3e
            L39:
                if (r4 <= r8) goto L3e
                int r2 = r2 + 1
                r4 = r5
            L3e:
                int r3 = r3 + 1
                goto L2c
            L41:
                int r4 = r4 + r0
                if (r4 <= r8) goto L46
                int r2 = r2 + 1
            L46:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.d(int, int):int");
        }

        public abstract int e(int i, int i2);

        public abstract int f(int i);

        public void g() {
            this.b.clear();
        }

        public void h() {
            this.a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        g3(RecyclerView.p.n0(context, attributeSet, i, i2).b);
    }

    private void P2(RecyclerView.w wVar, RecyclerView.B b2, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i3 = i;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View view = this.L[i2];
            b bVar = (b) view.getLayoutParams();
            int c3 = c3(wVar, b2, m0(view));
            bVar.f = c3;
            bVar.e = i5;
            i5 += c3;
            i2 += i4;
        }
    }

    private void Q2() {
        int P = P();
        for (int i = 0; i < P; i++) {
            b bVar = (b) O(i).getLayoutParams();
            int a2 = bVar.a();
            this.M.put(a2, bVar.f());
            this.N.put(a2, bVar.e());
        }
    }

    private void R2(int i) {
        this.K = S2(this.K, this.J, i);
    }

    static int[] S2(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    private void T2() {
        this.M.clear();
        this.N.clear();
    }

    private int U2(RecyclerView.B b2) {
        if (P() != 0 && b2.b() != 0) {
            Y1();
            boolean s2 = s2();
            View c2 = c2(!s2, true);
            View b22 = b2(!s2, true);
            if (c2 != null && b22 != null) {
                int b3 = this.O.b(m0(c2), this.J);
                int b4 = this.O.b(m0(b22), this.J);
                int max = this.x ? Math.max(0, ((this.O.b(b2.b() - 1, this.J) + 1) - Math.max(b3, b4)) - 1) : Math.max(0, Math.min(b3, b4));
                if (s2) {
                    return Math.round((max * (Math.abs(this.u.d(b22) - this.u.g(c2)) / ((this.O.b(m0(b22), this.J) - this.O.b(m0(c2), this.J)) + 1))) + (this.u.m() - this.u.g(c2)));
                }
                return max;
            }
        }
        return 0;
    }

    private int V2(RecyclerView.B b2) {
        if (P() != 0 && b2.b() != 0) {
            Y1();
            View c2 = c2(!s2(), true);
            View b22 = b2(!s2(), true);
            if (c2 != null && b22 != null) {
                if (!s2()) {
                    return this.O.b(b2.b() - 1, this.J) + 1;
                }
                int d = this.u.d(b22) - this.u.g(c2);
                int b3 = this.O.b(m0(c2), this.J);
                return (int) ((d / ((this.O.b(m0(b22), this.J) - b3) + 1)) * (this.O.b(b2.b() - 1, this.J) + 1));
            }
        }
        return 0;
    }

    private void W2(RecyclerView.w wVar, RecyclerView.B b2, LinearLayoutManager.a aVar, int i) {
        boolean z = i == 1;
        int b3 = b3(wVar, b2, aVar.b);
        if (z) {
            while (b3 > 0) {
                int i2 = aVar.b;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                aVar.b = i3;
                b3 = b3(wVar, b2, i3);
            }
            return;
        }
        int b4 = b2.b() - 1;
        int i4 = aVar.b;
        while (i4 < b4) {
            int i5 = i4 + 1;
            int b32 = b3(wVar, b2, i5);
            if (b32 <= b3) {
                break;
            }
            i4 = i5;
            b3 = b32;
        }
        aVar.b = i4;
    }

    private void X2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    private int a3(RecyclerView.w wVar, RecyclerView.B b2, int i) {
        if (!b2.e()) {
            return this.O.b(i, this.J);
        }
        int f = wVar.f(i);
        if (f != -1) {
            return this.O.b(f, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    private int b3(RecyclerView.w wVar, RecyclerView.B b2, int i) {
        if (!b2.e()) {
            return this.O.c(i, this.J);
        }
        int i2 = this.N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = wVar.f(i);
        if (f != -1) {
            return this.O.c(f, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    private int c3(RecyclerView.w wVar, RecyclerView.B b2, int i) {
        if (!b2.e()) {
            return this.O.f(i);
        }
        int i2 = this.M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = wVar.f(i);
        if (f != -1) {
            return this.O.f(f);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    private void d3(float f, int i) {
        R2(Math.max(Math.round(f * this.J), i));
    }

    private void e3(View view, int i, boolean z) {
        int i2;
        int i3;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int Y2 = Y2(bVar.e, bVar.f);
        if (this.s == 1) {
            i3 = RecyclerView.p.Q(Y2, i, i5, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i2 = RecyclerView.p.Q(this.u.n(), d0(), i4, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int Q = RecyclerView.p.Q(Y2, i, i4, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int Q2 = RecyclerView.p.Q(this.u.n(), u0(), i5, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i2 = Q;
            i3 = Q2;
        }
        f3(view, i3, i2, z);
    }

    private void f3(View view, int i, int i2, boolean z) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z ? M1(view, i, i2, qVar) : K1(view, i, i2, qVar)) {
            view.measure(i, i2);
        }
    }

    private void h3() {
        int c0;
        int l0;
        if (q2() == 1) {
            c0 = t0() - k0();
            l0 = j0();
        } else {
            c0 = c0() - i0();
            l0 = l0();
        }
        R2(c0 - l0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.B b2) {
        return this.Q ? U2(b2) : super.A(b2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int B(RecyclerView.B b2) {
        return this.Q ? V2(b2) : super.B(b2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int B1(int i, RecyclerView.w wVar, RecyclerView.B b2) {
        h3();
        X2();
        return super.B1(i, wVar, b2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int D1(int i, RecyclerView.w wVar, RecyclerView.B b2) {
        h3();
        X2();
        return super.D1(i, wVar, b2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void G2(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.G2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H1(Rect rect, int i, int i2) {
        int t;
        int t2;
        if (this.K == null) {
            super.H1(rect, i, i2);
        }
        int j0 = j0() + k0();
        int l0 = l0() + i0();
        if (this.s == 1) {
            t2 = RecyclerView.p.t(i2, rect.height() + l0, g0());
            int[] iArr = this.K;
            t = RecyclerView.p.t(i, iArr[iArr.length - 1] + j0, h0());
        } else {
            t = RecyclerView.p.t(i, rect.width() + j0, h0());
            int[] iArr2 = this.K;
            t2 = RecyclerView.p.t(i2, iArr2[iArr2.length - 1] + l0, g0());
        }
        G1(t, t2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q J() {
        return this.s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q K(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q L(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f3, code lost:
    
        if (r13 == (r2 > r4)) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View O0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.B r27) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.O0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean Q1() {
        return this.D == null && !this.I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(RecyclerView.w wVar, RecyclerView.B b2, H h) {
        super.R0(wVar, b2, h);
        h.m0(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void S1(RecyclerView.B b2, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int i = this.J;
        for (int i2 = 0; i2 < this.J && cVar.c(b2) && i > 0; i2++) {
            int i3 = cVar.d;
            cVar2.a(i3, Math.max(0, cVar.g));
            i -= this.O.f(i3);
            cVar.d += cVar.e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int T(RecyclerView.w wVar, RecyclerView.B b2) {
        if (this.s == 1) {
            return this.J;
        }
        if (b2.b() < 1) {
            return 0;
        }
        return a3(wVar, b2, b2.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView.w wVar, RecyclerView.B b2, View view, H h) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.T0(view, h);
            return;
        }
        b bVar = (b) layoutParams;
        int a3 = a3(wVar, b2, bVar.a());
        if (this.s == 0) {
            h.p0(H.f.a(bVar.e(), bVar.f(), a3, 1, false, false));
        } else {
            h.p0(H.f.a(a3, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView, int i, int i2) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.O.h();
        this.O.g();
    }

    int Y2(int i, int i2) {
        if (this.s != 1 || !r2()) {
            int[] iArr = this.K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.K;
        int i3 = this.J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView recyclerView, int i, int i2) {
        this.O.h();
        this.O.g();
    }

    public int Z2() {
        return this.J;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView.w wVar, RecyclerView.B b2) {
        if (b2.e()) {
            Q2();
        }
        super.c1(wVar, b2);
        T2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView.B b2) {
        super.d1(b2);
        this.I = false;
    }

    public void g3(int i) {
        if (i == this.J) {
            return;
        }
        this.I = true;
        if (i >= 1) {
            this.J = i;
            this.O.h();
            y1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View k2(RecyclerView.w wVar, RecyclerView.B b2, boolean z, boolean z2) {
        int i;
        int i2;
        int P = P();
        int i3 = 1;
        if (z2) {
            i2 = P() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = P;
            i2 = 0;
        }
        int b3 = b2.b();
        Y1();
        int m = this.u.m();
        int i4 = this.u.i();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View O = O(i2);
            int m0 = m0(O);
            if (m0 >= 0 && m0 < b3 && b3(wVar, b2, m0) == 0) {
                if (((RecyclerView.q) O.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = O;
                    }
                } else {
                    if (this.u.g(O) < i4 && this.u.d(O) >= m) {
                        return O;
                    }
                    if (view == null) {
                        view = O;
                    }
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int p0(RecyclerView.w wVar, RecyclerView.B b2) {
        if (this.s == 0) {
            return this.J;
        }
        if (b2.b() < 1) {
            return 0;
        }
        return a3(wVar, b2, b2.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean s(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        r21.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void t2(androidx.recyclerview.widget.RecyclerView.w r18, androidx.recyclerview.widget.RecyclerView.B r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.t2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void v2(RecyclerView.w wVar, RecyclerView.B b2, LinearLayoutManager.a aVar, int i) {
        super.v2(wVar, b2, aVar, i);
        h3();
        if (b2.b() > 0 && !b2.e()) {
            W2(wVar, b2, aVar, i);
        }
        X2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.B b2) {
        return this.Q ? U2(b2) : super.x(b2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int y(RecyclerView.B b2) {
        return this.Q ? V2(b2) : super.y(b2);
    }

    public static class b extends RecyclerView.q {
        int e;
        int f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = -1;
            this.f = 0;
        }

        public int e() {
            return this.e;
        }

        public int f() {
            return this.f;
        }

        public b(int i, int i2) {
            super(i, i2);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.e = -1;
            this.f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.e = -1;
            this.f = 0;
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        g3(i);
    }
}
