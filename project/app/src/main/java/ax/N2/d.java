/*
 * Decompiled with CFR 0.152.
 */
package ax.N2;

import android.os.Handler;
import android.os.Looper;
import ax.L2.u;
import ax.N2.b;
import ax.N2.c;
import java.util.concurrent.Executor;

public class d
implements c {
    private final u a;
    final Handler b = new Handler(Looper.getMainLooper());
    private final Executor c = new Executor(this){
        final d q;
        {
            this.q = d8;
        }

        @Override
        public void execute(Runnable runnable2) {
            this.q.b.post(runnable2);
        }
    };

    public d(Executor executor) {
        this.a = new u(executor);
    }

    @Override
    public Executor a() {
        return this.c;
    }

    @Override
    public /* synthetic */ void c(Runnable runnable2) {
        ax.N2.b.a(this, runnable2);
    }

    public u d() {
        return this.a;
    }
}

