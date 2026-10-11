/*
 * Decompiled with CFR 0.152.
 */
package ax.w3;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import ax.A3.b;
import ax.C3.b;
import ax.C3.e;
import ax.X2.B;
import ax.X2.E;
import ax.X2.J;
import ax.X2.Q;
import ax.Z2.t;
import ax.b3.j;
import ax.c3.A;
import ax.c3.d0;
import ax.c3.k;
import ax.c3.u;
import ax.c3.z;
import ax.r3.d;
import ax.u3.q;
import ax.u3.v;
import ax.w3.g;
import ax.w3.h;
import com.alphainventor.filemanager.file.m;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.o;
import com.alphainventor.filemanager.file.y;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

public class f
extends ax.A3.a {
    private static final Logger v = ax.Q2.g.a(f.class);
    private String q;
    private boolean r;
    private n s;
    private o t;
    private boolean u;

    public f(Context context, o o8, n n8, String string, boolean bl, boolean bl2) {
        super(context, ax.u3.v.f(q.e.e0), string);
        this.q = string;
        this.r = bl;
        this.s = n8;
        this.t = o8;
        this.u = bl2;
        if (J.r()) {
            this.u = false;
        }
    }

    private void Q(com.android.ex.photo.c c8, n n8) {
        c8.g = n8;
        c8.l = n8.T();
        c8.m = n8.B();
        c8.i = n8.q();
        c8.n = n8.I(true);
    }

    private long R(Uri object) {
        long l8;
        if (!"file".equals(object.getScheme()) || (l8 = new File(object.getPath()).length()) <= 0L) {
            l8 = -1L;
        }
        if (l8 == -1L && (object = this.s) != null) {
            return object.p();
        }
        return l8;
    }

    private File S() {
        Comparable<n> comparable = this.s;
        if (comparable != null && !ax.c3.B.H(comparable) && !this.r && ax.c3.B.G((File)(comparable = this.s.N()), this.s)) {
            return comparable;
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void V(com.android.ex.photo.c var1_1, Context var2_7, n var3_22) {
        block58: {
            block57: {
                block50: {
                    block56: {
                        block53: {
                            block51: {
                                block48: {
                                    block49: {
                                        block47: {
                                            if (Q.N0() == false) return;
                                            var8_23 /* !! */  = null;
                                            var2_7 = null;
                                            var11_29 = null;
                                            var9_30 = new MediaExtractor();
                                            if (!ax.c3.B.H((n)var3_22) || !((k)var3_22).k0()) break block47;
                                            var2_7 = ((k)var3_22).e0(true);
                                            var8_23 /* !! */  = var2_7;
                                            var10_31 = var2_7;
                                            var3_22 = var2_7;
                                            var7_33 = var2_7;
                                            var9_30.setDataSource(var2_7.getFileDescriptor());
                                            break block48;
                                        }
                                        try {
                                            ** try [egrp 4[TRYBLOCK] [12 : 141->163)] { 
lbl20:
                                            // 1 sources

                                        }
                                        catch (Throwable var1_4) {
                                            var8_23 /* !! */  = null;
                                            ** GOTO lbl-1000
                                        }
                                        catch (RuntimeException var2_11) {}
                                        ** GOTO lbl-1000
                                        catch (IOException var2_12) {
                                            ** GOTO lbl-1000
                                        }
lbl28:
                                        // 2 sources

                                        catch (j var2_13) {}
lbl-1000:
                                        // 3 sources

                                        {
                                            var10_31 = null;
                                            ** GOTO lbl75
                                        }
                                        if (ax.c3.B.P((n)var3_22)) {
                                            var9_30.setDataSource(((y)var3_22).K0());
                                        } else {
                                            try {
                                                var2_7 = var3_22.O();
                                            }
                                            catch (j var2_14) {
                                                var2_7 = null;
                                            }
                                            {
                                                if (var2_7 != null && ax.c3.B.F((n)var2_7, (n)var3_22)) {
                                                    var9_30.setDataSource(var2_7.K0());
                                                    break block49;
                                                }
                                                var2_7 = new StringBuilder();
                                                var2_7.append("Invalid file info 2 : ");
                                                var2_7.append(var3_22.P().I());
                                                ax.u3.b.g(var2_7.toString());
                                            }
                                        }
                                    }
                                    var2_7 = null;
                                }
                                var8_23 /* !! */  = var2_7;
                                var10_31 = var2_7;
                                var3_22 = var2_7;
                                var7_33 = var2_7;
                                try {
                                    ** try [egrp 8[TRYBLOCK] [30, 29, 28 : 245->252)] { 
lbl57:
                                    // 1 sources

                                    ** GOTO lbl65
                                }
                                catch (Throwable var1_2) lbl-1000:
                                // 2 sources

                                {
                                    var2_7 = var9_30;
                                    var3_22 = var8_23 /* !! */ ;
                                    break block50;
                                }
lbl62:
                                // 2 sources

                                catch (RuntimeException var2_8) {
                                    block52: {
                                        var3_22 = var10_31;
                                        break block52;
lbl65:
                                        // 1 sources

                                        var5_34 = var9_30.getTrackCount();
                                        var3_22 = null;
                                        var7_33 = var11_29;
                                        break block51;
lbl69:
                                        // 2 sources

                                        catch (IOException var2_9) {
                                            break block52;
                                        }
lbl71:
                                        // 2 sources

                                        catch (j var2_10) {
                                            var3_22 = var7_33;
                                        }
                                    }
                                    var10_31 = var3_22;
lbl75:
                                    // 2 sources

                                    var3_22 = null;
                                    var8_23 /* !! */  = var9_30;
                                    var7_33 = null;
                                    var9_30 = var2_7;
                                    var2_7 = var10_31;
                                    break block53;
                                }
                                catch (Throwable var1_5) {
                                    var3_22 = null;
                                    break block50;
                                }
                                catch (RuntimeException var2_15) {}
                                ** GOTO lbl-1000
                                catch (IOException var2_16) {
                                    ** GOTO lbl-1000
                                }
                                catch (j var2_17) {}
lbl-1000:
                                // 3 sources

                                {
                                    var10_32 = null;
                                    var3_22 = var7_33 = null;
                                    var9_30 = var2_7;
                                    var2_7 = var10_32;
                                    break block53;
                                }
                            }
                            for (var4_35 = 0; var4_35 < var5_34; ++var4_35) {
                                block54: {
                                    block55: {
                                        var8_23 /* !! */  = var2_7;
                                        try {
                                            var13_38 = var9_30.getTrackFormat(var4_35).getString("mime");
                                            var11_29 = var3_22;
                                            var10_31 = var7_33;
                                            if (var13_38 == null) break block54;
                                            var8_23 /* !! */  = var2_7;
                                            var12_37 = h.a(var13_38);
                                            var8_23 /* !! */  = var2_7;
                                            if (!var13_38.startsWith("video")) break block55;
                                            var8_23 /* !! */  = var2_7;
                                            if (TextUtils.isEmpty((CharSequence)var12_37)) break block55;
                                            var10_31 = var12_37;
                                            var11_29 = var3_22;
                                            break block54;
                                        }
                                        catch (RuntimeException var8_24) {}
                                        ** GOTO lbl-1000
                                        catch (IOException var8_25) {
                                            ** GOTO lbl-1000
                                        }
                                        catch (j var8_26) {}
lbl-1000:
                                        // 3 sources

                                        {
                                            var10_31 = var9_30;
                                            var9_30 = var8_23 /* !! */ ;
                                            var8_23 /* !! */  = var10_31;
                                            break block53;
                                        }
                                    }
                                    var8_23 /* !! */  = var2_7;
                                    var11_29 = var3_22;
                                    var10_31 = var7_33;
                                    if (var13_38.startsWith("audio")) {
                                        var8_23 /* !! */  = var2_7;
                                        var6_36 = TextUtils.isEmpty((CharSequence)var12_37);
                                        var11_29 = var3_22;
                                        var10_31 = var7_33;
                                        if (!var6_36) {
                                            var11_29 = var12_37;
                                            var10_31 = var7_33;
                                        }
                                    }
                                }
                                var3_22 = var11_29;
                                var7_33 = var10_31;
                            }
                            try {
                                var9_30.release();
                            }
                            catch (RuntimeException var8_27) {
                                // empty catch block
                            }
                            var9_30 = var3_22;
                            var8_23 /* !! */  = var7_33;
                            if (var2_7 == null) break block58;
                            var2_7.close();
                            var9_30 = var3_22;
                            var8_23 /* !! */  = var7_33;
                        }
                        f.v.severe("MediaExtractor failed to retrieve information");
                        var9_30.printStackTrace();
                        if (var8_23 /* !! */  == null) break block56;
                        try {
                            var8_23 /* !! */ .release();
                        }
                        catch (RuntimeException var8_28) {
                            // empty catch block
                        }
                    }
                    if (var2_7 == null) break block57;
                    try {
                        var2_7.close();
                        break block57;
                    }
                    catch (IOException var2_20) {}
                    catch (Throwable var1_6) {
                        var3_22 = var2_7;
                        var2_7 = var8_23 /* !! */ ;
                    }
                }
                if (var2_7 != null) {
                    try {
                        var2_7.release();
                    }
                    catch (RuntimeException var2_18) {
                        // empty catch block
                    }
                }
                if (var3_22 == null) throw var1_3;
                try {
                    var3_22.close();
                }
                catch (IOException var2_21) {
                    throw var1_3;
                }
                throw var1_3;
                catch (IOException var2_19) {
                    var9_30 = var3_22;
                    var8_23 /* !! */  = var7_33;
                }
                break block58;
            }
            var8_23 /* !! */  = var7_33;
            var9_30 = var3_22;
        }
        var1_1.t = var8_23 /* !! */ ;
        var1_1.u = var9_30;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public b.a L() {
        block20: {
            block21: {
                var6_1 = new b.a();
                var3_2 /* !! */  = this.j();
                this.t.n0();
                if (var3_2 /* !! */  == null) ** GOTO lbl160
                try {
                    var3_2 /* !! */  = this.q;
                    if (var3_2 /* !! */  == null) ** GOTO lbl160
                    var5_5 = var6_1;
                    try {
                        if (!this.r) break block20;
                        var5_5 = var6_1;
                        var3_2 /* !! */  = d.l(this.j(), this.q);
                        if (var3_2 /* !! */  == null) break block21;
                        var5_5 = var6_1;
                        var3_2 /* !! */  = ax.c3.u.z((File)var3_2 /* !! */ );
                        var4_6 = null;
                        ** GOTO lbl40
                    }
                    catch (UnsupportedOperationException var3_4) {
                        ** GOTO lbl156
                    }
                }
                catch (Throwable var3_3) {
                    ** GOTO lbl163
                }
            }
            var5_5 = var6_1;
            var3_2 /* !! */  = Bitmap.createBitmap((int)1, (int)1, (Bitmap.Config)Bitmap.Config.ARGB_8888);
            var5_5 = var6_1;
            var6_1.c = var3_2 /* !! */ ;
            var5_5 = var6_1;
            var3_2 /* !! */ .eraseColor(0);
            var5_5 = var6_1;
            var6_1.e = 0;
            var3_2 /* !! */  = var6_1;
lbl32:
            // 7 sources

            while (true) {
                this.t.k0(false);
                return var3_2 /* !! */ ;
            }
        }
        var5_5 = var6_1;
        {
            block28: {
                block27: {
                    block23: {
                        block26: {
                            block25: {
                                block24: {
                                    var3_2 /* !! */  = Uri.parse((String)var3_2 /* !! */ );
                                    var5_5 = var6_1;
                                    var4_6 = A.g(d0.k(var3_2 /* !! */ .getPath()));
lbl40:
                                    // 2 sources

                                    var5_5 = var6_1;
                                    var7_9 = this.s;
                                    var5_5 = var6_1;
                                    var8_10 = this.S();
                                    var5_5 = var6_1;
                                    if (z.f0 != var4_6) break block23;
                                    var5_5 = var6_1;
                                    var9_11 = var3_2 /* !! */ .getScheme();
                                    var5_5 = var6_1;
                                    var2_12 = ax.Q2.f.Z(ax.Q2.f.D(var9_11));
                                    var5_5 = var6_1;
                                    var1_13 = this.P(this.q);
                                    var5_5 = var6_1;
                                    var4_6 = var3_2 /* !! */ ;
                                    if ("file".equals(var9_11)) ** GOTO lbl127
                                    if (!var2_12) break block24;
                                    var4_6 = var3_2 /* !! */ ;
                                    if (!var1_13) ** GOTO lbl127
                                }
                                var4_6 = var3_2 /* !! */ ;
                                if (var7_9 == null) ** GOTO lbl127
                                var5_5 = var6_1;
                                if (!ax.c3.B.P((n)var7_9)) break block25;
                                var5_5 = var6_1;
                                var4_6 = ax.c3.u.z(((y)var7_9).F0());
                                ** GOTO lbl127
                            }
                            if (var8_10 == null) break block26;
                            var5_5 = var6_1;
                            var4_6 = ax.c3.u.z((File)var8_10);
                            ** GOTO lbl127
                        }
                        var5_5 = var6_1;
                        var3_2 /* !! */  = var7_9.Z();
                        var5_5 = var6_1;
                        var1_13 = var7_9.c0();
                        if (var1_13) {
                            var5_5 = var6_1;
                            this.t.r((n)var7_9);
                        }
lbl80:
                        // 4 sources

                        while (true) {
                            block22: {
                                var5_5 = var6_1;
                                if (ax.c3.B.G((File)var3_2 /* !! */ , (n)var7_9)) {
                                    var5_5 = var6_1;
                                    ax.Z2.t.b().e((File)var3_2 /* !! */ );
                                } else {
                                    var5_5 = var6_1;
                                    if (this.t.S() != var7_9.P()) {
                                        var5_5 = var6_1;
                                        var4_6 = ax.Ha.c.h().c("IMAGE VIEWER LOCATION ERROR");
                                        var5_5 = var6_1;
                                        var5_5 = var6_1;
                                        var8_10 = new Comparable<File>();
                                        var5_5 = var6_1;
                                        var8_10.append(this.t.S().I());
                                        var5_5 = var6_1;
                                        var8_10.append(":");
                                        var5_5 = var6_1;
                                        var8_10.append(var7_9.P().I());
                                        var5_5 = var6_1;
                                        var4_6.g(var8_10.toString()).h();
                                    } else {
                                        var5_5 = var6_1;
                                        this.t.p((n)var7_9, (File)var3_2 /* !! */ , null, null);
                                        var5_5 = var6_1;
                                        ax.Z2.t.b().c((File)var3_2 /* !! */ );
                                        var5_5 = var6_1;
                                        ax.Z2.t.b().a();
                                        var5_5 = var6_1;
                                        if (!ax.Q2.f.p0(var7_9.P())) break block22;
                                        var5_5 = var6_1;
                                        var7_9 = m.S((n)var7_9);
                                        var5_5 = var6_1;
                                        if (d.l(this.j(), (String)var7_9) != null) break block22;
                                        var5_5 = var6_1;
                                        var5_5 = var6_1;
                                        var4_6 = new d(this.j(), this.t);
                                        var5_5 = var6_1;
                                        var4_6.w((String)var7_9);
                                    }
                                }
                            }
lbl124:
                            // 2 sources

                            while (true) {
                                var5_5 = var6_1;
                                var4_6 = ax.c3.u.z((File)var3_2 /* !! */ );
lbl127:
                                // 6 sources

                                var5_5 = var6_1;
                                var3_2 /* !! */  = this.T((Uri)var4_6, false);
                                ** GOTO lbl32
                                break;
                            }
                            break;
                        }
                        catch (j var4_7) {
                            ** continue;
                        }
                    }
                    var5_5 = var6_1;
                    if (z.e0 != var4_6) break block27;
                    if (var8_10 != null) {
                        var5_5 = var6_1;
                        var3_2 /* !! */  = ax.c3.u.z((File)var8_10);
                    }
                    var5_5 = var6_1;
                    var3_2 /* !! */  = this.U((Uri)var3_2 /* !! */ );
                    var5_5 = var3_2 /* !! */ ;
                    var3_2 /* !! */ .g = true;
                    ** GOTO lbl32
                }
                var5_5 = var6_1;
                if (!this.r) break block28;
                var5_5 = var6_1;
                var3_2 /* !! */  = this.T((Uri)var3_2 /* !! */ , true);
                ** GOTO lbl32
            }
            if (var8_10 != null) {
                var5_5 = var6_1;
                var3_2 /* !! */  = ax.c3.u.z((File)var8_10);
            }
            var5_5 = var6_1;
            var3_2 /* !! */  = this.T((Uri)var3_2 /* !! */ , false);
            ** GOTO lbl32
lbl156:
            // 1 sources

            var5_5.e = 1;
            var5_5.h = var3_4;
            var3_2 /* !! */  = var5_5;
            ** GOTO lbl32
lbl160:
            // 2 sources

            var6_1.e = 1;
            var3_2 /* !! */  = var6_1;
            ** continue;
lbl163:
            // 1 sources

            this.t.k0(false);
            throw var3_3;
            catch (ax.b3.a | j var4_8) {
                ** continue;
            }
        }
    }

    @Override
    protected void O(Drawable drawable) {
        if (drawable != null && drawable instanceof b) {
            ((b)drawable).c();
        }
    }

    boolean P(String string) {
        return "gif".equals(string = d0.k(string)) || "webp".equals(string);
        {
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    b.a T(Uri var1_1, boolean var2_2) {
        block37: {
            block39: {
                if (this.G()) {
                    var1_1 /* !! */  = new b.a();
                    var1_1 /* !! */ .e = 1;
                    var1_1 /* !! */ .h = new Exception("loading cancelled");
                    return var1_1 /* !! */ ;
                }
                var7_3 = this.j().getContentResolver();
                var11_4 /* !! */  = var1_1 /* !! */ .getScheme();
                var10_5 = d0.k(var1_1 /* !! */ .getPath());
                var9_7 /* !! */  = ax.Q2.f.p(var11_4 /* !! */ );
                if (var9_7 /* !! */  == null) break block39;
                var7_3 = this.s;
                if (var7_3 == null) {
                    var7_3 = new StringBuilder();
                    var7_3.append("FILE INO == null in load image uri :");
                    var7_3.append(var1_1 /* !! */ );
                    ax.u3.b.e(var7_3.toString());
                    var1_1 /* !! */  = new b.a();
                    var1_1 /* !! */ .e = 1;
                    var1_1 /* !! */ .h = new Exception("FILE INO == null in load image");
                    return var1_1 /* !! */ ;
                }
                var8_8 /* !! */  = new a(this.t, (n)var7_3);
                var7_3 = var8_8 /* !! */ ;
                if (var2_2) ** GOTO lbl-1000
                var7_3 = var8_8 /* !! */ ;
                if (!ax.Q2.f.Z(var9_7 /* !! */ )) ** GOTO lbl-1000
                var7_3 = var8_8 /* !! */ ;
                if (!this.u) ** GOTO lbl-1000
                var7_3 = var8_8 /* !! */ ;
                ** GOTO lbl39
            }
            var8_8 /* !! */  = ax.C3.b.b((ContentResolver)var7_3, var1_1 /* !! */ );
            var7_3 = var8_8 /* !! */ ;
            if (var2_2) ** GOTO lbl-1000
            var7_3 = var8_8 /* !! */ ;
            if (this.u) {
                var7_3 = var8_8 /* !! */ ;
lbl39:
                // 2 sources

                var3_13 = true;
            } else lbl-1000:
            // 5 sources

            {
                var3_13 = false;
            }
            var9_7 /* !! */  = ax.C3.b.c((b.d)var7_3, com.android.ex.photo.f.O, var3_13 ^ true);
            if (var3_13) {
                var9_7 /* !! */ .f = var7_3;
            }
            if (!var2_2 && "file".equals(var11_4 /* !! */ ) && (var3_13 || var9_7 /* !! */ .c != null)) {
                if (Q.X0() && "gif".equalsIgnoreCase((String)var10_5)) {
                    try {
                        var8_8 /* !! */  = new File(var1_1 /* !! */ .getPath());
                        var9_7 /* !! */ .b = E.a((File)var8_8 /* !! */ );
                    }
                    catch (Exception var8_9) {
                        var8_9.printStackTrace();
                    }
                } else if (Q.X0() && "webp".equalsIgnoreCase((String)var10_5)) {
                    try {
                        var8_8 /* !! */  = new File(var1_1 /* !! */ .getPath());
                        var8_8 /* !! */  = E.a((File)var8_8 /* !! */ );
                        if (B.a(var8_8 /* !! */ )) {
                            var9_7 /* !! */ .b = var8_8 /* !! */ ;
                        }
                    }
                    catch (Exception var8_10) {
                        var8_10.printStackTrace();
                    }
                } else if ("gif".equalsIgnoreCase((String)var10_5)) {
                    try {
                        var8_8 /* !! */  = new ax.g4.f();
                        var11_4 /* !! */  = var8_8 /* !! */ .i(ax.P3.h.b).X(true);
                        var12_14 = ax.J3.c.r(this.j()).n();
                        var8_8 /* !! */  = new File(var1_1 /* !! */ .getPath());
                        var8_8 /* !! */  = (ax.b4.c)var12_14.k((File)var8_8 /* !! */ ).b((ax.g4.f)var11_4 /* !! */ ).o().get();
                        var8_8 /* !! */ .l(-1);
                        var11_4 /* !! */  = new b(this.j(), (ax.b4.c)var8_8 /* !! */ );
                        var9_7 /* !! */ .b = var11_4 /* !! */ ;
                    }
                    catch (Exception var8_11) {
                        var8_11.printStackTrace();
                    }
                }
            }
            if (!var2_2 && "svg".equalsIgnoreCase((String)var10_5)) {
                block38: {
                    try {
                        var10_5 = ax.o4.g.l(var7_3.createInputStream());
                        var8_8 /* !! */  = var10_5.o();
                        var12_14 = new PictureDrawable((Picture)var8_8 /* !! */ );
                        var11_4 /* !! */  = new c((PictureDrawable)var12_14);
                        var9_7 /* !! */ .b = var11_4 /* !! */ ;
                        var9_7 /* !! */ .e = 0;
                        var11_4 /* !! */  = var9_7 /* !! */ .a;
                        if (var11_4 /* !! */  != null && (var4_15 = var11_4 /* !! */ .x) > 0) break block37;
                    }
                    catch (Exception var8_12) {}
                    try {
                        if (var10_5.h() > 0.0f && var10_5.f() > 0.0f) {
                            var11_4 /* !! */  = new Point((int)var10_5.h(), (int)var10_5.f());
                            var9_7 /* !! */ .a = var11_4 /* !! */ ;
                            break block38;
                        }
                        if (var10_5.g() != null) {
                            var11_4 /* !! */  = new Point((int)var10_5.g().width(), (int)var10_5.g().height());
                            var9_7 /* !! */ .a = var11_4 /* !! */ ;
                        }
                    }
                    catch (Exception var10_6) {}
                }
                var10_5 = var9_7 /* !! */ .a;
                if (var10_5 == null || var10_5.x <= 0) {
                    var10_5 = new Point(var8_8 /* !! */ .getWidth(), var8_8 /* !! */ .getHeight());
                    var9_7 /* !! */ .a = var10_5;
                }
            }
        }
        if ((var8_8 /* !! */  = var9_7 /* !! */ .c) != null) {
            var8_8 /* !! */ .setDensity(160);
            var8_8 /* !! */  = var9_7 /* !! */ ;
        } else {
            var8_8 /* !! */  = var9_7 /* !! */ ;
            if (var9_7 /* !! */ .e == 2) {
                var10_5 = f.v;
                var10_5.severe("Error loading bitmap : It could be OutOfMemoryError");
                var9_7 /* !! */  = ax.C3.b.c((b.d)var7_3, com.android.ex.photo.f.O * 8 / 10, var3_13 ^ true);
                if (var3_13) {
                    var9_7 /* !! */ .f = var7_3;
                }
                var8_8 /* !! */  = var9_7 /* !! */ ;
                if (var9_7 /* !! */ .c != null) {
                    var8_8 /* !! */  = new StringBuilder();
                    var8_8 /* !! */ .append("Bitmap reloaded : ");
                    var8_8 /* !! */ .append(var9_7 /* !! */ .c.getWidth());
                    var8_8 /* !! */ .append("/");
                    var8_8 /* !! */ .append(var9_7 /* !! */ .c.getHeight());
                    var10_5.severe(var8_8 /* !! */ .toString());
                    var9_7 /* !! */ .c.setDensity(160);
                    var8_8 /* !! */  = var9_7 /* !! */ ;
                }
            }
        }
        if (var8_8 /* !! */ .e == 0 && this.s != null) {
            if (var8_8 /* !! */ .i == null) {
                var8_8 /* !! */ .i = new com.android.ex.photo.c();
            }
            var9_7 /* !! */  = var8_8 /* !! */ .i;
            if (var9_7 /* !! */ .j <= 0 && var9_7 /* !! */ .k <= 0 && (var10_5 = var8_8 /* !! */ .a) != null) {
                var9_7 /* !! */ .j = var10_5.x;
                var9_7 /* !! */ .k = var10_5.y;
            }
            this.Q((com.android.ex.photo.c)var9_7 /* !! */ , this.s);
        }
        if (var8_8 /* !! */ .e == 0 && !var2_2 && var8_8 /* !! */ .i != null) {
            var5_16 = this.R(var1_1 /* !! */ );
            g.b(var8_8 /* !! */ .i, (b.d)var7_3, var5_16);
        }
        return var8_8 /* !! */ ;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    b.a U(Uri var1_1) {
        block49: {
            block41: {
                block45: {
                    block44: {
                        block43: {
                            block42: {
                                block46: {
                                    block47: {
                                        block40: {
                                            if (this.G()) {
                                                var1_1 = new b.a();
                                                var1_1.e = 1;
                                                var1_1.h = new Exception("loading cancelled");
                                                return var1_1;
                                            }
                                            var15_13 = new b.a();
                                            var16_14 = new MediaMetadataRetriever();
                                            var13_15 = null;
                                            var12_16 = null;
                                            var11_17 = null;
                                            var10_18 /* !! */  = null;
                                            var14_19 = null;
                                            var4_21 /* !! */  = var9_20 /* !! */  = null;
                                            var7_25 /* !! */  = var13_15;
                                            var5_26 /* !! */  = var12_16;
                                            var6_28 /* !! */  = var11_17;
                                            var8_29 /* !! */  = var10_18 /* !! */ ;
                                            try {
                                                var17_30 = this.s;
                                                var4_21 /* !! */  = var9_20 /* !! */ ;
                                                var7_25 /* !! */  = var13_15;
                                                var5_26 /* !! */  = var12_16;
                                                var6_28 /* !! */  = var11_17;
                                                var8_29 /* !! */  = var10_18 /* !! */ ;
                                                var18_31 = ax.Q2.f.D(var1_1.getScheme());
                                                var4_21 /* !! */  = var9_20 /* !! */ ;
                                                var7_25 /* !! */  = var13_15;
                                                var5_26 /* !! */  = var12_16;
                                                var6_28 /* !! */  = var11_17;
                                                var8_29 /* !! */  = var10_18 /* !! */ ;
                                                var3_32 = ax.c3.B.P(var17_30);
                                                var2_33 = false;
                                                if (!var3_32) break block40;
                                                var4_21 /* !! */  = var9_20 /* !! */ ;
                                                var7_25 /* !! */  = var13_15;
                                                var5_26 /* !! */  = var12_16;
                                                var6_28 /* !! */  = var11_17;
                                                var8_29 /* !! */  = var10_18 /* !! */ ;
                                                var1_1 = ax.c3.u.x((y)var17_30);
                                                var4_21 /* !! */  = var9_20 /* !! */ ;
                                                var7_25 /* !! */  = var13_15;
                                                var5_26 /* !! */  = var12_16;
                                                var6_28 /* !! */  = var11_17;
                                                var8_29 /* !! */  = var10_18 /* !! */ ;
                                                var16_14.setDataSource(this.j(), (Uri)var1_1);
                                                var1_1 = var14_19;
                                                ** GOTO lbl261
                                            }
                                            catch (Throwable var1_2) {
                                                break block41;
                                            }
                                            catch (RuntimeException var1_3) {
                                                break block42;
                                            }
                                            catch (IllegalArgumentException var1_4) {
                                                break block43;
                                            }
                                            catch (j var1_5) {
                                                break block44;
                                            }
                                            catch (OutOfMemoryError var1_6) {
                                                break block45;
                                            }
                                        }
                                        var4_21 /* !! */  = var9_20 /* !! */ ;
                                        var7_25 /* !! */  = var13_15;
                                        var5_26 /* !! */  = var12_16;
                                        var6_28 /* !! */  = var11_17;
                                        var8_29 /* !! */  = var10_18 /* !! */ ;
                                        if ("file".equals(var1_1.getScheme())) ** GOTO lbl254
                                        var4_21 /* !! */  = var9_20 /* !! */ ;
                                        var7_25 /* !! */  = var13_15;
                                        var5_26 /* !! */  = var12_16;
                                        var6_28 /* !! */  = var11_17;
                                        var8_29 /* !! */  = var10_18 /* !! */ ;
                                        if (ax.Q2.f.A0(var18_31)) ** GOTO lbl254
                                        var4_21 /* !! */  = var9_20 /* !! */ ;
                                        var7_25 /* !! */  = var13_15;
                                        var5_26 /* !! */  = var12_16;
                                        var6_28 /* !! */  = var11_17;
                                        var8_29 /* !! */  = var10_18 /* !! */ ;
                                        if (!Q.V1()) break block47;
                                        var4_21 /* !! */  = var9_20 /* !! */ ;
                                        var7_25 /* !! */  = var13_15;
                                        var5_26 /* !! */  = var12_16;
                                        var6_28 /* !! */  = var11_17;
                                        var8_29 /* !! */  = var10_18 /* !! */ ;
                                        if (!ax.c3.B.J(var17_30)) break block47;
                                        var4_21 /* !! */  = var9_20 /* !! */ ;
                                        var7_25 /* !! */  = var13_15;
                                        var5_26 /* !! */  = var12_16;
                                        var6_28 /* !! */  = var11_17;
                                        var8_29 /* !! */  = var10_18 /* !! */ ;
                                        var1_1 = com.alphainventor.filemanager.file.g.l(var17_30);
                                        var4_21 /* !! */  = var9_20 /* !! */ ;
                                        var7_25 /* !! */  = var13_15;
                                        var5_26 /* !! */  = var12_16;
                                        var6_28 /* !! */  = var11_17;
                                        var8_29 /* !! */  = var10_18 /* !! */ ;
                                        var1_1 = com.alphainventor.filemanager.file.g.o(this.j(), (Uri)var1_1, "r");
                                        var4_21 /* !! */  = var1_1;
                                        var7_25 /* !! */  = var1_1;
                                        var5_26 /* !! */  = var1_1;
                                        var6_28 /* !! */  = var1_1;
                                        var8_29 /* !! */  = var1_1;
                                        var16_14.setDataSource(var1_1.getFileDescriptor());
                                        ** GOTO lbl261
                                    }
                                    if (var17_30 != null) {
                                        var4_21 /* !! */  = var9_20 /* !! */ ;
                                        var7_25 /* !! */  = var13_15;
                                        var5_26 /* !! */  = var12_16;
                                        var6_28 /* !! */  = var11_17;
                                        var8_29 /* !! */  = var10_18 /* !! */ ;
                                        if (!ax.c3.B.H(var17_30)) {
                                            var4_21 /* !! */  = var9_20 /* !! */ ;
                                            var7_25 /* !! */  = var13_15;
                                            var5_26 /* !! */  = var12_16;
                                            var6_28 /* !! */  = var11_17;
                                            var8_29 /* !! */  = var10_18 /* !! */ ;
                                            var15_13.e = 1;
                                            var4_21 /* !! */  = var9_20 /* !! */ ;
                                            var7_25 /* !! */  = var13_15;
                                            var5_26 /* !! */  = var12_16;
                                            var6_28 /* !! */  = var11_17;
                                            var8_29 /* !! */  = var10_18 /* !! */ ;
                                            var4_21 /* !! */  = var9_20 /* !! */ ;
                                            var7_25 /* !! */  = var13_15;
                                            var5_26 /* !! */  = var12_16;
                                            var6_28 /* !! */  = var11_17;
                                            var8_29 /* !! */  = var10_18 /* !! */ ;
                                            var4_21 /* !! */  = var9_20 /* !! */ ;
                                            var7_25 /* !! */  = var13_15;
                                            var5_26 /* !! */  = var12_16;
                                            var6_28 /* !! */  = var11_17;
                                            var8_29 /* !! */  = var10_18 /* !! */ ;
                                            var1_1 = new StringBuilder();
                                            var4_21 /* !! */  = var9_20 /* !! */ ;
                                            var7_25 /* !! */  = var13_15;
                                            var5_26 /* !! */  = var12_16;
                                            var6_28 /* !! */  = var11_17;
                                            var8_29 /* !! */  = var10_18 /* !! */ ;
                                            var1_1.append("Load video for network FileInfo : ");
                                            var4_21 /* !! */  = var9_20 /* !! */ ;
                                            var7_25 /* !! */  = var13_15;
                                            var5_26 /* !! */  = var12_16;
                                            var6_28 /* !! */  = var11_17;
                                            var8_29 /* !! */  = var10_18 /* !! */ ;
                                            var1_1.append(var17_30.R());
                                            var4_21 /* !! */  = var9_20 /* !! */ ;
                                            var7_25 /* !! */  = var13_15;
                                            var5_26 /* !! */  = var12_16;
                                            var6_28 /* !! */  = var11_17;
                                            var8_29 /* !! */  = var10_18 /* !! */ ;
                                            var14_19 = new Exception(var1_1.toString());
                                            var4_21 /* !! */  = var9_20 /* !! */ ;
                                            var7_25 /* !! */  = var13_15;
                                            var5_26 /* !! */  = var12_16;
                                            var6_28 /* !! */  = var11_17;
                                            var8_29 /* !! */  = var10_18 /* !! */ ;
                                            var15_13.h = var14_19;
lbl159:
                                            // 2 sources

                                            while (true) {
                                                var16_14.release();
                                                return var15_13;
                                                break;
                                            }
                                        }
                                    }
                                    if (var17_30 == null) ** GOTO lbl196
                                    var4_21 /* !! */  = var9_20 /* !! */ ;
                                    var7_25 /* !! */  = var13_15;
                                    var5_26 /* !! */  = var12_16;
                                    var6_28 /* !! */  = var11_17;
                                    var8_29 /* !! */  = var10_18 /* !! */ ;
                                    {
                                        block48: {
                                            var4_21 /* !! */  = var9_20 /* !! */ ;
                                            var7_25 /* !! */  = var13_15;
                                            var5_26 /* !! */  = var12_16;
                                            var6_28 /* !! */  = var11_17;
                                            var8_29 /* !! */  = var10_18 /* !! */ ;
                                            var1_1 = new StringBuilder();
                                            var4_21 /* !! */  = var9_20 /* !! */ ;
                                            var7_25 /* !! */  = var13_15;
                                            var5_26 /* !! */  = var12_16;
                                            var6_28 /* !! */  = var11_17;
                                            var8_29 /* !! */  = var10_18 /* !! */ ;
                                            var1_1.append("load video : ");
                                            var4_21 /* !! */  = var9_20 /* !! */ ;
                                            var7_25 /* !! */  = var13_15;
                                            var5_26 /* !! */  = var12_16;
                                            var6_28 /* !! */  = var11_17;
                                            var8_29 /* !! */  = var10_18 /* !! */ ;
                                            var1_1.append(var17_30.R());
                                            var4_21 /* !! */  = var9_20 /* !! */ ;
                                            var7_25 /* !! */  = var13_15;
                                            var5_26 /* !! */  = var12_16;
                                            var6_28 /* !! */  = var11_17;
                                            var8_29 /* !! */  = var10_18 /* !! */ ;
                                            ax.u3.b.g(var1_1.toString());
                                            break block48;
lbl196:
                                            // 1 sources

                                            var4_21 /* !! */  = var9_20 /* !! */ ;
                                            var7_25 /* !! */  = var13_15;
                                            var5_26 /* !! */  = var12_16;
                                            var6_28 /* !! */  = var11_17;
                                            var8_29 /* !! */  = var10_18 /* !! */ ;
                                            ax.u3.b.g("load video null");
                                        }
                                        var4_21 /* !! */  = var9_20 /* !! */ ;
                                        var7_25 /* !! */  = var13_15;
                                        var5_26 /* !! */  = var12_16;
                                        var6_28 /* !! */  = var11_17;
                                        var8_29 /* !! */  = var10_18 /* !! */ ;
                                        var15_13.e = 1;
                                        var4_21 /* !! */  = var9_20 /* !! */ ;
                                        var7_25 /* !! */  = var13_15;
                                        var5_26 /* !! */  = var12_16;
                                        var6_28 /* !! */  = var11_17;
                                        var8_29 /* !! */  = var10_18 /* !! */ ;
                                        var4_21 /* !! */  = var9_20 /* !! */ ;
                                        var7_25 /* !! */  = var13_15;
                                        var5_26 /* !! */  = var12_16;
                                        var6_28 /* !! */  = var11_17;
                                        var8_29 /* !! */  = var10_18 /* !! */ ;
                                        var4_21 /* !! */  = var9_20 /* !! */ ;
                                        var7_25 /* !! */  = var13_15;
                                        var5_26 /* !! */  = var12_16;
                                        var6_28 /* !! */  = var11_17;
                                        var8_29 /* !! */  = var10_18 /* !! */ ;
                                        var1_1 = new StringBuilder();
                                        var4_21 /* !! */  = var9_20 /* !! */ ;
                                        var7_25 /* !! */  = var13_15;
                                        var5_26 /* !! */  = var12_16;
                                        var6_28 /* !! */  = var11_17;
                                        var8_29 /* !! */  = var10_18 /* !! */ ;
                                        var1_1.append("Invalid fileinfo : isNull=");
                                        if (var17_30 == null) {
                                            var2_33 = true;
                                        }
                                        var4_21 /* !! */  = var9_20 /* !! */ ;
                                        var7_25 /* !! */  = var13_15;
                                        var5_26 /* !! */  = var12_16;
                                        var6_28 /* !! */  = var11_17;
                                        var8_29 /* !! */  = var10_18 /* !! */ ;
                                        var1_1.append(var2_33);
                                        var4_21 /* !! */  = var9_20 /* !! */ ;
                                        var7_25 /* !! */  = var13_15;
                                        var5_26 /* !! */  = var12_16;
                                        var6_28 /* !! */  = var11_17;
                                        var8_29 /* !! */  = var10_18 /* !! */ ;
                                        var14_19 = new Exception(var1_1.toString());
                                        var4_21 /* !! */  = var9_20 /* !! */ ;
                                        var7_25 /* !! */  = var13_15;
                                        var5_26 /* !! */  = var12_16;
                                        var6_28 /* !! */  = var11_17;
                                        var8_29 /* !! */  = var10_18 /* !! */ ;
                                        var15_13.h = var14_19;
                                        ** continue;
lbl254:
                                        // 2 sources

                                        var4_21 /* !! */  = var9_20 /* !! */ ;
                                        var7_25 /* !! */  = var13_15;
                                        var5_26 /* !! */  = var12_16;
                                        var6_28 /* !! */  = var11_17;
                                        var8_29 /* !! */  = var10_18 /* !! */ ;
                                        var16_14.setDataSource(var1_1.getPath());
                                        var1_1 = var14_19;
lbl261:
                                        // 3 sources

                                        var4_21 /* !! */  = var1_1;
                                        var7_25 /* !! */  = var1_1;
                                        var5_26 /* !! */  = var1_1;
                                        var6_28 /* !! */  = var1_1;
                                        var8_29 /* !! */  = var1_1;
                                        var9_20 /* !! */  = var16_14.getFrameAtTime(-1L);
                                        if (var9_20 /* !! */  != null) break block46;
                                        var4_21 /* !! */  = var1_1;
                                        var7_25 /* !! */  = var1_1;
                                        var5_26 /* !! */  = var1_1;
                                        var6_28 /* !! */  = var1_1;
                                        var8_29 /* !! */  = var1_1;
                                        var15_13.e = 1;
                                        var4_21 /* !! */  = var1_1;
                                        var7_25 /* !! */  = var1_1;
                                        var5_26 /* !! */  = var1_1;
                                        var6_28 /* !! */  = var1_1;
                                        var8_29 /* !! */  = var1_1;
                                        var4_21 /* !! */  = var1_1;
                                        var7_25 /* !! */  = var1_1;
                                        var5_26 /* !! */  = var1_1;
                                        var6_28 /* !! */  = var1_1;
                                        var8_29 /* !! */  = var1_1;
                                        var9_20 /* !! */  = new Exception("Frame cannot be retrieved");
                                        var4_21 /* !! */  = var1_1;
                                        var7_25 /* !! */  = var1_1;
                                        var5_26 /* !! */  = var1_1;
                                        var6_28 /* !! */  = var1_1;
                                        var8_29 /* !! */  = var1_1;
                                        var15_13.h = var9_20 /* !! */ ;
                                    }
                                    try {
                                        var16_14.release();
                                    }
                                    catch (Exception var4_22) {
                                        // empty catch block
                                    }
                                    if (var1_1 == null) return var15_13;
lbl297:
                                    // 6 sources

                                    while (true) {
                                        var1_1.close();
                                        return var15_13;
                                        break;
                                    }
                                }
                                var4_21 /* !! */  = var1_1;
                                var7_25 /* !! */  = var1_1;
                                var5_26 /* !! */  = var1_1;
                                var6_28 /* !! */  = var1_1;
                                var8_29 /* !! */  = var1_1;
                                {
                                    var4_21 /* !! */  = var1_1;
                                    var7_25 /* !! */  = var1_1;
                                    var5_26 /* !! */  = var1_1;
                                    var6_28 /* !! */  = var1_1;
                                    var8_29 /* !! */  = var1_1;
                                    var10_18 /* !! */  = new Point(var9_20 /* !! */ .getWidth(), var9_20 /* !! */ .getHeight());
                                    var4_21 /* !! */  = var1_1;
                                    var7_25 /* !! */  = var1_1;
                                    var5_26 /* !! */  = var1_1;
                                    var6_28 /* !! */  = var1_1;
                                    var8_29 /* !! */  = var1_1;
                                    var15_13.a = var10_18 /* !! */ ;
                                    var4_21 /* !! */  = var1_1;
                                    var7_25 /* !! */  = var1_1;
                                    var5_26 /* !! */  = var1_1;
                                    var6_28 /* !! */  = var1_1;
                                    var8_29 /* !! */  = var1_1;
                                    var15_13.c = var9_20 /* !! */ ;
                                    var4_21 /* !! */  = var1_1;
                                    var7_25 /* !! */  = var1_1;
                                    var5_26 /* !! */  = var1_1;
                                    var6_28 /* !! */  = var1_1;
                                    var8_29 /* !! */  = var1_1;
                                    var15_13.e = 0;
                                    var4_21 /* !! */  = var1_1;
                                    var7_25 /* !! */  = var1_1;
                                    var5_26 /* !! */  = var1_1;
                                    var6_28 /* !! */  = var1_1;
                                    var8_29 /* !! */  = var1_1;
                                    var9_20 /* !! */ .setDensity(160);
                                    var4_21 /* !! */  = var1_1;
                                    var7_25 /* !! */  = var1_1;
                                    var5_26 /* !! */  = var1_1;
                                    var6_28 /* !! */  = var1_1;
                                    var8_29 /* !! */  = var1_1;
                                    var4_21 /* !! */  = var1_1;
                                    var7_25 /* !! */  = var1_1;
                                    var5_26 /* !! */  = var1_1;
                                    var6_28 /* !! */  = var1_1;
                                    var8_29 /* !! */  = var1_1;
                                    var9_20 /* !! */  = new com.android.ex.photo.c();
                                    var4_21 /* !! */  = var1_1;
                                    var7_25 /* !! */  = var1_1;
                                    var5_26 /* !! */  = var1_1;
                                    var6_28 /* !! */  = var1_1;
                                    var8_29 /* !! */  = var1_1;
                                    var15_13.i = var9_20 /* !! */ ;
                                    var4_21 /* !! */  = var1_1;
                                    var7_25 /* !! */  = var1_1;
                                    var5_26 /* !! */  = var1_1;
                                    var6_28 /* !! */  = var1_1;
                                    var8_29 /* !! */  = var1_1;
                                    var10_18 /* !! */  = this.s;
                                    if (var10_18 /* !! */  != null) {
                                        var4_21 /* !! */  = var1_1;
                                        var7_25 /* !! */  = var1_1;
                                        var5_26 /* !! */  = var1_1;
                                        var6_28 /* !! */  = var1_1;
                                        var8_29 /* !! */  = var1_1;
                                        this.Q((com.android.ex.photo.c)var9_20 /* !! */ , (n)var10_18 /* !! */ );
                                    }
                                    var4_21 /* !! */  = var1_1;
                                    var7_25 /* !! */  = var1_1;
                                    var5_26 /* !! */  = var1_1;
                                    var6_28 /* !! */  = var1_1;
                                    var8_29 /* !! */  = var1_1;
                                    var15_13.i.a(var16_14);
                                    var4_21 /* !! */  = var1_1;
                                    var7_25 /* !! */  = var1_1;
                                    var5_26 /* !! */  = var1_1;
                                    var6_28 /* !! */  = var1_1;
                                    var8_29 /* !! */  = var1_1;
                                    this.V(var15_13.i, this.j(), var17_30);
                                }
                                try {
                                    var16_14.release();
                                }
                                catch (Exception var4_23) {
                                    // empty catch block
                                }
                                if (var1_1 == null) return var15_13;
                                ** GOTO lbl297
                            }
                            var4_21 /* !! */  = var7_25 /* !! */ ;
                            {
                                var15_13.e = 1;
                                var4_21 /* !! */  = var7_25 /* !! */ ;
                                var15_13.h = var1_3;
                            }
                            try {
                                var16_14.release();
                            }
                            catch (Exception var1_7) {
                                // empty catch block
                            }
                            if (var7_25 /* !! */  == null) return var15_13;
                            var1_1 = var7_25 /* !! */ ;
                            ** GOTO lbl297
                        }
                        var4_21 /* !! */  = var5_26 /* !! */ ;
                        {
                            var15_13.e = 1;
                            var4_21 /* !! */  = var5_26 /* !! */ ;
                            var15_13.h = var1_4;
                        }
                        try {
                            var16_14.release();
                        }
                        catch (Exception var1_8) {
                            // empty catch block
                        }
                        if (var5_26 /* !! */  == null) return var15_13;
                        var1_1 = var5_26 /* !! */ ;
                        ** GOTO lbl297
                    }
                    var4_21 /* !! */  = var6_28 /* !! */ ;
                    {
                        var15_13.e = 1;
                        var4_21 /* !! */  = var6_28 /* !! */ ;
                        var15_13.h = var1_5;
                    }
                    try {
                        var16_14.release();
                    }
                    catch (Exception var1_9) {
                        // empty catch block
                    }
                    if (var6_28 /* !! */  == null) return var15_13;
                    var1_1 = var6_28 /* !! */ ;
                    ** GOTO lbl297
                }
                var4_21 /* !! */  = var8_29 /* !! */ ;
                {
                    var15_13.e = 1;
                    var4_21 /* !! */  = var8_29 /* !! */ ;
                    var15_13.h = var1_6;
                }
                try {
                    var16_14.release();
                }
                catch (Exception var1_10) {
                    // empty catch block
                }
                if (var8_29 /* !! */  == null) return var15_13;
                var1_1 = var8_29 /* !! */ ;
                ** while (true)
            }
            try {
                var16_14.release();
            }
            catch (Exception var5_27) {
                // empty catch block
            }
            if (var4_21 /* !! */  == null) throw var1_2;
            try {}
            catch (IOException var4_24) {
                throw var1_2;
            }
            break block49;
            catch (IOException | Exception var1_12) {
                return var15_13;
            }
        }
        var4_21 /* !! */ .close();
        throw var1_2;
        catch (NoClassDefFoundError var1_11) {
            var15_13.e = 1;
            var15_13.h = var1_11;
            return var15_13;
        }
    }

    private static class a
    implements b.d {
        protected final n a;
        protected final o b;

        public a(o o8, n n8) {
            this.a = n8;
            this.b = o8;
        }

        @Override
        public InputStream createInputStream() throws IOException {
            if (this.b.a()) {
                try {
                    InputStream inputStream = this.b.J(this.a, 0L);
                    return inputStream;
                }
                catch (j j8) {
                    throw new IOException(j8);
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("File operator is not connected : ");
            stringBuilder.append(this.b.S().I());
            stringBuilder.append("");
            throw new IOException(stringBuilder.toString());
        }
    }

    public static class b
    extends ax.p.c
    implements Animatable {
        boolean b = false;
        ax.b4.c c;
        int d;
        int e;

        public b(Context context, ax.b4.c c8) {
            super(c8);
            this.c = c8;
            int n8 = ax.u3.B.t(context);
            this.e = ax.w3.f$b.d(this.c.getIntrinsicWidth(), 160, n8);
            this.d = ax.w3.f$b.d(this.c.getIntrinsicHeight(), 160, n8);
        }

        private static int d(int n8, int n9, int n10) {
            int n11 = n8;
            if (n9 != 0) {
                n11 = n8;
                if (n10 != 0) {
                    n11 = n9 == n10 ? n8 : (n8 * n10 + (n9 >> 1)) / n9;
                }
            }
            return n11;
        }

        public void c() {
            this.b = true;
            this.c.i();
        }

        @Override
        public void draw(Canvas canvas) {
            if (!this.b) {
                try {
                    super.draw(canvas);
                    return;
                }
                catch (RuntimeException runtimeException) {
                    ax.Ha.c.h().f().d("GifDrawable FrameLoader Too large").l(runtimeException).h();
                }
                catch (NullPointerException nullPointerException) {
                    ax.Ha.c.h().f().d("GifDrawable FrameLoader Null").l(nullPointerException).h();
                }
            }
        }

        @Override
        public int getIntrinsicHeight() {
            return this.d;
        }

        @Override
        public int getIntrinsicWidth() {
            return this.e;
        }

        public boolean isRunning() {
            return this.c.isRunning();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public void start() {
            try {
                this.c.start();
                return;
            }
            catch (NullPointerException nullPointerException) {
                return;
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public void stop() {
            try {
                this.c.stop();
                return;
            }
            catch (NullPointerException nullPointerException) {
                return;
            }
        }
    }

    public static class c
    extends ax.p.c {
        Paint b;
        PictureDrawable c;

        public c(PictureDrawable pictureDrawable) {
            super((Drawable)pictureDrawable);
            this.c = pictureDrawable;
            this.b = e.b(20);
        }

        @Override
        public void draw(Canvas canvas) {
            if (this.c.getPicture() != null) {
                Rect rect = this.getBounds();
                canvas.save();
                canvas.clipRect(rect);
                canvas.translate((float)rect.left, (float)rect.top);
                canvas.drawRect(0.0f, 0.0f, (float)rect.width(), (float)rect.height(), this.b);
                canvas.drawPicture(this.c.getPicture());
                canvas.restore();
            }
        }
    }
}

