package ax.i2;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class x {
    private final List<b> a = new ArrayList();
    private final InterfaceC2238C b = new a();
    private int c = 0;
    private final Object d = new Object();

    class a implements InterfaceC2238C {
        a() {
        }

        @Override // ax.i2.InterfaceC2238C
        public void a() {
            x.this.e();
        }

        @Override // ax.i2.InterfaceC2238C
        public boolean d() {
            return x.this.b();
        }
    }

    public interface b {
        void a();
    }

    private void d() {
        Iterator<b> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    InterfaceC2238C a() {
        return this.b;
    }

    boolean b() {
        boolean c;
        synchronized (this.d) {
            c = c();
        }
        return c;
    }

    public boolean c() {
        boolean z;
        synchronized (this.d) {
            z = this.c > 0;
        }
        return z;
    }

    void e() {
        synchronized (this.d) {
            try {
                if (this.c > 0) {
                    Log.w("OperationMonitor", "Resetting OperationMonitor with " + this.c + " active operations.");
                }
                this.c = 0;
                d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void f() {
        synchronized (this.d) {
            try {
                int i = this.c + 1;
                this.c = i;
                if (i == 1) {
                    d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void g() {
        synchronized (this.d) {
            try {
                int i = this.c;
                if (i == 0) {
                    return;
                }
                int i2 = i - 1;
                this.c = i2;
                if (i2 == 0) {
                    d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
