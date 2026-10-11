/*
 * Decompiled with CFR 0.152.
 */
package ax.u3;

import java.nio.charset.Charset;
import java.util.Locale;

public class f {
    /*
     * Enabled aggressive block sorting
     */
    public static String a() {
        int n8;
        String string;
        Object object;
        block29: {
            object = Locale.getDefault();
            if (object == null) {
                return null;
            }
            string = ((Locale)object).getLanguage();
            if (string == null) {
                return null;
            }
            string = string.toUpperCase();
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 2862: {
                    if (!string.equals("ZH")) break;
                    n8 = 12;
                    break block29;
                }
                case 2686: {
                    if (!string.equals("TR")) break;
                    n8 = 11;
                    break block29;
                }
                case 2676: {
                    if (!string.equals("TH")) break;
                    n8 = 10;
                    break block29;
                }
                case 2655: {
                    if (!string.equals("SR")) break;
                    n8 = 7;
                    break block29;
                }
                case 2627: {
                    if (!string.equals("RU")) break;
                    n8 = 8;
                    break block29;
                }
                case 2556: {
                    if (!string.equals("PL")) break;
                    n8 = 3;
                    break block29;
                }
                case 2462: {
                    if (!string.equals("MK")) break;
                    n8 = 6;
                    break block29;
                }
                case 2404: {
                    if (!string.equals("KO")) break;
                    n8 = 0;
                    break block29;
                }
                case 2359: {
                    if (!string.equals("JA")) break;
                    n8 = 1;
                    break block29;
                }
                case 2317: {
                    if (!string.equals("HU")) break;
                    n8 = 5;
                    break block29;
                }
                case 2314: {
                    if (!string.equals("HR")) break;
                    n8 = 4;
                    break block29;
                }
                case 2160: {
                    if (!string.equals("CS")) break;
                    n8 = 2;
                    break block29;
                }
                case 2097: {
                    if (!string.equals("AR")) break;
                    n8 = 9;
                    break block29;
                }
                case 0: {
                    if (!string.equals("")) break;
                    n8 = 13;
                    break block29;
                }
            }
            n8 = -1;
        }
        switch (n8) {
            default: {
                return null;
            }
            case 12: {
                string = ((Locale)object).getCountry();
                boolean bl = "CN".equalsIgnoreCase(string);
                object = "GBK";
                if (bl || !"TW".equalsIgnoreCase(string) && !"HK".equalsIgnoreCase(string) && !"MO".equalsIgnoreCase(string)) break;
                object = "BIG5";
                break;
            }
            case 11: {
                object = "WINDOWS-1254";
                break;
            }
            case 10: {
                object = "ISO-8859-11";
                break;
            }
            case 9: {
                object = "WINDOWS-1256";
                break;
            }
            case 6: 
            case 7: 
            case 8: {
                object = "WINDOWS-1251";
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                object = "WINDOWS-1250";
                break;
            }
            case 1: {
                object = "SHIFT_JIS";
                break;
            }
            case 0: {
                object = "EUC-KR";
            }
        }
        if (object == null) {
            return null;
        }
        if (Charset.isSupported((String)object)) return object;
        return null;
    }
}

