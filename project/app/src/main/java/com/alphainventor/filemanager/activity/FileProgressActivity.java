/*
 * Decompiled with CFR 0.152.
 */
package com.alphainventor.filemanager.activity;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import ax.Ha.c;
import ax.R2.a;
import ax.T.b;
import ax.W2.j;
import ax.g3.d;
import ax.s3.u;
import ax.x3.s;
import com.alphainventor.filemanager.service.CommandService;

public class FileProgressActivity
extends ax.R2.c
implements a {
    private ListView a;
    private TextView b;
    private s c;
    private CommandService d;
    private long e;
    private boolean f;
    private ServiceConnection g = new ServiceConnection(this){
        final FileProgressActivity q;
        {
            this.q = fileProgressActivity;
        }

        public void onServiceConnected(ComponentName object, IBinder object2) {
            if (!(object2 instanceof CommandService.d)) {
                if (object2 == null) {
                    object = "service : null";
                } else {
                    object = new StringBuilder();
                    ((StringBuilder)object).append("service :");
                    ((StringBuilder)object).append(object2.getClass().getName());
                    object = ((StringBuilder)object).toString();
                }
                ax.Ha.c.h().f().b("INVALID SERVICE CLASS").g(object).h();
                Toast.makeText((Context)this.q, (int)2131951927, (int)1).show();
                this.q.finish();
                return;
            }
            object = (CommandService.d)((Object)object2);
            FileProgressActivity.H(this.q, ((CommandService.d)((Object)object)).a());
            this.q.d.J(this.q);
            this.q.R();
            object = this.q;
            object2 = this.q;
            FileProgressActivity.L((FileProgressActivity)object, new s((Context)object2, ((FileProgressActivity)object2).d.n()));
            this.q.a.setAdapter((ListAdapter)this.q.c);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            FileProgressActivity.H(this.q, null);
        }
    };

    static /* synthetic */ CommandService H(FileProgressActivity fileProgressActivity, CommandService commandService) {
        fileProgressActivity.d = commandService;
        return commandService;
    }

    static /* synthetic */ s L(FileProgressActivity fileProgressActivity, s s8) {
        fileProgressActivity.c = s8;
        return s8;
    }

    private void O() {
        this.f = true;
        this.bindService(CommandService.j((Context)this, false), this.g, 1);
    }

    private void R() {
        CommandService commandService = this.d;
        if (commandService != null) {
            commandService.G(this);
            u.j((Context)this).a(102);
        }
    }

    private void S() {
        TextView textView;
        this.a = (ListView)this.findViewById(2131362286);
        this.b = textView = (TextView)this.findViewById(2131362290);
        this.a.setEmptyView((View)textView);
        this.a.setOnItemClickListener((AdapterView.OnItemClickListener)new d(this){
            final FileProgressActivity c;
            {
                this.c = fileProgressActivity;
            }

            @Override
            public void a(AdapterView<?> adapterView, View view, int n8, long l8) {
                this.c.T(n8);
            }
        });
    }

    private void T(int n8) {
        Object object = this.d;
        if (object != null && n8 >= 0 && n8 < object.n().size()) {
            object = this.d.n().get(n8);
            this.d.I(this, (j)object, false);
        }
    }

    public void Q() {
        if (this.f) {
            this.f = false;
            CommandService commandService = this.d;
            if (commandService != null) {
                commandService.H(this);
                this.unbindService(this.g);
            }
        }
    }

    public void U() {
        this.runOnUiThread(new Runnable(this){
            final FileProgressActivity q;
            {
                this.q = fileProgressActivity;
            }

            @Override
            public void run() {
                if (this.q.c != null) {
                    this.q.c.notifyDataSetChanged();
                }
            }
        });
    }

    public void V(j j8, int n8, boolean bl) {
        long l8 = SystemClock.uptimeMillis();
        if (!bl && l8 - this.e <= 100L) {
            return;
        }
        this.e = l8;
        this.runOnUiThread(new Runnable(){
            final j c0;
            final FileProgressActivity d0;
            final int q;
            {
                this.d0 = fileProgressActivity;
                this.q = n8;
                this.c0 = j8;
            }

            @Override
            public void run() {
                View view = this.d0.a.getChildAt(this.q - this.d0.a.getFirstVisiblePosition());
                if (view != null) {
                    ((s.a)view.getTag()).a(this.c0, this.q);
                }
            }
        });
    }

    @Override
    public boolean isContentClipToPadding(boolean bl) {
        return false;
    }

    @Override
    public boolean n() {
        return this.getSupportFragmentManager().Q0();
    }

    @Override
    public void onApplyWindowsInsets(b b8, boolean bl) {
        if (!bl) {
            this.a.setClipToPadding(false);
            ListView listView = this.a;
            listView.setPadding(listView.getPaddingLeft(), this.a.getPaddingTop(), this.a.getPaddingRight(), b8.d);
        }
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131558430);
        this.getWindow().addFlags(128);
        this.S();
        this.onSetContentView(true);
        this.O();
    }

    @Override
    protected void onDestroy() {
        this.Q();
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.R();
    }

    @Override
    public ax.n.c s() {
        return this;
    }
}

