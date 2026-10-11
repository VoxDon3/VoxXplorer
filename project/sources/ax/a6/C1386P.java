package ax.a6;

import android.app.Activity;
import android.app.Application;
import android.content.ContextWrapper;
import android.content.Intent;

/* renamed from: ax.a6.P, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1386P extends ContextWrapper {
    private Activity a;

    public C1386P(Application application) {
        super(application);
    }

    public final void a(Activity activity) {
        this.a = activity;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Activity activity = this.a;
        return activity != null ? activity.getSystemService(str) : super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.a;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            super.startActivity(intent);
        }
    }
}
