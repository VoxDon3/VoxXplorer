package j$.desugar.sun.nio.fs;

import j$.nio.channels.DesugarChannels;
import j$.nio.file.C3793d;
import j$.nio.file.CopyOption;
import j$.nio.file.EnumC3787a;
import j$.nio.file.FileSystem;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.OpenOption;
import j$.nio.file.Path;
import j$.nio.file.StandardOpenOption;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.FileAttribute;
import j$.nio.file.attribute.s;
import j$.nio.file.v;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class l extends j$.nio.file.spi.c {
    public final String b;
    public final String c = "/";
    public volatile h d;

    public l(String str) {
        this.b = str;
    }

    @Override // j$.nio.file.spi.c
    public final String l() {
        return "file";
    }

    @Override // j$.nio.file.spi.c
    public final FileSystem u(URI uri, Map map) {
        B(uri);
        throw new FileSystemAlreadyExistsException();
    }

    @Override // j$.nio.file.spi.c
    public final FileSystem j(URI uri) {
        h hVar;
        B(uri);
        h hVar2 = this.d;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (this) {
            try {
                hVar = this.d;
                if (hVar == null) {
                    hVar = new h(this, this.b, this.c);
                    this.d = hVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // j$.nio.file.spi.c
    public final Path k(URI uri) {
        byte b;
        h hVar = this.d;
        String str = this.b;
        String str2 = this.c;
        char[] cArr = o.c;
        if (!uri.isAbsolute()) {
            throw new IllegalArgumentException("URI is not absolute");
        }
        if (uri.isOpaque()) {
            throw new IllegalArgumentException("URI is not hierarchical");
        }
        String scheme = uri.getScheme();
        if (scheme == null || !scheme.equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI scheme is not \"file\"");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("URI has an authority component");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("URI has a fragment component");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("URI has a query component");
        }
        String rawPath = uri.getRawPath();
        int length = rawPath.length();
        if (length == 0) {
            throw new IllegalArgumentException("URI path component is empty");
        }
        if (rawPath.endsWith("/") && length > 1) {
            length--;
        }
        byte[] bArr = new byte[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char charAt = rawPath.charAt(i);
            if (charAt == '%') {
                int i4 = i + 2;
                i += 3;
                b = (byte) ((o.a(rawPath.charAt(i3)) << 4) | o.a(rawPath.charAt(i4)));
                if (b == 0) {
                    throw new IllegalArgumentException("Nul character not allowed");
                }
            } else {
                if (charAt == 0 || charAt >= 128) {
                    throw new IllegalArgumentException("Bad escape");
                }
                b = (byte) charAt;
                i = i3;
            }
            bArr[i2] = b;
            i2++;
        }
        if (i2 != length) {
            bArr = Arrays.copyOf(bArr, i2);
        }
        return new n(hVar, new String(bArr, p.a), str, str2);
    }

    @Override // j$.nio.file.spi.c
    public final DirectoryStream r(Path path, DirectoryStream.Filter filter) {
        j jVar = new j();
        jVar.a = new k(this, path, filter);
        return jVar;
    }

    @Override // j$.nio.file.spi.c
    public final void c(Path path, FileAttribute... fileAttributeArr) {
        if (path.getParent() != null && !Files.b(path.getParent(), new LinkOption[0])) {
            throw new NoSuchFileException(path.toString());
        }
        if (!path.toFile().mkdirs()) {
            throw new FileAlreadyExistsException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.c
    public final void f(Path path) {
        try {
            a(path, new EnumC3787a[0]);
            g(path);
        } catch (IOException unused) {
            throw new NoSuchFileException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.c
    public final boolean g(Path path) {
        return path.toFile().delete();
    }

    @Override // j$.nio.file.spi.c
    public final SeekableByteChannel q(Path path, Set set, FileAttribute... fileAttributeArr) {
        return s(path, set, fileAttributeArr);
    }

    @Override // j$.nio.file.spi.c
    public final FileChannel s(Path path, Set set, FileAttribute... fileAttributeArr) {
        if (path.toFile().isDirectory()) {
            throw new UnsupportedOperationException("The desugar library does not support creating a file channel on a directory: " + path);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((OpenOption) it.next()).getClass();
        }
        if (path.toFile().exists()) {
            if (set.contains(StandardOpenOption.CREATE_NEW) && set.contains(StandardOpenOption.WRITE)) {
                throw new FileAlreadyExistsException(path.toString());
            }
        } else if (!set.contains(StandardOpenOption.CREATE) && !set.contains(StandardOpenOption.CREATE_NEW)) {
            throw new NoSuchFileException(path.toString());
        }
        if (set.contains(StandardOpenOption.READ) && set.contains(StandardOpenOption.APPEND)) {
            throw new IllegalArgumentException("READ + APPEND not allowed");
        }
        StandardOpenOption standardOpenOption = StandardOpenOption.APPEND;
        if (set.contains(standardOpenOption) && set.contains(StandardOpenOption.TRUNCATE_EXISTING)) {
            throw new IllegalArgumentException("APPEND + TRUNCATE_EXISTING not allowed");
        }
        File file = path.toFile();
        StandardOpenOption standardOpenOption2 = StandardOpenOption.WRITE;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, (set.contains(standardOpenOption2) || set.contains(standardOpenOption)) ? set.contains(StandardOpenOption.SYNC) ? "rws" : set.contains(StandardOpenOption.DSYNC) ? "rwd" : "rw" : "r");
        if (set.contains(StandardOpenOption.TRUNCATE_EXISTING) && set.contains(standardOpenOption2)) {
            randomAccessFile.setLength(0L);
        }
        if (!set.contains(standardOpenOption) && !set.contains(StandardOpenOption.DELETE_ON_CLOSE)) {
            return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        }
        FileChannel convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        int i = e.e;
        if (convertMaybeLegacyFileChannelFromLibrary instanceof e) {
            convertMaybeLegacyFileChannelFromLibrary = ((e) convertMaybeLegacyFileChannelFromLibrary).a;
        }
        return new e(convertMaybeLegacyFileChannelFromLibrary, set.contains(StandardOpenOption.DELETE_ON_CLOSE), set.contains(standardOpenOption), path);
    }

    @Override // j$.nio.file.spi.c
    public final j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, FileAttribute... fileAttributeArr) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.c
    public final void d(Path path, Path path2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.c
    public final void e(Path path, Path path2, FileAttribute... fileAttributeArr) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.c
    public final Path z(Path path) {
        return new n(this.d, path.toFile().getCanonicalPath(), this.b, this.c);
    }

    @Override // j$.nio.file.spi.c
    public final void b(Path path, Path path2, CopyOption... copyOptionArr) {
        if (!C(copyOptionArr, v.REPLACE_EXISTING) && Files.b(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (C(copyOptionArr, v.ATOMIC_MOVE)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        FileInputStream fileInputStream = new FileInputStream(path.toFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path2.toFile());
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr, 0, 8192);
                    if (read >= 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // j$.nio.file.spi.c
    public final void o(Path path, Path path2, CopyOption... copyOptionArr) {
        if (!C(copyOptionArr, v.REPLACE_EXISTING) && Files.b(path2, new LinkOption[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (C(copyOptionArr, v.COPY_ATTRIBUTES)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        path.toFile().renameTo(path2.toFile());
    }

    public static boolean C(CopyOption[] copyOptionArr, v vVar) {
        for (CopyOption copyOption : copyOptionArr) {
            if (copyOption == vVar) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.nio.file.spi.c
    public final boolean n(Path path, Path path2) {
        if (path.equals(path2)) {
            return true;
        }
        a(path, new EnumC3787a[0]);
        a(path2, new EnumC3787a[0]);
        return path.toFile().equals(path2.toFile());
    }

    @Override // j$.nio.file.spi.c
    public final boolean m(Path path) {
        return path.toFile().isHidden();
    }

    @Override // j$.nio.file.spi.c
    public final C3793d i(Path path) {
        throw new SecurityException("getFileStore");
    }

    @Override // j$.nio.file.spi.c
    public final j$.nio.file.attribute.n h(Path path, Class cls, LinkOption... linkOptionArr) {
        cls.getClass();
        if (cls == j$.nio.file.attribute.d.class) {
            return (j$.nio.file.attribute.n) cls.cast(new b(path));
        }
        return null;
    }

    @Override // j$.nio.file.spi.c
    public final void a(Path path, EnumC3787a... enumC3787aArr) {
        boolean canRead;
        File file = path.toFile();
        if (!file.exists()) {
            throw new NoSuchFileException(path.toString());
        }
        boolean z = true;
        for (EnumC3787a enumC3787a : enumC3787aArr) {
            int i = i.a[enumC3787a.ordinal()];
            if (i == 1) {
                canRead = file.canRead();
            } else if (i == 2) {
                canRead = file.canWrite();
            } else if (i == 3) {
                canRead = file.canExecute();
            }
            z &= canRead;
        }
        if (!z) {
            throw new IOException(String.format("Unable to access file %s", path));
        }
    }

    @Override // j$.nio.file.spi.c
    public final BasicFileAttributes x(Path path, Class cls, LinkOption... linkOptionArr) {
        if (cls != BasicFileAttributes.class) {
            throw new UnsupportedOperationException();
        }
        return (BasicFileAttributes) cls.cast(((j$.nio.file.attribute.d) h(path, j$.nio.file.attribute.d.class, linkOptionArr)).readAttributes());
    }

    @Override // j$.nio.file.spi.c
    public final Map y(Path path, String str, LinkOption... linkOptionArr) {
        String[] split;
        int indexOf = str.indexOf(":");
        if (indexOf == -1) {
            split = str.split(",");
        } else {
            String substring = str.substring(0, indexOf);
            if ("basic".equals(substring)) {
                split = str.substring(indexOf + 1).split(",");
            } else {
                throw new UnsupportedOperationException("Requested attribute type for: " + substring + " is not available.");
            }
        }
        b bVar = new b(path);
        HashSet hashSet = b.b;
        a aVar = new a();
        aVar.a = new HashSet();
        aVar.b = new HashMap();
        for (String str2 : split) {
            if (str2.equals("*")) {
                aVar.c = true;
            } else {
                if (!hashSet.contains(str2)) {
                    throw new IllegalArgumentException("'" + str2 + "' not recognized");
                }
                aVar.a.add(str2);
            }
        }
        BasicFileAttributes readAttributes = bVar.readAttributes();
        if (aVar.b("size")) {
            aVar.a(Long.valueOf(((c) readAttributes).h), "size");
        }
        if (aVar.b("creationTime")) {
            aVar.a(((c) readAttributes).c, "creationTime");
        }
        if (aVar.b("lastAccessTime")) {
            aVar.a(((c) readAttributes).b, "lastAccessTime");
        }
        if (aVar.b("lastModifiedTime")) {
            aVar.a(((c) readAttributes).a, "lastModifiedTime");
        }
        if (aVar.b("fileKey")) {
            aVar.a(((c) readAttributes).i, "fileKey");
        }
        if (aVar.b("isDirectory")) {
            aVar.a(Boolean.valueOf(((c) readAttributes).e), "isDirectory");
        }
        if (aVar.b("isRegularFile")) {
            aVar.a(Boolean.valueOf(((c) readAttributes).d), "isRegularFile");
        }
        if (aVar.b("isSymbolicLink")) {
            aVar.a(Boolean.valueOf(((c) readAttributes).f), "isSymbolicLink");
        }
        if (aVar.b("isOther")) {
            aVar.a(Boolean.valueOf(((c) readAttributes).g), "isOther");
        }
        return Collections.unmodifiableMap(aVar.b);
    }

    @Override // j$.nio.file.spi.c
    public final void A(Path path, String str, Object obj, LinkOption... linkOptionArr) {
        int indexOf = str.indexOf(":");
        if (indexOf != -1) {
            String substring = str.substring(0, indexOf);
            if (!"basic".equals(substring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + substring + " is not available.");
            }
            str = str.substring(indexOf + 1);
        }
        b bVar = new b(path);
        if (str.equals("lastModifiedTime")) {
            bVar.a((s) obj, null, null);
            return;
        }
        if (str.equals("lastAccessTime")) {
            bVar.a(null, (s) obj, null);
        } else {
            if (str.equals("creationTime")) {
                return;
            }
            throw new IllegalArgumentException("'basic:" + str + "' not recognized");
        }
    }

    public static void B(URI uri) {
        if (!uri.getScheme().equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI does not match this provider");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("Authority component present");
        }
        String path = uri.getPath();
        if (path == null) {
            throw new IllegalArgumentException("Path component is undefined");
        }
        if (!path.equals("/")) {
            throw new IllegalArgumentException("Path component should be '/'");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("Query component present");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("Fragment component present");
        }
    }
}
