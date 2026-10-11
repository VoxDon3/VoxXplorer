/*
 * Decompiled with CFR 0.152.
 */
package ax.r4;

import ax.Gb.l;
import ax.Gb.y;
import ax.p4.q;
import com.dropbox.core.android.AuthActivity;
import java.util.Arrays;
import java.util.Locale;

public final class c {
    public static final c a = new c();

    private c() {
    }

    public static final String a(String charSequence, String charSequence2, String string, q q8) {
        l.f(charSequence, "codeChallenge");
        l.f(charSequence2, "tokenAccessType");
        y y8 = y.a;
        charSequence2 = String.format(Locale.US, "oauth2code:%s:%s:%s", Arrays.copyOf(new Object[]{charSequence, "S256", charSequence2}, 3));
        l.e(charSequence2, "format(...)");
        charSequence = charSequence2;
        if (string != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)charSequence2);
            ((StringBuilder)charSequence).append(":");
            ((StringBuilder)charSequence).append(string);
            charSequence = ((StringBuilder)charSequence).toString();
        }
        charSequence2 = charSequence;
        if (q8 != null) {
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append((String)charSequence);
            ((StringBuilder)charSequence2).append(":");
            ((StringBuilder)charSequence2).append((Object)q8);
            charSequence2 = ((StringBuilder)charSequence2).toString();
        }
        return charSequence2;
    }

    public static final String b(AuthActivity.c object) {
        l.f(object, "securityProvider");
        byte[] byArray = new byte[16];
        object.a().nextBytes(byArray);
        object = new StringBuilder();
        ((StringBuilder)object).append("oauth2:");
        for (int i8 = 0; i8 < 16; ++i8) {
            Object object2 = y.a;
            object2 = String.format("%02x", Arrays.copyOf(new Object[]{byArray[i8] & 0xFF}, 1));
            l.e(object2, "format(...)");
            ((StringBuilder)object).append((String)object2);
        }
        object = ((StringBuilder)object).toString();
        l.e(object, "toString(...)");
        return object;
    }
}

