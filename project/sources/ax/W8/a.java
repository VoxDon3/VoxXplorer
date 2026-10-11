package ax.W8;

import ax.Y8.c;
import ax.Z8.a;
import java.util.Set;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class a extends c {
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;

    public a(byte[] bArr, byte[] bArr2, String str, String str2, String str3, byte[] bArr3, Set<e> set, i iVar) {
        super(set, iVar);
        this.d = h.b(bArr);
        this.e = h.b(bArr2);
        this.f = h.a(str);
        this.g = h.a(str2);
        this.h = h.a(str3);
        this.i = h.b(bArr3);
        this.a = set;
    }

    private int b() {
        int i = (this.a.contains(e.NTLMSSP_NEGOTIATE_VERSION) || this.j != null) ? 72 : 64;
        return this.j != null ? i + 16 : i;
    }

    public byte[] c() {
        a.c cVar = new a.c(ax.Z8.b.b);
        cVar.j((byte) 6);
        cVar.j((byte) 1);
        cVar.s(7600);
        cVar.o(new byte[]{0, 0, 0});
        cVar.j((byte) 15);
        return cVar.f();
    }

    public void d(byte[] bArr) {
        this.j = bArr;
    }

    public void e(a.c cVar) {
        cVar.q("NTLMSSP\u0000", ax.Y8.b.a);
        cVar.u(3L);
        h.c(cVar, this.i, h.c(cVar, this.h, h.c(cVar, this.f, h.c(cVar, this.g, h.c(cVar, this.e, h.c(cVar, this.d, b()))))));
        cVar.u(c.a.e(this.a));
        if (this.a.contains(e.NTLMSSP_NEGOTIATE_VERSION)) {
            cVar.o(c());
        } else if (this.j != null) {
            cVar.w(0L);
        }
        byte[] bArr = this.j;
        if (bArr != null) {
            cVar.p(bArr, 0, 16);
        }
        cVar.o(this.d);
        cVar.o(this.e);
        cVar.o(this.g);
        cVar.o(this.f);
        cVar.o(this.h);
        cVar.o(this.i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NtlmAuthenticate{\n  mic=");
        byte[] bArr = this.j;
        sb.append(bArr != null ? ax.Y8.a.a(bArr) : HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        sb.append(",\n  lmResponse=");
        sb.append(ax.Y8.a.a(this.d));
        sb.append(",\n  ntResponse=");
        sb.append(ax.Y8.a.a(this.e));
        sb.append(",\n  domainName='");
        sb.append(ax.V8.b.g(this.g));
        sb.append("',\n  userName='");
        sb.append(ax.V8.b.g(this.f));
        sb.append("',\n  workstation='");
        sb.append(ax.V8.b.g(this.h));
        sb.append("',\n  encryptedRandomSessionKey=[<secret>],\n");
        sb.append('}');
        return sb.toString();
    }
}
