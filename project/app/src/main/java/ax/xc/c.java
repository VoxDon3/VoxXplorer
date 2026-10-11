/*
 * Decompiled with CFR 0.152.
 */
package ax.xc;

import ax.Gb.g;
import ax.Gb.k;
import ax.Gb.l;
import ax.sb.t;
import ax.xc.A;
import ax.xc.C;
import ax.xc.D;
import ax.xc.e;
import ax.xc.x;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class c
extends D {
    public static final a Companion;
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static c head;
    private static final ReentrantLock lock;
    private boolean inQueue;
    private c next;
    private long timeoutAt;

    static {
        long l8;
        Companion = new a(null);
        Object object = new ReentrantLock();
        lock = object;
        object = ((ReentrantLock)object).newCondition();
        l.e(object, "newCondition(...)");
        condition = object;
        IDLE_TIMEOUT_MILLIS = l8 = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(l8);
    }

    private final long remainingNanos(long l8) {
        return this.timeoutAt - l8;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return this.newTimeoutException(iOException);
    }

    public final void enter() {
        long l8 = this.timeoutNanos();
        boolean bl = this.hasDeadline();
        if (l8 == 0L && !bl) {
            return;
        }
        c.Companion.g(this, l8, bl);
    }

    public final boolean exit() {
        return c.Companion.d(this);
    }

    protected IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final A sink(A a8) {
        l.f(a8, "sink");
        return new A(this, a8){
            final A c0;
            final c q;
            {
                this.q = c8;
                this.c0 = a8;
            }

            public c a() {
                return this.q;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void close() {
                Throwable throwable2222222;
                c c8 = this.q;
                Object object = this.c0;
                c8.enter();
                object.close();
                object = t.a;
                if (c8.exit()) throw c8.access$newTimeoutException(null);
                return;
                {
                    catch (Throwable throwable2222222) {
                    }
                    catch (IOException iOException) {}
                    {
                        IOException iOException;
                        if (!c8.exit()) {
                            throw iOException;
                        }
                        iOException = c8.access$newTimeoutException(iOException);
                        throw iOException;
                    }
                }
                c8.exit();
                throw throwable2222222;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void flush() {
                Throwable throwable2222222;
                c c8 = this.q;
                Object object = this.c0;
                c8.enter();
                object.flush();
                object = t.a;
                if (c8.exit()) throw c8.access$newTimeoutException(null);
                return;
                {
                    catch (Throwable throwable2222222) {
                    }
                    catch (IOException iOException) {}
                    {
                        IOException iOException;
                        if (!c8.exit()) {
                            throw iOException;
                        }
                        iOException = c8.access$newTimeoutException(iOException);
                        throw iOException;
                    }
                }
                c8.exit();
                throw throwable2222222;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("AsyncTimeout.sink(");
                stringBuilder.append(this.c0);
                stringBuilder.append(')');
                return stringBuilder.toString();
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void write(e e8, long l8) {
                Throwable throwable2222222;
                Object object;
                l.f(e8, "source");
                ax.xc.b.b(e8.size(), 0L, l8);
                while (true) {
                    long l9;
                    long l10 = 0L;
                    if (l8 <= 0L) return;
                    object = e8.q;
                    l.c(object);
                    while (true) {
                        l9 = l10;
                        if (l10 >= 65536L) break;
                        if ((l10 += (long)(((x)object).c - ((x)object).b)) >= l8) {
                            l9 = l8;
                            break;
                        }
                        object = ((x)object).f;
                        l.c(object);
                    }
                    object = this.q;
                    Object object2 = this.c0;
                    ((c)object).enter();
                    object2.write(e8, l9);
                    object2 = t.a;
                    if (((c)object).exit()) throw ((c)object).access$newTimeoutException(null);
                    l8 -= l9;
                    continue;
                    {
                        catch (Throwable throwable2222222) {
                            break;
                        }
                        catch (IOException iOException) {}
                        {
                            IOException iOException;
                            if (!((c)object).exit()) {
                                throw iOException;
                            }
                            iOException = ((c)object).access$newTimeoutException(iOException);
                            throw iOException;
                        }
                    }
                }
                ((c)object).exit();
                throw throwable2222222;
            }
        };
    }

    public final C source(C c8) {
        l.f(c8, "source");
        return new C(this, c8){
            final C c0;
            final c q;
            {
                this.q = c8;
                this.c0 = c9;
            }

            public c a() {
                return this.q;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void close() {
                Throwable throwable2222222;
                c c8 = this.q;
                Object object = this.c0;
                c8.enter();
                object.close();
                object = t.a;
                if (c8.exit()) throw c8.access$newTimeoutException(null);
                return;
                {
                    catch (Throwable throwable2222222) {
                    }
                    catch (IOException iOException) {}
                    {
                        IOException iOException;
                        if (!c8.exit()) {
                            throw iOException;
                        }
                        iOException = c8.access$newTimeoutException(iOException);
                        throw iOException;
                    }
                }
                c8.exit();
                throw throwable2222222;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public long read(e e8, long l8) {
                Throwable throwable2222222;
                l.f(e8, "sink");
                c c8 = this.q;
                C c9 = this.c0;
                c8.enter();
                l8 = c9.read(e8, l8);
                if (c8.exit()) throw c8.access$newTimeoutException(null);
                return l8;
                {
                    catch (Throwable throwable2222222) {
                    }
                    catch (IOException iOException) {}
                    {
                        IOException iOException;
                        if (!c8.exit()) {
                            throw iOException;
                        }
                        iOException = c8.access$newTimeoutException(iOException);
                        throw iOException;
                    }
                }
                c8.exit();
                throw throwable2222222;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("AsyncTimeout.source(");
                stringBuilder.append(this.c0);
                stringBuilder.append(')');
                return stringBuilder.toString();
            }
        };
    }

    protected void timedOut() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final <T> T withTimeout(ax.Fb.a<? extends T> a8) {
        Throwable throwable2222222;
        block5: {
            l.f(a8, "block");
            this.enter();
            a8 = a8.invoke();
            {
                catch (Throwable throwable2222222) {
                    break block5;
                }
                catch (IOException iOException) {}
                {
                    IOException iOException;
                    if (!this.exit()) {
                        throw iOException;
                    }
                    iOException = this.access$newTimeoutException(iOException);
                    throw iOException;
                }
            }
            k.b(1);
            if (this.exit()) throw this.access$newTimeoutException(null);
            k.a(1);
            return (T)a8;
        }
        k.b(1);
        this.exit();
        k.a(1);
        throw throwable2222222;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private final boolean d(c c8) {
            Throwable throwable2;
            ReentrantLock reentrantLock;
            block7: {
                reentrantLock = Companion.f();
                reentrantLock.lock();
                try {
                    boolean bl = c8.inQueue;
                    if (!bl) {
                        reentrantLock.unlock();
                        return false;
                    }
                    c8.inQueue = false;
                    c c9 = head;
                    while (c9 != null) {
                        if (c9.next == c8) {
                            c9.next = c8.next;
                            c8.next = null;
                            reentrantLock.unlock();
                            return false;
                        }
                        c9 = c9.next;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                reentrantLock.unlock();
                return true;
            }
            reentrantLock.unlock();
            throw throwable2;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private final void g(c object, long l8, boolean bl) {
            Throwable throwable2;
            ReentrantLock reentrantLock;
            block10: {
                block8: {
                    block14: {
                        long l9;
                        Object object2;
                        block12: {
                            block13: {
                                long l10;
                                block11: {
                                    block9: {
                                        reentrantLock = Companion.f();
                                        reentrantLock.lock();
                                        try {
                                            if (((c)object).inQueue) break block8;
                                            ((c)object).inQueue = true;
                                            if (head != null) break block9;
                                            object2 = new c();
                                            head = (c)object2;
                                            object2 = new b();
                                            ((Thread)object2).start();
                                        }
                                        catch (Throwable throwable2) {
                                            break block10;
                                        }
                                    }
                                    l9 = System.nanoTime();
                                    long l11 = l8 - 0L;
                                    l10 = l11 == 0L ? 0 : (l11 < 0L ? -1 : 1);
                                    if (l10 == false || !bl) break block11;
                                    ((c)object).timeoutAt = Math.min(l8, ((D)object).deadlineNanoTime() - l9) + l9;
                                    break block12;
                                }
                                if (l10 == false) break block13;
                                ((c)object).timeoutAt = l8 + l9;
                                break block12;
                            }
                            if (!bl) break block14;
                            ((c)object).timeoutAt = ((D)object).deadlineNanoTime();
                        }
                        l8 = ((c)object).remainingNanos(l9);
                        object2 = head;
                        l.c(object2);
                        while (((c)object2).next != null) {
                            c c8 = ((c)object2).next;
                            l.c(c8);
                            if (l8 < c8.remainingNanos(l9)) break;
                            object2 = ((c)object2).next;
                            l.c(object2);
                        }
                        ((c)object).next = ((c)object2).next;
                        ((c)object2).next = (c)object;
                        if (object2 == head) {
                            Companion.e().signal();
                        }
                        object = t.a;
                        reentrantLock.unlock();
                        return;
                    }
                    object = new AssertionError();
                    throw object;
                }
                object = new IllegalStateException("Unbalanced enter/exit");
                throw object;
            }
            reentrantLock.unlock();
            throw throwable2;
        }

        public final c c() throws InterruptedException {
            c c8 = head;
            l.c(c8);
            c c9 = c8.next;
            if (c9 == null) {
                long l8 = System.nanoTime();
                this.e().await(IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                c8 = head;
                l.c(c8);
                if (c8.next == null && System.nanoTime() - l8 >= IDLE_TIMEOUT_NANOS) {
                    return head;
                }
                return null;
            }
            long l9 = c9.remainingNanos(System.nanoTime());
            if (l9 > 0L) {
                this.e().await(l9, TimeUnit.NANOSECONDS);
                return null;
            }
            c8 = head;
            l.c(c8);
            c8.next = c9.next;
            c9.next = null;
            return c9;
        }

        public final Condition e() {
            return condition;
        }

        public final ReentrantLock f() {
            return lock;
        }
    }

    private static final class b
    extends Thread {
        public b() {
            super("Okio Watchdog");
            this.setDaemon(true);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void run() {
            while (true) {
                var2_3 = c.Companion;
                var1_1 = var2_3.f();
                var1_1.lock();
                var3_5 = var2_3.c();
                if (var3_5 != c.access$getHead$cp()) ** GOTO lbl15
                c.access$setHead$cp(null);
                {
                    catch (Throwable var2_4) {}
                }
                try {
                    var1_1.unlock();
                    return;
lbl15:
                    // 2 sources

                    var2_3 = t.a;
                    var1_1.unlock();
                    if (var3_5 == null) continue;
                    var3_5.timedOut();
                    continue;
                    var1_1.unlock();
                    throw var2_4;
                }
                catch (InterruptedException var1_2) {
                    continue;
                }
                break;
            }
        }
    }
}

