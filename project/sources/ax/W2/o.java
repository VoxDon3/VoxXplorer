package ax.W2;

import android.content.DialogInterface;
import android.widget.Toast;
import ax.W2.h;
import ax.a3.r;
import ax.b3.C1488c;
import ax.b3.C1495j;
import ax.c3.C1835x;
import ax.c3.K;
import ax.d3.InterfaceC1931s;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3587f;
import com.voxdon.xplorer.file.C3596o;
import com.voxdon.xplorer.file.J;
import com.voxdon.xplorer.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class o extends h {
    private C3596o d;
    private List<AbstractC3595n> e;
    private List<AbstractC3595n> f;
    private int g;
    private long h;
    private boolean i;
    private Map<String, C3587f.a> j;
    private boolean k;

    class a implements r.f {
        final /* synthetic */ InterfaceC1931s a;
        final /* synthetic */ o b;

        a(InterfaceC1931s interfaceC1931s, o oVar) {
            this.a = interfaceC1931s;
            this.b = oVar;
        }

        @Override // ax.a3.r.f
        public void a(boolean z) {
            if (z) {
                try {
                    this.a.l(this.b, true);
                } catch (C1488c unused) {
                    Toast.makeText(this.a.b(), R.string.error, 1).show();
                }
            }
        }
    }

    class b implements r.f {
        final /* synthetic */ InterfaceC1931s a;
        final /* synthetic */ o b;
        final /* synthetic */ boolean c;

        b(InterfaceC1931s interfaceC1931s, o oVar, boolean z) {
            this.a = interfaceC1931s;
            this.b = oVar;
            this.c = z;
        }

        @Override // ax.a3.r.f
        public void a(boolean z) {
            if (z) {
                try {
                    this.a.l(this.b, this.c);
                } catch (C1488c unused) {
                    Toast.makeText(this.a.b(), R.string.error, 1).show();
                }
            }
        }
    }

    public static void l(InterfaceC1931s interfaceC1931s, C3596o c3596o, List<AbstractC3595n> list, int i, boolean z, boolean z2, int i2, int i3, h.a aVar, DialogInterface.OnCancelListener onCancelListener) {
        o v = v();
        v.o(c3596o, list, i == 4, aVar);
        boolean z3 = i == 2;
        boolean z4 = i == 2 || i == 3;
        v.y(z3);
        if (z2) {
            try {
                interfaceC1931s.l(v, z);
                return;
            } catch (C1488c unused) {
                Toast.makeText(interfaceC1931s.b(), R.string.error, 1).show();
                return;
            }
        }
        i.d(v);
        ax.a3.r A3 = ax.a3.r.A3(v, c3596o.T(), i2, i3, z3, z4);
        A3.G3(onCancelListener);
        A3.F3(new b(interfaceC1931s, v, z));
        if (interfaceC1931s.A(A3, "delete", true)) {
            return;
        }
        i.c(v.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(com.voxdon.xplorer.file.C3596o r14, java.util.List<com.voxdon.xplorer.file.AbstractC3595n> r15, int r16, boolean r17, ax.d3.InterfaceC1931s r18, boolean r19, ax.W2.h.a r20, android.content.DialogInterface.OnCancelListener r21) {
        /*
            r0 = r16
            r1 = 2
            r2 = 1
            if (r0 != r2) goto L8
        L6:
            r7 = 1
            goto L29
        L8:
            if (r0 != r1) goto Lf
            ax.u3.C3184b.c(r17)
        Ld:
            r7 = 2
            goto L29
        Lf:
            if (r17 == 0) goto L6
            android.content.Context r0 = r14.t()
            boolean r0 = ax.t3.j.G(r0)
            r3 = 3
            if (r0 == 0) goto L28
            boolean r0 = t(r14)
            if (r0 != 0) goto L28
            boolean r0 = r(r15)
            if (r0 == 0) goto Ld
        L28:
            r7 = 3
        L29:
            if (r7 != r1) goto L37
            android.content.Context r0 = r14.t()
            boolean r0 = ax.t3.j.A(r0)
            if (r0 != 0) goto L37
            r9 = 1
            goto L39
        L37:
            r2 = 0
            r9 = 0
        L39:
            r10 = 0
            r11 = 0
            r5 = r14
            r6 = r15
            r4 = r18
            r8 = r19
            r12 = r20
            r13 = r21
            l(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.W2.o.m(com.voxdon.xplorer.file.o, java.util.List, int, boolean, ax.d3.s, boolean, ax.W2.h$a, android.content.DialogInterface$OnCancelListener):void");
    }

    public static void n(InterfaceC1931s interfaceC1931s, K k, h.a aVar) {
        o v = v();
        i.d(v);
        v.i(aVar);
        v.x(true);
        ax.a3.r z3 = ax.a3.r.z3(v, k);
        z3.F3(new a(interfaceC1931s, v));
        if (interfaceC1931s.A(z3, "delete", true)) {
            return;
        }
        i.c(v.e());
    }

    private static boolean r(List<AbstractC3595n> list) {
        if (list == null) {
            return false;
        }
        Iterator<AbstractC3595n> it = list.iterator();
        while (it.hasNext()) {
            if (J.i2(it.next())) {
                return true;
            }
        }
        return false;
    }

    private static boolean t(C3596o c3596o) {
        if (!ax.Q2.f.j0(c3596o.S())) {
            return false;
        }
        try {
            if (c3596o.S() == ax.Q2.f.q0) {
                c3596o = C1835x.g(K.i.e());
            }
            long v = c3596o.v();
            return v > 0 && v < 5242880;
        } catch (C1495j unused) {
            return false;
        }
    }

    public static o v() {
        return new o();
    }

    public void A(long j) {
        this.h = j;
    }

    @Override // ax.W2.h
    protected j b() {
        return this.i ? new q(f(), this.d, this.e, this.g, this.h, this.j) : new p(f(), this.d, this.e, this.f, this.g, this.h, u(), this.k, this.j);
    }

    public void k() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<AbstractC3595n> it = this.e.iterator();
        while (it.hasNext()) {
            try {
                com.voxdon.xplorer.file.K k = (com.voxdon.xplorer.file.K) it.next();
                AbstractC3595n z = this.d.z(k.z1());
                if (z.n()) {
                    AbstractC3595n z2 = this.d.z(k.B1());
                    if (z2.n() && z2.E().contains(".$recycle_bin$")) {
                        arrayList.add(z2);
                        arrayList2.add(z);
                    } else {
                        this.d.P(z);
                    }
                }
            } catch (C1495j unused) {
            }
        }
        this.e = arrayList;
        this.f = arrayList2;
    }

    public void o(C3596o c3596o, List<AbstractC3595n> list, boolean z, h.a aVar) {
        i(aVar);
        this.d = c3596o;
        this.i = false;
        this.g = 0;
        this.h = 0L;
        this.e = list;
        this.f = new ArrayList();
        this.j = null;
        this.k = z;
        j(h.c.FILLED);
    }

    public boolean p() {
        return this.i;
    }

    public List<AbstractC3595n> q() {
        return this.e;
    }

    public boolean s() {
        return this.k;
    }

    public boolean u() {
        C3596o c3596o = this.d;
        return c3596o != null && c3596o.S() == ax.Q2.f.o1;
    }

    public void w(Map<String, C3587f.a> map) {
        this.j = map;
    }

    public void x(boolean z) {
        this.k = z;
    }

    public void y(boolean z) {
        this.i = z;
    }

    public void z(int i) {
        this.g = i;
    }
}
