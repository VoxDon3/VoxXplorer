/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.oss;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.fragment.app.e;
import ax.Q2.h;
import ax.a3.I;
import ax.c3.u;
import ax.k3.a;
import ax.u3.B;
import java.util.List;

public class OssLicenseActivity
extends ax.R2.c {
    private ListView a;

    private void H() {
        Object object;
        this.a = object = (ListView)this.findViewById(2131362452);
        object.setOnItemClickListener(new AdapterView.OnItemClickListener(this){
            final OssLicenseActivity a;
            {
                this.a = ossLicenseActivity;
            }

            public void onItemClick(AdapterView<?> object, View view, int n8, long l8) {
                object = (a)object.getAdapter().getItem(n8);
                this.a.I(object);
            }
        });
        object = new c((Context)this, h.a());
        this.a.setAdapter((ListAdapter)object);
    }

    private void I(a object) {
        object = b.j3((a)object);
        B.d0(this.getSupportFragmentManager(), (e)object, "OSS", true);
    }

    @Override
    public boolean isContentClipToPadding(boolean bl) {
        return false;
    }

    @Override
    public void onApplyWindowsInsets(ax.T.b b8, boolean bl) {
        if (!bl) {
            this.a.setClipToPadding(false);
            this.a.setPadding(0, 0, 0, b8.d);
        }
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131558433);
        this.setTitle(2131952467);
        this.H();
        this.onSetContentView(true);
    }

    public static class b
    extends I {
        private String t0;
        private String u0;

        static b j3(a a8) {
            b b8 = new b();
            Bundle bundle = new Bundle();
            bundle.putString("PROJECT", a8.q);
            bundle.putString("URL", a8.c0);
            b8.v2(bundle);
            return b8;
        }

        @Override
        public void f3() {
            super.f3();
            Bundle bundle = this.j0();
            if (bundle != null) {
                this.t0 = bundle.getString("URL");
                this.u0 = bundle.getString("PROJECT");
            }
        }

        @Override
        public Dialog g3() {
            LayoutInflater layoutInflater = LayoutInflater.from((Context)this.b());
            a.a a8 = new a.a(this.b());
            View view = layoutInflater.inflate(2131558514, null, false);
            layoutInflater = (TextView)view.findViewById(2131362944);
            layoutInflater.setOnClickListener(new View.OnClickListener(this){
                final b a;
                {
                    this.a = b8;
                }

                public void onClick(View view) {
                    if (this.a.b() != null) {
                        try {
                            view = new Intent("android.intent.action.VIEW");
                            view.setData(Uri.parse((String)this.a.t0));
                            u.p0(this.a, (Intent)view);
                            return;
                        }
                        catch (ActivityNotFoundException | SecurityException throwable) {
                            Toast.makeText((Context)this.a.b(), (int)2131951927, (int)1).show();
                        }
                    }
                }
            });
            a8.setTitle(this.u0);
            SpannableString spannableString = new SpannableString((CharSequence)this.t0);
            Linkify.addLinks((Spannable)spannableString, (int)1);
            layoutInflater.setText((CharSequence)spannableString);
            a8.setView(view);
            a8.b(true);
            a8.setPositiveButton(17039370, new DialogInterface.OnClickListener(this){
                final b a;
                {
                    this.a = b8;
                }

                public void onClick(DialogInterface dialogInterface, int n8) {
                }
            });
            return a8.create();
        }
    }

    private static class c
    extends ArrayAdapter<a> {
        c(Context context, List<a> list) {
            super(context, 0, list);
        }

        public View getView(int n8, View view, ViewGroup viewGroup) {
            view = LayoutInflater.from((Context)this.getContext()).inflate(2131558574, null, false);
            ((TextView)view.findViewById(2131362445)).setText((CharSequence)((a)this.getItem((int)n8)).q);
            return view;
        }
    }
}

