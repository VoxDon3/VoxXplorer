package ax.E8;

import ax.y8.AbstractC3515d;
import ax.y8.AbstractC3516e;
import ax.y8.C3513b;
import ax.z8.InterfaceC3557a;
import ax.z8.InterfaceC3558b;
import java.io.IOException;

/* loaded from: classes3.dex */
public class a extends f<Boolean> {
    private boolean d0;

    public static class b extends AbstractC3515d<a> {
        public b(InterfaceC3557a interfaceC3557a) {
            super(interfaceC3557a);
        }

        @Override // ax.y8.AbstractC3515d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(ax.C8.c<a> cVar, byte[] bArr) {
            ax.G8.a.b(bArr.length == 1, "Value of ASN1Boolean should have length 1, but was %s", Integer.valueOf(bArr.length));
            return new a(bArr, bArr[0] != 0);
        }
    }

    public static class c extends AbstractC3516e<a> {
        public c(InterfaceC3558b interfaceC3558b) {
            super(interfaceC3558b);
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(a aVar, C3513b c3513b) throws IOException {
            c3513b.write(aVar.d0 ? 1 : 0);
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(a aVar) {
            return 1;
        }
    }

    @Override // ax.C8.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Boolean g() {
        return Boolean.valueOf(this.d0);
    }

    private a(byte[] bArr, boolean z) {
        super(ax.C8.c.f, bArr);
        this.d0 = z;
    }
}
