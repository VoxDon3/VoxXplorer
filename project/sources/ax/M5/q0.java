package ax.M5;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* loaded from: classes3.dex */
final class q0 implements Handler.Callback {
    final /* synthetic */ r0 q;

    /* synthetic */ q0(r0 r0Var, p0 p0Var) {
        this.q = r0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i = message.what;
        if (i == 0) {
            hashMap = this.q.f;
            synchronized (hashMap) {
                try {
                    m0 m0Var = (m0) message.obj;
                    hashMap2 = this.q.f;
                    o0 o0Var = (o0) hashMap2.get(m0Var);
                    if (o0Var != null && o0Var.i()) {
                        if (o0Var.j()) {
                            o0Var.g("GmsClientSupervisor");
                        }
                        hashMap3 = this.q.f;
                        hashMap3.remove(m0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        hashMap4 = this.q.f;
        synchronized (hashMap4) {
            try {
                m0 m0Var2 = (m0) message.obj;
                hashMap5 = this.q.f;
                o0 o0Var2 = (o0) hashMap5.get(m0Var2);
                if (o0Var2 != null && o0Var2.a() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(m0Var2), new Exception());
                    ComponentName b = o0Var2.b();
                    if (b == null) {
                        b = m0Var2.a();
                    }
                    if (b == null) {
                        String c = m0Var2.c();
                        C0821p.l(c);
                        b = new ComponentName(c, "unknown");
                    }
                    o0Var2.onServiceDisconnected(b);
                }
            } finally {
            }
        }
        return true;
    }
}
