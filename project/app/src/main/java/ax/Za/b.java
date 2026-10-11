/*
 * Decompiled with CFR 0.152.
 */
package ax.Za;

import java.io.Closeable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

public class b {
    static final Logger g0 = Logger.getLogger(b.class.getName());
    private static final ax.Za.c<d<?>, Object> h0;
    public static final b i0;
    private b c0 = new f(this, null);
    final a d0;
    final ax.Za.c<d<?>, Object> e0;
    final int f0;
    private ArrayList<c> q;

    static {
        ax.Za.c c8 = new ax.Za.c();
        h0 = c8;
        i0 = new b(null, c8);
    }

    private b(b b8, ax.Za.c<d<?>, Object> c8) {
        this.d0 = b.c(b8);
        this.e0 = c8;
        int n8 = b8 == null ? 0 : b8.f0 + 1;
        this.f0 = n8;
        b.v(n8);
    }

    static a c(b b8) {
        if (b8 == null) {
            return null;
        }
        if (b8 instanceof a) {
            return (a)b8;
        }
        return b8.d0;
    }

    static <T> T e(T t8, Object object) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(String.valueOf(object));
    }

    public static b f() {
        b b8;
        b b9 = b8 = b.u().b();
        if (b8 == null) {
            b9 = i0;
        }
        return b9;
    }

    public static <T> d<T> m(String string) {
        return new d(string);
    }

    static g u() {
        return e.a;
    }

    private static void v(int n8) {
        if (n8 == 1000) {
            g0.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", new Exception());
        }
    }

    public <V> b A(d<V> d8, V v8) {
        return new b(this, this.e0.b(d8, v8));
    }

    public b a() {
        b b8;
        b b9 = b8 = b.u().d(this);
        if (b8 == null) {
            b9 = i0;
        }
        return b9;
    }

    boolean b() {
        return this.d0 != null;
    }

    public Throwable d() {
        a a8 = this.d0;
        if (a8 == null) {
            return null;
        }
        return a8.d();
    }

    public void g(b b8) {
        b.e(b8, "toAttach");
        b.u().c(this, b8);
    }

    public boolean j() {
        a a8 = this.d0;
        if (a8 == null) {
            return false;
        }
        return a8.j();
    }

    Object o(d<?> d8) {
        return this.e0.a(d8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    void p() {
        int n8;
        if (!this.b()) {
            return;
        }
        // MONITORENTER : this
        Object object = this.q;
        if (object == null) {
            // MONITOREXIT : this
            return;
        }
        this.q = null;
        // MONITOREXIT : this
        int n10 = 0;
        int n9 = 0;
        while (true) {
            n8 = n10;
            if (n9 >= ((ArrayList)object).size()) break;
            if (!(((ArrayList)object).get((int)n9).c0 instanceof f)) {
                ((c)((ArrayList)object).get(n9)).a();
            }
            ++n9;
        }
        while (true) {
            if (n8 >= ((ArrayList)object).size()) {
                object = this.d0;
                if (object == null) return;
                ((b)object).q(this.c0);
                return;
            }
            if (((ArrayList)object).get((int)n8).c0 instanceof f) {
                ((c)((ArrayList)object).get(n8)).a();
            }
            ++n8;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void q(b object) {
        if (!this.b()) {
            return;
        }
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block7: {
                    try {
                        ArrayList<c> arrayList = this.q;
                        if (arrayList == null) break block7;
                        for (int i8 = arrayList.size() - 1; i8 >= 0; --i8) {
                            if (this.q.get((int)i8).c0 != object) continue;
                            this.q.remove(i8);
                            break;
                        }
                        if (!this.q.isEmpty()) break block7;
                        object = this.d0;
                        if (object != null) {
                            ((b)object).q(this.c0);
                        }
                        this.q = null;
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public static final class a
    extends b
    implements Closeable,
    AutoCloseable {
        private final b j0;
        private boolean k0;
        private Throwable l0;
        private ScheduledFuture<?> m0;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public boolean F(Throwable throwable) {
            synchronized (this) {
                try {
                    boolean bl = this.k0;
                    boolean bl2 = false;
                    if (!bl) {
                        this.k0 = true;
                        ScheduledFuture<?> scheduledFuture = this.m0;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                            this.m0 = null;
                        }
                        this.l0 = throwable;
                        bl2 = true;
                    }
                    // MONITOREXIT @DISABLED, blocks:[0, 2] lbl14 : MonitorExitStatement: MONITOREXIT : this
                    if (bl2) {
                        this.p();
                    }
                    return bl2;
                }
                catch (Throwable throwable2) {}
                throw throwable2;
            }
        }

        @Override
        public b a() {
            return this.j0.a();
        }

        @Override
        boolean b() {
            return true;
        }

        @Override
        public void close() {
            this.F(null);
        }

        @Override
        public Throwable d() {
            if (this.j()) {
                return this.l0;
            }
            return null;
        }

        @Override
        public void g(b b8) {
            this.j0.g(b8);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        @Override
        public boolean j() {
            // MONITORENTER : this
            if (this.k0) {
                // MONITOREXIT : this
                return true;
            }
            if (!super.j()) return false;
            this.F(super.d());
            return true;
        }
    }

    public static interface b {
        public void a(b var1);
    }

    private final class c
    implements Runnable {
        final b c0;
        final b d0;
        private final Executor q;

        void a() {
            try {
                this.q.execute(this);
                return;
            }
            catch (Throwable throwable) {
                g0.log(Level.INFO, "Exception notifying context listener", throwable);
                return;
            }
        }

        @Override
        public void run() {
            this.c0.a(this.d0);
        }
    }

    public static final class d<T> {
        private final String a;
        private final T b;

        d(String string) {
            this(string, null);
        }

        d(String string, T t8) {
            this.a = ax.Za.b.e(string, "name");
            this.b = t8;
        }

        public T a(b object) {
            Object object2;
            object = object2 = ((b)object).o(this);
            if (object2 == null) {
                object = this.b;
            }
            return (T)object;
        }

        public String toString() {
            return this.a;
        }
    }

    private static final class e {
        static final g a;

        static {
            Serializable serializable = new AtomicReference();
            a = e.a(serializable);
            if ((serializable = (Throwable)serializable.get()) != null) {
                g0.log(Level.FINE, "Storage override doesn't exist. Using default", (Throwable)serializable);
            }
        }

        private static g a(AtomicReference<? super ClassNotFoundException> atomicReference) {
            try {
                g g8 = Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(g.class).getConstructor(null).newInstance(null);
                return g8;
            }
            catch (ClassNotFoundException classNotFoundException) {
            }
            catch (Exception exception) {
                throw new RuntimeException("Storage override failed to initialize", exception);
            }
            atomicReference.set(classNotFoundException);
            return new ax.Za.d();
        }
    }

    private final class f
    implements b {
        final b a;

        private f(b b8) {
            this.a = b8;
        }

        /* synthetic */ f(b b8, ax.Za.a a8) {
            this(b8);
        }

        @Override
        public void a(b b8) {
            b b9 = this.a;
            if (b9 instanceof a) {
                ((a)b9).F(b8.d());
                return;
            }
            b9.p();
        }
    }

    public static abstract class g {
        @Deprecated
        public void a(b b8) {
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }

        public abstract b b();

        public abstract void c(b var1, b var2);

        public b d(b b8) {
            b b9 = this.b();
            this.a(b8);
            return b9;
        }
    }
}

