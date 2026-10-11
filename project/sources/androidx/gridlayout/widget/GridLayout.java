package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Pair;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import ax.c0.C1760d0;
import ax.c0.C1770i0;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class GridLayout extends ViewGroup {
    public static final i A;
    public static final i B;
    public static final i C;
    static final Printer i = new LogPrinter(3, GridLayout.class.getName());
    static final Printer j = new a();
    private static final int k = ax.C0.b.l;
    private static final int l = ax.C0.b.m;
    private static final int m = ax.C0.b.j;
    private static final int n = ax.C0.b.o;
    private static final int o = ax.C0.b.i;
    private static final int p = ax.C0.b.n;
    private static final int q = ax.C0.b.k;
    static final i r = new b();
    private static final i s;
    private static final i t;
    public static final i u;
    public static final i v;
    public static final i w;
    public static final i x;
    public static final i y;
    public static final i z;
    final l a;
    final l b;
    int c;
    boolean d;
    int e;
    int f;
    int g;
    Printer h;

    static class a implements Printer {
        a() {
        }

        @Override // android.util.Printer
        public void println(String str) {
        }
    }

    static class b extends i {
        b() {
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int a(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String c() {
            return "UNDEFINED";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int d(View view, int i) {
            return Integer.MIN_VALUE;
        }
    }

    static class c extends i {
        c() {
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int a(View view, int i, int i2) {
            return 0;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String c() {
            return "LEADING";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int d(View view, int i) {
            return 0;
        }
    }

    static class d extends i {
        d() {
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int a(View view, int i, int i2) {
            return i;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String c() {
            return "TRAILING";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int d(View view, int i) {
            return i;
        }
    }

    static class e extends i {
        final /* synthetic */ i a;
        final /* synthetic */ i b;

        e(i iVar, i iVar2) {
            this.a = iVar;
            this.b = iVar2;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int a(View view, int i, int i2) {
            return (C1760d0.B(view) == 1 ? this.b : this.a).a(view, i, i2);
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String c() {
            return "SWITCHING[L:" + this.a.c() + ", R:" + this.b.c() + "]";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int d(View view, int i) {
            return (C1760d0.B(view) == 1 ? this.b : this.a).d(view, i);
        }
    }

    static class f extends i {
        f() {
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int a(View view, int i, int i2) {
            return i >> 1;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String c() {
            return "CENTER";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int d(View view, int i) {
            return i >> 1;
        }
    }

    static class g extends i {

        class a extends m {
            private int d;

            a() {
            }

            @Override // androidx.gridlayout.widget.GridLayout.m
            protected int a(GridLayout gridLayout, View view, i iVar, int i, boolean z) {
                return Math.max(0, super.a(gridLayout, view, iVar, i, z));
            }

            @Override // androidx.gridlayout.widget.GridLayout.m
            protected void b(int i, int i2) {
                super.b(i, i2);
                this.d = Math.max(this.d, i + i2);
            }

            @Override // androidx.gridlayout.widget.GridLayout.m
            protected void d() {
                super.d();
                this.d = Integer.MIN_VALUE;
            }

            @Override // androidx.gridlayout.widget.GridLayout.m
            protected int e(boolean z) {
                return Math.max(super.e(z), this.d);
            }
        }

        g() {
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int a(View view, int i, int i2) {
            if (view.getVisibility() == 8) {
                return 0;
            }
            int baseline = view.getBaseline();
            if (baseline == -1) {
                return Integer.MIN_VALUE;
            }
            return baseline;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public m b() {
            return new a();
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String c() {
            return "BASELINE";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int d(View view, int i) {
            return 0;
        }
    }

    static class h extends i {
        h() {
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int a(View view, int i, int i2) {
            return Integer.MIN_VALUE;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        String c() {
            return "FILL";
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        int d(View view, int i) {
            return 0;
        }

        @Override // androidx.gridlayout.widget.GridLayout.i
        public int e(View view, int i, int i2) {
            return i2;
        }
    }

    public static abstract class i {
        i() {
        }

        abstract int a(View view, int i, int i2);

        m b() {
            return new m();
        }

        abstract String c();

        abstract int d(View view, int i);

        int e(View view, int i, int i2) {
            return i;
        }

        public String toString() {
            return "Alignment:" + c();
        }
    }

    static final class j {
        public final n a;
        public final p b;
        public boolean c = true;

        public j(n nVar, p pVar) {
            this.a = nVar;
            this.b = pVar;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append(" ");
            sb.append(!this.c ? "+>" : "->");
            sb.append(" ");
            sb.append(this.b);
            return sb.toString();
        }
    }

    static final class k<K, V> extends ArrayList<Pair<K, V>> {
        private final Class<V> c0;
        private final Class<K> q;

        private k(Class<K> cls, Class<V> cls2) {
            this.q = cls;
            this.c0 = cls2;
        }

        public static <K, V> k<K, V> h(Class<K> cls, Class<V> cls2) {
            return new k<>(cls, cls2);
        }

        public q<K, V> i() {
            int size = size();
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.q, size);
            Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.c0, size);
            for (int i = 0; i < size; i++) {
                objArr[i] = get(i).first;
                objArr2[i] = get(i).second;
            }
            return new q<>(objArr, objArr2);
        }

        public void k(K k, V v) {
            add(Pair.create(k, v));
        }
    }

    final class l {
        public final boolean a;
        q<r, m> d;
        q<n, p> f;
        q<n, p> h;
        public int[] j;
        public int[] l;
        public j[] n;
        public int[] p;
        public boolean r;
        public int[] t;
        public int b = Integer.MIN_VALUE;
        private int c = Integer.MIN_VALUE;
        public boolean e = false;
        public boolean g = false;
        public boolean i = false;
        public boolean k = false;
        public boolean m = false;
        public boolean o = false;
        public boolean q = false;
        public boolean s = false;
        boolean u = true;
        private p v = new p(0);
        private p w = new p(-100000);

        class a {
            j[] a;
            int b;
            j[][] c;
            int[] d;
            final /* synthetic */ j[] e;

            a(j[] jVarArr) {
                this.e = jVarArr;
                this.a = new j[jVarArr.length];
                this.b = r0.length - 1;
                this.c = l.this.z(jVarArr);
                this.d = new int[l.this.p() + 1];
            }

            j[] a() {
                int length = this.c.length;
                for (int i = 0; i < length; i++) {
                    b(i);
                }
                return this.a;
            }

            void b(int i) {
                int[] iArr = this.d;
                if (iArr[i] != 0) {
                    return;
                }
                iArr[i] = 1;
                for (j jVar : this.c[i]) {
                    b(jVar.a.b);
                    j[] jVarArr = this.a;
                    int i2 = this.b;
                    this.b = i2 - 1;
                    jVarArr[i2] = jVar;
                }
                this.d[i] = 2;
            }
        }

        l(boolean z) {
            this.a = z;
        }

        private boolean A() {
            if (!this.s) {
                this.r = g();
                this.s = true;
            }
            return this.r;
        }

        private void B(List<j> list, n nVar, p pVar) {
            C(list, nVar, pVar, true);
        }

        private void C(List<j> list, n nVar, p pVar, boolean z) {
            if (nVar.b() == 0) {
                return;
            }
            if (z) {
                Iterator<j> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().a.equals(nVar)) {
                        return;
                    }
                }
            }
            list.add(new j(nVar, pVar));
        }

        private void D(int[] iArr) {
            Arrays.fill(iArr, 0);
        }

        private void H(String str, j[] jVarArr, boolean[] zArr) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < jVarArr.length; i++) {
                j jVar = jVarArr[i];
                if (zArr[i]) {
                    arrayList.add(jVar);
                }
                if (!jVar.c) {
                    arrayList2.add(jVar);
                }
            }
            GridLayout.this.h.println(str + " constraints: " + b(arrayList) + " are inconsistent; permanently removing: " + b(arrayList2) + ". ");
        }

        private boolean I(int[] iArr, j jVar) {
            if (!jVar.c) {
                return false;
            }
            n nVar = jVar.a;
            int i = nVar.a;
            int i2 = nVar.b;
            int i3 = iArr[i] + jVar.b.a;
            if (i3 <= iArr[i2]) {
                return false;
            }
            iArr[i2] = i3;
            return true;
        }

        private void L(int i, int i2) {
            this.v.a = i;
            this.w.a = -i2;
            this.q = false;
        }

        private void M(int i, float f) {
            Arrays.fill(this.t, 0);
            int childCount = GridLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = GridLayout.this.getChildAt(i2);
                if (childAt.getVisibility() != 8) {
                    o q = GridLayout.this.q(childAt);
                    float f2 = (this.a ? q.b : q.a).d;
                    if (f2 != 0.0f) {
                        int round = Math.round((i * f2) / f);
                        this.t[i2] = round;
                        i -= round;
                        f -= f2;
                    }
                }
            }
        }

        private int N(int[] iArr) {
            return iArr[p()];
        }

        private boolean O(int[] iArr) {
            return P(n(), iArr);
        }

        private boolean P(j[] jVarArr, int[] iArr) {
            return Q(jVarArr, iArr, true);
        }

        private boolean Q(j[] jVarArr, int[] iArr, boolean z) {
            String str = this.a ? "horizontal" : "vertical";
            int p = p() + 1;
            boolean[] zArr = null;
            for (int i = 0; i < jVarArr.length; i++) {
                D(iArr);
                for (int i2 = 0; i2 < p; i2++) {
                    boolean z2 = false;
                    for (j jVar : jVarArr) {
                        z2 |= I(iArr, jVar);
                    }
                    if (!z2) {
                        if (zArr != null) {
                            H(str, jVarArr, zArr);
                        }
                        return true;
                    }
                }
                if (!z) {
                    return false;
                }
                boolean[] zArr2 = new boolean[jVarArr.length];
                for (int i3 = 0; i3 < p; i3++) {
                    int length = jVarArr.length;
                    for (int i4 = 0; i4 < length; i4++) {
                        zArr2[i4] = zArr2[i4] | I(iArr, jVarArr[i4]);
                    }
                }
                if (i == 0) {
                    zArr = zArr2;
                }
                int i5 = 0;
                while (true) {
                    if (i5 >= jVarArr.length) {
                        break;
                    }
                    if (zArr2[i5]) {
                        j jVar2 = jVarArr[i5];
                        n nVar = jVar2.a;
                        if (nVar.a >= nVar.b) {
                            jVar2.c = false;
                            break;
                        }
                    }
                    i5++;
                }
            }
            return true;
        }

        private void R(int[] iArr) {
            Arrays.fill(q(), 0);
            O(iArr);
            boolean z = true;
            int childCount = (this.v.a * GridLayout.this.getChildCount()) + 1;
            if (childCount < 2) {
                return;
            }
            float d = d();
            int i = -1;
            int i2 = 0;
            while (i2 < childCount) {
                int i3 = (int) ((i2 + childCount) / 2);
                F();
                M(i3, d);
                boolean Q = Q(n(), iArr, false);
                if (Q) {
                    i2 = i3 + 1;
                    i = i3;
                } else {
                    childCount = i3;
                }
                z = Q;
            }
            if (i <= 0 || z) {
                return;
            }
            F();
            M(i, d);
            O(iArr);
        }

        private j[] S(List<j> list) {
            return T((j[]) list.toArray(new j[list.size()]));
        }

        private j[] T(j[] jVarArr) {
            return new a(jVarArr).a();
        }

        private void a(List<j> list, q<n, p> qVar) {
            int i = 0;
            while (true) {
                n[] nVarArr = qVar.b;
                if (i >= nVarArr.length) {
                    return;
                }
                C(list, nVarArr[i], qVar.c[i], false);
                i++;
            }
        }

        private String b(List<j> list) {
            StringBuilder sb;
            String str = this.a ? "x" : "y";
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (j jVar : list) {
                if (z) {
                    z = false;
                } else {
                    sb2.append(", ");
                }
                n nVar = jVar.a;
                int i = nVar.a;
                int i2 = nVar.b;
                int i3 = jVar.b.a;
                if (i < i2) {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(i2);
                    sb.append("-");
                    sb.append(str);
                    sb.append(i);
                    sb.append(">=");
                } else {
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append(i);
                    sb.append("-");
                    sb.append(str);
                    sb.append(i2);
                    sb.append("<=");
                    i3 = -i3;
                }
                sb.append(i3);
                sb2.append(sb.toString());
            }
            return sb2.toString();
        }

        private int c() {
            int childCount = GridLayout.this.getChildCount();
            int i = -1;
            for (int i2 = 0; i2 < childCount; i2++) {
                o q = GridLayout.this.q(GridLayout.this.getChildAt(i2));
                n nVar = (this.a ? q.b : q.a).b;
                i = Math.max(Math.max(Math.max(i, nVar.a), nVar.b), nVar.b());
            }
            if (i == -1) {
                return Integer.MIN_VALUE;
            }
            return i;
        }

        private float d() {
            int childCount = GridLayout.this.getChildCount();
            float f = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    o q = GridLayout.this.q(childAt);
                    f += (this.a ? q.b : q.a).d;
                }
            }
            return f;
        }

        private void e() {
            r();
            o();
        }

        private void f() {
            for (m mVar : this.d.c) {
                mVar.d();
            }
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                o q = GridLayout.this.q(childAt);
                boolean z = this.a;
                r rVar = z ? q.b : q.a;
                this.d.c(i).c(GridLayout.this, childAt, rVar, this, GridLayout.this.u(childAt, z) + (rVar.d == 0.0f ? 0 : q()[i]));
            }
        }

        private boolean g() {
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    o q = GridLayout.this.q(childAt);
                    if ((this.a ? q.b : q.a).d != 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        private void h(q<n, p> qVar, boolean z) {
            for (p pVar : qVar.c) {
                pVar.a();
            }
            m[] mVarArr = s().c;
            for (int i = 0; i < mVarArr.length; i++) {
                int e = mVarArr[i].e(z);
                p c = qVar.c(i);
                int i2 = c.a;
                if (!z) {
                    e = -e;
                }
                c.a = Math.max(i2, e);
            }
        }

        private void i(int[] iArr) {
            if (A()) {
                R(iArr);
            } else {
                O(iArr);
            }
            if (this.u) {
                return;
            }
            int i = iArr[0];
            int length = iArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = iArr[i2] - i;
            }
        }

        private void j(boolean z) {
            int[] iArr = z ? this.j : this.l;
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = GridLayout.this.getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    o q = GridLayout.this.q(childAt);
                    boolean z2 = this.a;
                    n nVar = (z2 ? q.b : q.a).b;
                    int i2 = z ? nVar.a : nVar.b;
                    iArr[i2] = Math.max(iArr[i2], GridLayout.this.s(childAt, z2, z));
                }
            }
        }

        private j[] k() {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            a(arrayList, r());
            a(arrayList2, o());
            if (this.u) {
                int i = 0;
                while (i < p()) {
                    int i2 = i + 1;
                    B(arrayList, new n(i, i2), new p(0));
                    i = i2;
                }
            }
            int p = p();
            C(arrayList, new n(0, p), this.v, false);
            C(arrayList2, new n(p, 0), this.w, false);
            return (j[]) GridLayout.b(S(arrayList), S(arrayList2));
        }

        private q<r, m> l() {
            k h = k.h(r.class, m.class);
            int childCount = GridLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                o q = GridLayout.this.q(GridLayout.this.getChildAt(i));
                boolean z = this.a;
                r rVar = z ? q.b : q.a;
                h.k(rVar, rVar.b(z).b());
            }
            return h.i();
        }

        private q<n, p> m(boolean z) {
            k h = k.h(n.class, p.class);
            r[] rVarArr = s().b;
            int length = rVarArr.length;
            for (int i = 0; i < length; i++) {
                h.k(z ? rVarArr[i].b : rVarArr[i].b.a(), new p());
            }
            return h.i();
        }

        private q<n, p> o() {
            if (this.h == null) {
                this.h = m(false);
            }
            if (!this.i) {
                h(this.h, false);
                this.i = true;
            }
            return this.h;
        }

        private q<n, p> r() {
            if (this.f == null) {
                this.f = m(true);
            }
            if (!this.g) {
                h(this.f, true);
                this.g = true;
            }
            return this.f;
        }

        private int v() {
            if (this.c == Integer.MIN_VALUE) {
                this.c = Math.max(0, c());
            }
            return this.c;
        }

        private int x(int i, int i2) {
            L(i, i2);
            return N(u());
        }

        public void E() {
            this.c = Integer.MIN_VALUE;
            this.d = null;
            this.f = null;
            this.h = null;
            this.j = null;
            this.l = null;
            this.n = null;
            this.p = null;
            this.t = null;
            this.s = false;
            F();
        }

        public void F() {
            this.e = false;
            this.g = false;
            this.i = false;
            this.k = false;
            this.m = false;
            this.o = false;
            this.q = false;
        }

        public void G(int i) {
            L(i, i);
            u();
        }

        public void J(int i) {
            if (i != Integer.MIN_VALUE && i < v()) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.a ? "column" : "row");
                sb.append("Count must be greater than or equal to the maximum of all grid indices ");
                sb.append("(and spans) defined in the LayoutParams of each child");
                GridLayout.w(sb.toString());
            }
            this.b = i;
        }

        public void K(boolean z) {
            this.u = z;
            E();
        }

        public j[] n() {
            if (this.n == null) {
                this.n = k();
            }
            if (!this.o) {
                e();
                this.o = true;
            }
            return this.n;
        }

        public int p() {
            return Math.max(this.b, v());
        }

        public int[] q() {
            if (this.t == null) {
                this.t = new int[GridLayout.this.getChildCount()];
            }
            return this.t;
        }

        public q<r, m> s() {
            if (this.d == null) {
                this.d = l();
            }
            if (!this.e) {
                f();
                this.e = true;
            }
            return this.d;
        }

        public int[] t() {
            if (this.j == null) {
                this.j = new int[p() + 1];
            }
            if (!this.k) {
                j(true);
                this.k = true;
            }
            return this.j;
        }

        public int[] u() {
            if (this.p == null) {
                this.p = new int[p() + 1];
            }
            if (!this.q) {
                i(this.p);
                this.q = true;
            }
            return this.p;
        }

        public int w(int i) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return x(0, size);
            }
            if (mode == 0) {
                return x(0, 100000);
            }
            if (mode != 1073741824) {
                return 0;
            }
            return x(size, size);
        }

        public int[] y() {
            if (this.l == null) {
                this.l = new int[p() + 1];
            }
            if (!this.m) {
                j(false);
                this.m = true;
            }
            return this.l;
        }

        j[][] z(j[] jVarArr) {
            int p = p() + 1;
            j[][] jVarArr2 = new j[p][];
            int[] iArr = new int[p];
            for (j jVar : jVarArr) {
                int i = jVar.a.a;
                iArr[i] = iArr[i] + 1;
            }
            for (int i2 = 0; i2 < p; i2++) {
                jVarArr2[i2] = new j[iArr[i2]];
            }
            Arrays.fill(iArr, 0);
            for (j jVar2 : jVarArr) {
                int i3 = jVar2.a.a;
                j[] jVarArr3 = jVarArr2[i3];
                int i4 = iArr[i3];
                iArr[i3] = i4 + 1;
                jVarArr3[i4] = jVar2;
            }
            return jVarArr2;
        }
    }

    static class m {
        public int a;
        public int b;
        public int c;

        m() {
            d();
        }

        protected int a(GridLayout gridLayout, View view, i iVar, int i, boolean z) {
            return this.a - iVar.a(view, i, C1770i0.a(gridLayout));
        }

        protected void b(int i, int i2) {
            this.a = Math.max(this.a, i);
            this.b = Math.max(this.b, i2);
        }

        protected final void c(GridLayout gridLayout, View view, r rVar, l lVar, int i) {
            this.c &= rVar.c();
            int a = rVar.b(lVar.a).a(view, i, C1770i0.a(gridLayout));
            b(a, i - a);
        }

        protected void d() {
            this.a = Integer.MIN_VALUE;
            this.b = Integer.MIN_VALUE;
            this.c = 2;
        }

        protected int e(boolean z) {
            if (z || !GridLayout.c(this.c)) {
                return this.a + this.b;
            }
            return 100000;
        }

        public String toString() {
            return "Bounds{before=" + this.a + ", after=" + this.b + '}';
        }
    }

    static final class n {
        public final int a;
        public final int b;

        public n(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        n a() {
            return new n(this.b, this.a);
        }

        int b() {
            return this.b - this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n.class != obj.getClass()) {
                return false;
            }
            n nVar = (n) obj;
            return this.b == nVar.b && this.a == nVar.a;
        }

        public int hashCode() {
            return (this.a * 31) + this.b;
        }

        public String toString() {
            return "[" + this.a + ", " + this.b + "]";
        }
    }

    static final class q<K, V> {
        public final int[] a;
        public final K[] b;
        public final V[] c;

        q(K[] kArr, V[] vArr) {
            int[] b = b(kArr);
            this.a = b;
            this.b = (K[]) a(kArr, b);
            this.c = (V[]) a(vArr, b);
        }

        private static <K> K[] a(K[] kArr, int[] iArr) {
            int length = kArr.length;
            K[] kArr2 = (K[]) ((Object[]) Array.newInstance(kArr.getClass().getComponentType(), GridLayout.A(iArr, -1) + 1));
            for (int i = 0; i < length; i++) {
                kArr2[iArr[i]] = kArr[i];
            }
            return kArr2;
        }

        private static <K> int[] b(K[] kArr) {
            int length = kArr.length;
            int[] iArr = new int[length];
            HashMap hashMap = new HashMap();
            for (int i = 0; i < length; i++) {
                K k = kArr[i];
                Integer num = (Integer) hashMap.get(k);
                if (num == null) {
                    num = Integer.valueOf(hashMap.size());
                    hashMap.put(k, num);
                }
                iArr[i] = num.intValue();
            }
            return iArr;
        }

        public V c(int i) {
            return this.c[this.a[i]];
        }
    }

    static {
        c cVar = new c();
        s = cVar;
        d dVar = new d();
        t = dVar;
        u = cVar;
        v = dVar;
        w = cVar;
        x = dVar;
        y = h(cVar, dVar);
        z = h(dVar, cVar);
        A = new f();
        B = new g();
        C = new h();
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = new l(true);
        this.b = new l(false);
        this.c = 0;
        this.d = false;
        this.e = 1;
        this.g = 0;
        this.h = i;
        this.f = context.getResources().getDimensionPixelOffset(ax.C0.a.a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ax.C0.b.h);
        try {
            setRowCount(obtainStyledAttributes.getInt(l, Integer.MIN_VALUE));
            setColumnCount(obtainStyledAttributes.getInt(m, Integer.MIN_VALUE));
            setOrientation(obtainStyledAttributes.getInt(k, 0));
            setUseDefaultMargins(obtainStyledAttributes.getBoolean(n, false));
            setAlignmentMode(obtainStyledAttributes.getInt(o, 1));
            setRowOrderPreserved(obtainStyledAttributes.getBoolean(p, true));
            setColumnOrderPreserved(obtainStyledAttributes.getBoolean(q, true));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    static int A(int[] iArr, int i2) {
        for (int i3 : iArr) {
            i2 = Math.max(i2, i3);
        }
        return i2;
    }

    private void B(View view, int i2, int i3, int i4, int i5) {
        view.measure(ViewGroup.getChildMeasureSpec(i2, v(view, true), i4), ViewGroup.getChildMeasureSpec(i3, v(view, false), i5));
    }

    private void C(int i2, int i3, boolean z2) {
        int i4;
        int i5;
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                i4 = i2;
                i5 = i3;
            } else {
                o q2 = q(childAt);
                if (z2) {
                    i4 = i2;
                    i5 = i3;
                    B(childAt, i4, i5, ((ViewGroup.MarginLayoutParams) q2).width, ((ViewGroup.MarginLayoutParams) q2).height);
                } else {
                    i4 = i2;
                    i5 = i3;
                    boolean z3 = this.c == 0;
                    r rVar = z3 ? q2.b : q2.a;
                    if (rVar.b(z3) == C) {
                        n nVar = rVar.b;
                        int[] u2 = (z3 ? this.a : this.b).u();
                        int v2 = (u2[nVar.b] - u2[nVar.a]) - v(childAt, z3);
                        if (z3) {
                            B(childAt, i4, i5, v2, ((ViewGroup.MarginLayoutParams) q2).height);
                        } else {
                            B(childAt, i4, i5, ((ViewGroup.MarginLayoutParams) q2).width, v2);
                        }
                    }
                }
            }
            i6++;
            i2 = i4;
            i3 = i5;
        }
    }

    private static void D(int[] iArr, int i2, int i3, int i4) {
        int length = iArr.length;
        Arrays.fill(iArr, Math.min(i2, length), Math.min(i3, length), i4);
    }

    private static void E(o oVar, int i2, int i3, int i4, int i5) {
        oVar.d(new n(i2, i3 + i2));
        oVar.c(new n(i4, i5 + i4));
    }

    public static r F(int i2) {
        return G(i2, 1);
    }

    public static r G(int i2, int i3) {
        return H(i2, i3, r);
    }

    public static r H(int i2, int i3, i iVar) {
        return I(i2, i3, iVar, 0.0f);
    }

    public static r I(int i2, int i3, i iVar, float f2) {
        return new r(i2 != Integer.MIN_VALUE, i2, i3, iVar, f2);
    }

    private void J() {
        boolean z2 = this.c == 0;
        int i2 = (z2 ? this.a : this.b).b;
        if (i2 == Integer.MIN_VALUE) {
            i2 = 0;
        }
        int[] iArr = new int[i2];
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            o oVar = (o) getChildAt(i5).getLayoutParams();
            r rVar = z2 ? oVar.a : oVar.b;
            n nVar = rVar.b;
            boolean z3 = rVar.a;
            int b2 = nVar.b();
            if (z3) {
                i3 = nVar.a;
            }
            r rVar2 = z2 ? oVar.b : oVar.a;
            n nVar2 = rVar2.b;
            boolean z4 = rVar2.a;
            int e2 = e(nVar2, z4, i2);
            if (z4) {
                i4 = nVar2.a;
            }
            if (i2 != 0) {
                if (!z3 || !z4) {
                    while (true) {
                        int i6 = i4 + e2;
                        if (i(iArr, i3, i4, i6)) {
                            break;
                        }
                        if (z4) {
                            i3++;
                        } else if (i6 <= i2) {
                            i4++;
                        } else {
                            i3++;
                            i4 = 0;
                        }
                    }
                }
                D(iArr, i4, i4 + e2, i3 + b2);
            }
            if (z2) {
                E(oVar, i3, b2, i4, e2);
            } else {
                E(oVar, i4, e2, i3, b2);
            }
            i4 += e2;
        }
    }

    static int a(int i2, int i3) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3 + i2), View.MeasureSpec.getMode(i2));
    }

    static <T> T[] b(T[] tArr, T[] tArr2) {
        T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), tArr.length + tArr2.length));
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    static boolean c(int i2) {
        return (i2 & 2) != 0;
    }

    private void d(o oVar, boolean z2) {
        String str = z2 ? "column" : "row";
        n nVar = (z2 ? oVar.b : oVar.a).b;
        int i2 = nVar.a;
        if (i2 != Integer.MIN_VALUE && i2 < 0) {
            w(str + " indices must be positive");
        }
        int i3 = (z2 ? this.a : this.b).b;
        if (i3 != Integer.MIN_VALUE) {
            if (nVar.b > i3) {
                w(str + " indices (start + span) mustn't exceed the " + str + " count");
            }
            if (nVar.b() > i3) {
                w(str + " span mustn't exceed the " + str + " count");
            }
        }
    }

    private static int e(n nVar, boolean z2, int i2) {
        int b2 = nVar.b();
        if (i2 == 0) {
            return b2;
        }
        return Math.min(b2, i2 - (z2 ? Math.min(nVar.a, i2) : 0));
    }

    private int f() {
        int childCount = getChildCount();
        int i2 = 1;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                i2 = (i2 * 31) + ((o) childAt.getLayoutParams()).hashCode();
            }
        }
        return i2;
    }

    private void g() {
        int i2 = this.g;
        if (i2 == 0) {
            J();
            this.g = f();
        } else if (i2 != f()) {
            this.h.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
            x();
            g();
        }
    }

    private static i h(i iVar, i iVar2) {
        return new e(iVar, iVar2);
    }

    private static boolean i(int[] iArr, int i2, int i3, int i4) {
        if (i4 > iArr.length) {
            return false;
        }
        while (i3 < i4) {
            if (iArr[i3] > i2) {
                return false;
            }
            i3++;
        }
        return true;
    }

    static i m(int i2, boolean z2) {
        int i3 = (i2 & (z2 ? 7 : 112)) >> (z2 ? 0 : 4);
        return i3 != 1 ? i3 != 3 ? i3 != 5 ? i3 != 7 ? i3 != 8388611 ? i3 != 8388613 ? r : x : w : C : z2 ? z : v : z2 ? y : u : A;
    }

    private int n(View view, o oVar, boolean z2, boolean z3) {
        boolean z4 = false;
        if (!this.d) {
            return 0;
        }
        r rVar = z2 ? oVar.b : oVar.a;
        l lVar = z2 ? this.a : this.b;
        n nVar = rVar.b;
        if (!((z2 && z()) ? !z3 : z3) ? nVar.b == lVar.p() : nVar.a == 0) {
            z4 = true;
        }
        return p(view, z4, z2, z3);
    }

    private int o(View view, boolean z2, boolean z3) {
        if (view.getClass() == ax.F0.a.class || view.getClass() == Space.class) {
            return 0;
        }
        return this.f / 2;
    }

    private int p(View view, boolean z2, boolean z3, boolean z4) {
        return o(view, z3, z4);
    }

    private int r(View view, boolean z2, boolean z3) {
        if (this.e == 1) {
            return s(view, z2, z3);
        }
        l lVar = z2 ? this.a : this.b;
        int[] t2 = z3 ? lVar.t() : lVar.y();
        o q2 = q(view);
        n nVar = (z2 ? q2.b : q2.a).b;
        return t2[z3 ? nVar.a : nVar.b];
    }

    private int t(View view, boolean z2) {
        return z2 ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private int v(View view, boolean z2) {
        return r(view, z2, true) + r(view, z2, false);
    }

    static void w(String str) {
        throw new IllegalArgumentException(str + ". ");
    }

    private void x() {
        this.g = 0;
        l lVar = this.a;
        if (lVar != null) {
            lVar.E();
        }
        l lVar2 = this.b;
        if (lVar2 != null) {
            lVar2.E();
        }
        y();
    }

    private void y() {
        l lVar = this.a;
        if (lVar == null || this.b == null) {
            return;
        }
        lVar.F();
        this.b.F();
    }

    private boolean z() {
        return C1760d0.B(this) == 1;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof o)) {
            return false;
        }
        o oVar = (o) layoutParams;
        d(oVar, true);
        d(oVar, false);
        return true;
    }

    public int getAlignmentMode() {
        return this.e;
    }

    public int getColumnCount() {
        return this.a.p();
    }

    public int getOrientation() {
        return this.c;
    }

    public Printer getPrinter() {
        return this.h;
    }

    public int getRowCount() {
        return this.b.p();
    }

    public boolean getUseDefaultMargins() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public o generateDefaultLayoutParams() {
        return new o();
    }

    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public o generateLayoutParams(AttributeSet attributeSet) {
        return new o(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public o generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o ? new o((o) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o((ViewGroup.MarginLayoutParams) layoutParams) : new o(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        GridLayout gridLayout = this;
        gridLayout.g();
        int i9 = i4 - i2;
        int paddingLeft = gridLayout.getPaddingLeft();
        int paddingTop = gridLayout.getPaddingTop();
        int paddingRight = gridLayout.getPaddingRight();
        int paddingBottom = gridLayout.getPaddingBottom();
        gridLayout.a.G((i9 - paddingLeft) - paddingRight);
        gridLayout.b.G(((i5 - i3) - paddingTop) - paddingBottom);
        int[] u2 = gridLayout.a.u();
        int[] u3 = gridLayout.b.u();
        int childCount = gridLayout.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = gridLayout.getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                i6 = i9;
                i7 = paddingLeft;
                i8 = paddingTop;
            } else {
                o q2 = gridLayout.q(childAt);
                r rVar = q2.b;
                r rVar2 = q2.a;
                n nVar = rVar.b;
                n nVar2 = rVar2.b;
                int i11 = u2[nVar.a];
                int i12 = u3[nVar2.a];
                int i13 = u2[nVar.b] - i11;
                int i14 = u3[nVar2.b] - i12;
                int t2 = gridLayout.t(childAt, true);
                i6 = i9;
                int t3 = gridLayout.t(childAt, false);
                i b2 = rVar.b(true);
                i b3 = rVar2.b(false);
                m c2 = gridLayout.a.s().c(i10);
                m c3 = gridLayout.b.s().c(i10);
                i7 = paddingLeft;
                int d2 = b2.d(childAt, i13 - c2.e(true));
                int d3 = b3.d(childAt, i14 - c3.e(true));
                int r2 = gridLayout.r(childAt, true, true);
                int r3 = gridLayout.r(childAt, false, true);
                int r4 = gridLayout.r(childAt, true, false);
                int i15 = r2 + r4;
                int r5 = r3 + gridLayout.r(childAt, false, false);
                int a2 = c2.a(gridLayout, childAt, b2, t2 + i15, true);
                i8 = paddingTop;
                int a3 = c3.a(this, childAt, b3, t3 + r5, false);
                int e2 = b2.e(childAt, t2, i13 - i15);
                int e3 = b3.e(childAt, t3, i14 - r5);
                int i16 = i11 + d2 + a2;
                int i17 = !z() ? i7 + r2 + i16 : (((i6 - e2) - paddingRight) - r4) - i16;
                int i18 = i8 + i12 + d3 + a3 + r3;
                if (e2 != childAt.getMeasuredWidth() || e3 != childAt.getMeasuredHeight()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(e2, 1073741824), View.MeasureSpec.makeMeasureSpec(e3, 1073741824));
                }
                childAt.layout(i17, i18, e2 + i17, e3 + i18);
            }
            i10++;
            gridLayout = this;
            paddingTop = i8;
            i9 = i6;
            paddingLeft = i7;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int w2;
        int i4;
        g();
        y();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int a2 = a(i2, -paddingLeft);
        int a3 = a(i3, -paddingTop);
        C(a2, a3, true);
        if (this.c == 0) {
            w2 = this.a.w(a2);
            C(a2, a3, false);
            i4 = this.b.w(a3);
        } else {
            int w3 = this.b.w(a3);
            C(a2, a3, false);
            w2 = this.a.w(a2);
            i4 = w3;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(w2 + paddingLeft, getSuggestedMinimumWidth()), i2, 0), View.resolveSizeAndState(Math.max(i4 + paddingTop, getSuggestedMinimumHeight()), i3, 0));
    }

    final o q(View view) {
        return (o) view.getLayoutParams();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        x();
    }

    int s(View view, boolean z2, boolean z3) {
        o q2 = q(view);
        int i2 = z2 ? z3 ? ((ViewGroup.MarginLayoutParams) q2).leftMargin : ((ViewGroup.MarginLayoutParams) q2).rightMargin : z3 ? ((ViewGroup.MarginLayoutParams) q2).topMargin : ((ViewGroup.MarginLayoutParams) q2).bottomMargin;
        return i2 == Integer.MIN_VALUE ? n(view, q2, z2, z3) : i2;
    }

    public void setAlignmentMode(int i2) {
        this.e = i2;
        requestLayout();
    }

    public void setColumnCount(int i2) {
        this.a.J(i2);
        x();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z2) {
        this.a.K(z2);
        x();
        requestLayout();
    }

    public void setOrientation(int i2) {
        if (this.c != i2) {
            this.c = i2;
            x();
            requestLayout();
        }
    }

    public void setPrinter(Printer printer) {
        if (printer == null) {
            printer = j;
        }
        this.h = printer;
    }

    public void setRowCount(int i2) {
        this.b.J(i2);
        x();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z2) {
        this.b.K(z2);
        x();
        requestLayout();
    }

    public void setUseDefaultMargins(boolean z2) {
        this.d = z2;
        requestLayout();
    }

    final int u(View view, boolean z2) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        return t(view, z2) + v(view, z2);
    }

    static final class p {
        public int a;

        public p() {
            a();
        }

        public void a() {
            this.a = Integer.MIN_VALUE;
        }

        public String toString() {
            return Integer.toString(this.a);
        }

        public p(int i) {
            this.a = i;
        }
    }

    public static class r {
        static final r e = GridLayout.F(Integer.MIN_VALUE);
        final boolean a;
        final n b;
        final i c;
        final float d;

        private r(boolean z, n nVar, i iVar, float f) {
            this.a = z;
            this.b = nVar;
            this.c = iVar;
            this.d = f;
        }

        final r a(n nVar) {
            return new r(this.a, nVar, this.c, this.d);
        }

        public i b(boolean z) {
            i iVar = this.c;
            return iVar != GridLayout.r ? iVar : this.d == 0.0f ? z ? GridLayout.w : GridLayout.B : GridLayout.C;
        }

        final int c() {
            return (this.c == GridLayout.r && this.d == 0.0f) ? 0 : 2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            r rVar = (r) obj;
            return this.c.equals(rVar.c) && this.b.equals(rVar.b);
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.c.hashCode();
        }

        r(boolean z, int i, int i2, i iVar, float f) {
            this(z, new n(i, i2 + i), iVar, f);
        }
    }

    public static class o extends ViewGroup.MarginLayoutParams {
        private static final n c;
        private static final int d;
        private static final int e;
        private static final int f;
        private static final int g;
        private static final int h;
        private static final int i;
        private static final int j;
        private static final int k;
        private static final int l;
        private static final int m;
        private static final int n;
        private static final int o;
        private static final int p;
        public r a;
        public r b;

        static {
            n nVar = new n(Integer.MIN_VALUE, -2147483647);
            c = nVar;
            d = nVar.b();
            e = ax.C0.b.q;
            f = ax.C0.b.r;
            g = ax.C0.b.s;
            h = ax.C0.b.t;
            i = ax.C0.b.u;
            j = ax.C0.b.v;
            k = ax.C0.b.w;
            l = ax.C0.b.x;
            m = ax.C0.b.z;
            n = ax.C0.b.A;
            o = ax.C0.b.B;
            p = ax.C0.b.y;
        }

        private o(int i2, int i3, int i4, int i5, int i6, int i7, r rVar, r rVar2) {
            super(i2, i3);
            r rVar3 = r.e;
            this.a = rVar3;
            this.b = rVar3;
            setMargins(i4, i5, i6, i7);
            this.a = rVar;
            this.b = rVar2;
        }

        private void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ax.C0.b.p);
            try {
                int i2 = obtainStyledAttributes.getInt(p, 0);
                int i3 = obtainStyledAttributes.getInt(j, Integer.MIN_VALUE);
                int i4 = k;
                int i5 = d;
                this.b = GridLayout.I(i3, obtainStyledAttributes.getInt(i4, i5), GridLayout.m(i2, true), obtainStyledAttributes.getFloat(l, 0.0f));
                this.a = GridLayout.I(obtainStyledAttributes.getInt(m, Integer.MIN_VALUE), obtainStyledAttributes.getInt(n, i5), GridLayout.m(i2, false), obtainStyledAttributes.getFloat(o, 0.0f));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        private void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ax.C0.b.p);
            try {
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(e, Integer.MIN_VALUE);
                ((ViewGroup.MarginLayoutParams) this).leftMargin = obtainStyledAttributes.getDimensionPixelSize(f, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).topMargin = obtainStyledAttributes.getDimensionPixelSize(g, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).rightMargin = obtainStyledAttributes.getDimensionPixelSize(h, dimensionPixelSize);
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = obtainStyledAttributes.getDimensionPixelSize(i, dimensionPixelSize);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        final void c(n nVar) {
            this.b = this.b.a(nVar);
        }

        final void d(n nVar) {
            this.a = this.a.a(nVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            o oVar = (o) obj;
            return this.b.equals(oVar.b) && this.a.equals(oVar.a);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        @Override // android.view.ViewGroup.LayoutParams
        protected void setBaseAttributes(TypedArray typedArray, int i2, int i3) {
            ((ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i2, -2);
            ((ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i3, -2);
        }

        public o(r rVar, r rVar2) {
            this(-2, -2, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, rVar, rVar2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public o() {
            /*
                r1 = this;
                androidx.gridlayout.widget.GridLayout$r r0 = androidx.gridlayout.widget.GridLayout.r.e
                r1.<init>(r0, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.gridlayout.widget.GridLayout.o.<init>():void");
        }

        public o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            r rVar = r.e;
            this.a = rVar;
            this.b = rVar;
        }

        public o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            r rVar = r.e;
            this.a = rVar;
            this.b = rVar;
        }

        public o(o oVar) {
            super((ViewGroup.MarginLayoutParams) oVar);
            r rVar = r.e;
            this.a = rVar;
            this.b = rVar;
            this.a = oVar.a;
            this.b = oVar.b;
        }

        public o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            r rVar = r.e;
            this.a = rVar;
            this.b = rVar;
            b(context, attributeSet);
            a(context, attributeSet);
        }
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
