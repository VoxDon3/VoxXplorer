/*
 * Decompiled with CFR 0.152.
 */
package ax.j6;

import ax.j6.K;
import ax.j6.q;
import java.util.concurrent.ExecutionException;

final class r<T>
implements q<T> {
    private final Object a = new Object();
    private final int b;
    private final K c;
    private int d;
    private int e;
    private int f;
    private Exception g;
    private boolean h;

    public r(int n8, K k8) {
        this.b = n8;
        this.c = k8;
    }

    private final void b() {
        if (this.d + this.e + this.f == this.b) {
            if (this.g != null) {
                K k8 = this.c;
                int n8 = this.e;
                int n9 = this.b;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(n8);
                stringBuilder.append(" out of ");
                stringBuilder.append(n9);
                stringBuilder.append(" underlying tasks failed");
                k8.p(new ExecutionException(stringBuilder.toString(), this.g));
                return;
            }
            if (this.h) {
                this.c.r();
                return;
            }
            this.c.q(null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a(T object) {
        object = this.a;
        synchronized (object) {
            ++this.d;
            this.b();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c() {
        Object object = this.a;
        synchronized (object) {
            ++this.f;
            this.h = true;
            this.b();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d(Exception exception) {
        Object object = this.a;
        synchronized (object) {
            ++this.e;
            this.g = exception;
            this.b();
            return;
        }
    }
}

