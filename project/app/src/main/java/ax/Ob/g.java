/*
 * Decompiled with CFR 0.152.
 */
package ax.Ob;

import ax.Gb.l;
import java.io.Serializable;
import java.util.regex.Pattern;

public final class g
implements Serializable {
    public static final a c0 = new a(null);
    private final Pattern q;

    public g(String object) {
        l.f(object, "pattern");
        object = Pattern.compile((String)object);
        l.e(object, "compile(...)");
        this((Pattern)object);
    }

    public g(Pattern pattern) {
        l.f(pattern, "nativePattern");
        this.q = pattern;
    }

    public final boolean a(CharSequence charSequence) {
        l.f(charSequence, "input");
        return this.q.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String string) {
        l.f(charSequence, "input");
        l.f(string, "replacement");
        charSequence = this.q.matcher(charSequence).replaceAll(string);
        l.e(charSequence, "replaceAll(...)");
        return charSequence;
    }

    public String toString() {
        String string = this.q.toString();
        l.e(string, "toString(...)");
        return string;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(ax.Gb.g g8) {
            this();
        }
    }
}

