package ax.t9;

import ax.Ha.c;
import ax.X8.b;
import ax.Xd.d;
import ax.Xd.f;
import ax.c9.InterfaceC1850c;
import ax.c9.e;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ax.t9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC3107a<D extends ax.X8.b<?>> implements Runnable {
    protected InputStream c0;
    private InterfaceC1850c<D> d0;
    private Thread f0;
    private final d q = f.k(getClass());
    private AtomicBoolean e0 = new AtomicBoolean(false);

    public AbstractRunnableC3107a(String str, InputStream inputStream, InterfaceC1850c<D> interfaceC1850c) {
        if (inputStream instanceof BufferedInputStream) {
            this.c0 = inputStream;
        } else {
            this.c0 = new BufferedInputStream(inputStream);
        }
        this.d0 = interfaceC1850c;
        Thread thread = new Thread(this, "Packet Reader for " + str + ", Original Thread name: " + Thread.currentThread().getName());
        this.f0 = thread;
        thread.setDaemon(true);
    }

    private void b() throws e {
        D a = a();
        this.q.s("Received packet {}", a);
        this.d0.b(a);
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

    @Override // java.lang.Runnable
    public void run() {
        while (!Thread.currentThread().isInterrupted() && !this.e0.get()) {
            try {
                b();
            } catch (e | ax.k9.d | IllegalArgumentException e) {
                if (e instanceof ax.k9.d) {
                    c.h().f().b("SMB3 RUNTIME EXCEPTION").l(e).h();
                } else if (e instanceof IllegalArgumentException) {
                    c.h().f().b("SMB2 RUNTIME EXCEPTION").l(e).h();
                }
                if (!this.e0.get()) {
                    this.q.v("PacketReader error, got exception.", e);
                    this.d0.a(e);
                    return;
                }
            }
        }
        if (this.e0.get()) {
            this.q.a("{} stopped.", this.f0);
        }
    }
}
