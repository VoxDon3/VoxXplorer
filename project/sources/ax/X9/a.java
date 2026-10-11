package ax.X9;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
final class a implements Closeable, AutoCloseable {
    static final Pattern r0 = Pattern.compile("[a-z0-9_-]{1,64}");
    private static final OutputStream s0 = new b();
    private final File c0;
    private final File d0;
    private final File e0;
    private final int f0;
    private long g0;
    private int h0;
    private final int i0;
    private Writer l0;
    private int n0;
    private final File q;
    private long j0 = 0;
    private int k0 = 0;
    private final LinkedHashMap<String, d> m0 = new LinkedHashMap<>(0, 0.75f, true);
    private long o0 = 0;
    final ThreadPoolExecutor p0 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private final Callable<Void> q0 = new CallableC0220a();

    /* renamed from: ax.X9.a$a, reason: collision with other inner class name */
    class CallableC0220a implements Callable<Void> {
        CallableC0220a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (a.this) {
                try {
                    if (a.this.l0 == null) {
                        return null;
                    }
                    a.this.D0();
                    a.this.C0();
                    if (a.this.H()) {
                        a.this.s0();
                        a.this.n0 = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final class c {
        private final d a;
        private final boolean[] b;
        private boolean c;
        private boolean d;

        /* renamed from: ax.X9.a$c$a, reason: collision with other inner class name */
        private class C0221a extends FilterOutputStream implements AutoCloseable {
            /* synthetic */ C0221a(c cVar, OutputStream outputStream, CallableC0220a callableC0220a) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }

            private C0221a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    c.this.c = true;
                }
            }
        }

        /* synthetic */ c(a aVar, d dVar, CallableC0220a callableC0220a) {
            this(dVar);
        }

        public void a() throws IOException {
            a.this.q(this, false);
        }

        public void e() throws IOException {
            if (this.c) {
                a.this.q(this, false);
                a.this.u0(this.a.a);
            } else {
                a.this.q(this, true);
            }
            this.d = true;
        }

        public OutputStream f(int i) throws IOException {
            FileOutputStream fileOutputStream;
            C0221a c0221a;
            synchronized (a.this) {
                try {
                    if (this.a.d != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.a.c) {
                        this.b[i] = true;
                    }
                    File k = this.a.k(i);
                    try {
                        fileOutputStream = new FileOutputStream(k);
                    } catch (FileNotFoundException unused) {
                        a.this.q.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(k);
                        } catch (FileNotFoundException unused2) {
                            return a.s0;
                        }
                    }
                    c0221a = new C0221a(this, fileOutputStream, null);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c0221a;
        }

        private c(d dVar) {
            this.a = dVar;
            this.b = dVar.c ? null : new boolean[a.this.i0];
        }
    }

    private final class d {
        private final String a;
        private final long[] b;
        private boolean c;
        private c d;
        private long e;

        /* synthetic */ d(a aVar, String str, CallableC0220a callableC0220a) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.i0) {
                throw m(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i) {
            return new File(a.this.q, this.a + "." + i);
        }

        public File k(int i) {
            return new File(a.this.q, this.a + "." + i + ".tmp");
        }

        public String l() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        private d(String str) {
            this.a = str;
            this.b = new long[a.this.i0];
        }
    }

    public final class e implements Closeable, AutoCloseable {
        private final long c0;
        private File[] d0;
        private final InputStream[] e0;
        private final long[] f0;
        private final String q;

        /* synthetic */ e(a aVar, String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr, CallableC0220a callableC0220a) {
            this(str, j, fileArr, inputStreamArr, jArr);
        }

        public File a(int i) {
            return this.d0[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.e0) {
                ax.X9.d.a(inputStream);
            }
        }

        private e(String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr) {
            this.q = str;
            this.c0 = j;
            this.d0 = fileArr;
            this.e0 = inputStreamArr;
            this.f0 = jArr;
        }
    }

    private a(File file, int i, int i2, long j, int i3) {
        this.q = file;
        this.f0 = i;
        this.c0 = new File(file, "journal");
        this.d0 = new File(file, "journal.tmp");
        this.e0 = new File(file, "journal.bkp");
        this.i0 = i2;
        this.g0 = j;
        this.h0 = i3;
    }

    private synchronized c A(String str, long j) throws IOException {
        p();
        F0(str);
        d dVar = this.m0.get(str);
        CallableC0220a callableC0220a = null;
        if (j != -1 && (dVar == null || dVar.e != j)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC0220a);
            this.m0.put(str, dVar);
        } else if (dVar.d != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC0220a);
        dVar.d = cVar;
        this.l0.write("DIRTY " + str + '\n');
        this.l0.flush();
        return cVar;
    }

