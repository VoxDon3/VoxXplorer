package ax.c3;

import android.text.TextUtils;
import ax.u3.C3184b;
import com.voxdon.xplorer.file.AbstractC3595n;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class d0 {
    public static final String a = File.separator;
    public static final char b = File.separatorChar;

    public static boolean A(String str) {
        return str.indexOf(a) < 0;
    }

    public static boolean B(String str) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return false;
        }
        char charAt = str.charAt(0);
        char c = b;
        if (charAt != c) {
            return false;
        }
        return length == 1 || str.charAt(length - 1) != c;
    }

    public static boolean C(String str) {
        return ".".equals(str) || "..".equals(str);
    }

    public static boolean D(K k, String str) {
        String e = k.e();
        if (!TextUtils.isEmpty(e)) {
            return e.equals(str);
        }
        ax.Ha.c.h().f().d("ISROOT2").j().a("getRootPath == null").g(k.toString() + "," + e + "," + ax.Q2.e.z()).h();
        return false;
    }

    public static boolean E(AbstractC3595n abstractC3595n) {
        if (abstractC3595n != null) {
            return D(abstractC3595n.R(), abstractC3595n.E());
        }
        ax.Ha.c.h().d("ISROOT:").j().h();
        return false;
    }

    public static boolean F(String str, String str2) {
        return str.equalsIgnoreCase(str2);
    }

    public static boolean G(String str, String str2) {
        if (!B(str)) {
            ax.Q2.d.c("ISFP1", new Exception("Invalid path 1: " + str));
            ax.Ha.c.h().d("ISFP 1:").j().g(str).h();
        }
        if (!B(str2)) {
            ax.Q2.d.c("ISFP2", new Exception("Invalid path 2: " + str2));
            ax.Ha.c.h().d("ISFP 2:").j().g(str2).h();
        }
        return str.equals(str2);
    }

    public static boolean H(String str, String str2) {
        if (str != null && str2 != null) {
            if (B(str) && B(str2)) {
                int length = str.length();
                int length2 = str2.length();
                if (length == 1) {
                    return true;
                }
                if (length2 < length || !str2.startsWith(str)) {
                    return false;
                }
                return length2 == length || str2.charAt(length) == b;
            }
            ax.Q2.d.c("isSameOrSubdirectoryError", new Exception("isSameOrSubdirectory path not normalized : " + str + " : " + str2));
        }
        return false;
    }

    public static boolean I(String str, String str2) {
        if (B(str)) {
            if (B(str2)) {
                int length = str.length();
                return length == 1 ? str2.charAt(0) == b : str2.length() > length && str2.startsWith(str) && str2.charAt(length) == b;
            }
            throw new IllegalArgumentException("isSubdirectory sub path is not normalized : " + str2);
        }
        ax.Ha.c.h().f().b("INVALID PARENT PATH").g("parent:" + str).h();
        throw new IllegalArgumentException("isSubdirectory parent path is not normalized : " + str);
    }

    public static boolean J(String str, String str2, boolean z) {
        return z ? I(str.toLowerCase(), str2.toLowerCase()) : I(str, str2);
    }

    public static boolean K(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!L(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean L(char c) {
        return ((c >= 0 && c <= 31) || c == '\"' || c == '*' || c == ':' || c == '<' || c == '\\' || c == '|' || c == 127 || c == '>' || c == '?') ? false : true;
    }

    public static boolean M(String str) {
        return str != null && str.equals(b(str));
    }

    private static boolean N(char c) {
        return ((c >= 0 && c <= 31) || c == '\"' || c == '*' || c == '/' || c == ':' || c == '<' || c == '\\' || c == '|' || c == 127 || c == '>' || c == '?') ? false : true;
    }

    public static String O(String str) {
        String str2 = a;
        if (str.endsWith(str2)) {
            return str;
        }
        return str + str2;
    }

    public static String P(String str, String str2) {
        C3184b.c(B(str));
        C3184b.c(B(str2));
        if (a.equals(str)) {
            return str2;
        }
        return str + str2;
    }

    public static String Q(String str, String str2) {
        String str3;
        if (!B(str)) {
            ax.Ha.c.h().d("MPTH PARENT:").j().g(str + ":" + str2).h();
            throw new IllegalArgumentException("mergePath parent error: " + str + ":" + str2);
        }
        if (str2.startsWith("/")) {
            ax.Ha.c.h().d("MPTH1:").j().g(str + ":" + str2).h();
            throw new IllegalArgumentException("mergePath name error: " + str2);
        }
        String str4 = a;
        if (str4.equals(str)) {
            str3 = str4 + str2;
        } else {
            str3 = str + str4 + str2;
        }
        if (B(str3)) {
            return str3;
        }
        ax.Ha.c.h().d("!!!!MPTH2").j().g(str + ":" + str2).h();
        throw new IllegalArgumentException("mergePath result error: " + str3 + ":" + str2);
    }

    public static String R(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (str2.startsWith("/")) {
            str2 = str2.substring(1);
        }
        String str3 = a;
        if (str.endsWith(str3)) {
            return str + str2;
        }
        return str + str3 + str2;
    }

    public static String S(String str) {
        C3184b.b(str);
        String substring = (!str.endsWith(a) || str.length() <= 1) ? str : str.substring(0, str.length() - 1);
        if (!B(substring)) {
            ax.Ha.c.h().f().d("RLSISNOT!!:").j().g(str).h();
        }
        return substring;
    }

    public static String T(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    public static String U(String str) {
        String str2;
        C3184b.b(str);
        String str3 = a;
        if (str.startsWith(str3)) {
            str2 = str;
        } else {
            str2 = str3 + str;
        }
        if (str2.endsWith(str3) && str2.length() > 1) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        if (!B(str2)) {
            ax.Ha.c.h().f().d("NFPISNOT!!:").j().g(str).h();
        }
        return str2;
    }

    public static String V(String str) {
        String str2;
        C3184b.b(str);
        String str3 = str;
        while (true) {
            str2 = a;
            if (!str3.endsWith(str2) || str3.length() <= 1) {
                break;
            }
            str3 = str3.substring(0, str3.length() - 1);
        }
        if (!str3.startsWith(str2)) {
            str3 = str2 + str;
        }
        if (!B(str3)) {
            ax.Ha.c.h().f().d("NFPISNOT 2 !!:").j().g(str).h();
        }
        return str3;
    }

    public static String W(K k, String str) {
        C3184b.c(B(str));
        String e = k.e();
        if (e == null) {
            return null;
        }
        if ("/".equals(str)) {
            return e;
        }
        return e + str;
    }

    public static String[] X(String str) {
        C3184b.c(B(str));
        String str2 = a;
        return str.equals(str2) ? new String[0] : str.substring(1).split(str2);
    }

    private static void Y(StringBuilder sb, int i) {
        byte[] bytes = sb.toString().getBytes(Charset.defaultCharset());
        if (bytes.length > i) {
            int i2 = i - 3;
            while (bytes.length > i2) {
                sb.deleteCharAt(sb.length() / 2);
                bytes = sb.toString().getBytes(Charset.defaultCharset());
            }
            sb.insert(sb.length() / 2, "...");
        }
    }

    public static boolean a(List<String> list) {
        Iterator<String> it = list.iterator();
        String str = null;
        while (it.hasNext()) {
            String f = f(it.next());
            if (str == null) {
                str = f;
            } else if (!str.equals(f)) {
                return false;
            }
        }
        return true;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str) || ".".equals(str) || "..".equals(str)) {
            return "(invalid)";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (N(charAt)) {
                sb.append(charAt);
            } else {
                sb.append('_');
            }
        }
        Y(sb, 255);
        return sb.toString();
    }

    public static boolean c(String str) {
        return Pattern.compile("([\\\\/:*?\"<>|])").matcher(str).find();
    }

    public static String d(String str) {
        String g = g(str);
        return g.toLowerCase().endsWith(".tar") ? g.substring(0, g.length() - 4) : g;
    }

    public static String e(String str, String str2) {
        String g = g(str2);
        if (g.toLowerCase().endsWith(".tar")) {
            g = g.substring(0, g.length() - 4);
        }
        return Q(str, g);
    }

    public static String f(String str) {
        if (str == null) {
            ax.Ha.c.h().d("EXTREXT!!!: ").j().h();
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int lastIndexOf = str.lastIndexOf(46);
        return (lastIndexOf < 0 || lastIndexOf <= str.lastIndexOf(47)) ? HttpUrl.FRAGMENT_ENCODE_SET : str.substring(lastIndexOf + 1);
    }

    public static String g(String str) {
        C3184b.c(A(str));
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf >= 0 ? str.substring(0, lastIndexOf) : str;
    }

    public static String h(String str) {
        if (!ax.Q2.c.a()) {
            if (TextUtils.isEmpty(str)) {
                ax.Ha.c.h().f().d("ENF1:").j().g("PATH:" + str).h();
                return str;
            }
            if (!B(str)) {
                ax.Ha.c.h().f().d("ENF2:").j().g("PATH:" + str).h();
                String str2 = a;
                if (str.endsWith(str2)) {
                    str = str.substring(0, str.length() - 1);
                }
                return str.substring(str.lastIndexOf(str2) + 1);
            }
        }
        C3184b.c(B(str));
        String str3 = a;
        if (str.endsWith(str3)) {
            str = str.substring(0, str.length() - 1);
        }
        return str.substring(str.lastIndexOf(str3) + 1);
    }

    public static String i(String str) {
        String str2 = a;
        if (str.endsWith(str2)) {
            str = str.substring(0, str.length() - 1);
        }
        return str.substring(str.lastIndexOf(str2) + 1);
    }

    public static String j(String str) {
        if (ax.Q2.c.a() || A(str)) {
            C3184b.c(A(str));
            return f(str).toLowerCase();
        }
        ax.Ha.c.h().d("ENEX:").g(str).h();
        return f(str).toLowerCase();
    }

    public static String k(String str) {
        return f(str).toLowerCase();
    }

    public static String l(String str) {
        C3184b.c(B(str));
        int lastIndexOf = str.lastIndexOf(47);
        int lastIndexOf2 = str.lastIndexOf(46);
        return (lastIndexOf2 < 0 || lastIndexOf2 <= lastIndexOf) ? str : str.substring(0, lastIndexOf2);
    }

    public static String m(String str) {
        if (B(str)) {
            return str.startsWith(a) ? str.substring(1) : str;
        }
        throw new IllegalArgumentException("extractPathWithoutStartingSeparator path is not normalized");
    }

    public static String n(String str, String str2) {
        return o(str, str2, false);
    }

    public static String o(String str, String str2, boolean z) {
        C3184b.c(B(str));
        if (!B(str2)) {
            throw new IllegalArgumentException("extractSubPath path is not normalized");
        }
        if (!J(str, str2, z)) {
            if (I(str.toLowerCase(), str2)) {
                str = str.toLowerCase();
                ax.Ha.c.h().d("ESP1:").j().g(str + ":" + str2).h();
            } else {
                ax.Ha.c.h().d("!!ESP2:").j().g(str + ":" + str2).h();
                C3184b.g("NOT SUB DIRECTORY");
            }
        }
        if (str.equals(a)) {
            return str2;
        }
        String substring = str2.substring(str.length(), str2.length());
        C3184b.c(B(substring));
        return substring;
    }

    public static String p(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        int lastIndexOf2 = str.lastIndexOf(46);
        return (lastIndexOf2 < 0 || lastIndexOf2 <= lastIndexOf) ? str : str.substring(0, lastIndexOf2);
    }

    public static String q(String str, int i) {
        String[] split = str.split(File.separator);
        int i2 = i + 2;
        if (i2 >= split.length) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 1; i3 < i2; i3++) {
            sb.append(a);
            sb.append(split[i3]);
        }
        return sb.toString();
    }

    public static String r(String str) {
        if (!ax.Q2.c.a()) {
            if (TextUtils.isEmpty(str)) {
                ax.Ha.c.h().f().d("GPP1:").g(str).j().h();
                return str;
            }
            if (!B(str)) {
                ax.Ha.c.h().f().d("GPP2:").j().g(str).h();
                String str2 = a;
                if (str.endsWith(str2)) {
                    str = str.substring(0, str.length() - 1);
                }
                String substring = str.substring(0, Math.max(str.lastIndexOf(str2), 0));
                return substring.isEmpty() ? str2 : substring;
            }
        }
        C3184b.c(B(str));
        String str3 = a;
        if (str.endsWith(str3)) {
            str = str.substring(0, str.length() - 1);
        }
        String substring2 = str.substring(0, Math.max(str.lastIndexOf(str3), 0));
        return substring2.isEmpty() ? str3 : substring2;
    }

    public static String s(AbstractC3595n abstractC3595n) {
        if (ax.Q2.f.S(abstractC3595n.P())) {
            return v(ax.T2.h.q(abstractC3595n.L()), abstractC3595n.T(), Boolean.TRUE);
        }
        if (!ax.Q2.f.g0(abstractC3595n.P())) {
            if (!C1809B.P(abstractC3595n)) {
                return v(abstractC3595n.R(), abstractC3595n.T(), Boolean.valueOf(abstractC3595n.isDirectory()));
            }
            return v(ax.Z2.j.F().J(abstractC3595n.E(), abstractC3595n.R()), abstractC3595n.T(), Boolean.valueOf(abstractC3595n.isDirectory()));
        }
        String T = abstractC3595n.T();
        if (!T.equals(K.e.e()) && !T.equals(K.f.e())) {
            return v(ax.Z2.j.F().J(T, null), T, Boolean.valueOf(abstractC3595n.isDirectory()));
        }
        return "/" + h(T);
    }

    public static String t(String str) {
        String str2 = a;
        if (str.endsWith(str2)) {
            str = str.substring(0, str.length() - 1);
        }
        String substring = str.substring(0, Math.max(str.lastIndexOf(str2), 0));
        return substring.isEmpty() ? str2 : substring;
    }

    public static String u(String str) {
        String str2 = a;
        if (str.endsWith(str2)) {
            str = str.substring(0, str.length() - 1);
        }
        return str.substring(0, Math.max(str.lastIndexOf(str2), 0));
    }

    public static String v(K k, String str, Boolean bool) {
        String e;
        if (!B(str)) {
            ax.Ha.c.h().f().d("Broken Path : relativePath").j().g(str).h();
            return str;
        }
        if (str == null || (e = k.e()) == null) {
            return null;
        }
        if (!ax.Q2.f.g0(k.d())) {
            return x(e, str);
        }
        if (str.equals(e)) {
            return "/";
        }
        if (bool == null) {
            C3184b.g("RELATIVE PATH DIR ERROR :" + k.d().name());
            return "/" + h(str);
        }
        if (bool.booleanValue()) {
            return "/" + h(str);
        }
        return "/" + h(r(str)) + "/" + h(str);
    }

    public static String w(AbstractC3595n abstractC3595n) {
        return ax.Q2.f.g0(abstractC3595n.P()) ? v(abstractC3595n.R(), abstractC3595n.E(), Boolean.valueOf(abstractC3595n.isDirectory())) : v(abstractC3595n.R(), abstractC3595n.E(), null);
    }

    public static String x(String str, String str2) {
        return str2.equals(str) ? "/" : str2.startsWith(str) ? str.endsWith("/") ? str2.substring(str.length() - 1) : str2.substring(str.length()) : str2;
    }

    public static String y(String str) {
        if (B(str)) {
            String h = h(str);
            if (!TextUtils.isEmpty(h)) {
                return b(h);
            }
        }
        return b(str);
    }

    public static boolean z(String str) {
        int length;
        int lastIndexOf;
        if (str == null || (length = str.length()) == 0) {
            return false;
        }
        while (length > 0 && str.charAt(length - 1) == b) {
            length--;
        }
        return length != 0 && (lastIndexOf = str.lastIndexOf(b, length + (-1)) + 1) < length && str.charAt(lastIndexOf) == '.';
    }
}
