package ax.W1;

import android.text.TextUtils;
import ax.S0.C0968a;
import ax.S0.C0977j;
import ax.S0.C0987u;
import ax.S0.G;
import ax.S0.d0;
import ax.q7.C2876c;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
final class b {
    private static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final G a = new G();
    private final StringBuilder b = new StringBuilder();

    private void a(c cVar, String str) {
        if (str.isEmpty()) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                cVar.z((String) C0968a.e(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] x1 = d0.x1(str, "\\.");
        String str2 = x1[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            cVar.y(str2.substring(0, indexOf2));
            cVar.x(str2.substring(indexOf2 + 1));
        } else {
            cVar.y(str2);
        }
        if (x1.length > 1) {
            cVar.w((String[]) d0.h1(x1, 1, x1.length));
        }
    }

    private static boolean b(G g) {
        int g2 = g.g();
        int j = g.j();
        byte[] f = g.f();
        if (g2 + 2 > j) {
            return false;
        }
        int i = g2 + 1;
        if (f[g2] != 47) {
            return false;
        }
        int i2 = g2 + 2;
        if (f[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= j) {
                g.c0(j - g.g());
                return true;
            }
            if (((char) f[i2]) == '*' && ((char) f[i3]) == '/') {
                i2 += 2;
                j = i2;
            } else {
                i2 = i3;
            }
        }
    }

    private static boolean c(G g) {
        char k = k(g, g.g());
        if (k != '\t' && k != '\n' && k != '\f' && k != '\r' && k != ' ') {
            return false;
        }
        g.c0(1);
        return true;
    }

    private static void e(String str, c cVar) {
        Matcher matcher = d.matcher(C2876c.e(str));
        if (!matcher.matches()) {
            C0987u.h("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) C0968a.e(matcher.group(2));
        str2.getClass();
        switch (str2) {
            case "%":
                cVar.t(3);
                break;
            case "em":
                cVar.t(2);
                break;
            case "px":
                cVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        cVar.s(Float.parseFloat((String) C0968a.e(matcher.group(1))));
    }

    private static String f(G g, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int g2 = g.g();
        int j = g.j();
        while (g2 < j && !z) {
            char c2 = (char) g.f()[g2];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                g2++;
                sb.append(c2);
            }
        }
        g.c0(g2 - g.g());
        return sb.toString();
    }

    static String g(G g, StringBuilder sb) {
        n(g);
        if (g.a() == 0) {
            return null;
        }
        String f = f(g, sb);
        if (!f.isEmpty()) {
            return f;
        }
        return HttpUrl.FRAGMENT_ENCODE_SET + ((char) g.M());
    }

    private static String h(G g, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int g2 = g.g();
            String g3 = g(g, sb);
            if (g3 == null) {
                return null;
            }
            if ("}".equals(g3) || ";".equals(g3)) {
                g.b0(g2);
                z = true;
            } else {
                sb2.append(g3);
            }
        }
        return sb2.toString();
    }

    private static String i(G g, StringBuilder sb) {
        n(g);
        if (g.a() < 5 || !"::cue".equals(g.J(5))) {
            return null;
        }
        int g2 = g.g();
        String g3 = g(g, sb);
        if (g3 == null) {
            return null;
        }
        if ("{".equals(g3)) {
            g.b0(g2);
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String l = "(".equals(g3) ? l(g) : null;
        if (")".equals(g(g, sb))) {
            return l;
        }
        return null;
    }

    private static void j(G g, c cVar, StringBuilder sb) {
        n(g);
        String f = f(g, sb);
        if (!f.isEmpty() && ":".equals(g(g, sb))) {
            n(g);
            String h = h(g, sb);
            if (h == null || h.isEmpty()) {
                return;
            }
            int g2 = g.g();
            String g3 = g(g, sb);
            if (!";".equals(g3)) {
                if (!"}".equals(g3)) {
                    return;
                } else {
                    g.b0(g2);
                }
            }
            if ("color".equals(f)) {
                cVar.q(C0977j.b(h));
                return;
            }
            if ("background-color".equals(f)) {
                cVar.n(C0977j.b(h));
                return;
            }
            boolean z = true;
            if ("ruby-position".equals(f)) {
                if ("over".equals(h)) {
                    cVar.v(1);
                    return;
                } else {
                    if ("under".equals(h)) {
                        cVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(f)) {
                if (!"all".equals(h) && !h.startsWith("digits")) {
                    z = false;
                }
                cVar.p(z);
                return;
            }
            if ("text-decoration".equals(f)) {
                if ("underline".equals(h)) {
                    cVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(f)) {
                cVar.r(h);
                return;
            }
            if ("font-weight".equals(f)) {
                if ("bold".equals(h)) {
                    cVar.o(true);
                }
            } else if ("font-style".equals(f)) {
                if ("italic".equals(h)) {
                    cVar.u(true);
                }
            } else if ("font-size".equals(f)) {
                e(h, cVar);
            }
        }
    }

    private static char k(G g, int i) {
        return (char) g.f()[i];
    }

    private static String l(G g) {
        int g2 = g.g();
        int j = g.j();
        boolean z = false;
        while (g2 < j && !z) {
            int i = g2 + 1;
            z = ((char) g.f()[g2]) == ')';
            g2 = i;
        }
        return g.J((g2 - 1) - g.g()).trim();
    }

    static void m(G g) {
        while (!TextUtils.isEmpty(g.x())) {
        }
    }

    static void n(G g) {
        while (true) {
            for (boolean z = true; g.a() > 0 && z; z = false) {
                if (!c(g) && !b(g)) {
                }
            }
            return;
        }
    }

    public List<c> d(G g) {
        this.b.setLength(0);
        int g2 = g.g();
        m(g);
        this.a.Z(g.f(), g.g());
        this.a.b0(g2);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i = i(this.a, this.b);
            if (i == null || !"{".equals(g(this.a, this.b))) {
                break;
            }
            c cVar = new c();
            a(cVar, i);
            String str = null;
            boolean z = false;
            while (!z) {
                int g3 = this.a.g();
                String g4 = g(this.a, this.b);
                boolean z2 = g4 == null || "}".equals(g4);
                if (!z2) {
                    this.a.b0(g3);
                    j(this.a, cVar, this.b);
                }
                str = g4;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }
}
