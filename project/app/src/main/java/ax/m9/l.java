/*
 * Decompiled with CFR 0.152.
 */
package ax.m9;

import ax.Q8.B;
import ax.Q8.t;
import ax.Q8.x;
import ax.Q8.y;
import ax.Z8.a;
import ax.h9.e;
import ax.k9.d;
import ax.l9.f;
import ax.l9.m;
import ax.m9.a;
import ax.m9.c;
import ax.r9.b;
import java.util.Arrays;

public class l
extends a {
    private static final ax.Xd.d d = ax.Xd.f.k(l.class);
    private m b;
    private f c;

    public l(m m8, f f8) {
        this.b = m8;
        this.c = f8;
    }

    private void e(e<?> y8, byte[] byArray) throws ax.c9.e {
        d.s("Packet {} is compressed.", y8);
        try {
            c c8 = this.a;
            y8 = new y(byArray, true);
            c8.a(y8);
            return;
        }
        catch (a.b b8) {
            throw new d("Could not load compression header", b8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void f(byte[] object, B object2) throws ax.c9.e {
        ax.Q8.f f8;
        try {
            f8 = new ax.Q8.f((byte[])object);
            object = d;
            object.d("Decrypted packet {} is packet {}.", object2, f8);
            if (((t)f8.b()).k() != ((x)((e)object2).b()).g()) {
                object.p("Mismatched sessionId between encrypted packet {} and decrypted contents {}", object2, f8);
                object2 = this.a;
                object = new ax.Q8.a((ax.h9.c)f8.b());
                object2.a((e<?>)object);
                return;
            }
        }
        catch (a.b b8) {
            throw new d("Could not load SMB2 Packet", b8);
        }
        this.a.a(f8);
    }

    @Override
    protected boolean b(e<?> e8) {
        return e8 instanceof B;
    }

    @Override
    protected void c(e<?> e8) throws ax.c9.e {
        B b8 = (B)e8;
        Object object = d;
        object.s("Decrypting packet {}", b8);
        if (!this.c.d(b8)) {
            this.a.a(new ax.Q8.a((ax.h9.c)e8.b()));
            return;
        }
        long l8 = ((x)b8.b()).g();
        Object object2 = this.b.b(l8);
        if (object2 == null) {
            this.a.a(new ax.Q8.a((ax.h9.c)e8.b()));
            return;
        }
        byte[] byArray = this.c.f(b8, ((b)object2).o().b());
        if (!x.i((byte[])(object2 = (Object)Arrays.copyOf(byArray, 4)))) {
            if (ax.Q8.b.d((byte[])object2)) {
                this.e(e8, byArray);
                return;
            }
            if (t.p((byte[])object2)) {
                this.f(byArray, b8);
                return;
            }
            object.t("Could not determine the encrypted packet contents of packet {}", e8);
            throw new ax.c9.e("Could not determine the encrypted packet data, disconnecting");
        }
        object.t("Encountered a nested encrypted packet in packet {}, disconnecting the transport", e8);
        object = new StringBuilder();
        ((StringBuilder)object).append("Cannot nest an encrypted packet in encrypted packet ");
        ((StringBuilder)object).append(e8);
        throw new ax.c9.e(((StringBuilder)object).toString());
    }
}

