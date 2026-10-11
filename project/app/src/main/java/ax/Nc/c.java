/*
 * Decompiled with CFR 0.152.
 */
package ax.Nc;

import java.io.FileFilter;
import java.io.FilenameFilter;

public interface c
extends FileFilter,
FilenameFilter,
j.PathMatcher {
    public j.FileVisitResult a(j.Path var1, j.BasicFileAttributes var2);
}

