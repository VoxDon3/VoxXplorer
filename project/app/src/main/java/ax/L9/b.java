/*
 * Decompiled with CFR 0.152.
 */
package ax.L9;

import ax.L9.c;
import ax.L9.d;
import ax.L9.e;
import ax.L9.g;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class b
implements d {
    private final ThreadPoolExecutor a;
    private final g b;
    private final ax.Q9.b c;

    public b(ax.Q9.b b8) {
        this.c = b8;
        this.a = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        this.b = new g();
    }

    @Override
    public <Result> void a(Result Result2, c<Result> c8) {
        ax.Q9.b b8 = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Starting foreground task, current active count:");
        stringBuilder.append(this.b.b());
        stringBuilder.append(", with result ");
        stringBuilder.append(Result2);
        b8.a(stringBuilder.toString());
        this.b.execute(new Runnable(){
            final Object c0;
            final b d0;
            final c q;
            {
                this.d0 = b8;
                this.q = c8;
                this.c0 = object;
            }

            @Override
            public void run() {
                this.q.c(this.c0);
            }
        });
    }

    @Override
    public void b(Runnable runnable2) {
        ax.Q9.b b8 = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Starting background task, current active count: ");
        stringBuilder.append(this.a.getActiveCount());
        b8.a(stringBuilder.toString());
        this.a.execute(runnable2);
    }

    @Override
    public <Result> void c(ax.M9.d d8, c<Result> c8) {
        ax.Q9.b b8 = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Starting foreground task, current active count:");
        stringBuilder.append(this.b.b());
        stringBuilder.append(", with exception ");
        stringBuilder.append(d8);
        b8.a(stringBuilder.toString());
        this.b.execute(new Runnable(){
            final ax.M9.d c0;
            final b d0;
            final c q;
            {
                this.d0 = b8;
                this.q = c8;
                this.c0 = d8;
            }

            @Override
            public void run() {
                this.q.b(this.c0);
            }
        });
    }

    @Override
    public <Result> void d(int n8, int n9, e<Result> e8) {
        ax.Q9.b b8 = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Starting foreground task, current active count:");
        stringBuilder.append(this.b.b());
        stringBuilder.append(", with progress  ");
        stringBuilder.append(n8);
        stringBuilder.append(", max progress");
        stringBuilder.append(n9);
        b8.a(stringBuilder.toString());
        this.b.execute(new Runnable(){
            final int c0;
            final int d0;
            final b e0;
            final e q;
            {
                this.e0 = b8;
                this.q = e8;
                this.c0 = n8;
                this.d0 = n9;
            }

            @Override
            public void run() {
                this.q.a(this.c0, this.d0);
            }
        });
    }
}

