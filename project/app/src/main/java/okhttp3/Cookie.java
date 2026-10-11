/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.B2.c;
import ax.Gb.g;
import ax.Gb.l;
import ax.K2.t;
import ax.Ob.h;
import ax.sb.m;
import ax.tb.o;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Cookie {
    public static final Companion Companion = new Companion(null);
    private static final Pattern DAY_OF_MONTH_PATTERN;
    private static final Pattern MONTH_PATTERN;
    private static final Pattern TIME_PATTERN;
    private static final Pattern YEAR_PATTERN;
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;
    private final String name;
    private final String path;
    private final boolean persistent;
    private final boolean secure;
    private final String value;

    static {
        YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
        MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
        DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
        TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    }

    private Cookie(String string, String string2, long l8, String string3, String string4, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.name = string;
        this.value = string2;
        this.expiresAt = l8;
        this.domain = string3;
        this.path = string4;
        this.secure = bl;
        this.httpOnly = bl2;
        this.persistent = bl3;
        this.hostOnly = bl4;
    }

    public /* synthetic */ Cookie(String string, String string2, long l8, String string3, String string4, boolean bl, boolean bl2, boolean bl3, boolean bl4, g g8) {
        this(string, string2, l8, string3, string4, bl, bl2, bl3, bl4);
    }

    public static final Cookie parse(HttpUrl httpUrl, String string) {
        return Companion.parse(httpUrl, string);
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return Companion.parseAll(httpUrl, headers);
    }

    public final String -deprecated_domain() {
        return this.domain;
    }

    public final long -deprecated_expiresAt() {
        return this.expiresAt;
    }

    public final boolean -deprecated_hostOnly() {
        return this.hostOnly;
    }

    public final boolean -deprecated_httpOnly() {
        return this.httpOnly;
    }

    public final String -deprecated_name() {
        return this.name;
    }

    public final String -deprecated_path() {
        return this.path;
    }

    public final boolean -deprecated_persistent() {
        return this.persistent;
    }

    public final boolean -deprecated_secure() {
        return this.secure;
    }

    public final String -deprecated_value() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object object) {
        if (object instanceof Cookie) {
            object = (Cookie)object;
            if (l.a(((Cookie)object).name, this.name) && l.a(((Cookie)object).value, this.value) && ((Cookie)object).expiresAt == this.expiresAt && l.a(((Cookie)object).domain, this.domain) && l.a(((Cookie)object).path, this.path) && ((Cookie)object).secure == this.secure && ((Cookie)object).httpOnly == this.httpOnly && ((Cookie)object).persistent == this.persistent && ((Cookie)object).hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((527 + this.name.hashCode()) * 31 + this.value.hashCode()) * 31 + t.a(this.expiresAt)) * 31 + this.domain.hashCode()) * 31 + this.path.hashCode()) * 31 + c.a(this.secure)) * 31 + c.a(this.httpOnly)) * 31 + c.a(this.persistent)) * 31 + c.a(this.hostOnly);
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(HttpUrl httpUrl) {
        l.f(httpUrl, "url");
        boolean bl = this.hostOnly ? l.a(httpUrl.host(), this.domain) : Cookie.Companion.domainMatch(httpUrl.host(), this.domain);
        if (!bl) {
            return false;
        }
        if (!Cookie.Companion.pathMatch(httpUrl, this.path)) {
            return false;
        }
        return !this.secure || httpUrl.isHttps();
        {
        }
    }

    public final String name() {
        return this.name;
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return this.toString$okhttp(false);
    }

    public final String toString$okhttp(boolean bl) {
        CharSequence charSequence = new StringBuilder();
        charSequence.append(this.name);
        charSequence.append('=');
        charSequence.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                charSequence.append("; max-age=0");
            } else {
                charSequence.append("; expires=");
                charSequence.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            charSequence.append("; domain=");
            if (bl) {
                charSequence.append(".");
            }
            charSequence.append(this.domain);
        }
        charSequence.append("; path=");
        charSequence.append(this.path);
        if (this.secure) {
            charSequence.append("; secure");
        }
        if (this.httpOnly) {
            charSequence.append("; httponly");
        }
        charSequence = charSequence.toString();
        l.e(charSequence, "toString()");
        return charSequence;
    }

    public final String value() {
        return this.value;
    }

    public static final class Builder {
        private String domain;
        private long expiresAt = 253402300799999L;
        private boolean hostOnly;
        private boolean httpOnly;
        private String name;
        private String path = "/";
        private boolean persistent;
        private boolean secure;
        private String value;

        private final Builder domain(String string, boolean bl) {
            CharSequence charSequence = HostnamesKt.toCanonicalHost(string);
            if (charSequence != null) {
                this.domain = charSequence;
                this.hostOnly = bl;
                return this;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("unexpected domain: ");
            ((StringBuilder)charSequence).append(string);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
        }

        public final Cookie build() {
            String string = this.name;
            if (string != null) {
                String string2 = this.value;
                if (string2 != null) {
                    long l8 = this.expiresAt;
                    String string3 = this.domain;
                    if (string3 != null) {
                        return new Cookie(string, string2, l8, string3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
                    }
                    throw new NullPointerException("builder.domain == null");
                }
                throw new NullPointerException("builder.value == null");
            }
            throw new NullPointerException("builder.name == null");
        }

        public final Builder domain(String string) {
            l.f(string, "domain");
            return this.domain(string, false);
        }

        public final Builder expiresAt(long l8) {
            long l9 = l8;
            if (l8 <= 0L) {
                l9 = Long.MIN_VALUE;
            }
            l8 = l9;
            if (l9 > 253402300799999L) {
                l8 = 253402300799999L;
            }
            this.expiresAt = l8;
            this.persistent = true;
            return this;
        }

        public final Builder hostOnlyDomain(String string) {
            l.f(string, "domain");
            return this.domain(string, true);
        }

        public final Builder httpOnly() {
            this.httpOnly = true;
            return this;
        }

        public final Builder name(String string) {
            l.f(string, "name");
            if (l.a(((Object)h.A0(string)).toString(), string)) {
                this.name = string;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed");
        }

        public final Builder path(String string) {
            l.f(string, "path");
            if (h.H(string, "/", false, 2, null)) {
                this.path = string;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'");
        }

        public final Builder secure() {
            this.secure = true;
            return this;
        }

        public final Builder value(String string) {
            l.f(string, "value");
            if (l.a(((Object)h.A0(string)).toString(), string)) {
                this.value = string;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed");
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        private final int dateCharacterOffset(String string, int n8, int n9, boolean bl) {
            while (n8 < n9) {
                char c8 = string.charAt(n8);
                c8 = !(c8 < ' ' && c8 != '\t' || c8 >= '\u007f' || '0' <= c8 && c8 < ':' || 'a' <= c8 && c8 < '{' || 'A' <= c8 && c8 < '[' || c8 == ':') ? (char)'\u0000' : '\u0001';
                if (c8 == (bl ^ '\u0001')) {
                    return n8;
                }
                ++n8;
            }
            return n9;
        }

        private final boolean domainMatch(String string, String string2) {
            if (l.a(string, string2)) {
                return true;
            }
            return h.u(string, string2, false, 2, null) && string.charAt(string.length() - string2.length() - 1) == '.' && !Util.canParseAsIpAddress(string);
        }

        private final String parseDomain(String string) {
            if (!h.u(string, ".", false, 2, null)) {
                if ((string = HostnamesKt.toCanonicalHost(h.j0(string, "."))) != null) {
                    return string;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        private final long parseExpires(String object, int n8, int n9) {
            int n10 = this.dateCharacterOffset((String)object, n8, n9, false);
            Matcher matcher = TIME_PATTERN.matcher((CharSequence)object);
            n8 = -1;
            int n11 = -1;
            int n12 = -1;
            int n13 = -1;
            int n14 = -1;
            int n15 = -1;
            while (n10 < n9) {
                int n16;
                int n17;
                int n18;
                int n19;
                int n20;
                int n21;
                Object object2;
                int n22 = this.dateCharacterOffset((String)object, n10 + 1, n9, true);
                matcher.region(n10, n22);
                if (n11 == -1 && matcher.usePattern(TIME_PATTERN).matches()) {
                    object2 = matcher.group(1);
                    l.e(object2, "matcher.group(1)");
                    n21 = Integer.parseInt((String)object2);
                    object2 = matcher.group(2);
                    l.e(object2, "matcher.group(2)");
                    n20 = Integer.parseInt((String)object2);
                    object2 = matcher.group(3);
                    l.e(object2, "matcher.group(3)");
                    n19 = Integer.parseInt((String)object2);
                    n18 = n8;
                    n17 = n12;
                    n16 = n13;
                } else if (n12 == -1 && matcher.usePattern(DAY_OF_MONTH_PATTERN).matches()) {
                    object2 = matcher.group(1);
                    l.e(object2, "matcher.group(1)");
                    n17 = Integer.parseInt((String)object2);
                    n18 = n8;
                    n21 = n11;
                    n16 = n13;
                    n20 = n14;
                    n19 = n15;
                } else if (n13 == -1 && matcher.usePattern(MONTH_PATTERN).matches()) {
                    String string = matcher.group(1);
                    l.e(string, "matcher.group(1)");
                    object2 = Locale.US;
                    l.e(object2, "US");
                    object2 = string.toLowerCase((Locale)object2);
                    l.e(object2, "this as java.lang.String).toLowerCase(locale)");
                    string = MONTH_PATTERN.pattern();
                    l.e(string, "MONTH_PATTERN.pattern()");
                    n16 = h.V(string, (String)object2, 0, false, 6, null) / 4;
                    n18 = n8;
                    n21 = n11;
                    n17 = n12;
                    n20 = n14;
                    n19 = n15;
                } else {
                    n18 = n8;
                    n21 = n11;
                    n17 = n12;
                    n16 = n13;
                    n20 = n14;
                    n19 = n15;
                    if (n8 == -1) {
                        n18 = n8;
                        n21 = n11;
                        n17 = n12;
                        n16 = n13;
                        n20 = n14;
                        n19 = n15;
                        if (matcher.usePattern(YEAR_PATTERN).matches()) {
                            object2 = matcher.group(1);
                            l.e(object2, "matcher.group(1)");
                            n18 = Integer.parseInt((String)object2);
                            n19 = n15;
                            n20 = n14;
                            n16 = n13;
                            n17 = n12;
                            n21 = n11;
                        }
                    }
                }
                n10 = this.dateCharacterOffset((String)object, n22 + 1, n9, false);
                n8 = n18;
                n11 = n21;
                n12 = n17;
                n13 = n16;
                n14 = n20;
                n15 = n19;
            }
            n9 = n8;
            if (70 <= n8) {
                n9 = n8;
                if (n8 < 100) {
                    n9 = n8 + 1900;
                }
            }
            n8 = n9;
            if (n9 >= 0) {
                n8 = n9;
                if (n9 < 70) {
                    n8 = n9 + 2000;
                }
            }
            if (n8 >= 1601) {
                if (n13 != -1) {
                    if (1 <= n12 && n12 < 32) {
                        if (n11 >= 0 && n11 < 24) {
                            if (n14 >= 0 && n14 < 60) {
                                if (n15 >= 0 && n15 < 60) {
                                    object = new GregorianCalendar(Util.UTC);
                                    ((Calendar)object).setLenient(false);
                                    ((Calendar)object).set(1, n8);
                                    ((Calendar)object).set(2, n13 - 1);
                                    ((Calendar)object).set(5, n12);
                                    ((Calendar)object).set(11, n11);
                                    ((Calendar)object).set(12, n14);
                                    ((Calendar)object).set(13, n15);
                                    ((Calendar)object).set(14, 0);
                                    return ((Calendar)object).getTimeInMillis();
                                }
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        private final long parseMaxAge(String string) {
            long l8 = Long.MIN_VALUE;
            try {
                long l9 = Long.parseLong(string);
                if (l9 <= 0L) {
                    return Long.MIN_VALUE;
                }
                return l9;
            }
            catch (NumberFormatException numberFormatException) {
                if (new ax.Ob.g("-?\\d+").a(string)) {
                    if (!h.H(string, "-", false, 2, null)) {
                        l8 = Long.MAX_VALUE;
                    }
                    return l8;
                }
                throw numberFormatException;
            }
        }

        private final boolean pathMatch(HttpUrl object, String string) {
            if (l.a(object = ((HttpUrl)object).encodedPath(), string)) {
                return true;
            }
            if (h.H((String)object, string, false, 2, null)) {
                if (h.u(string, "/", false, 2, null)) {
                    return true;
                }
                if (((String)object).charAt(string.length()) == '/') {
                    return true;
                }
            }
            return false;
        }

        public final Cookie parse(HttpUrl httpUrl, String string) {
            l.f(httpUrl, "url");
            l.f(string, "setCookie");
            return this.parse$okhttp(System.currentTimeMillis(), httpUrl, string);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final Cookie parse$okhttp(long l8, HttpUrl object, String string) {
            l.f(object, "url");
            l.f(string, "setCookie");
            int n8 = Util.delimiterOffset$default(string, ';', 0, 0, 6, null);
            int n9 = Util.delimiterOffset$default(string, '=', 0, n8, 2, null);
            Cookie cookie = null;
            if (n9 == n8) {
                return null;
            }
            String string2 = Util.trimSubstring$default(string, 0, n9, 1, null);
            if (string2.length() == 0) {
                return null;
            }
            if (Util.indexOfControlOrNonAscii(string2) != -1) {
                return null;
            }
            String string3 = Util.trimSubstring(string, n9 + 1, n8);
            if (Util.indexOfControlOrNonAscii(string3) != -1) {
                return null;
            }
            ++n8;
            n9 = string.length();
            Object object2 = null;
            Object object3 = null;
            long l9 = -1L;
            boolean bl = false;
            boolean bl2 = true;
            boolean bl3 = false;
            long l10 = 253402300799999L;
            boolean bl4 = false;
            while (true) {
                boolean bl5;
                long l11;
                boolean bl6;
                boolean bl7;
                Object object4;
                long l12;
                Object object5;
                int n10;
                block27: {
                    block25: {
                        String string4;
                        block28: {
                            block26: {
                                block24: {
                                    if (n8 >= n9) break block25;
                                    n10 = Util.delimiterOffset(string, ';', n8, n9);
                                    int n11 = Util.delimiterOffset(string, '=', n8, n10);
                                    string4 = Util.trimSubstring(string, n8, n11);
                                    object5 = n11 < n10 ? Util.trimSubstring(string, n11 + 1, n10) : "";
                                    if (h.v(string4, "expires", true)) {
                                        l10 = l12 = this.parseExpires((String)object5, 0, ((String)object5).length());
                                        break block24;
                                    }
                                    if (!h.v(string4, "max-age", true)) break block26;
                                    try {
                                        l9 = l12 = this.parseMaxAge((String)object5);
                                    }
                                    catch (IllegalArgumentException | NumberFormatException illegalArgumentException) {
                                        object5 = object2;
                                        object4 = object3;
                                        l12 = l9;
                                        bl7 = bl2;
                                        bl6 = bl3;
                                        l11 = l10;
                                        bl5 = bl4;
                                    }
                                }
                                bl6 = true;
                                object5 = object2;
                                object4 = object3;
                                l12 = l9;
                                bl7 = bl2;
                                l11 = l10;
                                bl5 = bl4;
                                break block27;
                            }
                            if (h.v(string4, "domain", true)) {
                                object5 = this.parseDomain((String)object5);
                                bl7 = false;
                                object4 = object3;
                                l12 = l9;
                                bl6 = bl3;
                                l11 = l10;
                                bl5 = bl4;
                            }
                            if (!h.v(string4, "path", true)) break block28;
                            object4 = object5;
                            object5 = object2;
                            l12 = l9;
                            bl7 = bl2;
                            bl6 = bl3;
                            l11 = l10;
                            bl5 = bl4;
                            break block27;
                        }
                        if (h.v(string4, "secure", true)) {
                            bl5 = true;
                            object5 = object2;
                            object4 = object3;
                            l12 = l9;
                            bl7 = bl2;
                            bl6 = bl3;
                            l11 = l10;
                            break block27;
                        } else {
                            object5 = object2;
                            object4 = object3;
                            l12 = l9;
                            bl7 = bl2;
                            bl6 = bl3;
                            l11 = l10;
                            bl5 = bl4;
                            if (h.v(string4, "httponly", true)) {
                                bl = true;
                                bl5 = bl4;
                                l11 = l10;
                                bl6 = bl3;
                                bl7 = bl2;
                                l12 = l9;
                                object4 = object3;
                                object5 = object2;
                            }
                        }
                        break block27;
                    }
                    if (l9 == Long.MIN_VALUE) {
                        l8 = Long.MIN_VALUE;
                    } else if (l9 != -1L) {
                        l10 = l9 <= 9223372036854775L ? l9 * (long)1000 : Long.MAX_VALUE;
                        l8 = (l10 = l8 + l10) >= l8 && l10 <= 253402300799999L ? l10 : 253402300799999L;
                    } else {
                        l8 = l10;
                    }
                    object5 = ((HttpUrl)object).host();
                    if (object2 == null) {
                        string = object5;
                    } else {
                        string = object2;
                        if (!this.domainMatch((String)object5, (String)object2)) {
                            return cookie;
                        }
                    }
                    if (((String)object5).length() != string.length() && PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(string) == null) {
                        return cookie;
                    }
                    object5 = "/";
                    if (object3 != null) {
                        object2 = object3;
                        if (h.H((String)object3, "/", false, 2, cookie)) return new Cookie(string2, string3, l8, string, (String)object2, bl4, bl, bl3, bl2, null);
                    }
                    object3 = ((HttpUrl)object).encodedPath();
                    n8 = h.Z((CharSequence)object3, '/', 0, false, 6, null);
                    object = object5;
                    if (n8 != 0) {
                        object = ((String)object3).substring(0, n8);
                        l.e(object, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                    }
                    object2 = object;
                    return new Cookie(string2, string3, l8, string, (String)object2, bl4, bl, bl3, bl2, null);
                }
                n8 = n10 + 1;
                object2 = object5;
                object3 = object4;
                l9 = l12;
                bl2 = bl7;
                bl3 = bl6;
                l10 = l11;
                bl4 = bl5;
            }
        }

        public final List<Cookie> parseAll(HttpUrl object, Headers headers) {
            l.f(object, "url");
            l.f(headers, "headers");
            List<String> list = headers.values("Set-Cookie");
            int n8 = list.size();
            headers = null;
            for (int i8 = 0; i8 < n8; ++i8) {
                Cookie cookie = this.parse((HttpUrl)object, list.get(i8));
                if (cookie == null) continue;
                Iterable<m<String, String>> iterable = headers;
                if (headers == null) {
                    iterable = new ArrayList();
                }
                iterable.add(cookie);
                headers = iterable;
            }
            if (headers != null) {
                object = java.util.DesugarCollections.unmodifiableList((List)((Object)headers));
                l.e(object, "{\n        Collections.un\u2026ableList(cookies)\n      }");
                return object;
            }
            return o.j();
        }
    }
}

