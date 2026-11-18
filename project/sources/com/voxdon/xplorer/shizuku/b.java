package com.voxdon.xplorer.shizuku;

import android.os.ParcelFileDescriptor;
import android.os.Process;
import ax.X2.L;
import ax.X2.v;
import ax.c3.C1809B;
import ax.p3.C2761a;
import com.voxdon.xplorer.file.J;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class b {
    private static final int a;
    private static ThreadPoolExecutor b;
    public static int c;
    public static int d;

    class a implements ThreadFactory {

        /* renamed from: com.voxdon.xplorer.shizuku.b$a$a, reason: collision with other inner class name */
        class RunnableC0530a implements Runnable {
            final /* synthetic */ Runnable q;

            RunnableC0530a(Runnable runnable) {
                this.q = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(2);
                this.q.run();
            }
        }

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(null, new RunnableC0530a(runnable), "Binder TaskExecutor", 32768L);
        }
    }

    /* renamed from: com.voxdon.xplorer.shizuku.b$b, reason: collision with other inner class name */
    class C0531b implements FilenameFilter {
        final /* synthetic */ boolean q;

        C0531b(boolean z) {
            this.q = z;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            if (str != null) {
                return this.q ? !J.k2(str) : !str.startsWith(".");
            }
            return true;
        }
    }

    public static class c {
        int a;
        String b;

        c(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        a = availableProcessors;
        b = new ThreadPoolExecutor(availableProcessors + 1, (availableProcessors * 4) + 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(256), new a());
        c = 100;
        d = ax.L.c.d3;
    }

    public static IllegalStateException a(int i, String str) {
        return new IllegalStateException("error=" + i + ";msg=" + str);
    }

    public static boolean b(String str) {
        try {
            return new File(str).createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    private static C2761a c(File file) {
        C2761a c2761a = new C2761a();
        c2761a.q = file.getAbsolutePath();
        c2761a.c0 = file.getName();
        boolean exists = file.exists();
        c2761a.d0 = exists;
        if (!exists) {
            c2761a.i0 = -1L;
            c2761a.j0 = -1L;
            return c2761a;
        }
        c2761a.g0 = file.canRead();
        c2761a.h0 = file.canWrite();
        c2761a.e0 = file.isDirectory();
        try {
            c2761a.i0 = file.length();
        } catch (IllegalArgumentException unused) {
            c2761a.i0 = -1L;
        }
        c2761a.j0 = file.lastModified();
        try {
            c2761a.f0 = C1809B.R(file);
        } catch (IOException unused2) {
            c2761a.f0 = false;
        }
        return c2761a;
    }

    public static boolean d(String str) {
        return new File(str).delete();
    }

    public static c e(IllegalStateException illegalStateException) {
        String message;
        int indexOf;
        try {
            if (illegalStateException.getMessage() == null || !illegalStateException.getMessage().startsWith("error=") || (indexOf = (message = illegalStateException.getMessage()).indexOf(";")) <= 0) {
                return null;
            }
            String substring = message.substring(0, indexOf);
            String substring2 = message.substring(indexOf + 1);
            return new c(Integer.parseInt(substring.substring(6)), substring2.substring(4));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    public static C2761a f(String str) {
        return h(str);
    }

    private static C2761a g(String str) {
        return c(new File(str));
    }

    public static C2761a h(String str) {
        try {
            C2761a g = g(str);
            L l = v.l(str, new L());
            g.d0 = l.e;
            g.i0 = l.a;
            g.e0 = l.b;
            g.j0 = l.c;
            return g;
        } catch (IOException e) {
            throw a(c, e.getMessage());
        }
    }

    public static ParcelFileDescriptor i(String str) {
        try {
            return ParcelFileDescriptor.open(new File(str), 268435456);
        } catch (FileNotFoundException e) {
            throw a(d, e.getMessage());
        }
    }

    public static int j(String str, boolean z) {
        String[] list = new File(str).list(new C0531b(z));
        if (list == null) {
            return -2;
        }
        return list.length;
    }

    public static ParcelFileDescriptor k(String str, boolean z) {
        try {
            return ParcelFileDescriptor.open(new File(str), z ? 704643072 : 671088640);
        } catch (IOException e) {
            throw a(c, e.getMessage());
        }
    }

    public static ParcelFileDescriptor l(String str) {
        try {
            return ParcelFileDescriptor.open(new File(str), 805306368);
        } catch (FileNotFoundException e) {
            throw a(d, e.getMessage());
        }
    }

    public static List<C2761a> m(String str) {
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            arrayList.add(c(file));
        }
        return arrayList;
    }

    public static boolean n(String str) {
        return new File(str).mkdir();
    }

    public static boolean o(String str, String str2) {
        try {
            return new File(str).renameTo(new File(str2));
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean p(String str, long j) {
        File file;
        if (j < 0) {
            return false;
        }
        try {
            file = new File(str);
            file.setLastModified(j);
        } catch (Exception unused) {
        }
        return file.lastModified() / 1000 == j / 1000;
    }
}
