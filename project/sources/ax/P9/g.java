package ax.P9;

import ax.s8.InterfaceC3061c;

/* loaded from: classes3.dex */
public class g {

    @InterfaceC3061c("message")
    public String a;

    @InterfaceC3061c("code")
    public String b;

    @InterfaceC3061c("innererror")
    public i c;

    public boolean a(ax.M9.e eVar) {
        if (this.b.equalsIgnoreCase(eVar.toString())) {
            return true;
        }
        for (i iVar = this.c; iVar != null; iVar = iVar.f) {
            if (iVar.a.equalsIgnoreCase(eVar.toString())) {
                return true;
            }
        }
        return false;
    }
}
