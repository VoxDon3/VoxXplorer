package ax.Nc;

import j$.nio.file.FileVisitResult;
import j$.nio.file.Path;
import j$.nio.file.PathMatcher;
import j$.nio.file.attribute.BasicFileAttributes;
import java.io.FileFilter;
import java.io.FilenameFilter;

/* loaded from: classes3.dex */
public interface c extends FileFilter, FilenameFilter, PathMatcher {
    FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes);
}
