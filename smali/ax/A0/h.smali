.class public final synthetic Lax/A0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/b0/a;


# instance fields
.field public final synthetic a:Landroidx/fragment/app/FragmentManager;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/FragmentManager;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/A0/h;->a:Landroidx/fragment/app/FragmentManager;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/A0/h;->a:Landroidx/fragment/app/FragmentManager;

    check-cast p1, Lax/P/i;

    invoke-static {v0, p1}, Landroidx/fragment/app/FragmentManager;->d(Landroidx/fragment/app/FragmentManager;Lax/P/i;)V

    return-void
.end method
