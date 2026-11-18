package com.voxdon.xplorer.activity;

import android.content.ComponentName;
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
import ax.W2.j;
import ax.n.ActivityC2561c;
import ax.s3.u;
import ax.x3.s;
import com.voxdon.xplorer.service.CommandService;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class FileProgressActivity extends ax.R2.c implements ax.R2.a {
    private ListView a;
    private TextView b;
    private s c;
    private CommandService d;
    private long e;
    private boolean f;
    private ServiceConnection g = new a();

    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String str;
            if (iBinder instanceof CommandService.d) {
                FileProgressActivity.this.d = ((CommandService.d) iBinder).a();
                FileProgressActivity.this.d.J(FileProgressActivity.this);
                FileProgressActivity.this.R();
                FileProgressActivity fileProgressActivity = FileProgressActivity.this;
                FileProgressActivity fileProgressActivity2 = FileProgressActivity.this;
                fileProgressActivity.c = new s(fileProgressActivity2, fileProgressActivity2.d.n());
                FileProgressActivity.this.a.setAdapter((ListAdapter) FileProgressActivity.this.c);
                return;
            }
            if (iBinder == null) {
                str = "service : null";
            } else {
                str = "service :" + iBinder.getClass().getName();
            }
            ax.Ha.c.h().f().b("INVALID SERVICE CLASS").g(str).h();
            Toast.makeText(FileProgressActivity.this, R.string.error, 1).show();
            FileProgressActivity.this.finish();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            FileProgressActivity.this.d = null;
        }
    }

    class b extends ax.g3.d {
        b() {
        }

        @Override // ax.g3.d
        public void a(AdapterView<?> adapterView, View view, int i, long j) {
            FileProgressActivity.this.T(i);
        }
    }

    class c implements Runnable {
        final /* synthetic */ j c0;
        final /* synthetic */ int q;

        c(int i, j jVar) {
            this.q = i;
            this.c0 = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            View childAt = FileProgressActivity.this.a.getChildAt(this.q - FileProgressActivity.this.a.getFirstVisiblePosition());
            if (childAt != null) {
                ((s.a) childAt.getTag()).a(this.c0, this.q);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (FileProgressActivity.this.c != null) {
                FileProgressActivity.this.c.notifyDataSetChanged();
            }
        }
    }

    private void O() {
        this.f = true;
        bindService(CommandService.j(this, false), this.g, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        CommandService commandService = this.d;
        if (commandService != null) {
            commandService.G(this);
            u.j(this).a(102);
        }
    }

    private void S() {
        this.a = (ListView) findViewById(R.id.file_progress_lv_list);
        TextView textView = (TextView) findViewById(R.id.file_progress_tv_empty);
        this.b = textView;
        this.a.setEmptyView(textView);
        this.a.setOnItemClickListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(int i) {
        CommandService commandService = this.d;
        if (commandService != null && i >= 0 && i < commandService.n().size()) {
            this.d.I(this, this.d.n().get(i), false);
        }
    }

    public void Q() {
        if (this.f) {
            this.f = false;
            CommandService commandService = this.d;
            if (commandService != null) {
                commandService.H(this);
                unbindService(this.g);
            }
        }
    }

    public void U() {
        runOnUiThread(new d());
    }

    public void V(j jVar, int i, boolean z) {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (z || uptimeMillis - this.e > 100) {
            this.e = uptimeMillis;
            runOnUiThread(new c(i, jVar));
        }
    }

    @Override // ax.d3.x0.a
    public boolean isContentClipToPadding(boolean z) {
        return false;
    }

    @Override // ax.R2.a
    public boolean n() {
        return getSupportFragmentManager().Q0();
    }

    @Override // ax.d3.Y
    public void onApplyWindowsInsets(ax.T.b bVar, boolean z) {
        if (z) {
            return;
        }
        this.a.setClipToPadding(false);
        ListView listView = this.a;
        listView.setPadding(listView.getPaddingLeft(), this.a.getPaddingTop(), this.a.getPaddingRight(), bVar.d);
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_file_progress);
        getWindow().addFlags(128);
        S();
        onSetContentView(true);
        O();
    }

    @Override // ax.n.ActivityC2561c, androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        Q();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onResume() {
        super.onResume();
        R();
    }

    @Override // ax.R2.a
    public ActivityC2561c s() {
        return this;
    }
}
