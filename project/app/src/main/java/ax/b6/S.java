/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.A;
import ax.b6.V;
import ax.b6.Z;
import ax.b6.Z2;
import ax.b6.k;
import ax.b6.m;
import ax.b6.s;
import ax.b6.u;
import ax.b6.y2;
import java.util.List;

public final class S
extends A {
    protected S() {
        this.a.add(Z.c0);
        this.a.add(Z.x0);
        this.a.add(Z.U0);
        this.a.add(Z.V0);
        this.a.add(Z.W0);
        this.a.add(Z.c1);
        this.a.add(Z.d1);
        this.a.add(Z.f1);
        this.a.add(Z.g1);
        this.a.add(Z.j1);
    }

    @Override
    public final s b(String object, Z2 object2, List<s> object3) {
        switch (V.a[y2.c((String)object).ordinal()]) {
            default: {
                return super.a((String)object);
            }
            case 10: {
                y2.f(Z.j1, 2, object3);
                object = ((Z2)object2).b(object3.get(0));
                object2 = new k(((Z2)object2).b(object3.get(1)).f() * -1.0);
                return new k(object.f() + object2.f());
            }
            case 8: 
            case 9: {
                y2.g((String)object, 1, object3);
                return ((Z2)object2).b(object3.get(0));
            }
            case 6: 
            case 7: {
                y2.g((String)object, 2, object3);
                object = ((Z2)object2).b(object3.get(0));
                ((Z2)object2).b(object3.get(1));
                return object;
            }
            case 5: {
                y2.f(Z.W0, 1, object3);
                return new k(((Z2)object2).b(object3.get(0)).f() * -1.0);
            }
            case 4: {
                y2.f(Z.V0, 2, object3);
                return new k(((Z2)object2).b(object3.get(0)).f() * ((Z2)object2).b(object3.get(1)).f());
            }
            case 3: {
                y2.f(Z.U0, 2, object3);
                return new k(((Z2)object2).b(object3.get(0)).f() % ((Z2)object2).b(object3.get(1)).f());
            }
            case 2: {
                y2.f(Z.x0, 2, object3);
                return new k(((Z2)object2).b(object3.get(0)).f() / ((Z2)object2).b(object3.get(1)).f());
            }
            case 1: 
        }
        y2.f(Z.c0, 2, object3);
        object = ((Z2)object2).b(object3.get(0));
        object2 = ((Z2)object2).b(object3.get(1));
        if (!(object instanceof m || object instanceof u || object2 instanceof m || object2 instanceof u)) {
            return new k(object.f() + object2.f());
        }
        object = object.g();
        object2 = object2.g();
        object3 = new StringBuilder();
        ((StringBuilder)object3).append((String)object);
        ((StringBuilder)object3).append((String)object2);
        return new u(((StringBuilder)object3).toString());
    }
}

