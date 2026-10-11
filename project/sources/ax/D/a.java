package ax.D;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class a<V> implements ax.v7.e<V> {
    static final boolean e0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger f0 = Logger.getLogger(a.class.getName());
    static final b g0;
    private static final Object h0;
    volatile e c0;
    volatile i d0;
    volatile Object q;

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> aVar, e eVar, e eVar2);

        abstract boolean b(a<?> aVar, Object obj, Object obj2);

        abstract boolean c(a<?> aVar, i iVar, i iVar2);

        abstract void d(i iVar, i iVar2);

        abstract void e(i iVar, Thread thread);
    }

    private static final class c {
        static final c c;
        static final c d;
        final boolean a;
        final Throwable b;

        static {
            if (a.e0) {
                d = null;
                c = null;
            } else {
                d = new c(false, null);
                c = new c(true, null);
            }
        }

        c(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    private static final class d {
        static final d b = new d(new C0065a("Failure occurred while trying to finish a future."));
        final Throwable a;

        /* renamed from: ax.D.a$d$a, reason: collision with other inner class name */
        class C0065a extends Throwable {
            C0065a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.a = (Throwable) a.n(th);
        }
    }

    private static final class e {
        static final e d = new e(null, null);
        final Runnable a;
        final Executor b;
        e c;

        e(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    private static final class f extends b {
        final AtomicReferenceFieldUpdater<i, Thread> a;
        final AtomicReferenceFieldUpdater<i, i> b;
        final AtomicReferenceFieldUpdater<a, i> c;
        final AtomicReferenceFieldUpdater<a, e> d;
        final AtomicReferenceFieldUpdater<a, Object> e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // ax.D.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            return ax.D.b.a(this.d, aVar, eVar, eVar2);
        }

        @Override // ax.D.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            return ax.D.b.a(this.e, aVar, obj, obj2);
        }

        @Override // ax.D.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            return ax.D.b.a(this.c, aVar, iVar, iVar2);
        }

        @Override // ax.D.a.b
        void d(i iVar, i iVar2) {
            this.b.lazySet(iVar, iVar2);
        }

        @Override // ax.D.a.b
        void e(i iVar, Thread thread) {
            this.a.lazySet(iVar, thread);
        }
    }

    private static final class g<V> implements Runnable {
        final ax.v7.e<? extends V> c0;
        final a<V> q;

        @Override // java.lang.Runnable
        public void run() {
            if (this.q.q != this) {
                return;
            }
            if (a.g0.b(this.q, this, a.t(this.c0))) {
                a.q(this.q);
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        @Override // ax.D.a.b
        boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.c0 != eVar) {
                        return false;
                    }
                    aVar.c0 = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ax.D.a.b
        boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.q != obj) {
                        return false;
                    }
                    aVar.q = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ax.D.a.b
        boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.d0 != iVar) {
                        return false;
                    }
                    aVar.d0 = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // ax.D.a.b
        void d(i iVar, i iVar2) {
            iVar.b = iVar2;
        }

        @Override // ax.D.a.b
        void e(i iVar, Thread thread) {
            iVar.a = thread;
        }
    }

    private static final class i {
        static final i c = new i(false);
        volatile Thread a;
        volatile i b;

        i(boolean z) {
        }

        void a(i iVar) {
            a.g0.d(this, iVar);
        }

        void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark(thread);
            }
        }

        i() {
            a.g0.e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "d0"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "c0"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "q"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        g0 = hVar;
        if (th != null) {
            f0.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        h0 = new Object();
    }

    protected a() {
    }

    private void A() {
        i iVar;
        do {
            iVar = this.d0;
        } while (!g0.c(this, iVar, i.c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.b;
        }
    }

    private void B(i iVar) {
        iVar.a = null;
        while (true) {
            i iVar2 = this.d0;
            if (iVar2 == i.c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.b;
                if (iVar2.a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.b = iVar4;
                    if (iVar3.a == null) {
                        break;
                    }
                } else if (!g0.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    private String E(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private void d(StringBuilder sb) {
        try {
            Object u = u(this);
            sb.append("SUCCESS, result=[");
            sb.append(E(u));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    private static CancellationException l(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T n(T t) {
        t.getClass();
        return t;
    }

    private e p(e eVar) {
        e eVar2;
        do {
            eVar2 = this.c0;
        } while (!g0.a(this, eVar2, e.d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.c;
            eVar4.c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    static void q(a<?> aVar) {
        e eVar = null;
        while (true) {
            aVar.A();
            aVar.j();
            e p = aVar.p(eVar);
            while (p != null) {
                eVar = p.c;
                Runnable runnable = p.a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    aVar = gVar.q;
                    if (aVar.q == gVar) {
                        if (g0.b(aVar, gVar, t(gVar.c0))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    r(runnable, p.b);
                }
                p = eVar;
            }
            return;
        }
    }

    private static void r(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f0.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private V s(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw l("Task was cancelled.", ((c) obj).b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).a);
        }
        if (obj == h0) {
            return null;
        }
        return obj;
    }

    static Object t(ax.v7.e<?> eVar) {
        if (eVar instanceof a) {
            Object obj = ((a) eVar).q;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.a ? cVar.b != null ? new c(false, cVar.b) : c.d : obj;
        }
        boolean isCancelled = eVar.isCancelled();
        if ((!e0) && isCancelled) {
            return c.d;
        }
        try {
            Object u = u(eVar);
            return u == null ? h0 : u;
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new c(false, e2);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + eVar, e2));
        } catch (ExecutionException e3) {
            return new d(e3.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    static <V> V u(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    protected boolean C(V v) {
        if (v == null) {
            v = (V) h0;
        }
        if (!g0.b(this, null, v)) {
            return false;
        }
        q(this);
        return true;
    }

    protected boolean D(Throwable th) {
        if (!g0.b(this, null, new d((Throwable) n(th)))) {
            return false;
        }
        q(this);
        return true;
    }

    protected final boolean F() {
        Object obj = this.q;
        return (obj instanceof c) && ((c) obj).a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
    
        return true;
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.q
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            boolean r4 = r0 instanceof ax.D.a.g
            r3 = r3 | r4
            if (r3 == 0) goto L60
            boolean r3 = ax.D.a.e0
            if (r3 == 0) goto L1f
            ax.D.a$c r3 = new ax.D.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L26
        L1f:
            if (r8 == 0) goto L24
            ax.D.a$c r3 = ax.D.a.c.c
            goto L26
        L24:
            ax.D.a$c r3 = ax.D.a.c.d
        L26:
            r5 = 0
            r4 = r7
        L28:
            ax.D.a$b r6 = ax.D.a.g0
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L59
            if (r8 == 0) goto L35
            r4.w()
        L35:
            q(r4)
            boolean r4 = r0 instanceof ax.D.a.g
            if (r4 == 0) goto L58
            ax.D.a$g r0 = (ax.D.a.g) r0
            ax.v7.e<? extends V> r0 = r0.c0
            boolean r4 = r0 instanceof ax.D.a
            if (r4 == 0) goto L55
            r4 = r0
            ax.D.a r4 = (ax.D.a) r4
            java.lang.Object r0 = r4.q
            if (r0 != 0) goto L4d
            r5 = 1
            goto L4e
        L4d:
            r5 = 0
        L4e:
            boolean r6 = r0 instanceof ax.D.a.g
            r5 = r5 | r6
            if (r5 == 0) goto L58
            r5 = 1
            goto L28
        L55:
            r0.cancel(r8)
        L58:
            return r1
        L59:
            java.lang.Object r0 = r4.q
            boolean r6 = r0 instanceof ax.D.a.g
            if (r6 != 0) goto L28
            return r5
        L60:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.D.a.cancel(boolean):boolean");
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.q;
        if ((obj != null) && (!(obj instanceof g))) {
            return s(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.d0;
            if (iVar != i.c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (g0.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                B(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.q;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return s(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        B(iVar2);
                    } else {
                        iVar = this.d0;
                    }
                } while (iVar != i.c);
            }
            return s(this.q);
        }
        while (nanos > 0) {
            Object obj3 = this.q;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return s(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String aVar = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j2 = -nanos;
            long convert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(convert);
            boolean z = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + aVar);
    }

    @Override // ax.v7.e
    public final void h(Runnable runnable, Executor executor) {
        n(runnable);
        n(executor);
        e eVar = this.c0;
        if (eVar != e.d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.c = eVar;
                if (g0.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.c0;
                }
            } while (eVar != e.d);
        }
        r(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.q instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.q != null);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            d(sb);
        } else {
            try {
                str = x();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                d(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String x() {
        Object obj = this.q;
        if (obj instanceof g) {
            return "setFuture=[" + E(((g) obj).c0) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    protected void j() {
    }

    protected void w() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.q;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return s(obj2);
            }
            i iVar = this.d0;
            if (iVar != i.c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (g0.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.q;
                            } else {
                                B(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return s(obj);
                    }
                    iVar = this.d0;
                } while (iVar != i.c);
            }
            return s(this.q);
        }
        throw new InterruptedException();
    }
}
