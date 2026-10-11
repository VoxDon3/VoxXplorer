/*
 * Decompiled with CFR 0.152.
 */
package ax.t8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class i {
    private static String a(int n8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 == 3) {
                        return "M/d/yy";
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown DateFormat style: ");
                    stringBuilder.append(n8);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                return "MMM d, yyyy";
            }
            return "MMMM d, yyyy";
        }
        return "EEEE, MMMM d, yyyy";
    }

    private static String b(int n8) {
        if (n8 != 0 && n8 != 1) {
            if (n8 != 2) {
                if (n8 == 3) {
                    return "h:mm a";
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown DateFormat style: ");
                stringBuilder.append(n8);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            return "h:mm:ss a";
        }
        return "h:mm:ss a z";
    }

    public static DateFormat c(int n8, int n9) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(i.a(n8));
        stringBuilder.append(" ");
        stringBuilder.append(i.b(n9));
        return new SimpleDateFormat(stringBuilder.toString(), Locale.US);
    }
}

