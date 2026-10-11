package j$.nio.file;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* loaded from: classes2.dex */
public final /* synthetic */ class f extends FileSystem {
    public final /* synthetic */ java.nio.file.FileSystem a;

    public static /* synthetic */ FileSystem I(java.nio.file.FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof g ? ((g) fileSystem).a : new f(fileSystem);
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ boolean A() {
        return this.a.isReadOnly();
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ D C() {
        return D.j(this.a.newWatchService());
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ j$.nio.file.spi.c D() {
        FileSystemProvider provider = this.a.provider();
        int i = j$.nio.file.spi.a.c;
        if (provider == null) {
            return null;
        }
        return provider instanceof j$.nio.file.spi.b ? ((j$.nio.file.spi.b) provider).a : new j$.nio.file.spi.a(provider);
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ Set H() {
        return this.a.supportedFileAttributeViews();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.FileSystem fileSystem = this.a;
        if (obj instanceof f) {
            obj = ((f) obj).a;
        }
        return fileSystem.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ Iterable j() {
        return this.a.getFileStores();
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ Path k(String str, String[] strArr) {
        return n.j(this.a.getPath(str, strArr));
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ PathMatcher n(String str) {
        java.nio.file.PathMatcher pathMatcher = this.a.getPathMatcher(str);
        if (pathMatcher == null) {
            return null;
        }
        return pathMatcher instanceof u ? ((u) pathMatcher).a : new t(pathMatcher);
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ String t() {
        return this.a.getSeparator();
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ j$.nio.file.attribute.B y() {
        UserPrincipalLookupService userPrincipalLookupService = this.a.getUserPrincipalLookupService();
        if (userPrincipalLookupService == null) {
            return null;
        }
        return new j$.nio.file.attribute.B(userPrincipalLookupService);
    }

    @Override // j$.nio.file.FileSystem
    public final Iterable o() {
        return new r(this.a.getRootDirectories());
    }

    public f(java.nio.file.FileSystem fileSystem) {
        this.a = fileSystem;
    }
}
