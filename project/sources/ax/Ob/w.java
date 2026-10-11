package ax.Ob;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class w extends v {
    public static final String B0(String str, int i) {
        ax.Gb.l.f(str, "<this>");
        if (i >= 0) {
            String substring = str.substring(ax.Lb.f.d(i, str.length()));
            ax.Gb.l.e(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }

    public static char C0(CharSequence charSequence) {
        ax.Gb.l.f(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(u.P(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static String D0(String str, int i) {
        ax.Gb.l.f(str, "<this>");
        if (i >= 0) {
            String substring = str.substring(0, ax.Lb.f.d(i, str.length()));
            ax.Gb.l.e(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i + " is less than zero.").toString());
    }
}
