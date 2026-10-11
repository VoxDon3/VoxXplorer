package ax.Ya;

import j$.net.URLDecoder;
import j$.nio.channels.DesugarChannels;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLException;
import okhttp3.HttpUrl;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: classes3.dex */
public abstract class a {
    private static final Pattern h = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
    private static final Pattern i = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
    private static final Pattern j = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
    private static final Logger k = Logger.getLogger(a.class.getName());
    private final String a;
    private final int b;
    private volatile ServerSocket c;
    private r d;
    private Thread e;
    protected b f;
    private u g;

    public interface b {
        void a(c cVar);

        void b();

        void c(c cVar);
    }

    public class c implements Runnable {
        private final Socket c0;
        private final InputStream q;

        public c(InputStream inputStream, Socket socket) {
            this.q = inputStream;
            this.c0 = socket;
        }

        public void a() {
            a.p(this.q);
            a.p(this.c0);
        }

        @Override // java.lang.Runnable
        public void run() {
            OutputStream outputStream;
            OutputStream outputStream2 = null;
            try {
                try {
                    outputStream = this.c0.getOutputStream();
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                l lVar = a.this.new l(a.this.g.a(), this.q, outputStream, this.c0.getInetAddress());
                while (!this.c0.isClosed()) {
                    lVar.k();
                }
                a.p(outputStream);
                a.p(this.q);
                a.p(this.c0);
                a.this.f.c(this);
            } catch (Exception e2) {
                e = e2;
                outputStream2 = outputStream;
                if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                    a.k.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
                }
                a.p(outputStream2);
                a.p(this.q);
                a.p(this.c0);
                a.this.f.c(this);
            } catch (Throwable th2) {
                th = th2;
                outputStream2 = outputStream;
                a.p(outputStream2);
                a.p(this.q);
                a.p(this.c0);
                a.this.f.c(this);
                throw th;
            }
        }
    }

    protected static class d {
        private static final Pattern e = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
        private static final Pattern f = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
        private static final Pattern g = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
        private final String a;
        private final String b;
        private final String c;
        private final String d;

        public d(String str) {
            this.a = str;
            if (str != null) {
                this.b = d(str, e, HttpUrl.FRAGMENT_ENCODE_SET, 1);
                this.c = d(str, f, null, 2);
            } else {
                this.b = HttpUrl.FRAGMENT_ENCODE_SET;
                this.c = "UTF-8";
            }
            if ("multipart/form-data".equalsIgnoreCase(this.b)) {
                this.d = d(str, g, null, 2);
            } else {
                this.d = null;
            }
        }

        private String d(String str, Pattern pattern, String str2, int i) {
            Matcher matcher = pattern.matcher(str);
            return matcher.find() ? matcher.group(i) : str2;
        }

        public String a() {
            return this.d;
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.a;
        }

        public String e() {
            String str = this.c;
            return str == null ? "US-ASCII" : str;
        }

        public boolean f() {
            return "multipart/form-data".equalsIgnoreCase(this.b);
        }

        public d g() {
            if (this.c != null) {
                return this;
            }
            return new d(this.a + "; charset=UTF-8");
        }
    }

    public static class e {
        private final String a;
        private final String b;
        private final String c;

        public String a() {
            return String.format("%s=%s; expires=%s", this.a, this.b, this.c);
        }
    }

    public class f implements Iterable<String> {
        private final HashMap<String, String> q = new HashMap<>();
        private final ArrayList<e> c0 = new ArrayList<>();

        public f(Map<String, String> map) {
            String str = map.get("cookie");
            if (str != null) {
                for (String str2 : str.split(";")) {
                    String[] split = str2.trim().split("=");
                    if (split.length == 2) {
                        this.q.put(split[0], split[1]);
                    }
                }
            }
        }

