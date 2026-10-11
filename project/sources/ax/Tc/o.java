package ax.Tc;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes3.dex */
public abstract class o extends ax.Sc.k {
    private Pattern a;
    private MatchResult b;
    protected Matcher c;

    public o(String str) {
        d(str, 0);
    }

    private void d(String str, int i) {
        try {
            this.a = Pattern.compile(str, i);
        } catch (PatternSyntaxException unused) {
            throw new IllegalArgumentException("Unparseable regex supplied: " + str);
        }
    }

    public String e(int i) {
        MatchResult matchResult = this.b;
        if (matchResult == null) {
            return null;
        }
        return matchResult.group(i);
    }

    public boolean g(String str) {
        this.b = null;
        Matcher matcher = this.a.matcher(str);
        this.c = matcher;
        if (matcher.matches()) {
            this.b = this.c.toMatchResult();
        }
        return this.b != null;
    }

    public boolean h(String str) {
        d(str, 0);
        return true;
    }

    public o(String str, int i) {
        d(str, i);
    }
}
