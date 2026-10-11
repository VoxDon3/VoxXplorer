package ax.u3;

import java.nio.charset.Charset;
import java.util.Locale;
import okhttp3.HttpUrl;

/* renamed from: ax.u3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3188f {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String a() {
        String language;
        char c;
        String str;
        Locale locale = Locale.getDefault();
        if (locale == null || (language = locale.getLanguage()) == null) {
            return null;
        }
        String upperCase = language.toUpperCase();
        switch (upperCase.hashCode()) {
            case 0:
                if (upperCase.equals(HttpUrl.FRAGMENT_ENCODE_SET)) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2097:
                if (upperCase.equals("AR")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2160:
                if (upperCase.equals("CS")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2314:
                if (upperCase.equals("HR")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2317:
                if (upperCase.equals("HU")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2359:
                if (upperCase.equals("JA")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2404:
                if (upperCase.equals("KO")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2462:
                if (upperCase.equals("MK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 2556:
                if (upperCase.equals("PL")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2627:
                if (upperCase.equals("RU")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 2655:
                if (upperCase.equals("SR")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2676:
                if (upperCase.equals("TH")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2686:
                if (upperCase.equals("TR")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2862:
                if (upperCase.equals("ZH")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                str = "EUC-KR";
                break;
            case 1:
                str = "SHIFT_JIS";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                str = "WINDOWS-1250";
                break;
            case 6:
            case 7:
            case '\b':
                str = "WINDOWS-1251";
                break;
            case '\t':
                str = "WINDOWS-1256";
                break;
            case '\n':
                str = "ISO-8859-11";
                break;
            case 11:
                str = "WINDOWS-1254";
                break;
            case '\f':
                String country = locale.getCountry();
                str = "GBK";
                if (!"CN".equalsIgnoreCase(country) && ("TW".equalsIgnoreCase(country) || "HK".equalsIgnoreCase(country) || "MO".equalsIgnoreCase(country))) {
                    str = "BIG5";
                    break;
                }
                break;
            default:
                str = null;
                break;
        }
        if (str != null && Charset.isSupported(str)) {
            return str;
        }
        return null;
    }
}
