package j$.desugar.sun.nio.fs;

import j$.nio.file.A;
import j$.nio.file.B;
import j$.nio.file.C;
import j$.nio.file.D;
import j$.nio.file.EnumC3787a;
import j$.nio.file.FileSystem;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.stream.C3873k;
import j$.util.stream.Collectors;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class n implements Path {
    public static final Pattern h = Pattern.compile("/+");
    public final FileSystem a;
    public final String b;
    public final List c;
    public final boolean d;
    public final String e;
    public final String f;
    public volatile byte[] g;

    public n(FileSystem fileSystem, String str, String str2, String str3) {
        this(fileSystem, str.startsWith("/"), str.isEmpty() ? Collections.singletonList(HttpUrl.FRAGMENT_ENCODE_SET) : (List) DesugarArrays.stream(h.split(str)).filter(new m(0)).collect(new C3873k(new m(11), new m(12), new m(13), new m(14), Collectors.c)), str2, str3);
    }

    public n(FileSystem fileSystem, boolean z, List list, String str, String str2) {
        this.a = fileSystem;
        this.d = z;
        this.c = list;
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "/" : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(j$.com.android.tools.r8.a.O(list));
        this.b = sb.toString();
        this.e = str;
        this.f = str2;
    }

    @Override // j$.nio.file.Path
    public final FileSystem getFileSystem() {
        return this.a;
    }

    @Override // j$.nio.file.Path
    public final boolean isAbsolute() {
        return this.d;
    }

    @Override // j$.nio.file.Path
    public final Path getRoot() {
        if (!this.d) {
            return null;
        }
        String str = this.e;
        FileSystem fileSystem = this.a;
        String str2 = this.f;
        return new n(fileSystem, str2, str, str2);
    }

    @Override // j$.nio.file.Path
    public final Path getFileName() {
        List list = this.c;
        if (list.isEmpty()) {
            if (this.d) {
                return null;
            }
            return this;
        }
        return new n(this.a, (String) list.get(list.size() - 1), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final int getNameCount() {
        return this.c.size();
    }

    @Override // j$.nio.file.Path
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final n getName(int i) {
        if (i >= 0) {
            List list = this.c;
            if (i < list.size()) {
                return new n(this.a, (String) list.get(i), this.e, this.f);
            }
        }
        throw new IllegalArgumentException(String.format("Requested name for index (%d) is out of bound in \n%s.", Integer.valueOf(i), this));
    }

    @Override // j$.nio.file.Path
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final n getParent() {
        List list = this.c;
        int size = list.size();
        if (size == 0) {
            return null;
        }
        boolean z = this.d;
        if (size == 1 && !z) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("/");
        }
        sb.append(j$.com.android.tools.r8.a.O(list.subList(0, size - 1)));
        return new n(this.a, sb.toString(), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final Path subpath(int i, int i2) {
        return new n(this.a, j$.com.android.tools.r8.a.O(this.c.subList(i, i2)), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final boolean startsWith(String str) {
        return y(new n(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final boolean y(Path path) {
        int size;
        Objects.requireNonNull(path);
        if (!(path instanceof n)) {
            return false;
        }
        n nVar = (n) path;
        if (this.d != nVar.d || this.c.size() < (size = nVar.c.size())) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!getName(i).equals(nVar.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    public final boolean endsWith(String str) {
        return A(new n(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final boolean A(Path path) {
        Objects.requireNonNull(path);
        if (!(path instanceof n)) {
            return false;
        }
        n nVar = (n) path;
        if (nVar.d) {
            return equals(path);
        }
        int size = nVar.c.size();
        List list = this.c;
        if (list.size() < size) {
            return false;
        }
        int size2 = list.size();
        for (int i = size - 1; i >= 0; i--) {
            if (!getName((i - size) + size2).equals(nVar.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    public final boolean equals(Object obj) {
        return (obj instanceof n) && compareTo((n) obj) == 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Comparable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Path path) {
        return this.b.compareTo(((n) path).b);
    }

    @Override // j$.nio.file.Path
    public final Path normalize() {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str : this.c) {
            str.getClass();
            if (!str.equals(".")) {
                if (str.equals("..")) {
                    arrayDeque.removeLast();
                } else {
                    arrayDeque.add(str);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.d ? "/" : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(j$.com.android.tools.r8.a.O(arrayDeque));
        return new n(this.a, sb.toString(), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final n n(Path path) {
        if (path instanceof n) {
            if (((n) path).d) {
                return (n) path;
            }
            return new n(this.a, this.b + "/" + path, this.e, this.f);
        }
        throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
    }

    @Override // j$.nio.file.Path
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final n C(Path path) {
        if (!(Objects.requireNonNull(path) instanceof n)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        n parent = getParent();
        return parent == null ? (n) path : parent.n(path);
    }

    @Override // j$.nio.file.Path
    public final Path resolveSibling(String str) {
        return C(new n(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final Path I(Path path) {
        int i = 0;
        if (!(path instanceof n)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        if (this.d != ((n) path).d) {
            throw new IllegalArgumentException("'other' is different type of Path in absolute property.");
        }
        List list = ((n) path).c;
        List list2 = this.c;
        int size = list2.size();
        int size2 = list.size();
        while (i < size && i < size2 && ((String) list2.get(i)).equals(list.get(i))) {
            i++;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = i; i2 < size; i2++) {
            arrayList.add("..");
        }
        while (i < size2) {
            arrayList.add((String) list.get(i));
            i++;
        }
        return new n(this.a, false, arrayList, this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final File toFile() {
        return new File(this.b);
    }

    @Override // j$.nio.file.Path
    public final URI toUri() {
        char[] cArr = o.c;
        n absolutePath = toAbsolutePath();
        if (absolutePath.g == null) {
            absolutePath.g = absolutePath.b.getBytes(p.a);
        }
        byte[] bArr = absolutePath.g;
        StringBuilder sb = new StringBuilder("file:///");
        for (int i = 1; i < bArr.length; i++) {
            char c = (char) (bArr[i] & 255);
            long j = o.a;
            long j2 = o.b;
            if (c >= '@' ? !(c >= 128 || ((1 << (c - '@')) & j2) == 0) : (j & (1 << c)) != 0) {
                sb.append(c);
            } else {
                sb.append('%');
                char[] cArr2 = o.c;
                sb.append(cArr2[(c >> 4) & 15]);
                sb.append(cArr2[c & 15]);
            }
        }
        if (sb.charAt(sb.length() - 1) != '/' && toFile().isDirectory()) {
            sb.append('/');
        }
        try {
            return new URI(sb.toString());
        } catch (URISyntaxException e) {
            throw new AssertionError(e);
        }
    }

    @Override // j$.nio.file.Path
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final n toAbsolutePath() {
        if (this.d) {
            return this;
        }
        String str = this.f;
        FileSystem fileSystem = this.a;
        String str2 = this.e;
        return new n(fileSystem, str2, str2, str).n(this);
    }

    @Override // j$.nio.file.Path
    public final Path o(LinkOption[] linkOptionArr) {
        FileSystem fileSystem = this.a;
        fileSystem.D().a(this, EnumC3787a.READ);
        if (Arrays.asList(linkOptionArr).contains(LinkOption.NOFOLLOW_LINKS)) {
            return toAbsolutePath();
        }
        return new n(fileSystem, toFile().getCanonicalPath(), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final String toString() {
        return this.b;
    }

    @Override // j$.nio.file.Path
    public final C k(D d, A[] aArr, B... bArr) {
        throw new UnsupportedOperationException("Watch Service is not supported");
    }

    @Override // j$.nio.file.Path
    public final Path resolve(String str) {
        return n(getFileSystem().k(str, new String[0]));
    }

    @Override // j$.nio.file.Path
    public final C D(D d, A... aArr) {
        k(d, aArr, new B[0]);
        throw null;
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new j$.nio.file.m(this);
    }
}
