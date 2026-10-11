/*
 * Decompiled with CFR 0.152.
 */
package ax.Nd;

public class c {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(String string, int n8) {
        block3: {
            try {
                int n9 = Integer.parseInt(string);
                if (n9 < 0 || n9 > n8) break block3;
                return true;
            }
            catch (NumberFormatException numberFormatException) {
                return false;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean b(String string) {
        int n8;
        if (string.length() == 0) {
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(".");
        string = stringBuilder.toString();
        int n9 = 0;
        int n10 = 0;
        while (n9 < string.length() && (n8 = string.indexOf(46, n9)) > n9) {
            if (n10 == 4) {
                return false;
            }
            try {
                n9 = Integer.parseInt(string.substring(n9, n8));
                if (n9 < 0) return false;
                if (n9 > 255) {
                    return false;
                }
                n9 = n8 + 1;
                ++n10;
            }
            catch (NumberFormatException numberFormatException) {
                return false;
            }
        }
        if (n10 != 4) return false;
        return true;
    }

    public static boolean c(String string) {
        int n8 = string.indexOf("/");
        String string2 = string.substring(n8 + 1);
        return n8 > 0 && c.b(string.substring(0, n8)) && (c.b(string2) || c.a(string2, 32));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean d(String string) {
        int n8;
        if (string.length() == 0) {
            return false;
        }
        CharSequence charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string);
        ((StringBuilder)charSequence).append(":");
        charSequence = ((StringBuilder)charSequence).toString();
        int n9 = 0;
        int n10 = 0;
        boolean bl = false;
        while (n9 < ((String)charSequence).length() && (n8 = ((String)charSequence).indexOf(58, n9)) >= n9) {
            block10: {
                block11: {
                    if (n10 == 8) {
                        return false;
                    }
                    if (n9 == n8) break block11;
                    string = ((String)charSequence).substring(n9, n8);
                    if (n8 == ((String)charSequence).length() - 1 && string.indexOf(46) > 0) {
                        if (!c.b(string)) {
                            return false;
                        }
                        ++n10;
                        break block10;
                    } else {
                        try {
                            n9 = Integer.parseInt(((String)charSequence).substring(n9, n8), 16);
                            if (n9 < 0) return false;
                            if (n9 > 65535) {
                                return false;
                            }
                            break block10;
                        }
                        catch (NumberFormatException numberFormatException) {
                            return false;
                        }
                    }
                }
                if (n8 != 1 && n8 != ((String)charSequence).length() - 1 && bl) {
                    return false;
                }
                bl = true;
            }
            n9 = n8 + 1;
            ++n10;
        }
        if (n10 == 8) return true;
        if (!bl) return false;
        return true;
    }

    public static boolean e(String string) {
        int n8 = string.indexOf("/");
        String string2 = string.substring(n8 + 1);
        return n8 > 0 && c.d(string.substring(0, n8)) && (c.d(string2) || c.a(string2, 128));
    }
}

