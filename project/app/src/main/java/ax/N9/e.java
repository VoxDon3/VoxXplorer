/*
 * Decompiled with CFR 0.152.
 */
package ax.N9;

import ax.M9.d;
import ax.P9.j;
import com.microsoft.graph.extensions.UploadSession;

public class e<UploadType> {
    private final UploadType a;
    private final UploadSession b;
    private final d c;

    public e(d d8) {
        this.c = d8;
        this.a = null;
        this.b = null;
    }

    public e(j j8) {
        this(new d(j8.c(true), j8, ax.M9.e.i1));
    }

    public e(UploadSession uploadSession) {
        this.b = uploadSession;
        this.a = null;
        this.c = null;
    }

    public e(UploadType UploadType) {
        this.a = UploadType;
        this.b = null;
        this.c = null;
    }

    public boolean a() {
        return this.a != null || this.b != null;
        {
        }
    }

    public d b() {
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
}

