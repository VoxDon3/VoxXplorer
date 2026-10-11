package ax.D8;

import ax.y8.AbstractC3515d;
import ax.y8.AbstractC3516e;
import ax.y8.C3512a;
import ax.y8.C3513b;
import ax.y8.C3514c;
import ax.z8.InterfaceC3557a;
import ax.z8.InterfaceC3558b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class c extends ax.C8.b<ax.C8.b> implements Iterable {
    private final ax.C8.b c0;
    private byte[] d0;
    private InterfaceC3557a e0;
    private boolean f0;

    public static class b extends AbstractC3515d<c> {
        public b(InterfaceC3557a interfaceC3557a) {
            super(interfaceC3557a);
        }

        @Override // ax.y8.AbstractC3515d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(ax.C8.c<c> cVar, byte[] bArr) {
            return new c(cVar, bArr, this.a);
        }
    }

    /* renamed from: ax.D8.c$c, reason: collision with other inner class name */
    public static class C0070c extends AbstractC3516e<c> {
        public C0070c(InterfaceC3558b interfaceC3558b) {
            super(interfaceC3558b);
        }

        private void c(c cVar) throws IOException {
            ax.C8.b bVar = cVar.c0;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C3513b c3513b = new C3513b(this.a, byteArrayOutputStream);
            try {
                if (cVar.f0) {
                    c3513b.c(bVar);
                } else {
                    bVar.e().k(this.a).a(bVar, c3513b);
                }
                cVar.d0 = byteArrayOutputStream.toByteArray();
                c3513b.close();
            } catch (Throwable th) {
                try {
                    c3513b.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(c cVar, C3513b c3513b) throws IOException {
            if (cVar.d0 == null) {
                c(cVar);
            }
            c3513b.write(cVar.d0);
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public int b(c cVar) throws IOException {
            if (cVar.d0 == null) {
                c(cVar);
            }
            return cVar.d0.length;
        }
    }

    @Override // java.lang.Iterable
    public Iterator<ax.C8.b> iterator() {
        return ((ax.D8.a) q(ax.C8.c.n)).iterator();
    }

    public ax.C8.b p() {
        ax.C8.b bVar = this.c0;
        if (bVar != null) {
            return bVar;
        }
        try {
            C3512a c3512a = new C3512a(this.e0, this.d0);
            try {
                ax.C8.b g = c3512a.g();
                c3512a.close();
                return g;
            } catch (Throwable th) {
                try {
                    c3512a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (C3514c e) {
            throw new C3514c(e, "Unable to parse the explicit Tagged Object with %s, it might be implicit", this.q);
        } catch (IOException e2) {
            throw new C3514c(e2, "Could not parse the inputstream", new Object[0]);
        }
    }

    public <T extends ax.C8.b> T q(ax.C8.c<T> cVar) {
        ax.C8.b bVar = this.c0;
        if (bVar != null && bVar.e().equals(cVar)) {
            return (T) this.c0;
        }
        if (this.c0 != null || this.d0 == null) {
            throw new C3514c("Unable to parse the implicit Tagged Object with %s, it is explicit", cVar);
        }
        return cVar.j(this.e0).a(cVar, this.d0);
    }

    public int r() {
        return this.q.h();
    }

    @Override // ax.C8.b
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public ax.C8.b g() {
        return p();
    }

    @Override // ax.C8.b
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        sb.append(this.q);
        if (this.c0 != null) {
            sb.append(",");
            sb.append(this.c0);
        } else {
            sb.append(",<unknown>");
        }
        sb.append("]");
        return sb.toString();
    }

    public c(ax.C8.c cVar, ax.C8.b bVar, boolean z) {
        super(z ? cVar.c() : cVar.b(bVar.e().f()));
        this.c0 = bVar;
        this.f0 = z;
        this.d0 = null;
    }

    public c(ax.C8.c cVar, ax.C8.b bVar) {
        this(cVar, bVar, true);
    }

    private c(ax.C8.c cVar, byte[] bArr, InterfaceC3557a interfaceC3557a) {
        super(cVar);
        this.f0 = true;
        this.d0 = bArr;
        this.e0 = interfaceC3557a;
        this.c0 = null;
    }
}
