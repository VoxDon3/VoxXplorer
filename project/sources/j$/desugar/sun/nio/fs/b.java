package j$.desugar.sun.nio.fs;

import j$.nio.file.EnumC3787a;
import j$.nio.file.Path;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.s;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class b implements j$.nio.file.attribute.d {
    public static final HashSet b;
    public final Path a;

    @Override // j$.nio.file.attribute.d
    public final BasicFileAttributes readAttributes() {
        boolean z;
        Path path = this.a;
        path.getFileSystem().D().a(path, new EnumC3787a[0]);
        File file = path.toFile();
        long lastModified = file.lastModified();
        Objects.requireNonNull(TimeUnit.MILLISECONDS, "unit");
        s sVar = new s(lastModified);
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        try {
            File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
            z = !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
        } catch (IOException unused) {
            z = false;
        }
        return new c(sVar, sVar, sVar, isFile, isDirectory, z, (isFile || isDirectory || z) ? false : true, file.length(), Integer.valueOf(file.hashCode()));
    }

    @Override // j$.nio.file.attribute.d
    public final void a(s sVar, s sVar2, s sVar3) {
        long j;
        if (sVar == null && sVar2 == null) {
            return;
        }
        Path path = this.a;
        path.getFileSystem().D().a(path, EnumC3787a.WRITE);
        File file = path.toFile();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        sVar.getClass();
        Objects.requireNonNull(timeUnit, "unit");
        if (timeUnit != null) {
            j = timeUnit.convert(sVar.a, timeUnit);
        } else {
            long convert = timeUnit.convert(sVar.b.a, TimeUnit.SECONDS);
            if (convert == Long.MIN_VALUE || convert == Long.MAX_VALUE) {
                j = convert;
            } else {
                long convert2 = timeUnit.convert(sVar.b.b, TimeUnit.NANOSECONDS);
                long j2 = convert + convert2;
                j = ((convert2 ^ j2) & (convert ^ j2)) < 0 ? convert < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j2;
            }
        }
        if (file.setLastModified(j)) {
            return;
        }
        throw new IOException("File.setLastModified did not succeed on " + path);
    }

    static {
        String[] strArr = {"size", "creationTime", "lastAccessTime", "lastModifiedTime", "fileKey", "isDirectory", "isRegularFile", "isSymbolicLink", "isOther"};
        Charset charset = p.a;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < 9; i++) {
            hashSet.add(strArr[i]);
        }
        b = hashSet;
    }

    public b(Path path) {
        this.a = path;
    }

    @Override // j$.nio.file.attribute.n
    public final String name() {
        return "basic";
    }
}
