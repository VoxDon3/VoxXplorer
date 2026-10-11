package ax.E8;

import ax.y8.AbstractC3515d;
import ax.y8.AbstractC3516e;
import ax.y8.C3513b;
import ax.z8.InterfaceC3557a;
import ax.z8.InterfaceC3558b;
import java.io.IOException;

/* loaded from: classes3.dex */
public class d extends f<Void> {
    private static final byte[] d0 = new byte[0];

    public static class a extends AbstractC3515d<d> {
        public a(InterfaceC3557a interfaceC3557a) {
            super(interfaceC3557a);
        }

        @Override // ax.y8.AbstractC3515d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(ax.C8.c<d> cVar, byte[] bArr) {
            ax.G8.a.b(bArr.length == 0, "ASN.1 NULL can not have a value", new Object[0]);
            return new d();
        }
    }

    public d() {
        super(ax.C8.c.j, d0);
    }

    @Override // ax.C8.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Void g() {
        return null;
    }

    public static class b extends AbstractC3516e<d> {
        public b(InterfaceC3558b interfaceC3558b) {
            super(interfaceC3558b);
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(d dVar) {
            return 0;
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(d dVar, C3513b c3513b) throws IOException {
        }
    }
}
