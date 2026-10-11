package ax.R8;

import ax.Q8.EnumC0920d;
import ax.Q8.EnumC0921e;
import ax.Y8.c;
import ax.h9.C2171b;
import java.util.Set;

/* loaded from: classes3.dex */
public class d extends ax.Q8.q {
    private final Set<ax.L8.a> e;
    private final Set<ax.Q8.u> f;
    private final EnumC0920d g;
    private final Set<EnumC0921e> h;
    private final ax.k9.e i;
    private final Set<ax.J8.a> j;
    private final ax.Q8.l k;

    public d(ax.Q8.g gVar, long j, long j2, ax.Q8.l lVar, Set<ax.J8.a> set, Set<ax.L8.a> set2, Set<ax.Q8.u> set3, EnumC0920d enumC0920d, Set<EnumC0921e> set4, ax.k9.e eVar) {
        super(57, gVar, ax.Q8.m.SMB2_CREATE, j, j2);
        this.k = (ax.Q8.l) c.a.a(lVar, ax.Q8.l.Identification);
        this.j = set;
        this.e = c.a.b(set2, ax.L8.a.class);
        this.f = c.a.b(set3, ax.Q8.u.class);
        this.g = (EnumC0920d) c.a.a(enumC0920d, EnumC0920d.FILE_OPEN_IF);
        this.h = c.a.b(set4, EnumC0921e.class);
        this.i = eVar;
    }

    @Override // ax.Q8.q
    protected void m(C2171b c2171b) {
        byte[] bArr;
        c2171b.s(this.c);
        c2171b.j((byte) 0);
        c2171b.j((byte) 0);
        c2171b.u(this.k.getValue());
        c2171b.W(8);
        c2171b.W(8);
        c2171b.u(c.a.e(this.j));
        c2171b.u(c.a.e(this.e));
        c2171b.u(c.a.e(this.f));
        c2171b.u(this.g.getValue());
        c2171b.u(c.a.e(this.h));
        int i = this.c + 63;
        String b = this.i.b();
        if (b == null || b.trim().length() == 0) {
            c2171b.s(i);
            c2171b.s(0);
            bArr = new byte[1];
        } else {
            bArr = ax.Q8.j.a(b);
            c2171b.s(i);
            c2171b.s(bArr.length);
        }
        c2171b.u(0L);
        c2171b.u(0L);
        c2171b.o(bArr);
    }
}
