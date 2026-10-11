/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Ab.c;
import ax.Gb.g;
import ax.Gb.l;
import ax.Lb.f;
import ax.Ob.h;
import ax.tb.L;
import ax.tb.o;
import ax.xc.e;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class HttpUrl {
    public static final Companion Companion = new Companion(null);
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    private static final char[] HEX_DIGITS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    public HttpUrl(String string, String string2, String string3, String string4, int n8, List<String> list, List<String> list2, String string5, String string6) {
        l.f(string, "scheme");
        l.f(string2, "username");
        l.f(string3, "password");
        l.f(string4, "host");
        l.f(list, "pathSegments");
        l.f(string6, "url");
        this.scheme = string;
        this.username = string2;
        this.password = string3;
        this.host = string4;
        this.port = n8;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = string5;
        this.url = string6;
        this.isHttps = l.a(string, "https");
    }

    public static final int defaultPort(String string) {
        return Companion.defaultPort(string);
    }

    public static final HttpUrl get(String string) {
        return Companion.get(string);
    }

    public static final HttpUrl get(URI uRI) {
        return Companion.get(uRI);
    }

    public static final HttpUrl get(URL uRL) {
        return Companion.get(uRL);
    }

    public static final HttpUrl parse(String string) {
        return Companion.parse(string);
    }

    public final String -deprecated_encodedFragment() {
        return this.encodedFragment();
    }

    public final String -deprecated_encodedPassword() {
        return this.encodedPassword();
    }

    public final String -deprecated_encodedPath() {
        return this.encodedPath();
    }

    public final List<String> -deprecated_encodedPathSegments() {
        return this.encodedPathSegments();
    }

    public final String -deprecated_encodedQuery() {
        return this.encodedQuery();
    }

    public final String -deprecated_encodedUsername() {
        return this.encodedUsername();
    }

    public final String -deprecated_fragment() {
        return this.fragment;
    }

    public final String -deprecated_host() {
        return this.host;
    }

    public final String -deprecated_password() {
        return this.password;
    }

    public final List<String> -deprecated_pathSegments() {
        return this.pathSegments;
    }

    public final int -deprecated_pathSize() {
        return this.pathSize();
    }

    public final int -deprecated_port() {
        return this.port;
    }

    public final String -deprecated_query() {
        return this.query();
    }

    public final Set<String> -deprecated_queryParameterNames() {
        return this.queryParameterNames();
    }

    public final int -deprecated_querySize() {
        return this.querySize();
    }

    public final String -deprecated_scheme() {
        return this.scheme;
    }

    public final URI -deprecated_uri() {
        return this.uri();
    }

    public final URL -deprecated_url() {
        return this.url();
    }

    public final String -deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        int n8 = h.U(this.url, '#', 0, false, 6, null);
        String string = this.url.substring(n8 + 1);
        l.e(string, "this as java.lang.String).substring(startIndex)");
        return string;
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return FRAGMENT_ENCODE_SET;
        }
        int n8 = h.U(this.url, ':', this.scheme.length() + 3, false, 4, null);
        int n9 = h.U(this.url, '@', 0, false, 6, null);
        String string = this.url.substring(n8 + 1, n9);
        l.e(string, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return string;
    }

    public final String encodedPath() {
        int n8 = h.U(this.url, '/', this.scheme.length() + 3, false, 4, null);
        String string = this.url;
        int n9 = Util.delimiterOffset(string, "?#", n8, string.length());
        string = this.url.substring(n8, n9);
        l.e(string, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return string;
    }

    public final List<String> encodedPathSegments() {
        int n8 = h.U(this.url, '/', this.scheme.length() + 3, false, 4, null);
        Object object = this.url;
        int n9 = Util.delimiterOffset((String)object, "?#", n8, ((String)object).length());
        object = new ArrayList();
        while (n8 < n9) {
            int n10 = n8 + 1;
            n8 = Util.delimiterOffset(this.url, '/', n10, n9);
            String string = this.url.substring(n10, n8);
            l.e(string, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            object.add(string);
        }
        return object;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int n8 = h.U(this.url, '?', 0, false, 6, null) + 1;
        String string = this.url;
        int n9 = Util.delimiterOffset(string, '#', n8, string.length());
        string = this.url.substring(n8, n9);
        l.e(string, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return string;
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return FRAGMENT_ENCODE_SET;
        }
        int n8 = this.scheme.length() + 3;
        String string = this.url;
        int n9 = Util.delimiterOffset(string, ":@", n8, string.length());
        string = this.url.substring(n8, n9);
        l.e(string, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return string;
    }

    public boolean equals(Object object) {
        return object instanceof HttpUrl && l.a(((HttpUrl)object).url, this.url);
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(this.encodedUsername());
        builder.setEncodedPassword$okhttp(this.encodedPassword());
        builder.setHost$okhttp(this.host);
        int n8 = this.port != Companion.defaultPort(this.scheme) ? this.port : -1;
        builder.setPort$okhttp(n8);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll((Collection<String>)this.encodedPathSegments());
        builder.encodedQuery(this.encodedQuery());
        builder.setEncodedFragment$okhttp(this.encodedFragment());
        return builder;
    }

    public final Builder newBuilder(String object) {
        l.f(object, "link");
        try {
            Builder builder = new Builder();
            object = builder.parse$okhttp(this, (String)object);
            return object;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, stringBuilder);
        return stringBuilder.toString();
    }

    public final String queryParameter(String string) {
        block8: {
            int n8;
            int n9;
            int n10;
            block7: {
                int n11;
                block6: {
                    l.f(string, "name");
                    Iterable<String> iterable = this.queryNamesAndValues;
                    if (iterable == null) {
                        return null;
                    }
                    iterable = f.k(f.l(0, iterable.size()), 2);
                    n11 = ((ax.Lb.c)iterable).k();
                    n10 = ((ax.Lb.c)iterable).l();
                    n9 = ((ax.Lb.c)iterable).n();
                    if (n9 <= 0) break block6;
                    n8 = n11;
                    if (n11 <= n10) break block7;
                }
                if (n9 >= 0 || n10 > n11) break block8;
                n8 = n11;
            }
            while (true) {
                if (l.a(string, this.queryNamesAndValues.get(n8))) {
                    return this.queryNamesAndValues.get(n8 + 1);
                }
                if (n8 == n10) break;
                n8 += n9;
            }
        }
        return null;
    }

    public final String queryParameterName(int n8) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            list = list.get(n8 * 2);
            l.c(list);
            return (String)((Object)list);
        }
        throw new IndexOutOfBoundsException();
    }

    public final Set<String> queryParameterNames() {
        LinkedHashSet<String> linkedHashSet;
        block7: {
            int n8;
            int n9;
            int n10;
            Object object;
            block6: {
                int n11;
                block5: {
                    if (this.queryNamesAndValues == null) {
                        return L.d();
                    }
                    linkedHashSet = new LinkedHashSet();
                    object = f.k(f.l(0, this.queryNamesAndValues.size()), 2);
                    n11 = ((ax.Lb.c)object).k();
                    n10 = ((ax.Lb.c)object).l();
                    n9 = ((ax.Lb.c)object).n();
                    if (n9 <= 0) break block5;
                    n8 = n11;
                    if (n11 <= n10) break block6;
                }
                if (n9 >= 0 || n10 > n11) break block7;
                n8 = n11;
            }
            while (true) {
                object = this.queryNamesAndValues.get(n8);
                l.c(object);
                ((AbstractCollection)linkedHashSet).add((String)object);
                if (n8 == n10) break;
                n8 += n9;
            }
        }
        linkedHashSet = java.util.DesugarCollections.unmodifiableSet(linkedHashSet);
        l.e(linkedHashSet, "unmodifiableSet(result)");
        return linkedHashSet;
    }

    public final String queryParameterValue(int n8) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get(n8 * 2 + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String object) {
        ArrayList<String> arrayList;
        block8: {
            int n8;
            int n9;
            int n10;
            block7: {
                int n11;
                block6: {
                    l.f(object, "name");
                    if (this.queryNamesAndValues == null) {
                        return o.j();
                    }
                    arrayList = new ArrayList<String>();
                    ax.Lb.c c8 = f.k(f.l(0, this.queryNamesAndValues.size()), 2);
                    n11 = c8.k();
                    n10 = c8.l();
                    n9 = c8.n();
                    if (n9 <= 0) break block6;
                    n8 = n11;
                    if (n11 <= n10) break block7;
                }
                if (n9 >= 0 || n10 > n11) break block8;
                n8 = n11;
            }
            while (true) {
                if (l.a(object, this.queryNamesAndValues.get(n8))) {
                    arrayList.add(this.queryNamesAndValues.get(n8 + 1));
                }
                if (n8 == n10) break;
                n8 += n9;
            }
        }
        object = java.util.DesugarCollections.unmodifiableList(arrayList);
        l.e(object, "unmodifiableList(result)");
        return object;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder builder = this.newBuilder("/...");
        l.c(builder);
        return builder.username(FRAGMENT_ENCODE_SET).password(FRAGMENT_ENCODE_SET).build().toString();
    }

    public final HttpUrl resolve(String object) {
        l.f(object, "link");
        object = this.newBuilder((String)object);
        if (object != null) {
            return ((Builder)object).build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        Object object = this.newBuilder().reencodeForUri$okhttp().toString();
        try {
            URI uRI = new URI((String)object);
            return uRI;
        }
        catch (URISyntaxException uRISyntaxException) {
            try {
                ax.Ob.g g8 = new ax.Ob.g("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                object = URI.create(g8.b((CharSequence)object, FRAGMENT_ENCODE_SET));
            }
            catch (Exception exception) {
                throw new RuntimeException(uRISyntaxException);
            }
            l.e(object, "{\n      // Unlikely edge\u2026Unexpected!\n      }\n    }");
            return object;
        }
    }

    public final URL url() {
        try {
            URL uRL = new URL(this.url);
            return uRL;
        }
        catch (MalformedURLException malformedURLException) {
            throw new RuntimeException(malformedURLException);
        }
    }

    public final String username() {
        return this.username;
    }

    public static final class Builder {
        public static final Companion Companion = new Companion(null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private String encodedPassword = "";
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String encodedUsername = "";
        private String host;
        private int port = -1;
        private String scheme;

        public Builder() {
            ArrayList<String> arrayList = new ArrayList<String>();
            this.encodedPathSegments = arrayList;
            arrayList.add(HttpUrl.FRAGMENT_ENCODE_SET);
        }

        private final Builder addPathSegments(String string, boolean bl) {
            int n8;
            int n9 = 0;
            do {
                boolean bl2 = (n8 = Util.delimiterOffset(string, "/\\", n9, string.length())) < string.length();
                this.push(string, n9, n8, bl2, bl);
            } while ((n9 = n8 + 1) <= string.length());
            return this;
        }

        private final int effectivePort() {
            int n8 = this.port;
            if (n8 != -1) {
                return n8;
            }
            okhttp3.HttpUrl$Companion companion = Companion;
            String string = this.scheme;
            l.c(string);
            return companion.defaultPort(string);
        }

        private final boolean isDot(String string) {
            return l.a(string, ".") || h.v(string, "%2e", true);
            {
            }
        }

        private final boolean isDotDot(String string) {
            return l.a(string, "..") || h.v(string, "%2e.", true) || h.v(string, ".%2e", true) || h.v(string, "%2e%2e", true);
            {
            }
        }

        private final void pop() {
            List<String> list = this.encodedPathSegments;
            if (list.remove(list.size() - 1).length() == 0 && !((Collection)this.encodedPathSegments).isEmpty()) {
                list = this.encodedPathSegments;
                list.set(list.size() - 1, HttpUrl.FRAGMENT_ENCODE_SET);
                return;
            }
            this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
        }

        private final void push(String string, int n8, int n9, boolean bl, boolean bl2) {
            if (!this.isDot(string = okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(Companion, string, n8, n9, HttpUrl.PATH_SEGMENT_ENCODE_SET, bl2, false, false, false, null, 240, null))) {
                if (this.isDotDot(string)) {
                    this.pop();
                    return;
                }
                List<String> list = this.encodedPathSegments;
                if (((CharSequence)list.get(list.size() - 1)).length() == 0) {
                    list = this.encodedPathSegments;
                    list.set(list.size() - 1, string);
                } else {
                    this.encodedPathSegments.add(string);
                }
                if (bl) {
                    this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
                }
            }
        }

        private final void removeAllCanonicalQueryParameters(String string) {
            List<String> list = this.encodedQueryNamesAndValues;
            l.c(list);
            int n8 = list.size() - 2;
            int n9 = c.b(n8, 0, -2);
            if (n9 <= n8) {
                while (true) {
                    list = this.encodedQueryNamesAndValues;
                    l.c(list);
                    if (l.a(string, list.get(n8))) {
                        list = this.encodedQueryNamesAndValues;
                        l.c(list);
                        list.remove(n8 + 1);
                        list = this.encodedQueryNamesAndValues;
                        l.c(list);
                        list.remove(n8);
                        list = this.encodedQueryNamesAndValues;
                        l.c(list);
                        if (list.isEmpty()) {
                            this.encodedQueryNamesAndValues = null;
                            return;
                        }
                    }
                    if (n8 == n9) break;
                    n8 -= 2;
                }
            }
        }

        private final void resolvePath(String string, int n8, int n9) {
            if (n8 != n9) {
                int n10 = string.charAt(n8);
                if (n10 != 47 && n10 != 92) {
                    List<String> list = this.encodedPathSegments;
                    list.set(list.size() - 1, HttpUrl.FRAGMENT_ENCODE_SET);
                } else {
                    this.encodedPathSegments.clear();
                    this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
                    ++n8;
                }
                while (n8 < n9) {
                    n10 = Util.delimiterOffset(string, "/\\", n8, n9);
                    boolean bl = n10 < n9;
                    this.push(string, n8, n10, bl, true);
                    if (bl) {
                        n8 = n10 + 1;
                        continue;
                    }
                    n8 = n10;
                }
            }
        }

        public final Builder addEncodedPathSegment(String string) {
            l.f(string, "encodedPathSegment");
            this.push(string, 0, string.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String string) {
            l.f(string, "encodedPathSegments");
            return this.addPathSegments(string, true);
        }

        public final Builder addEncodedQueryParameter(String string, String string2) {
            l.f(string, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList<String>();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            l.c(list);
            okhttp3.HttpUrl$Companion companion = Companion;
            list.add(okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(companion, string, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            list = this.encodedQueryNamesAndValues;
            l.c(list);
            string = string2 != null ? okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(companion, string2, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null) : null;
            list.add(string);
            return this;
        }

        public final Builder addPathSegment(String string) {
            l.f(string, "pathSegment");
            this.push(string, 0, string.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String string) {
            l.f(string, "pathSegments");
            return this.addPathSegments(string, false);
        }

        public final Builder addQueryParameter(String string, String string2) {
            l.f(string, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList<String>();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            l.c(list);
            okhttp3.HttpUrl$Companion companion = Companion;
            list.add(okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(companion, string, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            list = this.encodedQueryNamesAndValues;
            l.c(list);
            string = string2 != null ? okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(companion, string2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null) : null;
            list.add(string);
            return this;
        }

        public final HttpUrl build() {
            String string = this.scheme;
            if (string != null) {
                Object object = Companion;
                String string2 = okhttp3.HttpUrl$Companion.percentDecode$okhttp$default((okhttp3.HttpUrl$Companion)object, this.encodedUsername, 0, 0, false, 7, null);
                String string3 = okhttp3.HttpUrl$Companion.percentDecode$okhttp$default((okhttp3.HttpUrl$Companion)object, this.encodedPassword, 0, 0, false, 7, null);
                String string4 = this.host;
                if (string4 != null) {
                    Object object2;
                    int n8 = this.effectivePort();
                    object = this.encodedPathSegments;
                    ArrayList<String> arrayList = new ArrayList<String>(o.s(object, 10));
                    Object object3 = object.iterator();
                    while (object3.hasNext()) {
                        object = (String)object3.next();
                        arrayList.add(okhttp3.HttpUrl$Companion.percentDecode$okhttp$default(Companion, (String)object, 0, 0, false, 7, null));
                    }
                    object = this.encodedQueryNamesAndValues;
                    object3 = null;
                    if (object != null) {
                        object = (Iterable)object;
                        object2 = new ArrayList(o.s(object, 10));
                        Iterator iterator = object.iterator();
                        while (iterator.hasNext()) {
                            object = (String)iterator.next();
                            object = object != null ? okhttp3.HttpUrl$Companion.percentDecode$okhttp$default(Companion, (String)object, 0, 0, true, 3, null) : null;
                            object2.add(object);
                        }
                        object = object2;
                    } else {
                        object = null;
                    }
                    object2 = this.encodedFragment;
                    if (object2 != null) {
                        object3 = okhttp3.HttpUrl$Companion.percentDecode$okhttp$default(Companion, (String)object2, 0, 0, false, 7, null);
                    }
                    return new HttpUrl(string, string2, string3, string4, n8, arrayList, (List<String>)object, (String)object3, this.toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final Builder encodedFragment(String string) {
            string = string != null ? okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(Companion, string, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET, true, false, false, true, null, 179, null) : null;
            this.encodedFragment = string;
            return this;
        }

        public final Builder encodedPassword(String string) {
            l.f(string, "encodedPassword");
            this.encodedPassword = okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(Companion, string, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder encodedPath(String string) {
            l.f(string, "encodedPath");
            if (h.H(string, "/", false, 2, null)) {
                this.resolvePath(string, 0, string.length());
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected encodedPath: ");
            stringBuilder.append(string);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }

        public final Builder encodedQuery(String list) {
            okhttp3.HttpUrl$Companion companion;
            list = list != null && (list = okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(companion = Companion, (String)((Object)list), 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 211, null)) != null ? companion.toQueryNamesAndValues$okhttp((String)((Object)list)) : null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder encodedUsername(String string) {
            l.f(string, "encodedUsername");
            this.encodedUsername = okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(Companion, string, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }

        public final Builder fragment(String string) {
            string = string != null ? okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(Companion, string, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, true, null, 187, null) : null;
            this.encodedFragment = string;
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String string) {
            l.f(string, "host");
            CharSequence charSequence = HostnamesKt.toCanonicalHost(okhttp3.HttpUrl$Companion.percentDecode$okhttp$default(Companion, string, 0, 0, false, 7, null));
            if (charSequence != null) {
                this.host = charSequence;
                return this;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("unexpected host: ");
            ((StringBuilder)charSequence).append(string);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
        }

        public final Builder parse$okhttp(HttpUrl object, String charSequence) {
            block22: {
                int n8;
                int n9;
                block25: {
                    int n10;
                    int n11;
                    int n12;
                    block24: {
                        int n13;
                        Object object2;
                        block23: {
                            block20: {
                                block18: {
                                    block21: {
                                        block19: {
                                            l.f(charSequence, "input");
                                            n12 = Util.indexOfFirstNonAsciiWhitespace$default((String)charSequence, 0, 0, 3, null);
                                            n11 = Util.indexOfLastNonAsciiWhitespace$default((String)charSequence, n12, 0, 2, null);
                                            object2 = Companion;
                                            n10 = ((Companion)object2).schemeDelimiterOffset((String)charSequence, n12, n11);
                                            if (n10 == -1) break block18;
                                            if (!h.E((String)charSequence, "https:", n12, true)) break block19;
                                            this.scheme = "https";
                                            n12 += 6;
                                            break block20;
                                        }
                                        if (!h.E((String)charSequence, "http:", n12, true)) break block21;
                                        this.scheme = "http";
                                        n12 += 5;
                                        break block20;
                                    }
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append("Expected URL scheme 'http' or 'https' but was '");
                                    charSequence = ((String)charSequence).substring(0, n10);
                                    l.e(charSequence, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                                    ((StringBuilder)object).append((String)charSequence);
                                    ((StringBuilder)object).append('\'');
                                    throw new IllegalArgumentException(((StringBuilder)object).toString());
                                }
                                if (object == null) break block22;
                                this.scheme = ((HttpUrl)object).scheme();
                            }
                            n10 = ((Companion)object2).slashCount((String)charSequence, n12, n11);
                            if (n10 >= 2 || object == null || !l.a(((HttpUrl)object).scheme(), this.scheme)) break block23;
                            this.encodedUsername = ((HttpUrl)object).encodedUsername();
                            this.encodedPassword = ((HttpUrl)object).encodedPassword();
                            this.host = ((HttpUrl)object).host();
                            this.port = ((HttpUrl)object).port();
                            this.encodedPathSegments.clear();
                            this.encodedPathSegments.addAll((Collection<String>)((HttpUrl)object).encodedPathSegments());
                            if (n12 == n11 || ((String)charSequence).charAt(n12) == '#') {
                                this.encodedQuery(((HttpUrl)object).encodedQuery());
                            }
                            n10 = n11;
                            n11 = n12;
                            n12 = n10;
                            break block24;
                        }
                        n9 = n12 + n10;
                        n10 = 0;
                        n8 = 0;
                        while ((n13 = (n12 = Util.delimiterOffset((String)charSequence, "@/\\?#", n9, n11)) != n11 ? (int)((String)charSequence).charAt(n12) : -1) != -1 && n13 != 35 && n13 != 47 && n13 != 92 && n13 != 63) {
                            if (n13 != 64) continue;
                            if (n10 == 0) {
                                n13 = Util.delimiterOffset((String)charSequence, ':', n9, n12);
                                okhttp3.HttpUrl$Companion companion = Companion;
                                object = object2 = okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(companion, (String)charSequence, n9, n13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                if (n8 != 0) {
                                    object = new StringBuilder();
                                    ((StringBuilder)object).append(this.encodedUsername);
                                    ((StringBuilder)object).append("%40");
                                    ((StringBuilder)object).append((String)object2);
                                    object = ((StringBuilder)object).toString();
                                }
                                this.encodedUsername = object;
                                if (n13 != n12) {
                                    this.encodedPassword = okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(companion, (String)charSequence, n13 + 1, n12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                    n10 = 1;
                                }
                                n9 = n12;
                                n8 = 1;
                            } else {
                                object = new StringBuilder();
                                ((StringBuilder)object).append(this.encodedPassword);
                                ((StringBuilder)object).append("%40");
                                object2 = okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(Companion, (String)charSequence, n9, n12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                n9 = n12;
                                ((StringBuilder)object).append((String)object2);
                                this.encodedPassword = ((StringBuilder)object).toString();
                            }
                            n9 = n12 + 1;
                        }
                        object = Companion;
                        n8 = ((Companion)object).portColonOffset((String)charSequence, n9, n12);
                        n13 = n8 + 1;
                        if (n13 < n12) {
                            this.host = HostnamesKt.toCanonicalHost(okhttp3.HttpUrl$Companion.percentDecode$okhttp$default(Companion, (String)charSequence, n9, n8, false, 4, null));
                            this.port = n10 = ((Companion)object).parsePort((String)charSequence, n13, n12);
                            if (n10 == -1) {
                                object = new StringBuilder();
                                ((StringBuilder)object).append("Invalid URL port: \"");
                                charSequence = ((String)charSequence).substring(n13, n12);
                                l.e(charSequence, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                                ((StringBuilder)object).append((String)charSequence);
                                ((StringBuilder)object).append('\"');
                                throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
                            }
                        } else {
                            object2 = Companion;
                            this.host = HostnamesKt.toCanonicalHost(okhttp3.HttpUrl$Companion.percentDecode$okhttp$default((okhttp3.HttpUrl$Companion)object2, (String)charSequence, n9, n8, false, 4, null));
                            object = this.scheme;
                            l.c(object);
                            this.port = ((okhttp3.HttpUrl$Companion)object2).defaultPort((String)object);
                        }
                        if (this.host == null) break block25;
                        n10 = n12;
                        n12 = n11;
                        n11 = n10;
                    }
                    n10 = Util.delimiterOffset((String)charSequence, "?#", n11, n12);
                    this.resolvePath((String)charSequence, n11, n10);
                    if (n10 < n12 && ((String)charSequence).charAt(n10) == '?') {
                        n11 = Util.delimiterOffset((String)charSequence, '#', n10, n12);
                        object = Companion;
                        this.encodedQueryNamesAndValues = ((okhttp3.HttpUrl$Companion)object).toQueryNamesAndValues$okhttp(okhttp3.HttpUrl$Companion.canonicalize$okhttp$default((okhttp3.HttpUrl$Companion)object, (String)charSequence, n10 + 1, n11, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, null, 208, null));
                    } else {
                        n11 = n10;
                    }
                    if (n11 < n12 && ((String)charSequence).charAt(n11) == '#') {
                        this.encodedFragment = okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(Companion, (String)charSequence, n11 + 1, n12, HttpUrl.FRAGMENT_ENCODE_SET, true, false, false, true, null, 176, null);
                    }
                    return this;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Invalid URL host: \"");
                charSequence = ((String)charSequence).substring(n9, n8);
                l.e(charSequence, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                ((StringBuilder)object).append((String)charSequence);
                ((StringBuilder)object).append('\"');
                throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
            }
            if (((String)charSequence).length() > 6) {
                object = new StringBuilder();
                ((StringBuilder)object).append(h.D0((String)charSequence, 6));
                ((StringBuilder)object).append("...");
                object = ((StringBuilder)object).toString();
            } else {
                object = charSequence;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Expected URL scheme 'http' or 'https' but no scheme was found for ");
            ((StringBuilder)charSequence).append((String)object);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
        }

        public final Builder password(String string) {
            l.f(string, "password");
            this.encodedPassword = okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(Companion, string, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public final Builder port(int n8) {
            if (1 <= n8 && n8 < 65536) {
                this.port = n8;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected port: ");
            stringBuilder.append(n8);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }

        public final Builder query(String list) {
            okhttp3.HttpUrl$Companion companion;
            list = list != null && (list = okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(companion = Companion, (String)((Object)list), 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, null, 219, null)) != null ? companion.toQueryNamesAndValues$okhttp((String)((Object)list)) : null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            int n8;
            Object object = this.host;
            Object var5_2 = null;
            object = object != null ? new ax.Ob.g("[\"<>^`{|}]").b((CharSequence)object, HttpUrl.FRAGMENT_ENCODE_SET) : null;
            this.host = object;
            int n9 = this.encodedPathSegments.size();
            int n10 = 0;
            for (n8 = 0; n8 < n9; ++n8) {
                object = this.encodedPathSegments;
                object.set(n8, okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(Companion, (String)object.get(n8), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, null, 227, null));
            }
            List<String> list = this.encodedQueryNamesAndValues;
            if (list != null) {
                n9 = list.size();
                for (n8 = n10; n8 < n9; ++n8) {
                    object = (String)list.get(n8);
                    object = object != null ? okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(Companion, (String)object, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, null, 195, null) : null;
                    list.set(n8, (String)object);
                }
            }
            list = this.encodedFragment;
            object = var5_2;
            if (list != null) {
                object = okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(Companion, (String)((Object)list), 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, null, 163, null);
            }
            this.encodedFragment = object;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String string) {
            l.f(string, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            this.removeAllCanonicalQueryParameters(okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(Companion, string, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, null, 211, null));
            return this;
        }

        public final Builder removeAllQueryParameters(String string) {
            l.f(string, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            this.removeAllCanonicalQueryParameters(okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(Companion, string, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, null, 219, null));
            return this;
        }

        public final Builder removePathSegment(int n8) {
            this.encodedPathSegments.remove(n8);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
            }
            return this;
        }

        public final Builder scheme(String string) {
            l.f(string, "scheme");
            if (h.v(string, "http", true)) {
                this.scheme = "http";
                return this;
            }
            if (h.v(string, "https", true)) {
                this.scheme = "https";
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected scheme: ");
            stringBuilder.append(string);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public final void setEncodedFragment$okhttp(String string) {
            this.encodedFragment = string;
        }

        public final void setEncodedPassword$okhttp(String string) {
            l.f(string, "<set-?>");
            this.encodedPassword = string;
        }

        public final Builder setEncodedPathSegment(int n8, String string) {
            l.f(string, "encodedPathSegment");
            CharSequence charSequence = okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(Companion, string, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, null, 243, null);
            this.encodedPathSegments.set(n8, (String)charSequence);
            if (!this.isDot((String)charSequence) && !this.isDotDot((String)charSequence)) {
                return this;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("unexpected path segment: ");
            ((StringBuilder)charSequence).append(string);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String string, String string2) {
            l.f(string, "encodedName");
            this.removeAllEncodedQueryParameters(string);
            this.addEncodedQueryParameter(string, string2);
            return this;
        }

        public final void setEncodedUsername$okhttp(String string) {
            l.f(string, "<set-?>");
            this.encodedUsername = string;
        }

        public final void setHost$okhttp(String string) {
            this.host = string;
        }

        public final Builder setPathSegment(int n8, String string) {
            l.f(string, "pathSegment");
            CharSequence charSequence = okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(Companion, string, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, null, 251, null);
            if (!this.isDot((String)charSequence) && !this.isDotDot((String)charSequence)) {
                this.encodedPathSegments.set(n8, (String)charSequence);
                return this;
            }
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("unexpected path segment: ");
            ((StringBuilder)charSequence).append(string);
            throw new IllegalArgumentException(((StringBuilder)charSequence).toString().toString());
        }

        public final void setPort$okhttp(int n8) {
            this.port = n8;
        }

        public final Builder setQueryParameter(String string, String string2) {
            l.f(string, "name");
            this.removeAllQueryParameters(string);
            this.addQueryParameter(string, string2);
            return this;
        }

        public final void setScheme$okhttp(String string) {
            this.scheme = string;
        }

        public String toString() {
            Object object;
            Object object2;
            CharSequence charSequence;
            block12: {
                int n8;
                block13: {
                    charSequence = new StringBuilder();
                    object2 = this.scheme;
                    if (object2 != null) {
                        ((StringBuilder)charSequence).append((String)object2);
                        ((StringBuilder)charSequence).append("://");
                    } else {
                        ((StringBuilder)charSequence).append("//");
                    }
                    if (this.encodedUsername.length() > 0 || this.encodedPassword.length() > 0) {
                        ((StringBuilder)charSequence).append(this.encodedUsername);
                        if (this.encodedPassword.length() > 0) {
                            ((StringBuilder)charSequence).append(':');
                            ((StringBuilder)charSequence).append(this.encodedPassword);
                        }
                        ((StringBuilder)charSequence).append('@');
                    }
                    if ((object2 = this.host) != null) {
                        l.c(object2);
                        if (h.L((CharSequence)object2, ':', false, 2, null)) {
                            ((StringBuilder)charSequence).append('[');
                            ((StringBuilder)charSequence).append(this.host);
                            ((StringBuilder)charSequence).append(']');
                        } else {
                            ((StringBuilder)charSequence).append(this.host);
                        }
                    }
                    if (this.port == -1 && this.scheme == null) break block12;
                    n8 = this.effectivePort();
                    object = this.scheme;
                    if (object == null) break block13;
                    object2 = Companion;
                    l.c(object);
                    if (n8 == ((okhttp3.HttpUrl$Companion)object2).defaultPort((String)object)) break block12;
                }
                ((StringBuilder)charSequence).append(':');
                ((StringBuilder)charSequence).append(n8);
            }
            object = Companion;
            ((okhttp3.HttpUrl$Companion)object).toPathString$okhttp(this.encodedPathSegments, (StringBuilder)charSequence);
            if (this.encodedQueryNamesAndValues != null) {
                ((StringBuilder)charSequence).append('?');
                object2 = this.encodedQueryNamesAndValues;
                l.c(object2);
                ((okhttp3.HttpUrl$Companion)object).toQueryString$okhttp((List<String>)object2, (StringBuilder)charSequence);
            }
            if (this.encodedFragment != null) {
                ((StringBuilder)charSequence).append('#');
                ((StringBuilder)charSequence).append(this.encodedFragment);
            }
            charSequence = ((StringBuilder)charSequence).toString();
            l.e(charSequence, "StringBuilder().apply(builderAction).toString()");
            return charSequence;
        }

        public final Builder username(String string) {
            l.f(string, "username");
            this.encodedUsername = okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(Companion, string, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g g8) {
                this();
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            private final int parsePort(String string, int n8, int n9) {
                block3: {
                    try {
                        n8 = Integer.parseInt(okhttp3.HttpUrl$Companion.canonicalize$okhttp$default(HttpUrl.Companion, string, n8, n9, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, false, null, 248, null));
                        if (1 > n8 || n8 >= 65536) break block3;
                        return n8;
                    }
                    catch (NumberFormatException numberFormatException) {
                        return -1;
                    }
                }
                return -1;
            }

            /*
             * Exception decompiling
             */
            private final int portColonOffset(String var1_1, int var2_2, int var3_3) {
                /*
                 * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                 * 
                 * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[DOLOOP]], but top level block is 3[SIMPLE_IF_TAKEN]
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
                 *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
                 *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
                 *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
                 *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
                 *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
                 *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
                 *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
                 *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
                 *     at org.benf.cfr.reader.Main.main(Main.java:54)
                 */
                throw new IllegalStateException("Decompilation failed");
            }

            private final int schemeDelimiterOffset(String string, int n8, int n9) {
                block7: {
                    int n10;
                    block6: {
                        char c8;
                        block5: {
                            if (n9 - n8 < 2) {
                                return -1;
                            }
                            c8 = string.charAt(n8);
                            if (l.h(c8, 97) < 0) break block5;
                            n10 = n8;
                            if (l.h(c8, 122) <= 0) break block6;
                        }
                        if (l.h(c8, 65) < 0) break block7;
                        n10 = n8;
                        if (l.h(c8, 90) > 0) break block7;
                    }
                    while (++n10 < n9) {
                        n8 = string.charAt(n10);
                        if (97 <= n8 && n8 < 123 || 65 <= n8 && n8 < 91 || 48 <= n8 && n8 < 58 || n8 == 43 || n8 == 45 || n8 == 46) continue;
                        if (n8 != 58) break;
                        return n10;
                    }
                }
                return -1;
            }

            private final int slashCount(String string, int n8, int n9) {
                char c8;
                int n10 = 0;
                while (n8 < n9 && ((c8 = string.charAt(n8)) == '\\' || c8 == '/')) {
                    ++n10;
                    ++n8;
                }
                return n10;
            }
        }
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String string, int n8, int n9, String string2, boolean bl, boolean bl2, boolean bl3, boolean bl4, Charset charset, int n10, Object object) {
            if ((n10 & 1) != 0) {
                n8 = 0;
            }
            if ((n10 & 2) != 0) {
                n9 = string.length();
            }
            if ((n10 & 8) != 0) {
                bl = false;
            }
            if ((n10 & 0x10) != 0) {
                bl2 = false;
            }
            if ((n10 & 0x20) != 0) {
                bl3 = false;
            }
            if ((n10 & 0x40) != 0) {
                bl4 = false;
            }
            if ((n10 & 0x80) != 0) {
                charset = null;
            }
            return companion.canonicalize$okhttp(string, n8, n9, string2, bl, bl2, bl3, bl4, charset);
        }

        private final boolean isPercentEncoded(String string, int n8, int n9) {
            int n10 = n8 + 2;
            return n10 < n9 && string.charAt(n8) == '%' && Util.parseHexDigit(string.charAt(n8 + 1)) != -1 && Util.parseHexDigit(string.charAt(n10)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String string, int n8, int n9, boolean bl, int n10, Object object) {
            if ((n10 & 1) != 0) {
                n8 = 0;
            }
            if ((n10 & 2) != 0) {
                n9 = string.length();
            }
            if ((n10 & 4) != 0) {
                bl = false;
            }
            return companion.percentDecode$okhttp(string, n8, n9, bl);
        }

        /*
         * Enabled aggressive block sorting
         */
        private final void writeCanonicalized(e e8, String string, int n8, int n9, String string2, boolean bl, boolean bl2, boolean bl3, boolean bl4, Charset charset) {
            Object object = null;
            while (n8 < n9) {
                int n10 = string.codePointAt(n8);
                if (!bl || n10 != 9 && n10 != 10 && n10 != 12 && n10 != 13) {
                    Object object2;
                    if (n10 == 43 && bl3) {
                        object2 = bl ? "+" : "%2B";
                        e8.r1((String)object2);
                    } else if (!(n10 < 32 || n10 == 127 || n10 >= 128 && !bl4 || h.L(string2, (char)n10, false, 2, null) || n10 == 37 && (!bl || bl2 && !this.isPercentEncoded(string, n8, n9)))) {
                        e8.t1(n10);
                    } else {
                        object2 = object;
                        if (object == null) {
                            object2 = new e();
                        }
                        if (charset != null && !l.a(charset, StandardCharsets.UTF_8)) {
                            ((e)object2).p1(string, n8, Character.charCount(n10) + n8, charset);
                        } else {
                            ((e)object2).t1(n10);
                        }
                        while (true) {
                            object = object2;
                            if (((e)object2).P()) break;
                            byte by = ((e)object2).readByte();
                            e8.j1(37);
                            e8.j1(HEX_DIGITS[(by & 0xFF) >> 4 & 0xF]);
                            e8.j1(HEX_DIGITS[by & 0xF]);
                        }
                    }
                }
                n8 += Character.charCount(n10);
            }
            return;
        }

        private final void writePercentDecoded(e e8, String string, int n8, int n9, boolean bl) {
            while (n8 < n9) {
                int n10;
                int n11 = string.codePointAt(n8);
                if (n11 == 37 && (n10 = n8 + 2) < n9) {
                    int n12 = Util.parseHexDigit(string.charAt(n8 + 1));
                    int n13 = Util.parseHexDigit(string.charAt(n10));
                    if (n12 != -1 && n13 != -1) {
                        e8.j1((n12 << 4) + n13);
                        n8 = Character.charCount(n11) + n10;
                        continue;
                    }
                } else if (n11 == 43 && bl) {
                    e8.j1(32);
                    ++n8;
                    continue;
                }
                e8.t1(n11);
                n8 += Character.charCount(n11);
            }
        }

        public final HttpUrl -deprecated_get(String string) {
            l.f(string, "url");
            return this.get(string);
        }

        public final HttpUrl -deprecated_get(URI uRI) {
            l.f(uRI, "uri");
            return this.get(uRI);
        }

        public final HttpUrl -deprecated_get(URL uRL) {
            l.f(uRL, "url");
            return this.get(uRL);
        }

        public final HttpUrl -deprecated_parse(String string) {
            l.f(string, "url");
            return this.parse(string);
        }

        public final String canonicalize$okhttp(String string, int n8, int n9, String string2, boolean bl, boolean bl2, boolean bl3, boolean bl4, Charset charset) {
            int n10;
            l.f(string, "<this>");
            l.f(string2, "encodeSet");
            for (int i8 = n8; i8 < n9; i8 += Character.charCount(n10)) {
                n10 = string.codePointAt(i8);
                if (!(n10 < 32 || n10 == 127 || n10 >= 128 && !bl4 || h.L(string2, (char)n10, false, 2, null) || n10 == 37 && (!bl || bl2 && !this.isPercentEncoded(string, i8, n9)) || n10 == 43 && bl3)) {
                    continue;
                }
                e e8 = new e();
                e8.s1(string, n8, i8);
                this.writeCanonicalized(e8, string, i8, n9, string2, bl, bl2, bl3, bl4, charset);
                return e8.Z0();
            }
            string = string.substring(n8, n9);
            l.e(string, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            return string;
        }

        public final int defaultPort(String string) {
            l.f(string, "scheme");
            if (l.a(string, "http")) {
                return 80;
            }
            if (l.a(string, "https")) {
                return 443;
            }
            return -1;
        }

        public final HttpUrl get(String string) {
            l.f(string, "<this>");
            return new Builder().parse$okhttp(null, string).build();
        }

        public final HttpUrl get(URI object) {
            l.f(object, "<this>");
            object = ((URI)object).toString();
            l.e(object, "toString()");
            return this.parse((String)object);
        }

        public final HttpUrl get(URL object) {
            l.f(object, "<this>");
            object = ((URL)object).toString();
            l.e(object, "toString()");
            return this.parse((String)object);
        }

        public final HttpUrl parse(String object) {
            l.f(object, "<this>");
            try {
                object = this.get((String)object);
                return object;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String string, int n8, int n9, boolean bl) {
            l.f(string, "<this>");
            for (int i8 = n8; i8 < n9; ++i8) {
                char c8 = string.charAt(i8);
                if (!(c8 == '%' || c8 == '+' && bl)) {
                    continue;
                }
                e e8 = new e();
                e8.s1(string, n8, i8);
                this.writePercentDecoded(e8, string, i8, n9, bl);
                return e8.Z0();
            }
            string = string.substring(n8, n9);
            l.e(string, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            return string;
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder stringBuilder) {
            l.f(list, "<this>");
            l.f(stringBuilder, "out");
            int n8 = list.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                stringBuilder.append('/');
                stringBuilder.append(list.get(i8));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String string) {
            l.f(string, "<this>");
            ArrayList<String> arrayList = new ArrayList<String>();
            int n8 = 0;
            while (n8 <= string.length()) {
                String string2;
                int n9;
                int n10 = n9 = h.U(string, '&', n8, false, 4, null);
                if (n9 == -1) {
                    n10 = string.length();
                }
                if ((n9 = h.U(string, '=', n8, false, 4, null)) != -1 && n9 <= n10) {
                    string2 = string.substring(n8, n9);
                    l.e(string2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                    arrayList.add(string2);
                    string2 = string.substring(n9 + 1, n10);
                    l.e(string2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                    arrayList.add(string2);
                } else {
                    string2 = string.substring(n8, n10);
                    l.e(string2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                    arrayList.add(string2);
                    arrayList.add(null);
                }
                n8 = n10 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder stringBuilder) {
            block8: {
                int n8;
                int n9;
                int n10;
                Object object;
                block7: {
                    int n11;
                    block6: {
                        l.f(list, "<this>");
                        l.f(stringBuilder, "out");
                        object = f.k(f.l(0, list.size()), 2);
                        n11 = ((ax.Lb.c)object).k();
                        n10 = ((ax.Lb.c)object).l();
                        n9 = ((ax.Lb.c)object).n();
                        if (n9 <= 0) break block6;
                        n8 = n11;
                        if (n11 <= n10) break block7;
                    }
                    if (n9 >= 0 || n10 > n11) break block8;
                    n8 = n11;
                }
                while (true) {
                    String string = list.get(n8);
                    object = list.get(n8 + 1);
                    if (n8 > 0) {
                        stringBuilder.append('&');
                    }
                    stringBuilder.append(string);
                    if (object != null) {
                        stringBuilder.append('=');
                        stringBuilder.append((String)object);
                    }
                    if (n8 == n10) break;
                    n8 += n9;
                }
            }
        }
    }
}

