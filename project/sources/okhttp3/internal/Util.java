package okhttp3.internal;

import ax.Fb.a;
import ax.Gb.b;
import ax.Gb.k;
import ax.Gb.l;
import ax.Gb.y;
import ax.Gb.z;
import ax.Lb.e;
import ax.Lb.f;
import ax.Ob.d;
import ax.Ob.g;
import ax.sb.C3069a;
import ax.sb.t;
import ax.tb.AbstractC3113D;
import ax.tb.C3115F;
import ax.tb.C3133i;
import ax.tb.C3139o;
import ax.xc.C;
import ax.xc.C3487e;
import ax.xc.InterfaceC3482A;
import ax.xc.InterfaceC3488f;
import ax.xc.h;
import ax.xc.s;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
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
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;

/* loaded from: classes3.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS = Headers.Companion.of(new String[0]);
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final s UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final g VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.12.0";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        s.a aVar = s.e0;
        h.a aVar2 = h.e0;
        UNICODE_BOMS = aVar.d(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        l.c(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new g("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String name = OkHttpClient.class.getName();
        l.e(name, "OkHttpClient::class.java.name");
        okHttpName = ax.Ob.h.k0(ax.Ob.h.j0(name, "okhttp3."), "Client");
    }

    public static final <E> void addIfAbsent(List<E> list, E e) {
        l.f(list, "<this>");
        if (list.contains(e)) {
            return;
        }
        list.add(e);
    }

    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final EventListener.Factory asFactory(final EventListener eventListener) {
        l.f(eventListener, "<this>");
        return new EventListener.Factory() { // from class: ax.uc.a
            @Override // okhttp3.EventListener.Factory
            public final EventListener create(Call call) {
                EventListener asFactory$lambda$8;
                asFactory$lambda$8 = Util.asFactory$lambda$8(EventListener.this, call);
                return asFactory$lambda$8;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventListener asFactory$lambda$8(EventListener eventListener, Call call) {
        l.f(eventListener, "$this_asFactory");
        l.f(call, "it");
        return eventListener;
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        l.f(obj, "<this>");
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        l.f(obj, "<this>");
        if (!assertionsEnabled || Thread.holdsLock(obj)) {
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + obj);
    }

    public static final boolean canParseAsIpAddress(String str) {
        l.f(str, "<this>");
        return VERIFY_AS_IP_ADDRESS.a(str);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        l.f(httpUrl, "<this>");
        l.f(httpUrl2, "other");
        return l.a(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && l.a(httpUrl.scheme(), httpUrl2.scheme());
    }

    public static final int checkDuration(String str, long j, TimeUnit timeUnit) {
        l.f(str, "name");
        if (j < 0) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((str + " too large.").toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((str + " too small.").toString());
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        l.f(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        l.f(strArr, "<this>");
        l.f(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        l.e(copyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[C3133i.v(strArr2)] = str;
        return strArr2;
    }

    public static final int delimiterOffset(String str, String str2, int i, int i2) {
        l.f(str, "<this>");
        l.f(str2, "delimiters");
        while (i < i2) {
            if (ax.Ob.h.L(str2, str.charAt(i), false, 2, null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final boolean discard(C c, int i, TimeUnit timeUnit) {
        l.f(c, "<this>");
        l.f(timeUnit, "timeUnit");
        try {
            return skipAll(c, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, ax.Fb.l<? super T, Boolean> lVar) {
        l.f(iterable, "<this>");
        l.f(lVar, "predicate");
        List<T> j = C3139o.j();
        for (T t : iterable) {
            if (lVar.invoke(t).booleanValue()) {
                if (j.isEmpty()) {
                    j = new ArrayList<>();
                }
                l.d(j, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                z.a(j).add(t);
            }
        }
        return j;
    }

    public static final String format(String str, Object... objArr) {
        l.f(str, "format");
        l.f(objArr, "args");
        y yVar = y.a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        l.e(format, "format(locale, format, *args)");
        return format;
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        l.f(strArr, "<this>");
        l.f(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator a = b.a(strArr2);
                while (a.hasNext()) {
                    if (comparator.compare(str, (String) a.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        l.f(response, "<this>");
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final void ignoreIoExceptions(a<t> aVar) {
        l.f(aVar, "block");
        try {
            aVar.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        l.f(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = DesugarCollections.unmodifiableList(C3139o.l(Arrays.copyOf(objArr, objArr.length)));
        l.e(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        l.f(strArr, "<this>");
        l.f(str, "value");
        l.f(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        l.f(str, "<this>");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (l.h(charAt, 31) <= 0 || l.h(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i, int i2) {
        l.f(str, "<this>");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i, int i2) {
        l.f(str, "<this>");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfNonWhitespace(String str, int i) {
        l.f(str, "<this>");
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        l.f(strArr, "<this>");
        l.f(strArr2, "other");
        l.f(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean isCivilized(FileSystem fileSystem, File file) {
        l.f(fileSystem, "<this>");
        l.f(file, "file");
        InterfaceC3482A sink = fileSystem.sink(file);
        try {
            try {
                fileSystem.delete(file);
                ax.Db.a.a(sink, null);
                return true;
            } catch (IOException unused) {
                t tVar = t.a;
                ax.Db.a.a(sink, null);
                fileSystem.delete(file);
                return false;
            }
        } finally {
        }
    }

    public static final boolean isHealthy(Socket socket, ax.xc.g gVar) {
        l.f(socket, "<this>");
        l.f(gVar, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !gVar.P();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean isSensitiveHeader(String str) {
        l.f(str, "name");
        return ax.Ob.h.v(str, "Authorization", true) || ax.Ob.h.v(str, "Cookie", true) || ax.Ob.h.v(str, "Proxy-Authorization", true) || ax.Ob.h.v(str, "Set-Cookie", true);
    }

    public static final void notify(Object obj) {
        l.f(obj, "<this>");
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        l.f(obj, "<this>");
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    public static final String peerName(Socket socket) {
        l.f(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        l.e(hostName, "address.hostName");
        return hostName;
    }

    public static final Charset readBomAsCharset(ax.xc.g gVar, Charset charset) throws IOException {
        l.f(gVar, "<this>");
        l.f(charset, "default");
        int O0 = gVar.O0(UNICODE_BOMS);
        if (O0 == -1) {
            return charset;
        }
        if (O0 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            l.e(charset2, "UTF_8");
            return charset2;
        }
        if (O0 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            l.e(charset3, "UTF_16BE");
            return charset3;
        }
        if (O0 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            l.e(charset4, "UTF_16LE");
            return charset4;
        }
        if (O0 == 3) {
            return d.a.a();
        }
        if (O0 == 4) {
            return d.a.b();
        }
        throw new AssertionError();
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) {
        T t;
        Object readFieldOrNull;
        l.f(obj, "instance");
        l.f(cls, "fieldType");
        l.f(str, "fieldName");
        Class<?> cls2 = obj.getClass();
        while (true) {
            t = null;
            if (l.a(cls2, Object.class)) {
                if (l.a(str, "delegate") || (readFieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(readFieldOrNull, cls, str);
            }
            try {
                Field declaredField = cls2.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (!cls.isInstance(obj2)) {
                    break;
                }
                t = cls.cast(obj2);
                break;
            } catch (NoSuchFieldException unused) {
                cls2 = cls2.getSuperclass();
                l.e(cls2, "c.superclass");
            }
        }
        return t;
    }

    public static final int readMedium(ax.xc.g gVar) throws IOException {
        l.f(gVar, "<this>");
        return and(gVar.readByte(), 255) | (and(gVar.readByte(), 255) << 16) | (and(gVar.readByte(), 255) << 8);
    }

    public static final boolean skipAll(C c, int i, TimeUnit timeUnit) throws IOException {
        l.f(c, "<this>");
        l.f(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = c.timeout().hasDeadline() ? c.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        c.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos(i)) + nanoTime);
        try {
            C3487e c3487e = new C3487e();
            while (c.read(c3487e, 8192L) != -1) {
                c3487e.b();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                c.timeout().clearDeadline();
                return true;
            }
            c.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                c.timeout().clearDeadline();
                return false;
            }
            c.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                c.timeout().clearDeadline();
            } else {
                c.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    public static final ThreadFactory threadFactory(final String str, final boolean z) {
        l.f(str, "name");
        return new ThreadFactory() { // from class: ax.uc.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread threadFactory$lambda$1;
                threadFactory$lambda$1 = Util.threadFactory$lambda$1(str, z, runnable);
                return threadFactory$lambda$1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread threadFactory$lambda$1(String str, boolean z, Runnable runnable) {
        l.f(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static final void threadName(String str, a<t> aVar) {
        l.f(str, "name");
        l.f(aVar, "block");
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            aVar.invoke();
        } finally {
            k.b(1);
            currentThread.setName(name);
            k.a(1);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        l.f(headers, "<this>");
        e l = f.l(0, headers.size());
        ArrayList arrayList = new ArrayList(C3139o.s(l, 10));
        Iterator<Integer> it = l.iterator();
        while (it.hasNext()) {
            int b = ((AbstractC3113D) it).b();
            arrayList.add(new Header(headers.name(b), headers.value(b)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        l.f(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().K(), header.component2().K());
        }
        return builder.build();
    }

    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        l.e(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z) {
        String host;
        l.f(httpUrl, "<this>");
        if (ax.Ob.h.M(httpUrl.host(), ":", false, 2, null)) {
            host = '[' + httpUrl.host() + ']';
        } else {
            host = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return host;
        }
        return host + ':' + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        l.f(list, "<this>");
        List<T> unmodifiableList = DesugarCollections.unmodifiableList(C3139o.X(list));
        l.e(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        l.f(map, "<this>");
        if (map.isEmpty()) {
            return C3115F.g();
        }
        Map<K, V> unmodifiableMap = DesugarCollections.unmodifiableMap(new LinkedHashMap(map));
        l.e(unmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return unmodifiableMap;
    }

    public static final long toLongOrDefault(String str, long j) {
        l.f(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return SubsamplingScaleImageView.TILE_SIZE_AUTO;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String trimSubstring(String str, int i, int i2) {
        l.f(str, "<this>");
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i2));
        l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final void wait(Object obj) {
        l.f(obj, "<this>");
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
        l.f(exc, "<this>");
        l.f(list, "suppressed");
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            C3069a.a(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(InterfaceC3488f interfaceC3488f, int i) throws IOException {
        l.f(interfaceC3488f, "<this>");
        interfaceC3488f.writeByte((i >>> 16) & 255);
        interfaceC3488f.writeByte((i >>> 8) & 255);
        interfaceC3488f.writeByte(i & 255);
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final int delimiterOffset(String str, char c, int i, int i2) {
        l.f(str, "<this>");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        l.e(hexString, "toHexString(this)");
        return hexString;
    }

    public static final long and(int i, long j) {
        return j & i;
    }

    public static final void closeQuietly(Socket socket) {
        l.f(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!l.a(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        l.f(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(C3487e c3487e, byte b) {
        l.f(c3487e, "<this>");
        int i = 0;
        while (!c3487e.P() && c3487e.v(0L) == b) {
            i++;
            c3487e.readByte();
        }
        return i;
    }
}
