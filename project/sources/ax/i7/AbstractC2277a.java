package ax.i7;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: ax.i7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2277a implements i {
    private o a;
    private long b;

    protected AbstractC2277a(String str) {
        this(str == null ? null : new o(str));
    }

    public static long e(i iVar) throws IOException {
        if (iVar.c()) {
            return ax.m7.l.a(iVar);
        }
        return -1L;
    }

    @Override // ax.i7.i
    public String a() {
        o oVar = this.a;
        if (oVar == null) {
            return null;
        }
        return oVar.a();
    }

    @Override // ax.i7.i
    public boolean c() {
        return true;
    }

    protected long d() throws IOException {
        return e(this);
    }

    protected final Charset f() {
        o oVar = this.a;
        return (oVar == null || oVar.e() == null) ? StandardCharsets.ISO_8859_1 : this.a.e();
    }

    public final o g() {
        return this.a;
    }

    @Override // ax.i7.i
    public long getLength() throws IOException {
        if (this.b == -1) {
            this.b = d();
        }
        return this.b;
    }

    protected AbstractC2277a(o oVar) {
        this.b = -1L;
        this.a = oVar;
    }
}
