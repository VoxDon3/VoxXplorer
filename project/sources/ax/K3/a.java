package ax.K3;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class a implements Closeable, AutoCloseable {
    private final File c0;
    private final File d0;
    private final File e0;
    private final int f0;
    private long g0;
    private final int h0;
    private Writer j0;
    private int l0;
    private final File q;
    private long i0 = 0;
    private final LinkedHashMap<String, d> k0 = new LinkedHashMap<>(0, 0.75f, true);
    private long m0 = 0;
    final ThreadPoolExecutor n0 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));
    private final Callable<Void> o0 = new CallableC0105a();

    /* renamed from: ax.K3.a$a, reason: collision with other inner class name */
    class CallableC0105a implements Callable<Void> {
        CallableC0105a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (a.this) {
                try {
                    if (a.this.j0 == null) {
                        return null;
                    }
                    a.this.u0();
                    if (a.this.A()) {
                        a.this.d0();
                        a.this.l0 = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ b(CallableC0105a callableC0105a) {
            this();
        }
    }

    public final class c {
        private final d a;
        private final boolean[] b;
        private boolean c;

        /* synthetic */ c(a aVar, d dVar, CallableC0105a callableC0105a) {
            this(dVar);
        }

        public void a() throws IOException {
            a.this.o(this, false);
        }

        public void b() {
            if (this.c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() throws IOException {
            a.this.o(this, true);
            this.c = true;
        }

        public File f(int i) throws IOException {
            File k;
            synchronized (a.this) {
                try {
                    if (this.a.f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.a.e) {
                        this.b[i] = true;
                    }
                    k = this.a.k(i);
                    if (!a.this.q.exists()) {
                        a.this.q.mkdirs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return k;
        }

        private c(d dVar) {
            this.a = dVar;
            this.b = dVar.e ? null : new boolean[a.this.h0];
        }
    }

    private final class d {
        private final String a;
        private final long[] b;
        File[] c;
        File[] d;
        private boolean e;
        private c f;
        private long g;

        /* synthetic */ d(a aVar, String str, CallableC0105a callableC0105a) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.h0) {
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
            return this.c[i];
        }

        public File k(int i) {
            return this.d[i];
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
            this.b = new long[a.this.h0];
            this.c = new File[a.this.h0];
            this.d = new File[a.this.h0];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < a.this.h0; i++) {
                sb.append(i);
                this.c[i] = new File(a.this.q, sb.toString());
                sb.append(".tmp");
                this.d[i] = new File(a.this.q, sb.toString());
                sb.setLength(length);
            }
        }
    }

    public final class e {
        private final String a;
        private final long b;
        private final long[] c;
        private final File[] d;

        /* synthetic */ e(a aVar, String str, long j, File[] fileArr, long[] jArr, CallableC0105a callableC0105a) {
            this(str, j, fileArr, jArr);
        }

        public File a(int i) {
            return this.d[i];
        }

        private e(String str, long j, File[] fileArr, long[] jArr) {
            this.a = str;
            this.b = j;
            this.d = fileArr;
            this.c = jArr;
        }
    }

    private a(File file, int i, int i2, long j) {
        this.q = file;
        this.f0 = i;
        this.c0 = new File(file, "journal");
        this.d0 = new File(file, "journal.tmp");
        this.e0 = new File(file, "journal.bkp");
        this.h0 = i2;
        this.g0 = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A() {
        int i = this.l0;
        return i >= 2000 && i >= this.k0.size();
    }

    public static a F(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
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
                s0(file2, file3, false);
            }
        }
        a aVar = new a(file, i, i2, j);
        if (aVar.c0.exists()) {
            try {
                aVar.L();
                aVar.H();
                return aVar;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                aVar.delete();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i, i2, j);
        aVar2.d0();
        return aVar2;
    }

    private void H() throws IOException {
        p(this.d0);
        Iterator<d> it = this.k0.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i = 0;
            if (next.f == null) {
                while (i < this.h0) {
                    this.i0 += next.b[i];
                    i++;
                }
            } else {
                next.f = null;
                while (i < this.h0) {
                    p(next.j(i));
                    p(next.k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private void L() throws IOException {
        ax.K3.b bVar = new ax.K3.b(new FileInputStream(this.c0), ax.K3.c.a);
        try {
            String d2 = bVar.d();
            String d3 = bVar.d();
            String d4 = bVar.d();
            String d5 = bVar.d();
            String d6 = bVar.d();
            if (!"libcore.io.DiskLruCache".equals(d2) || !"1".equals(d3) || !Integer.toString(this.f0).equals(d4) || !Integer.toString(this.h0).equals(d5) || !HttpUrl.FRAGMENT_ENCODE_SET.equals(d6)) {
                throw new IOException("unexpected journal header: [" + d2 + ", " + d3 + ", " + d5 + ", " + d6 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    W(bVar.d());
                    i++;
                } catch (EOFException unused) {
                    this.l0 = i - this.k0.size();
                    if (bVar.c()) {
                        d0();
                    } else {
                        this.j0 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c0, true), ax.K3.c.a));
                    }
                    ax.K3.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th) {
            ax.K3.c.a(bVar);
            throw th;
        }
    }

    private void W(String str) throws IOException {
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
                this.k0.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        d dVar = this.k0.get(substring);
        CallableC0105a callableC0105a = null;
        if (dVar == null) {
            dVar = new d(this, substring, callableC0105a);
            this.k0.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            dVar.e = true;
            dVar.f = null;
            dVar.n(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f = new c(this, dVar, callableC0105a);
            return;
        }
        if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d0() throws IOException {
        try {
            Writer writer = this.j0;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d0), ax.K3.c.a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f0));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.h0));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.k0.values()) {
                    if (dVar.f != null) {
                        bufferedWriter.write("DIRTY " + dVar.a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.a + dVar.l() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.c0.exists()) {
                    s0(this.c0, this.e0, true);
                }
                s0(this.d0, this.c0, false);
                this.e0.delete();
                this.j0 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c0, true), ax.K3.c.a));
            } catch (Throwable th) {
                bufferedWriter.close();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void m() {
        if (this.j0 == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o(c cVar, boolean z) throws IOException {
        d dVar = cVar.a;
        if (dVar.f != cVar) {
            throw new IllegalStateException();
        }
        if (z && !dVar.e) {
            for (int i = 0; i < this.h0; i++) {
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
        for (int i2 = 0; i2 < this.h0; i2++) {
            File k = dVar.k(i2);
            if (!z) {
                p(k);
            } else if (k.exists()) {
                File j = dVar.j(i2);
                k.renameTo(j);
                long j2 = dVar.b[i2];
                long length = j.length();
                dVar.b[i2] = length;
                this.i0 = (this.i0 - j2) + length;
            }
        }
        this.l0++;
        dVar.f = null;
        if (dVar.e || z) {
            dVar.e = true;
            this.j0.append((CharSequence) "CLEAN");
            this.j0.append(' ');
            this.j0.append((CharSequence) dVar.a);
            this.j0.append((CharSequence) dVar.l());
            this.j0.append('\n');
            if (z) {
                long j3 = this.m0;
                this.m0 = 1 + j3;
                dVar.g = j3;
            }
        } else {
            this.k0.remove(dVar.a);
            this.j0.append((CharSequence) "REMOVE");
            this.j0.append(' ');
            this.j0.append((CharSequence) dVar.a);
            this.j0.append('\n');
        }
        this.j0.flush();
        if (this.i0 > this.g0 || A()) {
            this.n0.submit(this.o0);
        }
    }

    private static void p(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void s0(File file, File file2, boolean z) throws IOException {
        if (z) {
            p(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private synchronized c u(String str, long j) throws IOException {
        m();
        d dVar = this.k0.get(str);
        CallableC0105a callableC0105a = null;
        if (j != -1 && (dVar == null || dVar.g != j)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC0105a);
            this.k0.put(str, dVar);
        } else if (dVar.f != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC0105a);
        dVar.f = cVar;
        this.j0.append((CharSequence) "DIRTY");
        this.j0.append(' ');
        this.j0.append((CharSequence) str);
        this.j0.append('\n');
        this.j0.flush();
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() throws IOException {
        while (this.i0 > this.g0) {
            o0(this.k0.entrySet().iterator().next().getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.j0 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.k0.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                d dVar = (d) obj;
                if (dVar.f != null) {
                    dVar.f.a();
                }
            }
            u0();
            this.j0.close();
            this.j0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void delete() throws IOException {
        close();
        ax.K3.c.b(this.q);
    }

    public synchronized boolean o0(String str) throws IOException {
        try {
            m();
            d dVar = this.k0.get(str);
            if (dVar != null && dVar.f == null) {
                for (int i = 0; i < this.h0; i++) {
                    File j = dVar.j(i);
                    if (j.exists() && !j.delete()) {
                        throw new IOException("failed to delete " + j);
                    }
                    this.i0 -= dVar.b[i];
                    dVar.b[i] = 0;
                }
                this.l0++;
                this.j0.append((CharSequence) "REMOVE");
                this.j0.append(' ');
                this.j0.append((CharSequence) str);
                this.j0.append('\n');
                this.k0.remove(str);
                if (A()) {
                    this.n0.submit(this.o0);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public c q(String str) throws IOException {
        return u(str, -1L);
    }

    public synchronized e v(String str) throws IOException {
        Throwable th;
        try {
            try {
                m();
                d dVar = this.k0.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.e) {
                    return null;
                }
                for (File file : dVar.c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.l0++;
                this.j0.append((CharSequence) "READ");
                this.j0.append(' ');
                this.j0.append((CharSequence) str);
                this.j0.append('\n');
                if (A()) {
                    this.n0.submit(this.o0);
                }
                return new e(this, str, dVar.g, dVar.c, dVar.b, null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }
}
