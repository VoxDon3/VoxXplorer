package ax.b6;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes3.dex */
public interface H0 extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(M0 m0) throws RemoteException;

    void getAppInstanceId(M0 m0) throws RemoteException;

    void getCachedAppInstanceId(M0 m0) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, M0 m0) throws RemoteException;

    void getCurrentScreenClass(M0 m0) throws RemoteException;

    void getCurrentScreenName(M0 m0) throws RemoteException;

    void getGmpAppId(M0 m0) throws RemoteException;

    void getMaxUserProperties(String str, M0 m0) throws RemoteException;

    void getSessionId(M0 m0) throws RemoteException;

    void getTestFlag(M0 m0, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, M0 m0) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(ax.T5.a aVar, U0 u0, long j) throws RemoteException;

    void isDataCollectionEnabled(M0 m0) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, M0 m0, long j) throws RemoteException;

    void logHealthData(int i, String str, ax.T5.a aVar, ax.T5.a aVar2, ax.T5.a aVar3) throws RemoteException;

    void onActivityCreated(ax.T5.a aVar, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(ax.T5.a aVar, long j) throws RemoteException;

    void onActivityPaused(ax.T5.a aVar, long j) throws RemoteException;

    void onActivityResumed(ax.T5.a aVar, long j) throws RemoteException;

    void onActivitySaveInstanceState(ax.T5.a aVar, M0 m0, long j) throws RemoteException;

    void onActivityStarted(ax.T5.a aVar, long j) throws RemoteException;

    void onActivityStopped(ax.T5.a aVar, long j) throws RemoteException;

    void performAction(Bundle bundle, M0 m0, long j) throws RemoteException;

    void registerOnMeasurementEventListener(N0 n0) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setConsent(Bundle bundle, long j) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(ax.T5.a aVar, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(N0 n0) throws RemoteException;

    void setInstanceIdProvider(S0 s0) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setSgtmDebugInfo(Intent intent) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, ax.T5.a aVar, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(N0 n0) throws RemoteException;
}
