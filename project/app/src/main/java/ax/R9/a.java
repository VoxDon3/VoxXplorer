/*
 * Decompiled with CFR 0.152.
 */
package ax.R9;

import java.text.ParseException;
import java.util.Locale;

public class a {
    private final int a;
    private final int b;
    private final int c;

    public a(int n8, int n9, int n10) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
    }

    public static a a(String string) throws ParseException {
        Object object = string.split("-");
        if (((String[])object).length == 3) {
            return new a(Integer.parseInt(object[0]), Integer.parseInt((String)object[1]), Integer.parseInt((String)object[2]));
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Expected datestring format 'yyyy-mm-dd' but found: ");
        ((StringBuilder)object).append(string);
        throw new ParseException(((StringBuilder)object).toString(), 0);
    }

    public String toString() {
        return String.format(Locale.ROOT, "%04d-%02d-%02d", this.a, this.b, this.c);
    }
}

