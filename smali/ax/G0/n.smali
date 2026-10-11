.class public final synthetic Lax/G0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Landroidx/lifecycle/j;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/j;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/G0/n;->q:Landroidx/lifecycle/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/G0/n;->q:Landroidx/lifecycle/j;

    invoke-static {v0}, Landroidx/lifecycle/j;->a(Landroidx/lifecycle/j;)V

    return-void
.end method
