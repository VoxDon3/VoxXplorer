/*
 * Decompiled with CFR 0.152.
 */
package ax.p4;

import ax.C4.b;
import ax.T4.i;
import ax.T4.k;
import ax.p4.a;
import ax.p4.b;
import ax.p4.d;
import ax.p4.e;
import ax.p4.j;
import ax.p4.m;
import ax.p4.r;
import ax.p4.t;
import ax.p4.u;
import ax.p4.w;
import ax.p4.x;
import ax.p4.y;
import ax.s4.a;
import ax.w4.f;
import ax.z4.a;
import ax.z4.b;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public final class n {
    private static final Random a = new Random();

    public static j A(a.b b8) throws t, e {
        return n.B(b8, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static j B(a.b object, String object2) throws t, e {
        String string = n.q((a.b)object);
        int n8 = ((a.b)object).d();
        if (n8 == 400) {
            return new ax.p4.c(string, n.s((a.b)object, string));
        }
        if (n8 != 401) {
            Object object3 = null;
            object2 = null;
            if (n8 != 403) {
                if (n8 != 422) {
                    if (n8 != 429) {
                        if (n8 == 500) {
                            return new y(string, null);
                        }
                        if (n8 != 503) {
                            object2 = new StringBuilder();
                            ((StringBuilder)object2).append("unexpected HTTP status code: ");
                            ((StringBuilder)object2).append(((a.b)object).d());
                            ((StringBuilder)object2).append(": ");
                            ((StringBuilder)object2).append((String)null);
                            return new d(string, ((StringBuilder)object2).toString(), ((a.b)object).d());
                        }
                        if ((object = n.p(object, "Retry-After")) == null) return new x(string, null);
                        try {
                            if (((String)object).trim().isEmpty()) return new x(string, null);
                            n8 = Integer.parseInt((String)object);
                            return new x(string, null, n8, TimeUnit.SECONDS);
                        }
                        catch (NumberFormatException numberFormatException) {
                            return new e(string, "Invalid value for HTTP header: \"Retry-After\"");
                        }
                    }
                    try {
                        return new w(string, null, Integer.parseInt(n.o((a.b)object, "Retry-After")), TimeUnit.SECONDS);
                    }
                    catch (NumberFormatException numberFormatException) {
                        return new e(string, "Invalid value for HTTP header: \"Retry-After\"");
                    }
                }
                try {
                    object3 = new b.a(b.b.b);
                    object3 = (ax.p4.b)((ax.v4.c)object3).b(((a.b)object).b());
                    object = object2;
                    if (((ax.p4.b)object3).b() == null) return new u(string, (String)object, (ax.C4.b)((ax.p4.b)object3).a());
                    object = ((ax.p4.b)object3).b().toString();
                    return new u(string, (String)object, (ax.C4.b)((ax.p4.b)object3).a());
                }
                catch (k k8) {
                }
                catch (IOException iOException) {
                    throw new t(iOException);
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Bad JSON: ");
                ((StringBuilder)object).append(k8.getMessage());
                throw new e(string, ((StringBuilder)object).toString(), k8);
            }
            try {
                object2 = new b.a(a.b.b);
                object2 = (ax.p4.b)((ax.v4.c)object2).b(((a.b)object).b());
                object = object3;
                if (((ax.p4.b)object2).b() == null) return new a(string, (String)object, (ax.z4.a)((ax.p4.b)object2).a());
                object = ((ax.p4.b)object2).b().toString();
                return new a(string, (String)object, (ax.z4.a)((ax.p4.b)object2).a());
            }
            catch (k k9) {
            }
            catch (IOException iOException) {
                throw new t(iOException);
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Bad JSON: ");
            ((StringBuilder)object2).append(k9.getMessage());
            throw new e(string, ((StringBuilder)object2).toString(), k9);
        }
        if (((String)(object = n.s((a.b)object, string))).isEmpty()) {
            return new r(string, (String)object, ax.z4.b.c);
        }
        try {
            object2 = new b.a(b.b.b);
            return new r(string, (String)object, (ax.z4.b)((ax.p4.b)((ax.v4.c)object2).c((String)object)).a());
        }
        catch (i i8) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("Bad JSON: ");
            ((StringBuilder)object2).append(i8.getMessage());
            throw new e(string, ((StringBuilder)object2).toString(), i8);
        }
    }

    public static List<a.a> a(List<a.a> object, String string) {
        if (string != null) {
            List<a.a> list = object;
            if (object == null) {
                list = new ArrayList<a.a>();
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Bearer ");
            ((StringBuilder)object).append(string);
            list.add(new a.a("Authorization", ((StringBuilder)object).toString()));
            return list;
        }
        throw new NullPointerException("accessToken");
    }

    public static List<a.a> b(List<a.a> object, String string, String string2) {
        if (string != null) {
            if (string2 != null) {
                List<a.a> list = object;
                if (object == null) {
                    list = new ArrayList<a.a>();
                }
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(":");
                ((StringBuilder)object).append(string2);
                string = f.a(f.g(((StringBuilder)object).toString()));
                object = new StringBuilder();
                ((StringBuilder)object).append("Basic ");
                ((StringBuilder)object).append(string);
                list.add(new a.a("Authorization", ((StringBuilder)object).toString()));
                return list;
            }
            throw new NullPointerException("password");
        }
        throw new NullPointerException("username");
    }

    public static List<a.a> c(List<a.a> list, ax.C4.a a8) {
        if (a8 == null) {
            return list;
        }
        List<a.a> list2 = list;
        if (list == null) {
            list2 = new ArrayList<a.a>();
        }
        list2.add(new a.a("Dropbox-API-Path-Root", a8.toString()));
        return list2;
    }

    public static List<a.a> d(List<a.a> list, m m8, String string) {
        List<a.a> list2 = list;
        if (list == null) {
            list2 = new ArrayList<a.a>();
        }
        list2.add(n.h(m8, string));
        return list2;
    }

    public static List<a.a> e(List<a.a> list, m m8) {
        if (m8.d() == null) {
            return list;
        }
        List<a.a> list2 = list;
        if (list == null) {
            list2 = new ArrayList<a.a>();
        }
        list2.add(new a.a("Dropbox-API-User-Locale", m8.d()));
        return list2;
    }

    public static String f(String string, String string2) {
        try {
            CharSequence charSequence = new StringBuilder();
            charSequence.append("/");
            charSequence.append(string2);
            URI uRI = new URI("https", string, charSequence.toString(), null);
            charSequence = uRI.toASCIIString();
            return charSequence;
        }
        catch (URISyntaxException uRISyntaxException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("URI creation failed, host=");
            stringBuilder.append(f.f(string));
            stringBuilder.append(", path=");
            stringBuilder.append(f.f(string2));
            throw ax.w4.d.a(stringBuilder.toString(), uRISyntaxException);
        }
    }

    public static String g(String string, String string2, String string3, String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n.f(string2, string3));
        stringBuilder.append("?");
        stringBuilder.append(n.l(string, stringArray));
        return stringBuilder.toString();
    }

    public static a.a h(m m8, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m8.a());
        stringBuilder.append(" ");
        stringBuilder.append(string);
        stringBuilder.append("/");
        stringBuilder.append("7.0.0");
        return new a.a("User-Agent", stringBuilder.toString());
    }

    private static List<a.a> i(List<a.a> list) {
        if (list == null) {
            return new ArrayList<a.a>();
        }
        return new ArrayList<a.a>(list);
    }

    public static <T> T j(m m8, String string, String string2, String string3, String[] stringArray, List<a.a> list, c<T> c8) throws j {
        return n.w(m8.c(), new b<T, j>(m8, string, string2, string3, stringArray, list, c8){
            final m a;
            final String b;
            final String c;
            final String d;
            final String[] e;
            final List f;
            final c g;
            {
                this.a = m8;
                this.b = string;
                this.c = string2;
                this.d = string3;
                this.e = stringArray;
                this.f = list;
                this.g = c8;
            }

            @Override
            public T a() throws j {
                return n.m(n.x(this.a, this.b, this.c, this.d, this.e, this.f), this.g);
            }
        });
    }

    public static String k(String string) {
        try {
            string = j.URLEncoder.encode((String)string, (String)"UTF-8");
            return string;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw ax.w4.d.a("UTF-8 should always be supported", unsupportedEncodingException);
        }
    }

    private static String l(String charSequence, String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        if (charSequence != null) {
            stringBuilder.append("locale=");
            stringBuilder.append(n.k((String)charSequence));
            charSequence = "&";
        } else {
            charSequence = "";
        }
        if (stringArray != null) {
            if (stringArray.length % 2 == 0) {
                CharSequence charSequence2 = charSequence;
                for (int i8 = 0; i8 < stringArray.length; i8 += 2) {
                    String string = stringArray[i8];
                    String string2 = stringArray[i8 + 1];
                    if (string != null) {
                        charSequence = charSequence2;
                        if (string2 != null) {
                            stringBuilder.append((String)charSequence2);
                            stringBuilder.append(n.k(string));
                            stringBuilder.append("=");
                            stringBuilder.append(n.k(string2));
                            charSequence = "&";
                        }
                        charSequence2 = charSequence;
                        continue;
                    }
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("params[");
                    ((StringBuilder)charSequence).append(i8);
                    ((StringBuilder)charSequence).append("] is null");
                    throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
                }
            } else {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("'params.length' is ");
                ((StringBuilder)charSequence).append(stringArray.length);
                ((StringBuilder)charSequence).append("; expecting a multiple of two");
                throw new IllegalArgumentException(((StringBuilder)charSequence).toString());
            }
        }
        return stringBuilder.toString();
    }

    public static <T> T m(a.b b8, c<T> c8) throws j {
        try {
            c8 = c8.a(b8);
            return (T)c8;
        }
        finally {
            if (b8 != null) {
                ax.w4.c.a(b8.b());
            }
        }
    }

    public static String n(a.b b8) {
        return n.p(b8, "Content-Type");
    }

    public static String o(a.b object, String string) throws e {
        List<String> list = ((a.b)object).c().get(string);
        if (list != null && !list.isEmpty()) {
            return (String)list.get(0);
        }
        list = n.q((a.b)object);
        object = new StringBuilder();
        ((StringBuilder)object).append("missing HTTP header \"");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("\"");
        throw new e((String)((Object)list), ((StringBuilder)object).toString());
    }

    public static String p(a.b object, String string) {
        if ((object = ((a.b)object).c().get(string)) != null && !object.isEmpty()) {
            return (String)object.get(0);
        }
        return null;
    }

    public static String q(a.b b8) {
        return n.p(b8, "X-Dropbox-Request-Id");
    }

    public static byte[] r(a.b object) throws t {
        if (((a.b)object).b() == null) {
            return new byte[0];
        }
        try {
            object = ax.w4.c.g(((a.b)object).b(), 4096);
            return object;
        }
        catch (IOException iOException) {
            throw new t(iOException);
        }
    }

    private static String s(a.b b8, String string) throws t, e {
        byte[] byArray = n.r(b8);
        return n.t(string, b8.d(), byArray);
    }

    public static String t(String string, int n8, byte[] object) throws e {
        try {
            object = f.i(object);
            return object;
        }
        catch (CharacterCodingException characterCodingException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Got non-UTF8 response body: ");
            stringBuilder.append(n8);
            stringBuilder.append(": ");
            stringBuilder.append(characterCodingException.getMessage());
            throw new e(string, stringBuilder.toString());
        }
    }

    public static <T> T u(ax.t4.b<T> b8, a.b object) throws e, t {
        try {
            b8 = b8.h(((a.b)object).b());
        }
        catch (ax.t4.a a8) {
        }
        catch (IOException iOException) {
            throw new t(iOException);
        }
        return (T)b8;
        object = n.q((a.b)object);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("error in response JSON: ");
        stringBuilder.append(a8.getMessage());
        throw new e((String)object, stringBuilder.toString(), a8);
    }

    public static List<a.a> v(List<a.a> list) {
        if (list == null) {
            return new ArrayList<a.a>();
        }
        ArrayList<a.a> arrayList = new ArrayList<a.a>();
        for (a.a a8 : list) {
            if (!"Authorization".equals(a8.a())) continue;
            arrayList.add(a8);
        }
        list.removeAll(arrayList);
        return list;
    }

    public static <T, E extends Throwable> T w(int n8, b<T, E> b8) throws j, E {
        T t8;
        int n9 = 0;
        while (true) {
            long l8;
            try {
                t8 = b8.a();
            }
            catch (y y8) {
                l8 = 0L;
            }
            catch (x x8) {
                l8 = x8.a();
            }
            return t8;
            if (n9 >= n8) break;
            if ((l8 += (long)a.nextInt(1000)) > 0L) {
                try {
                    Thread.sleep(l8);
                }
                catch (InterruptedException interruptedException) {
                    Thread.currentThread().interrupt();
                }
            }
            ++n9;
        }
        throw t8;
    }

    public static a.b x(m m8, String string, String string2, String string3, String[] objectArray, List<a.a> list) throws t {
        objectArray = f.g(n.l(m8.d(), objectArray));
        list = n.i(list);
        list.add(new a.a("Content-Type", "application/x-www-form-urlencoded; charset=utf-8"));
        return n.y(m8, string, string2, string3, (byte[])objectArray, list);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a.b y(m object, String object2, String string, String string2, byte[] byArray, List<a.a> list) throws t {
        string = n.f(string, string2);
        object2 = n.d(n.i(list), (m)object, (String)object2);
        object2.add((a.a)new a.a("Content-Length", Integer.toString(byArray.length)));
        try {
            object = ((m)object).b().a(string, (Iterable<a.a>)object2);
        }
        catch (IOException iOException) {
            throw new t(iOException);
        }
        try {
            ((a.c)object).f(byArray);
            object2 = ((a.c)object).b();
            return object2;
        }
        finally {
            ((a.c)object).a();
        }
    }

    public static String[] z(Map<String, String> object) {
        String[] stringArray = new String[object.size() * 2];
        object = object.entrySet().iterator();
        int n8 = 0;
        while (object.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            stringArray[n8] = (String)entry.getKey();
            stringArray[n8 + 1] = (String)entry.getValue();
            n8 += 2;
        }
        return stringArray;
    }

    public static abstract class b<T, E extends Throwable> {
        public abstract T a() throws j, E;
    }

    public static abstract class c<T> {
        public abstract T a(a.b var1) throws j;
    }
}

