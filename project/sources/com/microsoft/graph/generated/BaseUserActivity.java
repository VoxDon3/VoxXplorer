package com.microsoft.graph.generated;

import ax.N9.a1;
import ax.T9.d;
import ax.T9.e;
import ax.r8.AbstractC3000i;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.ActivityHistoryItem;
import com.microsoft.graph.extensions.ActivityHistoryItemCollectionPage;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.VisualInfo;
import java.util.Arrays;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class BaseUserActivity extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("visualElements")
    public VisualInfo f;

    @InterfaceC3059a
    @InterfaceC3061c("activitySourceHost")
    public String g;

    @InterfaceC3059a
    @InterfaceC3061c("activationUrl")
    public String h;

    @InterfaceC3059a
    @InterfaceC3061c("appActivityId")
    public String i;

    @InterfaceC3059a
    @InterfaceC3061c("appDisplayName")
    public String j;

    @InterfaceC3059a
    @InterfaceC3061c("contentUrl")
    public String k;

    @InterfaceC3059a
    @InterfaceC3061c("createdDateTime")
    public Calendar l;

    @InterfaceC3059a
    @InterfaceC3061c("expirationDateTime")
    public Calendar m;

    @InterfaceC3059a
    @InterfaceC3061c("fallbackUrl")
    public String n;

    @InterfaceC3059a
    @InterfaceC3061c("lastModifiedDateTime")
    public Calendar o;

    @InterfaceC3059a
    @InterfaceC3061c("userTimezone")
    public String p;

    @InterfaceC3059a
    @InterfaceC3061c("contentInfo")
    public AbstractC3000i q;

    @InterfaceC3059a
    @InterfaceC3061c("status")
    public a1 r;
    public transient ActivityHistoryItemCollectionPage s;
    private transient C3003l t;
    private transient e u;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.u = eVar;
        this.t = c3003l;
        if (c3003l.x("historyItems")) {
            BaseActivityHistoryItemCollectionResponse baseActivityHistoryItemCollectionResponse = new BaseActivityHistoryItemCollectionResponse();
            if (c3003l.x("historyItems@odata.nextLink")) {
                baseActivityHistoryItemCollectionResponse.b = c3003l.t("historyItems@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("historyItems").toString(), C3003l[].class);
            ActivityHistoryItem[] activityHistoryItemArr = new ActivityHistoryItem[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                ActivityHistoryItem activityHistoryItem = (ActivityHistoryItem) eVar.b(c3003lArr[i].toString(), ActivityHistoryItem.class);
                activityHistoryItemArr[i] = activityHistoryItem;
                activityHistoryItem.d(eVar, c3003lArr[i]);
            }
            baseActivityHistoryItemCollectionResponse.a = Arrays.asList(activityHistoryItemArr);
            this.s = new ActivityHistoryItemCollectionPage(baseActivityHistoryItemCollectionResponse, null);
        }
    }
}
