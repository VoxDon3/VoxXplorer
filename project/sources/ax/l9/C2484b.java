package ax.l9;

import ax.Q8.A;
import ax.Q8.D;
import ax.Q8.E;
import ax.i9.C2292d;
import ax.l9.j;
import ax.q9.C2889a;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;
import java.util.UUID;

/* renamed from: ax.l9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2484b {
    private ax.W8.i a;
    private String b;
    private byte[] c = new byte[0];
    private C2485c d;
    private C2889a e;
    private final UUID f;
    private EnumSet<ax.Q8.k> g;
    private int h;
    private E i;
    private byte[] j;
    private D k;
    private Set<A> l;
    private Long m;

    C2484b(UUID uuid, String str, int i, C2292d c2292d) {
        this.f = uuid;
        this.g = EnumSet.copyOf((Collection) c2292d.B());
        this.h = c2292d.X() ? 2 : 1;
        this.e = new C2889a(str, i);
    }

    private boolean p(ax.Q8.k kVar) {
        return this.e.a().contains(kVar);
    }

    public boolean a() {
        return this.d.a().j() && r();
    }

    public D b() {
        return this.k;
    }

    public EnumSet<ax.Q8.k> c() {
        return this.g;
    }

    public UUID d() {
        return this.f;
    }

    public byte[] e() {
        byte[] bArr = this.c;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public C2485c f() {
        return this.d;
    }

    public E g() {
        return this.i;
    }

    public byte[] h() {
        return this.j;
    }

    public C2889a i() {
        return this.e;
    }

    public boolean j() {
        return this.k != null;
    }

    public boolean k() {
        return (this.e.d() & 2) > 0;
    }

    public boolean l() {
        return (this.e.d() & 1) > 0;
    }

    void m(j.b bVar) {
        ax.R8.m m = bVar.m();
        this.e = bVar.p();
        this.d = new C2485c(m.o(), m.q(), m.p(), m.r(), s());
        this.k = bVar.k();
        this.l = bVar.l();
        this.i = bVar.n();
        this.j = bVar.o() != null ? bVar.o() : new byte[0];
        this.m = Long.valueOf(System.currentTimeMillis() - m.v().g());
    }

    public void n(String str) {
        this.b = str;
    }

    public void o(ax.W8.i iVar) {
        this.a = iVar;
    }

    public boolean q() {
        return p(ax.Q8.k.SMB2_GLOBAL_CAP_DFS);
    }

    public boolean r() {
        if (this.d.a() == ax.Q8.g.SMB_3_1_1) {
            return this.g.contains(ax.Q8.k.SMB2_GLOBAL_CAP_ENCRYPTION) && this.k != null;
        }
        EnumSet<ax.Q8.k> enumSet = this.g;
        ax.Q8.k kVar = ax.Q8.k.SMB2_GLOBAL_CAP_ENCRYPTION;
        return enumSet.contains(kVar) && p(kVar);
    }

    public boolean s() {
        return p(ax.Q8.k.SMB2_GLOBAL_CAP_LARGE_MTU);
    }

    public String toString() {
        return "ConnectionContext{\n  serverGuid=" + this.e.e() + ",\n  serverName='" + this.e.f() + "',\n  negotiatedProtocol=" + this.d + ",\n  clientGuid=" + this.f + ",\n  clientCapabilities=" + this.g + ",\n  serverCapabilities=" + this.e.a() + ",\n  clientSecurityMode=" + this.h + ",\n  serverSecurityMode=" + this.e.d() + ",\n  server='" + this.e + "'\n}";
    }
}
