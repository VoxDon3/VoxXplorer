package com.voxdon.xplorer.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import ax.W2.h;
import ax.a3.C1355k;
import ax.n.ActivityC2561c;
import ax.s3.u;
import ax.u3.C3180B;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class ResultActivity extends ActivityC2561c implements DialogInterface.OnDismissListener {
    public static String a = "COMMAND_RESULT";
    public static String b = "MESSAGE";
    public static String c = "SUB_MESSAGE";
    public static String d = "RESULT_INFO";

    private void F(Intent intent) {
        if (!"com.filemanager.BRING_TO_FRONT".equals(intent.getAction()) && ((h.b) intent.getSerializableExtra(a)) == h.b.FAILURE) {
            C3180B.d0(getSupportFragmentManager(), C1355k.i3(R.string.dialog_title_failure, intent.getStringExtra(b), intent.getStringExtra(c), intent.getStringArrayListExtra(d)), "result", false);
        }
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (getIntent() == null) {
            finish();
        } else if (((h.b) intent.getSerializableExtra(a)) != h.b.FAILURE) {
            finish();
        } else {
            F(intent);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        F(intent);
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onResume() {
        super.onResume();
        u.j(this).a(104);
    }
}
