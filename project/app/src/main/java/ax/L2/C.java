/*
 * Decompiled with CFR 0.152.
 */
package ax.L2;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.a;
import ax.B2.f;
import ax.B2.i;
import ax.K2.v;
import ax.K2.w;
import ax.K2.y;
import ax.N2.c;
import ax.v7.e;
import java.util.UUID;

public class C
implements f {
    private static final String d = i.i("WMFgUpdater");
    private final c a;
    final ax.J2.a b;
    final w c;

    public C(WorkDatabase workDatabase, ax.J2.a a8, c c8) {
        this.b = a8;
        this.a = c8;
        this.c = workDatabase.I();
    }

    @Override
    public e<Void> a(Context context, UUID uUID, ax.B2.e e8) {
        ax.M2.c<Void> c8 = ax.M2.c.t();
        this.a.c(new Runnable(){
            final UUID c0;
            final ax.B2.e d0;
            final Context e0;
            final C f0;
            final ax.M2.c q;
            {
                this.f0 = c8;
                this.q = c9;
                this.c0 = uUID;
                this.d0 = e8;
                this.e0 = context;
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
                    block2: {
                        Object object;
                        block3: {
                            try {
                                if (this.q.isCancelled()) break block2;
                                object = this.c0.toString();
                                v v8 = this.f0.c.n((String)object);
                                if (v8 == null || v8.b.h()) break block3;
                                this.f0.b.c((String)object, this.d0);
                                object = androidx.work.impl.foreground.a.c(this.e0, y.a(v8), this.d0);
                                this.e0.startService((Intent)object);
                                break block2;
                            }
                            catch (Throwable throwable2) {
                                break block4;
                            }
                        }
                        object = new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        throw object;
                    }
                    this.q.p(null);
                    return;
                }
                this.q.q(throwable2);
            }
        });
        return c8;
    }
}

