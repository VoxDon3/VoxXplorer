/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import ax.B2.f;
import ax.B2.i;
import ax.K2.v;
import ax.L2.A;
import ax.N2.c;
import ax.v7.e;

public class B
implements Runnable {
    static final String h0 = i.i("WorkForegroundRunnable");
    final Context c0;
    final v d0;
    final androidx.work.c e0;
    final f f0;
    final c g0;
    final ax.M2.c<Void> q = ax.M2.c.t();

    @SuppressLint(value={"LambdaLast"})
    public B(Context context, v v8, androidx.work.c c8, f f8, c c9) {
        this.c0 = context;
        this.d0 = v8;
        this.e0 = c8;
        this.f0 = f8;
        this.g0 = c9;
    }

    public static /* synthetic */ void a(B b8, ax.M2.c c8) {
        if (!b8.q.isCancelled()) {
            c8.r(b8.e0.d());
            return;
        }
        c8.cancel(true);
    }

    public e<Void> b() {
        return this.q;
    }

    @Override
    @SuppressLint(value={"UnsafeExperimentalUsageError"})
    public void run() {
        if (this.d0.q && Build.VERSION.SDK_INT < 31) {
            ax.M2.c c8 = ax.M2.c.t();
            this.g0.a().execute(new A(this, c8));
            c8.h(new Runnable(){
                final B c0;
                final ax.M2.c q;
                {
                    this.c0 = b8;
                    this.q = c8;
                }

                /*
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 */
                @Override
                public void run() {
                    Throwable throwable2;
                    block4: {
                        Object object;
                        if (this.c0.q.isCancelled()) {
                            return;
                        }
                        try {
                            object = (ax.B2.e)this.q.get();
                            if (object != null) {
                                Object object2 = i.e();
                                String string = h0;
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Updating notification for ");
                                stringBuilder.append(this.c0.d0.c);
                                ((i)object2).a(string, stringBuilder.toString());
                                object2 = this.c0;
                                ((B)object2).q.r(((B)object2).f0.a(((B)object2).c0, ((B)object2).e0.e(), (ax.B2.e)object));
                                return;
                            }
                        }
                        catch (Throwable throwable2) {
                            break block4;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Worker was marked important (");
                        ((StringBuilder)object).append(this.c0.d0.c);
                        ((StringBuilder)object).append(") but did not provide ForegroundInfo");
                        object = ((StringBuilder)object).toString();
                        IllegalStateException illegalStateException = new IllegalStateException((String)object);
                        throw illegalStateException;
                    }
                    this.c0.q.q(throwable2);
                }
            }, this.g0.a());
            return;
        }
        this.q.p(null);
    }
}

