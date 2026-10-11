/*
 * Decompiled with CFR 0.152.
 */
package ax.X;

import android.net.Uri;

public final class b {
    public static String a(Uri object) {
        CharSequence charSequence;
        String string;
        block8: {
            String string2;
            block9: {
                block10: {
                    string = object.getScheme();
                    string2 = object.getSchemeSpecificPart();
                    charSequence = string2;
                    if (string == null) break block8;
                    if (string.equalsIgnoreCase("tel") || string.equalsIgnoreCase("sip") || string.equalsIgnoreCase("sms") || string.equalsIgnoreCase("smsto") || string.equalsIgnoreCase("mailto") || string.equalsIgnoreCase("nfc")) break block9;
                    if (string.equalsIgnoreCase("http") || string.equalsIgnoreCase("https") || string.equalsIgnoreCase("ftp")) break block10;
                    charSequence = string2;
                    if (!string.equalsIgnoreCase("rtsp")) break block8;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("//");
                charSequence = object.getHost();
                string2 = "";
                charSequence = charSequence != null ? object.getHost() : "";
                stringBuilder.append((String)charSequence);
                charSequence = string2;
                if (object.getPort() != -1) {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(":");
                    ((StringBuilder)charSequence).append(object.getPort());
                    charSequence = ((StringBuilder)charSequence).toString();
                }
                stringBuilder.append((String)charSequence);
                stringBuilder.append("/...");
                charSequence = stringBuilder.toString();
                break block8;
            }
            object = new StringBuilder(64);
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(':');
            if (string2 != null) {
                for (int i8 = 0; i8 < string2.length(); ++i8) {
                    char c8 = string2.charAt(i8);
                    if (c8 != '-' && c8 != '@' && c8 != '.') {
                        ((StringBuilder)object).append('x');
                        continue;
                    }
                    ((StringBuilder)object).append(c8);
                }
            }
            return ((StringBuilder)object).toString();
        }
        object = new StringBuilder(64);
        if (string != null) {
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(':');
        }
        if (charSequence != null) {
            ((StringBuilder)object).append((String)charSequence);
        }
        return ((StringBuilder)object).toString();
    }
}

