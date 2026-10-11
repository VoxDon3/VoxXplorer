package ax.Za;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class b {
    static final Logger g0 = Logger.getLogger(b.class.getName());
    private static final ax.Za.c<d<?>, Object> h0;
    public static final b i0;
    private InterfaceC0234b c0 = new f(this, null);
    final a d0;
    final ax.Za.c<d<?>, Object> e0;
    final int f0;
    private ArrayList<c> q;

    public static final class a extends b implements Closeable, AutoCloseable {
        private final b j0;
        private boolean k0;
        private Throwable l0;
        private ScheduledFuture<?> m0;

        public boolean F(Throwable th) {
            boolean z;
            synchronized (this) {
                try {
                    z = false;
                    if (!this.k0) {
                        this.k0 = true;
                        ScheduledFuture<?> scheduledFuture = this.m0;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                            this.m0 = null;
                        }
                        this.l0 = th;
                        z = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z) {
                p();
            }
            return z;
        }

        @Override // ax.Za.b
        public b a() {
            return this.j0.a();
        }

        @Override // ax.Za.b
        boolean b() {
            return true;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            F(null);
        }

        @Override // ax.Za.b
        public Throwable d() {
            if (j()) {
                return this.l0;
            }
            return null;
        }

        @Override // ax.Za.b
        public void g(b bVar) {
            this.j0.g(bVar);
        }

        @Override // ax.Za.b
        public boolean j() {
            synchronized (this) {
                try {
                    if (this.k0) {
                        return true;
                    }
                    if (!super.j()) {
                        return false;
                    }
                    F(super.d());
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: ax.Za.b$b, reason: collision with other inner class name */
    public interface InterfaceC0234b {
        void a(b bVar);
    }

    private final class c implements Runnable {
        final InterfaceC0234b c0;
        final /* synthetic */ b d0;
        private final Executor q;

        void a() {
            try {
                this.q.execute(this);
            } catch (Throwable th) {
                b.g0.log(Level.INFO, "Exception notifying context listener", th);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.c0.a(this.d0);
        }
    }

    public static final class d<T> {
        private final String a;
        private final T b;

        d(String str) {
            this(str, null);
        }

        public T a(b bVar) {
            T t = (T) bVar.o(this);
            return t == null ? this.b : t;
        }

        public String toString() {
            return this.a;
        }

        d(String str, T t) {
            this.a = (String) b.e(str, "name");
            this.b = t;
        }
    }

    private static final class e {
        static final g a;

        static {
            AtomicReference atomicReference = new AtomicReference();
            a = a(atomicReference);
            Throwable th = (Throwable) atomicReference.get();
            if (th != null) {
                b.g0.log(Level.FINE, "Storage override doesn't exist. Using default", th);
            }
        }

        private static g a(AtomicReference<? super ClassNotFoundException> atomicReference) {
            try {
                return (g) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(g.class).getConstructor(null).newInstance(null);
            } catch (ClassNotFoundException e) {
                atomicReference.set(e);
                return new ax.Za.d();
            } catch (Exception e2) {
                throw new RuntimeException("Storage override failed to initialize", e2);
            }
        }
    }

    private final class f implements InterfaceC0234b {
        private f() {
        }

        @Override // ax.Za.b.InterfaceC0234b
        public void a(b bVar) {
            b bVar2 = b.this;
            if (bVar2 instanceof a) {
                ((a) bVar2).F(bVar.d());
            } else {
                bVar2.p();
            }
        }

        /* synthetic */ f(b bVar, ax.Za.a aVar) {
            this();
        }
    }

    public static abstract class g {
        @Deprecated
        public void a(b bVar) {
            throw new UnsupportedOperationException("Deprecated. Do not call.");
        }

        public abstract b b();

        public abstract void c(b bVar, b bVar2);

        public b d(b bVar) {
            b b = b();
            a(bVar);
            return b;
        }
    }

    static {
        ax.Za.c<d<?>, Object> cVar = new ax.Za.c<>();
        h0 = cVar;
        i0 = new b(null, cVar);
    }

    private b(b bVar, ax.Za.c<d<?>, Object> cVar) {
        this.d0 = c(bVar);
        this.e0 = cVar;
        int i = bVar == null ? 0 : bVar.f0 + 1;
        this.f0 = i;
        v(i);
    }

    static a c(b bVar) {
        if (bVar == null) {
            return null;
        }
        return bVar instanceof a ? (a) bVar : bVar.d0;
    }

    static <T> T e(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static b f() {
        b b = u().b();
        return b == null ? i0 : b;
    }

    public static <T> d<T> m(String str) {
        return new d<>(str);
    }

    static g u() {
        return e.a;
    }

    private static void v(int i) {
        if (i == 1000) {
            g0.log(Level.SEVERE, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public <V> b A(d<V> dVar, V v) {
        return new b(this, this.e0.b(dVar, v));
    }

    public b a() {
        b d2 = u().d(this);
        return d2 == null ? i0 : d2;
    }

    boolean b() {
        return this.d0 != null;
    }

    public Throwable d() {
        a aVar = this.d0;
        if (aVar == null) {
            return null;
        }
        return aVar.d();
    }

    public void g(b bVar) {
        e(bVar, "toAttach");
        u().c(this, bVar);
    }

    public boolean j() {
        a aVar = this.d0;
        if (aVar == null) {
            return false;
        }
        return aVar.j();
    }

    Object o(d<?> dVar) {
        return this.e0.a(dVar);
    }

    void p() {
        if (b()) {
            synchronized (this) {
                try {
                    ArrayList<c> arrayList = this.q;
                    if (arrayList == null) {
                        return;
                    }
                    this.q = null;
                    for (int i = 0; i < arrayList.size(); i++) {
                        if (!(arrayList.get(i).c0 instanceof f)) {
                            arrayList.get(i).a();
                        }
                    }
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (arrayList.get(i2).c0 instanceof f) {
                            arrayList.get(i2).a();
                        }
                    }
                    a aVar = this.d0;
                    if (aVar != null) {
                        aVar.q(this.c0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void q(InterfaceC0234b interfaceC0234b) {
        if (b()) {
            synchronized (this) {
                try {
                    ArrayList<c> arrayList = this.q;
                    if (arrayList != null) {
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            if (this.q.get(size).c0 == interfaceC0234b) {
                                this.q.remove(size);
                                break;
                            }
                            size--;
                        }
                        if (this.q.isEmpty()) {
                            a aVar = this.d0;
                            if (aVar != null) {
                                aVar.q(this.c0);
                            }
                            this.q = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
