package com.voxdon.xplorer.activity;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import ax.b3.C1495j;
import ax.c3.C1809B;
import ax.c3.C1820h;
import ax.c3.C1832u;
import ax.c3.C1834w;
import ax.c3.C1835x;
import ax.c3.EnumC1837z;
import ax.c3.W;
import ax.n.ActivityC2561c;
import ax.u3.C3184b;
import com.voxdon.xplorer.file.C3605y;
import com.voxdon.xplorer.R;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public class LaunchActivity extends ActivityC2561c {
    private View a;

    class a implements C1820h.a {
        final /* synthetic */ EnumC1837z a;
        final /* synthetic */ String b;

        a(EnumC1837z enumC1837z, String str) {
            this.a = enumC1837z;
            this.b = str;
        }

        @Override // ax.c3.C1820h.a
        public void a(Throwable th) {
            LaunchActivity.this.a.setVisibility(8);
            if (th != null) {
                th.printStackTrace();
            }
            if (th instanceof FileNotFoundException) {
                Toast.makeText(LaunchActivity.this, R.string.requested_file_not_found, 1).show();
            } else {
                Toast.makeText(LaunchActivity.this, R.string.error_file_load, 1).show();
            }
            LaunchActivity.this.finish();
        }

        @Override // ax.c3.C1820h.a
        public void b(File file) {
            LaunchActivity.this.a.setVisibility(8);
            try {
                String absolutePath = file.getAbsolutePath();
                EnumC1837z enumC1837z = this.a;
                if (enumC1837z == EnumC1837z.IMAGE) {
                    Intent d = C1834w.d(LaunchActivity.this, C3605y.I0(absolutePath), false);
                    d.putExtra("extra_temp_file_path", absolutePath);
                    d.putExtra("extra_temp_file_type", this.b);
                    LaunchActivity.this.startActivity(d);
                } else if (enumC1837z == EnumC1837z.AUDIO) {
                    C1832u.f0(LaunchActivity.this, absolutePath, this.b);
                } else if (enumC1837z == EnumC1837z.PLAIN_TEXT) {
                    LaunchActivity.this.startActivity(C1834w.h(LaunchActivity.this, absolutePath));
                } else {
                    C3184b.f();
                }
            } catch (C1495j unused) {
                Toast.makeText(LaunchActivity.this, R.string.error_file_load, 1).show();
            }
            LaunchActivity.this.finish();
        }
    }

    private void H(Uri uri, String str, EnumC1837z enumC1837z) throws FileNotFoundException {
        L();
        I(getContentResolver().openAssetFileDescriptor(uri, "r"), C1809B.x(this, uri, null), str, enumC1837z);
    }

    private void I(AssetFileDescriptor assetFileDescriptor, W w, String str, EnumC1837z enumC1837z) {
        this.a.setVisibility(0);
        new C1820h(this, assetFileDescriptor, w, enumC1837z, new a(enumC1837z, str)).i(new Void[0]);
    }

    private void J(String str) {
        C1832u.d0(this, Uri.parse(C1809B.U(C1835x.g(str).T(), str)));
    }

    private void L() {
        setContentView(R.layout.activity_transparent_progress);
        this.a = findViewById(R.id.progress);
    }

    private void M(Intent intent) {
        Intent F = C1832u.F(this, intent.getAction(), intent.getData(), intent.getType());
        F.putExtras(intent);
        startActivity(F);
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c8, code lost:
    
        if (r2 != null) goto L86;
     */
    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.activity.LaunchActivity.onCreate(android.os.Bundle):void");
    }
}
