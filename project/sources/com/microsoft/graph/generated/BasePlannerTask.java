package com.microsoft.graph.generated;

import ax.N9.V0;
import ax.T9.d;
import ax.T9.e;
import ax.r8.C3003l;
import ax.s8.InterfaceC3059a;
import ax.s8.InterfaceC3061c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.IdentitySet;
import com.microsoft.graph.extensions.PlannerAppliedCategories;
import com.microsoft.graph.extensions.PlannerAssignedToTaskBoardTaskFormat;
import com.microsoft.graph.extensions.PlannerAssignments;
import com.microsoft.graph.extensions.PlannerBucketTaskBoardTaskFormat;
import com.microsoft.graph.extensions.PlannerProgressTaskBoardTaskFormat;
import com.microsoft.graph.extensions.PlannerTaskDetails;
import java.util.Calendar;

/* loaded from: classes3.dex */
public class BasePlannerTask extends Entity implements d {

    @InterfaceC3059a
    @InterfaceC3061c("assignedToTaskBoardFormat")
    public PlannerAssignedToTaskBoardTaskFormat A;

    @InterfaceC3059a
    @InterfaceC3061c("progressTaskBoardFormat")
    public PlannerProgressTaskBoardTaskFormat B;

    @InterfaceC3059a
    @InterfaceC3061c("bucketTaskBoardFormat")
    public PlannerBucketTaskBoardTaskFormat C;
    private transient C3003l D;
    private transient e E;

    @InterfaceC3059a
    @InterfaceC3061c("createdBy")
    public IdentitySet f;

    @InterfaceC3059a
    @InterfaceC3061c("planId")
    public String g;

    @InterfaceC3059a
    @InterfaceC3061c("bucketId")
    public String h;

    @InterfaceC3059a
    @InterfaceC3061c("title")
    public String i;

    @InterfaceC3059a
    @InterfaceC3061c("orderHint")
    public String j;

    @InterfaceC3059a
    @InterfaceC3061c("assigneePriority")
    public String k;

    @InterfaceC3059a
    @InterfaceC3061c("percentComplete")
    public Integer l;

    @InterfaceC3059a
    @InterfaceC3061c("startDateTime")
    public Calendar m;

    @InterfaceC3059a
    @InterfaceC3061c("createdDateTime")
    public Calendar n;

    @InterfaceC3059a
    @InterfaceC3061c("dueDateTime")
    public Calendar o;

    @InterfaceC3059a
    @InterfaceC3061c("hasDescription")
    public Boolean p;

    @InterfaceC3059a
    @InterfaceC3061c("previewType")
    public V0 q;

    @InterfaceC3059a
    @InterfaceC3061c("completedDateTime")
    public Calendar r;

    @InterfaceC3059a
    @InterfaceC3061c("completedBy")
    public IdentitySet s;

    @InterfaceC3059a
    @InterfaceC3061c("referenceCount")
    public Integer t;

    @InterfaceC3059a
    @InterfaceC3061c("checklistItemCount")
    public Integer u;

    @InterfaceC3059a
    @InterfaceC3061c("activeChecklistItemCount")
    public Integer v;

    @InterfaceC3059a
    @InterfaceC3061c("appliedCategories")
    public PlannerAppliedCategories w;

    @InterfaceC3059a
    @InterfaceC3061c("assignments")
    public PlannerAssignments x;

    @InterfaceC3059a
    @InterfaceC3061c("conversationThreadId")
    public String y;

    @InterfaceC3059a
    @InterfaceC3061c("details")
    public PlannerTaskDetails z;

    @Override // com.microsoft.graph.generated.BaseEntity, ax.T9.d
    public void d(e eVar, C3003l c3003l) {
        this.E = eVar;
        this.D = c3003l;
    }
}
