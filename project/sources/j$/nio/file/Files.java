package j$.nio.file;

import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileAttribute;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Files {
    public static final /* synthetic */ int a = 0;

    static {
        j$.com.android.tools.r8.a.R(new Object[]{StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE});
    }

    public static j$.nio.file.spi.c c(Path path) {
        return path.getFileSystem().D();
    }

    public static OutputStream newOutputStream(Path path, OpenOption... openOptionArr) {
        return c(path).w(path, openOptionArr);
    }

    public static SeekableByteChannel newByteChannel(Path path, Set<? extends OpenOption> set, FileAttribute<?>... fileAttributeArr) {
        return c(path).q(path, set, fileAttributeArr);
    }

    public static DirectoryStream<Path> newDirectoryStream(Path path) {
        return c(path).r(path, j.a);
    }

    public static void delete(Path path) {
        c(path).f(path);
    }

    public static Path move(Path path, Path path2, CopyOption... copyOptionArr) {
        j$.nio.file.spi.c c = c(path);
        if (c(path2).equals(c)) {
            c.o(path, path2, copyOptionArr);
            return path2;
        }
        int length = copyOptionArr.length;
        int i = length + 2;
        CopyOption[] copyOptionArr2 = new CopyOption[i];
        for (int i2 = 0; i2 < length; i2++) {
            CopyOption copyOption = copyOptionArr[i2];
            if (copyOption == v.ATOMIC_MOVE) {
                throw new AtomicMoveNotSupportedException(null, null, "Atomic move between providers is not supported");
            }
            copyOptionArr2[i2] = copyOption;
        }
        copyOptionArr2[length] = LinkOption.NOFOLLOW_LINKS;
        copyOptionArr2[length + 1] = v.COPY_ATTRIBUTES;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < i; i3++) {
            CopyOption copyOption2 = copyOptionArr2[i3];
            if (copyOption2 == v.REPLACE_EXISTING) {
                z2 = true;
            } else if (copyOption2 == LinkOption.NOFOLLOW_LINKS) {
                z = false;
            } else {
                if (copyOption2 != v.COPY_ATTRIBUTES) {
                    copyOption2.getClass();
                    throw new UnsupportedOperationException("'" + copyOption2 + "' is not a recognized copy option");
                }
                z3 = true;
            }
        }
        BasicFileAttributes x = c(path).x(path, BasicFileAttributes.class, z ? new LinkOption[0] : new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
        if (x.isSymbolicLink()) {
            throw new IOException("Copying of symbolic links not supported");
        }
        if (z2) {
            path2.getFileSystem().D().g(path2);
        } else if (b(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (x.isDirectory()) {
            path2.getFileSystem().D().c(path2, new FileAttribute[0]);
        } else {
            InputStream v = path.getFileSystem().D().v(path, new OpenOption[0]);
            try {
                a(v, path2, new CopyOption[0]);
                if (v != null) {
                    v.close();
                }
            } catch (Throwable th) {
                if (v != null) {
                    try {
                        v.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (z3) {
            try {
                ((j$.nio.file.attribute.d) path2.getFileSystem().D().h(path2, j$.nio.file.attribute.d.class, new LinkOption[0])).a(x.lastModifiedTime(), x.lastAccessTime(), x.creationTime());
            } catch (Throwable th3) {
                try {
                    delete(path2);
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        delete(path);
        return path2;
    }

    public static boolean isSymbolicLink(Path path) {
        try {
            return c(path).x(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS).isSymbolicLink();
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean isDirectory(Path path, LinkOption... linkOptionArr) {
        if (linkOptionArr.length == 0) {
            c(path);
        }
        try {
            return c(path).x(path, BasicFileAttributes.class, linkOptionArr).isDirectory();
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean b(Path path, LinkOption... linkOptionArr) {
        if (linkOptionArr.length == 0) {
            c(path);
        }
        try {
            int length = linkOptionArr.length;
            int i = 0;
            boolean z = true;
            while (i < length) {
                LinkOption linkOption = linkOptionArr[i];
                if (linkOption != LinkOption.NOFOLLOW_LINKS) {
                    linkOption.getClass();
                    throw new AssertionError("Should not get here");
                }
                i++;
                z = false;
            }
            if (!z) {
                c(path).x(path, BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
                return true;
            }
            c(path).a(path, new EnumC3787a[0]);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(InputStream inputStream, Path path, CopyOption... copyOptionArr) {
        Objects.requireNonNull(inputStream);
        int length = copyOptionArr.length;
        int i = 0;
        boolean z = false;
        while (i < length) {
            CopyOption copyOption = copyOptionArr[i];
            if (copyOption != v.REPLACE_EXISTING) {
                if (copyOption == null) {
                    throw new NullPointerException("options contains 'null'");
                }
                throw new UnsupportedOperationException(copyOption + " not supported");
            }
            i++;
            z = true;
        }
        if (z) {
            try {
                path.getFileSystem().D().g(path);
            } catch (SecurityException e) {
                e = e;
            }
        }
        e = null;
        try {
            OutputStream newOutputStream = newOutputStream(path, StandardOpenOption.CREATE_NEW, StandardOpenOption.WRITE);
            try {
                if (inputStream instanceof InputStreamRetargetInterface) {
                    ((InputStreamRetargetInterface) inputStream).transferTo(newOutputStream);
                } else {
                    DesugarInputStream.transferTo(inputStream, newOutputStream);
                }
                if (newOutputStream != null) {
                    newOutputStream.close();
                }
            } catch (Throwable th) {
                if (newOutputStream != null) {
                    try {
                        newOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (FileAlreadyExistsException e2) {
            if (e == null) {
                throw e2;
            }
            throw e;
        }
    }
}
