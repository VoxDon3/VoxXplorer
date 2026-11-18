/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.shizuku;

import android.os.ParcelFileDescriptor;
import android.os.Process;
import ax.X2.L;
import ax.X2.v;
import ax.c3.B;
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

class b {
    private static final int a;
    private static ThreadPoolExecutor b;
    public static int c;
    public static int d;

    static {
        int n8;
        a = n8 = Runtime.getRuntime().availableProcessors();
        b = new ThreadPoolExecutor(n8 + 1, n8 * 4 + 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(256), new ThreadFactory(){

            @Override
            public Thread newThread(Runnable runnable2) {
                return new Thread(null, new Runnable(){
                    final a c0;
                    final Runnable q;
                    {
                        this.c0 = a8;
                        this.q = runnable2;
                    }

                    @Override
                    public void run() {
                        Process.setThreadPriority((int)2);
                        this.q.run();
                    }
                }, "Binder TaskExecutor", 32768L);
            }
        });
        c = 100;
        d = 110;
    }

    public static IllegalStateException a(int n8, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("error=");
        stringBuilder.append(n8);
        stringBuilder.append(";msg=");
        stringBuilder.append(string);
        return new IllegalStateException(stringBuilder.toString());
    }

    public static boolean b(String object) {
        object = new File((String)object);
        try {
            boolean bl = ((File)object).createNewFile();
            return bl;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    private static ax.p3.a c(File file) {
        boolean bl;
        ax.p3.a a8 = new ax.p3.a();
        a8.q = file.getAbsolutePath();
        a8.c0 = file.getName();
        a8.d0 = bl = file.exists();
        if (bl) {
            a8.g0 = file.canRead();
            a8.h0 = file.canWrite();
            a8.e0 = file.isDirectory();
            try {
                a8.i0 = file.length();
            }
            catch (IllegalArgumentException illegalArgumentException) {
                a8.i0 = -1L;
            }
            a8.j0 = file.lastModified();
            try {
                a8.f0 = B.R(file);
            }
            catch (IOException iOException) {
                a8.f0 = false;
            }
            return a8;
        }
        a8.i0 = -1L;
        a8.j0 = -1L;
        return a8;
    }

    public static boolean d(String string) {
        return new File(string).delete();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static c e(IllegalStateException object) {
        if (((Throwable)object).getMessage() == null) return null;
        if (!((Throwable)object).getMessage().startsWith("error=")) return null;
        String string = ((Throwable)object).getMessage();
        int n8 = string.indexOf(";");
        if (n8 <= 0) return null;
        try {
            object = string.substring(0, n8);
            string = string.substring(n8 + 1);
            object = ((String)object).substring(6);
            string = string.substring(4);
            return new c(Integer.parseInt((String)object), string);
        }
        catch (IndexOutOfBoundsException | NumberFormatException runtimeException) {
            return null;
        }
    }

    public static ax.p3.a f(String string) {
        return com.voxdon.xplorer.shizuku.b.h(string);
    }

    private static ax.p3.a g(String string) {
        return com.voxdon.xplorer.shizuku.b.c(new File(string));
    }

    public static ax.p3.a h(String object) {
        try {
            ax.p3.a a8 = com.voxdon.xplorer.shizuku.b.g((String)object);
            L l8 = new L();
            object = v.l((String)object, l8);
            a8.d0 = ((L)object).e;
            a8.i0 = ((L)object).a;
            a8.e0 = ((L)object).b;
            a8.j0 = ((L)object).c;
            return a8;
        }
        catch (IOException iOException) {
            throw com.voxdon.xplorer.shizuku.b.a(c, iOException.getMessage());
        }
    }

    public static ParcelFileDescriptor i(String string) {
        try {
            File file = new File(string);
            string = ParcelFileDescriptor.open((File)file, (int)0x10000000);
            return string;
        }
        catch (FileNotFoundException fileNotFoundException) {
            throw com.voxdon.xplorer.shizuku.b.a(d, fileNotFoundException.getMessage());
        }
    }

    public static int j(String stringArray, boolean bl) {
        if ((stringArray = new File((String)stringArray).list(new FilenameFilter(bl){
            final boolean q;
            {
                this.q = bl;
            }

            @Override
            public boolean accept(File file, String string) {
                if (string != null) {
                    boolean bl = string.startsWith(".");
                    if (this.q ? J.k2(string) : bl) {
                        return false;
                    }
                }
                return true;
            }
        })) == null) {
            return -2;
        }
        return stringArray.length;
    }

    public static ParcelFileDescriptor k(String string, boolean bl) {
        int n8 = bl ? 0x2A000000 : 0x28000000;
        try {
            File file = new File(string);
            string = ParcelFileDescriptor.open((File)file, (int)n8);
            return string;
        }
        catch (IOException iOException) {
            throw com.voxdon.xplorer.shizuku.b.a(c, iOException.getMessage());
        }
    }

    public static ParcelFileDescriptor l(String string) {
        try {
            File file = new File(string);
            string = ParcelFileDescriptor.open((File)file, (int)0x30000000);
            return string;
        }
        catch (FileNotFoundException fileNotFoundException) {
            throw com.voxdon.xplorer.shizuku.b.a(d, fileNotFoundException.getMessage());
        }
    }

    public static List<ax.p3.a> m(String object) {
        File[] fileArray = new File((String)object).listFiles();
        if (fileArray != null) {
            object = new ArrayList();
            int n8 = fileArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                object.add(com.voxdon.xplorer.shizuku.b.c(fileArray[i8]));
            }
            return object;
        }
        return null;
    }

    public static boolean n(String string) {
        return new File(string).mkdir();
    }

    public static boolean o(String object, String string) {
        try {
            File file = new File((String)object);
            object = new File(string);
            boolean bl = file.renameTo((File)object);
            return bl;
        }
        catch (Exception exception) {
            return false;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean p(String string, long l8) {
        block4: {
            if (l8 < 0L) {
                return false;
            }
            try {
                File file = new File(string);
                file.setLastModified(l8);
                long l9 = file.lastModified() / 1000L;
                if (l9 != (l8 /= 1000L)) break block4;
                return true;
            }
            catch (Exception exception) {
                return false;
            }
        }
        return false;
    }

    public static class c {
        int a;
        String b;

        c(int n8, String string) {
            this.a = n8;
            this.b = string;
        }
    }
}

