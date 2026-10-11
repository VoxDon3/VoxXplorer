/*
 * Decompiled with CFR 0.152.
 */
package ax.u9;

import ax.Xd.d;
import ax.Xd.f;
import ax.c9.e;
import ax.u9.a;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.net.SocketFactory;

public class b<D extends ax.X8.b<?>, P extends ax.X8.a<?>>
implements ax.c9.f<P> {
    private final d a = ax.Xd.f.k(this.getClass());
    private final ax.c9.b<D, P> b;
    private final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    private SocketFactory d;
    private int e;
    private Socket f;
    private BufferedOutputStream g;
    private ax.t9.a<D> h;

    public b(SocketFactory socketFactory, int n8, ax.c9.b<D, P> b8) {
        new ax.b9.a();
        this.e = n8;
        this.d = socketFactory;
        this.b = b8;
    }

    private void e(String object) throws IOException {
        this.f.setSoTimeout(this.e);
        this.g = new BufferedOutputStream(this.f.getOutputStream(), 9000);
        this.h = object = new a<D>((String)object, this.f.getInputStream(), this.b.a(), this.b.b());
        ((ax.t9.a)object).c();
    }

    private void f(int n8) throws IOException {
        this.g.write(0);
        this.g.write((byte)(n8 >> 16));
        this.g.write((byte)(n8 >> 8));
        this.g.write((byte)(n8 & 0xFF));
    }

    private void g(ax.Z8.a<?> a8) throws IOException {
        this.g.write(a8.a(), a8.S(), a8.c());
    }

    @Override
    public boolean a() {
        Throwable throwable2;
        block5: {
            boolean bl;
            block4: {
                block3: {
                    Socket socket;
                    this.c.readLock().lock();
                    try {
                        socket = this.f;
                        if (socket == null) break block3;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    if (!socket.isConnected() || (bl = this.f.isClosed())) break block3;
                    bl = true;
                    break block4;
                }
                bl = false;
            }
            this.c.readLock().unlock();
            return bl;
        }
        this.c.readLock().unlock();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b() throws IOException {
        Throwable throwable2;
        block9: {
            block8: {
                Closeable closeable;
                block7: {
                    if (!this.a()) {
                        return;
                    }
                    this.c.writeLock().lock();
                    try {
                        boolean bl = this.a();
                        if (bl) break block7;
                        break block8;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                }
                this.h.d();
                if (this.f.getInputStream() != null) {
                    this.f.getInputStream().close();
                }
                if ((closeable = this.g) != null) {
                    ((OutputStream)closeable).close();
                    this.g = null;
                }
                if ((closeable = this.f) != null) {
                    ((Socket)closeable).close();
                    this.f = null;
                }
            }
            this.c.writeLock().unlock();
            return;
        }
        this.c.writeLock().unlock();
        throw throwable2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void c(P object) throws e {
        Throwable throwable2;
        block8: {
            IOException iOException2;
            block7: {
                this.a.g("Acquiring write lock to send packet << {} >>", object);
                if (!this.a()) {
                    throw new e(String.format("Cannot write %s as transport is disconnected", object));
                }
                this.c.writeLock().lock();
                try {
                    if (this.a()) {
                        this.a.s("Writing packet {}", object);
                        Object obj = this.b.c().c(object);
                        this.f(((ax.Z8.a)obj).c());
                        this.g((ax.Z8.a<?>)obj);
                        this.g.flush();
                        this.a.g("Packet {} sent, lock released.", object);
                        this.c.writeLock().unlock();
                        return;
                    }
                }
                catch (IOException iOException2) {
                    break block7;
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                {
                    e e8 = new e(String.format("Cannot write %s as transport got disconnected", object));
                    throw e8;
                }
            }
            object = new Object(iOException2);
            throw object;
        }
        this.c.writeLock().unlock();
        throw throwable2;
    }

    @Override
    public void d(InetSocketAddress inetSocketAddress) throws IOException {
        String string = inetSocketAddress.getHostString();
        this.f = this.d.createSocket(string, inetSocketAddress.getPort());
        this.e(string);
    }
}

