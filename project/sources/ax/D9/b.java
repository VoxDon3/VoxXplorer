package ax.D9;

import ax.I9.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class b implements ax.A9.b {
    static Logger r = Logger.getLogger(b.class.getName());
    private final ax.C9.c a;
    private c b;
    private final ax.Qa.b<ax.Qa.a> c;
    private d d;
    private d e;
    private double f;
    private long g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private double l;
    private final ArrayList<u> m;
    private final ArrayList<u> n;
    private final ArrayList<u> o;
    private ax.D9.a p;
    private final CopyOnWriteArrayList<Runnable> q;

    class a implements ax.Qa.a {
        final /* synthetic */ u q;

        a(u uVar) {
            this.q = uVar;
        }

        @Override // ax.Qa.a
        public void run() {
            b.this.w(this.q);
        }
    }

    /* renamed from: ax.D9.b$b, reason: collision with other inner class name */
    static class C0071b {
        private final double[] a;

        C0071b(int i) {
            this.a = new double[i];
        }

        void b() {
            int i = 0;
            while (true) {
                double[] dArr = this.a;
                if (i >= dArr.length) {
                    return;
                }
                dArr[i] = 0.0d;
                i++;
            }
        }
    }

    private class c extends Thread {
        private volatile boolean q = true;

        c(int i, int i2, int i3, int i4) {
            if (i2 > 0) {
                b.this.a.a(i, b.this.k, i2);
            }
            if (i4 > 0) {
                b.this.a.b(i3, b.this.k, i4);
            }
        }

        public void a() {
            this.q = false;
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            b.r.fine("JSyn synthesis thread starting.");
            try {
                b.this.p = new ax.D9.a();
                while (this.q) {
                    b.this.p.a();
                    b.this.y();
                    b.this.q();
                    b.this.p.b();
                    if (b.this.a()) {
                        Thread.sleep(2L);
                    }
                }
            } finally {
                try {
                    b.r.fine("JSyn synthesis thread exiting.");
                } finally {
                }
            }
            b.r.fine("JSyn synthesis thread exiting.");
        }
    }

    class d {
        private final double[] a;
        C0071b[] b;

        d(int i, int i2, int i3) {
            this.a = new double[i * i3];
            this.b = new C0071b[i3];
            int i4 = 0;
            while (true) {
                C0071b[] c0071bArr = this.b;
                if (i4 >= c0071bArr.length) {
                    return;
                }
                c0071bArr[i4] = new C0071b(i2);
                i4++;
            }
        }

        public void a() {
            int i = 0;
            while (true) {
                C0071b[] c0071bArr = this.b;
                if (i >= c0071bArr.length) {
                    return;
                }
                c0071bArr[i].b();
                i++;
            }
        }

        int b(int i) {
            for (int i2 = 0; i2 < 8; i2++) {
                int i3 = 0;
                while (true) {
                    C0071b[] c0071bArr = this.b;
                    if (i3 < c0071bArr.length) {
                        c0071bArr[i3].a[i2] = this.a[i];
                        i3++;
                        i++;
                    }
                }
            }
            return i;
        }

        int c(int i) {
            for (int i2 = 0; i2 < 8; i2++) {
                int i3 = 0;
                while (true) {
                    C0071b[] c0071bArr = this.b;
                    if (i3 < c0071bArr.length) {
                        this.a[i] = c0071bArr[i3].a[i2];
                        i3++;
                        i++;
                    }
                }
            }
            return i;
        }
    }

    public b(ax.C9.c cVar) {
        this.c = new ax.Qa.b<>();
        this.h = true;
        this.i = true;
        this.k = 44100;
        this.l = 1.0d / 44100;
        this.m = new ArrayList<>();
        this.n = new ArrayList<>();
        this.o = new ArrayList<>();
        this.q = new CopyOnWriteArrayList<>();
        this.a = cVar;
    }

    private void E() {
        int i;
        synchronized (this.n) {
            try {
                ListIterator<u> listIterator = this.n.listIterator();
                while (true) {
                    i = 0;
                    if (!listIterator.hasNext()) {
                        break;
                    }
                    u next = listIterator.next();
                    if (this.h) {
                        next.u(s(), 0, 8);
                    } else {
                        next.k(0, 8);
                    }
                }
                ArrayList<u> arrayList = this.o;
                int size = arrayList.size();
                while (i < size) {
                    u uVar = arrayList.get(i);
                    i++;
                    u uVar2 = uVar;
                    this.n.remove(uVar2);
                    uVar2.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.o.clear();
    }

    private void n() {
        this.e.a();
    }

    public static double o(short s) {
        return s * 3.051850947599719E-5d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(u uVar) {
        if (uVar.l() == null) {
            synchronized (this.n) {
                try {
                    if (!this.n.contains(uVar)) {
                        this.n.add(uVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void x(ax.Qa.c cVar) {
        List<ax.Qa.a> b = this.c.b(cVar);
        while (b != null) {
            while (!b.isEmpty()) {
                ax.Qa.a remove = b.remove(0);
                r.fine("processing " + remove + ", at time " + cVar.h());
                remove.run();
            }
            b = this.c.b(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        Iterator<Runnable> it = this.q.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    private void z(int i, int i2) {
        this.d = new d(64, 8, i);
        this.e = new d(64, 8, i2);
    }

    public void A(double d2) throws InterruptedException {
        double r2 = r();
        while (true) {
            double d3 = d2 - r2;
            if (d3 <= 0.0d) {
                return;
            }
            if (this.i) {
                long j = (long) (d3 * 1000.0d);
                if (j <= 0) {
                    j = 1;
                }
                Thread.sleep(j);
            } else {
                q();
            }
            r2 = r();
        }
    }

    public synchronized void B(int i, int i2, int i3, int i4, int i5) {
        b bVar;
        try {
            try {
                if (this.j) {
                    return;
                }
                this.k = i;
                double d2 = i;
                this.l = 1.0d / d2;
                z(i3, i5);
                this.f = 2.0d / d2;
                if (this.i) {
                    bVar = this;
                    bVar.b = bVar.new c(i2, i3, i4, i5);
                    r.fine("Synth thread old priority = " + bVar.b.getPriority());
                    int i6 = 10;
                    if (bVar.b.getPriority() + 2 <= 10) {
                        i6 = bVar.b.getPriority() + 2;
                    }
                    bVar.b.setPriority(i6);
                    r.fine("Synth thread new priority = " + bVar.b.getPriority());
                    bVar.b.start();
                } else {
                    bVar = this;
                }
                bVar.j = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void C(u uVar) {
        D(uVar, d());
    }

    public void D(u uVar, ax.Qa.c cVar) {
        if (uVar.l() == null) {
            c(cVar, new a(uVar));
        }
    }

    @Override // ax.A9.b
    public boolean a() {
        return this.i;
    }

    @Override // ax.A9.b
    public void b(double d2) throws InterruptedException {
        A(r() + d2);
    }

    @Override // ax.A9.b
    public void c(ax.Qa.c cVar, ax.Qa.a aVar) {
        if (Thread.currentThread() == this.b && cVar.h() <= r()) {
            aVar.run();
            return;
        }
        r.fine("scheduling " + aVar + ", at time " + cVar.h());
        this.c.a(cVar, aVar);
    }

    @Override // ax.A9.b
    public ax.Qa.c d() {
        return new ax.Qa.c(r());
    }

    @Override // ax.A9.b
    public void e(u uVar) {
        uVar.x(this);
        this.m.add(uVar);
    }

    @Override // ax.A9.b
    public void f(boolean z) {
        this.i = z;
    }

    public void m(u uVar) {
        synchronized (this.o) {
            this.o.add(uVar);
        }
    }

    public double p(double d2) {
        return Math.pow(3.0517578125E-5d, 1.0d / (d2 * u()));
    }

    public void q() {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            d dVar = this.d;
            if (dVar != null) {
                i = dVar.b(i);
            }
            x(d());
            n();
            E();
            d dVar2 = this.e;
            if (dVar2 != null) {
                i2 = dVar2.c(i2);
            }
            this.g += 8;
        }
    }

    public double r() {
        return this.g * this.l;
    }

    public long s() {
        return this.g;
    }

    @Override // ax.A9.b
    public void start() {
        B(44100, -1, 0, -1, 2);
    }

    @Override // ax.A9.b
    public synchronized void stop() {
        c cVar;
        if (!this.j) {
            r.info("JSyn already stopped.");
            return;
        }
        if (this.i && (cVar = this.b) != null) {
            try {
                cVar.a();
                this.b.join(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (this.n) {
            this.n.clear();
        }
        this.j = false;
    }

    public double t() {
        return this.l;
    }

    public String toString() {
        return "JSyn V17.2.0 (build 467, 2025-06-29)";
    }

    public int u() {
        return this.k;
    }

    public double v() {
        return this.f;
    }

    public b() {
        this(ax.C9.a.a());
    }
}
