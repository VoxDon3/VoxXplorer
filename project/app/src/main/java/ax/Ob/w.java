/*
 * Decompiled with CFR 0.152.
 */
package ax.Ob;

import ax.Gb.l;
import ax.Lb.f;
import ax.Ob.u;
import ax.Ob.v;
import java.util.NoSuchElementException;

class w
extends v {
    public static final String B0(String charSequence, int n8) {
        l.f(charSequence, "<this>");
        if (n8 >= 0) {
            charSequence = ((String)charSequence).substring(f.d(n8, ((String)charSequence).length()));
            l.e(charSequence, "substring(...)");
            return charSequence;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Requested character count ");
        ((StringBuilder)charSequence).append(n8);
        ((StringBuilder)charSequence).append(" is less than zero.");
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
    }

    public static char C0(CharSequence charSequence) {
        l.f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(u.P(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String D0(String charSequence, int n8) {
        l.f(charSequence, "<this>");
        if (n8 >= 0) {
            charSequence = ((String)charSequence).substring(0, f.d(n8, ((String)charSequence).length()));
            l.e(charSequence, "substring(...)");
            return charSequence;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Requested character count ");
        ((StringBuilder)charSequence).append(n8);
        ((StringBuilder)charSequence).append(" is less than zero.");
        throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
    }
}

