/*
 * Decompiled with CFR 0.152.
 */
package ax.M5;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import ax.M5.c;
import ax.M5.d0;
import ax.Z5.e;

final class c0
extends e {
    final c b;

    public c0(c c8, Looper looper) {
        this.b = c8;
        super(looper);
    }

    private static final void a(Message object) {
        object = (d0)((Message)object).obj;
        ((d0)object).b();
        ((d0)object).e();
    }

    private static final boolean b(Message message) {
        int n8 = message.what;
        return n8 == 2 || n8 == 1 || n8 == 7;
        {
        }
    }

    public final void handleMessage(Message object) {
        if (this.b.D0.get() != ((Message)object).arg1) {
            if (c0.b((Message)object)) {
                c0.a((Message)object);
            }
            return;
        }
        int n8 = ((Message)object).what;
        if (n8 != 1 && n8 != 7 && (n8 != 4 || this.b.t()) && ((Message)object).what != 5 || this.b.f()) {
            n8 = ((Message)object).what;
            Object object2 = null;
            if (n8 == 4) {
                c.Z(this.b, new ax.J5.c(((Message)object).arg2));
                if (c.h0(this.b) && !c.f0((c)(object = this.b))) {
                    c.b0((c)object, 3, null);
                    return;
                }
                object = this.b;
                object = c.T((c)object) != null ? c.T((c)object) : new ax.J5.c(8);
                this.b.q0.c((ax.J5.c)object);
                this.b.L((ax.J5.c)object);
                return;
            }
            if (n8 == 5) {
                object = this.b;
                object = c.T((c)object) != null ? c.T((c)object) : new ax.J5.c(8);
                this.b.q0.c((ax.J5.c)object);
                this.b.L((ax.J5.c)object);
                return;
            }
            if (n8 == 3) {
                Object object3 = ((Message)object).obj;
                if (object3 instanceof PendingIntent) {
                    object2 = (PendingIntent)object3;
                }
                object = new ax.J5.c(((Message)object).arg2, (PendingIntent)object2);
                this.b.q0.c((ax.J5.c)object);
                this.b.L((ax.J5.c)object);
                return;
            }
            if (n8 == 6) {
                c.b0(this.b, 5, null);
                object2 = this.b;
                if (c.U((c)object2) != null) {
                    c.U((c)object2).w(((Message)object).arg2);
                }
                this.b.M(((Message)object).arg2);
                c.g0(this.b, 5, 1, null);
                return;
            }
            if (n8 == 2 && !this.b.a()) {
                c0.a((Message)object);
                return;
            }
            if (c0.b((Message)object)) {
                ((d0)((Message)object).obj).c();
                return;
            }
            n8 = ((Message)object).what;
            object = new StringBuilder();
            ((StringBuilder)object).append("Don't know how to handle message: ");
            ((StringBuilder)object).append(n8);
            Log.wtf((String)"GmsClient", (String)((StringBuilder)object).toString(), (Throwable)new Exception());
            return;
        }
        c0.a((Message)object);
    }
}

