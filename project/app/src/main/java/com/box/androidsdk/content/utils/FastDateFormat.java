/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.utils;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class FastDateFormat
extends Format {
    private static final Map d0 = new HashMap(7);
    private static final Map e0 = new HashMap(7);
    private static final Map f0 = new HashMap(7);
    private static final Map g0 = new HashMap(7);
    private static final Map h0 = new HashMap(7);
    private static final long serialVersionUID = 1L;
    private transient int c0;
    private final Locale mLocale;
    private final boolean mLocaleForced;
    private final String mPattern;
    private final TimeZone mTimeZone;
    private final boolean mTimeZoneForced;
    private transient d[] q;

    protected FastDateFormat(String object, TimeZone timeZone, Locale locale) {
        if (object != null) {
            this.mPattern = object;
            boolean bl = false;
            boolean bl2 = timeZone != null;
            this.mTimeZoneForced = bl2;
            object = timeZone;
            if (timeZone == null) {
                object = TimeZone.getDefault();
            }
            this.mTimeZone = object;
            bl2 = bl;
            if (locale != null) {
                bl2 = true;
            }
            this.mLocaleForced = bl2;
            object = locale;
            if (locale == null) {
                object = Locale.getDefault();
            }
            this.mLocale = object;
            return;
        }
        throw new IllegalArgumentException("The pattern must not be null");
    }

    public static FastDateFormat i(String string) {
        return FastDateFormat.j(string, null, null);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static FastDateFormat j(String object, TimeZone object2, Locale locale) {
        synchronized (FastDateFormat.class) {
            try {
                FastDateFormat fastDateFormat = new FastDateFormat((String)object, (TimeZone)object2, locale);
                object2 = d0;
                object = (FastDateFormat)object2.get(fastDateFormat);
                if (object != null) return object;
                fastDateFormat.l();
                object2.put(fastDateFormat, fastDateFormat);
                return fastDateFormat;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static String k(TimeZone timeZone, boolean bl, int n8, Locale locale) {
        synchronized (FastDateFormat.class) {
            Throwable throwable2;
            block5: {
                String string;
                block4: {
                    try {
                        String string2;
                        g g8 = new g(timeZone, bl, n8, locale);
                        Map map = h0;
                        string = string2 = (String)map.get(g8);
                        if (string2 != null) break block4;
                        string = timeZone.getDisplayName(bl, n8, locale);
                        map.put(g8, string);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return string;
            }
            throw throwable2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.l();
    }

    protected StringBuffer b(Calendar calendar, StringBuffer stringBuffer) {
        d[] dArray = this.q;
        int n8 = dArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            dArray[i8].b(stringBuffer, calendar);
        }
        return stringBuffer;
    }

    public String c(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.mTimeZone);
        gregorianCalendar.setTime(date);
        return this.b(gregorianCalendar, new StringBuffer(this.c0)).toString();
    }

    public StringBuffer d(long l8, StringBuffer stringBuffer) {
        return this.h(new Date(l8), stringBuffer);
    }

    public boolean equals(Object object) {
        if (!(object instanceof FastDateFormat)) {
            return false;
        }
        object = (FastDateFormat)object;
        Object object2 = this.mPattern;
        Object object3 = ((FastDateFormat)object).mPattern;
        return !(object2 != object3 && !((String)object2).equals(object3) || (object3 = this.mTimeZone) != (object2 = ((FastDateFormat)object).mTimeZone) && !object3.equals(object2) || (object2 = this.mLocale) != (object3 = ((FastDateFormat)object).mLocale) && !((Locale)object2).equals(object3) || this.mTimeZoneForced != ((FastDateFormat)object).mTimeZoneForced || this.mLocaleForced != ((FastDateFormat)object).mLocaleForced);
    }

    public StringBuffer f(Calendar calendar, StringBuffer stringBuffer) {
        Calendar calendar2 = calendar;
        if (this.mTimeZoneForced) {
            calendar.getTime();
            calendar2 = (Calendar)calendar.clone();
            calendar2.setTimeZone(this.mTimeZone);
        }
        return this.b(calendar2, stringBuffer);
    }

    @Override
    public StringBuffer format(Object object, StringBuffer abstractStringBuilder, FieldPosition fieldPosition) {
        if (object instanceof Date) {
            return this.h((Date)object, (StringBuffer)abstractStringBuilder);
        }
        if (object instanceof Calendar) {
            return this.f((Calendar)object, (StringBuffer)abstractStringBuilder);
        }
        if (object instanceof Long) {
            return this.d((Long)object, (StringBuffer)abstractStringBuilder);
        }
        abstractStringBuilder = new StringBuilder();
        ((StringBuilder)abstractStringBuilder).append("Unknown class: ");
        object = object == null ? "<null>" : object.getClass().getName();
        ((StringBuilder)abstractStringBuilder).append((String)object);
        throw new IllegalArgumentException(((StringBuilder)abstractStringBuilder).toString());
    }

    public StringBuffer h(Date date, StringBuffer stringBuffer) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this.mTimeZone);
        gregorianCalendar.setTime(date);
        return this.b(gregorianCalendar, stringBuffer);
    }

    public int hashCode() {
        return this.mPattern.hashCode() + this.mTimeZone.hashCode() + this.mTimeZoneForced + this.mLocale.hashCode() + this.mLocaleForced;
    }

    protected void l() {
        d[] dArray = this.m();
        dArray = dArray.toArray(new d[dArray.size()]);
        this.q = dArray;
        int n8 = dArray.length;
        int n9 = 0;
        while (--n8 >= 0) {
            n9 += this.q[n8].a();
        }
        this.c0 = n9;
    }

    protected List m() {
        Object object = new DateFormatSymbols(this.mLocale);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        String[] stringArray = object.getEras();
        String[] stringArray2 = object.getMonths();
        String[] stringArray3 = object.getShortMonths();
        String[] stringArray4 = object.getWeekdays();
        Object object2 = object.getShortWeekdays();
        String[] stringArray5 = object.getAmPmStrings();
        int n8 = this.mPattern.length();
        for (int i8 = 0; i8 < n8; ++i8) {
            block28: {
                int n9;
                block26: {
                    block27: {
                        int[] nArray = new int[]{i8};
                        object = this.n(this.mPattern, nArray);
                        i8 = nArray[0];
                        n9 = object.length();
                        if (n9 == 0) break;
                        char c8 = object.charAt(0);
                        if (c8 == 'y') break block26;
                        if (c8 == 'z') break block27;
                        switch (c8) {
                            default: {
                                switch (c8) {
                                    default: {
                                        object2 = new StringBuilder();
                                        ((StringBuilder)object2).append("Illegal pattern component: ");
                                        ((StringBuilder)object2).append((String)object);
                                        throw new IllegalArgumentException(((StringBuilder)object2).toString());
                                    }
                                    case 'H': {
                                        object = this.o(11, n9);
                                    }
                                    case 'G': {
                                        object = new f(0, stringArray);
                                        break;
                                    }
                                    case 'F': {
                                        object = this.o(8, n9);
                                        break;
                                    }
                                    case 'E': {
                                        object = n9 < 4 ? object2 : stringArray4;
                                        object = new f(7, (String[])object);
                                        break;
                                    }
                                    case 'D': {
                                        object = this.o(6, n9);
                                        break;
                                    }
                                }
                                break block28;
                            }
                            case 'w': {
                                object = this.o(3, n9);
                                break block28;
                            }
                            case 's': {
                                object = this.o(13, n9);
                                break block28;
                            }
                            case 'm': {
                                object = this.o(12, n9);
                                break block28;
                            }
                            case 'k': {
                                object = new k(this.o(11, n9));
                                break block28;
                            }
                            case 'h': {
                                object = new j(this.o(10, n9));
                                break block28;
                            }
                            case 'd': {
                                object = this.o(5, n9);
                                break block28;
                            }
                            case 'a': {
                                object = new f(9, stringArray5);
                                break block28;
                            }
                            case 'Z': {
                                object = n9 == 1 ? i.c : i.b;
                                break block28;
                            }
                            case 'W': {
                                object = this.o(4, n9);
                                break block28;
                            }
                            case 'S': {
                                object = this.o(14, n9);
                                break block28;
                            }
                            case 'M': {
                                if (n9 >= 4) {
                                    object = new f(2, stringArray2);
                                }
                                if (n9 == 3) {
                                    object = new f(2, stringArray3);
                                    break;
                                }
                                object = n9 == 2 ? l.a : o.a;
                                break block28;
                            }
                            case 'K': {
                                object = this.o(10, n9);
                                break block28;
                            }
                            case '\'': {
                                object = object.substring(1);
                                if (object.length() == 1) {
                                    object = new a(object.charAt(0));
                                    break;
                                }
                                object = new e((String)object);
                                break;
                            }
                        }
                        break block28;
                    }
                    object = n9 >= 4 ? new h(this.mTimeZone, this.mTimeZoneForced, this.mLocale, 1) : new h(this.mTimeZone, this.mTimeZoneForced, this.mLocale, 0);
                    break block28;
                }
                object = n9 >= 4 ? this.o(1, n9) : n.a;
            }
            arrayList.add(object);
        }
        return arrayList;
    }

    protected String n(String string, int[] nArray) {
        int n8;
        StringBuffer stringBuffer = new StringBuffer();
        int n9 = nArray[0];
        int n10 = string.length();
        char c8 = string.charAt(n9);
        if (c8 >= 'A' && c8 <= 'Z' || c8 >= 'a' && c8 <= 'z') {
            stringBuffer.append(c8);
            while (true) {
                int n11 = n9 + 1;
                n8 = n9;
                if (n11 < n10) {
                    n8 = n9;
                    if (string.charAt(n11) == c8) {
                        stringBuffer.append(c8);
                        n9 = n11;
                        continue;
                    }
                }
                break;
            }
        } else {
            stringBuffer.append('\'');
            boolean bl = false;
            while (true) {
                n8 = ++n9;
                if (n9 >= n10) break;
                c8 = string.charAt(n9);
                if (c8 == '\'') {
                    n8 = n9 + 1;
                    if (n8 < n10 && string.charAt(n8) == '\'') {
                        stringBuffer.append(c8);
                        n9 = n8;
                        continue;
                    }
                    bl ^= true;
                    continue;
                }
                if (!bl && (c8 >= 'A' && c8 <= 'Z' || c8 >= 'a' && c8 <= 'z')) {
                    n8 = n9 - 1;
                    break;
                }
                stringBuffer.append(c8);
            }
        }
        nArray[0] = n8;
        return stringBuffer.toString();
    }

    protected b o(int n8, int n9) {
        if (n9 != 1) {
            if (n9 != 2) {
                return new c(n8, n9);
            }
            return new m(n8);
        }
        return new p(n8);
    }

    @Override
    public Object parseObject(String string, ParsePosition parsePosition) {
        parsePosition.setIndex(0);
        parsePosition.setErrorIndex(0);
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FastDateFormat[");
        stringBuilder.append(this.mPattern);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    private static class a
    implements d {
        private final char a;

        a(char c8) {
            this.a = c8;
        }

        @Override
        public int a() {
            return 1;
        }

        @Override
        public void b(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.a);
        }
    }

    private static interface b
    extends d {
        public void c(StringBuffer var1, int var2);
    }

    private static class c
    implements b {
        private final int a;
        private final int b;

        c(int n8, int n9) {
            if (n9 >= 3) {
                this.a = n8;
                this.b = n9;
                return;
            }
            throw new IllegalArgumentException();
        }

        @Override
        public int a() {
            return 4;
        }

        @Override
        public void b(StringBuffer stringBuffer, Calendar calendar) {
            this.c(stringBuffer, calendar.get(this.a));
        }

        @Override
        public final void c(StringBuffer abstractStringBuilder, int n8) {
            block8: {
                int n9;
                block7: {
                    block6: {
                        if (n8 < 100) {
                            int n10 = this.b;
                            while (--n10 >= 2) {
                                ((StringBuffer)abstractStringBuilder).append('0');
                            }
                            ((StringBuffer)abstractStringBuilder).append((char)(n8 / 10 + 48));
                            ((StringBuffer)abstractStringBuilder).append((char)(n8 % 10 + 48));
                            return;
                        }
                        if (n8 >= 1000) break block6;
                        n9 = 3;
                        break block7;
                    }
                    if (n8 <= -1) break block8;
                    n9 = Integer.toString(n8).length();
                }
                int n11 = this.b;
                while (--n11 >= n9) {
                    ((StringBuffer)abstractStringBuilder).append('0');
                }
                ((StringBuffer)abstractStringBuilder).append(Integer.toString(n8));
                return;
            }
            abstractStringBuilder = new StringBuilder();
            ((StringBuilder)abstractStringBuilder).append("Negative values should not be possible");
            ((StringBuilder)abstractStringBuilder).append(n8);
            throw new IllegalArgumentException(((StringBuilder)abstractStringBuilder).toString());
        }
    }

    private static interface d {
        public int a();

        public void b(StringBuffer var1, Calendar var2);
    }

    private static class e
    implements d {
        private final String a;

        e(String string) {
            this.a = string;
        }

        @Override
        public int a() {
            return this.a.length();
        }

        @Override
        public void b(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.a);
        }
    }

    private static class f
    implements d {
        private final int a;
        private final String[] b;

        f(int n8, String[] stringArray) {
            this.a = n8;
            this.b = stringArray;
        }

        @Override
        public int a() {
            int n8;
            int n9 = this.b.length;
            int n10 = 0;
            while ((n8 = n9 - 1) >= 0) {
                int n11 = this.b[n8].length();
                n9 = n8;
                if (n11 <= n10) continue;
                n10 = n11;
                n9 = n8;
            }
            return n10;
        }

        @Override
        public void b(StringBuffer stringBuffer, Calendar calendar) {
            stringBuffer.append(this.b[calendar.get(this.a)]);
        }
    }

    private static class g {
        private final TimeZone a;
        private final int b;
        private final Locale c;

        g(TimeZone timeZone, boolean bl, int n8, Locale locale) {
            this.a = timeZone;
            int n9 = n8;
            if (bl) {
                n9 = n8 | Integer.MIN_VALUE;
            }
            this.b = n9;
            this.c = locale;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object instanceof g) {
                object = (g)object;
                if (this.a.equals(((g)object).a) && this.b == ((g)object).b && this.c.equals(((g)object).c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.b * 31 + this.c.hashCode();
        }
    }

    private static class h
    implements d {
        private final TimeZone a;
        private final boolean b;
        private final Locale c;
        private final int d;
        private final String e;
        private final String f;

        h(TimeZone timeZone, boolean bl, Locale locale, int n8) {
            this.a = timeZone;
            this.b = bl;
            this.c = locale;
            this.d = n8;
            if (bl) {
                this.e = FastDateFormat.k(timeZone, false, n8, locale);
                this.f = FastDateFormat.k(timeZone, true, n8, locale);
                return;
            }
            this.e = null;
            this.f = null;
        }

        @Override
        public int a() {
            if (this.b) {
                return Math.max(this.e.length(), this.f.length());
            }
            if (this.d == 0) {
                return 4;
            }
            return 40;
        }

        @Override
        public void b(StringBuffer stringBuffer, Calendar calendar) {
            if (this.b) {
                if (this.a.useDaylightTime() && calendar.get(16) != 0) {
                    stringBuffer.append(this.f);
                    return;
                }
                stringBuffer.append(this.e);
                return;
            }
            TimeZone timeZone = calendar.getTimeZone();
            if (timeZone.useDaylightTime() && calendar.get(16) != 0) {
                stringBuffer.append(FastDateFormat.k(timeZone, true, this.d, this.c));
                return;
            }
            stringBuffer.append(FastDateFormat.k(timeZone, false, this.d, this.c));
        }
    }

    private static class i
    implements d {
        static final i b = new i(true);
        static final i c = new i(false);
        final boolean a;

        i(boolean bl) {
            this.a = bl;
        }

        @Override
        public int a() {
            return 5;
        }

        @Override
        public void b(StringBuffer stringBuffer, Calendar calendar) {
            int n8 = calendar.get(15) + calendar.get(16);
            if (n8 < 0) {
                stringBuffer.append('-');
                n8 = -n8;
            } else {
                stringBuffer.append('+');
            }
            int n9 = n8 / 3600000;
            stringBuffer.append((char)(n9 / 10 + 48));
            stringBuffer.append((char)(n9 % 10 + 48));
            if (this.a) {
                stringBuffer.append(':');
            }
            n8 = n8 / 60000 - n9 * 60;
            stringBuffer.append((char)(n8 / 10 + 48));
            stringBuffer.append((char)(n8 % 10 + 48));
        }
    }

    private static class j
    implements b {
        private final b a;

        j(b b8) {
            this.a = b8;
        }

        @Override
        public int a() {
            return this.a.a();
        }

        @Override
        public void b(StringBuffer stringBuffer, Calendar calendar) {
            int n8;
            int n9 = n8 = calendar.get(10);
            if (n8 == 0) {
                n9 = calendar.getLeastMaximum(10) + 1;
            }
            this.a.c(stringBuffer, n9);
        }

        @Override
        public void c(StringBuffer stringBuffer, int n8) {
            this.a.c(stringBuffer, n8);
        }
    }

    private static class k
    implements b {
        private final b a;

        k(b b8) {
            this.a = b8;
        }

        @Override
        public int a() {
            return this.a.a();
        }

        @Override
        public void b(StringBuffer stringBuffer, Calendar calendar) {
            int n8;
            int n9 = n8 = calendar.get(11);
            if (n8 == 0) {
                n9 = calendar.getMaximum(11) + 1;
            }
            this.a.c(stringBuffer, n9);
        }

        @Override
        public void c(StringBuffer stringBuffer, int n8) {
            this.a.c(stringBuffer, n8);
        }
    }

    private static class l
    implements b {
        static final l a = new l();

        l() {
        }

        @Override
        public int a() {
            return 2;
        }

        @Override
        public void b(StringBuffer stringBuffer, Calendar calendar) {
            this.c(stringBuffer, calendar.get(2) + 1);
        }

        @Override
        public final void c(StringBuffer stringBuffer, int n8) {
            stringBuffer.append((char)(n8 / 10 + 48));
            stringBuffer.append((char)(n8 % 10 + 48));
        }
    }

    private static class m
    implements b {
        private final int a;

        m(int n8) {
            this.a = n8;
        }

        @Override
        public int a() {
            return 2;
        }

        @Override
        public void b(StringBuffer stringBuffer, Calendar calendar) {
            this.c(stringBuffer, calendar.get(this.a));
        }

        @Override
        public final void c(StringBuffer stringBuffer, int n8) {
            if (n8 < 100) {
                stringBuffer.append((char)(n8 / 10 + 48));
                stringBuffer.append((char)(n8 % 10 + 48));
                return;
            }
            stringBuffer.append(Integer.toString(n8));
        }
    }

    private static class n
    implements b {
        static final n a = new n();

        n() {
        }

        @Override
        public int a() {
            return 2;
        }

        @Override
        public void b(StringBuffer stringBuffer, Calendar calendar) {
            this.c(stringBuffer, calendar.get(1));
        }

        @Override
        public final void c(StringBuffer stringBuffer, int n8) {
            stringBuffer.append((char)(n8 / 10 + 48));
            stringBuffer.append((char)(n8 % 10 + 48));
        }
    }

    private static class o
    implements b {
        static final o a = new o();

        o() {
        }

        @Override
        public int a() {
            return 2;
        }

        @Override
        public void b(StringBuffer stringBuffer, Calendar calendar) {
            this.c(stringBuffer, calendar.get(2) + 1);
        }

        @Override
        public final void c(StringBuffer stringBuffer, int n8) {
            if (n8 < 10) {
                stringBuffer.append((char)(n8 + 48));
                return;
            }
            stringBuffer.append((char)(n8 / 10 + 48));
            stringBuffer.append((char)(n8 % 10 + 48));
        }
    }

    private static class p
    implements b {
        private final int a;

        p(int n8) {
            this.a = n8;
        }

        @Override
        public int a() {
            return 4;
        }

        @Override
        public void b(StringBuffer stringBuffer, Calendar calendar) {
            this.c(stringBuffer, calendar.get(this.a));
        }

        @Override
        public final void c(StringBuffer stringBuffer, int n8) {
            if (n8 < 10) {
                stringBuffer.append((char)(n8 + 48));
                return;
            }
            if (n8 < 100) {
                stringBuffer.append((char)(n8 / 10 + 48));
                stringBuffer.append((char)(n8 % 10 + 48));
                return;
            }
            stringBuffer.append(Integer.toString(n8));
        }
    }
}

