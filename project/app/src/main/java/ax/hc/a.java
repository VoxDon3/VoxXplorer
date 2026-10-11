/*
 * Decompiled with CFR 0.152.
 */
package ax.hc;

import ax.cc.d;
import ax.hc.f;
import java.util.concurrent.ExecutorService;

public class a
extends ax.kc.a
implements f {
    private final f b;
    private final ExecutorService c;

    public a(f f8) {
        super(f8.b());
        this.b = f8;
        this.c = (ExecutorService)f8.b().b().c("bus.handlers.async-executor");
    }

    public void c(Object object, Object object2, d d8) {
        this.c.execute(new Runnable(this, object, object2, d8){
            final Object c0;
            final d d0;
            final a e0;
            final Object q;
            {
                this.e0 = a8;
                this.q = object;
                this.c0 = object2;
                this.d0 = d8;
            }

            @Override
            public void run() {
                this.e0.b.c(this.q, this.c0, this.d0);
            }
        });
    }
}

