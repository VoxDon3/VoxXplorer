/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import ax.W2.c;
import ax.W2.g;
import ax.X2.Q;
import ax.c3.u;
import ax.u3.q;
import java.util.List;
import java.util.logging.Logger;

public class SaveToActivity
extends ax.n.c {
    private static final Logger b = ax.Q2.g.a(SaveToActivity.class);
    View a;

    private Uri F() {
        return ax.R2.g.a(this);
    }

    @Override
    protected void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        Intent intent = this.getIntent();
        object = intent.getAction();
        if (!"android.intent.action.SEND".equals(object) && !"android.intent.action.SEND_MULTIPLE".equals(object)) {
            this.finish();
            return;
        }
        this.setContentView(2131558439);
        this.a = this.findViewById(2131362712);
        object = Q.y1() ? this.F() : null;
        new a(this, (Context)this, intent, (Uri)object).i(new Void[0]);
    }

    private class a
    extends q<Void, Void, Boolean> {
        Intent h;
        Context i;
        Uri j;
        final SaveToActivity k;

        a(SaveToActivity saveToActivity, Context context, Intent intent, Uri uri) {
            this.k = saveToActivity;
            super(q.e.d0);
            this.i = context;
            this.h = intent;
            this.j = uri;
        }

        @Override
        protected void r() {
            View view = this.k.a;
            if (view != null) {
                view.setVisibility(0);
            }
        }

        protected Boolean w(Void ... object) {
            object = g.b((Context)this.k, this.h, this.j);
            if (object.size() > 0) {
                c.q().n((List<g>)object);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }

        protected void x(Boolean bl) {
            View view = this.k.a;
            if (view != null) {
                view.setVisibility(8);
            }
            if (bl != null) {
                if (!bl.booleanValue()) {
                    Toast.makeText((Context)this.i, (int)2131951934, (int)1).show();
                } else {
                    u.c0(this.i);
                }
            }
            this.k.finish();
        }
    }
}

