package ax.K7;

import ax.J7.C0769n;
import ax.K7.m;
import ax.L7.F;
import ax.f1.C2015i;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class m {
    private final f a;
    private final C0769n b;
    private String c;
    private final a d = new a(false);
    private final a e = new a(true);
    private final j f = new j(128);
    private final AtomicMarkableReference<String> g = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    class a {
        final AtomicMarkableReference<d> a;
        private final AtomicReference<Callable<Void>> b = new AtomicReference<>(null);
        private final boolean c;

        public a(boolean z) {
            this.c = z;
            this.a = new AtomicMarkableReference<>(new d(64, z ? 8192 : 1024), false);
        }

        public static /* synthetic */ Void a(a aVar) {
            aVar.b.set(null);
            aVar.d();
            return null;
        }

        private void c() {
            Callable callable = new Callable() { // from class: ax.K7.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return m.a.a(m.a.this);
                }
            };
            if (C2015i.a(this.b, null, callable)) {
                m.this.b.h(callable);
            }
        }

        private void d() {
            Map<String, String> map;
            synchronized (this) {
                try {
                    if (this.a.isMarked()) {
                        map = this.a.getReference().a();
                        AtomicMarkableReference<d> atomicMarkableReference = this.a;
                        atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                    } else {
                        map = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (map != null) {
                m.this.a.q(m.this.c, map, this.c);
            }
        }

        public Map<String, String> b() {
            return this.a.getReference().a();
        }

        public boolean e(String str, String str2) {
            synchronized (this) {
                try {
                    if (!this.a.getReference().d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference<d> atomicMarkableReference = this.a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                    c();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public m(String str, ax.O7.g gVar, C0769n c0769n) {
        this.c = str;
        this.a = new f(gVar);
        this.b = c0769n;
    }

    public static /* synthetic */ Object a(m mVar, List list) {
        mVar.a.r(mVar.c, list);
        return null;
    }

    public static m i(String str, ax.O7.g gVar, C0769n c0769n) {
        f fVar = new f(gVar);
        m mVar = new m(str, gVar, c0769n);
        mVar.d.a.getReference().e(fVar.i(str, false));
        mVar.e.a.getReference().e(fVar.i(str, true));
        mVar.g.set(fVar.k(str), false);
        mVar.f.c(fVar.j(str));
        return mVar;
    }

    public static String j(String str, ax.O7.g gVar) {
        return new f(gVar).k(str);
    }

    public Map<String, String> e() {
        return this.d.b();
    }

    public Map<String, String> f() {
        return this.e.b();
    }

    public List<F.e.d.AbstractC0138e> g() {
        return this.f.a();
    }

    public String h() {
        return this.g.getReference();
    }

    public boolean k(String str, String str2) {
        return this.d.e(str, str2);
    }

    public boolean l(String str, String str2) {
        return this.e.e(str, str2);
    }

    public void m(String str) {
        synchronized (this.c) {
            try {
                this.c = str;
                Map<String, String> b = this.d.b();
                List<i> b2 = this.f.b();
                if (h() != null) {
                    this.a.s(str, h());
                }
                if (!b.isEmpty()) {
                    this.a.p(str, b);
                }
                if (!b2.isEmpty()) {
                    this.a.r(str, b2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean n(List<i> list) {
        synchronized (this.f) {
            try {
                if (!this.f.c(list)) {
                    return false;
                }
                final List<i> b = this.f.b();
                this.b.h(new Callable() { // from class: ax.K7.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return m.a(m.this, b);
                    }
                });
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
