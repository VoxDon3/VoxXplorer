/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.io;

import ax.Gb.l;
import ax.xc.A;
import ax.xc.C;
import ax.xc.p;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileSystem {
    public static final Companion Companion = okhttp3.internal.io.FileSystem$Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    public A appendingSink(File var1) throws FileNotFoundException;

    public void delete(File var1) throws IOException;

    public void deleteContents(File var1) throws IOException;

    public boolean exists(File var1);

    public void rename(File var1, File var2) throws IOException;

    public A sink(File var1) throws FileNotFoundException;

    public long size(File var1);

    public C source(File var1) throws FileNotFoundException;

    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        private static final class SystemFileSystem
        implements FileSystem {
            @Override
            public A appendingSink(File file) throws FileNotFoundException {
                l.f(file, "file");
                try {
                    A a8 = p.a(file);
                    return a8;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    file.getParentFile().mkdirs();
                    return p.a(file);
                }
            }

            @Override
            public void delete(File file) throws IOException {
                l.f(file, "file");
                if (!file.delete() && file.exists()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("failed to delete ");
                    stringBuilder.append(file);
                    throw new IOException(stringBuilder.toString());
                }
            }

            @Override
            public void deleteContents(File object) throws IOException {
                l.f(object, "directory");
                Object object2 = ((File)object).listFiles();
                if (object2 != null) {
                    int n8 = ((File[])object2).length;
                    for (int i8 = 0; i8 < n8; ++i8) {
                        object = object2[i8];
                        if (((File)object).isDirectory()) {
                            l.e(object, "file");
                            this.deleteContents((File)object);
                        }
                        if (((File)object).delete()) {
                            continue;
                        }
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("failed to delete ");
                        ((StringBuilder)object2).append(object);
                        throw new IOException(((StringBuilder)object2).toString());
                    }
                    return;
                }
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("not a readable directory: ");
                ((StringBuilder)object2).append(object);
                throw new IOException(((StringBuilder)object2).toString());
            }

            @Override
            public boolean exists(File file) {
                l.f(file, "file");
                return file.exists();
            }

            @Override
            public void rename(File file, File file2) throws IOException {
                l.f(file, "from");
                l.f(file2, "to");
                this.delete(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("failed to rename ");
                stringBuilder.append(file);
                stringBuilder.append(" to ");
                stringBuilder.append(file2);
                throw new IOException(stringBuilder.toString());
            }

            @Override
            public A sink(File file) throws FileNotFoundException {
                l.f(file, "file");
                try {
                    A a8 = p.i(file, false, 1, null);
                    return a8;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    file.getParentFile().mkdirs();
                    return p.i(file, false, 1, null);
                }
            }

            @Override
            public long size(File file) {
                l.f(file, "file");
                return file.length();
            }

            @Override
            public C source(File file) throws FileNotFoundException {
                l.f(file, "file");
                return p.j(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }
    }
}

