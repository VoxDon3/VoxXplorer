/*
 * Decompiled with CFR 0.152.
 */
package ax.P3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ax.P3.s;
import ax.k4.i;

class v {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), (Handler.Callback)new a());

    v() {
    }

    public void a(s<?> s8) {
        i.b();
        if (this.a) {
            this.b.obtainMessage(1, s8).sendToTarget();
            return;
        }
        this.a = true;
        s8.recycle();
        this.a = false;
    }

    private static class a
    implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((s)message.obj).recycle();
                return true;
            }
            return false;
        }
    }
}

