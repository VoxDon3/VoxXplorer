/*
 * Decompiled with CFR 0.152.
 */
package ax.V0;

import ax.V0.a;
import ax.V0.g;
import ax.V0.h;
import ax.V0.i;
import java.util.ArrayDeque;

public abstract class j<I extends i, O extends androidx.media3.decoder.a, E extends h>
implements g<I, O, E> {
    private final Thread a;
    private final Object b = new Object();
    private final ArrayDeque<I> c = new ArrayDeque();
    private final ArrayDeque<O> d = new ArrayDeque();
    private final I[] e;
    private final O[] f;
    private int g;
    private int h;
    private I i;
    private E j;
    private boolean k;
    private boolean l;
    private int m;
    private long n = -9223372036854775807L;

    protected j(I[] object, O[] OArray) {
        int n8;
        this.e = object;
        this.g = ((I[])object).length;
        int n9 = 0;
        for (n8 = 0; n8 < this.g; ++n8) {
            this.e[n8] = this.j();
        }
        this.f = OArray;
        this.h = OArray.length;
        for (n8 = n9; n8 < this.h; ++n8) {
            this.f[n8] = this.k();
        }
        this.a = object = new Thread(this, "ExoPlayer:SimpleDecoder"){
            final j q;
            {
                this.q = j8;
                super(string);
            }

            @Override
            public void run() {
                this.q.w();
            }
        };
        ((Thread)object).start();
    }

    private boolean i() {
        return !this.c.isEmpty() && this.h > 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private boolean n() throws InterruptedException {
        Object object2;
        block23: {
            Object object;
            block22: {
                Object object3;
                block21: {
                    boolean bl;
                    block20: {
                        int n8;
                        object3 = this.b;
                        // MONITORENTER : object3
                        while (!this.l && !this.i()) {
                            this.b.wait();
                        }
                        if (this.l) {
                            // MONITOREXIT : object3
                            return false;
                        }
                        object2 = (i)this.c.removeFirst();
                        object = this.f;
                        this.h = n8 = this.h - 1;
                        object = object[n8];
                        bl = this.k;
                        this.k = false;
                        // MONITOREXIT : object3
                        if (!((a)object2).s()) break block20;
                        ((a)object).n(4);
                        break block21;
                    }
                    ((androidx.media3.decoder.a)object).c0 = ((i)object2).g0;
                    if (((a)object2).t()) {
                        ((a)object).n(0x8000000);
                    }
                    if (!this.q(((i)object2).g0)) {
                        ((androidx.media3.decoder.a)object).e0 = true;
                    }
                    try {
                        object3 = this.m(object2, object, bl);
                    }
                    catch (OutOfMemoryError outOfMemoryError) {
                        object3 = this.l(outOfMemoryError);
                    }
                    catch (RuntimeException runtimeException) {
                        object3 = this.l(runtimeException);
                    }
                    if (object3 != null) {
                        object2 = this.b;
                        // MONITORENTER : object2
                        this.j = object3;
                        // MONITOREXIT : object2
                        return false;
                    }
                }
                object3 = this.b;
                // MONITORENTER : object3
                if (!this.k) break block22;
                ((androidx.media3.decoder.a)object).B();
                break block23;
            }
            if (((androidx.media3.decoder.a)object).e0) {
                ++this.m;
                ((androidx.media3.decoder.a)object).B();
            } else {
                ((androidx.media3.decoder.a)object).d0 = this.m;
                this.m = 0;
                this.d.addLast(object);
            }
        }
        this.t(object2);
        // MONITOREXIT : object3
        return true;
    }

    private void r() {
        if (this.i()) {
            this.b.notify();
        }
    }

    private void s() throws E {
        E e8 = this.j;
        if (e8 == null) {
            return;
        }
        throw e8;
    }

    private void t(I i8) {
        ((i)i8).p();
        I[] IArray = this.e;
        int n8 = this.g;
        this.g = n8 + 1;
        IArray[n8] = i8;
    }

    private void v(O o8) {
        ((androidx.media3.decoder.a)o8).p();
        O[] OArray = this.f;
        int n8 = this.h;
        this.h = n8 + 1;
        OArray[n8] = o8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void w() {
        try {
            boolean bl;
            while (bl = this.n()) {
            }
            return;
        }
        catch (InterruptedException interruptedException) {
            throw new IllegalStateException(interruptedException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void b(long l8) {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                boolean bl;
                block4: {
                    block3: {
                        try {
                            if (this.g == this.e.length || this.k) break block3;
                            bl = false;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    bl = true;
                }
                ax.S0.a.g(bl);
                this.n = l8;
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
    public final void c(I i8) throws E {
        Object object = this.b;
        synchronized (object) {
            this.s();
            boolean bl = i8 == this.i;
            ax.S0.a.a(bl);
            this.c.addLast(i8);
            this.r();
            this.i = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void d() {
        Object object = this.b;
        synchronized (object) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
            return;
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void flush() {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                block6: {
                    try {
                        this.k = true;
                        this.m = 0;
                        I i8 = this.i;
                        if (i8 == null) break block6;
                        this.t(i8);
                        this.i = null;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                while (!this.c.isEmpty()) {
                    this.t((i)this.c.removeFirst());
                }
                while (true) {
                    if (this.d.isEmpty()) {
                        return;
                    }
                    ((androidx.media3.decoder.a)this.d.removeFirst()).B();
                }
            }
            throw throwable2;
        }
    }

    protected abstract I j();

    protected abstract O k();

    protected abstract E l(Throwable var1);

    protected abstract E m(I var1, O var2, boolean var3);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final I o() throws E {
        Object object = this.b;
        synchronized (object) {
            Object object2;
            this.s();
            boolean bl = this.i == null;
            ax.S0.a.g(bl);
            int n8 = this.g;
            if (n8 == 0) {
                object2 = null;
            } else {
                object2 = this.e;
                this.g = --n8;
                object2 = object2[n8];
            }
            this.i = object2;
            return (I)object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final O p() throws E {
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                try {
                    this.s();
                    if (this.d.isEmpty()) {
                        return null;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                androidx.media3.decoder.a a8 = (androidx.media3.decoder.a)this.d.removeFirst();
                return (O)a8;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final boolean q(long l8) {
        Object object = this.b;
        synchronized (object) {
            long l9 = this.n;
            if (l9 == -9223372036854775807L) return true;
            if (l8 < l9) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void u(O o8) {
        Object object = this.b;
        synchronized (object) {
            this.v(o8);
            this.r();
            return;
        }
    }

    protected final void x(int n8) {
        int n9 = this.g;
        int n10 = this.e.length;
        boolean bl = n9 == n10;
        ax.S0.a.g(bl);
        I[] IArray = this.e;
        n9 = IArray.length;
        for (int i8 = 0; i8 < n9; ++i8) {
            ((i)IArray[i8]).C(n8);
        }
    }
}

