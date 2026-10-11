/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.tls;

import ax.Gb.l;
import ax.Ob.h;
import ax.tb.o;
import ax.xc.E;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;

public final class OkHostnameVerifier
implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String string) {
        Object object = string;
        if (this.isAscii(string)) {
            object = Locale.US;
            l.e(object, "US");
            object = string.toLowerCase((Locale)object);
            l.e(object, "this as java.lang.String).toLowerCase(locale)");
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final List<String> getSubjectAltNames(X509Certificate serializable, int n8) {
        try {
            Object object = ((X509Certificate)serializable).getSubjectAlternativeNames();
            if (object == null) {
                return o.j();
            }
            serializable = new ArrayList();
            object = object.iterator();
            while (true) {
                if (!object.hasNext()) {
                    return serializable;
                }
                List list = (List)object.next();
                if (list == null || list.size() < 2 || !l.a(list.get(0), n8) || (list = list.get(1)) == null) continue;
                serializable.add((String)((Object)list));
            }
        }
        catch (CertificateParsingException certificateParsingException) {
            return o.j();
        }
    }

    private final boolean isAscii(String string) {
        return string.length() == (int)E.b(string, 0, 0, 3, null);
    }

    private final boolean verifyHostname(String charSequence, String string) {
        if (!(charSequence == null || charSequence.length() == 0 || h.H((String)charSequence, ".", false, 2, null) || h.u((String)charSequence, "..", false, 2, null) || string == null || string.length() == 0 || h.H(string, ".", false, 2, null) || h.u(string, "..", false, 2, null))) {
            CharSequence charSequence2 = charSequence;
            if (!h.u((String)charSequence, ".", false, 2, null)) {
                charSequence2 = new StringBuilder();
                ((StringBuilder)charSequence2).append((String)charSequence);
                ((StringBuilder)charSequence2).append('.');
                charSequence2 = ((StringBuilder)charSequence2).toString();
            }
            charSequence = string;
            if (!h.u(string, ".", false, 2, null)) {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(string);
                ((StringBuilder)charSequence).append('.');
                charSequence = ((StringBuilder)charSequence).toString();
            }
            if (!h.M(charSequence = this.asciiToLowercase((String)charSequence), "*", false, 2, null)) {
                return l.a(charSequence2, charSequence);
            }
            if (h.H((String)charSequence, "*.", false, 2, null) && h.U(charSequence, '*', 1, false, 4, null) == -1) {
                if (((String)charSequence2).length() < ((String)charSequence).length()) {
                    return false;
                }
                if (l.a("*.", charSequence)) {
                    return false;
                }
                charSequence = ((String)charSequence).substring(1);
                l.e(charSequence, "this as java.lang.String).substring(startIndex)");
                if (!h.u((String)charSequence2, (String)charSequence, false, 2, null)) {
                    return false;
                }
                int n8 = ((String)charSequence2).length() - ((String)charSequence).length();
                return n8 <= 0 || h.Z(charSequence2, '.', n8 - 1, false, 4, null) == -1;
            }
        }
        return false;
    }

    private final boolean verifyHostname(String string, X509Certificate iterator) {
        string = this.asciiToLowercase(string);
        if ((iterator = (Iterable)this.getSubjectAltNames((X509Certificate)((Object)iterator), 2)) instanceof Collection && ((Collection)((Object)iterator)).isEmpty()) {
            return false;
        }
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            if (!INSTANCE.verifyHostname(string, string2)) continue;
            return true;
        }
        return false;
    }

    private final boolean verifyIpAddress(String string, X509Certificate iterator) {
        string = HostnamesKt.toCanonicalHost(string);
        if ((iterator = (Iterable)this.getSubjectAltNames((X509Certificate)((Object)iterator), 7)) instanceof Collection && ((Collection)((Object)iterator)).isEmpty()) {
            return false;
        }
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            if (!l.a(string, HostnamesKt.toCanonicalHost((String)iterator.next()))) continue;
            return true;
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate object) {
        l.f(object, "certificate");
        List<String> list = this.getSubjectAltNames((X509Certificate)object, 7);
        object = this.getSubjectAltNames((X509Certificate)object, 2);
        return o.O((Collection)list, (Iterable)object);
    }

    public final boolean verify(String string, X509Certificate x509Certificate) {
        l.f(string, "host");
        l.f(x509Certificate, "certificate");
        if (Util.canParseAsIpAddress(string)) {
            return this.verifyIpAddress(string, x509Certificate);
        }
        return this.verifyHostname(string, x509Certificate);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean verify(String string, SSLSession object) {
        l.f(string, "host");
        l.f(object, "session");
        boolean bl = this.isAscii(string);
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        try {
            object = object.getPeerCertificates()[0];
            l.d(object, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            bl = this.verify(string, (X509Certificate)object);
            return bl;
        }
        catch (SSLException sSLException) {
            return bl2;
        }
    }
}

