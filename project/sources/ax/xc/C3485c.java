package ax.xc;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: ax.xc.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3485c extends D {
    public static final a Companion = new a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static C3485c head;
    private static final ReentrantLock lock;
    private boolean inQueue;
    private C3485c next;
    private long timeoutAt;

    /* renamed from: ax.xc.c$a */
    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(C3485c c3485c) {
            ReentrantLock f = C3485c.Companion.f();
            f.lock();
            try {
                if (!c3485c.inQueue) {
                    return false;
                }
                c3485c.inQueue = false;
                for (C3485c c3485c2 = C3485c.head; c3485c2 != null; c3485c2 = c3485c2.next) {
                    if (c3485c2.next == c3485c) {
                        c3485c2.next = c3485c.next;
                        c3485c.next = null;
                        return false;
                    }
                }
                f.unlock();
                return true;
            } finally {
                f.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(C3485c c3485c, long j, boolean z) {
            ReentrantLock f = C3485c.Companion.f();
            f.lock();
            try {
                if (c3485c.inQueue) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                c3485c.inQueue = true;
                if (C3485c.head == null) {
                    C3485c.head = new C3485c();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                if (j != 0 && z) {
                    c3485c.timeoutAt = Math.min(j, c3485c.deadlineNanoTime() - nanoTime) + nanoTime;
                } else if (j != 0) {
                    c3485c.timeoutAt = j + nanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    c3485c.timeoutAt = c3485c.deadlineNanoTime();
                }
                long remainingNanos = c3485c.remainingNanos(nanoTime);
                C3485c c3485c2 = C3485c.head;
                ax.Gb.l.c(c3485c2);
                while (c3485c2.next != null) {
                    C3485c c3485c3 = c3485c2.next;
                    ax.Gb.l.c(c3485c3);
                    if (remainingNanos < c3485c3.remainingNanos(nanoTime)) {
                        break;
                    }
                    c3485c2 = c3485c2.next;
                    ax.Gb.l.c(c3485c2);
                }
                c3485c.next = c3485c2.next;
                c3485c2.next = c3485c;
                if (c3485c2 == C3485c.head) {
                    C3485c.Companion.e().signal();
                }
                ax.sb.t tVar = ax.sb.t.a;
                f.unlock();
            } catch (Throwable th) {
                f.unlock();
                throw th;
            }
        }

        public final C3485c c() throws InterruptedException {
            C3485c c3485c = C3485c.head;
            ax.Gb.l.c(c3485c);
            C3485c c3485c2 = c3485c.next;
            if (c3485c2 == null) {
                long nanoTime = System.nanoTime();
                e().await(C3485c.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                C3485c c3485c3 = C3485c.head;
                ax.Gb.l.c(c3485c3);
                if (c3485c3.next != null || System.nanoTime() - nanoTime < C3485c.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return C3485c.head;
            }
            long remainingNanos = c3485c2.remainingNanos(System.nanoTime());
            if (remainingNanos > 0) {
                e().await(remainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            C3485c c3485c4 = C3485c.head;
            ax.Gb.l.c(c3485c4);
            c3485c4.next = c3485c2.next;
            c3485c2.next = null;
            return c3485c2;
        }

        public final Condition e() {
            return C3485c.condition;
        }

        public final ReentrantLock f() {
            return C3485c.lock;
        }

        private a() {
        }
    }

    /* renamed from: ax.xc.c$b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock f;
            C3485c c;
            while (true) {
                try {
                    a aVar = C3485c.Companion;
                    f = aVar.f();
                    f.lock();
                    try {
                        c = aVar.c();
                    } finally {
                        f.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (c == C3485c.head) {
                    C3485c.head = null;
                    return;
                }
                ax.sb.t tVar = ax.sb.t.a;
                f.unlock();
                if (c != null) {
                    c.timedOut();
                }
            }
        }
    }

    /* renamed from: ax.xc.c$c, reason: collision with other inner class name */
    public static final class C0499c implements InterfaceC3482A, AutoCloseable {
        final /* synthetic */ InterfaceC3482A c0;

        C0499c(InterfaceC3482A interfaceC3482A) {
            this.c0 = interfaceC3482A;
        }

        @Override // ax.xc.InterfaceC3482A
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3485c timeout() {
            return C3485c.this;
        }

        @Override // ax.xc.InterfaceC3482A, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
            C3485c c3485c = C3485c.this;
            InterfaceC3482A interfaceC3482A = this.c0;
            c3485c.enter();
            try {
                interfaceC3482A.close();
                ax.sb.t tVar = ax.sb.t.a;
                if (c3485c.exit()) {
                    throw c3485c.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!c3485c.exit()) {
                    throw e;
                }
                throw c3485c.access$newTimeoutException(e);
            } finally {
                c3485c.exit();
            }
        }

        @Override // ax.xc.InterfaceC3482A, java.io.Flushable
        public void flush() {
            C3485c c3485c = C3485c.this;
            InterfaceC3482A interfaceC3482A = this.c0;
            c3485c.enter();
            try {
                interfaceC3482A.flush();
                ax.sb.t tVar = ax.sb.t.a;
                if (c3485c.exit()) {
                    throw c3485c.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!c3485c.exit()) {
                    throw e;
                }
                throw c3485c.access$newTimeoutException(e);
            } finally {
                c3485c.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.c0 + ')';
        }

        @Override // ax.xc.InterfaceC3482A
        public void write(C3487e c3487e, long j) {
            ax.Gb.l.f(c3487e, "source");
            C3484b.b(c3487e.size(), 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                x xVar = c3487e.q;
                ax.Gb.l.c(xVar);
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += xVar.c - xVar.b;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        xVar = xVar.f;
                        ax.Gb.l.c(xVar);
                    }
                }
                C3485c c3485c = C3485c.this;
                InterfaceC3482A interfaceC3482A = this.c0;
                c3485c.enter();
                try {
                    try {
                        interfaceC3482A.write(c3487e, j2);
                        ax.sb.t tVar = ax.sb.t.a;
                        if (c3485c.exit()) {
                            throw c3485c.access$newTimeoutException(null);
                        }
                        j -= j2;
                    } catch (IOException e) {
                        if (!c3485c.exit()) {
                            throw e;
                        }
                        throw c3485c.access$newTimeoutException(e);
                    }
                } catch (Throwable th) {
                    c3485c.exit();
                    throw th;
                }
            }
        }
    }

    /* renamed from: ax.xc.c$d */
    public static final class d implements C, AutoCloseable {
        final /* synthetic */ C c0;

        d(C c) {
            this.c0 = c;
        }

        @Override // ax.xc.C
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3485c timeout() {
            return C3485c.this;
        }

        @Override // ax.xc.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C3485c c3485c = C3485c.this;
            C c = this.c0;
            c3485c.enter();
            try {
                c.close();
                ax.sb.t tVar = ax.sb.t.a;
                if (c3485c.exit()) {
                    throw c3485c.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!c3485c.exit()) {
                    throw e;
                }
                throw c3485c.access$newTimeoutException(e);
            } finally {
                c3485c.exit();
            }
        }

        @Override // ax.xc.C
        public long read(C3487e c3487e, long j) {
            ax.Gb.l.f(c3487e, "sink");
            C3485c c3485c = C3485c.this;
            C c = this.c0;
            c3485c.enter();
            try {
                long read = c.read(c3487e, j);
                if (c3485c.exit()) {
                    throw c3485c.access$newTimeoutException(null);
                }
                return read;
            } catch (IOException e) {
                if (c3485c.exit()) {
                    throw c3485c.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                c3485c.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.c0 + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        ax.Gb.l.e(newCondition, "newCondition(...)");
        condition = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            Companion.g(this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean exit() {
        return Companion.d(this);
    }

    protected IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final InterfaceC3482A sink(InterfaceC3482A interfaceC3482A) {
        ax.Gb.l.f(interfaceC3482A, "sink");
        return new C0499c(interfaceC3482A);
    }

    public final C source(C c) {
        ax.Gb.l.f(c, "source");
        return new d(c);
    }

    public final <T> T withTimeout(ax.Fb.a<? extends T> aVar) {
        ax.Gb.l.f(aVar, "block");
        enter();
        try {
            try {
                T invoke = aVar.invoke();
                ax.Gb.k.b(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                ax.Gb.k.a(1);
                return invoke;
            } catch (IOException e) {
                if (exit()) {
                    throw access$newTimeoutException(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            ax.Gb.k.b(1);
            exit();
            ax.Gb.k.a(1);
            throw th;
        }
    }

    protected void timedOut() {
    }
}
