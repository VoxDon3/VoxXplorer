package j$.nio.file;

import j$.util.C3805a;
import j$.util.O;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.o0;
import java.io.File;
import java.net.URI;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final /* synthetic */ class o implements java.nio.file.Path {
    public final /* synthetic */ Path a;

    public /* synthetic */ o(Path path) {
        this.a = path;
    }

    public static /* synthetic */ java.nio.file.Path j(Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof n ? ((n) path).a : new o(path);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.nio.file.Path path) {
        return this.a.compareTo(x.b(path));
    }

    @Override // java.nio.file.Path
    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public final /* synthetic */ int compareTo2(java.nio.file.Path path) {
        return this.a.compareTo(n.j(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean endsWith(java.nio.file.Path path) {
        return this.a.A(n.j(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        Path path = this.a;
        if (obj instanceof o) {
            obj = ((o) obj).a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(Consumer<? super java.nio.file.Path> consumer) {
        j$.com.android.tools.r8.a.I(this.a, consumer);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getFileName() {
        return j(this.a.getFileName());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.FileSystem getFileSystem() {
        return g.j(this.a.getFileSystem());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getName(int i) {
        return j(this.a.getName(i));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getParent() {
        return j(this.a.getParent());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path getRoot() {
        return j(this.a.getRoot());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path normalize() {
        return j(this.a.normalize());
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr) {
        C D = this.a.D(D.j(watchService), x.j(kindArr));
        if (D == null) {
            return null;
        }
        return D.a;
    }

    @Override // java.nio.file.Path, java.nio.file.Watchable
    public final /* synthetic */ WatchKey register(WatchService watchService, WatchEvent.Kind[] kindArr, WatchEvent.Modifier[] modifierArr) {
        B[] bArr;
        Path path = this.a;
        D j = D.j(watchService);
        A[] j2 = x.j(kindArr);
        if (modifierArr == null) {
            bArr = null;
        } else {
            int length = modifierArr.length;
            bArr = new B[length];
            for (int i = 0; i < length; i++) {
                WatchEvent.Modifier modifier = modifierArr[i];
                bArr[i] = modifier == null ? null : new B(modifier);
            }
        }
        C k = path.k(j, j2, bArr);
        if (k == null) {
            return null;
        }
        return k.a;
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path relativize(java.nio.file.Path path) {
        return j(this.a.I(n.j(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(String str) {
        return j(this.a.resolve(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolve(java.nio.file.Path path) {
        return j(this.a.n(n.j(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(String str) {
        return j(this.a.resolveSibling(str));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path resolveSibling(java.nio.file.Path path) {
        return j(this.a.C(n.j(path)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ boolean startsWith(java.nio.file.Path path) {
        return this.a.y(n.j(path));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path subpath(int i, int i2) {
        return j(this.a.subpath(i, i2));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path toAbsolutePath() {
        return j(this.a.toAbsolutePath());
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ java.nio.file.Path toRealPath(java.nio.file.LinkOption[] linkOptionArr) {
        return j(this.a.o(x.i(linkOptionArr)));
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // java.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }

    @Override // java.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new s(this.a.iterator());
    }

    @Override // java.lang.Iterable
    public final Spliterator<java.nio.file.Path> spliterator() {
        j$.util.Spliterator o0Var;
        j$.util.Spliterator spliterator;
        Iterable iterable = this.a;
        if (iterable instanceof j$.lang.a) {
            spliterator = ((j$.lang.a) iterable).spliterator();
        } else if (iterable instanceof LinkedHashSet) {
            spliterator = Spliterators.spliterator((LinkedHashSet) iterable, 17);
        } else {
            if (iterable instanceof SortedSet) {
                SortedSet sortedSet = (SortedSet) iterable;
                o0Var = new O(sortedSet, sortedSet);
            } else if (iterable instanceof Set) {
                spliterator = Spliterators.spliterator((Set) iterable, 1);
            } else if (iterable instanceof List) {
                List list = (List) iterable;
                if (list instanceof RandomAccess) {
                    o0Var = new C3805a(list);
                } else {
                    spliterator = Spliterators.spliterator(list, 16);
                }
            } else if (iterable instanceof Collection) {
                spliterator = Spliterators.spliterator((Collection) iterable, 0);
            } else {
                o0Var = new o0((Iterator) Objects.requireNonNull(iterable.iterator()), 0);
            }
            spliterator = o0Var;
        }
        return Spliterator.Wrapper.convert(spliterator);
    }
}
