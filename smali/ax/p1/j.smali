.class public final synthetic Lax/p1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic q:Lax/p1/l;


# direct methods
.method public synthetic constructor <init>(Lax/p1/l;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lax/p1/j;->q:Lax/p1/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/p1/j;->q:Lax/p1/l;

    invoke-static {v0}, Lax/p1/l;->a(Lax/p1/l;)V

    return-void
.end method
