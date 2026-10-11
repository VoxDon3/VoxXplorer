package ax.ba;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import ax.aa.C1433a;
import ax.ea.InterfaceC1993b;
import ax.ga.InterfaceC2133b;
import ax.ja.InterfaceC2344a;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class e {
    final Resources a;
    final int b;
    final int c;
    final int d;
    final int e;
    final Executor f;
    final Executor g;
    final boolean h;
    final boolean i;
    final int j;
    final int k;
    final ax.ca.g l;
    final ax.Z9.a m;
    final ax.V9.a n;
    final InterfaceC2133b o;
    final InterfaceC1993b p;
    final ax.ba.c q;
    final InterfaceC2133b r;
    final InterfaceC2133b s;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[InterfaceC2133b.a.values().length];
            a = iArr;
            try {
                iArr[InterfaceC2133b.a.HTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[InterfaceC2133b.a.HTTPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b {
        public static final ax.ca.g x = ax.ca.g.FIFO;
        private Context a;
        private InterfaceC1993b u;
        private int b = 0;
        private int c = 0;
        private int d = 0;
        private int e = 0;
        private Executor f = null;
        private Executor g = null;
        private boolean h = false;
        private boolean i = false;
        private int j = 3;
        private int k = 3;
        private boolean l = false;
        private ax.ca.g m = x;
        private int n = 0;
        private long o = 0;
        private int p = 0;
        private ax.Z9.a q = null;
        private ax.V9.a r = null;
        private ax.Y9.a s = null;
        private InterfaceC2133b t = null;
        private ax.ba.c v = null;
        private boolean w = false;

        public b(Context context) {
            this.a = context.getApplicationContext();
        }

        static /* synthetic */ InterfaceC2344a o(b bVar) {
            bVar.getClass();
            return null;
        }

        private void z() {
            if (this.f == null) {
                this.f = C1726a.c(this.j, this.k, this.m);
            } else {
                this.h = true;
            }
            if (this.g == null) {
                this.g = C1726a.c(this.j, this.k, this.m);
            } else {
                this.i = true;
            }
            if (this.r == null) {
                if (this.s == null) {
                    this.s = C1726a.d();
                }
                this.r = C1726a.b(this.a, this.s, this.o, this.p);
            }
            if (this.q == null) {
                this.q = C1726a.g(this.a, this.n);
            }
            if (this.l) {
                this.q = new C1433a(this.q, ax.ka.e.a());
            }
            if (this.t == null) {
                this.t = C1726a.f(this.a);
            }
            if (this.u == null) {
                this.u = C1726a.e(this.w);
            }
            if (this.v == null) {
                this.v = ax.ba.c.t();
            }
        }

        public b A(ax.Z9.a aVar) {
            if (this.n != 0) {
                ax.ka.d.f("memoryCache() and memoryCacheSize() calls overlap each other", new Object[0]);
            }
            this.q = aVar;
            return this;
        }

        public b B(int i, int i2) {
            this.b = i;
            this.c = i2;
            return this;
        }

        public b C(Executor executor) {
            if (this.j != 3 || this.k != 3 || this.m != x) {
                ax.ka.d.f("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
            }
            this.f = executor;
            return this;
        }

        public b D(Executor executor) {
            if (this.j != 3 || this.k != 3 || this.m != x) {
                ax.ka.d.f("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
            }
            this.g = executor;
            return this;
        }

        public e t() {
            z();
            return new e(this, null);
        }

        public b u(ax.ba.c cVar) {
            this.v = cVar;
            return this;
        }

        public b v(ax.V9.a aVar) {
            if (this.o > 0 || this.p > 0) {
                ax.ka.d.f("diskCache(), diskCacheSize() and diskCacheFileCount calls overlap each other", new Object[0]);
            }
            if (this.s != null) {
                ax.ka.d.f("diskCache() and diskCacheFileNameGenerator() calls overlap each other", new Object[0]);
            }
            this.r = aVar;
            return this;
        }

        public b w(int i, int i2, InterfaceC2344a interfaceC2344a) {
            this.d = i;
            this.e = i2;
            return this;
        }

        public b x(InterfaceC1993b interfaceC1993b) {
            this.u = interfaceC1993b;
            return this;
        }

        public b y(InterfaceC2133b interfaceC2133b) {
            this.t = interfaceC2133b;
            return this;
        }
    }

    private static class c implements InterfaceC2133b {
        private final InterfaceC2133b a;

        public c(InterfaceC2133b interfaceC2133b) {
            this.a = interfaceC2133b;
        }

        @Override // ax.ga.InterfaceC2133b
        public InputStream a(String str, Object obj) throws IOException {
            int i = a.a[InterfaceC2133b.a.l(str).ordinal()];
            if (i == 1 || i == 2) {
                throw new IllegalStateException();
            }
            return this.a.a(str, obj);
        }
    }

    private static class d implements InterfaceC2133b {
        private final InterfaceC2133b a;

        public d(InterfaceC2133b interfaceC2133b) {
            this.a = interfaceC2133b;
        }

        @Override // ax.ga.InterfaceC2133b
        public InputStream a(String str, Object obj) throws IOException {
            InputStream a = this.a.a(str, obj);
            int i = a.a[InterfaceC2133b.a.l(str).ordinal()];
            return (i == 1 || i == 2) ? new ax.ca.c(a) : a;
        }
    }

    /* synthetic */ e(b bVar, a aVar) {
        this(bVar);
    }

    ax.ca.e a() {
        DisplayMetrics displayMetrics = this.a.getDisplayMetrics();
        int i = this.b;
        if (i <= 0) {
            i = displayMetrics.widthPixels;
        }
        int i2 = this.c;
        if (i2 <= 0) {
            i2 = displayMetrics.heightPixels;
        }
        return new ax.ca.e(i, i2);
    }

    private e(b bVar) {
        this.a = bVar.a.getResources();
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        b.o(bVar);
        this.f = bVar.f;
        this.g = bVar.g;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.m;
        this.n = bVar.r;
        this.m = bVar.q;
        this.q = bVar.v;
        InterfaceC2133b interfaceC2133b = bVar.t;
        this.o = interfaceC2133b;
        this.p = bVar.u;
        this.h = bVar.h;
        this.i = bVar.i;
        this.r = new c(interfaceC2133b);
        this.s = new d(interfaceC2133b);
        ax.ka.d.g(bVar.w);
    }
}