    private static void A0(File file, File file2, boolean z) throws IOException {
        if (z) {
            u(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0() throws IOException {
        while (this.k0 > this.h0) {
            u0(this.m0.entrySet().iterator().next().getKey());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0() throws IOException {
        while (this.j0 > this.g0) {
            u0(this.m0.entrySet().iterator().next().getKey());
        }
    }

    private void F0(String str) {
        if (r0.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H() {
        int i = this.n0;
        return i >= 2000 && i >= this.m0.size();
    }

    public static a L(File file, int i, int i2, long j, int i3) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("maxFileCount <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                A0(file2, file3, false);
            }
        }
        a aVar = new a(file, i, i2, j, i3);
        if (aVar.c0.exists()) {
            try {
                aVar.d0();
                aVar.W();
                aVar.l0 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aVar.c0, true), ax.X9.d.a));
                return aVar;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                aVar.delete();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i, i2, j, i3);
        aVar2.s0();
        return aVar2;
    }

    private void W() throws IOException {
        u(this.d0);
        Iterator<d> it = this.m0.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i = 0;
            if (next.d == null) {
                while (i < this.i0) {
                    this.j0 += next.b[i];
                    this.k0++;
                    i++;
                }
            } else {
                next.d = null;
                while (i < this.i0) {
                    u(next.j(i));
                    u(next.k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private void d0() throws IOException {
        ax.X9.c cVar = new ax.X9.c(new FileInputStream(this.c0), ax.X9.d.a);
        try {
            String c2 = cVar.c();
            String c3 = cVar.c();
            String c4 = cVar.c();
            String c5 = cVar.c();
            String c6 = cVar.c();
            if (!"libcore.io.DiskLruCache".equals(c2) || !"1".equals(c3) || !Integer.toString(this.f0).equals(c4) || !Integer.toString(this.i0).equals(c5) || !HttpUrl.FRAGMENT_ENCODE_SET.equals(c6)) {
                throw new IOException("unexpected journal header: [" + c2 + ", " + c3 + ", " + c5 + ", " + c6 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    o0(cVar.c());
                    i++;
                } catch (EOFException unused) {
                    this.n0 = i - this.m0.size();
                    ax.X9.d.a(cVar);
                    return;
                }
            }
        } catch (Throwable th) {
            ax.X9.d.a(cVar);
            throw th;
        }
    }

    private void o0(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.m0.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        d dVar = this.m0.get(substring);
        CallableC0220a callableC0220a = null;
        if (dVar == null) {
            dVar = new d(this, substring, callableC0220a);
            this.m0.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            dVar.c = true;
            dVar.d = null;
            dVar.n(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            dVar.d = new c(this, dVar, callableC0220a);
            return;
        }
        if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private void p() {
        if (this.l0 == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void q(c cVar, boolean z) throws IOException {
        d dVar = cVar.a;
        if (dVar.d != cVar) {
            throw new IllegalStateException();
        }
        if (z && !dVar.c) {
            for (int i = 0; i < this.i0; i++) {
                if (!cVar.b[i]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!dVar.k(i).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.i0; i2++) {
            File k = dVar.k(i2);
            if (!z) {
                u(k);
            } else if (k.exists()) {
                File j = dVar.j(i2);
                k.renameTo(j);
                long j2 = dVar.b[i2];
                long length = j.length();
                dVar.b[i2] = length;
                this.j0 = (this.j0 - j2) + length;
                this.k0++;
            }
        }
        this.n0++;
        dVar.d = null;
        if (dVar.c || z) {
            dVar.c = true;
            this.l0.write("CLEAN " + dVar.a + dVar.l() + '\n');
            if (z) {
                long j3 = this.o0;
                this.o0 = 1 + j3;
                dVar.e = j3;
            }
        } else {
            this.m0.remove(dVar.a);
            this.l0.write("REMOVE " + dVar.a + '\n');
        }
        this.l0.flush();
        if (this.j0 > this.g0 || this.k0 > this.h0 || H()) {
            this.p0.submit(this.q0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void s0() throws IOException {
        try {
            Writer writer = this.l0;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d0), ax.X9.d.a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f0));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.i0));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.m0.values()) {
                    if (dVar.d != null) {
                        bufferedWriter.write("DIRTY " + dVar.a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.a + dVar.l() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.c0.exists()) {
                    A0(this.c0, this.e0, true);
                }
                A0(this.d0, this.c0, false);
                this.e0.delete();
                this.l0 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c0, true), ax.X9.d.a));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void u(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public synchronized e F(String str) throws IOException {
        Throwable th;
        InputStream inputStream;
        try {
            p();
            F0(str);
            d dVar = this.m0.get(str);
            if (dVar == null) {
                return null;
            }
            if (!dVar.c) {
                return null;
            }
            int i = this.i0;
            File[] fileArr = new File[i];
            InputStream[] inputStreamArr = new InputStream[i];
            for (int i2 = 0; i2 < this.i0; i2++) {
                try {
                    try {
                        try {
                            File j = dVar.j(i2);
                            fileArr[i2] = j;
                            inputStreamArr[i2] = new FileInputStream(j);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    } catch (FileNotFoundException unused) {
                        for (int i3 = 0; i3 < this.i0 && (inputStream = inputStreamArr[i3]) != null; i3++) {
                            ax.X9.d.a(inputStream);
                        }
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            }
            this.n0++;
            this.l0.append((CharSequence) ("READ " + str + '\n'));
            if (H()) {
                this.p0.submit(this.q0);
            }
            return new e(this, str, dVar.e, fileArr, inputStreamArr, dVar.b, null);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.l0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.m0.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                d dVar = (d) obj;
                if (dVar.d != null) {
                    dVar.d.a();
                }
            }
            D0();
            C0();
            this.l0.close();
            this.l0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void delete() throws IOException {
        close();
        ax.X9.d.b(this.q);
    }

    public synchronized boolean u0(String str) throws IOException {
        try {
            p();
            F0(str);
            d dVar = this.m0.get(str);
            if (dVar != null && dVar.d == null) {
                for (int i = 0; i < this.i0; i++) {
                    File j = dVar.j(i);
                    if (j.exists() && !j.delete()) {
                        throw new IOException("failed to delete " + j);
                    }
                    this.j0 -= dVar.b[i];
                    this.k0--;
                    dVar.b[i] = 0;
                }
                this.n0++;
                this.l0.append((CharSequence) ("REMOVE " + str + '\n'));
                this.m0.remove(str);
                if (H()) {
                    this.p0.submit(this.q0);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public c v(String str) throws IOException {
        return A(str, -1L);
    }

    class b extends OutputStream {
        b() {
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    }
}
