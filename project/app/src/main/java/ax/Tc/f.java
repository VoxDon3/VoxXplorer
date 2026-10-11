/*
 * Decompiled with CFR 0.152.
 */
package ax.Tc;

import ax.Sc.a;
import ax.Tc.e;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class f
implements e,
a {
    private static final int[] f = new int[]{14, 13, 12, 11, 5, 2, 1};
    private SimpleDateFormat a;
    private int b;
    private SimpleDateFormat c;
    private int d;
    private boolean e;

    public f() {
        this.g("MMM d yyyy", null);
        this.i("MMM d HH:mm", null);
    }

    private static int b(SimpleDateFormat object) {
        if (object == null) {
            return 0;
        }
        String string = ((SimpleDateFormat)object).toPattern();
        for (Object object2 : (Object)"SsmHdM".toCharArray()) {
            if (string.indexOf((int)object2) == -1) continue;
            if (object2 != 72) {
                if (object2 != 77) {
                    if (object2 != 83) {
                        if (object2 != 100) {
                            if (object2 != 109) {
                                if (object2 != 115) continue;
                                return ax.Tc.f.d(13);
                            }
                            return ax.Tc.f.d(12);
                        }
                        return ax.Tc.f.d(5);
                    }
                    return ax.Tc.f.d(14);
                }
                return ax.Tc.f.d(2);
            }
            return ax.Tc.f.d(11);
        }
        return 0;
    }

    private static int d(int n8) {
        int[] nArray;
        for (int i8 = 0; i8 < (nArray = f).length; ++i8) {
            if (n8 != nArray[i8]) continue;
            return i8;
        }
        return 0;
    }

    private void g(String string, DateFormatSymbols dateFormatSymbols) {
        if (string != null) {
            this.a = dateFormatSymbols != null ? new SimpleDateFormat(string, dateFormatSymbols) : new SimpleDateFormat(string);
            this.a.setLenient(false);
        } else {
            this.a = null;
        }
        this.b = ax.Tc.f.b(this.a);
    }

    private static void h(int n8, Calendar calendar) {
        if (n8 <= 0 || calendar.get(n8 = f[n8 - 1]) != 0) {
            return;
        }
        calendar.clear(n8);
    }

    private void i(String string, DateFormatSymbols dateFormatSymbols) {
        if (string != null) {
            this.c = dateFormatSymbols != null ? new SimpleDateFormat(string, dateFormatSymbols) : new SimpleDateFormat(string);
            this.c.setLenient(false);
        } else {
            this.c = null;
        }
        this.d = ax.Tc.f.b(this.c);
    }

    private void j(String object) {
        TimeZone timeZone = TimeZone.getDefault();
        if (object != null) {
            timeZone = java.util.DesugarTimeZone.getTimeZone((String)object);
        }
        this.a.setTimeZone(timeZone);
        object = this.c;
        if (object != null) {
            ((DateFormat)object).setTimeZone(timeZone);
        }
    }

    @Override
    public Calendar a(String string) throws ParseException {
        return this.e(string, Calendar.getInstance());
    }

    public TimeZone c() {
        return this.a.getTimeZone();
    }

    public Calendar e(String string, Calendar calendar) throws ParseException {
        Object object;
        Object object2;
        Comparable<Calendar> comparable = (Calendar)calendar.clone();
        ((Calendar)comparable).setTimeZone(this.c());
        if (this.c != null) {
            object2 = (Calendar)calendar.clone();
            ((Calendar)object2).setTimeZone(this.c());
            if (this.e) {
                ((Calendar)object2).add(5, 1);
            }
            object = Integer.toString(((Calendar)object2).get(1));
            Object object3 = new StringBuilder();
            ((StringBuilder)object3).append(string);
            ((StringBuilder)object3).append(" ");
            ((StringBuilder)object3).append((String)object);
            object = ((StringBuilder)object3).toString();
            object3 = new StringBuilder();
            ((StringBuilder)object3).append(this.c.toPattern());
            ((StringBuilder)object3).append(" yyyy");
            Cloneable cloneable = new SimpleDateFormat(((StringBuilder)object3).toString(), this.c.getDateFormatSymbols());
            cloneable.setLenient(false);
            cloneable.setTimeZone(this.c.getTimeZone());
            object3 = new ParsePosition(0);
            cloneable = cloneable.parse((String)object, (ParsePosition)object3);
            if (cloneable != null && ((ParsePosition)object3).getIndex() == ((String)object).length()) {
                ((Calendar)comparable).setTime((Date)cloneable);
                if (((Calendar)comparable).after(object2)) {
                    ((Calendar)comparable).add(1, -1);
                }
                ax.Tc.f.h(this.d, comparable);
                return comparable;
            }
        }
        if ((object = this.a.parse(string, (ParsePosition)(object2 = new ParsePosition(0)))) != null && ((ParsePosition)object2).getIndex() == string.length()) {
            ((Calendar)comparable).setTime((Date)object);
            ax.Tc.f.h(this.b, comparable);
            return comparable;
        }
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append("Timestamp '");
        ((StringBuilder)comparable).append(string);
        ((StringBuilder)comparable).append("' could not be parsed using a server time of ");
        ((StringBuilder)comparable).append(calendar.getTime().toString());
        throw new ParseException(((StringBuilder)comparable).toString(), ((ParsePosition)object2).getErrorIndex());
    }

    @Override
    public void f(ax.Sc.f f8) {
        Object object = f8.d();
        String string = f8.g();
        object = string != null ? ax.Sc.f.a(string) : (object != null ? ax.Sc.f.j((String)object) : ax.Sc.f.j("en"));
        this.i(f8.c(), (DateFormatSymbols)object);
        string = f8.b();
        if (string != null) {
            this.g(string, (DateFormatSymbols)object);
            this.j(f8.f());
            this.e = f8.i();
            return;
        }
        throw new IllegalArgumentException("defaultFormatString cannot be null");
    }
}

