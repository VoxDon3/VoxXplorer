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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class a extends ax.C8.b<List<ax.C8.b>> implements Iterable {
    private final List<ax.C8.b> c0;
    private byte[] d0;

    public static class b extends AbstractC3515d<a> {
        public b(InterfaceC3557a interfaceC3557a) {
            super(interfaceC3557a);
        }

        @Override // ax.y8.AbstractC3515d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(ax.C8.c<a> cVar, byte[] bArr) throws C3514c {
            ArrayList arrayList = new ArrayList();
            try {
                C3512a c3512a = new C3512a(this.a, bArr);
                try {
                    Iterator<ax.C8.b> it = c3512a.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                    }
                    c3512a.close();
                    return new a(arrayList, bArr);
                } finally {
                }
            } catch (IOException e) {
                throw new C3514c(e, "Unable to parse the ASN.1 SEQUENCE contents.", new Object[0]);
            }
        }
    }

    public static class c extends AbstractC3516e<a> {
        public c(InterfaceC3558b interfaceC3558b) {
            super(interfaceC3558b);
        }

        private void c(a aVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C3513b c3513b = new C3513b(this.a, byteArrayOutputStream);
            Iterator<ax.C8.b> it = aVar.iterator();
            while (it.hasNext()) {
                c3513b.c(it.next());
            }
            aVar.d0 = byteArrayOutputStream.toByteArray();
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(a aVar, C3513b c3513b) throws IOException {
            if (aVar.d0 != null) {
                c3513b.write(aVar.d0);
                return;
            }
            Iterator<ax.C8.b> it = aVar.iterator();
            while (it.hasNext()) {
                c3513b.c(it.next());
            }
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public int b(a aVar) throws IOException {
            if (aVar.d0 == null) {
                c(aVar);
            }
            return aVar.d0.length;
        }
    }

    @Override // java.lang.Iterable
    public Iterator<ax.C8.b> iterator() {
        return new ArrayList(this.c0).iterator();
    }

    public ax.C8.b l(int i) {
        return this.c0.get(i);
    }

    @Override // ax.C8.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public List<ax.C8.b> g() {
        return new ArrayList(this.c0);
    }

    private a(List<ax.C8.b> list, byte[] bArr) {
        super(ax.C8.c.n);
        this.c0 = list;
        this.d0 = bArr;
    }

    public a(List<ax.C8.b> list) {
        super(ax.C8.c.n);
        this.c0 = list;
    }
}
