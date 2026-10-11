package androidx.work;

import android.os.Build;
import ax.B2.h;
import ax.B2.p;
import ax.B2.u;
import ax.C2.C0655d;
import ax.b0.InterfaceC1440a;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class a {
    final Executor a;
    final Executor b;
    final u c;
    final h d;
    final p e;
    final InterfaceC1440a<Throwable> f;
    final InterfaceC1440a<Throwable> g;
    final String h;
    final int i;
    final int j;
    final int k;
    final int l;
    private final boolean m;

    /* renamed from: androidx.work.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0045a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(0);
        final /* synthetic */ boolean b;

        ThreadFactoryC0045a(boolean z) {
            this.b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.b ? "WM.task-" : "androidx.work-") + this.a.incrementAndGet());
        }
    }

    public static final class b {
        Executor a;
        u b;
        h c;
        Executor d;
        p e;
        InterfaceC1440a<Throwable> f;
        InterfaceC1440a<Throwable> g;
        String h;
        int i = 4;
        int j = 0;
        int k = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        int l = 20;

        public a a() {
            return new a(this);
        }

        public b b(InterfaceC1440a<Throwable> interfaceC1440a) {
            this.f = interfaceC1440a;
            return this;
        }

        public b c(int i, int i2) {
            if (i2 - i < 1000) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
            this.j = i;
            this.k = i2;
            return this;
        }

        public b d(InterfaceC1440a<Throwable> interfaceC1440a) {
            this.g = interfaceC1440a;
            return this;
        }
    }

    public interface c {
        a a();
    }

    a(b bVar) {
        Executor executor = bVar.a;
        if (executor == null) {
            this.a = a(false);
        } else {
            this.a = executor;
        }
        Executor executor2 = bVar.d;
        if (executor2 == null) {
            this.m = true;
            this.b = a(true);
        } else {
            this.m = false;
            this.b = executor2;
        }
        u uVar = bVar.b;
        if (uVar == null) {
            this.c = u.c();
        } else {
            this.c = uVar;
        }
        h hVar = bVar.c;
        if (hVar == null) {
            this.d = h.c();
        } else {
            this.d = hVar;
        }
        p pVar = bVar.e;
        if (pVar == null) {
            this.e = new C0655d();
        } else {
            this.e = pVar;
        }
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
    }

    private Executor a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z));
    }

    private ThreadFactory b(boolean z) {
        return new ThreadFactoryC0045a(z);
    }

    public String c() {
        return this.h;
    }

    public Executor d() {
        return this.a;
    }

    public InterfaceC1440a<Throwable> e() {
        return this.f;
    }

    public h f() {
        return this.d;
    }

    public int g() {
        return this.k;
    }

    public int h() {
        return Build.VERSION.SDK_INT == 23 ? this.l / 2 : this.l;
    }

    public int i() {
        return this.j;
    }

    public int j() {
        return this.i;
    }

    public p k() {
        return this.e;
    }

    public InterfaceC1440a<Throwable> l() {
        return this.g;
    }

    public Executor m() {
        return this.b;
    }

    public u n() {
        return this.c;
    }
}
