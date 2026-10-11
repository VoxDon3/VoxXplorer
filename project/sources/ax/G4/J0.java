package ax.G4;

import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import java.io.IOException;

/* loaded from: classes.dex */
public enum J0 {
    CONCURRENT_SESSION_DATA_NOT_ALLOWED,
    CONCURRENT_SESSION_CLOSE_NOT_ALLOWED,
    PAYLOAD_TOO_LARGE,
    CONTENT_HASH_MISMATCH,
    OTHER;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[J0.values().length];
            a = iArr;
            try {
                iArr[J0.CONCURRENT_SESSION_DATA_NOT_ALLOWED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[J0.CONCURRENT_SESSION_CLOSE_NOT_ALLOWED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[J0.PAYLOAD_TOO_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[J0.CONTENT_HASH_MISMATCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static class b extends ax.v4.f<J0> {
        public static final b b = new b();

        b() {
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public J0 a(ax.T4.j jVar) throws IOException, ax.T4.i {
            String q;
            boolean z;
            if (jVar.j() == ax.T4.m.VALUE_STRING) {
                q = AbstractC3276c.i(jVar);
                jVar.H();
                z = true;
            } else {
                AbstractC3276c.h(jVar);
                q = AbstractC3274a.q(jVar);
                z = false;
            }
            if (q == null) {
                throw new ax.T4.i(jVar, "Required field missing: .tag");
            }
            J0 j0 = "concurrent_session_data_not_allowed".equals(q) ? J0.CONCURRENT_SESSION_DATA_NOT_ALLOWED : "concurrent_session_close_not_allowed".equals(q) ? J0.CONCURRENT_SESSION_CLOSE_NOT_ALLOWED : "payload_too_large".equals(q) ? J0.PAYLOAD_TOO_LARGE : "content_hash_mismatch".equals(q) ? J0.CONTENT_HASH_MISMATCH : J0.OTHER;
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return j0;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(J0 j0, ax.T4.g gVar) throws IOException, ax.T4.f {
            int i = a.a[j0.ordinal()];
            if (i == 1) {
                gVar.s0("concurrent_session_data_not_allowed");
                return;
            }
            if (i == 2) {
                gVar.s0("concurrent_session_close_not_allowed");
                return;
            }
            if (i == 3) {
                gVar.s0("payload_too_large");
            } else if (i != 4) {
                gVar.s0("other");
            } else {
                gVar.s0("content_hash_mismatch");
            }
        }
    }
}
