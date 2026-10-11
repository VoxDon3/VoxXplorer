.class public final synthetic Lax/d3/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Landroidx/recyclerview/widget/RecyclerView$m;

.field public final synthetic q:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$m;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/d3/S;->q:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lax/d3/S;->c0:Landroidx/recyclerview/widget/RecyclerView$m;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/d3/S;->q:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lax/d3/S;->c0:Landroidx/recyclerview/widget/RecyclerView$m;

    invoke-static {v0, v1}, Lax/d3/T;->d3(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$m;)V

    return-void
.end method
