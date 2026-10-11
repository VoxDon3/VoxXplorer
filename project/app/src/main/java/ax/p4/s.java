/*
 * Decompiled with CFR 0.152.
 */
package ax.p4;

import ax.T4.f;
import ax.T4.g;
import ax.T4.i;
import ax.T4.j;
import ax.T4.m;
import ax.v4.c;
import ax.v4.d;
import java.io.IOException;

public final class s {
    static final c<s> c = new c<s>(){

        public s p(j j8) throws IOException, i {
            ax.v4.c.h(j8);
            String string = null;
            Object object = null;
            while (j8.j() == m.p0) {
                String string2 = j8.g();
                j8.H();
                if ("text".equals(string2)) {
                    string = d.f().a(j8);
                    continue;
                }
                if ("locale".equals(string2)) {
                    object = d.f().a(j8);
                    continue;
                }
                ax.v4.c.o(j8);
            }
            if (string != null) {
                if (object != null) {
                    object = new s(string, (String)object);
                    ax.v4.c.e(j8);
                    return object;
                }
                throw new i(j8, "Required field \"locale\" missing.");
            }
            throw new i(j8, "Required field \"text\" missing.");
        }

        public void q(s s8, g g8) throws IOException, f {
            throw new UnsupportedOperationException("Error wrapper serialization not supported.");
        }
    };
    private final String a;
    private final String b;

    public s(String string, String string2) {
        if (string != null) {
            if (string2 != null) {
                this.a = string;
                this.b = string2;
                return;
            }
            throw new NullPointerException("locale");
        }
        throw new NullPointerException("text");
    }

    public String toString() {
        return this.a;
    }
}

