package ax.r9;

import ax.R8.t;
import java.util.Arrays;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public class c {
    private Set<t.b> a;
    private boolean b;
    private boolean c;
    private SecretKey d;
    private SecretKey e;
    private SecretKey f;
    private SecretKey g;
    private SecretKey h;
    byte[] i;

    public void a(t tVar) {
        this.a = tVar.o();
    }

    public SecretKey b() {
        return this.f;
    }

    public SecretKey c() {
        return this.g;
    }

    public byte[] d() {
        return this.i;
    }

    public SecretKey e() {
        return this.d;
    }

    public SecretKey f() {
        return this.e;
    }

    public boolean g() {
        return this.c;
    }

    public boolean h() {
        return this.a.contains(t.b.SMB2_SESSION_FLAG_IS_GUEST);
    }

    public boolean i() {
        return this.b;
    }

    public void j(SecretKey secretKey) {
        this.h = secretKey;
    }

    public void k(SecretKey secretKey) {
        this.f = secretKey;
    }

    public void l(boolean z) {
        this.c = z;
    }

    public void m(SecretKey secretKey) {
        this.g = secretKey;
    }

    public void n(byte[] bArr) {
        this.i = Arrays.copyOf(bArr, bArr.length);
    }

    public void o(SecretKeySpec secretKeySpec) {
        this.d = secretKeySpec;
    }

    public void p(SecretKey secretKey) {
        this.e = secretKey;
    }

    public void q(boolean z) {
        this.b = z;
    }
}
