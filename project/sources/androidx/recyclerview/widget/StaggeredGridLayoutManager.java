package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.p implements RecyclerView.A.b {
    private BitSet B;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private int[] O;
    f[] t;
    o u;
    o v;
    private int w;
    private int x;
    private final k y;
    private int s = -1;
    boolean z = false;
    boolean A = false;
    int C = -1;
    int D = Integer.MIN_VALUE;
    d E = new d();
    private int F = 2;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private final Runnable P = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.X1();
        }
    }

    class b {
        int a;
        int b;
        boolean c;
        boolean d;
        boolean e;
        int[] f;

        b() {
            c();
        }

        void a() {
            this.b = this.c ? StaggeredGridLayoutManager.this.u.i() : StaggeredGridLayoutManager.this.u.m();
        }

        void b(int i) {
            if (this.c) {
                this.b = StaggeredGridLayoutManager.this.u.i() - i;
            } else {
                this.b = StaggeredGridLayoutManager.this.u.m() + i;
            }
        }

        void c() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f;
            if (iArr == null || iArr.length < length) {
                this.f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f[i] = fVarArr[i].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.q {
        f e;
        boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean e() {
            return this.f;
        }

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        int c0;
        int d0;
        int[] e0;
        int f0;
        int[] g0;
        List<d.a> h0;
        boolean i0;
        boolean j0;
        boolean k0;
        int q;

        class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e() {
        }

        void a() {
            this.e0 = null;
            this.d0 = 0;
            this.q = -1;
            this.c0 = -1;
        }

        void b() {
            this.e0 = null;
            this.d0 = 0;
            this.f0 = 0;
            this.g0 = null;
            this.h0 = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.q);
            parcel.writeInt(this.c0);
            parcel.writeInt(this.d0);
            if (this.d0 > 0) {
                parcel.writeIntArray(this.e0);
            }
            parcel.writeInt(this.f0);
            if (this.f0 > 0) {
                parcel.writeIntArray(this.g0);
            }
            parcel.writeInt(this.i0 ? 1 : 0);
            parcel.writeInt(this.j0 ? 1 : 0);
            parcel.writeInt(this.k0 ? 1 : 0);
            parcel.writeList(this.h0);
        }

        e(Parcel parcel) {
            this.q = parcel.readInt();
            this.c0 = parcel.readInt();
            int readInt = parcel.readInt();
            this.d0 = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.e0 = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f0 = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.g0 = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.i0 = parcel.readInt() == 1;
            this.j0 = parcel.readInt() == 1;
            this.k0 = parcel.readInt() == 1;
            this.h0 = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.d0 = eVar.d0;
            this.q = eVar.q;
            this.c0 = eVar.c0;
            this.e0 = eVar.e0;
            this.f0 = eVar.f0;
            this.g0 = eVar.g0;
            this.i0 = eVar.i0;
            this.j0 = eVar.j0;
            this.k0 = eVar.k0;
            this.h0 = eVar.h0;
        }
    }

    class f {
        ArrayList<View> a = new ArrayList<>();
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        int d = 0;
        final int e;

        f(int i) {
            this.e = i;
        }

        void a(View view) {
            c n = n(view);
            n.e = this;
            this.a.add(view);
            this.c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        void b(boolean z, int i) {
            int l = z ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (l == Integer.MIN_VALUE) {
                return;
            }
            if (!z || l >= StaggeredGridLayoutManager.this.u.i()) {
                if (z || l <= StaggeredGridLayoutManager.this.u.m()) {
                    if (i != Integer.MIN_VALUE) {
                        l += i;
                    }
                    this.c = l;
                    this.b = l;
                }
            }
        }

        void c() {
            d.a f;
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            c n = n(view);
            this.c = StaggeredGridLayoutManager.this.u.d(view);
            if (n.f && (f = StaggeredGridLayoutManager.this.E.f(n.a())) != null && f.c0 == 1) {
                this.c += f.a(this.e);
            }
        }

        void d() {
            d.a f;
            View view = this.a.get(0);
            c n = n(view);
            this.b = StaggeredGridLayoutManager.this.u.g(view);
            if (n.f && (f = StaggeredGridLayoutManager.this.E.f(n.a())) != null && f.c0 == -1) {
                this.b -= f.a(this.e);
            }
        }

        void e() {
            this.a.clear();
            q();
            this.d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.z ? i(this.a.size() - 1, -1, true) : i(0, this.a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.z ? i(0, this.a.size(), true) : i(this.a.size() - 1, -1, true);
        }

        int h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.u.m();
            int i3 = StaggeredGridLayoutManager.this.u.i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.a.get(i);
                int g = StaggeredGridLayoutManager.this.u.g(view);
                int d = StaggeredGridLayoutManager.this.u.d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g >= i3 : g > i3;
                if (!z3 ? d > m : d >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (g >= m && d <= i3) {
                            return StaggeredGridLayoutManager.this.m0(view);
                        }
                    } else {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.m0(view);
                        }
                        if (g < m || d > i3) {
                            return StaggeredGridLayoutManager.this.m0(view);
                        }
                    }
                }
                i += i4;
            }
            return -1;
        }

        int i(int i, int i2, boolean z) {
            return h(i, i2, false, false, z);
        }

        public int j() {
            return this.d;
        }

        int k() {
            int i = this.c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            c();
            return this.c;
        }

        int l(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            c();
            return this.c;
        }

        public View m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = this.a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.m0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.m0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.a.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = this.a.get(i3);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.m0(view3) <= i) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.m0(view3) >= i) || !view3.hasFocusable()) {
                    break;
                }
                i3++;
                view = view3;
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i = this.b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            d();
            return this.b;
        }

        int p(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            d();
            return this.b;
        }

        void q() {
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
        }

        void r(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                this.b = i2 + i;
            }
            int i3 = this.c;
            if (i3 != Integer.MIN_VALUE) {
                this.c = i3 + i;
            }
        }

        void s() {
            int size = this.a.size();
            View remove = this.a.remove(size - 1);
            c n = n(remove);
            n.e = null;
            if (n.c() || n.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(remove);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        void t() {
            View remove = this.a.remove(0);
            c n = n(remove);
            n.e = null;
            if (this.a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(remove);
            }
            this.b = Integer.MIN_VALUE;
        }

        void u(View view) {
            c n = n(view);
            n.e = this;
            this.a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        void v(int i) {
            this.b = i;
            this.c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.p.d n0 = RecyclerView.p.n0(context, attributeSet, i, i2);
        M2(n0.a);
        O2(n0.b);
        N2(n0.c);
        this.y = new k();
        f2();
    }

    private void A2(View view, c cVar, boolean z) {
        if (cVar.f) {
            if (this.w == 1) {
                z2(view, this.J, RecyclerView.p.Q(c0(), d0(), l0() + i0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
                return;
            } else {
                z2(view, RecyclerView.p.Q(t0(), u0(), j0() + k0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z);
                return;
            }
        }
        if (this.w == 1) {
            z2(view, RecyclerView.p.Q(this.x, u0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.p.Q(c0(), d0(), l0() + i0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z);
        } else {
            z2(view, RecyclerView.p.Q(t0(), u0(), j0() + k0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.p.Q(this.x, d0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:
    
        if (X1() != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void B2(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.B r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.B2(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$B, boolean):void");
    }

    private boolean C2(int i) {
        if (this.w == 0) {
            return (i == -1) != this.A;
        }
        return ((i == -1) == this.A) == y2();
    }

    private void E2(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].u(view);
        }
    }

    private void F2(RecyclerView.w wVar, k kVar) {
        if (!kVar.a || kVar.i) {
            return;
        }
        if (kVar.b == 0) {
            if (kVar.e == -1) {
                G2(wVar, kVar.g);
                return;
            } else {
                H2(wVar, kVar.f);
                return;
            }
        }
        if (kVar.e != -1) {
            int s2 = s2(kVar.g) - kVar.g;
            H2(wVar, s2 < 0 ? kVar.f : Math.min(s2, kVar.b) + kVar.f);
        } else {
            int i = kVar.f;
            int r2 = i - r2(i);
            G2(wVar, r2 < 0 ? kVar.g : kVar.g - Math.min(r2, kVar.b));
        }
    }

    private void G2(RecyclerView.w wVar, int i) {
        for (int P = P() - 1; P >= 0; P--) {
            View O = O(P);
            if (this.u.g(O) < i || this.u.q(O) < i) {
                return;
            }
            c cVar = (c) O.getLayoutParams();
            if (cVar.f) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    if (this.t[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].s();
                }
            } else if (cVar.e.a.size() == 1) {
                return;
            } else {
                cVar.e.s();
            }
            r1(O, wVar);
        }
    }

    private void H2(RecyclerView.w wVar, int i) {
        while (P() > 0) {
            View O = O(0);
            if (this.u.d(O) > i || this.u.p(O) > i) {
                return;
            }
            c cVar = (c) O.getLayoutParams();
            if (cVar.f) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    if (this.t[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].t();
                }
            } else if (cVar.e.a.size() == 1) {
                return;
            } else {
                cVar.e.t();
            }
            r1(O, wVar);
        }
    }

    private void I2() {
        if (this.v.k() == 1073741824) {
            return;
        }
        int P = P();
        float f2 = 0.0f;
        for (int i = 0; i < P; i++) {
            View O = O(i);
            float e2 = this.v.e(O);
            if (e2 >= f2) {
                if (((c) O.getLayoutParams()).e()) {
                    e2 = (e2 * 1.0f) / this.s;
                }
                f2 = Math.max(f2, e2);
            }
        }
        int i2 = this.x;
        int round = Math.round(f2 * this.s);
        if (this.v.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.v.n());
        }
        U2(round);
        if (this.x == i2) {
            return;
        }
        for (int i3 = 0; i3 < P; i3++) {
            View O2 = O(i3);
            c cVar = (c) O2.getLayoutParams();
            if (!cVar.f) {
                if (y2() && this.w == 1) {
                    int i4 = this.s;
                    int i5 = cVar.e.e;
                    O2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.x) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = cVar.e.e;
                    int i7 = this.x * i6;
                    int i8 = i6 * i2;
                    if (this.w == 1) {
                        O2.offsetLeftAndRight(i7 - i8);
                    } else {
                        O2.offsetTopAndBottom(i7 - i8);
                    }
                }
            }
        }
    }

    private void J2() {
        if (this.w == 1 || !y2()) {
            this.A = this.z;
        } else {
            this.A = !this.z;
        }
    }

    private void L2(int i) {
        k kVar = this.y;
        kVar.e = i;
        kVar.d = this.A != (i == -1) ? -1 : 1;
    }

    private void P2(int i, int i2) {
        for (int i3 = 0; i3 < this.s; i3++) {
            if (!this.t[i3].a.isEmpty()) {
                V2(this.t[i3], i, i2);
            }
        }
    }

    private boolean Q2(RecyclerView.B b2, b bVar) {
        bVar.a = this.G ? l2(b2.b()) : h2(b2.b());
        bVar.b = Integer.MIN_VALUE;
        return true;
    }

    private void R1(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].a(view);
        }
    }

    private void S1(b bVar) {
        e eVar = this.I;
        int i = eVar.d0;
        if (i > 0) {
            if (i == this.s) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    this.t[i2].e();
                    e eVar2 = this.I;
                    int i3 = eVar2.e0[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += eVar2.j0 ? this.u.i() : this.u.m();
                    }
                    this.t[i2].v(i3);
                }
            } else {
                eVar.b();
                e eVar3 = this.I;
                eVar3.q = eVar3.c0;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.k0;
        N2(eVar4.i0);
        J2();
        e eVar5 = this.I;
        int i4 = eVar5.q;
        if (i4 != -1) {
            this.C = i4;
            bVar.c = eVar5.j0;
        } else {
            bVar.c = this.A;
        }
        if (eVar5.f0 > 1) {
            d dVar = this.E;
            dVar.a = eVar5.g0;
            dVar.b = eVar5.h0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void T2(int r5, androidx.recyclerview.widget.RecyclerView.B r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.k r0 = r4.y
            r1 = 0
            r0.b = r1
            r0.c = r5
            boolean r0 = r4.C0()
            r2 = 1
            if (r0 == 0) goto L2f
            int r6 = r6.c()
            r0 = -1
            if (r6 == r0) goto L2f
            boolean r0 = r4.A
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L26
            androidx.recyclerview.widget.o r5 = r4.u
            int r5 = r5.n()
        L24:
            r6 = 0
            goto L31
        L26:
            androidx.recyclerview.widget.o r5 = r4.u
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L31
        L2f:
            r5 = 0
            goto L24
        L31:
            boolean r0 = r4.S()
            if (r0 == 0) goto L4e
            androidx.recyclerview.widget.k r0 = r4.y
            androidx.recyclerview.widget.o r3 = r4.u
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f = r3
            androidx.recyclerview.widget.k r6 = r4.y
            androidx.recyclerview.widget.o r0 = r4.u
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.g = r0
            goto L5e
        L4e:
            androidx.recyclerview.widget.k r0 = r4.y
            androidx.recyclerview.widget.o r3 = r4.u
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.g = r3
            androidx.recyclerview.widget.k r5 = r4.y
            int r6 = -r6
            r5.f = r6
        L5e:
            androidx.recyclerview.widget.k r5 = r4.y
            r5.h = r1
            r5.a = r2
            androidx.recyclerview.widget.o r6 = r4.u
            int r6 = r6.k()
            if (r6 != 0) goto L75
            androidx.recyclerview.widget.o r6 = r4.u
            int r6 = r6.h()
            if (r6 != 0) goto L75
            r1 = 1
        L75:
            r5.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.T2(int, androidx.recyclerview.widget.RecyclerView$B):void");
    }

    private void V1(View view, c cVar, k kVar) {
        if (kVar.e == 1) {
            if (cVar.f) {
                R1(view);
                return;
            } else {
                cVar.e.a(view);
                return;
            }
        }
        if (cVar.f) {
            E2(view);
        } else {
            cVar.e.u(view);
        }
    }

    private void V2(f fVar, int i, int i2) {
        int j = fVar.j();
        if (i == -1) {
            if (fVar.o() + j <= i2) {
                this.B.set(fVar.e, false);
            }
        } else if (fVar.k() - j >= i2) {
            this.B.set(fVar.e, false);
        }
    }

    private int W1(int i) {
        if (P() == 0) {
            return this.A ? 1 : -1;
        }
        return (i < o2()) != this.A ? -1 : 1;
    }

    private int W2(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    private boolean Y1(f fVar) {
        if (this.A) {
            if (fVar.k() < this.u.i()) {
                ArrayList<View> arrayList = fVar.a;
                return !fVar.n(arrayList.get(arrayList.size() - 1)).f;
            }
        } else if (fVar.o() > this.u.m()) {
            return !fVar.n(fVar.a.get(0)).f;
        }
        return false;
    }

    private int Z1(RecyclerView.B b2) {
        if (P() == 0) {
            return 0;
        }
        return r.a(b2, this.u, j2(!this.N), i2(!this.N), this, this.N);
    }

    private int a2(RecyclerView.B b2) {
        if (P() == 0) {
            return 0;
        }
        return r.b(b2, this.u, j2(!this.N), i2(!this.N), this, this.N, this.A);
    }

    private int b2(RecyclerView.B b2) {
        if (P() == 0) {
            return 0;
        }
        return r.c(b2, this.u, j2(!this.N), i2(!this.N), this, this.N);
    }

    private int c2(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.w == 1) ? 1 : Integer.MIN_VALUE : this.w == 0 ? 1 : Integer.MIN_VALUE : this.w == 1 ? -1 : Integer.MIN_VALUE : this.w == 0 ? -1 : Integer.MIN_VALUE : (this.w != 1 && y2()) ? -1 : 1 : (this.w != 1 && y2()) ? 1 : -1;
    }

    private d.a d2(int i) {
        d.a aVar = new d.a();
        aVar.d0 = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            aVar.d0[i2] = i - this.t[i2].l(i);
        }
        return aVar;
    }

    private d.a e2(int i) {
        d.a aVar = new d.a();
        aVar.d0 = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            aVar.d0[i2] = this.t[i2].p(i) - i;
        }
        return aVar;
    }

    private void f2() {
        this.u = o.b(this, this.w);
        this.v = o.b(this, 1 - this.w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    private int g2(RecyclerView.w wVar, k kVar, RecyclerView.B b2) {
        int i;
        f fVar;
        int t2;
        int e2;
        int m;
        int e3;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        StaggeredGridLayoutManager staggeredGridLayoutManager2 = this;
        ?? r8 = 0;
        staggeredGridLayoutManager2.B.set(0, staggeredGridLayoutManager2.s, true);
        if (staggeredGridLayoutManager2.y.i) {
            i = kVar.e == 1 ? SubsamplingScaleImageView.TILE_SIZE_AUTO : Integer.MIN_VALUE;
        } else {
            i = kVar.e == 1 ? kVar.g + kVar.b : kVar.f - kVar.b;
        }
        staggeredGridLayoutManager2.P2(kVar.e, i);
        int i2 = staggeredGridLayoutManager2.A ? staggeredGridLayoutManager2.u.i() : staggeredGridLayoutManager2.u.m();
        boolean z = false;
        StaggeredGridLayoutManager staggeredGridLayoutManager3 = staggeredGridLayoutManager2;
        while (kVar.a(b2) && (staggeredGridLayoutManager3.y.i || !staggeredGridLayoutManager3.B.isEmpty())) {
            View b3 = kVar.b(wVar);
            c cVar = (c) b3.getLayoutParams();
            int a2 = cVar.a();
            int g = staggeredGridLayoutManager3.E.g(a2);
            boolean z2 = g == -1;
            if (z2) {
                fVar = cVar.f ? staggeredGridLayoutManager3.t[r8] : staggeredGridLayoutManager3.u2(kVar);
                staggeredGridLayoutManager3.E.n(a2, fVar);
            } else {
                fVar = staggeredGridLayoutManager3.t[g];
            }
            f fVar2 = fVar;
            cVar.e = fVar2;
            if (kVar.e == 1) {
                staggeredGridLayoutManager3.j(b3);
            } else {
                staggeredGridLayoutManager3.k(b3, r8);
            }
            staggeredGridLayoutManager3.A2(b3, cVar, r8);
            if (kVar.e == 1) {
                e2 = cVar.f ? staggeredGridLayoutManager3.q2(i2) : fVar2.l(i2);
                t2 = staggeredGridLayoutManager3.u.e(b3) + e2;
                if (z2 && cVar.f) {
                    d.a d2 = staggeredGridLayoutManager3.d2(e2);
                    d2.c0 = -1;
                    d2.q = a2;
                    staggeredGridLayoutManager3.E.a(d2);
                }
            } else {
                t2 = cVar.f ? staggeredGridLayoutManager3.t2(i2) : fVar2.p(i2);
                e2 = t2 - staggeredGridLayoutManager3.u.e(b3);
                if (z2 && cVar.f) {
                    d.a e22 = staggeredGridLayoutManager3.e2(t2);
                    e22.c0 = 1;
                    e22.q = a2;
                    staggeredGridLayoutManager3.E.a(e22);
                }
            }
            if (cVar.f && kVar.d == -1) {
                if (z2) {
                    staggeredGridLayoutManager3.M = true;
                } else {
                    if (!(kVar.e == 1 ? staggeredGridLayoutManager3.T1() : staggeredGridLayoutManager3.U1())) {
                        d.a f2 = staggeredGridLayoutManager3.E.f(a2);
                        if (f2 != null) {
                            f2.e0 = true;
                        }
                        staggeredGridLayoutManager3.M = true;
                    }
                }
            }
            staggeredGridLayoutManager3.V1(b3, cVar, kVar);
            if (staggeredGridLayoutManager3.y2() && staggeredGridLayoutManager3.w == 1) {
                e3 = cVar.f ? staggeredGridLayoutManager3.v.i() : staggeredGridLayoutManager3.v.i() - (((staggeredGridLayoutManager3.s - 1) - fVar2.e) * staggeredGridLayoutManager3.x);
                m = e3 - staggeredGridLayoutManager3.v.e(b3);
            } else {
                m = cVar.f ? staggeredGridLayoutManager3.v.m() : (fVar2.e * staggeredGridLayoutManager3.x) + staggeredGridLayoutManager3.v.m();
                e3 = staggeredGridLayoutManager3.v.e(b3) + m;
            }
            int i3 = e3;
            int i4 = m;
            if (staggeredGridLayoutManager3.w == 1) {
                staggeredGridLayoutManager3.E0(b3, i4, e2, i3, t2);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager3.E0(b3, e2, i4, t2, i3);
                staggeredGridLayoutManager = staggeredGridLayoutManager3;
            }
            if (cVar.f) {
                staggeredGridLayoutManager.P2(staggeredGridLayoutManager.y.e, i);
            } else {
                staggeredGridLayoutManager.V2(fVar2, staggeredGridLayoutManager.y.e, i);
            }
            staggeredGridLayoutManager.F2(wVar, staggeredGridLayoutManager.y);
            if (staggeredGridLayoutManager.y.h && b3.hasFocusable()) {
                if (cVar.f) {
                    staggeredGridLayoutManager.B.clear();
                } else {
                    staggeredGridLayoutManager.B.set(fVar2.e, false);
                }
            }
            z = true;
            r8 = 0;
            staggeredGridLayoutManager3 = staggeredGridLayoutManager;
        }
        if (!z) {
            staggeredGridLayoutManager3.F2(wVar, staggeredGridLayoutManager3.y);
        }
        int m2 = staggeredGridLayoutManager3.y.e == -1 ? staggeredGridLayoutManager3.u.m() - staggeredGridLayoutManager3.t2(staggeredGridLayoutManager3.u.m()) : staggeredGridLayoutManager3.q2(staggeredGridLayoutManager3.u.i()) - staggeredGridLayoutManager3.u.i();
        if (m2 > 0) {
            return Math.min(kVar.b, m2);
        }
        return 0;
    }

    private int h2(int i) {
        int P = P();
        for (int i2 = 0; i2 < P; i2++) {
            int m0 = m0(O(i2));
            if (m0 >= 0 && m0 < i) {
                return m0;
            }
        }
        return 0;
    }

    private int l2(int i) {
        for (int P = P() - 1; P >= 0; P--) {
            int m0 = m0(O(P));
            if (m0 >= 0 && m0 < i) {
                return m0;
            }
        }
        return 0;
    }

    private void m2(RecyclerView.w wVar, RecyclerView.B b2, boolean z) {
        int i;
        int q2 = q2(Integer.MIN_VALUE);
        if (q2 != Integer.MIN_VALUE && (i = this.u.i() - q2) > 0) {
            int i2 = i - (-K2(-i, wVar, b2));
            if (!z || i2 <= 0) {
                return;
            }
            this.u.r(i2);
        }
    }

    private void n2(RecyclerView.w wVar, RecyclerView.B b2, boolean z) {
        int m;
        int t2 = t2(SubsamplingScaleImageView.TILE_SIZE_AUTO);
        if (t2 != Integer.MAX_VALUE && (m = t2 - this.u.m()) > 0) {
            int K2 = m - K2(m, wVar, b2);
            if (!z || K2 <= 0) {
                return;
            }
            this.u.r(-K2);
        }
    }

    private int q2(int i) {
        int l = this.t[0].l(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int l2 = this.t[i2].l(i);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    private int r2(int i) {
        int p = this.t[0].p(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int p2 = this.t[i2].p(i);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    private int s2(int i) {
        int l = this.t[0].l(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int l2 = this.t[i2].l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    private int t2(int i) {
        int p = this.t[0].p(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int p2 = this.t[i2].p(i);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    private f u2(k kVar) {
        int i;
        int i2;
        int i3;
        if (C2(kVar.e)) {
            i2 = this.s - 1;
            i = -1;
            i3 = -1;
        } else {
            i = this.s;
            i2 = 0;
            i3 = 1;
        }
        f fVar = null;
        if (kVar.e == 1) {
            int m = this.u.m();
            int i4 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            while (i2 != i) {
                f fVar2 = this.t[i2];
                int l = fVar2.l(m);
                if (l < i4) {
                    fVar = fVar2;
                    i4 = l;
                }
                i2 += i3;
            }
            return fVar;
        }
        int i5 = this.u.i();
        int i6 = Integer.MIN_VALUE;
        while (i2 != i) {
            f fVar3 = this.t[i2];
            int p = fVar3.p(i5);
            if (p > i6) {
                fVar = fVar3;
                i6 = p;
            }
            i2 += i3;
        }
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.p2()
            goto Ld
        L9:
            int r0 = r6.o2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            goto L57
        L45:
            boolean r7 = r6.A
            if (r7 == 0) goto L4e
            int r7 = r6.o2()
            goto L52
        L4e:
            int r7 = r6.p2()
        L52:
            if (r3 > r7) goto L57
            r6.y1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.v2(int, int, int):void");
    }

    private void z2(View view, int i, int i2, boolean z) {
        p(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int W2 = W2(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int W22 = W2(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z ? M1(view, W2, W22, cVar) : K1(view, W2, W22, cVar)) {
            view.measure(W2, W22);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int A(RecyclerView.B b2) {
        return a2(b2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B(RecyclerView.B b2) {
        return b2(b2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int B1(int i, RecyclerView.w wVar, RecyclerView.B b2) {
        return K2(i, wVar, b2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void C1(int i) {
        e eVar = this.I;
        if (eVar != null && eVar.q != i) {
            eVar.a();
        }
        this.C = i;
        this.D = Integer.MIN_VALUE;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int D1(int i, RecyclerView.w wVar, RecyclerView.B b2) {
        return K2(i, wVar, b2);
    }

    void D2(int i, RecyclerView.B b2) {
        int o2;
        int i2;
        if (i > 0) {
            o2 = p2();
            i2 = 1;
        } else {
            o2 = o2();
            i2 = -1;
        }
        this.y.a = true;
        T2(o2, b2);
        L2(i2);
        k kVar = this.y;
        kVar.c = o2 + kVar.d;
        kVar.b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H0(int i) {
        super.H0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void H1(Rect rect, int i, int i2) {
        int t;
        int t2;
        int j0 = j0() + k0();
        int l0 = l0() + i0();
        if (this.w == 1) {
            t2 = RecyclerView.p.t(i2, rect.height() + l0, g0());
            t = RecyclerView.p.t(i, (this.x * this.s) + j0, h0());
        } else {
            t = RecyclerView.p.t(i, rect.width() + j0, h0());
            t2 = RecyclerView.p.t(i2, (this.x * this.s) + l0, g0());
        }
        G1(t, t2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I0(int i) {
        super.I0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q J() {
        return this.w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void J0(RecyclerView.h hVar, RecyclerView.h hVar2) {
        this.E.b();
        for (int i = 0; i < this.s; i++) {
            this.t[i].e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q K(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    int K2(int i, RecyclerView.w wVar, RecyclerView.B b2) {
        if (P() == 0 || i == 0) {
            return 0;
        }
        D2(i, b2);
        int g2 = g2(wVar, this.y, b2);
        if (this.y.b >= g2) {
            i = i < 0 ? -g2 : g2;
        }
        this.u.r(-i);
        this.G = this.A;
        k kVar = this.y;
        kVar.b = 0;
        F2(wVar, kVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q L(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public void M2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        m(null);
        if (i == this.w) {
            return;
        }
        this.w = i;
        o oVar = this.u;
        this.u = this.v;
        this.v = oVar;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void N0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.N0(recyclerView, wVar);
        t1(this.P);
        for (int i = 0; i < this.s; i++) {
            this.t[i].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void N1(RecyclerView recyclerView, RecyclerView.B b2, int i) {
        l lVar = new l(recyclerView.getContext());
        lVar.p(i);
        O1(lVar);
    }

    public void N2(boolean z) {
        m(null);
        e eVar = this.I;
        if (eVar != null && eVar.i0 != z) {
            eVar.i0 = z;
        }
        this.z = z;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View O0(View view, int i, RecyclerView.w wVar, RecyclerView.B b2) {
        View H;
        View m;
        if (P() == 0 || (H = H(view)) == null) {
            return null;
        }
        J2();
        int c2 = c2(i);
        if (c2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) H.getLayoutParams();
        boolean z = cVar.f;
        f fVar = cVar.e;
        int p2 = c2 == 1 ? p2() : o2();
        T2(p2, b2);
        L2(c2);
        k kVar = this.y;
        kVar.c = kVar.d + p2;
        kVar.b = (int) (this.u.n() * 0.33333334f);
        k kVar2 = this.y;
        kVar2.h = true;
        kVar2.a = false;
        g2(wVar, kVar2, b2);
        this.G = this.A;
        if (!z && (m = fVar.m(p2, c2)) != null && m != H) {
            return m;
        }
        if (C2(c2)) {
            for (int i2 = this.s - 1; i2 >= 0; i2--) {
                View m2 = this.t[i2].m(p2, c2);
                if (m2 != null && m2 != H) {
                    return m2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.s; i3++) {
                View m3 = this.t[i3].m(p2, c2);
                if (m3 != null && m3 != H) {
                    return m3;
                }
            }
        }
        boolean z2 = (this.z ^ true) == (c2 == -1);
        if (!z) {
            View I = I(z2 ? fVar.f() : fVar.g());
            if (I != null && I != H) {
                return I;
            }
        }
        if (C2(c2)) {
            for (int i4 = this.s - 1; i4 >= 0; i4--) {
                if (i4 != fVar.e) {
                    View I2 = I(z2 ? this.t[i4].f() : this.t[i4].g());
                    if (I2 != null && I2 != H) {
                        return I2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.s; i5++) {
                View I3 = I(z2 ? this.t[i5].f() : this.t[i5].g());
                if (I3 != null && I3 != H) {
                    return I3;
                }
            }
        }
        return null;
    }

    public void O2(int i) {
        m(null);
        if (i != this.s) {
            x2();
            this.s = i;
            this.B = new BitSet(this.s);
            this.t = new f[this.s];
            for (int i2 = 0; i2 < this.s; i2++) {
                this.t[i2] = new f(i2);
            }
            y1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (P() > 0) {
            View j2 = j2(false);
            View i2 = i2(false);
            if (j2 == null || i2 == null) {
                return;
            }
            int m0 = m0(j2);
            int m02 = m0(i2);
            if (m0 < m02) {
                accessibilityEvent.setFromIndex(m0);
                accessibilityEvent.setToIndex(m02);
            } else {
                accessibilityEvent.setFromIndex(m02);
                accessibilityEvent.setToIndex(m0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean Q1() {
        return this.I == null;
    }

    boolean R2(RecyclerView.B b2, b bVar) {
        int i;
        if (!b2.e() && (i = this.C) != -1) {
            if (i >= 0 && i < b2.b()) {
                e eVar = this.I;
                if (eVar == null || eVar.q == -1 || eVar.d0 < 1) {
                    View I = I(this.C);
                    if (I != null) {
                        bVar.a = this.A ? p2() : o2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.c) {
                                bVar.b = (this.u.i() - this.D) - this.u.d(I);
                            } else {
                                bVar.b = (this.u.m() + this.D) - this.u.g(I);
                            }
                            return true;
                        }
                        if (this.u.e(I) > this.u.n()) {
                            bVar.b = bVar.c ? this.u.i() : this.u.m();
                            return true;
                        }
                        int g = this.u.g(I) - this.u.m();
                        if (g < 0) {
                            bVar.b = -g;
                            return true;
                        }
                        int i2 = this.u.i() - this.u.d(I);
                        if (i2 < 0) {
                            bVar.b = i2;
                            return true;
                        }
                        bVar.b = Integer.MIN_VALUE;
                    } else {
                        int i3 = this.C;
                        bVar.a = i3;
                        int i4 = this.D;
                        if (i4 == Integer.MIN_VALUE) {
                            bVar.c = W1(i3) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i4);
                        }
                        bVar.d = true;
                    }
                } else {
                    bVar.b = Integer.MIN_VALUE;
                    bVar.a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = Integer.MIN_VALUE;
        }
        return false;
    }

    void S2(RecyclerView.B b2, b bVar) {
        if (R2(b2, bVar) || Q2(b2, bVar)) {
            return;
        }
        bVar.a();
        bVar.a = 0;
    }

    boolean T1() {
        int l = this.t[0].l(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].l(Integer.MIN_VALUE) != l) {
                return false;
            }
        }
        return true;
    }

    boolean U1() {
        int p = this.t[0].p(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].p(Integer.MIN_VALUE) != p) {
                return false;
            }
        }
        return true;
    }

    void U2(int i) {
        this.x = i / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(i, this.v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView, int i, int i2) {
        v2(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView recyclerView) {
        this.E.b();
        y1();
    }

    boolean X1() {
        int o2;
        int p2;
        if (P() == 0 || this.F == 0 || !w0()) {
            return false;
        }
        if (this.A) {
            o2 = p2();
            p2 = o2();
        } else {
            o2 = o2();
            p2 = p2();
        }
        if (o2 == 0 && w2() != null) {
            this.E.b();
            z1();
            y1();
            return true;
        }
        if (!this.M) {
            return false;
        }
        int i = this.A ? -1 : 1;
        int i2 = p2 + 1;
        d.a e2 = this.E.e(o2, i2, i, true);
        if (e2 == null) {
            this.M = false;
            this.E.d(i2);
            return false;
        }
        d.a e3 = this.E.e(o2, e2.q, i * (-1), true);
        if (e3 == null) {
            this.E.d(e2.q);
        } else {
            this.E.d(e3.q + 1);
        }
        z1();
        y1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView recyclerView, int i, int i2, int i3) {
        v2(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Z0(RecyclerView recyclerView, int i, int i2) {
        v2(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void b1(RecyclerView recyclerView, int i, int i2, Object obj) {
        v2(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    public PointF c(int i) {
        int W1 = W1(i);
        PointF pointF = new PointF();
        if (W1 == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = W1;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = W1;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(RecyclerView.w wVar, RecyclerView.B b2) {
        B2(wVar, b2, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void d1(RecyclerView.B b2) {
        super.d1(b2);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            this.I = eVar;
            if (this.C != -1) {
                eVar.a();
                this.I.b();
            }
            y1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable i1() {
        int p;
        int m;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.i0 = this.z;
        eVar.j0 = this.G;
        eVar.k0 = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.a) == null) {
            eVar.f0 = 0;
        } else {
            eVar.g0 = iArr;
            eVar.f0 = iArr.length;
            eVar.h0 = dVar.b;
        }
        if (P() <= 0) {
            eVar.q = -1;
            eVar.c0 = -1;
            eVar.d0 = 0;
            return eVar;
        }
        eVar.q = this.G ? p2() : o2();
        eVar.c0 = k2();
        int i = this.s;
        eVar.d0 = i;
        eVar.e0 = new int[i];
        for (int i2 = 0; i2 < this.s; i2++) {
            if (this.G) {
                p = this.t[i2].l(Integer.MIN_VALUE);
                if (p != Integer.MIN_VALUE) {
                    m = this.u.i();
                    p -= m;
                    eVar.e0[i2] = p;
                } else {
                    eVar.e0[i2] = p;
                }
            } else {
                p = this.t[i2].p(Integer.MIN_VALUE);
                if (p != Integer.MIN_VALUE) {
                    m = this.u.m();
                    p -= m;
                    eVar.e0[i2] = p;
                } else {
                    eVar.e0[i2] = p;
                }
            }
        }
        return eVar;
    }

    View i2(boolean z) {
        int m = this.u.m();
        int i = this.u.i();
        View view = null;
        for (int P = P() - 1; P >= 0; P--) {
            View O = O(P);
            int g = this.u.g(O);
            int d2 = this.u.d(O);
            if (d2 > m && g < i) {
                if (d2 <= i || !z) {
                    return O;
                }
                if (view == null) {
                    view = O;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void j1(int i) {
        if (i == 0) {
            X1();
        }
    }

    View j2(boolean z) {
        int m = this.u.m();
        int i = this.u.i();
        int P = P();
        View view = null;
        for (int i2 = 0; i2 < P; i2++) {
            View O = O(i2);
            int g = this.u.g(O);
            if (this.u.d(O) > m && g < i) {
                if (g >= m || !z) {
                    return O;
                }
                if (view == null) {
                    view = O;
                }
            }
        }
        return view;
    }

    int k2() {
        View i2 = this.A ? i2(true) : j2(true);
        if (i2 == null) {
            return -1;
        }
        return m0(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void m(String str) {
        if (this.I == null) {
            super.m(str);
        }
    }

    int o2() {
        if (P() == 0) {
            return 0;
        }
        return m0(O(0));
    }

    int p2() {
        int P = P();
        if (P == 0) {
            return 0;
        }
        return m0(O(P - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return this.w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r() {
        return this.w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean s(RecyclerView.q qVar) {
        return qVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void u(int i, int i2, RecyclerView.B b2, RecyclerView.p.c cVar) {
        int l;
        int i3;
        if (this.w != 0) {
            i = i2;
        }
        if (P() == 0 || i == 0) {
            return;
        }
        D2(i, b2);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.s) {
            this.O = new int[this.s];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.s; i5++) {
            k kVar = this.y;
            if (kVar.d == -1) {
                l = kVar.f;
                i3 = this.t[i5].p(l);
            } else {
                l = this.t[i5].l(kVar.g);
                i3 = this.y.g;
            }
            int i6 = l - i3;
            if (i6 >= 0) {
                this.O[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.O, 0, i4);
        for (int i7 = 0; i7 < i4 && this.y.a(b2); i7++) {
            cVar.a(this.y.c, this.O[i7]);
            k kVar2 = this.y;
            kVar2.c += kVar2.d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w(RecyclerView.B b2) {
        return Z1(b2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View w2() {
        /*
            r12 = this;
            int r0 = r12.P()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.s
            r2.<init>(r3)
            int r3 = r12.s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.y2()
            if (r3 == 0) goto L21
            r3 = 1
            goto L22
        L21:
            r3 = -1
        L22:
            boolean r7 = r12.A
            if (r7 == 0) goto L28
            r0 = -1
            goto L29
        L28:
            r1 = 0
        L29:
            if (r1 >= r0) goto L2c
            r6 = 1
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.O(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            int r9 = r9.e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            boolean r9 = r12.Y1(r9)
            if (r9 == 0) goto L4b
            goto La1
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            int r9 = r9.e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.O(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.o r10 = r12.u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.o r11 = r12.u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            goto La1
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.o r10 = r12.u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.o r11 = r12.u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            goto La1
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.e
            int r8 = r8.e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.e
            int r9 = r9.e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = 1
            goto L9a
        L99:
            r8 = 0
        L9a:
            if (r3 >= 0) goto L9e
            r9 = 1
            goto L9f
        L9e:
            r9 = 0
        L9f:
            if (r8 == r9) goto La2
        La1:
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.w2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int x(RecyclerView.B b2) {
        return a2(b2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean x0() {
        return this.F != 0;
    }

    public void x2() {
        this.E.b();
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y(RecyclerView.B b2) {
        return b2(b2);
    }

    boolean y2() {
        return e0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int z(RecyclerView.B b2) {
        return Z1(b2);
    }

    static class d {
        int[] a;
        List<a> b;

        d() {
        }

        private int i(int i) {
            if (this.b == null) {
                return -1;
            }
            a f = f(i);
            if (f != null) {
                this.b.remove(f);
            }
            int size = this.b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                }
                if (this.b.get(i2).q >= i) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return -1;
            }
            a aVar = this.b.get(i2);
            this.b.remove(i2);
            return aVar.q;
        }

        private void l(int i, int i2) {
            List<a> list = this.b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.b.get(size);
                int i3 = aVar.q;
                if (i3 >= i) {
                    aVar.q = i3 + i2;
                }
            }
        }

        private void m(int i, int i2) {
            List<a> list = this.b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.b.get(size);
                int i4 = aVar.q;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.b.remove(size);
                    } else {
                        aVar.q = i4 - i2;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                a aVar2 = this.b.get(i);
                if (aVar2.q == aVar.q) {
                    this.b.remove(i);
                }
                if (aVar2.q >= aVar.q) {
                    this.b.add(i, aVar);
                    return;
                }
            }
            this.b.add(aVar);
        }

        void b() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        void c(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[o(i)];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i) {
            List<a> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.b.get(size).q >= i) {
                        this.b.remove(size);
                    }
                }
            }
            return h(i);
        }

        public a e(int i, int i2, int i3, boolean z) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = this.b.get(i4);
                int i5 = aVar.q;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.c0 == i3 || (z && aVar.e0))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.b.get(size);
                if (aVar.q == i) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        int h(int i) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = i(i);
            if (i2 == -1) {
                int[] iArr2 = this.a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.a.length;
            }
            int min = Math.min(i2 + 1, this.a.length);
            Arrays.fill(this.a, i, min, -1);
            return min;
        }

        void j(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.a, i, i3, -1);
            l(i, i2);
        }

        void k(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m(i, i2);
        }

        void n(int i, f fVar) {
            c(i);
            this.a[i] = fVar.e;
        }

        int o(int i) {
            int length = this.a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0036a();
            int c0;
            int[] d0;
            boolean e0;
            int q;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            class C0036a implements Parcelable.Creator<a> {
                C0036a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i) {
                    return new a[i];
                }
            }

            a(Parcel parcel) {
                this.q = parcel.readInt();
                this.c0 = parcel.readInt();
                this.e0 = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.d0 = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i) {
                int[] iArr = this.d0;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.q + ", mGapDir=" + this.c0 + ", mHasUnwantedGapAfter=" + this.e0 + ", mGapPerSpan=" + Arrays.toString(this.d0) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.q);
                parcel.writeInt(this.c0);
                parcel.writeInt(this.e0 ? 1 : 0);
                int[] iArr = this.d0;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.d0);
                }
            }

            a() {
            }
        }
    }
}
