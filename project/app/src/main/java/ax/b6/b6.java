/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.Z2;
import ax.b6.Z3;
import ax.b6.d;
import ax.b6.k;
import ax.b6.r;
import ax.b6.s;
import ax.b6.u;
import ax.b6.y2;
import java.util.List;

public final class b6
extends r {
    private final d c0;

    public b6(d d8) {
        this.c0 = d8;
    }

    @Override
    public final s k(String object, Z2 object22, List<s> object3) {
        object.getClass();
        int n8 = -1;
        switch (((String)object).hashCode()) {
            default: {
                break;
            }
            case 1570616835: {
                if (!((String)object).equals("setEventName")) break;
                n8 = 5;
                break;
            }
            case 920706790: {
                if (!((String)object).equals("setParamValue")) break;
                n8 = 4;
                break;
            }
            case 700587132: {
                if (!((String)object).equals("getParams")) break;
                n8 = 3;
                break;
            }
            case 146575578: {
                if (!((String)object).equals("getParamValue")) break;
                n8 = 2;
                break;
            }
            case 45521504: {
                if (!((String)object).equals("getTimestamp")) break;
                n8 = 1;
                break;
            }
            case 21624207: {
                if (!((String)object).equals("getEventName")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return super.k((String)object, (Z2)object22, (List<s>)object3);
            }
            case 5: {
                y2.g("setEventName", 1, object3);
                object = ((Z2)object22).b(object3.get(0));
                if (!s.f.equals(object) && !s.g.equals(object)) {
                    this.c0.d().f(object.g());
                    return new u(object.g());
                }
                throw new IllegalArgumentException("Illegal event name");
            }
            case 4: {
                y2.g("setParamValue", 2, object3);
                object = ((Z2)object22).b(object3.get(0)).g();
                object22 = ((Z2)object22).b((s)object3.get(1));
                this.c0.d().d((String)object, y2.d((s)object22));
                return object22;
            }
            case 3: {
                y2.g("getParams", 0, object3);
                object = this.c0.d().g();
                object3 = new r();
                for (Object object22 : object.keySet()) {
                    ((r)object3).n((String)object22, Z3.b(object.get(object22)));
                }
                return object3;
            }
            case 2: {
                y2.g("getParamValue", 1, object3);
                object = ((Z2)object22).b(object3.get(0)).g();
                return Z3.b(this.c0.d().b((String)object));
            }
            case 1: {
                y2.g("getTimestamp", 0, object3);
                return new k(Double.valueOf(this.c0.d().a()));
            }
            case 0: 
        }
        y2.g("getEventName", 0, object3);
        return new u(this.c0.d().e());
    }
}

