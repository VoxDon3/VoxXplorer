package ax.Tc;

import j$.util.DesugarTimeZone;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class f implements e, ax.Sc.a {
    private static final int[] f = {14, 13, 12, 11, 5, 2, 1};
    private SimpleDateFormat a;
    private int b;
    private SimpleDateFormat c;
    private int d;
    private boolean e;

    public f() {
        g("MMM d yyyy", null);
        i("MMM d HH:mm", null);
    }

    private static int b(SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat == null) {
            return 0;
        }
        String pattern = simpleDateFormat.toPattern();
        for (char c : "SsmHdM".toCharArray()) {
            if (pattern.indexOf(c) != -1) {
                if (c == 'H') {
                    return d(11);
                }
                if (c == 'M') {
                    return d(2);
                }
                if (c == 'S') {
                    return d(14);
                }
                if (c == 'd') {
                    return d(5);
                }
                if (c == 'm') {
                    return d(12);
                }
                if (c == 's') {
                    return d(13);
                }
            }
        }
        return 0;
    }

    private static int d(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = f;
            if (i2 >= iArr.length) {
                return 0;
            }
            if (i == iArr[i2]) {
                return i2;
            }
            i2++;
        }
    }

    private void g(String str, DateFormatSymbols dateFormatSymbols) {
        if (str != null) {
            if (dateFormatSymbols != null) {
                this.a = new SimpleDateFormat(str, dateFormatSymbols);
            } else {
                this.a = new SimpleDateFormat(str);
            }
            this.a.setLenient(false);
        } else {
            this.a = null;
        }
        this.b = b(this.a);
    }

    private static void h(int i, Calendar calendar) {
        if (i <= 0) {
            return;
        }
        int i2 = f[i - 1];
        if (calendar.get(i2) != 0) {
            return;
        }
        calendar.clear(i2);
    }

    private void i(String str, DateFormatSymbols dateFormatSymbols) {
        if (str != null) {
            if (dateFormatSymbols != null) {
                this.c = new SimpleDateFormat(str, dateFormatSymbols);
            } else {
                this.c = new SimpleDateFormat(str);
            }
            this.c.setLenient(false);
        } else {
            this.c = null;
        }
        this.d = b(this.c);
    }

    private void j(String str) {
        TimeZone timeZone = TimeZone.getDefault();
        if (str != null) {
            timeZone = DesugarTimeZone.getTimeZone(str);
        }
        this.a.setTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat = this.c;
        if (simpleDateFormat != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
    }

    @Override // ax.Tc.e
    public Calendar a(String str) throws ParseException {
        return e(str, Calendar.getInstance());
    }

    public TimeZone c() {
        return this.a.getTimeZone();
    }

    public Calendar e(String str, Calendar calendar) throws ParseException {
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.setTimeZone(c());
        if (this.c != null) {
            Calendar calendar3 = (Calendar) calendar.clone();
            calendar3.setTimeZone(c());
            if (this.e) {
                calendar3.add(5, 1);
            }
            String str2 = str + " " + Integer.toString(calendar3.get(1));
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.c.toPattern() + " yyyy", this.c.getDateFormatSymbols());
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(this.c.getTimeZone());
            ParsePosition parsePosition = new ParsePosition(0);
            Date parse = simpleDateFormat.parse(str2, parsePosition);
            if (parse != null && parsePosition.getIndex() == str2.length()) {
                calendar2.setTime(parse);
                if (calendar2.after(calendar3)) {
                    calendar2.add(1, -1);
                }
                h(this.d, calendar2);
                return calendar2;
            }
        }
        ParsePosition parsePosition2 = new ParsePosition(0);
        Date parse2 = this.a.parse(str, parsePosition2);
        if (parse2 != null && parsePosition2.getIndex() == str.length()) {
            calendar2.setTime(parse2);
            h(this.b, calendar2);
            return calendar2;
        }
        throw new ParseException("Timestamp '" + str + "' could not be parsed using a server time of " + calendar.getTime().toString(), parsePosition2.getErrorIndex());
    }

    @Override // ax.Sc.a
    public void f(ax.Sc.f fVar) {
        String d = fVar.d();
        String g = fVar.g();
        DateFormatSymbols a = g != null ? ax.Sc.f.a(g) : d != null ? ax.Sc.f.j(d) : ax.Sc.f.j("en");
        i(fVar.c(), a);
        String b = fVar.b();
        if (b == null) {
            throw new IllegalArgumentException("defaultFormatString cannot be null");
        }
        g(b, a);
        j(fVar.f());
        this.e = fVar.i();
    }
}
