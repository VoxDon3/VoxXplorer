.class public final synthetic Lax/S0/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Landroid/content/Context;

.field public final synthetic q:Lax/S0/z;


# direct methods
.method public synthetic constructor <init>(Lax/S0/z;Landroid/content/Context;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/S0/y;->q:Lax/S0/z;

    iput-object p2, p0, Lax/S0/y;->c0:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/S0/y;->q:Lax/S0/z;

    iget-object v1, p0, Lax/S0/y;->c0:Landroid/content/Context;

    invoke-static {v0, v1}, Lax/S0/z;->a(Lax/S0/z;Landroid/content/Context;)V

    return-void
.end method
