.class public final synthetic Lax/S0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Ljava/lang/Object;

.field public final synthetic q:Lax/S0/f;


# direct methods
.method public synthetic constructor <init>(Lax/S0/f;Ljava/lang/Object;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/S0/e;->q:Lax/S0/f;

    iput-object p2, p0, Lax/S0/e;->c0:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/S0/e;->q:Lax/S0/f;

    iget-object v1, p0, Lax/S0/e;->c0:Ljava/lang/Object;

    invoke-static {v0, v1}, Lax/S0/f;->c(Lax/S0/f;Ljava/lang/Object;)V

    return-void
.end method
