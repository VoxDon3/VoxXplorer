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

public class d
extends c {
    private byte[] d;
    private byte[] e;
    private boolean f;

    public d(Set<e> object, String string, String string2, i i8, boolean bl) {
        super((Set<e>)object, i8);
        object = string != null ? (Object)ax.V8.b.e(string) : (Object)h.a;
        this.d = (byte[])object;
        object = string2 != null ? (Object)ax.V8.b.e(string2) : (Object)h.a;
        this.e = (byte[])object;
        this.f = bl;
    }

    public void b(a.c c8) {
        c8.q("NTLMSSP\u0000", ax.Y8.b.a);
        c8.u(1L);
        c8.u(c.a.e(this.a));
        int n8 = !this.f ? 40 : 32;
        if (this.a.contains(ax.W8.e.o0)) {
            n8 = h.c(c8, this.d, n8);
        } else {
            c8.s(0);
            c8.s(0);
            c8.u(0L);
        }
        if (this.a.contains(ax.W8.e.n0)) {
            h.c(c8, this.e, n8);
        } else {
            c8.s(0);
            c8.s(0);
            c8.u(0L);
        }
        if (!this.f && this.a.contains(ax.W8.e.f0)) {
            this.b.c(c8);
        } else if (!this.f) {
            c8.w(0L);
        }
        c8.o(this.d);
        c8.o(this.e);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NtlmNegotiate{\n  domain='");
        stringBuilder.append(ax.V8.b.d(this.d));
        stringBuilder.append("'',\n  workstation='");
        stringBuilder.append(ax.V8.b.d(this.e));
        stringBuilder.append("',\n  negotiateFlags=");
        stringBuilder.append(this.a);
        stringBuilder.append(",\n  version=");
        stringBuilder.append(this.b);
        stringBuilder.append("\n}");
        return stringBuilder.toString();
    }
}

