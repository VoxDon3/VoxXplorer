package ax.r0;

import ax.r0.AbstractC2937y;
import ax.r0.u0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class r extends AbstractC2930q<AbstractC2937y.d> {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u0.b.values().length];
            a = iArr;
            try {
                iArr[u0.b.d0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[u0.b.e0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[u0.b.f0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[u0.b.g0.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[u0.b.h0.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[u0.b.i0.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[u0.b.j0.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[u0.b.k0.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[u0.b.p0.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[u0.b.r0.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[u0.b.s0.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[u0.b.t0.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[u0.b.u0.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[u0.b.q0.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[u0.b.o0.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[u0.b.l0.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[u0.b.m0.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[u0.b.n0.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    r() {
    }

    @Override // ax.r0.AbstractC2930q
    int a(Map.Entry<?, ?> entry) {
        return ((AbstractC2937y.d) entry.getKey()).g();
    }

    @Override // ax.r0.AbstractC2930q
    Object b(C2929p c2929p, S s, int i) {
        return c2929p.a(s, i);
    }

    @Override // ax.r0.AbstractC2930q
    C2933u<AbstractC2937y.d> c(Object obj) {
        return ((AbstractC2937y.c) obj).extensions;
    }

    @Override // ax.r0.AbstractC2930q
    C2933u<AbstractC2937y.d> d(Object obj) {
        return ((AbstractC2937y.c) obj).J();
    }

    @Override // ax.r0.AbstractC2930q
    boolean e(S s) {
        return s instanceof AbstractC2937y.c;
    }

    @Override // ax.r0.AbstractC2930q
    void f(Object obj) {
        c(obj).t();
    }

    @Override // ax.r0.AbstractC2930q
    <UT, UB> UB g(g0 g0Var, Object obj, C2929p c2929p, C2933u<AbstractC2937y.d> c2933u, UB ub, o0<UT, UB> o0Var) throws IOException {
        Object i;
        ArrayList arrayList;
        AbstractC2937y.e eVar = (AbstractC2937y.e) obj;
        int c = eVar.c();
        Object obj2 = null;
        if (eVar.b.k() && eVar.b.z()) {
            switch (a.a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    g0Var.M(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    g0Var.H(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    g0Var.s(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    g0Var.o(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    g0Var.u(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    g0Var.P(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    g0Var.y(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    g0Var.B(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    g0Var.i(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    g0Var.g(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    g0Var.t(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    g0Var.c(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    g0Var.h(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    g0Var.v(arrayList);
                    eVar.b.h();
                    ub = (UB) j0.z(c, arrayList, null, ub, o0Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.b.m());
            }
            c2933u.x(eVar.b, arrayList);
            return ub;
        }
        if (eVar.a() == u0.b.q0) {
            g0Var.I();
            eVar.b.h();
            throw null;
        }
        int[] iArr = a.a;
        switch (iArr[eVar.a().ordinal()]) {
            case 1:
                obj2 = Double.valueOf(g0Var.readDouble());
                break;
            case 2:
                obj2 = Float.valueOf(g0Var.readFloat());
                break;
            case 3:
                obj2 = Long.valueOf(g0Var.N());
                break;
            case 4:
                obj2 = Long.valueOf(g0Var.d());
                break;
            case 5:
                obj2 = Integer.valueOf(g0Var.I());
                break;
            case 6:
                obj2 = Long.valueOf(g0Var.e());
                break;
            case 7:
                obj2 = Integer.valueOf(g0Var.k());
                break;
            case 8:
                obj2 = Boolean.valueOf(g0Var.m());
                break;
            case 9:
                obj2 = Integer.valueOf(g0Var.p());
                break;
            case 10:
                obj2 = Integer.valueOf(g0Var.K());
                break;
            case 11:
                obj2 = Long.valueOf(g0Var.n());
                break;
            case 12:
                obj2 = Integer.valueOf(g0Var.z());
                break;
            case 13:
                obj2 = Long.valueOf(g0Var.A());
                break;
            case 14:
                throw new IllegalStateException("Shouldn't reach here.");
            case 15:
                obj2 = g0Var.G();
                break;
            case 16:
                obj2 = g0Var.C();
                break;
            case 17:
                obj2 = g0Var.q(eVar.b().getClass(), c2929p);
                break;
            case 18:
                obj2 = g0Var.x(eVar.b().getClass(), c2929p);
                break;
        }
        if (eVar.d()) {
            c2933u.a(eVar.b, obj2);
            return ub;
        }
        int i2 = iArr[eVar.a().ordinal()];
        if ((i2 == 17 || i2 == 18) && (i = c2933u.i(eVar.b)) != null) {
            obj2 = C2904A.h(i, obj2);
        }
        c2933u.x(eVar.b, obj2);
        return ub;
    }

    @Override // ax.r0.AbstractC2930q
    void h(g0 g0Var, Object obj, C2929p c2929p, C2933u<AbstractC2937y.d> c2933u) throws IOException {
        AbstractC2937y.e eVar = (AbstractC2937y.e) obj;
        c2933u.x(eVar.b, g0Var.x(eVar.b().getClass(), c2929p));
    }

    @Override // ax.r0.AbstractC2930q
    void i(AbstractC2921h abstractC2921h, Object obj, C2929p c2929p, C2933u<AbstractC2937y.d> c2933u) throws IOException {
        AbstractC2937y.e eVar = (AbstractC2937y.e) obj;
        S u0 = eVar.b().j().u0();
        AbstractC2918e Q = AbstractC2918e.Q(ByteBuffer.wrap(abstractC2921h.z()), true);
        d0.a().b(u0, Q, c2929p);
        c2933u.x(eVar.b, u0);
        if (Q.D() != Integer.MAX_VALUE) {
            throw C2905B.a();
        }
    }

    @Override // ax.r0.AbstractC2930q
    void j(v0 v0Var, Map.Entry<?, ?> entry) throws IOException {
        AbstractC2937y.d dVar = (AbstractC2937y.d) entry.getKey();
        if (!dVar.k()) {
            switch (a.a[dVar.m().ordinal()]) {
                case 1:
                    v0Var.e(dVar.g(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    v0Var.E(dVar.g(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    v0Var.o(dVar.g(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    v0Var.m(dVar.g(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    v0Var.u(dVar.g(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    v0Var.i(dVar.g(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    v0Var.d(dVar.g(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    v0Var.p(dVar.g(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    v0Var.b(dVar.g(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    v0Var.q(dVar.g(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    v0Var.y(dVar.g(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    v0Var.N(dVar.g(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    v0Var.D(dVar.g(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    v0Var.u(dVar.g(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    v0Var.r(dVar.g(), (AbstractC2921h) entry.getValue());
                    break;
                case 16:
                    v0Var.l(dVar.g(), (String) entry.getValue());
                    break;
                case 17:
                    v0Var.s(dVar.g(), entry.getValue(), d0.a().d(entry.getValue().getClass()));
                    break;
                case 18:
                    v0Var.I(dVar.g(), entry.getValue(), d0.a().d(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.a[dVar.m().ordinal()]) {
            case 1:
                j0.P(dVar.g(), (List) entry.getValue(), v0Var, dVar.z());
                break;
            case 2:
                j0.T(dVar.g(), (List) entry.getValue(), v0Var, dVar.z());
                break;
            case 3:
                j0.W(dVar.g(), (List) entry.getValue(), v0Var, dVar.z());
                break;
            case 4:
                j0.e0(dVar.g(), (List) entry.getValue(), v0Var, dVar.z());
                break;
            case 5:
                j0.V(dVar.g(), (List) entry.getValue(), v0Var, dVar.z());
                break;
            case 6:
                j0.S(dVar.g(), (List) entry.getValue(), v0Var, dVar.z());
                break;
            case 7:
                j0.R(dVar.g(), (List) entry.getValue(), v0Var, dVar.z());
                break;
            case 8:
                j0.N(dVar.g(), (List) entry.getValue(), v0Var, dVar.z());
                break;
            case 9:
                j0.d0(dVar.g(), (List) entry.getValue(), v0Var, dVar.z());
                break;
            case 10:
                j0.Y(dVar.g(), (List) entry.getValue(), v0Var, dVar.z());
                break;
            case 11:
                j0.Z(dVar.g(), (List) entry.getValue(), v0Var, dVar.z());
                break;
            case 12:
                j0.a0(dVar.g(), (List) entry.getValue(), v0Var, dVar.z());
                break;
            case 13:
                j0.b0(dVar.g(), (List) entry.getValue(), v0Var, dVar.z());
                break;
            case 14:
                j0.V(dVar.g(), (List) entry.getValue(), v0Var, dVar.z());
                break;
            case 15:
                j0.O(dVar.g(), (List) entry.getValue(), v0Var);
                break;
            case 16:
                j0.c0(dVar.g(), (List) entry.getValue(), v0Var);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    j0.U(dVar.g(), (List) entry.getValue(), v0Var, d0.a().d(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    j0.X(dVar.g(), (List) entry.getValue(), v0Var, d0.a().d(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
