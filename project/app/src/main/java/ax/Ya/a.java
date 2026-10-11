/*
 * Decompiled with CFR 0.152.
 */
package ax.Ya;

import ax.u3.w;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
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
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.text.DateFormat;
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

public abstract class a {
    private static final Pattern h = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
    private static final Pattern i = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
    private static final Pattern j = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
    private static final Logger k = Logger.getLogger(a.class.getName());
    private final String a;
    private final int b;
    private volatile ServerSocket c;
    private r d = new h();
    private Thread e;
    protected b f;
    private u g;

    public a(int n8) {
        this(null, n8);
    }

    public a(String string, int n8) {
        this.a = string;
        this.b = n8;
        this.t(new k(this));
        this.s(new g());
    }

    static /* synthetic */ Pattern d() {
        return h;
    }

    static /* synthetic */ Pattern e() {
        return j;
    }

    static /* synthetic */ Pattern f() {
        return i;
    }

    protected static String l(String string) {
        try {
            string = j.URLDecoder.decode((String)string, (String)"UTF8");
            return string;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            k.log(Level.WARNING, "Encoding not supported, ignored", unsupportedEncodingException);
            return null;
        }
    }

    public static o n(o.c c8, String string, InputStream inputStream, long l8) {
        return new o(c8, string, inputStream, l8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static o o(o.c c8, String object, String object2) {
        UnsupportedEncodingException unsupportedEncodingException2;
        Object object3;
        block4: {
            block3: {
                d d8 = new d((String)object);
                if (object2 == null) {
                    return ax.Ya.a.n(c8, (String)object, new ByteArrayInputStream(new byte[0]), 0L);
                }
                object3 = d8;
                object = d8;
                try {
                    if (Charset.forName(d8.e()).newEncoder().canEncode((CharSequence)object2)) break block3;
                    object3 = d8;
                    object = d8.g();
                }
                catch (UnsupportedEncodingException unsupportedEncodingException2) {
                    break block4;
                }
            }
            object3 = object;
            object2 = ((String)object2).getBytes(((d)object).e());
            object3 = object;
            object = object2;
            return ax.Ya.a.n(c8, ((d)object3).c(), new ByteArrayInputStream((byte[])object), ((Object)object).length);
        }
        k.log(Level.SEVERE, "encoding problem, responding nothing", unsupportedEncodingException2);
        object = new byte[0];
        return ax.Ya.a.n(c8, ((d)object3).c(), new ByteArrayInputStream((byte[])object), ((Object)object).length);
    }

    private static final void p(Object object) {
        if (object != null) {
            try {
                if (object instanceof Closeable) {
                    ((Closeable)object).close();
                    return;
                }
                if (object instanceof Socket) {
                    ((Socket)object).close();
                    return;
                }
                if (object instanceof ServerSocket) {
                    ((ServerSocket)object).close();
                    return;
                }
                object = new IllegalArgumentException("Unknown object to close");
                throw object;
            }
            catch (IOException iOException) {
                k.log(Level.SEVERE, "Could not close", iOException);
            }
        }
    }

    protected c j(Socket socket, InputStream inputStream) {
        return new c(this, inputStream, socket);
    }

    protected q k(int n8) {
        return new q(this, n8);
    }

    public r m() {
        return this.d;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public o q(m m8) {
        Object object = new HashMap<String, String>();
        n n8 = m8.f();
        if (((Object)((Object)n.c0)).equals((Object)n8) || ((Object)((Object)n.d0)).equals((Object)n8)) {
            try {
                m8.e((Map<String, String>)object);
            }
            catch (p p8) {
                return ax.Ya.a.o(p8.a(), "text/plain", p8.getMessage());
            }
            catch (IOException iOException) {
                object = o.d.F0;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SERVER INTERNAL ERROR: IOException: ");
                stringBuilder.append(iOException.getMessage());
                return ax.Ya.a.o((o.c)object, "text/plain", stringBuilder.toString());
            }
        }
        Map<String, String> map = m8.c();
        map.put("NanoHttpd.QUERY_STRING", m8.g());
        return this.r(m8.b(), n8, m8.a(), map, (Map<String, String>)object);
    }

    @Deprecated
    public o r(String string, n n8, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        return ax.Ya.a.o(o.d.s0, "text/plain", "Not Found");
    }

    public void s(b b8) {
        this.f = b8;
    }

    public void t(u u8) {
        this.g = u8;
    }

    public void u(int n8, boolean bl) throws IOException {
        Thread thread;
        this.c = this.m().a();
        this.c.setReuseAddress(true);
        q q8 = this.k(n8);
        this.e = thread = new Thread(q8);
        thread.setDaemon(bl);
        this.e.setName("NanoHttpd Main Listener");
        this.e.start();
        while (!q8.d0 && q8.c0 == null) {
            try {
                Thread.sleep(10L);
            }
            catch (Throwable throwable) {}
        }
        if (q8.c0 == null) {
            return;
        }
        throw q8.c0;
    }

    public void v() {
        block3: {
            ax.Ya.a.p(this.c);
            this.f.b();
            Thread thread = this.e;
            if (thread == null) break block3;
            try {
                thread.join();
                return;
            }
            catch (Exception exception) {
                k.log(Level.SEVERE, "Could not stop all connections", exception);
            }
        }
    }

    protected boolean w(o o8) {
        return o8.d() != null && (o8.d().toLowerCase().contains("text/") || o8.d().toLowerCase().contains("/json"));
    }

    public static interface b {
        public void a(c var1);

        public void b();

        public void c(c var1);
    }

    public class c
    implements Runnable {
        private final Socket c0;
        final a d0;
        private final InputStream q;

        public c(a a8, InputStream inputStream, Socket socket) {
            this.d0 = a8;
            this.q = inputStream;
            this.c0 = socket;
        }

        public void a() {
            ax.Ya.a.p(this.q);
            ax.Ya.a.p(this.c0);
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void run() {
            Object object;
            Object object2;
            block9: {
                block11: {
                    block10: {
                        Object var4_1 = null;
                        object2 = null;
                        try {
                            object = this.c0.getOutputStream();
                        }
                        catch (Throwable throwable) {
                            break block9;
                        }
                        catch (Exception exception) {
                            object = var4_1;
                            break block10;
                        }
                        try {
                            object2 = this.d0.g.a();
                            l l8 = new l(this.d0, (t)object2, this.q, (OutputStream)object, this.c0.getInetAddress());
                            while (!this.c0.isClosed()) {
                                l8.k();
                            }
                        }
                        catch (Throwable throwable) {
                            OutputStream outputStream = object;
                            object = throwable;
                            object2 = outputStream;
                            break block9;
                        }
                        catch (Exception exception) {
                            break block10;
                        }
                        ax.Ya.a.p(object);
                        ax.Ya.a.p(this.q);
                        ax.Ya.a.p(this.c0);
                        this.d0.f.c(this);
                        return;
                    }
                    object2 = object;
                    {
                        Throwable var3_10;
                        if (var3_10 instanceof SocketException) {
                            object2 = object;
                            if ("NanoHttpd Shutdown".equals(var3_10.getMessage())) break block11;
                        }
                        object2 = object;
                        if (var3_10 instanceof SocketTimeoutException) break block11;
                        object2 = object;
                        k.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable)var3_10);
                    }
                }
                ax.Ya.a.p(object);
                ax.Ya.a.p(this.q);
                ax.Ya.a.p(this.c0);
                this.d0.f.c(this);
                return;
            }
            ax.Ya.a.p(object2);
            ax.Ya.a.p(this.q);
            ax.Ya.a.p(this.c0);
            this.d0.f.c(this);
            throw object;
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

        public d(String string) {
            this.a = string;
            if (string != null) {
                this.b = this.d(string, e, "", 1);
                this.c = this.d(string, f, null, 2);
            } else {
                this.b = "";
                this.c = "UTF-8";
            }
            if ("multipart/form-data".equalsIgnoreCase(this.b)) {
                this.d = this.d(string, g, null, 2);
                return;
            }
            this.d = null;
        }

        private String d(String object, Pattern pattern, String string, int n8) {
            if (((Matcher)(object = pattern.matcher((CharSequence)object))).find()) {
                return ((Matcher)object).group(n8);
            }
            return string;
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
            String string;
            String string2 = string = this.c;
            if (string == null) {
                string2 = "US-ASCII";
            }
            return string2;
        }

        public boolean f() {
            return "multipart/form-data".equalsIgnoreCase(this.b);
        }

        public d g() {
            if (this.c == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.a);
                stringBuilder.append("; charset=UTF-8");
                return new d(stringBuilder.toString());
            }
            return this;
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

    public class f
    implements Iterable<String> {
        private final ArrayList<e> c0;
        final a d0;
        private final HashMap<String, String> q;

        public f(a stringArray, Map<String, String> stringArray2) {
            this.d0 = stringArray;
            this.q = new HashMap();
            this.c0 = new ArrayList();
            stringArray = stringArray2.get("cookie");
            if (stringArray != null) {
                stringArray2 = stringArray.split(";");
                int n8 = stringArray2.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    stringArray = stringArray2[i8].trim().split("=");
                    if (stringArray.length != 2) continue;
                    this.q.put(stringArray[0], stringArray[1]);
                }
            }
        }

        public void e(o o8) {
            ArrayList<e> arrayList = this.c0;
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                e e8 = arrayList.get(i8);
                o8.b("Set-Cookie", e8.a());
            }
        }

        @Override
        public Iterator<String> iterator() {
            return this.q.keySet().iterator();
        }
    }

    public static class g
    implements b {
        private long a;
        private final List<c> b = java.util.DesugarCollections.synchronizedList(new ArrayList());

        @Override
        public void a(c c8) {
            ++this.a;
            Thread thread = new Thread(c8);
            thread.setDaemon(true);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("NanoHttpd Request Processor (#");
            stringBuilder.append(this.a);
            stringBuilder.append(")");
            thread.setName(stringBuilder.toString());
            this.b.add(c8);
            thread.start();
        }

        @Override
        public void b() {
            ArrayList<c> arrayList = new ArrayList<c>(this.b);
            int n8 = arrayList.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                c c8 = arrayList.get(i8);
                c8.a();
            }
        }

        @Override
        public void c(c c8) {
            this.b.remove(c8);
        }

        public List<c> d() {
            return this.b;
        }
    }

    public static class h
    implements r {
        @Override
        public ServerSocket a() throws IOException {
            return new ServerSocket();
        }
    }

    public static class i
    implements s {
        private final File a;
        private final OutputStream b;

        public i(File file) throws IOException {
            this.a = file = this.a(file);
            this.b = new FileOutputStream(file);
        }

        File a(File file) throws IOException {
            block1: {
                File file2;
                long l8 = System.currentTimeMillis();
                l8 = l8 == Long.MIN_VALUE ? 0L : Math.abs(l8);
                do {
                    CharSequence charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append("NanoHTTPD-");
                    ((StringBuilder)charSequence).append(Long.toString(l8));
                    charSequence = ((StringBuilder)charSequence).toString();
                    file2 = new File(file, (String)charSequence);
                    if (!((String)charSequence).equals(file2.getName())) break block1;
                    ++l8;
                } while (file2.exists());
                return file2;
            }
            throw new IOException("Unable to create temporary file");
        }

        @Override
        public void delete() throws Exception {
            ax.Ya.a.p(this.b);
            if (this.a.delete()) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("could not delete temporary file: ");
            stringBuilder.append(this.a.getAbsolutePath());
            throw new Exception(stringBuilder.toString());
        }

        @Override
        public String getName() {
            return this.a.getAbsolutePath();
        }
    }

    public static class j
    implements t {
        private final File a;
        private final List<s> b;

        public j() {
            File file;
            this.a = file = new File(System.getProperty("java.io.tmpdir"));
            if (!file.exists()) {
                file.mkdirs();
            }
            this.b = new ArrayList<s>();
        }

        @Override
        public s a(String object) throws Exception {
            object = new i(this.a);
            this.b.add((s)object);
            return object;
        }

        @Override
        public void clear() {
            for (s s8 : this.b) {
                try {
                    s8.delete();
                }
                catch (Exception exception) {
                    k.log(Level.WARNING, "could not delete file ", exception);
                }
            }
            this.b.clear();
        }
    }

    private class k
    implements u {
        final a a;

        private k(a a8) {
            this.a = a8;
        }

        @Override
        public t a() {
            return new j();
        }
    }

    protected class l
    implements m {
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
        final a o;

        public l(a object, t t8, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
            this.o = object;
            this.a = t8;
            this.c = new BufferedInputStream(inputStream, 8192);
            this.b = outputStream;
            object = !inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress() ? inetAddress.getHostAddress().toString() : "127.0.0.1";
            this.l = object;
            object = !inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress() ? inetAddress.getHostName().toString() : "localhost";
            this.m = object;
            this.i = new HashMap<String, String>();
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void h(BufferedReader object, Map<String, String> object2, Map<String, List<String>> object3, Map<String, String> map) throws p {
            IOException iOException2;
            block11: {
                int n8;
                Object object4;
                block10: {
                    String string;
                    block9: {
                        try {
                            string = ((BufferedReader)object).readLine();
                            if (string == null) {
                                return;
                            }
                            object4 = new StringTokenizer(string);
                            if (!((StringTokenizer)object4).hasMoreTokens()) {
                                object = new p(o.d.p0, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                                throw object;
                            }
                            object2.put("method", ((StringTokenizer)object4).nextToken());
                            if (!((StringTokenizer)object4).hasMoreTokens()) {
                                object = new p(o.d.p0, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                                throw object;
                            }
                            string = ((StringTokenizer)object4).nextToken();
                            n8 = string.indexOf(63);
                            if (n8 < 0) break block9;
                            this.j(string.substring(n8 + 1), (Map<String, List<String>>)object3);
                            object3 = ax.Ya.a.l(string.substring(0, n8));
                            break block10;
                        }
                        catch (IOException iOException2) {
                            break block11;
                        }
                    }
                    object3 = ax.Ya.a.l(string);
                }
                if (((StringTokenizer)object4).hasMoreTokens()) {
                    this.n = ((StringTokenizer)object4).nextToken();
                } else {
                    this.n = "HTTP/1.1";
                    k.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                }
                object4 = ((BufferedReader)object).readLine();
                while (object4 != null && !((String)object4).trim().isEmpty()) {
                    n8 = ((String)object4).indexOf(58);
                    if (n8 >= 0) {
                        map.put(((String)object4).substring(0, n8).trim().toLowerCase(Locale.US), ((String)object4).substring(n8 + 1).trim());
                    }
                    object4 = ((BufferedReader)object).readLine();
                }
                object2.put("uri", object3);
                return;
            }
            object = o.d.F0;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("SERVER INTERNAL ERROR: IOException: ");
            ((StringBuilder)object2).append(iOException2.getMessage());
            throw new p((o.d)object, ((StringBuilder)object2).toString(), iOException2);
        }

        /*
         * Exception decompiling
         */
        private void i(d var1_1, ByteBuffer var2_4, Map<String, List<String>> var3_5, Map<String, String> var4_6) throws p {
            /*
             * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
             * 
             * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [5, 4 : 86->151)] java.lang.Exception
             *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
             *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
             *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
             *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:923)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
             *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
             *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
             *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
             *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
             *     at org.benf.cfr.reader.Main.main(Main.java:54)
             */
            throw new IllegalStateException("Decompilation failed");
        }

        private void j(String string, Map<String, List<String>> map) {
            if (string == null) {
                this.k = "";
                return;
            }
            this.k = string;
            StringTokenizer stringTokenizer = new StringTokenizer(string, "&");
            while (stringTokenizer.hasMoreTokens()) {
                List<String> list;
                String string2 = stringTokenizer.nextToken();
                int n8 = string2.indexOf(61);
                if (n8 >= 0) {
                    string = ax.Ya.a.l(string2.substring(0, n8)).trim();
                    string2 = ax.Ya.a.l(string2.substring(n8 + 1));
                } else {
                    string = ax.Ya.a.l(string2).trim();
                    string2 = "";
                }
                List<String> list2 = list = map.get(string);
                if (list == null) {
                    list2 = new ArrayList<String>();
                    map.put(string, list2);
                }
                list2.add(string2);
            }
        }

        private int l(byte[] byArray, int n8) {
            int n9;
            int n10 = 0;
            while ((n9 = n10 + 1) < n8) {
                int n11;
                byte by = byArray[n10];
                if (by == 13 && byArray[n9] == 10 && (n11 = n10 + 3) < n8 && byArray[n10 + 2] == 13 && byArray[n11] == 10) {
                    return n10 + 4;
                }
                if (by == 10 && byArray[n9] == 10) {
                    return n10 + 2;
                }
                n10 = n9;
            }
            return 0;
        }

        private int[] n(ByteBuffer byteBuffer, byte[] byArray) {
            int[] nArray;
            int[] nArray2 = new int[]{};
            if (byteBuffer.remaining() < byArray.length) {
                return nArray2;
            }
            int n8 = byArray.length + 4096;
            byte[] byArray2 = new byte[n8];
            int n9 = byteBuffer.remaining() < n8 ? byteBuffer.remaining() : n8;
            byteBuffer.get(byArray2, 0, n9);
            int n10 = n9 - byArray.length;
            int n11 = 0;
            do {
                nArray = nArray2;
                for (n9 = 0; n9 < n10; ++n9) {
                    nArray2 = nArray;
                    for (int i8 = 0; i8 < byArray.length && byArray2[n9 + i8] == byArray[i8]; ++i8) {
                        nArray = nArray2;
                        if (i8 == byArray.length - 1) {
                            nArray = new int[nArray2.length + 1];
                            System.arraycopy(nArray2, 0, nArray, 0, nArray2.length);
                            nArray[nArray2.length] = n11 + n9;
                        }
                        nArray2 = nArray;
                    }
                    nArray = nArray2;
                }
                n11 += n10;
                System.arraycopy(byArray2, n8 - byArray.length, byArray2, 0, byArray.length);
                n9 = n10 = n8 - byArray.length;
                if (byteBuffer.remaining() < n10) {
                    n9 = byteBuffer.remaining();
                }
                byteBuffer.get(byArray2, byArray.length, n9);
                nArray2 = nArray;
                n10 = n9;
            } while (n9 > 0);
            return nArray;
        }

        private RandomAccessFile o() {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.a.a(null).getName(), "rw");
                return randomAccessFile;
            }
            catch (Exception exception) {
                throw new Error(exception);
            }
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private String p(ByteBuffer object, int n8, int n9, String object2) {
            Object object3;
            block8: {
                Error error;
                block9: {
                    ByteBuffer byteBuffer;
                    if (n9 <= 0) {
                        return "";
                    }
                    error = null;
                    ByteBuffer byteBuffer2 = null;
                    object3 = byteBuffer2;
                    try {
                        object2 = this.a.a((String)object2);
                        object3 = byteBuffer2;
                        byteBuffer = ((ByteBuffer)object).duplicate();
                        object3 = byteBuffer2;
                        object3 = byteBuffer2;
                        object = new FileOutputStream(object2.getName());
                    }
                    catch (Throwable throwable) {
                        break block8;
                    }
                    catch (Exception exception) {
                        object = error;
                        break block9;
                    }
                    try {
                        object3 = ax.g2.b.a((FileOutputStream)object);
                        byteBuffer.position(n8).limit(n8 + n9);
                        ((FileChannel)object3).write(byteBuffer.slice());
                        object2 = object2.getName();
                    }
                    catch (Throwable throwable) {
                        object3 = object;
                        object = throwable;
                        break block8;
                    }
                    catch (Exception exception) {
                        break block9;
                    }
                    ax.Ya.a.p(object);
                    return object2;
                }
                object3 = object;
                {
                    Throwable var4_9;
                    object3 = object;
                    error = new Error((Throwable)var4_9);
                    object3 = object;
                    throw error;
                }
            }
            ax.Ya.a.p(object3);
            throw object;
        }

        private int q(byte[] byArray, int n8) {
            while (byArray[n8] != 10) {
                ++n8;
            }
            return n8 + 1;
        }

        @Override
        public final Map<String, String> a() {
            return this.i;
        }

        @Override
        public final String b() {
            return this.f;
        }

        @Override
        @Deprecated
        public final Map<String, String> c() {
            HashMap<String, String> hashMap = new HashMap<String, String>();
            for (String string : this.h.keySet()) {
                hashMap.put(string, this.h.get(string).get(0));
            }
            return hashMap;
        }

        @Override
        public final Map<String, List<String>> d() {
            return this.h;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void e(Map<String, String> var1_1) throws IOException, p {
            block15: {
                block20: {
                    block18: {
                        block19: {
                            block17: {
                                block16: {
                                    block14: {
                                        block13: {
                                            var8_5 = null;
                                            try {
                                                var3_6 = this.m();
                                                if (var3_6 >= 1024L) break block13;
                                                var9_7 = new ByteArrayOutputStream();
                                                var7_8 = new DataOutputStream((OutputStream)var9_7);
                                                var8_5 = var7_8;
                                                var7_8 = null;
                                                break block14;
                                            }
                                            catch (Throwable var1_2) {
                                                var7_8 = var8_5;
                                                break block15;
                                            }
                                        }
                                        var7_8 = this.o();
                                        var9_7 = null;
                                        var8_5 = var7_8;
                                    }
                                    try {
                                        var10_9 = new byte[512];
lbl20:
                                        // 3 sources

                                        while (this.e >= 0 && var3_6 > 0L) {
                                            this.e = var2_10 = this.c.read(var10_9, 0, (int)Math.min(var3_6, 512L));
                                            break block16;
                                        }
                                        break block17;
                                    }
                                    catch (Throwable var1_3) {
                                        break block15;
                                    }
                                }
                                var3_6 = var5_11 = var3_6 - (long)var2_10;
                                if (var2_10 <= 0) ** GOTO lbl20
                                var8_5.write(var10_9, 0, var2_10);
                                var3_6 = var5_11;
                                ** GOTO lbl20
                            }
                            if (var9_7 != null) {
                                var8_5 = ByteBuffer.wrap(var9_7.toByteArray(), 0, var9_7.size());
                            } else {
                                var8_5 = w.a((RandomAccessFile)var7_8).map(FileChannel.MapMode.READ_ONLY, 0L, var7_8.length());
                                var7_8.seek(0L);
                            }
                            if (!ax.Ya.a$n.d0.equals((Object)this.g)) break block18;
                            var9_7 = new d(this.i.get("content-type"));
                            if (!var9_7.f()) break block19;
                            if (var9_7.a() == null) {
                                var1_1 = new p(o.d.p0, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                                throw var1_1;
                            }
                            this.i((d)var9_7, (ByteBuffer)var8_5, this.h, (Map<String, String>)var1_1);
                            break block20;
                        }
                        var10_9 = new byte[var8_5.remaining()];
                        var8_5.get(var10_9);
                        var8_5 = new String(var10_9, var9_7.e());
                        var8_5 = var8_5.trim();
                        if ("application/x-www-form-urlencoded".equalsIgnoreCase(var9_7.b())) {
                            this.j((String)var8_5, this.h);
                            break block20;
                        } else if (var8_5.length() != 0) {
                            var1_1.put("postData", var8_5);
                        }
                        break block20;
                    }
                    if (ax.Ya.a$n.c0.equals((Object)this.g)) {
                        var1_1.put((String)"content", (String)this.p((ByteBuffer)var8_5, 0, var8_5.limit(), null));
                    }
                }
                ax.Ya.a.a(var7_8);
                return;
            }
            ax.Ya.a.a(var7_8);
            throw var1_4;
        }

        @Override
        public final n f() {
            return this.g;
        }

        @Override
        public String g() {
            return this.k;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void k() throws IOException {
            block32: {
                block30: {
                    block33: {
                        block31: {
                            var16_1 = null;
                            var14_2 = null;
                            var15_3 = null;
                            var6_4 = null;
                            var12_10 = null;
                            var13_11 = null;
                            var5_12 = var13_11;
                            var9_15 = var16_1;
                            var7_17 = var14_2;
                            var8_18 = var15_3;
                            var10_19 = var6_4;
                            var11_20 = var12_10;
                            try {
                                try {
                                    var17_21 = new byte[8192];
                                    var4_23 = false;
                                    var5_12 = var13_11;
                                    var9_15 = var16_1;
                                    var7_17 = var14_2;
                                    var8_18 = var15_3;
                                    var10_19 = var6_4;
                                    var11_20 = var12_10;
                                    this.d = 0;
                                    var5_12 = var13_11;
                                    var9_15 = var16_1;
                                    var7_17 = var14_2;
                                    var8_18 = var15_3;
                                    var10_19 = var6_4;
                                    var11_20 = var12_10;
                                    this.e = 0;
                                    var5_12 = var13_11;
                                    var9_15 = var16_1;
                                    var7_17 = var14_2;
                                    var8_18 = var15_3;
                                    var10_19 = var6_4;
                                    var11_20 = var12_10;
                                    this.c.mark(8192);
                                    var5_12 = var13_11;
                                    var9_15 = var16_1;
                                }
                                catch (IOException var6_7) {
                                    break block30;
                                }
                                catch (SSLException var9_16) {
                                    ** GOTO lbl634
                                }
                                catch (SocketTimeoutException var6_8) {
                                    ** GOTO lbl651
                                }
                                catch (SocketException var6_9) {
                                    ** GOTO lbl653
                                }
                                var1_24 = this.c.read((byte[])var17_21, 0, 8192);
                                ** if (var1_24 == -1) goto lbl106
lbl-1000:
                                // 2 sources

                                {
                                    while (var1_24 > 0) {
                                        var5_12 = var13_11;
                                        var9_15 = var16_1;
                                        var7_17 = var14_2;
                                        var8_18 = var15_3;
                                        var10_19 = var6_4;
                                        var11_20 = var12_10;
                                        var1_24 = this.e + var1_24;
                                        var5_12 = var13_11;
                                        var9_15 = var16_1;
                                        var7_17 = var14_2;
                                        var8_18 = var15_3;
                                        var10_19 = var6_4;
                                        var11_20 = var12_10;
                                        this.e = var1_24;
                                        var5_12 = var13_11;
                                        var9_15 = var16_1;
                                        var7_17 = var14_2;
                                        var8_18 = var15_3;
                                        var10_19 = var6_4;
                                        var11_20 = var12_10;
                                        var1_24 = this.l((byte[])var17_21, var1_24);
                                        var5_12 = var13_11;
                                        var9_15 = var16_1;
                                        var7_17 = var14_2;
                                        var8_18 = var15_3;
                                        var10_19 = var6_4;
                                        var11_20 = var12_10;
                                        this.d = var1_24;
                                        if (var1_24 <= 0) {
                                            var5_12 = var13_11;
                                            var9_15 = var16_1;
                                            var7_17 = var14_2;
                                            var8_18 = var15_3;
                                            var10_19 = var6_4;
                                            var11_20 = var12_10;
                                            var18_25 = this.c;
                                            var5_12 = var13_11;
                                            var9_15 = var16_1;
                                            var7_17 = var14_2;
                                            var8_18 = var15_3;
                                            var10_19 = var6_4;
                                            var11_20 = var12_10;
                                            var1_24 = this.e;
                                            var5_12 = var13_11;
                                            var9_15 = var16_1;
                                            var7_17 = var14_2;
                                            var8_18 = var15_3;
                                            var10_19 = var6_4;
                                            var11_20 = var12_10;
                                            var1_24 = var18_25.read((byte[])var17_21, var1_24, 8192 - var1_24);
                                            continue;
                                        }
                                        break block31;
                                    }
                                }
lbl106:
                                // 1 sources

                                ** GOTO lbl564
                            }
                            catch (Throwable var6_5) {
                                break block32;
                            }
                            catch (p var6_6) {
                                break block33;
                            }
                        }
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        if (this.d < this.e) {
                            var5_12 = var13_11;
                            var9_15 = var16_1;
                            var7_17 = var14_2;
                            var8_18 = var15_3;
                            var10_19 = var6_4;
                            var11_20 = var12_10;
                            this.c.reset();
                            var5_12 = var13_11;
                            var9_15 = var16_1;
                            var7_17 = var14_2;
                            var8_18 = var15_3;
                            var10_19 = var6_4;
                            var11_20 = var12_10;
                            this.c.skip(this.d);
                        }
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        var18_25 = new HashMap();
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        this.h = var18_25;
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        var18_25 = this.i;
                        if (var18_25 == null) {
                            var5_12 = var13_11;
                            var9_15 = var16_1;
                            var7_17 = var14_2;
                            var8_18 = var15_3;
                            var10_19 = var6_4;
                            var11_20 = var12_10;
                            var5_12 = var13_11;
                            var9_15 = var16_1;
                            var7_17 = var14_2;
                            var8_18 = var15_3;
                            var10_19 = var6_4;
                            var11_20 = var12_10;
                            var18_25 = new HashMap();
                            var5_12 = var13_11;
                            var9_15 = var16_1;
                            var7_17 = var14_2;
                            var8_18 = var15_3;
                            var10_19 = var6_4;
                            var11_20 = var12_10;
                            this.i = var18_25;
                        } else {
                            var5_12 = var13_11;
                            var9_15 = var16_1;
                            var7_17 = var14_2;
                            var8_18 = var15_3;
                            var10_19 = var6_4;
                            var11_20 = var12_10;
                            var18_25.clear();
                        }
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        var20_27 = new ByteArrayInputStream((byte[])var17_21, 0, this.e);
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        var19_26 = new InputStreamReader((InputStream)var20_27);
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        var18_25 = new BufferedReader((Reader)var19_26);
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        var17_21 = new HashMap;
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        var17_21();
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        this.h((BufferedReader)var18_25, (Map<String, String>)var17_21, this.h, this.i);
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        var18_25 = this.l;
                        if (var18_25 != null) {
                            var5_12 = var13_11;
                            var9_15 = var16_1;
                            var7_17 = var14_2;
                            var8_18 = var15_3;
                            var10_19 = var6_4;
                            var11_20 = var12_10;
                            this.i.put("remote-addr", (String)var18_25);
                            var5_12 = var13_11;
                            var9_15 = var16_1;
                            var7_17 = var14_2;
                            var8_18 = var15_3;
                            var10_19 = var6_4;
                            var11_20 = var12_10;
                            this.i.put("http-client-ip", this.l);
                        }
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        var18_25 = ax.Ya.a$n.h((String)var17_21.get("method"));
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        this.g = var18_25;
                        if (var18_25 == null) ** GOTO lbl462
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        this.f = (String)var17_21.get("uri");
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        var17_21 = new f(this.o, this.i);
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        this.j = var17_21;
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        var17_21 = this.i.get("connection");
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        if (!"HTTP/1.1".equals(this.n)) ** GOTO lbl-1000
                        if (var17_21 == null) ** GOTO lbl-1000
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        if (!var17_21.matches("(?i).*close.*")) lbl-1000:
                        // 2 sources

                        {
                            var2_28 = true;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var2_28 = false;
                        }
                        var5_12 = var13_11;
                        var9_15 = var16_1;
                        var7_17 = var14_2;
                        var8_18 = var15_3;
                        var10_19 = var6_4;
                        var11_20 = var12_10;
                        var6_4 = this.o.q(this);
                        if (var6_4 == null) ** GOTO lbl442
                        var5_12 = var6_4;
                        var9_15 = var6_4;
                        var7_17 = var6_4;
                        var8_18 = var6_4;
                        var10_19 = var6_4;
                        var11_20 = var6_4;
                        var12_10 = this.i.get("accept-encoding");
                        var5_12 = var6_4;
                        var9_15 = var6_4;
                        var7_17 = var6_4;
                        var8_18 = var6_4;
                        var10_19 = var6_4;
                        var11_20 = var6_4;
                        this.j.e((o)var6_4);
                        var5_12 = var6_4;
                        var9_15 = var6_4;
                        var7_17 = var6_4;
                        var8_18 = var6_4;
                        var10_19 = var6_4;
                        var11_20 = var6_4;
                        var6_4.A(this.g);
                        var5_12 = var6_4;
                        var9_15 = var6_4;
                        var7_17 = var6_4;
                        var8_18 = var6_4;
                        var10_19 = var6_4;
                        var11_20 = var6_4;
                        var3_29 = var4_23;
                        if (this.o.w((o)var6_4)) {
                            var3_29 = var4_23;
                            if (var12_10 != null) {
                                var5_12 = var6_4;
                                var9_15 = var6_4;
                                var7_17 = var6_4;
                                var8_18 = var6_4;
                                var10_19 = var6_4;
                                var11_20 = var6_4;
                                var3_29 = var4_23;
                                if (var12_10.contains("gzip")) {
                                    var3_29 = true;
                                }
                            }
                        }
                        var5_12 = var6_4;
                        var9_15 = var6_4;
                        var7_17 = var6_4;
                        var8_18 = var6_4;
                        var10_19 = var6_4;
                        var11_20 = var6_4;
                        var6_4.u(var3_29);
                        var5_12 = var6_4;
                        var9_15 = var6_4;
                        var7_17 = var6_4;
                        var8_18 = var6_4;
                        var10_19 = var6_4;
                        var11_20 = var6_4;
                        var6_4.v(var2_28);
                        var5_12 = var6_4;
                        var9_15 = var6_4;
                        var7_17 = var6_4;
                        var8_18 = var6_4;
                        var10_19 = var6_4;
                        var11_20 = var6_4;
                        var6_4.g(this.b);
                        if (var2_28) {
                            var5_12 = var6_4;
                            var9_15 = var6_4;
                            var7_17 = var6_4;
                            var8_18 = var6_4;
                            var10_19 = var6_4;
                            var11_20 = var6_4;
                            var2_28 = var6_4.e();
                            if (!var2_28) {
                                ax.Ya.a.a(var6_4);
                                this.a.clear();
                                return;
                            }
                        }
                        var5_12 = var6_4;
                        var9_15 = var6_4;
                        var7_17 = var6_4;
                        var8_18 = var6_4;
                        var10_19 = var6_4;
                        var11_20 = var6_4;
                        {
                            block34: {
                                var5_12 = var6_4;
                                var9_15 = var6_4;
                                var7_17 = var6_4;
                                var8_18 = var6_4;
                                var10_19 = var6_4;
                                var11_20 = var6_4;
                                var12_10 = new SocketException("NanoHttpd Shutdown");
                                var5_12 = var6_4;
                                var9_15 = var6_4;
                                var7_17 = var6_4;
                                var8_18 = var6_4;
                                var10_19 = var6_4;
                                var11_20 = var6_4;
                                throw var12_10;
lbl442:
                                // 1 sources

                                var5_12 = var6_4;
                                var9_15 = var6_4;
                                var7_17 = var6_4;
                                var8_18 = var6_4;
                                var10_19 = var6_4;
                                var11_20 = var6_4;
                                var5_12 = var6_4;
                                var9_15 = var6_4;
                                var7_17 = var6_4;
                                var8_18 = var6_4;
                                var10_19 = var6_4;
                                var11_20 = var6_4;
                                var12_10 = new p(o.d.F0, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                                var5_12 = var6_4;
                                var9_15 = var6_4;
                                var7_17 = var6_4;
                                var8_18 = var6_4;
                                var10_19 = var6_4;
                                var11_20 = var6_4;
                                throw var12_10;
lbl462:
                                // 1 sources

                                var5_12 = var13_11;
                                var9_15 = var16_1;
                                var7_17 = var14_2;
                                var8_18 = var15_3;
                                var10_19 = var6_4;
                                var11_20 = var12_10;
                                var5_12 = var13_11;
                                var9_15 = var16_1;
                                var7_17 = var14_2;
                                var8_18 = var15_3;
                                var10_19 = var6_4;
                                var11_20 = var12_10;
                                var20_27 = o.d.p0;
                                var5_12 = var13_11;
                                var9_15 = var16_1;
                                var7_17 = var14_2;
                                var8_18 = var15_3;
                                var10_19 = var6_4;
                                var11_20 = var12_10;
                                var5_12 = var13_11;
                                var9_15 = var16_1;
                                var7_17 = var14_2;
                                var8_18 = var15_3;
                                var10_19 = var6_4;
                                var11_20 = var12_10;
                                var18_25 = new StringBuilder();
                                var5_12 = var13_11;
                                var9_15 = var16_1;
                                var7_17 = var14_2;
                                var8_18 = var15_3;
                                var10_19 = var6_4;
                                var11_20 = var12_10;
                                var18_25.append("BAD REQUEST: Syntax error. HTTP verb ");
                                var5_12 = var13_11;
                                var9_15 = var16_1;
                                var7_17 = var14_2;
                                var8_18 = var15_3;
                                var10_19 = var6_4;
                                var11_20 = var12_10;
                                var18_25.append((String)var17_21.get("method"));
                                var5_12 = var13_11;
                                var9_15 = var16_1;
                                var7_17 = var14_2;
                                var8_18 = var15_3;
                                var10_19 = var6_4;
                                var11_20 = var12_10;
                                var18_25.append(" unhandled.");
                                var5_12 = var13_11;
                                var9_15 = var16_1;
                                var7_17 = var14_2;
                                var8_18 = var15_3;
                                var10_19 = var6_4;
                                var11_20 = var12_10;
                                var19_26 = new p((o.d)var20_27, var18_25.toString());
                                var5_12 = var13_11;
                                var9_15 = var16_1;
                                var7_17 = var14_2;
                                var8_18 = var15_3;
                                var10_19 = var6_4;
                                var11_20 = var12_10;
                                throw var19_26;
                                catch (SSLException var17_22) {
                                    break block34;
                                }
                                catch (IOException var5_13) {
                                    var5_14 = var13_11;
                                    var9_15 = var16_1;
                                    var7_17 = var14_2;
                                    var8_18 = var15_3;
                                    var10_19 = var6_4;
                                    var11_20 = var12_10;
                                    ax.Ya.a.a(this.c);
                                    var5_14 = var13_11;
                                    var9_15 = var16_1;
                                    var7_17 = var14_2;
                                    var8_18 = var15_3;
                                    var10_19 = var6_4;
                                    var11_20 = var12_10;
                                    ax.Ya.a.a(this.b);
                                    var5_14 = var13_11;
                                    var9_15 = var16_1;
                                    var7_17 = var14_2;
                                    var8_18 = var15_3;
                                    var10_19 = var6_4;
                                    var11_20 = var12_10;
                                    var17_21 = new SocketException;
                                    var5_14 = var13_11;
                                    var9_15 = var16_1;
                                    var7_17 = var14_2;
                                    var8_18 = var15_3;
                                    var10_19 = var6_4;
                                    var11_20 = var12_10;
                                    var17_21 = new SocketException("NanoHttpd Shutdown");
                                    var5_14 = var13_11;
                                    var9_15 = var16_1;
                                    var7_17 = var14_2;
                                    var8_18 = var15_3;
                                    var10_19 = var6_4;
                                    var11_20 = var12_10;
                                    throw var17_21;
                                }
lbl564:
                                // 1 sources

                                var5_12 = var13_11;
                                var9_15 = var16_1;
                                var7_17 = var14_2;
                                var8_18 = var15_3;
                                var10_19 = var6_4;
                                var11_20 = var12_10;
                                ax.Ya.a.a(this.c);
                                var5_12 = var13_11;
                                var9_15 = var16_1;
                                var7_17 = var14_2;
                                var8_18 = var15_3;
                                var10_19 = var6_4;
                                var11_20 = var12_10;
                                ax.Ya.a.a(this.b);
                                var5_12 = var13_11;
                                var9_15 = var16_1;
                                var7_17 = var14_2;
                                var8_18 = var15_3;
                                var10_19 = var6_4;
                                var11_20 = var12_10;
                                var17_21 = new SocketException;
                                var5_12 = var13_11;
                                var9_15 = var16_1;
                                var7_17 = var14_2;
                                var8_18 = var15_3;
                                var10_19 = var6_4;
                                var11_20 = var12_10;
                                var17_21 = new SocketException("NanoHttpd Shutdown");
                                var5_12 = var13_11;
                                var9_15 = var16_1;
                                var7_17 = var14_2;
                                var8_18 = var15_3;
                                var10_19 = var6_4;
                                var11_20 = var12_10;
                                throw var17_21;
                            }
                            var5_12 = var13_11;
                            var9_15 = var16_1;
                            var7_17 = var14_2;
                            var8_18 = var15_3;
                            var10_19 = var6_4;
                            var11_20 = var12_10;
                            throw var17_22;
                        }
                    }
                    var5_12 = var9_15;
                    ax.Ya.a.o(var6_6.a(), "text/plain", var6_6.getMessage()).g(this.b);
                    var5_12 = var9_15;
                    ax.Ya.a.a(this.b);
                    var7_17 = var9_15;
lbl613:
                    // 3 sources

                    while (true) {
                        ax.Ya.a.a(var7_17);
                        this.a.clear();
                        return;
                    }
                }
                var5_12 = var7_17;
                {
                    var9_15 = o.d.F0;
                    var5_12 = var7_17;
                    var5_12 = var7_17;
                    var8_18 = new StringBuilder();
                    var5_12 = var7_17;
                    var8_18.append("SERVER INTERNAL ERROR: IOException: ");
                    var5_12 = var7_17;
                    var8_18.append(var6_7.getMessage());
                    var5_12 = var7_17;
                    ax.Ya.a.o((o.c)var9_15, "text/plain", var8_18.toString()).g(this.b);
                    var5_12 = var7_17;
                    ax.Ya.a.a(this.b);
                    ** GOTO lbl613
lbl634:
                    // 1 sources

                    var5_12 = var8_18;
                    var6_4 = o.d.F0;
                    var5_12 = var8_18;
                    var5_12 = var8_18;
                    var7_17 = new StringBuilder();
                    var5_12 = var8_18;
                    var7_17.append("SSL PROTOCOL FAILURE: ");
                    var5_12 = var8_18;
                    var7_17.append(var9_16.getMessage());
                    var5_12 = var8_18;
                    ax.Ya.a.o((o.c)var6_4, "text/plain", var7_17.toString()).g(this.b);
                    var5_12 = var8_18;
                    ax.Ya.a.a(this.b);
                    var7_17 = var8_18;
                    ** continue;
lbl651:
                    // 1 sources

                    var5_12 = var10_19;
                    throw var6_8;
lbl653:
                    // 1 sources

                    var5_12 = var11_20;
                    throw var6_9;
                }
            }
            ax.Ya.a.a(var5_12);
            this.a.clear();
            throw var6_5;
        }

        public long m() {
            if (this.i.containsKey("content-length")) {
                return Long.parseLong(this.i.get("content-length"));
            }
            int n8 = this.d;
            int n9 = this.e;
            if (n8 < n9) {
                return n9 - n8;
            }
            return 0L;
        }
    }

    public static interface m {
        public Map<String, String> a();

        public String b();

        @Deprecated
        public Map<String, String> c();

        public Map<String, List<String>> d();

        public void e(Map<String, String> var1) throws IOException, p;

        public n f();

        public String g();
    }

    public static final class n
    extends Enum<n> {
        public static final /* enum */ n c0;
        public static final /* enum */ n d0;
        public static final /* enum */ n e0;
        public static final /* enum */ n f0;
        public static final /* enum */ n g0;
        public static final /* enum */ n h0;
        public static final /* enum */ n i0;
        public static final /* enum */ n j0;
        public static final /* enum */ n k0;
        public static final /* enum */ n l0;
        public static final /* enum */ n m0;
        public static final /* enum */ n n0;
        public static final /* enum */ n o0;
        public static final /* enum */ n p0;
        public static final /* enum */ n q;
        public static final /* enum */ n q0;
        private static final n[] r0;

        static {
            q = new n();
            c0 = new n();
            d0 = new n();
            e0 = new n();
            f0 = new n();
            g0 = new n();
            h0 = new n();
            i0 = new n();
            j0 = new n();
            k0 = new n();
            l0 = new n();
            m0 = new n();
            n0 = new n();
            o0 = new n();
            p0 = new n();
            q0 = new n();
            r0 = n.d();
        }

        private static /* synthetic */ n[] d() {
            return new n[]{q, c0, d0, e0, f0, g0, h0, i0, j0, k0, l0, m0, n0, o0, p0, q0};
        }

        static n h(String object) {
            if (object == null) {
                return null;
            }
            try {
                object = n.valueOf(object);
                return object;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
        }

        public static n valueOf(String string) {
            return Enum.valueOf(n.class, string);
        }

        public static n[] values() {
            return (n[])r0.clone();
        }
    }

    public static class o
    implements Closeable,
    AutoCloseable {
        private String c0;
        private InputStream d0;
        private long e0;
        private final Map<String, String> f0 = new HashMap<String, String>(this){
            final o q;
            {
                this.q = o8;
            }

            public String b(String string, String string2) {
                Map map = this.q.g0;
                String string3 = string == null ? string : string.toLowerCase();
                map.put(string3, string2);
                return super.put(string, string2);
            }
        };
        private final Map<String, String> g0 = new HashMap<String, String>();
        private n h0;
        private boolean i0;
        private boolean j0;
        private boolean k0;
        private c q;

        protected o(c c8, String string, InputStream inputStream, long l8) {
            this.q = c8;
            this.c0 = string;
            boolean bl = false;
            if (inputStream == null) {
                this.d0 = new ByteArrayInputStream(new byte[0]);
                this.e0 = 0L;
            } else {
                this.d0 = inputStream;
                this.e0 = l8;
            }
            if (this.e0 < 0L) {
                bl = true;
            }
            this.i0 = bl;
            this.k0 = true;
        }

        private void j(OutputStream outputStream, long l8) throws IOException {
            byte[] byArray = new byte[(int)16384L];
            boolean bl = l8 == -1L;
            long l9;
            int n8;
            while ((l8 > 0L || bl) && (n8 = this.d0.read(byArray, 0, (int)(l9 = bl ? 16384L : Math.min(l8, 16384L)))) > 0) {
                outputStream.write(byArray, 0, n8);
                if (bl) continue;
                l8 -= (long)n8;
            }
            return;
        }

        private void m(OutputStream outputStream, long l8) throws IOException {
            if (this.j0) {
                outputStream = new GZIPOutputStream(outputStream);
                this.j(outputStream, -1L);
                ((GZIPOutputStream)outputStream).finish();
                return;
            }
            this.j(outputStream, l8);
        }

        private void o(OutputStream outputStream, long l8) throws IOException {
            if (this.h0 != n.f0 && this.i0) {
                outputStream = new b(outputStream);
                this.m(outputStream, -1L);
                ((b)outputStream).a();
                return;
            }
            this.m(outputStream, l8);
        }

        public void A(n n8) {
            this.h0 = n8;
        }

        public void b(String string, String string2) {
            this.f0.put(string, string2);
        }

        public String c(String string) {
            return this.g0.get(string.toLowerCase());
        }

        @Override
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
            return "close".equals(this.c("connection"));
        }

        protected void f(PrintWriter printWriter, String string, String string2) {
            printWriter.append(string).append(": ").append(string2).append("\r\n");
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected void g(OutputStream object) {
            IOException iOException2;
            block12: {
                long l8;
                PrintWriter printWriter;
                Object object22;
                Object object3;
                block11: {
                    object3 = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                    ((DateFormat)object3).setTimeZone(java.util.DesugarTimeZone.getTimeZone((String)"GMT"));
                    try {
                        if (this.q == null) {
                            object = new Error("sendResponse(): Status can't be null.");
                            throw object;
                        }
                        ax.Ya.a$d d8 = new ax.Ya.a$d(this.c0);
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)object, d8.e());
                        object22 = new BufferedWriter(outputStreamWriter);
                        printWriter = new PrintWriter((Writer)object22, false);
                        printWriter.append("HTTP/1.1 ").append(this.q.d()).append(" \r\n");
                        object22 = this.c0;
                        if (object22 == null) break block11;
                        this.f(printWriter, "Content-Type", (String)object22);
                    }
                    catch (IOException iOException2) {
                        break block12;
                    }
                }
                if (this.c("date") == null) {
                    object22 = new Date();
                    this.f(printWriter, "Date", ((DateFormat)object3).format((Date)object22));
                }
                for (Object object22 : this.f0.entrySet()) {
                    this.f(printWriter, (String)object22.getKey(), (String)object22.getValue());
                }
                if (this.c("connection") == null) {
                    object3 = this.k0 ? "keep-alive" : "close";
                    this.f(printWriter, "Connection", (String)object3);
                }
                if (this.c("content-length") != null) {
                    this.j0 = false;
                }
                if (this.j0) {
                    this.f(printWriter, "Content-Encoding", "gzip");
                    this.q(true);
                }
                long l9 = this.d0 != null ? this.e0 : 0L;
                if (this.h0 != n.f0 && this.i0) {
                    this.f(printWriter, "Transfer-Encoding", "chunked");
                    l8 = l9;
                } else {
                    l8 = l9;
                    if (!this.j0) {
                        l8 = this.p(printWriter, l9);
                    }
                }
                printWriter.append("\r\n");
                printWriter.flush();
                this.o((OutputStream)object, l8);
                ((OutputStream)object).flush();
                ax.Ya.a.p(this.d0);
                return;
            }
            k.log(Level.SEVERE, "Could not send response to the client", iOException2);
        }

        protected long p(PrintWriter printWriter, long l8) {
            CharSequence charSequence = this.c("content-length");
            if (charSequence != null) {
                try {
                    long l9 = Long.parseLong((String)charSequence);
                    return l9;
                }
                catch (NumberFormatException numberFormatException) {
                    Logger logger = k;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("content-length was no number ");
                    stringBuilder.append((String)charSequence);
                    logger.severe(stringBuilder.toString());
                }
            } else {
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append("Content-Length: ");
                ((StringBuilder)charSequence).append(l8);
                ((StringBuilder)charSequence).append("\r\n");
                printWriter.print(((StringBuilder)charSequence).toString());
            }
            return l8;
        }

        public void q(boolean bl) {
            this.i0 = bl;
        }

        public void u(boolean bl) {
            this.j0 = bl;
        }

        public void v(boolean bl) {
            this.k0 = bl;
        }

        private static class b
        extends FilterOutputStream {
            public b(OutputStream outputStream) {
                super(outputStream);
            }

            public void a() throws IOException {
                this.out.write("0\r\n\r\n".getBytes());
            }

            @Override
            public void write(int n8) throws IOException {
                this.write(new byte[]{(byte)n8}, 0, 1);
            }

            @Override
            public void write(byte[] byArray) throws IOException {
                this.write(byArray, 0, byArray.length);
            }

            @Override
            public void write(byte[] byArray, int n8, int n9) throws IOException {
                if (n9 == 0) {
                    return;
                }
                this.out.write(String.format("%x\r\n", n9).getBytes());
                this.out.write(byArray, n8, n9);
                this.out.write("\r\n".getBytes());
            }
        }

        public static interface c {
            public String d();
        }

        public static final class d
        extends Enum<d>
        implements c {
            public static final /* enum */ d A0;
            public static final /* enum */ d B0;
            public static final /* enum */ d C0;
            public static final /* enum */ d D0;
            public static final /* enum */ d E0;
            public static final /* enum */ d F0;
            public static final /* enum */ d G0;
            public static final /* enum */ d H0;
            public static final /* enum */ d I0;
            private static final d[] J0;
            public static final /* enum */ d d0;
            public static final /* enum */ d e0;
            public static final /* enum */ d f0;
            public static final /* enum */ d g0;
            public static final /* enum */ d h0;
            public static final /* enum */ d i0;
            public static final /* enum */ d j0;
            public static final /* enum */ d k0;
            @Deprecated
            public static final /* enum */ d l0;
            public static final /* enum */ d m0;
            public static final /* enum */ d n0;
            public static final /* enum */ d o0;
            public static final /* enum */ d p0;
            public static final /* enum */ d q0;
            public static final /* enum */ d r0;
            public static final /* enum */ d s0;
            public static final /* enum */ d t0;
            public static final /* enum */ d u0;
            public static final /* enum */ d v0;
            public static final /* enum */ d w0;
            public static final /* enum */ d x0;
            public static final /* enum */ d y0;
            public static final /* enum */ d z0;
            private final String c0;
            private final int q;

            static {
                d0 = new d(101, "Switching Protocols");
                e0 = new d(200, "OK");
                f0 = new d(201, "Created");
                g0 = new d(202, "Accepted");
                h0 = new d(204, "No Content");
                i0 = new d(206, "Partial Content");
                j0 = new d(207, "Multi-Status");
                k0 = new d(301, "Moved Permanently");
                l0 = new d(302, "Found");
                m0 = new d(303, "See Other");
                n0 = new d(304, "Not Modified");
                o0 = new d(307, "Temporary Redirect");
                p0 = new d(400, "Bad Request");
                q0 = new d(401, "Unauthorized");
                r0 = new d(403, "Forbidden");
                s0 = new d(404, "Not Found");
                t0 = new d(405, "Method Not Allowed");
                u0 = new d(406, "Not Acceptable");
                v0 = new d(408, "Request Timeout");
                w0 = new d(409, "Conflict");
                x0 = new d(410, "Gone");
                y0 = new d(411, "Length Required");
                z0 = new d(412, "Precondition Failed");
                A0 = new d(413, "Payload Too Large");
                B0 = new d(415, "Unsupported Media Type");
                C0 = new d(416, "Requested Range Not Satisfiable");
                D0 = new d(417, "Expectation Failed");
                E0 = new d(429, "Too Many Requests");
                F0 = new d(500, "Internal Server Error");
                G0 = new d(501, "Not Implemented");
                H0 = new d(503, "Service Unavailable");
                I0 = new d(505, "HTTP Version Not Supported");
                J0 = ax.Ya.a$o$d.h();
            }

            private d(int n9, String string2) {
                this.q = n9;
                this.c0 = string2;
            }

            private static /* synthetic */ d[] h() {
                return new d[]{d0, e0, f0, g0, h0, i0, j0, k0, l0, m0, n0, o0, p0, q0, r0, s0, t0, u0, v0, w0, x0, y0, z0, A0, B0, C0, D0, E0, F0, G0, H0, I0};
            }

            public static d valueOf(String string) {
                return Enum.valueOf(d.class, string);
            }

            public static d[] values() {
                return (d[])J0.clone();
            }

            @Override
            public String d() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(this.q);
                stringBuilder.append(" ");
                stringBuilder.append(this.c0);
                return stringBuilder.toString();
            }
        }
    }

    public static final class p
    extends Exception {
        private final o.d q;

        public p(o.d d8, String string) {
            super(string);
            this.q = d8;
        }

        public p(o.d d8, String string, Exception exception) {
            super(string, exception);
            this.q = d8;
        }

        public o.d a() {
            return this.q;
        }
    }

    public class q
    implements Runnable {
        private IOException c0;
        private boolean d0;
        final a e0;
        private final int q;

        public q(a a8, int n8) {
            this.e0 = a8;
            this.d0 = false;
            this.q = n8;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        @Override
        public void run() {
            Object object;
            Closeable closeable;
            block8: {
                IOException iOException2;
                block5: {
                    try {
                        closeable = this.e0.c;
                        object = this.e0.a != null ? new InetSocketAddress(this.e0.a, this.e0.b) : new InetSocketAddress(this.e0.b);
                    }
                    catch (IOException iOException2) {
                        break block5;
                    }
                    break block8;
                }
                this.c0 = iOException2;
                return;
            }
            closeable.bind((SocketAddress)object);
            this.d0 = true;
            do {
                IOException iOException3;
                block7: {
                    Socket socket;
                    block6: {
                        try {
                            socket = this.e0.c.accept();
                            int n8 = this.q;
                            if (n8 <= 0) break block6;
                            socket.setSoTimeout(n8);
                        }
                        catch (IOException iOException3) {
                            break block7;
                        }
                    }
                    closeable = socket.getInputStream();
                    object = this.e0;
                    ((a)object).f.a(((a)object).j(socket, (InputStream)closeable));
                    continue;
                }
                k.log(Level.FINE, "Communication with the client broken", iOException3);
            } while (!this.e0.c.isClosed());
        }
    }

    public static interface r {
        public ServerSocket a() throws IOException;
    }

    public static interface s {
        public void delete() throws Exception;

        public String getName();
    }

    public static interface t {
        public s a(String var1) throws Exception;

        public void clear();
    }

    public static interface u {
        public t a();
    }
}

