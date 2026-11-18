/*
 * Decompiled with CFR 0.152.
 */
package ax.c3;

import android.text.TextUtils;
import ax.Q2.c;
import ax.Q2.d;
import ax.Q2.e;
import ax.Q2.f;
import ax.T2.h;
import ax.Z2.j;
import ax.c3.B;
import ax.c3.K;
import ax.u3.b;
import com.voxdon.xplorer.file.n;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public class d0 {
    public static final String a = File.separator;
    public static final char b = File.separatorChar;

    public static boolean A(String string) {
        return string.indexOf(a) < 0;
    }

    public static boolean B(String string) {
        char c8;
        if (string == null) {
            return false;
        }
        int n8 = string.length();
        if (n8 == 0) {
            return false;
        }
        char c9 = string.charAt(0);
        if (c9 != (c8 = b)) {
            return false;
        }
        return n8 == 1 || string.charAt(n8 - 1) != c8;
        {
        }
    }

    public static boolean C(String string) {
        return ".".equals(string) || "..".equals(string);
        {
        }
    }

    public static boolean D(K k8, String object) {
        String string = k8.e();
        if (TextUtils.isEmpty((CharSequence)string)) {
            object = ax.Ha.c.h().f().d("ISROOT2").j().a("getRootPath == null");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(k8.toString());
            stringBuilder.append(",");
            stringBuilder.append(string);
            stringBuilder.append(",");
            stringBuilder.append((Object)e.z());
            ((ax.Ha.b)object).g(stringBuilder.toString()).h();
            return false;
        }
        return string.equals(object);
    }

    public static boolean E(n n8) {
        if (n8 == null) {
            ax.Ha.c.h().d("ISROOT:").j().h();
            return false;
        }
        return d0.D(n8.R(), n8.E());
    }

    public static boolean F(String string, String string2) {
        return string.equalsIgnoreCase(string2);
    }

    public static boolean G(String string, String string2) {
        StringBuilder stringBuilder;
        if (!d0.B(string)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid path 1: ");
            stringBuilder.append(string);
            d.c("ISFP1", new Exception(stringBuilder.toString()));
            ax.Ha.c.h().d("ISFP 1:").j().g(string).h();
        }
        if (!d0.B(string2)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid path 2: ");
            stringBuilder.append(string2);
            d.c("ISFP2", new Exception(stringBuilder.toString()));
            ax.Ha.c.h().d("ISFP 2:").j().g(string2).h();
        }
        return string.equals(string2);
    }

    public static boolean H(String string, String string2) {
        if (string != null && string2 != null) {
            if (d0.B(string) && d0.B(string2)) {
                int n8 = string.length();
                int n9 = string2.length();
                if (n8 == 1) {
                    return true;
                }
                if (n9 >= n8 && string2.startsWith(string)) {
                    return n9 == n8 || string2.charAt(n8) == b;
                    {
                    }
                }
                return false;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("isSameOrSubdirectory path not normalized : ");
            stringBuilder.append(string);
            stringBuilder.append(" : ");
            stringBuilder.append(string2);
            d.c("isSameOrSubdirectoryError", new Exception(stringBuilder.toString()));
        }
        return false;
    }

    public static boolean I(String charSequence, String charSequence2) {
        if (d0.B((String)charSequence)) {
            if (d0.B((String)charSequence2)) {
                int n8 = ((String)charSequence).length();
                if (n8 == 1) {
                    return ((String)charSequence2).charAt(0) == b;
                }
                return ((String)charSequence2).length() > n8 && ((String)charSequence2).startsWith((String)charSequence) && ((String)charSequence2).charAt(n8) == b;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("isSubdirectory sub path is not normalized : ");
            ((StringBuilder)charSequence).append((String)charSequence2);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
        }
        ax.Ha.b b8 = ax.Ha.c.h().f().b("INVALID PARENT PATH");
        charSequence2 = new StringBuilder();
        ((StringBuilder)charSequence2).append("parent:");
        ((StringBuilder)charSequence2).append((String)charSequence);
        b8.g(((StringBuilder)charSequence2).toString()).h();
        charSequence2 = new StringBuilder();
        ((StringBuilder)charSequence2).append("isSubdirectory parent path is not normalized : ");
        ((StringBuilder)charSequence2).append((String)charSequence);
        throw new IllegalArgumentException(((StringBuilder)charSequence2).toString());
    }

    public static boolean J(String string, String string2, boolean bl) {
        if (bl) {
            return d0.I(string.toLowerCase(), string2.toLowerCase());
        }
        return d0.I(string, string2);
    }

    public static boolean K(String string) {
        if (string == null) {
            return false;
        }
        for (int i8 = 0; i8 < string.length(); ++i8) {
            if (d0.L(string.charAt(i8))) continue;
            return false;
        }
        return true;
    }

    private static boolean L(char c8) {
        if (c8 >= '\u0000' && c8 <= '\u001f') {
            return false;
        }
        return c8 != '\"' && c8 != '*' && c8 != ':' && c8 != '<' && c8 != '\\' && c8 != '|' && c8 != '\u007f' && c8 != '>' && c8 != '?';
    }

    public static boolean M(String string) {
        return string != null && string.equals(d0.b(string));
    }

    private static boolean N(char c8) {
        if (c8 >= '\u0000' && c8 <= '\u001f') {
            return false;
        }
        return c8 != '\"' && c8 != '*' && c8 != '/' && c8 != ':' && c8 != '<' && c8 != '\\' && c8 != '|' && c8 != '\u007f' && c8 != '>' && c8 != '?';
    }

    public static String O(String string) {
        String string2 = a;
        if (string.endsWith(string2)) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String P(String string, String string2) {
        ax.u3.b.c(d0.B(string));
        ax.u3.b.c(d0.B(string2));
        if (a.equals(string)) {
            return string2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String Q(String charSequence, String string) {
        if (d0.B((String)charSequence)) {
            if (!string.startsWith("/")) {
                Object object;
                String string2 = a;
                if (string2.equals(charSequence)) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append(string);
                    string2 = ((StringBuilder)object).toString();
                } else {
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)charSequence);
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append(string);
                    string2 = ((StringBuilder)object).toString();
                }
                if (d0.B(string2)) {
                    return string2;
                }
                object = ax.Ha.c.h().d("!!!!MPTH2").j();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)charSequence);
                stringBuilder.append(":");
                stringBuilder.append(string);
                ((ax.Ha.b)object).g(stringBuilder.toString()).h();
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("mergePath result error: ");
                ((StringBuilder)charSequence).append(string2);
                ((StringBuilder)charSequence).append(":");
                ((StringBuilder)charSequence).append(string);
                throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
            }
            ax.Ha.b b8 = ax.Ha.c.h().d("MPTH1:").j();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            stringBuilder.append(":");
            stringBuilder.append(string);
            b8.g(stringBuilder.toString()).h();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("mergePath name error: ");
            ((StringBuilder)charSequence).append(string);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
        }
        Object object = ax.Ha.c.h().d("MPTH PARENT:").j();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)charSequence);
        stringBuilder.append(":");
        stringBuilder.append(string);
        ((ax.Ha.b)object).g(stringBuilder.toString()).h();
        object = new StringBuilder();
        ((StringBuilder)object).append("mergePath parent error: ");
        ((StringBuilder)object).append((String)charSequence);
        ((StringBuilder)object).append(":");
        ((StringBuilder)object).append(string);
        throw new IllegalArgumentException(((StringBuilder)object).toString());
    }

    public static String R(String string, String charSequence) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return charSequence;
        }
        String string2 = charSequence;
        if (((String)charSequence).startsWith("/")) {
            string2 = ((String)charSequence).substring(1);
        }
        if (string.endsWith((String)(charSequence = a))) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string);
            ((StringBuilder)charSequence).append(string2);
            return ((StringBuilder)charSequence).toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append((String)charSequence);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public static String S(String string) {
        ax.u3.b.b(string);
        String string2 = string.endsWith(a) && string.length() > 1 ? string.substring(0, string.length() - 1) : string;
        if (!d0.B(string2)) {
            ax.Ha.c.h().f().d("RLSISNOT!!:").j().g(string).h();
        }
        return string2;
    }

    public static String T(String string) {
        if (string == null) {
            return null;
        }
        return string.toLowerCase();
    }

    public static String U(String string) {
        CharSequence charSequence;
        ax.u3.b.b(string);
        String string2 = a;
        if (!string.startsWith(string2)) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(string);
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = string;
        }
        CharSequence charSequence2 = charSequence;
        if (((String)charSequence).endsWith(string2)) {
            charSequence2 = charSequence;
            if (((String)charSequence).length() > 1) {
                charSequence2 = ((String)charSequence).substring(0, ((String)charSequence).length() - 1);
            }
        }
        if (!d0.B(charSequence2)) {
            ax.Ha.c.h().f().d("NFPISNOT!!:").j().g(string).h();
        }
        return charSequence2;
    }

    public static String V(String string) {
        String string2;
        ax.u3.b.b(string);
        CharSequence charSequence = string;
        while (((String)charSequence).endsWith(string2 = a) && ((String)charSequence).length() > 1) {
            charSequence = ((String)charSequence).substring(0, ((String)charSequence).length() - 1);
        }
        String string3 = charSequence;
        if (!((String)charSequence).startsWith(string2)) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(string);
            string3 = ((StringBuilder)charSequence).toString();
        }
        if (!d0.B(string3)) {
            ax.Ha.c.h().f().d("NFPISNOT 2 !!:").j().g(string).h();
        }
        return string3;
    }

    public static String W(K object, String string) {
        ax.u3.b.c(d0.B(string));
        object = ((K)object).e();
        if (object == null) {
            return null;
        }
        if ("/".equals(string)) {
            return object;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static String[] X(String string) {
        ax.u3.b.c(d0.B(string));
        String string2 = a;
        if (string.equals(string2)) {
            return new String[0];
        }
        return string.substring(1).split(string2);
    }

    private static void Y(StringBuilder stringBuilder, int n8) {
        byte[] byArray = stringBuilder.toString().getBytes(Charset.defaultCharset());
        if (byArray.length > n8) {
            while (byArray.length > n8 - 3) {
                stringBuilder.deleteCharAt(stringBuilder.length() / 2);
                byArray = stringBuilder.toString().getBytes(Charset.defaultCharset());
            }
            stringBuilder.insert(stringBuilder.length() / 2, "...");
        }
    }

    public static boolean a(List<String> object) {
        Iterator<String> iterator = object.iterator();
        object = null;
        while (iterator.hasNext()) {
            String string = d0.f(iterator.next());
            if (object == null) {
                object = string;
                continue;
            }
            if (((String)object).equals(string)) continue;
            return false;
        }
        return true;
    }

    public static String b(String string) {
        if (!(TextUtils.isEmpty((CharSequence)string) || ".".equals(string) || "..".equals(string))) {
            StringBuilder stringBuilder = new StringBuilder(string.length());
            for (int i8 = 0; i8 < string.length(); ++i8) {
                char c8 = string.charAt(i8);
                if (d0.N(c8)) {
                    stringBuilder.append(c8);
                    continue;
                }
                stringBuilder.append('_');
            }
            d0.Y(stringBuilder, 255);
            return stringBuilder.toString();
        }
        return "(invalid)";
    }

    public static boolean c(String string) {
        return Pattern.compile("([\\\\/:*?\"<>|])").matcher(string).find();
    }

    public static String d(String string) {
        String string2;
        string = string2 = d0.g(string);
        if (string2.toLowerCase().endsWith(".tar")) {
            string = string2.substring(0, string2.length() - 4);
        }
        return string;
    }

    public static String e(String string, String string2) {
        String string3;
        string2 = string3 = d0.g(string2);
        if (string3.toLowerCase().endsWith(".tar")) {
            string2 = string3.substring(0, string3.length() - 4);
        }
        return d0.Q(string, string2);
    }

    public static String f(String string) {
        if (string == null) {
            ax.Ha.c.h().d("EXTREXT!!!: ").j().h();
            return "";
        }
        int n8 = string.lastIndexOf(46);
        int n9 = string.lastIndexOf(47);
        if (n8 >= 0 && n8 > n9) {
            return string.substring(n8 + 1);
        }
        return "";
    }

    public static String g(String string) {
        ax.u3.b.c(d0.A(string));
        int n8 = string.lastIndexOf(46);
        String string2 = string;
        if (n8 >= 0) {
            string2 = string.substring(0, n8);
        }
        return string2;
    }

    public static String h(String string) {
        if (!c.a()) {
            if (TextUtils.isEmpty((CharSequence)string)) {
                ax.Ha.b b8 = ax.Ha.c.h().f().d("ENF1:").j();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("PATH:");
                stringBuilder.append(string);
                b8.g(stringBuilder.toString()).h();
                return string;
            }
            if (!d0.B(string)) {
                Object object = ax.Ha.c.h().f().d("ENF2:").j();
                CharSequence charSequence = new StringBuilder();
                charSequence.append("PATH:");
                charSequence.append(string);
                ((ax.Ha.b)object).g(charSequence.toString()).h();
                charSequence = a;
                object = string;
                if (string.endsWith((String)charSequence)) {
                    object = string.substring(0, string.length() - 1);
                }
                return ((String)object).substring(((String)object).lastIndexOf((String)charSequence) + 1);
            }
        }
        ax.u3.b.c(d0.B(string));
        String string2 = a;
        String string3 = string;
        if (string.endsWith(string2)) {
            string3 = string.substring(0, string.length() - 1);
        }
        return string3.substring(string3.lastIndexOf(string2) + 1);
    }

    public static String i(String string) {
        String string2 = a;
        String string3 = string;
        if (string.endsWith(string2)) {
            string3 = string.substring(0, string.length() - 1);
        }
        return string3.substring(string3.lastIndexOf(string2) + 1);
    }

    public static String j(String string) {
        if (!c.a() && !d0.A(string)) {
            ax.Ha.c.h().d("ENEX:").g(string).h();
            return d0.f(string).toLowerCase();
        }
        ax.u3.b.c(d0.A(string));
        return d0.f(string).toLowerCase();
    }

    public static String k(String string) {
        return d0.f(string).toLowerCase();
    }

    public static String l(String string) {
        ax.u3.b.c(d0.B(string));
        int n8 = string.lastIndexOf(47);
        int n9 = string.lastIndexOf(46);
        String string2 = string;
        if (n9 >= 0) {
            string2 = string;
            if (n9 > n8) {
                string2 = string.substring(0, n9);
            }
        }
        return string2;
    }

    public static String m(String string) {
        if (d0.B(string)) {
            String string2 = string;
            if (string.startsWith(a)) {
                string2 = string.substring(1);
            }
            return string2;
        }
        throw new IllegalArgumentException("extractPathWithoutStartingSeparator path is not normalized");
    }

    public static String n(String string, String string2) {
        return d0.o(string, string2, false);
    }

    public static String o(String charSequence, String string, boolean bl) {
        ax.u3.b.c(d0.B((String)charSequence));
        if (d0.B(string)) {
            CharSequence charSequence2 = charSequence;
            if (!d0.J((String)charSequence, string, bl)) {
                if (d0.I(((String)charSequence).toLowerCase(), string)) {
                    charSequence2 = ((String)charSequence).toLowerCase();
                    ax.Ha.b b8 = ax.Ha.c.h().d("ESP1:").j();
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append((String)charSequence2);
                    ((StringBuilder)charSequence).append(":");
                    ((StringBuilder)charSequence).append(string);
                    b8.g(((StringBuilder)charSequence).toString()).h();
                } else {
                    ax.Ha.b b9 = ax.Ha.c.h().d("!!ESP2:").j();
                    charSequence2 = new StringBuilder();
                    ((StringBuilder)charSequence2).append((String)charSequence);
                    ((StringBuilder)charSequence2).append(":");
                    ((StringBuilder)charSequence2).append(string);
                    b9.g(((StringBuilder)charSequence2).toString()).h();
                    ax.u3.b.g("NOT SUB DIRECTORY");
                    charSequence2 = charSequence;
                }
            }
            if (((String)charSequence2).equals(a)) {
                return string;
            }
            charSequence = string.substring(((String)charSequence2).length(), string.length());
            ax.u3.b.c(d0.B((String)charSequence));
            return charSequence;
        }
        throw new IllegalArgumentException("extractSubPath path is not normalized");
    }

    public static String p(String string) {
        int n8 = string.lastIndexOf(47);
        int n9 = string.lastIndexOf(46);
        String string2 = string;
        if (n9 >= 0) {
            string2 = string;
            if (n9 > n8) {
                string2 = string.substring(0, n9);
            }
        }
        return string2;
    }

    public static String q(String charSequence, int n8) {
        int n9 = n8 + 2;
        String[] stringArray = ((String)charSequence).split(File.separator);
        if (n9 >= stringArray.length) {
            return charSequence;
        }
        charSequence = new StringBuilder();
        for (n8 = 1; n8 < n9; ++n8) {
            ((StringBuilder)charSequence).append(a);
            ((StringBuilder)charSequence).append(stringArray[n8]);
        }
        return ((StringBuilder)charSequence).toString();
    }

    public static String r(String string) {
        if (!c.a()) {
            if (TextUtils.isEmpty((CharSequence)string)) {
                ax.Ha.c.h().f().d("GPP1:").g(string).j().h();
                return string;
            }
            if (!d0.B(string)) {
                ax.Ha.c.h().f().d("GPP2:").j().g(string).h();
                String string2 = a;
                String string3 = string;
                if (string.endsWith(string2)) {
                    string3 = string.substring(0, string.length() - 1);
                }
                if ((string = string3.substring(0, Math.max(string3.lastIndexOf(string2), 0))).isEmpty()) {
                    return string2;
                }
                return string;
            }
        }
        ax.u3.b.c(d0.B(string));
        String string4 = a;
        String string5 = string;
        if (string.endsWith(string4)) {
            string5 = string.substring(0, string.length() - 1);
        }
        if ((string = string5.substring(0, Math.max(string5.lastIndexOf(string4), 0))).isEmpty()) {
            return string4;
        }
        return string;
    }

    public static String s(n comparable) {
        if (f.S(((n)comparable).P())) {
            return d0.v(h.q(((n)comparable).L()), ((n)comparable).T(), Boolean.TRUE);
        }
        if (f.g0(((n)comparable).P())) {
            String string = ((n)comparable).T();
            if (!string.equals(K.e.e()) && !string.equals(K.f.e())) {
                return d0.v(j.F().J(string, null), string, comparable.isDirectory());
            }
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append("/");
            ((StringBuilder)comparable).append(d0.h(string));
            return ((StringBuilder)comparable).toString();
        }
        if (B.P((n)comparable)) {
            String string = ((n)comparable).T();
            return d0.v(j.F().J(((n)comparable).E(), ((n)comparable).R()), string, comparable.isDirectory());
        }
        return d0.v(((n)comparable).R(), ((n)comparable).T(), comparable.isDirectory());
    }

    public static String t(String string) {
        String string2 = a;
        String string3 = string;
        if (string.endsWith(string2)) {
            string3 = string.substring(0, string.length() - 1);
        }
        if ((string = string3.substring(0, Math.max(string3.lastIndexOf(string2), 0))).isEmpty()) {
            return string2;
        }
        return string;
    }

    public static String u(String string) {
        String string2 = a;
        String string3 = string;
        if (string.endsWith(string2)) {
            string3 = string.substring(0, string.length() - 1);
        }
        return string3.substring(0, Math.max(string3.lastIndexOf(string2), 0));
    }

    public static String v(K object, String string, Boolean comparable) {
        if (!d0.B(string)) {
            ax.Ha.c.h().f().d("Broken Path : relativePath").j().g(string).h();
            return string;
        }
        if (string == null) {
            return null;
        }
        String string2 = ((K)object).e();
        if (string2 == null) {
            return null;
        }
        if (f.g0(((K)object).d())) {
            if (string.equals(string2)) {
                return "/";
            }
            if (comparable == null) {
                comparable = new StringBuilder();
                ((StringBuilder)comparable).append("RELATIVE PATH DIR ERROR :");
                ((StringBuilder)comparable).append(((K)object).d().name());
                ax.u3.b.g(((StringBuilder)comparable).toString());
                object = new StringBuilder();
                ((StringBuilder)object).append("/");
                ((StringBuilder)object).append(d0.h(string));
                return ((StringBuilder)object).toString();
            }
            if (((Boolean)comparable).booleanValue()) {
                object = new StringBuilder();
                ((StringBuilder)object).append("/");
                ((StringBuilder)object).append(d0.h(string));
                return ((StringBuilder)object).toString();
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("/");
            ((StringBuilder)object).append(d0.h(d0.r(string)));
            ((StringBuilder)object).append("/");
            ((StringBuilder)object).append(d0.h(string));
            return ((StringBuilder)object).toString();
        }
        return d0.x(string2, string);
    }

    public static String w(n n8) {
        if (f.g0(n8.P())) {
            return d0.v(n8.R(), n8.E(), n8.isDirectory());
        }
        return d0.v(n8.R(), n8.E(), null);
    }

    public static String x(String string, String string2) {
        if (string2.equals(string)) {
            return "/";
        }
        if (string2.startsWith(string)) {
            if (string.endsWith("/")) {
                return string2.substring(string.length() - 1);
            }
            return string2.substring(string.length());
        }
        return string2;
    }

    public static String y(String string) {
        String string2;
        if (d0.B(string) && !TextUtils.isEmpty((CharSequence)(string2 = d0.h(string)))) {
            return d0.b(string2);
        }
        return d0.b(string);
    }

    public static boolean z(String string) {
        int n8;
        int n9;
        if (string == null) {
            return false;
        }
        if (n9 == 0) {
            return false;
        }
        for (n8 = n9 = string.length(); n8 > 0 && string.charAt(n8 - 1) == b; --n8) {
        }
        if (n8 == 0) {
            return false;
        }
        n9 = string.lastIndexOf(b, n8 - 1) + 1;
        return n9 < n8 && string.charAt(n9) == '.';
    }
}

