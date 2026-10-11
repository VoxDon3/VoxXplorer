package ax.c3;

import ax.u3.C3184b;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3583b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* renamed from: ax.c3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1813a extends AbstractC3595n {
    private ax.Dc.I k0;
    private String l0;
    private List<C1813a> m0;
    private File n0;
    private C1813a o0;
    private String p0;
    private String q0;
    private boolean r0;

    public C1813a(C3583b c3583b, ax.Dc.I i, C1813a c1813a) {
        super(c3583b);
        if (c1813a == null) {
            C3184b.c("/".equals(i.getName()));
        }
        this.o0 = c1813a;
        this.k0 = i;
        this.p0 = d0.h(d0.U(i.getName()));
        if (i.isDirectory()) {
            this.m0 = new ArrayList();
        }
        g0();
        this.r0 = c3583b.D0();
    }

    private void g0() {
        this.l0 = C1833v.e(this, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String C() {
        return d0.h(F());
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String F() {
        if (!n()) {
            return this.q0;
        }
        C1813a c1813a = this.o0;
        return c1813a == null ? d0.Q(d0.a, this.p0) : d0.Q(c1813a.E(), this.p0);
    }

    @Override // com.voxdon.xplorer.file.AbstractC3595n
    public String U() {
        return d0.r(F());
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean d() {
        return n();
    }

    public void e0(C1813a c1813a) {
        if (this.m0 == null) {
            this.m0 = new ArrayList();
        }
        synchronized (this.m0) {
            try {
                Iterator<C1813a> it = this.m0.iterator();
                while (it.hasNext()) {
                    if (it.next().E().equals(c1813a.E())) {
                        it.remove();
                    }
                }
                this.m0.add(c1813a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC3595n abstractC3595n) {
        return E().compareTo(abstractC3595n.E());
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean h() {
        return false;
    }

    public C1813a h0(String str) {
        List<C1813a> list = this.m0;
        if (list == null) {
            return null;
        }
        synchronized (list) {
            try {
                for (C1813a c1813a : this.m0) {
                    if (str.equals(c1813a.B())) {
                        return c1813a;
                    }
                }
                return null;
            } finally {
            }
        }
    }

    public List<C1813a> i0() {
        return this.m0;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean isDirectory() {
        return this.m0 != null;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean j() {
        if (this.r0) {
            return n();
        }
        return false;
    }

    public List<AbstractC3595n> j0() {
        ArrayList arrayList;
        List<C1813a> list = this.m0;
        if (list == null) {
            return new ArrayList();
        }
        synchronized (list) {
            arrayList = new ArrayList(this.m0);
        }
        return arrayList;
    }

    public String k0() {
        return this.p0;
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean l() {
        return false;
    }

    public ax.Dc.I l0() {
        return this.k0;
    }

    public void m0(C1813a c1813a) {
        List<C1813a> list = this.m0;
        if (list == null) {
            return;
        }
        synchronized (list) {
            this.m0.remove(c1813a);
        }
    }

    @Override // ax.c3.InterfaceC1814b
    public boolean n() {
        return this.k0 != null;
    }

    public void n0() {
        C3184b.a(n());
        this.m0 = new ArrayList();
    }

    public void o0(File file) {
        this.n0 = file;
    }

    @Override // ax.c3.InterfaceC1814b
    public long p() {
        ax.Dc.I i = this.k0;
        if (i == null) {
            return 0L;
        }
        File file = this.n0;
        return file != null ? file.length() : i.getSize();
    }

    public void p0(C1813a c1813a) {
        this.o0 = c1813a;
    }

    @Override // ax.c3.InterfaceC1814b
    public long q() {
        ax.Dc.U n;
        File file = this.n0;
        if (file != null) {
            return file.lastModified();
        }
        ax.Dc.I i = this.k0;
        if (i == null) {
            return -1L;
        }
        ax.Dc.N n2 = i.n(new ax.Dc.W(21589));
        return (!(n2 instanceof ax.Dc.D) || (n = ((ax.Dc.D) n2).n()) == null) ? this.k0.getTime() : n.d() * 1000;
    }

    public void q0() {
        List<C1813a> list = this.m0;
        if (list == null) {
            return;
        }
        synchronized (list) {
            try {
                Iterator<C1813a> it = this.m0.iterator();
                while (it.hasNext()) {
                    it.next().p0(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.c3.InterfaceC1814b
    public int r(boolean z) {
        if (!isDirectory()) {
            return -2;
        }
        List<C1813a> list = this.m0;
        if (list != null) {
            return list.size();
        }
        return -1;
    }

    @Override // ax.c3.InterfaceC1814b
    public String s() {
        return this.l0;
    }

    @Override // ax.c3.InterfaceC1814b
    public String t() {
        return C3583b.g1(F(), isDirectory());
    }

    public C1813a(C3583b c3583b, C1813a c1813a, ax.Dc.I i, List<C1813a> list, String str) {
        super(c3583b);
        if (c1813a == null) {
            C3184b.c("/".equals(i.getName()));
        }
        this.o0 = c1813a;
        this.k0 = i;
        this.p0 = str;
        this.m0 = list;
        g0();
        this.r0 = c3583b.D0();
    }

    public C1813a(C3583b c3583b, String str) {
        super(c3583b);
        this.q0 = str;
        g0();
        this.r0 = c3583b.D0();
    }
}
