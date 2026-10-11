/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import ax.Q2.b;
import ax.Q2.d;
import ax.R2.e;
import ax.X2.Q;
import ax.b3.j;
import ax.c3.A;
import ax.c3.B;
import ax.c3.F;
import ax.c3.K;
import ax.c3.N;
import ax.c3.W;
import ax.c3.d0;
import ax.c3.h;
import ax.c3.u;
import ax.c3.w;
import ax.c3.x;
import ax.c3.z;
import ax.n.c;
import com.alphainventor.filemanager.file.n;
import com.alphainventor.filemanager.file.y;
import java.io.File;
import java.io.FileNotFoundException;

public class LaunchActivity
extends c {
    private View a;

    private void H(Uri uri, String string, z z8) throws FileNotFoundException {
        this.L();
        W w8 = B.x((Context)this, uri, null);
        this.I(this.getContentResolver().openAssetFileDescriptor(uri, "r"), w8, string, z8);
    }

    private void I(AssetFileDescriptor assetFileDescriptor, W w8, String string, z z8) {
        this.a.setVisibility(0);
        new h((Context)this, assetFileDescriptor, w8, z8, new h.a(){
            final z a;
            final String b;
            final LaunchActivity c;
            {
                this.c = launchActivity;
                this.a = z8;
                this.b = string;
            }

            @Override
            public void a(Throwable throwable) {
                this.c.a.setVisibility(8);
                if (throwable != null) {
                    throwable.printStackTrace();
                }
                if (throwable instanceof FileNotFoundException) {
                    Toast.makeText((Context)this.c, (int)2131952548, (int)1).show();
                } else {
                    Toast.makeText((Context)this.c, (int)2131951934, (int)1).show();
                }
                this.c.finish();
            }

            @Override
            public void b(File object) {
                this.c.a.setVisibility(8);
                try {
                    object = ((File)object).getAbsolutePath();
                    Object object2 = this.a;
                    if (object2 == z.f0) {
                        object2 = y.I0((String)object);
                        object2 = w.d((Context)this.c, (n)object2, false);
                        object2.putExtra("extra_temp_file_path", (String)object);
                        object2.putExtra("extra_temp_file_type", this.b);
                        this.c.startActivity((Intent)object2);
                    } else if (object2 == z.c0) {
                        u.f0(this.c, (String)object, this.b);
                    } else if (object2 == z.i0) {
                        object = w.h((Context)this.c, (String)object);
                        this.c.startActivity((Intent)object);
                    } else {
                        ax.u3.b.f();
                    }
                }
                catch (j j8) {
                    Toast.makeText((Context)this.c, (int)2131951934, (int)1).show();
                }
                this.c.finish();
            }
        }).i(new Void[0]);
    }

    private void J(String string) {
        u.d0((Context)this, Uri.parse((String)B.U(x.g(string).T(), string)));
    }

    private void L() {
        this.setContentView(2131558439);
        this.a = this.findViewById(2131362712);
    }

    private void M(Intent intent) {
        Intent intent2 = u.F((Context)this, intent.getAction(), intent.getData(), intent.getType());
        intent2.putExtras(intent);
        this.startActivity(intent2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    protected void onCreate(Bundle var1_1) {
        block29: {
            block38: {
                block31: {
                    block30: {
                        block32: {
                            block36: {
                                block37: {
                                    block35: {
                                        block34: {
                                            var6_5 = true;
                                            b.f((Context)this, true);
                                            super.onCreate((Bundle)var1_1);
                                            var11_6 = this.getIntent();
                                            var1_1 = var11_6.getAction();
                                            if (!"android.intent.action.VIEW".equals(var1_1) || var11_6.getData() == null || !"com.android.mtp.documents".equals(var11_6.getData().getHost())) break block34;
                                            if (Q.k1()) {
                                                var1_1 = u.E((Context)this, (String)var1_1, var11_6.getData());
                                                var1_1.putExtras(var11_6);
                                                this.startActivity((Intent)var1_1);
                                                break block29;
                                            } else {
                                                Toast.makeText((Context)this, (int)2131951927, (int)1).show();
                                            }
                                            break block29;
                                        }
                                        if (!"android.intent.action.VIEW".equals(var1_1) || var11_6.getData() == null || !"media".equals(var11_6.getData().getHost())) break block35;
                                        var9_7 = N.a((Context)this, var11_6.getData());
                                        if (var9_7 != null) {
                                            var1_1 = K.i;
                                            var10_11 = var1_1.e();
                                            if (var10_11 != null && d0.H(var10_11, var9_7)) {
                                                u.d0((Context)this, Uri.parse((String)B.U((K)var1_1, var9_7)));
                                                break block29;
                                            } else {
                                                this.J(var9_7);
                                            }
                                            break block29;
                                        } else {
                                            Toast.makeText((Context)this, (int)2131951935, (int)1).show();
                                        }
                                        break block29;
                                    }
                                    var8_13 = "android.intent.action.VIEW".equals(var1_1);
                                    var7_14 = false;
                                    var4_15 = false;
                                    var5_16 = false;
                                    var3_17 = false;
                                    if (!var8_13 || !"resource/folder".equals(var11_6.getType())) break block36;
                                    var2_18 = var3_17;
                                    if (var11_6.getData() == null) break block37;
                                    var2_18 = var3_17;
                                    if (!"content".equals(var11_6.getData().getScheme())) break block37;
                                    var1_1 = var11_6.getData().getPath();
                                    if (var1_1 == null || !var1_1.startsWith("/external_files/")) ** GOTO lbl-1000
                                    var9_8 = var1_1.substring(15);
                                    var1_1 = new StringBuilder();
                                    var1_1.append("/storage/emulated/0");
                                    var1_1.append(var9_8);
                                    var1_1 = var1_1.toString();
                                    if (new File((String)var1_1).exists()) {
                                        this.J((String)var1_1);
                                        var2_18 = var6_5;
                                    } else lbl-1000:
                                    // 2 sources

                                    {
                                        var2_18 = false;
                                    }
                                    if (!var2_18 && Q.T0() && ax.R2.d.a(this) != null && !"com.android.externalstorage.documents".equals(var11_6.getData().getHost())) {
                                        var1_1 = new StringBuilder();
                                        var1_1.append("invalid call from ");
                                        var1_1.append(var11_6.getData().getHost());
                                        var1_1.append(":");
                                        var1_1.append(var11_6.getData().getPath());
                                        d.c("resource/folder content", new Exception(var1_1.toString()));
                                    }
                                }
                                if (!var2_18) {
                                    this.M(var11_6);
                                }
                                break block29;
                            }
                            if (!"android.intent.action.VIEW".equals(var1_1) || var11_6.getData() == null || !"content".equals(var11_6.getData().getScheme())) break block38;
                            var12_20 = u.o((Context)this, var11_6);
                            try {
                                if (A.r(var12_20)) {
                                    this.H(var11_6.getData(), var12_20, z.c0);
                                    return;
                                }
                            }
                            catch (RuntimeException var1_2) {
                                break block30;
                            }
                            catch (FileNotFoundException var1_3) {
                                break block31;
                            }
                            if (A.I(var12_20)) {
                                this.H(var11_6.getData(), var12_20, z.f0);
                                return;
                            }
                            var1_1 = null;
                            var10_12 /* !! */  = null;
                            try {
                                var9_9 = this.getContentResolver().openAssetFileDescriptor(var11_6.getData(), "r");
                                var2_19 = var7_14;
                                if (var9_9 == null) break block32;
                                var10_12 /* !! */  = var9_9;
                                var1_1 = var9_9;
                                var13_21 = B.y((AssetFileDescriptor)var9_9);
                                var2_19 = var7_14;
                                if (var13_21 == null) break block32;
                                var10_12 /* !! */  = var9_9;
                                var1_1 = var9_9;
                                var2_19 = var7_14;
                                if (!var13_21.startsWith("/storage/")) break block32;
                                var10_12 /* !! */  = var9_9;
                                var1_1 = var9_9;
                                this.J(var13_21);
                                var2_19 = true;
                            }
                            catch (Throwable var1_4) {
                                ** GOTO lbl115
                            }
                            catch (Exception var9_10) {
                                ** GOTO lbl118
                            }
                        }
                        var3_17 = var2_19;
                        if (var9_9 == null) ** GOTO lbl122
                        var1_1 = var9_9;
lbl-1000:
                        // 2 sources

                        {
                            block33: {
                                while (true) {
                                    F.a((AutoCloseable)var1_1);
                                    var3_17 = var2_19;
                                    break block33;
                                    break;
                                }
lbl115:
                                // 1 sources

                                if (var10_12 /* !! */  != null) {
                                    F.a(var10_12 /* !! */ );
                                }
                                throw var1_4;
lbl118:
                                // 1 sources

                                var3_17 = var5_16;
                                if (var1_1 != null) {
                                    var2_19 = var4_15;
                                    ** continue;
                                }
                            }
                            if (var3_17) break block29;
                            var1_1 = var11_6.getData().getPath();
                            if (var1_1 != null && (var9_9 = new File((String)var1_1)).exists()) {
                                this.J((String)var1_1);
                                break block29;
                            }
                            if (A.T(var12_20)) {
                                this.H(var11_6.getData(), var12_20, z.i0);
                                return;
                            }
                            if (var11_6.getData() != null) {
                                if (Q.T0() && ax.R2.d.a(this) != null) {
                                    var1_1 = new StringBuilder();
                                    var1_1.append("invalid call from ");
                                    var1_1.append(e.a(ax.R2.d.a(this)));
                                    var1_1.append(":Invalid launch mime type 1 : ");
                                    var1_1.append(var11_6.getType());
                                    var1_1.append(":");
                                    var1_1.append(var11_6.getData().getHost());
                                    var1_1.append(":");
                                    var1_1.append(var12_20);
                                    var1_1.append(":");
                                    var1_1.append(var11_6.getData().getPath());
                                    var9_9 = new Exception(var1_1.toString());
                                    d.c("invalid launch intent", (Throwable)var9_9);
                                }
                            } else if (Q.T0() && ax.R2.d.a(this) != null) {
                                var9_9 = new StringBuilder();
                                var9_9.append("invalid call from ");
                                var9_9.append(e.a(ax.R2.d.a(this)));
                                var9_9.append(":Invalid launch mime type 2 : ");
                                var9_9.append(var11_6.getType());
                                var9_9.append(":");
                                var9_9.append(var12_20);
                                var1_1 = new Exception(var9_9.toString());
                                d.c("invalid launch intent 2", (Throwable)var1_1);
                            }
                            this.M(var11_6);
                            break block29;
                        }
                    }
                    var1_2.printStackTrace();
                    Toast.makeText((Context)this, (int)2131951934, (int)1).show();
                    break block29;
                }
                var1_3.printStackTrace();
                Toast.makeText((Context)this, (int)2131951935, (int)1).show();
                break block29;
            }
            if ("com.example.android.uamp.open_ui".equals(var1_1) || "android.intent.action.VIEW".equals(var1_1) || "android.intent.action.VIEW_DOWNLOADS".equals(var1_1)) {
                this.M(var11_6);
            }
        }
        this.finish();
    }
}

