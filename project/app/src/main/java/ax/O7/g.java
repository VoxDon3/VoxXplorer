/*
 * Decompiled with CFR 0.152.
 */
package ax.O7;

import android.content.Context;
import ax.G7.j;
import ax.J7.i;
import ax.O7.f;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class g {
    final String a;
    private final File b;
    private final File c;
    private final File d;
    private final File e;
    private final File f;
    private final File g;

    public g(Context object) {
        File file;
        String string;
        this.a = string = j.a.e((Context)object).d();
        this.b = file = object.getFilesDir();
        if (this.x()) {
            object = new StringBuilder();
            ((StringBuilder)object).append(".crashlytics.v3");
            ((StringBuilder)object).append(File.separator);
            ((StringBuilder)object).append(ax.O7.g.w(string));
            object = ((StringBuilder)object).toString();
        } else {
            object = ".com.google.firebase.crashlytics.files.v1";
        }
        this.c = object = ax.O7.g.s(new File(file, (String)object));
        this.d = ax.O7.g.s(new File((File)object, "open-sessions"));
        this.e = ax.O7.g.s(new File((File)object, "reports"));
        this.f = ax.O7.g.s(new File((File)object, "priority-reports"));
        this.g = ax.O7.g.s(new File((File)object, "native-reports"));
    }

    public static /* synthetic */ boolean a(String string, File file, String string2) {
        return string2.startsWith(string);
    }

    private void b(String charSequence) {
        File file = new File(this.b, (String)charSequence);
        if (file.exists() && ax.O7.g.u(file)) {
            ax.G7.g g8 = ax.G7.g.f();
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("Deleted previous Crashlytics file system: ");
            ((StringBuilder)charSequence).append(file.getPath());
            g8.b(((StringBuilder)charSequence).toString());
        }
    }

    private void c(String stringArray) {
        if (this.b.exists() && (stringArray = this.b.list(new f((String)stringArray))) != null) {
            int n8 = stringArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                this.b(stringArray[i8]);
            }
        }
    }

    private File p(String string) {
        return ax.O7.g.t(new File(this.d, string));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static File s(File file) {
        synchronized (g.class) {
            Throwable throwable2;
            block8: {
                StringBuilder stringBuilder;
                ax.G7.g g8;
                block6: {
                    block7: {
                        try {
                            if (!file.exists()) break block6;
                            boolean bl = file.isDirectory();
                            if (!bl) break block7;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                        return file;
                    }
                    g8 = ax.G7.g.f();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected non-directory file: ");
                    stringBuilder.append(file);
                    stringBuilder.append("; deleting file and creating new directory.");
                    g8.b(stringBuilder.toString());
                    file.delete();
                }
                if (!file.mkdirs()) {
                    g8 = ax.G7.g.f();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not create Crashlytics-specific directory: ");
                    stringBuilder.append(file);
                    g8.d(stringBuilder.toString());
                }
                return file;
            }
            throw throwable2;
        }
    }

    private static File t(File file) {
        file.mkdirs();
        return file;
    }

    static boolean u(File file) {
        File[] fileArray = file.listFiles();
        if (fileArray != null) {
            int n8 = fileArray.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                ax.O7.g.u(fileArray[i8]);
            }
        }
        return file.delete();
    }

    private static <T> List<T> v(T[] TArray) {
        if (TArray == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(TArray);
    }

    static String w(String string) {
        if (string.length() > 40) {
            return i.z(string);
        }
        return string.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean x() {
        return this.a.isEmpty() ^ true;
    }

    public void d() {
        this.b(".com.google.firebase.crashlytics");
        this.b(".com.google.firebase.crashlytics-ndk");
        if (this.x()) {
            this.b(".com.google.firebase.crashlytics.files.v1");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(".com.google.firebase.crashlytics.files.v2");
            stringBuilder.append(File.pathSeparator);
            this.c(stringBuilder.toString());
        }
    }

    public boolean e(String string) {
        return ax.O7.g.u(new File(this.d, string));
    }

    public List<String> f() {
        return ax.O7.g.v(this.d.list());
    }

    public File g(String string) {
        return new File(this.c, string);
    }

    public List<File> h(FilenameFilter filenameFilter) {
        return ax.O7.g.v(this.c.listFiles(filenameFilter));
    }

    public File i(String string) {
        return new File(this.g, string);
    }

    public List<File> j() {
        return ax.O7.g.v(this.g.listFiles());
    }

    public File k(String string) {
        return ax.O7.g.t(new File(this.p(string), "native"));
    }

    public File l(String string) {
        return new File(this.f, string);
    }

    public List<File> m() {
        return ax.O7.g.v(this.f.listFiles());
    }

    public File n(String string) {
        return new File(this.e, string);
    }

    public List<File> o() {
        return ax.O7.g.v(this.e.listFiles());
    }

    public File q(String string, String string2) {
        return new File(this.p(string), string2);
    }

    public List<File> r(String string, FilenameFilter filenameFilter) {
        return ax.O7.g.v(this.p(string).listFiles(filenameFilter));
    }
}

