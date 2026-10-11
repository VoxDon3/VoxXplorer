package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements i.h, RecyclerView.A.b {
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    private int[] H;
    int s;
    private c t;
    o u;
    private boolean v;
    private boolean w;
    boolean x;
    private boolean y;
    private boolean z;

    static class a {
        o a;
        int b;
        int c;
        boolean d;
        boolean e;

        a() {
            e();
        }

        void a() {
            this.c = this.d ? this.a.i() : this.a.m();
        }

        public void b(View view, int i) {
            if (this.d) {
                this.c = this.a.d(view) + this.a.o();
            } else {
                this.c = this.a.g(view);
            }
            this.b = i;
        }

        public void c(View view, int i) {
            int o = this.a.o();
            if (o >= 0) {
                b(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int i2 = (this.a.i() - o) - this.a.d(view);
                this.c = this.a.i() - i2;
                if (i2 > 0) {
                    int e = this.c - this.a.e(view);
                    int m = this.a.m();
                    int min = e - (m + Math.min(this.a.g(view) - m, 0));
                    if (min < 0) {
                        this.c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.a.g(view);
            int m2 = g - this.a.m();
            this.c = g;
            if (m2 > 0) {
                int i3 = (this.a.i() - Math.min(0, (this.a.i() - o) - this.a.d(view))) - (g + this.a.e(view));
                if (i3 < 0) {
                    this.c -= Math.min(m2, -i3);
                }
            }
        }

        boolean d(View view, RecyclerView.B b) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < b.b();
        }

        void e() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
        }
    }

    protected static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        protected b() {
        }

        void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    static class c {
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int k;
        boolean m;
        boolean a = true;
        int h = 0;
        int i = 0;
        boolean j = false;
        List<RecyclerView.F> l = null;

        c() {
        }

        private View e() {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                View view = this.l.get(i).a;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f = f(view);
            if (f == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.q) f.getLayoutParams()).a();
            }
        }

        boolean c(RecyclerView.B b) {
            int i = this.d;
            return i >= 0 && i < b.b();
        }

        View d(RecyclerView.w wVar) {
            if (this.l != null) {
                return e();
            }
            View o = wVar.o(this.d);
            this.d += this.e;
            return o;
        }

        public View f(View view) {
            int a;
            int size = this.l.size();
            View view2 = null;
            int i = SubsamplingScaleImageView.TILE_SIZE_AUTO;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.l.get(i2).a;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (a = (qVar.a() - this.d) * this.e) >= 0 && a < i) {
                    if (a == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i = a;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        int c0;
        boolean d0;
        int q;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        boolean a() {
            return this.q >= 0;
        }

        void b() {
            this.q = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.q);
            parcel.writeInt(this.c0);
            parcel.writeInt(this.d0 ? 1 : 0);
        }

        d(Parcel parcel) {
            this.q = parcel.readInt();
            this.c0 = parcel.readInt();
            this.d0 = parcel.readInt() == 1;
        }

        @SuppressLint({"UnknownNullness"})
        public d(d dVar) {
            this.q = dVar.q;
            this.c0 = dVar.c0;
            this.d0 = dVar.d0;
        }
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context) {
        this(context, 1, false);
    }

    private void B2() {
        if (this.s == 1 || !r2()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    private boolean H2(RecyclerView.w wVar, RecyclerView.B b2, a aVar) {
        View k2;
        boolean z = false;
        if (P() == 0) {
            return false;
        }
        View b0 = b0();
        if (b0 != null && aVar.d(b0, b2)) {
            aVar.c(b0, m0(b0));
            return true;
        }
        boolean z2 = this.v;
        boolean z3 = this.y;
        if (z2 != z3 || (k2 = k2(wVar, b2, aVar.d, z3)) == null) {
            return false;
        }
        aVar.b(k2, m0(k2));
        if (!b2.e() && Q1()) {
            int g = this.u.g(k2);
            int d2 = this.u.d(k2);
            int m = this.u.m();
            int i = this.u.i();
            boolean z4 = d2 <= m && g < m;
            if (g >= i && d2 > i) {
                z = true;
            }
            if (z4 || z) {
                if (aVar.d) {
                    m = i;
                }
                aVar.c = m;
            }
        }
        return true;
    }

    private boolean I2(RecyclerView.B b2, a aVar) {
        int i;
        if (!b2.e() && (i = this.A) != -1) {
            if (i >= 0 && i < b2.b()) {
                aVar.b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.a()) {
                    boolean z = this.D.d0;
                    aVar.d = z;
                    if (z) {
                        aVar.c = this.u.i() - this.D.c0;
                    } else {
                        aVar.c = this.u.m() + this.D.c0;
                    }
                    return true;
                }
                if (this.B != Integer.MIN_VALUE) {
                    boolean z2 = this.x;
                    aVar.d = z2;
                    if (z2) {
                        aVar.c = this.u.i() - this.B;
                    } else {
                        aVar.c = this.u.m() + this.B;
                    }
                    return true;
                }
                View I = I(this.A);
                if (I == null) {
                    if (P() > 0) {
                        aVar.d = (this.A < m0(O(0))) == this.x;
                    }
                    aVar.a();
                } else {
                    if (this.u.e(I) > this.u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.u.g(I) - this.u.m() < 0) {
                        aVar.c = this.u.m();
                        aVar.d = false;
                        return true;
                    }
                    if (this.u.i() - this.u.d(I) < 0) {
                        aVar.c = this.u.i();
                        aVar.d = true;
                        return true;
                    }
                    aVar.c = aVar.d ? this.u.d(I) + this.u.o() : this.u.g(I);
                }
                return true;
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void J2(RecyclerView.w wVar, RecyclerView.B b2, a aVar) {
        if (I2(b2, aVar) || H2(wVar, b2, aVar)) {
            return;
        }
        aVar.a();
        aVar.b = this.y ? b2.b() - 1 : 0;
    }

    private void K2(int i, int i2, boolean z, RecyclerView.B b2) {
        int m;
        this.t.m = A2();
        this.t.f = i;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        R1(b2, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        boolean z2 = i == 1;
        c cVar = this.t;
        int i3 = z2 ? max2 : max;
        cVar.h = i3;
        if (!z2) {
            max = max2;
        }
        cVar.i = max;
        if (z2) {
            cVar.h = i3 + this.u.j();
            View n2 = n2();
            c cVar2 = this.t;
            cVar2.e = this.x ? -1 : 1;
            int m0 = m0(n2);
            c cVar3 = this.t;
            cVar2.d = m0 + cVar3.e;
            cVar3.b = this.u.d(n2);
            m = this.u.d(n2) - this.u.i();
        } else {
            View o2 = o2();
            this.t.h += this.u.m();
            c cVar4 = this.t;
            cVar4.e = this.x ? 1 : -1;
            int m02 = m0(o2);
            c cVar5 = this.t;
            cVar4.d = m02 + cVar5.e;
            cVar5.b = this.u.g(o2);
            m = (-this.u.g(o2)) + this.u.m();
        }
        c cVar6 = this.t;
        cVar6.c = i2;
        if (z) {
            cVar6.c = i2 - m;
        }
        cVar6.g = m;
    }

    private void L2(int i, int i2) {
        this.t.c = this.u.i() - i2;
        c cVar = this.t;
        cVar.e = this.x ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    private void M2(a aVar) {
        L2(aVar.b, aVar.c);
    }

    private void N2(int i, int i2) {
        this.t.c = i2 - this.u.m();
        c cVar = this.t;
        cVar.d = i;
        cVar.e = this.x ? 1 : -1;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    private void O2(a aVar) {
        N2(aVar.b, aVar.c);
    }

    private int T1(RecyclerView.B b2) {
        if (P() == 0) {
            return 0;
        }
        Y1();
        return r.a(b2, this.u, c2(!this.z, true), b2(!this.z, true), this, this.z);
    }

    private int U1(RecyclerView.B b2) {
        if (P() == 0) {
            return 0;
        }
        Y1();
        return r.b(b2, this.u, c2(!this.z, true), b2(!this.z, true), this, this.z, this.x);
    }

    private int V1(RecyclerView.B b2) {
        if (P() == 0) {
            return 0;
        }
        Y1();
        return r.c(b2, this.u, c2(!this.z, true), b2(!this.z, true), this, this.z);
    }

    private View a2() {
        return g2(0, P());
    }

    private View e2() {
        return g2(P() - 1, -1);
    }

    private View i2() {
        return this.x ? a2() : e2();
    }

    private View j2() {
        return this.x ? e2() : a2();
    }

    private int l2(int i, RecyclerView.w wVar, RecyclerView.B b2, boolean z) {
        int i2;
        int i3 = this.u.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -C2(-i3, wVar, b2);
        int i5 = i + i4;
        if (!z || (i2 = this.u.i() - i5) <= 0) {
            return i4;
        }
        this.u.r(i2);
        return i2 + i4;
    }

    private int m2(int i, RecyclerView.w wVar, RecyclerView.B b2, boolean z) {
        int m;
        int m2 = i - this.u.m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -C2(m2, wVar, b2);
        int i3 = i + i2;
        if (!z || (m = i3 - this.u.m()) <= 0) {
            return i2;
        }
        this.u.r(-m);
        return i2 - m;
    }

    private View n2() {
        return O(this.x ? 0 : P() - 1);
    }

    private View o2() {
        return O(this.x ? P() - 1 : 0);
    }

    private void u2(RecyclerView.w wVar, RecyclerView.B b2, int i, int i2) {
        if (!b2.g() || P() == 0 || b2.e() || !Q1()) {
            return;
        }
        List<RecyclerView.F> k = wVar.k();
        int size = k.size();
        int m0 = m0(O(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.F f = k.get(i5);
            if (!f.w()) {
                if ((f.n() < m0) != this.x) {
                    i3 += this.u.e(f.a);
                } else {
                    i4 += this.u.e(f.a);
                }
            }
        }
        this.t.l = k;
        if (i3 > 0) {
            N2(m0(o2()), i);
            c cVar = this.t;
            cVar.h = i3;
            cVar.c = 0;
            cVar.a();
            Z1(wVar, this.t, b2, false);
        }
        if (i4 > 0) {
            L2(m0(n2()), i2);
            c cVar2 = this.t;
            cVar2.h = i4;
            cVar2.c = 0;
            cVar2.a();
            Z1(wVar, this.t, b2, false);
        }
        this.t.l = null;
    }

    private void w2(RecyclerView.w wVar, c cVar) {
        if (!cVar.a || cVar.m) {
            return;
        }
        int i = cVar.g;
        int i2 = cVar.i;
        if (cVar.f == -1) {
            y2(wVar, i, i2);
        } else {
            z2(wVar, i, i2);
        }
    }

    private void x2(RecyclerView.w wVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                s1(i, wVar);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                s1(i3, wVar);
            }
        }
    }

    private void y2(RecyclerView.w wVar, int i, int i2) {
        int P = P();
        if (i < 0) {
            return;
        }
        int h = (this.u.h() - i) + i2;
        if (this.x) {
            for (int i3 = 0; i3 < P; i3++) {
                View O = O(i3);
                if (this.u.g(O) < h || this.u.q(O) < h) {
                    x2(wVar, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = P - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View O2 = O(i5);
            if (this.u.g(O2) < h || this.u.q(O2) < h) {
                x2(wVar, i4, i5);
                return;
            }
        }
    }

    private void z2(RecyclerView.w wVar, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int P = P();
        if (!this.x) {
            for (int i4 = 0; i4 < P; i4++) {
                View O = O(i4);
                if (this.u.d(O) > i3 || this.u.p(O) > i3) {
                    x2(wVar, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = P - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View O2 = O(i6);
            if (this.u.d(O2) > i3 || this.u.p(O2) > i3) {
                x2(wVar, i5, i6);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int A(RecyclerView.B b2) {
        return U1(b2);
    }

    boolean A2() {
        return this.u.k() == 0 && this.u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int B(RecyclerView.B b2) {
        return V1(b2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int B1(int i, RecyclerView.w wVar, RecyclerView.B b2) {
        if (this.s == 1) {
            return 0;
        }
        return C2(i, wVar, b2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void C1(int i) {
        this.A = i;
        this.B = Integer.MIN_VALUE;
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
        y1();
    }

    int C2(int i, RecyclerView.w wVar, RecyclerView.B b2) {
        if (P() == 0 || i == 0) {
            return 0;
        }
        Y1();
        this.t.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        K2(i2, abs, true, b2);
        c cVar = this.t;
        int Z1 = cVar.g + Z1(wVar, cVar, b2, false);
        if (Z1 < 0) {
            return 0;
        }
        if (abs > Z1) {
            i = i2 * Z1;
        }
        this.u.r(-i);
        this.t.k = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int D1(int i, RecyclerView.w wVar, RecyclerView.B b2) {
        if (this.s == 0) {
            return 0;
        }
        return C2(i, wVar, b2);
    }

    public void D2(int i, int i2) {
        this.A = i;
        this.B = i2;
        d dVar = this.D;
        if (dVar != null) {
            dVar.b();
        }
        y1();
    }

    public void E2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        m(null);
        if (i != this.s || this.u == null) {
            o b2 = o.b(this, i);
            this.u = b2;
            this.E.a = b2;
            this.s = i;
            y1();
        }
    }

    public void F2(boolean z) {
        m(null);
        if (z == this.w) {
            return;
        }
        this.w = z;
        y1();
    }

    public void G2(boolean z) {
        m(null);
        if (this.y == z) {
            return;
        }
        this.y = z;
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public View I(int i) {
        int P = P();
        if (P == 0) {
            return null;
        }
        int m0 = i - m0(O(0));
        if (m0 >= 0 && m0 < P) {
            View O = O(m0);
            if (m0(O) == i) {
                return O;
            }
        }
        return super.I(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public RecyclerView.q J() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean L1() {
        return (d0() == 1073741824 || u0() == 1073741824 || !v0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void N0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.N0(recyclerView, wVar);
        if (this.C) {
            p1(wVar);
            wVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void N1(RecyclerView recyclerView, RecyclerView.B b2, int i) {
        l lVar = new l(recyclerView.getContext());
        lVar.p(i);
        O1(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public View O0(View view, int i, RecyclerView.w wVar, RecyclerView.B b2) {
        int W1;
        B2();
        if (P() == 0 || (W1 = W1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        Y1();
        K2(W1, (int) (this.u.n() * 0.33333334f), false, b2);
        c cVar = this.t;
        cVar.g = Integer.MIN_VALUE;
        cVar.a = false;
        Z1(wVar, cVar, b2, true);
        View j2 = W1 == -1 ? j2() : i2();
        View o2 = W1 == -1 ? o2() : n2();
        if (!o2.hasFocusable()) {
            return j2;
        }
        if (j2 == null) {
            return null;
        }
        return o2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (P() > 0) {
            accessibilityEvent.setFromIndex(d2());
            accessibilityEvent.setToIndex(f2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean Q1() {
        return this.D == null && this.v == this.y;
    }

    protected void R1(RecyclerView.B b2, int[] iArr) {
        int i;
        int p2 = p2(b2);
        if (this.t.f == -1) {
            i = 0;
        } else {
            i = p2;
            p2 = 0;
        }
        iArr[0] = p2;
        iArr[1] = i;
    }

    void S1(RecyclerView.B b2, c cVar, RecyclerView.p.c cVar2) {
        int i = cVar.d;
        if (i < 0 || i >= b2.b()) {
            return;
        }
        cVar2.a(i, Math.max(0, cVar.g));
    }

    int W1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.s == 1) ? 1 : Integer.MIN_VALUE : this.s == 0 ? 1 : Integer.MIN_VALUE : this.s == 1 ? -1 : Integer.MIN_VALUE : this.s == 0 ? -1 : Integer.MIN_VALUE : (this.s != 1 && r2()) ? -1 : 1 : (this.s != 1 && r2()) ? 1 : -1;
    }

    c X1() {
        return new c();
    }

    void Y1() {
        if (this.t == null) {
            this.t = X1();
        }
    }

    int Z1(RecyclerView.w wVar, c cVar, RecyclerView.B b2, boolean z) {
        int i = cVar.c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            w2(wVar, cVar);
        }
        int i3 = cVar.c + cVar.h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.m && i3 <= 0) || !cVar.c(b2)) {
                break;
            }
            bVar.a();
            t2(wVar, b2, cVar, bVar);
            if (!bVar.b) {
                cVar.b += bVar.a * cVar.f;
                if (!bVar.c || cVar.l != null || !b2.e()) {
                    int i4 = cVar.c;
                    int i5 = bVar.a;
                    cVar.c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.a;
                    cVar.g = i7;
                    int i8 = cVar.c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    w2(wVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    View b2(boolean z, boolean z2) {
        return this.x ? h2(0, P(), z, z2) : h2(P() - 1, -1, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A.b
    @SuppressLint({"UnknownNullness"})
    public PointF c(int i) {
        if (P() == 0) {
            return null;
        }
        int i2 = (i < m0(O(0))) != this.x ? -1 : 1;
        return this.s == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void c1(RecyclerView.w wVar, RecyclerView.B b2) {
        int i;
        int i2;
        int i3;
        int i4;
        int l2;
        int i5;
        View I;
        int g;
        int i6;
        int i7 = -1;
        if (!(this.D == null && this.A == -1) && b2.b() == 0) {
            p1(wVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.a()) {
            this.A = this.D.q;
        }
        Y1();
        this.t.a = false;
        B2();
        View b0 = b0();
        a aVar = this.E;
        if (!aVar.e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.d = this.x ^ this.y;
            J2(wVar, b2, aVar2);
            this.E.e = true;
        } else if (b0 != null && (this.u.g(b0) >= this.u.i() || this.u.d(b0) <= this.u.m())) {
            this.E.c(b0, m0(b0));
        }
        c cVar = this.t;
        cVar.f = cVar.k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        R1(b2, iArr);
        int max = Math.max(0, this.H[0]) + this.u.m();
        int max2 = Math.max(0, this.H[1]) + this.u.j();
        if (b2.e() && (i5 = this.A) != -1 && this.B != Integer.MIN_VALUE && (I = I(i5)) != null) {
            if (this.x) {
                i6 = this.u.i() - this.u.d(I);
                g = this.B;
            } else {
                g = this.u.g(I) - this.u.m();
                i6 = this.B;
            }
            int i8 = i6 - g;
            if (i8 > 0) {
                max += i8;
            } else {
                max2 -= i8;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.d ? !this.x : this.x) {
            i7 = 1;
        }
        v2(wVar, b2, aVar3, i7);
        C(wVar);
        this.t.m = A2();
        this.t.j = b2.e();
        this.t.i = 0;
        a aVar4 = this.E;
        if (aVar4.d) {
            O2(aVar4);
            c cVar2 = this.t;
            cVar2.h = max;
            Z1(wVar, cVar2, b2, false);
            c cVar3 = this.t;
            i2 = cVar3.b;
            int i9 = cVar3.d;
            int i10 = cVar3.c;
            if (i10 > 0) {
                max2 += i10;
            }
            M2(this.E);
            c cVar4 = this.t;
            cVar4.h = max2;
            cVar4.d += cVar4.e;
            Z1(wVar, cVar4, b2, false);
            c cVar5 = this.t;
            i = cVar5.b;
            int i11 = cVar5.c;
            if (i11 > 0) {
                N2(i9, i2);
                c cVar6 = this.t;
                cVar6.h = i11;
                Z1(wVar, cVar6, b2, false);
                i2 = this.t.b;
            }
        } else {
            M2(aVar4);
            c cVar7 = this.t;
            cVar7.h = max2;
            Z1(wVar, cVar7, b2, false);
            c cVar8 = this.t;
            i = cVar8.b;
            int i12 = cVar8.d;
            int i13 = cVar8.c;
            if (i13 > 0) {
                max += i13;
            }
            O2(this.E);
            c cVar9 = this.t;
            cVar9.h = max;
            cVar9.d += cVar9.e;
            Z1(wVar, cVar9, b2, false);
            c cVar10 = this.t;
            i2 = cVar10.b;
            int i14 = cVar10.c;
            if (i14 > 0) {
                L2(i12, i);
                c cVar11 = this.t;
                cVar11.h = i14;
                Z1(wVar, cVar11, b2, false);
                i = this.t.b;
            }
        }
        if (P() > 0) {
            if (this.x ^ this.y) {
                int l22 = l2(i, wVar, b2, true);
                i3 = i2 + l22;
                i4 = i + l22;
                l2 = m2(i3, wVar, b2, false);
            } else {
                int m2 = m2(i2, wVar, b2, true);
                i3 = i2 + m2;
                i4 = i + m2;
                l2 = l2(i4, wVar, b2, false);
            }
            i2 = i3 + l2;
            i = i4 + l2;
        }
        u2(wVar, b2, i2, i);
        if (b2.e()) {
            this.E.e();
        } else {
            this.u.s();
        }
        this.v = this.y;
    }

    View c2(boolean z, boolean z2) {
        return this.x ? h2(P() - 1, -1, z, z2) : h2(0, P(), z, z2);
    }

    @Override // androidx.recyclerview.widget.i.h
    public void d(View view, View view2, int i, int i2) {
        m("Cannot drop a view during a scroll or layout calculation");
        Y1();
        B2();
        int m0 = m0(view);
        int m02 = m0(view2);
        char c2 = m0 < m02 ? (char) 1 : (char) 65535;
        if (this.x) {
            if (c2 == 1) {
                D2(m02, this.u.i() - (this.u.g(view2) + this.u.e(view)));
                return;
            } else {
                D2(m02, this.u.i() - this.u.d(view2));
                return;
            }
        }
        if (c2 == 65535) {
            D2(m02, this.u.g(view2));
        } else {
            D2(m02, this.u.d(view2) - this.u.e(view));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void d1(RecyclerView.B b2) {
        super.d1(b2);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    public int d2() {
        View h2 = h2(0, P(), false, true);
        if (h2 == null) {
            return -1;
        }
        return m0(h2);
    }

    public int f2() {
        View h2 = h2(P() - 1, -1, false, true);
        if (h2 == null) {
            return -1;
        }
        return m0(h2);
    }

    View g2(int i, int i2) {
        int i3;
        int i4;
        Y1();
        if (i2 <= i && i2 >= i) {
            return O(i);
        }
        if (this.u.g(O(i)) < this.u.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.s == 0 ? this.e.a(i, i2, i3, i4) : this.f.a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.D = dVar;
            if (this.A != -1) {
                dVar.b();
            }
            y1();
        }
    }

    View h2(int i, int i2, boolean z, boolean z2) {
        Y1();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.s == 0 ? this.e.a(i, i2, i3, i4) : this.f.a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public Parcelable i1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (P() <= 0) {
            dVar.b();
            return dVar;
        }
        Y1();
        boolean z = this.v ^ this.x;
        dVar.d0 = z;
        if (z) {
            View n2 = n2();
            dVar.c0 = this.u.i() - this.u.d(n2);
            dVar.q = m0(n2);
            return dVar;
        }
        View o2 = o2();
        dVar.q = m0(o2);
        dVar.c0 = this.u.g(o2) - this.u.m();
        return dVar;
    }

    View k2(RecyclerView.w wVar, RecyclerView.B b2, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        Y1();
        int P = P();
        if (z2) {
            i2 = P() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = P;
            i2 = 0;
            i3 = 1;
        }
        int b3 = b2.b();
        int m = this.u.m();
        int i4 = this.u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View O = O(i2);
            int m0 = m0(O);
            int g = this.u.g(O);
            int d2 = this.u.d(O);
            if (m0 >= 0 && m0 < b3) {
                if (!((RecyclerView.q) O.getLayoutParams()).c()) {
                    boolean z3 = d2 <= m && g < m;
                    boolean z4 = g >= i4 && d2 > i4;
                    if (!z3 && !z4) {
                        return O;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = O;
                        }
                        view2 = O;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = O;
                        }
                        view2 = O;
                    }
                } else if (view3 == null) {
                    view3 = O;
                }
            }
            i2 += i3;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void m(String str) {
        if (this.D == null) {
            super.m(str);
        }
    }

    @Deprecated
    protected int p2(RecyclerView.B b2) {
        if (b2.d()) {
            return this.u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean q() {
        return this.s == 0;
    }

    public int q2() {
        return this.s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean r() {
        return this.s == 1;
    }

    protected boolean r2() {
        return e0() == 1;
    }

    public boolean s2() {
        return this.z;
    }

    void t2(RecyclerView.w wVar, RecyclerView.B b2, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int j0;
        int f;
        int i5;
        int i6;
        View d2 = cVar.d(wVar);
        if (d2 == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) d2.getLayoutParams();
        if (cVar.l == null) {
            if (this.x == (cVar.f == -1)) {
                j(d2);
            } else {
                k(d2, 0);
            }
        } else {
            if (this.x == (cVar.f == -1)) {
                h(d2);
            } else {
                i(d2, 0);
            }
        }
        F0(d2, 0, 0);
        bVar.a = this.u.e(d2);
        if (this.s == 1) {
            if (r2()) {
                f = t0() - k0();
                j0 = f - this.u.f(d2);
            } else {
                j0 = j0();
                f = this.u.f(d2) + j0;
            }
            if (cVar.f == -1) {
                i6 = cVar.b;
                i5 = i6 - bVar.a;
            } else {
                i5 = cVar.b;
                i6 = bVar.a + i5;
            }
            int i7 = j0;
            i4 = i5;
            i3 = i7;
            i2 = i6;
            i = f;
        } else {
            int l0 = l0();
            int f2 = this.u.f(d2) + l0;
            if (cVar.f == -1) {
                int i8 = cVar.b;
                i3 = i8 - bVar.a;
                i = i8;
                i2 = f2;
            } else {
                int i9 = cVar.b;
                i = bVar.a + i9;
                i2 = f2;
                i3 = i9;
            }
            i4 = l0;
        }
        E0(d2, i3, i4, i, i2);
        if (qVar.c() || qVar.b()) {
            bVar.c = true;
        }
        bVar.d = d2.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void u(int i, int i2, RecyclerView.B b2, RecyclerView.p.c cVar) {
        if (this.s != 0) {
            i = i2;
        }
        if (P() == 0 || i == 0) {
            return;
        }
        Y1();
        K2(i > 0 ? 1 : -1, Math.abs(i), true, b2);
        S1(b2, this.t, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public void v(int i, RecyclerView.p.c cVar) {
        boolean z;
        int i2;
        d dVar = this.D;
        if (dVar == null || !dVar.a()) {
            B2();
            z = this.x;
            i2 = this.A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z = dVar2.d0;
            i2 = dVar2.q;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.G && i2 >= 0 && i2 < i; i4++) {
            cVar.a(i2, 0);
            i2 += i3;
        }
    }

    void v2(RecyclerView.w wVar, RecyclerView.B b2, a aVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int w(RecyclerView.B b2) {
        return T1(b2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int x(RecyclerView.B b2) {
        return U1(b2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean x0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int y(RecyclerView.B b2) {
        return V1(b2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    @SuppressLint({"UnknownNullness"})
    public int z(RecyclerView.B b2) {
        return T1(b2);
    }

    public LinearLayoutManager(@SuppressLint({"UnknownNullness"}) Context context, int i, boolean z) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        E2(i);
        F2(z);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.p.d n0 = RecyclerView.p.n0(context, attributeSet, i, i2);
        E2(n0.a);
        F2(n0.c);
        G2(n0.d);
    }
}
