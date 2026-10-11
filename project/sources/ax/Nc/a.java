package ax.Nc;

import j$.nio.file.FileVisitResult;
import j$.nio.file.FileVisitor;
import j$.nio.file.Path;
import j$.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class a implements c, FileVisitor {
    private final FileVisitResult c0;
    private final FileVisitResult q;

    public a() {
        this(FileVisitResult.CONTINUE, FileVisitResult.TERMINATE);
    }

    @Override // ax.Nc.c
    public abstract /* synthetic */ FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes);

    void b(Object[] objArr, StringBuilder sb) {
        for (int i = 0; i < objArr.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(objArr[i]);
        }
    }

    @Override // j$.nio.file.FileVisitor
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public FileVisitResult postVisitDirectory(Path path, IOException iOException) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override // j$.nio.file.FileVisitor
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return a(path, basicFileAttributes);
    }

    FileVisitResult e(boolean z) {
        return z ? this.q : this.c0;
    }

    @Override // j$.nio.file.FileVisitor
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return a(path, basicFileAttributes);
    }

    @Override // j$.nio.file.FileVisitor
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFileFailed(Path path, IOException iOException) throws IOException {
        return FileVisitResult.CONTINUE;
    }

    @Override // j$.nio.file.PathMatcher
    public /* synthetic */ boolean matches(Path path) {
        return b.a(this, path);
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    protected a(FileVisitResult fileVisitResult, FileVisitResult fileVisitResult2) {
        this.q = fileVisitResult;
        this.c0 = fileVisitResult2;
    }
}
