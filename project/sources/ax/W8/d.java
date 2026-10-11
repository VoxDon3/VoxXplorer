package ax.W8;

import ax.Y8.c;
import ax.Z8.a;
import java.util.Set;

/* loaded from: classes3.dex */
public class d extends c {
    private byte[] d;
    private byte[] e;
    private boolean f;

    public d(Set<e> set, String str, String str2, i iVar, boolean z) {
        super(set, iVar);
        this.d = str != null ? ax.V8.b.e(str) : h.a;
        this.e = str2 != null ? ax.V8.b.e(str2) : h.a;
        this.f = z;
    }

    public void b(a.c cVar) {
        cVar.q("NTLMSSP\u0000", ax.Y8.b.a);
        cVar.u(1L);
        cVar.u(c.a.e(this.a));
        int i = !this.f ? 40 : 32;
        if (this.a.contains(e.NTLMSSP_NEGOTIATE_OEM_DOMAIN_SUPPLIED)) {
            i = h.c(cVar, this.d, i);
        } else {
            cVar.s(0);
            cVar.s(0);
            cVar.u(0L);
        }
        if (this.a.contains(e.NTLMSSP_NEGOTIATE_OEM_WORKSTATION_SUPPLIED)) {
            h.c(cVar, this.e, i);
        } else {
            cVar.s(0);
            cVar.s(0);
            cVar.u(0L);
        }
        if (!this.f && this.a.contains(e.NTLMSSP_NEGOTIATE_VERSION)) {
            this.b.c(cVar);
        } else if (!this.f) {
            cVar.w(0L);
        }
        cVar.o(this.d);
        cVar.o(this.e);
    }

    public String toString() {
        return "NtlmNegotiate{\n  domain='" + ax.V8.b.d(this.d) + "'',\n  workstation='" + ax.V8.b.d(this.e) + "',\n  negotiateFlags=" + this.a + ",\n  version=" + this.b + "\n}";
    }
}
