/*
 * Decompiled with CFR 0.152.
 */
package ax.w4;

import java.util.Date;

public class d {
    public static RuntimeException a(String object, Throwable throwable) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object);
        stringBuilder.append(": ");
        stringBuilder.append(throwable.getMessage());
        object = new RuntimeException(stringBuilder.toString());
        ((Throwable)object).initCause(throwable);
        return object;
    }

    public static Date b(Date date) {
        Date date2 = date;
        if (date != null) {
            long l8 = date.getTime();
            date2 = new Date(l8 - l8 % 1000L);
        }
        return date2;
    }
}

