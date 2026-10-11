/*
 * Decompiled with CFR 0.152.
 */
package ax.pb;

import ax.ob.a;
import ax.ob.b;
import ax.ob.c;
import ax.ob.d;
import ax.pb.a0;
import ax.pb.r;
import ax.qb.e;
import java.io.PrintStream;

public class q {
    r a;
    int b;
    String c;
    boolean d = false;
    byte[] e = null;
    byte[] f = null;
    String g = null;
    int h = 1;
    e i;

    public q(r r8, boolean bl) {
        this.a = r8;
        int n8 = this.b;
        this.b = 0x20080004 | n8;
        if (bl) {
            this.b = n8 | 0x60088014;
        }
        this.c = ax.ob.b.k();
        this.i = ax.qb.e.a();
    }

    public String a() {
        return this.g;
    }

    public byte[] b() {
        return this.f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] c(byte[] object, int n8, int n9) throws a0 {
        n8 = this.h;
        if (n8 != 1) {
            e e8;
            Object object2;
            block9: {
                if (n8 != 2) throw new a0("Invalid state");
                try {
                    object2 = new c((byte[])object);
                    e8 = this.i;
                    if (ax.qb.e.c0 < 4) break block9;
                    e8.println(object2);
                    e8 = this.i;
                    if (ax.qb.e.c0 >= 6) {
                        ax.qb.d.a(e8, (byte[])object, 0, ((byte[])object).length);
                    }
                }
                catch (Exception exception) {
                    throw new a0(exception.getMessage(), (Throwable)exception);
                }
            }
            this.e = ((c)object2).j();
            this.b &= ((a)object2).a();
            object = new d;
            ((d)object)((c)object2, this.a.i(), this.a.d(), this.a.n(), this.c, this.b);
            object2 = ((d)object).C();
            e8 = this.i;
            if (ax.qb.e.c0 >= 4) {
                e8.println(object);
                e8 = this.i;
                if (ax.qb.e.c0 >= 6) {
                    ax.qb.d.a(e8, (byte[])object2, 0, ((Object)object2).length);
                }
            }
            if ((this.b & 0x10) != 0) {
                this.f = ((d)object).p();
            }
            this.d = true;
            ++this.h;
            return object2;
        }
        Object object3 = new b(this.b, this.a.d(), this.c);
        object = ((b)object3).p();
        e e9 = this.i;
        if (ax.qb.e.c0 >= 4) {
            e9.println(object3);
            object3 = this.i;
            if (ax.qb.e.c0 >= 6) {
                ax.qb.d.a((PrintStream)object3, (byte[])object, 0, ((byte[])object).length);
            }
        }
        ++this.h;
        return object;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("NtlmContext[auth=");
        ((StringBuilder)charSequence).append(this.a);
        ((StringBuilder)charSequence).append(",ntlmsspFlags=0x");
        ((StringBuilder)charSequence).append(ax.qb.d.c(this.b, 8));
        ((StringBuilder)charSequence).append(",workstation=");
        ((StringBuilder)charSequence).append(this.c);
        ((StringBuilder)charSequence).append(",isEstablished=");
        ((StringBuilder)charSequence).append(this.d);
        ((StringBuilder)charSequence).append(",state=");
        ((StringBuilder)charSequence).append(this.h);
        ((StringBuilder)charSequence).append(",serverChallenge=");
        Object object = ((StringBuilder)charSequence).toString();
        if (this.e == null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("null");
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object);
            object = this.e;
            ((StringBuilder)charSequence).append(ax.qb.d.d((byte[])object, 0, ((Object)object).length * 2));
            charSequence = ((StringBuilder)charSequence).toString();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append((String)charSequence);
        ((StringBuilder)object).append(",signingKey=");
        object = ((StringBuilder)object).toString();
        if (this.f == null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("null");
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object);
            object = this.f;
            ((StringBuilder)charSequence).append(ax.qb.d.d((byte[])object, 0, ((Object)object).length * 2));
            charSequence = ((StringBuilder)charSequence).toString();
        }
        object = new StringBuilder();
        ((StringBuilder)object).append((String)charSequence);
        ((StringBuilder)object).append("]");
        return ((StringBuilder)object).toString();
    }
}

