/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Ab.c;
import ax.Gb.b;
import ax.Gb.g;
import ax.Gb.l;
import ax.Gb.y;
import ax.Hb.a;
import ax.Ob.h;
import ax.sb.m;
import ax.sb.q;
import ax.tb.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Headers
implements Iterable<m<? extends String, ? extends String>>,
a {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    private Headers(String[] stringArray) {
        this.namesAndValues = stringArray;
    }

    public /* synthetic */ Headers(String[] stringArray, g g8) {
        this(stringArray);
    }

    public static final Headers of(Map<String, String> map) {
        return Companion.of(map);
    }

    public static final Headers of(String ... stringArray) {
        return Companion.of(stringArray);
    }

    public final int -deprecated_size() {
        return this.size();
    }

    public final long byteCount() {
        String[] stringArray = this.namesAndValues;
        long l8 = stringArray.length * 2;
        int n8 = stringArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            l8 += (long)this.namesAndValues[i8].length();
        }
        return l8;
    }

    public boolean equals(Object object) {
        return object instanceof Headers && Arrays.equals(this.namesAndValues, ((Headers)object).namesAndValues);
    }

    public final String get(String string) {
        l.f(string, "name");
        return Headers.Companion.get(this.namesAndValues, string);
    }

    public final Date getDate(String string) {
        l.f(string, "name");
        string = this.get(string);
        if (string != null) {
            return DatesKt.toHttpDateOrNull(string);
        }
        return null;
    }

    @IgnoreJRERequirement
    public final j.Instant getInstant(String object) {
        l.f(object, "name");
        object = this.getDate((String)object);
        if (object != null) {
            return j.DateRetargetClass.toInstant((Date)object);
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override
    public Iterator<m<String, String>> iterator() {
        int n8 = this.size();
        m[] mArray = new m[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            mArray[i8] = q.a(this.name(i8), this.value(i8));
        }
        return b.a(mArray);
    }

    public final String name(int n8) {
        return this.namesAndValues[n8 * 2];
    }

    public final Set<String> names() {
        Set<String> set = new TreeSet<String>(h.w(y.a));
        int n8 = this.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            set.add(this.name(i8));
        }
        set = java.util.DesugarCollections.unmodifiableSet(set);
        l.e(set, "unmodifiableSet(result)");
        return set;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        o.w((Collection)builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        TreeMap<String, List<String>> treeMap = new TreeMap<String, List<String>>(h.w(y.a));
        int n8 = this.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object = this.name(i8);
            ArrayList<String> arrayList = Locale.US;
            l.e(arrayList, "US");
            String string = ((String)object).toLowerCase((Locale)((Object)arrayList));
            l.e(string, "this as java.lang.String).toLowerCase(locale)");
            object = treeMap.get(string);
            arrayList = object;
            if (object == null) {
                arrayList = new ArrayList<String>(2);
                treeMap.put(string, arrayList);
            }
            arrayList.add(this.value(i8));
        }
        return treeMap;
    }

    public String toString() {
        String string;
        StringBuilder stringBuilder = new StringBuilder();
        int n8 = this.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            String string2 = this.name(i8);
            string = this.value(i8);
            stringBuilder.append(string2);
            stringBuilder.append(": ");
            if (Util.isSensitiveHeader(string2)) {
                string = "\u2588\u2588";
            }
            stringBuilder.append(string);
            stringBuilder.append("\n");
        }
        string = stringBuilder.toString();
        l.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final String value(int n8) {
        return this.namesAndValues[n8 * 2 + 1];
    }

    public final List<String> values(String object) {
        l.f(object, "name");
        int n8 = this.size();
        ArrayList<String> arrayList = null;
        for (int i8 = 0; i8 < n8; ++i8) {
            ArrayList<String> arrayList2 = arrayList;
            if (h.v((String)object, this.name(i8), true)) {
                arrayList2 = arrayList;
                if (arrayList == null) {
                    arrayList2 = new ArrayList<String>(2);
                }
                arrayList2.add(this.value(i8));
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            object = java.util.DesugarCollections.unmodifiableList(arrayList);
            l.e(object, "{\n      Collections.unmodifiableList(result)\n    }");
            return object;
        }
        return o.j();
    }

    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList<String>(20);

        public final Builder add(String string) {
            l.f(string, "line");
            int n8 = h.U(string, ':', 0, false, 6, null);
            if (n8 != -1) {
                String string2 = string.substring(0, n8);
                l.e(string2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                string2 = ((Object)h.A0(string2)).toString();
                string = string.substring(n8 + 1);
                l.e(string, "this as java.lang.String).substring(startIndex)");
                this.add(string2, string);
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected header: ");
            stringBuilder.append(string);
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }

        @IgnoreJRERequirement
        public final Builder add(String string, j.Instant instant) {
            l.f(string, "name");
            l.f(instant, "value");
            this.add(string, new Date(instant.toEpochMilli()));
            return this;
        }

        public final Builder add(String string, String string2) {
            l.f(string, "name");
            l.f(string2, "value");
            Companion companion = Companion;
            companion.checkName(string);
            companion.checkValue(string2, string);
            this.addLenient$okhttp(string, string2);
            return this;
        }

        public final Builder add(String string, Date date) {
            l.f(string, "name");
            l.f(date, "value");
            this.add(string, DatesKt.toHttpDateString(date));
            return this;
        }

        public final Builder addAll(Headers headers) {
            l.f(headers, "headers");
            int n8 = headers.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                this.addLenient$okhttp(headers.name(i8), headers.value(i8));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String string) {
            l.f(string, "line");
            int n8 = h.U(string, ':', 1, false, 4, null);
            if (n8 != -1) {
                String string2 = string.substring(0, n8);
                l.e(string2, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                string = string.substring(n8 + 1);
                l.e(string, "this as java.lang.String).substring(startIndex)");
                this.addLenient$okhttp(string2, string);
                return this;
            }
            if (string.charAt(0) == ':') {
                string = string.substring(1);
                l.e(string, "this as java.lang.String).substring(startIndex)");
                this.addLenient$okhttp("", string);
                return this;
            }
            this.addLenient$okhttp("", string);
            return this;
        }

        public final Builder addLenient$okhttp(String string, String string2) {
            l.f(string, "name");
            l.f(string2, "value");
            this.namesAndValues.add(string);
            this.namesAndValues.add(((Object)h.A0(string2)).toString());
            return this;
        }

        public final Builder addUnsafeNonAscii(String string, String string2) {
            l.f(string, "name");
            l.f(string2, "value");
            Companion.checkName(string);
            this.addLenient$okhttp(string, string2);
            return this;
        }

        public final Headers build() {
            return new Headers(((Collection)this.namesAndValues).toArray(new String[0]), null);
        }

        public final String get(String string) {
            l.f(string, "name");
            int n8 = this.namesAndValues.size() - 2;
            int n9 = c.b(n8, 0, -2);
            if (n9 <= n8) {
                while (true) {
                    if (h.v(string, this.namesAndValues.get(n8), true)) {
                        return this.namesAndValues.get(n8 + 1);
                    }
                    if (n8 == n9) break;
                    n8 -= 2;
                }
            }
            return null;
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String string) {
            l.f(string, "name");
            int n8 = 0;
            while (n8 < this.namesAndValues.size()) {
                int n9 = n8;
                if (h.v(string, this.namesAndValues.get(n8), true)) {
                    this.namesAndValues.remove(n8);
                    this.namesAndValues.remove(n8);
                    n9 = n8 - 2;
                }
                n8 = n9 + 2;
            }
            return this;
        }

        @IgnoreJRERequirement
        public final Builder set(String string, j.Instant instant) {
            l.f(string, "name");
            l.f(instant, "value");
            return this.set(string, new Date(instant.toEpochMilli()));
        }

        public final Builder set(String string, String string2) {
            l.f(string, "name");
            l.f(string2, "value");
            Companion companion = Companion;
            companion.checkName(string);
            companion.checkValue(string2, string);
            this.removeAll(string);
            this.addLenient$okhttp(string, string2);
            return this;
        }

        public final Builder set(String string, Date date) {
            l.f(string, "name");
            l.f(date, "value");
            this.set(string, DatesKt.toHttpDateString(date));
            return this;
        }
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        private final void checkName(String string) {
            if (string.length() > 0) {
                int n8 = string.length();
                for (int i8 = 0; i8 < n8; ++i8) {
                    char c8 = string.charAt(i8);
                    if ('!' <= c8 && c8 < '\u007f') {
                        continue;
                    }
                    throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", c8, i8, string).toString());
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }

        private final void checkValue(String string, String charSequence) {
            int n8 = string.length();
            for (int i8 = 0; i8 < n8; ++i8) {
                char c8 = string.charAt(i8);
                if (c8 == '\t' || ' ' <= c8 && c8 < '\u007f') continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(Util.format("Unexpected char %#04x at %d in %s value", c8, i8, charSequence));
                if (Util.isSensitiveHeader((String)charSequence)) {
                    string = "";
                } else {
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append(": ");
                    ((StringBuilder)charSequence).append(string);
                    string = ((StringBuilder)charSequence).toString();
                }
                stringBuilder.append(string);
                throw new IllegalArgumentException(stringBuilder.toString().toString());
            }
        }

        private final String get(String[] stringArray, String string) {
            int n8 = stringArray.length - 2;
            int n9 = c.b(n8, 0, -2);
            if (n9 <= n8) {
                while (true) {
                    if (h.v(string, stringArray[n8], true)) {
                        return stringArray[n8 + 1];
                    }
                    if (n8 == n9) break;
                    n8 -= 2;
                }
            }
            return null;
        }

        public final Headers -deprecated_of(Map<String, String> map) {
            l.f(map, "headers");
            return this.of(map);
        }

        public final Headers -deprecated_of(String ... stringArray) {
            l.f(stringArray, "namesAndValues");
            return this.of(Arrays.copyOf(stringArray, stringArray.length));
        }

        public final Headers of(Map<String, String> object) {
            l.f(object, "<this>");
            String[] stringArray = new String[object.size() * 2];
            object = object.entrySet().iterator();
            int n8 = 0;
            while (object.hasNext()) {
                Object object2 = (Map.Entry)object.next();
                String string = (String)object2.getKey();
                object2 = (String)object2.getValue();
                string = ((Object)h.A0(string)).toString();
                object2 = ((Object)h.A0((CharSequence)object2)).toString();
                this.checkName(string);
                this.checkValue((String)object2, string);
                stringArray[n8] = string;
                stringArray[n8 + 1] = object2;
                n8 += 2;
            }
            return new Headers(stringArray, null);
        }

        public final Headers of(String ... stringArray) {
            l.f(stringArray, "namesAndValues");
            if (stringArray.length % 2 == 0) {
                String string;
                int n8;
                stringArray = (String[])stringArray.clone();
                int n9 = stringArray.length;
                int n10 = 0;
                for (n8 = 0; n8 < n9; ++n8) {
                    string = stringArray[n8];
                    if (string != null) {
                        stringArray[n8] = ((Object)h.A0(string)).toString();
                        continue;
                    }
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                n9 = c.b(0, stringArray.length - 1, 2);
                if (n9 >= 0) {
                    n8 = n10;
                    while (true) {
                        String string2 = stringArray[n8];
                        string = stringArray[n8 + 1];
                        this.checkName(string2);
                        this.checkValue(string, string2);
                        if (n8 == n9) break;
                        n8 += 2;
                    }
                }
                return new Headers(stringArray, null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
    }
}

