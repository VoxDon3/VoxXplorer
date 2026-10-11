.class public final synthetic Lax/A0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/b0/a;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/f;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/f;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/A0/c;->a:Landroidx/fragment/app/f;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/A0/c;->a:Landroidx/fragment/app/f;

    check-cast p1, Landroid/content/Intent;

    invoke-static {v0, p1}, Landroidx/fragment/app/f;->E(Landroidx/fragment/app/f;Landroid/content/Intent;)V

    return-void
.end method
