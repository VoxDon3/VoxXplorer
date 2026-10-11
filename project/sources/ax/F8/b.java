package ax.F8;

import ax.y8.AbstractC3515d;
import ax.y8.AbstractC3516e;
import ax.y8.C3513b;
import ax.y8.C3514c;
import ax.z8.InterfaceC3557a;
import ax.z8.InterfaceC3558b;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class b extends c<byte[]> {

    public static class a extends AbstractC3515d<b> {
        public a(InterfaceC3557a interfaceC3557a) {
            super(interfaceC3557a);
        }

        @Override // ax.y8.AbstractC3515d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(ax.C8.c<b> cVar, byte[] bArr) throws C3514c {
            return new b(cVar, bArr);
        }
    }

    /* renamed from: ax.F8.b$b, reason: collision with other inner class name */
    public static class C0082b extends AbstractC3516e<b> {
        public C0082b(InterfaceC3558b interfaceC3558b) {
            super(interfaceC3558b);
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(b bVar, C3513b c3513b) throws IOException {
            c3513b.write(bVar.c0);
        }

        @Override // ax.y8.AbstractC3516e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(b bVar) throws IOException {
            return bVar.c0.length;
        }
    }

    public b(byte[] bArr) {
        super(ax.C8.c.i, bArr);
    }

    @Override // ax.C8.b
    protected String h() {
        return Arrays.toString(this.c0);
    }

    @Override // ax.C8.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public byte[] g() {
        byte[] bArr = this.c0;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public b(ax.C8.c<?> cVar, byte[] bArr) {
        super(cVar, bArr);
    }
}
