.class public final synthetic Lax/A0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/savedstate/a$c;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/f;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/f;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/A0/a;->a:Landroidx/fragment/app/f;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/A0/a;->a:Landroidx/fragment/app/f;

    invoke-static {v0}, Landroidx/fragment/app/f;->D(Landroidx/fragment/app/f;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
