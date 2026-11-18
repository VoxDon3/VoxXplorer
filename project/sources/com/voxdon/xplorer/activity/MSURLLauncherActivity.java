package com.voxdon.xplorer.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import ax.c3.C1832u;
import ax.c3.F;
import ax.n.ActivityC2561c;
import ax.t3.j;
import ax.u3.AbstractC3199q;
import com.voxdon.xplorer.R;
import java.util.Scanner;

/* loaded from: classes.dex */
public class MSURLLauncherActivity extends ActivityC2561c {
    View a;

    class a extends AbstractC3199q<String, Void, String> {
        private Context h;
        private Uri i;
        private String j;

        a(Context context, Uri uri) {
            super(AbstractC3199q.e.HIGH);
            this.h = context;
            this.i = uri;
        }

        private String y(String str) {
            String str2 = null;
            if (str == null) {
                return null;
            }
            Scanner scanner = new Scanner(str);
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                if (nextLine != null && !nextLine.startsWith("InternetShortcut") && nextLine.startsWith("URL=")) {
                    str2 = nextLine.substring(4);
                }
            }
            scanner.close();
            return str2;
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            View view = MSURLLauncherActivity.this.a;
            if (view != null) {
                view.setVisibility(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public String g(String... strArr) {
            AssetFileDescriptor.AutoCloseInputStream autoCloseInputStream;
            String j;
            AssetFileDescriptor.AutoCloseInputStream autoCloseInputStream2 = null;
            if (this.i != null) {
                try {
                    autoCloseInputStream = new AssetFileDescriptor.AutoCloseInputStream(this.h.getApplicationContext().getContentResolver().openAssetFileDescriptor(this.i, "r"));
                    try {
                        try {
                            j = F.j(autoCloseInputStream, 256, 10240L);
                            F.a(autoCloseInputStream);
                        } catch (Exception e) {
                            e = e;
                            if (j.o(this.h)) {
                                this.j = e.getMessage();
                            }
                            F.a(autoCloseInputStream);
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        autoCloseInputStream2 = autoCloseInputStream;
                        F.a(autoCloseInputStream2);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    autoCloseInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    F.a(autoCloseInputStream2);
                    throw th;
                }
            } else {
                j = null;
            }
            if (j != null) {
                return y(j);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(String str) {
            View view = MSURLLauncherActivity.this.a;
            if (view != null) {
                view.setVisibility(8);
            }
            if (str != null) {
                try {
                    C1832u.o0(MSURLLauncherActivity.this, C1832u.n(Uri.parse(str), null, true, false));
                } catch (Exception unused) {
                    Toast.makeText(this.h, R.string.error, 1).show();
                }
            } else if (this.j != null) {
                Toast.makeText(this.h, this.h.getString(R.string.error_file_load) + ":" + this.j, 1).show();
            } else {
                Toast.makeText(this.h, R.string.error_file_load, 1).show();
            }
            MSURLLauncherActivity.this.finish();
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
