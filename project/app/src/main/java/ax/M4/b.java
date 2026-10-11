/*
 * Decompiled with CFR 0.152.
 */
package ax.M4;

import ax.M4.c;
import ax.M4.h;
import ax.p4.f;
import ax.p4.j;
import ax.p4.p;
import ax.p4.s;
import ax.x4.d;

public class b {
    private final d a;

    public b(d d8) {
        this.a = d8;
    }

    public c a() throws f, j {
        try {
            Object object = this.a;
            object = ((d)object).n(((d)object).g().h(), "2/users/get_current_account", null, false, ax.v4.d.j(), c.a.b, ax.v4.d.j());
            return object;
        }
        catch (p p8) {
            String string = p8.e();
            s s8 = p8.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected error response for \"get_current_account\":");
            stringBuilder.append(p8.d());
            throw new f(string, s8, stringBuilder.toString());
        }
    }

    public h b() throws f, j {
        try {
            Object object = this.a;
            object = ((d)object).n(((d)object).g().h(), "2/users/get_space_usage", null, false, ax.v4.d.j(), h.a.b, ax.v4.d.j());
            return object;
        }
        catch (p p8) {
            String string = p8.e();
            s s8 = p8.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected error response for \"get_space_usage\":");
            stringBuilder.append(p8.d());
            throw new f(string, s8, stringBuilder.toString());
        }
    }
}

