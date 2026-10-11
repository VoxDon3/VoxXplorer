.class public final synthetic Lax/k2/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/k2/C;

.field public final synthetic q:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;Lax/k2/C;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/k2/B;->q:Ljava/lang/Runnable;

    iput-object p2, p0, Lax/k2/B;->c0:Lax/k2/C;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/k2/B;->q:Ljava/lang/Runnable;

    iget-object v1, p0, Lax/k2/B;->c0:Lax/k2/C;

    invoke-static {v0, v1}, Lax/k2/C;->a(Ljava/lang/Runnable;Lax/k2/C;)V

    return-void
.end method
