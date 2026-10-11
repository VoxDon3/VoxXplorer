package ax.ea;

import android.annotation.TargetApi;
import android.graphics.BitmapFactory;
import ax.ca.d;
import ax.ca.e;
import ax.ca.h;
import ax.ga.InterfaceC2133b;

/* loaded from: classes3.dex */
public class c {
    private final String a;
    private final String b;
    private final String c;
    private final e d;
    private final d e;
    private final h f;
    private final InterfaceC2133b g;
    private final Object h;
    private final boolean i;
    private final BitmapFactory.Options j;

    public c(String str, String str2, String str3, e eVar, h hVar, InterfaceC2133b interfaceC2133b, ax.ba.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = eVar;
        this.e = cVar.C();
        this.f = hVar;
        this.g = interfaceC2133b;
        this.h = cVar.x();
        this.i = cVar.H();
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.j = options;
        a(cVar.u(), options);
    }

    private void a(BitmapFactory.Options options, BitmapFactory.Options options2) {
        options2.inDensity = options.inDensity;
        options2.inDither = options.inDither;
        options2.inInputShareable = options.inInputShareable;
        options2.inJustDecodeBounds = options.inJustDecodeBounds;
        options2.inPreferredConfig = options.inPreferredConfig;
        options2.inPurgeable = options.inPurgeable;
        options2.inSampleSize = options.inSampleSize;
        options2.inScaled = options.inScaled;
        options2.inScreenDensity = options.inScreenDensity;
        options2.inTargetDensity = options.inTargetDensity;
        options2.inTempStorage = options.inTempStorage;
        b(options, options2);
        c(options, options2);
    }

    @TargetApi(10)
    private void b(BitmapFactory.Options options, BitmapFactory.Options options2) {
        options2.inPreferQualityOverSpeed = options.inPreferQualityOverSpeed;
    }

    @TargetApi(11)
    private void c(BitmapFactory.Options options, BitmapFactory.Options options2) {
        options2.inBitmap = options.inBitmap;
        options2.inMutable = options.inMutable;
    }

    public BitmapFactory.Options d() {
        return this.j;
    }

    public InterfaceC2133b e() {
        return this.g;
    }

    public Object f() {
        return this.h;
    }

    public String g() {
        return this.a;
    }

    public d h() {
        return this.e;
    }

    public String i() {
        return this.b;
    }

    public e j() {
        return this.d;
    }

    public h k() {
        return this.f;
    }

    public boolean l() {
        return this.i;
    }
}
