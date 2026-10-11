/*
 * Decompiled with CFR 0.152.
 */
package ax.Tc;

import ax.Sc.k;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public abstract class o
extends k {
    private Pattern a;
    private MatchResult b;
    protected Matcher c;

    public o(String string) {
        this.d(string, 0);
    }

    public o(String string, int n8) {
        this.d(string, n8);
    }

    private void d(String string, int n8) {
        try {
            this.a = Pattern.compile(string, n8);
            return;
        }
        catch (PatternSyntaxException patternSyntaxException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unparseable regex supplied: ");
            stringBuilder.append(string);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public String e(int n8) {
        MatchResult matchResult = this.b;
        if (matchResult == null) {
            return null;
        }
        return matchResult.group(n8);
    }

    public boolean g(String object) {
        this.b = null;
        this.c = object = this.a.matcher((CharSequence)object);
        if (((Matcher)object).matches()) {
            this.b = this.c.toMatchResult();
        }
        return this.b != null;
    }

    public boolean h(String string) {
        this.d(string, 0);
        return true;
    }
}

