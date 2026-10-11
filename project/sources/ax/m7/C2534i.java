package ax.m7;

import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: ax.m7.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2534i implements Serializable {
    private static final TimeZone e0 = DesugarTimeZone.getTimeZone("GMT");
    private static final Pattern f0 = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})([Tt](\\d{2}):(\\d{2}):(\\d{2})(\\.\\d{1,9})?)?([Zz]|([+-])(\\d{2}):(\\d{2}))?");
    private final boolean c0;
    private final int d0;
    private final long q;

    /* renamed from: ax.m7.i$b */
    private static class b implements Serializable {
        private final int c0;
        private final boolean d0;
        private final Integer e0;
        private final long q;

        /* JADX INFO: Access modifiers changed from: private */
        public C2534i b() {
            return new C2534i(!this.d0, TimeUnit.SECONDS.toMillis(this.q) + TimeUnit.NANOSECONDS.toMillis(this.c0), this.e0);
        }

        private b(long j, int i, boolean z, Integer num) {
            this.q = j;
            this.c0 = i;
            this.d0 = z;
            this.e0 = num;
        }
    }

    public C2534i(long j) {
        this(false, j, null);
    }

    private static void a(StringBuilder sb, int i, int i2) {
        if (i < 0) {
            sb.append('-');
            i = -i;
        }
        int i3 = i;
        while (i3 > 0) {
            i3 /= 10;
            i2--;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append('0');
        }
        if (i != 0) {
            sb.append(i);
        }
    }

    public static C2534i c(String str) {
        return d(str).b();
    }

    private static b d(String str) throws NumberFormatException {
        int i;
        int i2;
        int i3;
        int i4;
        Integer num;
        Matcher matcher = f0.matcher(str);
        if (!matcher.matches()) {
            throw new NumberFormatException("Invalid date/time format: " + str);
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        int parseInt2 = Integer.parseInt(matcher.group(2)) - 1;
        int parseInt3 = Integer.parseInt(matcher.group(3));
        boolean z = matcher.group(4) != null;
        String group = matcher.group(9);
        boolean z2 = group != null;
        if (z2 && !z) {
            throw new NumberFormatException("Invalid date/time format, cannot specify time zone shift without specifying time: " + str);
        }
        if (z) {
            int parseInt4 = Integer.parseInt(matcher.group(5));
            int parseInt5 = Integer.parseInt(matcher.group(6));
            int parseInt6 = Integer.parseInt(matcher.group(7));
            if (matcher.group(8) != null) {
                i4 = Integer.parseInt(ax.q7.t.e(matcher.group(8).substring(1), 9, '0'));
                i2 = parseInt5;
                i3 = parseInt6;
            } else {
                i2 = parseInt5;
                i3 = parseInt6;
                i4 = 0;
            }
            i = parseInt4;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(e0);
        gregorianCalendar.clear();
        gregorianCalendar.set(parseInt, parseInt2, parseInt3, i, i2, i3);
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        if (!z || !z2) {
            num = null;
        } else if (Character.toUpperCase(group.charAt(0)) != 'Z') {
            int parseInt7 = (Integer.parseInt(matcher.group(11)) * 60) + Integer.parseInt(matcher.group(12));
            if (matcher.group(10).charAt(0) == '-') {
                parseInt7 = -parseInt7;
            }
            timeInMillis -= parseInt7 * 60000;
            num = Integer.valueOf(parseInt7);
        } else {
            num = 0;
        }
        return new b(timeInMillis / 1000, i4, z, num);
    }

    public long b() {
        return this.q;
    }

    public String e() {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar gregorianCalendar = new GregorianCalendar(e0);
        gregorianCalendar.setTimeInMillis(this.q + (this.d0 * 60000));
        a(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        a(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        a(sb, gregorianCalendar.get(5), 2);
        if (!this.c0) {
            sb.append('T');
            a(sb, gregorianCalendar.get(11), 2);
            sb.append(':');
            a(sb, gregorianCalendar.get(12), 2);
            sb.append(':');
            a(sb, gregorianCalendar.get(13), 2);
            if (gregorianCalendar.isSet(14)) {
                sb.append('.');
                a(sb, gregorianCalendar.get(14), 3);
            }
            int i = this.d0;
            if (i == 0) {
                sb.append('Z');
            } else {
                if (i > 0) {
                    sb.append('+');
                } else {
                    sb.append('-');
                    i = -i;
                }
                a(sb, i / 60, 2);
                sb.append(':');
                a(sb, i % 60, 2);
            }
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2534i)) {
            return false;
        }
        C2534i c2534i = (C2534i) obj;
        return this.c0 == c2534i.c0 && this.q == c2534i.q && this.d0 == c2534i.d0;
    }

    public int hashCode() {
        return Arrays.hashCode(new long[]{this.q, this.c0 ? 1L : 0L, this.d0});
    }

    public String toString() {
        return e();
    }

    public C2534i(boolean z, long j, Integer num) {
        this.c0 = z;
        this.q = j;
        this.d0 = z ? 0 : num == null ? TimeZone.getDefault().getOffset(j) / 60000 : num.intValue();
    }
}
