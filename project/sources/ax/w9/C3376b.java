package ax.w9;

import ax.Z8.a;
import ax.y8.C3512a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ax.w9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3376b extends f {
    private List<ax.E8.e> c;
    protected byte[] d;

    public C3376b() {
        super(0, "NegTokenInit");
        this.c = new ArrayList();
    }

    private void e(List<ax.C8.b> list) {
        byte[] bArr = this.d;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        list.add(new ax.D8.c(ax.C8.c.d(2).c(), (ax.C8.b) new ax.F8.b(this.d), true));
    }

    private void f(List<ax.C8.b> list) {
        if (this.c.size() > 0) {
            list.add(new ax.D8.c(ax.C8.c.d(0).c(), (ax.C8.b) new ax.D8.a(new ArrayList(this.c)), true));
        }
    }

    private C3376b i(ax.Z8.a<?> aVar) throws e {
        try {
            C3512a c3512a = new C3512a(new ax.B8.a(), aVar.b());
            try {
                ax.D8.c cVar = (ax.D8.c) c3512a.g();
                if (cVar.e().g() != ax.C8.d.APPLICATION) {
                    throw new e("Incorrect GSS-API ASN.1 token received, expected to find an [APPLICATION 0], not: " + cVar);
                }
                ax.D8.a aVar2 = (ax.D8.a) cVar.q(ax.C8.c.n);
                ax.C8.b l = aVar2.l(0);
                if (l instanceof ax.E8.e) {
                    a(aVar2.l(1));
                    c3512a.close();
                    return this;
                }
                throw new e("Expected to find the SPNEGO OID (" + d.a + "), not: " + l);
            } finally {
            }
        } catch (IOException e) {
            throw new e("Could not read NegTokenInit from buffer", e);
        }
    }

    @Override // ax.w9.f
    protected void b(ax.D8.c cVar) throws e {
        if (cVar.p().toString().contains("not_defined_in_RFC4178@please_ignore")) {
            return;
        }
        int r = cVar.r();
        if (r == 0) {
            l(cVar.p());
            return;
        }
        if (r != 1) {
            if (r == 2) {
                k(cVar.p());
            } else {
                if (r == 3) {
                    return;
                }
                throw new e("Unknown Object Tag " + cVar.r() + " encountered.");
            }
        }
    }

    @Override // ax.w9.f
    public void c(ax.Z8.a<?> aVar) throws e {
        try {
            ArrayList arrayList = new ArrayList();
            f(arrayList);
            e(arrayList);
            d(aVar, new ax.D8.a(arrayList));
        } catch (IOException e) {
            throw new e("Unable to write NegTokenInit", e);
        }
    }

    public void g(ax.E8.e eVar) {
        this.c.add(eVar);
    }

    public List<ax.E8.e> h() {
        return this.c;
    }

    public C3376b j(byte[] bArr) throws e {
        return i(new a.c(bArr, ax.Z8.b.b));
    }

    void k(ax.C8.b<?> bVar) throws e {
        if (bVar instanceof ax.F8.b) {
            this.d = ((ax.F8.b) bVar).g();
            return;
        }
        throw new e("Expected the MechToken (OCTET_STRING) contents, not: " + bVar);
    }

    void l(ax.C8.b<?> bVar) throws e {
        if (!(bVar instanceof ax.D8.a)) {
            throw new e("Expected the MechTypeList (SEQUENCE) contents, not: " + bVar);
        }
        Iterator<ax.C8.b> it = ((ax.D8.a) bVar).iterator();
        while (it.hasNext()) {
            ax.C8.b next = it.next();
            if (!(next instanceof ax.E8.e)) {
                throw new e("Expected a MechType (OBJECT IDENTIFIER) as contents of the MechTypeList, not: " + next);
            }
            this.c.add((ax.E8.e) next);
        }
    }

    public void m(byte[] bArr) {
        this.d = bArr;
    }
}
