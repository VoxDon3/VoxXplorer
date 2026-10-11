/*
 * Decompiled with CFR 0.152.
 */
package ax.Q7;

import ax.J7.w;
import ax.Q7.d;
import ax.Q7.h;
import org.json.JSONObject;

class b
implements h {
    b() {
    }

    static d b(w w8) {
        d.b b8 = new d.b(8, 4);
        d.a a8 = new d.a(true, false, false);
        return new d(w8.a() + (long)3600000, b8, a8, 0, 3600, 10.0, 1.2, 60);
    }

    @Override
    public d a(w w8, JSONObject jSONObject) {
        return b.b(w8);
    }
}

