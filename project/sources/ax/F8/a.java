package ax.F8;

import ax.y8.AbstractC3515d;
import ax.y8.AbstractC3516e;
import ax.y8.C3512a;
import ax.y8.C3513b;
import ax.y8.C3514c;
import ax.z8.InterfaceC3557a;
import ax.z8.InterfaceC3558b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class a extends ax.F8.c<boolean[]> {
    private int d0;
    private boolean[] e0;

    public static class b extends AbstractC3515d<a> {
        public b(InterfaceC3557a interfaceC3557a) {
            super(interfaceC3557a);
        }

        @Override // ax.y8.AbstractC3515d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(ax.C8.c<a> cVar, byte[] bArr) {
            if (!cVar.i()) {
                return new a(cVar, Arrays.copyOfRange(bArr, 1, bArr.length), bArr[0]);
            }
            try {
                C3512a c3512a = new C3512a(this.a, bArr);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte b = 0;
                    while (c3512a.available() > 0) {
                        ax.C8.c p = c3512a.p();
                        ax.G8.a.b(p.h() == cVar.h(), "Expected an ASN.1 BIT STRING as Constructed object, got: %s", p);
                        byte[] q = c3512a.q(c3512a.e());
                        byteArrayOutputStream.write(q, 1, q.length - 1);
                        if (c3512a.available() <= 0) {
                            b = q[0];
                        }
                    }
                    a aVar = new a(cVar, byteArrayOutputStream.toByteArray(), b);
                    c3512a.close();
                    return aVar;
                } finally {
                }
            } catch (IOException e) {
                throw new C3514c(e, "Unable to parse Constructed ASN.1 BIT STRING", new Object[0]);
            }
        }
    }

    public static class c extends AbstractC3516e<a> {
        public c(InterfaceC3558b interfaceC3558b) {
            super(interfaceC3558b);
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(a aVar, C3513b c3513b) throws IOException {
            c3513b.write(aVar.d0);
            c3513b.write(aVar.c0);
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(a aVar) {
            return aVar.c0.length + 1;
        }
    }

    private boolean[] k() {
        int p = p();
        boolean[] zArr = new boolean[p];
        for (int i = 0; i < p; i++) {
            zArr[i] = n(i);
        }
        return zArr;
    }

    @Override // ax.C8.b
    protected String h() {
        return Arrays.toString(this.e0);
    }

    @Override // ax.C8.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public boolean[] g() {
        boolean[] zArr = this.e0;
        return Arrays.copyOf(zArr, zArr.length);
    }

    public boolean n(int i) {
        return ((1 << (7 - (i % 8))) & this.c0[i / 8]) != 0;
    }

    public int p() {
        return (this.c0.length * 8) - this.d0;
    }

    private a(ax.C8.c<a> cVar, byte[] bArr, int i) {
        super(cVar, bArr);
        this.d0 = i;
        this.e0 = k();
    }
}
