package ax.m9;

import ax.Q8.B;
import ax.Q8.C0917a;
import ax.Q8.C0918b;
import ax.Q8.C0922f;
import ax.Q8.t;
import ax.Q8.x;
import ax.Q8.y;
import ax.Z8.a;
import ax.h9.AbstractC2174e;
import ax.l9.C2488f;
import ax.l9.m;
import ax.r9.C3016b;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class l extends AbstractC2537a {
    private static final ax.Xd.d d = ax.Xd.f.k(l.class);
    private m b;
    private C2488f c;

    public l(m mVar, C2488f c2488f) {
        this.b = mVar;
        this.c = c2488f;
    }

    private void e(AbstractC2174e<?> abstractC2174e, byte[] bArr) throws ax.c9.e {
        d.s("Packet {} is compressed.", abstractC2174e);
        try {
            this.a.a(new y(bArr, true));
        } catch (a.b e) {
            throw new ax.k9.d("Could not load compression header", e);
        }
    }

    private void f(byte[] bArr, B b) throws ax.c9.e {
        try {
            C0922f c0922f = new C0922f(bArr);
            ax.Xd.d dVar = d;
            dVar.d("Decrypted packet {} is packet {}.", b, c0922f);
            if (c0922f.b().k() == b.b().g()) {
                this.a.a(c0922f);
            } else {
                dVar.p("Mismatched sessionId between encrypted packet {} and decrypted contents {}", b, c0922f);
                this.a.a(new C0917a(c0922f.b()));
            }
        } catch (a.b e) {
            throw new ax.k9.d("Could not load SMB2 Packet", e);
        }
    }

    @Override // ax.m9.AbstractC2537a
    protected boolean b(AbstractC2174e<?> abstractC2174e) {
        return abstractC2174e instanceof B;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [ax.h9.c] */
    /* JADX WARN: Type inference failed for: r6v4, types: [ax.h9.c] */
    @Override // ax.m9.AbstractC2537a
    protected void c(AbstractC2174e<?> abstractC2174e) throws ax.c9.e {
        B b = (B) abstractC2174e;
        ax.Xd.d dVar = d;
        dVar.s("Decrypting packet {}", b);
        if (!this.c.d(b)) {
            this.a.a(new C0917a(abstractC2174e.b()));
            return;
        }
        C3016b b2 = this.b.b(Long.valueOf(b.b().g()));
        if (b2 == null) {
            this.a.a(new C0917a(abstractC2174e.b()));
            return;
        }
        byte[] f = this.c.f(b, b2.o().b());
        byte[] copyOf = Arrays.copyOf(f, 4);
        if (x.i(copyOf)) {
            dVar.t("Encountered a nested encrypted packet in packet {}, disconnecting the transport", abstractC2174e);
            throw new ax.c9.e("Cannot nest an encrypted packet in encrypted packet " + abstractC2174e);
        }
        if (C0918b.d(copyOf)) {
            e(abstractC2174e, f);
        } else if (t.p(copyOf)) {
            f(f, b);
        } else {
            dVar.t("Could not determine the encrypted packet contents of packet {}", abstractC2174e);
            throw new ax.c9.e("Could not determine the encrypted packet data, disconnecting");
        }
    }
}
