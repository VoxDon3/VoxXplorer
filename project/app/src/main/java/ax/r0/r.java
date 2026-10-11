/*
 * Decompiled with CFR 0.152.
 */
package ax.r0;

import ax.r0.A;
import ax.r0.B;
import ax.r0.S;
import ax.r0.d0;
import ax.r0.e;
import ax.r0.g0;
import ax.r0.h;
import ax.r0.j0;
import ax.r0.o0;
import ax.r0.p;
import ax.r0.q;
import ax.r0.u;
import ax.r0.u0;
import ax.r0.v0;
import ax.r0.y;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class r
extends q<y.d> {
    r() {
    }

    @Override
    int a(Map.Entry<?, ?> entry) {
        return ((y.d)entry.getKey()).g();
    }

    @Override
    Object b(p p8, S s8, int n8) {
        return p8.a(s8, n8);
    }

    @Override
    u<y.d> c(Object object) {
        return ((y.c)object).extensions;
    }

    @Override
    u<y.d> d(Object object) {
        return ((y.c)object).J();
    }

    @Override
    boolean e(S s8) {
        return s8 instanceof y.c;
    }

    @Override
    void f(Object object) {
        this.c(object).t();
    }

    @Override
    <UT, UB> UB g(g0 arrayList, Object object, p object2, u<y.d> u8, UB UB, o0<UT, UB> object3) throws IOException {
        y.e e8 = (y.e)object;
        Object object4 = e8.c();
        boolean bl = e8.b.k();
        object = null;
        if (bl && e8.b.z()) {
            switch (a.a[e8.a().ordinal()]) {
                default: {
                    arrayList = new StringBuilder();
                    ((StringBuilder)((Object)arrayList)).append("Type cannot be packed: ");
                    ((StringBuilder)((Object)arrayList)).append((Object)e8.b.m());
                    throw new IllegalStateException(((StringBuilder)((Object)arrayList)).toString());
                }
                case 14: {
                    object = new ArrayList<Integer>();
                    arrayList.v((List<Integer>)object);
                    e8.b.h();
                    UB = j0.z(object4, object, null, UB, object3);
                    arrayList = object;
                    break;
                }
                case 13: {
                    object = new ArrayList();
                    arrayList.h((List<Long>)object);
                    arrayList = object;
                    break;
                }
                case 12: {
                    object = new ArrayList();
                    arrayList.c((List<Integer>)object);
                    arrayList = object;
                    break;
                }
                case 11: {
                    object = new ArrayList();
                    arrayList.t((List<Long>)object);
                    arrayList = object;
                    break;
                }
                case 10: {
                    object = new ArrayList();
                    arrayList.g((List<Integer>)object);
                    arrayList = object;
                    break;
                }
                case 9: {
                    object = new ArrayList();
                    arrayList.i((List<Integer>)object);
                    arrayList = object;
                    break;
                }
                case 8: {
                    object = new ArrayList();
                    arrayList.B((List<Boolean>)object);
                    arrayList = object;
                    break;
                }
                case 7: {
                    object = new ArrayList();
                    arrayList.y((List<Integer>)object);
                    arrayList = object;
                    break;
                }
                case 6: {
                    object = new ArrayList();
                    arrayList.P((List<Long>)object);
                    arrayList = object;
                    break;
                }
                case 5: {
                    object = new ArrayList();
                    arrayList.u((List<Integer>)object);
                    arrayList = object;
                    break;
                }
                case 4: {
                    object = new ArrayList();
                    arrayList.o((List<Long>)object);
                    arrayList = object;
                    break;
                }
                case 3: {
                    object = new ArrayList();
                    arrayList.s((List<Long>)object);
                    arrayList = object;
                    break;
                }
                case 2: {
                    object = new ArrayList();
                    arrayList.H((List<Float>)object);
                    arrayList = object;
                    break;
                }
                case 1: {
                    object = new ArrayList();
                    arrayList.M((List<Double>)object);
                    arrayList = object;
                }
            }
            u8.x(e8.b, arrayList);
            return UB;
        }
        if (e8.a() != u0.b.q0) {
            object3 = a.a;
            switch (object3[e8.a().ordinal()]) {
                default: {
                    arrayList = object;
                    break;
                }
                case 18: {
                    arrayList = arrayList.x(e8.b().getClass(), (p)object2);
                    break;
                }
                case 17: {
                    arrayList = arrayList.q(e8.b().getClass(), (p)object2);
                    break;
                }
                case 16: {
                    arrayList = arrayList.C();
                    break;
                }
                case 15: {
                    arrayList = arrayList.G();
                    break;
                }
                case 14: {
                    throw new IllegalStateException("Shouldn't reach here.");
                }
                case 13: {
                    arrayList = arrayList.A();
                    break;
                }
                case 12: {
                    arrayList = arrayList.z();
                    break;
                }
                case 11: {
                    arrayList = arrayList.n();
                    break;
                }
                case 10: {
                    arrayList = arrayList.K();
                    break;
                }
                case 9: {
                    arrayList = arrayList.p();
                    break;
                }
                case 8: {
                    arrayList = arrayList.m();
                    break;
                }
                case 7: {
                    arrayList = arrayList.k();
                    break;
                }
                case 6: {
                    arrayList = arrayList.e();
                    break;
                }
                case 5: {
                    arrayList = arrayList.I();
                    break;
                }
                case 4: {
                    arrayList = arrayList.d();
                    break;
                }
                case 3: {
                    arrayList = arrayList.N();
                    break;
                }
                case 2: {
                    arrayList = Float.valueOf(arrayList.readFloat());
                    break;
                }
                case 1: {
                    arrayList = arrayList.readDouble();
                }
            }
            if (e8.d()) {
                u8.a(e8.b, arrayList);
                return UB;
            }
            object4 = object3[e8.a().ordinal()];
            if (object4 != 17 && object4 != 18) {
                object = arrayList;
            } else {
                object2 = u8.i(e8.b);
                object = arrayList;
                if (object2 != null) {
                    object = A.h(object2, arrayList);
                }
            }
            u8.x(e8.b, object);
            return UB;
        }
        arrayList.I();
        e8.b.h();
        throw null;
    }

    @Override
    void h(g0 g02, Object object, p p8, u<y.d> u8) throws IOException {
        object = (y.e)object;
        g02 = g02.x(((y.e)object).b().getClass(), p8);
        u8.x(((y.e)object).b, g02);
    }

    @Override
    void i(h object, Object object2, p p8, u<y.d> u8) throws IOException {
        object2 = (y.e)object2;
        S s8 = ((y.e)object2).b().j().u0();
        object = e.Q(ByteBuffer.wrap(((h)object).z()), true);
        d0.a().b(s8, (g0)object, p8);
        u8.x(((y.e)object2).b, s8);
        if (object.D() == Integer.MAX_VALUE) {
            return;
        }
        throw B.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    void j(v0 v02, Map.Entry<?, ?> entry) throws IOException {
        y.d d8 = (y.d)entry.getKey();
        if (d8.k()) {
            switch (a.a[d8.m().ordinal()]) {
                default: {
                    return;
                }
                case 18: {
                    List list = (List)entry.getValue();
                    if (list == null || list.isEmpty()) return;
                    j0.X(d8.g(), (List)entry.getValue(), v02, d0.a().d(list.get(0).getClass()));
                    return;
                }
                case 17: {
                    List list = (List)entry.getValue();
                    if (list == null || list.isEmpty()) return;
                    j0.U(d8.g(), (List)entry.getValue(), v02, d0.a().d(list.get(0).getClass()));
                    return;
                }
                case 16: {
                    j0.c0(d8.g(), (List)entry.getValue(), v02);
                    return;
                }
                case 15: {
                    j0.O(d8.g(), (List)entry.getValue(), v02);
                    return;
                }
                case 14: {
                    j0.V(d8.g(), (List)entry.getValue(), v02, d8.z());
                    return;
                }
                case 13: {
                    j0.b0(d8.g(), (List)entry.getValue(), v02, d8.z());
                    return;
                }
                case 12: {
                    j0.a0(d8.g(), (List)entry.getValue(), v02, d8.z());
                    return;
                }
                case 11: {
                    j0.Z(d8.g(), (List)entry.getValue(), v02, d8.z());
                    return;
                }
                case 10: {
                    j0.Y(d8.g(), (List)entry.getValue(), v02, d8.z());
                    return;
                }
                case 9: {
                    j0.d0(d8.g(), (List)entry.getValue(), v02, d8.z());
                    return;
                }
                case 8: {
                    j0.N(d8.g(), (List)entry.getValue(), v02, d8.z());
                    return;
                }
                case 7: {
                    j0.R(d8.g(), (List)entry.getValue(), v02, d8.z());
                    return;
                }
                case 6: {
                    j0.S(d8.g(), (List)entry.getValue(), v02, d8.z());
                    return;
                }
                case 5: {
                    j0.V(d8.g(), (List)entry.getValue(), v02, d8.z());
                    return;
                }
                case 4: {
                    j0.e0(d8.g(), (List)entry.getValue(), v02, d8.z());
                    return;
                }
                case 3: {
                    j0.W(d8.g(), (List)entry.getValue(), v02, d8.z());
                    return;
                }
                case 2: {
                    j0.T(d8.g(), (List)entry.getValue(), v02, d8.z());
                    return;
                }
                case 1: {
                    j0.P(d8.g(), (List)entry.getValue(), v02, d8.z());
                    return;
                }
            }
        }
        switch (a.a[d8.m().ordinal()]) {
            default: {
                return;
            }
            case 18: {
                v02.I(d8.g(), entry.getValue(), d0.a().d(entry.getValue().getClass()));
                return;
            }
            case 17: {
                v02.s(d8.g(), entry.getValue(), d0.a().d(entry.getValue().getClass()));
                return;
            }
            case 16: {
                v02.l(d8.g(), (String)entry.getValue());
                return;
            }
            case 15: {
                v02.r(d8.g(), (h)entry.getValue());
                return;
            }
            case 14: {
                v02.u(d8.g(), (Integer)entry.getValue());
                return;
            }
            case 13: {
                v02.D(d8.g(), (Long)entry.getValue());
                return;
            }
            case 12: {
                v02.N(d8.g(), (Integer)entry.getValue());
                return;
            }
            case 11: {
                v02.y(d8.g(), (Long)entry.getValue());
                return;
            }
            case 10: {
                v02.q(d8.g(), (Integer)entry.getValue());
                return;
            }
            case 9: {
                v02.b(d8.g(), (Integer)entry.getValue());
                return;
            }
            case 8: {
                v02.p(d8.g(), (Boolean)entry.getValue());
                return;
            }
            case 7: {
                v02.d(d8.g(), (Integer)entry.getValue());
                return;
            }
            case 6: {
                v02.i(d8.g(), (Long)entry.getValue());
                return;
            }
            case 5: {
                v02.u(d8.g(), (Integer)entry.getValue());
                return;
            }
            case 4: {
                v02.m(d8.g(), (Long)entry.getValue());
                return;
            }
            case 3: {
                v02.o(d8.g(), (Long)entry.getValue());
                return;
            }
            case 2: {
                v02.E(d8.g(), ((Float)entry.getValue()).floatValue());
                return;
            }
            case 1: 
        }
        v02.e(d8.g(), (Double)entry.getValue());
    }
}

