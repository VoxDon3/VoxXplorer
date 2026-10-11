.class public final synthetic Lax/o1/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/P0/a0;

.field public final synthetic q:Lax/o1/P$a;


# direct methods
.method public synthetic constructor <init>(Lax/o1/P$a;Lax/P0/a0;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/o1/G;->q:Lax/o1/P$a;

    iput-object p2, p0, Lax/o1/G;->c0:Lax/P0/a0;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/o1/G;->q:Lax/o1/P$a;

    iget-object v1, p0, Lax/o1/G;->c0:Lax/P0/a0;

    invoke-static {v0, v1}, Lax/o1/P$a;->f(Lax/o1/P$a;Lax/P0/a0;)V

    return-void
.end method
