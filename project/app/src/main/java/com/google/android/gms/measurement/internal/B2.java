/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.os.Process;
import ax.M5.p;
import com.google.android.gms.measurement.internal.C2;
import com.google.android.gms.measurement.internal.X1;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.z2;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.FutureTask;

final class B2
extends Thread {
    private final BlockingQueue<C2<?>> c0;
    private boolean d0;
    private final z2 e0;
    private final Object q;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public B2(z2 z22, String string, BlockingQueue blockingQueue) {
        this.e0 = z22;
        this.d0 = false;
        p.l(string);
        p.l(blockingQueue);
        this.q = new Object();
        this.c0 = blockingQueue;
        this.setName(string);
    }

    private final void b(InterruptedException interruptedException) {
        X1 x12 = ((f3)this.e0).k().L();
        String string = this.getName();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(" was interrupted");
        x12.b(stringBuilder.toString(), interruptedException);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void c() {
        Object object = z2.E(this.e0);
        synchronized (object) {
            Throwable throwable2;
            block8: {
                block5: {
                    block7: {
                        block6: {
                            try {
                                if (this.d0) break block5;
                                z2.H(this.e0).release();
                                z2.E(this.e0).notifyAll();
                                if (this != z2.A(this.e0)) break block6;
                                z2.C(this.e0, null);
                                break block7;
                            }
                            catch (Throwable throwable2) {
                                break block8;
                            }
                        }
                        if (this == z2.u(this.e0)) {
                            z2.x(this.e0, null);
                        } else {
                            ((f3)this.e0).k().G().a("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.d0 = true;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = this.q;
        synchronized (object) {
            this.q.notifyAll();
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void run() {
        int n8 = 0;
        while (n8 == 0) {
            try {
                z2.H(this.e0).acquire();
                n8 = 1;
            }
            catch (InterruptedException interruptedException) {
                this.b(interruptedException);
            }
        }
        try {
            int n9 = Process.getThreadPriority((int)Process.myTid());
            while (true) {
                Object object;
                if ((object = (C2)this.c0.poll()) != null) {
                    n8 = ((C2)object).c0 ? n9 : 10;
                    Process.setThreadPriority((int)n8);
                    ((FutureTask)object).run();
                    continue;
                }
                object = this.q;
                // MONITORENTER : object
                break;
            }
        }
        catch (Throwable throwable) {}
        {
            block19: {
                boolean bl;
                if (this.c0.peek() != null || (bl = z2.I(this.e0))) break block19;
                this.q.wait(30000L);
                break block19;
                catch (InterruptedException interruptedException) {
                    this.b(interruptedException);
                }
            }
            // MONITOREXIT : object
            Object object = z2.E(this.e0);
            // MONITORENTER : object
            if (this.c0.peek() == null) {
                this.c();
                // MONITOREXIT : object
                this.c();
                return;
            }
            // MONITOREXIT : object
            continue;
        }
        catch (Throwable throwable) {}
        throw throwable;
        this.c();
        throw throwable;
    }
}

