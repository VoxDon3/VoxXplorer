package com.voxdon.xplorer.oss;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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
import ax.Q2.h;
import ax.a3.I;
import ax.c3.C1832u;
import ax.k3.C2396a;
import ax.u3.C3180B;
import com.voxdon.xplorer.R;
import java.util.List;

/* loaded from: classes.dex */
public class OssLicenseActivity extends ax.R2.c {
    private ListView a;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.Adapter] */
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            OssLicenseActivity.this.I((C2396a) adapterView.getAdapter().getItem(i));
        }
    }

    public static class b extends I {
        private String t0;
        private String u0;

        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (b.this.b() == null) {
                    return;
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(b.this.t0));
                    C1832u.p0(b.this, intent);
                } catch (ActivityNotFoundException | SecurityException unused) {
                    Toast.makeText(b.this.b(), R.string.error, 1).show();
                }
            }
        }

        /* renamed from: com.voxdon.xplorer.oss.OssLicenseActivity$b$b, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC0524b implements DialogInterface.OnClickListener {
            DialogInterfaceOnClickListenerC0524b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        static b j3(C2396a c2396a) {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putString("PROJECT", c2396a.q);
            bundle.putString("URL", c2396a.c0);
            bVar.v2(bundle);
            return bVar;
        }

        @Override // ax.a3.I
        public void f3() {
            super.f3();
            Bundle j0 = j0();
            if (j0 != null) {
                this.t0 = j0.getString("URL");
                this.u0 = j0.getString("PROJECT");
            }
        }

        @Override // ax.a3.I
        public Dialog g3() {
            LayoutInflater from = LayoutInflater.from(b());
            a.C0006a c0006a = new a.C0006a(b());
            View inflate = from.inflate(R.layout.dialog_oss_project, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(R.id.text);
            textView.setOnClickListener(new a());
            c0006a.setTitle(this.u0);
            SpannableString spannableString = new SpannableString(this.t0);
            Linkify.addLinks(spannableString, 1);
            textView.setText(spannableString);
            c0006a.setView(inflate);
            c0006a.b(true);
            c0006a.setPositiveButton(android.R.string.ok, new DialogInterfaceOnClickListenerC0524b());
            return c0006a.create();
        }
    }

    private static class c extends ArrayAdapter<C2396a> {
        c(Context context, List<C2396a> list) {
            super(context, 0, list);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.item_oss_license, (ViewGroup) null, false);
            ((TextView) inflate.findViewById(R.id.license)).setText(((C2396a) getItem(i)).q);
            return inflate;
        }
    }

    private void H() {
        ListView listView = (ListView) findViewById(R.id.list);
        this.a = listView;
        listView.setOnItemClickListener(new a());
        this.a.setAdapter((ListAdapter) new c(this, h.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(C2396a c2396a) {
        C3180B.d0(getSupportFragmentManager(), b.j3(c2396a), "OSS", true);
    }

    @Override // ax.d3.x0.a
    public boolean isContentClipToPadding(boolean z) {
        return false;
    }

    @Override // ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
        if (z) {
            return;
        }
        this.a.setClipToPadding(false);
        this.a.setPadding(0, 0, 0, bVar.d);
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_oss_license);
        setTitle(R.string.open_source_licenses);
        H();
        onSetContentView(true);
    }
}
