/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.l;
import ax.xc.h;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String string, String string2) {
        l.f(string, "username");
        l.f(string2, "password");
        return Credentials.basic$default(string, string2, null, 4, null);
    }

    public static final String basic(String charSequence, String string, Charset charset) {
        l.f(charSequence, "username");
        l.f(string, "password");
        l.f(charset, "charset");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)charSequence);
        stringBuilder.append(':');
        stringBuilder.append(string);
        charSequence = stringBuilder.toString();
        string = h.e0.c((String)charSequence, charset).d();
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Basic ");
        ((StringBuilder)charSequence).append(string);
        return ((StringBuilder)charSequence).toString();
    }

    public static /* synthetic */ String basic$default(String string, String string2, Charset charset, int n8, Object object) {
        if ((n8 & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            l.e(charset, "ISO_8859_1");
        }
        return Credentials.basic(string, string2, charset);
    }
}

