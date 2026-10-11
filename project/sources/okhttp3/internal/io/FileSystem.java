package okhttp3.internal.io;

import ax.Gb.l;
import ax.xc.C;
import ax.xc.InterfaceC3482A;
import ax.xc.p;
import ax.xc.q;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface FileSystem {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public InterfaceC3482A appendingSink(File file) throws FileNotFoundException {
                l.f(file, "file");
                try {
                    return p.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return p.a(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(File file) throws IOException {
                l.f(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(File file) throws IOException {
                l.f(file, "directory");
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    throw new IOException("not a readable directory: " + file);
                }
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        l.e(file2, "file");
                        deleteContents(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(File file) {
                l.f(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(File file, File file2) throws IOException {
                l.f(file, "from");
                l.f(file2, "to");
                delete(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            @Override // okhttp3.internal.io.FileSystem
            public InterfaceC3482A sink(File file) throws FileNotFoundException {
                InterfaceC3482A g;
                InterfaceC3482A g2;
                l.f(file, "file");
                try {
                    g2 = q.g(file, false, 1, null);
                    return g2;
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    g = q.g(file, false, 1, null);
                    return g;
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(File file) {
                l.f(file, "file");
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public C source(File file) throws FileNotFoundException {
                l.f(file, "file");
                return p.j(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    InterfaceC3482A appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    InterfaceC3482A sink(File file) throws FileNotFoundException;

    long size(File file);

    C source(File file) throws FileNotFoundException;
}
