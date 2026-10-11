/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.i;
import ax.r8.l;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.PlannerPlan;
import com.microsoft.graph.extensions.PlannerPlanCollectionPage;
import com.microsoft.graph.extensions.PlannerTask;
import com.microsoft.graph.extensions.PlannerTaskCollectionPage;
import com.microsoft.graph.generated.BasePlannerPlan;
import com.microsoft.graph.generated.BasePlannerPlanCollectionResponse;
import com.microsoft.graph.generated.BasePlannerTaskCollectionResponse;
import java.util.Arrays;

public class BasePlannerUser
extends Entity
implements d {
    public transient PlannerTaskCollectionPage f;
    public transient PlannerPlanCollectionPage g;
    private transient l h;
    private transient e i;

    @Override
    public void d(e e8, l object) {
        int n8;
        Object[] objectArray;
        Object[] objectArray2;
        d d8;
        this.i = e8;
        this.h = object;
        boolean bl = ((l)object).x("tasks");
        int n9 = 0;
        if (bl) {
            d8 = new BasePlannerTaskCollectionResponse();
            if (((l)object).x("tasks@odata.nextLink")) {
                d8.b = ((l)object).t("tasks@odata.nextLink").k();
            }
            objectArray2 = e8.b(((l)object).t("tasks").toString(), l[].class);
            objectArray = new PlannerTask[objectArray2.length];
            for (n8 = 0; n8 < objectArray2.length; ++n8) {
                PlannerTask plannerTask = e8.b(((i)objectArray2[n8]).toString(), PlannerTask.class);
                objectArray[n8] = plannerTask;
                plannerTask.d(e8, (l)objectArray2[n8]);
            }
            d8.a = Arrays.asList(objectArray);
            this.f = new PlannerTaskCollectionPage((BasePlannerTaskCollectionResponse)d8, null);
        }
        if (((l)object).x("plans")) {
            d8 = new BasePlannerPlanCollectionResponse();
            if (((l)object).x("plans@odata.nextLink")) {
                ((BasePlannerPlanCollectionResponse)d8).b = ((l)object).t("plans@odata.nextLink").k();
            }
            objectArray = e8.b(((l)object).t("plans").toString(), l[].class);
            objectArray2 = new PlannerPlan[objectArray.length];
            for (n8 = n9; n8 < objectArray.length; ++n8) {
                objectArray2[n8] = object = e8.b(((i)objectArray[n8]).toString(), PlannerPlan.class);
                ((BasePlannerPlan)object).d(e8, (l)objectArray[n8]);
            }
            ((BasePlannerPlanCollectionResponse)d8).a = Arrays.asList(objectArray2);
            this.g = new PlannerPlanCollectionPage((BasePlannerPlanCollectionResponse)d8, null);
        }
    }
}

