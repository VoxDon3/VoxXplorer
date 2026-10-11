package ax.E8;

import ax.y8.AbstractC3515d;
import ax.y8.AbstractC3516e;
import ax.y8.C3513b;
import ax.y8.C3514c;
import ax.z8.InterfaceC3557a;
import ax.z8.InterfaceC3558b;
import java.io.IOException;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class b extends f<BigInteger> {
    private final BigInteger d0;

    /* renamed from: ax.E8.b$b, reason: collision with other inner class name */
    public static class C0076b extends AbstractC3515d<b> {
        public C0076b(InterfaceC3557a interfaceC3557a) {
            super(interfaceC3557a);
        }

        @Override // ax.y8.AbstractC3515d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(ax.C8.c<b> cVar, byte[] bArr) throws C3514c {
            return new b(new BigInteger(bArr), bArr);
        }
    }

    public static class c extends AbstractC3516e<b> {
        public c(InterfaceC3558b interfaceC3558b) {
            super(interfaceC3558b);
        }

        private void c(b bVar) {
            bVar.c0 = bVar.d0.toByteArray();
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(b bVar, C3513b c3513b) throws IOException {
            if (bVar.c0 == null) {
                c(bVar);
            }
            c3513b.write(bVar.c0);
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public int b(b bVar) {
            if (bVar.c0 == null) {
                c(bVar);
            }
            return bVar.c0.length;
        }
    }

    @Override // ax.C8.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public BigInteger g() {
        return this.d0;
    }

    public b(BigInteger bigInteger) {
        super(ax.C8.c.l);
        this.d0 = bigInteger;
    }

    private b(BigInteger bigInteger, byte[] bArr) {
        super(ax.C8.c.l, bArr);
        this.d0 = bigInteger;
    }
}
