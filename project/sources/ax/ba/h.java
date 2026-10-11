package ax.ba;

import android.graphics.Bitmap;
import android.os.Handler;
import ax.ba.c;
import ax.ca.b;
import ax.ea.InterfaceC1993b;
import ax.ga.InterfaceC2133b;
import ax.ha.InterfaceC2175a;
import ax.ia.InterfaceC2293a;
import ax.ka.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
final class h implements Runnable, c.a {
    private final g c0;
    private final Handler d0;
    private final e e0;
    private final InterfaceC2133b f0;
    private final InterfaceC2133b g0;
    private final InterfaceC2133b h0;
    private final InterfaceC1993b i0;
    final String j0;
    private final String k0;
    final InterfaceC2175a l0;
    private final ax.ca.e m0;
    final ax.ba.c n0;
    final InterfaceC2293a o0;
    private final boolean p0;
    private final f q;
    private ax.ca.f q0 = ax.ca.f.NETWORK;

    class a implements Runnable {
        final /* synthetic */ Throwable c0;
        final /* synthetic */ b.a q;

        a(b.a aVar, Throwable th) {
            this.q = aVar;
            this.c0 = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.n0.O()) {
                h hVar = h.this;
                hVar.l0.g(hVar.n0.A(hVar.e0.a));
            }
            h hVar2 = h.this;
            hVar2.o0.b(hVar2.j0, hVar2.l0.h(), new ax.ca.b(this.q, this.c0));
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.o0.d(hVar.j0, hVar.l0.h());
        }
    }

    class c extends Exception {
        c() {
        }
    }

    public h(f fVar, g gVar, Handler handler) {
        this.q = fVar;
        this.c0 = gVar;
        this.d0 = handler;
        e eVar = fVar.a;
        this.e0 = eVar;
        this.f0 = eVar.o;
        this.g0 = eVar.r;
        this.h0 = eVar.s;
        this.i0 = eVar.p;
        this.j0 = gVar.a;
        this.k0 = gVar.b;
        this.l0 = gVar.c;
        this.m0 = gVar.d;
        ax.ba.c cVar = gVar.e;
        this.n0 = cVar;
        this.o0 = gVar.f;
        this.p0 = cVar.J();
    }

    private void c() throws c {
        if (o()) {
            throw new c();
        }
    }

    private void d() throws c {
        e();
        f();
    }

    private void e() throws c {
        if (q()) {
            throw new c();
        }
    }

    private void f() throws c {
        if (r()) {
            throw new c();
        }
    }

    private Bitmap g(String str) throws IOException {
        return this.i0.a(new ax.ea.c(this.k0, str, this.j0, this.m0, this.l0.k(), m(), this.n0));
    }

    private boolean h() {
        if (!this.n0.K()) {
            return false;
        }
        ax.ka.d.a("Delay %d ms before loading...  [%s]", Integer.valueOf(this.n0.v()), this.k0);
        try {
            Thread.sleep(this.n0.v());
            return p();
        } catch (InterruptedException unused) {
            ax.ka.d.b("Task was interrupted [%s]", this.k0);
            return true;
        }
    }

    private boolean i() throws IOException {
        InputStream a2 = m().a(this.j0, this.n0.x());
        if (a2 == null) {
            ax.ka.d.b("No stream for image [%s]", this.k0);
            return false;
        }
        try {
            return this.e0.n.a(this.j0, a2, this);
        } finally {
            ax.ka.c.a(a2);
        }
    }

    private void j() {
        if (this.p0 || o()) {
            return;
        }
        t(new b(), false, this.d0, this.q);
    }

    private void k(b.a aVar, Throwable th) {
        if (this.p0 || o() || p()) {
            return;
        }
        t(new a(aVar, th), false, this.d0, this.q);
    }

    private boolean l(int i, int i2) {
        return (o() || p()) ? false : true;
    }

    private InterfaceC2133b m() {
        return this.q.n() ? this.g0 : this.q.o() ? this.h0 : this.f0;
    }

    private boolean o() {
        if (!Thread.interrupted()) {
            return false;
        }
        ax.ka.d.a("Task was interrupted [%s]", this.k0);
        return true;
    }

    private boolean p() {
        return q() || r();
    }

    private boolean q() {
        if (!this.l0.j()) {
            return false;
        }
        ax.ka.d.a("ImageAware was collected by GC. Task is cancelled. [%s]", this.k0);
        return true;
    }

    private boolean r() {
        if (this.k0.equals(this.q.h(this.l0))) {
            return false;
        }
        ax.ka.d.a("ImageAware is reused for another image. Task is cancelled. [%s]", this.k0);
        return true;
    }

    private boolean s(int i, int i2) throws IOException {
        File i3 = this.e0.n.i(this.j0);
        if (i3 == null || !i3.exists()) {
            return false;
        }
        Bitmap a2 = this.i0.a(new ax.ea.c(this.k0, InterfaceC2133b.a.FILE.n(i3.getAbsolutePath()), this.j0, new ax.ca.e(i, i2), ax.ca.h.FIT_INSIDE, m(), new c.b().x(this.n0).B(ax.ca.d.IN_SAMPLE_INT).u()));
        if (a2 != null) {
            this.e0.getClass();
        }
        if (a2 == null) {
            return false;
        }
        boolean b2 = this.e0.n.b(this.j0, a2);
        a2.recycle();
        return b2;
    }

    static void t(Runnable runnable, boolean z, Handler handler, f fVar) {
        if (z) {
            runnable.run();
        } else if (handler == null) {
            fVar.g(runnable);
        } else {
            handler.post(runnable);
        }
    }

    private boolean u() throws c {
        ax.ka.d.a("Cache image on disk [%s]", this.k0);
        try {
            boolean i = i();
            if (i) {
                e eVar = this.e0;
                int i2 = eVar.d;
                int i3 = eVar.e;
                if (i2 > 0 || i3 > 0) {
                    ax.ka.d.a("Resize image in disk cache [%s]", this.k0);
                    s(i2, i3);
                    return i;
                }
            }
            return i;
        } catch (IOException e) {
            ax.ka.d.c(e);
            return false;
        }
    }

    private Bitmap v() throws c {
        Bitmap bitmap;
        File i;
        Bitmap bitmap2 = null;
        try {
            try {
                File i2 = this.e0.n.i(this.j0);
                if (i2 == null || !i2.exists() || i2.length() <= 0) {
                    bitmap = null;
                } else {
                    ax.ka.d.a("Load image from disk cache [%s]", this.k0);
                    this.q0 = ax.ca.f.DISC_CACHE;
                    d();
                    bitmap = g(InterfaceC2133b.a.FILE.n(i2.getAbsolutePath()));
                }
                if (bitmap != null) {
                    try {
                        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                            return bitmap;
                        }
                    } catch (IOException e) {
                        e = e;
                        bitmap2 = bitmap;
                        ax.ka.d.c(e);
                        k(b.a.IO_ERROR, e);
                        return bitmap2;
                    } catch (IllegalStateException unused) {
                        k(b.a.NETWORK_DENIED, null);
                        return bitmap;
                    } catch (OutOfMemoryError e2) {
                        e = e2;
                        bitmap2 = bitmap;
                        ax.ka.d.c(e);
                        k(b.a.OUT_OF_MEMORY, e);
                        return bitmap2;
                    } catch (Throwable th) {
                        th = th;
                        bitmap2 = bitmap;
                        ax.ka.d.c(th);
                        k(b.a.UNKNOWN, th);
                        return bitmap2;
                    }
                }
                ax.ka.d.a("Load image from network [%s]", this.k0);
                this.q0 = ax.ca.f.NETWORK;
                String str = this.j0;
                if (this.n0.G() && u() && (i = this.e0.n.i(this.j0)) != null) {
                    str = InterfaceC2133b.a.FILE.n(i.getAbsolutePath());
                }
                d();
                bitmap = g(str);
                if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                    return bitmap;
                }
                k(b.a.DECODING_ERROR, null);
                return bitmap;
            } catch (c e3) {
                throw e3;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (IllegalStateException unused2) {
            bitmap = null;
        } catch (OutOfMemoryError e5) {
            e = e5;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean w() {
        AtomicBoolean j = this.q.j();
        if (j.get()) {
            synchronized (this.q.k()) {
                try {
                    if (j.get()) {
                        ax.ka.d.a("ImageLoader is paused. Waiting...  [%s]", this.k0);
                        try {
                            this.q.k().wait();
                            ax.ka.d.a(".. Resume loading [%s]", this.k0);
                        } catch (InterruptedException unused) {
                            ax.ka.d.b("Task was interrupted [%s]", this.k0);
                            return true;
                        }
                    }
                } finally {
                }
            }
        }
        return p();
    }

    @Override // ax.ka.c.a
    public boolean a(int i, int i2) {
        return this.p0 || l(i, i2);
    }

    String n() {
        return this.j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0099 A[Catch: all -> 0x005a, c -> 0x00d9, TRY_LEAVE, TryCatch #0 {c -> 0x00d9, blocks: (B:13:0x0033, B:15:0x0043, B:18:0x004a, B:19:0x0091, B:21:0x0099, B:24:0x00b7, B:26:0x005d, B:30:0x0067, B:32:0x0075, B:34:0x007d, B:35:0x00c8), top: B:12:0x0033, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7 A[Catch: all -> 0x005a, c -> 0x00d9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {c -> 0x00d9, blocks: (B:13:0x0033, B:15:0x0043, B:18:0x004a, B:19:0x0091, B:21:0x0099, B:24:0x00b7, B:26:0x005d, B:30:0x0067, B:32:0x0075, B:34:0x007d, B:35:0x00c8), top: B:12:0x0033, outer: #1 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.ba.h.run():void");
    }
}
