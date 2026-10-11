package ax.N9;

import com.microsoft.graph.extensions.UploadSession;

/* renamed from: ax.N9.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0841e<UploadType> {
    private final UploadType a;
    private final UploadSession b;
    private final ax.M9.d c;

    public C0841e(UploadType uploadtype) {
        this.a = uploadtype;
        this.b = null;
        this.c = null;
    }

    public boolean a() {
        return (this.a == null && this.b == null) ? false : true;
    }

    public ax.M9.d b() {
        return this.c;
    }

    public UploadType c() {
        return this.a;
    }

    public boolean d() {
        return this.c != null;
    }

    public boolean e() {
        return this.a != null;
    }

    public C0841e(UploadSession uploadSession) {
        this.b = uploadSession;
        this.a = null;
        this.c = null;
    }

    public C0841e(ax.M9.d dVar) {
        this.c = dVar;
        this.a = null;
        this.b = null;
    }

    public C0841e(ax.P9.j jVar) {
        this(new ax.M9.d(jVar.c(true), jVar, ax.M9.e.UploadSessionFailed));
    }
}
