/*
 * Decompiled with CFR 0.152.
 */
package ax.ba;

import android.graphics.Bitmap;
import android.os.Handler;
import ax.ba.b;
import ax.ba.c;
import ax.ba.e;
import ax.ba.f;
import ax.ba.g;
import ax.ca.b;
import ax.ca.d;
import ax.ga.b;
import ax.ha.a;
import ax.ka.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

final class h
implements Runnable,
c.a {
    private final g c0;
    private final Handler d0;
    private final e e0;
    private final ax.ga.b f0;
    private final ax.ga.b g0;
    private final ax.ga.b h0;
    private final ax.ea.b i0;
    final String j0;
    private final String k0;
    final a l0;
    private final ax.ca.e m0;
    final ax.ba.c n0;
    final ax.ia.a o0;
    private final boolean p0;
    private final f q;
    private ax.ca.f q0 = ax.ca.f.q;

    public h(f object, g g8, Handler handler) {
        this.q = object;
        this.c0 = g8;
        this.d0 = handler;
        this.e0 = object = ((f)object).a;
        this.f0 = ((e)object).o;
        this.g0 = ((e)object).r;
        this.h0 = ((e)object).s;
        this.i0 = ((e)object).p;
        this.j0 = g8.a;
        this.k0 = g8.b;
        this.l0 = g8.c;
        this.m0 = g8.d;
        this.n0 = object = g8.e;
        this.o0 = g8.f;
        this.p0 = ((ax.ba.c)object).J();
    }

    private void c() throws c {
        if (!this.o()) {
            return;
        }
        throw new c(this);
    }

    private void d() throws c {
        this.e();
        this.f();
    }

    private void e() throws c {
        if (!this.q()) {
            return;
        }
        throw new c(this);
    }

    private void f() throws c {
        if (!this.r()) {
            return;
        }
        throw new c(this);
    }

    private Bitmap g(String object) throws IOException {
        ax.ca.h h8 = this.l0.k();
        object = new ax.ea.c(this.k0, (String)object, this.j0, this.m0, h8, this.m(), this.n0);
        return this.i0.a((ax.ea.c)object);
    }

    private boolean h() {
        if (this.n0.K()) {
            ax.ka.d.a("Delay %d ms before loading...  [%s]", this.n0.v(), this.k0);
            try {
                Thread.sleep(this.n0.v());
                return this.p();
            }
            catch (InterruptedException interruptedException) {
                ax.ka.d.b("Task was interrupted [%s]", this.k0);
                return true;
            }
        }
        return false;
    }

    private boolean i() throws IOException {
        InputStream inputStream = this.m().a(this.j0, this.n0.x());
        if (inputStream == null) {
            ax.ka.d.b("No stream for image [%s]", this.k0);
            return false;
        }
        try {
            boolean bl = this.e0.n.a(this.j0, inputStream, this);
            return bl;
        }
        finally {
            ax.ka.c.a(inputStream);
        }
    }

    private void j() {
        if (!this.p0 && !this.o()) {
            h.t(new Runnable(this){
                final h q;
                {
                    this.q = h8;
                }

                @Override
                public void run() {
                    h h8 = this.q;
                    h8.o0.d(h8.j0, h8.l0.h());
                }
            }, false, this.d0, this.q);
        }
    }

    private void k(b.a a8, Throwable throwable) {
        if (!(this.p0 || this.o() || this.p())) {
            h.t(new Runnable(){
                final Throwable c0;
                final h d0;
                final b.a q;
                {
                    this.d0 = h8;
                    this.q = a8;
                    this.c0 = throwable;
                }

                @Override
                public void run() {
                    h h8;
                    if (this.d0.n0.O()) {
                        h8 = this.d0;
                        h8.l0.g(h8.n0.A(((h)h8).e0.a));
                    }
                    h8 = this.d0;
                    h8.o0.b(h8.j0, h8.l0.h(), new ax.ca.b(this.q, this.c0));
                }
            }, false, this.d0, this.q);
        }
    }

    private boolean l(int n8, int n9) {
        return !this.o() && !this.p();
        {
        }
    }

    private ax.ga.b m() {
        if (this.q.n()) {
            return this.g0;
        }
        if (this.q.o()) {
            return this.h0;
        }
        return this.f0;
    }

    private boolean o() {
        if (Thread.interrupted()) {
            ax.ka.d.a("Task was interrupted [%s]", this.k0);
            return true;
        }
        return false;
    }

    private boolean p() {
        return this.q() || this.r();
        {
        }
    }

    private boolean q() {
        if (this.l0.j()) {
            ax.ka.d.a("ImageAware was collected by GC. Task is cancelled. [%s]", this.k0);
            return true;
        }
        return false;
    }

    private boolean r() {
        String string = this.q.h(this.l0);
        if (!this.k0.equals(string)) {
            ax.ka.d.a("ImageAware is reused for another image. Task is cancelled. [%s]", this.k0);
            return true;
        }
        return false;
    }

    private boolean s(int n8, int n9) throws IOException {
        File file = this.e0.n.i(this.j0);
        if (file != null && file.exists()) {
            Object object = new ax.ca.e(n8, n9);
            ax.ba.c c8 = new c.b().x(this.n0).B(d.e0).u();
            object = new ax.ea.c(this.k0, b.a.f0.n(file.getAbsolutePath()), this.j0, (ax.ca.e)object, ax.ca.h.q, this.m(), c8);
            if ((object = this.i0.a((ax.ea.c)object)) != null) {
                this.e0.getClass();
            }
            if (object != null) {
                boolean bl = this.e0.n.b(this.j0, (Bitmap)object);
                object.recycle();
                return bl;
            }
        }
        return false;
    }

    static void t(Runnable runnable2, boolean bl, Handler handler, f f8) {
        if (bl) {
            runnable2.run();
            return;
        }
        if (handler == null) {
            f8.g(runnable2);
            return;
        }
        handler.post(runnable2);
    }

    private boolean u() throws c {
        IOException iOException2;
        block5: {
            boolean bl;
            block4: {
                ax.ka.d.a("Cache image on disk [%s]", this.k0);
                try {
                    bl = this.i();
                    if (!bl) break block4;
                }
                catch (IOException iOException2) {}
                e e8 = this.e0;
                int n8 = e8.d;
                int n9 = e8.e;
                if (n8 <= 0 && n9 <= 0) break block4;
                ax.ka.d.a("Resize image in disk cache [%s]", this.k0);
                this.s(n8, n9);
                return bl;
                break block5;
            }
            return bl;
        }
        ax.ka.d.c(iOException2);
        return false;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Bitmap v() throws c {
        File file;
        block23: {
            Serializable serializable;
            Serializable serializable2;
            block22: {
                Throwable var2_15;
                block21: {
                    Throwable var2_14;
                    block20: {
                        File file2;
                        File file3;
                        block24: {
                            block19: {
                                block18: {
                                    file3 = null;
                                    serializable2 = null;
                                    file2 = null;
                                    try {
                                        serializable = this.e0.n.i(this.j0);
                                        if (serializable == null || !((File)serializable).exists() || ((File)serializable).length() <= 0L) break block18;
                                        ax.ka.d.a("Load image from disk cache [%s]", this.k0);
                                        this.q0 = ax.ca.f.c0;
                                        this.d();
                                        serializable = this.g(b.a.f0.n(((File)serializable).getAbsolutePath()));
                                        serializable2 = serializable;
                                        break block19;
                                    }
                                    catch (Throwable throwable) {
                                        serializable2 = file2;
                                        break block20;
                                    }
                                    catch (OutOfMemoryError outOfMemoryError) {
                                        serializable2 = file3;
                                        break block21;
                                    }
                                    catch (IOException iOException) {
                                        break block22;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        file = null;
                                        break block23;
                                    }
                                }
                                serializable2 = null;
                            }
                            if (serializable2 != null) {
                                file3 = serializable2;
                                file2 = serializable2;
                                serializable = serializable2;
                                file = serializable2;
                                try {
                                    if (serializable2.getWidth() <= 0) break block24;
                                    file3 = serializable2;
                                    file2 = serializable2;
                                    serializable = serializable2;
                                    file = serializable2;
                                    if (serializable2.getHeight() > 0) return serializable2;
                                }
                                catch (Throwable throwable) {
                                    serializable2 = file3;
                                }
                                catch (OutOfMemoryError outOfMemoryError) {
                                    serializable2 = file2;
                                    break block21;
                                }
                                catch (IOException iOException) {
                                    file2 = serializable;
                                    serializable = iOException;
                                    serializable2 = file2;
                                    break block22;
                                }
                            }
                        }
                        file3 = serializable2;
                        file2 = serializable2;
                        serializable = serializable2;
                        file = serializable2;
                        ax.ka.d.a("Load image from network [%s]", this.k0);
                        file3 = serializable2;
                        file2 = serializable2;
                        serializable = serializable2;
                        file = serializable2;
                        this.q0 = ax.ca.f.q;
                        file3 = serializable2;
                        file2 = serializable2;
                        serializable = serializable2;
                        file = serializable2;
                        String string = this.j0;
                        file3 = serializable2;
                        file2 = serializable2;
                        serializable = serializable2;
                        String string2 = string;
                        file = serializable2;
                        if (this.n0.G()) {
                            file3 = serializable2;
                            file2 = serializable2;
                            serializable = serializable2;
                            string2 = string;
                            file = serializable2;
                            if (this.u()) {
                                file3 = serializable2;
                                file2 = serializable2;
                                serializable = serializable2;
                                file = serializable2;
                                File file4 = this.e0.n.i(this.j0);
                                string2 = string;
                                if (file4 != null) {
                                    file3 = serializable2;
                                    file2 = serializable2;
                                    serializable = serializable2;
                                    file = serializable2;
                                    string2 = b.a.f0.n(file4.getAbsolutePath());
                                }
                            }
                        }
                        file3 = serializable2;
                        file2 = serializable2;
                        serializable = serializable2;
                        file = serializable2;
                        this.d();
                        file3 = serializable2;
                        file2 = serializable2;
                        serializable = serializable2;
                        file = serializable2;
                        serializable2 = this.g(string2);
                        if (serializable2 != null) {
                            file3 = serializable2;
                            file2 = serializable2;
                            serializable = serializable2;
                            file = serializable2;
                            if (serializable2.getWidth() > 0) {
                                file3 = serializable2;
                                file2 = serializable2;
                                serializable = serializable2;
                                file = serializable2;
                                if (serializable2.getHeight() > 0) return serializable2;
                            }
                        }
                        file3 = serializable2;
                        file2 = serializable2;
                        serializable = serializable2;
                        file = serializable2;
                        this.k(b.a.c0, null);
                        return serializable2;
                        catch (IllegalStateException illegalStateException) {
                            break block23;
                        }
                    }
                    ax.ka.d.c((Throwable)var2_14);
                    this.k(b.a.f0, (Throwable)var2_14);
                    return serializable2;
                }
                ax.ka.d.c((Throwable)var2_15);
                this.k(b.a.e0, (Throwable)var2_15);
                return serializable2;
            }
            ax.ka.d.c((Throwable)serializable);
            this.k(b.a.q, (Throwable)serializable);
            return serializable2;
        }
        this.k(b.a.d0, null);
        return file;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean w() {
        AtomicBoolean atomicBoolean = this.q.j();
        if (!atomicBoolean.get()) return this.p();
        Object object = this.q.k();
        synchronized (object) {
            try {
                if (!atomicBoolean.get()) return this.p();
                ax.ka.d.a("ImageLoader is paused. Waiting...  [%s]", this.k0);
                try {
                    this.q.k().wait();
                }
                catch (InterruptedException interruptedException) {
                    ax.ka.d.b("Task was interrupted [%s]", this.k0);
                    return true;
                }
                ax.ka.d.a(".. Resume loading [%s]", this.k0);
                return this.p();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public boolean a(int n8, int n9) {
        return this.p0 || this.l(n8, n9);
        {
        }
    }

    String n() {
        return this.j0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        Throwable throwable2;
        ReentrantLock reentrantLock;
        block16: {
            block14: {
                block15: {
                    if (this.w()) {
                        return;
                    }
                    if (this.h()) {
                        return;
                    }
                    reentrantLock = this.c0.g;
                    ax.ka.d.a("Start display image task [%s]", this.k0);
                    if (reentrantLock.isLocked()) {
                        ax.ka.d.a("Image already is loading. Waiting... [%s]", this.k0);
                    }
                    reentrantLock.lock();
                    this.d();
                    Bitmap bitmap = this.e0.m.i(this.k0);
                    if (bitmap != null && !bitmap.isRecycled()) {
                        this.q0 = ax.ca.f.d0;
                        ax.ka.d.a("...Get cached bitmap from memory after waiting. [%s]", this.k0);
                    } else {
                        Bitmap bitmap2 = this.v();
                        if (bitmap2 == null) {
                            reentrantLock.unlock();
                            return;
                        }
                        this.d();
                        this.c();
                        if (this.n0.M()) break block14;
                        bitmap = bitmap2;
                        if (this.n0.F()) {
                            ax.ka.d.a("Cache image in memory [%s]", this.k0);
                            this.e0.m.c(this.k0, bitmap2);
                            bitmap = bitmap2;
                        }
                    }
                    if (this.n0.L()) break block15;
                    this.d();
                    this.c();
                    reentrantLock.unlock();
                    h.t(new b(bitmap, this.c0, this.q, this.q0), this.p0, this.d0, this.q);
                    return;
                }
                try {
                }
                catch (Throwable throwable2) {
                    break block16;
                }
                ax.ka.d.a("PostProcess image before displaying [%s]", this.k0);
                this.n0.D();
                throw null;
            }
            try {
                ax.ka.d.a("PreProcess image before caching in memory [%s]", this.k0);
                this.n0.E();
            }
            catch (c c8) {
                this.j();
                reentrantLock.unlock();
                return;
            }
            throw null;
        }
        reentrantLock.unlock();
        throw throwable2;
    }

    class c
    extends Exception {
        final h q;

        c(h h8) {
            this.q = h8;
        }
    }
}

