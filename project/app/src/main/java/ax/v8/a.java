/*
 * Decompiled with CFR 0.152.
 */
package ax.v8;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class a {
    private static final TimeZone a = java.util.DesugarTimeZone.getTimeZone((String)"UTC");

    private static boolean a(String string, int n8, char c8) {
        return n8 < string.length() && string.charAt(n8) == c8;
    }

    private static int b(String string, int n8) {
        while (n8 < string.length()) {
            char c8 = string.charAt(n8);
            if (c8 >= '0' && c8 <= '9') {
                ++n8;
                continue;
            }
            return n8;
        }
        return string.length();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Date c(String object, ParsePosition parsePosition) throws ParseException {
        CharSequence charSequence;
        Throwable var14_17;
        CharSequence charSequence2;
        block38: {
            block37: {
                block36: {
                    block33: {
                        Object object2;
                        Object object3;
                        int n8;
                        int n9;
                        int n10;
                        int n11;
                        int n12;
                        int n13;
                        int n14;
                        int n15;
                        block34: {
                            block35: {
                                block31: {
                                    block32: {
                                        n15 = parsePosition.getIndex();
                                        n14 = n15 + 4;
                                        n13 = ax.v8.a.d((String)object, n15, n14);
                                        n12 = n14;
                                        if (ax.v8.a.a((String)object, n14, '-')) {
                                            n12 = n15 + 5;
                                        }
                                        n15 = n12 + 2;
                                        n11 = ax.v8.a.d((String)object, n12, n15);
                                        n14 = n15;
                                        if (ax.v8.a.a((String)object, n15, '-')) {
                                            n14 = n12 + 3;
                                        }
                                        n10 = n14 + 2;
                                        n9 = ax.v8.a.d((String)object, n14, n10);
                                        boolean bl = ax.v8.a.a((String)object, n10, 'T');
                                        if (!bl && ((String)object).length() <= n10) {
                                            GregorianCalendar gregorianCalendar = new GregorianCalendar(n13, n11 - 1, n9);
                                            gregorianCalendar.setLenient(false);
                                            parsePosition.setIndex(n10);
                                            return gregorianCalendar.getTime();
                                        }
                                        if (bl) {
                                            n15 = n14 + 5;
                                            n10 = ax.v8.a.d((String)object, n14 + 3, n15);
                                            n12 = n15;
                                            if (ax.v8.a.a((String)object, n15, ':')) {
                                                n12 = n14 + 6;
                                            }
                                            n8 = n12 + 2;
                                            n15 = ax.v8.a.d((String)object, n12, n8);
                                            n14 = n8;
                                            if (ax.v8.a.a((String)object, n8, ':')) {
                                                n14 = n12 + 3;
                                            }
                                            if (((String)object).length() > n14 && (n12 = (int)((String)object).charAt(n14)) != 90 && n12 != 43 && n12 != 45) {
                                                int n16;
                                                n8 = n14 + 2;
                                                n12 = n16 = ax.v8.a.d((String)object, n14, n8);
                                                if (n16 > 59) {
                                                    n12 = n16;
                                                    if (n16 < 63) {
                                                        n12 = 59;
                                                    }
                                                }
                                                if (ax.v8.a.a((String)object, n8, '.')) {
                                                    n16 = n14 + 3;
                                                    n8 = ax.v8.a.b((String)object, n14 + 4);
                                                    int n17 = Math.min(n8, n14 + 6);
                                                    n14 = ax.v8.a.d((String)object, n16, n17);
                                                    if ((n16 = n17 - n16) != 1) {
                                                        if (n16 == 2) {
                                                            n14 *= 10;
                                                        }
                                                    } else {
                                                        n14 *= 100;
                                                    }
                                                    n16 = n10;
                                                    n10 = n8;
                                                    n8 = n14;
                                                    n14 = n16;
                                                    break block31;
                                                }
                                                n14 = n10;
                                                n10 = n8;
                                                n8 = 0;
                                                break block31;
                                            }
                                            n12 = n14;
                                            n14 = n10;
                                            n10 = n12;
                                            break block32;
                                        }
                                        n14 = 0;
                                        n15 = 0;
                                    }
                                    n8 = 0;
                                    n12 = 0;
                                }
                                if (((String)object).length() <= n10) break block33;
                                char c8 = ((String)object).charAt(n10);
                                if (c8 == 'Z') {
                                    object3 = a;
                                    ++n10;
                                    break block34;
                                }
                                if (c8 == '+' || c8 == '-') break block35;
                                try {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Invalid time zone indicator '");
                                    stringBuilder.append(c8);
                                    stringBuilder.append("'");
                                    IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException(stringBuilder.toString());
                                    throw indexOutOfBoundsException;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                }
                                catch (NumberFormatException numberFormatException) {
                                }
                                catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
                                break block36;
                            }
                            object3 = ((String)object).substring(n10);
                            if (((String)object3).length() < 5) {
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append((String)object3);
                                ((StringBuilder)object2).append("00");
                                object3 = ((StringBuilder)object2).toString();
                            }
                            n10 += ((String)object3).length();
                            if (!"+0000".equals(object3) && !"+00:00".equals(object3)) {
                                object2 = new StringBuilder();
                                ((StringBuilder)object2).append("GMT");
                                ((StringBuilder)object2).append((String)object3);
                                object2 = ((StringBuilder)object2).toString();
                                object3 = java.util.DesugarTimeZone.getTimeZone((String)object2);
                                Object object4 = ((TimeZone)object3).getID();
                                if (!((String)object4).equals(object2) && !((String)object4).replace(":", "").equals(object2)) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Mismatching time zone indicator: ");
                                    stringBuilder.append((String)object2);
                                    stringBuilder.append(" given, resolves to ");
                                    stringBuilder.append(((TimeZone)object3).getID());
                                    object4 = new IndexOutOfBoundsException(stringBuilder.toString());
                                    throw object4;
                                }
                            } else {
                                object3 = a;
                            }
                        }
                        object2 = new GregorianCalendar((TimeZone)object3);
                        ((Calendar)object2).setLenient(false);
                        ((Calendar)object2).set(1, n13);
                        ((Calendar)object2).set(2, n11 - 1);
                        ((Calendar)object2).set(5, n9);
                        ((Calendar)object2).set(11, n14);
                        ((Calendar)object2).set(12, n15);
                        ((Calendar)object2).set(13, n12);
                        ((Calendar)object2).set(14, n8);
                        parsePosition.setIndex(n10);
                        return ((Calendar)object2).getTime();
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No time zone indicator");
                    throw illegalArgumentException;
                }
                if (object == null) {
                    object = null;
                } else {
                    charSequence2 = new StringBuilder();
                    ((StringBuilder)charSequence2).append('\"');
                    ((StringBuilder)charSequence2).append((String)object);
                    ((StringBuilder)charSequence2).append('\"');
                    object = ((StringBuilder)charSequence2).toString();
                }
                charSequence = var14_17.getMessage();
                if (charSequence == null) break block37;
                charSequence2 = charSequence;
                if (!((String)charSequence).isEmpty()) break block38;
            }
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append("(");
            ((StringBuilder)charSequence2).append(var14_17.getClass().getName());
            ((StringBuilder)charSequence2).append(")");
            charSequence2 = ((StringBuilder)charSequence2).toString();
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append("Failed to parse date [");
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append("]: ");
        ((StringBuilder)charSequence).append((String)charSequence2);
        object = new ParseException(((StringBuilder)charSequence).toString(), parsePosition.getIndex());
        ((Throwable)object).initCause((Throwable)var14_17);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int d(String string, int n8, int n9) throws NumberFormatException {
        if (n8 >= 0 && n9 <= string.length() && n8 <= n9) {
            int n10;
            int n11;
            if (n8 < n9) {
                n11 = n8 + 1;
                n10 = Character.digit(string.charAt(n8), 10);
                if (n10 < 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid number: ");
                    stringBuilder.append(string.substring(n8, n9));
                    throw new NumberFormatException(stringBuilder.toString());
                }
                n10 = -n10;
            } else {
                n10 = 0;
                n11 = n8;
            }
            while (true) {
                if (n11 >= n9) {
                    return -n10;
                }
                int n12 = Character.digit(string.charAt(n11), 10);
                if (n12 < 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid number: ");
                    stringBuilder.append(string.substring(n8, n9));
                    throw new NumberFormatException(stringBuilder.toString());
                }
                n10 = n10 * 10 - n12;
                ++n11;
            }
        }
        throw new NumberFormatException(string);
    }
}

