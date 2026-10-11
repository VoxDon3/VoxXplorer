package ax.M5;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import ax.J5.C0742c;
import ax.M5.AbstractC0808c;

/* loaded from: classes3.dex */
final class c0 extends ax.Z5.e {
    final /* synthetic */ AbstractC0808c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(AbstractC0808c abstractC0808c, Looper looper) {
        super(looper);
        this.b = abstractC0808c;
    }

    private static final void a(Message message) {
        d0 d0Var = (d0) message.obj;
        d0Var.b();
        d0Var.e();
    }

    private static final boolean b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC0808c.a aVar;
        AbstractC0808c.a aVar2;
        C0742c c0742c;
        C0742c c0742c2;
        boolean z;
        if (this.b.D0.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i = message.what;
        if ((i == 1 || i == 7 || ((i == 4 && !this.b.t()) || message.what == 5)) && !this.b.f()) {
            a(message);
            return;
        }
        int i2 = message.what;
        if (i2 == 4) {
            this.b.A0 = new C0742c(message.arg2);
            if (AbstractC0808c.h0(this.b)) {
                AbstractC0808c abstractC0808c = this.b;
                z = abstractC0808c.B0;
                if (!z) {
                    abstractC0808c.i0(3, null);
                    return;
                }
            }
            AbstractC0808c abstractC0808c2 = this.b;
            c0742c2 = abstractC0808c2.A0;
            C0742c c0742c3 = c0742c2 != null ? abstractC0808c2.A0 : new C0742c(8);
            this.b.q0.c(c0742c3);
            this.b.L(c0742c3);
            return;
        }
        if (i2 == 5) {
            AbstractC0808c abstractC0808c3 = this.b;
            c0742c = abstractC0808c3.A0;
            C0742c c0742c4 = c0742c != null ? abstractC0808c3.A0 : new C0742c(8);
            this.b.q0.c(c0742c4);
            this.b.L(c0742c4);
            return;
        }
        if (i2 == 3) {
            Object obj = message.obj;
            C0742c c0742c5 = new C0742c(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.b.q0.c(c0742c5);
            this.b.L(c0742c5);
            return;
        }
        if (i2 == 6) {
            this.b.i0(5, null);
            AbstractC0808c abstractC0808c4 = this.b;
            aVar = abstractC0808c4.v0;
            if (aVar != null) {
                aVar2 = abstractC0808c4.v0;
                aVar2.w(message.arg2);
            }
            this.b.M(message.arg2);
            AbstractC0808c.g0(this.b, 5, 1, null);
            return;
        }
        if (i2 == 2 && !this.b.a()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((d0) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
