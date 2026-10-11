.class public final synthetic Lax/i1/X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c0:Lax/q1/N;

.field public final synthetic q:Lax/i1/Y;


# direct methods
.method public synthetic constructor <init>(Lax/i1/Y;Lax/q1/N;)V
    .registers 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/i1/X;->q:Lax/i1/Y;

    iput-object p2, p0, Lax/i1/X;->c0:Lax/q1/N;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/i1/X;->q:Lax/i1/Y;

    iget-object v1, p0, Lax/i1/X;->c0:Lax/q1/N;

    invoke-static {v0, v1}, Lax/i1/Y;->w(Lax/i1/Y;Lax/q1/N;)V

    return-void
.end method
