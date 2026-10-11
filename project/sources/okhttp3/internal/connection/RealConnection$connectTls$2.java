package okhttp3.internal.connection;

import ax.Fb.a;
import ax.Gb.l;
import ax.Gb.m;
import ax.tb.C3139o;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Handshake;

/* loaded from: classes3.dex */
final class RealConnection$connectTls$2 extends m implements a<List<? extends X509Certificate>> {
    final /* synthetic */ RealConnection this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.this$0 = realConnection;
    }

    @Override // ax.Fb.a
    public final List<? extends X509Certificate> invoke() {
        Handshake handshake;
        handshake = this.this$0.handshake;
        l.c(handshake);
        List<Certificate> peerCertificates = handshake.peerCertificates();
        ArrayList arrayList = new ArrayList(C3139o.s(peerCertificates, 10));
        for (Certificate certificate : peerCertificates) {
            l.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
