package ax.R9;

import java.text.ParseException;
import java.util.Locale;

/* loaded from: classes3.dex */
public class a {
    private final int a;
    private final int b;
    private final int c;

    public a(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static a a(String str) throws ParseException {
        String[] split = str.split("-");
        if (split.length == 3) {
            return new a(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        throw new ParseException("Expected datestring format 'yyyy-mm-dd' but found: " + str, 0);
    }

    public String toString() {
        return String.format(Locale.ROOT, "%04d-%02d-%02d", Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }
}
