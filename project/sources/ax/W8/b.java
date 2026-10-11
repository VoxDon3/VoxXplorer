package ax.W8;

import ax.Y8.c;
import ax.Z8.a;
import java.util.EnumSet;

/* loaded from: classes3.dex */
public class b extends f {
    private static final ax.Xd.d j = ax.Xd.f.k(b.class);
    private int a;
    private int b;
    private EnumSet<e> c;
    private byte[] d;
    private i e;
    private int f;
    private int g;
    private String h;
    private g i;

    private void h(a.c cVar) throws a.b {
        if (this.f > 0) {
            cVar.T(this.g);
            this.i = new g().e(cVar);
        }
    }

    private void i(a.c cVar) throws a.b {
        if (!this.c.contains(e.NTLMSSP_NEGOTIATE_TARGET_INFO)) {
            cVar.U(8);
            return;
        }
        this.f = cVar.J();
        cVar.U(2);
        this.g = cVar.P();
    }

    private void j(a.c cVar) throws a.b {
        if (this.a > 0) {
            cVar.T(this.b);
            this.h = cVar.H(ax.Y8.b.c, this.a / 2);
        }
    }

    private void k(a.c cVar) throws a.b {
        this.a = cVar.J();
        cVar.U(2);
        this.b = cVar.P();
    }

    private void l(a.c cVar) throws a.b {
        if (!this.c.contains(e.NTLMSSP_NEGOTIATE_VERSION)) {
            cVar.U(8);
            return;
        }
        i b = new i().b(cVar);
        this.e = b;
        j.s("Windows version = {}", b);
    }

    public EnumSet<e> b() {
        return this.c;
    }

    public byte[] c() {
        return this.d;
    }

    public g d() {
        return this.i;
    }

    public String e() {
        return this.h;
    }

    public i f() {
        return this.e;
    }

    public void g(a.c cVar) throws a.b {
        cVar.H(ax.Y8.b.a, 8);
        cVar.N();
        k(cVar);
        this.c = c.a.d(cVar.N(), e.class);
        this.d = cVar.G(8);
        cVar.U(8);
        i(cVar);
        l(cVar);
        j(cVar);
        h(cVar);
    }

    public String toString() {
        return "NtlmChallenge{\n  targetName='" + this.h + "',\n  negotiateFlags=" + this.c + ",\n  serverChallenge=" + ax.Y8.a.a(this.d) + ",\n  version=" + this.e + ",\n  targetInfo=" + this.i + "\n}";
    }
}
