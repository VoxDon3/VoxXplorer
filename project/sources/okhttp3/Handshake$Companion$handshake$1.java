package okhttp3;

import ax.Fb.a;
import ax.Gb.m;
import java.security.cert.Certificate;
import java.util.List;

/* loaded from: classes3.dex */
final class Handshake$Companion$handshake$1 extends m implements a<List<? extends Certificate>> {
    final /* synthetic */ List<Certificate> $peerCertificatesCopy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    Handshake$Companion$handshake$1(List<? extends Certificate> list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @Override // ax.Fb.a
    public final List<? extends Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
