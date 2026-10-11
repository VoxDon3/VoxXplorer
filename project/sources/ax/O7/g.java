package ax.O7;

import android.content.Context;
import ax.G7.j;
import ax.J7.C0764i;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class g {
    final String a;
    private final File b;
    private final File c;
    private final File d;
    private final File e;
    private final File f;
    private final File g;

    public g(Context context) {
        String str;
        String d = j.a.e(context).d();
        this.a = d;
        File filesDir = context.getFilesDir();
        this.b = filesDir;
        if (x()) {
            str = ".crashlytics.v3" + File.separator + w(d);
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File s = s(new File(filesDir, str));
        this.c = s;
        this.d = s(new File(s, "open-sessions"));
        this.e = s(new File(s, "reports"));
        this.f = s(new File(s, "priority-reports"));
        this.g = s(new File(s, "native-reports"));
    }

    private void b(String str) {
        File file = new File(this.b, str);
        if (file.exists() && u(file)) {
            ax.G7.g.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void c(final String str) {
        String[] list;
        if (!this.b.exists() || (list = this.b.list(new FilenameFilter() { // from class: ax.O7.f
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean startsWith;
                startsWith = str2.startsWith(str);
                return startsWith;
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            b(str2);
        }
    }

    private File p(String str) {
        return t(new File(this.d, str));
    }

    private static synchronized File s(File file) {
        synchronized (g.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return file;
                    }
                    ax.G7.g.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                    file.delete();
                }
                if (!file.mkdirs()) {
                    ax.G7.g.f().d("Could not create Crashlytics-specific directory: " + file);
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static File t(File file) {
        file.mkdirs();
        return file;
    }

    static boolean u(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                u(file2);
            }
        }
        return file.delete();
    }

    private static <T> List<T> v(T[] tArr) {
        return tArr == null ? Collections.EMPTY_LIST : Arrays.asList(tArr);
    }

    static String w(String str) {
        return str.length() > 40 ? C0764i.z(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean x() {
        return !this.a.isEmpty();
    }

    public void d() {
        b(".com.google.firebase.crashlytics");
        b(".com.google.firebase.crashlytics-ndk");
        if (x()) {
            b(".com.google.firebase.crashlytics.files.v1");
            c(".com.google.firebase.crashlytics.files.v2" + File.pathSeparator);
        }
    }

    public boolean e(String str) {
        return u(new File(this.d, str));
    }

    public List<String> f() {
        return v(this.d.list());
    }

    public File g(String str) {
        return new File(this.c, str);
    }

    public List<File> h(FilenameFilter filenameFilter) {
        return v(this.c.listFiles(filenameFilter));
    }

    public File i(String str) {
        return new File(this.g, str);
    }

    public List<File> j() {
        return v(this.g.listFiles());
    }

    public File k(String str) {
        return t(new File(p(str), "native"));
    }

    public File l(String str) {
        return new File(this.f, str);
    }

    public List<File> m() {
        return v(this.f.listFiles());
    }

    public File n(String str) {
        return new File(this.e, str);
    }

    public List<File> o() {
        return v(this.e.listFiles());
    }

    public File q(String str, String str2) {
        return new File(p(str), str2);
    }

    public List<File> r(String str, FilenameFilter filenameFilter) {
        return v(p(str).listFiles(filenameFilter));
    }
}
