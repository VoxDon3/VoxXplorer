package com.voxdon.xplorer.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import ax.Q2.d;
import ax.Q2.f;
import ax.Z2.c;
import ax.a3.Q;
import ax.b3.C1495j;
import ax.c3.C1808A;
import ax.c3.C1832u;
import ax.c3.C1834w;
import ax.c3.d0;
import ax.d3.E;
import ax.d3.M;
import ax.n.ActivityC2561c;
import ax.t3.j;
import ax.u3.C3184b;
import com.voxdon.xplorer.bookmark.Bookmark;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.R;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class ShortcutActivity extends ActivityC2561c {
    M a;

    private void F(Uri uri, Bookmark bookmark) {
        try {
            C3605y I0 = C3605y.I0(bookmark.w());
            Intent A3 = Q.A3(this, I0);
            if (A3 == null || !C1832u.S(A3)) {
                if (A3 == null || !C1832u.T(A3)) {
                    if (A3 == null) {
                        if (j.C(this) && C1808A.B(I0, false)) {
                            A3 = C1834w.d(this, I0, false);
                        } else if (j.F(this) && C1808A.E(I0) && !Q.K3(this, c.a.GENERAL, I0, false)) {
                            A3 = C1834w.i(this, I0, -1, false);
                        } else if (!j.D(this) || !C1808A.C(I0) || Q.J3(this, I0, false)) {
                            if (j.E(this) && C1808A.D(I0)) {
                                A3 = C1834w.g(this, null, I0);
                            } else if (!E.X7(this, I0)) {
                                this.a.P2(true);
                                this.a.O2(c.a.GENERAL, I0, I0.s(), false, true);
                                return;
                            }
                        }
                    }
                }
                A3 = null;
            } else {
                A3 = C1834w.d(this, I0, false);
            }
            if (A3 == null || C1832u.a0(A3)) {
                H(uri);
            } else {
                I(A3, 0, I0.A());
                finish();
            }
        } catch (C1495j e) {
            Toast.makeText(this, R.string.error_file_load, 1).show();
            e.printStackTrace();
            finish();
        }
    }

    private void H(Uri uri) {
        C1832u.d0(this, uri);
        finish();
    }

    private void I(Intent intent, int i, String str) {
        String str2 = C1834w.m(this, intent, i, false) ? "success" : "failure";
        if (str == null) {
            if (intent.getData() != null) {
                str = d0.j(d0.h(intent.getData().getPath()));
            } else {
                if ("com.filemanager.plugin.action.LAUNCH_FILE_URI".equals(intent.getAction()) && intent.hasExtra("com.filemanager.plugin.extra.DATA")) {
                    String stringExtra = intent.getStringExtra("com.filemanager.plugin.extra.DATA");
                    if (stringExtra != null) {
                        str = d0.j(d0.h(Uri.parse(stringExtra).getPath()));
                    }
                } else {
                    C3184b.g("What case is this?");
                }
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
        }
        ax.Q2.a.i().m("command", "file_open").c("loc", "ShortCut").c("ext", str).c("result", str2).e();
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        ax.Q2.b.f(this, true);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!"com.voxdon.xplorer.OPEN_SHORTCUT".equals(intent.getAction())) {
            Toast.makeText(this, R.string.error, 1).show();
            finish();
            return;
        }
        M m = (M) getSupportFragmentManager().k0("headless_fragment");
        this.a = m;
        if (m == null) {
            this.a = M.K2("Shortcut");
            getSupportFragmentManager().o().e(this.a, "headless_fragment").i();
        }
        Boolean valueOf = intent.hasExtra("IS_DIRECTORY") ? Boolean.valueOf(intent.getBooleanExtra("IS_DIRECTORY", false)) : null;
        Uri data = intent.getData();
        Bookmark c = Bookmark.c(this, data);
        if (c == null) {
            d.c("shotcuturinull", new Exception("shortcut error:" + data));
            Toast.makeText(this, R.string.error, 1).show();
            finish();
            return;
        }
        if (valueOf == null || valueOf.booleanValue() || !f.A0(c.s())) {
            H(intent.getData());
        } else {
            F(intent.getData(), c);
        }
    }
}
