package j$.desugar.sun.nio.fs;

import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.s;

/* loaded from: classes2.dex */
public final class c implements BasicFileAttributes {
    public final s a;
    public final s b;
    public final s c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final Integer i;

    public c(s sVar, s sVar2, s sVar3, boolean z, boolean z2, boolean z3, boolean z4, long j, Integer num) {
        this.a = sVar;
        this.b = sVar2;
        this.c = sVar3;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = j;
        this.i = num;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final s lastModifiedTime() {
        return this.a;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final s lastAccessTime() {
        return this.b;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final s creationTime() {
        return this.c;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isRegularFile() {
        return this.d;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isDirectory() {
        return this.e;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isSymbolicLink() {
        return this.f;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final boolean isOther() {
        return this.g;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final long size() {
        return this.h;
    }

    @Override // j$.nio.file.attribute.BasicFileAttributes
    public final Object fileKey() {
        return this.i;
    }
}
