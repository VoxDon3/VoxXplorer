/*
 * Decompiled with CFR 0.152.
 */
package ax.W1;

import android.text.TextUtils;
import ax.S0.G;
import ax.S0.a;
import ax.S0.d0;
import ax.S0.j;
import ax.S0.u;
import ax.W1.c;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class b {
    private static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final G a = new G();
    private final StringBuilder b = new StringBuilder();

    private void a(c c8, String stringArray) {
        if (!stringArray.isEmpty()) {
            int n8 = stringArray.indexOf(91);
            Object object = stringArray;
            if (n8 != -1) {
                object = c.matcher(stringArray.substring(n8));
                if (((Matcher)object).matches()) {
                    c8.z(ax.S0.a.e(((Matcher)object).group(1)));
                }
                object = stringArray.substring(0, n8);
            }
            if ((n8 = ((String)(object = (stringArray = d0.x1((String)object, "\\."))[0])).indexOf(35)) != -1) {
                c8.y(((String)object).substring(0, n8));
                c8.x(((String)object).substring(n8 + 1));
            } else {
                c8.y((String)object);
            }
            if (stringArray.length > 1) {
                c8.w(d0.h1(stringArray, 1, stringArray.length));
            }
        }
    }

    private static boolean b(G g8) {
        int n8 = g8.g();
        int n9 = g8.j();
        byte[] byArray = g8.f();
        if (n8 + 2 <= n9 && byArray[n8] == 47) {
            int n10 = n8 + 2;
            if (byArray[n8 + 1] == 42) {
                while ((n8 = n10 + 1) < n9) {
                    if ((char)byArray[n10] == '*' && (char)byArray[n8] == '/') {
                        n9 = n10 += 2;
                        continue;
                    }
                    n10 = n8;
                }
                g8.c0(n9 - g8.g());
                return true;
            }
        }
        return false;
    }

    private static boolean c(G g8) {
        char c8 = ax.W1.b.k(g8, g8.g());
        if (c8 != '\t' && c8 != '\n' && c8 != '\f' && c8 != '\r' && c8 != ' ') {
            return false;
        }
        g8.c0(1);
        return true;
    }

    private static void e(String string, c object) {
        Matcher matcher = d.matcher(ax.q7.c.e(string));
        if (!matcher.matches()) {
            object = new StringBuilder();
            ((StringBuilder)object).append("Invalid font-size: '");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("'.");
            u.h("WebvttCssParser", ((StringBuilder)object).toString());
            return;
        }
        string = ax.S0.a.e(matcher.group(2));
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 3592: {
                if (!string.equals("px")) break;
                n8 = 2;
                break;
            }
            case 3240: {
                if (!string.equals("em")) break;
                n8 = 1;
                break;
            }
            case 37: {
                if (!string.equals("%")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                throw new IllegalStateException();
            }
            case 2: {
                ((c)object).t(1);
                break;
            }
            case 1: {
                ((c)object).t(2);
                break;
            }
            case 0: {
                ((c)object).t(3);
            }
        }
        ((c)object).s(Float.parseFloat(ax.S0.a.e(matcher.group(1))));
    }

    private static String f(G g8, StringBuilder stringBuilder) {
        boolean bl = false;
        stringBuilder.setLength(0);
        int n8 = g8.g();
        int n9 = g8.j();
        while (n8 < n9 && !bl) {
            char c8 = (char)g8.f()[n8];
            if (!(c8 >= 'A' && c8 <= 'Z' || c8 >= 'a' && c8 <= 'z' || c8 >= '0' && c8 <= '9' || c8 == '#' || c8 == '-' || c8 == '.' || c8 == '_')) {
                bl = true;
                continue;
            }
            ++n8;
            stringBuilder.append(c8);
        }
        g8.c0(n8 - g8.g());
        return stringBuilder.toString();
    }

    static String g(G g8, StringBuilder charSequence) {
        ax.W1.b.n(g8);
        if (g8.a() == 0) {
            return null;
        }
        if (!((String)(charSequence = ax.W1.b.f(g8, (StringBuilder)charSequence))).isEmpty()) {
            return charSequence;
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("");
        ((StringBuilder)charSequence).append((char)g8.M());
        return ((StringBuilder)charSequence).toString();
    }

    private static String h(G g8, StringBuilder stringBuilder) {
        StringBuilder stringBuilder2 = new StringBuilder();
        boolean bl = false;
        while (!bl) {
            int n8 = g8.g();
            String string = ax.W1.b.g(g8, stringBuilder);
            if (string == null) {
                return null;
            }
            if (!"}".equals(string) && !";".equals(string)) {
                stringBuilder2.append(string);
                continue;
            }
            g8.b0(n8);
            bl = true;
        }
        return stringBuilder2.toString();
    }

    private static String i(G g8, StringBuilder stringBuilder) {
        ax.W1.b.n(g8);
        if (g8.a() < 5) {
            return null;
        }
        if (!"::cue".equals(g8.J(5))) {
            return null;
        }
        int n8 = g8.g();
        String string = ax.W1.b.g(g8, stringBuilder);
        if (string == null) {
            return null;
        }
        if ("{".equals(string)) {
            g8.b0(n8);
            return "";
        }
        string = "(".equals(string) ? ax.W1.b.l(g8) : null;
        if (!")".equals(ax.W1.b.g(g8, stringBuilder))) {
            return null;
        }
        return string;
    }

    private static void j(G g8, c c8, StringBuilder charSequence) {
        block22: {
            String string;
            String string2;
            block23: {
                ax.W1.b.n(g8);
                string2 = ax.W1.b.f(g8, charSequence);
                if (string2.isEmpty() || !":".equals(ax.W1.b.g(g8, charSequence))) break block22;
                ax.W1.b.n(g8);
                string = ax.W1.b.h(g8, charSequence);
                if (string == null || string.isEmpty()) break block22;
                int n8 = g8.g();
                if (";".equals(charSequence = ax.W1.b.g(g8, charSequence))) break block23;
                if (!"}".equals(charSequence)) break block22;
                g8.b0(n8);
            }
            if ("color".equals(string2)) {
                c8.q(j.b(string));
                return;
            }
            if ("background-color".equals(string2)) {
                c8.n(j.b(string));
                return;
            }
            boolean bl = "ruby-position".equals(string2);
            boolean bl2 = true;
            if (bl) {
                if ("over".equals(string)) {
                    c8.v(1);
                    return;
                }
                if ("under".equals(string)) {
                    c8.v(2);
                    return;
                }
            } else {
                if ("text-combine-upright".equals(string2)) {
                    bl = bl2;
                    if (!"all".equals(string)) {
                        bl = string.startsWith("digits") ? bl2 : false;
                    }
                    c8.p(bl);
                    return;
                }
                if ("text-decoration".equals(string2)) {
                    if ("underline".equals(string)) {
                        c8.A(true);
                        return;
                    }
                } else {
                    if ("font-family".equals(string2)) {
                        c8.r(string);
                        return;
                    }
                    if ("font-weight".equals(string2)) {
                        if ("bold".equals(string)) {
                            c8.o(true);
                            return;
                        }
                    } else if ("font-style".equals(string2)) {
                        if ("italic".equals(string)) {
                            c8.u(true);
                            return;
                        }
                    } else if ("font-size".equals(string2)) {
                        ax.W1.b.e(string, c8);
                    }
                }
            }
        }
    }

    private static char k(G g8, int n8) {
        return (char)g8.f()[n8];
    }

    private static String l(G g8) {
        int n8;
        int n9 = g8.j();
        boolean bl = false;
        for (n8 = g8.g(); n8 < n9 && !bl; ++n8) {
            bl = (char)g8.f()[n8] == ')';
        }
        return g8.J(n8 - 1 - g8.g()).trim();
    }

    static void m(G g8) {
        while (!TextUtils.isEmpty((CharSequence)g8.x())) {
        }
    }

    static void n(G g8) {
        block0: while (true) {
            boolean bl = true;
            while (g8.a() > 0 && bl) {
                if (ax.W1.b.c(g8) || ax.W1.b.b(g8)) continue block0;
                bl = false;
            }
            break;
        }
    }

    public List<c> d(G object) {
        this.b.setLength(0);
        int n8 = ((G)object).g();
        ax.W1.b.m((G)object);
        this.a.Z(((G)object).f(), ((G)object).g());
        this.a.b0(n8);
        ArrayList<c> arrayList = new ArrayList<c>();
        while ((object = ax.W1.b.i(this.a, this.b)) != null && "{".equals(ax.W1.b.g(this.a, this.b))) {
            c c8 = new c();
            this.a(c8, (String)object);
            object = null;
            n8 = 0;
            while (n8 == 0) {
                int n9 = this.a.g();
                object = ax.W1.b.g(this.a, this.b);
                n8 = object != null && !"}".equals(object) ? 0 : 1;
                if (n8 != 0) continue;
                this.a.b0(n9);
                ax.W1.b.j(this.a, c8, this.b);
            }
            if (!"}".equals(object)) continue;
            arrayList.add(c8);
        }
        return arrayList;
    }
}

