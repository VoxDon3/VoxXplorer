.class public final synthetic Lax/C2/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/v7/e;

.field public final synthetic q:Lax/C2/G;


# direct methods
.method public synthetic constructor <init>(Lax/C2/G;Lax/v7/e;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/C2/F;->q:Lax/C2/G;

    iput-object p2, p0, Lax/C2/F;->c0:Lax/v7/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/C2/F;->q:Lax/C2/G;

    iget-object v1, p0, Lax/C2/F;->c0:Lax/v7/e;

    invoke-static {v0, v1}, Lax/C2/G;->a(Lax/C2/G;Lax/v7/e;)V

    return-void
.end method
