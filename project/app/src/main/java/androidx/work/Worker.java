/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import ax.v7.e;

public abstract class Worker
extends c {
    ax.M2.c<c.a> e;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override
    public e<ax.B2.e> d() {
        ax.M2.c<ax.B2.e> c8 = ax.M2.c.t();
        this.c().execute(new Runnable(){
            final Worker c0;
            final ax.M2.c q;
            {
                this.c0 = worker;
                this.q = c8;
            }

            @Override
            public void run() {
                try {
                    ax.B2.e e8 = this.c0.p();
                    this.q.p(e8);
                    return;
                }
                catch (Throwable throwable) {
                    this.q.q(throwable);
                    return;
                }
            }
        });
        return c8;
    }

    @Override
    public final e<c.a> m() {
        this.e = ax.M2.c.t();
        this.c().execute(new Runnable(this){
            final Worker q;
            {
                this.q = worker;
            }

            @Override
            public void run() {
                try {
                    c.a a8 = this.q.o();
                    this.q.e.p(a8);
                    return;
                }
                catch (Throwable throwable) {
                    this.q.e.q(throwable);
                    return;
                }
            }
        });
        return this.e;
    }

    public abstract c.a o();

    public ax.B2.e p() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }
}

