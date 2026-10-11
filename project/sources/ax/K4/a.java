package ax.K4;

import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.AbstractC3274a;
import ax.v4.AbstractC3276c;
import ax.v4.f;
import java.io.IOException;

/* loaded from: classes.dex */
public enum a {
    OFF,
    ALERT_ONLY,
    STOP_SYNC,
    OTHER;

    /* renamed from: ax.K4.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0106a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            a = iArr;
            try {
                iArr[a.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.ALERT_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.STOP_SYNC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b extends f<a> {
        public static final b b = new b();

        @Override // ax.v4.AbstractC3276c
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public a a(j jVar) throws IOException, i {
            String q;
            boolean z;
            if (jVar.j() == m.VALUE_STRING) {
                q = AbstractC3276c.i(jVar);
                jVar.H();
                z = true;
            } else {
                AbstractC3276c.h(jVar);
                q = AbstractC3274a.q(jVar);
                z = false;
            }
            if (q == null) {
                throw new i(jVar, "Required field missing: .tag");
            }
            a aVar = "off".equals(q) ? a.OFF : "alert_only".equals(q) ? a.ALERT_ONLY : "stop_sync".equals(q) ? a.STOP_SYNC : a.OTHER;
            if (!z) {
                AbstractC3276c.n(jVar);
                AbstractC3276c.e(jVar);
            }
            return aVar;
        }

        @Override // ax.v4.AbstractC3276c
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public void k(a aVar, g gVar) throws IOException, ax.T4.f {
            int i = C0106a.a[aVar.ordinal()];
            if (i == 1) {
                gVar.s0("off");
                return;
            }
            if (i == 2) {
                gVar.s0("alert_only");
            } else if (i != 3) {
                gVar.s0("other");
            } else {
                gVar.s0("stop_sync");
            }
        }
    }
}
