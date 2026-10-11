package j$.nio.file;

import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* loaded from: classes2.dex */
public final /* synthetic */ class g extends java.nio.file.FileSystem {
    public final /* synthetic */ FileSystem a;

    public /* synthetic */ g(FileSystem fileSystem) {
        this.a = fileSystem;
    }

    public static /* synthetic */ java.nio.file.FileSystem j(FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof f ? ((f) fileSystem).a : new g(fileSystem);
    }

    @Override // java.nio.file.FileSystem, java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystem fileSystem = this.a;
        if (obj instanceof g) {
            obj = ((g) obj).a;
        }
        return fileSystem.equals(obj);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Iterable getFileStores() {
        return this.a.j();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.Path getPath(String str, String[] strArr) {
        return o.j(this.a.k(str, strArr));
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ java.nio.file.PathMatcher getPathMatcher(String str) {
        PathMatcher n = this.a.n(str);
        if (n == null) {
            return null;
        }
        return n instanceof t ? ((t) n).a : new u(n);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ String getSeparator() {
        return this.a.t();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ UserPrincipalLookupService getUserPrincipalLookupService() {
        j$.nio.file.attribute.B y = this.a.y();
        int i = j$.nio.file.attribute.C.a;
        if (y == null) {
            return null;
        }
        return y.a;
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ boolean isReadOnly() {
        return this.a.A();
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ WatchService newWatchService() {
        D C = this.a.C();
        if (C == null) {
            return null;
        }
        return C.a;
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ FileSystemProvider provider() {
        j$.nio.file.spi.c D = this.a.D();
        int i = j$.nio.file.spi.b.b;
        if (D == null) {
            return null;
        }
        return D instanceof j$.nio.file.spi.a ? ((j$.nio.file.spi.a) D).b : new j$.nio.file.spi.b(D);
    }

    @Override // java.nio.file.FileSystem
    public final /* synthetic */ Set supportedFileAttributeViews() {
        return this.a.H();
    }

    @Override // java.nio.file.FileSystem
    public final Iterable getRootDirectories() {
        return new r(this.a.o());
    }
}
