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
import com.microsoft.graph.extensions.PlannerTask;
import com.microsoft.graph.extensions.PlannerTaskCollectionPage;
import com.microsoft.graph.generated.BasePlannerTaskCollectionResponse;
import java.util.Arrays;

public class BasePlannerBucket
extends Entity
implements d {
    @a
    @c(value="name")
    public String f;
    @a
    @c(value="planId")
    public String g;
    @a
    @c(value="orderHint")
    public String h;
    public transient PlannerTaskCollectionPage i;
    private transient l j;
    private transient e k;

    @Override
    public void d(e e8, l plannerTaskArray) {
        this.k = e8;
        this.j = plannerTaskArray;
        if (plannerTaskArray.x("tasks")) {
            BasePlannerTaskCollectionResponse basePlannerTaskCollectionResponse = new BasePlannerTaskCollectionResponse();
            if (plannerTaskArray.x("tasks@odata.nextLink")) {
                basePlannerTaskCollectionResponse.b = plannerTaskArray.t("tasks@odata.nextLink").k();
            }
            l[] lArray = e8.b(plannerTaskArray.t("tasks").toString(), l[].class);
            plannerTaskArray = new PlannerTask[lArray.length];
            for (int i8 = 0; i8 < lArray.length; ++i8) {
                PlannerTask plannerTask;
                plannerTaskArray[i8] = plannerTask = e8.b(lArray[i8].toString(), PlannerTask.class);
                plannerTask.d(e8, lArray[i8]);
            }
            basePlannerTaskCollectionResponse.a = Arrays.asList(plannerTaskArray);
            this.i = new PlannerTaskCollectionPage(basePlannerTaskCollectionResponse, null);
        }
    }
}

