package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.IdentitySet;
import com.microsoft.graph.extensions.PlannerBucket;
import com.microsoft.graph.extensions.PlannerBucketCollectionPage;
import com.microsoft.graph.extensions.PlannerPlanDetails;
import com.microsoft.graph.extensions.PlannerTask;
import com.microsoft.graph.extensions.PlannerTaskCollectionPage;
import java.util.Arrays;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class BasePlannerPlan extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("createdBy")
    public IdentitySet f;

    @InterfaceC3059a
    @InterfaceC3061c("createdDateTime")
    public Calendar g;

    @InterfaceC3059a
    @InterfaceC3061c("owner")
    public String h;

    @InterfaceC3059a
    @InterfaceC3061c("title")
    public String i;
    public transient PlannerTaskCollectionPage j;
    public transient PlannerBucketCollectionPage k;

    @InterfaceC3059a
    @InterfaceC3061c("details")
    public PlannerPlanDetails l;
    private transient C3003l m;
    private transient e n;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.n = eVar;
        this.m = c3003l;
        if (c3003l.x("tasks")) {
            BasePlannerTaskCollectionResponse basePlannerTaskCollectionResponse = new BasePlannerTaskCollectionResponse();
            if (c3003l.x("tasks@odata.nextLink")) {
                basePlannerTaskCollectionResponse.b = c3003l.t("tasks@odata.nextLink").k();
            }
            C3003l[] c3003lArr = (C3003l[]) eVar.b(c3003l.t("tasks").toString(), C3003l[].class);
            PlannerTask[] plannerTaskArr = new PlannerTask[c3003lArr.length];
            for (int i = 0; i < c3003lArr.length; i++) {
                PlannerTask plannerTask = (PlannerTask) eVar.b(c3003lArr[i].toString(), PlannerTask.class);
                plannerTaskArr[i] = plannerTask;
                plannerTask.d(eVar, c3003lArr[i]);
            }
            basePlannerTaskCollectionResponse.a = Arrays.asList(plannerTaskArr);
            this.j = new PlannerTaskCollectionPage(basePlannerTaskCollectionResponse, null);
        }
        if (c3003l.x("buckets")) {
            BasePlannerBucketCollectionResponse basePlannerBucketCollectionResponse = new BasePlannerBucketCollectionResponse();
            if (c3003l.x("buckets@odata.nextLink")) {
                basePlannerBucketCollectionResponse.b = c3003l.t("buckets@odata.nextLink").k();
            }
            C3003l[] c3003lArr2 = (C3003l[]) eVar.b(c3003l.t("buckets").toString(), C3003l[].class);
            PlannerBucket[] plannerBucketArr = new PlannerBucket[c3003lArr2.length];
            for (int i2 = 0; i2 < c3003lArr2.length; i2++) {
                PlannerBucket plannerBucket = (PlannerBucket) eVar.b(c3003lArr2[i2].toString(), PlannerBucket.class);
                plannerBucketArr[i2] = plannerBucket;
                plannerBucket.d(eVar, c3003lArr2[i2]);
            }
            basePlannerBucketCollectionResponse.a = Arrays.asList(plannerBucketArr);
            this.k = new PlannerBucketCollectionPage(basePlannerBucketCollectionResponse, null);
        }
    }
}
