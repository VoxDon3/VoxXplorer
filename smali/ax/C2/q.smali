.class public final synthetic Lax/C2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/K2/m;

.field public final synthetic d0:Z

.field public final synthetic q:Lax/C2/r;


# direct methods
.method public synthetic constructor <init>(Lax/C2/r;Lax/K2/m;Z)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/C2/q;->q:Lax/C2/r;

    iput-object p2, p0, Lax/C2/q;->c0:Lax/K2/m;

    iput-boolean p3, p0, Lax/C2/q;->d0:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/C2/q;->q:Lax/C2/r;

    iget-object v1, p0, Lax/C2/q;->c0:Lax/K2/m;

    iget-boolean v2, p0, Lax/C2/q;->d0:Z

    invoke-static {v0, v1, v2}, Lax/C2/r;->d(Lax/C2/r;Lax/K2/m;Z)V

    return-void
.end method
