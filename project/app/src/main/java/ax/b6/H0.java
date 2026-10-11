/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import ax.T5.a;
import ax.b6.M0;
import ax.b6.N0;
import ax.b6.S0;
import ax.b6.U0;
import java.util.Map;

public interface H0
extends IInterface {
    public void beginAdUnitExposure(String var1, long var2) throws RemoteException;

    public void clearConditionalUserProperty(String var1, String var2, Bundle var3) throws RemoteException;

    public void clearMeasurementEnabled(long var1) throws RemoteException;

    public void endAdUnitExposure(String var1, long var2) throws RemoteException;

    public void generateEventId(M0 var1) throws RemoteException;

    public void getAppInstanceId(M0 var1) throws RemoteException;

    public void getCachedAppInstanceId(M0 var1) throws RemoteException;

    public void getConditionalUserProperties(String var1, String var2, M0 var3) throws RemoteException;

    public void getCurrentScreenClass(M0 var1) throws RemoteException;

    public void getCurrentScreenName(M0 var1) throws RemoteException;

    public void getGmpAppId(M0 var1) throws RemoteException;

    public void getMaxUserProperties(String var1, M0 var2) throws RemoteException;

    public void getSessionId(M0 var1) throws RemoteException;

    public void getTestFlag(M0 var1, int var2) throws RemoteException;

    public void getUserProperties(String var1, String var2, boolean var3, M0 var4) throws RemoteException;

    public void initForTests(Map var1) throws RemoteException;

    public void initialize(a var1, U0 var2, long var3) throws RemoteException;

    public void isDataCollectionEnabled(M0 var1) throws RemoteException;

    public void logEvent(String var1, String var2, Bundle var3, boolean var4, boolean var5, long var6) throws RemoteException;

    public void logEventAndBundle(String var1, String var2, Bundle var3, M0 var4, long var5) throws RemoteException;

    public void logHealthData(int var1, String var2, a var3, a var4, a var5) throws RemoteException;

    public void onActivityCreated(a var1, Bundle var2, long var3) throws RemoteException;

    public void onActivityDestroyed(a var1, long var2) throws RemoteException;

    public void onActivityPaused(a var1, long var2) throws RemoteException;

    public void onActivityResumed(a var1, long var2) throws RemoteException;

    public void onActivitySaveInstanceState(a var1, M0 var2, long var3) throws RemoteException;

    public void onActivityStarted(a var1, long var2) throws RemoteException;

    public void onActivityStopped(a var1, long var2) throws RemoteException;

    public void performAction(Bundle var1, M0 var2, long var3) throws RemoteException;

    public void registerOnMeasurementEventListener(N0 var1) throws RemoteException;

    public void resetAnalyticsData(long var1) throws RemoteException;

    public void setConditionalUserProperty(Bundle var1, long var2) throws RemoteException;

    public void setConsent(Bundle var1, long var2) throws RemoteException;

    public void setConsentThirdParty(Bundle var1, long var2) throws RemoteException;

    public void setCurrentScreen(a var1, String var2, String var3, long var4) throws RemoteException;

    public void setDataCollectionEnabled(boolean var1) throws RemoteException;

    public void setDefaultEventParameters(Bundle var1) throws RemoteException;

    public void setEventInterceptor(N0 var1) throws RemoteException;

    public void setInstanceIdProvider(S0 var1) throws RemoteException;

    public void setMeasurementEnabled(boolean var1, long var2) throws RemoteException;

    public void setMinimumSessionDuration(long var1) throws RemoteException;

    public void setSessionTimeoutDuration(long var1) throws RemoteException;

    public void setSgtmDebugInfo(Intent var1) throws RemoteException;

    public void setUserId(String var1, long var2) throws RemoteException;

    public void setUserProperty(String var1, String var2, a var3, boolean var4, long var5) throws RemoteException;

    public void unregisterOnMeasurementEventListener(N0 var1) throws RemoteException;
}