        public void e(o oVar) {
            ArrayList<e> arrayList = this.c0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                e eVar = arrayList.get(i);
                i++;
                oVar.b("Set-Cookie", eVar.a());
            }
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return this.q.keySet().iterator();
        }
    }

    public static class g implements b {
        private long a;
        private final List<c> b = DesugarCollections.synchronizedList(new ArrayList());

        @Override // ax.Ya.a.b
        public void a(c cVar) {
            this.a++;
            Thread thread = new Thread(cVar);
            thread.setDaemon(true);
            thread.setName("NanoHttpd Request Processor (#" + this.a + ")");
            this.b.add(cVar);
            thread.start();
        }

        @Override // ax.Ya.a.b
        public void b() {
            ArrayList arrayList = new ArrayList(this.b);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((c) obj).a();
            }
        }

        @Override // ax.Ya.a.b
        public void c(c cVar) {
            this.b.remove(cVar);
        }

        public List<c> d() {
            return this.b;
        }
    }

    public static class h implements r {
        @Override // ax.Ya.a.r
        public ServerSocket a() throws IOException {
            return new ServerSocket();
        }
    }

    public static class i implements s {
        private final File a;
        private final OutputStream b;

        public i(File file) throws IOException {
            File a = a(file);
            this.a = a;
            this.b = new FileOutputStream(a);
        }

        File a(File file) throws IOException {
            File file2;
            long currentTimeMillis = System.currentTimeMillis();
            long abs = currentTimeMillis == Long.MIN_VALUE ? 0L : Math.abs(currentTimeMillis);
            do {
                String str = "NanoHTTPD-" + Long.toString(abs);
                file2 = new File(file, str);
                if (!str.equals(file2.getName())) {
                    throw new IOException("Unable to create temporary file");
                }
                abs++;
            } while (file2.exists());
            return file2;
        }

        @Override // ax.Ya.a.s
        public void delete() throws Exception {
            a.p(this.b);
            if (this.a.delete()) {
                return;
            }
            throw new Exception("could not delete temporary file: " + this.a.getAbsolutePath());
        }

        @Override // ax.Ya.a.s
        public String getName() {
            return this.a.getAbsolutePath();
        }
    }

    public static class j implements t {
        private final File a;
        private final List<s> b;

        public j() {
            File file = new File(System.getProperty("java.io.tmpdir"));
            this.a = file;
            if (!file.exists()) {
                file.mkdirs();
            }
            this.b = new ArrayList();
        }

        @Override // ax.Ya.a.t
        public s a(String str) throws Exception {
            i iVar = new i(this.a);
            this.b.add(iVar);
            return iVar;
        }

        @Override // ax.Ya.a.t
        public void clear() {
            Iterator<s> it = this.b.iterator();
            while (it.hasNext()) {
                try {
                    it.next().delete();
                } catch (Exception e) {
                    a.k.log(Level.WARNING, "could not delete file ", (Throwable) e);
                }
            }
            this.b.clear();
        }
    }

    private class k implements u {
        private k() {
        }

        @Override // ax.Ya.a.u
        public t a() {
            return new j();
        }
    }

    protected class l implements m {
        private final t a;
        private final OutputStream b;
        private final BufferedInputStream c;
        private int d;
        private int e;
        private String f;
        private n g;
        private Map<String, List<String>> h;
        private Map<String, String> i;
        private f j;
        private String k;
        private String l;
        private String m;
        private String n;

        public l(t tVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
            this.a = tVar;
            this.c = new BufferedInputStream(inputStream, 8192);
            this.b = outputStream;
            this.l = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
            this.m = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "localhost" : inetAddress.getHostName().toString();
            this.i = new HashMap();
        }

        private void h(BufferedReader bufferedReader, Map<String, String> map, Map<String, List<String>> map2, Map<String, String> map3) throws p {
            String l;
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new p(o.d.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                }
                map.put("method", stringTokenizer.nextToken());
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new p(o.d.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(63);
                if (indexOf >= 0) {
                    j(nextToken.substring(indexOf + 1), map2);
                    l = a.l(nextToken.substring(0, indexOf));
                } else {
                    l = a.l(nextToken);
                }
                if (stringTokenizer.hasMoreTokens()) {
                    this.n = stringTokenizer.nextToken();
                } else {
                    this.n = "HTTP/1.1";
                    a.k.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                }
                String readLine2 = bufferedReader.readLine();
                while (readLine2 != null && !readLine2.trim().isEmpty()) {
                    int indexOf2 = readLine2.indexOf(58);
                    if (indexOf2 >= 0) {
                        map3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                    }
                    readLine2 = bufferedReader.readLine();
                }
                map.put("uri", l);
            } catch (IOException e) {
                throw new p(o.d.INTERNAL_ERROR, "SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
            }
        }

        private void i(d dVar, ByteBuffer byteBuffer, Map<String, List<String>> map, Map<String, String> map2) throws p {
            try {
                int[] n = n(byteBuffer, dVar.a().getBytes());
                int i = 2;
                if (n.length < 2) {
                    throw new p(o.d.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
                }
                int i2 = 1024;
                byte[] bArr = new byte[1024];
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int i6 = 1;
                    if (i4 >= n.length - 1) {
                        return;
                    }
                    byteBuffer.position(n[i4]);
                    int remaining = byteBuffer.remaining() < i2 ? byteBuffer.remaining() : 1024;
                    byteBuffer.get(bArr, i3, remaining);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, i3, remaining), Charset.forName(dVar.e())), remaining);
                    String readLine = bufferedReader.readLine();
                    if (readLine == null || !readLine.contains(dVar.a())) {
                        break;
                    }
                    String readLine2 = bufferedReader.readLine();
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    int i7 = 2;
                    while (readLine2 != null && readLine2.trim().length() > 0) {
                        Matcher matcher = a.h.matcher(readLine2);
                        if (matcher.matches()) {
                            Matcher matcher2 = a.j.matcher(matcher.group(i));
                            while (matcher2.find()) {
                                String group = matcher2.group(i6);
                                if ("name".equalsIgnoreCase(group)) {
                                    str = matcher2.group(2);
                                } else if ("filename".equalsIgnoreCase(group)) {
                                    String group2 = matcher2.group(2);
                                    if (!group2.isEmpty()) {
                                        if (i5 > 0) {
                                            str = str + String.valueOf(i5);
                                            i5++;
                                        } else {
                                            i5++;
                                        }
                                    }
                                    str2 = group2;
                                }
                                i6 = 1;
                            }
                        }
                        Matcher matcher3 = a.i.matcher(readLine2);
                        if (matcher3.matches()) {
                            str3 = matcher3.group(2).trim();
                        }
                        readLine2 = bufferedReader.readLine();
                        i7++;
                        i = 2;
                        i6 = 1;
                    }
                    int i8 = 0;
                    while (true) {
                        int i9 = i7 - 1;
                        if (i7 <= 0) {
                            break;
                        }
                        i8 = q(bArr, i8);
                        i7 = i9;
                    }
                    if (i8 >= remaining - 4) {
                        throw new p(o.d.INTERNAL_ERROR, "Multipart header size exceeds MAX_HEADER_SIZE.");
                    }
                    int i10 = n[i4] + i8;
                    i4++;
                    int i11 = n[i4] - 4;
                    byteBuffer.position(i10);
                    List<String> list = map.get(str);
                    if (list == null) {
                        list = new ArrayList<>();
                        map.put(str, list);
                    }
                    if (str3 == null) {
                        byte[] bArr2 = new byte[i11 - i10];
                        byteBuffer.get(bArr2);
                        list.add(new String(bArr2, dVar.e()));
                    } else {
                        String p = p(byteBuffer, i10, i11 - i10, str2);
                        if (map2.containsKey(str)) {
                            int i12 = 2;
                            while (true) {
                                if (!map2.containsKey(str + i12)) {
                                    break;
                                } else {
                                    i12++;
                                }
                            }
                            map2.put(str + i12, p);
                        } else {
                            map2.put(str, p);
                        }
                        list.add(str2);
                    }
                    i2 = 1024;
                    i = 2;
                    i3 = 0;
                }
                throw new p(o.d.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
            } catch (p e) {
                throw e;
            } catch (Exception e2) {
                throw new p(o.d.INTERNAL_ERROR, e2.toString());
            }
        }

        private void j(String str, Map<String, List<String>> map) {
            String trim;
            String str2;
            if (str == null) {
                this.k = HttpUrl.FRAGMENT_ENCODE_SET;
                return;
            }
            this.k = str;
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf >= 0) {
                    trim = a.l(nextToken.substring(0, indexOf)).trim();
                    str2 = a.l(nextToken.substring(indexOf + 1));
                } else {
                    trim = a.l(nextToken).trim();
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                List<String> list = map.get(trim);
                if (list == null) {
                    list = new ArrayList<>();
                    map.put(trim, list);
                }
                list.add(str2);
            }
        }

        private int l(byte[] bArr, int i) {
            int i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i4 >= i) {
                    return 0;
                }
                byte b = bArr[i3];
                if (b == 13 && bArr[i4] == 10 && (i2 = i3 + 3) < i && bArr[i3 + 2] == 13 && bArr[i2] == 10) {
                    return i3 + 4;
                }
                if (b == 10 && bArr[i4] == 10) {
                    return i3 + 2;
                }
                i3 = i4;
            }
        }

        private int[] n(ByteBuffer byteBuffer, byte[] bArr) {
            int[] iArr = new int[0];
            if (byteBuffer.remaining() < bArr.length) {
                return iArr;
            }
            int length = bArr.length + 4096;
            byte[] bArr2 = new byte[length];
            int remaining = byteBuffer.remaining() < length ? byteBuffer.remaining() : length;
            byteBuffer.get(bArr2, 0, remaining);
            int length2 = remaining - bArr.length;
            int i = 0;
            do {
                for (int i2 = 0; i2 < length2; i2++) {
                    for (int i3 = 0; i3 < bArr.length && bArr2[i2 + i3] == bArr[i3]; i3++) {
                        if (i3 == bArr.length - 1) {
                            int[] iArr2 = new int[iArr.length + 1];
                            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                            iArr2[iArr.length] = i + i2;
                            iArr = iArr2;
                        }
                    }
                }
                i += length2;
                System.arraycopy(bArr2, length - bArr.length, bArr2, 0, bArr.length);
                length2 = length - bArr.length;
                if (byteBuffer.remaining() < length2) {
                    length2 = byteBuffer.remaining();
                }
                byteBuffer.get(bArr2, bArr.length, length2);
            } while (length2 > 0);
            return iArr;
        }

        private RandomAccessFile o() {
            try {
                return new RandomAccessFile(this.a.a(null).getName(), "rw");
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        private String p(ByteBuffer byteBuffer, int i, int i2, String str) {
            s a;
            ByteBuffer duplicate;
            FileOutputStream fileOutputStream;
            FileChannel convertMaybeLegacyFileChannelFromLibrary;
            if (i2 <= 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    a = this.a.a(str);
                    duplicate = byteBuffer.duplicate();
                    fileOutputStream = new FileOutputStream(a.getName());
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel());
                duplicate.position(i).limit(i + i2);
                convertMaybeLegacyFileChannelFromLibrary.write(duplicate.slice());
                String name = a.getName();
                a.p(fileOutputStream);
                return name;
            } catch (Exception e2) {
                e = e2;
                fileOutputStream2 = fileOutputStream;
                throw new Error(e);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                a.p(fileOutputStream2);
                throw th;
            }
        }

        private int q(byte[] bArr, int i) {
            while (bArr[i] != 10) {
                i++;
            }
            return i + 1;
        }

        @Override // ax.Ya.a.m
        public final Map<String, String> a() {
            return this.i;
        }

        @Override // ax.Ya.a.m
        public final String b() {
            return this.f;
        }

        @Override // ax.Ya.a.m
        @Deprecated
        public final Map<String, String> c() {
            HashMap hashMap = new HashMap();
            for (String str : this.h.keySet()) {
                hashMap.put(str, this.h.get(str).get(0));
            }
            return hashMap;
        }

        @Override // ax.Ya.a.m
        public final Map<String, List<String>> d() {
            return this.h;
        }

        @Override // ax.Ya.a.m
        public void e(Map<String, String> map) throws IOException, p {
            RandomAccessFile o;
            ByteArrayOutputStream byteArrayOutputStream;
            DataOutput dataOutput;
            FileChannel convertMaybeLegacyFileChannelFromLibrary;
            ByteBuffer map2;
            RandomAccessFile randomAccessFile = null;
            try {
                long m = m();
                if (m < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    dataOutput = new DataOutputStream(byteArrayOutputStream);
                    o = null;
                } else {
                    o = o();
                    byteArrayOutputStream = null;
                    dataOutput = o;
                }
                try {
                    byte[] bArr = new byte[512];
                    while (this.e >= 0 && m > 0) {
                        int read = this.c.read(bArr, 0, (int) Math.min(m, 512L));
                        this.e = read;
                        m -= read;
                        if (read > 0) {
                            dataOutput.write(bArr, 0, read);
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        map2 = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                    } else {
                        convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(o.getChannel());
                        map2 = convertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, o.length());
                        o.seek(0L);
                    }
                    if (n.POST.equals(this.g)) {
                        d dVar = new d(this.i.get("content-type"));
                        if (!dVar.f()) {
                            byte[] bArr2 = new byte[map2.remaining()];
                            map2.get(bArr2);
                            String trim = new String(bArr2, dVar.e()).trim();
                            if ("application/x-www-form-urlencoded".equalsIgnoreCase(dVar.b())) {
                                j(trim, this.h);
                            } else if (trim.length() != 0) {
                                map.put("postData", trim);
                            }
                        } else {
                            if (dVar.a() == null) {
                                throw new p(o.d.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                            }
                            i(dVar, map2, this.h, map);
                        }
                    } else if (n.PUT.equals(this.g)) {
                        map.put("content", p(map2, 0, map2.limit(), null));
                    }
                    a.p(o);
                } catch (Throwable th) {
                    th = th;
                    randomAccessFile = o;
                    a.p(randomAccessFile);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // ax.Ya.a.m
        public final n f() {
            return this.g;
        }

        @Override // ax.Ya.a.m
        public String g() {
            return this.k;
        }

        public void k() throws IOException {
            try {
                try {
                    try {
                        try {
                            try {
                                byte[] bArr = new byte[8192];
                                boolean z = false;
                                this.d = 0;
                                this.e = 0;
                                this.c.mark(8192);
                                try {
                                    int read = this.c.read(bArr, 0, 8192);
                                    if (read == -1) {
                                        a.p(this.c);
                                        a.p(this.b);
                                        throw new SocketException("NanoHttpd Shutdown");
                                    }
                                    while (read > 0) {
                                        int i = this.e + read;
                                        this.e = i;
                                        int l = l(bArr, i);
                                        this.d = l;
                                        if (l > 0) {
                                            break;
                                        }
                                        BufferedInputStream bufferedInputStream = this.c;
                                        int i2 = this.e;
                                        read = bufferedInputStream.read(bArr, i2, 8192 - i2);
                                    }
                                    if (this.d < this.e) {
                                        this.c.reset();
                                        this.c.skip(this.d);
                                    }
                                    this.h = new HashMap();
                                    Map<String, String> map = this.i;
                                    if (map == null) {
                                        this.i = new HashMap();
                                    } else {
                                        map.clear();
                                    }
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.e)));
                                    HashMap hashMap = new HashMap();
                                    h(bufferedReader, hashMap, this.h, this.i);
                                    String str = this.l;
                                    if (str != null) {
                                        this.i.put("remote-addr", str);
                                        this.i.put("http-client-ip", this.l);
                                    }
                                    n h = n.h(hashMap.get("method"));
                                    this.g = h;
                                    if (h == null) {
                                        throw new p(o.d.BAD_REQUEST, "BAD REQUEST: Syntax error. HTTP verb " + hashMap.get("method") + " unhandled.");
                                    }
                                    this.f = hashMap.get("uri");
                                    this.j = a.this.new f(this.i);
                                    String str2 = this.i.get("connection");
                                    boolean z2 = "HTTP/1.1".equals(this.n) && (str2 == null || !str2.matches("(?i).*close.*"));
                                    o q = a.this.q(this);
                                    if (q == null) {
                                        throw new p(o.d.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                                    }
                                    String str3 = this.i.get("accept-encoding");
                                    this.j.e(q);
                                    q.A(this.g);
                                    if (a.this.w(q) && str3 != null && str3.contains("gzip")) {
                                        z = true;
                                    }
                                    q.u(z);
                                    q.v(z2);
                                    q.g(this.b);
                                    if (!z2 || q.e()) {
                                        throw new SocketException("NanoHttpd Shutdown");
                                    }
                                    a.p(q);
                                    this.a.clear();
                                } catch (SSLException e) {
                                    throw e;
                                } catch (IOException unused) {
                                    a.p(this.c);
                                    a.p(this.b);
                                    throw new SocketException("NanoHttpd Shutdown");
                                }
                            } catch (p e2) {
                                a.o(e2.a(), "text/plain", e2.getMessage()).g(this.b);
                                a.p(this.b);
                                a.p(null);
                                this.a.clear();
                            }
                        } catch (IOException e3) {
                            a.o(o.d.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e3.getMessage()).g(this.b);
                            a.p(this.b);
                            a.p(null);
                            this.a.clear();
                        }
                    } catch (SocketTimeoutException e4) {
                        throw e4;
                    }
                } catch (SocketException e5) {
                    throw e5;
                } catch (SSLException e6) {
                    a.o(o.d.INTERNAL_ERROR, "text/plain", "SSL PROTOCOL FAILURE: " + e6.getMessage()).g(this.b);
                    a.p(this.b);
                    a.p(null);
                    this.a.clear();
                }
            } catch (Throwable th) {
                a.p(null);
                this.a.clear();
                throw th;
            }
        }

        public long m() {
            if (this.i.containsKey("content-length")) {
                return Long.parseLong(this.i.get("content-length"));
            }
            if (this.d < this.e) {
                return r1 - r0;
            }
            return 0L;
        }
    }

    public interface m {
        Map<String, String> a();

        String b();

        @Deprecated
        Map<String, String> c();

        Map<String, List<String>> d();

        void e(Map<String, String> map) throws IOException, p;

        n f();

        String g();
    }

    public enum n {
        GET,
        PUT,
        POST,
        DELETE,
        HEAD,
        OPTIONS,
        TRACE,
        CONNECT,
        PATCH,
        PROPFIND,
        PROPPATCH,
        MKCOL,
        MOVE,
        COPY,
        LOCK,
        UNLOCK;

        static n h(String str) {
            if (str == null) {
                return null;
            }
            try {
                return valueOf(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public static class o implements Closeable, AutoCloseable {
        private String c0;
        private InputStream d0;
        private long e0;
        private final Map<String, String> f0 = new C0226a();
        private final Map<String, String> g0 = new HashMap();
        private n h0;
        private boolean i0;
        private boolean j0;
        private boolean k0;
        private c q;

        /* renamed from: ax.Ya.a$o$a, reason: collision with other inner class name */
        class C0226a extends HashMap<String, String> {
            C0226a() {
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public String put(String str, String str2) {
                o.this.g0.put(str == null ? str : str.toLowerCase(), str2);
                return (String) super.put(str, str2);
            }
        }

        public interface c {
            String d();
        }

        public enum d implements c {
            SWITCH_PROTOCOL(101, "Switching Protocols"),
            OK(200, "OK"),
            CREATED(201, "Created"),
            ACCEPTED(202, "Accepted"),
            NO_CONTENT(204, "No Content"),
            PARTIAL_CONTENT(206, "Partial Content"),
            MULTI_STATUS(207, "Multi-Status"),
            REDIRECT(301, "Moved Permanently"),
            FOUND(302, "Found"),
            REDIRECT_SEE_OTHER(303, "See Other"),
            NOT_MODIFIED(304, "Not Modified"),
            TEMPORARY_REDIRECT(StatusLine.HTTP_TEMP_REDIRECT, "Temporary Redirect"),
            BAD_REQUEST(400, "Bad Request"),
            UNAUTHORIZED(401, "Unauthorized"),
            FORBIDDEN(403, "Forbidden"),
            NOT_FOUND(404, "Not Found"),
            METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
            NOT_ACCEPTABLE(406, "Not Acceptable"),
            REQUEST_TIMEOUT(408, "Request Timeout"),
            CONFLICT(409, "Conflict"),
            GONE(410, "Gone"),
            LENGTH_REQUIRED(411, "Length Required"),
            PRECONDITION_FAILED(412, "Precondition Failed"),
            PAYLOAD_TOO_LARGE(413, "Payload Too Large"),
            UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
            RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
            EXPECTATION_FAILED(417, "Expectation Failed"),
            TOO_MANY_REQUESTS(429, "Too Many Requests"),
            INTERNAL_ERROR(500, "Internal Server Error"),
            NOT_IMPLEMENTED(501, "Not Implemented"),
            SERVICE_UNAVAILABLE(503, "Service Unavailable"),
            UNSUPPORTED_HTTP_VERSION(505, "HTTP Version Not Supported");

            private final String c0;
            private final int q;

            d(int i, String str) {
                this.q = i;
                this.c0 = str;
            }

            @Override // ax.Ya.a.o.c
            public String d() {
                return HttpUrl.FRAGMENT_ENCODE_SET + this.q + " " + this.c0;
            }
        }

        protected o(c cVar, String str, InputStream inputStream, long j) {
            this.q = cVar;
            this.c0 = str;
            if (inputStream == null) {
                this.d0 = new ByteArrayInputStream(new byte[0]);
                this.e0 = 0L;
            } else {
                this.d0 = inputStream;
                this.e0 = j;
            }
            this.i0 = this.e0 < 0;
            this.k0 = true;
        }

        private void j(OutputStream outputStream, long j) throws IOException {
            byte[] bArr = new byte[(int) Http2Stream.EMIT_BUFFER_SIZE];
            boolean z = j == -1;
            while (true) {
                if (j <= 0 && !z) {
                    return;
                }
                int read = this.d0.read(bArr, 0, (int) (z ? 16384L : Math.min(j, Http2Stream.EMIT_BUFFER_SIZE)));
                if (read <= 0) {
                    return;
                }
                outputStream.write(bArr, 0, read);
                if (!z) {
                    j -= read;
                }
            }
        }

        private void m(OutputStream outputStream, long j) throws IOException {
            if (!this.j0) {
                j(outputStream, j);
                return;
            }
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            j(gZIPOutputStream, -1L);
            gZIPOutputStream.finish();
        }

        private void o(OutputStream outputStream, long j) throws IOException {
            if (this.h0 == n.HEAD || !this.i0) {
                m(outputStream, j);
                return;
            }
            b bVar = new b(outputStream);
            m(bVar, -1L);
            bVar.a();
        }

        public void A(n nVar) {
            this.h0 = nVar;
        }

        public void b(String str, String str2) {
            this.f0.put(str, str2);
        }

        public String c(String str) {
            return this.g0.get(str.toLowerCase());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            InputStream inputStream = this.d0;
            if (inputStream != null) {
                inputStream.close();
            }
        }

        public String d() {
            return this.c0;
        }

        public boolean e() {
            return "close".equals(c("connection"));
        }

        protected void f(PrintWriter printWriter, String str, String str2) {
            printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
        }

        protected void g(OutputStream outputStream) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
            try {
                if (this.q == null) {
                    throw new Error("sendResponse(): Status can't be null.");
                }
                PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, new d(this.c0).e())), false);
                printWriter.append("HTTP/1.1 ").append((CharSequence) this.q.d()).append(" \r\n");
                String str = this.c0;
                if (str != null) {
                    f(printWriter, "Content-Type", str);
                }
                if (c("date") == null) {
                    f(printWriter, "Date", simpleDateFormat.format(new Date()));
                }
                for (Map.Entry<String, String> entry : this.f0.entrySet()) {
                    f(printWriter, entry.getKey(), entry.getValue());
                }
                if (c("connection") == null) {
                    f(printWriter, "Connection", this.k0 ? "keep-alive" : "close");
                }
                if (c("content-length") != null) {
                    this.j0 = false;
                }
                if (this.j0) {
                    f(printWriter, "Content-Encoding", "gzip");
                    q(true);
                }
                long j = this.d0 != null ? this.e0 : 0L;
                if (this.h0 != n.HEAD && this.i0) {
                    f(printWriter, "Transfer-Encoding", "chunked");
                } else if (!this.j0) {
                    j = p(printWriter, j);
                }
                printWriter.append("\r\n");
                printWriter.flush();
                o(outputStream, j);
                outputStream.flush();
                a.p(this.d0);
            } catch (IOException e) {
                a.k.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
            }
        }

        protected long p(PrintWriter printWriter, long j) {
            String c2 = c("content-length");
            if (c2 != null) {
                try {
                    return Long.parseLong(c2);
                } catch (NumberFormatException unused) {
                    a.k.severe("content-length was no number " + c2);
                }
            } else {
                printWriter.print("Content-Length: " + j + "\r\n");
            }
            return j;
        }

        public void q(boolean z) {
            this.i0 = z;
        }

        public void u(boolean z) {
            this.j0 = z;
        }

        public void v(boolean z) {
            this.k0 = z;
        }

        private static class b extends FilterOutputStream {
            public b(OutputStream outputStream) {
                super(outputStream);
            }

            public void a() throws IOException {
                ((FilterOutputStream) this).out.write("0\r\n\r\n".getBytes());
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) throws IOException {
                write(new byte[]{(byte) i}, 0, 1);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr) throws IOException {
                write(bArr, 0, bArr.length);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                if (i2 == 0) {
                    return;
                }
                ((FilterOutputStream) this).out.write(String.format("%x\r\n", Integer.valueOf(i2)).getBytes());
                ((FilterOutputStream) this).out.write(bArr, i, i2);
                ((FilterOutputStream) this).out.write("\r\n".getBytes());
            }
        }
    }

    public class q implements Runnable {
        private IOException c0;
        private boolean d0 = false;
        private final int q;

        public q(int i) {
            this.q = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.this.c.bind(a.this.a != null ? new InetSocketAddress(a.this.a, a.this.b) : new InetSocketAddress(a.this.b));
                this.d0 = true;
                do {
                    try {
                        Socket accept = a.this.c.accept();
                        int i = this.q;
                        if (i > 0) {
                            accept.setSoTimeout(i);
                        }
                        InputStream inputStream = accept.getInputStream();
                        a aVar = a.this;
                        aVar.f.a(aVar.j(accept, inputStream));
                    } catch (IOException e) {
                        a.k.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                    }
                } while (!a.this.c.isClosed());
            } catch (IOException e2) {
                this.c0 = e2;
            }
        }
    }

    public interface r {
        ServerSocket a() throws IOException;
    }

    public interface s {
        void delete() throws Exception;

        String getName();
    }

    public interface t {
        s a(String str) throws Exception;

        void clear();
    }

    public interface u {
        t a();
    }

    public a(int i2) {
        this(null, i2);
    }

    protected static String l(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e2) {
            k.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e2);
            return null;
        }
    }

    public static o n(o.c cVar, String str, InputStream inputStream, long j2) {
        return new o(cVar, str, inputStream, j2);
    }

    public static o o(o.c cVar, String str, String str2) {
        byte[] bArr;
        d dVar = new d(str);
        if (str2 == null) {
            return n(cVar, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(dVar.e()).newEncoder().canEncode(str2)) {
                dVar = dVar.g();
            }
            bArr = str2.getBytes(dVar.e());
        } catch (UnsupportedEncodingException e2) {
            k.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e2);
            bArr = new byte[0];
        }
        return n(cVar, dVar.c(), new ByteArrayInputStream(bArr), bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (!(obj instanceof ServerSocket)) {
                        throw new IllegalArgumentException("Unknown object to close");
                    }
                    ((ServerSocket) obj).close();
                }
            } catch (IOException e2) {
                k.log(Level.SEVERE, "Could not close", (Throwable) e2);
            }
        }
    }

    protected c j(Socket socket, InputStream inputStream) {
        return new c(inputStream, socket);
    }

    protected q k(int i2) {
        return new q(i2);
    }

    public r m() {
        return this.d;
    }

    public o q(m mVar) {
        HashMap hashMap = new HashMap();
        n f2 = mVar.f();
        if (n.PUT.equals(f2) || n.POST.equals(f2)) {
            try {
                mVar.e(hashMap);
            } catch (p e2) {
                return o(e2.a(), "text/plain", e2.getMessage());
            } catch (IOException e3) {
                return o(o.d.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e3.getMessage());
            }
        }
        Map<String, String> c2 = mVar.c();
        c2.put("NanoHttpd.QUERY_STRING", mVar.g());
        return r(mVar.b(), f2, mVar.a(), c2, hashMap);
    }

    @Deprecated
    public o r(String str, n nVar, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        return o(o.d.NOT_FOUND, "text/plain", "Not Found");
    }

    public void s(b bVar) {
        this.f = bVar;
    }

    public void t(u uVar) {
        this.g = uVar;
    }

    public void u(int i2, boolean z) throws IOException {
        this.c = m().a();
        this.c.setReuseAddress(true);
        q k2 = k(i2);
        Thread thread = new Thread(k2);
        this.e = thread;
        thread.setDaemon(z);
        this.e.setName("NanoHttpd Main Listener");
        this.e.start();
        while (!k2.d0 && k2.c0 == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        if (k2.c0 != null) {
            throw k2.c0;
        }
    }

    public void v() {
        try {
            p(this.c);
            this.f.b();
            Thread thread = this.e;
            if (thread != null) {
                thread.join();
            }
        } catch (Exception e2) {
            k.log(Level.SEVERE, "Could not stop all connections", (Throwable) e2);
        }
    }

    protected boolean w(o oVar) {
        if (oVar.d() != null) {
            return oVar.d().toLowerCase().contains("text/") || oVar.d().toLowerCase().contains("/json");
        }
        return false;
    }

    public static final class p extends Exception {
        private final o.d q;

        public p(o.d dVar, String str) {
            super(str);
            this.q = dVar;
        }

        public o.d a() {
            return this.q;
        }

        public p(o.d dVar, String str, Exception exc) {
            super(str, exc);
            this.q = dVar;
        }
    }

    public a(String str, int i2) {
        this.d = new h();
        this.a = str;
        this.b = i2;
        t(new k());
        s(new g());
    }
}
