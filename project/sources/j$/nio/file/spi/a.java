package j$.nio.file.spi;

import j$.nio.file.C3793d;
import j$.nio.file.CopyOption;
import j$.nio.file.EnumC3787a;
import j$.nio.file.FileSystem;
import j$.nio.file.LinkOption;
import j$.nio.file.OpenOption;
import j$.nio.file.Path;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.C3788a;
import j$.nio.file.attribute.C3789b;
import j$.nio.file.attribute.C3790c;
import j$.nio.file.attribute.FileAttribute;
import j$.nio.file.attribute.e;
import j$.nio.file.attribute.g;
import j$.nio.file.attribute.l;
import j$.nio.file.attribute.m;
import j$.nio.file.attribute.n;
import j$.nio.file.attribute.p;
import j$.nio.file.attribute.u;
import j$.nio.file.f;
import j$.nio.file.o;
import j$.nio.file.q;
import j$.nio.file.x;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class a extends c {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ FileSystemProvider b;

    public /* synthetic */ a(FileSystemProvider fileSystemProvider) {
        this.b = fileSystemProvider;
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void A(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.b.setAttribute(o.j(path), str, x.f(obj), x.k(linkOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void a(Path path, EnumC3787a[] enumC3787aArr) {
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path j = o.j(path);
        AccessMode[] accessModeArr = null;
        if (enumC3787aArr != null) {
            int length = enumC3787aArr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i = 0; i < length; i++) {
                EnumC3787a enumC3787a = enumC3787aArr[i];
                accessModeArr2[i] = enumC3787a == null ? null : enumC3787a == EnumC3787a.READ ? AccessMode.READ : enumC3787a == EnumC3787a.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(j, accessModeArr);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void b(Path path, Path path2, CopyOption[] copyOptionArr) {
        this.b.copy(o.j(path), o.j(path2), j$.com.android.tools.r8.a.U(copyOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void c(Path path, FileAttribute[] fileAttributeArr) {
        this.b.createDirectory(o.j(path), j$.com.android.tools.r8.a.V(fileAttributeArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void d(Path path, Path path2) {
        this.b.createLink(o.j(path), o.j(path2));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void e(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.b.createSymbolicLink(o.j(path), o.j(path2), j$.com.android.tools.r8.a.V(fileAttributeArr));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystemProvider fileSystemProvider = this.b;
        if (obj instanceof a) {
            obj = ((a) obj).b;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void f(Path path) {
        this.b.delete(o.j(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean g(Path path) {
        return this.b.deleteIfExists(o.j(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ n h(Path path, Class cls, LinkOption[] linkOptionArr) {
        FileAttributeView fileAttributeView = this.b.getFileAttributeView(o.j(path), x.c(cls), x.k(linkOptionArr));
        if (fileAttributeView == null) {
            return null;
        }
        if (fileAttributeView instanceof m) {
            return ((m) fileAttributeView).a;
        }
        if (fileAttributeView instanceof BasicFileAttributeView) {
            BasicFileAttributeView basicFileAttributeView = (BasicFileAttributeView) fileAttributeView;
            return basicFileAttributeView instanceof C3790c ? ((C3790c) basicFileAttributeView).a : basicFileAttributeView instanceof DosFileAttributeView ? new g((DosFileAttributeView) basicFileAttributeView) : basicFileAttributeView instanceof PosixFileAttributeView ? new u((PosixFileAttributeView) basicFileAttributeView) : new C3789b(basicFileAttributeView);
        }
        if (!(fileAttributeView instanceof FileOwnerAttributeView)) {
            return fileAttributeView instanceof UserDefinedFileAttributeView ? new j$.nio.file.attribute.x((UserDefinedFileAttributeView) fileAttributeView) : new l(fileAttributeView);
        }
        FileOwnerAttributeView fileOwnerAttributeView = (FileOwnerAttributeView) fileAttributeView;
        return fileOwnerAttributeView instanceof p ? ((p) fileOwnerAttributeView).a : fileOwnerAttributeView instanceof AclFileAttributeView ? new C3788a((AclFileAttributeView) fileOwnerAttributeView) : fileOwnerAttributeView instanceof PosixFileAttributeView ? new u((PosixFileAttributeView) fileOwnerAttributeView) : new j$.nio.file.attribute.o(fileOwnerAttributeView);
    }

    public final /* synthetic */ int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ C3793d i(Path path) {
        FileStore fileStore = this.b.getFileStore(o.j(path));
        if (fileStore == null) {
            return null;
        }
        return new C3793d(fileStore);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ FileSystem j(URI uri) {
        return f.I(this.b.getFileSystem(uri));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Path k(URI uri) {
        return j$.nio.file.n.j(this.b.getPath(uri));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ String l() {
        return this.b.getScheme();
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean m(Path path) {
        return this.b.isHidden(o.j(path));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ boolean n(Path path, Path path2) {
        return this.b.isSameFile(o.j(path), o.j(path2));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ void o(Path path, Path path2, CopyOption[] copyOptionArr) {
        this.b.move(o.j(path), o.j(path2), j$.com.android.tools.r8.a.U(copyOptionArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        AsynchronousFileChannel newAsynchronousFileChannel = this.b.newAsynchronousFileChannel(o.j(path), x.g(set), executorService, j$.com.android.tools.r8.a.V(fileAttributeArr));
        if (newAsynchronousFileChannel == null) {
            return null;
        }
        return new j$.nio.channels.a(newAsynchronousFileChannel);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ SeekableByteChannel q(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.b.newByteChannel(o.j(path), x.g(set), j$.com.android.tools.r8.a.V(fileAttributeArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ FileChannel s(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.b.newFileChannel(o.j(path), x.g(set), j$.com.android.tools.r8.a.V(fileAttributeArr));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ FileSystem t(Path path, Map map) {
        return f.I(this.b.newFileSystem(o.j(path), (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ FileSystem u(URI uri, Map map) {
        return f.I(this.b.newFileSystem(uri, (Map<String, ?>) map));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ InputStream v(Path path, OpenOption[] openOptionArr) {
        java.nio.file.OpenOption[] openOptionArr2;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path j = o.j(path);
        if (openOptionArr == null) {
            openOptionArr2 = null;
        } else {
            int length = openOptionArr.length;
            java.nio.file.OpenOption[] openOptionArr3 = new java.nio.file.OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr3[i] = j$.nio.file.l.a(openOptionArr[i]);
            }
            openOptionArr2 = openOptionArr3;
        }
        return fileSystemProvider.newInputStream(j, openOptionArr2);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ OutputStream w(Path path, OpenOption[] openOptionArr) {
        java.nio.file.OpenOption[] openOptionArr2;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path j = o.j(path);
        if (openOptionArr == null) {
            openOptionArr2 = null;
        } else {
            int length = openOptionArr.length;
            java.nio.file.OpenOption[] openOptionArr3 = new java.nio.file.OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr3[i] = j$.nio.file.l.a(openOptionArr[i]);
            }
            openOptionArr2 = openOptionArr3;
        }
        return fileSystemProvider.newOutputStream(j, openOptionArr2);
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ BasicFileAttributes x(Path path, Class cls, LinkOption[] linkOptionArr) {
        return e.a(this.b.readAttributes(o.j(path), x.d(cls), x.k(linkOptionArr)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Map y(Path path, String str, LinkOption[] linkOptionArr) {
        return x.e(this.b.readAttributes(o.j(path), str, x.k(linkOptionArr)));
    }

    @Override // j$.nio.file.spi.c
    public final /* synthetic */ Path z(Path path) {
        return j$.nio.file.n.j(this.b.readSymbolicLink(o.j(path)));
    }

    @Override // j$.nio.file.spi.c
    public final DirectoryStream r(Path path, DirectoryStream.Filter filter) {
        return new q(this.b.newDirectoryStream(o.j(path), new j$.desugar.sun.nio.fs.g(1, filter)));
    }
}
