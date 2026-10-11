/*
 * Decompiled with CFR 0.152.
 */
package ax.Y;

import ax.Y.h;
import ax.Y.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

final class i
implements j {
    private static final Locale[] c = new Locale[0];
    private static final Locale d = new Locale("en", "XA");
    private static final Locale e = new Locale("ar", "XB");
    private static final Locale f = h.b("en-Latn");
    private final Locale[] a;
    private final String b;

    i(Locale ... object) {
        if (((Locale[])object).length == 0) {
            this.a = c;
            this.b = "";
            return;
        }
        ArrayList<Locale> arrayList = new ArrayList<Locale>();
        HashSet<Locale> hashSet = new HashSet<Locale>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i8 = 0; i8 < ((Locale[])object).length; ++i8) {
            Locale locale = object[i8];
            if (locale != null) {
                if (hashSet.contains(locale)) continue;
                locale = (Locale)locale.clone();
                arrayList.add(locale);
                i.c(stringBuilder, locale);
                if (i8 < ((Object)object).length - 1) {
                    stringBuilder.append(',');
                }
                hashSet.add(locale);
                continue;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("list[");
            ((StringBuilder)object).append(i8);
            ((StringBuilder)object).append("] is null");
            throw new NullPointerException(((StringBuilder)object).toString());
        }
        this.a = arrayList.toArray(new Locale[0]);
        this.b = stringBuilder.toString();
    }

    static void c(StringBuilder stringBuilder, Locale locale) {
        stringBuilder.append(locale.getLanguage());
        String string = locale.getCountry();
        if (string != null && !string.isEmpty()) {
            stringBuilder.append('-');
            stringBuilder.append(locale.getCountry());
        }
    }

    @Override
    public String a() {
        return this.b;
    }

    @Override
    public Object b() {
        return null;
    }

    public boolean equals(Object localeArray) {
        Locale[] localeArray2;
        if (localeArray == this) {
            return true;
        }
        if (!(localeArray instanceof i)) {
            return false;
        }
        localeArray = ((i)localeArray).a;
        if (this.a.length != localeArray.length) {
            return false;
        }
        for (int i8 = 0; i8 < (localeArray2 = this.a).length; ++i8) {
            if (localeArray2[i8].equals(localeArray[i8])) continue;
            return false;
        }
        return true;
    }

    @Override
    public Locale get(int n8) {
        Locale[] localeArray;
        if (n8 >= 0 && n8 < (localeArray = this.a).length) {
            return localeArray[n8];
        }
        return null;
    }

    public int hashCode() {
        Locale[] localeArray = this.a;
        int n8 = localeArray.length;
        int n9 = 1;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 = n9 * 31 + localeArray[i8].hashCode();
        }
        return n9;
    }

    @Override
    public boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override
    public int size() {
        return this.a.length;
    }

    public String toString() {
        Locale[] localeArray;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i8 = 0; i8 < (localeArray = this.a).length; ++i8) {
            stringBuilder.append(localeArray[i8]);
            if (i8 >= this.a.length - 1) continue;
            stringBuilder.append(',');
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

