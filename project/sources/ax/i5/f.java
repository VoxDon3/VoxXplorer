package ax.i5;

import android.util.Log;
import ax.e5.InterfaceC1979a;
import ax.h5.AbstractC2151a;
import ax.h5.InterfaceC2155e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class f extends AbstractC2151a {
    private static String n0 = "f";
    private C2269a c0;
    private InterfaceC1979a d0;
    private C2270b e0;
    private c f0;
    private List<i> g0;
    private Map<String, i> h0 = new HashMap();
    private Map<k, g> i0 = new HashMap();
    private f j0;
    private i k0;
    private String l0;
    private boolean m0;

    private f(InterfaceC1979a interfaceC1979a, C2270b c2270b, c cVar, f fVar) {
        this.d0 = interfaceC1979a;
        this.e0 = c2270b;
        this.f0 = cVar;
        this.j0 = fVar;
    }

    private synchronized void b(i iVar, g gVar) {
        this.g0.add(iVar);
        this.h0.put(iVar.g().toLowerCase(Locale.getDefault()), iVar);
        this.i0.put(gVar.m(), gVar);
    }

    static f c(i iVar, InterfaceC1979a interfaceC1979a, C2270b c2270b, c cVar, f fVar) {
        f fVar2 = new f(interfaceC1979a, c2270b, cVar, fVar);
        fVar2.k0 = iVar;
        return fVar2;
    }

    private void f() throws IOException {
        if (this.c0 == null) {
            this.c0 = new C2269a(this.k0.i(), this.d0, this.e0, this.f0);
        }
        if (this.c0.c() > 16777216) {
            throw new com.github.mjdev.libaums.a("Too large chain length for directory : " + this.c0.c());
        }
        if (this.g0 == null) {
            this.g0 = new ArrayList();
        }
        if (this.g0.size() == 0 && !this.m0) {
            j();
        }
        this.m0 = true;
    }

    private void j() throws IOException {
        g D;
        try {
            ByteBuffer allocate = ByteBuffer.allocate((int) this.c0.c());
            this.c0.d(0L, allocate);
            ArrayList arrayList = new ArrayList();
            allocate.flip();
            while (allocate.remaining() > 0 && (D = g.D(allocate)) != null) {
                if (D.w()) {
                    arrayList.add(D);
                } else if (D.C()) {
                    if (!q0()) {
                        Log.w(n0, "volume label in non root dir!");
                    }
                    this.l0 = D.r();
                    Log.d(n0, "volume label: " + this.l0);
                } else if (D.s()) {
                    arrayList.clear();
                } else {
                    b(i.k(D, arrayList), D);
                    arrayList.clear();
                }
            }
        } catch (OutOfMemoryError e) {
            throw new IOException(e);
        }
    }

    static f m(InterfaceC1979a interfaceC1979a, C2270b c2270b, c cVar) throws IOException {
        f fVar = new f(interfaceC1979a, c2270b, cVar, null);
        fVar.c0 = new C2269a(cVar.h(), interfaceC1979a, c2270b, cVar);
        fVar.f();
        return fVar;
    }

    @Override // ax.h5.InterfaceC2155e
    public InterfaceC2155e[] B0() throws IOException {
        f();
        ArrayList arrayList = new ArrayList(this.g0.size());
        for (int i = 0; i < this.g0.size(); i++) {
            i iVar = this.g0.get(i);
            String g = iVar.g();
            if (!g.equals(".") && !g.equals("..")) {
                if (iVar.j()) {
                    arrayList.add(c(iVar, this.d0, this.e0, this.f0, this));
                } else {
                    arrayList.add(h.b(iVar, this.d0, this.e0, this.f0, this));
                }
            }
        }
        return (InterfaceC2155e[]) arrayList.toArray(new InterfaceC2155e[arrayList.size()]);
    }

    @Override // ax.h5.InterfaceC2155e
    public void R0(long j) {
        if (q0()) {
            return;
        }
        this.k0.c().K(j);
    }

    @Override // ax.h5.InterfaceC2155e
    public String W0() {
        i iVar = this.k0;
        return iVar != null ? iVar.f() : "null entry";
    }

    @Override // ax.h5.InterfaceC2155e
    public void X0(InterfaceC2155e interfaceC2155e) throws IOException {
        if (q0()) {
            throw new IllegalStateException("cannot move root dir!");
        }
        if (!interfaceC2155e.isDirectory()) {
            throw new IllegalStateException("destination cannot be a file!");
        }
        if (!(interfaceC2155e instanceof f)) {
            throw new IllegalStateException("cannot move between different filesystems!");
        }
        f fVar = (f) interfaceC2155e;
        if (fVar.h0.containsKey(this.k0.g().toLowerCase(Locale.getDefault()))) {
            throw new IOException("item already exists in destination!");
        }
        f();
        fVar.f();
        this.j0.o(this.k0);
        i iVar = this.k0;
        fVar.b(iVar, iVar.c());
        this.j0.q();
        fVar.q();
        this.j0 = fVar;
    }

    @Override // ax.h5.InterfaceC2155e
    public String[] c0() throws IOException {
        f();
        ArrayList arrayList = new ArrayList(this.g0.size());
        for (int i = 0; i < this.g0.size(); i++) {
            String g = this.g0.get(i).g();
            if (!g.equals(".") && !g.equals("..")) {
                arrayList.add(g);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // ax.h5.InterfaceC2155e, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw new UnsupportedOperationException("This is a directory!");
    }

    @Override // ax.h5.InterfaceC2155e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public synchronized f n(String str) throws IOException {
        f c;
        if (this.h0.containsKey(str.toLowerCase(Locale.getDefault()))) {
            throw new IOException("Item already exists!");
        }
        f();
        k c2 = l.c(str, this.i0.keySet());
        i b = i.b(str, c2);
        b.m();
        long longValue = this.e0.a(new Long[0], 1)[0].longValue();
        b.r(longValue);
        Log.d(n0, "adding entry: " + b + " with short name: " + c2);
        b(b, b.c());
        q();
        c = c(b, this.d0, this.e0, this.f0, this);
        c.m0 = true;
        c.g0 = new ArrayList();
        i b2 = i.b(null, new k(".", HttpUrl.FRAGMENT_ENCODE_SET));
        b2.m();
        b2.r(longValue);
        i.a(b, b2);
        c.b(b2, b2.c());
        i b3 = i.b(null, new k("..", HttpUrl.FRAGMENT_ENCODE_SET));
        b3.m();
        b3.r(q0() ? 0L : b.i());
        i.a(b, b3);
        c.b(b3, b3.c());
        c.q();
        return c;
    }

    @Override // ax.h5.InterfaceC2155e
    public void delete() throws IOException {
        if (q0()) {
            throw new IllegalStateException("Root dir cannot be deleted!");
        }
        f();
        InterfaceC2155e[] B0 = B0();
        if (B0 != null && B0.length > 0) {
            throw new IOException("Can't delete directory. SubElements exists");
        }
        this.j0.f();
        this.j0.o(this.k0);
        this.j0.q();
        this.c0.f(0L);
    }

    @Override // ax.h5.InterfaceC2155e
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized h p0(String str) throws IOException {
        i b;
        if (this.h0.containsKey(str.toLowerCase(Locale.getDefault()))) {
            throw new IOException("Item already exists!");
        }
        f();
        k c = l.c(str, this.i0.keySet());
        b = i.b(str, c);
        b.r(this.e0.a(new Long[0], 1)[0].longValue());
        Log.d(n0, "adding entry: " + b + " with short name: " + c);
        b(b, b.c());
        q();
        return h.b(b, this.d0, this.e0, this.f0, this);
    }

    void g(i iVar, InterfaceC2155e interfaceC2155e) throws IOException {
        if (!interfaceC2155e.isDirectory()) {
            throw new IllegalStateException("destination cannot be a file!");
        }
        if (!(interfaceC2155e instanceof f)) {
            throw new IllegalStateException("cannot move between different filesystems!");
        }
        f fVar = (f) interfaceC2155e;
        if (fVar.h0.containsKey(iVar.g().toLowerCase(Locale.getDefault()))) {
            throw new IOException("item already exists in destination!");
        }
        f();
        fVar.f();
        o(iVar);
        fVar.b(iVar, iVar.c());
        q();
        fVar.q();
    }

    @Override // ax.h5.InterfaceC2155e
    public long getLength() {
        return 0L;
    }

    @Override // ax.h5.InterfaceC2155e
    public String getName() {
        i iVar = this.k0;
        return iVar != null ? iVar.g() : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    @Override // ax.h5.InterfaceC2155e
    public InterfaceC2155e getParent() {
        return this.j0;
    }

    @Override // ax.h5.InterfaceC2155e
    public long h() {
        if (q0()) {
            return 0L;
        }
        return this.k0.c().l();
    }

    @Override // ax.h5.InterfaceC2155e
    public void i(long j, ByteBuffer byteBuffer) throws IOException {
        throw new UnsupportedOperationException("This is a directory!");
    }

    @Override // ax.h5.InterfaceC2155e
    public boolean isDirectory() {
        return true;
    }

    @Override // ax.h5.InterfaceC2155e
    public void l(long j, ByteBuffer byteBuffer) throws IOException {
        throw new UnsupportedOperationException("This is a directory!");
    }

    synchronized void o(i iVar) {
        this.g0.remove(iVar);
        this.h0.remove(iVar.g().toLowerCase(Locale.getDefault()));
        this.i0.remove(iVar.c().m());
    }

    synchronized void p(i iVar, String str) throws IOException {
        if (iVar.g().equals(str)) {
            return;
        }
        o(iVar);
        iVar.q(str, l.c(str, this.i0.keySet()));
        b(iVar, iVar.c());
        q();
    }

    synchronized void q() throws IOException {
        try {
            f();
            int i = 0;
            boolean z = q0() && this.l0 != null;
            Iterator<i> it = this.g0.iterator();
            while (it.hasNext()) {
                i += it.next().d();
            }
            if (z) {
                i++;
            }
            long j = i * 32;
            if (j != 0) {
                this.c0.f(j);
            } else {
                this.c0.f(32L);
            }
            ByteBuffer allocate = ByteBuffer.allocate((int) this.c0.c());
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            if (z) {
                g.c(this.l0).E(allocate);
            }
            Iterator<i> it2 = this.g0.iterator();
            while (it2.hasNext()) {
                it2.next().l(allocate);
            }
            if (j % this.f0.a() != 0 || j == 0) {
                allocate.put(new byte[allocate.remaining()]);
            }
            allocate.flip();
            this.c0.g(0L, allocate);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ax.h5.InterfaceC2155e
    public boolean q0() {
        return this.k0 == null;
    }

    @Override // ax.h5.InterfaceC2155e
    public void w0(String str) throws IOException {
        if (q0()) {
            throw new IllegalStateException("Cannot rename root dir!");
        }
        this.j0.p(this.k0, str);
    }

    @Override // ax.h5.InterfaceC2155e
    public String z() {
        i iVar = this.k0;
        return iVar != null ? iVar.h() : "null entry";
    }
}
