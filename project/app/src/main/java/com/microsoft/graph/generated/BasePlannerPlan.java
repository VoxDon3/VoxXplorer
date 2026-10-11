/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.IdentitySet;
import com.microsoft.graph.extensions.PlannerBucket;
import com.microsoft.graph.extensions.PlannerBucketCollectionPage;
import com.microsoft.graph.extensions.PlannerPlanDetails;
import com.microsoft.graph.extensions.PlannerTask;
import com.microsoft.graph.extensions.PlannerTaskCollectionPage;
import com.microsoft.graph.generated.BasePlannerBucket;
import com.microsoft.graph.generated.BasePlannerBucketCollectionResponse;
import com.microsoft.graph.generated.BasePlannerTask;
import com.microsoft.graph.generated.BasePlannerTaskCollectionResponse;
import java.util.Arrays;
import java.util.Calendar;

public class BasePlannerPlan
extends Entity
implements d {
    @a
    @c(value="createdBy")
    public IdentitySet f;
    @a
    @c(value="createdDateTime")
    public Calendar g;
    @a
    @c(value="owner")
    public String h;
    @a
    @c(value="title")
    public String i;
    public transient PlannerTaskCollectionPage j;
    public transient PlannerBucketCollectionPage k;
    @a
    @c(value="details")
    public PlannerPlanDetails l;
    private transient l m;
    private transient e n;

    @Override
    public void d(e e8, l object) {
        Object object2;
        int n8;
        PlannerTask[] plannerTaskArray;
        PlannerBucket[] plannerBucketArray;
        this.n = e8;
        this.m = object;
        boolean bl = ((l)object).x("tasks");
        int n9 = 0;
        if (bl) {
            plannerBucketArray = new BasePlannerTaskCollectionResponse();
            if (((l)object).x("tasks@odata.nextLink")) {
                plannerBucketArray.b = ((l)object).t("tasks@odata.nextLink").k();
            }
            l[] lArray = e8.b(((l)object).t("tasks").toString(), l[].class);
            plannerTaskArray = new PlannerTask[lArray.length];
            for (n8 = 0; n8 < lArray.length; ++n8) {
                plannerTaskArray[n8] = object2 = e8.b(lArray[n8].toString(), PlannerTask.class);
                ((BasePlannerTask)object2).d(e8, lArray[n8]);
            }
            plannerBucketArray.a = Arrays.asList(plannerTaskArray);
            this.j = new PlannerTaskCollectionPage((BasePlannerTaskCollectionResponse)plannerBucketArray, null);
        }
        if (((l)object).x("buckets")) {
            plannerTaskArray = new BasePlannerBucketCollectionResponse();
            if (((l)object).x("buckets@odata.nextLink")) {
                plannerTaskArray.b = ((l)object).t("buckets@odata.nextLink").k();
            }
            object2 = e8.b(((l)object).t("buckets").toString(), l[].class);
            plannerBucketArray = new PlannerBucket[((l[])object2).length];
            for (n8 = n9; n8 < ((l[])object2).length; ++n8) {
                plannerBucketArray[n8] = object = e8.b(object2[n8].toString(), PlannerBucket.class);
                ((BasePlannerBucket)object).d(e8, (l)object2[n8]);
            }
            plannerTaskArray.a = Arrays.asList(plannerBucketArray);
            this.k = new PlannerBucketCollectionPage((BasePlannerBucketCollectionResponse)plannerTaskArray, null);
        }
    }
}

