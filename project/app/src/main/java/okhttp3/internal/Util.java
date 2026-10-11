/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal;

import ax.Db.a;
import ax.Gb.b;
import ax.Gb.k;
import ax.Gb.l;
import ax.Gb.y;
import ax.Gb.z;
import ax.Lb.f;
import ax.Ob.d;
import ax.Ob.g;
import ax.Ob.h;
import ax.sb.t;
import ax.tb.D;
import ax.tb.F;
import ax.tb.i;
import ax.tb.o;
import ax.xc.A;
import ax.xc.C;
import ax.xc.e;
import ax.xc.h;
import ax.xc.s;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;

public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS;
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final s UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final g VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.12.0";

    static {
        Object object = new byte[]{};
        EMPTY_BYTE_ARRAY = object;
        EMPTY_HEADERS = Headers.Companion.of(new String[0]);
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, object, null, 1, null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, object, null, 0, 0, 7, null);
        object = s.e0;
        h.a a8 = ax.xc.h.e0;
        UNICODE_BOMS = object.d(a8.b("efbbbf"), a8.b("feff"), a8.b("fffe"), a8.b("0000ffff"), a8.b("ffff0000"));
        object = java.util.DesugarTimeZone.getTimeZone((String)"GMT");
        l.c(object);
        UTC = object;
        VERIFY_AS_IP_ADDRESS = new g("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        object = OkHttpClient.class.getName();
        l.e(object, "OkHttpClient::class.java.name");
        okHttpName = h.k0(h.j0((String)object, "okhttp3."), "Client");
    }

    public static /* synthetic */ EventListener a(EventListener eventListener, Call call) {
        return Util.asFactory$lambda$8(eventListener, call);
    }

    public static final <E> void addIfAbsent(List<E> list, E e8) {
        l.f(list, "<this>");
        if (!list.contains(e8)) {
            list.add(e8);
        }
    }

    public static final int and(byte by, int n8) {
        return by & n8;
    }

    public static final int and(short s8, int n8) {
        return s8 & n8;
    }

    public static final long and(int n8, long l8) {
        return l8 & (long)n8;
    }

    public static final EventListener.Factory asFactory(EventListener eventListener) {
        l.f(eventListener, "<this>");
        return new ax.uc.a(eventListener);
    }

    private static final EventListener asFactory$lambda$8(EventListener eventListener, Call call) {
        l.f(eventListener, "$this_asFactory");
        l.f(call, "it");
        return eventListener;
    }

    public static final void assertThreadDoesntHoldLock(Object object) {
        l.f(object, "<this>");
        if (assertionsEnabled && Thread.holdsLock(object)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append(" MUST NOT hold lock on ");
            stringBuilder.append(object);
            throw new AssertionError((Object)stringBuilder.toString());
        }
    }

    public static final void assertThreadHoldsLock(Object object) {
        l.f(object, "<this>");
        if (assertionsEnabled && !Thread.holdsLock(object)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Thread ");
            stringBuilder.append(Thread.currentThread().getName());
            stringBuilder.append(" MUST hold lock on ");
            stringBuilder.append(object);
            throw new AssertionError((Object)stringBuilder.toString());
        }
    }

    public static /* synthetic */ Thread b(String string, boolean bl, Runnable runnable2) {
        return Util.threadFactory$lambda$1(string, bl, runnable2);
    }

    public static final boolean canParseAsIpAddress(String string) {
        l.f(string, "<this>");
        return VERIFY_AS_IP_ADDRESS.a(string);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        l.f(httpUrl, "<this>");
        l.f(httpUrl2, "other");
        return l.a(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && l.a(httpUrl.scheme(), httpUrl2.scheme());
    }

    public static final int checkDuration(String string, long l8, TimeUnit object) {
        l.f(string, "name");
        long l9 = l8 - 0L;
        long l10 = l9 == 0L ? 0 : (l9 < 0L ? -1 : 1);
        if (l10 >= 0) {
            if (object != null) {
                if ((l8 = ((TimeUnit)((Object)object)).toMillis(l8)) <= Integer.MAX_VALUE) {
                    if (l8 == 0L && l10 > 0) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append(string);
                        ((StringBuilder)object).append(" too small.");
                        throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
                    }
                    return (int)l8;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append(" too large.");
                throw new IllegalArgumentException(((StringBuilder)object).toString().toString());
            }
            throw new IllegalStateException("unit == null");
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(" < 0");
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    public static final void checkOffsetAndCount(long l8, long l9, long l10) {
        if ((l9 | l10) >= 0L && l9 <= l8 && l8 - l9 >= l10) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void closeQuietly(Closeable closeable) {
        l.f(closeable, "<this>");
        try {
            closeable.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void closeQuietly(ServerSocket serverSocket) {
        l.f(serverSocket, "<this>");
        try {
            serverSocket.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void closeQuietly(Socket socket) {
        l.f(socket, "<this>");
        try {
            socket.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            if (!l.a(runtimeException.getMessage(), "bio == null")) throw runtimeException;
            return;
        }
        catch (AssertionError assertionError) {
            throw assertionError;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final String[] concat(String[] stringArray, String string) {
        l.f(stringArray, "<this>");
        l.f(string, "value");
        stringArray = Arrays.copyOf(stringArray, stringArray.length + 1);
        l.e(stringArray, "copyOf(this, newSize)");
        stringArray[i.v(stringArray)] = string;
        return stringArray;
    }

    public static final int delimiterOffset(String string, char c8, int n8, int n9) {
        l.f(string, "<this>");
        while (n8 < n9) {
            if (string.charAt(n8) == c8) {
                return n8;
            }
            ++n8;
        }
        return n9;
    }

    public static final int delimiterOffset(String string, String string2, int n8, int n9) {
        l.f(string, "<this>");
        l.f(string2, "delimiters");
        while (n8 < n9) {
            if (h.L(string2, string.charAt(n8), false, 2, null)) {
                return n8;
            }
            ++n8;
        }
        return n9;
    }

    public static /* synthetic */ int delimiterOffset$default(String string, char c8, int n8, int n9, int n10, Object object) {
        if ((n10 & 2) != 0) {
            n8 = 0;
        }
        if ((n10 & 4) != 0) {
            n9 = string.length();
        }
        return Util.delimiterOffset(string, c8, n8, n9);
    }

    public static /* synthetic */ int delimiterOffset$default(String string, String string2, int n8, int n9, int n10, Object object) {
        if ((n10 & 2) != 0) {
            n8 = 0;
        }
        if ((n10 & 4) != 0) {
            n9 = string.length();
        }
        return Util.delimiterOffset(string, string2, n8, n9);
    }

    public static final boolean discard(C c8, int n8, TimeUnit timeUnit) {
        l.f(c8, "<this>");
        l.f((Object)timeUnit, "timeUnit");
        try {
            boolean bl = Util.skipAll(c8, n8, timeUnit);
            return bl;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, ax.Fb.l<? super T, Boolean> l8) {
        l.f(iterable, "<this>");
        l.f(l8, "predicate");
        Iterable iterable2 = o.j();
        Iterator<T> iterator = iterable.iterator();
        iterable = iterable2;
        while (iterator.hasNext()) {
            T t8 = iterator.next();
            if (!l8.invoke(t8).booleanValue()) continue;
            iterable2 = iterable;
            if (iterable.isEmpty()) {
                iterable2 = new ArrayList();
            }
            l.d(iterable2, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
            z.a(iterable2).add(t8);
            iterable = iterable2;
        }
        return iterable;
    }

    public static final String format(String string, Object ... objectArray) {
        l.f(string, "format");
        l.f(objectArray, "args");
        Object object = y.a;
        object = Locale.US;
        objectArray = Arrays.copyOf(objectArray, objectArray.length);
        string = String.format((Locale)object, string, Arrays.copyOf(objectArray, objectArray.length));
        l.e(string, "format(locale, format, *args)");
        return string;
    }

    public static final boolean hasIntersection(String[] stringArray, String[] stringArray2, Comparator<? super String> comparator) {
        l.f(stringArray, "<this>");
        l.f(comparator, "comparator");
        if (stringArray.length != 0 && stringArray2 != null && stringArray2.length != 0) {
            for (String string : stringArray) {
                Iterator<String> iterator = b.a(stringArray2);
                while (iterator.hasNext()) {
                    if (comparator.compare(string, iterator.next()) != 0) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response object) {
        l.f(object, "<this>");
        object = ((Response)object).headers().get("Content-Length");
        long l8 = -1L;
        if (object != null) {
            l8 = Util.toLongOrDefault((String)object, -1L);
        }
        return l8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void ignoreIoExceptions(ax.Fb.a<t> a8) {
        l.f(a8, "block");
        try {
            a8.invoke();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T ... object) {
        l.f(object, "elements");
        object = (Object[])object.clone();
        object = java.util.DesugarCollections.unmodifiableList(o.l(Arrays.copyOf(object, ((T[])object).length)));
        l.e(object, "unmodifiableList(listOf(*elements.clone()))");
        return object;
    }

    public static final int indexOf(String[] stringArray, String string, Comparator<String> comparator) {
        l.f(stringArray, "<this>");
        l.f(string, "value");
        l.f(comparator, "comparator");
        int n8 = stringArray.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (comparator.compare(stringArray[i8], string) != 0) continue;
            return i8;
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String string) {
        l.f(string, "<this>");
        int n8 = string.length();
        for (int i8 = 0; i8 < n8; ++i8) {
            char c8 = string.charAt(i8);
            if (l.h(c8, 31) > 0 && l.h(c8, 127) < 0) {
                continue;
            }
            return i8;
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String string, int n8, int n9) {
        l.f(string, "<this>");
        while (n8 < n9) {
            char c8 = string.charAt(n8);
            if (c8 == '\t' || c8 == '\n' || c8 == '\f' || c8 == '\r' || c8 == ' ') {
                ++n8;
                continue;
            }
            return n8;
        }
        return n9;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String string, int n8, int n9, int n10, Object object) {
        if ((n10 & 1) != 0) {
            n8 = 0;
        }
        if ((n10 & 2) != 0) {
            n9 = string.length();
        }
        return Util.indexOfFirstNonAsciiWhitespace(string, n8, n9);
    }

    public static final int indexOfLastNonAsciiWhitespace(String string, int n8, int n9) {
        block3: {
            l.f(string, "<this>");
            if (n8 <= --n9) {
                char c8;
                while ((c8 = string.charAt(n9)) == '\t' || c8 == '\n' || c8 == '\f' || c8 == '\r' || c8 == ' ') {
                    if (n9 != n8) {
                        --n9;
                        continue;
                    }
                    break block3;
                }
                return n9 + 1;
            }
        }
        return n8;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String string, int n8, int n9, int n10, Object object) {
        if ((n10 & 1) != 0) {
            n8 = 0;
        }
        if ((n10 & 2) != 0) {
            n9 = string.length();
        }
        return Util.indexOfLastNonAsciiWhitespace(string, n8, n9);
    }

    public static final int indexOfNonWhitespace(String string, int n8) {
        l.f(string, "<this>");
        int n9 = string.length();
        while (n8 < n9) {
            char c8 = string.charAt(n8);
            if (c8 != ' ' && c8 != '\t') {
                return n8;
            }
            ++n8;
        }
        return string.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String string, int n8, int n9, Object object) {
        if ((n9 & 1) != 0) {
            n8 = 0;
        }
        return Util.indexOfNonWhitespace(string, n8);
    }

    public static final String[] intersect(String[] stringArray, String[] stringArray2, Comparator<? super String> comparator) {
        l.f(stringArray, "<this>");
        l.f(stringArray2, "other");
        l.f(comparator, "comparator");
        ArrayList<String> arrayList = new ArrayList<String>();
        block0: for (String string : stringArray) {
            int n8 = stringArray2.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (comparator.compare(string, stringArray2[i8]) != 0) continue;
                arrayList.add(string);
                continue block0;
            }
        }
        return arrayList.toArray(new String[0]);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final boolean isCivilized(FileSystem fileSystem, File file) {
        Throwable throwable2222222;
        A a8;
        block6: {
            l.f(fileSystem, "<this>");
            l.f(file, "file");
            a8 = fileSystem.sink(file);
            fileSystem.delete(file);
            {
                catch (Throwable throwable2222222) {
                    break block6;
                }
                catch (IOException iOException) {}
                {
                    t t8 = t.a;
                }
                a.a(a8, null);
                fileSystem.delete(file);
                return false;
            }
            a.a(a8, null);
            return true;
        }
        try {
            throw throwable2222222;
        }
        catch (Throwable throwable3) {
            a.a(a8, throwable2222222);
            throw throwable3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean isHealthy(Socket socket, ax.xc.g g8) {
        boolean bl;
        l.f(socket, "<this>");
        l.f(g8, "source");
        boolean bl2 = true;
        int n8 = socket.getSoTimeout();
        try {
            socket.setSoTimeout(1);
            bl = g8.P();
        }
        catch (Throwable throwable) {
            try {
                socket.setSoTimeout(n8);
                throw throwable;
            }
            catch (IOException iOException) {
                return false;
            }
            catch (SocketTimeoutException socketTimeoutException) {
                return bl2;
            }
        }
        socket.setSoTimeout(n8);
        return bl ^ true;
    }

    public static final boolean isSensitiveHeader(String string) {
        l.f(string, "name");
        return h.v(string, "Authorization", true) || h.v(string, "Cookie", true) || h.v(string, "Proxy-Authorization", true) || h.v(string, "Set-Cookie", true);
        {
        }
    }

    public static final void notify(Object object) {
        l.f(object, "<this>");
        object.notify();
    }

    public static final void notifyAll(Object object) {
        l.f(object, "<this>");
        object.notifyAll();
    }

    public static final int parseHexDigit(char c8) {
        if ('0' <= c8 && c8 < ':') {
            return c8 - 48;
        }
        if ('a' <= c8 && c8 < 'g') {
            return c8 - 87;
        }
        if ('A' <= c8 && c8 < 'G') {
            return c8 - 55;
        }
        return -1;
    }

    public static final String peerName(Socket object) {
        l.f(object, "<this>");
        object = ((Socket)object).getRemoteSocketAddress();
        if (object instanceof InetSocketAddress) {
            object = ((InetSocketAddress)object).getHostName();
            l.e(object, "address.hostName");
            return object;
        }
        return object.toString();
    }

    public static final Charset readBomAsCharset(ax.xc.g object, Charset charset) throws IOException {
        l.f(object, "<this>");
        l.f(charset, "default");
        int n8 = object.O0(UNICODE_BOMS);
        if (n8 != -1) {
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            if (n8 == 4) {
                                return d.a.b();
                            }
                            throw new AssertionError();
                        }
                        return d.a.a();
                    }
                    object = StandardCharsets.UTF_16LE;
                    l.e(object, "UTF_16LE");
                    return object;
                }
                object = StandardCharsets.UTF_16BE;
                l.e(object, "UTF_16BE");
                return object;
            }
            object = StandardCharsets.UTF_8;
            l.e(object, "UTF_8");
            return object;
        }
        return charset;
    }

    public static final <T> T readFieldOrNull(Object object, Class<T> clazz, String string) {
        l.f(object, "instance");
        l.f(clazz, "fieldType");
        l.f(string, "fieldName");
        Class<?> clazz2 = object.getClass();
        while (true) {
            Object object2;
            Object var5_6;
            block5: {
                boolean bl = l.a(clazz2, Object.class);
                var5_6 = null;
                if (bl) break;
                try {
                    object2 = clazz2.getDeclaredField(string);
                    ((AccessibleObject)object2).setAccessible(true);
                    object2 = ((Field)object2).get(object);
                    if (clazz.isInstance(object2)) break block5;
                    object = var5_6;
                }
                catch (NoSuchFieldException noSuchFieldException) {
                    clazz2 = clazz2.getSuperclass();
                    l.e(clazz2, "c.superclass");
                    continue;
                }
            }
            var5_6 = clazz.cast(object2);
            object = var5_6;
            return (T)object;
        }
        if (!l.a(string, "delegate") && (object = Util.readFieldOrNull(object, Object.class, "delegate")) != null) {
            return Util.readFieldOrNull(object, clazz, string);
        }
        return null;
    }

    public static final int readMedium(ax.xc.g g8) throws IOException {
        l.f(g8, "<this>");
        int n8 = Util.and(g8.readByte(), 255);
        int n9 = Util.and(g8.readByte(), 255);
        return Util.and(g8.readByte(), 255) | (n8 << 16 | n9 << 8);
    }

    public static final int skipAll(e e8, byte by) {
        l.f(e8, "<this>");
        int n8 = 0;
        while (!e8.P() && e8.v(0L) == by) {
            ++n8;
            e8.readByte();
        }
        return n8;
    }

    public static final boolean skipAll(C c8, int n8, TimeUnit object) throws IOException {
        long l8;
        long l9;
        block10: {
            Throwable throwable2;
            block9: {
                l.f(c8, "<this>");
                l.f(object, "timeUnit");
                l9 = System.nanoTime();
                l8 = c8.timeout().hasDeadline() ? c8.timeout().deadlineNanoTime() - l9 : Long.MAX_VALUE;
                c8.timeout().deadlineNanoTime(Math.min(l8, ((TimeUnit)((Object)object)).toNanos(n8)) + l9);
                try {
                    object = new e();
                    while (c8.read((e)object, 8192L) != -1L) {
                        ((e)object).b();
                    }
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                catch (InterruptedIOException interruptedIOException) {
                    break block10;
                }
                if (l8 == Long.MAX_VALUE) {
                    c8.timeout().clearDeadline();
                    return true;
                }
                c8.timeout().deadlineNanoTime(l9 + l8);
                return true;
            }
            if (l8 == Long.MAX_VALUE) {
                c8.timeout().clearDeadline();
            } else {
                c8.timeout().deadlineNanoTime(l9 + l8);
            }
            throw throwable2;
        }
        if (l8 == Long.MAX_VALUE) {
            c8.timeout().clearDeadline();
        } else {
            c8.timeout().deadlineNanoTime(l9 + l8);
        }
        return false;
    }

    public static final ThreadFactory threadFactory(String string, boolean bl) {
        l.f(string, "name");
        return new ax.uc.b(string, bl);
    }

    private static final Thread threadFactory$lambda$1(String object, boolean bl, Runnable runnable2) {
        l.f(object, "$name");
        object = new Thread(runnable2, (String)object);
        ((Thread)object).setDaemon(bl);
        return object;
    }

    public static final void threadName(String string, ax.Fb.a<t> a8) {
        l.f(string, "name");
        l.f(a8, "block");
        Thread thread = Thread.currentThread();
        String string2 = thread.getName();
        thread.setName(string);
        try {
            a8.invoke();
            return;
        }
        finally {
            k.b(1);
            thread.setName(string2);
            k.a(1);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        l.f(headers, "<this>");
        Object object = f.l(0, headers.size());
        ArrayList<Header> arrayList = new ArrayList<Header>(o.s(object, 10));
        object = object.iterator();
        while (object.hasNext()) {
            int n8 = ((D)object).b();
            arrayList.add(new Header(headers.name(n8), headers.value(n8)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> object) {
        l.f(object, "<this>");
        Headers.Builder builder = new Headers.Builder();
        Iterator<Header> iterator = object.iterator();
        while (iterator.hasNext()) {
            Object object2 = iterator.next();
            object = ((Header)object2).component1();
            object2 = ((Header)object2).component2();
            builder.addLenient$okhttp(((ax.xc.h)object).K(), ((ax.xc.h)object2).K());
        }
        return builder.build();
    }

    public static final String toHexString(int n8) {
        String string = Integer.toHexString(n8);
        l.e(string, "toHexString(this)");
        return string;
    }

    public static final String toHexString(long l8) {
        String string = Long.toHexString(l8);
        l.e(string, "toHexString(this)");
        return string;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean bl) {
        CharSequence charSequence;
        l.f(httpUrl, "<this>");
        if (h.M(httpUrl.host(), ":", false, 2, null)) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append('[');
            ((StringBuilder)charSequence).append(httpUrl.host());
            ((StringBuilder)charSequence).append(']');
            charSequence = ((StringBuilder)charSequence).toString();
        } else {
            charSequence = httpUrl.host();
        }
        if (!bl && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return charSequence;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)charSequence);
        stringBuilder.append(':');
        stringBuilder.append(httpUrl.port());
        return stringBuilder.toString();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean bl, int n8, Object object) {
        if ((n8 & 1) != 0) {
            bl = false;
        }
        return Util.toHostHeader(httpUrl, bl);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        l.f(list, "<this>");
        list = java.util.DesugarCollections.unmodifiableList(o.X(list));
        l.e(list, "unmodifiableList(toMutableList())");
        return list;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        l.f(map, "<this>");
        if (map.isEmpty()) {
            return F.g();
        }
        map = java.util.DesugarCollections.unmodifiableMap(new LinkedHashMap<K, V>(map));
        l.e(map, "{\n    Collections.unmodi\u2026(LinkedHashMap(this))\n  }");
        return map;
    }

    public static final long toLongOrDefault(String string, long l8) {
        l.f(string, "<this>");
        try {
            long l9 = Long.parseLong(string);
            return l9;
        }
        catch (NumberFormatException numberFormatException) {
            return l8;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final int toNonNegativeInt(String string, int n8) {
        int n9 = n8;
        if (string == null) return n9;
        try {
            long l8 = Long.parseLong(string);
            if (l8 > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (l8 >= 0L) return (int)l8;
            return 0;
        }
        catch (NumberFormatException numberFormatException) {
            return n8;
        }
    }

    public static final String trimSubstring(String string, int n8, int n9) {
        l.f(string, "<this>");
        n8 = Util.indexOfFirstNonAsciiWhitespace(string, n8, n9);
        string = string.substring(n8, Util.indexOfLastNonAsciiWhitespace(string, n8, n9));
        l.e(string, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return string;
    }

    public static /* synthetic */ String trimSubstring$default(String string, int n8, int n9, int n10, Object object) {
        if ((n10 & 1) != 0) {
            n8 = 0;
        }
        if ((n10 & 2) != 0) {
            n9 = string.length();
        }
        return Util.trimSubstring(string, n8, n9);
    }

    public static final void wait(Object object) {
        l.f(object, "<this>");
        object.wait();
    }

    public static final Throwable withSuppressed(Exception exception, List<? extends Exception> object) {
        l.f(exception, "<this>");
        l.f(object, "suppressed");
        object = object.iterator();
        while (object.hasNext()) {
            ax.sb.a.a(exception, (Exception)object.next());
        }
        return exception;
    }

    public static final void writeMedium(ax.xc.f f8, int n8) throws IOException {
        l.f(f8, "<this>");
        f8.writeByte(n8 >>> 16 & 0xFF);
        f8.writeByte(n8 >>> 8 & 0xFF);
        f8.writeByte(n8 & 0xFF);
    }
}

