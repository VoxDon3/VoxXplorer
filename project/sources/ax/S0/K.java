package ax.S0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ax.S0.InterfaceC0984q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class K implements InterfaceC0984q {
    private static final List<b> b = new ArrayList(50);
    private final Handler a;

    private static final class b implements InterfaceC0984q.a {
        private Message a;
        private K b;

        private b() {
        }

        private void b() {
            this.a = null;
            this.b = null;
            K.o(this);
        }

        @Override // ax.S0.InterfaceC0984q.a
        public void a() {
            ((Message) C0968a.e(this.a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) C0968a.e(this.a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        public b d(Message message, K k) {
            this.a = message;
            this.b = k;
            return this;
        }
    }

    public K(Handler handler) {
        this.a = handler;
    }

    private static b n() {
        b bVar;
        List<b> list = b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(b bVar) {
        List<b> list = b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.S0.InterfaceC0984q
    public InterfaceC0984q.a a(int i, int i2, int i3) {
        return n().d(this.a.obtainMessage(i, i2, i3), this);
    }

    @Override // ax.S0.InterfaceC0984q
    public boolean b(InterfaceC0984q.a aVar) {
        return ((b) aVar).c(this.a);
    }

    @Override // ax.S0.InterfaceC0984q
    public boolean c(Runnable runnable) {
        return this.a.post(runnable);
    }

    @Override // ax.S0.InterfaceC0984q
    public InterfaceC0984q.a d(int i) {
        return n().d(this.a.obtainMessage(i), this);
    }

    @Override // ax.S0.InterfaceC0984q
    public boolean e(int i) {
        C0968a.a(i != 0);
        return this.a.hasMessages(i);
    }

    @Override // ax.S0.InterfaceC0984q
    public boolean f(int i) {
        return this.a.sendEmptyMessage(i);
    }

    @Override // ax.S0.InterfaceC0984q
    public InterfaceC0984q.a g(int i, int i2, int i3, Object obj) {
        return n().d(this.a.obtainMessage(i, i2, i3, obj), this);
    }

    @Override // ax.S0.InterfaceC0984q
    public boolean h(int i, long j) {
        return this.a.sendEmptyMessageAtTime(i, j);
    }

    @Override // ax.S0.InterfaceC0984q
    public void i(int i) {
        C0968a.a(i != 0);
        this.a.removeMessages(i);
    }

    @Override // ax.S0.InterfaceC0984q
    public InterfaceC0984q.a j(int i, Object obj) {
        return n().d(this.a.obtainMessage(i, obj), this);
    }

    @Override // ax.S0.InterfaceC0984q
    public void k(Object obj) {
        this.a.removeCallbacksAndMessages(obj);
    }

    @Override // ax.S0.InterfaceC0984q
    public Looper l() {
        return this.a.getLooper();
    }
}
