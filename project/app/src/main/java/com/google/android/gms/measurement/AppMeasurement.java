/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import ax.M5.p;
import ax.b6.U0;
import ax.f6.n;
import ax.f6.y;
import com.google.android.gms.measurement.b;
import com.google.android.gms.measurement.internal.E2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
public class AppMeasurement {
    private static volatile AppMeasurement b;
    private final a a;

    private AppMeasurement(y y8) {
        this.a = new com.google.android.gms.measurement.a(y8);
    }

    private AppMeasurement(E2 e22) {
        this.a = new b(e22);
    }

    private static y a(Context object, Bundle bundle) {
        try {
            object = (y)FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, object, null);
            return object;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static AppMeasurement b(Context object, String object2, String string) {
        if (b != null) return b;
        synchronized (AppMeasurement.class) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            if (b != null) return b;
                            object2 = AppMeasurement.a(object, null);
                            if (object2 == null) break block3;
                            object = new AppMeasurement((y)object2);
                            b = object;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object2 = new U0(0L, 0L, true, null, null, null, null, null);
                    object = E2.c(object, (U0)object2, null);
                    b = object2 = new AppMeasurement((E2)object);
                }
                return b;
            }
            throw throwable2;
        }
    }

    @Deprecated
    @Keep
    public static AppMeasurement getInstance(Context context) {
        return AppMeasurement.b(context, null, null);
    }

    @Keep
    public void beginAdUnitExposure(String string) {
        this.a.a(string);
    }

    @Keep
    public void clearConditionalUserProperty(String string, String string2, Bundle bundle) {
        this.a.b(string, string2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String string) {
        this.a.l(string);
    }

    @Keep
    public long generateEventId() {
        return this.a.g();
    }

    @Keep
    public String getAppInstanceId() {
        return this.a.j();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String object, String iterator) {
        int n8 = (iterator = this.a.c((String)object, (String)((Object)iterator))) == null ? 0 : iterator.size();
        object = new ArrayList(n8);
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            ((ArrayList)object).add(new ConditionalUserProperty((Bundle)iterator.next()));
        }
        return object;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.a.i();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.a.d();
    }

    @Keep
    public String getGmpAppId() {
        return this.a.k();
    }

    @Keep
    public int getMaxUserProperties(String string) {
        return this.a.h(string);
    }

    @Keep
    protected Map<String, Object> getUserProperties(String string, String string2, boolean bl) {
        return this.a.e(string, string2, bl);
    }

    @Keep
    public void logEventInternal(String string, String string2, Bundle bundle) {
        this.a.f(string, string2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        p.l(conditionalUserProperty);
        a a8 = this.a;
        Bundle bundle = new Bundle();
        Object object = conditionalUserProperty.mAppId;
        if (object != null) {
            bundle.putString("app_id", (String)object);
        }
        if ((object = conditionalUserProperty.mOrigin) != null) {
            bundle.putString("origin", (String)object);
        }
        if ((object = conditionalUserProperty.mName) != null) {
            bundle.putString("name", (String)object);
        }
        if ((object = conditionalUserProperty.mValue) != null) {
            n.b(bundle, object);
        }
        if ((object = conditionalUserProperty.mTriggerEventName) != null) {
            bundle.putString("trigger_event_name", (String)object);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        object = conditionalUserProperty.mTimedOutEventName;
        if (object != null) {
            bundle.putString("timed_out_event_name", (String)object);
        }
        if ((object = conditionalUserProperty.mTimedOutEventParams) != null) {
            bundle.putBundle("timed_out_event_params", (Bundle)object);
        }
        if ((object = conditionalUserProperty.mTriggeredEventName) != null) {
            bundle.putString("triggered_event_name", (String)object);
        }
        if ((object = conditionalUserProperty.mTriggeredEventParams) != null) {
            bundle.putBundle("triggered_event_params", (Bundle)object);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        object = conditionalUserProperty.mExpiredEventName;
        if (object != null) {
            bundle.putString("expired_event_name", (String)object);
        }
        if ((object = conditionalUserProperty.mExpiredEventParams) != null) {
            bundle.putBundle("expired_event_params", (Bundle)object);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        a8.n(bundle);
    }

    public static class ConditionalUserProperty {
        @Keep
        public boolean mActive;
        @Keep
        public String mAppId;
        @Keep
        public long mCreationTimestamp;
        @Keep
        public String mExpiredEventName;
        @Keep
        public Bundle mExpiredEventParams;
        @Keep
        public String mName;
        @Keep
        public String mOrigin;
        @Keep
        public long mTimeToLive;
        @Keep
        public String mTimedOutEventName;
        @Keep
        public Bundle mTimedOutEventParams;
        @Keep
        public String mTriggerEventName;
        @Keep
        public long mTriggerTimeout;
        @Keep
        public String mTriggeredEventName;
        @Keep
        public Bundle mTriggeredEventParams;
        @Keep
        public long mTriggeredTimestamp;
        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            p.l(bundle);
            this.mAppId = n.a(bundle, "app_id", String.class, null);
            this.mOrigin = n.a(bundle, "origin", String.class, null);
            this.mName = n.a(bundle, "name", String.class, null);
            this.mValue = n.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = n.a(bundle, "trigger_event_name", String.class, null);
            Long l8 = 0L;
            this.mTriggerTimeout = n.a(bundle, "trigger_timeout", Long.class, l8);
            this.mTimedOutEventName = n.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = n.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = n.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = n.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = n.a(bundle, "time_to_live", Long.class, l8);
            this.mExpiredEventName = n.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = n.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = n.a(bundle, "active", Boolean.class, Boolean.FALSE);
            this.mCreationTimestamp = n.a(bundle, "creation_timestamp", Long.class, l8);
            this.mTriggeredTimestamp = n.a(bundle, "triggered_timestamp", Long.class, l8);
        }
    }

    private static abstract class a
    implements y {
        private a() {
        }

        /* synthetic */ a(ax.d6.a a8) {
            this();
        }
    }
}

