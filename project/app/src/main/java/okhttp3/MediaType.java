/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Ab.c;
import ax.Gb.g;
import ax.Gb.l;
import ax.Ob.h;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class MediaType {
    public static final Companion Companion = new Companion(null);
    private static final Pattern PARAMETER;
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private static final Pattern TYPE_SUBTYPE;
    private final String mediaType;
    private final String[] parameterNamesAndValues;
    private final String subtype;
    private final String type;

    static {
        TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
        PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    }

    private MediaType(String string, String string2, String string3, String[] stringArray) {
        this.mediaType = string;
        this.type = string2;
        this.subtype = string3;
        this.parameterNamesAndValues = stringArray;
    }

    public /* synthetic */ MediaType(String string, String string2, String string3, String[] stringArray, g g8) {
        this(string, string2, string3, stringArray);
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType, Charset charset, int n8, Object object) {
        if ((n8 & 1) != 0) {
            charset = null;
        }
        return mediaType.charset(charset);
    }

    public static final MediaType get(String string) {
        return Companion.get(string);
    }

    public static final MediaType parse(String string) {
        return Companion.parse(string);
    }

    public final String -deprecated_subtype() {
        return this.subtype;
    }

    public final String -deprecated_type() {
        return this.type;
    }

    public final Charset charset() {
        return MediaType.charset$default(this, null, 1, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Charset charset(Charset object) {
        Object object2 = this.parameter("charset");
        if (object2 == null) {
            return object;
        }
        try {
            return object2 = Charset.forName((String)object2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return object;
        }
    }

    public boolean equals(Object object) {
        return object instanceof MediaType && l.a(((MediaType)object).mediaType, this.mediaType);
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    public final String parameter(String string) {
        l.f(string, "name");
        int n8 = this.parameterNamesAndValues.length;
        int n9 = 0;
        n8 = c.b(0, n8 - 1, 2);
        if (n8 >= 0) {
            while (true) {
                if (h.v(this.parameterNamesAndValues[n9], string, true)) {
                    return this.parameterNamesAndValues[n9 + 1];
                }
                if (n9 == n8) break;
                n9 += 2;
            }
        }
        return null;
    }

    public final String subtype() {
        return this.subtype;
    }

    public String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
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

        public final MediaType -deprecated_get(String string) {
            l.f(string, "mediaType");
            return this.get(string);
        }

        public final MediaType -deprecated_parse(String string) {
            l.f(string, "mediaType");
            return this.parse(string);
        }

        public final MediaType get(String string) {
            l.f(string, "<this>");
            Object object = TYPE_SUBTYPE.matcher(string);
            if (((Matcher)object).lookingAt()) {
                String string2 = ((Matcher)object).group(1);
                l.e(string2, "typeSubtype.group(1)");
                Object object2 = Locale.US;
                l.e(object2, "US");
                string2 = string2.toLowerCase((Locale)object2);
                l.e(string2, "this as java.lang.String).toLowerCase(locale)");
                String string3 = ((Matcher)object).group(2);
                l.e(string3, "typeSubtype.group(2)");
                l.e(object2, "US");
                string3 = string3.toLowerCase((Locale)object2);
                l.e(string3, "this as java.lang.String).toLowerCase(locale)");
                ArrayList<Object> arrayList = new ArrayList<Object>();
                Matcher matcher = PARAMETER.matcher(string);
                int n8 = ((Matcher)object).end();
                while (n8 < string.length()) {
                    matcher.region(n8, string.length());
                    if (matcher.lookingAt()) {
                        String string4 = matcher.group(1);
                        if (string4 == null) {
                            n8 = matcher.end();
                            continue;
                        }
                        object2 = matcher.group(2);
                        if (object2 == null) {
                            object = matcher.group(3);
                        } else {
                            object = object2;
                            if (h.H((String)object2, "'", false, 2, null)) {
                                object = object2;
                                if (h.u((String)object2, "'", false, 2, null)) {
                                    object = object2;
                                    if (((String)object2).length() > 2) {
                                        object = ((String)object2).substring(1, ((String)object2).length() - 1);
                                        l.e(object, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                                    }
                                }
                            }
                        }
                        arrayList.add(string4);
                        arrayList.add(object);
                        n8 = matcher.end();
                        continue;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Parameter is not formatted correctly: \"");
                    object2 = string.substring(n8);
                    l.e(object2, "this as java.lang.String).substring(startIndex)");
                    ((StringBuilder)object).append((String)object2);
                    ((StringBuilder)object).append("\" for: \"");
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append('\"');
                    throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
                }
                return new MediaType(string, string2, string3, arrayList.toArray(new String[0]), null);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("No subtype found for: \"");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append('\"');
            throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
        }

        public final MediaType parse(String object) {
            l.f(object, "<this>");
            try {
                object = this.get((String)object);
                return object;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
        }
    }
}

