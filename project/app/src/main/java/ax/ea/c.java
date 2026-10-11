/*
 * Decompiled with CFR 0.152.
 */
package ax.ea;

import android.annotation.TargetApi;
import android.graphics.BitmapFactory;
import ax.ca.d;
import ax.ca.e;
import ax.ca.h;
import ax.ga.b;

public class c {
    private final String a;
    private final String b;
    private final String c;
    private final e d;
    private final d e;
    private final h f;
    private final b g;
    private final Object h;
    private final boolean i;
    private final BitmapFactory.Options j;

    public c(String string, String string2, String string3, e e8, h h8, b b8, ax.ba.c c8) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = e8;
        this.e = c8.C();
        this.f = h8;
        this.g = b8;
        this.h = c8.x();
        this.i = c8.H();
        string = new BitmapFactory.Options();
        this.j = string;
        this.a(c8.u(), (BitmapFactory.Options)string);
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
        this.b(options, options2);
        this.c(options, options2);
    }

    @TargetApi(value=10)
    private void b(BitmapFactory.Options options, BitmapFactory.Options options2) {
        options2.inPreferQualityOverSpeed = options.inPreferQualityOverSpeed;
    }

    @TargetApi(value=11)
    private void c(BitmapFactory.Options options, BitmapFactory.Options options2) {
        options2.inBitmap = options.inBitmap;
        options2.inMutable = options.inMutable;
    }

    public BitmapFactory.Options d() {
        return this.j;
    }

    public b e() {
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

