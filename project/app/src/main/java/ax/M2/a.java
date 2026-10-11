/*
 * Decompiled with CFR 0.152.
 */
package ax.M2;

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

public abstract class a<V>
implements ax.v7.e<V> {
    static final boolean e0;
    private static final Logger f0;
    static final b g0;
    private static final Object h0;
    volatile e c0;
    volatile i d0;
    volatile Object q;

    static {
        Object var0_1;
        b b8;
        e0 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        f0 = Logger.getLogger(a.class.getName());
        try {
            b8 = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "d0"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "c0"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "q"));
            var0_1 = null;
        }
        catch (Throwable throwable) {
            b8 = new h();
        }
        g0 = b8;
        if (var0_1 != null) {
            f0.log(Level.SEVERE, "SafeAtomicHelper is broken!", (Throwable)var0_1);
        }
        h0 = new Object();
    }

    protected a() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(StringBuilder stringBuilder) {
        ExecutionException executionException2;
        block4: {
            try {
                V v8 = a.k(this);
                stringBuilder.append("SUCCESS, result=[");
                stringBuilder.append(this.s(v8));
                stringBuilder.append("]");
                return;
            }
            catch (RuntimeException runtimeException) {
            }
            catch (ExecutionException executionException2) {
                break block4;
            }
            catch (CancellationException cancellationException) {
                stringBuilder.append("CANCELLED");
                return;
            }
            stringBuilder.append("UNKNOWN, cause=[");
            stringBuilder.append(runtimeException.getClass());
            stringBuilder.append(" thrown from get()]");
            return;
        }
        stringBuilder.append("FAILURE, cause=[");
        stringBuilder.append(executionException2.getCause());
        stringBuilder.append("]");
    }

    private static CancellationException c(String object, Throwable throwable) {
        object = new CancellationException((String)object);
        ((Throwable)object).initCause(throwable);
        return object;
    }

    static <T> T d(T t8) {
        t8.getClass();
        return t8;
    }

    private e e(e e8) {
        e e9;
        while (!g0.a(this, e9 = this.c0, e.d)) {
        }
        e e10 = e8;
        e8 = e9;
        while (e8 != null) {
            e9 = e8.c;
            e8.c = e10;
            e10 = e8;
            e8 = e9;
        }
        return e10;
    }

    static void f(a<?> object) {
        Object object2 = null;
        Object object3 = object;
        object = object2;
        block0: while (true) {
            super.n();
            ((a)object3).b();
            object3 = super.e((e)object);
            while (object3 != null) {
                object = ((e)object3).c;
                object2 = ((e)object3).a;
                if (object2 instanceof g) {
                    g g8 = (g)object2;
                    object3 = g8.q;
                    if (((a)object3).q == g8 && g0.b((a<?>)object3, g8, object2 = a.j(g8.c0))) {
                        continue block0;
                    }
                } else {
                    a.g((Runnable)object2, ((e)object3).b);
                }
                object3 = object;
            }
            break;
        }
    }

    private static void g(Runnable runnable2, Executor executor) {
        try {
            executor.execute(runnable2);
            return;
        }
        catch (RuntimeException runtimeException) {
            Logger logger = f0;
            Level level = Level.SEVERE;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RuntimeException while executing runnable ");
            stringBuilder.append(runnable2);
            stringBuilder.append(" with executor ");
            stringBuilder.append(executor);
            logger.log(level, stringBuilder.toString(), runtimeException);
            return;
        }
    }

    private V i(Object object) throws ExecutionException {
        if (!(object instanceof c)) {
            if (!(object instanceof d)) {
                Object object2 = object;
                if (object == h0) {
                    object2 = null;
                }
                return (V)object2;
            }
            throw new ExecutionException(((d)object).a);
        }
        throw a.c("Task was cancelled.", ((c)object).b);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static Object j(ax.v7.e<?> object) {
        if (object instanceof a) {
            Object object3;
            object = object3 = ((a)object).q;
            if (!(object3 instanceof c)) return object;
            c cancellationException22 = (c)object3;
            object = object3;
            if (!cancellationException22.a) return object;
            if (cancellationException22.b == null) return c.d;
            return new c(false, cancellationException22.b);
        }
        boolean bl = object.isCancelled();
        if ((e0 ^ true) & bl) {
            return c.d;
        }
        try {
            Object object2 = a.k(object);
            if (object2 != null) return object2;
            return h0;
        }
        catch (CancellationException cancellationException) {
        }
        catch (Throwable throwable) {
            return new d(throwable);
        }
        catch (ExecutionException executionException) {
            return new d(executionException.getCause());
        }
        if (bl) return new c(false, cancellationException);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
        stringBuilder.append(object);
        return new d(new IllegalArgumentException(stringBuilder.toString(), cancellationException));
    }

    private static <V> V k(Future<V> future) throws ExecutionException {
        boolean bl = false;
        while (true) {
            V v8;
            block5: {
                try {
                    v8 = future.get();
                    if (!bl) break block5;
                    Thread.currentThread().interrupt();
                }
                catch (Throwable throwable) {
                    if (bl) {
                        Thread.currentThread().interrupt();
                    }
                    throw throwable;
                }
                catch (InterruptedException interruptedException) {
                    bl = true;
                    continue;
                }
            }
            return v8;
            break;
        }
    }

    private void n() {
        i i8;
        while (!g0.c(this, i8 = this.d0, i.c)) {
        }
        while (i8 != null) {
            i8.b();
            i8 = i8.b;
        }
    }

    private void o(i i8) {
        i8.a = null;
        block0: while ((i8 = this.d0) != i.c) {
            i i9 = null;
            while (i8 != null) {
                i i10;
                i i11 = i8.b;
                if (i8.a != null) {
                    i10 = i8;
                } else if (i9 != null) {
                    i9.b = i11;
                    i10 = i9;
                    if (i9.a == null) {
                        continue block0;
                    }
                } else {
                    i10 = i9;
                    if (!g0.c(this, i8, i11)) continue block0;
                }
                i8 = i11;
                i9 = i10;
            }
            break block0;
        }
    }

    private String s(Object object) {
        if (object == this) {
            return "this future";
        }
        return String.valueOf(object);
    }

    protected void b() {
    }

    @Override
    public final boolean cancel(boolean bl) {
        Object object = this.q;
        boolean bl2 = object == null;
        if (bl2 | object instanceof g) {
            c c8 = e0 ? new c(bl, new CancellationException("Future.cancel() was called.")) : (bl ? c.c : c.d);
            boolean bl3 = false;
            a a8 = this;
            while (true) {
                Object object2;
                if (g0.b(a8, object, c8)) {
                    if (bl) {
                        a8.l();
                    }
                    a.f(a8);
                    if (object instanceof g) {
                        object = ((g)object).c0;
                        if (object instanceof a) {
                            a8 = (a)object;
                            object = a8.q;
                            bl2 = object == null;
                            if (bl2 | object instanceof g) {
                                bl3 = true;
                                continue;
                            }
                        } else {
                            object.cancel(bl);
                        }
                    }
                    return true;
                }
                object = object2 = a8.q;
                if (!(object2 instanceof g)) break;
            }
            return bl3;
        }
        return false;
    }

    @Override
    public final V get() throws InterruptedException, ExecutionException {
        if (!Thread.interrupted()) {
            Object object = this.q;
            boolean bl = object != null;
            if (bl & (object instanceof g ^ true)) {
                return this.i(object);
            }
            object = this.d0;
            if (object != i.c) {
                i i8;
                i i9 = new i();
                do {
                    i9.a((i)object);
                    if (g0.c(this, (i)object, i9)) {
                        block6: {
                            do {
                                LockSupport.park(this);
                                if (Thread.interrupted()) break block6;
                            } while (!((bl = (object = this.q) != null) & (object instanceof g ^ true)));
                            return this.i(object);
                        }
                        this.o(i9);
                        throw new InterruptedException();
                    }
                    i8 = this.d0;
                    object = i8;
                } while (i8 != i.c);
            }
            return this.i(this.q);
        }
        throw new InterruptedException();
    }

    @Override
    public final V get(long l8, TimeUnit object) throws InterruptedException, TimeoutException, ExecutionException {
        long l9 = ((TimeUnit)((Object)object)).toNanos(l8);
        if (!Thread.interrupted()) {
            Object object2;
            Object object3;
            long l10;
            long l11;
            boolean bl;
            Object object4;
            block17: {
                object4 = this.q;
                bl = object4 != null;
                if (bl & (object4 instanceof g ^ true)) {
                    return this.i(object4);
                }
                l11 = l9 > 0L ? System.nanoTime() + l9 : 0L;
                l10 = l9;
                if (l9 >= 1000L) {
                    object4 = this.d0;
                    if (object4 != i.c) {
                        object3 = new i();
                        do {
                            ((i)object3).a((i)object4);
                            if (g0.c(this, (i)object4, (i)object3)) {
                                block16: {
                                    do {
                                        LockSupport.parkNanos(this, l9);
                                        if (Thread.interrupted()) break block16;
                                        object4 = this.q;
                                        bl = object4 != null;
                                        if (bl & (object4 instanceof g ^ true)) {
                                            return this.i(object4);
                                        }
                                        l9 = l10 = l11 - System.nanoTime();
                                    } while (l10 >= 1000L);
                                    this.o((i)object3);
                                    break block17;
                                }
                                this.o((i)object3);
                                throw new InterruptedException();
                            }
                            object4 = object2 = this.d0;
                        } while (object2 != i.c);
                    }
                    return this.i(this.q);
                }
            }
            while (l10 > 0L) {
                object4 = this.q;
                bl = object4 != null;
                if (bl & (object4 instanceof g ^ true)) {
                    return this.i(object4);
                }
                if (!Thread.interrupted()) {
                    l10 = l11 - System.nanoTime();
                    continue;
                }
                throw new InterruptedException();
            }
            object3 = this.toString();
            object2 = object.toString();
            object4 = Locale.ROOT;
            String string = ((String)object2).toLowerCase((Locale)object4);
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Waited ");
            ((StringBuilder)object2).append(l8);
            ((StringBuilder)object2).append(" ");
            ((StringBuilder)object2).append(object.toString().toLowerCase((Locale)object4));
            object4 = object2 = ((StringBuilder)object2).toString();
            if (l10 + 1000L < 0L) {
                object4 = new StringBuilder();
                ((StringBuilder)object4).append((String)object2);
                ((StringBuilder)object4).append(" (plus ");
                object4 = ((StringBuilder)object4).toString();
                l10 = -l10;
                l8 = ((TimeUnit)((Object)object)).convert(l10, TimeUnit.NANOSECONDS);
                long l12 = l8 - 0L;
                long l13 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                bl = l13 == false || (l10 -= ((TimeUnit)((Object)object)).toNanos(l8)) > 1000L;
                object = object4;
                if (l13 > 0) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)object4);
                    ((StringBuilder)object).append(l8);
                    ((StringBuilder)object).append(" ");
                    ((StringBuilder)object).append(string);
                    object = object4 = ((StringBuilder)object).toString();
                    if (bl) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append((String)object4);
                        ((StringBuilder)object).append(",");
                        object = ((StringBuilder)object).toString();
                    }
                    object4 = new StringBuilder();
                    ((StringBuilder)object4).append((String)object);
                    ((StringBuilder)object4).append(" ");
                    object = ((StringBuilder)object4).toString();
                }
                object4 = object;
                if (bl) {
                    object4 = new StringBuilder();
                    ((StringBuilder)object4).append((String)object);
                    ((StringBuilder)object4).append(l10);
                    ((StringBuilder)object4).append(" nanoseconds ");
                    object4 = ((StringBuilder)object4).toString();
                }
                object = new StringBuilder();
                ((StringBuilder)object).append((String)object4);
                ((StringBuilder)object).append("delay)");
                object4 = ((StringBuilder)object).toString();
            }
            if (this.isDone()) {
                object = new StringBuilder();
                ((StringBuilder)object).append((String)object4);
                ((StringBuilder)object).append(" but future completed as timeout expired");
                throw new TimeoutException(((StringBuilder)object).toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append((String)object4);
            ((StringBuilder)object).append(" for ");
            ((StringBuilder)object).append((String)object3);
            throw new TimeoutException(((StringBuilder)object).toString());
        }
        throw new InterruptedException();
    }

    @Override
    public final void h(Runnable runnable2, Executor executor) {
        a.d(runnable2);
        a.d(executor);
        e e8 = this.c0;
        if (e8 != e.d) {
            e e9;
            e e10 = new e(runnable2, executor);
            do {
                e10.c = e8;
                if (g0.a(this, e8, e10)) {
                    return;
                }
                e8 = e9 = this.c0;
            } while (e9 != e.d);
        }
        a.g(runnable2, executor);
    }

    @Override
    public final boolean isCancelled() {
        return this.q instanceof c;
    }

    @Override
    public final boolean isDone() {
        Object object = this.q;
        boolean bl = object != null;
        return (object instanceof g ^ true) & bl;
    }

    protected void l() {
    }

    protected String m() {
        Object object = this.q;
        if (object instanceof g) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setFuture=[");
            stringBuilder.append(this.s(((g)object).c0));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        if (this instanceof ScheduledFuture) {
            object = new StringBuilder();
            ((StringBuilder)object).append("remaining delay=[");
            ((StringBuilder)object).append(((ScheduledFuture)((Object)this)).getDelay(TimeUnit.MILLISECONDS));
            ((StringBuilder)object).append(" ms]");
            return ((StringBuilder)object).toString();
        }
        return null;
    }

    protected boolean p(V v8) {
        Object object = v8;
        if (v8 == null) {
            object = h0;
        }
        if (g0.b(this, null, object)) {
            a.f(this);
            return true;
        }
        return false;
    }

    protected boolean q(Throwable object) {
        if (g0.b(this, null, object = new d(a.d(object)))) {
            a.f(this);
            return true;
        }
        return false;
    }

    protected boolean r(ax.v7.e<? extends V> object) {
        a.d(object);
        g g8 = this.q;
        g g9 = g8;
        if (g8 == null) {
            if (object.isDone()) {
                if (g0.b(this, null, object = a.j(object))) {
                    a.f(this);
                    return true;
                }
                return false;
            }
            g9 = new g(this, object);
            if (g0.b(this, null, g9)) {
                try {
                    object.h(g9, ax.M2.b.q);
                }
                catch (Throwable throwable) {
                    try {
                        object = new d(throwable);
                    }
                    catch (Throwable throwable2) {
                        object = d.b;
                    }
                    g0.b(this, g9, object);
                }
                return true;
            }
            g9 = this.q;
        }
        if (g9 instanceof c) {
            object.cancel(((c)((Object)g9)).a);
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("[status=");
        if (this.isCancelled()) {
            stringBuilder.append("CANCELLED");
        } else if (this.isDone()) {
            this.a(stringBuilder);
        } else {
            CharSequence charSequence;
            try {
                charSequence = this.m();
            }
            catch (RuntimeException runtimeException) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Exception thrown from implementation: ");
                ((StringBuilder)charSequence).append(runtimeException.getClass());
                charSequence = ((StringBuilder)charSequence).toString();
            }
            if (charSequence != null && !((String)charSequence).isEmpty()) {
                stringBuilder.append("PENDING, info=[");
                stringBuilder.append((String)charSequence);
                stringBuilder.append("]");
            } else if (this.isDone()) {
                this.a(stringBuilder);
            } else {
                stringBuilder.append("PENDING");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private static abstract class b {
        private b() {
        }

        abstract boolean a(a<?> var1, e var2, e var3);

        abstract boolean b(a<?> var1, Object var2, Object var3);

        abstract boolean c(a<?> var1, i var2, i var3);

        abstract void d(i var1, i var2);

        abstract void e(i var1, Thread var2);
    }

    private static final class c {
        static final c c;
        static final c d;
        final boolean a;
        final Throwable b;

        static {
            if (e0) {
                d = null;
                c = null;
            } else {
                d = new c(false, null);
                c = new c(true, null);
            }
        }

        c(boolean bl, Throwable throwable) {
            this.a = bl;
            this.b = throwable;
        }
    }

    private static final class d {
        static final d b = new d(new Throwable("Failure occurred while trying to finish a future."){

            /*
             * Enabled aggressive block sorting
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            @Override
            public Throwable fillInStackTrace() {
                // MONITORENTER : this
                // MONITOREXIT : this
                return this;
            }
        });
        final Throwable a;

        d(Throwable throwable) {
            this.a = ax.M2.a.d(throwable);
        }
    }

    private static final class e {
        static final e d = new e(null, null);
        final Runnable a;
        final Executor b;
        e c;

        e(Runnable runnable2, Executor executor) {
            this.a = runnable2;
            this.b = executor;
        }
    }

    private static final class f
    extends b {
        final AtomicReferenceFieldUpdater<i, Thread> a;
        final AtomicReferenceFieldUpdater<i, i> b;
        final AtomicReferenceFieldUpdater<a, i> c;
        final AtomicReferenceFieldUpdater<a, e> d;
        final AtomicReferenceFieldUpdater<a, Object> e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override
        boolean a(a<?> a8, e e8, e e9) {
            return ax.D.b.a(this.d, a8, e8, e9);
        }

        @Override
        boolean b(a<?> a8, Object object, Object object2) {
            return ax.D.b.a(this.e, a8, object, object2);
        }

        @Override
        boolean c(a<?> a8, i i8, i i9) {
            return ax.D.b.a(this.c, a8, i8, i9);
        }

        @Override
        void d(i i8, i i9) {
            this.b.lazySet(i8, i9);
        }

        @Override
        void e(i i8, Thread thread) {
            this.a.lazySet(i8, thread);
        }
    }

    private static final class g<V>
    implements Runnable {
        final ax.v7.e<? extends V> c0;
        final a<V> q;

        g(a<V> a8, ax.v7.e<? extends V> e8) {
            this.q = a8;
            this.c0 = e8;
        }

        @Override
        public void run() {
            Object object;
            if (this.q.q == this && g0.b(this.q, this, object = a.j(this.c0))) {
                a.f(this.q);
            }
        }
    }

    private static final class h
    extends b {
        h() {
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        boolean a(a<?> a8, e e8, e e9) {
            synchronized (a8) {
                Throwable throwable2;
                block4: {
                    try {
                        if (a8.c0 == e8) {
                            a8.c0 = e9;
                            return true;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    return false;
                }
                throw throwable2;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        boolean b(a<?> a8, Object object, Object object2) {
            synchronized (a8) {
                Throwable throwable2;
                block4: {
                    try {
                        if (a8.q == object) {
                            a8.q = object2;
                            return true;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    return false;
                }
                throw throwable2;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        boolean c(a<?> a8, i i8, i i9) {
            synchronized (a8) {
                Throwable throwable2;
                block4: {
                    try {
                        if (a8.d0 == i8) {
                            a8.d0 = i9;
                            return true;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                    return false;
                }
                throw throwable2;
            }
        }

        @Override
        void d(i i8, i i9) {
            i8.b = i9;
        }

        @Override
        void e(i i8, Thread thread) {
            i8.a = thread;
        }
    }

    private static final class i {
        static final i c = new i(false);
        volatile Thread a;
        volatile i b;

        i() {
            g0.e(this, Thread.currentThread());
        }

        i(boolean bl) {
        }

        void a(i i8) {
            g0.d(this, i8);
        }

        void b() {
            Thread thread = this.a;
            if (thread != null) {
                this.a = null;
                LockSupport.unpark(thread);
            }
        }
    }
}

