.class public final synthetic Lax/o1/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Ljava/lang/Object;

.field public final synthetic d0:J

.field public final synthetic q:Lax/o1/P$a;


# direct methods
.method public synthetic constructor <init>(Lax/o1/P$a;Ljava/lang/Object;J)V
    .registers 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/o1/H;->q:Lax/o1/P$a;

    iput-object p2, p0, Lax/o1/H;->c0:Ljava/lang/Object;

    iput-wide p3, p0, Lax/o1/H;->d0:J

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/o1/H;->q:Lax/o1/P$a;

    iget-object v1, p0, Lax/o1/H;->c0:Ljava/lang/Object;

    iget-wide v2, p0, Lax/o1/H;->d0:J

    invoke-static {v0, v1, v2, v3}, Lax/o1/P$a;->j(Lax/o1/P$a;Ljava/lang/Object;J)V

    return-void
.end method
