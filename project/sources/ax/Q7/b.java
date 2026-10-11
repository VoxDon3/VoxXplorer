package ax.Q7;

import ax.J7.InterfaceC0777w;
import ax.Q7.d;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class b implements h {
    b() {
    }

    static d b(InterfaceC0777w interfaceC0777w) {
        return new d(interfaceC0777w.a() + 3600000, new d.b(8, 4), new d.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // ax.Q7.h
    public d a(InterfaceC0777w interfaceC0777w, JSONObject jSONObject) {
        return b(interfaceC0777w);
    }
}
