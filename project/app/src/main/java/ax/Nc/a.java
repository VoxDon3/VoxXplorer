/*
 * Decompiled with CFR 0.152.
 */
package ax.Nc;

import ax.Nc.b;
import ax.Nc.c;
import java.io.IOException;

public abstract class a
implements c,
j.FileVisitor {
    private final j.FileVisitResult c0;
    private final j.FileVisitResult q;

    public a() {
        this(j.FileVisitResult.CONTINUE, j.FileVisitResult.TERMINATE);
    }

    protected a(j.FileVisitResult fileVisitResult, j.FileVisitResult fileVisitResult2) {
        this.q = fileVisitResult;
        this.c0 = fileVisitResult2;
    }

    @Override
    public abstract /* synthetic */ j.FileVisitResult a(j.Path var1, j.BasicFileAttributes var2);

    void b(Object[] objectArray, StringBuilder stringBuilder) {
        for (int i8 = 0; i8 < objectArray.length; ++i8) {
            if (i8 > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(objectArray[i8]);
        }
    }

    public j.FileVisitResult c(j.Path path, IOException iOException) throws IOException {
        return j.FileVisitResult.CONTINUE;
    }

    public j.FileVisitResult d(j.Path path, j.BasicFileAttributes basicFileAttributes) throws IOException {
        return this.a(path, basicFileAttributes);
    }

    j.FileVisitResult e(boolean bl) {
        if (bl) {
            return this.q;
        }
        return this.c0;
    }

    public j.FileVisitResult f(j.Path path, j.BasicFileAttributes basicFileAttributes) throws IOException {
        return this.a(path, basicFileAttributes);
    }

    public j.FileVisitResult g(j.Path path, IOException iOException) throws IOException {
        return j.FileVisitResult.CONTINUE;
    }

    public /* synthetic */ boolean matches(j.Path path) {
        return b.a(this, path);
    }

    public String toString() {
        return this.getClass().getSimpleName();
    }
}

