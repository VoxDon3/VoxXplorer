package com.voxdon.xplorer.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import ax.U2.d;
import ax.b3.C1495j;
import ax.b3.s;
import ax.c3.AbstractC1823k;
import ax.c3.C1835x;
import ax.c3.F;
import ax.n.ActivityC2561c;
import ax.t3.j;
import ax.u3.AbstractC3199q;
import com.voxdon.xplorer.R;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public class SplitApkInstallerActivity extends ActivityC2561c {
    View a;

    class a extends AbstractC3199q<String, Void, Boolean> {
        private Context h;
        private Uri i;
        private String j;

        a(Context context, Uri uri) {
            super(AbstractC3199q.e.HIGH);
            this.h = context;
            this.i = uri;
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            View view = SplitApkInstallerActivity.this.a;
            if (view != null) {
                view.setVisibility(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.AutoCloseable] */
        /* JADX WARN: Type inference failed for: r1v23 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.AutoCloseable] */
        /* JADX WARN: Type inference failed for: r2v9, types: [android.content.res.AssetFileDescriptor$AutoCloseInputStream, java.io.InputStream, java.lang.AutoCloseable] */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(String... strArr) {
            ?? r1;
            Exception e;
            FileOutputStream fileOutputStream;
            File m = ax.Z2.a.m(this.h, "apks-tmp");
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(this.i.hashCode()));
            ?? r2 = ".spliatapk";
            sb.append(".spliatapk");
            String sb2 = sb.toString();
            File file = new File(m, sb2);
            if (this.i != null) {
                AutoCloseable autoCloseable = null;
                try {
                    try {
                        r2 = new AssetFileDescriptor.AutoCloseInputStream(this.h.getApplicationContext().getContentResolver().openAssetFileDescriptor(this.i, "r"));
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Exception e2) {
                    r2 = 0;
                    e = e2;
                    fileOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    r1 = 0;
                    F.a(autoCloseable);
                    F.a(r1);
                    throw th;
                }
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        F.b(r2, fileOutputStream);
                        F.a(r2);
                        F.a(fileOutputStream);
                    } catch (Exception e3) {
                        e = e3;
                        if (j.o(this.h)) {
                            this.j = e.getMessage();
                        }
                        file.delete();
                        Boolean bool = Boolean.FALSE;
                        F.a(r2);
                        F.a(fileOutputStream);
                        return bool;
                    }
                } catch (Exception e4) {
                    fileOutputStream = null;
                    e = e4;
                } catch (Throwable th3) {
                    th = th3;
                    sb2 = null;
                    autoCloseable = r2;
                    r1 = sb2;
                    F.a(autoCloseable);
                    F.a(r1);
                    throw th;
                }
            }
            try {
                try {
                    return Boolean.valueOf(d.O(this.h, (AbstractC1823k) C1835x.f(file).z(file.getAbsolutePath())));
                } catch (SecurityException e5) {
                    if (e5.getMessage() != null && e5.getMessage().contains("FRP")) {
                        this.j = e5.getMessage();
                    }
                    return Boolean.FALSE;
                } catch (C1495j e6) {
                    if (e6 instanceof s) {
                        this.j = SplitApkInstallerActivity.this.getString(R.string.error_not_enough_storage);
                    }
                    return Boolean.FALSE;
                } finally {
                    file.delete();
                }
            } catch (C1495j e7) {
                if (j.o(this.h)) {
                    this.j = e7.getMessage();
                }
                return Boolean.FALSE;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            View view = SplitApkInstallerActivity.this.a;
            if (view != null) {
                view.setVisibility(8);
            }
            if (bool == null || !bool.booleanValue()) {
                if (this.j != null) {
                    Toast.makeText(this.h, this.h.getString(R.string.error) + ":" + this.j, 1).show();
                } else {
                    Toast.makeText(this.h, R.string.error, 1).show();
                }
            }
            SplitApkInstallerActivity.this.finish();
        }
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        ax.Q2.b.f(this, true);
        super.onCreate(bundle);
        setContentView(R.layout.activity_transparent_progress);
        this.a = findViewById(R.id.progress);
        Intent intent = getIntent();
        String action = intent.getAction();
        Uri data = intent.getData();
        if ("android.intent.action.VIEW".equals(action) && data != null) {
            new a(this, data).h(new String[0]);
        } else {
            Toast.makeText(this, R.string.error, 1).show();
            finish();
        }
    }
}
