/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import ax.Q2.b;
import ax.U2.d;
import ax.c3.F;
import ax.c3.k;
import ax.c3.x;
import ax.n.c;
import ax.t3.j;
import ax.u3.q;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class SplitApkInstallerActivity
extends c {
    View a;

    @Override
    protected void onCreate(Bundle object) {
        b.f((Context)this, true);
        super.onCreate((Bundle)object);
        this.setContentView(2131558439);
        this.a = this.findViewById(2131362712);
        Intent intent = this.getIntent();
        object = intent.getAction();
        intent = intent.getData();
        if ("android.intent.action.VIEW".equals(object) && intent != null) {
            new a(this, (Context)this, (Uri)intent).h(new String[0]);
            return;
        }
        Toast.makeText((Context)this, (int)2131951927, (int)1).show();
        this.finish();
    }

    class a
    extends q<String, Void, Boolean> {
        private Context h;
        private Uri i;
        private String j;
        final SplitApkInstallerActivity k;

        a(SplitApkInstallerActivity splitApkInstallerActivity, Context context, Uri uri) {
            this.k = splitApkInstallerActivity;
            super(q.e.e0);
            this.h = context;
            this.i = uri;
        }

        @Override
        protected void r() {
            View view = this.k.a;
            if (view != null) {
                view.setVisibility(0);
            }
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        protected Boolean w(String ... var1_1) {
            block21: {
                block22: {
                    block24: {
                        var1_1 /* !! */  = ax.Z2.a.m(this.h, "apks-tmp");
                        var3_12 = new StringBuilder();
                        var3_12.append(String.valueOf(this.i.hashCode()));
                        var3_12.append(".spliatapk");
                        var7_13 = new File((File)var1_1 /* !! */ , var3_12.toString());
                        if (this.i == null) break block24;
                        var4_14 = null;
                        var1_1 /* !! */  = this.h.getApplicationContext().getContentResolver().openAssetFileDescriptor(this.i, "r");
                        var3_12 = new AssetFileDescriptor.AutoCloseInputStream(var1_1 /* !! */ );
                        var4_14 = var1_1 /* !! */  = new FileOutputStream(var7_13);
                        var5_15 = var3_12;
                        try {
                            F.b((InputStream)var3_12, (OutputStream)var1_1 /* !! */ );
                        }
                        catch (Throwable var1_2) {
                            var3_12 = var5_15;
                            break block21;
                        }
                        catch (Exception var6_17) {
                            break block22;
                        }
                        F.a((AutoCloseable)var3_12);
                        F.a((AutoCloseable)var1_1 /* !! */ );
                        break block24;
                        catch (Throwable var1_5) {
                            var5_16 = null;
                            var3_12 = var4_14;
                            var4_14 = var5_16;
                            break block21;
                        }
                        catch (Exception var6_19) {
                            var3_12 = null;
                            var1_1 /* !! */  = null;
                            break block22;
                        }
                        catch (Throwable var1_4) {
                            var4_14 = null;
                            break block21;
                        }
                        catch (Exception var6_18) {
                            var1_1 /* !! */  = null;
                            break block22;
                        }
                    }
                    try {
                        var1_1 /* !! */  = (k)x.f(var7_13).z(var7_13.getAbsolutePath());
                    }
                    catch (ax.b3.j var1_11) {
                        if (ax.t3.j.o(this.h)) {
                            this.j = var1_11.getMessage();
                        }
                        return Boolean.FALSE;
                    }
                }
                var4_14 = var1_1 /* !! */ ;
                var5_15 = var3_12;
                {
                    if (ax.t3.j.o(this.h)) {
                        var4_14 = var1_1 /* !! */ ;
                        var5_15 = var3_12;
                        this.j = var6_20.getMessage();
                    }
                    var4_14 = var1_1 /* !! */ ;
                    var5_15 = var3_12;
                    var7_13.delete();
                    var4_14 = var1_1 /* !! */ ;
                    var5_15 = var3_12;
                    var6_20 = Boolean.FALSE;
                }
                F.a((AutoCloseable)var3_12);
                F.a((AutoCloseable)var1_1 /* !! */ );
                return var6_20;
            }
            F.a((AutoCloseable)var3_12);
            F.a((AutoCloseable)var4_14);
            throw var1_3;
            try {}
            catch (SecurityException var1_7) {}
            catch (ax.b3.j var1_8) {}
            ** finally { 
            {
            }
            var2_21 = d.O(this.h, (k)var1_1 /* !! */ );
            var7_13.delete();
            return var2_21;
        }

        protected void x(Boolean object) {
            View view = this.k.a;
            if (view != null) {
                view.setVisibility(8);
            }
            if (object == null || !((Boolean)object).booleanValue()) {
                if (this.j != null) {
                    object = new StringBuilder();
                    ((StringBuilder)object).append(this.h.getString(2131951927));
                    ((StringBuilder)object).append(":");
                    ((StringBuilder)object).append(this.j);
                    object = ((StringBuilder)object).toString();
                    Toast.makeText((Context)this.h, (CharSequence)object, (int)1).show();
                } else {
                    Toast.makeText((Context)this.h, (int)2131951927, (int)1).show();
                }
            }
            this.k.finish();
        }
    }
}

