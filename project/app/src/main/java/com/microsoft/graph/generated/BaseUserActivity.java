/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.N9.a1;
import ax.T9.d;
import ax.T9.e;
import ax.r8.i;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.ActivityHistoryItem;
import com.microsoft.graph.extensions.ActivityHistoryItemCollectionPage;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.VisualInfo;
import com.microsoft.graph.generated.BaseActivityHistoryItemCollectionResponse;
import java.util.Arrays;
import java.util.Calendar;

public class BaseUserActivity
extends Entity
implements d {
    @a
    @c(value="visualElements")
    public VisualInfo f;
    @a
    @c(value="activitySourceHost")
    public String g;
    @a
    @c(value="activationUrl")
    public String h;
    @a
    @c(value="appActivityId")
    public String i;
    @a
    @c(value="appDisplayName")
    public String j;
    @a
    @c(value="contentUrl")
    public String k;
    @a
    @c(value="createdDateTime")
    public Calendar l;
    @a
    @c(value="expirationDateTime")
    public Calendar m;
    @a
    @c(value="fallbackUrl")
    public String n;
    @a
    @c(value="lastModifiedDateTime")
    public Calendar o;
    @a
    @c(value="userTimezone")
    public String p;
    @a
    @c(value="contentInfo")
    public i q;
    @a
    @c(value="status")
    public a1 r;
    public transient ActivityHistoryItemCollectionPage s;
    private transient l t;
    private transient e u;

    @Override
    public void d(e e8, l activityHistoryItemArray) {
        this.u = e8;
        this.t = activityHistoryItemArray;
        if (activityHistoryItemArray.x("historyItems")) {
            BaseActivityHistoryItemCollectionResponse baseActivityHistoryItemCollectionResponse = new BaseActivityHistoryItemCollectionResponse();
            if (activityHistoryItemArray.x("historyItems@odata.nextLink")) {
                baseActivityHistoryItemCollectionResponse.b = activityHistoryItemArray.t("historyItems@odata.nextLink").k();
            }
            l[] lArray = e8.b(activityHistoryItemArray.t("historyItems").toString(), l[].class);
            activityHistoryItemArray = new ActivityHistoryItem[lArray.length];
            for (int i8 = 0; i8 < lArray.length; ++i8) {
                ActivityHistoryItem activityHistoryItem;
                activityHistoryItemArray[i8] = activityHistoryItem = e8.b(lArray[i8].toString(), ActivityHistoryItem.class);
                activityHistoryItem.d(e8, lArray[i8]);
            }
            baseActivityHistoryItemCollectionResponse.a = Arrays.asList(activityHistoryItemArray);
            this.s = new ActivityHistoryItemCollectionPage(baseActivityHistoryItemCollectionResponse, null);
        }
    }
}

