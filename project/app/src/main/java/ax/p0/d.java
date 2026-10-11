/*
 * Decompiled with CFR 0.152.
 */
package ax.p0;

import ax.Gb.g;
import ax.Gb.l;
import ax.p0.f;
import ax.r0.B;
import java.io.InputStream;

public final class d {
    public static final a a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final f a(InputStream object) {
            l.f(object, "input");
            try {
                object = f.Q((InputStream)object);
                l.e(object, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return object;
            }
            catch (B b8) {
                throw new ax.n0.a("Unable to parse preferences proto.", b8);
            }
        }
    }
}

