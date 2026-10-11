/*
 * Decompiled with CFR 0.152.
 */
package ax.m9;

import ax.Q8.n;
import ax.Q8.q;
import ax.Q8.r;
import ax.Q8.t;
import ax.Xd.f;
import ax.Z8.a;
import ax.h9.d;
import ax.h9.e;
import ax.l9.h;
import ax.m9.i;

public class j
extends i {
    private static final ax.Xd.d d = f.k(j.class);
    private final n b;
    private final ax.l9.e c;

    public j(n n8, ax.l9.e e8) {
        this.b = n8;
        this.c = e8;
    }

    @Override
    protected void e(r object) throws ax.c9.e {
        Object object2 = this.c.a(((t)((e)object).b()).i());
        try {
            object2 = this.b.c(((h)object2).e(), (r)object);
            this.c.d(((t)((d)object2).c()).i()).f().a((q)object2);
            return;
        }
        catch (a.b b8) {
            d.t("Failed to deserialize SMB2 Packet Data of {}", object);
            object = new StringBuilder();
            ((StringBuilder)object).append("Unable to deserialize SMB2 Packet Data : ");
            ((StringBuilder)object).append(b8.getMessage());
            throw new ax.c9.e(((StringBuilder)object).toString(), b8);
        }
    }
}

