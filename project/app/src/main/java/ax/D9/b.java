/*
 * Decompiled with CFR 0.152.
 */
package ax.D9;

import ax.D9.a;
import ax.I9.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Logger;

public class b
implements ax.A9.b {
    static Logger r = Logger.getLogger(b.class.getName());
    private final ax.C9.c a;
    private c b;
    private final ax.Qa.b<ax.Qa.a> c = new ax.Qa.b();
    private d d;
    private d e;
    private double f;
    private long g;
    private boolean h = true;
    private boolean i = true;
    private boolean j;
    private int k = 44100;
    private double l = 1.0 / (double)44100;
    private final ArrayList<u> m = new ArrayList();
    private final ArrayList<u> n = new ArrayList();
    private final ArrayList<u> o = new ArrayList();
    private a p;
    private final CopyOnWriteArrayList<Runnable> q = new CopyOnWriteArrayList();

    public b() {
        this(ax.C9.a.a());
    }

    public b(ax.C9.c c8) {
        this.a = c8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void E() {
        ArrayList<u> arrayList = this.n;
        synchronized (arrayList) {
            int n8;
            Object object;
            Object object2;
            try {
                object2 = this.n.listIterator();
                while (true) {
                    boolean bl = object2.hasNext();
                    if (!bl) break;
                    object = object2.next();
                    if (this.h) {
                        ((u)object).u(this.s(), 0, 8);
                        continue;
                    }
                    ((u)object).k(0, 8);
                }
                object = this.o;
                n8 = ((ArrayList)object).size();
            }
            catch (Throwable throwable) {}
            throw throwable;
            for (int i8 = 0; i8 < n8; ++i8) {
                object2 = ((ArrayList)object).get(i8);
                object2 = (u)object2;
                this.n.remove(object2);
                ((u)object2).j();
            }
        }
        this.o.clear();
    }

    static /* synthetic */ a k(b b8, a a8) {
        b8.p = a8;
        return a8;
    }

    private void n() {
        this.e.a();
    }

    public static double o(short s8) {
        return (double)s8 * 3.051850947599719E-5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void w(u u8) {
        if (u8.l() != null) {
            return;
        }
        ArrayList<u> arrayList = this.n;
        synchronized (arrayList) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (this.n.contains(u8)) break block4;
                        this.n.add(u8);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    private void x(ax.Qa.c c8) {
        List<ax.Qa.a> list = this.c.b(c8);
        while (list != null) {
            while (!list.isEmpty()) {
                ax.Qa.a a8 = list.remove(0);
                Logger logger = r;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("processing ");
                stringBuilder.append(a8);
                stringBuilder.append(", at time ");
                stringBuilder.append(c8.h());
                logger.fine(stringBuilder.toString());
                a8.run();
            }
            list = this.c.b(c8);
        }
    }

    private void y() {
        Iterator<Runnable> iterator = this.q.iterator();
        while (iterator.hasNext()) {
            iterator.next().run();
        }
    }

    private void z(int n8, int n9) {
        this.d = new d(this, 64, 8, n8);
        this.e = new d(this, 64, 8, n9);
    }

    public void A(double d8) throws InterruptedException {
        double d9 = this.r();
        while ((d9 = d8 - d9) > 0.0) {
            if (this.i) {
                long l8;
                long l9 = l8 = (long)(d9 * 1000.0);
                if (l8 <= 0L) {
                    l9 = 1L;
                }
                Thread.sleep(l9);
            } else {
                this.q();
            }
            d9 = this.r();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void B(int n8, int n9, int n10, int n11, int n12) {
        synchronized (this) {
            RuntimeException var9_10;
            block10: {
                block9: {
                    block8: {
                        try {
                            boolean bl = this.j;
                            if (!bl) break block8;
                        }
                        catch (Throwable throwable) {}
                        return;
                    }
                    this.k = n8;
                    double d8 = n8;
                    this.l = 1.0 / d8;
                    this.z(n10, n12);
                    this.f = 2.0 / d8;
                    if (!this.i) break block9;
                    try {
                        Object object = new c(this, n9, n10, n11, n12);
                        this.b = object;
                        Logger logger = r;
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Synth thread old priority = ");
                        ((StringBuilder)object).append(this.b.getPriority());
                        logger.fine(((StringBuilder)object).toString());
                        n9 = this.b.getPriority();
                        n8 = 10;
                        if (n9 + 2 <= 10) {
                            n8 = this.b.getPriority() + 2;
                        }
                        this.b.setPriority(n8);
                        logger = r;
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Synth thread new priority = ");
                        ((StringBuilder)object).append(this.b.getPriority());
                        logger.fine(((StringBuilder)object).toString());
                        this.b.start();
                    }
                    catch (Throwable throwable) {
                        break block10;
                    }
                    break block10;
                }
                this.j = true;
                return;
            }
            throw var9_10;
        }
    }

    public void C(u u8) {
        this.D(u8, this.d());
    }

    public void D(u u8, ax.Qa.c c8) {
        if (u8.l() == null) {
            this.c(c8, new ax.Qa.a(this, u8){
                final b c0;
                final u q;
                {
                    this.c0 = b8;
                    this.q = u8;
                }

                @Override
                public void run() {
                    this.c0.w(this.q);
                }
            });
        }
    }

    @Override
    public boolean a() {
        return this.i;
    }

    @Override
    public void b(double d8) throws InterruptedException {
        this.A(this.r() + d8);
    }

    @Override
    public void c(ax.Qa.c c8, ax.Qa.a a8) {
        if (Thread.currentThread() == this.b && c8.h() <= this.r()) {
            a8.run();
            return;
        }
        Logger logger = r;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("scheduling ");
        stringBuilder.append(a8);
        stringBuilder.append(", at time ");
        stringBuilder.append(c8.h());
        logger.fine(stringBuilder.toString());
        this.c.a(c8, a8);
    }

    @Override
    public ax.Qa.c d() {
        return new ax.Qa.c(this.r());
    }

    @Override
    public void e(u u8) {
        u8.x(this);
        this.m.add(u8);
    }

    @Override
    public void f(boolean bl) {
        this.i = bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void m(u u8) {
        ArrayList<u> arrayList = this.o;
        synchronized (arrayList) {
            this.o.add(u8);
            return;
        }
    }

    public double p(double d8) {
        return Math.pow(3.0517578125E-5, 1.0 / (d8 * (double)this.u()));
    }

    public void q() {
        int n8 = 0;
        int n9 = 0;
        for (int i8 = 0; i8 < 8; ++i8) {
            d d8 = this.d;
            int n10 = n8;
            if (d8 != null) {
                n10 = d8.b(n8);
            }
            this.x(this.d());
            this.n();
            this.E();
            d8 = this.e;
            int n11 = n9;
            if (d8 != null) {
                n11 = d8.c(n9);
            }
            this.g += 8L;
            n8 = n10;
            n9 = n11;
        }
    }

    public double r() {
        return (double)this.g * this.l;
    }

    public long s() {
        return this.g;
    }

    @Override
    public void start() {
        this.B(44100, -1, 0, -1, 2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void stop() {
        synchronized (this) {
            Throwable throwable2;
            block12: {
                c c8;
                try {
                    if (!this.j) {
                        r.info("JSyn already stopped.");
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block12;
                }
                if (this.i && (c8 = this.b) != null) {
                    try {
                        c8.a();
                        this.b.join(2000L);
                    }
                    catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                }
                ArrayList<u> arrayList = this.n;
                synchronized (arrayList) {
                    this.n.clear();
                }
                {
                    this.j = false;
                    return;
                }
            }
            throw throwable2;
        }
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

    static class b {
        private final double[] a;

        b(int n8) {
            this.a = new double[n8];
        }

        void b() {
            double[] dArray;
            for (int i8 = 0; i8 < (dArray = this.a).length; ++i8) {
                dArray[i8] = 0.0;
            }
        }
    }

    private class c
    extends Thread {
        final b c0;
        private volatile boolean q;

        c(b b8, int n8, int n9, int n10, int n11) {
            this.c0 = b8;
            this.q = true;
            if (n9 > 0) {
                b8.a.a(n8, b8.k, n9);
            }
            if (n11 > 0) {
                b8.a.b(n10, b8.k, n11);
            }
        }

        public void a() {
            this.q = false;
            this.interrupt();
        }

        @Override
        public void run() {
            block6: {
                r.fine("JSyn synthesis thread starting.");
                try {
                    b b8 = this.c0;
                    a a8 = new a();
                    ax.D9.b.k(b8, a8);
                    while (this.q) {
                        this.c0.p.a();
                        this.c0.y();
                        this.c0.q();
                        this.c0.p.b();
                        if (!this.c0.a()) continue;
                        Thread.sleep(2L);
                    }
                    break block6;
                }
                catch (Throwable throwable) {}
                throwable.printStackTrace();
                this.q = false;
            }
            r.fine("JSyn synthesis thread exiting.");
            return;
            finally {
                r.info("JSyn synthesis thread in finally code.");
            }
        }
    }

    class d {
        private final double[] a;
        b[] b;
        final b c;

        d(b bArray, int n8, int n9, int n10) {
            this.c = bArray;
            this.a = new double[n8 * n10];
            this.b = new b[n10];
            for (n8 = 0; n8 < (bArray = this.b).length; ++n8) {
                bArray[n8] = new b(n9);
            }
        }

        public void a() {
            b[] bArray;
            for (int i8 = 0; i8 < (bArray = this.b).length; ++i8) {
                bArray[i8].b();
            }
        }

        int b(int n8) {
            int n9 = 0;
            int n10 = n8;
            for (n8 = n9; n8 < 8; ++n8) {
                b[] bArray;
                n9 = 0;
                while (n9 < (bArray = this.b).length) {
                    ((b)bArray[n9]).a[n8] = this.a[n10];
                    ++n9;
                    ++n10;
                }
            }
            return n10;
        }

        int c(int n8) {
            int n9 = 0;
            int n10 = n8;
            for (n8 = n9; n8 < 8; ++n8) {
                Object object;
                n9 = 0;
                while (n9 < ((b[])(object = this.b)).length) {
                    object = object[n9];
                    this.a[n10] = ((b)object).a[n8];
                    ++n9;
                    ++n10;
                }
            }
            return n10;
        }
    }
}

