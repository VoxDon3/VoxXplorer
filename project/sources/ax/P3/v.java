package ax.P3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
class v {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new a());

    private static class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((s) message.obj).recycle();
            return true;
        }
    }

    v() {
    }

    public void a(s<?> sVar) {
        ax.k4.i.b();
        if (this.a) {
            this.b.obtainMessage(1, sVar).sendToTarget();
            return;
        }
        this.a = true;
        sVar.recycle();
        this.a = false;
    }
}
