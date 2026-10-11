package okhttp3;

import ax.Fb.a;
import ax.Gb.m;
import ax.tb.C3139o;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes3.dex */
final class Handshake$peerCertificates$2 extends m implements a<List<? extends Certificate>> {
    final /* synthetic */ a<List<Certificate>> $peerCertificatesFn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Handshake$peerCertificates$2(a<? extends List<? extends Certificate>> aVar) {
        super(0);
        this.$peerCertificatesFn = aVar;
    }

    @Override // ax.Fb.a
    public final List<? extends Certificate> invoke() {
        try {
            return this.$peerCertificatesFn.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            return C3139o.j();
        }
    }
}
