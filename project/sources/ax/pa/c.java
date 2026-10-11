package ax.pa;

import ax.qa.EnumC2891a;
import ax.qa.InterfaceC2892b;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class c extends e {
    public c(InputStream inputStream) {
        super(inputStream);
    }

    @Override // ax.pa.e
    public /* bridge */ /* synthetic */ void a(EnumC2891a enumC2891a) throws IOException {
        super.a(enumC2891a);
    }

    @Override // ax.pa.e
    public /* bridge */ /* synthetic */ void b(int i) throws IOException {
        super.b(i);
    }

    @Override // ax.pa.e
    public /* bridge */ /* synthetic */ byte c() throws IOException {
        return super.c();
    }

    @Override // ax.pa.e
    public /* bridge */ /* synthetic */ char d() throws IOException {
        return super.d();
    }

    @Override // ax.pa.e
    public /* bridge */ /* synthetic */ void e(byte[] bArr) throws IOException {
        super.e(bArr);
    }

    @Override // ax.pa.e
    public /* bridge */ /* synthetic */ int f() throws IOException {
        return super.f();
    }

    @Override // ax.pa.e
    public /* bridge */ /* synthetic */ short g() throws IOException {
        return super.g();
    }

    @Override // ax.pa.e
    public /* bridge */ /* synthetic */ long h() throws IOException {
        return super.h();
    }

    @Override // ax.pa.e
    public /* bridge */ /* synthetic */ int i() throws IOException {
        return super.i();
    }

    public int j() throws IOException {
        return f();
    }

    public <T extends InterfaceC2892b> T k(T t) throws IOException {
        t.b(this);
        t.c(this);
        t.a(this);
        return t;
    }
}
