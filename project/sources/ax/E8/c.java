package ax.E8;

import ax.y8.AbstractC3515d;
import ax.y8.AbstractC3516e;
import ax.y8.C3513b;
import ax.z8.InterfaceC3557a;
import ax.z8.InterfaceC3558b;
import java.io.IOException;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class c extends f<BigInteger> {
    private BigInteger d0;

    public static class b extends AbstractC3515d<c> {
        public b(InterfaceC3557a interfaceC3557a) {
            super(interfaceC3557a);
        }

        @Override // ax.y8.AbstractC3515d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(ax.C8.c<c> cVar, byte[] bArr) {
            return new c(bArr, new BigInteger(bArr));
        }
    }

    /* renamed from: ax.E8.c$c, reason: collision with other inner class name */
    public static class C0077c extends AbstractC3516e<c> {
        public C0077c(InterfaceC3558b interfaceC3558b) {
            super(interfaceC3558b);
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(c cVar, C3513b c3513b) throws IOException {
            c3513b.write(cVar.c0);
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(c cVar) {
            return cVar.c0.length;
        }
    }

    @Override // ax.C8.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public BigInteger g() {
        return this.d0;
    }

    private c(byte[] bArr, BigInteger bigInteger) {
        super(ax.C8.c.g, bArr);
        this.d0 = bigInteger;
    }
}
