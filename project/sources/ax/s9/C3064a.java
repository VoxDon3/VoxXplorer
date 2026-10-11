package ax.s9;

import ax.N8.o;
import ax.N8.p;
import ax.R8.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: ax.s9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3064a extends AbstractC3065b implements Iterable<ax.N8.m> {

    /* renamed from: ax.s9.a$a, reason: collision with other inner class name */
    private class C0452a<F extends ax.N8.h> implements Iterator<F> {
        private Iterator<F> c0;
        private byte[] d0;
        private F e0;
        private String f0;
        private final o.a<F> q;

        C0452a(Class<F> cls, String str) {
            this.q = p.k(cls);
            this.f0 = str;
            e(true);
            this.e0 = c();
        }

        private F c() {
            while (true) {
                Iterator<F> it = this.c0;
                if (it == null) {
                    return null;
                }
                if (it.hasNext()) {
                    return this.c0.next();
                }
                e(false);
            }
        }

        private void e(boolean z) {
            byte[] bArr;
            ax.R8.o u = ((C3066c) C3064a.this.c0).u(C3064a.this.d0, z ? EnumSet.of(n.a.SMB2_RESTART_SCANS) : EnumSet.noneOf(n.a.class), this.q.a(), this.f0);
            long m = u.c().m();
            byte[] n = u.n();
            if (m == ax.K8.a.STATUS_NO_MORE_FILES.getValue() || m == ax.K8.a.STATUS_NO_SUCH_FILE.getValue() || ((bArr = this.d0) != null && Arrays.equals(bArr, n))) {
                this.c0 = null;
                this.d0 = null;
            } else {
                this.d0 = n;
                this.c0 = p.j(n, this.q);
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public F next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            F f = this.e0;
            this.e0 = c();
            return f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.e0 != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    C3064a(ax.Q8.i iVar, C3066c c3066c, ax.k9.e eVar) {
        super(iVar, c3066c, eVar);
    }

    public <F extends ax.N8.h> Iterator<F> F0(Class<F> cls) {
        return L0(cls, null);
    }

    public <F extends ax.N8.h> Iterator<F> L0(Class<F> cls, String str) {
        return new C0452a(cls, str);
    }

    public <F extends ax.N8.h> List<F> M0(Class<F> cls, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<F> L0 = L0(cls, str);
        while (L0.hasNext()) {
            arrayList.add(L0.next());
        }
        return arrayList;
    }

    @Override // java.lang.Iterable
    public Iterator<ax.N8.m> iterator() {
        return F0(ax.N8.m.class);
    }

    public String toString() {
        return String.format("Directory{fileId=%s, fileName='%s'}", this.d0, this.e0.h());
    }

    public ax.Q8.i u0() {
        return this.d0;
    }
}
