package com.voxdon.xplorer.file;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import ax.b3.C1486a;
import ax.b3.C1495j;
import ax.c3.C1808A;
import ax.c3.C1809B;
import ax.c3.C1829q;
import ax.c3.C1833v;
import ax.c3.EnumC1837z;
import ax.c3.d0;
import ax.c3.f0;
import ax.c3.k0;
import ax.l3.AbstractC2465a;
import ax.r3.C2945b;
import ax.r3.C2946c;
import ax.r3.C2947d;
import ax.u3.AbstractC3199q;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.InterfaceC3185c;
import com.voxdon.xplorer.file.InterfaceC3584c;
import j$.util.DesugarCollections;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.HttpUrl;

/* renamed from: com.voxdon.xplorer.file.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3594m implements InterfaceC3584c {
    private static boolean g = false;
    private Context a;
    private ax.c3.K b;
    private Set<String> c = DesugarCollections.synchronizedSet(new HashSet());
    private Set<String> d = DesugarCollections.synchronizedSet(new HashSet());
    private final Object e = new Object();
    private ReentrantLock f = new ReentrantLock();

    /* renamed from: com.voxdon.xplorer.file.m$a */
    class a implements InterfaceC3185c {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // ax.u3.InterfaceC3185c
        public boolean isCancelled() {
            return !AbstractC3594m.this.d.contains(this.a);
        }
    }

    /* renamed from: com.voxdon.xplorer.file.m$b */
    class b implements InterfaceC3185c {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // ax.u3.InterfaceC3185c
        public boolean isCancelled() {
            return !AbstractC3594m.this.d.contains(this.a);
        }
    }

    /* renamed from: com.voxdon.xplorer.file.m$c */
    class c implements Runnable {
        final /* synthetic */ boolean c0;
        final /* synthetic */ Object d0;
        final /* synthetic */ InterfaceC3584c.a q;

        c(InterfaceC3584c.a aVar, boolean z, Object obj) {
            this.q = aVar;
            this.c0 = z;
            this.d0 = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.q.T(this.c0, this.d0);
        }
    }

    /* renamed from: com.voxdon.xplorer.file.m$d */
    protected static class d extends AbstractC3199q<Long, Long, Long> {
        AbstractC3594m h;

        public d(AbstractC3594m abstractC3594m) {
            super(AbstractC3199q.e.HIGH);
            this.h = abstractC3594m;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Long g(Long... lArr) {
            if (!this.h.a()) {
                return null;
            }
            this.h.b();
            return null;
        }
    }

    /* renamed from: com.voxdon.xplorer.file.m$e */
    protected class e extends ax.c3.G {
        AbstractC3595n a;

        e(AbstractC3595n abstractC3595n) {
            this.a = abstractC3595n;
        }

        @Override // ax.c3.G
        public boolean a() {
            return true;
        }

        @Override // ax.c3.G
        public InputStream c(long j) throws C1495j {
            return AbstractC3594m.this.J(this.a, j);
        }

        @Override // ax.c3.G
        public long d() {
            return this.a.p();
        }

        public ax.c3.K e() {
            return AbstractC3594m.this.v();
        }
    }

    /* renamed from: com.voxdon.xplorer.file.m$f */
    public enum f {
        NONE,
        USE_MEDIA_STORE
    }

    protected AbstractC3594m() {
    }

    private InputStream R(String str) {
        try {
            AbstractC3595n z = z(str);
            File Z = z.Z();
            if (C1809B.G(Z, z)) {
                ax.Z2.t.b().e(Z);
            } else {
                this.d.add(str);
                try {
                    ax.c3.F.f(J(z, 0L), Z, z.p(), new b(str));
                    ax.Z2.t.b().c(Z);
                    ax.Z2.t.b().a();
                } finally {
                    this.d.remove(str);
                }
            }
            return new FileInputStream(Z);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String S(AbstractC3595n abstractC3595n) {
        return C1809B.Y(abstractC3595n);
    }

    private InputStream T(MediaDataSource mediaDataSource) {
        Bitmap h = C3180B.h(mediaDataSource, 512);
        if (h == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(32768);
        h.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    private InputStream U(String str) throws C1486a {
        try {
            AbstractC3595n z = z(str);
            this.d.add(str);
            a aVar = new a(str);
            ax.X2.Q.t1();
            InputStream T = T(new f0(this, z, aVar));
            if (T == null && aVar.isCancelled()) {
                throw new C1486a();
            }
            this.d.remove(str);
            return T;
        } catch (C1495j unused) {
            this.d.remove(str);
            return null;
        } catch (Throwable th) {
            this.d.remove(str);
            throw th;
        }
    }

    public static void X(Context context) {
        if (g || context == null || !C3180B.g0(context)) {
            return;
        }
        g = true;
    }

    public static boolean k(Collection<AbstractC3595n> collection, AbstractC3595n abstractC3595n) {
        Iterator<AbstractC3595n> it = collection.iterator();
        while (it.hasNext()) {
            if (abstractC3595n.E().equals(it.next().E())) {
                return true;
            }
        }
        return false;
    }

    public boolean V() {
        return false;
    }

    public void W(Context context, ax.c3.K k) {
        this.a = context;
        this.b = k;
    }

    public boolean Y() {
        return false;
    }

    protected boolean Z(AbstractC3595n abstractC3595n) {
        EnumC1837z G = abstractC3595n.G();
        if (EnumC1837z.IMAGE != G) {
            return EnumC1837z.VIDEO == G && ax.X2.Q.r0();
        }
        String A = abstractC3595n.A();
        if (!C1808A.O(A) || "dng".equals(A)) {
            return true;
        }
        return C2947d.l(p(), C1809B.Y(abstractC3595n)) != null;
    }

    public boolean a0(AbstractC3595n abstractC3595n) {
        return true;
    }

    public List<AbstractC3595n> b0(AbstractC3595n abstractC3595n) throws C1495j {
        return C(abstractC3595n, f.NONE);
    }

    public boolean c0() {
        return false;
    }

    protected void d0(InterfaceC3584c.a aVar, boolean z, Object obj) {
        if (aVar == null) {
            return;
        }
        f0(new c(aVar, z, obj));
    }

    public AbstractC2465a e0(String str, int i) throws C1495j {
        C3184b.g("Proxy file is not supported");
        throw new ax.b3.t("Proxy file is not supported");
    }

    public void f(String str) {
        this.d.remove(str);
    }

    protected void f0(Runnable runnable) {
        C3180B.a0(runnable);
    }

    public void g() {
        this.c.clear();
    }

    public boolean g0() {
        return false;
    }

    public void h(InterfaceC3584c.a aVar) {
        K(null, null, aVar);
    }

    public boolean h0() {
        return false;
    }

    protected void i() {
        this.f.lock();
    }

    public boolean i0() {
        return true;
    }

    protected void j() {
        this.f.unlock();
    }

    public void j0(AbstractC3595n abstractC3595n, ax.c3.G g2, String str, long j, Long l, C3597p c3597p, boolean z, InterfaceC3185c interfaceC3185c, ax.g3.i iVar) throws C1495j, C1486a {
        C3184b.f();
        throw new C1495j("Not supported");
    }

    protected boolean l(AbstractC3595n abstractC3595n) {
        if (abstractC3595n.n()) {
            return false;
        }
        try {
            D(abstractC3595n, ax.c3.F.e(new byte[0]), abstractC3595n.s(), 0L, null, null, true, null, null);
            return true;
        } catch (C1486a | C1495j e2) {
            e2.printStackTrace();
            return false;
        }
    }

    abstract void m(AbstractC3595n abstractC3595n, String str, boolean z, boolean z2, ax.g3.h hVar, InterfaceC3185c interfaceC3185c) throws C1495j;

    public void n(AbstractC3595n abstractC3595n) throws C1495j {
        ax.Ha.c.h().f().b("FILL FILE SIZE").g("Loation:" + abstractC3595n.P().I()).h();
        throw new C1495j("Not supported");
    }

    void o(AbstractC3595n abstractC3595n, String str, boolean z, boolean z2, ax.g3.h hVar, InterfaceC3185c interfaceC3185c) {
        List<AbstractC3595n> b0;
        Stack stack = new Stack();
        stack.push(abstractC3595n);
        while (!stack.isEmpty()) {
            AbstractC3595n abstractC3595n2 = (AbstractC3595n) stack.pop();
            if (interfaceC3185c != null && interfaceC3185c.isCancelled()) {
                return;
            }
            try {
                if (ax.Q2.f.E0(abstractC3595n2.P(), abstractC3595n2)) {
                    b0 = ax.Z2.b.k().g(abstractC3595n2);
                    if (b0 == null) {
                        b0 = b0(abstractC3595n2);
                        ax.Z2.b.k().m(abstractC3595n2, b0);
                    }
                } else {
                    b0 = b0(abstractC3595n2);
                }
            } catch (C1495j e2) {
                e2.printStackTrace();
            }
            if (b0 == null) {
                return;
            }
            List<AbstractC3595n> g2 = C1829q.g(b0, C1829q.c("Search"));
            boolean P = C1809B.P(abstractC3595n2);
            List<AbstractC3595n> h = C1809B.h(g2, str, z, P);
            if (z2) {
                for (AbstractC3595n abstractC3595n3 : C1809B.h(g2, null, z, P)) {
                    if (abstractC3595n3.isDirectory() && !J.j2(abstractC3595n2)) {
                        stack.push(abstractC3595n3);
                    }
                }
            }
            boolean isEmpty = stack.isEmpty();
            if ((h != null && !h.isEmpty()) || isEmpty) {
                hVar.Y(h, isEmpty);
            }
        }
    }

    public Context p() {
        return this.a;
    }

    public long q() throws C1495j {
        k0 y;
        if (!Y() || (y = y()) == null || y.b == 0) {
            return -1L;
        }
        long j = y.d;
        if (j >= 0) {
            return j;
        }
        return -1L;
    }

    public String r() {
        return this.b.e();
    }

    public ax.c3.G s(AbstractC3595n abstractC3595n) {
        return new e(abstractC3595n);
    }

    public int t() {
        return this.b.b();
    }

    public ax.Q2.f u() {
        return this.b.d();
    }

    public ax.c3.K v() {
        return this.b;
    }

    protected InputStream w(String str, String str2) {
        InputStream inputStream;
        if (!a() || this.c.contains(str2)) {
            return null;
        }
        String k = d0.k(str2);
        EnumC1837z g2 = C1808A.g(k);
        try {
            if (g2 != EnumC1837z.IMAGE) {
                if (g2 != EnumC1837z.VIDEO) {
                    String g3 = C1833v.g(k, HttpUrl.FRAGMENT_ENCODE_SET);
                    if (!C1808A.I(g3) && !C1808A.U(g3)) {
                        C3184b.f();
                    }
                } else if (ax.X2.Q.r0()) {
                    inputStream = U(str2);
                }
                inputStream = null;
            } else if (C1808A.S(k)) {
                inputStream = C2946c.e(R(str2), (int) (C3180B.s(p()) * 128.0f));
                if (inputStream == null) {
                    inputStream = C2945b.n();
                }
            } else {
                inputStream = R(str2);
            }
            if (inputStream == null) {
                this.c.add(str2);
            }
            return inputStream;
        } catch (C1486a unused) {
            return null;
        }
    }

    public String x() {
        return this.b.e();
    }

    public k0 y() throws C1495j {
        return null;
    }
}
