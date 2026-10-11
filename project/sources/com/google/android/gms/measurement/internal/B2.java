package com.google.android.gms.measurement.internal;

import android.os.Process;
import ax.M5.C0821p;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* loaded from: classes3.dex */
final class B2 extends Thread {
    private final BlockingQueue<C2<?>> c0;
    private boolean d0 = false;
    private final /* synthetic */ C3779z2 e0;
    private final Object q;

    public B2(C3779z2 c3779z2, String str, BlockingQueue<C2<?>> blockingQueue) {
        this.e0 = c3779z2;
        C0821p.l(str);
        C0821p.l(blockingQueue);
        this.q = new Object();
        this.c0 = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        this.e0.k().L().b(getName() + " was interrupted", interruptedException);
    }

    private final void c() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        B2 b2;
        B2 b22;
        obj = this.e0.i;
        synchronized (obj) {
            try {
                if (!this.d0) {
                    semaphore = this.e0.j;
                    semaphore.release();
                    obj2 = this.e0.i;
                    obj2.notifyAll();
                    b2 = this.e0.c;
                    if (this == b2) {
                        this.e0.c = null;
                    } else {
                        b22 = this.e0.d;
                        if (this == b22) {
                            this.e0.d = null;
                        } else {
                            this.e0.k().G().a("Current scheduler thread is neither worker nor network");
                        }
                    }
                    this.d0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        synchronized (this.q) {
            this.q.notifyAll();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        Object obj;
        boolean z;
        boolean z2 = false;
        while (!z2) {
            try {
                semaphore = this.e0.j;
                semaphore.acquire();
                z2 = true;
            } catch (InterruptedException e) {
                b(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C2<?> poll = this.c0.poll();
                if (poll != null) {
                    Process.setThreadPriority(poll.c0 ? threadPriority : 10);
                    poll.run();
                } else {
                    synchronized (this.q) {
                        if (this.c0.peek() == null) {
                            z = this.e0.k;
                            if (!z) {
                                try {
                                    this.q.wait(30000L);
                                } catch (InterruptedException e2) {
                                    b(e2);
                                }
                            }
                        }
                    }
                    obj = this.e0.i;
                    synchronized (obj) {
                        if (this.c0.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }
}
