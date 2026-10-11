package ax.j9;

import ax.W8.i;
import ax.d9.g;
import ax.h9.C2171b;
import ax.i9.C2292d;
import ax.l9.C2484b;
import ax.w9.C3376b;
import ax.y8.C3513b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ax.j9.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2343f implements InterfaceC2340c {
    private static final ax.Xd.d g = ax.Xd.f.k(C2343f.class);
    private static final byte[] h;
    private static final byte[] i;
    private C2342e a;
    private g b;
    private byte[] c;
    private byte[] d;
    private AtomicInteger e = new AtomicInteger(0);
    private List<ax.E8.e> f;

    static {
        Charset charset = StandardCharsets.US_ASCII;
        h = "session key to client-to-server signing key magic constant\u0000".getBytes(charset);
        i = "session key to client-to-server sealing key magic constant\u0000".getBytes(charset);
    }

    public C2343f(C2342e c2342e) {
        this.a = c2342e;
    }

    private byte[] d(List<ax.E8.e> list) throws IOException {
        ax.D8.a aVar = new ax.D8.a(new ArrayList(list));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C3513b c3513b = new C3513b(new ax.B8.b(), byteArrayOutputStream);
        try {
            c3513b.c(aVar);
            c3513b.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                c3513b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private byte[] e(byte[] bArr, Set<ax.W8.e> set, i iVar) {
        if (set.contains(ax.W8.e.NTLMSSP_NEGOTIATE_EXTENDED_SESSIONSECURITY)) {
            if (!set.contains(ax.W8.e.NTLMSSP_NEGOTIATE_128)) {
                bArr = set.contains(ax.W8.e.NTLMSSP_NEGOTIATE_56) ? Arrays.copyOf(bArr, 7) : Arrays.copyOf(bArr, 5);
            }
            return ax.V8.b.c(this.b, bArr, i);
        }
        if (!set.contains(ax.W8.e.NTLMSSP_NEGOTIATE_LM_KEY) && (!set.contains(ax.W8.e.NTLMSSP_NEGOTIATE_DATAGRAM) || iVar.a().getValue() < i.a.NTLMSSP_REVISION_W2K3.getValue())) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        byte[] bArr2 = new byte[8];
        if (set.contains(ax.W8.e.NTLMSSP_NEGOTIATE_56)) {
            System.arraycopy(bArr, 0, bArr2, 0, 7);
            bArr2[7] = -96;
            return bArr2;
        }
        System.arraycopy(bArr, 0, bArr2, 0, 5);
        bArr2[5] = -27;
        bArr2[6] = 56;
        bArr2[7] = -80;
        return bArr2;
    }

    private byte[] f(byte[] bArr, Set<ax.W8.e> set) {
        if (set.contains(ax.W8.e.NTLMSSP_NEGOTIATE_EXTENDED_SESSIONSECURITY)) {
            return ax.V8.b.c(this.b, bArr, h);
        }
        return null;
    }

    private byte[] g(byte[] bArr, int i2) throws IOException {
        byte[][] bArr2 = {h(i2), d(this.f)};
        byte[] bArr3 = new byte[8];
        System.arraycopy(ax.V8.b.a(this.b, bArr, bArr2), 0, bArr3, 0, 8);
        return bArr3;
    }

    private byte[] h(int i2) {
        return new byte[]{(byte) (i2 & 255), (byte) ((i2 >> 8) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 24) & 255)};
    }

    @Override // ax.j9.InterfaceC2340c
    public C2338a a(C2339b c2339b, byte[] bArr, C2484b c2484b) throws IOException {
        C2338a a = this.a.a(c2339b, bArr, c2484b);
        if (a == null) {
            return null;
        }
        byte[] d = a.d();
        Set<ax.W8.e> b = a.b();
        if (d != null) {
            g.n("Calculating signing and sealing keys for NTLM Extended Session Security");
            this.c = f(d, b);
            this.d = e(d, b, a.e());
        }
        if (a.a() instanceof C3376b) {
            this.f = ((C3376b) a.a()).h();
        }
        if (this.c != null && (a.a() instanceof ax.w9.c)) {
            ax.w9.c cVar = (ax.w9.c) a.a();
            g.n("Signing with NTLM Extended Session Security");
            int andIncrement = this.e.getAndIncrement();
            byte[] g2 = g(this.c, andIncrement);
            if (b.contains(ax.W8.e.NTLMSSP_NEGOTIATE_KEY_EXCH)) {
                g2 = ax.V8.b.f(this.b, this.d, g2);
            }
            C2171b c2171b = new C2171b();
            c2171b.u(1L);
            c2171b.p(g2, 0, 8);
            c2171b.u(andIncrement);
            cVar.l(c2171b.f());
        }
        return a;
    }

    @Override // ax.j9.InterfaceC2340c
    public void b(C2292d c2292d) {
        this.a.b(c2292d);
        this.b = c2292d.K();
    }

    @Override // ax.j9.InterfaceC2340c
    public boolean c(C2339b c2339b) {
        return this.a.c(c2339b);
    }
}
