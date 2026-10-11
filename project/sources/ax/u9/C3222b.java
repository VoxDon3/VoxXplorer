package ax.u9;

import ax.X8.a;
import ax.X8.b;
import ax.Xd.d;
import ax.b9.C1725a;
import ax.c9.C1849b;
import ax.c9.e;
import ax.c9.f;
import ax.t9.AbstractRunnableC3107a;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.net.SocketFactory;

/* renamed from: ax.u9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3222b<D extends ax.X8.b<?>, P extends ax.X8.a<?>> implements f<P> {
    private final C1849b<D, P> b;
    private SocketFactory d;
    private int e;
    private Socket f;
    private BufferedOutputStream g;
    private AbstractRunnableC3107a<D> h;
    private final d a = ax.Xd.f.k(getClass());
    private final ReentrantReadWriteLock c = new ReentrantReadWriteLock();

    public C3222b(SocketFactory socketFactory, int i, C1849b<D, P> c1849b) {
        new C1725a();
        this.e = i;
        this.d = socketFactory;
        this.b = c1849b;
    }

    private void e(String str) throws IOException {
        this.f.setSoTimeout(this.e);
        this.g = new BufferedOutputStream(this.f.getOutputStream(), 9000);
        C3221a c3221a = new C3221a(str, this.f.getInputStream(), this.b.a(), this.b.b());
        this.h = c3221a;
        c3221a.c();
    }

    private void f(int i) throws IOException {
        this.g.write(0);
        this.g.write((byte) (i >> 16));
        this.g.write((byte) (i >> 8));
        this.g.write((byte) (i & 255));
    }

    private void g(ax.Z8.a<?> aVar) throws IOException {
        this.g.write(aVar.a(), aVar.S(), aVar.c());
    }

    @Override // ax.c9.f
    public boolean a() {
        boolean z;
        this.c.readLock().lock();
        try {
            Socket socket = this.f;
            if (socket != null && socket.isConnected()) {
                if (!this.f.isClosed()) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // ax.c9.f
    public void b() throws IOException {
        if (a()) {
            this.c.writeLock().lock();
            try {
                if (a()) {
                    this.h.d();
                    if (this.f.getInputStream() != null) {
                        this.f.getInputStream().close();
                    }
                    BufferedOutputStream bufferedOutputStream = this.g;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                        this.g = null;
                    }
                    Socket socket = this.f;
                    if (socket != null) {
                        socket.close();
                        this.f = null;
                    }
                }
                this.c.writeLock().unlock();
            } catch (Throwable th) {
                this.c.writeLock().unlock();
                throw th;
            }
        }
    }

    @Override // ax.c9.f
    public void c(P p) throws e {
        this.a.g("Acquiring write lock to send packet << {} >>", p);
        if (!a()) {
            throw new e(String.format("Cannot write %s as transport is disconnected", p));
        }
        this.c.writeLock().lock();
        try {
            try {
                if (!a()) {
                    throw new e(String.format("Cannot write %s as transport got disconnected", p));
                }
                this.a.s("Writing packet {}", p);
                ax.Z8.a<?> c = this.b.c().c(p);
                f(c.c());
                g(c);
                this.g.flush();
                this.a.g("Packet {} sent, lock released.", p);
            } catch (IOException e) {
                throw new e(e);
            }
        } finally {
            this.c.writeLock().unlock();
        }
    }

    @Override // ax.c9.f
    public void d(InetSocketAddress inetSocketAddress) throws IOException {
        String hostString = inetSocketAddress.getHostString();
        this.f = this.d.createSocket(hostString, inetSocketAddress.getPort());
        e(hostString);
    }
}
