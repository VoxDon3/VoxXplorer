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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public class b extends ax.C8.b<Set<ax.C8.b>> implements Iterable {
    private final Set<ax.C8.b> c0;
    private byte[] d0;

    /* renamed from: ax.D8.b$b, reason: collision with other inner class name */
    public static class C0069b extends AbstractC3515d<b> {
        public C0069b(InterfaceC3557a interfaceC3557a) {
            super(interfaceC3557a);
        }

        @Override // ax.y8.AbstractC3515d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(ax.C8.c<b> cVar, byte[] bArr) throws C3514c {
            HashSet hashSet = new HashSet();
            try {
                C3512a c3512a = new C3512a(this.a, bArr);
                try {
                    Iterator<ax.C8.b> it = c3512a.iterator();
                    while (it.hasNext()) {
                        hashSet.add(it.next());
                    }
                    c3512a.close();
                    return new b(hashSet, bArr);
                } finally {
                }
            } catch (IOException e) {
                throw new C3514c(e, "Could not parse ASN.1 SET contents.", new Object[0]);
            }
        }
    }

    public static class c extends AbstractC3516e<b> {
        public c(InterfaceC3558b interfaceC3558b) {
            super(interfaceC3558b);
        }

        private void c(b bVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C3513b c3513b = new C3513b(this.a, byteArrayOutputStream);
            Iterator<ax.C8.b> it = bVar.iterator();
            while (it.hasNext()) {
                c3513b.c(it.next());
            }
            bVar.d0 = byteArrayOutputStream.toByteArray();
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(b bVar, C3513b c3513b) throws IOException {
            if (bVar.d0 != null) {
                c3513b.write(bVar.d0);
                return;
            }
            Iterator<ax.C8.b> it = bVar.iterator();
            while (it.hasNext()) {
                c3513b.c(it.next());
            }
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public int b(b bVar) throws IOException {
            if (bVar.d0 == null) {
                c(bVar);
            }
            return bVar.d0.length;
        }
    }

    @Override // java.lang.Iterable
    public Iterator<ax.C8.b> iterator() {
        return new HashSet(this.c0).iterator();
    }

    @Override // ax.C8.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Set<ax.C8.b> g() {
        return new HashSet(this.c0);
    }

    private b(Set<ax.C8.b> set, byte[] bArr) {
        super(ax.C8.c.m);
        this.c0 = set;
        this.d0 = bArr;
    }
}
