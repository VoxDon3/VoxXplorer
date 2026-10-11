/*
 * Decompiled with CFR 0.152.
 */
package ax.l9;

import ax.Q8.A;
import ax.Q8.D;
import ax.Q8.E;
import ax.Q8.g;
import ax.Q8.k;
import ax.R8.m;
import ax.W8.i;
import ax.i9.d;
import ax.l9.c;
import ax.l9.j;
import ax.q9.a;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;
import java.util.UUID;

public class b {
    private i a;
    private String b;
    private byte[] c;
    private c d;
    private a e;
    private final UUID f;
    private EnumSet<k> g;
    private int h;
    private E i;
    private byte[] j;
    private D k;
    private Set<A> l;
    private Long m;

    b(UUID uUID, String string, int n8, d d8) {
        this.f = uUID;
        this.c = new byte[0];
        this.g = EnumSet.copyOf(d8.B());
        int n9 = d8.X() ? 2 : 1;
        this.h = n9;
        this.e = new a(string, n8);
    }

    private boolean p(k k8) {
        return this.e.a().contains(k8);
    }

    public boolean a() {
        return this.d.a().j() && this.r();
    }

    public D b() {
        return this.k;
    }

    public EnumSet<k> c() {
        return this.g;
    }

    public UUID d() {
        return this.f;
    }

    public byte[] e() {
        byte[] byArray = this.c;
        return Arrays.copyOf(byArray, byArray.length);
    }

    public c f() {
        return this.d;
    }

    public E g() {
        return this.i;
    }

    public byte[] h() {
        return this.j;
    }

    public a i() {
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

    void m(j.b object) {
        m m8 = ((j.b)object).m();
        this.e = ((j.b)object).p();
        this.d = new c(m8.o(), m8.q(), m8.p(), m8.r(), this.s());
        this.k = ((j.b)object).k();
        this.l = ((j.b)object).l();
        this.i = ((j.b)object).n();
        object = ((j.b)object).o() != null ? (Object)((j.b)object).o() : (Object)new byte[0];
        this.j = (byte[])object;
        this.m = System.currentTimeMillis() - m8.v().g();
    }

    public void n(String string) {
        this.b = string;
    }

    public void o(i i8) {
        this.a = i8;
    }

    public boolean q() {
        return this.p(ax.Q8.k.c0);
    }

    public boolean r() {
        if (this.d.a() == ax.Q8.g.i0) {
            return this.g.contains(ax.Q8.k.i0) && this.k != null;
        }
        EnumSet<k> enumSet = this.g;
        k k8 = ax.Q8.k.i0;
        return enumSet.contains(k8) && this.p(k8);
    }

    public boolean s() {
        return this.p(ax.Q8.k.e0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ConnectionContext{\n  serverGuid=");
        stringBuilder.append(this.e.e());
        stringBuilder.append(",\n  serverName='");
        stringBuilder.append(this.e.f());
        stringBuilder.append("',\n  negotiatedProtocol=");
        stringBuilder.append(this.d);
        stringBuilder.append(",\n  clientGuid=");
        stringBuilder.append(this.f);
        stringBuilder.append(",\n  clientCapabilities=");
        stringBuilder.append(this.g);
        stringBuilder.append(",\n  serverCapabilities=");
        stringBuilder.append(this.e.a());
        stringBuilder.append(",\n  clientSecurityMode=");
        stringBuilder.append(this.h);
        stringBuilder.append(",\n  serverSecurityMode=");
        stringBuilder.append(this.e.d());
        stringBuilder.append(",\n  server='");
        stringBuilder.append(this.e);
        stringBuilder.append("'\n");
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

