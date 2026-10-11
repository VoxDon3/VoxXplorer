package com.voxdon.xplorer.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import ax.Q2.g;
import ax.W2.C1011c;
import ax.X2.Q;
import ax.c3.C1832u;
import ax.n.ActivityC2561c;
import ax.u3.AbstractC3199q;
import com.voxdon.xplorer.R;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class SaveToActivity extends ActivityC2561c {
    private static final Logger b = g.a(SaveToActivity.class);
    View a;

    private class a extends AbstractC3199q<Void, Void, Boolean> {
        Intent h;
        Context i;
        Uri j;

        a(Context context, Intent intent, Uri uri) {
            super(AbstractC3199q.e.HIGHER);
            this.i = context;
            this.h = intent;
            this.j = uri;
        }

        @Override // ax.u3.AbstractC3199q
        protected void r() {
            View view = SaveToActivity.this.a;
            if (view != null) {
                view.setVisibility(0);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public Boolean g(Void... voidArr) {
            List<ax.W2.g> b = ax.W2.g.b(SaveToActivity.this, this.h, this.j);
            if (b.size() <= 0) {
                return Boolean.FALSE;
            }
            C1011c.q().n(b);
            return Boolean.TRUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.AbstractC3199q
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public void q(Boolean bool) {
            View view = SaveToActivity.this.a;
            if (view != null) {
                view.setVisibility(8);
            }
            if (bool != null) {
                if (bool.booleanValue()) {
                    C1832u.c0(this.i);
                } else {
                    Toast.makeText(this.i, R.string.error_file_load, 1).show();
                }
            }
            SaveToActivity.this.finish();
        }
    }

    private Uri F() {
        Uri referrer;
        referrer = getReferrer();
        return referrer;
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (!"android.intent.action.SEND".equals(action) && !"android.intent.action.SEND_MULTIPLE".equals(action)) {
            finish();
            return;
        }
        setContentView(R.layout.activity_transparent_progress);
        this.a = findViewById(R.id.progress);
        new a(this, intent, Q.y1() ? F() : null).i(new Void[0]);
    }
}
