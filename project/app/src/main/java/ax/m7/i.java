/*
 * Decompiled with CFR 0.152.
 */
package ax.m7;

import ax.q7.t;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class i
implements Serializable {
    private static final TimeZone e0 = java.util.DesugarTimeZone.getTimeZone((String)"GMT");
    private static final Pattern f0 = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d{1,9})?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    private final boolean c0;
    private final int d0;
    private final long q;

    public i(long l8) {
        this(false, l8, null);
    }

    public i(boolean bl, long l8, Integer n8) {
        this.c0 = bl;
        this.q = l8;
        int n9 = bl ? 0 : (n8 == null ? TimeZone.getDefault().getOffset(l8) / 60000 : n8);
        this.d0 = n9;
    }

    private static void a(StringBuilder stringBuilder, int n8, int n9) {
        int n10 = n8;
        if (n8 < 0) {
            stringBuilder.append('-');
            n10 = -n8;
        }
        n8 = n10;
        while (n8 > 0) {
            n8 /= 10;
            --n9;
        }
        for (n8 = 0; n8 < n9; ++n8) {
            stringBuilder.append('0');
        }
        if (n10 != 0) {
            stringBuilder.append(n10);
        }
    }

    public static i c(String string) {
        return i.d(string).b();
    }

    private static b d(String object) throws NumberFormatException {
        Object object2 = f0.matcher((CharSequence)object);
        if (((Matcher)object2).matches()) {
            int n8;
            int n9;
            int n10;
            int n11;
            int n12 = Integer.parseInt(((Matcher)object2).group(1));
            int n13 = Integer.parseInt(((Matcher)object2).group(2));
            int n14 = Integer.parseInt(((Matcher)object2).group(3));
            boolean bl = ((Matcher)object2).group(4) != null;
            String string = ((Matcher)object2).group(9);
            int n15 = string != null ? 1 : 0;
            if (n15 != 0 && !bl) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Invalid date/time format, cannot specify time zone shift without specifying time: ");
                ((StringBuilder)object2).append((String)object);
                throw new NumberFormatException(((StringBuilder)object2).toString());
            }
            if (bl) {
                n11 = Integer.parseInt(((Matcher)object2).group(5));
                n10 = Integer.parseInt(((Matcher)object2).group(6));
                n9 = Integer.parseInt(((Matcher)object2).group(7));
                n8 = ((Matcher)object2).group(8) != null ? Integer.parseInt(t.e(((Matcher)object2).group(8).substring(1), 9, '0')) : 0;
            } else {
                n11 = 0;
                n10 = 0;
                n9 = 0;
                n8 = 0;
            }
            object = new GregorianCalendar(e0);
            ((Calendar)object).clear();
            ((Calendar)object).set(n12, n13 - 1, n14, n11, n10, n9);
            long l8 = ((Calendar)object).getTimeInMillis();
            if (bl && n15 != 0) {
                if (Character.toUpperCase(string.charAt(0)) != 'Z') {
                    n15 = n9 = Integer.parseInt(((Matcher)object2).group(11)) * 60 + Integer.parseInt(((Matcher)object2).group(12));
                    if (((Matcher)object2).group(10).charAt(0) == '-') {
                        n15 = -n9;
                    }
                    l8 -= (long)n15 * 60000L;
                    object = n15;
                } else {
                    object = 0;
                }
            } else {
                object = null;
            }
            return new b(l8 / 1000L, n8, bl, (Integer)object);
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Invalid date/time format: ");
        ((StringBuilder)object2).append((String)object);
        throw new NumberFormatException(((StringBuilder)object2).toString());
    }

    public long b() {
        return this.q;
    }

    public String e() {
        StringBuilder stringBuilder = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(e0);
        gregorianCalendar.setTimeInMillis(this.q + (long)this.d0 * 60000L);
        i.a(stringBuilder, gregorianCalendar.get(1), 4);
        stringBuilder.append('-');
        i.a(stringBuilder, gregorianCalendar.get(2) + 1, 2);
        stringBuilder.append('-');
        i.a(stringBuilder, gregorianCalendar.get(5), 2);
        if (!this.c0) {
            int n8;
            stringBuilder.append('T');
            i.a(stringBuilder, gregorianCalendar.get(11), 2);
            stringBuilder.append(':');
            i.a(stringBuilder, gregorianCalendar.get(12), 2);
            stringBuilder.append(':');
            i.a(stringBuilder, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                stringBuilder.append('.');
                i.a(stringBuilder, gregorianCalendar.get(14), 3);
            }
            if ((n8 = this.d0) == 0) {
                stringBuilder.append('Z');
            } else {
                if (n8 > 0) {
                    stringBuilder.append('+');
                } else {
                    stringBuilder.append('-');
                    n8 = -n8;
                }
                i.a(stringBuilder, n8 / 60, 2);
                stringBuilder.append(':');
                i.a(stringBuilder, n8 % 60, 2);
            }
        }
        return stringBuilder.toString();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof i)) {
            return false;
        }
        object = (i)object;
        return this.c0 == ((i)object).c0 && this.q == ((i)object).q && this.d0 == ((i)object).d0;
    }

    public int hashCode() {
        long l8 = this.q;
        long l9 = this.c0 ? 1L : 0L;
        return Arrays.hashCode(new long[]{l8, l9, this.d0});
    }

    public String toString() {
        return this.e();
    }

    private static class b
    implements Serializable {
        private final int c0;
        private final boolean d0;
        private final Integer e0;
        private final long q;

        private b(long l8, int n8, boolean bl, Integer n9) {
            this.q = l8;
            this.c0 = n8;
            this.d0 = bl;
            this.e0 = n9;
        }

        private i b() {
            long l8 = TimeUnit.SECONDS.toMillis(this.q);
            long l9 = TimeUnit.NANOSECONDS.toMillis(this.c0);
            return new i(this.d0 ^ true, l8 + l9, this.e0);
        }
    }
}

