/*
 * Decompiled with CFR 0.152.
 */
package ax.oa;

import ax.Y8.c;
import ax.oa.d;
import ax.oa.e;
import ax.pa.b;
import ax.pa.c;
import ax.pa.f;
import java.io.IOException;
import java.util.Set;

public class a
extends ax.pa.a
implements b {
    private byte a = (byte)5;
    private byte b = 0;
    private d c;
    private Set<e> d;
    private byte[] e = new byte[]{16, 0, 0, 0};
    private short f = (short)16;
    private short g = 0;
    private int h = 0;

    @Override
    public void a(ax.pa.d object) throws IOException {
        if (this.h() != null) {
            if (this.i() != null) {
                ((f)object).b(this.e());
                ((f)object).b(this.f());
                ((f)object).b((byte)this.h().getValue());
                ((f)object).b((byte)c.a.e(this.i()));
                ((f)object).a(this.g());
                ((f)object).e(this.d());
                ((f)object).e(0);
                ((f)object).c(this.c());
                return;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid PFC flag(s): ");
            ((StringBuilder)object).append(this.i());
            throw new IllegalStateException(((StringBuilder)object).toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Invalid PDU type: ");
        ((StringBuilder)object).append(this.h());
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.h;
    }

    public int d() {
        return this.f;
    }

    public byte e() {
        return this.a;
    }

    public byte f() {
        return this.b;
    }

    public byte[] g() {
        return this.e;
    }

    public d h() {
        return this.c;
    }

    public Set<e> i() {
        return this.d;
    }

    public void j(short s8) {
        this.g = s8;
    }

    public void k(int n8) {
        this.h = n8;
    }

    public void l(short s8) {
        this.f = s8;
    }

    public void m(byte by) {
        this.a = by;
    }

    public void n(byte by) {
        this.b = by;
    }

    public void o(byte[] byArray) {
        this.e = byArray;
    }

    public void p(d d8) {
        this.c = d8;
    }

    public void q(Set<e> set) {
        this.d = set;
    }

    public void r(c c8) throws IOException {
        this.m(c8.c());
        this.n(c8.c());
        if (5 == this.e() && this.f() == 0) {
            Object object = c.a.f(c8.c(), d.class, null);
            if (object != null) {
                this.p((d)object);
                this.q(c.a.d(c8.c(), e.class));
                object = new byte[4];
                c8.e((byte[])object);
                if (object[0] == 16) {
                    if (object[1] == false) {
                        this.o((byte[])object);
                        this.l(c8.g());
                        this.j(c8.g());
                        this.k(c8.f());
                        return;
                    }
                    throw new IOException(String.format("Floating-Point representation mismatch: %d", (byte)object[1]));
                }
                throw new IOException(String.format("Integer and Character representation mismatch: %d", (byte)object[0]));
            }
            throw new IOException(String.format("PDU type invalid: %d", object));
        }
        throw new IOException(String.format("Version mismatch: %d.%d != 5.0", this.e(), this.f()));
    }
}

