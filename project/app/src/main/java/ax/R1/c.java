/*
 * Decompiled with CFR 0.152.
 */
package ax.R1;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import ax.S0.d0;
import ax.S0.u;
import ax.u7.f;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class c {
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    private c(String string, int n8, Integer n9, Integer n10, float f8, boolean bl, boolean bl2, boolean bl3, boolean bl4, int n11) {
        this.a = string;
        this.b = n8;
        this.c = n9;
        this.d = n10;
        this.e = f8;
        this.f = bl;
        this.g = bl2;
        this.h = bl3;
        this.i = bl4;
        this.j = n11;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c b(String string, a object) {
        RuntimeException runtimeException2;
        block3: {
            String string2;
            ax.S0.a.a(string.startsWith("Style:"));
            String[] stringArray = TextUtils.split((String)string.substring(6), (String)",");
            int n8 = stringArray.length;
            int n9 = ((a)object).k;
            if (n8 != n9) {
                u.h("SsaStyle", d0.G("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", n9, stringArray.length, string));
                return null;
            }
            try {
                string2 = stringArray[((a)object).a].trim();
                n9 = ((a)object).b;
                n9 = n9 != -1 ? ax.R1.c.e(stringArray[n9].trim()) : -1;
            }
            catch (RuntimeException runtimeException2) {
                break block3;
            }
            n8 = ((a)object).c;
            Integer n10 = n8 != -1 ? ax.R1.c.h(stringArray[n8].trim()) : null;
            n8 = ((a)object).d;
            Integer n11 = n8 != -1 ? ax.R1.c.h(stringArray[n8].trim()) : null;
            n8 = ((a)object).e;
            float f8 = n8 != -1 ? ax.R1.c.i(stringArray[n8].trim()) : -3.4028235E38f;
            n8 = ((a)object).f;
            boolean bl = n8 != -1 && ax.R1.c.f(stringArray[n8].trim());
            n8 = ((a)object).g;
            boolean bl2 = n8 != -1 && ax.R1.c.f(stringArray[n8].trim());
            n8 = ((a)object).h;
            boolean bl3 = n8 != -1 && ax.R1.c.f(stringArray[n8].trim());
            n8 = ((a)object).i;
            boolean bl4 = n8 != -1 && ax.R1.c.f(stringArray[n8].trim());
            n8 = ((a)object).j;
            n8 = n8 != -1 ? ax.R1.c.g(stringArray[n8].trim()) : -1;
            return new c(string2, n9, n10, n11, f8, bl, bl2, bl3, bl4, n8);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Skipping malformed 'Style:' line: '");
        stringBuilder.append(string);
        stringBuilder.append("'");
        u.i("SsaStyle", stringBuilder.toString(), runtimeException2);
        return null;
    }

    private static boolean c(int n8) {
        switch (n8) {
            default: {
                return false;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
        }
        return true;
    }

    private static boolean d(int n8) {
        return n8 == 1 || n8 == 3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static int e(String string) {
        try {
            int n8 = Integer.parseInt(string.trim());
            boolean bl = ax.R1.c.c(n8);
            if (bl) {
                return n8;
            }
        }
        catch (NumberFormatException numberFormatException) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ignoring unknown alignment: ");
        stringBuilder.append(string);
        u.h("SsaStyle", stringBuilder.toString());
        return -1;
    }

    private static boolean f(String string) {
        try {
            int n8 = Integer.parseInt(string);
            return n8 == 1 || n8 == -1;
            {
            }
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse boolean value: '");
            stringBuilder.append(string);
            stringBuilder.append("'");
            u.i("SsaStyle", stringBuilder.toString(), numberFormatException);
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static int g(String string) {
        try {
            int n8 = Integer.parseInt(string.trim());
            boolean bl = ax.R1.c.d(n8);
            if (bl) {
                return n8;
            }
        }
        catch (NumberFormatException numberFormatException) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ignoring unknown BorderStyle: ");
        stringBuilder.append(string);
        u.h("SsaStyle", stringBuilder.toString());
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Integer h(String string) {
        IllegalArgumentException illegalArgumentException2;
        block2: {
            long l8;
            try {
                l8 = string.startsWith("&H") ? Long.parseLong(string.substring(2), 16) : Long.parseLong(string);
            }
            catch (IllegalArgumentException illegalArgumentException2) {
                break block2;
            }
            boolean bl = l8 <= 0xFFFFFFFFL;
            ax.S0.a.a(bl);
            int n8 = ax.u7.f.e(l8 >> 24 & 0xFFL ^ 0xFFL);
            int n9 = ax.u7.f.e(l8 >> 16 & 0xFFL);
            int n10 = ax.u7.f.e(l8 >> 8 & 0xFFL);
            return Color.argb((int)n8, (int)ax.u7.f.e(l8 & 0xFFL), (int)n10, (int)n9);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to parse color expression: '");
        stringBuilder.append(string);
        stringBuilder.append("'");
        u.i("SsaStyle", stringBuilder.toString(), illegalArgumentException2);
        return null;
    }

    private static float i(String string) {
        try {
            float f8 = Float.parseFloat(string);
            return f8;
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to parse font size: '");
            stringBuilder.append(string);
            stringBuilder.append("'");
            u.i("SsaStyle", stringBuilder.toString(), numberFormatException);
            return -3.4028235E38f;
        }
    }

    static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;

        private a(int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = n11;
            this.e = n12;
            this.f = n13;
            this.g = n14;
            this.h = n15;
            this.i = n16;
            this.j = n17;
            this.k = n18;
        }

        public static a a(String stringArray) {
            stringArray = TextUtils.split((String)stringArray.substring(7), (String)",");
            int n8 = -1;
            int n9 = -1;
            int n10 = -1;
            int n11 = -1;
            int n12 = -1;
            int n13 = -1;
            int n14 = -1;
            int n15 = -1;
            int n16 = -1;
            int n17 = -1;
            block24: for (int i8 = 0; i8 < stringArray.length; ++i8) {
                int n18;
                block26: {
                    block27: {
                        String string = ax.q7.c.e(stringArray[i8].trim());
                        string.getClass();
                        switch (string.hashCode()) {
                            default: {
                                n18 = -1;
                                break block26;
                            }
                            case 1988365454: {
                                if (!string.equals("outlinecolour")) break;
                                n18 = 9;
                                break block26;
                            }
                            case 1767875043: {
                                if (!string.equals("alignment")) break;
                                n18 = 8;
                                break block26;
                            }
                            case 767321349: {
                                if (!string.equals("borderstyle")) break;
                                n18 = 7;
                                break block26;
                            }
                            case 366554320: {
                                if (!string.equals("fontsize")) break;
                                n18 = 6;
                                break block26;
                            }
                            case 3373707: {
                                if (!string.equals("name")) break;
                                n18 = 5;
                                break block26;
                            }
                            case 3029637: {
                                if (!string.equals("bold")) break;
                                n18 = 4;
                                break block26;
                            }
                            case -70925746: {
                                if (!string.equals("primarycolour")) break;
                                n18 = 3;
                                break block26;
                            }
                            case -192095652: {
                                if (!string.equals("strikeout")) break;
                                n18 = 2;
                                break block26;
                            }
                            case -1026963764: {
                                if (!string.equals("underline")) break;
                                n18 = 1;
                                break block26;
                            }
                            case -1178781136: {
                                if (string.equals("italic")) break block27;
                            }
                        }
                        n18 = -1;
                        break block26;
                    }
                    n18 = 0;
                }
                switch (n18) {
                    default: {
                        continue block24;
                    }
                    case 9: {
                        n11 = i8;
                        continue block24;
                    }
                    case 8: {
                        n9 = i8;
                        continue block24;
                    }
                    case 7: {
                        n17 = i8;
                        continue block24;
                    }
                    case 6: {
                        n12 = i8;
                        continue block24;
                    }
                    case 5: {
                        n8 = i8;
                        continue block24;
                    }
                    case 4: {
                        n13 = i8;
                        continue block24;
                    }
                    case 3: {
                        n10 = i8;
                        continue block24;
                    }
                    case 2: {
                        n16 = i8;
                        continue block24;
                    }
                    case 1: {
                        n15 = i8;
                        continue block24;
                    }
                    case 0: {
                        n14 = i8;
                    }
                }
            }
            if (n8 != -1) {
                return new a(n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, stringArray.length);
            }
            return null;
        }
    }

    static final class b {
        private static final Pattern c = Pattern.compile("\\{([^}]*)\\}");
        private static final Pattern d = Pattern.compile(d0.G("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern e = Pattern.compile(d0.G("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        private static final Pattern f = Pattern.compile("\\\\an(\\d+)");
        public final int a;
        public final PointF b;

        private b(int n8, PointF pointF) {
            this.a = n8;
            this.b = pointF;
        }

        private static int a(String object) {
            if (((Matcher)(object = f.matcher((CharSequence)object))).find()) {
                return ax.R1.c.e(ax.S0.a.e(((Matcher)object).group(1)));
            }
            return -1;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static b b(String string) {
            Matcher matcher = c.matcher(string);
            string = null;
            int n8 = -1;
            while (matcher.find()) {
                String string2;
                String string3 = ax.S0.a.e(matcher.group(1));
                try {
                    PointF pointF = ax.R1.c$b.c(string3);
                    string2 = string;
                    if (pointF != null) {
                        string2 = pointF;
                    }
                }
                catch (RuntimeException runtimeException) {
                    string2 = string;
                }
                try {
                    int n9 = ax.R1.c$b.a(string3);
                    string = string2;
                    if (n9 == -1) continue;
                    n8 = n9;
                    string = string2;
                }
                catch (RuntimeException runtimeException) {
                    string = string2;
                    continue;
                }
                break;
            }
            return new b(n8, (PointF)string);
        }

        private static PointF c(String string) {
            block6: {
                CharSequence charSequence;
                block5: {
                    boolean bl;
                    Matcher matcher;
                    block4: {
                        Matcher matcher2 = d.matcher(string);
                        matcher = e.matcher(string);
                        boolean bl2 = matcher2.find();
                        bl = matcher.find();
                        if (!bl2) break block4;
                        if (bl) {
                            charSequence = new StringBuilder();
                            ((StringBuilder)charSequence).append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                            ((StringBuilder)charSequence).append(string);
                            ((StringBuilder)charSequence).append("'");
                            u.f("SsaStyle.Overrides", ((StringBuilder)charSequence).toString());
                        }
                        charSequence = matcher2.group(1);
                        string = matcher2.group(2);
                        break block5;
                    }
                    if (!bl) break block6;
                    charSequence = matcher.group(1);
                    string = matcher.group(2);
                }
                return new PointF(Float.parseFloat(((String)ax.S0.a.e(charSequence)).trim()), Float.parseFloat(ax.S0.a.e(string).trim()));
            }
            return null;
        }

        public static String d(String string) {
            return c.matcher(string).replaceAll("");
        }
    }
}

