package ax.rc;

import ax.sc.EnumC3084a;
import ax.sc.EnumC3085b;
import ax.sc.EnumC3086c;

/* renamed from: ax.rc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3026a extends i {
    private int b;
    private EnumC3085b c;
    private String d;
    private EnumC3084a e;
    private EnumC3086c f;

    public C3026a() {
        a(ax.pc.b.AES_EXTRA_DATA_RECORD);
        this.b = 7;
        this.c = EnumC3085b.TWO;
        this.d = "AE";
        this.e = EnumC3084a.KEY_STRENGTH_256;
        this.f = EnumC3086c.DEFLATE;
    }

    public EnumC3084a b() {
        return this.e;
    }

    public EnumC3085b c() {
        return this.c;
    }

    public EnumC3086c d() {
        return this.f;
    }

    public void e(EnumC3084a enumC3084a) {
        this.e = enumC3084a;
    }

    public void f(EnumC3085b enumC3085b) {
        this.c = enumC3085b;
    }

    public void g(EnumC3086c enumC3086c) {
        this.f = enumC3086c;
    }

    public void h(int i) {
        this.b = i;
    }

    public void i(String str) {
        this.d = str;
    }
}
