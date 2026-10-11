.class public final synthetic Lax/o1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lax/o1/s;


# direct methods
.method public synthetic constructor <init>(Lax/o1/s;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/o1/p;->q:Lax/o1/s;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/o1/p;->q:Lax/o1/s;

    invoke-static {v0}, Lax/o1/s;->b(Lax/o1/s;)V

    return-void
.end method
