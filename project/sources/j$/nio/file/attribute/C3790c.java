package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.FileTime;

/* renamed from: j$.nio.file.attribute.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3790c implements BasicFileAttributeView {
    public final /* synthetic */ d a;

    public /* synthetic */ C3790c(d dVar) {
        this.a = dVar;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        d dVar = this.a;
        if (obj instanceof C3790c) {
            obj = ((C3790c) obj).a;
        }
        return dVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes readAttributes() {
        return f.a(this.a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        this.a.a(j$.com.android.tools.r8.a.y(fileTime), j$.com.android.tools.r8.a.y(fileTime2), j$.com.android.tools.r8.a.y(fileTime3));
    }
}
