/*
 * Decompiled with CFR 0.152.
 */
package ax.S0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ax.S0.a;
import ax.S0.q;
import java.util.ArrayList;
import java.util.List;

final class K
implements q {
    private static final List<b> b = new ArrayList<b>(50);
    private final Handler a;

    public K(Handler handler) {
        this.a = handler;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static b n() {
        List<b> list = b;
        synchronized (list) {
            try {
                if (!list.isEmpty()) return list.remove(list.size() - 1);
                return new b();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void o(b b8) {
        List<b> list = b;
        synchronized (list) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (list.size() >= 50) break block3;
                        list.add(b8);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public q.a a(int n8, int n9, int n10) {
        return K.n().d(this.a.obtainMessage(n8, n9, n10), this);
    }

    @Override
    public boolean b(q.a a8) {
        return ((b)a8).c(this.a);
    }

    @Override
    public boolean c(Runnable runnable2) {
        return this.a.post(runnable2);
    }

    @Override
    public q.a d(int n8) {
        return K.n().d(this.a.obtainMessage(n8), this);
    }

    @Override
    public boolean e(int n8) {
        boolean bl = n8 != 0;
        ax.S0.a.a(bl);
        return this.a.hasMessages(n8);
    }

    @Override
    public boolean f(int n8) {
        return this.a.sendEmptyMessage(n8);
    }

    @Override
    public q.a g(int n8, int n9, int n10, Object object) {
        return K.n().d(this.a.obtainMessage(n8, n9, n10, object), this);
    }

    @Override
    public boolean h(int n8, long l8) {
        return this.a.sendEmptyMessageAtTime(n8, l8);
    }

    @Override
    public void i(int n8) {
        boolean bl = n8 != 0;
        ax.S0.a.a(bl);
        this.a.removeMessages(n8);
    }

    @Override
    public q.a j(int n8, Object object) {
        return K.n().d(this.a.obtainMessage(n8, object), this);
    }

    @Override
    public void k(Object object) {
        this.a.removeCallbacksAndMessages(object);
    }

    @Override
    public Looper l() {
        return this.a.getLooper();
    }

    private static final class b
    implements q.a {
        private Message a;
        private K b;

        private b() {
        }

        private void b() {
            this.a = null;
            this.b = null;
            K.o(this);
        }

        @Override
        public void a() {
            ax.S0.a.e(this.a).sendToTarget();
            this.b();
        }

        public boolean c(Handler handler) {
            boolean bl = handler.sendMessageAtFrontOfQueue(ax.S0.a.e(this.a));
            this.b();
            return bl;
        }

        public b d(Message message, K k8) {
            this.a = message;
            this.b = k8;
            return this;
        }
    }
}

