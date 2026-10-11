package ax.P2;

import android.content.Context;
import android.os.Build;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class a {
    private static final Logger a = Logger.getLogger("FileManager.FfmpegExtensionLoader");

    private static boolean a(String str) {
        ZipInputStream zipInputStream;
        List<String> l = l();
        HashSet hashSet = new HashSet();
        ZipInputStream zipInputStream2 = null;
        try {
            zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                String name = nextEntry.getName();
                if (l.contains(name)) {
                    hashSet.add(name);
                }
            }
            zipInputStream.closeEntry();
            zipInputStream.close();
            if (hashSet.size() == l.size()) {
                try {
                    zipInputStream.close();
                } catch (IOException unused2) {
                }
                return true;
            }
            a.severe("custom codec file is not valid :" + hashSet.size() + " != " + l.size());
            try {
                zipInputStream.close();
            } catch (IOException unused3) {
            }
            return false;
        } catch (IOException unused4) {
            zipInputStream2 = zipInputStream;
            if (zipInputStream2 != null) {
                try {
                    zipInputStream2.close();
                } catch (IOException unused5) {
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            zipInputStream2 = zipInputStream;
            if (zipInputStream2 != null) {
                try {
                    zipInputStream2.close();
                } catch (IOException unused6) {
                }
            }
            throw th;
        }
    }

    public static void b() {
        b.k(false);
    }

    public static int c(Context context) {
        if (b.g()) {
            return b.a();
        }
        if (k() == null) {
            return 0;
        }
        if (e(context).exists()) {
            return 3;
        }
        if (g(context).exists()) {
            return 2;
        }
        return f(context).exists() ? 1 : 0;
    }

    private static File d(Context context, String str, String str2) {
        return new File(new File(j(context), str), str2);
    }

    public static File e(Context context) {
        return new File(j(context), "libffmpeg.exo-v3.so");
    }

    private static File f(Context context) {
        return new File(j(context), "libffmpeg.exo-v1.so");
    }

    private static File g(Context context) {
        return new File(j(context), "libffmpeg.exo-v2.so");
    }

    private static File h(Context context) {
        File file = new File(context.getFilesDir(), "libs");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static File i(Context context, String str, String str2) {
        return new File(new File(h(context), str), str2);
    }

    private static File j(Context context) {
        File file = new File(context.getFilesDir(), "codec");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static String k() {
        for (String str : Build.SUPPORTED_ABIS) {
            if (u(str)) {
                return str;
            }
        }
        return null;
    }

    private static List<String> l() {
        return Arrays.asList("arm64-v8a/libavcodec.so", "arm64-v8a/libavresample.so", "arm64-v8a/libavutil.so", "armeabi-v7a/libavcodec.so", "armeabi-v7a/libavresample.so", "armeabi-v7a/libavutil.so", "x86/libavcodec.so", "x86/libavresample.so", "x86/libavutil.so", "x86_64/libavcodec.so", "x86_64/libavresample.so", "x86_64/libavutil.so");
    }

    public static boolean m(Context context) {
        if (b.f()) {
            return true;
        }
        String k = k();
        if (k == null) {
            return false;
        }
        File i = i(context, k, "libex.ffmpeg.exo.so");
        if (!i.exists() && !p(context, k)) {
            return false;
        }
        try {
            if (!r(context)) {
                return false;
            }
            System.load(d(context, k, "libavutil.so").getAbsolutePath());
            System.load(d(context, k, "libavresample.so").getAbsolutePath());
            System.load(d(context, k, "libavcodec.so").getAbsolutePath());
            System.load(i.getAbsolutePath());
            b.k(true);
            a.fine("custom codec loaded");
            return true;
        } catch (Error e) {
            e.printStackTrace();
            a.severe("custom codec load error");
            return false;
        }
    }

    public static boolean n(Context context) {
        if (b.g()) {
            return true;
        }
        String k = k();
        if (k == null) {
            return false;
        }
        File e = e(context);
        if (e.exists() && v(e, 3)) {
            return true;
        }
        File g = g(context);
        return (g.exists() && v(g, 2)) || w(context, k);
    }

    public static boolean o(Context context, String str) {
        String k = k();
        if (k == null) {
            return false;
        }
        if (!t(context, k) && !p(context, k)) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                if (!a(str)) {
                    return false;
                }
                File j = j(context);
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    boolean x = x(fileInputStream2, j.getAbsolutePath(), k);
                    if (x) {
                        a.fine("custom codec installed");
                    } else {
                        a.fine("custom codec not installed");
                    }
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return x;
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    a.fine("custom codec not installed");
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean p(Context context, String str) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = context.getAssets().open("exolibs.zip");
                boolean x = x(inputStream, h(context).getAbsolutePath(), str);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return x;
            } catch (Exception e) {
                e.printStackTrace();
                if (inputStream == null) {
                    return false;
                }
                try {
                    inputStream.close();
                    return false;
                } catch (IOException unused2) {
                    return false;
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public static boolean q(String str) {
        return b.d(str);
    }

    public static boolean r(Context context) {
        String k = k();
        return k != null && d(context, k, "libavutil.so").exists() && d(context, k, "libavresample.so").exists() && d(context, k, "libavcodec.so").exists();
    }

    public static boolean s(Context context) {
        return e(context).exists();
    }

    public static boolean t(Context context, String str) {
        return i(context, str, "libfm.ffmpeg.exo.so").exists() && i(context, str, "libex.ffmpeg.exo.so").exists();
    }

    private static boolean u(String str) {
        return "armeabi-v7a".equals(str) || "x86".equals(str) || "arm64-v8a".equals(str) || "x86_64".equals(str);
    }

    private static boolean v(File file, int i) {
        try {
            System.load(file.getAbsolutePath());
            b.l(true);
            b.m(i);
            a.fine("default external codec v" + i + " loaded");
            return true;
        } catch (Error e) {
            e.printStackTrace();
            a.severe("default external codec load error");
            return false;
        }
    }

    private static boolean w(Context context, String str) {
        File f = f(context);
        if (f.exists()) {
            File i = i(context, str, "libfm.ffmpeg.exo.so");
            if (!i.exists() && !p(context, str)) {
                return false;
            }
            try {
                System.load(f.getAbsolutePath());
                System.load(i.getAbsolutePath());
                b.l(true);
                b.m(1);
                a.fine("default external codec v1 loaded");
                return true;
            } catch (Error e) {
                e.printStackTrace();
                a.severe("default external codec load error");
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean x(java.io.InputStream r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.P2.a.x(java.io.InputStream, java.lang.String, java.lang.String):boolean");
    }
}
