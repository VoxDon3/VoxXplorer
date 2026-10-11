/*
 * Decompiled with CFR 0.152.
 */
package ax.q7;

import ax.q7.m;
import ax.q7.n;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class t {
    public static boolean a(String string) {
        return m.c(string);
    }

    public static String b(String objectArray, Object ... object) {
        int n8;
        String string = String.valueOf(objectArray);
        int n9 = 0;
        if (object == null) {
            objectArray = new Object[]{"(Object[])null"};
        } else {
            n8 = 0;
            while (true) {
                objectArray = object;
                if (n8 >= ((Object[])object).length) break;
                object[n8] = t.c(object[n8]);
                ++n8;
            }
        }
        object = new StringBuilder(string.length() + objectArray.length * 16);
        int n10 = 0;
        for (n8 = n9; n8 < objectArray.length && (n9 = string.indexOf("%s", n10)) != -1; ++n8) {
            ((StringBuilder)object).append(string, n10, n9);
            ((StringBuilder)object).append(objectArray[n8]);
            n10 = n9 + 2;
        }
        ((StringBuilder)object).append(string, n10, string.length());
        if (n8 < objectArray.length) {
            ((StringBuilder)object).append(" [");
            n10 = n8 + 1;
            ((StringBuilder)object).append(objectArray[n8]);
            for (n8 = n10; n8 < objectArray.length; ++n8) {
                ((StringBuilder)object).append(", ");
                ((StringBuilder)object).append(objectArray[n8]);
            }
            ((StringBuilder)object).append(']');
        }
        return ((StringBuilder)object).toString();
    }

    private static String c(Object object) {
        if (object == null) {
            return "null";
        }
        try {
            String string = object.toString();
            return string;
        }
        catch (Exception exception) {
            Object object2 = new StringBuilder();
            ((StringBuilder)object2).append(object.getClass().getName());
            ((StringBuilder)object2).append('@');
            ((StringBuilder)object2).append(Integer.toHexString(System.identityHashCode(object)));
            object = ((StringBuilder)object2).toString();
            object2 = Logger.getLogger("com.google.common.base.Strings");
            Level level = Level.WARNING;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Exception during lenientFormat for ");
            stringBuilder.append((String)object);
            ((Logger)object2).log(level, stringBuilder.toString(), exception);
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("<");
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append(" threw ");
            ((StringBuilder)object2).append(exception.getClass().getName());
            ((StringBuilder)object2).append(">");
            return ((StringBuilder)object2).toString();
        }
    }

    public static String d(String string) {
        return m.b(string);
    }

    public static String e(String string, int n8, char c8) {
        n.n(string);
        if (string.length() >= n8) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder(n8);
        stringBuilder.append(string);
        for (int i8 = string.length(); i8 < n8; ++i8) {
            stringBuilder.append(c8);
        }
        return stringBuilder.toString();
    }
}

