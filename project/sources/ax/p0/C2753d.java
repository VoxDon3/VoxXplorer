package ax.p0;

import ax.Gb.l;
import ax.n0.C2567a;
import ax.r0.C2905B;
import java.io.InputStream;

/* renamed from: ax.p0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2753d {
    public static final a a = new a(null);

    /* renamed from: ax.p0.d$a */
    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        public final C2755f a(InputStream inputStream) {
            l.f(inputStream, "input");
            try {
                C2755f Q = C2755f.Q(inputStream);
                l.e(Q, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return Q;
            } catch (C2905B e) {
                throw new C2567a("Unable to parse preferences proto.", e);
            }
        }

        private a() {
        }
    }
}
