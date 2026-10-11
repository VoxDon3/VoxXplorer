/*
 * Decompiled with CFR 0.152.
 */
package ax.W8;

import ax.W8.c;
import ax.W8.e;
import ax.W8.h;
import ax.W8.i;
import ax.Y8.b;
import ax.Y8.c;
import ax.Z8.a;
import java.util.Set;

public class a
extends c {
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;

    public a(byte[] byArray, byte[] byArray2, String string, String string2, String string3, byte[] byArray3, Set<e> set, i i8) {
        super(set, i8);
        this.d = ax.W8.h.b(byArray);
        this.e = ax.W8.h.b(byArray2);
        this.f = ax.W8.h.a(string);
        this.g = ax.W8.h.a(string2);
        this.h = ax.W8.h.a(string3);
        this.i = ax.W8.h.b(byArray3);
        this.a = set;
    }

    private int b() {
        int n8 = !this.a.contains(ax.W8.e.f0) && this.j == null ? 64 : 72;
        int n9 = n8;
        if (this.j != null) {
            n9 = n8 + 16;
        }
        return n9;
    }

    public byte[] c() {
        a.c c8 = new a.c(ax.Z8.b.b);
        c8.j((byte)6);
        c8.j((byte)1);
        c8.s(7600);
        c8.o(new byte[]{0, 0, 0});
        c8.j((byte)15);
        return c8.f();
    }

    public void d(byte[] byArray) {
        this.j = byArray;
    }

    public void e(a.c c8) {
        c8.q("NTLMSSP\u0000", ax.Y8.b.a);
        c8.u(3L);
        int n8 = this.b();
        n8 = ax.W8.h.c(c8, this.d, n8);
        n8 = ax.W8.h.c(c8, this.e, n8);
        n8 = ax.W8.h.c(c8, this.g, n8);
        n8 = ax.W8.h.c(c8, this.f, n8);
        n8 = ax.W8.h.c(c8, this.h, n8);
        ax.W8.h.c(c8, this.i, n8);
        c8.u(c.a.e(this.a));
        if (this.a.contains(ax.W8.e.f0)) {
            c8.o(this.c());
        } else if (this.j != null) {
            c8.w(0L);
        }
        byte[] byArray = this.j;
        if (byArray != null) {
            c8.p(byArray, 0, 16);
        }
        c8.o(this.d);
        c8.o(this.e);
        c8.o(this.g);
        c8.o(this.f);
        c8.o(this.h);
        c8.o(this.i);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NtlmAuthenticate{\n  mic=");
        Object object = this.j;
        object = object != null ? (Object)ax.Y8.a.a((byte[])object) : (Object)"[]";
        stringBuilder.append((String)object);
        stringBuilder.append(",\n  lmResponse=");
        stringBuilder.append(ax.Y8.a.a(this.d));
        stringBuilder.append(",\n  ntResponse=");
        stringBuilder.append(ax.Y8.a.a(this.e));
        stringBuilder.append(",\n  domainName='");
        stringBuilder.append(ax.V8.b.g(this.g));
        stringBuilder.append("',\n  userName='");
        stringBuilder.append(ax.V8.b.g(this.f));
        stringBuilder.append("',\n  workstation='");
        stringBuilder.append(ax.V8.b.g(this.h));
        stringBuilder.append("',\n  encryptedRandomSessionKey=[<secret>],\n");
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

