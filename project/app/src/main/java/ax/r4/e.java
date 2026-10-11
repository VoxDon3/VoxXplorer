/*
 * Decompiled with CFR 0.152.
 */
package ax.r4;

import ax.Gb.l;
import ax.Gb.y;
import ax.p4.q;
import ax.p4.z;
import java.util.Arrays;
import java.util.Locale;

public final class e {
    public static final e a = new e();

    private e() {
    }

    public final String a(z object, String object2, q object3, String string) {
        l.f(string, "pkceManagerCodeChallenge");
        if (object != null) {
            Object object4 = y.a;
            object4 = Locale.US;
            string = String.format((Locale)object4, "%s=%s&%s=%s&%s=%s&%s=%s", Arrays.copyOf(new Object[]{"code_challenge", string, "code_challenge_method", "S256", "token_access_type", object.toString(), "response_type", "code"}, 8));
            l.e(string, "format(...)");
            object = string;
            if (object2 != null) {
                object = String.format((Locale)object4, "&%s=%s", Arrays.copyOf(new Object[]{"scope", object2}, 2));
                l.e(object, "format(...)");
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(string);
                ((StringBuilder)object2).append((String)object);
                object = ((StringBuilder)object2).toString();
            }
            object2 = object;
            if (object3 != null) {
                object2 = String.format((Locale)object4, "&%s=%s", Arrays.copyOf(new Object[]{"include_granted_scopes", ((q)((Object)object3)).toString()}, 2));
                l.e(object2, "format(...)");
                object3 = new StringBuilder();
                ((StringBuilder)object3).append((String)object);
                ((StringBuilder)object3).append((String)object2);
                object2 = ((StringBuilder)object3).toString();
            }
            return object2;
        }
        throw new IllegalStateException("Extra Query Param should only be used in short live token flow.");
    }
}

