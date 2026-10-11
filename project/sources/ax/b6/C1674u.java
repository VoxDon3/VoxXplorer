package ax.b6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* renamed from: ax.b6.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1674u implements InterfaceC1658s, Iterable<InterfaceC1658s> {
    private final String q;

    public C1674u(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.q = str;
    }

    @Override // ax.b6.InterfaceC1658s
    public final InterfaceC1658s c() {
        return new C1674u(this.q);
    }

    @Override // ax.b6.InterfaceC1658s
    public final Boolean e() {
        return Boolean.valueOf(!this.q.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1674u) {
            return this.q.equals(((C1674u) obj).q);
        }
        return false;
    }

    @Override // ax.b6.InterfaceC1658s
    public final Double f() {
        if (this.q.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.q);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // ax.b6.InterfaceC1658s
    public final String g() {
        return this.q;
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    @Override // ax.b6.InterfaceC1658s
    public final Iterator<InterfaceC1658s> i() {
        return new C1698x(this);
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC1658s> iterator() {
        return new C1690w(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ax.b6.InterfaceC1658s
    public final InterfaceC1658s k(String str, Z2 z2, List<InterfaceC1658s> list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        double d;
        char c;
        int i;
        C1674u c1674u;
        int i2;
        int i3;
        Z2 z22;
        String g;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1789698943:
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                d = 0.0d;
                if (str.equals(str4)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1776922004:
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                d = 0.0d;
                str4 = str2;
                if (str.equals(str6)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1464939364:
                str5 = "charAt";
                str7 = "toLocaleLowerCase";
                str4 = str2;
                str6 = "toString";
                if (str.equals(str7)) {
                    c = 2;
                    d = 0.0d;
                    break;
                }
                c = 65535;
                d = 0.0d;
            case -1361633751:
                str5 = "charAt";
                str4 = str2;
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                if (str.equals(str5)) {
                    c = 3;
                    d = 0.0d;
                    break;
                }
                c = 65535;
                d = 0.0d;
            case -1354795244:
                if (str.equals("concat")) {
                    c = 4;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = "toLocaleLowerCase";
                    d = 0.0d;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                c = 65535;
                d = 0.0d;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c = 5;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = "toLocaleLowerCase";
                    d = 0.0d;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                c = 65535;
                d = 0.0d;
            case -906336856:
                if (str.equals("search")) {
                    c = 6;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = "toLocaleLowerCase";
                    d = 0.0d;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                c = 65535;
                d = 0.0d;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    c = 7;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = "toLocaleLowerCase";
                    d = 0.0d;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                c = 65535;
                d = 0.0d;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = '\b';
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = "toLocaleLowerCase";
                    d = 0.0d;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                c = 65535;
                d = 0.0d;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c = '\t';
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = "toLocaleLowerCase";
                    d = 0.0d;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                c = 65535;
                d = 0.0d;
            case 3568674:
                if (str.equals(str3)) {
                    c = '\n';
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = "toLocaleLowerCase";
                    d = 0.0d;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                c = 65535;
                d = 0.0d;
            case 103668165:
                if (str.equals("match")) {
                    c = 11;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = "toLocaleLowerCase";
                    d = 0.0d;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                c = 65535;
                d = 0.0d;
            case 109526418:
                if (str.equals("slice")) {
                    c = '\f';
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = "toLocaleLowerCase";
                    d = 0.0d;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                c = 65535;
                d = 0.0d;
            case 109648666:
                if (str.equals("split")) {
                    c = '\r';
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = "toLocaleLowerCase";
                    d = 0.0d;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                c = 65535;
                d = 0.0d;
            case 530542161:
                if (str.equals("substring")) {
                    c = 14;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = "toLocaleLowerCase";
                    d = 0.0d;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                c = 65535;
                d = 0.0d;
            case 1094496948:
                if (str.equals("replace")) {
                    c = 15;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = "toLocaleLowerCase";
                    d = 0.0d;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                c = 65535;
                d = 0.0d;
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 16;
                    str4 = str2;
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = "toLocaleLowerCase";
                    d = 0.0d;
                    break;
                }
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                c = 65535;
                d = 0.0d;
            default:
                str4 = str2;
                str5 = "charAt";
                str6 = "toString";
                str7 = "toLocaleLowerCase";
                c = 65535;
                d = 0.0d;
                break;
        }
        switch (c) {
            case 0:
                C1709y2.g(str4, 1, list);
                String str8 = this.q;
                InterfaceC1658s b = z2.b(list.get(0));
                if ("length".equals(b.g())) {
                    return InterfaceC1658s.k;
                }
                double doubleValue = b.f().doubleValue();
                return (doubleValue != Math.floor(doubleValue) || (i = (int) doubleValue) < 0 || i >= str8.length()) ? InterfaceC1658s.l : InterfaceC1658s.k;
            case 1:
                C1709y2.g(str6, 0, list);
                return this;
            case 2:
                C1709y2.g(str7, 0, list);
                return new C1674u(this.q.toLowerCase());
            case 3:
                C1709y2.n(str5, 1, list);
                int a = !list.isEmpty() ? (int) C1709y2.a(z2.b(list.get(0)).f().doubleValue()) : 0;
                String str9 = this.q;
                return (a < 0 || a >= str9.length()) ? InterfaceC1658s.m : new C1674u(String.valueOf(str9.charAt(a)));
            case 4:
                c1674u = this;
                if (!list.isEmpty()) {
                    StringBuilder sb = new StringBuilder(c1674u.q);
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        sb.append(z2.b(list.get(i4)).g());
                    }
                    return new C1674u(sb.toString());
                }
                return c1674u;
            case 5:
                C1709y2.g("toLowerCase", 0, list);
                return new C1674u(this.q.toLowerCase(Locale.ENGLISH));
            case 6:
                C1709y2.n("search", 1, list);
                return Pattern.compile(!list.isEmpty() ? z2.b(list.get(0)).g() : InterfaceC1658s.f.g()).matcher(this.q).find() ? new C1594k(Double.valueOf(r0.start())) : new C1594k(Double.valueOf(-1.0d));
            case 7:
                C1709y2.g("toLocaleUpperCase", 0, list);
                return new C1674u(this.q.toUpperCase());
            case '\b':
                C1709y2.n("lastIndexOf", 2, list);
                String str10 = this.q;
                String g2 = list.size() <= 0 ? InterfaceC1658s.f.g() : z2.b(list.get(0)).g();
                return new C1594k(Double.valueOf(str10.lastIndexOf(g2, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : z2.b(list.get(1)).f().doubleValue()) ? Double.POSITIVE_INFINITY : C1709y2.a(r4)))));
            case '\t':
                C1709y2.g("toUpperCase", 0, list);
                return new C1674u(this.q.toUpperCase(Locale.ENGLISH));
            case '\n':
                C1709y2.g("toUpperCase", 0, list);
                return new C1674u(this.q.trim());
            case 11:
                C1709y2.n("match", 1, list);
                Matcher matcher = Pattern.compile(list.size() <= 0 ? HttpUrl.FRAGMENT_ENCODE_SET : z2.b(list.get(0)).g()).matcher(this.q);
                return matcher.find() ? new C1558g(new C1674u(matcher.group())) : InterfaceC1658s.g;
            case '\f':
                C1709y2.n("slice", 2, list);
                String str11 = this.q;
                double a2 = C1709y2.a(!list.isEmpty() ? z2.b(list.get(0)).f().doubleValue() : d);
                int max = (int) (a2 < d ? Math.max(str11.length() + a2, d) : Math.min(a2, str11.length()));
                double a3 = C1709y2.a(list.size() > 1 ? z2.b(list.get(1)).f().doubleValue() : str11.length());
                return new C1674u(str11.substring(max, Math.max(0, ((int) (a3 < 0.0d ? Math.max(str11.length() + a3, 0.0d) : Math.min(a3, str11.length()))) - max) + max));
            case '\r':
                C1709y2.n("split", 2, list);
                String str12 = this.q;
                if (str12.length() == 0) {
                    return new C1558g(this);
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String g3 = z2.b(list.get(0)).g();
                    long m = list.size() > 1 ? C1709y2.m(z2.b(list.get(1)).f().doubleValue()) : 2147483647L;
                    if (m == 0) {
                        return new C1558g();
                    }
                    String[] split = str12.split(Pattern.quote(g3), ((int) m) + 1);
                    int length = split.length;
                    if (!g3.isEmpty() || split.length <= 0) {
                        i2 = 0;
                    } else {
                        boolean isEmpty = split[0].isEmpty();
                        i2 = isEmpty;
                        if (split[split.length - 1].isEmpty()) {
                            length = split.length - 1;
                            i2 = isEmpty;
                        }
                    }
                    if (split.length > m) {
                        length--;
                    }
                    while (i2 < length) {
                        arrayList.add(new C1674u(split[i2]));
                        i2++;
                    }
                }
                return new C1558g(arrayList);
            case 14:
                C1709y2.n("substring", 2, list);
                String str13 = this.q;
                int a4 = !list.isEmpty() ? (int) C1709y2.a(z2.b(list.get(0)).f().doubleValue()) : 0;
                int a5 = list.size() > 1 ? (int) C1709y2.a(z2.b(list.get(1)).f().doubleValue()) : str13.length();
                int min = Math.min(Math.max(a4, 0), str13.length());
                int min2 = Math.min(Math.max(a5, 0), str13.length());
                return new C1674u(str13.substring(Math.min(min, min2), Math.max(min, min2)));
            case 15:
                c1674u = this;
                C1709y2.n("replace", 2, list);
                InterfaceC1658s interfaceC1658s = InterfaceC1658s.f;
                String g4 = interfaceC1658s.g();
                if (!list.isEmpty()) {
                    g4 = z2.b(list.get(0)).g();
                    if (list.size() > 1) {
                        interfaceC1658s = z2.b(list.get(1));
                    }
                }
                String str14 = c1674u.q;
                int indexOf = str14.indexOf(g4);
                if (indexOf >= 0) {
                    if (interfaceC1658s instanceof AbstractC1619n) {
                        i3 = 0;
                        interfaceC1658s = ((AbstractC1619n) interfaceC1658s).a(z2, Arrays.asList(new C1674u(g4), new C1594k(Double.valueOf(indexOf)), c1674u));
                    } else {
                        i3 = 0;
                    }
                    return new C1674u(str14.substring(i3, indexOf) + interfaceC1658s.g() + str14.substring(indexOf + g4.length()));
                }
                return c1674u;
            case 16:
                C1709y2.n("indexOf", 2, list);
                String str15 = this.q;
                if (list.size() <= 0) {
                    g = InterfaceC1658s.f.g();
                    z22 = z2;
                } else {
                    z22 = z2;
                    g = z22.b(list.get(0)).g();
                }
                return new C1594k(Double.valueOf(str15.indexOf(g, (int) C1709y2.a(list.size() < 2 ? d : z22.b(list.get(1)).f().doubleValue()))));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final String toString() {
        return "\"" + this.q + "\"";
    }
}
