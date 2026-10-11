package ax.O9;

import ax.N9.C0874v;
import ax.N9.E0;
import ax.N9.InterfaceC0836b0;
import ax.N9.InterfaceC0842e0;
import ax.N9.c1;

/* loaded from: classes3.dex */
public class o extends ax.M9.b implements F {
    private String f;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.O9.F
    public E0 d() {
        return new c1(l() + "/me", (InterfaceC0842e0) this, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.O9.F
    public InterfaceC0836b0 e(String str) {
        return new C0874v(l() + "/drives/" + str, (InterfaceC0842e0) this, null);
    }

    public String l() {
        if (this.f == null) {
            this.f = "https://graph.microsoft.com/v1.0";
        }
        return this.f;
    }
}
