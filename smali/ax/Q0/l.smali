.class public final synthetic Lax/Q0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/S0/k;

.field public final synthetic q:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lax/S0/k;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/Q0/l;->q:Landroid/content/Context;

    iput-object p2, p0, Lax/Q0/l;->c0:Lax/S0/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/Q0/l;->q:Landroid/content/Context;

    iget-object v1, p0, Lax/Q0/l;->c0:Lax/S0/k;

    invoke-static {v0, v1}, Lax/Q0/m;->a(Landroid/content/Context;Lax/S0/k;)V

    return-void
.end method
