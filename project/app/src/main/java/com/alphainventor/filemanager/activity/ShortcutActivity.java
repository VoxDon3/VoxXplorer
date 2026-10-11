/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import ax.Q2.a;
import ax.Q2.b;
import ax.Q2.d;
import ax.Q2.f;
import ax.Z2.c;
import ax.a3.Q;
import ax.c3.A;
import ax.c3.d0;
import ax.c3.u;
import ax.c3.w;
import ax.d3.E;
import ax.d3.M;
import ax.n.c;
import ax.t3.j;
import com.alphainventor.filemanager.bookmark.Bookmark;
import com.alphainventor.filemanager.file.y;

public class ShortcutActivity
extends c {
    M a;

    /*
     * Unable to fully structure code
     */
    private void F(Uri var1_1, Bookmark var2_3) {
        block7: {
            block10: {
                block9: {
                    block8: {
                        try {
                            var3_4 = y.I0(var2_3.w());
                        }
                        catch (ax.b3.j var1_2) {
                            Toast.makeText((Context)this, (int)2131951934, (int)1).show();
                            var1_2.printStackTrace();
                            this.finish();
                            return;
                        }
                        var2_3 = Q.A3((Context)this, var3_4);
                        if (var2_3 == null || !u.S((Intent)var2_3)) break block8;
                        var2_3 = w.d((Context)this, var3_4, false);
                        break block7;
                    }
                    if (var2_3 != null && u.T((Intent)var2_3)) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            var2_3 = null;
                            break block7;
                            break;
                        }
                    }
                    if (var2_3 != null) break block7;
                    if (!j.C((Context)this) || !A.B(var3_4, false)) break block9;
                    var2_3 = w.d((Context)this, var3_4, false);
                    break block7;
                }
                if (!j.F((Context)this) || !A.E(var3_4) || Q.K3((Context)this, c.a.c0, var3_4, false)) break block10;
                var2_3 = w.i((Context)this, var3_4, -1, false);
                break block7;
            }
            if (j.D((Context)this) && A.C(var3_4) && !Q.J3((Context)this, var3_4, false)) ** GOTO lbl-1000
            if (j.E((Context)this) && A.D(var3_4)) {
                var2_3 = w.g((Context)this, null, var3_4);
            } else {
                if (!E.X7((Context)this, var3_4)) ** break;
                ** continue;
                this.a.P2(true);
                this.a.O2(c.a.c0, var3_4, var3_4.s(), false, true);
                return;
            }
        }
        if (var2_3 != null && !u.a0((Intent)var2_3)) {
            this.I((Intent)var2_3, 0, var3_4.A());
            this.finish();
            return;
        }
        this.H(var1_1);
        return;
    }

    private void H(Uri uri) {
        u.d0((Context)this, uri);
        this.finish();
    }

    private void I(Intent object, int n8, String string) {
        String string2;
        block0: {
            block3: {
                block2: {
                    block1: {
                        string2 = w.m(this, object, n8, false) ? "success" : "failure";
                        if (string != null) break block0;
                        if (object.getData() == null) break block1;
                        string = d0.j(d0.h(object.getData().getPath()));
                        break block0;
                    }
                    if (!"com.filemanager.plugin.action.LAUNCH_FILE_URI".equals(object.getAction()) || !object.hasExtra("com.filemanager.plugin.extra.DATA")) break block2;
                    if ((object = object.getStringExtra("com.filemanager.plugin.extra.DATA")) == null) break block3;
                    string = d0.j(d0.h(Uri.parse((String)object).getPath()));
                    break block0;
                }
                ax.u3.b.g("What case is this?");
            }
            string = "";
        }
        ax.Q2.a.i().m("command", "file_open").c("loc", "ShortCut").c("ext", string).c("result", string2).e();
    }

    @Override
    protected void onCreate(Bundle object) {
        b.f((Context)this, true);
        super.onCreate((Bundle)object);
        Intent intent = this.getIntent();
        if (!"com.alphainventor.filemanager.OPEN_SHORTCUT".equals(intent.getAction())) {
            Toast.makeText((Context)this, (int)2131951927, (int)1).show();
            this.finish();
            return;
        }
        object = (M)this.getSupportFragmentManager().k0("headless_fragment");
        this.a = object;
        if (object == null) {
            this.a = M.K2("Shortcut");
            this.getSupportFragmentManager().o().e(this.a, "headless_fragment").i();
        }
        object = intent.hasExtra("IS_DIRECTORY") ? Boolean.valueOf(intent.getBooleanExtra("IS_DIRECTORY", false)) : null;
        Uri uri = intent.getData();
        Bookmark bookmark = Bookmark.c((Context)this, uri);
        if (bookmark == null) {
            object = new StringBuilder();
            ((StringBuilder)object).append("shortcut error:");
            ((StringBuilder)object).append(uri);
            d.c("shotcuturinull", new Exception(((StringBuilder)object).toString()));
            Toast.makeText((Context)this, (int)2131951927, (int)1).show();
            this.finish();
            return;
        }
        if (object != null && !((Boolean)object).booleanValue() && f.A0(bookmark.s())) {
            this.F(intent.getData(), bookmark);
            return;
        }
        this.H(intent.getData());
    }
}

