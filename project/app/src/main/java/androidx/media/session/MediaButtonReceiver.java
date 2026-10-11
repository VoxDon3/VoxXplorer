/*
 * Decompiled with CFR 0.152.
 */
package androidx.media.session;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import ax.O0.c;

public class MediaButtonReceiver
extends BroadcastReceiver {
    public static ComponentName a(Context object) {
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(object.getPackageName());
        object = object.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (object.size() == 1) {
            object = ((ResolveInfo)object.get((int)0)).activityInfo;
            return new ComponentName(((ActivityInfo)object).packageName, ((ActivityInfo)object).name);
        }
        if (object.size() > 1) {
            Log.w((String)"MediaButtonReceiver", (String)"More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
        }
        return null;
    }

    private static ComponentName b(Context object, String string) {
        Object object2 = object.getPackageManager();
        Intent intent = new Intent(string);
        intent.setPackage(object.getPackageName());
        object = object2.queryIntentServices(intent, 0);
        if (object.size() == 1) {
            object = ((ResolveInfo)object.get((int)0)).serviceInfo;
            return new ComponentName(((ServiceInfo)object).packageName, ((ServiceInfo)object).name);
        }
        if (object.isEmpty()) {
            return null;
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Expected 1 service that handles ");
        ((StringBuilder)object2).append(string);
        ((StringBuilder)object2).append(", found ");
        ((StringBuilder)object2).append(object.size());
        throw new IllegalStateException(((StringBuilder)object2).toString());
    }

    public static KeyEvent c(MediaSessionCompat mediaSessionCompat, Intent intent) {
        if (mediaSessionCompat != null && intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            intent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            mediaSessionCompat.b().a((KeyEvent)intent);
            return intent;
        }
        return null;
    }

    protected void d(Intent object, ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
        object = new StringBuilder();
        ((StringBuilder)object).append("caught exception when trying to start a foreground service from the background: ");
        ((StringBuilder)object).append(ax.O0.a.a(foregroundServiceStartNotAllowedException));
        Log.e((String)"MediaButtonReceiver", (String)((StringBuilder)object).toString());
    }

    public void onReceive(Context object, Intent object2) {
        if (object2 != null && "android.intent.action.MEDIA_BUTTON".equals(object2.getAction()) && object2.hasExtra("android.intent.extra.KEY_EVENT")) {
            ComponentName componentName = MediaButtonReceiver.b((Context)object, "android.intent.action.MEDIA_BUTTON");
            if (componentName != null) {
                object2.setComponent(componentName);
                try {
                    ax.Q.b.m((Context)object, (Intent)object2);
                    return;
                }
                catch (IllegalStateException illegalStateException) {
                    if (Build.VERSION.SDK_INT >= 31 && a.b(illegalStateException)) {
                        this.d((Intent)object2, a.a(illegalStateException));
                        return;
                    }
                    throw illegalStateException;
                }
            }
            componentName = MediaButtonReceiver.b((Context)object, "android.media.browse.MediaBrowserService");
            if (componentName != null) {
                BroadcastReceiver.PendingResult pendingResult = this.goAsync();
                object = object.getApplicationContext();
                object2 = new b((Context)object, (Intent)object2, pendingResult);
                object = new MediaBrowserCompat((Context)object, componentName, (MediaBrowserCompat.c)object2, null);
                ((b)object2).f((MediaBrowserCompat)object);
                ((MediaBrowserCompat)object).a();
                return;
            }
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Ignore unsupported intent: ");
        ((StringBuilder)object).append(object2);
        Log.d((String)"MediaButtonReceiver", (String)((StringBuilder)object).toString());
    }

    private static final class a {
        public static ForegroundServiceStartNotAllowedException a(IllegalStateException illegalStateException) {
            return ax.O0.b.a(illegalStateException);
        }

        public static boolean b(IllegalStateException illegalStateException) {
            return c.a(illegalStateException);
        }
    }

    private static class b
    extends MediaBrowserCompat.c {
        private final Context c;
        private final Intent d;
        private final BroadcastReceiver.PendingResult e;
        private MediaBrowserCompat f;

        b(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.c = context;
            this.d = intent;
            this.e = pendingResult;
        }

        private void e() {
            this.f.b();
            this.e.finish();
        }

        @Override
        public void a() {
            new MediaControllerCompat(this.c, this.f.c()).a((KeyEvent)this.d.getParcelableExtra("android.intent.extra.KEY_EVENT"));
            this.e();
        }

        @Override
        public void b() {
            this.e();
        }

        @Override
        public void c() {
            this.e();
        }

        void f(MediaBrowserCompat mediaBrowserCompat) {
            this.f = mediaBrowserCompat;
        }
    }
}

