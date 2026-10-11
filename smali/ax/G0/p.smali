.class public final synthetic Lax/G0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/savedstate/a$c;


# instance fields
.field public final synthetic a:Landroidx/lifecycle/l;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/l;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/G0/p;->a:Landroidx/lifecycle/l;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/G0/p;->a:Landroidx/lifecycle/l;

    invoke-static {v0}, Landroidx/lifecycle/l;->a(Landroidx/lifecycle/l;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
