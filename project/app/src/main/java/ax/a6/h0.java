/*
 * Decompiled with CFR 0.152.
 */
package ax.a6;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class h0 {
    public static String a(String string, Object ... objectArray) {
        int n8;
        CharSequence charSequence;
        int n9;
        int n10;
        int n11 = 0;
        for (n10 = 0; n10 < (n9 = objectArray.length); ++n10) {
            Object object = objectArray[n10];
            if (object == null) {
                charSequence = "null";
            } else {
                try {
                    charSequence = object.toString();
                }
                catch (Exception exception) {
                    String string2 = object.getClass().getName();
                    object = Integer.toHexString(System.identityHashCode(object));
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append("@");
                    stringBuilder.append((String)object);
                    string2 = stringBuilder.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(string2), exception);
                    charSequence = exception.getClass().getName();
                    object = new StringBuilder();
                    ((StringBuilder)object).append("<");
                    ((StringBuilder)object).append(string2);
                    ((StringBuilder)object).append(" threw ");
                    ((StringBuilder)object).append((String)charSequence);
                    ((StringBuilder)object).append(">");
                    charSequence = ((StringBuilder)object).toString();
                }
            }
            objectArray[n10] = charSequence;
        }
        charSequence = new StringBuilder(string.length() + n9 * 16);
        n9 = 0;
        n10 = n11;
        n11 = n9;
        while (n10 < (n8 = objectArray.length) && (n9 = string.indexOf("%s", n11)) != -1) {
            ((StringBuilder)charSequence).append(string, n11, n9);
            ((StringBuilder)charSequence).append(objectArray[n10]);
            ++n10;
            n11 = n9 + 2;
        }
        ((StringBuilder)charSequence).append(string, n11, string.length());
        if (n10 < n8) {
            ((StringBuilder)charSequence).append(" [");
            n11 = n10 + 1;
            ((StringBuilder)charSequence).append(objectArray[n10]);
            for (n10 = n11; n10 < objectArray.length; ++n10) {
                ((StringBuilder)charSequence).append(", ");
                ((StringBuilder)charSequence).append(objectArray[n10]);
            }
            ((StringBuilder)charSequence).append(']');
        }
        return ((StringBuilder)charSequence).toString();
    }
}

