package ax.l1;

import ax.P0.C0912v;
import ax.P0.N;
import ax.P0.P;
import ax.S0.C0987u;
import ax.i1.InterfaceC2209F;
import ax.j1.AbstractC2304b;
import ax.j1.AbstractC2306d;
import ax.j1.InterfaceC2307e;
import java.util.List;

/* renamed from: ax.l1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2445D extends InterfaceC2449H {

    /* renamed from: ax.l1.D$a */
    public static final class a {
        public final P a;
        public final int[] b;
        public final int c;

        public a(P p, int... iArr) {
            this(p, iArr, 0);
        }

        public a(P p, int[] iArr, int i) {
            if (iArr.length == 0) {
                C0987u.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.a = p;
            this.b = iArr;
            this.c = i;
        }
    }

    /* renamed from: ax.l1.D$b */
    public interface b {
        InterfaceC2445D[] a(a[] aVarArr, ax.m1.e eVar, InterfaceC2209F.b bVar, N n);
    }

    boolean a(int i, long j);

    void c(long j, long j2, long j3, List<? extends AbstractC2306d> list, InterfaceC2307e[] interfaceC2307eArr);

    int d();

    boolean e(long j, AbstractC2304b abstractC2304b, List<? extends AbstractC2306d> list);

    void f();

    void g(boolean z);

    void i();

    int k(long j, List<? extends AbstractC2306d> list);

    int l();

    C0912v m();

    int n();

    boolean o(int i, long j);

    void p(float f);

    Object q();

    void r();

    void s();
}
