package ax.Ob;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class g implements Serializable {
    public static final a c0 = new a(null);
    private final Pattern q;

    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    public g(Pattern pattern) {
        ax.Gb.l.f(pattern, "nativePattern");
        this.q = pattern;
    }

    public final boolean a(CharSequence charSequence) {
        ax.Gb.l.f(charSequence, "input");
        return this.q.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String str) {
        ax.Gb.l.f(charSequence, "input");
        ax.Gb.l.f(str, "replacement");
        String replaceAll = this.q.matcher(charSequence).replaceAll(str);
        ax.Gb.l.e(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public String toString() {
        String pattern = this.q.toString();
        ax.Gb.l.e(pattern, "toString(...)");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            ax.Gb.l.f(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            ax.Gb.l.e(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.Ob.g.<init>(java.lang.String):void");
    }
}
