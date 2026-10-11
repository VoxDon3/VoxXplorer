package j$.nio.file;

import j$.util.Spliterator;
import j$.util.c0;
import java.io.File;
import java.net.URI;
import java.nio.file.WatchEvent;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements Path, j$.lang.a {
    public final /* synthetic */ java.nio.file.Path a;

    public /* synthetic */ n(java.nio.file.Path path) {
        this.a = path;
    }

    public static /* synthetic */ Path j(java.nio.file.Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof o ? ((o) path).a : new n(path);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean A(Path path) {
        return this.a.endsWith(o.j(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path C(Path path) {
        return j(this.a.resolveSibling(o.j(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ C D(D d, A[] aArr) {
        return C.a(this.a.register(d == null ? null : d.a, x.l(aArr)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path I(Path path) {
        return j(this.a.relativize(o.j(path)));
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo((java.nio.file.Path) x.b(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.Path path = this.a;
        if (obj instanceof n) {
            obj = ((n) obj).a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        j$.com.android.tools.r8.a.I(this.a, consumer);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return j(this.a.getFileName());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ FileSystem getFileSystem() {
        return f.I(this.a.getFileSystem());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getName(int i) {
        return j(this.a.getName(i));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return j(this.a.getParent());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return j(this.a.getRoot());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ C k(D d, A[] aArr, B[] bArr) {
        java.nio.file.Path path = this.a;
        WatchEvent.Modifier[] modifierArr = null;
        WatchService watchService = d == null ? null : d.a;
        WatchEvent.Kind<?>[] l = x.l(aArr);
        if (bArr != null) {
            int length = bArr.length;
            WatchEvent.Modifier[] modifierArr2 = new WatchEvent.Modifier[length];
            for (int i = 0; i < length; i++) {
                B b = bArr[i];
                modifierArr2[i] = b == null ? null : b.a;
            }
            modifierArr = modifierArr2;
        }
        return C.a(path.register(watchService, l, modifierArr));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path n(Path path) {
        return j(this.a.resolve(o.j(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return j(this.a.normalize());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path o(LinkOption[] linkOptionArr) {
        return j(this.a.toRealPath(x.k(linkOptionArr)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return j(this.a.resolve(str));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return j(this.a.resolveSibling(str));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final /* synthetic */ Spliterator spliterator() {
        return c0.a(this.a.spliterator());
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator<Path> spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path subpath(int i, int i2) {
        return j(this.a.subpath(i, i2));
    }

    @Override // j$.nio.file.Path
    /* renamed from: t */
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo(o.j(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return j(this.a.toAbsolutePath());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean y(Path path) {
        return this.a.startsWith(o.j(path));
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new s(this.a.iterator());
    }
}
