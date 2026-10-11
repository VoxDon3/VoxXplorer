package ax.R3;

import ax.b0.InterfaceC1443d;
import ax.l4.AbstractC2469b;
import ax.l4.C2468a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class j {
    private final ax.k4.e<ax.M3.h, String> a = new ax.k4.e<>(1000);
    private final InterfaceC1443d<b> b = C2468a.e(10, new a());

    class a implements C2468a.d<b> {
        a() {
        }

        @Override // ax.l4.C2468a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static final class b implements C2468a.f {
        private final AbstractC2469b c0 = AbstractC2469b.a();
        final MessageDigest q;

        b(MessageDigest messageDigest) {
            this.q = messageDigest;
        }

        @Override // ax.l4.C2468a.f
        public AbstractC2469b l() {
            return this.c0;
        }
    }

    private String a(ax.M3.h hVar) {
        b b2 = this.b.b();
        try {
            hVar.a(b2.q);
            return ax.k4.i.s(b2.q.digest());
        } finally {
            this.b.a(b2);
        }
    }

    public String b(ax.M3.h hVar) {
        String g;
        synchronized (this.a) {
            g = this.a.g(hVar);
        }
        if (g == null) {
            g = a(hVar);
        }
        synchronized (this.a) {
            this.a.k(hVar, g);
        }
        return g;
    }
}
