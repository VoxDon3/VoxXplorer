package j$.nio.file.spi;

import j$.nio.file.C3791b;
import j$.nio.file.C3793d;
import j$.nio.file.EnumC3787a;
import j$.nio.file.attribute.C3788a;
import j$.nio.file.attribute.C3789b;
import j$.nio.file.attribute.C3790c;
import j$.nio.file.attribute.d;
import j$.nio.file.attribute.f;
import j$.nio.file.attribute.g;
import j$.nio.file.attribute.l;
import j$.nio.file.attribute.m;
import j$.nio.file.attribute.o;
import j$.nio.file.attribute.p;
import j$.nio.file.attribute.q;
import j$.nio.file.attribute.u;
import j$.nio.file.e;
import j$.nio.file.k;
import j$.nio.file.n;
import j$.nio.file.x;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final /* synthetic */ class b extends FileSystemProvider {
    public static final /* synthetic */ int b = 0;
    public final /* synthetic */ c a;

    public /* synthetic */ b(c cVar) {
        this.a = cVar;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        c cVar = this.a;
        j$.nio.file.Path j = n.j(path);
        EnumC3787a[] enumC3787aArr = null;
        if (accessModeArr != null) {
            int length = accessModeArr.length;
            EnumC3787a[] enumC3787aArr2 = new EnumC3787a[length];
            for (int i = 0; i < length; i++) {
                AccessMode accessMode = accessModeArr[i];
                enumC3787aArr2[i] = accessMode == null ? null : accessMode == AccessMode.READ ? EnumC3787a.READ : accessMode == AccessMode.WRITE ? EnumC3787a.WRITE : EnumC3787a.EXECUTE;
            }
            enumC3787aArr = enumC3787aArr2;
        }
        cVar.a(j, enumC3787aArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        c cVar = this.a;
        j$.nio.file.Path j = n.j(path);
        j$.nio.file.Path j2 = n.j(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C3791b.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        cVar.b(j, j2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.a.c(n.j(path), j$.com.android.tools.r8.a.T(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.a.d(n.j(path), n.j(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.a.e(n.j(path), n.j(path2), j$.com.android.tools.r8.a.T(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.a.f(n.j(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.a.g(n.j(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        c cVar = this.a;
        if (obj instanceof b) {
            obj = ((b) obj).a;
        }
        return cVar.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        j$.nio.file.attribute.n h = this.a.h(n.j(path), x.c(cls), x.i(linkOptionArr));
        if (h == null) {
            return null;
        }
        if (h instanceof l) {
            return ((l) h).a;
        }
        if (h instanceof d) {
            d dVar = (d) h;
            return dVar instanceof C3789b ? ((C3789b) dVar).a : dVar instanceof g ? ((g) dVar).a : dVar instanceof u ? ((u) dVar).a : new C3790c(dVar);
        }
        if (!(h instanceof q)) {
            return h instanceof j$.nio.file.attribute.x ? ((j$.nio.file.attribute.x) h).a : new m(h);
        }
        q qVar = (q) h;
        return qVar instanceof o ? ((o) qVar).a : qVar instanceof C3788a ? ((C3788a) qVar).a : qVar instanceof u ? ((u) qVar).a : new p(qVar);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        C3793d i = this.a.i(n.j(path));
        int i2 = e.a;
        if (i == null) {
            return null;
        }
        return i.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return j$.nio.file.g.j(this.a.j(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return j$.nio.file.o.j(this.a.k(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.a.l();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.a.m(n.j(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.a.n(n.j(path), n.j(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        c cVar = this.a;
        j$.nio.file.Path j = n.j(path);
        j$.nio.file.Path j2 = n.j(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C3791b.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        cVar.o(j, j2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        j$.nio.channels.a p = this.a.p(n.j(path), x.g(set), executorService, j$.com.android.tools.r8.a.T(fileAttributeArr));
        int i = j$.nio.channels.b.a;
        if (p == null) {
            return null;
        }
        return p.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.q(n.j(path), x.g(set), j$.com.android.tools.r8.a.T(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.s(n.j(path), x.g(set), j$.com.android.tools.r8.a.T(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return j$.nio.file.g.j(this.a.u(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return j$.nio.file.g.j(this.a.t(n.j(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        j$.nio.file.OpenOption[] openOptionArr2;
        c cVar = this.a;
        j$.nio.file.Path j = n.j(path);
        if (openOptionArr == null) {
            openOptionArr2 = null;
        } else {
            int length = openOptionArr.length;
            j$.nio.file.OpenOption[] openOptionArr3 = new j$.nio.file.OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr3[i] = k.a(openOptionArr[i]);
            }
            openOptionArr2 = openOptionArr3;
        }
        return cVar.v(j, openOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        j$.nio.file.OpenOption[] openOptionArr2;
        c cVar = this.a;
        j$.nio.file.Path j = n.j(path);
        if (openOptionArr == null) {
            openOptionArr2 = null;
        } else {
            int length = openOptionArr.length;
            j$.nio.file.OpenOption[] openOptionArr3 = new j$.nio.file.OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr3[i] = k.a(openOptionArr[i]);
            }
            openOptionArr2 = openOptionArr3;
        }
        return cVar.w(j, openOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return f.a(this.a.x(n.j(path), x.d(cls), x.i(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return x.e(this.a.y(n.j(path), str, x.i(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return j$.nio.file.o.j(this.a.z(n.j(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.a.A(n.j(path), str, x.f(obj), x.i(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new j$.nio.file.q(this.a.r(n.j(path), new j$.desugar.sun.nio.fs.g(1, filter)));
    }
}
