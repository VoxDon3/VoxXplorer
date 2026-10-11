/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.l;
import ax.tb.F;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Challenge {
    private final Map<String, String> authParams;
    private final String scheme;

    public Challenge(String string, String object) {
        l.f(string, "scheme");
        l.f(object, "realm");
        object = Collections.singletonMap("realm", object);
        l.e(object, "singletonMap(\"realm\", realm)");
        this(string, (Map<String, String>)object);
    }

    public Challenge(String object, Map<String, String> object2) {
        l.f(object, "scheme");
        l.f(object2, "authParams");
        this.scheme = object;
        LinkedHashMap<Object, String> linkedHashMap = new LinkedHashMap<Object, String>();
        for (Map.Entry entry : object2.entrySet()) {
            object = (String)entry.getKey();
            String object3 = (String)entry.getValue();
            if (object != null) {
                Locale locale = Locale.US;
                l.e(locale, "US");
                object = ((String)object).toLowerCase(locale);
                l.e(object, "this as java.lang.String).toLowerCase(locale)");
            } else {
                object = null;
            }
            linkedHashMap.put(object, object3);
        }
        object = java.util.DesugarCollections.unmodifiableMap(linkedHashMap);
        l.e(object, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = object;
    }

    public final Map<String, String> -deprecated_authParams() {
        return this.authParams;
    }

    public final Charset -deprecated_charset() {
        return this.charset();
    }

    public final String -deprecated_realm() {
        return this.realm();
    }

    public final String -deprecated_scheme() {
        return this.scheme;
    }

    public final Map<String, String> authParams() {
        return this.authParams;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Charset charset() {
        Object object = this.authParams.get("charset");
        if (object != null) {
            try {
                object = Charset.forName((String)object);
                l.e(object, "forName(charset)");
                return object;
            }
            catch (Exception exception) {}
        }
        object = StandardCharsets.ISO_8859_1;
        l.e(object, "ISO_8859_1");
        return object;
    }

    public boolean equals(Object object) {
        if (object instanceof Challenge) {
            object = (Challenge)object;
            if (l.a(((Challenge)object).scheme, this.scheme) && l.a(((Challenge)object).authParams, this.authParams)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (899 + this.scheme.hashCode()) * 31 + ((Object)this.authParams).hashCode();
    }

    public final String realm() {
        return this.authParams.get("realm");
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.scheme);
        stringBuilder.append(" authParams=");
        stringBuilder.append(this.authParams);
        return stringBuilder.toString();
    }

    public final Challenge withCharset(Charset object) {
        l.f(object, "charset");
        Map<String, String> map = F.r(this.authParams);
        object = ((Charset)object).name();
        l.e(object, "charset.name()");
        map.put("charset", (String)object);
        return new Challenge(this.scheme, map);
    }
}

