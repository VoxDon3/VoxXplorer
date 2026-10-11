/*
 * Decompiled with CFR 0.152.
 */
package ax.t9;

import ax.Ha.c;
import ax.X8.b;
import ax.Xd.f;
import ax.c9.e;
import ax.k9.d;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class a<D extends b<?>>
implements Runnable {
    protected InputStream c0;
    private ax.c9.c<D> d0;
    private AtomicBoolean e0;
    private Thread f0;
    private final ax.Xd.d q = f.k(this.getClass());

    public a(String object, InputStream object2, ax.c9.c<D> c8) {
        this.e0 = new AtomicBoolean(false);
        this.c0 = object2 instanceof BufferedInputStream ? object2 : new BufferedInputStream((InputStream)object2);
        this.d0 = c8;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Packet Reader for ");
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(", Original Thread name: ");
        ((StringBuilder)object2).append(Thread.currentThread().getName());
        this.f0 = object = new Thread((Runnable)this, ((StringBuilder)object2).toString());
        ((Thread)object).setDaemon(true);
    }

    private void b() throws e {
        D d8 = this.a();
        this.q.s("Received packet {}", d8);
        this.d0.b(d8);
    }

    protected abstract D a() throws e;

    public void c() {
        this.q.s("Starting PacketReader on thread: {}", this.f0.getName());
        this.f0.start();
    }

    public void d() {
        this.q.n("Stopping PacketReader...");
        this.e0.set(true);
        this.f0.interrupt();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted() && !this.e0.get()) {
            Throwable var1_4;
            try {
                this.b();
                continue;
            }
            catch (e e8) {
            }
            catch (d d8) {
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
            if (var1_4 instanceof d) {
                c.h().f().b("SMB3 RUNTIME EXCEPTION").l((Throwable)var1_4).h();
            } else if (var1_4 instanceof IllegalArgumentException) {
                c.h().f().b("SMB2 RUNTIME EXCEPTION").l((Throwable)var1_4).h();
            }
            if (this.e0.get()) break;
            this.q.v("PacketReader error, got exception.", (Throwable)var1_4);
            this.d0.a((Throwable)var1_4);
            return;
        }
        if (this.e0.get()) {
            this.q.a("{} stopped.", this.f0);
        }
    }
}

